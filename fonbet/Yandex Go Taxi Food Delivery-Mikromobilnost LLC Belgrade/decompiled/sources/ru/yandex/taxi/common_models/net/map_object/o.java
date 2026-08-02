package ru.yandex.taxi.common_models.net.map_object;

import defpackage.gsq0;
import defpackage.jb9;
import defpackage.kb9;
import defpackage.qje;

@gsq0
/* loaded from: classes5.dex */
public final class o extends z {
    public static final kb9 Companion = new kb9();
    public final String a;

    public /* synthetic */ o(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, jb9.a.getDescriptor());
            throw null;
        }
    }

    @Override // ru.yandex.taxi.common_models.net.map_object.z
    public final Type a() {
        return Type.CHANGE_ZONE_MODE;
    }
}
