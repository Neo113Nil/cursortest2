package com.gamericefishpro.space.b9;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final c b;
    public b a;

    static {
        c cVar = new c();
        cVar.a = null;
        b = cVar;
    }

    public static b a(Context context) {
        b bVar;
        c cVar = b;
        synchronized (cVar) {
            try {
                if (cVar.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    cVar.a = new b(context, (byte) 0);
                }
                bVar = cVar.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }
}
