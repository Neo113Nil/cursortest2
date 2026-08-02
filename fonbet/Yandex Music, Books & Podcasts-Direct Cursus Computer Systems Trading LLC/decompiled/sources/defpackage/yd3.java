package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class yd3 extends zd3 {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final d85 g;
    public final d85 h;
    public final List i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd3(String str, String str2, String str3, String str4, String str5, d85 d85Var, d85 d85Var2, List list) {
        super(ae3.a);
        list.getClass();
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = d85Var;
        this.h = d85Var2;
        this.i = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd3)) {
            return false;
        }
        yd3 yd3Var = (yd3) obj;
        return Intrinsics.d(this.b, yd3Var.b) && Intrinsics.d(this.c, yd3Var.c) && Intrinsics.d(this.d, yd3Var.d) && Intrinsics.d(this.e, yd3Var.e) && Intrinsics.d(this.f, yd3Var.f) && Intrinsics.d(this.g, yd3Var.g) && Intrinsics.d(this.h, yd3Var.h) && Intrinsics.d(this.i, yd3Var.i);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.b.hashCode() * 31;
        int i = 0;
        String str = this.c;
        int c = k5r.c((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        int hashCode3 = (c + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        d85 d85Var = this.g;
        if (d85Var == null) {
            hashCode = 0;
        } else {
            long j = d85Var.a;
            met metVar = net.b;
            hashCode = Long.hashCode(j);
        }
        int i2 = (hashCode4 + hashCode) * 31;
        d85 d85Var2 = this.h;
        if (d85Var2 != null) {
            long j2 = d85Var2.a;
            met metVar2 = net.b;
            i = Long.hashCode(j2);
        }
        return this.i.hashCode() + ((i2 + i) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("WaveButton(title=", this.b, ", header=", this.c, ", stationId=");
        su4.v(m, this.d, ", imageUrl=", this.e, ", bgImageUrl=");
        m.append(this.f);
        m.append(", bgColor=");
        m.append(this.g);
        m.append(", waveText=");
        m.append(this.h);
        m.append(", seeds=");
        m.append(this.i);
        m.append(")");
        return m.toString();
    }
}
