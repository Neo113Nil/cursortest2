package com.plaid.internal;

import android.webkit.JavascriptInterface;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.plaid.internal.AbstractC0282s4;
import com.plaid.internal.C0088a;
import com.plaid.internal.C0095a6;
import com.plaid.internal.F6;
import com.plaid.internal.Y6;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import papa.AppUpdateData;
import papa.SafeTrace;

/* renamed from: com.plaid.internal.p6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0258p6 {
    public final C0148d4 a;
    public final Json b;
    public final MutableStateFlow c;
    public final StateFlow d;

    /* renamed from: com.plaid.internal.p6$a */
    public static final class a extends Lambda implements Function1<JsonBuilder, Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            JsonBuilder jsonBuilder = (JsonBuilder) obj;
            jsonBuilder.getClass();
            jsonBuilder.ignoreUnknownKeys = true;
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.plaid.core.webview.PreloadWebViewJSInterface$postMessage$1", f = "PreloadWebViewJSInterface.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.plaid.internal.p6$b */
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C0258p6.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C0258p6.this.new b((Continuation) obj2).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            SafeTrace.throwOnFailure(obj);
            MutableStateFlow mutableStateFlow = C0258p6.this.c;
            Boolean bool = Boolean.TRUE;
            StateFlowImpl stateFlowImpl = (StateFlowImpl) mutableStateFlow;
            stateFlowImpl.getClass();
            stateFlowImpl.updateState(null, bool);
            return Unit.INSTANCE;
        }
    }

    public C0258p6(C0148d4 c0148d4) {
        c0148d4.getClass();
        this.a = c0148d4;
        this.b = AppUpdateData.Json$default(a.a);
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(Boolean.FALSE);
        this.c = MutableStateFlow;
        this.d = FlowKt.asStateFlow(MutableStateFlow);
    }

    @JavascriptInterface
    public final void postMessage(String str) {
        str.getClass();
        try {
            Json json = this.b;
            C0088a.b.a();
            C0088a c0088a = (C0088a) json.decodeFromString(str, C0088a.C0016a.a);
            String a2 = c0088a.a();
            if (Intrinsics.areEqual(a2, "ready")) {
                C0095a6.a.a(C0095a6.a, "JS received Link is ready");
                F6.a.a("JSBridge - received ready");
                JobKt.launch$default(GlobalScope.INSTANCE, null, null, new b(null), 3);
            } else {
                if (!Intrinsics.areEqual(a2, "open-webview")) {
                    Y6.a.a("JS sent unknown action: " + c0088a.a());
                    F6.a.a(MapsKt__MapsJVMKt.mapOf(new Pair("action", c0088a.a())), "JSBridge - received unknown action");
                    return;
                }
                AbstractC0282s4 a3 = AbstractC0282s4.a.a(str);
                C0095a6.a.a(C0095a6.a, "JS received open webview message : " + a3);
                F6.a.a("JSBridge - received open-webview");
                this.a.a(a3);
            }
        } catch (Exception e) {
            Y6.a.a(e, "Error parsing message: ".concat(str));
            Pair pair = new Pair("message", str);
            String message = e.getMessage();
            if (message == null) {
                message = "unknown";
            }
            F6.a.a(MapsKt__MapsKt.mapOf(pair, new Pair(BreadcrumbHelper.Category.ERROR, message)), "JSBridge - error parsing message");
        }
    }
}
