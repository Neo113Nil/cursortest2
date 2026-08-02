package ru.yandex.taxi.scooters.presentation.finish_info;

import defpackage.imn0;
import defpackage.krl0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.y1o0;
import defpackage.zgz;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackSettingsParams$Screen;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.finish_info.ScootersFinishInfoPresenter$completed$1", f = "ScootersFinishInfoPresenter.kt", l = {242}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class ScootersFinishInfoPresenter$completed$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $comment;
    final /* synthetic */ Integer $rating;
    Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersFinishInfoPresenter$completed$1(d dVar, Integer num, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$rating = num;
        this.$comment = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersFinishInfoPresenter$completed$1(this.this$0, this.$rating, this.$comment, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersFinishInfoPresenter$completed$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.coroutines.intrinsics.CoroutineSingletons, ru.yandex.taxi.scooters.presentation.finish_info.d] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        d dVar;
        String str;
        ?? r1 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                d dVar2 = this.this$0;
                Integer num = this.$rating;
                String str2 = this.$comment;
                try {
                    krl0 krl0Var = dVar2.y;
                    ru.yandex.taxi.scooters.presentation.feedback.domain.c cVar = dVar2.O;
                    imn0 imn0Var = dVar2.L;
                    String str3 = imn0Var.a;
                    String str4 = imn0Var.b;
                    ArrayList c = cVar.c(str3);
                    List b = cVar.b();
                    FeedbackSettingsParams$Screen feedbackSettingsParams$Screen = imn0Var.f;
                    y1o0 y1o0Var = dVar2.M;
                    krl0Var.c(feedbackSettingsParams$Screen, str3, str4, num, str2, c, b, y1o0Var != null ? new Integer(y1o0Var.a) : null);
                    String str5 = imn0Var.a;
                    String str6 = imn0Var.b;
                    this.L$0 = dVar2;
                    this.label = 1;
                    if (cVar.d(str5, str6, this) == r1) {
                        return r1;
                    }
                    dVar = dVar2;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    dVar = dVar2;
                    str = null;
                    zgz.a(str, th);
                    dVar.O.g();
                    dVar.I.invoke();
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dVar = (d) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    th = th2;
                    str = null;
                    zgz.a(str, th);
                    dVar.O.g();
                    dVar.I.invoke();
                    return zy11.a;
                }
            }
            dVar.O.g();
            dVar.I.invoke();
            return zy11.a;
        } catch (Throwable th3) {
            r1.O.g();
            r1.I.invoke();
            throw th3;
        }
    }
}
