package ru.yandex.taxi.masstransit.geopayment.linkcard;

import android.net.Uri;
import com.yandex.payment.common.result.ResultType;
import defpackage.fmt;
import defpackage.in30;
import defpackage.je30;
import defpackage.jqr;
import defpackage.nky;
import defpackage.ny61;
import defpackage.pux0;
import defpackage.pw2;
import defpackage.pzt0;
import defpackage.qky;
import defpackage.t130;
import defpackage.tje;
import defpackage.tse;
import defpackage.zy11;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.masstransit.geopayment.checkout.u;
import ru.yandex.taxi.masstransit.geopayment.linkcard.network.MtLinkCardApi;

/* loaded from: classes6.dex */
public final class a {
    public final ru.yandex.taxi.masstransit.geopayment.linkcard.network.a a;
    public pzt0 b;
    public in30 c;

    public a(ru.yandex.taxi.masstransit.geopayment.linkcard.network.a aVar, pw2 pw2Var) {
        this.a = aVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|32|6|7|(0)(0)|12|13|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00dc, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00dd, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a2, code lost:
    
        defpackage.jst.e.k(r8, "Error while requesting mosmetro link-card");
        r8 = defpackage.s8o.M(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ad, code lost:
    
        if (r8 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b8, code lost:
    
        r8 = ((ru.yandex.taxi.masstransit.geopayment.checkout.u) r10).a;
        r8.S.f(false);
        r8.z((defpackage.m950) r8.M.get(), new defpackage.i26(2, r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d4, code lost:
    
        ((ru.yandex.taxi.masstransit.geopayment.checkout.u) r10).a();
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, tse tseVar, in30 in30Var, ContinuationImpl continuationImpl) {
        MtLinkCardInteractor$linkCardFlow$1 mtLinkCardInteractor$linkCardFlow$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof MtLinkCardInteractor$linkCardFlow$1) {
            mtLinkCardInteractor$linkCardFlow$1 = (MtLinkCardInteractor$linkCardFlow$1) continuationImpl;
            int i2 = mtLinkCardInteractor$linkCardFlow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtLinkCardInteractor$linkCardFlow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtLinkCardInteractor$linkCardFlow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtLinkCardInteractor$linkCardFlow$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String b = aVar.b("success");
                    String b2 = aVar.b(ResultType.RESULT_TYPE_FAILURE);
                    String b3 = aVar.b("cancel");
                    ru.yandex.taxi.masstransit.geopayment.linkcard.network.a aVar2 = aVar.a;
                    nky nkyVar = new nky(b, b2, b3);
                    mtLinkCardInteractor$linkCardFlow$1.L$0 = tseVar;
                    mtLinkCardInteractor$linkCardFlow$1.L$1 = in30Var;
                    mtLinkCardInteractor$linkCardFlow$1.L$2 = null;
                    mtLinkCardInteractor$linkCardFlow$1.L$3 = null;
                    mtLinkCardInteractor$linkCardFlow$1.L$4 = null;
                    mtLinkCardInteractor$linkCardFlow$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.b(((MtLinkCardApi) aVar2.a.getValue()).a(nkyVar), null, mtLinkCardInteractor$linkCardFlow$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    in30Var = (in30) mtLinkCardInteractor$linkCardFlow$1.L$1;
                    tseVar = (tse) mtLinkCardInteractor$linkCardFlow$1.L$0;
                    kotlin.b.b(obj);
                }
                Object obj2 = ((fmt) obj).a;
                String str = ((qky) obj2).a;
                String str2 = ((qky) obj2).b;
                aVar.c = in30Var;
                aVar.e(tseVar, str2, in30Var);
                ((u) in30Var).c(str, new t130(4, aVar, in30Var));
                return zy11.a;
            }
        }
        mtLinkCardInteractor$linkCardFlow$1 = new MtLinkCardInteractor$linkCardFlow$1(aVar, continuationImpl);
        Object obj3 = mtLinkCardInteractor$linkCardFlow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtLinkCardInteractor$linkCardFlow$1.label;
        if (i != 0) {
        }
        Object obj22 = ((fmt) obj3).a;
        String str3 = ((qky) obj22).a;
        String str22 = ((qky) obj22).b;
        aVar.c = in30Var;
        aVar.e(tseVar, str22, in30Var);
        ((u) in30Var).c(str3, new t130(4, aVar, in30Var));
        return zy11.a;
    }

    public final String b(String str) {
        return new Uri.Builder().scheme(pux0.c).authority("masstransit-checkout").appendQueryParameter("card_link_status", str).build().toString();
    }

    public final void c(String str, in30 in30Var) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        int hashCode = lowerCase.hashCode();
        if (hashCode == -1867169789) {
            if (lowerCase.equals("success")) {
                this.c = null;
                f();
                ((u) in30Var).b();
                return;
            }
            return;
        }
        if (hashCode != -1367724422) {
            if (hashCode == -1086574198 && lowerCase.equals(ResultType.RESULT_TYPE_FAILURE)) {
                this.c = null;
                f();
                ((u) in30Var).a();
                return;
            }
            return;
        }
        if (lowerCase.equals("cancel")) {
            this.c = null;
            f();
            je30 je30Var = ((u) in30Var).a;
            je30Var.S.f(false);
            b bVar = je30Var.W;
            if (bVar != null) {
                bVar.i();
            }
            je30Var.W = null;
        }
    }

    public final void d(tse tseVar, u uVar) {
        tje.N(tseVar, null, null, new MtLinkCardInteractor$startLinkCardFlow$1(this, tseVar, uVar, null), 3);
    }

    public final void e(tse tseVar, String str, in30 in30Var) {
        pzt0 pzt0Var = this.b;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.b = e.H(tseVar, new jqr(this.a.a(str), new MtLinkCardInteractor$startPolling$1(this, in30Var, null), 3));
    }

    public final void f() {
        pzt0 pzt0Var = this.b;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.b = null;
    }
}
