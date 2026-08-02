package defpackage;

import android.content.Intent;
import android.view.KeyEvent;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;

/* loaded from: classes.dex */
public final class pkx extends bsh {
    public final /* synthetic */ mmx g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pkx(mmx mmxVar) {
        super(1);
        this.g = mmxVar;
    }

    @Override // defpackage.bsh
    public final void A() {
        mmx.v.b("onPlay", new Object[0]);
        xun xunVar = this.g.n;
        if (xunVar != null) {
            xunVar.r();
        }
    }

    @Override // defpackage.bsh
    public final void N(long j) {
        mmx.v.b("onSeekTo %d", Long.valueOf(j));
        xun xunVar = this.g.n;
        if (xunVar == null) {
            return;
        }
        xunVar.q(new rrh(j));
    }

    @Override // defpackage.bsh
    public final void V() {
        mmx.v.b("onSkipToNext", new Object[0]);
        xun xunVar = this.g.n;
        if (xunVar != null) {
            y1g.B("Must be called from the main thread.");
            if (xunVar.y()) {
                xun.z(new z0x(xunVar, 1));
            } else {
                xun.t();
            }
        }
    }

    @Override // defpackage.bsh
    public final void Y() {
        mmx.v.b("onSkipToPrevious", new Object[0]);
        xun xunVar = this.g.n;
        if (xunVar != null) {
            y1g.B("Must be called from the main thread.");
            if (xunVar.y()) {
                xun.z(new z0x(xunVar, 0));
            } else {
                xun.t();
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.bsh
    public final void r(String str) {
        mmx.v.b("onCustomAction with action = %s", str);
        int hashCode = str.hashCode();
        mmx mmxVar = this.g;
        switch (hashCode) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    long j = -mmxVar.e.c;
                    xun xunVar = mmxVar.n;
                    if (xunVar == null) {
                        return;
                    }
                    long min = Math.min(xunVar.g(), Math.max(0L, xunVar.a() + j));
                    xun xunVar2 = mmxVar.n;
                    if (xunVar2 == null) {
                        return;
                    }
                    xunVar2.q(new rrh(min));
                    return;
                }
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    jmp jmpVar = mmxVar.d;
                    if (jmpVar != null) {
                        jmpVar.b(true);
                        return;
                    }
                    return;
                }
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    jmp jmpVar2 = mmxVar.d;
                    if (jmpVar2 != null) {
                        jmpVar2.b(false);
                        return;
                    }
                    return;
                }
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    long j2 = mmxVar.e.c;
                    xun xunVar3 = mmxVar.n;
                    if (xunVar3 == null) {
                        return;
                    }
                    long min2 = Math.min(xunVar3.g(), Math.max(0L, xunVar3.a() + j2));
                    xun xunVar4 = mmxVar.n;
                    if (xunVar4 == null) {
                        return;
                    }
                    xunVar4.q(new rrh(min2));
                    return;
                }
                break;
        }
        Intent intent = new Intent(str);
        intent.setComponent(mmxVar.g);
        mmxVar.a.sendBroadcast(intent);
    }

    @Override // defpackage.bsh
    public final boolean v(Intent intent) {
        xun xunVar;
        mmx.v.b("onMediaButtonEvent", new Object[0]);
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null) {
            return true;
        }
        if ((keyEvent.getKeyCode() != 127 && keyEvent.getKeyCode() != 126) || (xunVar = this.g.n) == null) {
            return true;
        }
        xunVar.r();
        return true;
    }

    @Override // defpackage.bsh
    public final void w() {
        mmx.v.b("onPause", new Object[0]);
        xun xunVar = this.g.n;
        if (xunVar != null) {
            xunVar.r();
        }
    }
}
