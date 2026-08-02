package app.cash.redwood.treehouse;

import app.cash.zipline.Call;
import app.cash.zipline.CallResult;
import app.cash.zipline.Zipline;
import app.cash.zipline.ZiplineManifest;
import app.cash.zipline.ZiplineService;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class EventListener {

    /* loaded from: classes.dex */
    public interface Factory extends AutoCloseable {
        EventListener create(RealTreehouseApp realTreehouseApp, String str);
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewDocuments.deepLinkSpecs;
    }

    public void bindService(String str, ZiplineService ziplineService) {
        ziplineService.getClass();
    }

    public abstract void callEnd(Call call, CallResult callResult, Object obj);

    public abstract Object callStart(Call call);

    public abstract void codeLoadFailed(Exception exc, Object obj);

    public abstract void codeLoadSkipped(Object obj);

    public abstract void codeLoadSkippedNotFresh(Object obj);

    public abstract Object codeLoadStart();

    public abstract void codeLoadSuccess(ZiplineManifest ziplineManifest, Zipline zipline, Object obj);

    public abstract void codeUnloaded();

    public abstract void downloadFailed(String str, Exception exc, Object obj);

    public abstract Object downloadStart(String str);

    public abstract void downloadSuccess(Object obj, String str);

    public void initializerEnd(Object obj, String str) {
        str.getClass();
    }

    public Object initializerStart(String str) {
        str.getClass();
        return null;
    }

    public void mainFunctionEnd(Object obj, String str) {
        str.getClass();
    }

    public Object mainFunctionStart(String str) {
        str.getClass();
        return null;
    }

    public abstract void manifestParseFailed(Exception exc);

    public void manifestReady(ZiplineManifest ziplineManifest) {
        ziplineManifest.getClass();
    }

    public abstract void manifestVerified(ZiplineManifest ziplineManifest, String str);

    public abstract void moduleLoadEnd(Object obj, String str);

    public abstract Object moduleLoadStart(String str);

    public void serviceLeaked(String str) {
        str.getClass();
    }

    public void takeService(String str, ZiplineService ziplineService) {
    }

    public abstract void uncaughtException(Throwable th);

    /* renamed from: unknownChildren-iETOA3M, reason: not valid java name */
    public abstract void mo1391unknownChildreniETOA3M(int i, int i2);

    /* renamed from: unknownEvent-_LM6m-c, reason: not valid java name */
    public abstract void mo1392unknownEvent_LM6mc(int i, int i2);

    /* renamed from: unknownEventNode-1ccMwuE, reason: not valid java name */
    public abstract void mo1393unknownEventNode1ccMwuE(int i, int i2);

    /* renamed from: unknownModifier-nx0wl1g, reason: not valid java name */
    public abstract void mo1394unknownModifiernx0wl1g(int i);

    /* renamed from: unknownProperty-LKUuuww, reason: not valid java name */
    public abstract void mo1395unknownPropertyLKUuuww(int i, int i2);

    /* renamed from: unknownWidget-WCEpcRY, reason: not valid java name */
    public abstract void mo1396unknownWidgetWCEpcRY(int i);

    public void ziplineCreated(Zipline zipline) {
    }
}
