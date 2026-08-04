package com.gamericefishpro.space.tb;

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

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    public static final long i = TimeUnit.HOURS.toSeconds(8);
    public static final /* synthetic */ int j = 0;
    public final Context a;
    public final com.gamericefishpro.space.f1.k b;
    public final com.gamericefishpro.space.c8.h c;
    public final FirebaseMessaging d;
    public final ScheduledThreadPoolExecutor f;
    public final y h;
    public final com.gamericefishpro.space.t.e e = new com.gamericefishpro.space.t.e(0);
    public boolean g = false;

    public a0(FirebaseMessaging firebaseMessaging, com.gamericefishpro.space.f1.k kVar, y yVar, com.gamericefishpro.space.c8.h hVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.d = firebaseMessaging;
        this.b = kVar;
        this.h = yVar;
        this.c = hVar;
        this.a = context;
        this.f = scheduledThreadPoolExecutor;
    }

    public static void a(Task task) throws IOException {
        try {
            com.gamericefishpro.space.d9.h.k(task, 30L, TimeUnit.SECONDS);
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

    public final void b(String str) throws IOException {
        String strA = this.d.a();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        com.gamericefishpro.space.c8.h hVar = this.c;
        a(hVar.j(hVar.o(strA, "/topics/" + str, bundle)));
    }

    public final void c(String str) throws IOException {
        String strA = this.d.a();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        com.gamericefishpro.space.c8.h hVar = this.c;
        a(hVar.j(hVar.o(strA, "/topics/" + str, bundle)));
    }

    public final synchronized void d(boolean z) {
        this.g = z;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00b2 */
    /* JADX WARN: Code duplicated, block: B:25:0x004e A[Catch: IOException -> 0x003a, TRY_LEAVE, TryCatch #0 {IOException -> 0x003a, blocks: (B:12:0x0018, B:25:0x004e, B:17:0x0029, B:19:0x0031, B:22:0x003d, B:24:0x0045), top: B:75:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() throws IOException {
        x xVarA;
        while (true) {
            synchronized (this) {
                try {
                    xVarA = this.h.a();
                    if (xVarA == null) {
                        Log.isLoggable("FirebaseMessaging", 3);
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                String str = xVarA.b;
                String str2 = xVarA.a;
                int iHashCode = str.hashCode();
                if (iHashCode != 83) {
                    if (iHashCode == 85 && str.equals("U")) {
                        c(str2);
                        Log.isLoggable("FirebaseMessaging", 3);
                    } else {
                        Log.isLoggable("FirebaseMessaging", 3);
                    }
                } else if (str.equals("S")) {
                    b(str2);
                    Log.isLoggable("FirebaseMessaging", 3);
                } else {
                    Log.isLoggable("FirebaseMessaging", 3);
                }
                y yVar = this.h;
                synchronized (yVar) {
                    com.gamericefishpro.space.b1.d dVar = yVar.a;
                    String str3 = xVarA.c;
                    synchronized (((ArrayDeque) dVar.v)) {
                        try {
                            if (((ArrayDeque) dVar.v).remove(str3)) {
                                ((ScheduledThreadPoolExecutor) dVar.w).execute(new com.appsflyer.a(19, dVar));
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                synchronized (this.e) {
                    try {
                        String str4 = xVarA.c;
                        if (this.e.containsKey(str4)) {
                            ArrayDeque arrayDeque = (ArrayDeque) this.e.get(str4);
                            com.gamericefishpro.space.r9.h hVar = (com.gamericefishpro.space.r9.h) arrayDeque.poll();
                            if (hVar != null) {
                                hVar.a(null);
                            }
                            if (arrayDeque.isEmpty()) {
                                this.e.remove(str4);
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } catch (IOException e) {
                if (!"SERVICE_NOT_AVAILABLE".equals(e.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e.getMessage()) && !"TOO_MANY_SUBSCRIBERS".equals(e.getMessage())) {
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
    }

    public final void f(long j2) {
        this.f.schedule(new c0(this, this.a, this.b, Math.min(Math.max(30L, 2 * j2), i)), j2, TimeUnit.SECONDS);
        d(true);
    }
}
