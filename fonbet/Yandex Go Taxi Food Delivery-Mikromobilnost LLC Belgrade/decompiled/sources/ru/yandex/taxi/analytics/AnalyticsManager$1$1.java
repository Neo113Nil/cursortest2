package ru.yandex.taxi.analytics;

import defpackage.jb20;
import defpackage.kb20;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ph1;
import defpackage.tse;
import defpackage.wls;
import defpackage.yb20;
import defpackage.zl60;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.analytics.AnalyticsManager$1$1", f = "AnalyticsManager.kt", l = {71}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class AnalyticsManager$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ yb20 $metricaParameters;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsManager$1$1(j jVar, yb20 yb20Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
        this.$metricaParameters = yb20Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AnalyticsManager$1$1(this.this$0, this.$metricaParameters, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AnalyticsManager$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        String str = null;
        if (i == 0) {
            kotlin.b.b(obj);
            kb20 kb20Var = this.this$0.b;
            String str2 = this.$metricaParameters.a;
            if (str2 == null) {
                str2 = "";
            }
            String c = kb20Var.c(str2, "SAVE_UNSUPPORTED_CHAR", "METRICA_UUID");
            kb20Var.f = new jb20(c, 0);
            kb20Var.d.r(kb20Var.b, c);
            kb20 kb20Var2 = this.this$0.b;
            String str3 = this.$metricaParameters.b;
            if (str3 != null) {
                str = kb20Var2.c(str3, "SAVE_UNSUPPORTED_CHAR", "METRICA_DEVICE_ID");
            } else {
                kb20Var2.getClass();
            }
            kb20Var2.g = new ph1(str, 1);
            zl60 zl60Var = kb20Var2.a;
            zl60Var.getClass();
            if (str3 == null) {
                zl60Var.a = new IllegalArgumentException("appmetricaDeviceId was set to null");
            }
            kb20Var2.d.r(kb20Var2.c, str);
            CrashlyticsInteractor crashlyticsInteractor = this.this$0.f;
            String str4 = this.$metricaParameters.b;
            String str5 = str4 != null ? str4 : "";
            this.label = 1;
            if (crashlyticsInteractor.d(str5, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
