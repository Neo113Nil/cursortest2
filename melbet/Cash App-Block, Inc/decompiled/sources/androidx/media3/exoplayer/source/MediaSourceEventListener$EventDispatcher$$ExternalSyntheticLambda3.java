package androidx.media3.exoplayer.source;

import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import java.io.IOException;

/* loaded from: classes3.dex */
public final /* synthetic */ class MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda3 implements Consumer {
    public final /* synthetic */ DrmSessionEventListener.EventDispatcher f$0;
    public final /* synthetic */ LoadEventInfo f$1;
    public final /* synthetic */ MediaLoadData f$2;
    public final /* synthetic */ IOException f$3;
    public final /* synthetic */ boolean f$4;

    public /* synthetic */ MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda3(DrmSessionEventListener.EventDispatcher eventDispatcher, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        this.f$0 = eventDispatcher;
        this.f$1 = loadEventInfo;
        this.f$2 = mediaLoadData;
        this.f$3 = iOException;
        this.f$4 = z;
    }

    @Override // androidx.media3.common.util.Consumer, io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        MediaSourceEventListener mediaSourceEventListener = (MediaSourceEventListener) obj;
        DrmSessionEventListener.EventDispatcher eventDispatcher = this.f$0;
        mediaSourceEventListener.onLoadError(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, this.f$1, this.f$2, this.f$3, this.f$4);
    }
}
