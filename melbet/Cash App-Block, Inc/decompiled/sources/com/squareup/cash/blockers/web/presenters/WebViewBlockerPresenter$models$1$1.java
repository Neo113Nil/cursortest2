package com.squareup.cash.blockers.web.presenters;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.session.backend.RealUrlAuthenticator;
import com.squareup.protos.franklin.api.WebviewBlocker;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class WebViewBlockerPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $mutableScreen$delegate;
    public MutableState L$0;
    public BlockersScreens.WebViewBlockerScreen L$1;
    public int label;
    public final /* synthetic */ WebViewBlockerPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewBlockerPresenter$models$1$1(WebViewBlockerPresenter webViewBlockerPresenter, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.this$0 = webViewBlockerPresenter;
        this.$mutableScreen$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebViewBlockerPresenter$models$1$1(this.this$0, this.$mutableScreen$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WebViewBlockerPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BlockersScreens.WebViewBlockerScreen webViewBlockerScreen;
        MutableState mutableState;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            WebViewBlockerPresenter webViewBlockerPresenter = this.this$0;
            BlockersScreens.WebViewBlockerScreen webViewBlockerScreen2 = webViewBlockerPresenter.args;
            RealUrlAuthenticator realUrlAuthenticator = webViewBlockerPresenter.urlAuthenticator;
            String str = webViewBlockerScreen2.url;
            MutableState mutableState2 = this.$mutableScreen$delegate;
            this.L$0 = mutableState2;
            this.L$1 = webViewBlockerScreen2;
            this.label = 1;
            obj = realUrlAuthenticator.authenticate(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            webViewBlockerScreen = webViewBlockerScreen2;
            mutableState = mutableState2;
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            webViewBlockerScreen = this.L$1;
            mutableState = this.L$0;
            SafeTrace.throwOnFailure(obj);
        }
        String str2 = (String) obj;
        BlockersData blockersData = webViewBlockerScreen.blockersData;
        String str3 = webViewBlockerScreen.callbackUrl;
        List list = webViewBlockerScreen.cookies;
        Map map = webViewBlockerScreen.metadata;
        boolean z = webViewBlockerScreen.allowPopups;
        WebviewBlocker.NavigationHeader navigationHeader = webViewBlockerScreen.navigationHeader;
        WebviewBlocker.NavigationFooter navigationFooter = webViewBlockerScreen.navigationFooter;
        blockersData.getClass();
        str2.getClass();
        list.getClass();
        map.getClass();
        mutableState.setValue(new BlockersScreens.WebViewBlockerScreen(blockersData, str2, str3, list, map, z, navigationHeader, navigationFooter));
        return Unit.INSTANCE;
    }
}
