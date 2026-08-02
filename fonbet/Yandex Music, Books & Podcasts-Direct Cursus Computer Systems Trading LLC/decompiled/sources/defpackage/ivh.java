package defpackage;

import android.content.Context;
import android.os.PowerManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class ivh implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ ovh b;

    public /* synthetic */ ivh(ovh ovhVar, int i) {
        this.a = i;
        this.b = ovhVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                cmd cmdVar = cmd.a;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                eps epsVar = this.b.c;
                int i = 3;
                Continuation continuation2 = null;
                if (booleanValue) {
                    rar rarVar = (rar) epsVar.e;
                    if (rarVar != null) {
                        rarVar.g(null);
                    }
                    y1c y1cVar = (y1c) epsVar.f;
                    if (y1cVar != null) {
                        if (y1cVar.g) {
                            dfi.r("Object has been released", "ExternalMediaSignalsHelper");
                        } else {
                            y1cVar.e = null;
                        }
                        y1cVar.g = true;
                        gld.L(y1cVar.b, null);
                        ssg.a(3, "ExternalMediaSignalsHelper", "abandonAudioFocusAsync", null);
                        bv3 bv3Var = y1cVar.c;
                        Context context = y1cVar.a;
                        bv3Var.getClass();
                        context.getClass();
                        ssg.a(3, "HeadsetReceiver", "unregister", null);
                        bv3Var.c = null;
                        try {
                            context.unregisterReceiver(bv3Var);
                        } catch (IllegalArgumentException e) {
                            ssg.a(3, "HeadsetReceiver", "unregister receiver exception", e);
                        }
                        osh oshVar = y1cVar.d;
                        oshVar.getClass();
                        ssg.a(3, "AndroidAudioFocusAdapter", "abandonFocusAsync()", null);
                        x97.y(cmdVar, null, null, new hl(oshVar, continuation2, 4), 3);
                        osh oshVar2 = y1cVar.d;
                        oshVar2.getClass();
                        ssg.a(3, "AndroidAudioFocusAdapter", "abandonFocusAsync()", null);
                        x97.y(cmdVar, null, null, new hl(oshVar2, continuation2, 4), 3);
                    }
                    y1c y1cVar2 = new y1c((Context) epsVar.a);
                    oxa oxaVar = (oxa) epsVar.g;
                    if (y1cVar2.g) {
                        dfi.r("Object has been released", "ExternalMediaSignalsHelper");
                    } else {
                        y1cVar2.e = oxaVar;
                    }
                    epsVar.f = y1cVar2;
                    epsVar.e = ox6.B(zsd.b0(new u21(10, ((f7l) ((jyr) epsVar.c).getValue()).c, ((f7l) ((jyr) epsVar.c).getValue()).d, new u1c(i, 0, continuation2))), (tf6) epsVar.b, new u58(20, epsVar));
                } else {
                    rar rarVar2 = (rar) epsVar.e;
                    if (rarVar2 != null) {
                        rarVar2.g(null);
                    }
                    y1c y1cVar3 = (y1c) epsVar.f;
                    if (y1cVar3 != null) {
                        if (y1cVar3.g) {
                            dfi.r("Object has been released", "ExternalMediaSignalsHelper");
                        } else {
                            y1cVar3.e = null;
                        }
                        y1cVar3.g = true;
                        gld.L(y1cVar3.b, null);
                        ssg.a(3, "ExternalMediaSignalsHelper", "abandonAudioFocusAsync", null);
                        bv3 bv3Var2 = y1cVar3.c;
                        Context context2 = y1cVar3.a;
                        bv3Var2.getClass();
                        context2.getClass();
                        ssg.a(3, "HeadsetReceiver", "unregister", null);
                        bv3Var2.c = null;
                        try {
                            context2.unregisterReceiver(bv3Var2);
                        } catch (IllegalArgumentException e2) {
                            ssg.a(3, "HeadsetReceiver", "unregister receiver exception", e2);
                        }
                        osh oshVar3 = y1cVar3.d;
                        oshVar3.getClass();
                        ssg.a(3, "AndroidAudioFocusAdapter", "abandonFocusAsync()", null);
                        x97.y(cmdVar, null, null, new hl(oshVar3, continuation2, 4), 3);
                        osh oshVar4 = y1cVar3.d;
                        oshVar4.getClass();
                        ssg.a(3, "AndroidAudioFocusAdapter", "abandonFocusAsync()", null);
                        x97.y(cmdVar, null, null, new hl(oshVar4, continuation2, 4), 3);
                    }
                    epsVar.f = null;
                }
                break;
            default:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                dxr dxrVar = this.b.b;
                if (booleanValue2) {
                    PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) dxrVar.b;
                    if (wakeLock != null && !wakeLock.isHeld()) {
                        wakeLock.acquire();
                        ssg.a(3, "WakeLockHelper", "WakeLock acquired", null);
                    }
                } else {
                    PowerManager.WakeLock wakeLock2 = (PowerManager.WakeLock) dxrVar.b;
                    if (wakeLock2 != null && wakeLock2.isHeld()) {
                        wakeLock2.release();
                        ssg.a(3, "WakeLockHelper", "WakeLock released", null);
                    }
                }
                break;
        }
        return Unit.a;
    }
}
