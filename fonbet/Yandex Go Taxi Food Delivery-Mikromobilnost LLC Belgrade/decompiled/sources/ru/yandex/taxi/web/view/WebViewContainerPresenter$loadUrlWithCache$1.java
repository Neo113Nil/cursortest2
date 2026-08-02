package ru.yandex.taxi.web.view;

import defpackage.hn41;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.controller.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.web.view.WebViewContainerPresenter$loadUrlWithCache$1", f = "WebViewContainerPresenter.kt", l = {151}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class WebViewContainerPresenter$loadUrlWithCache$1 extends SuspendLambda implements wls {
    final /* synthetic */ b $cacheLoader;
    final /* synthetic */ String $token;
    final /* synthetic */ String $url;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ hn41 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewContainerPresenter$loadUrlWithCache$1(b bVar, String str, hn41 hn41Var, String str2, Continuation continuation) {
        super(2, continuation);
        this.$cacheLoader = bVar;
        this.$token = str;
        this.this$0 = hn41Var;
        this.$url = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebViewContainerPresenter$loadUrlWithCache$1(this.$cacheLoader, this.$token, this.this$0, this.$url, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebViewContainerPresenter$loadUrlWithCache$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        hn41 hn41Var;
        String str;
        hn41 hn41Var2;
        String str2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                b bVar = this.$cacheLoader;
                String str3 = this.$token;
                hn41 hn41Var3 = this.this$0;
                String str4 = this.$url;
                try {
                    this.L$0 = hn41Var3;
                    this.L$1 = str4;
                    this.L$2 = hn41Var3;
                    this.L$3 = str4;
                    this.label = 1;
                    obj = bVar.c(str3, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    hn41Var2 = hn41Var3;
                    hn41Var = hn41Var2;
                    str = str4;
                    str2 = str;
                } catch (Throwable unused) {
                    hn41Var = hn41Var3;
                    str = str4;
                    hn41Var.Lg(str);
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) this.L$3;
                hn41Var = (hn41) this.L$2;
                str2 = (String) this.L$1;
                hn41Var2 = (hn41) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable unused2) {
                    hn41Var.Lg(str);
                    return zy11.a;
                }
            }
            hn41Var2.Ng(str2, (String) obj);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
