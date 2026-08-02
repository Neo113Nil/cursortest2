package defpackage;

import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class w74 extends x74 {
    public final String c;
    public final String d;
    public final v74 e;
    public final boolean f;
    public final String g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w74(String str, String str2, v74 v74Var, boolean z) {
        super(r0, r2);
        u74 u74Var = u74.e;
        int ordinal = v74Var.ordinal();
        int i = R.drawable.ic_tv_24;
        switch (ordinal) {
            case 0:
                i = R.drawable.ic_phone_24;
                break;
            case 1:
            case 2:
            case 3:
            case 6:
                break;
            case 4:
                i = R.drawable.ic_smart_watch_24;
                break;
            case 5:
                i = R.drawable.ic_computer_24;
                break;
            case 7:
                i = R.drawable.ic_jbl_24;
                break;
            default:
                b6e.s();
                throw null;
        }
        this.c = str;
        this.d = str2;
        this.e = v74Var;
        this.f = z;
        this.g = str;
    }

    @Override // defpackage.x74
    public final String a() {
        return this.g;
    }

    @Override // defpackage.x74
    public final String b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w74)) {
            return false;
        }
        w74 w74Var = (w74) obj;
        return Intrinsics.d(this.c, w74Var.c) && Intrinsics.d(this.d, w74Var.d) && this.e == w74Var.e && this.f == w74Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + k5r.c(this.c.hashCode() * 31, 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("YnisonDevice(deviceId=", this.c, ", title=", this.d, ", deviceType=");
        m.append(this.e);
        m.append(", accessible=");
        m.append(this.f);
        m.append(")");
        return m.toString();
    }
}
