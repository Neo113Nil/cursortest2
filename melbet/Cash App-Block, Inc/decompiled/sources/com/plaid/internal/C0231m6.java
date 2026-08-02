package com.plaid.internal;

import com.plaid.internal.C0095a6;
import com.plaid.link.Plaid;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.event.LinkEventName;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.JobKt;
import kotlinx.serialization.json.Json;

/* renamed from: com.plaid.internal.m6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0231m6 implements M5 {
    public final N5 a;
    public final C0114c5 b;
    public final Lazy c;
    public final C0290t3 d;

    /* renamed from: com.plaid.internal.m6$a */
    public static final class a extends Lambda implements Function0<List<? extends LinkEventName>> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new LinkEventName[]{LinkEventName.PROFILE_ELIGIBILITY_CHECK_READY.INSTANCE, LinkEventName.LAYER_AUTOFILL_NOT_AVAILABLE.INSTANCE, LinkEventName.LAYER_READY.INSTANCE, LinkEventName.LAYER_NOT_AVAILABLE.INSTANCE});
        }
    }

    /* renamed from: com.plaid.internal.m6$b */
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function2<LinkEvent, I2, Unit> {
        public b(C0231m6 c0231m6) {
            super(2, 0, C0231m6.class, c0231m6, "onEvent", "onEvent(Lcom/plaid/link/event/LinkEvent;Lcom/plaid/internal/event/LinkQueueOptions;)V");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            LinkEvent linkEvent = (LinkEvent) obj;
            I2 i2 = (I2) obj2;
            linkEvent.getClass();
            i2.getClass();
            ((C0231m6) this.receiver).a(linkEvent, i2);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.plaid.internal.m6$c */
    public /* synthetic */ class c extends FunctionReferenceImpl implements Function0<Unit> {
        public c(C0231m6 c0231m6) {
            super(0, 0, C0231m6.class, c0231m6, "preLoadFailed", "preLoadFailed()V");
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            C0231m6 c0231m6 = (C0231m6) this.receiver;
            C0114c5 c0114c5 = c0231m6.b;
            c0114c5.getClass();
            JobKt.launch$default(GlobalScope.INSTANCE, null, null, new C0094a5(c0114c5, "Preload received unexpected action", null), 3);
            c0231m6.a.a();
            return Unit.INSTANCE;
        }
    }

    public C0231m6(N5 n5, C0114c5 c0114c5, Json json) {
        n5.getClass();
        c0114c5.getClass();
        json.getClass();
        this.a = n5;
        this.b = c0114c5;
        this.c = LazyKt.lazy(a.a);
        this.d = new C0290t3(new W0(new b(this), new c(this)), json);
    }

    public final void a(LinkEvent linkEvent, I2 i2) {
        if (((List) this.c.getValue()).contains(linkEvent.getEventName())) {
            C0095a6.a.a(C0095a6.a, "Preload delivered event: " + linkEvent.getEventName());
            Plaid.INSTANCE.getCustomerFacingLinkEventListenerInternal$link_sdk_release().invoke(linkEvent);
            return;
        }
        C0095a6.a.a(C0095a6.a, "Preload enqueued event: " + linkEvent.getEventName());
        Function2<LinkEvent, I2, Unit> linkEventListenerInternal$link_sdk_release = Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release();
        if (linkEventListenerInternal$link_sdk_release != null) {
            linkEventListenerInternal$link_sdk_release.invoke(linkEvent, i2);
        }
    }

    @Override // com.plaid.internal.M5
    public final void a(AbstractC0282s4 abstractC0282s4) {
        abstractC0282s4.getClass();
    }

    @Override // com.plaid.internal.M5
    public final boolean a(String str) {
        str.getClass();
        this.d.a(str);
        return true;
    }
}
