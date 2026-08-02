package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.os.Environment;
import java.io.File;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.a;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;
import ru.yandex.video.m3.player.AdException;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.impl.tracking.errors.ErrorNoSupportedTracksForRenderer;

/* loaded from: classes3.dex */
public final class gos implements xwt, nn5, w2q, zie, yxk, zdu, x2r, lr5, f, qyc, c8q, nwu, ogg, n03 {
    public static volatile boolean j;
    public static lhr k;
    public static lhr l;
    public final /* synthetic */ int a;
    public static final gos b = new gos(1);
    public static final if9 c = new if9();
    public static final gos d = new gos(3);
    public static final gos e = new gos(4);
    public static final gos f = new gos(5);
    public static final gos g = new gos(6);
    public static final gos h = new gos(7);
    public static final gos i = new gos(8);
    public static final gos m = new gos(9);
    public static final gos n = new gos(10);
    public static final gos o = new gos(11);

    public gos(b0f b0fVar, int i2) {
        this.a = 25;
    }

    public static final int m(int i2, String str, String str2) {
        a l2 = yhn.l(1, yhn.m(i2, str.length()));
        int i3 = l2.a;
        int i4 = l2.b;
        int i5 = l2.c;
        if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
            while (!up6.R(i3, Integer.valueOf(str2.length()), str).equals(str2)) {
                if (i3 != i4) {
                    i3 += i5;
                }
            }
            return i3;
        }
        return str.length();
    }

    public static vx3 n(hx3 hx3Var, boolean z) {
        hx3Var.getClass();
        switch (hx3Var.ordinal()) {
            case 0:
                return new vx3(hx3.AmericanExpress, u75.j(new jx3("34", null), new jx3("37", null)), u75.j(15), 4, vx3.f);
            case 1:
                return new vx3(hx3.DinersClub, u75.j(new jx3("300", "305"), new jx3("36", null)), u75.j(14), 3, vx3.f);
            case 2:
                return new vx3(hx3.DiscoverCard, u75.j(new jx3("6011", null), new jx3("622126", "622925"), new jx3("644", "649"), new jx3("65", null)), u75.j(16), 3, vx3.g);
            case 3:
                return new vx3(hx3.JCB, u75.j(new jx3("3528", "3589")), u75.j(16), 3, vx3.g);
            case 4:
                return new vx3(hx3.HUMO, u75.j(new jx3("986001", "986004"), new jx3("986006", null), new jx3("986008", "986010"), new jx3("986012", "986020"), new jx3("986023", "986027"), new jx3("986029", "986037"), new jx3("986060", null)), u75.j(16), 0, vx3.g);
            case 5:
                return new vx3(hx3.Maestro, u75.j(new jx3("50", null), new jx3("56", "561467"), new jx3("561469", "59"), new jx3("61", null), new jx3("63", null), new jx3("66", "69")), u75.j(12, 13, 14, 15, 16, 17, 18, 19), 3, vx3.g);
            case 6:
                return new vx3(hx3.MasterCard, u75.j(new jx3("222100", "272099"), new jx3("51", "544080"), new jx3("544082", "55")), u75.j(16), 3, vx3.g);
            case 7:
                return new vx3(hx3.MIR, u75.j(new jx3("2200", "2204")), u75.j(16, 17, 18, 19), z ? 0 : 3, vx3.g);
            case 8:
                return new vx3(hx3.UnionPay, u75.j(new jx3("35", null), new jx3("62", null), new jx3("88", null)), u75.j(16, 17, 18, 19), 3, vx3.g);
            case 9:
                return new vx3(hx3.Uzcard, u75.j(new jx3("544081", null), new jx3("561468", null), new jx3("860002", "860006"), new jx3("860008", "860009"), new jx3("860011", "860014"), new jx3("860020", null), new jx3("860030", "860031"), new jx3("860033", "860034"), new jx3("860038", null), new jx3("860043", null), new jx3("860048", "860051"), new jx3("860053", null), new jx3("860055", "860060"), new jx3("277707", null)), u75.j(16), 0, vx3.g);
            case 10:
                return new vx3(hx3.VISA, u75.j(new jx3("4", null)), u75.j(13, 16, 18, 19), 3, vx3.g);
            case 11:
                return new vx3(hx3.VISA_ELECTRON, u75.j(new jx3("4026", null), new jx3("417500", null), new jx3("4405", null), new jx3("4508", null), new jx3("4844", null), new jx3("4913", null), new jx3("4917", null)), u75.j(16), 3, vx3.g);
            case 12:
                return new vx3(hx3.UNKNOWN, new ArrayList(), u75.j(12, 13, 14, 15, 16, 17, 18, 19), 3, vx3.g);
            default:
                b6e.s();
                return null;
        }
    }

    public static vx3 o(String str) {
        str.getClass();
        hx3 D = kg5.D(str);
        ArrayList arrayList = vx3.f;
        return n(D, false);
    }

    public static void p(lhr lhrVar) {
        File file = lhrVar.a;
        if (file.mkdirs() ? true : file.isDirectory()) {
            return;
        }
        boolean isFile = file.isFile();
        boolean isDirectory = file.isDirectory();
        File parentFile = file.getParentFile();
        ssg.a(7, "StorageUtils", "mkdirs failed - createStorageRoot, path = " + file + ", isFile = " + isFile + ", isDirectory = " + isDirectory + ", isWritable = " + (parentFile != null ? Boolean.valueOf(parentFile.canWrite()) : null), null);
    }

    public static lhr q(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            return (lhr) arrayList.get(1);
        }
        if (!arrayList.isEmpty()) {
            lhr lhrVar = (lhr) arrayList.get(0);
            ssg.a(3, "StorageUtils", "infos size is 1. path = " + lhrVar.a, null);
            if (lhrVar.c) {
                return lhrVar;
            }
        }
        return null;
    }

    public static f73 s(String str) {
        Object obj;
        rdb rdbVar = f73.f;
        rdbVar.getClass();
        c7 c7Var = new c7(0, rdbVar);
        while (true) {
            if (!c7Var.hasNext()) {
                obj = null;
                break;
            }
            obj = c7Var.next();
            if (((f73) obj).a.equalsIgnoreCase(str)) {
                break;
            }
        }
        f73 f73Var = (f73) obj;
        return f73Var == null ? f73.c : f73Var;
    }

    public static String t(Throwable th) {
        if (!(th instanceof PlaybackException)) {
            if (th instanceof NetworkRequestException) {
                return "NETWORK_REQUEST";
            }
            if (th instanceof ErrorNoSupportedTracksForRenderer) {
                return "UNSUPPORTED_ENV";
            }
            if (th instanceof AdException) {
                return "ADS";
            }
            if (!(th instanceof IOException)) {
                return "EXCEPTION";
            }
            Throwable th2 = (IOException) th;
            for (int i2 = 0; i2 < 11 && th2 != null; i2++) {
                if (th2 instanceof SocketTimeoutException) {
                    break;
                }
                th2 = th2.getCause();
            }
            r1 = false;
            return r1 ? "NETWORK_TIMEOUT" : "NETWORK_MEDIA";
        }
        PlaybackException playbackException = (PlaybackException) th;
        if (playbackException instanceof PlaybackException.UnsupportedContentException.ErrorParser.InvalidStreamUrl) {
            return "CONFIG";
        }
        if (playbackException instanceof PlaybackException.ErrorSeekPosition ? true : playbackException instanceof PlaybackException.ErrorPlaylistStuck ? true : playbackException instanceof PlaybackException.ErrorPlaylistReset ? true : playbackException instanceof PlaybackException.ErrorCache ? true : playbackException instanceof PlaybackException.ErrorLicenseViolation ? true : playbackException instanceof PlaybackException.UnsupportedContentException.ErrorParser ? true : playbackException instanceof PlaybackException.ErrorBehindLiveWindow ? true : playbackException instanceof PlaybackException.AdaptationSetsCountChanged ? true : playbackException instanceof PlaybackException.RepresentationCountChanged) {
            return "MEDIA";
        }
        if (playbackException instanceof PlaybackException.ErrorQueryingDecoders ? true : playbackException instanceof PlaybackException.ErrorNoSecureDecoder ? true : playbackException instanceof PlaybackException.ErrorNoDecoder ? true : playbackException instanceof PlaybackException.ErrorInstantiatingDecoder ? true : playbackException instanceof PlaybackException.ErrorSubtitleNoDecoder ? true : playbackException instanceof PlaybackException.UnsupportedContentException.ErrorAudio ? true : playbackException instanceof PlaybackException.UnsupportedContentException.ErrorVideo ? true : playbackException instanceof PlaybackException.FrameDropDetected ? true : playbackException instanceof PlaybackException.ErrorInRenderer) {
            return "UNSUPPORTED_ENV";
        }
        if (playbackException instanceof PlaybackException.DrmThrowable) {
            return "DRM";
        }
        if (playbackException instanceof PlaybackException.ErrorConnection ? true : playbackException instanceof PlaybackException.ErrorConnectionSSLHandshake ? true : playbackException instanceof PlaybackException.ErrorNoInternetConnection) {
            return "NETWORK_MEDIA";
        }
        if (playbackException instanceof PlaybackException.TrackSelectionInitialization ? true : playbackException instanceof PlaybackException.HLSLiveRequestsStartOutOfLiveWindow ? true : playbackException instanceof PlaybackException.ErrorNoPrepare ? true : playbackException instanceof PlaybackException.ErrorNegativeStartPosition) {
            return "CONFIG";
        }
        if (playbackException instanceof PlaybackException.PlaybackForbidden ? true : playbackException instanceof PlaybackException.ErrorPreparing ? true : playbackException instanceof PlaybackException.ErrorPlayerReleased ? true : playbackException instanceof PlaybackException.ErrorPlayerStopped ? true : playbackException instanceof PlaybackException.ErrorPlayerRePrepared) {
            return "PREPARING";
        }
        if ((playbackException instanceof PlaybackException.WrongCallbackThread ? true : playbackException instanceof PlaybackException.ErrorTimeout.ErrorUndefined ? true : playbackException instanceof PlaybackException.ErrorTimeout.ErrorForegroundMode ? true : playbackException instanceof PlaybackException.ErrorTimeout.ErrorPlayerRelease ? true : playbackException instanceof PlaybackException.ErrorTimeout.ErrorDetachSurface ? true : playbackException instanceof PlaybackException.ErrorGeneric.ErrorBehindLiveWindowFromPreloadedLiveDashManifest ? true : playbackException instanceof PlaybackException.ErrorGeneric.PreloadedLiveDashManifestInCacheExpired ? true : playbackException instanceof PlaybackException.ErrorGeneric ? true : playbackException instanceof PlaybackException.Cancellation ? true : playbackException instanceof PlaybackException.ErrorDataSourceReadPositionOutOfRange ? true : playbackException instanceof PlaybackException.ErrorDataSource ? true : playbackException instanceof PlaybackException.ErrorStalledStuck) || (playbackException instanceof PlaybackException.Stub)) {
            return "EXCEPTION";
        }
        b6e.s();
        return null;
    }

    public static boolean x(int i2, String str, String str2) {
        return up6.R(i2, Integer.valueOf(str2.length()), str).equals(str2);
    }

    @Override // defpackage.n03
    public jxt B(jxt jxtVar, jxt jxtVar2) {
        jxtVar.getClass();
        jxtVar2.getClass();
        return new vc3(!new rre(22).B(jxtVar, jxtVar2).c());
    }

    @Override // defpackage.nn5
    public Object C(rdk rdkVar) {
        Object k2 = rdkVar.k(new m5n(h73.class, Executor.class));
        k2.getClass();
        return u2x.E((Executor) k2);
    }

    @Override // defpackage.zie
    public void a(opf opfVar) {
        opfVar.a();
    }

    @Override // defpackage.w2q
    public Object c(foc focVar) {
        switch (this.a) {
            case 4:
                focVar.getClass();
                return Boolean.FALSE;
            default:
                focVar.getClass();
                return v9u.a;
        }
    }

    @Override // defpackage.zdu
    public Function0 e(z5 z5Var) {
        xdu xduVar = new xdu(z5Var, 0);
        z5Var.addOnAttachStateChangeListener(xduVar);
        return new j5n(16, z5Var, xduVar);
    }

    @Override // defpackage.c8q
    public Object f() {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, xqd.e("grpc-timer-%d"));
        try {
            newScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(newScheduledThreadPool, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception e3) {
            b6e.q(e3);
            return null;
        }
        return Executors.unconfigurableScheduledExecutorService(newScheduledThreadPool);
    }

    @Override // defpackage.w2q
    public Object g(faq faqVar) {
        switch (this.a) {
            case 4:
                faqVar.getClass();
                return Boolean.TRUE;
            default:
                faqVar.getClass();
                boolean z = faqVar instanceof naq;
                v9u v9uVar = v9u.a;
                if (z) {
                    return v9uVar;
                }
                if (faqVar instanceof saq) {
                    return new x9u(((saq) faqVar).e);
                }
                if ((faqVar instanceof daq) || (faqVar instanceof qaq)) {
                    return v9uVar;
                }
                b6e.s();
                return null;
        }
    }

    @Override // defpackage.w2q
    public Object h(jzs jzsVar) {
        switch (this.a) {
            case 4:
                jzsVar.getClass();
                return Boolean.FALSE;
            default:
                jzsVar.getClass();
                return v9u.a;
        }
    }

    @Override // defpackage.w2q
    public Object i(m1q m1qVar) {
        switch (this.a) {
            case 4:
                m1qVar.getClass();
                return Boolean.TRUE;
            default:
                m1qVar.getClass();
                return v9u.a;
        }
    }

    @Override // defpackage.w2q
    public Object j(i5u i5uVar) {
        switch (this.a) {
            case 4:
                i5uVar.getClass();
                return Boolean.FALSE;
            default:
                i5uVar.getClass();
                return new w9u(i5uVar.a);
        }
    }

    @Override // defpackage.w2q
    public Object k(k4d k4dVar) {
        switch (this.a) {
            case 4:
                k4dVar.getClass();
                return Boolean.FALSE;
            default:
                k4dVar.getClass();
                return v9u.a;
        }
    }

    @Override // defpackage.c8q
    public void l(Object obj) {
        ((ScheduledExecutorService) obj).shutdown();
    }

    @Override // defpackage.xwt
    public Object r(b7f b7fVar, float f2) {
        switch (this.a) {
            case 1:
                boolean z = b7fVar.peek() == 1;
                if (z) {
                    b7fVar.a();
                }
                double nextDouble = b7fVar.nextDouble();
                double nextDouble2 = b7fVar.nextDouble();
                double nextDouble3 = b7fVar.nextDouble();
                double nextDouble4 = b7fVar.peek() == 7 ? b7fVar.nextDouble() : 1.0d;
                if (z) {
                    b7fVar.g();
                }
                if (nextDouble <= 1.0d && nextDouble2 <= 1.0d && nextDouble3 <= 1.0d) {
                    nextDouble *= 255.0d;
                    nextDouble2 *= 255.0d;
                    nextDouble3 *= 255.0d;
                    if (nextDouble4 <= 1.0d) {
                        nextDouble4 *= 255.0d;
                    }
                }
                return Integer.valueOf(Color.argb((int) nextDouble4, (int) nextDouble, (int) nextDouble2, (int) nextDouble3));
            default:
                boolean z2 = b7fVar.peek() == 1;
                if (z2) {
                    b7fVar.a();
                }
                float nextDouble5 = (float) b7fVar.nextDouble();
                float nextDouble6 = (float) b7fVar.nextDouble();
                while (b7fVar.hasNext()) {
                    b7fVar.w();
                }
                if (z2) {
                    b7fVar.g();
                }
                return new tso((nextDouble5 / 100.0f) * f2, (nextDouble6 / 100.0f) * f2);
        }
    }

    public String toString() {
        switch (this.a) {
            case 23:
                return "IdentityFunction";
            default:
                return super.toString();
        }
    }

    public File u(Context context) {
        File file;
        synchronized (this) {
            i.y(context);
            lhr lhrVar = l;
            file = lhrVar != null ? lhrVar.a : null;
        }
        return file;
    }

    @Override // defpackage.mr5
    public int v(w8 w8Var, int i2, Object obj, int i3) {
        w8Var.H((byte[]) obj, i3, i2);
        return i3 + i2;
    }

    public File w(Context context) {
        File file;
        synchronized (this) {
            i.y(context);
            lhr lhrVar = k;
            file = lhrVar != null ? lhrVar.a : null;
        }
        return file;
    }

    public void y(Context context) {
        if (j) {
            return;
        }
        synchronized (this) {
            try {
                if (!j) {
                    lhr lhrVar = null;
                    ssg.a(3, "StorageUtils", "rescanning storage list...", null);
                    ArrayList V = j66.V(context);
                    ssg.a(3, "StorageUtils", "rescanned, storage list: " + V, null);
                    lhr lhrVar2 = !V.isEmpty() ? (lhr) V.get(0) : null;
                    lhr q = q(V);
                    if (q == null || !q.equals(lhrVar2)) {
                        lhrVar = q;
                    } else {
                        ssg.a(3, "StorageUtils", "disabled removable storage since it's equal to primary: " + q, null);
                    }
                    if (lhrVar2 != null && "mounted".equals(Environment.getExternalStorageState(lhrVar2.a))) {
                        p(lhrVar2);
                    }
                    if (lhrVar != null && "mounted".equals(Environment.getExternalStorageState(lhrVar.a))) {
                        p(lhrVar);
                    }
                    l = lhrVar2;
                    k = lhrVar;
                    j = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ gos(int i2) {
        this.a = i2;
    }

    @Override // defpackage.ogg
    public void b() {
    }

    @Override // defpackage.nwu
    public void d() {
    }

    @Override // defpackage.nwu
    public void O(boolean z) {
    }

    @Override // defpackage.qyc
    public Object apply(Object obj) {
        return obj;
    }
}
