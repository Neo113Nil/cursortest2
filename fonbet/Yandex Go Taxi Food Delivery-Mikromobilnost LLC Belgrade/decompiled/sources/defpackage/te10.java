package defpackage;

import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.OutcomeReceiver;
import android.telephony.TelephonyCallback;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class te10 {
    public static /* synthetic */ NetworkEvent.Builder d() {
        return new NetworkEvent.Builder();
    }

    public static /* synthetic */ PlaybackErrorEvent.Builder e() {
        return new PlaybackErrorEvent.Builder();
    }

    public static /* synthetic */ PlaybackStateEvent.Builder f() {
        return new PlaybackStateEvent.Builder();
    }

    public static /* synthetic */ TrackChangeEvent.Builder g(int i) {
        return new TrackChangeEvent.Builder(i);
    }

    public static /* bridge */ /* synthetic */ OutcomeReceiver i(Object obj) {
        return (OutcomeReceiver) obj;
    }

    public static /* bridge */ /* synthetic */ TelephonyCallback j(Object obj) {
        return (TelephonyCallback) obj;
    }
}
