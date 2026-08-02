package ru.yandex.yx_platform_api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import defpackage.lq1;
import defpackage.qrk0;
import kotlin.Metadata;
import org.webrtc.MediaStreamTrack;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0010"}, d2 = {"ru/yandex/yx_platform_api/RingerModeStreamHandler$RingerModeReceiver", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lzy11;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lqrk0;", "listener", "setRingerModeChangedListener", "(Lqrk0;)V", "Lqrk0;", "yx_platform_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
final class RingerModeStreamHandler$RingerModeReceiver extends BroadcastReceiver {
    private qrk0 listener;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int ringerMode = ((AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)).getRingerMode();
        qrk0 qrk0Var = this.listener;
        if (qrk0Var != null) {
            ((lq1) qrk0Var).a.success(Integer.valueOf(ringerMode));
        }
    }

    public final void setRingerModeChangedListener(qrk0 listener) {
        this.listener = listener;
    }
}
