package com.google.android.play.core.integrity;

import android.content.Context;
import com.gamericefishpro.space.qa.c;
import com.gamericefishpro.space.qa.k;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class IntegrityManagerFactory {
    public static IntegrityManager create(Context context) {
        c cVar;
        synchronized (k.class) {
            try {
                if (k.a == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    k.a = new c(context);
                }
                cVar = k.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return (IntegrityManager) cVar.a.a();
    }
}
