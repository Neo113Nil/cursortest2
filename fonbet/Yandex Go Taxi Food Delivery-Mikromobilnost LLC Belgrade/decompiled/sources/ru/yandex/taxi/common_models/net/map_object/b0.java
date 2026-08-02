package ru.yandex.taxi.common_models.net.map_object;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jsq0;
import defpackage.ksq0;
import defpackage.lde0;
import defpackage.rde0;
import defpackage.sde0;
import defpackage.yud0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/common_models/net/map_object/b0;", "Lru/yandex/taxi/common_models/net/map_object/z;", "Companion", "kde0", "lde0", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b0 extends z {
    public static final lde0 Companion = new lde0();
    public static final i3y[] h;
    public final jsq0 a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final String f;
    public final sde0 g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new yud0(24)), null, null, null, kotlin.a.b(lazyThreadSafetyMode, new yud0(25)), null, null};
    }

    public /* synthetic */ b0(int i, jsq0 jsq0Var, String str, String str2, String str3, List list, String str4, sde0 sde0Var) {
        this.a = (i & 1) == 0 ? ksq0.a : jsq0Var;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = EmptyList.a;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = rde0.INSTANCE;
        } else {
            this.g = sde0Var;
        }
    }

    @Override // ru.yandex.taxi.common_models.net.map_object.z
    public final Type a() {
        return Type.POSITION_CONFIRMATION;
    }

    public b0() {
        jsq0 jsq0Var = ksq0.a;
        rde0 rde0Var = rde0.INSTANCE;
        this.a = jsq0Var;
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = EmptyList.a;
        this.f = "";
        this.g = rde0Var;
    }
}
