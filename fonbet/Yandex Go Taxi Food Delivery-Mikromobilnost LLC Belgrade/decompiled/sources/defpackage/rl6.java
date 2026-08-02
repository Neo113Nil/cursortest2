package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lrl6;", "", "Companion", "pl6", "ql6", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class rl6 {
    public static final ql6 Companion = new ql6();
    public static final i3y[] p;
    public final List a;
    public final List b;
    public final Integer c;
    public final Boolean d;
    public final String e;
    public final String f;
    public final Integer g;
    public final Integer h;
    public final Boolean i;
    public final Float[] j;
    public final dxu0 k;
    public final dxu0 l;
    public final String m;
    public final mn6 n;
    public final boolean o;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        p = new i3y[]{a.b(lazyThreadSafetyMode, new av5(26)), a.b(lazyThreadSafetyMode, new av5(27)), null, null, null, null, null, null, null, a.b(lazyThreadSafetyMode, new av5(28)), null, null, null, null, null};
    }

    public /* synthetic */ rl6(int i, List list, List list2, Integer num, Boolean bool, String str, String str2, Integer num2, Integer num3, Boolean bool2, Float[] fArr, dxu0 dxu0Var, dxu0 dxu0Var2, String str3, mn6 mn6Var, boolean z) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num3;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = bool2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = fArr;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = dxu0Var;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = dxu0Var2;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str3;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = mn6Var;
        }
        this.o = (i & 16384) == 0 ? false : z;
    }

    public static final /* synthetic */ void l(rl6 rl6Var, yjd yjdVar, SerialDescriptor serialDescriptor) {
        boolean F = yjdVar.F();
        i3y[] i3yVarArr = p;
        if (F || rl6Var.a != null) {
            yjdVar.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), rl6Var.a);
        }
        if (yjdVar.F() || rl6Var.b != null) {
            yjdVar.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), rl6Var.b);
        }
        if (yjdVar.F() || rl6Var.c != null) {
            yjdVar.g(serialDescriptor, 2, h6w.a, rl6Var.c);
        }
        if (yjdVar.F() || rl6Var.d != null) {
            yjdVar.g(serialDescriptor, 3, z96.a, rl6Var.d);
        }
        if (yjdVar.F() || rl6Var.e != null) {
            yjdVar.g(serialDescriptor, 4, auu0.a, rl6Var.e);
        }
        if (yjdVar.F() || rl6Var.f != null) {
            yjdVar.g(serialDescriptor, 5, auu0.a, rl6Var.f);
        }
        if (yjdVar.F() || rl6Var.g != null) {
            yjdVar.g(serialDescriptor, 6, h6w.a, rl6Var.g);
        }
        if (yjdVar.F() || rl6Var.h != null) {
            yjdVar.g(serialDescriptor, 7, h6w.a, rl6Var.h);
        }
        if (yjdVar.F() || rl6Var.i != null) {
            yjdVar.g(serialDescriptor, 8, z96.a, rl6Var.i);
        }
        if (yjdVar.F() || rl6Var.j != null) {
            yjdVar.g(serialDescriptor, 9, (KSerializer) i3yVarArr[9].getValue(), rl6Var.j);
        }
        if (yjdVar.F() || rl6Var.k != null) {
            yjdVar.g(serialDescriptor, 10, ywu0.a, rl6Var.k);
        }
        if (yjdVar.F() || rl6Var.l != null) {
            yjdVar.g(serialDescriptor, 11, ywu0.a, rl6Var.l);
        }
        if (yjdVar.F() || rl6Var.m != null) {
            yjdVar.g(serialDescriptor, 12, auu0.a, rl6Var.m);
        }
        if (yjdVar.F() || rl6Var.n != null) {
            yjdVar.g(serialDescriptor, 13, kn6.a, rl6Var.n);
        }
        if (yjdVar.F() || rl6Var.o) {
            yjdVar.n(serialDescriptor, 14, rl6Var.o);
        }
    }

    /* renamed from: b, reason: from getter */
    public final List getA() {
        return this.a;
    }

    /* renamed from: c, reason: from getter */
    public final String getE() {
        return this.e;
    }

    /* renamed from: d, reason: from getter */
    public final Integer getG() {
        return this.g;
    }

    /* renamed from: e, reason: from getter */
    public final Integer getH() {
        return this.h;
    }

    /* renamed from: f, reason: from getter */
    public final List getB() {
        return this.b;
    }

    /* renamed from: g, reason: from getter */
    public final dxu0 getL() {
        return this.l;
    }

    /* renamed from: h, reason: from getter */
    public final dxu0 getK() {
        return this.k;
    }

    /* renamed from: i, reason: from getter */
    public final boolean getO() {
        return this.o;
    }

    /* renamed from: j, reason: from getter */
    public final Float[] getJ() {
        return this.j;
    }

    /* renamed from: k, reason: from getter */
    public final Boolean getD() {
        return this.d;
    }

    public rl6() {
        this(null, null, null, 32767);
    }

    public rl6(List list, String str, dxu0 dxu0Var, int i) {
        Boolean bool = Boolean.TRUE;
        list = (i & 1) != 0 ? null : list;
        str = (i & 16) != 0 ? null : str;
        bool = (i & 256) != 0 ? null : bool;
        dxu0Var = (i & 1024) != 0 ? null : dxu0Var;
        this.a = list;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = str;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = bool;
        this.j = null;
        this.k = dxu0Var;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = false;
    }
}
