package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class isb implements tvs {
    public final dsc a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public final int h;
    public final float i;
    public final String j;
    public final String k;

    /* JADX WARN: Removed duplicated region for block: B:6:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public isb(dsc dscVar) {
        String str;
        String concat;
        u2i u2iVar;
        String str2;
        String str3 = dscVar.a;
        String str4 = dscVar.b;
        String str5 = dscVar.d;
        jyr jyrVar = fmf.a;
        if (str5 != null) {
            int i = dvt.a;
            String str6 = str5.split("-", 2)[0];
            str6.getClass();
            if (str6.length() == 2 && (str = (String) ((Map) fmf.a.getValue()).get(str6)) != null) {
                concat = str.concat(str5.substring(2));
                int i2 = dscVar.u;
                int i3 = dscVar.v;
                int i4 = dscVar.j;
                float f = dscVar.w;
                String str7 = dscVar.k;
                u2iVar = dscVar.l;
                if (u2iVar != null) {
                    for (n2i n2iVar : u2iVar.a) {
                        u8h u8hVar = n2iVar instanceof u8h ? (u8h) n2iVar : null;
                        if (u8hVar != null) {
                            str2 = u8hVar.a;
                            break;
                        }
                    }
                }
                str2 = null;
                dscVar.getClass();
                this.a = dscVar;
                this.b = str3;
                this.c = str4;
                this.d = str5;
                this.e = concat;
                this.f = i2;
                this.g = i3;
                this.h = i4;
                this.i = f;
                this.j = str7;
                this.k = str2;
            }
        }
        concat = str5;
        int i22 = dscVar.u;
        int i32 = dscVar.v;
        int i42 = dscVar.j;
        float f2 = dscVar.w;
        String str72 = dscVar.k;
        u2iVar = dscVar.l;
        if (u2iVar != null) {
        }
        str2 = null;
        dscVar.getClass();
        this.a = dscVar;
        this.b = str3;
        this.c = str4;
        this.d = str5;
        this.e = concat;
        this.f = i22;
        this.g = i32;
        this.h = i42;
        this.i = f2;
        this.j = str72;
        this.k = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isb)) {
            return false;
        }
        isb isbVar = (isb) obj;
        return Intrinsics.d(this.a, isbVar.a) && Intrinsics.d(this.b, isbVar.b) && Intrinsics.d(this.c, isbVar.c) && Intrinsics.d(this.d, isbVar.d) && Intrinsics.d(this.e, isbVar.e) && this.f == isbVar.f && this.g == isbVar.g && this.h == isbVar.h && Float.compare(this.i, isbVar.i) == 0 && Intrinsics.d(this.j, isbVar.j) && Intrinsics.d(this.k, isbVar.k);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int a = eta.a(f1d.a(this.h, f1d.a(this.g, f1d.a(this.f, (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31), 31), this.i, 31);
        String str5 = this.j;
        int hashCode5 = (a + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.k;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        return "ExoTrackFormat(language=" + this.d + ", iso3Language=" + this.e + ", manifestLanguage=" + this.k + ", format=Format(" + dsc.c(this.a) + "))";
    }
}
