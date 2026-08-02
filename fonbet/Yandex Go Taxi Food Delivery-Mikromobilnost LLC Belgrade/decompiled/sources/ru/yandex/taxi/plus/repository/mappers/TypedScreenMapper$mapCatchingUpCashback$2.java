package ru.yandex.taxi.plus.repository.mappers;

import android.graphics.drawable.Drawable;
import defpackage.g59;
import defpackage.jmd0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ljmd0;", "<anonymous>", "(Ltse;)Ljmd0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.plus.repository.mappers.TypedScreenMapper$mapCatchingUpCashback$2", f = "TypedScreenMapper.kt", l = {HProv.ALG_SID_SHA3_256, HProv.ALG_SID_SHA3_384, 80, 81}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class TypedScreenMapper$mapCatchingUpCashback$2 extends SuspendLambda implements wls {
    final /* synthetic */ Map<String, String> $clientTemplates;
    final /* synthetic */ g59 $dto;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypedScreenMapper$mapCatchingUpCashback$2(g59 g59Var, Map map, Continuation continuation, d dVar) {
        super(2, continuation);
        this.$dto = g59Var;
        this.this$0 = dVar;
        this.$clientTemplates = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TypedScreenMapper$mapCatchingUpCashback$2 typedScreenMapper$mapCatchingUpCashback$2 = new TypedScreenMapper$mapCatchingUpCashback$2(this.$dto, this.$clientTemplates, continuation, this.this$0);
        typedScreenMapper$mapCatchingUpCashback$2.L$0 = obj;
        return typedScreenMapper$mapCatchingUpCashback$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TypedScreenMapper$mapCatchingUpCashback$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0111  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        noh nohVar;
        noh nohVar2;
        CharSequence charSequence;
        noh nohVar3;
        noh nohVar4;
        Object k;
        CharSequence charSequence2;
        noh nohVar5;
        CharSequence charSequence3;
        Object k2;
        Drawable drawable;
        CharSequence charSequence4;
        CharSequence charSequence5;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h2 = tje.h(tseVar, null, null, new TypedScreenMapper$mapCatchingUpCashback$2$deferredTitle$1(this.$dto, this.$clientTemplates, null, this.this$0), 3);
            qoh h3 = tje.h(tseVar, null, null, new TypedScreenMapper$mapCatchingUpCashback$2$deferredText$1(this.$dto, this.$clientTemplates, null, this.this$0), 3);
            qoh h4 = tje.h(tseVar, null, null, new TypedScreenMapper$mapCatchingUpCashback$2$deferredBackground$1(this.this$0, this.$dto, null), 3);
            h = tje.h(tseVar, null, null, new TypedScreenMapper$mapCatchingUpCashback$2$deferredImage$1(this.this$0, this.$dto, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h3;
            this.L$3 = h4;
            this.L$4 = h;
            this.label = 1;
            obj = h2.s(this);
            if (obj != coroutineSingletons) {
                nohVar = h3;
                nohVar2 = h4;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                charSequence = (CharSequence) this.L$5;
                nohVar4 = (noh) this.L$4;
                nohVar3 = (noh) this.L$3;
                kotlin.b.b(obj);
                CharSequence charSequence6 = (CharSequence) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = nohVar4;
                this.L$5 = charSequence;
                this.L$6 = charSequence6;
                this.label = 3;
                k = nohVar3.k(this);
                if (k != coroutineSingletons) {
                    CharSequence charSequence7 = charSequence;
                    charSequence2 = charSequence6;
                    obj = k;
                    nohVar5 = nohVar4;
                    charSequence3 = charSequence7;
                    Drawable drawable2 = (Drawable) obj;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = charSequence3;
                    this.L$6 = charSequence2;
                    this.L$7 = drawable2;
                    this.label = 4;
                    k2 = nohVar5.k(this);
                    if (k2 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                if (i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Drawable drawable3 = (Drawable) this.L$7;
                CharSequence charSequence8 = (CharSequence) this.L$6;
                CharSequence charSequence9 = (CharSequence) this.L$5;
                kotlin.b.b(obj);
                charSequence5 = charSequence8;
                charSequence4 = charSequence9;
                drawable = drawable3;
                this.$dto.getClass();
                return new jmd0(charSequence4, charSequence5, drawable, (Drawable) obj, "catching_up_cashback");
            }
            charSequence2 = (CharSequence) this.L$6;
            charSequence3 = (CharSequence) this.L$5;
            nohVar5 = (noh) this.L$4;
            kotlin.b.b(obj);
            Drawable drawable22 = (Drawable) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = charSequence3;
            this.L$6 = charSequence2;
            this.L$7 = drawable22;
            this.label = 4;
            k2 = nohVar5.k(this);
            if (k2 != coroutineSingletons) {
                drawable = drawable22;
                obj = k2;
                charSequence4 = charSequence3;
                charSequence5 = charSequence2;
                this.$dto.getClass();
                return new jmd0(charSequence4, charSequence5, drawable, (Drawable) obj, "catching_up_cashback");
            }
            return coroutineSingletons;
        }
        h = (noh) this.L$4;
        nohVar2 = (noh) this.L$3;
        nohVar = (noh) this.L$2;
        kotlin.b.b(obj);
        CharSequence charSequence10 = (CharSequence) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = nohVar2;
        this.L$4 = h;
        this.L$5 = charSequence10;
        this.label = 2;
        Object k3 = nohVar.k(this);
        if (k3 != coroutineSingletons) {
            noh nohVar6 = h;
            charSequence = charSequence10;
            obj = k3;
            nohVar3 = nohVar2;
            nohVar4 = nohVar6;
            CharSequence charSequence62 = (CharSequence) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = nohVar4;
            this.L$5 = charSequence;
            this.L$6 = charSequence62;
            this.label = 3;
            k = nohVar3.k(this);
            if (k != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
