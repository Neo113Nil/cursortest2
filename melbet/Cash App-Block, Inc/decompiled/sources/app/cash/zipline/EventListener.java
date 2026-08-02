package app.cash.zipline;

/* loaded from: classes3.dex */
public abstract class EventListener {
    public static final EventListener$Companion$NONE$1 NONE = new EventListener$Companion$NONE$1();

    public interface Factory {
        EventListener create(String str, String str2);
    }

    public void applicationLoadFailed(String str, Exception exc, Object obj) {
        str.getClass();
        exc.getClass();
    }

    public void applicationLoadSkipped(String str, String str2, Object obj) {
        str.getClass();
        str2.getClass();
    }

    public void applicationLoadSkippedNotFresh(Object obj, String str) {
        str.getClass();
    }

    public Object applicationLoadStart(String str) {
        str.getClass();
        return null;
    }

    public void applicationLoadSuccess(String str, ZiplineManifest ziplineManifest, Zipline zipline, Object obj) {
        str.getClass();
        ziplineManifest.getClass();
        zipline.getClass();
    }

    public void bindService(Zipline zipline, String str, ZiplineService ziplineService) {
        ziplineService.getClass();
    }

    public void callEnd(Zipline zipline, Call call, CallResult callResult, Object obj) {
        call.getClass();
    }

    public Object callStart(Zipline zipline, Call call) {
        call.getClass();
        return null;
    }

    public void downloadEnd(String str, String str2, Object obj) {
        str.getClass();
        str2.getClass();
    }

    public void downloadFailed(String str, String str2, Exception exc, Object obj) {
        str.getClass();
        str2.getClass();
    }

    public Object downloadStart(String str, String str2) {
        str.getClass();
        str2.getClass();
        return null;
    }

    public void initializerEnd(Zipline zipline, String str, Object obj) {
        zipline.getClass();
        str.getClass();
    }

    public Object initializerStart(Zipline zipline, String str) {
        zipline.getClass();
        str.getClass();
        return null;
    }

    public void mainFunctionEnd(Zipline zipline, String str, Object obj) {
        zipline.getClass();
        str.getClass();
    }

    public Object mainFunctionStart(Zipline zipline, String str) {
        zipline.getClass();
        str.getClass();
        return null;
    }

    public void manifestParseFailed(Exception exc, String str) {
        str.getClass();
    }

    public void manifestReady(ZiplineManifest ziplineManifest, String str) {
        str.getClass();
        ziplineManifest.getClass();
    }

    public void manifestVerified(String str, ZiplineManifest ziplineManifest, String str2) {
        str.getClass();
        ziplineManifest.getClass();
    }

    public void moduleLoadEnd(Zipline zipline, String str, Object obj) {
        str.getClass();
    }

    public Object moduleLoadStart(Zipline zipline, String str) {
        str.getClass();
        return null;
    }

    public void serviceLeaked(Zipline zipline, String str) {
        str.getClass();
    }

    public void takeService(Zipline zipline, String str, ZiplineService ziplineService) {
    }

    public void ziplineClosed(Zipline zipline) {
    }

    public void ziplineCreated(Zipline zipline) {
    }
}
