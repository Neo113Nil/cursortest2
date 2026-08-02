package ru.yandex.logistics.care.ui;

import defpackage.au8;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w511;
import defpackage.yt8;
import defpackage.zt8;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.logistics.sdk.webview.api.WebViewState;

/* loaded from: classes4.dex */
public final class k implements vpr {
    public final /* synthetic */ vpr a;

    public k(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CareWebViewViewModelImpl$stateProvider$1$special$$inlined$map$1$2$1 careWebViewViewModelImpl$stateProvider$1$special$$inlined$map$1$2$1;
        int i;
        WebViewState webViewState;
        if (continuation instanceof CareWebViewViewModelImpl$stateProvider$1$special$$inlined$map$1$2$1) {
            careWebViewViewModelImpl$stateProvider$1$special$$inlined$map$1$2$1 = (CareWebViewViewModelImpl$stateProvider$1$special$$inlined$map$1$2$1) continuation;
            int i2 = careWebViewViewModelImpl$stateProvider$1$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                careWebViewViewModelImpl$stateProvider$1$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = careWebViewViewModelImpl$stateProvider$1$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = careWebViewViewModelImpl$stateProvider$1$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    au8 au8Var = (au8) obj;
                    if (au8Var instanceof zt8) {
                        webViewState = ((zt8) au8Var).a;
                    } else {
                        if (!jl40.l(au8Var, yt8.a)) {
                            w511.b();
                            return null;
                        }
                        webViewState = WebViewState.ERROR;
                    }
                    careWebViewViewModelImpl$stateProvider$1$special$$inlined$map$1$2$1.L$0 = null;
                    careWebViewViewModelImpl$stateProvider$1$special$$inlined$map$1$2$1.L$1 = null;
                    careWebViewViewModelImpl$stateProvider$1$special$$inlined$map$1$2$1.L$2 = null;
                    careWebViewViewModelImpl$stateProvider$1$special$$inlined$map$1$2$1.L$3 = null;
                    careWebViewViewModelImpl$stateProvider$1$special$$inlined$map$1$2$1.I$0 = 0;
                    careWebViewViewModelImpl$stateProvider$1$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(webViewState, careWebViewViewModelImpl$stateProvider$1$special$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        careWebViewViewModelImpl$stateProvider$1$special$$inlined$map$1$2$1 = new CareWebViewViewModelImpl$stateProvider$1$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = careWebViewViewModelImpl$stateProvider$1$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = careWebViewViewModelImpl$stateProvider$1$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
