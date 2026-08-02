package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;

/* loaded from: classes.dex */
public final class xph implements IBinder.DeathRecipient {
    public final lkh a = new lkh(this);
    public ol7 b;
    public nkh c;
    public final /* synthetic */ int d;
    public final /* synthetic */ gr0 e;

    public xph(gr0 gr0Var, int i) {
        this.d = i;
        this.e = gr0Var;
    }

    public final void a(MediaMetadataCompat mediaMetadataCompat) {
        switch (this.d) {
            case 0:
                aqh aqhVar = (aqh) this.e;
                aqhVar.B0 = mediaMetadataCompat == null ? null : mediaMetadataCompat.d();
                aqhVar.p();
                aqhVar.o(false);
                break;
            default:
                wqh wqhVar = (wqh) this.e;
                wqhVar.L = mediaMetadataCompat == null ? null : mediaMetadataCompat.d();
                wqhVar.f();
                wqhVar.j();
                break;
        }
    }

    public void b(PlaybackStateCompat playbackStateCompat) {
        switch (this.d) {
            case 0:
                aqh aqhVar = (aqh) this.e;
                aqhVar.A0 = playbackStateCompat;
                aqhVar.o(false);
                break;
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        e(8, null, null);
    }

    public final void d() {
        switch (this.d) {
            case 0:
                aqh aqhVar = (aqh) this.e;
                aqd aqdVar = aqhVar.y0;
                if (aqdVar != null) {
                    aqdVar.t(aqhVar.z0);
                    aqhVar.y0 = null;
                    break;
                }
                break;
            default:
                wqh wqhVar = (wqh) this.e;
                aqd aqdVar2 = wqhVar.J;
                if (aqdVar2 != null) {
                    aqdVar2.t(wqhVar.K);
                    wqhVar.J = null;
                    break;
                }
                break;
        }
    }

    public final void e(int i, Object obj, Bundle bundle) {
        ol7 ol7Var = this.b;
        if (ol7Var != null) {
            Message obtainMessage = ol7Var.obtainMessage(i, obj);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }

    public final void f(Handler handler) {
        if (handler != null) {
            ol7 ol7Var = new ol7(this, handler.getLooper(), 2);
            this.b = ol7Var;
            ol7Var.b = true;
        } else {
            ol7 ol7Var2 = this.b;
            if (ol7Var2 != null) {
                ol7Var2.b = false;
                ol7Var2.removeCallbacksAndMessages(null);
                this.b = null;
            }
        }
    }

    public final void c(PlaybackStateCompat playbackStateCompat) {
    }
}
