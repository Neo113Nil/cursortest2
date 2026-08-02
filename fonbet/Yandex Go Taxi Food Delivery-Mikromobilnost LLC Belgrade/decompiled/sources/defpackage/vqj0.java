package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.state.ItemType;
import java.util.List;
import kotlin.Pair;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class vqj0 implements rqj0 {
    public final mq01 a;
    public final Text b;
    public final String c;
    public final boolean d;
    public final Text e;
    public final hfb1 f;
    public final Text g;
    public final h9s h;
    public final boolean i;
    public final List j;
    public final List k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;

    public vqj0(mq01 mq01Var, Text text, String str, boolean z, Text text2, hfb1 hfb1Var, Text text3, h9s h9sVar, boolean z2, List list, List list2, int i, int i2, int i3, int i4) {
        this.a = mq01Var;
        this.b = text;
        this.c = str;
        this.d = z;
        this.e = text2;
        this.f = hfb1Var;
        this.g = text3;
        this.h = h9sVar;
        this.i = z2;
        this.j = list;
        this.k = list2;
        this.l = i;
        this.m = i2;
        this.n = i3;
        this.o = i4;
    }

    public static vqj0 c(vqj0 vqj0Var, String str, boolean z, Text text, Text text2, boolean z2, int i) {
        mq01 mq01Var = vqj0Var.a;
        Text text3 = vqj0Var.b;
        String str2 = (i & 4) != 0 ? vqj0Var.c : str;
        boolean z3 = (i & 8) != 0 ? vqj0Var.d : z;
        Text text4 = (i & 16) != 0 ? vqj0Var.e : text;
        hfb1 hfb1Var = vqj0Var.f;
        Text text5 = (i & 64) != 0 ? vqj0Var.g : text2;
        h9s h9sVar = vqj0Var.h;
        boolean z4 = (i & 256) != 0 ? vqj0Var.i : z2;
        List list = vqj0Var.j;
        List list2 = vqj0Var.k;
        int i2 = vqj0Var.l;
        int i3 = vqj0Var.m;
        int i4 = vqj0Var.n;
        int i5 = vqj0Var.o;
        vqj0Var.getClass();
        return new vqj0(mq01Var, text3, str2, z3, text4, hfb1Var, text5, h9sVar, z4, list, list2, i2, i3, i4, i5);
    }

    @Override // defpackage.rqj0
    public final rqj0 a(crj0 crj0Var) {
        if (this.d) {
            return this;
        }
        mq01 mq01Var = this.a;
        rma1 a = crj0.a(mq01Var, this.c, this.j, false, mq01Var.getItemType() == ItemType.ACCOUNT_NUMBER);
        rma1 b = crj0.b(this, false);
        Pair pair = a instanceof arj0 ? new Pair(Boolean.TRUE, ((arj0) a).a) : b instanceof arj0 ? new Pair(Boolean.TRUE, ((arj0) b).a) : new Pair(Boolean.FALSE, null);
        return c(this, null, ((Boolean) pair.getFirst()).booleanValue(), (Text) pair.getSecond(), null, false, 32743);
    }

    @Override // defpackage.rqj0
    public final mq01 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqj0)) {
            return false;
        }
        vqj0 vqj0Var = (vqj0) obj;
        return jl40.l(this.a, vqj0Var.a) && jl40.l(this.b, vqj0Var.b) && this.c.equals(vqj0Var.c) && this.d == vqj0Var.d && jl40.l(this.e, vqj0Var.e) && this.f.equals(vqj0Var.f) && jl40.l(this.g, vqj0Var.g) && jl40.l(this.h, vqj0Var.h) && this.i == vqj0Var.i && this.j.equals(vqj0Var.j) && this.k.equals(vqj0Var.k) && this.l == vqj0Var.l && this.m == vqj0Var.m && this.n == vqj0Var.n && this.o == vqj0Var.o;
    }

    public final int hashCode() {
        int e = unr0.e(unr0.b(n.c(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
        Text text = this.e;
        int hashCode = (this.f.hashCode() + ((e + (text == null ? 0 : text.hashCode())) * 31)) * 31;
        Text text2 = this.g;
        int hashCode2 = (hashCode + (text2 == null ? 0 : text2.hashCode())) * 31;
        h9s h9sVar = this.h;
        return Integer.hashCode(this.o) + oyr.b(this.n, oyr.b(this.m, oyr.b(this.l, unr0.c(unr0.c(unr0.e((hashCode2 + (h9sVar != null ? h9sVar.hashCode() : 0)) * 31, 31, this.i), 31, this.j), 31, this.k), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequisiteInputFieldItem(formItemType=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", input=");
        tse0.y(this.c, ", hasError=", ", errorText=", sb, this.d);
        sb.append(this.e);
        sb.append(", inputType=");
        sb.append(this.f);
        sb.append(", hint=");
        sb.append(this.g);
        sb.append(", formatter=");
        sb.append(this.h);
        sb.append(", focused=");
        sb.append(this.i);
        sb.append(", inputValidators=");
        sb.append(this.j);
        sb.append(", onFocusChangedValidators=");
        sb.append(this.k);
        sb.append(", maxLength=");
        sb.append(this.l);
        sb.append(", minHeight=");
        vfc.u(this.m, this.n, ", position=", ", topPaddingPx=", sb);
        return oyr.m(this.o, Extension.C_BRAKE, sb);
    }
}
