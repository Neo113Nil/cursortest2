package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import com.yandex.music.shared.playback.api.commands.PauseCommand;
import com.yandex.music.shared.playback.api.commands.SuspendCommand;
import com.yandex.music.shared.playback.api.commands.UnsuspendCommand;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class y1c {
    public final Context a;
    public final mm6 b;
    public final bv3 c;
    public final osh d;
    public oxa e;
    public boolean f;
    public volatile boolean g;
    public final qqi h;
    public rar i;

    public y1c(Context context) {
        dq7 dq7Var = ca8.a;
        tf6 e = gld.e(mn7.d.plus(a4g.n()));
        this.a = context;
        this.b = e;
        this.c = new bv3();
        osh oshVar = new osh();
        oshVar.a = this;
        nb0 nb0Var = new nb0(0, oshVar);
        oshVar.b = new AtomicBoolean(false);
        oshVar.c = new cx1(context, 1, 2, nb0Var);
        this.d = oshVar;
        this.h = rqi.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0096, code lost:
    
        if (defpackage.x97.V(r12, r2, r0) == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d2, code lost:
    
        if (defpackage.y2x.o(5000, r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00d2 -> B:12:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(y1c y1cVar, cg6 cg6Var) {
        v1c v1cVar;
        int i;
        vqn vqnVar;
        vqn vqnVar2;
        int i2;
        if (cg6Var instanceof v1c) {
            v1cVar = (v1c) cg6Var;
            int i3 = v1cVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                v1cVar.m = i3 - Integer.MIN_VALUE;
                Object obj = v1cVar.k;
                nm6 nm6Var = nm6.a;
                i = v1cVar.m;
                Continuation continuation = null;
                if (i == 0) {
                    if (i == 1) {
                        vqnVar2 = v1cVar.j;
                        qgg.h0(obj);
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (!saf.X(v1cVar.getContext())) {
                        }
                        return nm6Var;
                    }
                    if (i == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    if (i != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vqnVar2 = v1cVar.j;
                    qgg.h0(obj);
                    vqnVar = vqnVar2;
                    i2 = vqnVar.a;
                    if (i2 < 3) {
                        ssg.a(7, "ExternalMediaSignalsHelper", "Audio focus is not granted", null);
                        oxa oxaVar = y1cVar.e;
                        if (oxaVar != null) {
                            ssg.a(3, "ExternalMediaSignalsCenter", "onFocusAcquiringFailed", null);
                            ((k1l) ((jyr) ((eps) oxaVar.b).d).getValue()).a(PauseCommand.INSTANCE, a3t.a);
                        }
                        return Unit.a;
                    }
                    int i4 = i2 + 1;
                    vqnVar.a = i4;
                    ssg.a(3, "ExternalMediaSignalsHelper", dfi.c(i4, "FocusLoop: requesting... (attempt ", "/3)"), null);
                    osh oshVar = y1cVar.d;
                    v1cVar.j = vqnVar;
                    v1cVar.m = 1;
                    Object S = oshVar.S(v1cVar);
                    if (S != nm6Var) {
                        vqnVar2 = vqnVar;
                        obj = S;
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        if (!saf.X(v1cVar.getContext())) {
                            if (booleanValue2) {
                                ssg.a(3, "ExternalMediaSignalsHelper", "FocusLoop: cancelled after focus granted, abandoning immediately", null);
                                l8j l8jVar = l8j.c;
                                w1c w1cVar = new w1c(y1cVar, continuation, 0);
                                v1cVar.j = null;
                                v1cVar.m = 2;
                            }
                            return Unit.a;
                        }
                        if (booleanValue2) {
                            ssg.a(3, "ExternalMediaSignalsHelper", "FocusLoop: acquired!", null);
                            y1cVar.f = false;
                            bv3 bv3Var = y1cVar.c;
                            Context context = y1cVar.a;
                            bv3Var.getClass();
                            context.getClass();
                            ssg.a(3, "HeadsetReceiver", "register", null);
                            bv3Var.c = y1cVar;
                            fx1.l(context, bv3Var, (IntentFilter) bv3Var.b);
                            return Unit.a;
                        }
                        ssg.a(3, "ExternalMediaSignalsHelper", "FocusLoop: denied, retrying in 5000ms...", null);
                        v1cVar.j = vqnVar2;
                        v1cVar.m = 3;
                    }
                    return nm6Var;
                }
                qgg.h0(obj);
                vqnVar = new vqn();
                i2 = vqnVar.a;
                if (i2 < 3) {
                }
            }
        }
        v1cVar = new v1c(y1cVar, cg6Var);
        Object obj2 = v1cVar.k;
        nm6 nm6Var2 = nm6.a;
        i = v1cVar.m;
        Continuation continuation2 = null;
        if (i == 0) {
        }
    }

    public final void b() {
        k5r.v("onGainedAudioFocus. playOnFocusGain: ", this.f, 3, "ExternalMediaSignalsHelper", null);
        oxa oxaVar = this.e;
        a3t a3tVar = a3t.a;
        if (oxaVar != null) {
            ((k1l) ((jyr) ((eps) oxaVar.b).d).getValue()).a(sj2.k, a3tVar);
        }
        if (this.f) {
            oxa oxaVar2 = this.e;
            if (oxaVar2 != null) {
                ssg.a(3, "ExternalMediaSignalsCenter", "onRestorePlayback", null);
                ((k1l) ((jyr) ((eps) oxaVar2.b).d).getValue()).a(UnsuspendCommand.INSTANCE, a3tVar);
            }
            this.f = false;
        }
    }

    public final void c(boolean z, boolean z2) {
        ssg.a(3, "ExternalMediaSignalsHelper", "onLostAudioFocus. isTransient: " + z + ", canDuck: " + z2, null);
        a3t a3tVar = a3t.a;
        if (z2) {
            oxa oxaVar = this.e;
            if (oxaVar != null) {
                ((k1l) ((jyr) ((eps) oxaVar.b).d).getValue()).a(vq1.j, a3tVar);
                return;
            }
            return;
        }
        this.f = z;
        oxa oxaVar2 = this.e;
        if (z) {
            if (oxaVar2 != null) {
                ssg.a(3, "ExternalMediaSignalsCenter", "onSuspendPlayback", null);
                ((k1l) ((jyr) ((eps) oxaVar2.b).d).getValue()).a(SuspendCommand.INSTANCE, a3tVar);
            }
        } else if (oxaVar2 != null) {
            ssg.a(3, "ExternalMediaSignalsCenter", "onPausePlayback", null);
            ((k1l) ((jyr) ((eps) oxaVar2.b).d).getValue()).a(PauseCommand.INSTANCE, a3tVar);
        }
        k5r.v("Pausing. playOnFocusGain: ", this.f, 3, "ExternalMediaSignalsHelper", null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x013a, code lost:
    
        if (r13 == r2) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d5 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x0031, B:23:0x00d1, B:25:0x00d5, B:27:0x00df, B:30:0x00e5, B:31:0x00f4, B:33:0x010c, B:35:0x0124, B:36:0x012e, B:41:0x0135, B:44:0x0129, B:45:0x0138, B:52:0x00af, B:54:0x00b3), top: B:7:0x0027, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f4 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x0031, B:23:0x00d1, B:25:0x00d5, B:27:0x00df, B:30:0x00e5, B:31:0x00f4, B:33:0x010c, B:35:0x0124, B:36:0x012e, B:41:0x0135, B:44:0x0129, B:45:0x0138, B:52:0x00af, B:54:0x00b3), top: B:7:0x0027, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b3 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x0031, B:23:0x00d1, B:25:0x00d5, B:27:0x00df, B:30:0x00e5, B:31:0x00f4, B:33:0x010c, B:35:0x0124, B:36:0x012e, B:41:0x0135, B:44:0x0129, B:45:0x0138, B:52:0x00af, B:54:0x00b3), top: B:7:0x0027, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r10v1, types: [oqi] */
    /* JADX WARN: Type inference failed for: r12v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11, types: [oqi] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v19, types: [oqi] */
    /* JADX WARN: Type inference failed for: r12v2, types: [oqi] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v8, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(boolean z, boolean z2, Continuation continuation) {
        x1c x1cVar;
        int i;
        int i2;
        boolean z3;
        qqi qqiVar;
        boolean z4;
        int i3;
        rar rarVar;
        boolean z5;
        oqi oqiVar;
        int i4;
        int i5;
        Object obj;
        osh oshVar = this.d;
        try {
            if (continuation instanceof x1c) {
                x1cVar = (x1c) continuation;
                int i6 = x1cVar.r;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    x1cVar.r = i6 - Integer.MIN_VALUE;
                    Object obj2 = x1cVar.p;
                    nm6 nm6Var = nm6.a;
                    i = x1cVar.r;
                    int i7 = 0;
                    Continuation continuation2 = null;
                    if (i != 0) {
                        qgg.h0(obj2);
                        ssg.a(3, "ExternalMediaSignalsHelper", "setState: playing=" + ((boolean) z) + ", isRemote=" + z2, null);
                        if (this.g) {
                            dfi.r("Object has been released", "ExternalMediaSignalsHelper");
                            return Unit.a;
                        }
                        i2 = (z == 0 || z2) ? 0 : 1;
                        qqi qqiVar2 = this.h;
                        x1cVar.o = qqiVar2;
                        x1cVar.j = z;
                        x1cVar.k = z2;
                        x1cVar.l = i2;
                        x1cVar.m = 0;
                        x1cVar.r = 1;
                        if (qqiVar2.a(x1cVar) != nm6Var) {
                            z3 = z;
                            qqiVar = qqiVar2;
                            z4 = z2;
                            i3 = 0;
                        }
                        return nm6Var;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            z = x1cVar.o;
                            qgg.h0(obj2);
                            z.b(null);
                            return Unit.a;
                        }
                        i7 = x1cVar.n;
                        i4 = x1cVar.m;
                        i5 = x1cVar.l;
                        z4 = x1cVar.k;
                        z5 = x1cVar.j;
                        oqiVar = x1cVar.o;
                        try {
                            qgg.h0(obj2);
                            i2 = i5;
                            i3 = i4;
                            z = oqiVar;
                            z3 = z5;
                            this.i = null;
                            if (i2 == 0) {
                                x1cVar.o = z;
                                x1cVar.j = z3;
                                x1cVar.k = z4;
                                x1cVar.l = i2;
                                x1cVar.m = i3;
                                x1cVar.n = i7;
                                x1cVar.r = 3;
                                if (((AtomicBoolean) oshVar.b).get()) {
                                    ssg.a(3, "ExternalMediaSignalsHelper", "abandonFocus: releasing", null);
                                    bv3 bv3Var = this.c;
                                    Context context = this.a;
                                    bv3Var.getClass();
                                    context.getClass();
                                    ssg.a(3, "HeadsetReceiver", "unregister", null);
                                    bv3Var.c = null;
                                    try {
                                        context.unregisterReceiver(bv3Var);
                                    } catch (IllegalArgumentException e) {
                                        ssg.a(3, "HeadsetReceiver", "unregister receiver exception", e);
                                    }
                                    obj = oshVar.l(x1cVar);
                                    if (obj != nm6Var) {
                                        obj = Unit.a;
                                    }
                                } else {
                                    obj = Unit.a;
                                }
                            } else {
                                if (((AtomicBoolean) oshVar.b).get()) {
                                    Unit unit = Unit.a;
                                    z.b(null);
                                    return unit;
                                }
                                this.i = x97.y(this.b, null, null, new w1c(this, continuation2, 1), 3);
                            }
                            z.b(null);
                            return Unit.a;
                        } catch (Throwable th) {
                            th = th;
                            z = oqiVar;
                            z.b(null);
                            throw th;
                        }
                    }
                    int i8 = x1cVar.m;
                    int i9 = x1cVar.l;
                    z4 = x1cVar.k;
                    z3 = x1cVar.j;
                    ?? r10 = x1cVar.o;
                    qgg.h0(obj2);
                    i2 = i9;
                    i3 = i8;
                    qqiVar = r10;
                    rarVar = this.i;
                    z = qqiVar;
                    if (rarVar != null) {
                        x1cVar.o = qqiVar;
                        x1cVar.j = z3;
                        x1cVar.k = z4;
                        x1cVar.l = i2;
                        x1cVar.m = i3;
                        x1cVar.n = 0;
                        x1cVar.r = 2;
                        if (saf.C(rarVar, x1cVar) == nm6Var) {
                            return nm6Var;
                        }
                        z5 = z3;
                        oqiVar = qqiVar;
                        i4 = i3;
                        i5 = i2;
                        i2 = i5;
                        i3 = i4;
                        z = oqiVar;
                        z3 = z5;
                    }
                    this.i = null;
                    if (i2 == 0) {
                    }
                    z.b(null);
                    return Unit.a;
                }
            }
            if (i != 0) {
            }
            rarVar = this.i;
            z = qqiVar;
            if (rarVar != null) {
            }
            this.i = null;
            if (i2 == 0) {
            }
            z.b(null);
            return Unit.a;
        } catch (Throwable th2) {
            th = th2;
        }
        x1cVar = new x1c(this, continuation);
        Object obj22 = x1cVar.p;
        nm6 nm6Var2 = nm6.a;
        i = x1cVar.r;
        int i72 = 0;
        Continuation continuation22 = null;
    }
}
