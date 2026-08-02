package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@gsq0
/* loaded from: classes2.dex */
public final class w251 implements y251 {
    public static final v251 Companion = new v251();
    public static final i3y[] h;
    public final String a;
    public final sfe b;
    public final wv c;
    public final wzj d;
    public final List e;
    public final List f;
    public final Integer g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, null, a.b(lazyThreadSafetyMode, new q251(1)), null, a.b(lazyThreadSafetyMode, new q251(2)), a.b(lazyThreadSafetyMode, new q251(3)), null};
    }

    public /* synthetic */ w251(int i, String str, sfe sfeVar, wv wvVar, wzj wzjVar, List list, List list2, Integer num) {
        if (127 != (i & HProv.PP_VERSION_TIMESTAMP)) {
            qje.Z(i, HProv.PP_VERSION_TIMESTAMP, u251.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = sfeVar;
        this.c = wvVar;
        this.d = wzjVar;
        this.e = list;
        this.f = list2;
        this.g = num;
    }

    public static final void h(w251 w251Var, yjd yjdVar, SerialDescriptor serialDescriptor) {
        yjdVar.o(serialDescriptor, 0, w251Var.a);
        yjdVar.g(serialDescriptor, 1, qfe.a, w251Var.b);
        i3y[] i3yVarArr = h;
        yjdVar.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), w251Var.c);
        yjdVar.e(serialDescriptor, 3, nzj.a, w251Var.d);
        yjdVar.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), w251Var.e);
        yjdVar.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), w251Var.f);
        yjdVar.g(serialDescriptor, 6, h6w.a, w251Var.g);
    }

    @Override // defpackage.y251
    public final wzj a() {
        return this.d;
    }

    public final wv d() {
        return this.c;
    }

    public final Integer e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w251)) {
            return false;
        }
        w251 w251Var = (w251) obj;
        return jl40.l(this.a, w251Var.a) && jl40.l(this.b, w251Var.b) && jl40.l(this.c, w251Var.c) && jl40.l(this.d, w251Var.d) && jl40.l(this.e, w251Var.e) && jl40.l(this.f, w251Var.f) && jl40.l(this.g, w251Var.g);
    }

    public final List f() {
        return this.f;
    }

    public final List g() {
        return this.e;
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
        int c = unr0.c(unr0.c((this.d.hashCode() + ((hashCode2 + (wvVar == null ? 0 : wvVar.hashCode())) * 31)) * 31, 31, this.e), 31, this.f);
        Integer num = this.g;
        return c + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Text(id=");
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
        sb.append(this.f);
        sb.append(", lineHeight=");
        return vfc.o(sb, this.g, ')');
    }

    public w251(String str, sfe sfeVar, wv wvVar, wzj wzjVar, ArrayList arrayList, List list, Integer num) {
        this.a = str;
        this.b = sfeVar;
        this.c = wvVar;
        this.d = wzjVar;
        this.e = arrayList;
        this.f = list;
        this.g = num;
    }
}
