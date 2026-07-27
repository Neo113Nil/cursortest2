package C3;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.AbstractC3473kQ;
import com.google.android.gms.internal.ads.AbstractC3548lu;
import com.google.android.gms.internal.ads.AbstractC3832r8;
import com.google.android.gms.internal.ads.BinderC2949aq;
import com.google.android.gms.internal.ads.C2478Aq;
import com.google.android.gms.internal.ads.C2575Gl;
import com.google.android.gms.internal.ads.C2611In;
import com.google.android.gms.internal.ads.C2628Jn;
import com.google.android.gms.internal.ads.C2745Ql;
import com.google.android.gms.internal.ads.C2752Rb;
import com.google.android.gms.internal.ads.C3002bo;
import com.google.android.gms.internal.ads.C3153ec;
import com.google.android.gms.internal.ads.C3165eo;
import com.google.android.gms.internal.ads.C3226fu;
import com.google.android.gms.internal.ads.C3235g2;
import com.google.android.gms.internal.ads.C3320hg;
import com.google.android.gms.internal.ads.C3365iO;
import com.google.android.gms.internal.ads.C3686oN;
import com.google.android.gms.internal.ads.C3709ot;
import com.google.android.gms.internal.ads.C3752pi;
import com.google.android.gms.internal.ads.C4064vO;
import com.google.android.gms.internal.ads.C4118wO;
import com.google.android.gms.internal.ads.C4172xO;
import com.google.android.gms.internal.ads.C4174xQ;
import com.google.android.gms.internal.ads.C4226yO;
import com.google.android.gms.internal.ads.C4245yq;
import com.google.android.gms.internal.ads.C4290zh;
import com.google.android.gms.internal.ads.C4293zk;
import com.google.android.gms.internal.ads.CQ;
import com.google.android.gms.internal.ads.DQ;
import com.google.android.gms.internal.ads.EO;
import com.google.android.gms.internal.ads.InterfaceC2779Sl;
import com.google.android.gms.internal.ads.InterfaceC3858rh;
import com.google.android.gms.internal.ads.InterfaceC4147x;
import com.google.android.gms.internal.ads.MP;
import com.google.android.gms.internal.ads.NP;
import com.google.android.gms.internal.ads.OO;
import com.google.android.gms.internal.ads.PA;
import com.google.android.gms.internal.ads.Ut;
import com.google.android.gms.internal.ads.VO;
import com.google.android.gms.internal.ads.XQ;
import com.google.android.gms.internal.ads.Yt;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import t2.C;
import t2.G;
import u2.C5107a;

/* loaded from: classes2.dex */
public final class m implements InterfaceC2779Sl {

    /* renamed from: A, reason: collision with root package name */
    public final Object f444A;

    /* renamed from: B, reason: collision with root package name */
    public final Object f445B;

    /* renamed from: C, reason: collision with root package name */
    public final Object f446C;

    /* renamed from: D, reason: collision with root package name */
    public final Object f447D;

    /* renamed from: E, reason: collision with root package name */
    public Object f448E;

    /* renamed from: n, reason: collision with root package name */
    public boolean f449n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f450u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f451v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f452w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f453x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f454y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f455z;

    public m(Context context, C2628Jn c2628Jn, C3226fu c3226fu, C5107a c5107a, Ut ut, C3320hg c3320hg, InterfaceC3858rh interfaceC3858rh, C3153ec c3153ec, boolean z8, BinderC2949aq binderC2949aq, C3002bo c3002bo, C3165eo c3165eo) {
        this.f450u = context;
        this.f451v = c2628Jn;
        this.f452w = c3226fu;
        this.f453x = c5107a;
        this.f454y = ut;
        this.f455z = c3320hg;
        this.f444A = interfaceC3858rh;
        this.f445B = c3153ec;
        this.f449n = z8;
        this.f446C = binderC2949aq;
        this.f447D = c3002bo;
        this.f448E = c3165eo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v6 */
    public void a(k kVar, float f6, RectF rectF, I0.j jVar, Path path) {
        Matrix[] matrixArr;
        Matrix[] matrixArr2;
        u[] uVarArr;
        int i;
        boolean z8;
        float[] fArr;
        float f9;
        boolean z9;
        int i4;
        m mVar = this;
        path.rewind();
        Path path2 = (Path) mVar.f454y;
        path2.rewind();
        Path path3 = (Path) mVar.f455z;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i9 = 0;
        while (true) {
            matrixArr = (Matrix[]) mVar.f452w;
            matrixArr2 = (Matrix[]) mVar.f451v;
            uVarArr = (u[]) mVar.f450u;
            i = 4;
            z8 = 0;
            fArr = (float[]) mVar.f447D;
            if (i9 >= 4) {
                break;
            }
            c cVar = i9 != 1 ? i9 != 2 ? i9 != 3 ? kVar.f437f : kVar.f436e : kVar.f439h : kVar.f438g;
            U2.a aVar = i9 != 1 ? i9 != 2 ? i9 != 3 ? kVar.f433b : kVar.f432a : kVar.f435d : kVar.f434c;
            u uVar = uVarArr[i9];
            aVar.getClass();
            aVar.h(uVar, f6, cVar.a(rectF));
            int i10 = i9 + 1;
            float f10 = (i10 % 4) * 90;
            matrixArr2[i9].reset();
            PointF pointF = (PointF) mVar.f453x;
            if (i9 == 1) {
                i4 = i9;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i9 == 2) {
                i4 = i9;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i9 != 3) {
                i4 = i9;
                pointF.set(rectF.right, rectF.top);
            } else {
                i4 = i9;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i4].setTranslate(pointF.x, pointF.y);
            matrixArr2[i4].preRotate(f10);
            u uVar2 = uVarArr[i4];
            fArr[0] = uVar2.f475b;
            fArr[1] = uVar2.f476c;
            matrixArr2[i4].mapPoints(fArr);
            matrixArr[i4].reset();
            matrixArr[i4].setTranslate(fArr[0], fArr[1]);
            matrixArr[i4].preRotate(f10);
            i9 = i10;
        }
        int i11 = 0;
        while (i11 < i) {
            u uVar3 = uVarArr[i11];
            uVar3.getClass();
            fArr[z8] = 0.0f;
            fArr[1] = uVar3.f474a;
            matrixArr2[i11].mapPoints(fArr);
            if (i11 == 0) {
                path.moveTo(fArr[z8], fArr[1]);
            } else {
                path.lineTo(fArr[z8], fArr[1]);
            }
            uVarArr[i11].b(matrixArr2[i11], path);
            if (jVar != null) {
                u uVar4 = uVarArr[i11];
                Matrix matrix = matrixArr2[i11];
                g gVar = (g) jVar.f1233u;
                BitSet bitSet = gVar.f416w;
                uVar4.getClass();
                f9 = 0.0f;
                bitSet.set(i11, z8);
                uVar4.a(uVar4.f478e);
                gVar.f414u[i11] = new n(new ArrayList((ArrayList) uVar4.f480g), new Matrix(matrix));
            } else {
                f9 = 0.0f;
            }
            int i12 = i11 + 1;
            int i13 = i12 % 4;
            u uVar5 = uVarArr[i11];
            fArr[0] = uVar5.f475b;
            fArr[1] = uVar5.f476c;
            matrixArr2[i11].mapPoints(fArr);
            u uVar6 = uVarArr[i13];
            uVar6.getClass();
            float[] fArr2 = (float[]) mVar.f448E;
            fArr2[0] = f9;
            fArr2[1] = uVar6.f474a;
            matrixArr2[i13].mapPoints(fArr2);
            Matrix[] matrixArr3 = matrixArr2;
            u[] uVarArr2 = uVarArr;
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, f9);
            u uVar7 = uVarArr2[i11];
            fArr[0] = uVar7.f475b;
            fArr[1] = uVar7.f476c;
            matrixArr3[i11].mapPoints(fArr);
            if (i11 == 1 || i11 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            u uVar8 = (u) mVar.f446C;
            uVar8.d(0.0f, 270.0f, 0.0f);
            (i11 != 1 ? i11 != 2 ? i11 != 3 ? kVar.f440j : kVar.i : kVar.f442l : kVar.f441k).getClass();
            uVar8.c(max, 0.0f);
            Path path4 = (Path) mVar.f444A;
            path4.reset();
            uVar8.b(matrixArr[i11], path4);
            if (mVar.f449n && (mVar.b(path4, i11) || mVar.b(path4, i13))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = uVar8.f474a;
                matrixArr[i11].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                uVar8.b(matrixArr[i11], path2);
            } else {
                uVar8.b(matrixArr[i11], path);
            }
            if (jVar != null) {
                Matrix matrix2 = matrixArr[i11];
                g gVar2 = (g) jVar.f1233u;
                z9 = false;
                gVar2.f416w.set(i11 + 4, false);
                uVar8.a(uVar8.f478e);
                gVar2.f415v[i11] = new n(new ArrayList((ArrayList) uVar8.f480g), new Matrix(matrix2));
            } else {
                z9 = false;
            }
            z8 = z9;
            i11 = i12;
            uVarArr = uVarArr2;
            matrixArr2 = matrixArr3;
            i = 4;
            mVar = this;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public boolean b(Path path, int i) {
        Path path2 = (Path) this.f445B;
        path2.reset();
        ((u[]) this.f450u)[i].b(((Matrix[]) this.f451v)[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    public AbstractC3832r8 c(int i, int i4, List list) {
        ArrayList arrayList = (ArrayList) this.f452w;
        PA.n(i >= 0 && i <= i4 && i4 <= arrayList.size());
        PA.n(list.size() == i4 - i);
        for (int i9 = i; i9 < i4; i9++) {
            ((C4172xO) arrayList.get(i9)).f35144a.a((C3235g2) list.get(i9 - i));
        }
        return g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2779Sl
    public Ut d() {
        return (Ut) this.f454y;
    }

    public boolean e() {
        return this.f449n;
    }

    public void f() {
        PA.T(!this.f449n);
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f452w;
            if (i >= arrayList.size()) {
                this.f449n = true;
                return;
            }
            C4172xO c4172xO = (C4172xO) arrayList.get(i);
            o(c4172xO);
            ((HashSet) this.f445B).add(c4172xO);
            i++;
        }
    }

    public AbstractC3832r8 g() {
        ArrayList arrayList = (ArrayList) this.f452w;
        if (arrayList.isEmpty()) {
            return AbstractC3832r8.f33969a;
        }
        int i = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            C4172xO c4172xO = (C4172xO) arrayList.get(i4);
            c4172xO.f35147d = i;
            i += c4172xO.f35144a.f35178o.f34040b.a();
        }
        return new EO(arrayList, (XQ) this.f448E);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2779Sl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(boolean z8, Context context, C4293zk c4293zk) {
        boolean z9;
        float f6;
        boolean z10;
        int i = 1;
        C3752pi c3752pi = (C3752pi) C3686oN.I((C3320hg) this.f455z);
        try {
            InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) this.f444A;
            boolean U02 = interfaceC3858rh.U0();
            boolean z11 = this.f449n;
            C3226fu c3226fu = (C3226fu) this.f452w;
            Ut ut = (Ut) this.f454y;
            C3153ec c3153ec = (C3153ec) this.f445B;
            if (U02) {
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31799u1)).booleanValue()) {
                    interfaceC3858rh = ((C2628Jn) this.f451v).a(c3226fu.f30903f, null, null);
                    interfaceC3858rh.N0("/reward", new C2752Rb(5, (C2575Gl) c3752pi.f33453S0.d()));
                    ((C2611In) c3752pi.f33455T0.d()).a(interfaceC3858rh, true, z11 ? c3153ec : null, (C3002bo) this.f447D);
                    interfaceC3858rh.j0().f25412z = new C2478Aq(i, interfaceC3858rh);
                    interfaceC3858rh.j0().f25381A = new C4245yq(interfaceC3858rh);
                    Yt yt = ut.f28173s;
                    interfaceC3858rh.z0(yt.f28907b, yt.f28906a);
                }
            }
            InterfaceC3858rh interfaceC3858rh2 = interfaceC3858rh;
            interfaceC3858rh2.d1(true);
            boolean z12 = false;
            boolean a9 = z11 ? c3153ec.a(false) : false;
            G g9 = p2.j.f39798C.f39803c;
            boolean i4 = G.i((Context) this.f450u);
            if (z11) {
                synchronized (c3153ec) {
                    z10 = c3153ec.f30442b;
                }
                if (!z10) {
                    z9 = false;
                    z12 = true;
                    if (z12) {
                        f6 = 0.0f;
                    } else {
                        synchronized (c3153ec) {
                            f6 = c3153ec.f30443c;
                        }
                    }
                    p2.f fVar = new p2.f(a9, i4, z9, f6, z8, ut.f28128O, ut.f28129P);
                    if (c4293zk != null) {
                        c4293zk.v1();
                    }
                    C2745Ql c2745Ql = (C2745Ql) c3752pi.f33451R0.d();
                    Yt yt2 = ut.f28173s;
                    BinderC2949aq binderC2949aq = null;
                    String str = yt2.f28907b;
                    if (ut.b()) {
                        binderC2949aq = (BinderC2949aq) this.f446C;
                    }
                    L2.i.y(context, new AdOverlayInfoParcel(c2745Ql, interfaceC3858rh2, ut.f28130Q, (C5107a) this.f453x, ut.f28109B, fVar, str, yt2.f28906a, c3226fu.f30904g, c4293zk, binderC2949aq, interfaceC3858rh2.p()), true, (C3165eo) this.f448E);
                }
                z12 = true;
            }
            z9 = z12;
            if (z12) {
            }
            p2.f fVar2 = new p2.f(a9, i4, z9, f6, z8, ut.f28128O, ut.f28129P);
            if (c4293zk != null) {
            }
            C2745Ql c2745Ql2 = (C2745Ql) c3752pi.f33451R0.d();
            Yt yt22 = ut.f28173s;
            BinderC2949aq binderC2949aq2 = null;
            String str2 = yt22.f28907b;
            if (ut.b()) {
            }
            L2.i.y(context, new AdOverlayInfoParcel(c2745Ql2, interfaceC3858rh2, ut.f28130Q, (C5107a) this.f453x, ut.f28109B, fVar2, str2, yt22.f28906a, c3226fu.f30904g, c4293zk, binderC2949aq2, interfaceC3858rh2.p()), true, (C3165eo) this.f448E);
        } catch (C4290zh e6) {
            int i9 = C.f40822b;
            u2.i.d("", e6);
        }
    }

    public AbstractC3832r8 i(List list, XQ xq) {
        ArrayList arrayList = (ArrayList) this.f452w;
        n(0, arrayList.size());
        return j(arrayList.size(), list, xq);
    }

    public AbstractC3832r8 j(int i, List list, XQ xq) {
        if (!list.isEmpty()) {
            this.f448E = xq;
            for (int i4 = i; i4 < list.size() + i; i4++) {
                C4172xO c4172xO = (C4172xO) list.get(i4 - i);
                ArrayList arrayList = (ArrayList) this.f452w;
                if (i4 > 0) {
                    C4172xO c4172xO2 = (C4172xO) arrayList.get(i4 - 1);
                    c4172xO.f35147d = c4172xO2.f35144a.f35178o.f34040b.a() + c4172xO2.f35147d;
                    c4172xO.f35148e = false;
                    c4172xO.f35146c.clear();
                } else {
                    c4172xO.f35147d = 0;
                    c4172xO.f35148e = false;
                    c4172xO.f35146c.clear();
                }
                int a9 = c4172xO.f35144a.f35178o.f34040b.a();
                for (int i9 = i4; i9 < arrayList.size(); i9++) {
                    ((C4172xO) arrayList.get(i9)).f35147d += a9;
                }
                arrayList.add(i4, c4172xO);
                ((HashMap) this.f454y).put(c4172xO.f35145b, c4172xO);
                if (this.f449n) {
                    o(c4172xO);
                    if (((IdentityHashMap) this.f453x).isEmpty()) {
                        ((HashSet) this.f445B).add(c4172xO);
                    } else {
                        C4118wO c4118wO = (C4118wO) ((HashMap) this.f444A).get(c4172xO);
                        if (c4118wO != null) {
                            c4118wO.f34978a.p(c4118wO.f34979b);
                        }
                    }
                }
            }
        }
        return g();
    }

    public AbstractC3832r8 k(int i, int i4, XQ xq) {
        boolean z8 = false;
        if (i >= 0 && i <= i4 && i4 <= ((ArrayList) this.f452w).size()) {
            z8 = true;
        }
        PA.n(z8);
        this.f448E = xq;
        n(i, i4);
        return g();
    }

    public AbstractC3832r8 l(XQ xq) {
        int size = ((ArrayList) this.f452w).size();
        if (xq.f28650b.length != size) {
            xq = new XQ(new Random(xq.f28649a.nextLong())).a(size);
        }
        this.f448E = xq;
        return g();
    }

    public void m() {
        Iterator it = ((HashSet) this.f445B).iterator();
        while (it.hasNext()) {
            C4172xO c4172xO = (C4172xO) it.next();
            if (c4172xO.f35146c.isEmpty()) {
                C4118wO c4118wO = (C4118wO) ((HashMap) this.f444A).get(c4172xO);
                if (c4118wO != null) {
                    c4118wO.f34978a.p(c4118wO.f34979b);
                }
                it.remove();
            }
        }
    }

    public void n(int i, int i4) {
        while (true) {
            i4--;
            if (i4 < i) {
                return;
            }
            ArrayList arrayList = (ArrayList) this.f452w;
            C4172xO c4172xO = (C4172xO) arrayList.remove(i4);
            ((HashMap) this.f454y).remove(c4172xO.f35145b);
            int i9 = -c4172xO.f35144a.f35178o.f34040b.a();
            for (int i10 = i4; i10 < arrayList.size(); i10++) {
                ((C4172xO) arrayList.get(i10)).f35147d += i9;
            }
            c4172xO.f35148e = true;
            if (this.f449n) {
                p(c4172xO);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.CQ, com.google.android.gms.internal.ads.yO] */
    public void o(C4172xO c4172xO) {
        C4174xQ c4174xQ = c4172xO.f35144a;
        ?? r12 = new CQ() { // from class: com.google.android.gms.internal.ads.yO
            @Override // com.google.android.gms.internal.ads.CQ
            public final void a(AbstractC3473kQ abstractC3473kQ, AbstractC3832r8 abstractC3832r8) {
                C3709ot c3709ot = ((C3365iO) C3.m.this.f455z).f31382z;
                c3709ot.d(2);
                c3709ot.c(22);
            }
        };
        C4064vO c4064vO = new C4064vO(this, c4172xO);
        ((HashMap) this.f444A).put(c4172xO, new C4118wO(c4174xQ, r12, c4064vO));
        String str = AbstractC3548lu.f32613a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        NP np = c4174xQ.f32301c;
        np.getClass();
        np.f26544b.add(new DQ(handler, c4064vO));
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        new Handler(myLooper2, null);
        NP np2 = c4174xQ.f32302d;
        np2.getClass();
        np2.f26544b.add(new MP(c4064vO));
        c4174xQ.n(r12, (VO) this.f450u, (InterfaceC4147x) this.f451v);
    }

    public void p(C4172xO c4172xO) {
        if (c4172xO.f35148e && c4172xO.f35146c.isEmpty()) {
            C4118wO c4118wO = (C4118wO) ((HashMap) this.f444A).remove(c4172xO);
            c4118wO.getClass();
            C4226yO c4226yO = c4118wO.f34979b;
            AbstractC3473kQ abstractC3473kQ = c4118wO.f34978a;
            abstractC3473kQ.q(c4226yO);
            C4064vO c4064vO = c4118wO.f34980c;
            abstractC3473kQ.l(c4064vO);
            abstractC3473kQ.m(c4064vO);
            ((HashSet) this.f445B).remove(c4172xO);
        }
    }

    public m(C3365iO c3365iO, OO oo, C3709ot c3709ot, VO vo, InterfaceC4147x interfaceC4147x) {
        this.f450u = vo;
        this.f451v = interfaceC4147x;
        this.f455z = c3365iO;
        this.f448E = new XQ();
        this.f453x = new IdentityHashMap();
        this.f454y = new HashMap();
        this.f452w = new ArrayList();
        this.f446C = oo;
        this.f447D = c3709ot;
        this.f444A = new HashMap();
        this.f445B = new HashSet();
    }

    public m() {
        this.f450u = new u[4];
        this.f451v = new Matrix[4];
        this.f452w = new Matrix[4];
        this.f453x = new PointF();
        this.f454y = new Path();
        this.f455z = new Path();
        this.f446C = new u();
        this.f447D = new float[2];
        this.f448E = new float[2];
        this.f444A = new Path();
        this.f445B = new Path();
        this.f449n = true;
        for (int i = 0; i < 4; i++) {
            ((u[]) this.f450u)[i] = new u();
            ((Matrix[]) this.f451v)[i] = new Matrix();
            ((Matrix[]) this.f452w)[i] = new Matrix();
        }
    }
}
