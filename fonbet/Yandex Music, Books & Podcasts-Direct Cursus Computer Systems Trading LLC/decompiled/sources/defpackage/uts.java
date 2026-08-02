package defpackage;

import android.net.Uri;
import com.yandex.music.shared.player.download2.DoNotRetryException;
import com.yandex.music.shared.player.download2.HlsMetaValidator$ValidationResult$IoException;
import com.yandex.music.shared.player.download2.InternalDownloadException;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class uts {
    public final b7q a;
    public final vsb b;
    public final j3t c;
    public final fys d;
    public final uhr e;
    public final udp f;
    public final z66 g;
    public final zzp h;
    public final r5q i;
    public final jyr j;
    public final jyr k;
    public final jyr l;
    public final jyr m;
    public final jyr n;
    public final jyr o;

    public uts(b7q b7qVar, vsb vsbVar, dqb dqbVar, j3t j3tVar, fys fysVar, uhr uhrVar, udp udpVar, z66 z66Var, zzp zzpVar, r5q r5qVar) {
        this.a = b7qVar;
        this.b = vsbVar;
        this.c = j3tVar;
        this.d = fysVar;
        this.e = uhrVar;
        this.f = udpVar;
        this.g = z66Var;
        this.h = zzpVar;
        this.i = r5qVar;
        this.j = b7qVar.b(hag.I(cvs.class), true);
        this.k = b7qVar.b(hag.I(zzd.class), true);
        this.l = b7qVar.b(hag.I(nbo.class), true);
        this.m = b7qVar.b(hag.I(oco.class), true);
        this.n = b7qVar.b(hag.I(xol.class), true);
        this.o = b7qVar.b(hag.I(zlr.class), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r10v11, types: [f9f] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7, types: [f9f] */
    /* JADX WARN: Type inference failed for: r11v8, types: [mbo] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9, types: [mbo] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x018a -> B:11:0x0191). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(uts utsVar, qbo qboVar, ots otsVar, cg6 cg6Var) {
        pts ptsVar;
        int i;
        qbo qboVar2;
        tao taoVar;
        lm4 lm4Var;
        int i2;
        int i3;
        int i4;
        ots otsVar2;
        pts ptsVar2;
        qbo qboVar3;
        Object obj;
        ots otsVar3;
        qbo qboVar4;
        tao taoVar2;
        int i5;
        qbo qboVar5;
        int i6;
        Object obj2;
        Exception e;
        InternalDownloadException internalDownloadException;
        qbo qboVar6;
        ?? r12;
        ?? r11;
        tao taoVar3;
        int i7;
        int i8;
        int i9;
        p9 p9Var;
        Object obj3;
        if (cg6Var instanceof pts) {
            ptsVar = (pts) cg6Var;
            int i10 = ptsVar.t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                ptsVar.t = i10 - Integer.MIN_VALUE;
                Object obj4 = ptsVar.r;
                Object obj5 = nm6.a;
                i = ptsVar.t;
                if (i == 0) {
                    if (i == 1) {
                        i9 = ptsVar.q;
                        i8 = ptsVar.p;
                        i7 = ptsVar.o;
                        taoVar3 = ptsVar.n;
                        r11 = ptsVar.m;
                        r12 = ptsVar.l;
                        otsVar3 = ptsVar.k;
                        qboVar6 = ptsVar.j;
                        try {
                            try {
                                qgg.h0(obj4);
                                r11 = r11;
                                r12 = r12;
                            } catch (Exception e2) {
                                e = e2;
                                tao taoVar4 = taoVar3;
                                i2 = i9;
                                i6 = i8;
                                i5 = i7;
                                taoVar2 = taoVar4;
                                qboVar5 = qboVar6;
                                lm4Var = r11;
                                obj2 = obj5;
                                qboVar4 = r12;
                                if (e instanceof IOException) {
                                }
                                internalDownloadException = (InternalDownloadException) (e instanceof InternalDownloadException ? null : e);
                                if (internalDownloadException != null) {
                                }
                            }
                            fts p = utsVar.p((bvs) obj4, otsVar3.c, otsVar3.e);
                            p9Var = p.d;
                            obj = p;
                            if (!(p9Var instanceof cts)) {
                            }
                            return obj;
                        } catch (DoNotRetryException e3) {
                            throw e3.a;
                        } catch (InterruptedException e4) {
                            throw e4;
                        } catch (RuntimeException e5) {
                            throw e5;
                        }
                    }
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i11 = ptsVar.p;
                    int i12 = ptsVar.o;
                    tao taoVar5 = ptsVar.n;
                    ?? r10 = ptsVar.m;
                    ?? r112 = ptsVar.l;
                    ots otsVar4 = ptsVar.k;
                    qbo qboVar7 = ptsVar.j;
                    qgg.h0(obj4);
                    ptsVar2 = ptsVar;
                    qboVar3 = qboVar7;
                    taoVar = taoVar5;
                    qboVar2 = r112;
                    i3 = i11;
                    otsVar2 = otsVar4;
                    i4 = i12;
                    lm4Var = r10;
                    char c = 2;
                    Object obj6 = obj5;
                    i2 = ((Boolean) obj4).booleanValue() ? 1 : 0;
                    obj3 = obj6;
                    if (i2 == 0) {
                        ((Function1) qboVar2.d).invoke((ArrayList) taoVar.e);
                        rj7.f();
                        return null;
                    }
                    try {
                    } catch (Exception e6) {
                        e = e6;
                        qboVar5 = qboVar3;
                        ptsVar = ptsVar2;
                        i5 = i4;
                        qboVar4 = qboVar2;
                        taoVar2 = taoVar;
                        otsVar3 = otsVar2;
                        i6 = i3;
                        obj2 = obj3;
                        if (e instanceof IOException) {
                            j66.h0((IOException) e);
                        }
                        internalDownloadException = (InternalDownloadException) (e instanceof InternalDownloadException ? null : e);
                        if (internalDownloadException != null) {
                            if (qboVar4.a) {
                                Assertions.throwOrSkip("RetryCheckFail", new FailedAssertionException("Unexpected checked " + e + " caught, expected " + lm4Var.f(), e));
                            }
                            throw e;
                        }
                        ptsVar.j = qboVar5;
                        ptsVar.k = otsVar3;
                        ptsVar.l = qboVar4;
                        ptsVar.m = lm4Var;
                        ptsVar.n = taoVar2;
                        ptsVar.o = i5;
                        ptsVar.p = i6;
                        ptsVar.q = i2;
                        c = 2;
                        ptsVar.t = 2;
                        obj4 = taoVar2.m(internalDownloadException, e, ptsVar);
                        obj = obj2;
                        if (obj4 != obj2) {
                            i3 = i6;
                            otsVar2 = otsVar3;
                            taoVar = taoVar2;
                            qboVar2 = qboVar4;
                            i4 = i5;
                            ptsVar2 = ptsVar;
                            qboVar3 = qboVar5;
                            obj6 = obj2;
                            i2 = ((Boolean) obj4).booleanValue() ? 1 : 0;
                            obj3 = obj6;
                            if (i2 == 0) {
                            }
                        }
                        return obj;
                    }
                    cvs cvsVar = (cvs) utsVar.j.getValue();
                    pbo pboVar = qboVar3.e;
                    zvs zvsVar = otsVar2.a;
                    o5n o5nVar = otsVar2.b;
                    gy1 gy1Var = otsVar2.f;
                    ptsVar2.j = qboVar3;
                    ptsVar2.k = otsVar2;
                    ptsVar2.l = qboVar2;
                    ptsVar2.m = lm4Var;
                    ptsVar2.n = taoVar;
                    ptsVar2.o = i4;
                    ptsVar2.p = i3;
                    ptsVar2.q = i2;
                    ptsVar2.t = 1;
                    cvsVar.getClass();
                    obj4 = x97.V(dm6.b, new inr(cvsVar, pboVar, zvsVar, o5nVar, gy1Var, null, 6), ptsVar2);
                    obj = obj3;
                    if (obj4 != obj3) {
                        lm4 lm4Var2 = lm4Var;
                        qboVar6 = qboVar3;
                        ptsVar = ptsVar2;
                        i8 = i3;
                        r11 = lm4Var2;
                        tao taoVar6 = taoVar;
                        otsVar3 = otsVar2;
                        i9 = i2;
                        taoVar3 = taoVar6;
                        int i13 = i4;
                        r12 = qboVar2;
                        i7 = i13;
                        fts p2 = utsVar.p((bvs) obj4, otsVar3.c, otsVar3.e);
                        p9Var = p2.d;
                        obj = p2;
                        if (!(p9Var instanceof cts)) {
                            obj = p2;
                            if (!(p9Var instanceof dts)) {
                                if (!(p9Var instanceof bts)) {
                                    b6e.s();
                                    return null;
                                }
                                ((zlr) utsVar.o.getValue()).a(((bts) p9Var).b);
                                obj = p2;
                            }
                        }
                    }
                    return obj;
                }
                qgg.h0(obj4);
                oco ocoVar = (oco) utsVar.m.getValue();
                lm4 a = ern.a(InternalDownloadException.class);
                qboVar2 = qboVar;
                taoVar = new tao(qboVar2, new mx7(ocoVar.a, null, null));
                lm4Var = a;
                i2 = 1;
                i3 = 0;
                i4 = 0;
                otsVar2 = otsVar;
                ptsVar2 = ptsVar;
                qboVar3 = qboVar2;
                obj3 = obj5;
                if (i2 == 0) {
                }
            }
        }
        ptsVar = new pts(utsVar, cg6Var);
        Object obj42 = ptsVar.r;
        Object obj52 = nm6.a;
        i = ptsVar.t;
        if (i == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r10v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v13, types: [f9f] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8, types: [f9f] */
    /* JADX WARN: Type inference failed for: r11v9, types: [mbo] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9, types: [mbo] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01bd -> B:11:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(uts utsVar, qbo qboVar, zvs zvsVar, thr thrVar, vzg vzgVar, cg6 cg6Var) {
        sts stsVar;
        int i;
        qbo qboVar2;
        zvs zvsVar2;
        tao taoVar;
        sts stsVar2;
        lm4 lm4Var;
        int i2;
        int i3;
        int i4;
        qbo qboVar3;
        thr thrVar2;
        vzg vzgVar2;
        Object obj;
        zvs zvsVar3;
        thr thrVar3;
        vzg vzgVar3;
        qbo qboVar4;
        lm4 lm4Var2;
        tao taoVar2;
        int i5;
        int i6;
        qbo qboVar5;
        int i7;
        Object obj2;
        Exception e;
        InternalDownloadException internalDownloadException;
        ?? r12;
        ?? r11;
        tao taoVar3;
        int i8;
        int i9;
        int i10;
        p9 p9Var;
        Object obj3;
        qbo qboVar6;
        int i11;
        int i12;
        tao taoVar4;
        lm4 lm4Var3;
        if (cg6Var instanceof sts) {
            stsVar = (sts) cg6Var;
            int i13 = stsVar.v;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                stsVar.v = i13 - Integer.MIN_VALUE;
                Object obj4 = stsVar.t;
                Object obj5 = nm6.a;
                i = stsVar.v;
                int i14 = 1;
                if (i == 0) {
                    if (i == 1) {
                        i10 = stsVar.s;
                        i9 = stsVar.r;
                        i8 = stsVar.q;
                        taoVar3 = stsVar.p;
                        r11 = stsVar.o;
                        r12 = stsVar.n;
                        vzgVar3 = stsVar.m;
                        thrVar3 = stsVar.l;
                        zvsVar3 = stsVar.k;
                        qboVar5 = stsVar.j;
                        try {
                            try {
                                qgg.h0(obj4);
                                r12 = r12;
                            } catch (Exception e2) {
                                e = e2;
                                i6 = i10;
                                i7 = i9;
                                i5 = i8;
                                taoVar2 = taoVar3;
                                lm4Var2 = r11;
                                obj2 = obj5;
                                qboVar4 = r12;
                                if (e instanceof IOException) {
                                }
                                internalDownloadException = (InternalDownloadException) (!(e instanceof InternalDownloadException) ? null : e);
                                if (internalDownloadException == null) {
                                }
                            }
                            fts p = utsVar.p((bvs) obj4, thrVar3, vzgVar3);
                            p9Var = p.d;
                            obj = p;
                            if (!(p9Var instanceof cts)) {
                            }
                            return obj;
                        } catch (DoNotRetryException e3) {
                            throw e3.a;
                        } catch (InterruptedException e4) {
                            throw e4;
                        } catch (RuntimeException e5) {
                            throw e5;
                        }
                    }
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i15 = stsVar.r;
                    int i16 = stsVar.q;
                    tao taoVar5 = stsVar.p;
                    ?? r10 = stsVar.o;
                    ?? r112 = stsVar.n;
                    vzg vzgVar4 = stsVar.m;
                    thr thrVar4 = stsVar.l;
                    zvs zvsVar4 = stsVar.k;
                    qbo qboVar7 = stsVar.j;
                    qgg.h0(obj4);
                    i2 = i15;
                    thrVar2 = thrVar4;
                    i3 = i16;
                    qboVar2 = r112;
                    vzgVar2 = vzgVar4;
                    zvsVar2 = zvsVar4;
                    taoVar = taoVar5;
                    stsVar2 = stsVar;
                    qboVar3 = qboVar7;
                    Object obj6 = obj5;
                    lm4 lm4Var4 = r10;
                    lm4Var = lm4Var4;
                    i14 = 1;
                    obj3 = obj6;
                    i4 = ((Boolean) obj4).booleanValue();
                    if (i4 == 0) {
                        ((Function1) qboVar2.d).invoke((ArrayList) taoVar.e);
                        rj7.f();
                        return null;
                    }
                    try {
                    } catch (Exception e6) {
                        e = e6;
                        qboVar6 = qboVar3;
                        stsVar = stsVar2;
                    }
                    cvs cvsVar = (cvs) utsVar.j.getValue();
                    pbo pboVar = qboVar3.e;
                    o5n o5nVar = o5n.c;
                    gy1 gy1Var = gy1.d;
                    stsVar2.j = qboVar3;
                    stsVar2.k = zvsVar2;
                    stsVar2.l = thrVar2;
                    stsVar2.m = vzgVar2;
                    stsVar2.n = qboVar2;
                    stsVar2.o = lm4Var;
                    stsVar2.p = taoVar;
                    stsVar2.q = i3;
                    stsVar2.r = i2;
                    stsVar2.s = i4;
                    stsVar2.v = i14;
                    try {
                    } catch (Exception e7) {
                        e = e7;
                        qboVar6 = qboVar3;
                        stsVar = stsVar2;
                    }
                    cvsVar.getClass();
                    sts stsVar3 = stsVar2;
                    try {
                    } catch (Exception e8) {
                        e = e8;
                        qboVar6 = qboVar3;
                        stsVar = stsVar3;
                        i6 = i4;
                        i11 = i2;
                        i12 = i3;
                        taoVar4 = taoVar;
                        lm4Var3 = lm4Var;
                        thrVar3 = thrVar2;
                        vzgVar3 = vzgVar2;
                        taoVar2 = taoVar4;
                        zvsVar3 = zvsVar2;
                        qboVar5 = qboVar6;
                        lm4Var2 = lm4Var3;
                        i7 = i11;
                        qboVar4 = qboVar2;
                        i5 = i12;
                        obj2 = obj3;
                        if (e instanceof IOException) {
                            j66.h0((IOException) e);
                        }
                        internalDownloadException = (InternalDownloadException) (!(e instanceof InternalDownloadException) ? null : e);
                        if (internalDownloadException == null) {
                            if (qboVar4.a) {
                                Assertions.throwOrSkip("RetryCheckFail", new FailedAssertionException("Unexpected checked " + e + " caught, expected " + lm4Var2.f(), e));
                            }
                            throw e;
                        }
                        stsVar.j = qboVar5;
                        stsVar.k = zvsVar3;
                        stsVar.l = thrVar3;
                        stsVar.m = vzgVar3;
                        stsVar.n = qboVar4;
                        stsVar.o = lm4Var2;
                        stsVar.p = taoVar2;
                        stsVar.q = i5;
                        stsVar.r = i7;
                        stsVar.s = i6;
                        stsVar.v = 2;
                        obj4 = taoVar2.m(internalDownloadException, e, stsVar);
                        obj = obj2;
                        if (obj4 != obj2) {
                            i2 = i7;
                            thrVar2 = thrVar3;
                            taoVar = taoVar2;
                            stsVar2 = stsVar;
                            qboVar3 = qboVar5;
                            vzgVar2 = vzgVar3;
                            i3 = i5;
                            qboVar2 = qboVar4;
                            zvsVar2 = zvsVar3;
                            obj6 = obj2;
                            lm4Var4 = lm4Var2;
                            lm4Var = lm4Var4;
                            i14 = 1;
                            obj3 = obj6;
                            i4 = ((Boolean) obj4).booleanValue();
                            if (i4 == 0) {
                            }
                        }
                        return obj;
                    }
                    lm4Var3 = lm4Var;
                    i12 = i3;
                    qboVar6 = qboVar3;
                    stsVar = stsVar3;
                    i11 = i2;
                    taoVar4 = taoVar;
                    i6 = i4;
                    try {
                    } catch (Exception e9) {
                        e = e9;
                        thrVar3 = thrVar2;
                        vzgVar3 = vzgVar2;
                        taoVar2 = taoVar4;
                        zvsVar3 = zvsVar2;
                        qboVar5 = qboVar6;
                        lm4Var2 = lm4Var3;
                        i7 = i11;
                        qboVar4 = qboVar2;
                        i5 = i12;
                        obj2 = obj3;
                        if (e instanceof IOException) {
                        }
                        internalDownloadException = (InternalDownloadException) (!(e instanceof InternalDownloadException) ? null : e);
                        if (internalDownloadException == null) {
                        }
                    }
                    obj4 = x97.V(dm6.b, new inr(cvsVar, pboVar, zvsVar2, o5nVar, gy1Var, null, 6), stsVar);
                    obj = obj3;
                    if (obj4 != obj3) {
                        thrVar3 = thrVar2;
                        vzgVar3 = vzgVar2;
                        taoVar3 = taoVar4;
                        i10 = i6;
                        zvsVar3 = zvsVar2;
                        qboVar5 = qboVar6;
                        r11 = lm4Var3;
                        i8 = i12;
                        r12 = qboVar2;
                        i9 = i11;
                        fts p2 = utsVar.p((bvs) obj4, thrVar3, vzgVar3);
                        p9Var = p2.d;
                        obj = p2;
                        if (!(p9Var instanceof cts)) {
                            obj = p2;
                            if (!(p9Var instanceof dts)) {
                                if (!(p9Var instanceof bts)) {
                                    b6e.s();
                                    return null;
                                }
                                ((zlr) utsVar.o.getValue()).a(((bts) p9Var).b);
                                obj = p2;
                            }
                        }
                    }
                    return obj;
                }
                qgg.h0(obj4);
                oco ocoVar = (oco) utsVar.m.getValue();
                lm4 a = ern.a(InternalDownloadException.class);
                qboVar2 = qboVar;
                zvsVar2 = zvsVar;
                taoVar = new tao(qboVar2, new mx7(ocoVar.a, null, null));
                stsVar2 = stsVar;
                lm4Var = a;
                i2 = 0;
                i3 = 0;
                i4 = 1;
                qboVar3 = qboVar2;
                thrVar2 = thrVar;
                vzgVar2 = vzgVar;
                obj3 = obj5;
                if (i4 == 0) {
                }
            }
        }
        stsVar = new sts(utsVar, cg6Var);
        Object obj42 = stsVar.t;
        Object obj52 = nm6.a;
        i = stsVar.v;
        int i142 = 1;
        if (i == 0) {
        }
    }

    public static final iss c(uts utsVar, String str, ots otsVar) {
        j3t j3tVar = utsVar.c;
        zvs zvsVar = otsVar.g;
        o5n o5nVar = otsVar.b;
        List list = otsVar.d;
        ArrayList d = j3tVar.d(zvsVar, str);
        ArrayList arrayList = new ArrayList();
        Iterator it = d.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (list.contains(((iss) next).c)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (((iss) next2).f.b()) {
                arrayList2.add(next2);
            }
        }
        Object obj = null;
        if (!arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            if (it3.hasNext()) {
                obj = it3.next();
                if (it3.hasNext()) {
                    int q = q(((iss) obj).b);
                    do {
                        Object next3 = it3.next();
                        int q2 = q(((iss) next3).b);
                        if (q < q2) {
                            obj = next3;
                            q = q2;
                        }
                    } while (it3.hasNext());
                }
            }
            return (iss) obj;
        }
        if (utsVar.g.g()) {
            Iterator it4 = arrayList.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Object next4 = it4.next();
                if (((iss) next4).b == o5nVar) {
                    obj = next4;
                    break;
                }
            }
            return (iss) obj;
        }
        Iterator it5 = arrayList.iterator();
        if (it5.hasNext()) {
            obj = it5.next();
            if (it5.hasNext()) {
                int q3 = q(((iss) obj).b);
                do {
                    Object next5 = it5.next();
                    int q4 = q(((iss) next5).b);
                    if (q3 < q4) {
                        obj = next5;
                        q3 = q4;
                    }
                } while (it5.hasNext());
            }
        }
        return (iss) obj;
    }

    public static final void d(uts utsVar, String str, fts ftsVar, ots otsVar) {
        dss dssVar;
        dss dssVar2;
        utsVar.getClass();
        iss k = utsVar.k(otsVar.g, otsVar.b, ftsVar);
        j3t j3tVar = utsVar.c;
        str.getClass();
        Float f = null;
        ssg.a(4, "TracksCacheDatabaseImpl", "insert trackId " + k.a + ", quality " + k.b + ", storage " + k.c + " for user " + str, null);
        i3t a = j3tVar.a.a(str);
        zvs zvsVar = k.a;
        o5n o5nVar = k.b;
        thr thrVar = k.c;
        String str2 = k.e;
        css cssVar = k.f;
        bb6 bb6Var = k.d;
        long j = k.g;
        fss fssVar = k.h;
        Boolean bool = fssVar != null ? fssVar.a : null;
        Float valueOf = (fssVar == null || (dssVar2 = fssVar.b) == null) ? null : Float.valueOf(dssVar2.b);
        if (fssVar != null && (dssVar = fssVar.b) != null) {
            f = Float.valueOf(dssVar.a);
        }
        hss hssVar = k.i;
        n3t n3tVar = new n3t(zvsVar, o5nVar, thrVar, cssVar, bb6Var, j, str2, bool, valueOf, f, hssVar.a, hssVar.b, hssVar.c);
        a.getClass();
        up6.F(a.a, false, true, new wes(6, a, n3tVar));
    }

    public static final void e(uts utsVar, Integer num, String str, be6 be6Var, zvs zvsVar) {
        if (str == null) {
            utsVar.getClass();
            return;
        }
        xol xolVar = (xol) utsVar.n.getValue();
        vgl vglVar = new vgl(str, zvsVar.a, be6Var);
        xolVar.getClass();
        wol wolVar = xolVar.e;
        Continuation continuation = null;
        if (Intrinsics.d(wolVar != null ? wolVar.a : null, vglVar)) {
            x97.y(xolVar.d, null, null, new c5l(xolVar, vglVar, num, continuation, 3), 3);
        } else {
            xolVar.m.set(new vol(str, num));
        }
    }

    public static final kts f(uts utsVar, String str, iss issVar, ots otsVar) {
        tr3 tr3Var;
        long j;
        int i;
        j3t j3tVar = utsVar.c;
        bb6 bb6Var = issVar.d;
        css cssVar = issVar.f;
        bb6 bb6Var2 = bb6.c;
        if (bb6Var != bb6Var2) {
            xq0.x("Failed requirement.");
            return null;
        }
        if (bb6Var != bb6Var2) {
            xq0.x("Failed requirement.");
            return null;
        }
        fts o = o(issVar, leu.L(issVar.e));
        Uri uri = ((bts) o.d).b;
        Object value = bts.f.getValue();
        value.getClass();
        if (Intrinsics.d(uri, (Uri) value)) {
            ssg.a(3, "TrackContentSourcesStage", "cache row this deleted content so just re update", null);
            if (cssVar.b()) {
                return new jts();
            }
            j3tVar.b(str, issVar.a());
            return new gts();
        }
        liq d = utsVar.b.d(issVar.c);
        e6b e6bVar = d == null ? null : new e6b(d);
        try {
            if (e6bVar != null) {
                uri.getClass();
                String uri2 = uri.toString();
                uri2.getClass();
                tr3Var = e6bVar.s(uri2);
            } else {
                tr3Var = new tr3(0L, 0L);
            }
        } catch (IllegalStateException e) {
            ssg.a(7, "TrackContentSourcesStage", "processEncCacheRow illegal state error", e);
            tr3Var = new tr3(0L, 0L);
        }
        boolean z = tr3Var.c;
        if (z) {
            j = 0;
        } else {
            zlr zlrVar = (zlr) utsVar.o.getValue();
            zlrVar.getClass();
            uri.getClass();
            j = 0;
            ReentrantLock reentrantLock = zlrVar.b;
            reentrantLock.lock();
            try {
                Set set = zlrVar.a;
                String uri3 = uri.toString();
                uri3.getClass();
                if (!set.contains(f8g.b0(uri3))) {
                    if (!cssVar.b()) {
                        ssg.a(3, "TrackContentSourcesStage", "removing enc cache because file was lost, cacheRow = " + issVar, null);
                        j3tVar.b(str, issVar.a());
                        return new gts();
                    }
                    ssg.a(3, "TrackContentSourcesStage", "removing enc cache on permanent track because file was lost, cacheRow = " + issVar, null);
                    if (e6bVar != null) {
                        ((liq) e6bVar.b).k(uri.toString());
                    }
                    if (e6bVar == null) {
                        ssg.a(3, "TrackContentSourcesStage", "cacher is null, skip removing", null);
                    }
                    return new jts();
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        boolean b = cssVar.b();
        vzg vzgVar = otsVar.e;
        if (z) {
            i = 100;
        } else {
            long j2 = tr3Var.a;
            if (j2 > j) {
                long j3 = tr3Var.b;
                if (j3 > j) {
                    if (j3 < j2) {
                        dfi.r(hrg.m(j3, "), it's illegal state, ", tlm.l(j2, "bytesCached(", ") > requestLength(")), "TrackContentSourcesStage");
                    } else {
                        i = (int) ((j2 / j3) * 100.0d);
                    }
                }
            }
            i = 0;
        }
        return utsVar.j(o, b, vzgVar, new kme(Integer.valueOf(i)));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(uts utsVar, String str, iss issVar, ots otsVar, cg6 cg6Var) {
        tts ttsVar;
        int i;
        ots otsVar2;
        Object V;
        String str2;
        e0e e0eVar;
        pcg ltsVar;
        iss issVar2 = issVar;
        if (cg6Var instanceof tts) {
            ttsVar = (tts) cg6Var;
            int i2 = ttsVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ttsVar.o = i2 - Integer.MIN_VALUE;
                Object obj = ttsVar.m;
                nm6 nm6Var = nm6.a;
                i = ttsVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    if (issVar2.d != bb6.b) {
                        xq0.x("Failed requirement.");
                        return null;
                    }
                    Uri N = ldg.N(issVar2.e);
                    N.getClass();
                    cts ctsVar = new cts(N);
                    zvs zvsVar = issVar2.a;
                    o5n o5nVar = issVar2.b;
                    thr thrVar = issVar2.c;
                    fss fssVar = issVar2.h;
                    Continuation continuation = null;
                    fts ftsVar = new fts(zvsVar, o5nVar, thrVar, ctsVar, fssVar != null ? bfg.L(fssVar) : null, n(issVar2.i));
                    zzd zzdVar = (zzd) utsVar.k.getValue();
                    ttsVar.j = str;
                    ttsVar.k = issVar2;
                    otsVar2 = otsVar;
                    ttsVar.l = otsVar2;
                    ttsVar.o = 1;
                    zzdVar.getClass();
                    V = x97.V(dm6.b, new n71(zzdVar, ctsVar, ftsVar, continuation, 15), ttsVar);
                    if (V == nm6Var) {
                        return nm6Var;
                    }
                    str2 = str;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ots otsVar3 = ttsVar.l;
                    iss issVar3 = ttsVar.k;
                    String str3 = ttsVar.j;
                    qgg.h0(obj);
                    V = obj;
                    str2 = str3;
                    otsVar2 = otsVar3;
                    issVar2 = issVar3;
                }
                e0eVar = (e0e) V;
                if (!Intrinsics.d(e0eVar, a0e.b)) {
                    ltsVar = utsVar.m(str2, issVar2, "master playlist", "missing");
                } else if (Intrinsics.d(e0eVar, a0e.d)) {
                    ltsVar = utsVar.m(str2, issVar2, "media playlist", "missing");
                } else if (Intrinsics.d(e0eVar, a0e.a)) {
                    ltsVar = utsVar.m(str2, issVar2, "hls key", "missing");
                } else if (Intrinsics.d(e0eVar, a0e.c)) {
                    ltsVar = utsVar.m(str2, issVar2, "media playlist", "invalid");
                } else if (e0eVar instanceof d0e) {
                    ltsVar = utsVar.m(str2, issVar2, "track", "partially cached");
                } else {
                    if ((e0eVar instanceof HlsMetaValidator$ValidationResult$IoException) || (e0eVar instanceof b0e)) {
                        return new jts();
                    }
                    if (!Intrinsics.d(e0eVar, c0e.a)) {
                        b6e.s();
                        return null;
                    }
                    ltsVar = new lts(issVar2);
                }
                if (ltsVar instanceof lts) {
                    if (ltsVar instanceof mts) {
                        return new gts();
                    }
                    if (ltsVar instanceof nts) {
                        return new jts();
                    }
                    b6e.s();
                    return null;
                }
                iss issVar4 = ((lts) ltsVar).a;
                if (issVar4.d != bb6.b) {
                    xq0.x("Failed requirement.");
                    return null;
                }
                Uri N2 = ldg.N(issVar4.e);
                N2.getClass();
                return utsVar.j(o(issVar4, new cts(N2)), issVar4.f.b(), otsVar2.e, new kme(new Integer(100)));
            }
        }
        ttsVar = new tts(utsVar, cg6Var);
        Object obj2 = ttsVar.m;
        nm6 nm6Var2 = nm6.a;
        i = ttsVar.o;
        if (i != 0) {
        }
        e0eVar = (e0e) V;
        if (!Intrinsics.d(e0eVar, a0e.b)) {
        }
        if (ltsVar instanceof lts) {
        }
    }

    public static final kts h(uts utsVar, iss issVar, ots otsVar) {
        bb6 bb6Var = issVar.d;
        String str = issVar.e;
        bb6 bb6Var2 = bb6.a;
        if (bb6Var != bb6Var2) {
            xq0.x("Failed requirement.");
            return null;
        }
        try {
            Boolean l = utsVar.l(issVar);
            if (l == null) {
                return new jts();
            }
            if (l.booleanValue()) {
                if (bb6Var == bb6Var2) {
                    return utsVar.j(o(issVar, new dts(str)), issVar.f.b(), otsVar.e, new kme(100));
                }
                xq0.x("Failed requirement.");
                return null;
            }
            zvs zvsVar = issVar.a;
            fys fysVar = utsVar.d;
            qdc qdcVar = fysVar.b;
            if (qdcVar.N(zvsVar)) {
                try {
                    liq d = utsVar.b.d(issVar.c);
                    e6b e6bVar = d == null ? null : new e6b(d);
                    if (e6bVar != null) {
                        str.getClass();
                        liq liqVar = (liq) e6bVar.b;
                        liqVar.q(str).isEmpty();
                        liqVar.k(str);
                    }
                    qdcVar.P(zvsVar);
                } catch (Throwable th) {
                    fysVar.b.P(zvsVar);
                    throw th;
                }
            }
            return new jts();
        } catch (IllegalStateException e) {
            ssg.a(7, "TrackContentSourcesStage", "processRawCacheRow illegal state error", e);
            return new jts();
        }
    }

    public static final void i(uts utsVar, String str, fts ftsVar, iss issVar) {
        utsVar.getClass();
        iss k = utsVar.k(issVar.a, issVar.b, ftsVar);
        utsVar.c.e(str, k.a(), k.e, k.d);
    }

    public static ets n(hss hssVar) {
        oq4 oq4Var;
        int i = hssVar.b;
        switch (hssVar.a.ordinal()) {
            case 0:
                oq4Var = oq4.d;
                break;
            case 1:
                oq4Var = oq4.f;
                break;
            case 2:
                oq4Var = oq4.e;
                break;
            case 3:
                oq4Var = oq4.g;
                break;
            case 4:
                oq4Var = oq4.h;
                break;
            case 5:
                oq4Var = oq4.i;
                break;
            case 6:
                oq4Var = oq4.j;
                break;
            case 7:
                oq4Var = oq4.k;
                break;
            default:
                b6e.s();
                return null;
        }
        return new ets(oq4Var, i, hssVar.c);
    }

    public static fts o(iss issVar, p9 p9Var) {
        zvs zvsVar = issVar.a;
        o5n o5nVar = issVar.b;
        thr thrVar = issVar.c;
        fss fssVar = issVar.h;
        return new fts(zvsVar, o5nVar, thrVar, p9Var, fssVar != null ? bfg.L(fssVar) : null, n(issVar.i));
    }

    public static int q(o5n o5nVar) {
        int ordinal = o5nVar.ordinal();
        if (ordinal == 0) {
            return -1;
        }
        if (ordinal == 1) {
            return 0;
        }
        if (ordinal == 2) {
            return 1;
        }
        if (ordinal == 3) {
            return Integer.MIN_VALUE;
        }
        if (ordinal == 4) {
            return 2;
        }
        b6e.s();
        return 0;
    }

    public final kts j(fts ftsVar, boolean z, vzg vzgVar, kme kmeVar) {
        oxs oxsVar = ftsVar.e;
        Object obj = kmeVar.a;
        if (!z && oxsVar != null && oxsVar.a == null && vzgVar != null && this.g.g()) {
            return new jts();
        }
        if (vzgVar != null) {
            if (!Intrinsics.d(oxsVar != null ? oxsVar.b : null, vzgVar)) {
                oxs oxsVar2 = oxsVar != null ? new oxs(oxsVar.a, vzgVar) : new oxs(null, vzgVar);
                zvs zvsVar = ftsVar.a;
                o5n o5nVar = ftsVar.b;
                thr thrVar = ftsVar.c;
                p9 p9Var = ftsVar.d;
                ets etsVar = ftsVar.f;
                zvsVar.getClass();
                o5nVar.getClass();
                thrVar.getClass();
                return new its(new fts(zvsVar, o5nVar, thrVar, p9Var, oxsVar2, etsVar), ((Number) obj).intValue());
            }
        }
        return new hts(ftsVar, ((Number) obj).intValue());
    }

    public final iss k(zvs zvsVar, o5n o5nVar, fts ftsVar) {
        String Y;
        fss fssVar;
        gss gssVar;
        thr thrVar = ftsVar.c;
        p9 p9Var = ftsVar.d;
        bb6 bb6Var = (bb6) p9Var.a;
        if (p9Var instanceof cts) {
            Y = ((cts) p9Var).b.toString();
        } else if (p9Var instanceof dts) {
            Y = ((dts) p9Var).b;
        } else {
            if (!(p9Var instanceof bts)) {
                b6e.s();
                return null;
            }
            Y = leu.Y((bts) p9Var);
        }
        String str = Y;
        str.getClass();
        css cssVar = css.f;
        long b = this.h.b();
        oxs oxsVar = ftsVar.e;
        if (oxsVar != null) {
            Boolean bool = oxsVar.a;
            vzg vzgVar = oxsVar.b;
            fssVar = new fss(bool, vzgVar != null ? new dss(vzgVar.a, vzgVar.b) : null);
        } else {
            fssVar = null;
        }
        ets etsVar = ftsVar.f;
        int i = etsVar.b;
        switch (etsVar.a.ordinal()) {
            case 0:
                gssVar = gss.a;
                break;
            case 1:
                gssVar = gss.c;
                break;
            case 2:
                gssVar = gss.b;
                break;
            case 3:
                gssVar = gss.d;
                break;
            case 4:
                gssVar = gss.e;
                break;
            case 5:
                gssVar = gss.f;
                break;
            case 6:
                gssVar = gss.g;
                break;
            case 7:
                gssVar = gss.h;
                break;
            default:
                b6e.s();
                return null;
        }
        return new iss(zvsVar, o5nVar, thrVar, bb6Var, str, cssVar, b, fssVar, new hss(gssVar, i, etsVar.c));
    }

    public final Boolean l(iss issVar) {
        zvs zvsVar = issVar.a;
        try {
            liq d = this.b.d(issVar.c);
            e6b e6bVar = d == null ? null : new e6b(d);
            if (e6bVar == null) {
                return null;
            }
            String str = issVar.e;
            str.getClass();
            boolean z = e6bVar.s(str).c;
            ssg.a(3, "TrackContentSourcesStage", "raw track " + zvsVar + " fully cached = " + z, null);
            return Boolean.valueOf(z);
        } catch (IllegalStateException e) {
            ssg.a(7, "TrackContentSourcesStage", "getRawTrackUriOrNull illegal state error", e);
            throw new ats(e);
        }
    }

    public final pcg m(String str, iss issVar, String str2, String str3) {
        qdc qdcVar = this.d.b;
        bb6 bb6Var = issVar.d;
        zvs zvsVar = issVar.a;
        if (bb6Var != bb6.b) {
            xq0.x("Failed requirement.");
            return null;
        }
        Uri N = ldg.N(issVar.e);
        N.getClass();
        cts ctsVar = new cts(N);
        zvs zvsVar2 = issVar.a;
        o5n o5nVar = issVar.b;
        thr thrVar = issVar.c;
        fss fssVar = issVar.h;
        mzd a = dqb.a(this.a, maa.c, new fts(zvsVar2, o5nVar, thrVar, ctsVar, fssVar != null ? bfg.L(fssVar) : null, n(issVar.i)), ctsVar);
        if (issVar.f.b()) {
            StringBuilder m = f1d.m("removing hls cache on permanent track because ", str2, " is ", str3, ", cacheRow = ");
            m.append(issVar);
            ssg.a(3, "TrackContentSourcesStage", m.toString(), null);
            if (qdcVar.N(zvsVar)) {
                try {
                    a.remove();
                } finally {
                }
            }
            return nts.a;
        }
        StringBuilder m2 = f1d.m("removing hls cache because ", str2, " is ", str3, ", cacheRow = ");
        m2.append(issVar);
        ssg.a(3, "TrackContentSourcesStage", m2.toString(), null);
        this.c.b(str, issVar.a());
        if (qdcVar.N(zvsVar)) {
            try {
                a.remove();
            } finally {
            }
        }
        return mts.a;
    }

    public final fts p(bvs bvsVar, thr thrVar, vzg vzgVar) {
        Date date;
        String str;
        zvs zvsVar = bvsVar.a;
        o5n o5nVar = bvsVar.b;
        Uri uri = bvsVar.c;
        String str2 = bvsVar.d;
        Regex regex = new Regex("ts=([0-9a-z]+)");
        String uri2 = uri.toString();
        uri2.getClass();
        jch b = regex.b(uri2);
        Long r0 = (b == null || (str = (String) CollectionsKt.Y(b.a())) == null) ? null : StringsKt.r0(16, str);
        if (r0 != null) {
            long longValue = r0.longValue() * 1000;
            msa msaVar = nsa.b;
            if (nsa.c(yd5.N(longValue - System.currentTimeMillis(), ssa.MILLISECONDS), yd5.M(4, ssa.HOURS)) > 0) {
                date = new Date(longValue);
                return new fts(zvsVar, o5nVar, thrVar, new bts(uri, bvsVar.i, str2, date), new oxs(Boolean.valueOf(bvsVar.e), vzgVar), new ets(bvsVar.f, bvsVar.g, bvsVar.h));
            }
        }
        long b2 = this.h.b();
        msa msaVar2 = nsa.b;
        date = new Date(nsa.f(yd5.M(24, ssa.HOURS)) + b2);
        return new fts(zvsVar, o5nVar, thrVar, new bts(uri, bvsVar.i, str2, date), new oxs(Boolean.valueOf(bvsVar.e), vzgVar), new ets(bvsVar.f, bvsVar.g, bvsVar.h));
    }
}
