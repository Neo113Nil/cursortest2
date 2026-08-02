package ru.yandex.taxi.common_models.net.map_object;

import defpackage.b8s0;
import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/common_models/net/map_object/n0;", "Lru/yandex/taxi/common_models/net/map_object/z;", "Companion", "a8s0", "b8s0", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class n0 extends z {
    public static final b8s0 Companion = new b8s0();
    public final boolean a;

    public /* synthetic */ n0(int i, boolean z) {
        if ((i & 1) == 0) {
            this.a = false;
        } else {
            this.a = z;
        }
    }

    @Override // ru.yandex.taxi.common_models.net.map_object.z
    public final Type a() {
        return Type.PICK_SCOOTER_PARKING;
    }

    public n0() {
        this.a = false;
    }
}
