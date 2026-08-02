package ru.yandex.taxi.logistics.sdk.promotions.impl.data;

import defpackage.ez40;
import defpackage.kme0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vng;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lez40;", "it", "Lzy11;", "<anonymous>", "(Lez40;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.promotions.impl.data.ShownCountRepository$incrementShowCount$2", f = "ShownCountRepository.kt", l = {42, 43}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ShownCountRepository$incrementShowCount$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $id;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShownCountRepository$incrementShowCount$2(e eVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ShownCountRepository$incrementShowCount$2 shownCountRepository$incrementShowCount$2 = new ShownCountRepository$incrementShowCount$2(this.this$0, this.$id, continuation);
        shownCountRepository$incrementShowCount$2.L$0 = obj;
        return shownCountRepository$incrementShowCount$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ShownCountRepository$incrementShowCount$2) create((ez40) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kme0 kme0Var;
        ez40 ez40Var;
        kme0 kme0Var2;
        ez40 ez40Var2;
        ez40 ez40Var3 = (ez40) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            String str = this.$id;
            eVar.getClass();
            kme0Var = new kme0("pref_show_count" + str);
            e eVar2 = this.this$0;
            String str2 = this.$id;
            this.L$0 = ez40Var3;
            this.L$1 = ez40Var3;
            this.L$2 = kme0Var;
            this.label = 1;
            obj = e.b(eVar2, str2, this);
            if (obj != coroutineSingletons) {
                ez40Var = ez40Var3;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kme0Var2 = (kme0) this.L$2;
            ez40Var2 = (ez40) this.L$1;
            kotlin.b.b(obj);
            ez40Var2.g(kme0Var2, new Integer(((Number) obj).intValue() + 1));
            e eVar3 = this.this$0;
            String str3 = this.$id;
            eVar3.getClass();
            ez40Var3.g(new kme0("pref_last_shown_date" + str3), new Long(vng.I()));
            return zy11.a;
        }
        kme0Var = (kme0) this.L$2;
        ez40Var = (ez40) this.L$1;
        kotlin.b.b(obj);
        ez40Var.g(kme0Var, new Integer(((Number) obj).intValue() + 1));
        e eVar4 = this.this$0;
        String str4 = this.$id;
        eVar4.getClass();
        kme0 kme0Var3 = new kme0("pref_daily_shown_count" + str4);
        e eVar5 = this.this$0;
        String str5 = this.$id;
        this.L$0 = ez40Var3;
        this.L$1 = ez40Var3;
        this.L$2 = kme0Var3;
        this.label = 2;
        obj = e.a(eVar5, str5, this);
        if (obj != coroutineSingletons) {
            kme0Var2 = kme0Var3;
            ez40Var2 = ez40Var3;
            ez40Var2.g(kme0Var2, new Integer(((Number) obj).intValue() + 1));
            e eVar32 = this.this$0;
            String str32 = this.$id;
            eVar32.getClass();
            ez40Var3.g(new kme0("pref_last_shown_date" + str32), new Long(vng.I()));
            return zy11.a;
        }
        return coroutineSingletons;
    }
}
