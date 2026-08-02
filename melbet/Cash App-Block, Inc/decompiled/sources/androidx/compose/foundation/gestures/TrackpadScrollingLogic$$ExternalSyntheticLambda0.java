package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import androidx.compose.foundation.gestures.TrackpadScrollingLogic;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelResult;

/* loaded from: classes3.dex */
public final /* synthetic */ class TrackpadScrollingLogic$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Channel f$0;

    public /* synthetic */ TrackpadScrollingLogic$$ExternalSyntheticLambda0(Channel channel, int i) {
        this.$r8$classId = i;
        this.f$0 = channel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Channel channel = this.f$0;
        switch (i) {
            case 0:
                return (TrackpadScrollingLogic.TrackpadScrollDelta) ChannelResult.m4191getOrNullimpl(channel.mo4189tryReceivePtdJZtk());
            default:
                return (MouseWheelScrollingLogic.MouseWheelScrollDelta) ChannelResult.m4191getOrNullimpl(channel.mo4189tryReceivePtdJZtk());
        }
    }
}
