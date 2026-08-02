package ru.yandex.taxi.common_models.net.map_object;

import defpackage.ee80;
import defpackage.gsq0;
import defpackage.pi80;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/common_models/net/map_object/u;", "Lru/yandex/taxi/common_models/net/map_object/z;", "Companion", "de80", "ee80", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class u extends z {
    public static final ee80 Companion = new ee80();
    public final pi80 a;
    public final String b;
    public final Boolean c;
    public final Float d;
    public final Float e;

    public /* synthetic */ u(int i, pi80 pi80Var, String str, Boolean bool, Float f, Float f2) {
        this.a = (i & 1) == 0 ? new pi80(0) : pi80Var;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = f;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = f2;
        }
    }

    @Override // ru.yandex.taxi.common_models.net.map_object.z
    public final Type a() {
        return Type.ORGANIZATION_CARD;
    }

    public u() {
        this.a = new pi80(0);
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
