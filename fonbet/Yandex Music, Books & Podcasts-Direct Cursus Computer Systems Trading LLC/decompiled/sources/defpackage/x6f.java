package defpackage;

import com.connectsdk.service.airplay.PListParser;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public class x6f implements b5f, l6b, wq5 {
    public final ArrayList a;
    public final x3f b;
    public final Function1 c;
    public final j4f d;
    public String e;
    public String f;
    public final /* synthetic */ int g;
    public Object h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x6f(x3f x3fVar, Function1 function1, int i) {
        this(x3fVar, function1, (char) 0);
        this.g = i;
        x3fVar.getClass();
        function1.getClass();
        switch (i) {
            case 1:
                this(x3fVar, function1, (char) 0);
                this.h = new LinkedHashMap();
                break;
            case 2:
                this(x3fVar, function1, (char) 0);
                this.h = new ArrayList();
                break;
            default:
                this.a.add("primitive");
                break;
        }
    }

    @Override // defpackage.wq5
    public final void A(int i, int i2, mhp mhpVar) {
        mhpVar.getClass();
        N(x4f.b(Integer.valueOf(i2)), L(mhpVar, i));
    }

    @Override // defpackage.wq5
    public final void B(asm asmVar, int i, char c) {
        asmVar.getClass();
        N(x4f.c(String.valueOf(c)), L(asmVar, i));
    }

    @Override // defpackage.l6b
    public final void C(int i) {
        String str = (String) M();
        str.getClass();
        N(x4f.b(Integer.valueOf(i)), str);
    }

    @Override // defpackage.b5f
    public final void D(w4f w4fVar) {
        w4fVar.getClass();
        if (this.e == null || (w4fVar instanceof q5f)) {
            v(z4f.a, w4fVar);
        } else {
            wxf.L(w4fVar, this.f);
            throw null;
        }
    }

    @Override // defpackage.l6b
    public final void E(String str) {
        str.getClass();
        String str2 = (String) M();
        str2.getClass();
        N(x4f.c(str), str2);
    }

    @Override // defpackage.wq5
    public final void F(mhp mhpVar, int i, float f) {
        mhpVar.getClass();
        I(L(mhpVar, i), f);
    }

    public final void G(mhp mhpVar, int i, t9f t9fVar, Object obj) {
        mhpVar.getClass();
        t9fVar.getClass();
        this.a.add(L(mhpVar, i));
        if (t9fVar.getDescriptor().c()) {
            v(t9fVar, obj);
        } else if (obj == null) {
            u();
        } else {
            v(t9fVar, obj);
        }
    }

    public final void H(Object obj, double d) {
        String str = (String) obj;
        str.getClass();
        N(x4f.b(Double.valueOf(d)), str);
        this.d.getClass();
        if (Math.abs(d) <= Double.MAX_VALUE) {
            return;
        }
        Double valueOf = Double.valueOf(d);
        String obj2 = K().toString();
        obj2.getClass();
        throw new c5f(ghh.U(valueOf, str, obj2));
    }

    public final void I(Object obj, float f) {
        String str = (String) obj;
        str.getClass();
        N(x4f.b(Float.valueOf(f)), str);
        this.d.getClass();
        if (Math.abs(f) <= Float.MAX_VALUE) {
            return;
        }
        Float valueOf = Float.valueOf(f);
        String obj2 = K().toString();
        obj2.getClass();
        throw new c5f(ghh.U(valueOf, str, obj2));
    }

    public final l6b J(Object obj, mhp mhpVar) {
        String str = (String) obj;
        str.getClass();
        mhpVar.getClass();
        if (yjr.a(mhpVar)) {
            return new a7(this, str);
        }
        if (mhpVar.isInline() && mhpVar.equals(x4f.a)) {
            return new a7(this, str, mhpVar);
        }
        this.a.add(str);
        return this;
    }

    public w4f K() {
        switch (this.g) {
            case 0:
                w4f w4fVar = (w4f) this.h;
                if (w4fVar != null) {
                    return w4fVar;
                }
                xq0.x("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
                return null;
            case 1:
                return new q5f((LinkedHashMap) this.h);
            default:
                return new c4f((ArrayList) this.h);
        }
    }

    public final String L(mhp mhpVar, int i) {
        String valueOf;
        mhpVar.getClass();
        int i2 = this.g;
        mhpVar.getClass();
        switch (i2) {
            case 2:
                valueOf = String.valueOf(i);
                break;
            default:
                x3f x3fVar = this.b;
                x3fVar.getClass();
                c3x.O(x3fVar, mhpVar);
                valueOf = mhpVar.f(i);
                break;
        }
        valueOf.getClass();
        return valueOf;
    }

    public final Object M() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            throw new zhp("No tag in stack for requested element");
        }
        return arrayList.remove(u75.g(arrayList));
    }

    public void N(w4f w4fVar, String str) {
        int i = this.g;
        str.getClass();
        w4fVar.getClass();
        switch (i) {
            case 0:
                if (str != "primitive") {
                    xq0.x("This output can only consume primitives with 'primitive' tag");
                    break;
                } else if (((w4f) this.h) != null) {
                    xq0.x("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
                    break;
                } else {
                    this.h = w4fVar;
                    this.c.invoke(w4fVar);
                    break;
                }
            case 1:
                ((LinkedHashMap) this.h).put(str, w4fVar);
                break;
            default:
                ((ArrayList) this.h).add(Integer.parseInt(str), w4fVar);
                break;
        }
    }

    @Override // defpackage.l6b
    public final uhp a() {
        return this.b.b;
    }

    @Override // defpackage.wq5
    public final void b(mhp mhpVar) {
        mhpVar.getClass();
        if (!this.a.isEmpty()) {
            M();
        }
        this.c.invoke(K());
    }

    @Override // defpackage.l6b
    public final wq5 c(mhp mhpVar) {
        x6f x6fVar;
        mhpVar.getClass();
        Function1 v5Var = CollectionsKt.Z(this.a) == null ? this.c : new v5(1, this);
        ivf a = mhpVar.a();
        boolean d = Intrinsics.d(a, emr.c);
        x3f x3fVar = this.b;
        if (d || (a instanceof igm)) {
            x6fVar = new x6f(x3fVar, v5Var, 2);
        } else if (Intrinsics.d(a, emr.d)) {
            mhp O = szf.O(mhpVar.h(0), x3fVar.b);
            ivf a2 = O.a();
            if ((a2 instanceof csm) || Intrinsics.d(a2, thp.b)) {
                v5Var.getClass();
                i7f i7fVar = new i7f(x3fVar, v5Var, 1);
                i7fVar.j = true;
                x6fVar = i7fVar;
            } else {
                if (!x3fVar.a.d) {
                    throw ghh.h(O);
                }
                x6fVar = new x6f(x3fVar, v5Var, 2);
            }
        } else {
            x6fVar = new x6f(x3fVar, v5Var, 1);
        }
        String str = this.e;
        if (str != null) {
            if (x6fVar instanceof i7f) {
                i7f i7fVar2 = (i7f) x6fVar;
                i7fVar2.N(x4f.c(str), PListParser.TAG_KEY);
                String str2 = this.f;
                if (str2 == null) {
                    str2 = mhpVar.i();
                }
                i7fVar2.N(x4f.c(str2), Constants.KEY_VALUE);
            } else {
                String str3 = this.f;
                if (str3 == null) {
                    str3 = mhpVar.i();
                }
                x6fVar.N(x4f.c(str3), str);
            }
            this.e = null;
            this.f = null;
        }
        return x6fVar;
    }

    @Override // defpackage.b5f
    public final x3f d() {
        return this.b;
    }

    @Override // defpackage.wq5
    public final boolean e(mhp mhpVar) {
        mhpVar.getClass();
        return this.d.a;
    }

    @Override // defpackage.l6b
    public final void f(double d) {
        H(M(), d);
    }

    @Override // defpackage.wq5
    public final void g(mhp mhpVar, int i, long j) {
        mhpVar.getClass();
        N(x4f.b(Long.valueOf(j)), L(mhpVar, i));
    }

    @Override // defpackage.l6b
    public final void h(byte b) {
        String str = (String) M();
        str.getClass();
        N(x4f.b(Byte.valueOf(b)), str);
    }

    @Override // defpackage.l6b
    public final l6b i(mhp mhpVar) {
        mhpVar.getClass();
        if (CollectionsKt.Z(this.a) == null) {
            return new x6f(this.b, this.c, 0).i(mhpVar);
        }
        if (this.e != null) {
            this.f = mhpVar.i();
        }
        return J(M(), mhpVar);
    }

    @Override // defpackage.wq5
    public final void j(mhp mhpVar, int i, boolean z) {
        mhpVar.getClass();
        N(x4f.a(Boolean.valueOf(z)), L(mhpVar, i));
    }

    @Override // defpackage.wq5
    public final void k(mhp mhpVar, int i, t9f t9fVar, Object obj) {
        mhpVar.getClass();
        t9fVar.getClass();
        this.a.add(L(mhpVar, i));
        v(t9fVar, obj);
    }

    @Override // defpackage.wq5
    public final void l(mhp mhpVar, int i, double d) {
        mhpVar.getClass();
        H(L(mhpVar, i), d);
    }

    @Override // defpackage.wq5
    public final void m(asm asmVar, int i, byte b) {
        asmVar.getClass();
        N(x4f.b(Byte.valueOf(b)), L(asmVar, i));
    }

    @Override // defpackage.l6b
    public final void n(mhp mhpVar, int i) {
        mhpVar.getClass();
        String str = (String) M();
        str.getClass();
        N(x4f.c(mhpVar.f(i)), str);
    }

    @Override // defpackage.wq5
    public final void o(asm asmVar, int i, short s) {
        asmVar.getClass();
        N(x4f.b(Short.valueOf(s)), L(asmVar, i));
    }

    @Override // defpackage.wq5
    public final void p(mhp mhpVar, int i, String str) {
        mhpVar.getClass();
        str.getClass();
        N(x4f.c(str), L(mhpVar, i));
    }

    @Override // defpackage.wq5
    public void q(mhp mhpVar, int i, t9f t9fVar, Object obj) {
        switch (this.g) {
            case 1:
                mhpVar.getClass();
                t9fVar.getClass();
                if (obj != null || this.d.e) {
                    G(mhpVar, i, t9fVar, obj);
                    break;
                }
                break;
            default:
                G(mhpVar, i, t9fVar, obj);
                break;
        }
    }

    @Override // defpackage.l6b
    public final void r(long j) {
        String str = (String) M();
        str.getClass();
        N(x4f.b(Long.valueOf(j)), str);
    }

    @Override // defpackage.wq5
    public final l6b s(asm asmVar, int i) {
        asmVar.getClass();
        return J(L(asmVar, i), asmVar.h(i));
    }

    @Override // defpackage.l6b
    public final wq5 t(mhp mhpVar, int i) {
        mhpVar.getClass();
        return c(mhpVar);
    }

    @Override // defpackage.l6b
    public final void u() {
        String str = (String) CollectionsKt.Z(this.a);
        if (str == null) {
            this.c.invoke(m5f.INSTANCE);
        } else {
            N(m5f.INSTANCE, str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r0 != defpackage.em4.a) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0067, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r0, defpackage.emr.e) == false) goto L29;
     */
    @Override // defpackage.l6b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(t9f t9fVar, Object obj) {
        String p;
        t9fVar.getClass();
        Object Z = CollectionsKt.Z(this.a);
        x3f x3fVar = this.b;
        if (Z == null) {
            mhp O = szf.O(t9fVar.getDescriptor(), x3fVar.b);
            if ((O.a() instanceof csm) || O.a() == thp.b) {
                new x6f(x3fVar, this.c, 0).v(t9fVar, obj);
                return;
            }
        }
        boolean z = t9fVar instanceof p8;
        em4 em4Var = x3fVar.a.k;
        if (!z) {
            int ordinal = em4Var.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    ivf a = t9fVar.getDescriptor().a();
                    if (!Intrinsics.d(a, emr.b)) {
                    }
                    p = wxf.p(x3fVar, t9fVar.getDescriptor());
                } else if (ordinal != 2) {
                    b6e.s();
                    return;
                }
            }
            p = null;
        }
        if (z) {
            p8 p8Var = (p8) t9fVar;
            if (obj == null) {
                tiu.g(p8Var.getDescriptor(), " should always be non-null. Please report issue to the kotlinx.serialization tracker.", "Value for serializer ");
                return;
            }
            t9f D = hyf.D(p8Var, this, obj);
            if (p != null) {
                wxf.j(t9fVar, D, p);
                wxf.o(D.getDescriptor().a());
            }
            t9fVar = D;
        }
        if (p != null) {
            String i = t9fVar.getDescriptor().i();
            this.e = p;
            this.f = i;
        }
        t9fVar.serialize(this, obj);
    }

    @Override // defpackage.l6b
    public final void w(short s) {
        String str = (String) M();
        str.getClass();
        N(x4f.b(Short.valueOf(s)), str);
    }

    @Override // defpackage.l6b
    public final void x(boolean z) {
        String str = (String) M();
        str.getClass();
        N(x4f.a(Boolean.valueOf(z)), str);
    }

    @Override // defpackage.l6b
    public final void y(float f) {
        I(M(), f);
    }

    @Override // defpackage.l6b
    public final void z(char c) {
        String str = (String) M();
        str.getClass();
        N(x4f.c(String.valueOf(c)), str);
    }

    public x6f(x3f x3fVar, Function1 function1, char c) {
        this.a = new ArrayList();
        this.b = x3fVar;
        this.c = function1;
        this.d = x3fVar.a;
    }
}
