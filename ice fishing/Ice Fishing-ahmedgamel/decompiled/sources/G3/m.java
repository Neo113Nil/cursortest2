package G3;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.AP;
import com.google.android.gms.internal.ads.AbstractC2792Sd;
import com.google.android.gms.internal.ads.AbstractC2947aQ;
import com.google.android.gms.internal.ads.AbstractC3182eu;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.AbstractC3627n8;
import com.google.android.gms.internal.ads.BO;
import com.google.android.gms.internal.ads.BinderC2903Yp;
import com.google.android.gms.internal.ads.C2493Ak;
import com.google.android.gms.internal.ads.C2541Dh;
import com.google.android.gms.internal.ads.C2632In;
import com.google.android.gms.internal.ads.C2647Jl;
import com.google.android.gms.internal.ads.C2649Jn;
import com.google.android.gms.internal.ads.C2834Ul;
import com.google.android.gms.internal.ads.C2841Vb;
import com.google.android.gms.internal.ads.C2977b2;
import com.google.android.gms.internal.ads.C3069co;
import com.google.android.gms.internal.ads.C3075cu;
import com.google.android.gms.internal.ads.C3230fo;
import com.google.android.gms.internal.ads.C3235ft;
import com.google.android.gms.internal.ads.C3375iO;
import com.google.android.gms.internal.ads.C3380ic;
import com.google.android.gms.internal.ads.C3427jO;
import com.google.android.gms.internal.ads.C3481kO;
import com.google.android.gms.internal.ads.C3490kg;
import com.google.android.gms.internal.ads.C3535lO;
import com.google.android.gms.internal.ads.C3645nQ;
import com.google.android.gms.internal.ads.C3858rO;
import com.google.android.gms.internal.ads.C3869ri;
import com.google.android.gms.internal.ads.C3968tQ;
import com.google.android.gms.internal.ads.C4093vq;
import com.google.android.gms.internal.ads.C4201xq;
import com.google.android.gms.internal.ads.C4291zP;
import com.google.android.gms.internal.ads.IO;
import com.google.android.gms.internal.ads.InterfaceC2883Xl;
import com.google.android.gms.internal.ads.InterfaceC3914sQ;
import com.google.android.gms.internal.ads.InterfaceC4084vh;
import com.google.android.gms.internal.ads.InterfaceC4211y;
import com.google.android.gms.internal.ads.NQ;
import com.google.android.gms.internal.ads.QC;
import com.google.android.gms.internal.ads.St;
import com.google.android.gms.internal.ads.VN;
import com.google.android.gms.internal.ads.Wt;
import i1.C4586c;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import r2.C4902g;
import r2.C4906k;
import w2.D;
import w2.z;
import x2.C5189a;

/* loaded from: classes2.dex */
public final class m implements InterfaceC2883Xl {

    /* renamed from: A, reason: collision with root package name */
    public final Object f1139A;

    /* renamed from: B, reason: collision with root package name */
    public final Object f1140B;

    /* renamed from: C, reason: collision with root package name */
    public final Object f1141C;

    /* renamed from: D, reason: collision with root package name */
    public final Object f1142D;

    /* renamed from: E, reason: collision with root package name */
    public Object f1143E;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1144n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f1145u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f1146v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f1147w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f1148x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f1149y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f1150z;

    public m(Context context, C2649Jn c2649Jn, C3075cu c3075cu, C5189a c5189a, St st, C3490kg c3490kg, InterfaceC4084vh interfaceC4084vh, C3380ic c3380ic, boolean z6, BinderC2903Yp binderC2903Yp, C3069co c3069co, C3230fo c3230fo) {
        this.f1145u = context;
        this.f1146v = c2649Jn;
        this.f1147w = c3075cu;
        this.f1148x = c5189a;
        this.f1149y = st;
        this.f1150z = c3490kg;
        this.f1139A = interfaceC4084vh;
        this.f1140B = c3380ic;
        this.f1144n = z6;
        this.f1141C = binderC2903Yp;
        this.f1142D = c3069co;
        this.f1143E = c3230fo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v6 */
    public void a(k kVar, float f2, RectF rectF, C4586c c4586c, Path path) {
        Matrix[] matrixArr;
        Matrix[] matrixArr2;
        u[] uVarArr;
        int i;
        boolean z6;
        float[] fArr;
        float f9;
        boolean z9;
        int i4;
        m mVar = this;
        path.rewind();
        Path path2 = (Path) mVar.f1149y;
        path2.rewind();
        Path path3 = (Path) mVar.f1150z;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i6 = 0;
        while (true) {
            matrixArr = (Matrix[]) mVar.f1147w;
            matrixArr2 = (Matrix[]) mVar.f1146v;
            uVarArr = (u[]) mVar.f1145u;
            i = 4;
            z6 = 0;
            fArr = (float[]) mVar.f1142D;
            if (i6 >= 4) {
                break;
            }
            c cVar = i6 != 1 ? i6 != 2 ? i6 != 3 ? kVar.f1132f : kVar.f1131e : kVar.f1134h : kVar.f1133g;
            X2.a aVar = i6 != 1 ? i6 != 2 ? i6 != 3 ? kVar.f1128b : kVar.f1127a : kVar.f1130d : kVar.f1129c;
            u uVar = uVarArr[i6];
            aVar.getClass();
            aVar.j(uVar, f2, cVar.a(rectF));
            int i9 = i6 + 1;
            float f10 = (i9 % 4) * 90;
            matrixArr2[i6].reset();
            PointF pointF = (PointF) mVar.f1148x;
            if (i6 == 1) {
                i4 = i6;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i6 == 2) {
                i4 = i6;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i6 != 3) {
                i4 = i6;
                pointF.set(rectF.right, rectF.top);
            } else {
                i4 = i6;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i4].setTranslate(pointF.x, pointF.y);
            matrixArr2[i4].preRotate(f10);
            u uVar2 = uVarArr[i4];
            fArr[0] = uVar2.f1170b;
            fArr[1] = uVar2.f1171c;
            matrixArr2[i4].mapPoints(fArr);
            matrixArr[i4].reset();
            matrixArr[i4].setTranslate(fArr[0], fArr[1]);
            matrixArr[i4].preRotate(f10);
            i6 = i9;
        }
        int i10 = 0;
        while (i10 < i) {
            u uVar3 = uVarArr[i10];
            uVar3.getClass();
            fArr[z6] = 0.0f;
            fArr[1] = uVar3.f1169a;
            matrixArr2[i10].mapPoints(fArr);
            if (i10 == 0) {
                path.moveTo(fArr[z6], fArr[1]);
            } else {
                path.lineTo(fArr[z6], fArr[1]);
            }
            uVarArr[i10].b(matrixArr2[i10], path);
            if (c4586c != null) {
                u uVar4 = uVarArr[i10];
                Matrix matrix = matrixArr2[i10];
                g gVar = (g) c4586c.f38154u;
                BitSet bitSet = gVar.f1111w;
                uVar4.getClass();
                f9 = 0.0f;
                bitSet.set(i10, z6);
                uVar4.a(uVar4.f1173e);
                gVar.f1109u[i10] = new n(new ArrayList((ArrayList) uVar4.f1175g), new Matrix(matrix));
            } else {
                f9 = 0.0f;
            }
            int i11 = i10 + 1;
            int i12 = i11 % 4;
            u uVar5 = uVarArr[i10];
            fArr[0] = uVar5.f1170b;
            fArr[1] = uVar5.f1171c;
            matrixArr2[i10].mapPoints(fArr);
            u uVar6 = uVarArr[i12];
            uVar6.getClass();
            float[] fArr2 = (float[]) mVar.f1143E;
            fArr2[0] = f9;
            fArr2[1] = uVar6.f1169a;
            matrixArr2[i12].mapPoints(fArr2);
            Matrix[] matrixArr3 = matrixArr2;
            u[] uVarArr2 = uVarArr;
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, f9);
            u uVar7 = uVarArr2[i10];
            fArr[0] = uVar7.f1170b;
            fArr[1] = uVar7.f1171c;
            matrixArr3[i10].mapPoints(fArr);
            if (i10 == 1 || i10 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            u uVar8 = (u) mVar.f1141C;
            uVar8.d(0.0f, 270.0f, 0.0f);
            (i10 != 1 ? i10 != 2 ? i10 != 3 ? kVar.f1135j : kVar.i : kVar.f1137l : kVar.f1136k).getClass();
            uVar8.c(max, 0.0f);
            Path path4 = (Path) mVar.f1139A;
            path4.reset();
            uVar8.b(matrixArr[i10], path4);
            if (mVar.f1144n && (mVar.b(path4, i10) || mVar.b(path4, i12))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = uVar8.f1169a;
                matrixArr[i10].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                uVar8.b(matrixArr[i10], path2);
            } else {
                uVar8.b(matrixArr[i10], path);
            }
            if (c4586c != null) {
                Matrix matrix2 = matrixArr[i10];
                g gVar2 = (g) c4586c.f38154u;
                z9 = false;
                gVar2.f1111w.set(i10 + 4, false);
                uVar8.a(uVar8.f1173e);
                gVar2.f1110v[i10] = new n(new ArrayList((ArrayList) uVar8.f1175g), new Matrix(matrix2));
            } else {
                z9 = false;
            }
            z6 = z9;
            i10 = i11;
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
        Path path2 = (Path) this.f1140B;
        path2.reset();
        ((u[]) this.f1145u)[i].b(((Matrix[]) this.f1146v)[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    public AbstractC3627n8 c(int i, int i4, List list) {
        ArrayList arrayList = (ArrayList) this.f1147w;
        AbstractC2792Sd.i(i >= 0 && i <= i4 && i4 <= arrayList.size());
        AbstractC2792Sd.i(list.size() == i4 - i);
        for (int i6 = i; i6 < i4; i6++) {
            ((C3481kO) arrayList.get(i6)).f32198a.a((C2977b2) list.get(i6 - i));
        }
        return h();
    }

    public boolean d() {
        return this.f1144n;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2883Xl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(boolean z6, Context context, C2493Ak c2493Ak) {
        boolean z9;
        float f2;
        boolean z10;
        int i = 1;
        C3869ri c3869ri = (C3869ri) QC.w((C3490kg) this.f1150z);
        try {
            InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) this.f1139A;
            boolean U02 = interfaceC4084vh.U0();
            boolean z11 = this.f1144n;
            C3075cu c3075cu = (C3075cu) this.f1147w;
            St st = (St) this.f1149y;
            C3380ic c3380ic = (C3380ic) this.f1140B;
            if (U02) {
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33160u1)).booleanValue()) {
                    interfaceC4084vh = ((C2649Jn) this.f1146v).a(c3075cu.f30395f, null, null);
                    interfaceC4084vh.Z0("/reward", new C2841Vb(5, (C2647Jl) c3869ri.f34438Q0.f()));
                    ((C2632In) c3869ri.f34439R0.f()).a(interfaceC4084vh, true, z11 ? c3380ic : null, (C3069co) this.f1142D);
                    interfaceC4084vh.h0().f26956z = new C4201xq(i, interfaceC4084vh);
                    interfaceC4084vh.h0().f26925A = new C4093vq(interfaceC4084vh);
                    Wt wt = st.f28423s;
                    interfaceC4084vh.B0(wt.f29209b, wt.f29208a);
                }
            }
            InterfaceC4084vh interfaceC4084vh2 = interfaceC4084vh;
            interfaceC4084vh2.g1(true);
            boolean z12 = false;
            boolean a9 = z11 ? c3380ic.a(false) : false;
            D d9 = C4906k.f40186C.f40191c;
            boolean i4 = D.i((Context) this.f1145u);
            if (z11) {
                synchronized (c3380ic) {
                    z10 = c3380ic.f31825b;
                }
                if (!z10) {
                    z9 = false;
                    z12 = true;
                    if (z12) {
                        f2 = 0.0f;
                    } else {
                        synchronized (c3380ic) {
                            f2 = c3380ic.f31826c;
                        }
                    }
                    C4902g c4902g = new C4902g(a9, i4, z9, f2, z6, st.f28378O, st.f28379P);
                    if (c2493Ak != null) {
                        c2493Ak.R1();
                    }
                    C2834Ul c2834Ul = (C2834Ul) c3869ri.f34437P0.f();
                    Wt wt2 = st.f28423s;
                    BinderC2903Yp binderC2903Yp = null;
                    String str = wt2.f29209b;
                    if (st.b()) {
                        binderC2903Yp = (BinderC2903Yp) this.f1141C;
                    }
                    c4.e.q(context, new AdOverlayInfoParcel(c2834Ul, interfaceC4084vh2, st.f28380Q, (C5189a) this.f1148x, st.f28359B, c4902g, str, wt2.f29208a, c3075cu.f30396g, c2493Ak, binderC2903Yp, interfaceC4084vh2.p()), true, (C3230fo) this.f1143E);
                }
                z12 = true;
            }
            z9 = z12;
            if (z12) {
            }
            C4902g c4902g2 = new C4902g(a9, i4, z9, f2, z6, st.f28378O, st.f28379P);
            if (c2493Ak != null) {
            }
            C2834Ul c2834Ul2 = (C2834Ul) c3869ri.f34437P0.f();
            Wt wt22 = st.f28423s;
            BinderC2903Yp binderC2903Yp2 = null;
            String str2 = wt22.f29209b;
            if (st.b()) {
            }
            c4.e.q(context, new AdOverlayInfoParcel(c2834Ul2, interfaceC4084vh2, st.f28380Q, (C5189a) this.f1148x, st.f28359B, c4902g2, str2, wt22.f29208a, c3075cu.f30396g, c2493Ak, binderC2903Yp2, interfaceC4084vh2.p()), true, (C3230fo) this.f1143E);
        } catch (C2541Dh e9) {
            int i6 = z.f41712b;
            x2.i.d("", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2883Xl
    public St f() {
        return (St) this.f1149y;
    }

    public void g() {
        AbstractC2792Sd.H(!this.f1144n);
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f1147w;
            if (i >= arrayList.size()) {
                this.f1144n = true;
                return;
            }
            C3481kO c3481kO = (C3481kO) arrayList.get(i);
            o(c3481kO);
            ((HashSet) this.f1140B).add(c3481kO);
            i++;
        }
    }

    public AbstractC3627n8 h() {
        ArrayList arrayList = (ArrayList) this.f1147w;
        if (arrayList.isEmpty()) {
            return AbstractC3627n8.f33468a;
        }
        int i = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            C3481kO c3481kO = (C3481kO) arrayList.get(i4);
            c3481kO.f32201d = i;
            i += c3481kO.f32198a.f33515o.f31816b.a();
        }
        return new C3858rO(arrayList, (NQ) this.f1143E);
    }

    public AbstractC3627n8 i(List list, NQ nq) {
        ArrayList arrayList = (ArrayList) this.f1147w;
        n(0, arrayList.size());
        return j(arrayList.size(), list, nq);
    }

    public AbstractC3627n8 j(int i, List list, NQ nq) {
        if (!list.isEmpty()) {
            this.f1143E = nq;
            for (int i4 = i; i4 < list.size() + i; i4++) {
                C3481kO c3481kO = (C3481kO) list.get(i4 - i);
                ArrayList arrayList = (ArrayList) this.f1147w;
                if (i4 > 0) {
                    C3481kO c3481kO2 = (C3481kO) arrayList.get(i4 - 1);
                    c3481kO.f32201d = c3481kO2.f32198a.f33515o.f31816b.a() + c3481kO2.f32201d;
                    c3481kO.f32202e = false;
                    c3481kO.f32200c.clear();
                } else {
                    c3481kO.f32201d = 0;
                    c3481kO.f32202e = false;
                    c3481kO.f32200c.clear();
                }
                int a9 = c3481kO.f32198a.f33515o.f31816b.a();
                for (int i6 = i4; i6 < arrayList.size(); i6++) {
                    ((C3481kO) arrayList.get(i6)).f32201d += a9;
                }
                arrayList.add(i4, c3481kO);
                ((HashMap) this.f1149y).put(c3481kO.f32199b, c3481kO);
                if (this.f1144n) {
                    o(c3481kO);
                    if (((IdentityHashMap) this.f1148x).isEmpty()) {
                        ((HashSet) this.f1140B).add(c3481kO);
                    } else {
                        C3427jO c3427jO = (C3427jO) ((HashMap) this.f1139A).get(c3481kO);
                        if (c3427jO != null) {
                            c3427jO.f32029a.p(c3427jO.f32030b);
                        }
                    }
                }
            }
        }
        return h();
    }

    public AbstractC3627n8 k(int i, int i4, NQ nq) {
        boolean z6 = false;
        if (i >= 0 && i <= i4 && i4 <= ((ArrayList) this.f1147w).size()) {
            z6 = true;
        }
        AbstractC2792Sd.i(z6);
        this.f1143E = nq;
        n(i, i4);
        return h();
    }

    public AbstractC3627n8 l(NQ nq) {
        int size = ((ArrayList) this.f1147w).size();
        if (nq.f27274b.length != size) {
            nq = new NQ(new Random(nq.f27273a.nextLong())).a(size);
        }
        this.f1143E = nq;
        return h();
    }

    public void m() {
        Iterator it = ((HashSet) this.f1140B).iterator();
        while (it.hasNext()) {
            C3481kO c3481kO = (C3481kO) it.next();
            if (c3481kO.f32200c.isEmpty()) {
                C3427jO c3427jO = (C3427jO) ((HashMap) this.f1139A).get(c3481kO);
                if (c3427jO != null) {
                    c3427jO.f32029a.p(c3427jO.f32030b);
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
            ArrayList arrayList = (ArrayList) this.f1147w;
            C3481kO c3481kO = (C3481kO) arrayList.remove(i4);
            ((HashMap) this.f1149y).remove(c3481kO.f32199b);
            int i6 = -c3481kO.f32198a.f33515o.f31816b.a();
            for (int i9 = i4; i9 < arrayList.size(); i9++) {
                ((C3481kO) arrayList.get(i9)).f32201d += i6;
            }
            c3481kO.f32202e = true;
            if (this.f1144n) {
                p(c3481kO);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.lO, com.google.android.gms.internal.ads.sQ] */
    public void o(C3481kO c3481kO) {
        C3645nQ c3645nQ = c3481kO.f32198a;
        ?? r1 = new InterfaceC3914sQ() { // from class: com.google.android.gms.internal.ads.lO
            @Override // com.google.android.gms.internal.ads.InterfaceC3914sQ
            public final void a(AbstractC2947aQ abstractC2947aQ, AbstractC3627n8 abstractC3627n8) {
                C3235ft c3235ft = ((VN) G3.m.this.f1150z).f28985z;
                c3235ft.d(2);
                c3235ft.c(22);
            }
        };
        C3375iO c3375iO = new C3375iO(this, c3481kO);
        ((HashMap) this.f1139A).put(c3481kO, new C3427jO(c3645nQ, r1, c3375iO));
        String str = AbstractC3182eu.f30782a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        AP ap = c3645nQ.f29827c;
        ap.getClass();
        ap.f24456b.add(new C3968tQ(handler, c3375iO));
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        new Handler(myLooper2, null);
        AP ap2 = c3645nQ.f29828d;
        ap2.getClass();
        ap2.f24456b.add(new C4291zP(c3375iO));
        c3645nQ.n(r1, (IO) this.f1145u, (InterfaceC4211y) this.f1146v);
    }

    public void p(C3481kO c3481kO) {
        if (c3481kO.f32202e && c3481kO.f32200c.isEmpty()) {
            C3427jO c3427jO = (C3427jO) ((HashMap) this.f1139A).remove(c3481kO);
            c3427jO.getClass();
            C3535lO c3535lO = c3427jO.f32030b;
            AbstractC2947aQ abstractC2947aQ = c3427jO.f32029a;
            abstractC2947aQ.q(c3535lO);
            C3375iO c3375iO = c3427jO.f32031c;
            abstractC2947aQ.l(c3375iO);
            abstractC2947aQ.m(c3375iO);
            ((HashSet) this.f1140B).remove(c3481kO);
        }
    }

    public m(VN vn, BO bo, C3235ft c3235ft, IO io, InterfaceC4211y interfaceC4211y) {
        this.f1145u = io;
        this.f1146v = interfaceC4211y;
        this.f1150z = vn;
        this.f1143E = new NQ();
        this.f1148x = new IdentityHashMap();
        this.f1149y = new HashMap();
        this.f1147w = new ArrayList();
        this.f1141C = bo;
        this.f1142D = c3235ft;
        this.f1139A = new HashMap();
        this.f1140B = new HashSet();
    }

    public m() {
        this.f1145u = new u[4];
        this.f1146v = new Matrix[4];
        this.f1147w = new Matrix[4];
        this.f1148x = new PointF();
        this.f1149y = new Path();
        this.f1150z = new Path();
        this.f1141C = new u();
        this.f1142D = new float[2];
        this.f1143E = new float[2];
        this.f1139A = new Path();
        this.f1140B = new Path();
        this.f1144n = true;
        for (int i = 0; i < 4; i++) {
            ((u[]) this.f1145u)[i] = new u();
            ((Matrix[]) this.f1146v)[i] = new Matrix();
            ((Matrix[]) this.f1147w)[i] = new Matrix();
        }
    }
}
