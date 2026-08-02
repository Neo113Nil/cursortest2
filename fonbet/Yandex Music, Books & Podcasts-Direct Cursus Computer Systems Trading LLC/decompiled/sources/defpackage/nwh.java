package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.shape.a;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class nwh implements kln {
    public Object b = new xup[4];
    public Object c = new Matrix[4];
    public Object d = new Matrix[4];
    public Object e = new PointF();
    public Object f = new Path();
    public Object g = new Path();
    public Object h = new xup();
    public Object i = new float[2];
    public Object j = new float[2];
    public Object k = new Path();
    public Object l = new Path();
    public boolean a = true;

    public nwh() {
        for (int i = 0; i < 4; i++) {
            ((xup[]) this.b)[i] = new xup();
            ((Matrix[]) this.c)[i] = new Matrix();
            ((Matrix[]) this.d)[i] = new Matrix();
        }
    }

    public static okb w(uz7 uz7Var) {
        if (uz7Var instanceof sz7) {
            return okb.Phone;
        }
        if (!(uz7Var instanceof tz7)) {
            b6e.s();
            return null;
        }
        s64 s64Var = ((tz7) uz7Var).a;
        s64Var.getClass();
        if (!(s64Var instanceof t64)) {
            if (s64Var instanceof q64) {
                return okb.Station;
            }
            if (s64Var instanceof p64) {
                return okb.Chromecast;
            }
            b6e.s();
            return null;
        }
        switch (((t64) s64Var).a.b.ordinal()) {
            case 0:
                return okb.Phone;
            case 1:
                return okb.AppleTv;
            case 2:
                return okb.Phone;
            case 3:
                return okb.AndroidTv;
            case 4:
                return okb.Web;
            case 5:
                return okb.WebTv;
            case 6:
                return okb.WebDesktop;
            case 7:
                return okb.Unknown;
            case 8:
                return okb.AndroidWear;
            case 9:
                return okb.Unknown;
            default:
                b6e.s();
                return null;
        }
    }

    public sis a(int i, ArrayList arrayList, ueq ueqVar) {
        ArrayList arrayList2 = (ArrayList) this.c;
        if (!arrayList.isEmpty()) {
            this.k = ueqVar;
            for (int i2 = i; i2 < arrayList.size() + i; i2++) {
                mwh mwhVar = (mwh) arrayList.get(i2 - i);
                if (i2 > 0) {
                    mwh mwhVar2 = (mwh) arrayList2.get(i2 - 1);
                    mwhVar.d = mwhVar2.a.o.e.o() + mwhVar2.d;
                    mwhVar.e = false;
                    mwhVar.c.clear();
                } else {
                    mwhVar.d = 0;
                    mwhVar.e = false;
                    mwhVar.c.clear();
                }
                int o = mwhVar.a.o.e.o();
                for (int i3 = i2; i3 < arrayList2.size(); i3++) {
                    ((mwh) arrayList2.get(i3)).d += o;
                }
                arrayList2.add(i2, mwhVar);
                ((HashMap) this.e).put(mwhVar.b, mwhVar);
                if (this.a) {
                    t(mwhVar);
                    if (((IdentityHashMap) this.d).isEmpty()) {
                        ((HashSet) this.h).add(mwhVar);
                    } else {
                        lwh lwhVar = (lwh) ((HashMap) this.f).get(mwhVar);
                        if (lwhVar != null) {
                            lwhVar.a.m(lwhVar.b);
                        }
                    }
                }
            }
        }
        return g();
    }

    @Override // defpackage.kln
    public boolean b(rv8 rv8Var, rv8 rv8Var2, ViewGroup viewGroup, pm9 pm9Var) {
        boolean z;
        gc8 gc8Var = (gc8) this.b;
        j23 j23Var = (j23) this.g;
        clear();
        this.a = true;
        try {
            z = d(rv8Var, rv8Var2, viewGroup);
        } catch (jln unused) {
            j23Var.getClass();
            z = false;
        }
        if (!z) {
            return false;
        }
        hp8 hp8Var = (hp8) this.d;
        LinkedHashSet<npb> linkedHashSet = (LinkedHashSet) this.h;
        if (linkedHashSet.isEmpty() && ((ado) this.l).a.isEmpty()) {
            j23Var.getClass();
            return false;
        }
        Iterator it = ((ArrayList) this.i).iterator();
        while (it.hasNext()) {
            npb npbVar = (npb) it.next();
            jc8 jc8Var = (jc8) npbVar.d;
            View view = npbVar.e;
            if (jc8Var instanceof db8 ? true : jc8Var instanceof sb8) {
                gc8Var.getReleaseViewVisitor$div_release().getClass();
                ttn.m0(view);
            }
            gc8Var.Y(view);
        }
        for (npb npbVar2 : ((LinkedHashMap) this.k).values()) {
            jc8 jc8Var2 = (jc8) npbVar2.d;
            View view2 = npbVar2.e;
            if (jc8Var2 instanceof db8 ? true : jc8Var2 instanceof sb8) {
                gc8Var.getReleaseViewVisitor$div_release().getClass();
                ttn.m0(view2);
            }
            gc8Var.Y(view2);
        }
        for (npb npbVar3 : linkedHashSet) {
            npb npbVar4 = npbVar3.f;
            View view3 = npbVar3.e;
            if (!CollectionsKt.I(linkedHashSet, npbVar4)) {
                e23 G = bg3.G(view3);
                if (G == null) {
                    G = gc8Var.getBindingContext$div_release();
                }
                hp8Var.b(G, view3, ((k79) npbVar3.c).a, pm9Var);
            }
        }
        Iterator it2 = ((ArrayList) this.c).iterator();
        while (it2.hasNext()) {
            npb npbVar5 = (npb) it2.next();
            npb npbVar6 = npbVar5.f;
            View view4 = npbVar5.e;
            if (!CollectionsKt.I(linkedHashSet, npbVar6)) {
                e23 G2 = bg3.G(view4);
                if (G2 == null) {
                    G2 = gc8Var.getBindingContext$div_release();
                }
                hp8Var.b(G2, view4, ((k79) npbVar5.c).a, pm9Var);
            }
        }
        clear();
        j23Var.getClass();
        return true;
    }

    public void c(olb olbVar) {
        String str;
        String str2;
        String str3;
        String str4;
        vdr vdrVar = (vdr) this.c;
        nmb nmbVar = (nmb) this.h;
        int ordinal = ((aal) ((vdr) this.f).getValue()).ordinal();
        String str5 = "";
        if (ordinal == 1) {
            nwk p = p();
            if (p == null || (str = p.a) == null) {
                str = "";
            }
            nwk p2 = p();
            if (p2 != null && (str2 = p2.b) != null) {
                str5 = str2;
            }
            okb w = w((uz7) vdrVar.getValue());
            nmbVar.getClass();
            olbVar.getClass();
            LinkedHashMap m = dfi.m("page_type", "object", "track_id", str);
            m.put("track_name", str5);
            m.put(CommonUrlParts.DEVICE_TYPE, w.a);
            dfi.p(1, "action_type", olbVar.a, "_meta", m);
            nmbVar.C("ExpandedPlayer.ActionButton.Tapped", m);
            return;
        }
        if (ordinal != 2) {
            return;
        }
        nwk p3 = p();
        if (p3 == null || (str3 = p3.a) == null) {
            str3 = "";
        }
        nwk p4 = p();
        if (p4 != null && (str4 = p4.b) != null) {
            str5 = str4;
        }
        okb w2 = w((uz7) vdrVar.getValue());
        nmbVar.getClass();
        olbVar.getClass();
        LinkedHashMap m2 = dfi.m("page_type", "object", "track_id", str3);
        m2.put("track_name", str5);
        m2.put(CommonUrlParts.DEVICE_TYPE, w2.a);
        dfi.p(1, "action_type", olbVar.a, "_meta", m2);
        nmbVar.C("CollapsedPlayer.ActionButton.Tapped", m2);
    }

    @Override // defpackage.kln
    public void clear() {
        this.a = false;
        ado adoVar = (ado) this.l;
        adoVar.a.clear();
        adoVar.b.clear();
        ((LinkedHashSet) this.h).clear();
        ((ArrayList) this.i).clear();
        ((ArrayList) this.j).clear();
    }

    public boolean d(rv8 rv8Var, rv8 rv8Var2, ViewGroup viewGroup) {
        jc8 jc8Var;
        jc8 jc8Var2;
        Object obj;
        j23 j23Var = (j23) this.g;
        gc8 gc8Var = (gc8) this.b;
        qv8 D = gc8Var.D(rv8Var);
        if (D == null || (jc8Var = D.a) == null) {
            j23Var.getClass();
            return false;
        }
        npb npbVar = new npb(new k79(jc8Var, (xzb) this.e), 0, viewGroup, null);
        qv8 D2 = gc8Var.D(rv8Var2);
        if (D2 == null || (jc8Var2 = D2.a) == null) {
            j23Var.getClass();
            return false;
        }
        q5j q5jVar = new q5j(new k79(jc8Var2, (xzb) this.f), 0, null);
        if (npbVar.j(q5jVar)) {
            l(npbVar, q5jVar);
        } else {
            j(npbVar);
            k(q5jVar);
        }
        Iterator it = ((ArrayList) this.j).iterator();
        while (it.hasNext()) {
            npb npbVar2 = ((q5j) it.next()).e;
            if (npbVar2 == null) {
                j23Var.getClass();
                return false;
            }
            LinkedList linkedList = (LinkedList) ((ado) this.l).a.get(Integer.valueOf(npbVar2.b));
            if (linkedList != null) {
                Iterator it2 = linkedList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (Intrinsics.d(((npb) obj).e, npbVar2.e)) {
                        break;
                    }
                }
                wct.m(linkedList);
                linkedList.remove(obj);
            }
            ((LinkedHashSet) this.h).add(npbVar2);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public void e(eup eupVar, float[] fArr, float f, RectF rectF, qec qecVar, Path path) {
        boolean z;
        int i;
        float f2;
        boolean z2;
        zl6 cm4Var;
        int i2;
        qec qecVar2 = qecVar;
        Path path2 = path;
        Matrix[] matrixArr = (Matrix[]) this.d;
        float[] fArr2 = (float[]) this.i;
        xup[] xupVarArr = (xup[]) this.b;
        Matrix[] matrixArr2 = (Matrix[]) this.c;
        path2.rewind();
        Path path3 = (Path) this.f;
        path3.rewind();
        Path path4 = (Path) this.g;
        path4.rewind();
        path4.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            z = 0;
            int i4 = 1;
            if (i3 >= 4) {
                break;
            }
            PointF pointF = (PointF) this.e;
            if (fArr == null) {
                cm4Var = i3 != 1 ? i3 != 2 ? i3 != 3 ? eupVar.f : eupVar.e : eupVar.h : eupVar.g;
            } else {
                cm4Var = new cm4(fArr[i3]);
                i4 = 1;
            }
            ff7 ff7Var = i3 != i4 ? i3 != 2 ? i3 != 3 ? eupVar.b : eupVar.a : eupVar.d : eupVar.c;
            Matrix[] matrixArr3 = matrixArr;
            xup xupVar = xupVarArr[i3];
            ff7Var.getClass();
            ff7Var.A(xupVar, f, cm4Var.a(rectF));
            int i5 = i3 + 1;
            float f3 = (i5 % 4) * 90;
            matrixArr2[i3].reset();
            if (i3 == 1) {
                i2 = i5;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i3 == 2) {
                i2 = i5;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i3 != 3) {
                i2 = i5;
                pointF.set(rectF.right, rectF.top);
            } else {
                i2 = i5;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i3].setTranslate(pointF.x, pointF.y);
            matrixArr2[i3].preRotate(f3);
            xup xupVar2 = xupVarArr[i3];
            fArr2[0] = xupVar2.b;
            fArr2[1] = xupVar2.c;
            matrixArr2[i3].mapPoints(fArr2);
            matrixArr3[i3].reset();
            matrixArr3[i3].setTranslate(fArr2[0], fArr2[1]);
            matrixArr3[i3].preRotate(f3);
            i3 = i2;
            matrixArr = matrixArr3;
        }
        Matrix[] matrixArr4 = matrixArr;
        int i6 = 0;
        for (i = 4; i6 < i; i = 4) {
            xup xupVar3 = xupVarArr[i6];
            xupVar3.getClass();
            fArr2[z] = 0.0f;
            fArr2[1] = xupVar3.a;
            matrixArr2[i6].mapPoints(fArr2);
            if (i6 == 0) {
                path2.moveTo(fArr2[z], fArr2[1]);
            } else {
                path2.lineTo(fArr2[z], fArr2[1]);
            }
            xupVarArr[i6].c(matrixArr2[i6], path2);
            if (qecVar2 != null) {
                xup xupVar4 = xupVarArr[i6];
                Matrix matrix = matrixArr2[i6];
                a aVar = (a) qecVar2.b;
                f2 = 0.0f;
                BitSet bitSet = aVar.e;
                xupVar4.getClass();
                bitSet.set(i6, z);
                wup[] wupVarArr = aVar.c;
                xupVar4.b(xupVar4.e);
                wupVarArr[i6] = new qup(new ArrayList(xupVar4.g), new Matrix(matrix));
            } else {
                f2 = 0.0f;
            }
            Path path5 = (Path) this.k;
            xup xupVar5 = (xup) this.h;
            int i7 = i6 + 1;
            int i8 = i7 % 4;
            xup xupVar6 = xupVarArr[i6];
            xup[] xupVarArr2 = xupVarArr;
            fArr2[0] = xupVar6.b;
            fArr2[1] = xupVar6.c;
            matrixArr2[i6].mapPoints(fArr2);
            float[] fArr3 = (float[]) this.j;
            xup xupVar7 = xupVarArr2[i8];
            xupVar7.getClass();
            fArr3[0] = f2;
            fArr3[1] = xupVar7.a;
            matrixArr2[i8].mapPoints(fArr3);
            Matrix[] matrixArr5 = matrixArr2;
            float max = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, f2);
            xup xupVar8 = xupVarArr2[i6];
            fArr2[0] = xupVar8.b;
            fArr2[1] = xupVar8.c;
            matrixArr5[i6].mapPoints(fArr2);
            float abs = (i6 == 1 || i6 == 3) ? Math.abs(rectF.centerX() - fArr2[0]) : Math.abs(rectF.centerY() - fArr2[1]);
            xupVar5.e(0.0f, 270.0f, 0.0f);
            (i6 != 1 ? i6 != 2 ? i6 != 3 ? eupVar.j : eupVar.i : eupVar.l : eupVar.k).O(max, abs, f, xupVar5);
            path5.reset();
            xupVar5.c(matrixArr4[i6], path5);
            if (this.a && (s(path5, i6) || s(path5, i8))) {
                path5.op(path5, path4, Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = xupVar5.a;
                matrixArr4[i6].mapPoints(fArr2);
                path3.moveTo(fArr2[0], fArr2[1]);
                xupVar5.c(matrixArr4[i6], path3);
                path2 = path;
            } else {
                path2 = path;
                xupVar5.c(matrixArr4[i6], path2);
            }
            if (qecVar != null) {
                Matrix matrix2 = matrixArr4[i6];
                qecVar2 = qecVar;
                a aVar2 = (a) qecVar2.b;
                z2 = false;
                aVar2.e.set(i6 + 4, false);
                wup[] wupVarArr2 = aVar2.d;
                xupVar5.b(xupVar5.e);
                wupVarArr2[i6] = new qup(new ArrayList(xupVar5.g), new Matrix(matrix2));
            } else {
                qecVar2 = qecVar;
                z2 = false;
            }
            i6 = i7;
            z = z2;
            xupVarArr = xupVarArr2;
            matrixArr2 = matrixArr5;
        }
        path2.close();
        path3.close();
        if (path3.isEmpty()) {
            return;
        }
        path2.op(path3, Path.Op.UNION);
    }

    public void f() {
        String str;
        String str2;
        if (this.a) {
            nmb nmbVar = (nmb) this.h;
            nwk p = p();
            String str3 = "";
            if (p == null || (str = p.a) == null) {
                str = "";
            }
            nwk p2 = p();
            if (p2 != null && (str2 = p2.b) != null) {
                str3 = str2;
            }
            okb w = w((uz7) ((vdr) this.c).getValue());
            jkb[] jkbVarArr = jkb.a;
            nmbVar.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("page_type", "object");
            linkedHashMap.put("track_id", str);
            linkedHashMap.put("track_name", str3);
            linkedHashMap.put(CommonUrlParts.DEVICE_TYPE, w.a);
            linkedHashMap.put("from", "collapsed_player_screen");
            linkedHashMap.put("to", "expanded_player_screen");
            dfi.p(1, "entity_type", "player", "_meta", linkedHashMap);
            nmbVar.C("CollapsedPlayer.Navigated", linkedHashMap);
        }
    }

    public sis g() {
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList.isEmpty()) {
            return sis.a;
        }
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            mwh mwhVar = (mwh) arrayList.get(i2);
            mwhVar.d = i;
            i += mwhVar.a.o.e.o();
        }
        return new h1m(arrayList, (ueq) this.k);
    }

    public void h() {
        Iterator it = ((HashSet) this.h).iterator();
        while (it.hasNext()) {
            mwh mwhVar = (mwh) it.next();
            if (mwhVar.c.isEmpty()) {
                lwh lwhVar = (lwh) ((HashMap) this.f).get(mwhVar);
                if (lwhVar != null) {
                    lwhVar.a.m(lwhVar.b);
                }
                it.remove();
            }
        }
    }

    @Override // defpackage.kln
    public ado i() {
        return (ado) this.l;
    }

    public void j(npb npbVar) {
        String id = ((jc8) npbVar.d).d().getId();
        if (id != null) {
            ((LinkedHashMap) this.k).put(id, npbVar);
        } else {
            ((ArrayList) this.i).add(npbVar);
        }
        Iterator it = npbVar.k(null).iterator();
        while (it.hasNext()) {
            j((npb) it.next());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009f A[LOOP:1: B:23:0x0099->B:25:0x009f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k(q5j q5jVar) {
        Object obj;
        Iterator it;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.k;
        ArrayList arrayList = (ArrayList) this.i;
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it2.next();
                if (((npb) obj).j(q5jVar)) {
                    break;
                }
            }
        }
        npb npbVar = (npb) obj;
        if (npbVar != null) {
            arrayList.remove(npbVar);
            l(npbVar, q5jVar);
            return;
        }
        jc8 jc8Var = (jc8) q5jVar.d;
        String id = jc8Var.d().getId();
        npb npbVar2 = id != null ? (npb) linkedHashMap.get(id) : null;
        if (id != null && npbVar2 != null) {
            jc8 jc8Var2 = (jc8) npbVar2.d;
            if (jc8Var2.getClass().equals(jc8Var.getClass()) && h1b.E(jc8Var2.d(), jc8Var.d(), (xzb) this.e, (xzb) this.f)) {
                linkedHashMap.remove(id);
                ((ArrayList) this.c).add(new npb((k79) q5jVar.c, q5jVar.a, npbVar2.e, npbVar2.f));
                it = q5jVar.k().iterator();
                while (it.hasNext()) {
                    k((q5j) it.next());
                }
            }
        }
        ((ArrayList) this.j).add(q5jVar);
        it = q5jVar.k().iterator();
        while (it.hasNext()) {
        }
    }

    public void l(npb npbVar, q5j q5jVar) {
        Object obj;
        npb npbVar2 = new npb((k79) q5jVar.c, q5jVar.a, npbVar.e, npbVar.f);
        q5jVar.e = npbVar2;
        ArrayList y0 = CollectionsKt.y0(q5jVar.k());
        ArrayList arrayList = new ArrayList();
        for (npb npbVar3 : npbVar.k(npbVar2)) {
            Iterator it = y0.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((q5j) obj).j(npbVar3)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            q5j q5jVar2 = (q5j) obj;
            if (q5jVar2 != null) {
                l(npbVar3, q5jVar2);
                y0.remove(q5jVar2);
            } else {
                arrayList.add(npbVar3);
            }
        }
        if (y0.size() != arrayList.size()) {
            ((LinkedHashSet) this.h).add(npbVar2);
        } else {
            ado adoVar = (ado) this.l;
            adoVar.getClass();
            int i = npbVar2.b;
            HashMap hashMap = adoVar.a;
            Integer valueOf = Integer.valueOf(i);
            Object obj2 = hashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new LinkedList();
                hashMap.put(valueOf, obj2);
            }
            ((LinkedList) obj2).add(npbVar2);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            j((npb) it2.next());
        }
        Iterator it3 = y0.iterator();
        while (it3.hasNext()) {
            k((q5j) it3.next());
        }
    }

    @Override // defpackage.kln
    public boolean m() {
        return this.a;
    }

    public void n(String str) {
        String str2;
        String str3;
        if (str != null) {
            nmb nmbVar = (nmb) this.h;
            nwk p = p();
            String str4 = "";
            if (p == null || (str2 = p.a) == null) {
                str2 = "";
            }
            nwk p2 = p();
            if (p2 != null && (str3 = p2.b) != null) {
                str4 = str3;
            }
            nmbVar.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("page_type", "object");
            linkedHashMap.put("track_id", str2);
            linkedHashMap.put("track_name", str4);
            linkedHashMap.put("error_type", "videoshoterror");
            dfi.p(1, "error_message", str, "_meta", linkedHashMap);
            nmbVar.C("ExpandedPlayer.ErrorRaised", linkedHashMap);
        }
    }

    public i0s o() {
        boolean z;
        if (((j0) this.c) == null || ((c40) this.d) == null || ((q6w) this.e) == null || ((ehs) this.f) == null || ((ehs) this.g) == null || ((((q6w) this.h) == null && !this.a) || ((gnr) this.i) == null)) {
            xq0.q("not all mandatory fields set in V3 TBScertificate generator");
            return null;
        }
        e0 e0Var = new e0(10);
        e0Var.e((ki2) this.b);
        e0Var.e((j0) this.c);
        e0Var.e((c40) this.d);
        e0Var.e((q6w) this.e);
        int i = 2;
        e0 e0Var2 = new e0(2);
        e0Var2.e((ehs) this.f);
        e0Var2.e((ehs) this.g);
        d07 d07Var = new d07(e0Var2);
        d07Var.c = -1;
        e0Var.e(d07Var);
        q6w q6wVar = (q6w) this.h;
        if (q6wVar != null) {
            e0Var.e(q6wVar);
        } else {
            e0Var.e(new d07());
        }
        e0Var.e((gnr) this.i);
        sz6 sz6Var = (sz6) this.k;
        int i2 = 128;
        int i3 = 1;
        if (sz6Var != null) {
            z = true;
            e0Var.e(new ki2(i, i2, i3, sz6Var, 1));
        } else {
            z = true;
        }
        sz6 sz6Var2 = (sz6) this.l;
        if (sz6Var2 != null) {
            e0Var.e(new ki2(i, i2, i, sz6Var2, 1));
        }
        l1c l1cVar = (l1c) this.j;
        if (l1cVar != null) {
            e0Var.e(new ki2(z, 3, l1cVar, 1));
        }
        d07 d07Var2 = new d07(e0Var);
        d07Var2.c = -1;
        return i0s.t(d07Var2);
    }

    public nwk p() {
        mwk mwkVar = (mwk) this.k;
        if (mwkVar != null) {
            return (nwk) dag.p(mwkVar, (ogp) this.l);
        }
        return null;
    }

    public void q(mwh mwhVar) {
        if (mwhVar.e && mwhVar.c.isEmpty()) {
            lwh lwhVar = (lwh) ((HashMap) this.f).remove(mwhVar);
            lwhVar.getClass();
            kwh kwhVar = lwhVar.c;
            wvh wvhVar = lwhVar.a;
            wvhVar.h(lwhVar.b);
            wvhVar.c(kwhVar);
            wvhVar.e(kwhVar);
            ((HashSet) this.h).remove(mwhVar);
        }
    }

    public void r(xkb xkbVar) {
        String str;
        String str2;
        nmb nmbVar = (nmb) this.h;
        nwk p = p();
        String str3 = "";
        if (p == null || (str = p.a) == null) {
            str = "";
        }
        nwk p2 = p();
        if (p2 != null && (str2 = p2.b) != null) {
            str3 = str2;
        }
        okb w = w((uz7) ((vdr) this.c).getValue());
        nmbVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_type", "object");
        linkedHashMap.put("track_id", str);
        linkedHashMap.put("track_name", str3);
        linkedHashMap.put(CommonUrlParts.DEVICE_TYPE, w.a);
        linkedHashMap.put("from", "expanded_player_screen");
        linkedHashMap.put("to", xkbVar.a);
        dfi.p(1, "entity_type", "player", "_meta", linkedHashMap);
        nmbVar.C("ExpandedPlayer.Navigated", linkedHashMap);
    }

    public boolean s(Path path, int i) {
        Path path2 = (Path) this.l;
        path2.reset();
        ((xup[]) this.b)[i].c(((Matrix[]) this.c)[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [fwh, vvh] */
    public void t(mwh mwhVar) {
        gch gchVar = mwhVar.a;
        ?? r1 = new vvh() { // from class: fwh
            @Override // defpackage.vvh
            public final void a(wvh wvhVar, sis sisVar) {
                hzr hzrVar = ((fsb) nwh.this.g).h;
                hzrVar.f(2);
                hzrVar.g(22);
            }
        };
        kwh kwhVar = new kwh(this, mwhVar);
        ((HashMap) this.f).put(mwhVar, new lwh(gchVar, r1, kwhVar));
        gchVar.b(dvt.q(null), kwhVar);
        gchVar.k(dvt.q(null), kwhVar);
        gchVar.l(r1, (t6t) this.l, (ndl) this.b);
    }

    public void u(woh wohVar) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.d;
        mwh mwhVar = (mwh) identityHashMap.remove(wohVar);
        mwhVar.getClass();
        mwhVar.a.s(wohVar);
        mwhVar.c.remove(((ech) wohVar).a);
        if (!identityHashMap.isEmpty()) {
            h();
        }
        q(mwhVar);
    }

    public void v(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.c;
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            mwh mwhVar = (mwh) arrayList.remove(i3);
            ((HashMap) this.e).remove(mwhVar.b);
            int i4 = -mwhVar.a.o.e.o();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((mwh) arrayList.get(i5)).d += i4;
            }
            mwhVar.e = true;
            if (this.a) {
                q(mwhVar);
            }
        }
    }
}
