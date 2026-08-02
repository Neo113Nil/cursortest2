package ru.yandex.taxi.summary.promotions.interactor;

import android.graphics.drawable.Drawable;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.bdc;
import defpackage.bq2;
import defpackage.j0e;
import defpackage.kdc;
import defpackage.l051;
import defpackage.ly3;
import defpackage.m051;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny6;
import defpackage.ny61;
import defpackage.o051;
import defpackage.p051;
import defpackage.pdc;
import defpackage.qoh;
import defpackage.qtb1;
import defpackage.r051;
import defpackage.r8c0;
import defpackage.s051;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.u051;
import defpackage.ufj;
import defpackage.ufu;
import defpackage.v051;
import defpackage.vfj;
import defpackage.w511;
import defpackage.wfj;
import defpackage.wls;
import defpackage.xng0;
import defpackage.yp2;
import defpackage.z051;
import defpackage.zfj;
import defpackage.zkv0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.communications.model.TextAlign;
import ru.yandex.taxi.communications.model.widgets.ActionButton;
import ru.yandex.taxi.summary.promotions.analytics.SummaryPromotionsAnalytics$SummaryState;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lufj;", "<anonymous>", "(Ltse;)Lufj;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.promotions.interactor.SummaryDialogueConverter$extractDialog$2", f = "SummaryDialogueConverter.kt", l = {70, 71}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummaryDialogueConverter$extractDialog$2 extends SuspendLambda implements wls {
    final /* synthetic */ j0e $dialog;
    final /* synthetic */ zkv0 $promotion;
    final /* synthetic */ SummaryPromotionsAnalytics$SummaryState $summaryState;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryDialogueConverter$extractDialog$2(a aVar, j0e j0eVar, zkv0 zkv0Var, SummaryPromotionsAnalytics$SummaryState summaryPromotionsAnalytics$SummaryState, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$dialog = j0eVar;
        this.$promotion = zkv0Var;
        this.$summaryState = summaryPromotionsAnalytics$SummaryState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SummaryDialogueConverter$extractDialog$2 summaryDialogueConverter$extractDialog$2 = new SummaryDialogueConverter$extractDialog$2(this.this$0, this.$dialog, this.$promotion, this.$summaryState, continuation);
        summaryDialogueConverter$extractDialog$2.L$0 = obj;
        return summaryDialogueConverter$extractDialog$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryDialogueConverter$extractDialog$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x007c, code lost:
    
        if (r1 == r2) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        Integer c;
        Object s;
        Drawable drawable;
        Object k;
        Integer num;
        z051 z051Var;
        wfj wfjVar;
        Iterator it;
        pdc pdcVar;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            h = tje.h(tseVar, null, null, new SummaryDialogueConverter$extractDialog$2$title$1(this.this$0, this.$promotion, null), 3);
            qoh h2 = tje.h(tseVar, null, null, new SummaryDialogueConverter$extractDialog$2$image$1(this.this$0, this.$promotion, null), 3);
            c = this.this$0.a.c(this.$dialog.a);
            this.L$0 = null;
            this.L$1 = h;
            this.L$2 = null;
            this.L$3 = c;
            this.label = 1;
            s = h2.s(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                drawable = (Drawable) this.L$4;
                Integer num2 = (Integer) this.L$3;
                kotlin.b.b(obj);
                k = obj;
                num = num2;
                Drawable drawable2 = drawable;
                CharSequence charSequence = (CharSequence) k;
                a aVar = this.this$0;
                zkv0 zkv0Var = this.$promotion;
                SummaryPromotionsAnalytics$SummaryState summaryPromotionsAnalytics$SummaryState = this.$summaryState;
                aVar.getClass();
                z051Var = zkv0Var.f;
                if (!(z051Var instanceof m051)) {
                    List list = ((m051) z051Var).a;
                    yp2 yp2Var = aVar.d;
                    pdc pdcVar2 = aVar.b;
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ActionButton actionButton = (ActionButton) it2.next();
                        String str = actionButton.c;
                        String str2 = actionButton.d;
                        ufu ufuVar = (ufu) pdcVar2;
                        kdc b = ufuVar.b(str);
                        if (b == null) {
                            it = it2;
                            b = new bdc(xng0.controlMinor);
                        } else {
                            it = it2;
                        }
                        String str3 = actionButton.b;
                        kdc i2 = ufuVar.i(str2);
                        if (i2 == null) {
                            pdcVar = pdcVar2;
                            i2 = new bdc(xng0.textOnControlMinor);
                        } else {
                            pdcVar = pdcVar2;
                        }
                        arrayList.add(new zfj(new ny6(b, str3, i2, new r8c0(aVar, zkv0Var, summaryPromotionsAnalytics$SummaryState, actionButton, 14)), yp2Var.a(actionButton.c, AppColor$Palette.ControlMinor), yp2Var.a(str2, AppColor$Palette.TextOnControlMinor)));
                        it2 = it;
                        pdcVar2 = pdcVar;
                    }
                    wfjVar = new vfj(arrayList);
                } else {
                    if (!z051Var.equals(s051.a) && !(z051Var instanceof l051) && !(z051Var instanceof o051) && !(z051Var instanceof p051) && !(z051Var instanceof r051) && !(z051Var instanceof u051) && !(z051Var instanceof v051)) {
                        w511.b();
                        return null;
                    }
                    wfjVar = qtb1.B;
                }
                wfj wfjVar2 = wfjVar;
                j0e j0eVar = this.$dialog;
                TextAlign textAlign = j0eVar.b;
                Boolean bool = j0eVar.c;
                return new ufj(num, drawable2, charSequence, wfjVar2, textAlign, bool == null ? bool.booleanValue() : false, ly3.g(bq2.b, this.this$0.d, this.$dialog.a), this.$promotion.e);
            }
            Integer num3 = (Integer) this.L$3;
            h = (noh) this.L$1;
            kotlin.b.b(obj);
            c = num3;
            s = obj;
        }
        drawable = (Drawable) s;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = c;
        this.L$4 = drawable;
        this.label = 2;
        k = h.k(this);
        if (k != coroutineSingletons) {
            num = c;
            Drawable drawable22 = drawable;
            CharSequence charSequence2 = (CharSequence) k;
            a aVar2 = this.this$0;
            zkv0 zkv0Var2 = this.$promotion;
            SummaryPromotionsAnalytics$SummaryState summaryPromotionsAnalytics$SummaryState2 = this.$summaryState;
            aVar2.getClass();
            z051Var = zkv0Var2.f;
            if (!(z051Var instanceof m051)) {
            }
            wfj wfjVar22 = wfjVar;
            j0e j0eVar2 = this.$dialog;
            TextAlign textAlign2 = j0eVar2.b;
            Boolean bool2 = j0eVar2.c;
            return new ufj(num, drawable22, charSequence2, wfjVar22, textAlign2, bool2 == null ? bool2.booleanValue() : false, ly3.g(bq2.b, this.this$0.d, this.$dialog.a), this.$promotion.e);
        }
        return coroutineSingletons;
    }
}
