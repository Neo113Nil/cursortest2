package com.plaid.internal;

import android.app.Application;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.net.Uri;
import android.view.View;
import androidx.activity.result.ActivityResultLauncher;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.mlkit.vision.face.internal.zzm;
import com.plaid.internal.L5;
import com.plaid.internal.P5;
import com.plaid.link.Plaid;
import com.plaid.link.configuration.LinkTokenConfiguration;
import com.plaid.link.result.LinkExit;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.serialization.json.Json;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class Q0 {
    public final LinkTokenConfiguration a;
    public final ActivityResultLauncher<LinkTokenConfiguration> b;
    public final Function1<LinkTokenConfiguration, Unit> c;
    public final Function1<LinkExit, Unit> d;
    public final P0 e;
    public final C0334y2 f;

    @DebugMetadata(c = "com.plaid.internal.views.EmbeddedViewHandler$loadWebviewFromLinkToken$1", f = "EmbeddedViewHandler.kt", l = {78, 79}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @DebugMetadata(c = "com.plaid.internal.views.EmbeddedViewHandler$loadWebviewFromLinkToken$1$1", f = "EmbeddedViewHandler.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Object a;
            public final /* synthetic */ Q0 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, Q0 q0, Continuation<? super a> continuation) {
                super(2, continuation);
                this.a = obj;
                this.b = q0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.a, this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return new a(this.a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Object obj2 = this.a;
                Q0 q0 = this.b;
                if (Result.m4120exceptionOrNullimpl(obj2) != null) {
                    q0.f.getProgressBar$link_sdk_release().setVisibility(4);
                    q0.f.getWebView$link_sdk_release().setVisibility(4);
                    q0.f.getRetryContainer$link_sdk_release().setVisibility(0);
                    return Unit.INSTANCE;
                }
                Q0 q02 = this.b;
                P5 webView$link_sdk_release = q02.f.getWebView$link_sdk_release();
                webView$link_sdk_release.loadUrl((String) obj2);
                webView$link_sdk_release.setVisibility(0);
                q02.f.getProgressBar$link_sdk_release().setVisibility(4);
                q02.f.getRetryContainer$link_sdk_release().setVisibility(4);
                return Unit.INSTANCE;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Q0.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return Q0.this.new b((Continuation) obj2).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
        
            if (kotlinx.coroutines.JobKt.withContext(r1, r4, r6) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
        
            if (r7 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object a2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                Q0 q0 = Q0.this;
                P0 p0 = q0.e;
                String token = q0.a.getToken();
                this.a = 1;
                a2 = p0.a(token, this);
            } else {
                if (i != 1) {
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                a2 = ((Result) obj).value;
            }
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            HandlerContext handlerContext = MainDispatcherLoader.dispatcher;
            a aVar = new a(a2, Q0.this, null);
            this.a = 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Q0(Context context, LinkTokenConfiguration linkTokenConfiguration, ActivityResultLauncher<LinkTokenConfiguration> activityResultLauncher, Function1<? super LinkTokenConfiguration, Unit> function1, Function1<? super LinkExit, Unit> function12) {
        context.getClass();
        linkTokenConfiguration.getClass();
        function12.getClass();
        this.a = linkTokenConfiguration;
        this.b = activityResultLauncher;
        this.c = function1;
        this.d = function12;
        Plaid plaid = Plaid.INSTANCE;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        P0 p0 = new P0(plaid.provideLinkTokenComponent$link_sdk_release((Application) applicationContext));
        this.e = p0;
        a aVar = new a(context);
        Json json = p0.c;
        if (json == null) {
            Intrinsics.throwUninitializedPropertyAccessException("json");
            throw null;
        }
        S0 s0 = new S0(aVar, json);
        C0334y2 c0334y2 = new C0334y2(context);
        P5 webView$link_sdk_release = c0334y2.getWebView$link_sdk_release();
        R0 r0 = new R0(s0);
        webView$link_sdk_release.getClass();
        Context context2 = webView$link_sdk_release.getContext();
        if (context2 instanceof MutableContextWrapper) {
            ((MutableContextWrapper) context2).setBaseContext(P5.a.a(context));
        }
        webView$link_sdk_release.c = L5.a.a;
        C0148d4 c0148d4 = webView$link_sdk_release.a;
        c0148d4.getClass();
        c0148d4.a = r0;
        c0334y2.getRetryButton$link_sdk_release().setOnClickListener(new Q0$$ExternalSyntheticLambda0(this, 0));
        this.f = c0334y2;
    }

    public final void a() {
        this.f.getProgressBar$link_sdk_release().setVisibility(0);
        this.f.getWebView$link_sdk_release().setVisibility(4);
        this.f.getRetryContainer$link_sdk_release().setVisibility(4);
        JobKt.launch$default(C0348z7.a(this.f), null, null, new b(null), 3);
    }

    public static final void a(Q0 q0, View view) {
        q0.getClass();
        q0.a();
    }

    public static final class a {
        public final /* synthetic */ Context b;

        public a(Context context) {
            this.b = context;
        }

        public final void a(M0 m0) {
            m0.getClass();
            LinkTokenConfiguration build = new LinkTokenConfiguration.Builder().embeddedSessionInfo(m0).noLoadingState(Q0.this.a.getNoLoadingState()).logLevel(Q0.this.a.getLogLevel()).build();
            Q0 q0 = Q0.this;
            ActivityResultLauncher<LinkTokenConfiguration> activityResultLauncher = q0.b;
            if (activityResultLauncher != null) {
                activityResultLauncher.launch(build);
                return;
            }
            Function1<LinkTokenConfiguration, Unit> function1 = q0.c;
            if (function1 != null) {
                function1.invoke(build);
            }
        }

        public final void a(String str) {
            str.getClass();
            new zzm().build().launchUrl(this.b, Uri.parse(str));
        }

        public final void a(LinkExit linkExit) {
            linkExit.getClass();
            Q0.this.d.invoke(linkExit);
        }
    }
}
