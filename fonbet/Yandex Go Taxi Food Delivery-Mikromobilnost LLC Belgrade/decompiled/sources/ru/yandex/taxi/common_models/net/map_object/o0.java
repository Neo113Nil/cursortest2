package ru.yandex.taxi.common_models.net.map_object;

import defpackage.e8s0;
import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/common_models/net/map_object/o0;", "Lru/yandex/taxi/common_models/net/map_object/z;", "Companion", "d8s0", "e8s0", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class o0 extends z {
    public static final e8s0 Companion = new e8s0();
    public final l a;
    public final String b;

    public /* synthetic */ o0(int i, l lVar, String str) {
        this.a = (i & 1) == 0 ? k.INSTANCE : lVar;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    @Override // ru.yandex.taxi.common_models.net.map_object.z
    public final Type a() {
        return Type.SHOW_POINT_CLARIFICATION_SCREEN;
    }

    /* renamed from: b, reason: from getter */
    public final l getA() {
        return this.a;
    }

    public o0() {
        this.a = k.INSTANCE;
        this.b = "";
    }
}
