package ru.yandex.taxi.common_models.net.map_object;

import defpackage.ef61;
import defpackage.ff61;
import defpackage.gsq0;
import defpackage.qje;
import defpackage.uc4;

@gsq0
/* loaded from: classes9.dex */
public final class w0 extends z {
    public static final ff61 Companion = new ff61();
    public final uc4 a;

    public /* synthetic */ w0(int i, uc4 uc4Var) {
        if (1 == (i & 1)) {
            this.a = uc4Var;
        } else {
            qje.Z(i, 1, ef61.a.getDescriptor());
            throw null;
        }
    }

    @Override // ru.yandex.taxi.common_models.net.map_object.z
    public final Type a() {
        return Type.ZOOM_MAP_BBOX;
    }
}
