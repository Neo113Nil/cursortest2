package com.gamericefishpro.space.ui;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static final com.gamericefishpro.space.qi.d a;

    static {
        String property;
        int i = s.a;
        Object next = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        try {
            Iterator it = com.gamericefishpro.space.li.m.e(com.gamericefishpro.space.li.j.b(Arrays.asList(new com.gamericefishpro.space.qi.a()).iterator())).iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    ((com.gamericefishpro.space.qi.a) next).getClass();
                    do {
                        ((com.gamericefishpro.space.qi.a) it.next()).getClass();
                    } while (it.hasNext());
                }
            }
            if (((com.gamericefishpro.space.qi.a) next) == null) {
                throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == null) {
                throw new IllegalStateException("The main looper is not available");
            }
            a = new com.gamericefishpro.space.qi.d(com.gamericefishpro.space.qi.e.a(mainLooper));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
