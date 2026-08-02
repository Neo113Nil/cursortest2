package com.yandex.passport.data.network;

import defpackage.dfi;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class q5 {

    @NotNull
    public static final p5 Companion = new p5();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ q5(int i, String str, String str2, String str3, String str4) {
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5)) {
            return false;
        }
        q5 q5Var = (q5) obj;
        return Intrinsics.d(this.a, q5Var.a) && Intrinsics.d(this.b, q5Var.b) && Intrinsics.d(this.c, q5Var.c) && Intrinsics.d(this.d, q5Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EbsConfig(bioCollectionType=");
        sb.append(this.a);
        sb.append(", tibUri=");
        sb.append(this.b);
        sb.append(", backendUriTemplate=");
        sb.append(this.c);
        sb.append(", ebsUriTemplate=");
        return dfi.i(sb, this.d, ')');
    }
}
