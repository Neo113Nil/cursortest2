package com.gamericefishpro.space.h0;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {
    public boolean a;
    public final Object b;
    public Object c;
    public Object d;

    public z0(com.gamericefishpro.space.n9.f1 f1Var, String str) {
        this.d = f1Var;
        com.gamericefishpro.space.v8.c0.d(str);
        this.b = str;
    }

    public synchronized void a() {
        try {
            if (this.a) {
                return;
            }
            Boolean boolC = c();
            this.c = boolC;
            if (boolC == null) {
                com.gamericefishpro.space.tb.j jVar = new com.gamericefishpro.space.tb.j(1);
                com.gamericefishpro.space.bb.o oVar = (com.gamericefishpro.space.bb.o) ((com.gamericefishpro.space.kb.c) this.b);
                oVar.a(oVar.c, jVar);
            }
            this.a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean b() {
        boolean z;
        boolean zBooleanValue;
        try {
            a();
            Boolean bool = (Boolean) this.c;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                com.gamericefishpro.space.wa.g gVar = ((FirebaseMessaging) this.d).a;
                gVar.a();
                com.gamericefishpro.space.sb.a aVar = (com.gamericefishpro.space.sb.a) gVar.g.get();
                synchronized (aVar) {
                    z = aVar.a;
                }
                zBooleanValue = z;
            }
        } catch (Throwable th) {
            throw th;
        }
        return zBooleanValue;
    }

    public Boolean c() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        com.gamericefishpro.space.wa.g gVar = ((FirebaseMessaging) this.d).a;
        gVar.a();
        Context context = gVar.a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public String d() {
        if (!this.a) {
            this.a = true;
            com.gamericefishpro.space.n9.f1 f1Var = (com.gamericefishpro.space.n9.f1) this.d;
            this.c = f1Var.v().getString((String) this.b, null);
        }
        return (String) this.c;
    }

    public void e(String str) {
        SharedPreferences.Editor editorEdit = ((com.gamericefishpro.space.n9.f1) this.d).v().edit();
        editorEdit.putString((String) this.b, str);
        editorEdit.apply();
        this.c = str;
    }

    public z0() {
        this.b = new Object();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.a = true;
    }

    public z0(y yVar, com.gamericefishpro.space.f2.g1 g1Var, a1 a1Var) {
        this.b = yVar;
        this.c = g1Var;
        this.d = a1Var;
        this.a = true;
    }

    public z0(int i) {
        this.b = new ReentrantLock();
        this.c = new long[i];
        this.d = new boolean[i];
    }

    public z0(FirebaseMessaging firebaseMessaging, com.gamericefishpro.space.kb.c cVar) {
        this.d = firebaseMessaging;
        this.b = cVar;
    }
}
