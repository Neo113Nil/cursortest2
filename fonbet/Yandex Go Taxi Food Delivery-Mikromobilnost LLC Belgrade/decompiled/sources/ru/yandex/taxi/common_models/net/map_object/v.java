package ru.yandex.taxi.common_models.net.map_object;

import defpackage.gsq0;
import defpackage.rlb0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/common_models/net/map_object/v;", "Lru/yandex/taxi/common_models/net/map_object/z;", "Companion", "qlb0", "rlb0", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class v extends z {
    public static final rlb0 Companion = new rlb0();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ v(int i, String str, String str2, String str3) {
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
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    @Override // ru.yandex.taxi.common_models.net.map_object.z
    public final Type a() {
        return Type.PICK_CHARGERS_STATION;
    }

    public v() {
        this.a = "";
        this.b = "";
        this.c = null;
    }
}
