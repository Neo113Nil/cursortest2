package ru.yandex.taxi.common_models.net.map_object;

import defpackage.a9s0;
import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/common_models/net/map_object/q0;", "Lru/yandex/taxi/common_models/net/map_object/z;", "Companion", "z8s0", "a9s0", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class q0 extends z {
    public static final a9s0 Companion = new a9s0();
    public final String a;
    public final String b;

    public /* synthetic */ q0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
    }

    @Override // ru.yandex.taxi.common_models.net.map_object.z
    public final Type a() {
        return Type.SHOW_SCREEN_THROUGH_PROMO;
    }

    public q0() {
        this.a = "";
        this.b = "";
    }
}
