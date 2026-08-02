package com.yandex.passport.sloth.data;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l0 extends r {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final com.yandex.passport.sloth.dependencies.e f;

    public l0(String str, String str2, String str3, String str4, com.yandex.passport.sloth.dependencies.e eVar) {
        super(k.Turbo);
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = eVar;
    }

    @Override // com.yandex.passport.sloth.data.r
    public final com.yandex.passport.sloth.dependencies.e d() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return Intrinsics.d(this.b, l0Var.b) && Intrinsics.d(this.c, l0Var.c) && Intrinsics.d(this.d, l0Var.d) && Intrinsics.d(this.e, l0Var.e) && Intrinsics.d(this.f, l0Var.f);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return Boolean.hashCode(false) + ((this.f.hashCode() + ((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "Turbo(phoneNumber=" + this.b + ", email=" + this.c + ", firstName=" + this.d + ", lastName=" + this.e + ", properties=" + this.f + ", canGoBack=false)";
    }
}
