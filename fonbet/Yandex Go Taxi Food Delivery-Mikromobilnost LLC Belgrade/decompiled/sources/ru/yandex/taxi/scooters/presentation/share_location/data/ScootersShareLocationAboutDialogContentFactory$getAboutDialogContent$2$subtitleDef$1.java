package ru.yandex.taxi.scooters.presentation.share_location.data;

import defpackage.f9s;
import defpackage.fvo0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/CharSequence;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.share_location.data.ScootersShareLocationAboutDialogContentFactory$getAboutDialogContent$2$subtitleDef$1", f = "ScootersShareLocationAboutDialogContentFactory.kt", l = {22}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersShareLocationAboutDialogContentFactory$getAboutDialogContent$2$subtitleDef$1 extends SuspendLambda implements wls {
    final /* synthetic */ fvo0.a $aboutDialogContent;
    final /* synthetic */ fvo0 $experiment;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersShareLocationAboutDialogContentFactory$getAboutDialogContent$2$subtitleDef$1(a aVar, fvo0.a aVar2, fvo0 fvo0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$aboutDialogContent = aVar2;
        this.$experiment = fvo0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersShareLocationAboutDialogContentFactory$getAboutDialogContent$2$subtitleDef$1(this.this$0, this.$aboutDialogContent, this.$experiment, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersShareLocationAboutDialogContentFactory$getAboutDialogContent$2$subtitleDef$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        a aVar = this.this$0;
        FormattedText formattedText = this.$aboutDialogContent.b;
        fvo0 fvo0Var = this.$experiment;
        this.label = 1;
        Object t = aVar.a.t(f9s.e(formattedText, fvo0Var), this);
        return t == coroutineSingletons ? coroutineSingletons : t;
    }
}
