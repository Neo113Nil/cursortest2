package ru.yandex.taxi.common_models.net.map_object;

import defpackage.gsq0;
import defpackage.qje;
import defpackage.slb0;
import defpackage.tlb0;

@gsq0
/* loaded from: classes5.dex */
public final class w extends z {
    public static final tlb0 Companion = new tlb0();
    public final kotlinx.serialization.json.b a;

    public /* synthetic */ w(int i, kotlinx.serialization.json.b bVar) {
        if (1 == (i & 1)) {
            this.a = bVar;
        } else {
            qje.Z(i, 1, slb0.a.getDescriptor());
            throw null;
        }
    }

    @Override // ru.yandex.taxi.common_models.net.map_object.z
    public final Type a() {
        return Type.PICK_DRIVE_PARKING;
    }
}
