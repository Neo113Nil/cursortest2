package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
/* loaded from: classes2.dex */
public final class x151 implements d251 {
    public static final w151 Companion = new w151();
    public static final i3y[] f;
    public final String a;
    public final sfe b;
    public final wv c;
    public final wzj d;
    public final List e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, null, a.b(lazyThreadSafetyMode, new tn41(17)), null, a.b(lazyThreadSafetyMode, new tn41(18))};
    }

    public /* synthetic */ x151(int i, String str, sfe sfeVar, wv wvVar, wzj wzjVar, List list) {
        if (31 != (i & 31)) {
            qje.Z(i, 31, v151.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = sfeVar;
        this.c = wvVar;
        this.d = wzjVar;
        this.e = list;
    }

    public static final void e(x151 x151Var, yjd yjdVar, SerialDescriptor serialDescriptor) {
        yjdVar.o(serialDescriptor, 0, x151Var.a);
        yjdVar.g(serialDescriptor, 1, qfe.a, x151Var.b);
        i3y[] i3yVarArr = f;
        yjdVar.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), x151Var.c);
        yjdVar.e(serialDescriptor, 3, nzj.a, x151Var.d);
        yjdVar.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), x151Var.e);
    }

    @Override // defpackage.y251
    public final wzj a() {
        return this.d;
    }

    @Override // defpackage.d251
    public final List b() {
        return this.e;
    }

    public final wv d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x151)) {
            return false;
        }
        x151 x151Var = (x151) obj;
        return jl40.l(this.a, x151Var.a) && jl40.l(this.b, x151Var.b) && jl40.l(this.c, x151Var.c) && jl40.l(this.d, x151Var.d) && jl40.l(this.e, x151Var.e);
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
        return this.e.hashCode() + ((this.d.hashCode() + ((hashCode2 + (wvVar != null ? wvVar.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Box(id=");
        sb.append(this.a);
        sb.append(", contentDescription=");
        sb.append(this.b);
        sb.append(", action=");
        sb.append(this.c);
        sb.append(", displayRules=");
        sb.append(this.d);
        sb.append(", widgetIds=");
        return unr0.t(sb, this.e, ')');
    }

    public x151(String str, sfe sfeVar, wv wvVar, wzj wzjVar, List list) {
        this.a = str;
        this.b = sfeVar;
        this.c = wvVar;
        this.d = wzjVar;
        this.e = list;
    }
}
