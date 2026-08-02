package app.cash.zipline;

import app.cash.zipline.internal.EventListenerAdapter;
import app.cash.zipline.internal.GuestService$Companion$Adapter$GeneratedOutboundService;
import app.cash.zipline.internal.HostService$Companion$Adapter;
import app.cash.zipline.internal.RealHostService;
import app.cash.zipline.internal.bridge.Endpoint;
import app.cash.zipline.internal.bridge.InboundService;
import app.cash.zipline.internal.bridge.LeakCanaryJniKt;
import app.cash.zipline.internal.bridge.ThrowablesKt;
import app.cash.zipline.internal.bridge.ZiplineServiceAdapter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.n;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.modules.SerializersModule;

/* loaded from: classes.dex */
public final class Zipline implements AutoCloseable {
    public final LinkedHashMap attachments;
    public boolean closed;
    public final Endpoint endpoint;
    public final EventListener eventListener;
    public final GuestService$Companion$Adapter$GeneratedOutboundService guest;
    public final QuickJs quickJs;
    public final ContextScope scope;

    public Zipline(QuickJs quickJs, SerializersModule serializersModule, CoroutineDispatcher coroutineDispatcher, ContextScope contextScope, EventListener eventListener) {
        ZiplineService take;
        this.quickJs = quickJs;
        this.scope = contextScope;
        this.eventListener = eventListener;
        Endpoint endpoint = new Endpoint(contextScope, serializersModule, new EventListenerAdapter(eventListener, this), new Zipline$endpoint$1(this), new Zipline$$ExternalSyntheticLambda0(this, 0));
        this.endpoint = endpoint;
        take = endpoint.take("zipline/guest", new ZiplineScope(), new HostService$Companion$Adapter(CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]), 7));
        GuestService$Companion$Adapter$GeneratedOutboundService guestService$Companion$Adapter$GeneratedOutboundService = (GuestService$Companion$Adapter$GeneratedOutboundService) take;
        this.guest = guestService$Companion$Adapter$GeneratedOutboundService;
        this.attachments = new LinkedHashMap();
        quickJs.initOutboundChannel$zipline_release(endpoint.getInboundChannel());
        endpoint.bind("zipline/host", new RealHostService(endpoint, this, eventListener, new n(coroutineDispatcher, contextScope, guestService$Companion$Adapter$GeneratedOutboundService)), new HostService$Companion$Adapter(CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]), 0));
    }

    public static ZiplineService take$default(Zipline zipline, String str, ZiplineServiceAdapter ziplineServiceAdapter) {
        ZiplineScope ziplineScope = new ZiplineScope();
        zipline.getClass();
        if (JobKt.isActive(zipline.scope)) {
            return zipline.endpoint.take(str, ziplineScope, ziplineServiceAdapter);
        }
        a$$ExternalSyntheticBUOutline0.m$1("closed");
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        JobKt.cancel(this.scope, ThrowablesKt.getTheOnlyCancellationException());
        Endpoint endpoint = this.endpoint;
        InboundService[] inboundServiceArr = (InboundService[]) endpoint.getInboundServices$zipline_release().values().toArray(new InboundService[0]);
        endpoint.getInboundServices$zipline_release().clear();
        Throwable th = null;
        for (InboundService inboundService : inboundServiceArr) {
            try {
                inboundService.getService$zipline_release().close();
            } catch (Throwable th2) {
                if (th != null) {
                    th = th2;
                }
            }
        }
        this.quickJs.close();
        for (Continuation continuation : endpoint.getIncompleteContinuations$zipline_release()) {
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(new Result.Failure(new CancellationException("Zipline closed")));
        }
        endpoint.getIncompleteContinuations$zipline_release().clear();
        LeakCanaryJniKt.stopTrackingLeaks(endpoint);
        this.eventListener.ziplineClosed(this);
        if (th != null) {
            throw th;
        }
    }
}
