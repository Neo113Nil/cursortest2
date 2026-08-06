package io.appmetrica.analytics.impl;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class C4 extends Ff {

    /* renamed from: a, reason: collision with root package name */
    public final B4 f4254a;

    public C4(C0863x4 c0863x4) {
        this.f4254a = new B4(c0863x4);
    }

    @Override // io.appmetrica.analytics.impl.Ff
    public final W8 a(int i2) {
        ArrayList arrayList = new ArrayList();
        int ordinal = EnumC0301bb.a(i2).ordinal();
        if (ordinal == 12) {
            arrayList.add(this.f4254a.f4185a);
        } else if (ordinal == 14) {
            arrayList.add(this.f4254a.f4186b);
        } else if (ordinal == 34) {
            arrayList.add(this.f4254a.f4187c);
        }
        return new V8(arrayList);
    }
}
