package androidx.media3.exoplayer.source;

import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;

/* loaded from: classes3.dex */
public final /* synthetic */ class MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda2 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DrmSessionEventListener.EventDispatcher f$0;
    public final /* synthetic */ LoadEventInfo f$1;
    public final /* synthetic */ MediaLoadData f$2;

    public /* synthetic */ MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda2(DrmSessionEventListener.EventDispatcher eventDispatcher, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i) {
        this.$r8$classId = i;
        this.f$0 = eventDispatcher;
        this.f$1 = loadEventInfo;
        this.f$2 = mediaLoadData;
    }

    @Override // androidx.media3.common.util.Consumer, io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        MediaLoadData mediaLoadData = this.f$2;
        LoadEventInfo loadEventInfo = this.f$1;
        DrmSessionEventListener.EventDispatcher eventDispatcher = this.f$0;
        MediaSourceEventListener mediaSourceEventListener = (MediaSourceEventListener) obj;
        switch (i) {
            case 0:
                mediaSourceEventListener.onLoadCompleted(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, loadEventInfo, mediaLoadData);
                break;
            default:
                mediaSourceEventListener.onLoadCanceled(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, loadEventInfo, mediaLoadData);
                break;
        }
    }
}
