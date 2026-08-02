package ru.yandex.taxi.summary.promotions.models;

import defpackage.f9;
import defpackage.lb7;
import defpackage.qoi0;
import defpackage.xqt;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public final class v0 extends xqt {
    public static final v0 e = new v0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, u0.Companion.serializer(), qoi0.a(u0.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("default", u0.Companion.serializer(), qoi0.a(u0.class)), new f9("steps_instruction", y0.Companion.serializer(), qoi0.a(y0.class)));
    }
}
