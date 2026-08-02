package defpackage;

import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueLaunch;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class bsn {
    public final vx6 a;
    public final es6 b;
    public final g4l c;
    public final jyk d;

    public bsn(vx6 vx6Var, es6 es6Var, g4l g4lVar, jyk jykVar) {
        this.a = vx6Var;
        this.b = es6Var;
        this.c = g4lVar;
        this.d = jykVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:(1:(2:12|13)(2:15|16))(3:17|18|19))(1:20))(4:27|(1:29)(1:39)|(1:31)|(2:33|34)(3:35|36|(2:38|25)))|21|22|(3:24|18|19)|25))|45|6|7|(0)(0)|21|22|(0)|25) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0043, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b2, code lost:
    
        r10 = defpackage.l8j.c;
        r2 = new defpackage.wrn(r8, null);
        r0.j = r9;
        r0.n = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c1, code lost:
    
        if (defpackage.x97.V(r10, r2, r0) != r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c5, code lost:
    
        throw r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(bsn bsnVar, PlaybackCommand$QueueLaunch.Basic basic, cg6 cg6Var) {
        vrn vrnVar;
        nm6 nm6Var;
        int i;
        l8j l8jVar;
        wrn wrnVar;
        boolean z;
        if (cg6Var instanceof vrn) {
            vrnVar = (vrn) cg6Var;
            int i2 = vrnVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vrnVar.n = i2 - Integer.MIN_VALUE;
                Object obj = vrnVar.l;
                nm6Var = nm6.a;
                i = vrnVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    n3l n3lVar = (n3l) bsnVar.d.b.get(ern.a(basic.getClass()));
                    o3l o3lVar = n3lVar != null ? (o3l) ((ean) n3lVar).a.getValue() : null;
                    if (o3lVar == null) {
                        su4.s(2, null, "Developer Error. Executor not found for command=" + basic, null);
                    }
                    if (o3lVar == null) {
                        return Boolean.FALSE;
                    }
                    bsnVar.c.e.a(w7q.a);
                    es6 es6Var = bsnVar.b;
                    vrnVar.n = 1;
                    obj = o3lVar.a(basic, es6Var, vrnVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            z = vrnVar.k;
                            qgg.h0(obj);
                            return Boolean.valueOf(z);
                        }
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Throwable th = vrnVar.j;
                        qgg.h0(obj);
                        throw th;
                    }
                    qgg.h0(obj);
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                l8jVar = l8j.c;
                wrnVar = new wrn(bsnVar, null);
                vrnVar.k = booleanValue;
                vrnVar.n = 2;
                if (x97.V(l8jVar, wrnVar, vrnVar) != nm6Var) {
                    z = booleanValue;
                    return Boolean.valueOf(z);
                }
                return nm6Var;
            }
        }
        vrnVar = new vrn(bsnVar, cg6Var);
        Object obj2 = vrnVar.l;
        nm6Var = nm6.a;
        i = vrnVar.n;
        if (i != 0) {
        }
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        l8jVar = l8j.c;
        wrnVar = new wrn(bsnVar, null);
        vrnVar.k = booleanValue2;
        vrnVar.n = 2;
        if (x97.V(l8jVar, wrnVar, vrnVar) != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|7|(1:(1:(1:(1:(2:13|14)(2:16|17))(4:18|(1:20)|21|22))(6:23|24|25|26|(4:28|(0)|21|22)|29))(1:30))(4:51|(1:53)(1:63)|(1:55)|(2:57|58)(3:59|60|(2:62|29)))|31|(4:33|(1:35)(1:43)|(1:37)|(6:39|(2:41|29)|25|26|(0)|29))(2:44|(4:46|26|(0)|29)(2:47|(2:49|50)))|42|26|(0)|29))|70|6|7|(0)(0)|31|(0)(0)|42|26|(0)|29) */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0052, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012d, code lost:
    
        r15 = defpackage.l8j.c;
        r0 = new defpackage.asn(r13, null);
        r2.j = r14;
        r2.n = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013c, code lost:
    
        if (defpackage.x97.V(r15, r0, r2) != r3) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0140, code lost:
    
        throw r14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:24:0x004d, B:25:0x00ee, B:30:0x0055, B:31:0x00a3, B:33:0x00a9, B:35:0x00bf, B:37:0x00cd, B:39:0x00e3, B:44:0x00f7, B:47:0x0101, B:49:0x0127, B:50:0x012c, B:60:0x0099), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:24:0x004d, B:25:0x00ee, B:30:0x0055, B:31:0x00a3, B:33:0x00a9, B:35:0x00bf, B:37:0x00cd, B:39:0x00e3, B:44:0x00f7, B:47:0x0101, B:49:0x0127, B:50:0x012c, B:60:0x0099), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(bsn bsnVar, PlaybackCommand$QueueLaunch.Substituting substituting, cg6 cg6Var) {
        zrn zrnVar;
        nm6 nm6Var;
        int i;
        t3l t3lVar;
        int i2;
        l8j l8jVar;
        asn asnVar;
        int i3;
        es6 es6Var = bsnVar.b;
        jyk jykVar = bsnVar.d;
        if (cg6Var instanceof zrn) {
            zrnVar = (zrn) cg6Var;
            int i4 = zrnVar.n;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                zrnVar.n = i4 - Integer.MIN_VALUE;
                Object obj = zrnVar.l;
                nm6Var = nm6.a;
                i = zrnVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    p3l p3lVar = (p3l) jykVar.d.get(ern.a(substituting.getClass()));
                    u3l u3lVar = p3lVar != null ? (u3l) ((lan) p3lVar).a.getValue() : null;
                    if (u3lVar == null) {
                        su4.s(2, null, "Developer Error. Executor not found for command=" + substituting, null);
                    }
                    if (u3lVar == null) {
                        return Boolean.FALSE;
                    }
                    bsnVar.c.e.a(w7q.a);
                    zrnVar.n = 1;
                    obj = u3lVar.a(substituting, es6Var, zrnVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                i3 = zrnVar.k;
                                qgg.h0(obj);
                                return Boolean.valueOf(i3 != 0);
                            }
                            if (i != 4) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Throwable th = zrnVar.j;
                            qgg.h0(obj);
                            throw th;
                        }
                        qgg.h0(obj);
                        i2 = ((Boolean) obj).booleanValue();
                        l8jVar = l8j.c;
                        asnVar = new asn(bsnVar, null);
                        zrnVar.j = null;
                        zrnVar.k = i2;
                        zrnVar.n = 3;
                        if (x97.V(l8jVar, asnVar, zrnVar) != nm6Var) {
                            i3 = i2;
                            return Boolean.valueOf(i3 != 0);
                        }
                        return nm6Var;
                    }
                    qgg.h0(obj);
                }
                t3lVar = (t3l) obj;
                if (!(t3lVar instanceof q3l)) {
                    PlaybackCommand$QueueLaunch.Basic basic = ((q3l) t3lVar).a;
                    n3l n3lVar = (n3l) jykVar.b.get(ern.a(basic.getClass()));
                    o3l o3lVar = n3lVar != null ? (o3l) ((ean) n3lVar).a.getValue() : null;
                    if (o3lVar == null) {
                        Assertions.throwOrSkip$default(new FailedAssertionException("Developer Error. Executor not found for command=" + basic), null, 2, null);
                    }
                    if (o3lVar != null) {
                        zrnVar.j = null;
                        zrnVar.n = 2;
                        obj = o3lVar.a(basic, es6Var, zrnVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        i2 = ((Boolean) obj).booleanValue();
                        l8jVar = l8j.c;
                        asnVar = new asn(bsnVar, null);
                        zrnVar.j = null;
                        zrnVar.k = i2;
                        zrnVar.n = 3;
                        if (x97.V(l8jVar, asnVar, zrnVar) != nm6Var) {
                        }
                        return nm6Var;
                    }
                } else {
                    if (Intrinsics.d(t3lVar, r3l.a)) {
                        i2 = 1;
                        l8jVar = l8j.c;
                        asnVar = new asn(bsnVar, null);
                        zrnVar.j = null;
                        zrnVar.k = i2;
                        zrnVar.n = 3;
                        if (x97.V(l8jVar, asnVar, zrnVar) != nm6Var) {
                        }
                        return nm6Var;
                    }
                    if (!Intrinsics.d(t3lVar, s3l.a)) {
                        throw new x7j();
                    }
                }
                i2 = 0;
                l8jVar = l8j.c;
                asnVar = new asn(bsnVar, null);
                zrnVar.j = null;
                zrnVar.k = i2;
                zrnVar.n = 3;
                if (x97.V(l8jVar, asnVar, zrnVar) != nm6Var) {
                }
                return nm6Var;
            }
        }
        zrnVar = new zrn(bsnVar, cg6Var);
        Object obj2 = zrnVar.l;
        nm6Var = nm6.a;
        i = zrnVar.n;
        if (i != 0) {
        }
        t3lVar = (t3l) obj2;
        if (!(t3lVar instanceof q3l)) {
        }
        i2 = 0;
        l8jVar = l8j.c;
        asnVar = new asn(bsnVar, null);
        zrnVar.j = null;
        zrnVar.k = i2;
        zrnVar.n = 3;
        if (x97.V(l8jVar, asnVar, zrnVar) != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(PlaybackCommand$QueueBound.Basic basic, cg6 cg6Var) {
        urn urnVar;
        int i;
        boolean z;
        if (cg6Var instanceof urn) {
            urnVar = (urn) cg6Var;
            int i2 = urnVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                urnVar.l = i2 - Integer.MIN_VALUE;
                Object obj = urnVar.j;
                nm6 nm6Var = nm6.a;
                i = urnVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    c3l c3lVar = (c3l) this.d.a.get(ern.a(basic.getClass()));
                    d3l d3lVar = c3lVar != null ? (d3l) ((r8n) c3lVar).a.getValue() : null;
                    if (d3lVar == null) {
                        su4.s(2, null, "Developer Error. Executor not found for command=" + basic, null);
                    }
                    if (d3lVar == null) {
                        z = false;
                        return Boolean.valueOf(z);
                    }
                    urnVar.l = 1;
                    obj = d3lVar.a(basic, this.a, urnVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                z = ((Boolean) obj).booleanValue();
                return Boolean.valueOf(z);
            }
        }
        urnVar = new urn(this, cg6Var);
        Object obj2 = urnVar.j;
        nm6 nm6Var2 = nm6.a;
        i = urnVar.l;
        if (i != 0) {
        }
        z = ((Boolean) obj2).booleanValue();
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0132, code lost:
    
        if (r13 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0129, code lost:
    
        if (r13 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b4, code lost:
    
        if (r13 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cc, code lost:
    
        if (r13 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x009a, code lost:
    
        if (r13 == r1) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0129 -> B:14:0x012c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(PlaybackCommand$QueueBound.Substituting substituting, cg6 cg6Var) {
        yrn yrnVar;
        int i;
        j3l j3lVar;
        int i2;
        Iterator it;
        int i3;
        boolean booleanValue;
        if (cg6Var instanceof yrn) {
            yrnVar = (yrn) cg6Var;
            int i4 = yrnVar.n;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                yrnVar.n = i4 - Integer.MIN_VALUE;
                Object obj = yrnVar.l;
                Object obj2 = nm6.a;
                i = yrnVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    e3l e3lVar = (e3l) this.d.c.get(ern.a(substituting.getClass()));
                    k3l k3lVar = e3lVar != null ? (k3l) ((s8n) e3lVar).a.getValue() : null;
                    if (k3lVar == null) {
                        su4.s(2, null, "Developer Error. Executor not found for command=" + substituting, null);
                    }
                    if (k3lVar == null) {
                        return Boolean.FALSE;
                    }
                    yrnVar.n = 1;
                    obj = k3lVar.a(substituting, this.a, yrnVar);
                } else if (i == 1) {
                    qgg.h0(obj);
                } else {
                    if (i == 2) {
                        qgg.h0(obj);
                        i2 = ((Boolean) obj).booleanValue();
                        return Boolean.valueOf(i2 != 0);
                    }
                    if (i == 3) {
                        qgg.h0(obj);
                        i2 = ((Boolean) obj).booleanValue();
                        return Boolean.valueOf(i2 != 0);
                    }
                    if (i == 4) {
                        i3 = yrnVar.k;
                        it = yrnVar.j;
                        qgg.h0(obj);
                        booleanValue = ((Boolean) obj).booleanValue();
                    } else {
                        if (i != 5) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i5 = yrnVar.k;
                        it = yrnVar.j;
                        qgg.h0(obj);
                        i3 = i5;
                        booleanValue = ((Boolean) obj).booleanValue();
                    }
                }
                j3lVar = (j3l) obj;
                if (!(j3lVar instanceof f3l)) {
                    PlaybackCommand$QueueBound playbackCommand$QueueBound = ((f3l) j3lVar).a;
                    if (playbackCommand$QueueBound instanceof PlaybackCommand$QueueBound.Basic) {
                        yrnVar.n = 2;
                        obj = c((PlaybackCommand$QueueBound.Basic) playbackCommand$QueueBound, yrnVar);
                    } else {
                        if (!(playbackCommand$QueueBound instanceof PlaybackCommand$QueueBound.Substituting)) {
                            b6e.s();
                            return null;
                        }
                        yrnVar.n = 3;
                        obj = d((PlaybackCommand$QueueBound.Substituting) playbackCommand$QueueBound, yrnVar);
                    }
                    return obj2;
                }
                if (!(j3lVar instanceof g3l)) {
                    if (Intrinsics.d(j3lVar, h3l.a)) {
                        i2 = 1;
                        return Boolean.valueOf(i2 != 0);
                    }
                    if (!Intrinsics.d(j3lVar, i3l.a)) {
                        b6e.s();
                        return null;
                    }
                    i2 = 0;
                    return Boolean.valueOf(i2 != 0);
                }
                it = ((g3l) j3lVar).a.a.iterator();
                i3 = 1;
                i2 = i3;
                if (it.hasNext()) {
                    PlaybackCommand$QueueBound playbackCommand$QueueBound2 = (PlaybackCommand$QueueBound) it.next();
                    saf.K(yrnVar.getContext());
                    if (playbackCommand$QueueBound2 instanceof PlaybackCommand$QueueBound.Basic) {
                        yrnVar.j = it;
                        yrnVar.k = i3;
                        yrnVar.n = 4;
                        Object c = c((PlaybackCommand$QueueBound.Basic) playbackCommand$QueueBound2, yrnVar);
                        if (c != obj2) {
                            booleanValue = ((Boolean) c).booleanValue();
                        }
                    } else {
                        if (!(playbackCommand$QueueBound2 instanceof PlaybackCommand$QueueBound.Substituting)) {
                            b6e.s();
                            return null;
                        }
                        yrnVar.j = it;
                        yrnVar.k = i3;
                        yrnVar.n = 5;
                        obj = d((PlaybackCommand$QueueBound.Substituting) playbackCommand$QueueBound2, yrnVar);
                        i3 = i3;
                    }
                    return obj2;
                }
                return Boolean.valueOf(i2 != 0);
            }
        }
        yrnVar = new yrn(this, cg6Var);
        Object obj3 = yrnVar.l;
        Object obj22 = nm6.a;
        i = yrnVar.n;
        if (i != 0) {
        }
        j3lVar = (j3l) obj3;
        if (!(j3lVar instanceof f3l)) {
        }
    }
}
