package androidx.media3.common.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.media3.common.util.SystemHandlerWrapper;
import androidx.media3.exoplayer.ExoPlayerImpl;
import com.android.volley.Response;
import com.appsflyer.internal.AFd1lSDK$$ExternalSyntheticLambda0;

/* loaded from: classes3.dex */
public final class AudioBecomingNoisyManager$AudioBecomingNoisyReceiver extends BroadcastReceiver {
    public final SystemHandlerWrapper eventHandler;
    public final ExoPlayerImpl.ComponentListener listener;
    public final /* synthetic */ Response this$0;

    public AudioBecomingNoisyManager$AudioBecomingNoisyReceiver(Response response, SystemHandlerWrapper systemHandlerWrapper, ExoPlayerImpl.ComponentListener componentListener) {
        this.this$0 = response;
        this.eventHandler = systemHandlerWrapper;
        this.listener = componentListener;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.eventHandler.post(new AFd1lSDK$$ExternalSyntheticLambda0(this, 6));
        }
    }
}
