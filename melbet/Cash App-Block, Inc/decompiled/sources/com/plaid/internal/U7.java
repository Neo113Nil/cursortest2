package com.plaid.internal;

import android.net.Uri;
import android.webkit.ValueCallback;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.C0095a6;
import com.plaid.internal.C0290t3;
import com.plaid.internal.I2;
import com.plaid.link.Plaid;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.event.LinkEventMetadata;
import com.plaid.link.event.LinkEventName;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkSuccess;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.serialization.json.Json;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class U7 extends ViewModel implements L5, M5, C0290t3.a {
    public final Json a;
    public final InterfaceC0298u2 b;
    public final C6 c;
    public final C0194i5 d;
    public final B6 e;
    public final A6 f;
    public final I7 g;
    public final N5 h;
    public final InterfaceC0320w6 i;
    public final F j;
    public final C0294t7 k;
    public final C0290t3 l;
    public final MutableSharedFlow m;
    public ValueCallback<Uri[]> n;
    public final C0275r6 o;
    public final H6 p;
    public String q;
    public final T7 r;

    @DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewViewModel$onCleared$1", f = "WebviewViewModel.kt", l = {EnumC0170g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE, EnumC0170g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public U7 a;
        public Iterator b;
        public int c;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return U7.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return U7.this.new a((Continuation) obj2).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0030, code lost:
        
            if (r8 == r0) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            U7 u7;
            Iterator it;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                C0194i5 c0194i5 = U7.this.d;
                if (c0194i5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("internalPictureStorage");
                    throw null;
                }
                this.c = 1;
                obj = c0194i5.a(this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = this.b;
                    u7 = this.a;
                    SafeTrace.throwOnFailure(obj);
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        C0194i5 c0194i52 = u7.d;
                        if (c0194i52 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("internalPictureStorage");
                            throw null;
                        }
                        this.a = u7;
                        this.b = it;
                        this.c = 2;
                        if (c0194i52.a(str, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return Unit.INSTANCE;
                }
                SafeTrace.throwOnFailure(obj);
            }
            u7 = U7.this;
            it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewViewModel$onWebviewCancelled$1", f = "WebviewViewModel.kt", l = {EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return U7.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return U7.this.new b((Continuation) obj2).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                InterfaceC0298u2 b = U7.this.b();
                this.a = 1;
                if (b.a(this) == coroutineSingletons) {
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

    public U7(H1 h1) {
        h1.getClass();
        this.m = FlowKt.MutableSharedFlow$default(1, 0, null, 6);
        this.r = new T7(this);
        C0234n0 c0234n0 = (C0234n0) h1;
        Json json = (Json) c0234n0.a.e.get();
        this.a = json;
        this.b = (InterfaceC0298u2) c0234n0.n.get();
        this.c = (C6) c0234n0.o.get();
        this.d = (C0194i5) c0234n0.p.get();
        this.e = (B6) c0234n0.q.get();
        this.f = (A6) c0234n0.r.get();
        this.g = (I7) c0234n0.s.get();
        this.h = (N5) c0234n0.a.o.get();
        this.i = (InterfaceC0320w6) c0234n0.t.get();
        this.j = (F) c0234n0.u.get();
        this.k = (C0294t7) c0234n0.w.get();
        this.o = (C0275r6) c0234n0.x.get();
        this.p = (H6) c0234n0.b.m.get();
        if (json == null) {
            Intrinsics.throwUninitializedPropertyAccessException("json");
            throw null;
        }
        this.l = new C0290t3(this, json);
        JobKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new Q7(this, null), 3);
        JobKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new R7(this, null), 3);
    }

    @Override // com.plaid.internal.C0290t3.a
    public final void a(LinkEvent linkEvent, I2 i2) {
        linkEvent.getClass();
        i2.getClass();
        C0095a6.a.a(C0095a6.a, "Event: " + linkEvent.getEventName());
        Function2<LinkEvent, I2, Unit> linkEventListenerInternal$link_sdk_release = Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release();
        if (linkEventListenerInternal$link_sdk_release != null) {
            linkEventListenerInternal$link_sdk_release.invoke(linkEvent, i2);
        }
    }

    @Override // com.plaid.internal.C0290t3.a
    public final void b(String str) {
        str.getClass();
        if (Intrinsics.areEqual(this.q, str)) {
            return;
        }
        this.q = str;
        H6 h6 = this.p;
        if (h6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("remoteLogController");
            throw null;
        }
        h6.a.a(str);
        h6.a();
    }

    @Override // com.plaid.internal.C0290t3.a
    public final void c(String str) {
        str.getClass();
        b().a(str);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        JobKt.launch$default(GlobalScope.INSTANCE, null, null, new a(null), 3);
        super.onCleared();
    }

    public final InterfaceC0298u2 b() {
        InterfaceC0298u2 interfaceC0298u2 = this.b;
        if (interfaceC0298u2 != null) {
            return interfaceC0298u2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("linkController");
        throw null;
    }

    @Override // com.plaid.internal.C0290t3.a
    public final void a(LinkExit linkExit) {
        linkExit.getClass();
        JobKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new S7(this, null), 3);
        b().a(linkExit);
    }

    @Override // com.plaid.internal.C0290t3.a
    public final void a(LinkSuccess linkSuccess) {
        linkSuccess.getClass();
        JobKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new S7(this, null), 3);
        b().a(linkSuccess);
    }

    @Override // com.plaid.internal.C0290t3.a
    public final void a(LinkedHashMap linkedHashMap) {
        linkedHashMap.getClass();
        JobKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new V7(this, linkedHashMap, null), 3);
    }

    @Override // com.plaid.internal.M5
    public final boolean a(String str) {
        str.getClass();
        this.l.a(str);
        return true;
    }

    @Override // com.plaid.internal.L5
    public final void a() {
        JobKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new b(null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(List list) {
        list.getClass();
        ValueCallback<Uri[]> valueCallback = this.n;
        if (valueCallback != 0) {
            valueCallback.onReceiveValue(list.toArray(new Uri[0]));
        }
    }

    @Override // com.plaid.internal.M5
    public final void a(AbstractC0282s4 abstractC0282s4) {
        abstractC0282s4.getClass();
        b().a(abstractC0282s4);
    }

    @Override // com.plaid.internal.C0290t3.a
    public final void a(C0090a1 c0090a1) {
        c0090a1.getClass();
        JobKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new S7(this, null), 3);
        b().a(L2.b(c0090a1, null));
    }

    @Override // com.plaid.internal.C0290t3.a
    public final void a(String str, LinkEventMetadata linkEventMetadata) {
        str.getClass();
        linkEventMetadata.getClass();
        Function2<LinkEvent, I2, Unit> linkEventListenerInternal$link_sdk_release = Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release();
        if (linkEventListenerInternal$link_sdk_release != null) {
            str.getClass();
            LinkEventName fromString$link_sdk_release = LinkEventName.INSTANCE.fromString$link_sdk_release(str);
            fromString$link_sdk_release.getClass();
            linkEventMetadata.getClass();
            linkEventListenerInternal$link_sdk_release.invoke(new LinkEvent(fromString$link_sdk_release, linkEventMetadata), I2.d.a);
        }
    }
}
