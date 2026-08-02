package ru.yandex.taxi.common_models.net.map_object;

import defpackage.gsq0;
import defpackage.hkg0;
import defpackage.i3y;
import defpackage.pq1;
import defpackage.tki0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/common_models/net/map_object/d0;", "Lru/yandex/taxi/common_models/net/map_object/z;", "Companion", "qki0", "tki0", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d0 extends z {
    public static final tki0 Companion = new tki0();
    public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new hkg0(17))};
    public final String a;
    public final pq1 b;
    public final List c;

    public /* synthetic */ d0(int i, String str, pq1 pq1Var, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = pq1Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }

    @Override // ru.yandex.taxi.common_models.net.map_object.z
    public final Type a() {
        return Type.CHANGE_TARIFF;
    }

    public d0() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
