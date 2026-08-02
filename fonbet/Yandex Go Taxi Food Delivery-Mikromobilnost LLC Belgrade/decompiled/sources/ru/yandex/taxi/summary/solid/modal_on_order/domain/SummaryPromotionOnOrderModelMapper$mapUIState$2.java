package ru.yandex.taxi.summary.solid.modal_on_order.domain;

import android.graphics.drawable.Drawable;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.imv0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.p230;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zkv0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.communications.model.widgets.ActionButton;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lp230;", "<anonymous>", "(Ltse;)Lp230;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.modal_on_order.domain.SummaryPromotionOnOrderModelMapper$mapUIState$2", f = "SummaryPromotionOnOrderModelMapper.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE, 52, 53}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummaryPromotionOnOrderModelMapper$mapUIState$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<ActionButton> $buttons;
    final /* synthetic */ zkv0 $promotion;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ imv0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryPromotionOnOrderModelMapper$mapUIState$2(zkv0 zkv0Var, List list, imv0 imv0Var, Continuation continuation) {
        super(2, continuation);
        this.$promotion = zkv0Var;
        this.$buttons = list;
        this.this$0 = imv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SummaryPromotionOnOrderModelMapper$mapUIState$2 summaryPromotionOnOrderModelMapper$mapUIState$2 = new SummaryPromotionOnOrderModelMapper$mapUIState$2(this.$promotion, this.$buttons, this.this$0, continuation);
        summaryPromotionOnOrderModelMapper$mapUIState$2.L$0 = obj;
        return summaryPromotionOnOrderModelMapper$mapUIState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryPromotionOnOrderModelMapper$mapUIState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00e1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        noh nohVar;
        String str;
        Drawable drawable;
        noh nohVar2;
        String str2;
        Object k;
        CharSequence charSequence;
        String str3;
        Drawable drawable2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h2 = tje.h(tseVar, null, null, new SummaryPromotionOnOrderModelMapper$mapUIState$2$title$1(this.this$0, this.$promotion, null), 3);
            h = tje.h(tseVar, null, null, new SummaryPromotionOnOrderModelMapper$mapUIState$2$text$1(this.this$0, this.$promotion, null), 3);
            qoh h3 = tje.h(tseVar, null, null, new SummaryPromotionOnOrderModelMapper$mapUIState$2$drawable$1(this.this$0, this.$promotion, null), 3);
            String str4 = this.$promotion.a;
            this.L$0 = null;
            this.L$1 = h2;
            this.L$2 = h;
            this.L$3 = null;
            this.L$4 = str4;
            this.label = 1;
            Object s = h3.s(this);
            if (s != coroutineSingletons) {
                nohVar = h2;
                obj = s;
                str = str4;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                CharSequence charSequence2 = (CharSequence) this.L$6;
                Drawable drawable3 = (Drawable) this.L$5;
                String str5 = (String) this.L$4;
                kotlin.b.b(obj);
                drawable2 = drawable3;
                str3 = str5;
                charSequence = charSequence2;
                return new p230(str3, drawable2, charSequence, (CharSequence) obj, this.$buttons);
            }
            drawable = (Drawable) this.L$5;
            str2 = (String) this.L$4;
            nohVar2 = (noh) this.L$2;
            kotlin.b.b(obj);
            CharSequence charSequence3 = (CharSequence) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = str2;
            this.L$5 = drawable;
            this.L$6 = charSequence3;
            this.label = 3;
            k = nohVar2.k(this);
            if (k != coroutineSingletons) {
                charSequence = charSequence3;
                obj = k;
                str3 = str2;
                drawable2 = drawable;
                return new p230(str3, drawable2, charSequence, (CharSequence) obj, this.$buttons);
            }
            return coroutineSingletons;
        }
        str = (String) this.L$4;
        h = (noh) this.L$2;
        nohVar = (noh) this.L$1;
        kotlin.b.b(obj);
        Drawable drawable4 = (Drawable) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = h;
        this.L$3 = null;
        this.L$4 = str;
        this.L$5 = drawable4;
        this.label = 2;
        Object k2 = nohVar.k(this);
        if (k2 != coroutineSingletons) {
            String str6 = str;
            drawable = drawable4;
            obj = k2;
            nohVar2 = h;
            str2 = str6;
            CharSequence charSequence32 = (CharSequence) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = str2;
            this.L$5 = drawable;
            this.L$6 = charSequence32;
            this.label = 3;
            k = nohVar2.k(this);
            if (k != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
