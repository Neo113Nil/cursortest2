package androidx.core.view;

import android.window.SplashScreenView;
import androidx.compose.runtime.CancellationHandle;
import androidx.compose.runtime.ShouldPauseCallback;
import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoTimeoutException;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes3.dex */
public final /* synthetic */ class DifferentialMotionFlingController$$ExternalSyntheticLambda0 implements CancellationHandle, ShouldPauseCallback, ListenerSet.Event {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ DifferentialMotionFlingController$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    public static /* synthetic */ void m(Object obj, Object obj2, Object obj3, Object obj4, String str) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    @Override // androidx.compose.runtime.CancellationHandle
    public void cancel() {
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.$r8$classId) {
            case 17:
                ((Player.Listener) obj).onPlayerError(new ExoPlaybackException(2, new ExoTimeoutException("Player release timed out."), IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_COLOR_TABLE));
                break;
            case 18:
                ((Player.Listener) obj).onRenderedFirstFrame();
                break;
            case 19:
                ((AnalyticsListener) obj).getClass();
                break;
            case 20:
                ((AnalyticsListener) obj).getClass();
                break;
            case 21:
                ((AnalyticsListener) obj).getClass();
                break;
            case 22:
                ((AnalyticsListener) obj).getClass();
                break;
            case 23:
                ((AnalyticsListener) obj).getClass();
                break;
            case 24:
                ((AnalyticsListener) obj).getClass();
                break;
            case 25:
                ((AnalyticsListener) obj).getClass();
                break;
            case 26:
                ((AnalyticsListener) obj).getClass();
                break;
            case 27:
                ((AnalyticsListener) obj).getClass();
                break;
            case 28:
                ((AnalyticsListener) obj).getClass();
                break;
            default:
                ((AnalyticsListener) obj).getClass();
                break;
        }
    }

    @Override // androidx.compose.runtime.ShouldPauseCallback
    public boolean shouldPause() {
        return false;
    }

    public static /* bridge */ /* synthetic */ SplashScreenView m(Object obj) {
        return (SplashScreenView) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ boolean m1102m(Object obj) {
        return obj instanceof SplashScreenView;
    }
}
