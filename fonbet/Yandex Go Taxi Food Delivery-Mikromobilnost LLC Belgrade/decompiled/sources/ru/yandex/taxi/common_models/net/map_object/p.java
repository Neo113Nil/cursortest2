package ru.yandex.taxi.common_models.net.map_object;

import defpackage.gsq0;
import defpackage.xzg;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/common_models/net/map_object/p;", "Lru/yandex/taxi/common_models/net/map_object/z;", "Companion", "wzg", "xzg", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class p extends z {
    public static final xzg Companion = new xzg();
    public final String a;

    public /* synthetic */ p(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
    }

    @Override // ru.yandex.taxi.common_models.net.map_object.z
    public final Type a() {
        return Type.DEEPLINK;
    }

    public p() {
        this.a = "";
    }
}
