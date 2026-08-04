package com.gamericefishpro.space.ui;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceConfigurationError;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final List a;

    static {
        try {
            a = com.gamericefishpro.space.li.m.e(com.gamericefishpro.space.li.j.b(Arrays.asList(new com.gamericefishpro.space.qi.b()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
