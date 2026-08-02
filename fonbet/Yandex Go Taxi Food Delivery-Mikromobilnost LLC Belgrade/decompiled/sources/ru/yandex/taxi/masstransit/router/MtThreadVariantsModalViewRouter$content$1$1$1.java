package ru.yandex.taxi.masstransit.router;

import android.content.Intent;
import android.net.Uri;
import com.yandex.mapkit.geometry.Point;
import defpackage.a60;
import defpackage.agd;
import defpackage.ah00;
import defpackage.e100;
import defpackage.fu30;
import defpackage.gh00;
import defpackage.ih01;
import defpackage.is30;
import defpackage.jl40;
import defpackage.js30;
import defpackage.jst;
import defpackage.ks30;
import defpackage.ls30;
import defpackage.lz40;
import defpackage.mvg;
import defpackage.n640;
import defpackage.ny61;
import defpackage.nzs;
import defpackage.o640;
import defpackage.p640;
import defpackage.pt30;
import defpackage.qt30;
import defpackage.qu;
import defpackage.rt30;
import defpackage.st30;
import defpackage.syy0;
import defpackage.tcc;
import defpackage.tse;
import defpackage.tt30;
import defpackage.tyy0;
import defpackage.ut30;
import defpackage.uyy0;
import defpackage.v770;
import defpackage.vjx;
import defpackage.vt30;
import defpackage.vyy0;
import defpackage.w511;
import defpackage.wls;
import defpackage.wyy0;
import defpackage.x240;
import defpackage.yfd;
import defpackage.yw30;
import defpackage.zy11;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.masstransit.analytic.MasstransitPurchaseAnalytics$PurchaseScenariosSource;
import ru.yandex.taxi.masstransit.utils.RefreshState;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.router.MtThreadVariantsModalViewRouter$content$1$1$1", f = "MtThreadVariantsModalViewRouter.kt", l = {58}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtThreadVariantsModalViewRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ wyy0 $action;
    final /* synthetic */ n640 $navigator;
    final /* synthetic */ lz40 $refreshFlow;
    final /* synthetic */ yfd $this_buildContent;
    int label;
    final /* synthetic */ p640 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtThreadVariantsModalViewRouter$content$1$1$1(p640 p640Var, wyy0 wyy0Var, yfd yfdVar, n640 n640Var, lz40 lz40Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = p640Var;
        this.$action = wyy0Var;
        this.$this_buildContent = yfdVar;
        this.$navigator = n640Var;
        this.$refreshFlow = lz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtThreadVariantsModalViewRouter$content$1$1$1(this.this$0, this.$action, this.$this_buildContent, this.$navigator, this.$refreshFlow, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtThreadVariantsModalViewRouter$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e100 e100Var = this.this$0.J;
        wyy0 wyy0Var = this.$action;
        String str = ((o640) ((agd) this.$this_buildContent).a).d;
        n640 n640Var = this.$navigator;
        lz40 lz40Var = this.$refreshFlow;
        this.label = 1;
        e100Var.getClass();
        if (jl40.l(wyy0Var, syy0.c)) {
            obj2 = lz40Var.emit(RefreshState.ERROR_LOADING, this);
        } else {
            if (wyy0Var instanceof uyy0) {
                vjx vjxVar = ((uyy0) wyy0Var).a;
                Point point = (Point) vjxVar.b;
                Point point2 = (Point) vjxVar.c;
                long j = vjxVar.a;
                p640 p640Var = n640Var.a;
                ru.yandex.taxi.h hVar = p640Var.H;
                if (hVar.c("ru.yandex.rasp")) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                    Uri.Builder authority = new Uri.Builder().scheme("yandextrains").authority("search");
                    double latitude = point.getLatitude();
                    double longitude = point.getLongitude();
                    double latitude2 = point2.getLatitude();
                    double longitude2 = point2.getLongitude();
                    StringBuilder sb = new StringBuilder();
                    sb.append(latitude);
                    sb.append(",");
                    sb.append(longitude);
                    nzs.o(sb, "~", latitude2, ",");
                    sb.append(longitude2);
                    p640Var.G.startActivity(new Intent("android.intent.action.VIEW", authority.appendQueryParameter("rtext", sb.toString()).appendQueryParameter(MetaDataField.DATE_FIELD, simpleDateFormat.format(new Date(j))).build()));
                } else {
                    hVar.d("ru.yandex.rasp");
                }
            } else if (wyy0Var instanceof tyy0) {
                n640Var.a.r(new x240(4, (tyy0) wyy0Var));
            } else if (jl40.l(wyy0Var, syy0.b)) {
                ((gh00) ((ah00) e100Var.w)).w();
            } else if (jl40.l(wyy0Var, syy0.a)) {
                n640Var.a.r(new qu(9));
            } else if (jl40.l(wyy0Var, syy0.d)) {
                ih01 ih01Var = ((yw30) e100Var.b).c;
                ih01Var.getClass();
                HashMap hashMap = new HashMap();
                if (str != null) {
                    hashMap.put("source", str);
                }
                ih01Var.a.a("TransportVariants.Modal.Shown", hashMap, 1, new HashMap());
            } else {
                if (!(wyy0Var instanceof vyy0)) {
                    w511.b();
                    return null;
                }
                vt30 vt30Var = ((vyy0) wyy0Var).a;
                ls30 ls30Var = (ls30) e100Var.c;
                boolean z = vt30Var instanceof tt30;
                v770 v770Var = v770.c;
                if (z) {
                    ks30 ks30Var = ((tt30) vt30Var).a;
                    if (ks30Var instanceof is30) {
                        ((a60) n640Var.a.K).c(((is30) ks30Var).a, v770Var);
                    } else {
                        if (!(ks30Var instanceof js30)) {
                            w511.b();
                            return null;
                        }
                        jst.e.getClass();
                    }
                } else if (vt30Var instanceof ut30) {
                    String str2 = ((ut30) vt30Var).a;
                    if (str2 != null) {
                        ((a60) n640Var.a.K).c(str2, v770Var);
                    }
                } else if (vt30Var instanceof st30) {
                    ArrayList arrayList = ((st30) vt30Var).a;
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((fu30) it.next()).c);
                    }
                    ls30Var.c(arrayList2, MasstransitPurchaseAnalytics$PurchaseScenariosSource.Variants);
                } else if (vt30Var instanceof pt30) {
                    ls30Var.a(Collections.singletonList(((pt30) vt30Var).a.c), MasstransitPurchaseAnalytics$PurchaseScenariosSource.Variants);
                } else if (vt30Var instanceof qt30) {
                    ls30Var.b(MasstransitPurchaseAnalytics$PurchaseScenariosSource.Variants);
                } else if (!(vt30Var instanceof rt30)) {
                    w511.b();
                    return null;
                }
            }
            obj2 = zy11Var;
        }
        return obj2 == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
