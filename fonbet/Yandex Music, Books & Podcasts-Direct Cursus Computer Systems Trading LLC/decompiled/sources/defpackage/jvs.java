package defpackage;

import com.yandex.music.shared.player.download2.DoNotRetryException;
import com.yandex.music.shared.player.download2.InternalDownloadException;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.a;

/* loaded from: classes4.dex */
public final class jvs implements hvs {
    public final b7q a;
    public final jyr b;
    public final jyr c;
    public final jyr d;
    public final jyr e;
    public final jyr f;

    public jvs(b7q b7qVar) {
        b7qVar.getClass();
        this.a = b7qVar;
        this.b = b7qVar.b(hag.I(oco.class), true);
        this.c = b7qVar.b(hag.I(nbo.class), true);
        this.d = b7qVar.b(hag.I(kvs.class), true);
        this.e = b7qVar.b(hag.I(uzn.class), true);
        this.f = b7qVar.b(hag.I(lka.class), true);
        b7qVar.b(hag.I(tcl.class), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x023e A[Catch: all -> 0x01cb, InternalDownloadException -> 0x0245, TryCatch #23 {InternalDownloadException -> 0x0245, blocks: (B:73:0x023a, B:75:0x023e, B:76:0x024b, B:79:0x0252, B:81:0x0256, B:83:0x025a, B:84:0x0283, B:86:0x0284), top: B:72:0x023a }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0256 A[Catch: all -> 0x01cb, InternalDownloadException -> 0x0245, TryCatch #23 {InternalDownloadException -> 0x0245, blocks: (B:73:0x023a, B:75:0x023e, B:76:0x024b, B:79:0x0252, B:81:0x0256, B:83:0x025a, B:84:0x0283, B:86:0x0284), top: B:72:0x023a }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0284 A[Catch: all -> 0x01cb, InternalDownloadException -> 0x0245, TRY_LEAVE, TryCatch #23 {InternalDownloadException -> 0x0245, blocks: (B:73:0x023a, B:75:0x023e, B:76:0x024b, B:79:0x0252, B:81:0x0256, B:83:0x025a, B:84:0x0283, B:86:0x0284), top: B:72:0x023a }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r10v6, types: [f9f] */
    /* JADX WARN: Type inference failed for: r11v8, types: [mbo] */
    /* JADX WARN: Type inference failed for: r12v10, types: [f9f] */
    /* JADX WARN: Type inference failed for: r13v14, types: [mbo] */
    /* JADX WARN: Type inference failed for: r1v4, types: [kvs] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [zvs] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [zvs] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20, types: [zvs] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x02b0 -> B:15:0x02ba). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zvs zvsVar, be6 be6Var, pxs pxsVar, cg6 cg6Var) {
        ivs ivsVar;
        int i;
        jvs jvsVar;
        be6 be6Var2;
        jvs jvsVar2;
        pbo pboVar;
        ivs ivsVar2;
        ivs ivsVar3;
        lm4 lm4Var;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        be6 be6Var3;
        pxs pxsVar2;
        tao taoVar;
        jvs jvsVar3;
        zvs zvsVar2;
        jvs jvsVar4;
        nm6 nm6Var;
        int i7;
        tao taoVar2;
        pxs pxsVar3;
        pbo pboVar2;
        Exception e;
        InternalDownloadException internalDownloadException;
        nm6 nm6Var2;
        zvs zvsVar3;
        RuntimeException e2;
        InterruptedException e3;
        DoNotRetryException e4;
        pxs pxsVar4;
        be6 be6Var4;
        ivs ivsVar4;
        pbo pboVar3;
        lm4 lm4Var2;
        int i8;
        int i9;
        int i10;
        nm6 nm6Var3;
        zvs zvsVar4;
        a aVar;
        h0l h0lVar;
        pbo pboVar4;
        jvs jvsVar5 = this;
        zvs zvsVar5 = zvsVar;
        try {
            if (cg6Var instanceof ivs) {
                ivsVar = (ivs) cg6Var;
                int i11 = ivsVar.z;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    ivsVar.z = i11 - Integer.MIN_VALUE;
                    Object obj = ivsVar.x;
                    nm6 nm6Var4 = nm6.a;
                    i = ivsVar.z;
                    ?? r7 = 2;
                    char c = 2;
                    if (i == 0) {
                        if (i == 1) {
                            int i12 = ivsVar.w;
                            int i13 = ivsVar.v;
                            i10 = ivsVar.u;
                            i9 = ivsVar.t;
                            i8 = ivsVar.s;
                            tao taoVar3 = ivsVar.r;
                            ?? r10 = ivsVar.q;
                            ?? r11 = ivsVar.p;
                            ivsVar3 = ivsVar.o;
                            zvsVar2 = ivsVar.n;
                            jvsVar3 = ivsVar.m;
                            pxs pxsVar5 = ivsVar.l;
                            be6 be6Var5 = ivsVar.k;
                            zvsVar5 = ivsVar.j;
                            try {
                                qgg.h0(obj);
                                be6Var4 = be6Var5;
                                pxsVar4 = pxsVar5;
                                ivsVar4 = ivsVar3;
                                pboVar3 = r11;
                                lm4Var2 = r10;
                                i2 = i13;
                                nm6Var3 = nm6Var4;
                                taoVar2 = taoVar3;
                                i6 = i12;
                            } catch (DoNotRetryException e5) {
                                e4 = e5;
                                throw e4.a;
                            } catch (InterruptedException e6) {
                                e3 = e6;
                                throw e3;
                            } catch (RuntimeException e7) {
                                e2 = e7;
                                throw e2;
                            } catch (Exception e8) {
                                e = e8;
                                i2 = i13;
                                pxsVar3 = pxsVar5;
                                i5 = i8;
                                lm4Var = r10;
                                i3 = i10;
                                jvsVar4 = jvsVar3;
                                i4 = i9;
                                r7 = zvsVar2;
                                i7 = i12;
                                nm6Var = nm6Var4;
                                taoVar2 = taoVar3;
                                pboVar2 = r11;
                                ivsVar2 = ivsVar;
                                be6Var2 = be6Var5;
                                if (e instanceof IOException) {
                                }
                                internalDownloadException = (InternalDownloadException) (!(e instanceof InternalDownloadException) ? null : e);
                                if (internalDownloadException == null) {
                                }
                            } catch (Throwable th) {
                                th = th;
                                r7 = zvsVar2;
                                jvsVar5 = jvsVar3;
                                ((kvs) jvsVar5.d.getValue()).a(r7);
                                throw th;
                            }
                            ess essVar = (ess) obj;
                            ((kvs) jvsVar3.d.getValue()).a(zvsVar2);
                            return essVar;
                        }
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i14 = ivsVar.v;
                        int i15 = ivsVar.u;
                        int i16 = ivsVar.t;
                        int i17 = ivsVar.s;
                        tao taoVar4 = ivsVar.r;
                        ?? r12 = ivsVar.q;
                        ?? r13 = ivsVar.p;
                        ivs ivsVar5 = ivsVar.o;
                        zvs zvsVar6 = ivsVar.n;
                        jvs jvsVar6 = ivsVar.m;
                        pxs pxsVar6 = ivsVar.l;
                        be6 be6Var6 = ivsVar.k;
                        zvsVar5 = ivsVar.j;
                        try {
                            qgg.h0(obj);
                            ivsVar2 = ivsVar;
                            pxsVar2 = pxsVar6;
                            lm4Var = r12;
                            ivsVar3 = ivsVar5;
                            i4 = i16;
                            taoVar = taoVar4;
                            jvsVar2 = jvsVar6;
                            pboVar = r13;
                            r7 = zvsVar6;
                            i3 = i15;
                            be6Var3 = be6Var6;
                            i5 = i17;
                            i2 = i14;
                            nm6Var2 = nm6Var4;
                        } catch (InternalDownloadException e9) {
                            e = e9;
                            jvsVar = jvsVar5;
                            jvsVar5 = jvsVar6;
                            be6Var2 = be6Var6;
                            r7 = zvsVar6;
                            try {
                                ((uzn) jvsVar.e.getValue()).c.a(zvsVar5.a, be6Var2, e);
                                throw eob.b(e);
                            } catch (Throwable th2) {
                                th = th2;
                                ((kvs) jvsVar5.d.getValue()).a(r7);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            jvsVar5 = jvsVar6;
                            r7 = zvsVar6;
                            ((kvs) jvsVar5.d.getValue()).a(r7);
                            throw th;
                        }
                        try {
                            jvsVar5 = this;
                            nm6Var4 = nm6Var2;
                            i6 = ((Boolean) obj).booleanValue() ? 1 : 0;
                            r7 = r7;
                            if (i6 == 0) {
                                tao taoVar5 = taoVar;
                                jvs jvsVar7 = jvsVar2;
                                zvs zvsVar7 = zvsVar5;
                                pbo pboVar5 = pboVar;
                                be6 be6Var7 = be6Var3;
                                try {
                                    ((Function1) pboVar5.d).invoke((ArrayList) taoVar5.e);
                                    throw new fif();
                                } catch (InternalDownloadException e10) {
                                    e = e10;
                                    jvsVar = this;
                                    jvsVar5 = jvsVar7;
                                    c = r7;
                                    be6Var2 = be6Var7;
                                    zvsVar5 = zvsVar7;
                                    r7 = c;
                                    ((uzn) jvsVar.e.getValue()).c.a(zvsVar5.a, be6Var2, e);
                                    throw eob.b(e);
                                }
                            }
                            try {
                                try {
                                } catch (Exception e11) {
                                    e = e11;
                                    jvs jvsVar8 = jvsVar2;
                                    zvsVar4 = zvsVar5;
                                    pbo pboVar6 = pboVar;
                                    be6Var4 = be6Var3;
                                    nm6 nm6Var5 = nm6Var4;
                                    taoVar2 = taoVar;
                                    jvsVar4 = jvsVar8;
                                    pboVar2 = pboVar6;
                                    nm6Var = nm6Var5;
                                }
                                aVar = jvsVar5.b().a;
                                nm6Var = nm6Var4;
                                taoVar2 = taoVar;
                                try {
                                } catch (Exception e12) {
                                    e = e12;
                                    jvsVar4 = jvsVar2;
                                }
                                h0lVar = new h0l(jvsVar5, zvsVar5, be6Var3, pxsVar2, 4);
                                ivsVar2.j = zvsVar5;
                                ivsVar2.k = be6Var3;
                                ivsVar2.l = pxsVar2;
                                jvsVar4 = jvsVar2;
                                try {
                                } catch (DoNotRetryException e13) {
                                    e4 = e13;
                                } catch (InterruptedException e14) {
                                    e = e14;
                                } catch (RuntimeException e15) {
                                    e = e15;
                                } catch (Exception e16) {
                                    try {
                                        try {
                                            e = e16;
                                            zvsVar4 = zvsVar5;
                                            pboVar4 = pboVar;
                                            be6Var4 = be6Var3;
                                            pboVar2 = pboVar4;
                                            pxsVar3 = pxsVar2;
                                            be6Var2 = be6Var4;
                                            zvsVar5 = zvsVar4;
                                            zvsVar3 = r7;
                                            if (e instanceof IOException) {
                                                j66.h0((IOException) e);
                                            }
                                            internalDownloadException = (InternalDownloadException) (!(e instanceof InternalDownloadException) ? null : e);
                                            if (internalDownloadException == null) {
                                                if (pboVar2.a) {
                                                    Assertions.throwOrSkip("RetryCheckFail", new FailedAssertionException("Unexpected checked " + e + " caught, expected " + lm4Var.f(), e));
                                                }
                                                throw e;
                                            }
                                            ivsVar2.j = zvsVar5;
                                            ivsVar2.k = be6Var2;
                                            ivsVar2.l = pxsVar3;
                                            ivsVar2.m = jvsVar4;
                                            ivsVar2.n = r7;
                                            ivsVar2.o = ivsVar3;
                                            ivsVar2.p = pboVar2;
                                            ivsVar2.q = lm4Var;
                                            ivsVar2.r = taoVar2;
                                            ivsVar2.s = i5;
                                            ivsVar2.t = i4;
                                            ivsVar2.u = i3;
                                            ivsVar2.v = i2;
                                            pbo pboVar7 = pboVar2;
                                            ivsVar2.w = i7;
                                            ivsVar2.z = 2;
                                            obj = taoVar2.m(internalDownloadException, e, ivsVar3);
                                            nm6Var2 = nm6Var;
                                            if (obj == nm6Var2) {
                                                return nm6Var2;
                                            }
                                            be6 be6Var8 = be6Var2;
                                            pxsVar2 = pxsVar3;
                                            be6Var3 = be6Var8;
                                            pboVar = pboVar7;
                                            jvsVar2 = jvsVar4;
                                            taoVar = taoVar2;
                                            r7 = r7;
                                            jvsVar5 = this;
                                            nm6Var4 = nm6Var2;
                                            i6 = ((Boolean) obj).booleanValue() ? 1 : 0;
                                            r7 = r7;
                                            if (i6 == 0) {
                                            }
                                        } catch (InternalDownloadException e17) {
                                            e = e17;
                                            jvsVar = this;
                                            jvsVar5 = jvsVar4;
                                            r7 = r7;
                                            ((uzn) jvsVar.e.getValue()).c.a(zvsVar5.a, be6Var2, e);
                                            throw eob.b(e);
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        jvsVar5 = jvsVar4;
                                        ((kvs) jvsVar5.d.getValue()).a(r7);
                                        throw th;
                                    }
                                    i7 = i6;
                                    r7 = zvsVar3;
                                }
                                ivsVar2.m = jvsVar4;
                                ivsVar2.n = r7;
                                ivsVar2.o = ivsVar3;
                                zvsVar4 = zvsVar5;
                                pboVar4 = pboVar;
                            } catch (DoNotRetryException e18) {
                                e4 = e18;
                                jvsVar4 = jvsVar2;
                            } catch (InterruptedException e19) {
                                e = e19;
                                jvsVar4 = jvsVar2;
                            } catch (RuntimeException e20) {
                                e = e20;
                                jvsVar4 = jvsVar2;
                            } catch (Throwable th5) {
                                th = th5;
                                jvsVar4 = jvsVar2;
                                jvsVar5 = jvsVar4;
                                ((kvs) jvsVar5.d.getValue()).a(r7);
                                throw th;
                            }
                            try {
                            } catch (DoNotRetryException e21) {
                                e4 = e21;
                                throw e4.a;
                            } catch (InterruptedException e22) {
                                e = e22;
                                throw e;
                            } catch (RuntimeException e23) {
                                e = e23;
                                throw e;
                            } catch (Exception e24) {
                                e = e24;
                                be6Var4 = be6Var3;
                                pboVar2 = pboVar4;
                                pxsVar3 = pxsVar2;
                                be6Var2 = be6Var4;
                                zvsVar5 = zvsVar4;
                                zvsVar3 = r7;
                                i7 = i6;
                                r7 = zvsVar3;
                                if (e instanceof IOException) {
                                }
                                internalDownloadException = (InternalDownloadException) (!(e instanceof InternalDownloadException) ? null : e);
                                if (internalDownloadException == null) {
                                }
                            }
                            ivsVar2.p = pboVar4;
                            ivsVar2.q = lm4Var;
                            ivsVar2.r = taoVar2;
                            ivsVar2.s = i5;
                            ivsVar2.t = i4;
                            ivsVar2.u = i3;
                            ivsVar2.v = i2;
                            ivsVar2.w = i6;
                            be6Var4 = be6Var3;
                            try {
                            } catch (DoNotRetryException e25) {
                                e4 = e25;
                                throw e4.a;
                            } catch (InterruptedException e26) {
                                e = e26;
                                throw e;
                            } catch (RuntimeException e27) {
                                e = e27;
                                throw e;
                            } catch (Exception e28) {
                                e = e28;
                                pboVar2 = pboVar4;
                                pxsVar3 = pxsVar2;
                                be6Var2 = be6Var4;
                                zvsVar5 = zvsVar4;
                                zvsVar3 = r7;
                                i7 = i6;
                                r7 = zvsVar3;
                                if (e instanceof IOException) {
                                }
                                internalDownloadException = (InternalDownloadException) (!(e instanceof InternalDownloadException) ? null : e);
                                if (internalDownloadException == null) {
                                }
                            }
                            ivsVar2.z = 1;
                            obj = sk3.S(aVar, h0lVar, ivsVar2);
                            nm6Var3 = nm6Var;
                            if (obj == nm6Var3) {
                                return nm6Var3;
                            }
                            ivs ivsVar6 = ivsVar3;
                            pboVar3 = pboVar4;
                            zvsVar5 = zvsVar4;
                            pxsVar4 = pxsVar2;
                            ivsVar = ivsVar2;
                            lm4Var2 = lm4Var;
                            i8 = i5;
                            ivsVar4 = ivsVar6;
                            int i18 = i4;
                            jvsVar3 = jvsVar4;
                            i10 = i3;
                            zvsVar2 = r7;
                            i9 = i18;
                            try {
                            } catch (DoNotRetryException e29) {
                                e4 = e29;
                                throw e4.a;
                            } catch (InterruptedException e30) {
                                e3 = e30;
                                throw e3;
                            } catch (RuntimeException e31) {
                                e2 = e31;
                                throw e2;
                            } catch (Exception e32) {
                                e = e32;
                                zvs zvsVar8 = zvsVar2;
                                i3 = i10;
                                jvsVar4 = jvsVar3;
                                i4 = i9;
                                zvsVar3 = zvsVar8;
                                nm6Var = nm6Var3;
                                pboVar2 = pboVar3;
                                ivsVar3 = ivsVar4;
                                pxsVar3 = pxsVar4;
                                i5 = i8;
                                lm4Var = lm4Var2;
                                ivsVar2 = ivsVar;
                                be6Var2 = be6Var4;
                                i7 = i6;
                                r7 = zvsVar3;
                                if (e instanceof IOException) {
                                }
                                internalDownloadException = (InternalDownloadException) (!(e instanceof InternalDownloadException) ? null : e);
                                if (internalDownloadException == null) {
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                r7 = zvsVar2;
                                jvsVar5 = jvsVar3;
                                ((kvs) jvsVar5.d.getValue()).a(r7);
                                throw th;
                            }
                            ess essVar2 = (ess) obj;
                            ((kvs) jvsVar3.d.getValue()).a(zvsVar2);
                            return essVar2;
                        } catch (InternalDownloadException e33) {
                            e = e33;
                            be6Var2 = be6Var3;
                            jvsVar5 = jvsVar2;
                            jvsVar = this;
                            r7 = r7;
                            ((uzn) jvsVar.e.getValue()).c.a(zvsVar5.a, be6Var2, e);
                            throw eob.b(e);
                        } catch (Throwable th7) {
                            th = th7;
                            jvsVar5 = jvsVar2;
                            ((kvs) jvsVar5.d.getValue()).a(r7);
                            throw th;
                        }
                    }
                    qgg.h0(obj);
                    try {
                        try {
                            ((kvs) jvsVar5.d.getValue()).b(zvsVar5);
                            ssg.a(3, "TrackDownloaderImpl", "download() - load data from repository for " + zvsVar5, null);
                        } catch (Throwable th8) {
                            th = th8;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        r7 = zvsVar5;
                        jvsVar5 = jvsVar5;
                    }
                    try {
                        oco ocoVar = (oco) jvsVar5.b.getValue();
                        pbo a = ((nbo) jvsVar5.c.getValue()).a(maa.d);
                        lm4 a2 = ern.a(InternalDownloadException.class);
                        tao taoVar6 = new tao(a, new mx7(ocoVar.a, zvsVar5, null));
                        jvsVar2 = jvsVar5;
                        pboVar = a;
                        ivsVar2 = ivsVar;
                        ivsVar3 = ivsVar2;
                        lm4Var = a2;
                        i2 = 0;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                        i6 = 1;
                        be6Var3 = be6Var;
                        pxsVar2 = pxsVar;
                        taoVar = taoVar6;
                        r7 = zvsVar5;
                        if (i6 == 0) {
                        }
                    } catch (InternalDownloadException e34) {
                        e = e34;
                        jvsVar5 = this;
                        jvsVar = jvsVar5;
                        be6Var2 = be6Var;
                        r7 = zvsVar5;
                        ((uzn) jvsVar.e.getValue()).c.a(zvsVar5.a, be6Var2, e);
                        throw eob.b(e);
                    } catch (Throwable th10) {
                        th = th10;
                        jvsVar5 = this;
                        r7 = zvsVar5;
                        ((kvs) jvsVar5.d.getValue()).a(r7);
                        throw th;
                    }
                }
            }
            if (i == 0) {
            }
        } catch (InternalDownloadException e35) {
            e = e35;
            jvsVar = this;
        } catch (Throwable th11) {
            th = th11;
        }
        ivsVar = new ivs(jvsVar5, cg6Var);
        Object obj2 = ivsVar.x;
        nm6 nm6Var42 = nm6.a;
        i = ivsVar.z;
        ?? r72 = 2;
        char c2 = 2;
    }

    public final lka b() {
        return (lka) this.f.getValue();
    }
}
