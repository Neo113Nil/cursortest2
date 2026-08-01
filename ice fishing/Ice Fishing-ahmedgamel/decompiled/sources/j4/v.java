package j4;

import C2.N;
import D.RunnableC0282a;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.ads.C2545Eo;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import q2.C4896n;

/* loaded from: classes2.dex */
public final class v {
    public static final long i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f38453j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f38454a;

    /* renamed from: b, reason: collision with root package name */
    public final C2545Eo f38455b;

    /* renamed from: c, reason: collision with root package name */
    public final C4896n f38456c;

    /* renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f38457d;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f38459f;

    /* renamed from: h, reason: collision with root package name */
    public final t f38461h;

    /* renamed from: e, reason: collision with root package name */
    public final s.b f38458e = new s.b();

    /* renamed from: g, reason: collision with root package name */
    public boolean f38460g = false;

    public v(FirebaseMessaging firebaseMessaging, C2545Eo c2545Eo, t tVar, C4896n c4896n, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f38457d = firebaseMessaging;
        this.f38455b = c2545Eo;
        this.f38461h = tVar;
        this.f38456c = c4896n;
        this.f38454a = context;
        this.f38459f = scheduledThreadPoolExecutor;
    }

    public static void a(j3.m mVar) {
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            S0.f.c(mVar, 30L);
        } catch (InterruptedException | TimeoutException e9) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e9);
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e10);
            }
            throw ((RuntimeException) cause);
        }
    }

    public final void b(String str) {
        String a9 = this.f38457d.a();
        C4896n c4896n = this.f38456c;
        c4896n.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(c4896n.e(c4896n.n(a9, bundle, "/topics/" + str)));
    }

    public final void c(String str) {
        String a9 = this.f38457d.a();
        C4896n c4896n = this.f38456c;
        c4896n.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString(com.anythink.expressad.f.a.b.az, "1");
        a(c4896n.e(c4896n.n(a9, bundle, "/topics/" + str)));
    }

    public final synchronized void d(boolean z3) {
        this.f38460g = z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0094 A[Catch: IOException -> 0x0043, TryCatch #1 {IOException -> 0x0043, blocks: (B:8:0x002a, B:17:0x0059, B:19:0x0061, B:65:0x0076, B:67:0x0081, B:68:0x0094, B:70:0x009f, B:71:0x0039, B:74:0x0046), top: B:7:0x002a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() {
        s a9;
        char c9;
        t tVar;
        while (true) {
            synchronized (this) {
                try {
                    a9 = this.f38461h.a();
                    if (a9 == null) {
                        break;
                    }
                } finally {
                }
            }
            try {
                String str = a9.f38443b;
                int hashCode = str.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85 && str.equals("U")) {
                        c9 = 1;
                        String str2 = a9.f38442a;
                        if (c9 != 0) {
                            b(str2);
                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                Log.d("FirebaseMessaging", "Subscribe to topic: " + str2 + " succeeded.");
                            }
                        } else if (c9 == 1) {
                            c(str2);
                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                Log.d("FirebaseMessaging", "Unsubscribe from topic: " + str2 + " succeeded.");
                            }
                        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Unknown topic operation" + a9 + com.anythink.core.common.d.j.f12378z);
                        }
                        tVar = this.f38461h;
                        synchronized (tVar) {
                            N n9 = tVar.f38446a;
                            String str3 = a9.f38444c;
                            synchronized (((ArrayDeque) n9.f304x)) {
                                if (((ArrayDeque) n9.f304x).remove(str3)) {
                                    ((ScheduledThreadPoolExecutor) n9.f305y).execute(new RunnableC0282a(24, n9));
                                }
                            }
                        }
                        synchronized (this.f38458e) {
                            try {
                                String str4 = a9.f38444c;
                                if (this.f38458e.containsKey(str4)) {
                                    ArrayDeque arrayDeque = (ArrayDeque) this.f38458e.getOrDefault(str4, null);
                                    j3.h hVar = (j3.h) arrayDeque.poll();
                                    if (hVar != null) {
                                        hVar.b(null);
                                    }
                                    if (arrayDeque.isEmpty()) {
                                        this.f38458e.remove(str4);
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    c9 = 65535;
                    String str22 = a9.f38442a;
                    if (c9 != 0) {
                    }
                    tVar = this.f38461h;
                    synchronized (tVar) {
                    }
                } else {
                    if (str.equals("S")) {
                        c9 = 0;
                        String str222 = a9.f38442a;
                        if (c9 != 0) {
                        }
                        tVar = this.f38461h;
                        synchronized (tVar) {
                        }
                    }
                    c9 = 65535;
                    String str2222 = a9.f38442a;
                    if (c9 != 0) {
                    }
                    tVar = this.f38461h;
                    synchronized (tVar) {
                    }
                }
            } catch (IOException e9) {
                if ("SERVICE_NOT_AVAILABLE".equals(e9.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e9.getMessage())) {
                    Log.e("FirebaseMessaging", "Topic operation failed: " + e9.getMessage() + ". Will retry Topic operation.");
                } else {
                    if (e9.getMessage() != null) {
                        throw e9;
                    }
                    Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                }
                return false;
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "topic sync succeeded");
        }
        return true;
    }

    public final void f(long j6) {
        long min = Math.min(Math.max(30L, 2 * j6), i);
        this.f38459f.schedule(new x(this, this.f38454a, this.f38455b, min), j6, TimeUnit.SECONDS);
        d(true);
    }
}
