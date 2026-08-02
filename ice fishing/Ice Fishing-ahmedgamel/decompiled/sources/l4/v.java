package l4;

import E2.M;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.ads.C2582Fo;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import s2.C4945n;

/* loaded from: classes2.dex */
public final class v {
    public static final long i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f38965j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f38966a;

    /* renamed from: b, reason: collision with root package name */
    public final C2582Fo f38967b;

    /* renamed from: c, reason: collision with root package name */
    public final C4945n f38968c;

    /* renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f38969d;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f38971f;

    /* renamed from: h, reason: collision with root package name */
    public final t f38973h;

    /* renamed from: e, reason: collision with root package name */
    public final s.b f38970e = new s.b();

    /* renamed from: g, reason: collision with root package name */
    public boolean f38972g = false;

    public v(FirebaseMessaging firebaseMessaging, C2582Fo c2582Fo, t tVar, C4945n c4945n, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f38969d = firebaseMessaging;
        this.f38967b = c2582Fo;
        this.f38973h = tVar;
        this.f38968c = c4945n;
        this.f38966a = context;
        this.f38971f = scheduledThreadPoolExecutor;
    }

    public static void a(l3.m mVar) {
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            com.bumptech.glide.d.e(mVar, 30L);
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
        String a9 = this.f38969d.a();
        C4945n c4945n = this.f38968c;
        c4945n.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(c4945n.e(c4945n.n(a9, bundle, "/topics/" + str)));
    }

    public final void c(String str) {
        String a9 = this.f38969d.a();
        C4945n c4945n = this.f38968c;
        c4945n.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString(com.anythink.expressad.f.a.b.az, "1");
        a(c4945n.e(c4945n.n(a9, bundle, "/topics/" + str)));
    }

    public final synchronized void d(boolean z6) {
        this.f38972g = z6;
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
                    a9 = this.f38973h.a();
                    if (a9 == null) {
                        break;
                    }
                } finally {
                }
            }
            try {
                String str = a9.f38955b;
                int hashCode = str.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85 && str.equals("U")) {
                        c9 = 1;
                        String str2 = a9.f38954a;
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
                            Log.d("FirebaseMessaging", "Unknown topic operation" + a9 + com.anythink.core.common.d.j.f13164z);
                        }
                        tVar = this.f38973h;
                        synchronized (tVar) {
                            M m9 = tVar.f38958a;
                            String str3 = a9.f38956c;
                            synchronized (((ArrayDeque) m9.f764x)) {
                                if (((ArrayDeque) m9.f764x).remove(str3)) {
                                    ((ScheduledThreadPoolExecutor) m9.f765y).execute(new A3.p(25, m9));
                                }
                            }
                        }
                        synchronized (this.f38970e) {
                            try {
                                String str4 = a9.f38956c;
                                if (this.f38970e.containsKey(str4)) {
                                    ArrayDeque arrayDeque = (ArrayDeque) this.f38970e.getOrDefault(str4, null);
                                    l3.h hVar = (l3.h) arrayDeque.poll();
                                    if (hVar != null) {
                                        hVar.b(null);
                                    }
                                    if (arrayDeque.isEmpty()) {
                                        this.f38970e.remove(str4);
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    c9 = 65535;
                    String str22 = a9.f38954a;
                    if (c9 != 0) {
                    }
                    tVar = this.f38973h;
                    synchronized (tVar) {
                    }
                } else {
                    if (str.equals("S")) {
                        c9 = 0;
                        String str222 = a9.f38954a;
                        if (c9 != 0) {
                        }
                        tVar = this.f38973h;
                        synchronized (tVar) {
                        }
                    }
                    c9 = 65535;
                    String str2222 = a9.f38954a;
                    if (c9 != 0) {
                    }
                    tVar = this.f38973h;
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
        this.f38971f.schedule(new x(this, this.f38966a, this.f38967b, min), j6, TimeUnit.SECONDS);
        d(true);
    }
}
