package ru.yandex.taxi.summary.solid.interactor;

import android.graphics.drawable.BitmapDrawable;
import defpackage.bsf0;
import defpackage.cvz0;
import defpackage.g8e;
import defpackage.gsc;
import defpackage.hk60;
import defpackage.kb5;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zkv0;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lgsc;", "Lcvz0;", "<anonymous>", "(Ltse;)Lgsc;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.interactor.PromotionInfoInteractor$mapTooltipNotification$2", f = "PromotionInfoInteractor.kt", l = {282, 283, 284, HProv.ALG_SID_SHA_224, 286}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PromotionInfoInteractor$mapTooltipNotification$2 extends SuspendLambda implements wls {
    final /* synthetic */ kb5 $info;
    final /* synthetic */ FormattedText $originalSubtitle;
    final /* synthetic */ FormattedText $originalTitle;
    final /* synthetic */ zkv0 $promo;
    final /* synthetic */ boolean $switched;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotionInfoInteractor$mapTooltipNotification$2(FormattedText formattedText, zkv0 zkv0Var, kb5 kb5Var, p pVar, FormattedText formattedText2, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$originalSubtitle = formattedText;
        this.$promo = zkv0Var;
        this.$info = kb5Var;
        this.this$0 = pVar;
        this.$originalTitle = formattedText2;
        this.$switched = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PromotionInfoInteractor$mapTooltipNotification$2 promotionInfoInteractor$mapTooltipNotification$2 = new PromotionInfoInteractor$mapTooltipNotification$2(this.$originalSubtitle, this.$promo, this.$info, this.this$0, this.$originalTitle, this.$switched, continuation);
        promotionInfoInteractor$mapTooltipNotification$2.L$0 = obj;
        return promotionInfoInteractor$mapTooltipNotification$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PromotionInfoInteractor$mapTooltipNotification$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017d  */
    /* JADX WARN: Type inference failed for: r10v26, types: [noh] */
    /* JADX WARN: Type inference failed for: r10v31, types: [noh] */
    /* JADX WARN: Type inference failed for: r3v26, types: [noh] */
    /* JADX WARN: Type inference failed for: r8v14, types: [noh] */
    /* JADX WARN: Type inference failed for: r8v17, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        noh h2;
        qoh h3;
        qoh h4;
        kb5 kb5Var;
        BitmapDrawable bitmapDrawable;
        Object s;
        qoh qohVar;
        kb5 kb5Var2;
        Object k;
        noh nohVar;
        kb5 kb5Var3;
        CharSequence charSequence;
        Object k2;
        BitmapDrawable bitmapDrawable2;
        CharSequence charSequence2;
        CharSequence charSequence3;
        Object k3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        BitmapDrawable bitmapDrawable3;
        int intValue;
        Object k4;
        kb5 kb5Var4;
        BitmapDrawable bitmapDrawable4;
        CharSequence charSequence6;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            h = tje.h(tseVar, null, null, new PromotionInfoInteractor$mapTooltipNotification$2$title$1(this.this$0, this.$originalTitle, null), 3);
            FormattedText formattedText = this.$originalSubtitle;
            h2 = formattedText != null ? tje.h(tseVar, null, null, new PromotionInfoInteractor$mapTooltipNotification$2$subtitle$1$1(this.this$0, formattedText, null), 3) : null;
            String str = this.$promo.e;
            qoh h5 = str != null ? tje.h(tseVar, null, null, new PromotionInfoInteractor$mapTooltipNotification$2$leadIcon$1$1(this.this$0, str, null), 3) : null;
            h3 = tje.h(tseVar, null, null, new PromotionInfoInteractor$mapTooltipNotification$2$trail$1(this.this$0, this.$promo, this.$switched, null), 3);
            h4 = tje.h(tseVar, null, null, new PromotionInfoInteractor$mapTooltipNotification$2$backgroundColor$1(this.$promo, this.this$0, null), 3);
            kb5Var = this.$info;
            if (h5 != null) {
                this.L$0 = null;
                this.L$1 = h;
                this.L$2 = h2;
                this.L$3 = null;
                this.L$4 = h3;
                this.L$5 = h4;
                this.L$6 = kb5Var;
                this.label = 1;
                s = h5.s(this);
                if (s != coroutineSingletons) {
                    qohVar = h4;
                    kb5Var2 = kb5Var;
                }
                return coroutineSingletons;
            }
            bitmapDrawable = null;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h2;
            this.L$3 = null;
            this.L$4 = h3;
            this.L$5 = h4;
            this.L$6 = bitmapDrawable;
            this.L$7 = kb5Var;
            this.label = 2;
            k = h.k(this);
            if (k != coroutineSingletons) {
                nohVar = h4;
                kb5Var3 = kb5Var;
                charSequence = (CharSequence) k;
                if (h2 != null) {
                }
                charSequence3 = "";
                CharSequence charSequence7 = charSequence;
                bitmapDrawable2 = bitmapDrawable;
                charSequence2 = charSequence7;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = h3;
                this.L$5 = null;
                this.L$6 = bitmapDrawable2;
                this.L$7 = charSequence2;
                this.L$8 = charSequence3;
                this.L$9 = kb5Var3;
                this.label = 4;
                k3 = nohVar.k(this);
                if (k3 != coroutineSingletons) {
                }
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                kb5Var3 = (kb5) this.L$7;
                bitmapDrawable = (BitmapDrawable) this.L$6;
                noh nohVar2 = (noh) this.L$5;
                ?? r8 = (noh) this.L$4;
                h2 = (noh) this.L$2;
                kotlin.b.b(obj);
                h3 = r8;
                nohVar = nohVar2;
                k = obj;
                charSequence = (CharSequence) k;
                if (h2 != null) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = h3;
                    this.L$5 = nohVar;
                    this.L$6 = bitmapDrawable;
                    this.L$7 = charSequence;
                    this.L$8 = kb5Var3;
                    this.label = 3;
                    k2 = h2.k(this);
                    if (k2 != coroutineSingletons) {
                        bitmapDrawable2 = bitmapDrawable;
                        charSequence2 = charSequence;
                        charSequence3 = (CharSequence) k2;
                        if (charSequence3 == null) {
                        }
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = h3;
                        this.L$5 = null;
                        this.L$6 = bitmapDrawable2;
                        this.L$7 = charSequence2;
                        this.L$8 = charSequence3;
                        this.L$9 = kb5Var3;
                        this.label = 4;
                        k3 = nohVar.k(this);
                        if (k3 != coroutineSingletons) {
                        }
                    }
                    return coroutineSingletons;
                }
                charSequence3 = "";
                CharSequence charSequence72 = charSequence;
                bitmapDrawable2 = bitmapDrawable;
                charSequence2 = charSequence72;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = h3;
                this.L$5 = null;
                this.L$6 = bitmapDrawable2;
                this.L$7 = charSequence2;
                this.L$8 = charSequence3;
                this.L$9 = kb5Var3;
                this.label = 4;
                k3 = nohVar.k(this);
                if (k3 != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i == 3) {
                kb5Var3 = (kb5) this.L$8;
                charSequence2 = (CharSequence) this.L$7;
                bitmapDrawable2 = (BitmapDrawable) this.L$6;
                nohVar = (noh) this.L$5;
                ?? r10 = (noh) this.L$4;
                kotlin.b.b(obj);
                h3 = r10;
                k2 = obj;
                charSequence3 = (CharSequence) k2;
                if (charSequence3 == null) {
                    BitmapDrawable bitmapDrawable5 = bitmapDrawable2;
                    charSequence = charSequence2;
                    bitmapDrawable = bitmapDrawable5;
                    charSequence3 = "";
                    CharSequence charSequence722 = charSequence;
                    bitmapDrawable2 = bitmapDrawable;
                    charSequence2 = charSequence722;
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = h3;
                this.L$5 = null;
                this.L$6 = bitmapDrawable2;
                this.L$7 = charSequence2;
                this.L$8 = charSequence3;
                this.L$9 = kb5Var3;
                this.label = 4;
                k3 = nohVar.k(this);
                if (k3 != coroutineSingletons) {
                    BitmapDrawable bitmapDrawable6 = bitmapDrawable2;
                    charSequence4 = charSequence2;
                    charSequence5 = charSequence3;
                    bitmapDrawable3 = bitmapDrawable6;
                    intValue = ((Number) k3).intValue();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = bitmapDrawable3;
                    this.L$7 = charSequence4;
                    this.L$8 = charSequence5;
                    this.L$9 = kb5Var3;
                    this.I$0 = intValue;
                    this.label = 5;
                    k4 = h3.k(this);
                    if (k4 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i != 4) {
                if (i != 5) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i2 = this.I$0;
                kb5Var4 = (kb5) this.L$9;
                charSequence5 = (CharSequence) this.L$8;
                CharSequence charSequence8 = (CharSequence) this.L$7;
                BitmapDrawable bitmapDrawable7 = (BitmapDrawable) this.L$6;
                kotlin.b.b(obj);
                intValue = i2;
                charSequence6 = charSequence8;
                bitmapDrawable4 = bitmapDrawable7;
                k4 = obj;
                CharSequence charSequence9 = charSequence5;
                hk60 hk60Var = (hk60) k4;
                String str2 = this.$promo.b;
                Map z = str2 == null ? g8e.z("meta_id", str2) : kotlin.collections.b.f();
                p pVar = this.this$0;
                zkv0 zkv0Var = this.$promo;
                return new gsc(kb5Var4, new cvz0(intValue, bitmapDrawable4, charSequence6, charSequence9, hk60Var, new bsf0(pVar, zkv0Var, 3), new bsf0(pVar, zkv0Var, 4), z));
            }
            kb5Var3 = (kb5) this.L$9;
            charSequence5 = (CharSequence) this.L$8;
            charSequence4 = (CharSequence) this.L$7;
            BitmapDrawable bitmapDrawable8 = (BitmapDrawable) this.L$6;
            ?? r102 = (noh) this.L$4;
            kotlin.b.b(obj);
            h3 = r102;
            bitmapDrawable3 = bitmapDrawable8;
            k3 = obj;
            intValue = ((Number) k3).intValue();
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = bitmapDrawable3;
            this.L$7 = charSequence4;
            this.L$8 = charSequence5;
            this.L$9 = kb5Var3;
            this.I$0 = intValue;
            this.label = 5;
            k4 = h3.k(this);
            if (k4 != coroutineSingletons) {
                kb5Var4 = kb5Var3;
                bitmapDrawable4 = bitmapDrawable3;
                charSequence6 = charSequence4;
                CharSequence charSequence92 = charSequence5;
                hk60 hk60Var2 = (hk60) k4;
                String str22 = this.$promo.b;
                Map z2 = str22 == null ? g8e.z("meta_id", str22) : kotlin.collections.b.f();
                p pVar2 = this.this$0;
                zkv0 zkv0Var2 = this.$promo;
                return new gsc(kb5Var4, new cvz0(intValue, bitmapDrawable4, charSequence6, charSequence92, hk60Var2, new bsf0(pVar2, zkv0Var2, 3), new bsf0(pVar2, zkv0Var2, 4), z2));
            }
            return coroutineSingletons;
        }
        kb5Var2 = (kb5) this.L$6;
        ?? r3 = (noh) this.L$5;
        ?? r82 = (noh) this.L$4;
        h2 = (noh) this.L$2;
        h = (noh) this.L$1;
        kotlin.b.b(obj);
        h3 = r82;
        qohVar = r3;
        s = obj;
        bitmapDrawable = (BitmapDrawable) s;
        kb5Var = kb5Var2;
        h4 = qohVar;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = h2;
        this.L$3 = null;
        this.L$4 = h3;
        this.L$5 = h4;
        this.L$6 = bitmapDrawable;
        this.L$7 = kb5Var;
        this.label = 2;
        k = h.k(this);
        if (k != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
