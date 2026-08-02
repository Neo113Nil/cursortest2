package defpackage;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;
import ru.yandex.video.m3.player.AdException;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.impl.tracking.errors.ErrorNoSupportedTracksForRenderer;

/* loaded from: classes3.dex */
public final class ehv implements nn5, w2q, ozk, n2r, zdu, mu1, lr5, f, t2c, va6, vue, nwu, pjn, n03 {
    public static final ehv b = new ehv(2);
    public static final ehv c = new ehv(3);
    public static final ehv d = new ehv(4);
    public static final ehv e = new ehv(5);
    public static final /* synthetic */ ehv f = new ehv(6);
    public static final ehv g = new ehv(7);
    public static final ehv h = new ehv(8);
    public static final ehv i = new ehv(9);
    public static final ehv j = new ehv(10);
    public static final ehv k = new ehv(11);
    public final /* synthetic */ int a;

    public ehv(d0f d0fVar, int i2) {
        this.a = 25;
    }

    public static final String b(String str) {
        HashSet hashSet = ht0.f;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            Charset forName = Charset.forName("UTF-8");
            forName.getClass();
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = str.getBytes(forName);
            bytes.getClass();
            messageDigest.update(bytes, 0, bytes.length);
            byte[] digest = messageDigest.digest();
            digest.getClass();
            return ot0.u(digest);
        } catch (UnsupportedEncodingException unused) {
            HashSet hashSet2 = j3c.a;
            return "1";
        } catch (NoSuchAlgorithmException unused2) {
            HashSet hashSet3 = j3c.a;
            return CommonUrlParts.Values.FALSE_INTEGER;
        }
    }

    public static final void l(String str) {
        boolean contains;
        HashSet hashSet = ht0.f;
        if (str == null || str.length() == 0 || str.length() > 40) {
            if (str == null) {
                str = "<None Provided>";
            }
            throw new c3c(String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{str, 40}, 2)));
        }
        HashSet hashSet2 = ht0.f;
        synchronized (hashSet2) {
            contains = hashSet2.contains(str);
        }
        if (contains) {
            return;
        }
        if (!new Regex("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").e(str)) {
            throw new c3c(String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{str}, 1)));
        }
        synchronized (hashSet2) {
            hashSet2.add(str);
        }
    }

    public static q14 m(String str) {
        return new q14(str, u75.h(new g24("Playing Robots", "James Blake", "Ваш самый-самый любимый трек.", new nn6("https://avatars.yandex.net/get-music-content/34131/41fec1cf.a.301333-1/300x300", "https://avatars.mds.yandex.net/get-music-misc/49997/img.68eebdf9b510f9053778b2cc/300x300", "https://avatars.mds.yandex.net/get-music-misc/28592/img.68eebd9d94053d016bcd7bee/300x300")), new g24("Robots", null, "Длинный длинный длинный длинный длинный длинный длинный  текст в 2 строки", new nn6("https://avatars.yandex.net/get-music-content/34131/41fec1cf.a.301333-1/300x300", "https://avatars.mds.yandex.net/get-music-misc/28592/img.68eebe12749d24738fe2018e/300x300", "https://avatars.mds.yandex.net/get-music-misc/28592/img.68eebdb294053d016bcd7bf0/300x300")), new g24("Playing Robots", "Длинный длинный длинный длинный длинный длинный длинный  текст в сабтайтле", null, new nn6("https://avatars.yandex.net/get-music-content/34131/41fec1cf.a.301333-1/300x300", "https://avatars.mds.yandex.net/get-music-misc/28592/img.68eebe12749d24738fe2018e/300x300", "https://avatars.mds.yandex.net/get-music-misc/28592/img.68eebdb294053d016bcd7bf0/300x300")), new g24("Playing Robots into Heaven_4", "James Blake", "Ваш самый-самый любимый трек. \u2028Вы слушали его 24 раза", new nn6("https://avatars.yandex.net/get-music-content/34131/41fec1cf.a.301333-1/300x300", "avatars.mds.yandex.net/get-music-misc/28592/img.68eebe12749d24738fe2018e/300x300", "avatars.mds.yandex.net/get-music-misc/28592/img.68eebdb294053d016bcd7bf0/300x300")), new g24("Playing Robots into Heaven_5", "James Blake", "Ваш самый-самый любимый трек. \u2028Вы слушали его 24 раза", new nn6("https://avatars.yandex.net/get-music-content/34131/41fec1cf.a.301333-1/300x300", "avatars.mds.yandex.net/get-music-misc/28592/img.68eebe12749d24738fe2018e/300x300", "avatars.mds.yandex.net/get-music-misc/28592/img.68eebdb294053d016bcd7bf0/300x300")), new g24("Playing Robots into Heaven_6", "James Blake", "Ваш самый-самый любимый трек. \u2028Вы слушали его 24 раза", new nn6("https://avatars.yandex.net/get-music-content/34131/41fec1cf.a.301333-1/300x300", "avatars.mds.yandex.net/get-music-misc/28592/img.68eebe12749d24738fe2018e/300x300", "avatars.mds.yandex.net/get-music-misc/28592/img.68eebdb294053d016bcd7bf0/300x300")), new g24("Playing Robots into Heaven_7", "James Blake", "Ваш самый-самый любимый трек. \u2028Вы слушали его 24 раза", new nn6("https://avatars.yandex.net/get-music-content/34131/41fec1cf.a.301333-1/300x300", "avatars.mds.yandex.net/get-music-misc/28592/img.68eebe12749d24738fe2018e/300x300", "avatars.mds.yandex.net/get-music-misc/28592/img.68eebdb294053d016bcd7bf0/300x300"))));
    }

    public static String n(Throwable th) {
        if (th instanceof PlaybackException) {
            PlaybackException playbackException = (PlaybackException) th;
            return playbackException instanceof PlaybackException.ErrorPreparing ? "Preparing.".concat(wgb.a(playbackException)) : wgb.a(playbackException);
        }
        if (th instanceof ErrorNoSupportedTracksForRenderer.Video) {
            return "NoSupportedTracksForVideoRenderer";
        }
        if (th instanceof ErrorNoSupportedTracksForRenderer.Audio) {
            return "NoSupportedTracksForAudioRenderer";
        }
        if (th instanceof AdException) {
            AdException adException = (AdException) th;
            if (adException instanceof AdException.NoAd) {
                return "NoAd";
            }
            if (adException instanceof AdException.PlaybackEngineError) {
                return "PlaybackEngineError";
            }
            if (adException instanceof AdException.NoAdViewAttached) {
                return "NoAdViewAttached";
            }
            if (adException instanceof AdException.AdUnknown) {
                return "AdUnknown";
            }
            if (adException instanceof AdException.Stub) {
                return "Stub";
            }
            b6e.s();
            return null;
        }
        if (!(th instanceof NetworkRequestException)) {
            return th.getClass().getName();
        }
        NetworkRequestException networkRequestException = (NetworkRequestException) th;
        if (networkRequestException instanceof NetworkRequestException.ExpiredSignature) {
            return "EXPIRED_SIGNATURE";
        }
        if (networkRequestException instanceof NetworkRequestException.InvalidSignature) {
            return "INVALID_SIGNATURE";
        }
        if (networkRequestException instanceof NetworkRequestException.ResourceNotFound) {
            return "RESOURCE_NOT_FOUND";
        }
        if (networkRequestException instanceof NetworkRequestException.InvalidRange) {
            return "INVALID_RANGE";
        }
        if (networkRequestException instanceof NetworkRequestException.TooManyRequests) {
            return "TOO_MANY_REQUESTS";
        }
        if (networkRequestException instanceof NetworkRequestException.RegionalRestriction) {
            return "REGIONAL_RESTRICTION";
        }
        if (networkRequestException instanceof NetworkRequestException.Banned) {
            return "BANNED";
        }
        if (networkRequestException instanceof NetworkRequestException.BadHttpStatus) {
            return "BAD_HTTP_STATUS";
        }
        if (networkRequestException instanceof NetworkRequestException.HostNameNotResolved) {
            return "HOSTNAME_NOT_RESOLVED";
        }
        if (networkRequestException instanceof NetworkRequestException.ConnectionFailed) {
            return "CONNECTION_FAILED";
        }
        if (networkRequestException instanceof NetworkRequestException.ConnectionTimeout) {
            return "CONNECTION_TIMEOUT";
        }
        if (networkRequestException instanceof NetworkRequestException.SslError) {
            return "SSL_ERROR";
        }
        if (networkRequestException instanceof NetworkRequestException.FetchTimeout) {
            return "FETCH_TIMEOUT";
        }
        if (networkRequestException instanceof NetworkRequestException.ConnectionClosed) {
            return "CONNECTION_CLOSED";
        }
        if (networkRequestException instanceof NetworkRequestException.UnkwnownHttpError) {
            return "UNKNOWN_HTTP_ERROR";
        }
        b6e.s();
        return null;
    }

    public static pc5 p(x1u x1uVar, oc5 oc5Var, hq5 hq5Var) {
        x1uVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(-2116353116);
        if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
            brm brmVar = brm.a;
            oq5Var.p(false);
            return brmVar;
        }
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = gld.R(g.a, oq5Var);
            oq5Var.k0(K);
        }
        mm6 mm6Var = (mm6) K;
        boolean f2 = oq5Var.f(x1uVar) | oq5Var.f(oc5Var) | oq5Var.g(false);
        Object K2 = oq5Var.K();
        if (f2 || K2 == kjnVar) {
            mm6Var.getClass();
            l18 l18Var = l18.b;
            bdt I = hag.I(nc5.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            K2 = new rc5((nc5) qdcVar.C(I), x1uVar, mm6Var, oc5Var);
            oq5Var.k0(K2);
        }
        pc5 pc5Var = (pc5) K2;
        oq5Var.p(false);
        return pc5Var;
    }

    @Override // defpackage.n03
    public jxt B(jxt jxtVar, jxt jxtVar2) {
        jxtVar.getClass();
        jxtVar2.getClass();
        jxtVar.getClass();
        jxtVar2.getClass();
        return new vc3(!new y9w(24).B(jxtVar2, jxtVar).c());
    }

    @Override // defpackage.nn5
    public Object C(rdk rdkVar) {
        Object k2 = rdkVar.k(new m5n(pht.class, Executor.class));
        k2.getClass();
        return u2x.E((Executor) k2);
    }

    @Override // defpackage.t2c
    public void E(fap fapVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ozk
    public boolean H() {
        return false;
    }

    @Override // defpackage.n2r
    public boolean J(Object obj, Object obj2) {
        return Intrinsics.d(obj, obj2);
    }

    @Override // defpackage.t2c
    public void K() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.t2c
    public azs M(int i2, int i3) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.r2i
    public byte[] a(Object obj) {
        return (byte[]) obj;
    }

    @Override // defpackage.va6
    public void accept(Object obj) {
        Throwable th = (Throwable) obj;
        String str = "The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | " + th;
        if (th == null) {
            th = new NullPointerException();
        }
        y5g.g0(new ypj(str, th));
    }

    @Override // defpackage.w2q
    public Object c(foc focVar) {
        focVar.getClass();
        return Boolean.TRUE;
    }

    @Override // defpackage.zdu
    public Function0 e(z5 z5Var) {
        if (!z5Var.isAttachedToWindow()) {
            xqn xqnVar = new xqn();
            ac8 ac8Var = new ac8(z5Var, xqnVar, 3);
            z5Var.addOnAttachStateChangeListener(ac8Var);
            xqnVar.a = new j5n(17, z5Var, ac8Var);
            return new ncs(11, xqnVar);
        }
        dzf E = swf.E(z5Var);
        if (E != null) {
            return ocg.n(z5Var, E.getLifecycle());
        }
        sme.c("View tree for " + z5Var + " has no ViewTreeLifecycleOwner");
        rj7.f();
        return null;
    }

    @Override // defpackage.pjn
    public q1 f(znk znkVar) {
        return ((i1) znkVar.b).getConfig();
    }

    @Override // defpackage.w2q
    public Object g(faq faqVar) {
        faqVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.arr
    public Object get() {
        return new mzk(Boolean.FALSE);
    }

    @Override // defpackage.w2q
    public Object h(jzs jzsVar) {
        jzsVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.w2q
    public Object i(m1q m1qVar) {
        m1qVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.w2q
    public Object j(i5u i5uVar) {
        i5uVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.w2q
    public Object k(k4d k4dVar) {
        k4dVar.getClass();
        return Boolean.TRUE;
    }

    public gs4 o() {
        gs4 gs4Var;
        gs4 gs4Var2 = gs4.h;
        if (gs4Var2 != null) {
            return gs4Var2;
        }
        synchronized (this) {
            gs4Var = gs4.h;
            if (gs4Var == null) {
                phg a = phg.a(j3c.b());
                a.getClass();
                sk2 sk2Var = new sk2();
                a.getClass();
                gs4 gs4Var3 = new gs4();
                gs4Var3.d = a;
                gs4Var3.e = sk2Var;
                gs4Var3.b = new AtomicBoolean(false);
                gs4Var3.c = new Date(0L);
                gs4.h = gs4Var3;
                gs4Var = gs4Var3;
            }
        }
        return gs4Var;
    }

    public String toString() {
        switch (this.a) {
            case 8:
                return "StructuralEqualityPolicy";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.mr5
    public int v(w8 w8Var, int i2, Object obj, int i3) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        int limit = byteBuffer.limit();
        byteBuffer.limit(byteBuffer.position() + i2);
        w8Var.D(byteBuffer);
        byteBuffer.limit(limit);
        return 0;
    }

    @Override // defpackage.mu1
    public int x(nu1 nu1Var) {
        return ((oq) nu1Var).q;
    }

    public /* synthetic */ ehv(int i2) {
        this.a = i2;
    }

    @Override // defpackage.nwu
    public void d() {
    }

    @Override // defpackage.r2i
    public Object A(byte[] bArr) {
        return bArr;
    }

    @Override // defpackage.nwu
    public void O(boolean z) {
    }
}
