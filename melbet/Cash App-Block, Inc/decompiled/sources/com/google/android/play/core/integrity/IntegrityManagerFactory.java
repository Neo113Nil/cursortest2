package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes.dex */
public class IntegrityManagerFactory {
    public static IntegrityManager create(Context context) {
        z zVar;
        synchronized (u.class) {
            try {
                if (u.a == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    u.a = new z(context);
                }
                zVar = u.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return (IntegrityManager) zVar.e.a();
    }

    public static be createStandard(Context context) {
        ac acVar;
        synchronized (w.class) {
            try {
                if (w.a == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    w.a = new ac(context);
                }
                acVar = w.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return (be) acVar.f.a();
    }
}
