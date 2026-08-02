package app.cash.redwood.treehouse;

import app.cash.zipline.ZiplineService;

/* loaded from: classes3.dex */
public interface AppLifecycle$Host extends ZiplineService {
    /* renamed from: getHostProtocolVersion-7jYel6c, reason: not valid java name */
    String mo1388getHostProtocolVersion7jYel6c();

    void handleUncaughtException(Throwable th);

    /* renamed from: onUnknownEvent-_LM6m-c, reason: not valid java name */
    void mo1389onUnknownEvent_LM6mc(int i, int i2);

    /* renamed from: onUnknownEventNode-1ccMwuE, reason: not valid java name */
    void mo1390onUnknownEventNode1ccMwuE(int i, int i2);

    void requestFrame();
}
