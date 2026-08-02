package ru.yandex.taxi.banners.presentation.fullscreen;

import defpackage.gr4;
import defpackage.his;
import defpackage.iux0;
import defpackage.jis;
import defpackage.jst;
import defpackage.kis;
import defpackage.ltc;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.promotions.model.PromotionBackground;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.banners.presentation.fullscreen.FullScreenBannerPage$setupMedia$2", f = "FullScreenBannerPage.kt", l = {249}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class FullScreenBannerPage$setupMedia$2 extends SuspendLambda implements wls {
    final /* synthetic */ gr4 $animation;
    final /* synthetic */ List<PromotionBackground> $backgrounds;
    final /* synthetic */ String $foregroundImageUrl;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ FullScreenBannerPage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenBannerPage$setupMedia$2(FullScreenBannerPage fullScreenBannerPage, List list, String str, gr4 gr4Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fullScreenBannerPage;
        this.$backgrounds = list;
        this.$foregroundImageUrl = str;
        this.$animation = gr4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FullScreenBannerPage$setupMedia$2 fullScreenBannerPage$setupMedia$2 = new FullScreenBannerPage$setupMedia$2(this.this$0, this.$backgrounds, this.$foregroundImageUrl, this.$animation, continuation);
        fullScreenBannerPage$setupMedia$2.L$0 = obj;
        return fullScreenBannerPage$setupMedia$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FullScreenBannerPage$setupMedia$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ltc ltcVar;
        ltc ltcVar2;
        FullScreenBannerPage fullScreenBannerPage;
        List<PromotionBackground> list;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                FullScreenBannerPage fullScreenBannerPage2 = this.this$0;
                List<PromotionBackground> list2 = this.$backgrounds;
                String str = this.$foregroundImageUrl;
                gr4 gr4Var = this.$animation;
                ltcVar = fullScreenBannerPage2.communicationsErrorsInteractor;
                try {
                    List g = scc.g(tje.h(tseVar, null, null, new FullScreenBannerPage$setupMedia$2$1$results$1(fullScreenBannerPage2, str, null), 3), tje.h(tseVar, null, null, new FullScreenBannerPage$setupMedia$2$1$results$2(fullScreenBannerPage2, list2, null), 3), tje.h(tseVar, null, null, new FullScreenBannerPage$setupMedia$2$1$results$3(fullScreenBannerPage2, gr4Var, null), 3));
                    this.L$0 = null;
                    this.L$1 = fullScreenBannerPage2;
                    this.L$2 = list2;
                    this.L$3 = ltcVar;
                    this.label = 1;
                    Object b = kotlinx.coroutines.a.b(g, this);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = b;
                    fullScreenBannerPage = fullScreenBannerPage2;
                    list = list2;
                    ltcVar2 = ltcVar;
                } catch (Throwable th) {
                    th = th;
                    ltcVar2 = ltcVar;
                    iux0 iux0Var = (iux0) ltcVar2;
                    iux0Var.getClass();
                    jst.e.i(iux0Var.a("Unexpected error", new String[0]), th);
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ltcVar2 = (ltc) this.L$3;
                list = (List) this.L$2;
                fullScreenBannerPage = (FullScreenBannerPage) this.L$1;
                try {
                    b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    iux0 iux0Var2 = (iux0) ltcVar2;
                    iux0Var2.getClass();
                    jst.e.i(iux0Var2.a("Unexpected error", new String[0]), th);
                    return zy11.a;
                }
            }
            List list3 = (List) obj;
            List list4 = list3;
            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    if (((kis) it.next()) instanceof his) {
                        break;
                    }
                }
            }
            fullScreenBannerPage.removeLoadingAnimation();
            fullScreenBannerPage.setColorBackground(list);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list3) {
                if (obj2 instanceof jis) {
                    arrayList.add(obj2);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((jis) it2.next()).a.invoke();
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
