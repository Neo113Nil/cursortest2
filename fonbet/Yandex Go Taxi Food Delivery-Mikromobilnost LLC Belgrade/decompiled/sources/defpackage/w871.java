package defpackage;

import android.media.MediaCodec;
import android.os.Message;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import yads.uj1;
import yads.zm0;

/* loaded from: classes7.dex */
public final /* synthetic */ class w871 implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ uj1 b;

    public /* synthetic */ w871(ss81 ss81Var, uj1 uj1Var, int i) {
        this.a = i;
        this.b = uj1Var;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        int i = this.a;
        uj1 uj1Var = this.b;
        switch (i) {
            case 0:
                if (rf71.a < 30) {
                    uj1Var.b.sendMessageAtFrontOfQueue(Message.obtain(uj1Var.b, 0, (int) (j >> 32), (int) j));
                    break;
                } else {
                    yl81 yl81Var = uj1Var.c;
                    if (uj1Var == yl81Var.X4) {
                        if (j == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
                            yl81Var.N0 = true;
                            break;
                        } else {
                            try {
                                yl81Var.C(j);
                                yl81Var.V();
                                yl81Var.P0.e++;
                                yl81Var.B2 = true;
                                if (!yl81Var.x2) {
                                    yl81Var.x2 = true;
                                    yl81Var.x1.a(yl81Var.V1);
                                    yl81Var.p2 = true;
                                }
                                yl81Var.t(j);
                                break;
                            } catch (zm0 e) {
                                uj1Var.c.O0 = e;
                                return;
                            }
                        }
                    }
                }
                break;
            default:
                if (rf71.a < 30) {
                    uj1Var.b.sendMessageAtFrontOfQueue(Message.obtain(uj1Var.b, 0, (int) (j >> 32), (int) j));
                    break;
                } else {
                    yl81 yl81Var2 = uj1Var.c;
                    if (uj1Var == yl81Var2.X4) {
                        if (j == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
                            yl81Var2.N0 = true;
                            break;
                        } else {
                            try {
                                yl81Var2.C(j);
                                yl81Var2.V();
                                yl81Var2.P0.e++;
                                yl81Var2.B2 = true;
                                if (!yl81Var2.x2) {
                                    yl81Var2.x2 = true;
                                    yl81Var2.x1.a(yl81Var2.V1);
                                    yl81Var2.p2 = true;
                                }
                                yl81Var2.t(j);
                                break;
                            } catch (zm0 e2) {
                                uj1Var.c.O0 = e2;
                            }
                        }
                    }
                }
                break;
        }
    }
}
