package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
/* loaded from: classes2.dex */
public final class t251 implements y251 {
    public static final s251 Companion = new s251();
    public static final i3y[] g;
    public final String a;
    public final sfe b;
    public final wv c;
    public final wzj d;
    public final List e;
    public final List f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, null, a.b(lazyThreadSafetyMode, new tn41(28)), null, a.b(lazyThreadSafetyMode, new tn41(29)), a.b(lazyThreadSafetyMode, new q251(0))};
    }

    public /* synthetic */ t251(int i, String str, sfe sfeVar, wv wvVar, wzj wzjVar, List list, List list2) {
        if (63 != (i & 63)) {
            qje.Z(i, 63, r251.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = sfeVar;
        this.c = wvVar;
        this.d = wzjVar;
        this.e = list;
        this.f = list2;
    }

    public static final void f(t251 t251Var, yjd yjdVar, SerialDescriptor serialDescriptor) {
        yjdVar.o(serialDescriptor, 0, t251Var.a);
        yjdVar.g(serialDescriptor, 1, qfe.a, t251Var.b);
        i3y[] i3yVarArr = g;
        yjdVar.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), t251Var.c);
        yjdVar.e(serialDescriptor, 3, nzj.a, t251Var.d);
        yjdVar.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), t251Var.e);
        yjdVar.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), t251Var.f);
    }

    @Override // defpackage.y251
    public final wzj a() {
        return this.d;
    }

    public final List d() {
        return this.f;
    }

    public final List e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t251)) {
            return false;
        }
        t251 t251Var = (t251) obj;
        return jl40.l(this.a, t251Var.a) && jl40.l(this.b, t251Var.b) && jl40.l(this.c, t251Var.c) && jl40.l(this.d, t251Var.d) && jl40.l(this.e, t251Var.e) && jl40.l(this.f, t251Var.f);
    }

    @Override // defpackage.y251
    public final sfe getContentDescription() {
        return this.b;
    }

    @Override // defpackage.y251
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        sfe sfeVar = this.b;
        int hashCode2 = (hashCode + (sfeVar == null ? 0 : sfeVar.hashCode())) * 31;
        wv wvVar = this.c;
        return this.f.hashCode() + unr0.c((this.d.hashCode() + ((hashCode2 + (wvVar != null ? wvVar.hashCode() : 0)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Switch(id=");
        sb.append(this.a);
        sb.append(", contentDescription=");
        sb.append(this.b);
        sb.append(", action=");
        sb.append(this.c);
        sb.append(", displayRules=");
        sb.append(this.d);
        sb.append(", text=");
        sb.append(this.e);
        sb.append(", templates=");
        return unr0.t(sb, this.f, ')');
    }

    public t251(String str, sfe sfeVar, wv wvVar, wzj wzjVar, ArrayList arrayList, List list) {
        this.a = str;
        this.b = sfeVar;
        this.c = wvVar;
        this.d = wzjVar;
        this.e = arrayList;
        this.f = list;
    }
}
