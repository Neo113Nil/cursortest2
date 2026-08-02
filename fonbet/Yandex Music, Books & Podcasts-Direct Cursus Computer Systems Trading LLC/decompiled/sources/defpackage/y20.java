package defpackage;

import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.t;
import com.yandex.plus.home.feature.webviews.internal.stories.list.f;
import com.yandex.plus.home.feature.webviews.internal.stories.p;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.b1;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.z0;
import defpackage.aqi;
import defpackage.dzf;
import defpackage.kyf;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class y20 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y20(nvq nvqVar, zsq zsqVar, boolean z, String str) {
        this.a = 6;
        this.d = zsqVar;
        this.b = z;
        this.c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 2;
        int i3 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object obj2 = this.d;
        Object obj3 = this.c;
        final boolean z = this.b;
        switch (i) {
            case 0:
                String str = (String) obj3;
                String str2 = (String) obj2;
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                cko D0 = xjoVar.D0("UPDATE album SET liked = ?, timestamp = ? WHERE original_id = ?");
                try {
                    D0.bindLong(1, z ? 1L : 0L);
                    D0.E(2, str);
                    D0.E(3, str2);
                    D0.q();
                    D0.close();
                    return Unit.a;
                } catch (Throwable th) {
                    D0.close();
                    throw th;
                }
            case 1:
                w32 w32Var = (w32) obj3;
                q32 q32Var = (q32) obj2;
                vuf vufVar = (vuf) obj;
                vufVar.getClass();
                if (!Intrinsics.d(w32Var, u32.a)) {
                    if (!(w32Var instanceof v32)) {
                        b6e.s();
                        return null;
                    }
                    vuf.Y(vufVar, null, new wn5(new qt(q32Var, w32Var, z, i2), -1274867652, true), 3);
                }
                return Unit.a;
            case 2:
                c3r c3rVar = (c3r) obj3;
                Function0 function0 = (Function0) obj2;
                ((obf) obj).getClass();
                if (z) {
                    if (c3rVar != null) {
                        ((nw7) c3rVar).a();
                    }
                    function0.invoke();
                }
                return Unit.a;
            case 3:
                rjm rjmVar = (rjm) obj3;
                ojm ojmVar = (ojm) obj2;
                n9b n9bVar = (n9b) obj;
                n9bVar.getClass();
                wn5 wn5Var = new wn5(new pjm(rjmVar, objArr3 == true ? 1 : 0), 468916905, true);
                ubi ubiVar = n9bVar.a;
                ubiVar.a(wn5Var);
                List list = rjmVar.e;
                if (list != null) {
                    ild.e(n9bVar, list, new mjm((int) (objArr2 == true ? 1 : 0), (Object) ojmVar));
                }
                List list2 = rjmVar.f;
                if (list2 != null) {
                    qld.h(n9bVar, list2);
                }
                lg3.D(n9bVar, 32);
                if (z) {
                    ubiVar.a(new wn5(new wl3(new ebm(0, ojmVar, ojm.class, "onUnSubscribeClick", "onUnSubscribeClick()V", 0, 13), r5), -1080324040, true));
                } else {
                    ubiVar.a(new wn5(new wl3((Function0) new ebm(0, ojmVar, ojm.class, "onSubscribeClick", "onSubscribeClick()V", 0, 14), (boolean) (objArr == true ? 1 : 0)), -1080324040, true));
                }
                return Unit.a;
            case 4:
                ((kpm) obj3).J((bve) obj2, z && ((Boolean) obj).booleanValue());
                return Unit.a;
            case 5:
                ((oa8) obj).getClass();
                return new pxo((vp5) obj3, (mxo) obj2, z, objArr4 == true ? 1 : 0);
            case 6:
                String str3 = (String) obj3;
                rmb rmbVar = (rmb) obj;
                rmbVar.getClass();
                thj B = nvq.B((zsq) obj2);
                if (z) {
                    rmbVar.l(null, B, str3);
                } else {
                    rmbVar.f(B, null);
                }
                return Unit.a;
            case 7:
                r4t r4tVar = (r4t) obj;
                r4tVar.getClass();
                t4t t4tVar = ((e6t) obj3).k;
                int a = r4tVar.a((mqs) obj2);
                t4tVar.getClass();
                nmb b = t4tVar.b();
                kmb kmbVar = kmb.Tap;
                pkb pkbVar = pkb.SmartPreview;
                String d = t4t.d(r4tVar, a);
                int i4 = a + 1;
                String G = t4tVar.a.a.G();
                wjb wjbVar = wjb.TrailerScreen;
                pkb pkbVar2 = pkb.Trailer;
                String a2 = t4tVar.a();
                String d2 = t4t.d(r4tVar, a);
                s4t[] s4tVarArr = s4t.a;
                nmb.g(b, kmbVar, G, wjbVar, null, null, null, pkbVar2, a2, pkbVar, d, 1, i4, null, 0, false, "SMART_PREVIEW", d2, 2, r4tVar.a, null, null, null, 0, z ? "unlike" : "like", 15888440);
                return Unit.a;
            case 8:
                dzf dzfVar = (dzf) obj3;
                final aqi aqiVar = (aqi) obj2;
                ((oa8) obj).getClass();
                uyf uyfVar = new uyf() { // from class: com.yandex.passport.internal.ui.challenge.logout.bottomsheet.s
                    @Override // defpackage.uyf
                    public final void Q(dzf dzfVar2, kyf kyfVar) {
                        if (u.a[kyfVar.ordinal()] == 1) {
                            aqi aqiVar2 = aqiVar;
                            if (((Boolean) aqiVar2.getValue()).booleanValue() || !z) {
                                return;
                            }
                            aqiVar2.setValue(Boolean.TRUE);
                        }
                    }
                };
                dzfVar.getLifecycle().a(uyfVar);
                return new t(dzfVar, uyfVar, i3);
            default:
                b1 b1Var = (b1) obj3;
                z0 z0Var = (z0) obj2;
                p pVar = (p) obj;
                s9f[] s9fVarArr = f.i;
                if (pVar != null) {
                    pVar.F(z, b1Var, z0Var);
                }
                return Unit.a;
        }
    }

    public /* synthetic */ y20(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    public /* synthetic */ y20(Object obj, boolean z, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    public /* synthetic */ y20(boolean z, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
        this.d = obj2;
    }
}
