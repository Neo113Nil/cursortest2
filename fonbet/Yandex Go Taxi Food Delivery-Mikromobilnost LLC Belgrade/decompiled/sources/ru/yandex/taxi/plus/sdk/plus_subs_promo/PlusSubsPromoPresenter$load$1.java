package ru.yandex.taxi.plus.sdk.plus_subs_promo;

import defpackage.c59;
import defpackage.g8e;
import defpackage.ho11;
import defpackage.imo;
import defpackage.jmd0;
import defpackage.jmo;
import defpackage.jst;
import defpackage.lmd0;
import defpackage.mmd0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.omd0;
import defpackage.tse;
import defpackage.uh6;
import defpackage.wls;
import defpackage.zqg;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.plus.sdk.existing_screens.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.plus.sdk.plus_subs_promo.PlusSubsPromoPresenter$load$1", f = "PlusSubsPromoPresenter.kt", l = {44}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PlusSubsPromoPresenter$load$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ omd0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusSubsPromoPresenter$load$1(omd0 omd0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = omd0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlusSubsPromoPresenter$load$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlusSubsPromoPresenter$load$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ho11 ho11Var = this.this$0.f;
            this.label = 1;
            obj = ho11Var.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        jmd0 jmd0Var = (jmd0) obj;
        omd0 omd0Var = this.this$0;
        if (jmd0Var != null) {
            ((lmd0) omd0Var.a).showLoading(false);
            ((lmd0) omd0Var.a).showContent(jmd0Var);
            jmo jmoVar = omd0Var.j;
            String str2 = jmd0Var.e;
            Calendar b = jmoVar.b.b();
            zqg zqgVar = jmoVar.c;
            Date time = b.getTime();
            TimeZone timeZone = b.getTimeZone();
            zqgVar.getClass();
            ThreadLocal threadLocal = zqg.c;
            String s = uh6.s(time, timeZone);
            c cVar = jmoVar.a;
            HashMap hashMap = new HashMap(cVar.b());
            hashMap.put(str2, s);
            r0 r0Var = cVar.b;
            ArrayList arrayList = new ArrayList(hashMap.size());
            for (Map.Entry entry : hashMap.entrySet()) {
                arrayList.add(new imo((String) entry.getKey(), (String) entry.getValue()));
            }
            r0Var.getClass();
            r0Var.m(null, arrayList);
            cVar.c(hashMap);
        } else {
            omd0Var.getClass();
            g8e.A(jst.e, "Try open not exist typed screen");
            mmd0 mmd0Var = omd0Var.e;
            mmd0Var.r();
            c59 c59Var = omd0Var.i;
            switch (c59Var.a) {
                case 0:
                    str = c59Var.b;
                    break;
                default:
                    str = c59Var.b;
                    break;
            }
            mmd0Var.x(str);
        }
        return zy11.a;
    }
}
