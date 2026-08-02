package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* loaded from: classes5.dex */
public final class moj implements Runnable {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public final Object c;
    public final Object d;
    public Object e;

    public moj(noj nojVar, zp4 zp4Var) {
        this.e = nojVar;
        Level level = Level.FINE;
        this.c = new j6e(14);
        this.b = true;
        this.d = zp4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean a;
        noj nojVar;
        sgr sgrVar;
        Executor executor;
        int i;
        switch (this.a) {
            case 0:
                String name = Thread.currentThread().getName();
                Thread.currentThread().setName("OkHttpClientTransport");
                while (true) {
                    try {
                        a = ((zp4) this.d).a(this);
                        nojVar = (noj) this.e;
                    } catch (Throwable th) {
                        try {
                            noj nojVar2 = (noj) this.e;
                            afb afbVar = afb.PROTOCOL_ERROR;
                            sgr h = sgr.n.i("error in frame handler").h(th);
                            Map map = noj.P;
                            nojVar2.r(0, afbVar, h);
                            try {
                                ((zp4) this.d).close();
                            } catch (IOException e) {
                                e = e;
                                noj.Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                            } catch (RuntimeException e2) {
                                if (!"bio == null".equals(e2.getMessage())) {
                                    throw e2;
                                }
                            }
                        } catch (Throwable th2) {
                            try {
                                ((zp4) this.d).close();
                            } catch (IOException e3) {
                                noj.Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e3);
                            } catch (RuntimeException e4) {
                                if (!"bio == null".equals(e4.getMessage())) {
                                    throw e4;
                                }
                            }
                            ((noj) this.e).h.g();
                            Thread.currentThread().setName(name);
                            throw th2;
                        }
                    }
                    if (!a) {
                        synchronized (nojVar.k) {
                            sgrVar = ((noj) this.e).v;
                        }
                        if (sgrVar == null) {
                            sgrVar = sgr.o.i("End of stream or IOException");
                        }
                        ((noj) this.e).r(0, afb.INTERNAL_ERROR, sgrVar);
                        try {
                            ((zp4) this.d).close();
                        } catch (IOException e5) {
                            e = e5;
                            noj.Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                        } catch (RuntimeException e6) {
                            if (!"bio == null".equals(e6.getMessage())) {
                                throw e6;
                            }
                        }
                        ((noj) this.e).h.g();
                        Thread.currentThread().setName(name);
                        return;
                    }
                    baf bafVar = nojVar.F;
                    if (bafVar != null) {
                        bafVar.a();
                    }
                }
            case 1:
                synchronized (((Handler) this.c)) {
                    this.e = ((lyr) this.d).run();
                    this.b = true;
                    ((Handler) this.c).notifyAll();
                }
                return;
            default:
                Intent intent = (Intent) this.c;
                Context context = (Context) this.d;
                boolean z = this.b;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.e;
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent2 != null) {
                        i = FirebaseInstanceIdReceiver.a(intent2);
                    } else {
                        int i2 = 500;
                        if (intent.getExtras() != null) {
                            kq4 kq4Var = new kq4(intent);
                            Executor executor2 = null;
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                try {
                                    SoftReference softReference = FirebaseInstanceIdReceiver.b;
                                    if (softReference != null) {
                                        executor2 = (Executor) softReference.get();
                                    }
                                    if (executor2 == null) {
                                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new swi("pscm-ack-executor"));
                                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                                        executor2 = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                        FirebaseInstanceIdReceiver.b = new SoftReference(executor2);
                                    }
                                    executor = executor2;
                                } finally {
                                }
                            }
                            executor.execute(new nud(context, kq4Var, countDownLatch, false, 27));
                            try {
                                i2 = ((Integer) ywf.n(new nnk(context).H(intent))).intValue();
                            } catch (InterruptedException | ExecutionException e7) {
                                Log.e("FirebaseMessaging", "Failed to send message to service.", e7);
                            }
                            try {
                                if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                                    Log.w("CloudMessagingReceiver", "Message ack timed out");
                                }
                            } catch (InterruptedException e8) {
                                Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e8.toString()));
                            }
                        }
                        i = i2;
                    }
                    if (z && pendingResult != null) {
                        pendingResult.setResultCode(i);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th3;
                }
        }
    }

    public moj(Handler handler, lyr lyrVar) {
        handler.getClass();
        this.c = handler;
        this.d = lyrVar;
    }

    public /* synthetic */ moj(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.c = intent;
        this.d = context;
        this.b = z;
        this.e = pendingResult;
    }
}
