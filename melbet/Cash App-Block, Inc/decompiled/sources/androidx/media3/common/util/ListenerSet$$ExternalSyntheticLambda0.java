package androidx.media3.common.util;

import android.os.Handler;
import android.os.Message;
import androidx.media3.common.FlagSet;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.StuckPlayerDetector;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final /* synthetic */ class ListenerSet$$ExternalSyntheticLambda0 implements Handler.Callback {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ListenerSet$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ListenerSet listenerSet = (ListenerSet) obj;
                ListenerSet.IterationFinishedEvent iterationFinishedEvent = listenerSet.iterationFinishedEvent;
                iterationFinishedEvent.getClass();
                Iterator it = listenerSet.listeners.iterator();
                while (it.hasNext()) {
                    ListenerSet.ListenerHolder listenerHolder = (ListenerSet.ListenerHolder) it.next();
                    if (!listenerHolder.released && listenerHolder.needsIterationFinishedEvent) {
                        FlagSet build = listenerHolder.flagsBuilder.build();
                        listenerHolder.flagsBuilder = new FlagSet.Builder(0);
                        listenerHolder.needsIterationFinishedEvent = false;
                        iterationFinishedEvent.invoke(listenerHolder.listener, build);
                    }
                    SystemHandlerWrapper systemHandlerWrapper = listenerSet.iterationFinishedHandler;
                    systemHandlerWrapper.getClass();
                    if (systemHandlerWrapper.handler.hasMessages(1)) {
                        break;
                    }
                }
                break;
            default:
                StuckPlayerDetector stuckPlayerDetector = (StuckPlayerDetector) obj;
                int i2 = message.what;
                if (i2 == 1) {
                    ((StuckPlayerDetector.StuckBufferingDetector) stuckPlayerDetector.stuckBufferingDetector).update();
                    break;
                } else if (i2 == 2) {
                    ((StuckPlayerDetector.StuckPlayingDetector) stuckPlayerDetector.stuckPlayingDetector).update();
                    break;
                } else if (i2 == 3) {
                    ((StuckPlayerDetector.StuckPlayingNotEndingDetector) stuckPlayerDetector.stuckPlayingNotEndingDetector).update();
                    break;
                } else if (i2 == 4) {
                    ((StuckPlayerDetector.StuckSuppressedDetector) stuckPlayerDetector.stuckSuppressedDetector).update();
                    break;
                } else {
                    break;
                }
        }
        return true;
    }
}
