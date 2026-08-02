package ru.yandex.taxi.scooters.experiments;

import defpackage.f9;
import defpackage.lb7;
import defpackage.qoi0;
import defpackage.xqt;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes9.dex */
public final class m extends xqt {
    public static final m e = new m();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, p.Companion.serializer(), qoi0.a(p.class));
    }

    @Override // defpackage.h9
    public final String e() {
        return "version";
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("v2", p.Companion.serializer(), qoi0.a(p.class)), new f9("v3", s.Companion.serializer(), qoi0.a(s.class)));
    }
}
