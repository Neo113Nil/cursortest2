package ru.yandex.taxi.common_models.net.map_object;

import defpackage.gsq0;
import defpackage.ylb0;
import defpackage.zzs;
import kotlin.Metadata;
import kotlinx.serialization.json.JsonNull;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/common_models/net/map_object/y;", "Lru/yandex/taxi/common_models/net/map_object/z;", "Companion", "xlb0", "ylb0", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class y extends z {
    public static final ylb0 Companion = new ylb0();
    public final kotlinx.serialization.json.b a;
    public final zzs b;
    public final int c;

    public /* synthetic */ y(int i, kotlinx.serialization.json.b bVar, zzs zzsVar, int i2) {
        this.a = (i & 1) == 0 ? JsonNull.INSTANCE : bVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = zzsVar;
        }
        if ((i & 4) == 0) {
            this.c = 0;
        } else {
            this.c = i2;
        }
    }

    @Override // ru.yandex.taxi.common_models.net.map_object.z
    public final Type a() {
        return Type.PICK_SCOOTER_PARKING;
    }

    public y() {
        this.a = JsonNull.INSTANCE;
        this.b = null;
        this.c = 0;
    }
}
