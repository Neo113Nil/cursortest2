package app.cash.redwood.treehouse;

import app.cash.zipline.Call;
import app.cash.zipline.CallResult;
import app.cash.zipline.Zipline;
import app.cash.zipline.ZiplineManifest;
import app.cash.zipline.ZiplineService;
import com.caverock.androidsvg.SVG;

/* loaded from: classes3.dex */
public final class RealEventPublisher$ZiplineEventListener extends app.cash.zipline.EventListener {
    public final SVG eventPublisher;
    public final /* synthetic */ SVG this$0;

    public RealEventPublisher$ZiplineEventListener(SVG svg) {
        this.this$0 = svg;
        this.eventPublisher = svg;
    }

    @Override // app.cash.zipline.EventListener
    public final void applicationLoadFailed(String str, Exception exc, Object obj) {
        str.getClass();
        exc.getClass();
        EventListener eventListener = (EventListener) this.this$0.rootElement;
        eventListener.getClass();
        eventListener.codeLoadFailed(exc, obj);
    }

    @Override // app.cash.zipline.EventListener
    public final void applicationLoadSkipped(String str, String str2, Object obj) {
        str.getClass();
        str2.getClass();
        EventListener eventListener = (EventListener) this.this$0.rootElement;
        eventListener.getClass();
        eventListener.codeLoadSkipped(obj);
    }

    @Override // app.cash.zipline.EventListener
    public final void applicationLoadSkippedNotFresh(Object obj, String str) {
        str.getClass();
        EventListener eventListener = (EventListener) this.this$0.rootElement;
        eventListener.getClass();
        eventListener.codeLoadSkippedNotFresh(obj);
    }

    @Override // app.cash.zipline.EventListener
    public final Object applicationLoadStart(String str) {
        str.getClass();
        EventListener eventListener = (EventListener) this.this$0.rootElement;
        eventListener.getClass();
        return eventListener.codeLoadStart();
    }

    @Override // app.cash.zipline.EventListener
    public final void applicationLoadSuccess(String str, ZiplineManifest ziplineManifest, Zipline zipline, Object obj) {
        str.getClass();
        ziplineManifest.getClass();
        zipline.getClass();
        EventListener eventListener = (EventListener) this.this$0.rootElement;
        eventListener.getClass();
        eventListener.codeLoadSuccess(ziplineManifest, zipline, obj);
    }

    @Override // app.cash.zipline.EventListener
    public final void bindService(Zipline zipline, String str, ZiplineService ziplineService) {
        ziplineService.getClass();
        EventListener eventListener = (EventListener) this.this$0.rootElement;
        eventListener.getClass();
        eventListener.bindService(str, ziplineService);
    }

    @Override // app.cash.zipline.EventListener
    public final void callEnd(Zipline zipline, Call call, CallResult callResult, Object obj) {
        call.getClass();
        EventListener eventListener = (EventListener) this.this$0.rootElement;
        eventListener.getClass();
        eventListener.callEnd(call, callResult, obj);
    }

    @Override // app.cash.zipline.EventListener
    public final Object callStart(Zipline zipline, Call call) {
        call.getClass();
        EventListener eventListener = (EventListener) this.this$0.rootElement;
        eventListener.getClass();
        return eventListener.callStart(call);
    }

    @Override // app.cash.zipline.EventListener
    public final void downloadEnd(String str, String str2, Object obj) {
        str.getClass();
        str2.getClass();
        EventListener eventListener = (EventListener) this.this$0.rootElement;
        eventListener.getClass();
        eventListener.downloadSuccess(obj, str2);
    }

    @Override // app.cash.zipline.EventListener
    public final void downloadFailed(String str, String str2, Exception exc, Object obj) {
        str.getClass();
        str2.getClass();
        EventListener eventListener = (EventListener) this.this$0.rootElement;
        eventListener.getClass();
        eventListener.downloadFailed(str2, exc, obj);
    }

    @Override // app.cash.zipline.EventListener
    public final Object downloadStart(String str, String str2) {
        str.getClass();
        str2.getClass();
        EventListener eventListener = (EventListener) this.this$0.rootElement;
        eventListener.getClass();
        return eventListener.downloadStart(str2);
    }

    @Override // app.cash.zipline.EventListener
    public final void initializerEnd(Zipline zipline, String str, Object obj) {
        zipline.getClass();
        str.getClass();
        EventListener eventListener = (EventListener) this.this$0.rootElement;
        eventListener.getClass();
        eventListener.initializerEnd(obj, str);
    }

    @Override // app.cash.zipline.EventListener
    public final Object initializerStart(Zipline zipline, String str) {
        zipline.getClass();
        str.getClass();
        EventListener eventListener = (EventListener) this.this$0.rootElement;
        eventListener.getClass();
        return eventListener.initializerStart(str);
    }

    @Override // app.cash.zipline.EventListener
    public final void mainFunctionEnd(Zipline zipline, String str, Object obj) {
        zipline.getClass();
        str.getClass();
        EventListener eventListener = (EventListener) this.this$0.rootElement;
        eventListener.getClass();
        eventListener.mainFunctionEnd(obj, str);
    }

    @Override // app.cash.zipline.EventListener
    public final Object mainFunctionStart(Zipline zipline, String str) {
        zipline.getClass();
        str.getClass();
        EventListener eventListener = (EventListener) this.this$0.rootElement;
        eventListener.getClass();
        return eventListener.mainFunctionStart(str);
    }

    @Override // app.cash.zipline.EventListener
    public final void manifestParseFailed(Exception exc, String str) {
        str.getClass();
        EventListener eventListener = (EventListener) this.this$0.rootElement;
        eventListener.getClass();
        eventListener.manifestParseFailed(exc);
    }

    @Override // app.cash.zipline.EventListener
    public final void manifestReady(ZiplineManifest ziplineManifest, String str) {
        str.getClass();
        ziplineManifest.getClass();
        EventListener eventListener = (EventListener) this.this$0.rootElement;
        eventListener.getClass();
        eventListener.manifestReady(ziplineManifest);
    }

    @Override // app.cash.zipline.EventListener
    public final void manifestVerified(String str, ZiplineManifest ziplineManifest, String str2) {
        str.getClass();
        ziplineManifest.getClass();
        EventListener eventListener = (EventListener) this.this$0.rootElement;
        eventListener.getClass();
        eventListener.manifestVerified(ziplineManifest, str2);
    }

    @Override // app.cash.zipline.EventListener
    public final void moduleLoadEnd(Zipline zipline, String str, Object obj) {
        str.getClass();
        EventListener eventListener = (EventListener) this.this$0.rootElement;
        eventListener.getClass();
        eventListener.moduleLoadEnd(obj, str);
    }

    @Override // app.cash.zipline.EventListener
    public final Object moduleLoadStart(Zipline zipline, String str) {
        str.getClass();
        EventListener eventListener = (EventListener) this.this$0.rootElement;
        eventListener.getClass();
        return eventListener.moduleLoadStart(str);
    }

    @Override // app.cash.zipline.EventListener
    public final void serviceLeaked(Zipline zipline, String str) {
        str.getClass();
        EventListener eventListener = (EventListener) this.this$0.rootElement;
        if (eventListener != null) {
            eventListener.serviceLeaked(str);
        }
    }

    @Override // app.cash.zipline.EventListener
    public final void takeService(Zipline zipline, String str, ZiplineService ziplineService) {
        EventListener eventListener = (EventListener) this.this$0.rootElement;
        eventListener.getClass();
        eventListener.takeService(str, ziplineService);
    }

    @Override // app.cash.zipline.EventListener
    public final void ziplineClosed(Zipline zipline) {
        EventListener eventListener = (EventListener) this.this$0.rootElement;
        eventListener.getClass();
        eventListener.codeUnloaded();
    }

    @Override // app.cash.zipline.EventListener
    public final void ziplineCreated(Zipline zipline) {
        EventListener eventListener = (EventListener) this.this$0.rootElement;
        eventListener.getClass();
        eventListener.ziplineCreated(zipline);
    }
}
