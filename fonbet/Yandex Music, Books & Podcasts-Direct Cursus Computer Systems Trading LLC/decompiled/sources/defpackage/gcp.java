package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxy;

/* loaded from: classes4.dex */
public final class gcp extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public gcp(vqn vqnVar, Function2 function2) {
        super(1);
        this.r = 29;
        this.s = vqnVar;
        this.t = (ezc) function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x026b  */
    /* JADX WARN: Type inference failed for: r0v15, types: [ezc, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r0v97, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Type inference failed for: r12v4, types: [edu, jcp] */
    /* JADX WARN: Type inference failed for: r1v70, types: [ezc, kotlin.jvm.functions.Function2] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        hds a;
        hds a2;
        hds a3;
        cds cdsVar;
        nh0 g;
        vtm vtmVar;
        switch (this.r) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                mcp mcpVar = (mcp) this.t;
                hcp hcpVar = (hcp) this.s;
                if (hcpVar.c() != -1 && hcpVar.u(hcpVar.c())) {
                    mcpVar.l = booleanValue;
                    mcpVar.d.q(hcpVar.c(), mcpVar.l, hcpVar.C);
                }
                return Unit.a;
            case 1:
                x97.y((mm6) this.s, null, pm6.d, new v5p((kp4) this.t, (mn0) obj, null, 3), 1);
                return Unit.a;
            case 2:
                ydp ydpVar = (ydp) obj;
                ((xep) this.s).m(ydpVar);
                ((Function1) this.t).invoke(ydpVar);
                return Unit.a;
            case 3:
                if6 if6Var = (if6) obj;
                nf6 nf6Var = (nf6) this.s;
                y9s y9sVar = y9s.Copy;
                xep xepVar = (xep) this.t;
                if (xepVar.h()) {
                    if6.b(if6Var, new y5(7, y9sVar), new zep(nf6Var, xepVar, 0));
                }
                Unit unit = Unit.a;
                y9s y9sVar2 = y9s.SelectAll;
                if (!xepVar.f()) {
                    if6.b(if6Var, new y5(7, y9sVar2), new zep(nf6Var, xepVar, 1));
                }
                u75.h(unit, unit);
                return unit;
            case 4:
                pjc pjcVar = (pjc) obj;
                pjcVar.getClass();
                return new eno(new lco(pjcVar, (k3i) this.s, (bml) this.t, null, 4));
            case 5:
                pjc pjcVar2 = (pjc) obj;
                pjcVar2.getClass();
                return new ail(vut.S(pjcVar2, (k3i) this.s), (ezc) this.t);
            case 6:
                jsk.l((jsk) obj, (ksk) this.s, 0, 0, ((wiq) this.t).A, 4);
                return Unit.a;
            case 7:
                z6n z6nVar = (z6n) this.s;
                List list = (List) this.t;
                z6nVar.getClass();
                ((List) obj).add(new bir(list, dpo.v0));
                return Unit.a;
            case 8:
                jom jomVar = (jom) obj;
                jomVar.getClass();
                jomVar.g = (it7) this.s;
                jomVar.i = (String) this.t;
                return Unit.a;
            case 9:
                k6e k6eVar = (k6e) obj;
                k6eVar.getClass();
                ulr ulrVar = (ulr) this.s;
                ulrVar.e.z(ulrVar);
                bjq bjqVar = ulrVar.d;
                String str = ulrVar.a;
                nb7 nb7Var = (nb7) this.t;
                String uri = nb7Var.a.toString();
                uri.getClass();
                String b = bjqVar.b(str, new it7(uri), null, -1);
                mb7 a4 = nb7Var.a();
                a4.a = Uri.parse(b);
                nb7 a5 = a4.a();
                Uri uri2 = a5.a;
                uri2.getClass();
                ulrVar.f = uri2;
                ulrVar.g = 0L;
                ulrVar.h = SystemClock.elapsedRealtime();
                return Long.valueOf(k6eVar.a(a5));
            case 10:
                sm0 sm0Var = (sm0) obj;
                ((Function2) this.s).invoke(sm0Var.e.getValue(), ((oct) this.t).b.invoke(sm0Var.f));
                return Unit.a;
            case 11:
                fk0 fk0Var = (fk0) obj;
                fa0 fa0Var = (fa0) this.s;
                float floatValue = ((Number) fk0Var.e()).floatValue();
                uqn uqnVar = (uqn) this.t;
                fa0Var.a(floatValue - uqnVar.a);
                uqnVar.a = ((Number) fk0Var.e()).floatValue();
                return Unit.a;
            case 12:
                KeyEvent keyEvent = ((qaf) obj).a;
                toc tocVar = (toc) this.s;
                InputDevice device = keyEvent.getDevice();
                boolean z = false;
                if (device != null && device.supportsSource(513) && !device.isVirtual() && saf.U(keyEvent) == 2 && keyEvent.getSource() != 257) {
                    if (rzf.r(19, keyEvent)) {
                        z = ((uoc) tocVar).e(5);
                    } else if (rzf.r(20, keyEvent)) {
                        z = ((uoc) tocVar).e(6);
                    } else if (rzf.r(21, keyEvent)) {
                        z = ((uoc) tocVar).e(3);
                    } else if (rzf.r(22, keyEvent)) {
                        z = ((uoc) tocVar).e(4);
                    } else if (rzf.r(23, keyEvent)) {
                        c3r c3rVar = ((axf) this.t).c;
                        if (c3rVar != null) {
                            ((nw7) c3rVar).b();
                        }
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 13:
                return new mf0(11, (aqi) this.s, (uoi) this.t);
            case 14:
                u9s u9sVar = (u9s) obj;
                u6k u6kVar = ((z7g) this.t).b;
                ln0 ln0Var = (ln0) this.s;
                Object obj2 = ln0Var.a;
                hds a6 = ((p7g) obj2).a();
                c4r c4rVar = null;
                c4r c4rVar2 = a6 != null ? a6.a : null;
                c4r c4rVar3 = ((u6kVar.h() & 1) == 0 || (a3 = ((p7g) obj2).a()) == null) ? null : a3.b;
                if (c4rVar2 != null) {
                    c4rVar3 = c4rVar2.c(c4rVar3);
                }
                c4r c4rVar4 = ((u6kVar.h() & 2) == 0 || (a2 = ((p7g) obj2).a()) == null) ? null : a2.c;
                if (c4rVar3 != null) {
                    c4rVar4 = c4rVar3.c(c4rVar4);
                }
                if ((u6kVar.h() & 4) != 0 && (a = ((p7g) obj2).a()) != null) {
                    c4rVar = a.d;
                }
                if (c4rVar4 != null) {
                    c4rVar = c4rVar4.c(c4rVar);
                }
                tqn tqnVar = new tqn();
                mn0 mn0Var = u9sVar.a;
                lma lmaVar = new lma(23, tqnVar, ln0Var, c4rVar);
                mn0Var.getClass();
                kn0 kn0Var = new kn0(mn0Var);
                ArrayList arrayList = kn0Var.c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ln0 ln0Var2 = (ln0) lmaVar.invoke(((jn0) arrayList.get(i)).a(Integer.MIN_VALUE));
                    arrayList.set(i, new jn0(ln0Var2.b, ln0Var2.c, ln0Var2.a, ln0Var2.d));
                }
                u9sVar.b = kn0Var.h();
                return Unit.a;
            case 15:
                zco zcoVar = (zco) obj;
                gds gdsVar = (gds) this.s;
                ln0 ln0Var3 = (ln0) this.t;
                if (((Boolean) new tv2(gdsVar, 2).invoke()).booleanValue() && (cdsVar = (cds) gdsVar.a.getValue()) != null) {
                    ogi ogiVar = cdsVar.b;
                    ln0 c = gds.c(ln0Var3, cdsVar);
                    if (c != null) {
                        int i2 = c.c;
                        int i3 = c.b;
                        g = cdsVar.g(i3, i2);
                        ynn b2 = cdsVar.b(i3);
                        g.j(((Float.floatToRawIntBits(b2.b) & 4294967295L) | (Float.floatToRawIntBits(ogiVar.e(i3) == ogiVar.e(i2 - 1) ? Math.min(cdsVar.b(r5).a, b2.a) : 0.0f) << 32)) ^ (-9223372034707292160L));
                        vtmVar = g != null ? new vtm(g) : null;
                        if (vtmVar != null) {
                            zcoVar.r(vtmVar);
                            zcoVar.c(true);
                        }
                        return Unit.a;
                    }
                }
                g = null;
                if (g != null) {
                }
                if (vtmVar != null) {
                }
                return Unit.a;
            case 16:
                jsk jskVar = (jsk) obj;
                List list2 = (List) this.s;
                if (list2 != null) {
                    int size2 = list2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        Pair pair = (Pair) list2.get(i4);
                        jsk.f(jskVar, (ksk) pair.a, ((wpe) pair.b).a);
                    }
                }
                List list3 = (List) this.t;
                if (list3 != null) {
                    int size3 = list3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        Pair pair2 = (Pair) list3.get(i5);
                        ksk kskVar = (ksk) pair2.a;
                        Function0 function0 = (Function0) pair2.b;
                        jsk.f(jskVar, kskVar, function0 != null ? ((wpe) function0.invoke()).a : 0L);
                    }
                }
                return Unit.a;
            case 17:
                x97.y((mm6) this.s, null, pm6.d, new zp5((d8t) this.t, null), 1);
                return new wh0(2);
            case 18:
                d8t d8tVar = (d8t) this.s;
                d8t d8tVar2 = (d8t) this.t;
                d8tVar.j.add(d8tVar2);
                return new mf0(14, d8tVar, d8tVar2);
            case 19:
                return new mf0(15, (d8t) this.s, (t7t) this.t);
            case 20:
                d8t d8tVar3 = (d8t) this.s;
                z7t z7tVar = (z7t) this.t;
                d8tVar3.i.add(z7tVar);
                return new mf0(16, d8tVar3, z7tVar);
            case 21:
                xqn xqnVar = (xqn) this.s;
                Object d = ((kxt) obj).d();
                if (d == null) {
                    d = null;
                }
                if (!Intrinsics.d(xqnVar.a, d)) {
                    xqnVar.a = d;
                    ((rct) this.t).d(d);
                }
                return Unit.a;
            case 22:
                odt odtVar = (odt) obj;
                dxr dxrVar = (dxr) this.s;
                i5l i5lVar = (i5l) dxrVar.a;
                ldt ldtVar = (ldt) this.t;
                synchronized (i5lVar) {
                    try {
                        boolean d2 = odtVar.d();
                        e0h e0hVar = (e0h) dxrVar.b;
                        if (d2) {
                            e0hVar.put(ldtVar, odtVar);
                        } else {
                            e0hVar.remove(ldtVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Unit.a;
            case 23:
                ((Number) obj).longValue();
                wmt wmtVar = (wmt) this.s;
                float f = wmtVar.e;
                wmtVar.e = 0.0f;
                ((Function1) this.t).invoke(Float.valueOf(f));
                return Unit.a;
            case 24:
                pyc pycVar = ((lxt) this.s).v;
                txt txtVar = (txt) this.t;
                pycVar.invoke(txtVar.a, txtVar.b, (String) obj);
                return Unit.a;
            case 25:
                kxt kxtVar = (kxt) obj;
                if (((rxt) this.s).c.get(kxtVar.c()) == null) {
                    ((uif) this.t).invoke(kxtVar);
                }
                return Unit.a;
            case 26:
                kxt kxtVar2 = (kxt) obj;
                uxt uxtVar = (uxt) this.s;
                uxtVar.b.put(new Pair((String) this.t, kxtVar2.c()), kxtVar2);
                uxtVar.a();
                return Unit.a;
            case 27:
                fom fomVar = (fom) obj;
                fomVar.getClass();
                g8c g8cVar = ((l1u) this.s).j;
                DrmProxy drmProxy = (DrmProxy) this.t;
                g8cVar.getClass();
                fomVar.a = new jxj((l48) g8cVar.a, drmProxy);
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                int intValue = ((Number) obj).intValue();
                return ((j1p) this.s).invoke(Integer.valueOf(intValue), ((List) this.t).get(intValue));
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                vqn vqnVar = (vqn) this.s;
                ?? r1 = (ezc) this.t;
                int i6 = 0;
                while (i6 < recyclerView.getChildCount()) {
                    int i7 = i6 + 1;
                    View childAt = recyclerView.getChildAt(i6);
                    if (childAt == null) {
                        rj7.m();
                        return null;
                    }
                    yon layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager != null) {
                        vqnVar.a = Math.max(vqnVar.a, ((Number) r1.invoke(layoutManager, childAt)).intValue());
                    }
                    i6 = i7;
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public gcp(k3i k3iVar, Function2 function2) {
        super(1);
        this.r = 5;
        this.s = k3iVar;
        this.t = (ezc) function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gcp(int i, Object obj, Object obj2) {
        super(1);
        this.r = i;
        this.s = obj;
        this.t = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcp(gds gdsVar, ln0 ln0Var, z7g z7gVar) {
        super(1);
        this.r = 14;
        this.s = ln0Var;
        this.t = z7gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public gcp(rxt rxtVar, Function1 function1) {
        super(1);
        this.r = 25;
        this.s = rxtVar;
        this.t = (uif) function1;
    }
}
