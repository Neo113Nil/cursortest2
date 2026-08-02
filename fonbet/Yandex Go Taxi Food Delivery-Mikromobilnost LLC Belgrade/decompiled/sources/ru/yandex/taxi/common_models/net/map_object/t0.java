package ru.yandex.taxi.common_models.net.map_object;

import defpackage.gsq0;
import defpackage.syi;
import defpackage.x541;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/common_models/net/map_object/t0;", "Lru/yandex/taxi/common_models/net/map_object/z;", "Companion", "w541", "x541", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class t0 extends z {
    public static final x541 Companion = new x541();
    public final syi a;

    public /* synthetic */ t0(int i, syi syiVar) {
        if ((i & 1) == 0) {
            this.a = new syi(3, null);
        } else {
            this.a = syiVar;
        }
    }

    @Override // ru.yandex.taxi.common_models.net.map_object.z
    public final Type a() {
        return Type.WALK_ROUTE;
    }

    public t0(syi syiVar) {
        this.a = syiVar;
    }

    public t0() {
        this(new syi(3, null));
    }
}
