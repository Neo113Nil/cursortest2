package ru.yandex.taxi.summary.deeplink;

import android.net.Uri;
import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;
import com.yandex.go.taxi.summary.api.state.SummaryUiState$Type;
import com.yandex.go.taxi.tariffs.interactor.h;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.taxi.tariffs.repository.SelectedMultiTariffsRepositoryImpl$selectOnly$$inlined$performOperation$2;
import com.yandex.go.taxi.tariffs.repository.g;
import defpackage.a7t0;
import defpackage.arv0;
import defpackage.b64;
import defpackage.biv0;
import defpackage.c4r0;
import defpackage.ck31;
import defpackage.fnx0;
import defpackage.gnx0;
import defpackage.jl40;
import defpackage.jst;
import defpackage.krq0;
import defpackage.mi31;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.pzt0;
import defpackage.rft0;
import defpackage.rqv0;
import defpackage.sgx0;
import defpackage.tje;
import defpackage.tse;
import defpackage.vqv0;
import defpackage.wiq0;
import defpackage.xby;
import defpackage.y50;
import defpackage.yqv0;
import defpackage.zy11;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes6.dex */
public final class b {
    public final c4r0 a;
    public final wiq0 b;
    public final ck31 c;
    public final arv0 d;
    public final h e;
    public final y50 f;
    public final krq0 g;
    public final rft0 h;
    public final tse i;
    public final vqv0 j;
    public final biv0 k;
    public final g l;

    public b(c4r0 c4r0Var, wiq0 wiq0Var, ck31 ck31Var, arv0 arv0Var, h hVar, y50 y50Var, krq0 krq0Var, rft0 rft0Var, tse tseVar, vqv0 vqv0Var, biv0 biv0Var, g gVar) {
        this.a = c4r0Var;
        this.b = wiq0Var;
        this.c = ck31Var;
        this.d = arv0Var;
        this.e = hVar;
        this.f = y50Var;
        this.g = krq0Var;
        this.h = rft0Var;
        this.i = tseVar;
        this.j = vqv0Var;
        this.k = biv0Var;
        this.l = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0137, code lost:
    
        if (r0.a.emit(r2, r5) != r6) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, mi31 mi31Var, boolean z, Set set, SelectionOrigin selectionOrigin, ContinuationImpl continuationImpl) {
        TariffRedirectDeeplinkHandler$handleTaxiRedirect$1 tariffRedirectDeeplinkHandler$handleTaxiRedirect$1;
        int i;
        String h;
        boolean z2;
        Set set2;
        mi31 mi31Var2;
        pex0 m;
        sgx0 sgx0Var;
        String str;
        boolean z3;
        arv0 arv0Var = bVar.d;
        ck31 ck31Var = bVar.c;
        if (continuationImpl instanceof TariffRedirectDeeplinkHandler$handleTaxiRedirect$1) {
            tariffRedirectDeeplinkHandler$handleTaxiRedirect$1 = (TariffRedirectDeeplinkHandler$handleTaxiRedirect$1) continuationImpl;
            int i2 = tariffRedirectDeeplinkHandler$handleTaxiRedirect$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffRedirectDeeplinkHandler$handleTaxiRedirect$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tariffRedirectDeeplinkHandler$handleTaxiRedirect$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffRedirectDeeplinkHandler$handleTaxiRedirect$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    h = ((k) ck31Var).h();
                    if (mi31Var == null) {
                        z2 = z;
                        if (!jl40.l(((k) ck31Var).h(), h)) {
                        }
                        if (z2) {
                            vqv0 vqv0Var = bVar.j;
                            rqv0 rqv0Var = new rqv0(sgx0Var, SummaryExpandReason.AUTO_ROUTE_DEEPLINK, null);
                            tariffRedirectDeeplinkHandler$handleTaxiRedirect$1.L$0 = null;
                            tariffRedirectDeeplinkHandler$handleTaxiRedirect$1.L$1 = null;
                            tariffRedirectDeeplinkHandler$handleTaxiRedirect$1.L$2 = null;
                            tariffRedirectDeeplinkHandler$handleTaxiRedirect$1.L$3 = null;
                            tariffRedirectDeeplinkHandler$handleTaxiRedirect$1.L$4 = null;
                            tariffRedirectDeeplinkHandler$handleTaxiRedirect$1.L$5 = null;
                            tariffRedirectDeeplinkHandler$handleTaxiRedirect$1.Z$0 = z2;
                            tariffRedirectDeeplinkHandler$handleTaxiRedirect$1.label = 2;
                        }
                        return zy11.a;
                    }
                    pzt0 a = bVar.a.a(new gnx0(new fnx0(mi31Var, selectionOrigin), true));
                    if (a != null) {
                        tariffRedirectDeeplinkHandler$handleTaxiRedirect$1.L$0 = mi31Var;
                        tariffRedirectDeeplinkHandler$handleTaxiRedirect$1.L$1 = set;
                        tariffRedirectDeeplinkHandler$handleTaxiRedirect$1.L$2 = null;
                        tariffRedirectDeeplinkHandler$handleTaxiRedirect$1.L$3 = h;
                        z2 = z;
                        tariffRedirectDeeplinkHandler$handleTaxiRedirect$1.Z$0 = z2;
                        tariffRedirectDeeplinkHandler$handleTaxiRedirect$1.label = 1;
                        obj = a.u0(tariffRedirectDeeplinkHandler$handleTaxiRedirect$1);
                        if (obj != coroutineSingletons) {
                            set2 = set;
                            mi31Var2 = mi31Var;
                        }
                        return coroutineSingletons;
                    }
                    z2 = z;
                    set2 = set;
                    mi31Var2 = mi31Var;
                    pex0 pex0Var = mi31Var2.a;
                    str = mi31Var2.b;
                    z3 = pex0Var.K0;
                    if (z3 && set2 != null) {
                        xby.l(jst.e, "Preorder.RouteDeeplink.SelectedClasses", null, null, b64.l("Trying to use selectedClasses for non-multiclass tariff: ", mi31Var2.f, " in vertical: ", str), 6);
                    } else if (z3 && set2 != null) {
                        g gVar = bVar.l;
                        tje.N(gVar.c, null, null, new SelectedMultiTariffsRepositoryImpl$selectOnly$$inlined$performOperation$2(gVar, str, null, set2), 3);
                    }
                    if (!jl40.l(((k) ck31Var).h(), h)) {
                        a7t0 a7t0Var = (a7t0) arv0Var;
                        if (a7t0Var.a().a == SummaryUiState$Type.TRAP) {
                            a7t0Var.b(new yqv0(SummaryUiState$Type.NORMAL, ""));
                        }
                    }
                    if (z2 && (m = ((k) bVar.b).m()) != null && (sgx0Var = m.J0) != null) {
                        vqv0 vqv0Var2 = bVar.j;
                        rqv0 rqv0Var2 = new rqv0(sgx0Var, SummaryExpandReason.AUTO_ROUTE_DEEPLINK, null);
                        tariffRedirectDeeplinkHandler$handleTaxiRedirect$1.L$0 = null;
                        tariffRedirectDeeplinkHandler$handleTaxiRedirect$1.L$1 = null;
                        tariffRedirectDeeplinkHandler$handleTaxiRedirect$1.L$2 = null;
                        tariffRedirectDeeplinkHandler$handleTaxiRedirect$1.L$3 = null;
                        tariffRedirectDeeplinkHandler$handleTaxiRedirect$1.L$4 = null;
                        tariffRedirectDeeplinkHandler$handleTaxiRedirect$1.L$5 = null;
                        tariffRedirectDeeplinkHandler$handleTaxiRedirect$1.Z$0 = z2;
                        tariffRedirectDeeplinkHandler$handleTaxiRedirect$1.label = 2;
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                boolean z4 = tariffRedirectDeeplinkHandler$handleTaxiRedirect$1.Z$0;
                h = (String) tariffRedirectDeeplinkHandler$handleTaxiRedirect$1.L$3;
                set2 = (Set) tariffRedirectDeeplinkHandler$handleTaxiRedirect$1.L$1;
                mi31Var2 = (mi31) tariffRedirectDeeplinkHandler$handleTaxiRedirect$1.L$0;
                kotlin.b.b(obj);
                z2 = z4;
                pex0 pex0Var2 = mi31Var2.a;
                str = mi31Var2.b;
                z3 = pex0Var2.K0;
                if (z3) {
                }
                if (z3) {
                    g gVar2 = bVar.l;
                    tje.N(gVar2.c, null, null, new SelectedMultiTariffsRepositoryImpl$selectOnly$$inlined$performOperation$2(gVar2, str, null, set2), 3);
                }
                if (!jl40.l(((k) ck31Var).h(), h)) {
                }
                if (z2) {
                }
                return zy11.a;
            }
        }
        tariffRedirectDeeplinkHandler$handleTaxiRedirect$1 = new TariffRedirectDeeplinkHandler$handleTaxiRedirect$1(bVar, continuationImpl);
        Object obj2 = tariffRedirectDeeplinkHandler$handleTaxiRedirect$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffRedirectDeeplinkHandler$handleTaxiRedirect$1.label;
        if (i != 0) {
        }
        pex0 pex0Var22 = mi31Var2.a;
        str = mi31Var2.b;
        z3 = pex0Var22.K0;
        if (z3) {
        }
        if (z3) {
        }
        if (!jl40.l(((k) ck31Var).h(), h)) {
        }
        if (z2) {
        }
        return zy11.a;
    }

    public static void b(b bVar, Uri uri) {
        tje.N(bVar.i, null, null, new TariffRedirectDeeplinkHandler$handleRedirectDeeplink$1(uri, bVar, SelectionOrigin.DEEPLINK, null), 3);
    }
}
