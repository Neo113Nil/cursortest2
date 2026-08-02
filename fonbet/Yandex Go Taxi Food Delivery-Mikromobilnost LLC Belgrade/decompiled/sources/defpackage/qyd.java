package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
/* loaded from: classes2.dex */
public final class qyd {
    public static final pyd Companion = new pyd();
    public static final i3y[] k;
    public final String a;
    public final y251 b;
    public final Map c;
    public final rh60 d;
    public final Map e;
    public final int f;
    public final e3n g;
    public final e3n h;
    public final String i;
    public final hle0 j;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        k = new i3y[]{null, a.b(lazyThreadSafetyMode, new kpd(20)), a.b(lazyThreadSafetyMode, new kpd(21)), a.b(lazyThreadSafetyMode, new kpd(22)), a.b(lazyThreadSafetyMode, new kpd(23)), null, null, null, null, a.b(lazyThreadSafetyMode, new kpd(24))};
    }

    public /* synthetic */ qyd(int i, String str, y251 y251Var, Map map, rh60 rh60Var, Map map2, int i2, e3n e3nVar, e3n e3nVar2, String str2, hle0 hle0Var) {
        if (1023 != (i & 1023)) {
            qje.Z(i, 1023, oyd.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = y251Var;
        this.c = map;
        this.d = rh60Var;
        this.e = map2;
        this.f = i2;
        this.g = e3nVar;
        this.h = e3nVar2;
        this.i = str2;
        this.j = hle0Var;
    }

    public static final /* synthetic */ void l(qyd qydVar, yjd yjdVar, SerialDescriptor serialDescriptor) {
        yjdVar.o(serialDescriptor, 0, qydVar.a);
        i3y[] i3yVarArr = k;
        yjdVar.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), qydVar.b);
        yjdVar.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), qydVar.c);
        yjdVar.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), qydVar.d);
        yjdVar.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), qydVar.e);
        yjdVar.A(5, qydVar.f, serialDescriptor);
        x3n x3nVar = x3n.a;
        yjdVar.g(serialDescriptor, 6, x3nVar, qydVar.g);
        yjdVar.g(serialDescriptor, 7, x3nVar, qydVar.h);
        yjdVar.g(serialDescriptor, 8, auu0.a, qydVar.i);
        yjdVar.g(serialDescriptor, 9, (KSerializer) i3yVarArr[9].getValue(), qydVar.j);
    }

    public final e3n b() {
        return this.h;
    }

    public final String c() {
        return this.a;
    }

    public final Map d() {
        return this.c;
    }

    public final rh60 e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyd)) {
            return false;
        }
        qyd qydVar = (qyd) obj;
        return jl40.l(this.a, qydVar.a) && jl40.l(this.b, qydVar.b) && jl40.l(this.c, qydVar.c) && jl40.l(this.d, qydVar.d) && jl40.l(this.e, qydVar.e) && this.f == qydVar.f && jl40.l(this.g, qydVar.g) && jl40.l(this.h, qydVar.h) && jl40.l(this.i, qydVar.i) && jl40.l(this.j, qydVar.j);
    }

    public final int f() {
        return this.f;
    }

    public final hle0 g() {
        return this.j;
    }

    public final y251 h() {
        return this.b;
    }

    public final int hashCode() {
        int d = unr0.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        rh60 rh60Var = this.d;
        int b = oyr.b(this.f, unr0.d((d + (rh60Var == null ? 0 : rh60Var.hashCode())) * 31, 31, this.e), 31);
        e3n e3nVar = this.g;
        int hashCode = (b + (e3nVar == null ? 0 : Long.hashCode(e3nVar.a))) * 31;
        e3n e3nVar2 = this.h;
        int hashCode2 = (hashCode + (e3nVar2 == null ? 0 : Long.hashCode(e3nVar2.a))) * 31;
        String str = this.i;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        hle0 hle0Var = this.j;
        return hashCode3 + (hle0Var != null ? hle0Var.hashCode() : 0);
    }

    public final String i() {
        return this.i;
    }

    public final Map j() {
        return this.e;
    }

    public final e3n k() {
        return this.g;
    }

    public final String toString() {
        return "ConditionalPlaqueDto(id=" + this.a + ", rootWidget=" + this.b + ", metricContext=" + this.c + ", notification=" + this.d + ", serviceMeta=" + this.e + ", priority=" + this.f + ", showAfter=" + this.g + ", closeAfter=" + this.h + ", seenContext=" + this.i + ", rootPredicate=" + this.j + ')';
    }

    public qyd(String str, c251 c251Var, Map map, rh60 rh60Var, Map map2, int i, e3n e3nVar, e3n e3nVar2, String str2, hle0 hle0Var) {
        this.a = str;
        this.b = c251Var;
        this.c = map;
        this.d = rh60Var;
        this.e = map2;
        this.f = i;
        this.g = e3nVar;
        this.h = e3nVar2;
        this.i = str2;
        this.j = hle0Var;
    }
}
