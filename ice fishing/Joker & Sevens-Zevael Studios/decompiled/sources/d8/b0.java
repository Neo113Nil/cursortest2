package d8;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import b0.s0;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: i, reason: collision with root package name */
    public static final long f1743i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f1744j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f1745a;

    /* renamed from: b, reason: collision with root package name */
    public final s0 f1746b;

    /* renamed from: c, reason: collision with root package name */
    public final m f1747c;

    /* renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f1748d;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f1750f;

    /* renamed from: h, reason: collision with root package name */
    public final z f1752h;

    /* renamed from: e, reason: collision with root package name */
    public final s.f f1749e = new s.f(0);

    /* renamed from: g, reason: collision with root package name */
    public boolean f1751g = false;

    public b0(FirebaseMessaging firebaseMessaging, s0 s0Var, z zVar, m mVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f1748d = firebaseMessaging;
        this.f1746b = s0Var;
        this.f1752h = zVar;
        this.f1747c = mVar;
        this.f1745a = context;
        this.f1750f = scheduledThreadPoolExecutor;
    }

    public static void a(g7.o oVar) {
        try {
            i7.b.m(oVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e10) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e10);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e11);
            }
            throw ((RuntimeException) cause);
        }
    }

    public final void b(String str) {
        String a6 = this.f1748d.a();
        m mVar = this.f1747c;
        mVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(mVar.j(mVar.o(a6, "/topics/" + str, bundle)));
    }

    public final void c(String str) {
        String a6 = this.f1748d.a();
        m mVar = this.f1747c;
        mVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(mVar.j(mVar.o(a6, "/topics/" + str, bundle)));
    }

    public final synchronized void d(boolean z10) {
        this.f1751g = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093 A[Catch: IOException -> 0x0062, TRY_LEAVE, TryCatch #2 {IOException -> 0x0062, blocks: (B:8:0x002b, B:13:0x008b, B:15:0x0093, B:61:0x003c, B:63:0x0044, B:65:0x004f, B:66:0x0065, B:68:0x006d, B:70:0x0078), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() {
        y a6;
        z zVar;
        while (true) {
            synchronized (this) {
                try {
                    a6 = this.f1752h.a();
                    if (a6 == null) {
                        break;
                    }
                } finally {
                }
            }
            try {
                String str = a6.f1833b;
                String str2 = a6.f1832a;
                int hashCode = str.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85 && str.equals("U")) {
                        c(str2);
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Unsubscribe from topic: " + str2 + " succeeded.");
                        }
                        zVar = this.f1752h;
                        synchronized (zVar) {
                            t tVar = zVar.f1836a;
                            String str3 = a6.f1834c;
                            synchronized (((ArrayDeque) tVar.f1819d)) {
                                if (((ArrayDeque) tVar.f1819d).remove(str3)) {
                                    ((ScheduledThreadPoolExecutor) tVar.f1820e).execute(new a1.a(7, tVar));
                                }
                            }
                        }
                        synchronized (this.f1749e) {
                            try {
                                String str4 = a6.f1834c;
                                if (this.f1749e.containsKey(str4)) {
                                    ArrayDeque arrayDeque = (ArrayDeque) this.f1749e.get(str4);
                                    g7.h hVar = (g7.h) arrayDeque.poll();
                                    if (hVar != null) {
                                        hVar.a(null);
                                    }
                                    if (arrayDeque.isEmpty()) {
                                        this.f1749e.remove(str4);
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Unknown topic operation" + a6 + ".");
                    }
                    zVar = this.f1752h;
                    synchronized (zVar) {
                    }
                } else {
                    if (str.equals("S")) {
                        b(str2);
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Subscribe to topic: " + str2 + " succeeded.");
                        }
                        zVar = this.f1752h;
                        synchronized (zVar) {
                        }
                    }
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                    }
                    zVar = this.f1752h;
                    synchronized (zVar) {
                    }
                }
            } catch (IOException e10) {
                if (!"SERVICE_NOT_AVAILABLE".equals(e10.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e10.getMessage())) {
                    if (e10.getMessage() != null) {
                        throw e10;
                    }
                    Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                    return false;
                }
                Log.e("FirebaseMessaging", "Topic operation failed: " + e10.getMessage() + ". Will retry Topic operation.");
                return false;
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "topic sync succeeded");
        }
        return true;
    }

    public final void f(long j3) {
        this.f1750f.schedule(new d0(this, this.f1745a, this.f1746b, Math.min(Math.max(30L, 2 * j3), f1743i)), j3, TimeUnit.SECONDS);
        d(true);
    }
}
