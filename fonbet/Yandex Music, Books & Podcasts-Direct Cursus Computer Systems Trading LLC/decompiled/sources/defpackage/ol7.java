package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class ol7 extends Handler {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ol7(IBinder.DeathRecipient deathRecipient, Looper looper, int i) {
        super(looper);
        this.a = i;
        this.c = deathRecipient;
        this.b = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message message) {
        Exception exc;
        int g;
        d9e d;
        d9e d2;
        boolean A;
        switch (this.a) {
            case 0:
                pl7 pl7Var = (pl7) message.obj;
                try {
                    int i = message.what;
                    if (i == 1) {
                        ql7 ql7Var = (ql7) this.c;
                        exc = ql7Var.l.a(ql7Var.m, (nqb) pl7Var.c);
                    } else {
                        if (i != 2) {
                            throw new RuntimeException();
                        }
                        ql7 ql7Var2 = (ql7) this.c;
                        exc = ql7Var2.l.c(ql7Var2.m, (lqb) pl7Var.c);
                    }
                } catch (tmh e) {
                    pl7 pl7Var2 = (pl7) message.obj;
                    exc = e;
                    if (pl7Var2.b) {
                        int i2 = pl7Var2.d + 1;
                        pl7Var2.d = i2;
                        exc = e;
                        if (i2 <= ((ql7) this.c).j.r(3)) {
                            SystemClock.elapsedRealtime();
                            SystemClock.elapsedRealtime();
                            long C = ((ql7) this.c).j.C(new j4x(e.getCause() instanceof IOException ? (IOException) e.getCause() : new pg5(e.getCause()), pl7Var2.d, 9));
                            exc = e;
                            if (C != -9223372036854775807L) {
                                synchronized (this) {
                                    try {
                                        if (!this.b) {
                                            sendMessageDelayed(Message.obtain(message), C);
                                            return;
                                        }
                                        exc = e;
                                    } finally {
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception e2) {
                    vq1.o0("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                    exc = e2;
                }
                xeg xegVar = ((ql7) this.c).j;
                long j = pl7Var.a;
                xegVar.getClass();
                synchronized (this) {
                    try {
                        if (!this.b) {
                            ((ql7) this.c).o.obtainMessage(message.what, Pair.create(pl7Var.c, exc)).sendToTarget();
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                zlh zlhVar = (zlh) this.c;
                bmh bmhVar = zlhVar.e;
                if (this.b) {
                    switch (message.what) {
                        case 1:
                            Bundle data = message.getData();
                            nsh.g(data);
                            zlhVar.h((String) message.obj, data);
                            return;
                        case 2:
                            zlhVar.e((i6l) message.obj);
                            return;
                        case 3:
                            zlhVar.d((ioh) message.obj);
                            return;
                        case 4:
                            zlhVar.a((rkh) message.obj);
                            return;
                        case 5:
                            zlhVar.f((List) message.obj);
                            return;
                        case 6:
                            zlhVar.g((CharSequence) message.obj);
                            return;
                        case 7:
                            Bundle bundle = (Bundle) message.obj;
                            nsh.g(bundle);
                            zlhVar.c(bundle);
                            return;
                        case 8:
                            bmhVar.b.a();
                            return;
                        case 9:
                            int intValue = ((Integer) message.obj).intValue();
                            amh amhVar = bmhVar.n;
                            bmhVar.n = new amh((rkh) amhVar.d, (i6l) amhVar.e, (ioh) amhVar.f, amhVar.a, (CharSequence) amhVar.g, intValue, amhVar.c, (Bundle) amhVar.h);
                            zlhVar.k();
                            return;
                        case 10:
                        default:
                            return;
                        case 11:
                            zlhVar.b(((Boolean) message.obj).booleanValue());
                            return;
                        case 12:
                            int intValue2 = ((Integer) message.obj).intValue();
                            amh amhVar2 = bmhVar.n;
                            bmhVar.n = new amh((rkh) amhVar2.d, (i6l) amhVar2.e, (ioh) amhVar2.f, amhVar2.a, (CharSequence) amhVar2.g, amhVar2.b, intValue2, (Bundle) amhVar2.h);
                            zlhVar.k();
                            return;
                        case 13:
                            if (!bmhVar.l) {
                                bmhVar.V0();
                                return;
                            }
                            amh amhVar3 = bmhVar.n;
                            i6l Q0 = bmh.Q0(bmhVar.i.p());
                            d9e d3 = ((okh) bmhVar.i.b).e.d();
                            int i3 = -1;
                            if (d3 != null) {
                                try {
                                    g = d3.g();
                                } catch (RemoteException e3) {
                                    Log.e("MediaControllerCompat", "Dead object in getRepeatMode.", e3);
                                }
                                d = ((okh) bmhVar.i.b).e.d();
                                if (d != null) {
                                    try {
                                        i3 = d.z();
                                    } catch (RemoteException e4) {
                                        Log.e("MediaControllerCompat", "Dead object in getShuffleMode.", e4);
                                    }
                                }
                                bmhVar.n = new amh((rkh) amhVar3.d, Q0, (ioh) amhVar3.f, amhVar3.a, (CharSequence) amhVar3.g, g, i3, (Bundle) amhVar3.h);
                                d2 = ((okh) bmhVar.i.b).e.d();
                                if (d2 != null) {
                                    try {
                                        A = d2.A();
                                    } catch (RemoteException e5) {
                                        Log.e("MediaControllerCompat", "Dead object in isCaptioningEnabled.", e5);
                                    }
                                    zlhVar.b(A);
                                    zlhVar.d.removeMessages(1);
                                    bmhVar.S0(false, bmhVar.n);
                                    return;
                                }
                                A = false;
                                zlhVar.b(A);
                                zlhVar.d.removeMessages(1);
                                bmhVar.S0(false, bmhVar.n);
                                return;
                            }
                            g = -1;
                            d = ((okh) bmhVar.i.b).e.d();
                            if (d != null) {
                            }
                            bmhVar.n = new amh((rkh) amhVar3.d, Q0, (ioh) amhVar3.f, amhVar3.a, (CharSequence) amhVar3.g, g, i3, (Bundle) amhVar3.h);
                            d2 = ((okh) bmhVar.i.b).e.d();
                            if (d2 != null) {
                            }
                            A = false;
                            zlhVar.b(A);
                            zlhVar.d.removeMessages(1);
                            bmhVar.S0(false, bmhVar.n);
                            return;
                    }
                }
                return;
            default:
                xph xphVar = (xph) this.c;
                if (this.b) {
                    switch (message.what) {
                        case 1:
                            osh.C(message.getData());
                            return;
                        case 2:
                            xphVar.b((PlaybackStateCompat) message.obj);
                            return;
                        case 3:
                            xphVar.a((MediaMetadataCompat) message.obj);
                            return;
                        case 4:
                            return;
                        case 5:
                            return;
                        case 6:
                            return;
                        case 7:
                            osh.C((Bundle) message.obj);
                            return;
                        case 8:
                            xphVar.d();
                            return;
                        case 9:
                            ((Integer) message.obj).getClass();
                            return;
                        case 10:
                        default:
                            return;
                        case 11:
                            ((Boolean) message.obj).getClass();
                            return;
                        case 12:
                            ((Integer) message.obj).getClass();
                            return;
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol7(ql7 ql7Var, Looper looper) {
        super(looper);
        this.a = 0;
        this.c = ql7Var;
    }
}
