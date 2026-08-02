package androidx.media3.exoplayer.source;

import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;

/* loaded from: classes3.dex */
public final /* synthetic */ class MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda1 implements Consumer {
    public final /* synthetic */ DrmSessionEventListener.EventDispatcher f$0;
    public final /* synthetic */ LoadEventInfo f$1;
    public final /* synthetic */ MediaLoadData f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda1(DrmSessionEventListener.EventDispatcher eventDispatcher, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i) {
        this.f$0 = eventDispatcher;
        this.f$1 = loadEventInfo;
        this.f$2 = mediaLoadData;
        this.f$3 = i;
    }

    @Override // androidx.media3.common.util.Consumer, io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        MediaSourceEventListener mediaSourceEventListener = (MediaSourceEventListener) obj;
        DrmSessionEventListener.EventDispatcher eventDispatcher = this.f$0;
        mediaSourceEventListener.onLoadStarted(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, this.f$1, this.f$2, this.f$3);
    }
}
