package E3;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.AP;
import com.google.android.gms.internal.ads.AbstractC2772Sd;
import com.google.android.gms.internal.ads.AbstractC3159eu;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.AbstractC3604n8;
import com.google.android.gms.internal.ads.BO;
import com.google.android.gms.internal.ads.BinderC2880Yp;
import com.google.android.gms.internal.ads.C2473Ak;
import com.google.android.gms.internal.ads.C2521Dh;
import com.google.android.gms.internal.ads.C2595Hn;
import com.google.android.gms.internal.ads.C2610Il;
import com.google.android.gms.internal.ads.C2612In;
import com.google.android.gms.internal.ads.C2796Tl;
import com.google.android.gms.internal.ads.C2818Vb;
import com.google.android.gms.internal.ads.C2954b2;
import com.google.android.gms.internal.ads.C2993bo;
import com.google.android.gms.internal.ads.C3052cu;
import com.google.android.gms.internal.ads.C3153eo;
import com.google.android.gms.internal.ads.C3212ft;
import com.google.android.gms.internal.ads.C3352iO;
import com.google.android.gms.internal.ads.C3357ic;
import com.google.android.gms.internal.ads.C3404jO;
import com.google.android.gms.internal.ads.C3458kO;
import com.google.android.gms.internal.ads.C3460kQ;
import com.google.android.gms.internal.ads.C3467kg;
import com.google.android.gms.internal.ads.C3512lO;
import com.google.android.gms.internal.ads.C3784qQ;
import com.google.android.gms.internal.ads.C3835rO;
import com.google.android.gms.internal.ads.C3846ri;
import com.google.android.gms.internal.ads.C4070vq;
import com.google.android.gms.internal.ads.C4178xq;
import com.google.android.gms.internal.ads.C4268zP;
import com.google.android.gms.internal.ads.IO;
import com.google.android.gms.internal.ads.InterfaceC2844Wl;
import com.google.android.gms.internal.ads.InterfaceC3730pQ;
import com.google.android.gms.internal.ads.InterfaceC4061vh;
import com.google.android.gms.internal.ads.InterfaceC4188y;
import com.google.android.gms.internal.ads.KQ;
import com.google.android.gms.internal.ads.QC;
import com.google.android.gms.internal.ads.St;
import com.google.android.gms.internal.ads.VN;
import com.google.android.gms.internal.ads.Wt;
import com.google.android.gms.internal.ads.XP;
import g1.C4523c;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import p2.C4831f;
import p2.C4835j;
import u2.D;
import u2.z;
import v2.C5110a;

/* loaded from: classes2.dex */
public final class m implements InterfaceC2844Wl {

    /* renamed from: A, reason: collision with root package name */
    public final Object f797A;

    /* renamed from: B, reason: collision with root package name */
    public final Object f798B;

    /* renamed from: C, reason: collision with root package name */
    public final Object f799C;

    /* renamed from: D, reason: collision with root package name */
    public final Object f800D;

    /* renamed from: E, reason: collision with root package name */
    public Object f801E;

    /* renamed from: n, reason: collision with root package name */
    public boolean f802n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f803u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f804v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f805w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f806x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f807y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f808z;

    public m(Context context, C2612In c2612In, C3052cu c3052cu, C5110a c5110a, St st, C3467kg c3467kg, InterfaceC4061vh interfaceC4061vh, C3357ic c3357ic, boolean z3, BinderC2880Yp binderC2880Yp, C2993bo c2993bo, C3153eo c3153eo) {
        this.f803u = context;
        this.f804v = c2612In;
        this.f805w = c3052cu;
        this.f806x = c5110a;
        this.f807y = st;
        this.f808z = c3467kg;
        this.f797A = interfaceC4061vh;
        this.f798B = c3357ic;
        this.f802n = z3;
        this.f799C = binderC2880Yp;
        this.f800D = c2993bo;
        this.f801E = c3153eo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v6 */
    public void a(k kVar, float f3, RectF rectF, C4523c c4523c, Path path) {
        Matrix[] matrixArr;
        Matrix[] matrixArr2;
        u[] uVarArr;
        int i;
        boolean z3;
        float[] fArr;
        float f9;
        boolean z6;
        int i6;
        m mVar = this;
        path.rewind();
        Path path2 = (Path) mVar.f807y;
        path2.rewind();
        Path path3 = (Path) mVar.f808z;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i9 = 0;
        while (true) {
            matrixArr = (Matrix[]) mVar.f805w;
            matrixArr2 = (Matrix[]) mVar.f804v;
            uVarArr = (u[]) mVar.f803u;
            i = 4;
            z3 = 0;
            fArr = (float[]) mVar.f800D;
            if (i9 >= 4) {
                break;
            }
            c cVar = i9 != 1 ? i9 != 2 ? i9 != 3 ? kVar.f790f : kVar.f789e : kVar.f792h : kVar.f791g;
            A8.b bVar = i9 != 1 ? i9 != 2 ? i9 != 3 ? kVar.f786b : kVar.f785a : kVar.f788d : kVar.f787c;
            u uVar = uVarArr[i9];
            bVar.getClass();
            bVar.h(uVar, f3, cVar.a(rectF));
            int i10 = i9 + 1;
            float f10 = (i10 % 4) * 90;
            matrixArr2[i9].reset();
            PointF pointF = (PointF) mVar.f806x;
            if (i9 == 1) {
                i6 = i9;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i9 == 2) {
                i6 = i9;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i9 != 3) {
                i6 = i9;
                pointF.set(rectF.right, rectF.top);
            } else {
                i6 = i9;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i6].setTranslate(pointF.x, pointF.y);
            matrixArr2[i6].preRotate(f10);
            u uVar2 = uVarArr[i6];
            fArr[0] = uVar2.f828b;
            fArr[1] = uVar2.f829c;
            matrixArr2[i6].mapPoints(fArr);
            matrixArr[i6].reset();
            matrixArr[i6].setTranslate(fArr[0], fArr[1]);
            matrixArr[i6].preRotate(f10);
            i9 = i10;
        }
        int i11 = 0;
        while (i11 < i) {
            u uVar3 = uVarArr[i11];
            uVar3.getClass();
            fArr[z3] = 0.0f;
            fArr[1] = uVar3.f827a;
            matrixArr2[i11].mapPoints(fArr);
            if (i11 == 0) {
                path.moveTo(fArr[z3], fArr[1]);
            } else {
                path.lineTo(fArr[z3], fArr[1]);
            }
            uVarArr[i11].b(matrixArr2[i11], path);
            if (c4523c != null) {
                u uVar4 = uVarArr[i11];
                Matrix matrix = matrixArr2[i11];
                g gVar = (g) c4523c.f37627u;
                BitSet bitSet = gVar.f769w;
                uVar4.getClass();
                f9 = 0.0f;
                bitSet.set(i11, z3);
                uVar4.a(uVar4.f831e);
                gVar.f767u[i11] = new n(new ArrayList((ArrayList) uVar4.f833g), new Matrix(matrix));
            } else {
                f9 = 0.0f;
            }
            int i12 = i11 + 1;
            int i13 = i12 % 4;
            u uVar5 = uVarArr[i11];
            fArr[0] = uVar5.f828b;
            fArr[1] = uVar5.f829c;
            matrixArr2[i11].mapPoints(fArr);
            u uVar6 = uVarArr[i13];
            uVar6.getClass();
            float[] fArr2 = (float[]) mVar.f801E;
            fArr2[0] = f9;
            fArr2[1] = uVar6.f827a;
            matrixArr2[i13].mapPoints(fArr2);
            Matrix[] matrixArr3 = matrixArr2;
            u[] uVarArr2 = uVarArr;
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, f9);
            u uVar7 = uVarArr2[i11];
            fArr[0] = uVar7.f828b;
            fArr[1] = uVar7.f829c;
            matrixArr3[i11].mapPoints(fArr);
            if (i11 == 1 || i11 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            u uVar8 = (u) mVar.f799C;
            uVar8.d(0.0f, 270.0f, 0.0f);
            (i11 != 1 ? i11 != 2 ? i11 != 3 ? kVar.f793j : kVar.i : kVar.f795l : kVar.f794k).getClass();
            uVar8.c(max, 0.0f);
            Path path4 = (Path) mVar.f797A;
            path4.reset();
            uVar8.b(matrixArr[i11], path4);
            if (mVar.f802n && (mVar.b(path4, i11) || mVar.b(path4, i13))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = uVar8.f827a;
                matrixArr[i11].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                uVar8.b(matrixArr[i11], path2);
            } else {
                uVar8.b(matrixArr[i11], path);
            }
            if (c4523c != null) {
                Matrix matrix2 = matrixArr[i11];
                g gVar2 = (g) c4523c.f37627u;
                z6 = false;
                gVar2.f769w.set(i11 + 4, false);
                uVar8.a(uVar8.f831e);
                gVar2.f768v[i11] = new n(new ArrayList((ArrayList) uVar8.f833g), new Matrix(matrix2));
            } else {
                z6 = false;
            }
            z3 = z6;
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
        Path path2 = (Path) this.f798B;
        path2.reset();
        ((u[]) this.f803u)[i].b(((Matrix[]) this.f804v)[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    public AbstractC3604n8 c(int i, int i6, List list) {
        ArrayList arrayList = (ArrayList) this.f805w;
        AbstractC2772Sd.i(i >= 0 && i <= i6 && i6 <= arrayList.size());
        AbstractC2772Sd.i(list.size() == i6 - i);
        for (int i9 = i; i9 < i6; i9++) {
            ((C3458kO) arrayList.get(i9)).f31419a.a((C2954b2) list.get(i9 - i));
        }
        return h();
    }

    public boolean d() {
        return this.f802n;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2844Wl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(boolean z3, Context context, C2473Ak c2473Ak) {
        boolean z6;
        float f3;
        boolean z9;
        int i = 1;
        C3846ri c3846ri = (C3846ri) QC.w((C3467kg) this.f808z);
        try {
            InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) this.f797A;
            boolean V02 = interfaceC4061vh.V0();
            boolean z10 = this.f802n;
            C3052cu c3052cu = (C3052cu) this.f805w;
            St st = (St) this.f807y;
            C3357ic c3357ic = (C3357ic) this.f798B;
            if (V02) {
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32381u1)).booleanValue()) {
                    interfaceC4061vh = ((C2612In) this.f804v).a(c3052cu.f29625f, null, null);
                    interfaceC4061vh.a1("/reward", new C2818Vb(5, (C2610Il) c3846ri.f33672V0.f()));
                    ((C2595Hn) c3846ri.f33674W0.f()).a(interfaceC4061vh, true, z10 ? c3357ic : null, (C2993bo) this.f800D);
                    interfaceC4061vh.g0().f26159z = new C4178xq(i, interfaceC4061vh);
                    interfaceC4061vh.g0().f26128A = new C4070vq(interfaceC4061vh);
                    Wt wt = st.f27640s;
                    interfaceC4061vh.C0(wt.f28427b, wt.f28426a);
                }
            }
            InterfaceC4061vh interfaceC4061vh2 = interfaceC4061vh;
            interfaceC4061vh2.i1(true);
            boolean z11 = false;
            boolean a9 = z10 ? c3357ic.a(false) : false;
            D d2 = C4835j.f39730C.f39735c;
            boolean i6 = D.i((Context) this.f803u);
            if (z10) {
                synchronized (c3357ic) {
                    z9 = c3357ic.f31054b;
                }
                if (!z9) {
                    z6 = false;
                    z11 = true;
                    if (z11) {
                        f3 = 0.0f;
                    } else {
                        synchronized (c3357ic) {
                            f3 = c3357ic.f31055c;
                        }
                    }
                    C4831f c4831f = new C4831f(a9, i6, z6, f3, z3, st.f27595O, st.f27596P);
                    if (c2473Ak != null) {
                        c2473Ak.Q1();
                    }
                    C2796Tl c2796Tl = (C2796Tl) c3846ri.f33670U0.f();
                    Wt wt2 = st.f27640s;
                    BinderC2880Yp binderC2880Yp = null;
                    String str = wt2.f28427b;
                    if (st.b()) {
                        binderC2880Yp = (BinderC2880Yp) this.f799C;
                    }
                    a4.e.n(context, new AdOverlayInfoParcel(c2796Tl, interfaceC4061vh2, st.f27597Q, (C5110a) this.f806x, st.f27576B, c4831f, str, wt2.f28426a, c3052cu.f29626g, c2473Ak, binderC2880Yp, interfaceC4061vh2.p()), true, (C3153eo) this.f801E);
                }
                z11 = true;
            }
            z6 = z11;
            if (z11) {
            }
            C4831f c4831f2 = new C4831f(a9, i6, z6, f3, z3, st.f27595O, st.f27596P);
            if (c2473Ak != null) {
            }
            C2796Tl c2796Tl2 = (C2796Tl) c3846ri.f33670U0.f();
            Wt wt22 = st.f27640s;
            BinderC2880Yp binderC2880Yp2 = null;
            String str2 = wt22.f28427b;
            if (st.b()) {
            }
            a4.e.n(context, new AdOverlayInfoParcel(c2796Tl2, interfaceC4061vh2, st.f27597Q, (C5110a) this.f806x, st.f27576B, c4831f2, str2, wt22.f28426a, c3052cu.f29626g, c2473Ak, binderC2880Yp2, interfaceC4061vh2.p()), true, (C3153eo) this.f801E);
        } catch (C2521Dh e9) {
            int i9 = z.f41319b;
            v2.i.d("", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2844Wl
    public St f() {
        return (St) this.f807y;
    }

    public void g() {
        AbstractC2772Sd.H(!this.f802n);
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f805w;
            if (i >= arrayList.size()) {
                this.f802n = true;
                return;
            }
            C3458kO c3458kO = (C3458kO) arrayList.get(i);
            o(c3458kO);
            ((HashSet) this.f798B).add(c3458kO);
            i++;
        }
    }

    public AbstractC3604n8 h() {
        ArrayList arrayList = (ArrayList) this.f805w;
        if (arrayList.isEmpty()) {
            return AbstractC3604n8.f32690a;
        }
        int i = 0;
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            C3458kO c3458kO = (C3458kO) arrayList.get(i6);
            c3458kO.f31422d = i;
            i += c3458kO.f31419a.f31453o.f30250b.a();
        }
        return new C3835rO(arrayList, (KQ) this.f801E);
    }

    public AbstractC3604n8 i(List list, KQ kq) {
        ArrayList arrayList = (ArrayList) this.f805w;
        n(0, arrayList.size());
        return j(arrayList.size(), list, kq);
    }

    public AbstractC3604n8 j(int i, List list, KQ kq) {
        if (!list.isEmpty()) {
            this.f801E = kq;
            for (int i6 = i; i6 < list.size() + i; i6++) {
                C3458kO c3458kO = (C3458kO) list.get(i6 - i);
                ArrayList arrayList = (ArrayList) this.f805w;
                if (i6 > 0) {
                    C3458kO c3458kO2 = (C3458kO) arrayList.get(i6 - 1);
                    c3458kO.f31422d = c3458kO2.f31419a.f31453o.f30250b.a() + c3458kO2.f31422d;
                    c3458kO.f31423e = false;
                    c3458kO.f31421c.clear();
                } else {
                    c3458kO.f31422d = 0;
                    c3458kO.f31423e = false;
                    c3458kO.f31421c.clear();
                }
                int a9 = c3458kO.f31419a.f31453o.f30250b.a();
                for (int i9 = i6; i9 < arrayList.size(); i9++) {
                    ((C3458kO) arrayList.get(i9)).f31422d += a9;
                }
                arrayList.add(i6, c3458kO);
                ((HashMap) this.f807y).put(c3458kO.f31420b, c3458kO);
                if (this.f802n) {
                    o(c3458kO);
                    if (((IdentityHashMap) this.f806x).isEmpty()) {
                        ((HashSet) this.f798B).add(c3458kO);
                    } else {
                        C3404jO c3404jO = (C3404jO) ((HashMap) this.f797A).get(c3458kO);
                        if (c3404jO != null) {
                            c3404jO.f31242a.p(c3404jO.f31243b);
                        }
                    }
                }
            }
        }
        return h();
    }

    public AbstractC3604n8 k(int i, int i6, KQ kq) {
        boolean z3 = false;
        if (i >= 0 && i <= i6 && i6 <= ((ArrayList) this.f805w).size()) {
            z3 = true;
        }
        AbstractC2772Sd.i(z3);
        this.f801E = kq;
        n(i, i6);
        return h();
    }

    public AbstractC3604n8 l(KQ kq) {
        int size = ((ArrayList) this.f805w).size();
        if (kq.f25924b.length != size) {
            kq = new KQ(new Random(kq.f25923a.nextLong())).a(size);
        }
        this.f801E = kq;
        return h();
    }

    public void m() {
        Iterator it = ((HashSet) this.f798B).iterator();
        while (it.hasNext()) {
            C3458kO c3458kO = (C3458kO) it.next();
            if (c3458kO.f31421c.isEmpty()) {
                C3404jO c3404jO = (C3404jO) ((HashMap) this.f797A).get(c3458kO);
                if (c3404jO != null) {
                    c3404jO.f31242a.p(c3404jO.f31243b);
                }
                it.remove();
            }
        }
    }

    public void n(int i, int i6) {
        while (true) {
            i6--;
            if (i6 < i) {
                return;
            }
            ArrayList arrayList = (ArrayList) this.f805w;
            C3458kO c3458kO = (C3458kO) arrayList.remove(i6);
            ((HashMap) this.f807y).remove(c3458kO.f31420b);
            int i9 = -c3458kO.f31419a.f31453o.f30250b.a();
            for (int i10 = i6; i10 < arrayList.size(); i10++) {
                ((C3458kO) arrayList.get(i10)).f31422d += i9;
            }
            c3458kO.f31423e = true;
            if (this.f802n) {
                p(c3458kO);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.lO, com.google.android.gms.internal.ads.pQ] */
    public void o(C3458kO c3458kO) {
        C3460kQ c3460kQ = c3458kO.f31419a;
        ?? r12 = new InterfaceC3730pQ() { // from class: com.google.android.gms.internal.ads.lO
            @Override // com.google.android.gms.internal.ads.InterfaceC3730pQ
            public final void a(XP xp, AbstractC3604n8 abstractC3604n8) {
                C3212ft c3212ft = ((VN) E3.m.this.f808z).f28189z;
                c3212ft.d(2);
                c3212ft.c(22);
            }
        };
        C3352iO c3352iO = new C3352iO(this, c3458kO);
        ((HashMap) this.f797A).put(c3458kO, new C3404jO(c3460kQ, r12, c3352iO));
        String str = AbstractC3159eu.f29993a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        AP ap = c3460kQ.f28526c;
        ap.getClass();
        ap.f23676b.add(new C3784qQ(handler, c3352iO));
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        new Handler(myLooper2, null);
        AP ap2 = c3460kQ.f28527d;
        ap2.getClass();
        ap2.f23676b.add(new C4268zP(c3352iO));
        c3460kQ.n(r12, (IO) this.f803u, (InterfaceC4188y) this.f804v);
    }

    public void p(C3458kO c3458kO) {
        if (c3458kO.f31423e && c3458kO.f31421c.isEmpty()) {
            C3404jO c3404jO = (C3404jO) ((HashMap) this.f797A).remove(c3458kO);
            c3404jO.getClass();
            C3512lO c3512lO = c3404jO.f31243b;
            XP xp = c3404jO.f31242a;
            xp.q(c3512lO);
            C3352iO c3352iO = c3404jO.f31244c;
            xp.l(c3352iO);
            xp.m(c3352iO);
            ((HashSet) this.f798B).remove(c3458kO);
        }
    }

    public m(VN vn, BO bo, C3212ft c3212ft, IO io, InterfaceC4188y interfaceC4188y) {
        this.f803u = io;
        this.f804v = interfaceC4188y;
        this.f808z = vn;
        this.f801E = new KQ();
        this.f806x = new IdentityHashMap();
        this.f807y = new HashMap();
        this.f805w = new ArrayList();
        this.f799C = bo;
        this.f800D = c3212ft;
        this.f797A = new HashMap();
        this.f798B = new HashSet();
    }

    public m() {
        this.f803u = new u[4];
        this.f804v = new Matrix[4];
        this.f805w = new Matrix[4];
        this.f806x = new PointF();
        this.f807y = new Path();
        this.f808z = new Path();
        this.f799C = new u();
        this.f800D = new float[2];
        this.f801E = new float[2];
        this.f797A = new Path();
        this.f798B = new Path();
        this.f802n = true;
        for (int i = 0; i < 4; i++) {
            ((u[]) this.f803u)[i] = new u();
            ((Matrix[]) this.f804v)[i] = new Matrix();
            ((Matrix[]) this.f805w)[i] = new Matrix();
        }
    }
}
