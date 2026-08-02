package ru.yandex.taxi.common_models.net.map_object;

import defpackage.dji;
import defpackage.gsq0;
import defpackage.pcq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/common_models/net/map_object/h0;", "Lru/yandex/taxi/common_models/net/map_object/z;", "Companion", "ocq0", "pcq0", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h0 extends z {
    public static final pcq0 Companion = new pcq0();
    public final dji a;

    public /* synthetic */ h0(int i, dji djiVar) {
        if ((i & 1) == 0) {
            this.a = new dji(0);
        } else {
            this.a = djiVar;
        }
    }

    @Override // ru.yandex.taxi.common_models.net.map_object.z
    public final Type a() {
        return Type.SELECT_NDD_PICKUP_POINT;
    }

    public h0() {
        this.a = new dji(0);
    }
}
