package com.gamericefishpro.space.t0;

import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface c {
    void c(int i, Object obj);

    void d(Object obj);

    void e();

    void g(int i, Object obj);

    Object getCurrent();

    void i(int i, int i2, int i3);

    void j(int i, int i2);

    void l();

    default void n(Object obj, Function2 function2) {
        function2.invoke(getCurrent(), obj);
    }

    default void h() {
    }
}
