package com.plaid.internal;

import android.R;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.KeyEvent;
import android.webkit.WebView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.C0095a6;
import com.plaid.internal.C0186h6;
import com.plaid.internal.L5;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import kotlinx.serialization.json.JsonPrimitive;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class P5 extends WebView {
    public static final /* synthetic */ int g = 0;
    public final C0148d4 a;
    public final C0258p6 b;
    public L5 c;
    public Job d;
    public final ArrayList e;
    public final AtomicBoolean f;

    public static final class a {
        public static final Context a(Context context) {
            int i = P5.g;
            context.setTheme(R.style.Theme.DeviceDefault.DayNight);
            return context;
        }
    }

    @DebugMetadata(c = "com.plaid.core.webview.PlaidWebview$submit$1", f = "PlaidWebview.kt", l = {EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_CENTERED_VALUE}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;

        public static final class a<T> implements FlowCollector {
            public final /* synthetic */ P5 a;
            public final /* synthetic */ String b;

            public a(P5 p5, String str) {
                this.a = p5;
                this.b = str;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                ((Boolean) obj).getClass();
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                Object withContext = JobKt.withContext(MainDispatcherLoader.dispatcher, new W5(this.a, this.b, null), continuation);
                return withContext == CoroutineSingletons.COROUTINE_SUSPENDED ? withContext : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return P5.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return P5.this.new b(this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                P5 p5 = P5.this;
                StateFlow stateFlow = p5.b.d;
                a aVar = new a(p5, this.c);
                this.a = 1;
                Object collect = stateFlow.collect(new X5(aVar), this);
                if (collect != coroutineSingletons) {
                    collect = Unit.INSTANCE;
                }
                if (collect == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function1<JsonObjectBuilder, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Map<String, String> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, Map<String, String> map) {
            super(1);
            this.a = str;
            this.b = str2;
            this.c = map;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
            jsonObjectBuilder.getClass();
            String str = this.a;
            if (str != null) {
                JsonElementBuildersKt.put(jsonObjectBuilder, "phone_number", str);
            } else {
                jsonObjectBuilder.put("phone_number", JsonNull.INSTANCE);
            }
            String str2 = this.b;
            if (str2 != null) {
                JsonElementBuildersKt.put(jsonObjectBuilder, GovernmentIdNfcScan.dateOfBirthName, str2);
            } else {
                jsonObjectBuilder.put(GovernmentIdNfcScan.dateOfBirthName, JsonNull.INSTANCE);
            }
            Y5 y5 = new Y5(this.c);
            JsonObjectBuilder jsonObjectBuilder2 = new JsonObjectBuilder();
            y5.invoke(jsonObjectBuilder2);
            jsonObjectBuilder.put("params", new JsonObject(jsonObjectBuilder2.content));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P5(Context context) {
        super(new MutableContextWrapper(a.a(context)), null, 0);
        context.getClass();
        C0148d4 c0148d4 = new C0148d4();
        this.a = c0148d4;
        C0258p6 c0258p6 = new C0258p6(c0148d4);
        this.b = c0258p6;
        this.e = new ArrayList();
        this.f = new AtomicBoolean(false);
        setRendererPriorityPolicy(2, false);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(true);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        setBackgroundColor(0);
        addJavascriptInterface(c0258p6, "PlaidAndroid");
        setWebViewClient(new K5(c0148d4));
    }

    public final void a(String str, String str2, Map<String, String> map) {
        if (str == null && str2 == null && (map == null || map.isEmpty())) {
            C0095a6.a.b(C0095a6.a, "null phone number && null DOB && null/empty params passed to submit -- noop");
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JsonPrimitive JsonPrimitive = JsonElementKt.JsonPrimitive("submit");
        JsonPrimitive.getClass();
        c cVar = new c(str, str2, map);
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        cVar.invoke(jsonObjectBuilder);
        String jsonObject = new JsonObject(linkedHashMap).toString();
        Job job = this.d;
        if (job != null) {
            job.cancel(null);
        }
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        this.d = JobKt.launch$default(JobKt.CoroutineScope(DefaultIoScheduler.INSTANCE), null, null, new b(jsonObject, null), 3);
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        this.a.a = null;
        Job job = this.d;
        if (job != null) {
            job.cancel(null);
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((Job) it.next()).cancel(null);
        }
        this.e.clear();
        super.destroy();
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (keyEvent.getAction() != 0 || i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (canGoBack()) {
            goBack();
            return true;
        }
        L5 l5 = this.c;
        if (l5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("listener");
            throw null;
        }
        l5.a();
        L5 l52 = this.c;
        if (l52 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("listener");
            throw null;
        }
        if (Intrinsics.areEqual(l52, L5.a.a)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public final void a(C0186h6.a aVar) {
        aVar.getClass();
        if (((Boolean) this.b.d.getValue()).booleanValue()) {
            post(new P5$$ExternalSyntheticLambda0(0, aVar));
            return;
        }
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        StandaloneCoroutine launch$default = JobKt.launch$default(JobKt.CoroutineScope(MainDispatcherLoader.dispatcher), null, null, new V5(this, aVar, null), 3);
        this.e.add(launch$default);
        launch$default.invokeOnCompletion(new U5(this, launch$default));
    }

    public static final void a(Function0 function0) {
        function0.getClass();
        function0.invoke();
    }

    public final AtomicBoolean a() {
        return this.f;
    }
}
