package ru.yandex.taxi.summary.requirements.list.mapper;

import com.yandex.go.zone.dto.objects.ServiceLevel;
import com.yandex.go.zone.dto.objects.ServiceLevel$TariffCard$BulletAction$Deeplink;
import com.yandex.go.zone.dto.objects.w4;
import defpackage.anx0;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zmx0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lanx0;", "<anonymous>", "(Ltse;)Lanx0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.requirements.list.mapper.TariffRulesMapper$mapItem$2", f = "TariffRulesMapper.kt", l = {40, 41}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TariffRulesMapper$mapItem$2 extends SuspendLambda implements wls {
    final /* synthetic */ ServiceLevel.TariffCard.Bullet $item;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffRulesMapper$mapItem$2(b bVar, ServiceLevel.TariffCard.Bullet bullet, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$item = bullet;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TariffRulesMapper$mapItem$2 tariffRulesMapper$mapItem$2 = new TariffRulesMapper$mapItem$2(this.this$0, this.$item, continuation);
        tariffRulesMapper$mapItem$2.L$0 = obj;
        return tariffRulesMapper$mapItem$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TariffRulesMapper$mapItem$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String a;
        zmx0 zmx0Var;
        noh nohVar;
        zmx0 zmx0Var2;
        CharSequence charSequence;
        zmx0 zmx0Var3;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h = tje.h(tseVar, null, null, new TariffRulesMapper$mapItem$2$title$1(this.this$0, this.$item, null), 3);
            qoh h2 = tje.h(tseVar, null, null, new TariffRulesMapper$mapItem$2$subtitle$1(this.this$0, this.$item, null), 3);
            b bVar = this.this$0;
            String str = this.$item.c;
            bVar.getClass();
            a = str.length() == 0 ? null : ((m7x0) bVar.a).a(str);
            b bVar2 = this.this$0;
            w4 w4Var = this.$item.d;
            bVar2.getClass();
            if (w4Var instanceof ServiceLevel$TariffCard$BulletAction$Deeplink) {
                String str2 = ((ServiceLevel$TariffCard$BulletAction$Deeplink) w4Var).a;
                if (str2.length() > 0) {
                    zmx0Var = new zmx0(str2);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = h2;
                    this.L$3 = a;
                    this.L$4 = zmx0Var;
                    this.label = 1;
                    obj = h.s(this);
                    if (obj != coroutineSingletons) {
                        nohVar = h2;
                        zmx0Var2 = zmx0Var;
                    }
                    return coroutineSingletons;
                }
            }
            zmx0Var = null;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h2;
            this.L$3 = a;
            this.L$4 = zmx0Var;
            this.label = 1;
            obj = h.s(this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            CharSequence charSequence2 = (CharSequence) this.L$5;
            zmx0 zmx0Var4 = (zmx0) this.L$4;
            a = (String) this.L$3;
            kotlin.b.b(obj);
            zmx0Var3 = zmx0Var4;
            charSequence = charSequence2;
            return new anx0(charSequence, (CharSequence) obj, a, this.$item.c, zmx0Var3);
        }
        zmx0Var2 = (zmx0) this.L$4;
        a = (String) this.L$3;
        nohVar = (noh) this.L$2;
        kotlin.b.b(obj);
        CharSequence charSequence3 = (CharSequence) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = a;
        this.L$4 = zmx0Var2;
        this.L$5 = charSequence3;
        this.label = 2;
        Object k = nohVar.k(this);
        if (k != coroutineSingletons) {
            charSequence = charSequence3;
            zmx0Var3 = zmx0Var2;
            obj = k;
            return new anx0(charSequence, (CharSequence) obj, a, this.$item.c, zmx0Var3);
        }
        return coroutineSingletons;
    }
}
