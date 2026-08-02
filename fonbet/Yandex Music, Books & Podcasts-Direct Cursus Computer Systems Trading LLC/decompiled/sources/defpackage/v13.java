package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.session.i;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import java.util.Objects;

/* loaded from: classes5.dex */
public final /* synthetic */ class v13 implements ra7, nn5, ycg, zcg, t1s, OnCompleteListener, qlh, ua6, fmh, rth, fvh {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v13(ulh ulhVar, alp alpVar) {
        this.a = 18;
        Bundle bundle = Bundle.EMPTY;
        this.b = ulhVar;
        this.c = alpVar;
    }

    @Override // defpackage.nn5
    public Object C(rdk rdkVar) {
        String valueOf;
        switch (this.a) {
            case 2:
                String str = (String) this.b;
                vm5 vm5Var = (vm5) this.c;
                try {
                    Trace.beginSection(str);
                    return vm5Var.f.C(rdkVar);
                } finally {
                    Trace.endSection();
                }
            default:
                String str2 = (String) this.b;
                kac kacVar = (kac) this.c;
                Context context = (Context) rdkVar.b(Context.class);
                switch (kacVar.a) {
                    case 1:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                        valueOf = "";
                        break;
                    case 2:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null) {
                            valueOf = String.valueOf(applicationInfo2.minSdkVersion);
                            break;
                        }
                        valueOf = "";
                        break;
                    case 3:
                        if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                    if (Build.VERSION.SDK_INT >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                        valueOf = "embedded";
                                        break;
                                    }
                                    valueOf = "";
                                    break;
                                } else {
                                    valueOf = "auto";
                                    break;
                                }
                            } else {
                                valueOf = "watch";
                                break;
                            }
                        } else {
                            valueOf = "tv";
                            break;
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            valueOf = FirebaseCommonRegistrar.a(installerPackageName);
                            break;
                        }
                        valueOf = "";
                        break;
                }
                return new ld2(str2, valueOf);
        }
    }

    @Override // defpackage.rth
    public void a(wrh wrhVar) {
        switch (this.a) {
            case 25:
                sth sthVar = (sth) this.b;
                gin ginVar = (gin) this.c;
                i iVar = sthVar.h;
                onh m1 = iVar.t.m1();
                if (m1 != null) {
                    iVar.e.Y(iVar.k, iVar.u(wrhVar), m1.a, ginVar);
                    break;
                }
                break;
            default:
                sth sthVar2 = (sth) this.b;
                String str = ((pmh) this.c).a;
                if (TextUtils.isEmpty(str)) {
                    vq1.n0("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                    break;
                } else {
                    lrl lrlVar = sthVar2.h.t;
                    if (lrlVar.V0(17)) {
                        sis V = lrlVar.V();
                        ris risVar = new ris();
                        for (int i = 0; i < V.o(); i++) {
                            if (TextUtils.equals(V.m(i, risVar, 0L).c.a, str)) {
                                lrlVar.I(i);
                                break;
                            }
                        }
                        break;
                    } else {
                        vq1.n0("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                        break;
                    }
                }
        }
    }

    @Override // defpackage.ua6
    public void accept(Object obj) {
        switch (this.a) {
            case 22:
                ikh ikhVar = (ikh) obj;
                ikhVar.c(((bmh) this.b).b, (yde) ((mmo) this.c).e);
                ikhVar.d();
                break;
            case 27:
                gvh gvhVar = (gvh) this.b;
                w0t w0tVar = (w0t) this.c;
                lrl lrlVar = (lrl) obj;
                cee ceeVar = w0tVar.D;
                if (!ceeVar.isEmpty()) {
                    v0t c = w0tVar.a().c();
                    xkt it = ceeVar.values().iterator();
                    while (it.hasNext()) {
                        s0t s0tVar = (s0t) it.next();
                        xvs xvsVar = (xvs) gvhVar.k.h.get(s0tVar.a.b);
                        if (xvsVar == null || s0tVar.a.a != xvsVar.a) {
                            c.a(s0tVar);
                        } else {
                            c.a(new s0t(xvsVar, s0tVar.b));
                        }
                    }
                    w0tVar = c.b();
                }
                lrlVar.H(w0tVar);
                break;
            default:
                gvh gvhVar2 = (gvh) this.b;
                wrh wrhVar = (wrh) this.c;
                i iVar = (i) gvhVar2.a.get();
                if (iVar != null && !iVar.k()) {
                    iVar.h(wrhVar, false);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.qlh
    public void b(c9e c9eVar, int i) {
        switch (this.a) {
            case 16:
                c9eVar.q(((ulh) this.b).c, i, ((w0t) this.c).c());
                break;
            case 17:
                c9eVar.H(((ulh) this.b).c, i, ((onh) this.c).e(true), true);
                break;
            case 18:
                ulh ulhVar = (ulh) this.b;
                alp alpVar = (alp) this.c;
                c9eVar.K(ulhVar.c, i, alpVar.b(), Bundle.EMPTY);
                break;
            case 19:
                c9eVar.N(((ulh) this.b).c, i, ((hoh) this.c).c());
                break;
            default:
                ulh ulhVar2 = (ulh) this.b;
                p0l p0lVar = (p0l) this.c;
                gmh gmhVar = ulhVar2.c;
                Bundle bundle = new Bundle();
                bundle.putFloat(p0l.e, p0lVar.a);
                bundle.putFloat(p0l.f, p0lVar.b);
                c9eVar.J(gmhVar, i, bundle);
                break;
        }
    }

    @Override // defpackage.zcg
    public void c(Object obj, xgc xgcVar) {
        uj7 uj7Var = (uj7) this.b;
        i8l i8lVar = (i8l) this.c;
        d80 d80Var = (d80) obj;
        SparseArray sparseArray = uj7Var.e;
        nnk nnkVar = new nnk();
        nnkVar.a = xgcVar;
        SparseBooleanArray sparseBooleanArray = xgcVar.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            int b = xgcVar.b(i);
            c80 c80Var = (c80) sparseArray.get(b);
            c80Var.getClass();
            sparseArray2.append(b, c80Var);
        }
        nnkVar.b = sparseArray2;
        d80Var.t(i8lVar, nnkVar);
    }

    @Override // defpackage.ra7
    public ta7 e() {
        br3 br3Var = (br3) this.b;
        hp3 hp3Var = new hp3((liq) this.c, 5242880L);
        return br3Var.d.a ? new yq3(hp3Var) : hp3Var;
    }

    @Override // defpackage.fmh
    public void f(ulh ulhVar) {
        pdl pdlVar;
        rdl rdlVar = (rdl) this.b;
        pdl pdlVar2 = (pdl) this.c;
        if (ulhVar.isConnected()) {
            rdl rdlVar2 = ulhVar.G;
            if (rdlVar2 != null && (pdlVar = ulhVar.H) != null) {
                Pair e = vwh.e(rdlVar2, pdlVar, rdlVar, pdlVar2, ulhVar.x);
                rdl rdlVar3 = (rdl) e.first;
                pdlVar2 = (pdl) e.second;
                rdlVar = rdlVar3;
            }
            ulhVar.G = null;
            ulhVar.H = null;
            if (!ulhVar.k.isEmpty()) {
                ulhVar.G = rdlVar;
                ulhVar.H = pdlVar2;
                return;
            }
            rdl rdlVar4 = ulhVar.o;
            rdl rdlVar5 = (rdl) vwh.e(rdlVar4, pdl.c, rdlVar, pdlVar2, ulhVar.x).first;
            ulhVar.o = rdlVar5;
            Integer valueOf = (rdlVar4.d.equals(rdlVar.d) && rdlVar4.e.equals(rdlVar.e)) ? null : Integer.valueOf(rdlVar5.f);
            Integer valueOf2 = !Objects.equals(rdlVar4.s(), rdlVar5.s()) ? Integer.valueOf(rdlVar5.b) : null;
            Integer valueOf3 = !rdlVar4.j.equals(rdlVar5.j) ? Integer.valueOf(rdlVar5.k) : null;
            int i = rdlVar4.u;
            int i2 = rdlVar5.u;
            ulhVar.h1(rdlVar4, rdlVar5, valueOf3, (i == i2 && rdlVar4.t == rdlVar5.t) ? null : Integer.valueOf(i2), valueOf, valueOf2);
        }
    }

    @Override // defpackage.fvh
    public Object h(i iVar, wrh wrhVar, int i) {
        return iVar.o(wrhVar, (alp) this.b, (Bundle) this.c);
    }

    @Override // defpackage.ycg
    public void invoke(Object obj) {
        switch (this.a) {
            case 4:
                ((d80) obj).l((c80) this.b, this.c);
                break;
            case 5:
                ((d80) obj).i((c80) this.b, (p0l) this.c);
                break;
            case 6:
                ((d80) obj).l0((c80) this.b, (e3t) this.c);
                break;
            case 7:
                ((d80) obj).j0((c80) this.b, (hoh) this.c);
                break;
            case 8:
                ((d80) obj).k((c80) this.b, (u2i) this.c);
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            default:
                mmo mmoVar = (mmo) this.b;
                Integer num = (Integer) this.c;
                ((f8l) obj).I(num.intValue(), ((rdl) mmoVar.b).s());
                break;
            case 10:
                ((d80) obj).q((c80) this.b, (dv1) this.c);
                break;
            case 11:
                ((d80) obj).p0((c80) this.b, (hzk) this.c);
                break;
            case 12:
                c80 c80Var = (c80) this.b;
                tcu tcuVar = (tcu) this.c;
                d80 d80Var = (d80) obj;
                d80Var.s(c80Var, tcuVar);
                d80Var.u(c80Var, tcuVar.a, tcuVar.b);
                break;
            case 20:
                ((f8l) obj).I(((Integer) this.c).intValue(), (onh) this.b);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((m8b) this.b).a((Intent) this.c);
    }

    public /* synthetic */ v13(c80 c80Var, Object obj, long j) {
        this.a = 4;
        this.b = c80Var;
        this.c = obj;
    }

    public /* synthetic */ v13(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
