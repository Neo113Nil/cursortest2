package defpackage;

import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class wik0 implements zjk0 {
    public final String a;
    public final String b;
    public final xss0 c;
    public final kdc d;
    public final boolean e;
    public final akk0 f;

    public wik0(String str, String str2, xss0 xss0Var, kdc kdcVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = xss0Var;
        this.d = kdcVar;
        this.e = z;
        this.f = qpa1.c(xss0Var, str2, EmptyList.a);
    }

    public static wik0 c(wik0 wik0Var, xss0 xss0Var) {
        return new wik0(wik0Var.a, wik0Var.b, xss0Var, wik0Var.d, wik0Var.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wik0)) {
            return false;
        }
        wik0 wik0Var = (wik0) obj;
        return jl40.l(this.a, wik0Var.a) && jl40.l(this.b, wik0Var.b) && jl40.l(this.c, wik0Var.c) && jl40.l(this.d, wik0Var.d) && this.e == wik0Var.e;
    }

    @Override // defpackage.zjk0
    public final wrs0 getAnalytics() {
        return this.f;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.e) + smw0.d(this.d, (this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("RideCardGenericItemUiState(id=", this.a, ", analyticsId=", this.b, ", slotItemState=");
        v.append(this.c);
        v.append(", backgroundColor=");
        v.append(this.d);
        v.append(", isLoading=");
        return x4e.i(v, this.e, Extension.C_BRAKE);
    }
}
