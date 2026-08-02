package ru.yandex.taxi.summary.solid.interactor;

import android.graphics.drawable.BitmapDrawable;
import defpackage.bsf0;
import defpackage.e3n;
import defpackage.fei0;
import defpackage.g8e;
import defpackage.gsc;
import defpackage.hei0;
import defpackage.hk60;
import defpackage.kb5;
import defpackage.m0e;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.o430;
import defpackage.qd6;
import defpackage.qoh;
import defpackage.t0e;
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
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lgsc;", "Lqd6;", "<anonymous>", "(Ltse;)Lgsc;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.interactor.PromotionInfoInteractor$mapBottomNotification$2", f = "PromotionInfoInteractor.kt", l = {245, 247, 248, 249}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PromotionInfoInteractor$mapBottomNotification$2 extends SuspendLambda implements wls {
    final /* synthetic */ kb5 $info;
    final /* synthetic */ FormattedText $originalSubtitle;
    final /* synthetic */ FormattedText $originalTitle;
    final /* synthetic */ zkv0 $promo;
    final /* synthetic */ boolean $switched;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
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
    public PromotionInfoInteractor$mapBottomNotification$2(FormattedText formattedText, zkv0 zkv0Var, kb5 kb5Var, p pVar, FormattedText formattedText2, boolean z, Continuation continuation) {
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
        PromotionInfoInteractor$mapBottomNotification$2 promotionInfoInteractor$mapBottomNotification$2 = new PromotionInfoInteractor$mapBottomNotification$2(this.$originalSubtitle, this.$promo, this.$info, this.this$0, this.$originalTitle, this.$switched, continuation);
        promotionInfoInteractor$mapBottomNotification$2.L$0 = obj;
        return promotionInfoInteractor$mapBottomNotification$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PromotionInfoInteractor$mapBottomNotification$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0190  */
    /* JADX WARN: Type inference failed for: r11v17, types: [noh] */
    /* JADX WARN: Type inference failed for: r11v22, types: [noh] */
    /* JADX WARN: Type inference failed for: r11v27, types: [noh] */
    /* JADX WARN: Type inference failed for: r9v22, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        qoh h;
        noh h2;
        qoh h3;
        kb5 kb5Var;
        Integer c;
        BitmapDrawable bitmapDrawable;
        Object s;
        Integer num;
        kb5 kb5Var2;
        qoh qohVar;
        noh nohVar;
        qoh qohVar2;
        Object k;
        Integer num2;
        kb5 kb5Var3;
        qoh qohVar3;
        BitmapDrawable bitmapDrawable2;
        String str;
        noh nohVar2;
        CharSequence charSequence;
        Object k2;
        String str2;
        CharSequence charSequence2;
        Integer num3;
        BitmapDrawable bitmapDrawable3;
        CharSequence charSequence3;
        Object k3;
        String str3;
        Integer num4;
        CharSequence charSequence4;
        fei0 a;
        long j;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            h = tje.h(tseVar, null, null, new PromotionInfoInteractor$mapBottomNotification$2$title$1(this.this$0, this.$originalTitle, null), 3);
            FormattedText formattedText = this.$originalSubtitle;
            h2 = formattedText != null ? tje.h(tseVar, null, null, new PromotionInfoInteractor$mapBottomNotification$2$subtitle$1$1(this.this$0, formattedText, null), 3) : null;
            String str4 = this.$promo.e;
            qoh h4 = str4 != null ? tje.h(tseVar, null, null, new PromotionInfoInteractor$mapBottomNotification$2$leadIcon$1$1(this.this$0, str4, null), 3) : null;
            h3 = tje.h(tseVar, null, null, new PromotionInfoInteractor$mapBottomNotification$2$trail$1(this.this$0, this.$promo, this.$switched, null), 3);
            t0e t0eVar = this.$promo.j;
            m0e m0eVar = t0eVar instanceof m0e ? (m0e) t0eVar : null;
            String str5 = m0eVar != null ? m0eVar.a : null;
            kb5Var = this.$info;
            c = this.this$0.a.c(str5);
            if (h4 != null) {
                this.L$0 = null;
                this.L$1 = h;
                this.L$2 = h2;
                this.L$3 = null;
                this.L$4 = h3;
                this.L$5 = null;
                this.L$6 = c;
                this.L$7 = kb5Var;
                this.label = 1;
                s = h4.s(this);
                if (s != coroutineSingletons) {
                    num = c;
                    kb5Var2 = kb5Var;
                    qohVar = h;
                    nohVar = h2;
                    qohVar2 = h3;
                }
                return coroutineSingletons;
            }
            bitmapDrawable = null;
            String str6 = this.$promo.e;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h2;
            this.L$3 = null;
            this.L$4 = h3;
            this.L$5 = null;
            this.L$6 = c;
            this.L$7 = bitmapDrawable;
            this.L$8 = str6;
            this.L$9 = kb5Var;
            this.label = 2;
            k = h.k(this);
            if (k != coroutineSingletons) {
                noh nohVar3 = h2;
                num2 = c;
                kb5Var3 = kb5Var;
                qohVar3 = h3;
                bitmapDrawable2 = bitmapDrawable;
                str = str6;
                nohVar2 = nohVar3;
                charSequence = (CharSequence) k;
                if (nohVar2 != null) {
                }
                charSequence3 = "";
                BitmapDrawable bitmapDrawable4 = bitmapDrawable2;
                str2 = str;
                charSequence2 = charSequence;
                num3 = num2;
                bitmapDrawable3 = bitmapDrawable4;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = num3;
                this.L$7 = bitmapDrawable3;
                this.L$8 = str2;
                this.L$9 = charSequence2;
                this.L$10 = charSequence3;
                this.L$11 = kb5Var3;
                this.label = 4;
                k3 = qohVar3.k(this);
                if (k3 != coroutineSingletons) {
                }
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                kb5Var3 = (kb5) this.L$9;
                str = (String) this.L$8;
                bitmapDrawable2 = (BitmapDrawable) this.L$7;
                num2 = (Integer) this.L$6;
                ?? r11 = (noh) this.L$4;
                noh nohVar4 = (noh) this.L$2;
                kotlin.b.b(obj);
                nohVar2 = nohVar4;
                qohVar3 = r11;
                k = obj;
                charSequence = (CharSequence) k;
                if (nohVar2 != null) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = qohVar3;
                    this.L$5 = null;
                    this.L$6 = num2;
                    this.L$7 = bitmapDrawable2;
                    this.L$8 = str;
                    this.L$9 = charSequence;
                    this.L$10 = kb5Var3;
                    this.label = 3;
                    k2 = nohVar2.k(this);
                    if (k2 != coroutineSingletons) {
                        BitmapDrawable bitmapDrawable5 = bitmapDrawable2;
                        str2 = str;
                        charSequence2 = charSequence;
                        num3 = num2;
                        bitmapDrawable3 = bitmapDrawable5;
                        charSequence3 = (CharSequence) k2;
                        if (charSequence3 == null) {
                        }
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.L$6 = num3;
                        this.L$7 = bitmapDrawable3;
                        this.L$8 = str2;
                        this.L$9 = charSequence2;
                        this.L$10 = charSequence3;
                        this.L$11 = kb5Var3;
                        this.label = 4;
                        k3 = qohVar3.k(this);
                        if (k3 != coroutineSingletons) {
                        }
                    }
                    return coroutineSingletons;
                }
                charSequence3 = "";
                BitmapDrawable bitmapDrawable42 = bitmapDrawable2;
                str2 = str;
                charSequence2 = charSequence;
                num3 = num2;
                bitmapDrawable3 = bitmapDrawable42;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = num3;
                this.L$7 = bitmapDrawable3;
                this.L$8 = str2;
                this.L$9 = charSequence2;
                this.L$10 = charSequence3;
                this.L$11 = kb5Var3;
                this.label = 4;
                k3 = qohVar3.k(this);
                if (k3 != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                if (i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kb5Var3 = (kb5) this.L$11;
                CharSequence charSequence5 = (CharSequence) this.L$10;
                charSequence2 = (CharSequence) this.L$9;
                String str7 = (String) this.L$8;
                BitmapDrawable bitmapDrawable6 = (BitmapDrawable) this.L$7;
                Integer num5 = (Integer) this.L$6;
                kotlin.b.b(obj);
                charSequence4 = charSequence5;
                str3 = str7;
                bitmapDrawable3 = bitmapDrawable6;
                num4 = num5;
                k3 = obj;
                CharSequence charSequence6 = charSequence2;
                hk60 hk60Var = (hk60) k3;
                a = ((hei0) this.this$0.h).a();
                if (a == null) {
                    j = a.b;
                } else {
                    o430 o430Var = e3n.b;
                    j = 0;
                }
                long j2 = j;
                String str8 = this.$promo.b;
                Map z = str8 == null ? g8e.z("meta_id", str8) : kotlin.collections.b.f();
                zkv0 zkv0Var = this.$promo;
                Map map = zkv0Var.k;
                p pVar = this.this$0;
                return new gsc(kb5Var3, new qd6(num4, bitmapDrawable3, str3, charSequence6, charSequence4, hk60Var, new bsf0(pVar, zkv0Var, 0), new bsf0(pVar, zkv0Var, 1), j2, new bsf0(pVar, zkv0Var, 2), z, map, 32));
            }
            kb5Var3 = (kb5) this.L$10;
            charSequence2 = (CharSequence) this.L$9;
            String str9 = (String) this.L$8;
            BitmapDrawable bitmapDrawable7 = (BitmapDrawable) this.L$7;
            Integer num6 = (Integer) this.L$6;
            ?? r112 = (noh) this.L$4;
            kotlin.b.b(obj);
            qohVar3 = r112;
            num3 = num6;
            bitmapDrawable3 = bitmapDrawable7;
            str2 = str9;
            k2 = obj;
            charSequence3 = (CharSequence) k2;
            if (charSequence3 == null) {
                Integer num7 = num3;
                charSequence = charSequence2;
                str = str2;
                bitmapDrawable2 = bitmapDrawable3;
                num2 = num7;
                charSequence3 = "";
                BitmapDrawable bitmapDrawable422 = bitmapDrawable2;
                str2 = str;
                charSequence2 = charSequence;
                num3 = num2;
                bitmapDrawable3 = bitmapDrawable422;
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = num3;
            this.L$7 = bitmapDrawable3;
            this.L$8 = str2;
            this.L$9 = charSequence2;
            this.L$10 = charSequence3;
            this.L$11 = kb5Var3;
            this.label = 4;
            k3 = qohVar3.k(this);
            if (k3 != coroutineSingletons) {
                Integer num8 = num3;
                str3 = str2;
                num4 = num8;
                charSequence4 = charSequence3;
                CharSequence charSequence62 = charSequence2;
                hk60 hk60Var2 = (hk60) k3;
                a = ((hei0) this.this$0.h).a();
                if (a == null) {
                }
                long j22 = j;
                String str82 = this.$promo.b;
                Map z2 = str82 == null ? g8e.z("meta_id", str82) : kotlin.collections.b.f();
                zkv0 zkv0Var2 = this.$promo;
                Map map2 = zkv0Var2.k;
                p pVar2 = this.this$0;
                return new gsc(kb5Var3, new qd6(num4, bitmapDrawable3, str3, charSequence62, charSequence4, hk60Var2, new bsf0(pVar2, zkv0Var2, 0), new bsf0(pVar2, zkv0Var2, 1), j22, new bsf0(pVar2, zkv0Var2, 2), z2, map2, 32));
            }
            return coroutineSingletons;
        }
        kb5Var2 = (kb5) this.L$7;
        Integer num9 = (Integer) this.L$6;
        ?? r9 = (noh) this.L$4;
        noh nohVar5 = (noh) this.L$2;
        ?? r113 = (noh) this.L$1;
        kotlin.b.b(obj);
        qohVar = r113;
        nohVar = nohVar5;
        qohVar2 = r9;
        num = num9;
        s = obj;
        bitmapDrawable = (BitmapDrawable) s;
        qoh qohVar4 = qohVar;
        kb5Var = kb5Var2;
        c = num;
        h3 = qohVar2;
        h2 = nohVar;
        h = qohVar4;
        String str62 = this.$promo.e;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = h2;
        this.L$3 = null;
        this.L$4 = h3;
        this.L$5 = null;
        this.L$6 = c;
        this.L$7 = bitmapDrawable;
        this.L$8 = str62;
        this.L$9 = kb5Var;
        this.label = 2;
        k = h.k(this);
        if (k != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
