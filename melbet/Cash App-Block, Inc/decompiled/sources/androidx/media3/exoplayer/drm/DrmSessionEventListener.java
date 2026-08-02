package androidx.media3.exoplayer.drm;

import androidx.lifecycle.DispatchQueue$$ExternalSyntheticLambda0;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource$MediaPeriodId;
import androidx.media3.exoplayer.source.MediaSourceEventListener$EventDispatcher$ListenerAndHandler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public interface DrmSessionEventListener {

    public final class EventDispatcher {
        public final CopyOnWriteArrayList listenerAndHandlers;
        public final MediaSource$MediaPeriodId mediaPeriodId;
        public final int windowIndex;

        public final class ListenerAndHandler {
            public DrmSessionEventListener listener;
        }

        public /* synthetic */ EventDispatcher(CopyOnWriteArrayList copyOnWriteArrayList, int i, MediaSource$MediaPeriodId mediaSource$MediaPeriodId) {
            this.listenerAndHandlers = copyOnWriteArrayList;
            this.windowIndex = i;
            this.mediaPeriodId = mediaSource$MediaPeriodId;
        }

        public void dispatchEvent(Consumer consumer) {
            Iterator it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                MediaSourceEventListener$EventDispatcher$ListenerAndHandler mediaSourceEventListener$EventDispatcher$ListenerAndHandler = (MediaSourceEventListener$EventDispatcher$ListenerAndHandler) it.next();
                Util.postOrRun(mediaSourceEventListener$EventDispatcher$ListenerAndHandler.handler, new DispatchQueue$$ExternalSyntheticLambda0(29, consumer, mediaSourceEventListener$EventDispatcher$ListenerAndHandler.listener));
            }
        }
    }
}
