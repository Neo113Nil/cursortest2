package defpackage;

import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.player.impl.tracking.device.DeviceType;

/* loaded from: classes6.dex */
public final class o08 {
    public final DeviceType a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Boolean h;
    public final jyr i = btf.b(new n08(this, 0));

    public o08(DeviceType deviceType, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool) {
        this.a = deviceType;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!o08.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        o08 o08Var = (o08) obj;
        return this.a == o08Var.a && Intrinsics.d(this.b, o08Var.b) && Intrinsics.d(this.c, o08Var.c) && Intrinsics.d(this.d, o08Var.d) && Intrinsics.d(this.e, o08Var.e) && Intrinsics.d(this.f, o08Var.f) && Intrinsics.d(this.g, o08Var.g) && Intrinsics.d(this.h, o08Var.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 29791;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.g;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Boolean bool = this.h;
        return hashCode7 + (bool != null ? bool.hashCode() : 0);
    }
}
