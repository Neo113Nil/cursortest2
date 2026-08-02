package defpackage;

import android.media.AudioManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final /* synthetic */ class nb0 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nb0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        dv1 dv1Var;
        switch (this.a) {
            case 0:
                osh oshVar = (osh) this.b;
                y1c y1cVar = (y1c) oshVar.a;
                Boolean bool = null;
                if (i == -3) {
                    ssg.a(3, "AndroidAudioFocusAdapter", "onAudioFocusChange(): LOSS_TRANSIENT_CAN_DUCK calling onLostAudioFocus(transient=true, duck=true)", null);
                    y1cVar.c(true, true);
                    bool = Boolean.TRUE;
                } else if (i == -2) {
                    ssg.a(3, "AndroidAudioFocusAdapter", "onAudioFocusChange(): LOSS_TRANSIENT calling onLostAudioFocus(transient=true, duck=false)", null);
                    y1cVar.c(true, false);
                    bool = Boolean.FALSE;
                } else if (i == -1) {
                    ssg.a(3, "AndroidAudioFocusAdapter", "onAudioFocusChange(): LOSS calling onLostAudioFocus(transient=false, duck=false)", null);
                    y1cVar.c(false, false);
                    bool = Boolean.FALSE;
                } else if (i != 1) {
                    dfi.r(k5r.i(i, "onAudioFocusChange(): unhandled value: "), "AndroidAudioFocusAdapter");
                } else {
                    ssg.a(3, "AndroidAudioFocusAdapter", "onAudioFocusChange(): GAIN: calling onGainedAudioFocus()", null);
                    y1cVar.b();
                    bool = Boolean.TRUE;
                }
                if (bool != null) {
                    ((AtomicBoolean) oshVar.b).set(bool.booleanValue());
                    break;
                }
                break;
            case 1:
                rw1 rw1Var = (rw1) this.b;
                rw1Var.getClass();
                if (i != -3 && i != -2) {
                    if (i == -1) {
                        fsb fsbVar = rw1Var.c;
                        if (fsbVar != null) {
                            fsbVar.h.a(33, -1, 0).b();
                        }
                        rw1Var.a();
                        rw1Var.b(1);
                        break;
                    } else if (i == 1) {
                        rw1Var.b(2);
                        fsb fsbVar2 = rw1Var.c;
                        if (fsbVar2 != null) {
                            fsbVar2.h.a(33, 1, 0).b();
                            break;
                        }
                    } else {
                        dfi.o(i, "Unknown focus change type: ", "AudioFocusManager");
                        break;
                    }
                } else if (i != -2 && ((dv1Var = rw1Var.d) == null || dv1Var.a != 1)) {
                    rw1Var.b(4);
                    break;
                } else {
                    fsb fsbVar3 = rw1Var.c;
                    if (fsbVar3 != null) {
                        fsbVar3.h.a(33, 0, 0).b();
                    }
                    rw1Var.b(3);
                    break;
                }
                break;
            default:
                acg acgVar = (acg) this.b;
                if (i == -2 || i == -1) {
                    acgVar.g();
                    break;
                }
                break;
        }
    }
}
