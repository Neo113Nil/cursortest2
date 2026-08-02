package ru.yandex.taxi.surge.interactor;

import android.graphics.drawable.BitmapDrawable;
import defpackage.mvg;
import defpackage.ntq;
import defpackage.ny61;
import defpackage.otq;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lotq;", "<anonymous>", "(Ltse;)Lotq;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.interactor.SurgePriceComplainStateInteractor$mapOptions$2$1$1", f = "SurgePriceComplainStateInteractor.kt", l = {147}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SurgePriceComplainStateInteractor$mapOptions$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ ntq $option;
    final /* synthetic */ Set<String> $selectedOptionsIds;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgePriceComplainStateInteractor$mapOptions$2$1$1(ntq ntqVar, r rVar, Set set, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$option = ntqVar;
        this.this$0 = rVar;
        this.$selectedOptionsIds = set;
        this.$isEnabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SurgePriceComplainStateInteractor$mapOptions$2$1$1(this.$option, this.this$0, this.$selectedOptionsIds, this.$isEnabled, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SurgePriceComplainStateInteractor$mapOptions$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ntq ntqVar = this.$option;
            str = ntqVar.a;
            String str3 = ntqVar.b;
            ru.yandex.taxi.widget.utils.e eVar = this.this$0.c;
            String str4 = ntqVar.c;
            this.L$0 = str;
            this.L$1 = str3;
            this.label = 1;
            obj = ru.yandex.taxi.widget.utils.e.f(eVar, str4, null, this, 6);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            str2 = str3;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str5 = (String) this.L$1;
            str = (String) this.L$0;
            kotlin.b.b(obj);
            str2 = str5;
        }
        return new otq(str, str2, (BitmapDrawable) obj, this.$selectedOptionsIds.contains(this.$option.a), this.$isEnabled);
    }
}
