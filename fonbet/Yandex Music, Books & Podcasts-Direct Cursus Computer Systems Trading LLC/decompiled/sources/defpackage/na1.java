package defpackage;

import com.yandex.music.shared.utils.assertions.Assertions;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class na1 {
    public final c01 a;
    public final i21 b;
    public final dnk c;
    public final String d;

    public na1(c01 c01Var, i21 i21Var, dnk dnkVar, String str) {
        this.a = c01Var;
        this.b = i21Var;
        this.c = dnkVar;
        this.d = str;
    }

    public final List a() {
        List list;
        i21 i21Var = this.b;
        if (i21Var != null && (list = i21Var.g) != null) {
            return list;
        }
        dnk dnkVar = this.c;
        if (dnkVar != null) {
            return dnkVar.c;
        }
        Assertions.fail("No data");
        return c5b.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na1)) {
            return false;
        }
        na1 na1Var = (na1) obj;
        return this.a.equals(na1Var.a) && Intrinsics.d(this.b, na1Var.b) && Intrinsics.d(this.c, na1Var.c) && Intrinsics.d(this.d, na1Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        i21 i21Var = this.b;
        int hashCode2 = (hashCode + (i21Var == null ? 0 : i21Var.hashCode())) * 31;
        dnk dnkVar = this.c;
        int hashCode3 = (hashCode2 + (dnkVar == null ? 0 : dnkVar.hashCode())) * 31;
        String str = this.d;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ArtistInfo(artist=" + this.a + ", artistBriefInfo=" + this.b + ", phonotekaArtistInfo=" + this.c + ", foreignAgentDisclaimer=" + this.d + ")";
    }
}
