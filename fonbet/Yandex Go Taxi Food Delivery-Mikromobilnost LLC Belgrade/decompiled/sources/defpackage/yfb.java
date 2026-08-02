package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.checkin.CheckInButtonState;
import ru.yandex.taxi.checkin.CheckInStateActionType;

/* loaded from: classes14.dex */
public final class yfb {
    public static final yfb j = new yfb(CheckInButtonState.IDLE, false, new fc8(""), CheckInStateActionType.BUTTON, "", "", "", "", null);
    public final CheckInButtonState a;
    public final boolean b;
    public final kfb1 c;
    public final CheckInStateActionType d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final j37 i;

    public yfb(CheckInButtonState checkInButtonState, boolean z, kfb1 kfb1Var, CheckInStateActionType checkInStateActionType, String str, String str2, String str3, String str4, j37 j37Var) {
        this.a = checkInButtonState;
        this.b = z;
        this.c = kfb1Var;
        this.d = checkInStateActionType;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = j37Var;
    }

    public final kfb1 a() {
        return this.c;
    }

    public final CheckInStateActionType b() {
        return this.d;
    }

    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yfb)) {
            return false;
        }
        yfb yfbVar = (yfb) obj;
        return this.a == yfbVar.a && this.b == yfbVar.b && this.c.equals(yfbVar.c) && this.d == yfbVar.d && jl40.l(this.e, yfbVar.e) && jl40.l(this.f, yfbVar.f) && jl40.l(this.g, yfbVar.g) && jl40.l(this.h, yfbVar.h) && jl40.l(this.i, yfbVar.i);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(unr0.b((this.d.hashCode() + ((this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        j37 j37Var = this.i;
        return b + (j37Var == null ? 0 : j37Var.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckInState(buttonState=");
        sb.append(this.a);
        sb.append(", isAvailable=");
        sb.append(this.b);
        sb.append(", cardContent=");
        sb.append(this.c);
        sb.append(", checkInStateActionType=");
        sb.append(this.d);
        sb.append(", actionTitle=");
        g8e.D(sb, this.e, ", waitingTitle=", this.f, ", actionSubtitle=");
        g8e.D(sb, this.g, ", waitingSubtitle=", this.h, ", buttonStyle=");
        sb.append(this.i);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
