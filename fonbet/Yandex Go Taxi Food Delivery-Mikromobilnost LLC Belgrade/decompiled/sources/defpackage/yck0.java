package defpackage;

import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.superapp.orders.models.ActionAccessibilityType;

/* loaded from: classes14.dex */
public final class yck0 implements zjk0, zck0 {
    public final String a;
    public final String b;
    public final xqs0 c;
    public final kdc d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final qk4 h;
    public final ActionAccessibilityType i;
    public final akk0 j;

    public yck0(String str, String str2, xqs0 xqs0Var, kdc kdcVar, boolean z, boolean z2, boolean z3, qk4 qk4Var, ActionAccessibilityType actionAccessibilityType) {
        this.a = str;
        this.b = str2;
        this.c = xqs0Var;
        this.d = kdcVar;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = qk4Var;
        this.i = actionAccessibilityType;
        this.j = qpa1.c(xqs0Var.a, str2, EmptyList.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yck0)) {
            return false;
        }
        yck0 yck0Var = (yck0) obj;
        return jl40.l(this.a, yck0Var.a) && jl40.l(this.b, yck0Var.b) && this.c.equals(yck0Var.c) && jl40.l(this.d, yck0Var.d) && this.e == yck0Var.e && this.f == yck0Var.f && this.g == yck0Var.g && jl40.l(this.h, yck0Var.h) && this.i == yck0Var.i;
    }

    @Override // defpackage.zjk0
    public final wrs0 getAnalytics() {
        return this.j;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int e = unr0.e(unr0.e(unr0.e(smw0.d(this.d, (this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31), 31, this.e), 31, this.f), 31, this.g);
        qk4 qk4Var = this.h;
        int hashCode2 = (e + (qk4Var == null ? 0 : qk4Var.hashCode())) * 31;
        ActionAccessibilityType actionAccessibilityType = this.i;
        return hashCode2 + (actionAccessibilityType != null ? actionAccessibilityType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("Button(id=", this.a, ", analyticsId=", this.b, ", slotItemButtonState=");
        v.append(this.c);
        v.append(", backgroundColor=");
        v.append(this.d);
        v.append(", isLoading=");
        nnm.v(", isEnabled=", ", isChecked=", v, this.e, this.f);
        v.append(this.g);
        v.append(", badgeState=");
        v.append(this.h);
        v.append(", actionAccessibilityType=");
        v.append(this.i);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
