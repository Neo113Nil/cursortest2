package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class rps {
    public final Context a;
    public final ma b;
    public final mmo c;
    public final FirebaseMessaging d;
    public final ScheduledThreadPoolExecutor f;
    public final pps h;
    public final xy0 e = new xy0(0);
    public boolean g = false;

    public rps(FirebaseMessaging firebaseMessaging, ma maVar, pps ppsVar, mmo mmoVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.d = firebaseMessaging;
        this.b = maVar;
        this.h = ppsVar;
        this.c = mmoVar;
        this.a = context;
        this.f = scheduledThreadPoolExecutor;
    }

    public static void a(Task task) {
        try {
            ywf.o(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw ((RuntimeException) cause);
        }
    }

    public final void b(String str) {
        String a = this.d.a();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        mmo mmoVar = this.c;
        a(mmoVar.S(mmoVar.P0(a, "/topics/" + str, bundle)));
    }

    public final void c(String str) {
        String a = this.d.a();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        mmo mmoVar = this.c;
        a(mmoVar.S(mmoVar.P0(a, "/topics/" + str, bundle)));
    }

    public final synchronized void d(boolean z) {
        this.g = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093 A[Catch: IOException -> 0x0062, TRY_LEAVE, TryCatch #2 {IOException -> 0x0062, blocks: (B:8:0x002b, B:13:0x008b, B:15:0x0093, B:61:0x003c, B:63:0x0044, B:65:0x004f, B:66:0x0065, B:68:0x006d, B:70:0x0078), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() {
        ops a;
        pps ppsVar;
        while (true) {
            synchronized (this) {
                try {
                    a = this.h.a();
                    if (a == null) {
                        break;
                    }
                } finally {
                }
            }
            try {
                String str = a.b;
                String str2 = a.a;
                int hashCode = str.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85 && str.equals("U")) {
                        c(str2);
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Unsubscribe from topic: " + str2 + " succeeded.");
                        }
                        ppsVar = this.h;
                        synchronized (ppsVar) {
                            n3m n3mVar = ppsVar.a;
                            String str3 = a.c;
                            synchronized (((ArrayDeque) n3mVar.e)) {
                                if (((ArrayDeque) n3mVar.e).remove(str3)) {
                                    ((ScheduledThreadPoolExecutor) n3mVar.f).execute(new bhp(1, n3mVar));
                                }
                            }
                        }
                        synchronized (this.e) {
                            try {
                                String str4 = a.c;
                                if (this.e.containsKey(str4)) {
                                    ArrayDeque arrayDeque = (ArrayDeque) this.e.get(str4);
                                    i8s i8sVar = (i8s) arrayDeque.poll();
                                    if (i8sVar != null) {
                                        i8sVar.b(null);
                                    }
                                    if (arrayDeque.isEmpty()) {
                                        this.e.remove(str4);
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Unknown topic operation" + a + ".");
                    }
                    ppsVar = this.h;
                    synchronized (ppsVar) {
                    }
                } else {
                    if (str.equals("S")) {
                        b(str2);
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Subscribe to topic: " + str2 + " succeeded.");
                        }
                        ppsVar = this.h;
                        synchronized (ppsVar) {
                        }
                    }
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                    }
                    ppsVar = this.h;
                    synchronized (ppsVar) {
                    }
                }
            } catch (IOException e) {
                if (!"SERVICE_NOT_AVAILABLE".equals(e.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e.getMessage())) {
                    if (e.getMessage() != null) {
                        throw e;
                    }
                    Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                    return false;
                }
                Log.e("FirebaseMessaging", "Topic operation failed: " + e.getMessage() + ". Will retry Topic operation.");
                return false;
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "topic sync succeeded");
        }
        return true;
    }

    public final void f(long j) {
        this.f.schedule(new tps(this, this.a, this.b, Math.min(Math.max(30L, 2 * j), 28800L)), j, TimeUnit.SECONDS);
        d(true);
    }
}
