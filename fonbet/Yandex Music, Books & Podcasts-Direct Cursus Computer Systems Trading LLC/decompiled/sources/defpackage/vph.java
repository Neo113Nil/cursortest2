package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.a;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class vph implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ aqh b;

    public /* synthetic */ vph(aqh aqhVar, int i) {
        this.a = i;
        this.b = aqhVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        PlaybackStateCompat playbackStateCompat;
        PendingIntent sessionActivity;
        int i2 = this.a;
        int i3 = 0;
        aqh aqhVar = this.b;
        switch (i2) {
            case 0:
                Context context = aqhVar.j;
                AccessibilityManager accessibilityManager = aqhVar.T0;
                int id = view.getId();
                if (id != 16908313 && id != 16908314) {
                    if (id != R.id.mr_control_playback_ctrl) {
                        if (id == R.id.mr_close) {
                            aqhVar.dismiss();
                            break;
                        }
                    } else {
                        aqd aqdVar = aqhVar.y0;
                        if (aqdVar != null && (playbackStateCompat = aqhVar.A0) != null) {
                            i = playbackStateCompat.a != 3 ? 0 : 1;
                            if (i != 0 && (playbackStateCompat.e & 514) != 0) {
                                aqdVar.n().a.pause();
                                i3 = R.string.mr_controller_pause;
                            } else if (i != 0 && (playbackStateCompat.e & 1) != 0) {
                                aqdVar.n().a.stop();
                                i3 = R.string.mr_controller_stop;
                            } else if (i == 0 && (playbackStateCompat.e & 516) != 0) {
                                aqdVar.n().a.play();
                                i3 = R.string.mr_controller_play;
                            }
                            if (accessibilityManager != null && accessibilityManager.isEnabled() && i3 != 0) {
                                AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                                obtain.setPackageName(context.getPackageName());
                                obtain.setClassName(vph.class.getName());
                                obtain.getText().add(context.getString(i3));
                                accessibilityManager.sendAccessibilityEvent(obtain);
                                break;
                            }
                        }
                    }
                } else {
                    if (aqhVar.i.g()) {
                        krh krhVar = aqhVar.g;
                        i = id == 16908313 ? 2 : 1;
                        krhVar.getClass();
                        krh.k(i);
                    }
                    aqhVar.dismiss();
                    break;
                }
                break;
            case 1:
                aqhVar.dismiss();
                break;
            case 2:
                aqd aqdVar2 = aqhVar.y0;
                if (aqdVar2 != null && (sessionActivity = ((a) aqdVar2.b).a.getSessionActivity()) != null) {
                    try {
                        sessionActivity.send();
                        aqhVar.dismiss();
                        break;
                    } catch (PendingIntent.CanceledException unused) {
                        Log.e("MediaRouteCtrlDialog", sessionActivity + " was not sent, it had been canceled.");
                        return;
                    }
                }
                break;
            default:
                boolean z = aqhVar.K0;
                aqhVar.K0 = !z;
                if (!z) {
                    aqhVar.E.setVisibility(0);
                }
                aqhVar.Q0 = aqhVar.K0 ? aqhVar.R0 : aqhVar.S0;
                aqhVar.r(true);
                break;
        }
    }
}
