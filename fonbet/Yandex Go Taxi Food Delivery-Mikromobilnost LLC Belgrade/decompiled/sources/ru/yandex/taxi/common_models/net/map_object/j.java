package ru.yandex.taxi.common_models.net.map_object;

import defpackage.gsq0;
import defpackage.l61;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/common_models/net/map_object/j;", "Lru/yandex/taxi/common_models/net/map_object/z;", "Companion", "k61", "l61", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class j extends z {
    public static final l61 Companion = new l61();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ j(int i, String str, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
    }

    @Override // ru.yandex.taxi.common_models.net.map_object.z
    public final Type a() {
        return Type.ADDRESS_SELECTION;
    }

    public j() {
        this.a = null;
        this.b = "";
        this.c = "";
        this.d = null;
    }
}
