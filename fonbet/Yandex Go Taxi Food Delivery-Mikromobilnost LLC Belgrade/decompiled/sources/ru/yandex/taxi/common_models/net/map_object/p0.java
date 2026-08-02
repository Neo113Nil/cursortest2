package ru.yandex.taxi.common_models.net.map_object;

import defpackage.gsq0;
import defpackage.u8s0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.NotificationParams;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/common_models/net/map_object/p0;", "Lru/yandex/taxi/common_models/net/map_object/z;", "Companion", "s8s0", "u8s0", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class p0 extends z {
    public static final u8s0 Companion = new u8s0();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final NotificationParams f;

    public /* synthetic */ p0(int i, String str, String str2, String str3, String str4, String str5, NotificationParams notificationParams) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = notificationParams;
        }
    }

    @Override // ru.yandex.taxi.common_models.net.map_object.z
    public final Type a() {
        return Type.SHOW_POPUP;
    }

    public p0() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
