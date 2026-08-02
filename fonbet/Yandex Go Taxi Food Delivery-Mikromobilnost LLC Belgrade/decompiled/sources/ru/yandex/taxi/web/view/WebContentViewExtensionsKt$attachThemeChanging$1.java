package ru.yandex.taxi.web.view;

import android.webkit.WebView;
import defpackage.jpx0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pwy0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.web.view.WebContentViewExtensionsKt$attachThemeChanging$1", f = "WebContentViewExtensions.kt", l = {12}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class WebContentViewExtensionsKt$attachThemeChanging$1 extends SuspendLambda implements wls {
    final /* synthetic */ pwy0 $themeTypeRepo;
    final /* synthetic */ WebView $this_attachThemeChanging;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebContentViewExtensionsKt$attachThemeChanging$1(pwy0 pwy0Var, WebView webView, Continuation continuation) {
        super(2, continuation);
        this.$themeTypeRepo = pwy0Var;
        this.$this_attachThemeChanging = webView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebContentViewExtensionsKt$attachThemeChanging$1(this.$themeTypeRepo, this.$this_attachThemeChanging, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebContentViewExtensionsKt$attachThemeChanging$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tpr a = this.$themeTypeRepo.a();
            jpx0 jpx0Var = new jpx0(8, this.$this_attachThemeChanging.getSettings());
            this.label = 1;
            if (a.collect(jpx0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
