package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class inu extends jnu {
    public final String a;
    public final v3g b;
    public final qmu c;
    public final long d;
    public final String e;
    public final String f;
    public final d85 g;
    public final d85 h;

    public inu(String str, v3g v3gVar, qmu qmuVar, long j, String str2, String str3, d85 d85Var, d85 d85Var2) {
        str.getClass();
        this.a = str;
        this.b = v3gVar;
        this.c = qmuVar;
        this.d = j;
        this.e = str2;
        this.f = str3;
        this.g = d85Var;
        this.h = d85Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof inu)) {
            return false;
        }
        inu inuVar = (inu) obj;
        return Intrinsics.d(this.a, inuVar.a) && this.b.equals(inuVar.b) && this.c == inuVar.c && d85.c(this.d, inuVar.d) && Intrinsics.d(this.e, inuVar.e) && Intrinsics.d(this.f, inuVar.f) && Intrinsics.d(this.g, inuVar.g) && Intrinsics.d(this.h, inuVar.h);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        int i = d85.o;
        met metVar = net.b;
        int c = tlm.c(this.d, hashCode, 31);
        String str = this.e;
        int hashCode2 = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        d85 d85Var = this.g;
        int hashCode4 = (hashCode3 + (d85Var == null ? 0 : Long.hashCode(d85Var.a))) * 31;
        d85 d85Var2 = this.h;
        return hashCode4 + (d85Var2 != null ? Long.hashCode(d85Var2.a) : 0);
    }

    public final String toString() {
        String i = d85.i(this.d);
        StringBuilder sb = new StringBuilder("WithBackgroundColor(title=");
        sb.append(this.a);
        sb.append(", image=");
        sb.append(this.b);
        sb.append(", playbackState=");
        sb.append(this.c);
        sb.append(", bgColor=");
        sb.append(i);
        sb.append(", bgImage=");
        su4.v(sb, this.e, ", waveHeader=", this.f, ", headerTextColor=");
        sb.append(this.g);
        sb.append(", titleTextColor=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
