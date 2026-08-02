package defpackage;

import android.os.Trace;
import android.view.animation.AnimationUtils;
import com.yandex.pulse.metrics.o;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;
import okio.internal.a;
import ru.yandex.music.R;
import ru.yandex.video.m3.benchmark.models.ReadyForPlaybackMetricsEvent;
import ru.yandex.video.m3.data.StreamType;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.player.impl.tracking.data.PlayerState;
import ru.yandex.video.m3.player.impl.tracking.event.PlayerAliveState;

/* loaded from: classes4.dex */
public final class kgk extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kgk(int i, Object obj) {
        super(0);
        this.r = i;
        this.s = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04e0 A[Catch: all -> 0x04fc, TRY_LEAVE, TryCatch #22 {all -> 0x04fc, blocks: (B:183:0x039f, B:266:0x04e0, B:273:0x04ff, B:276:0x04da, B:314:0x0530, B:315:0x0533, B:164:0x0513, B:168:0x0524, B:169:0x052b, B:330:0x0534, B:331:0x054b, B:263:0x04d5), top: B:182:0x039f, inners: #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x054e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:309:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:389:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0623  */
    /* JADX WARN: Type inference failed for: r4v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v8, types: [kotlin.Pair] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        wof parentLayoutCoordinates;
        String str;
        String str2;
        String obj;
        Regex regex;
        String value;
        yt3 y;
        int V;
        a9f a9fVar;
        Throwable th;
        ikn iknVar;
        a9f a9fVar2;
        ikn iknVar2;
        Throwable th2;
        Throwable th3;
        Throwable th4;
        int g;
        Pair pair;
        char c;
        int i;
        long j;
        long j2;
        int i2 = 8;
        long j3 = -9187201950435737472L;
        char c2 = 7;
        boolean z = true;
        int i3 = 0;
        switch (this.r) {
            case 0:
                mgk mgkVar = (mgk) this.s;
                mgkVar.a.a();
                mgkVar.h.invoke();
                return Unit.a;
            case 1:
                ArrayList arrayList = ((wjk) this.s).a;
                tpi tpiVar = new tpi(arrayList.size());
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    vaf vafVar = (vaf) arrayList.get(i4);
                    Object obj2 = vafVar.b;
                    int i5 = vafVar.a;
                    sgi.a(tpiVar, obj2 != null ? new n3f(Integer.valueOf(i5), vafVar.b) : Integer.valueOf(i5), vafVar);
                }
                return new sgi(tpiVar);
            case 2:
                ((j6l) this.s).a = true;
                return Unit.a;
            case 3:
                nq0 nq0Var = (nq0) this.s;
                o9l c3 = nq0Var.c();
                l9l l9lVar = PlayerAliveState.Companion;
                PlayerState a = ((z2t) nq0Var.b).b.a();
                l9lVar.getClass();
                c3.a(l9l.a(a));
                return Unit.a;
            case 4:
                jhm jhmVar = (jhm) this.s;
                parentLayoutCoordinates = jhmVar.getParentLayoutCoordinates();
                return Boolean.valueOf((((parentLayoutCoordinates == null || !parentLayoutCoordinates.d()) ? null : parentLayoutCoordinates) == null || jhmVar.m27getPopupContentSizebOM6tXw() == null) ? false : true);
            case 5:
                return new File(((zmm) this.s).a.getExternalFilesDir(null), "PreloadCache");
            case 6:
                return ((inm) this.s).h;
            case 7:
                ((wnm) this.s).d();
                return Unit.a;
            case 8:
                ReadyForPlaybackMetricsEvent readyForPlaybackMetricsEvent = (ReadyForPlaybackMetricsEvent) this.s;
                StreamType streamType = readyForPlaybackMetricsEvent.getStreamType();
                if (streamType == null) {
                    streamType = null;
                }
                if (streamType == null || (obj = streamType.toString()) == null) {
                    str = readyForPlaybackMetricsEvent.fileUrl;
                    if (str != null) {
                        regex = readyForPlaybackMetricsEvent.getRegex();
                        irn irnVar = Regex.b;
                        jch b = regex.b(str);
                        if (b != null && (value = b.getValue()) != null) {
                            str2 = StringsKt.a0(StringsKt.Y(value, "."), "?");
                            obj = str2 != null ? StreamType.Unknown.toString() : str2;
                        }
                    }
                    str2 = null;
                    if (str2 != null) {
                    }
                }
                Locale locale = Locale.ROOT;
                locale.getClass();
                String upperCase = obj.toUpperCase(locale);
                upperCase.getClass();
                return "READY_FOR_PLAYBACK_".concat(upperCase);
            case 9:
                hsd hsdVar = ((okn) this.s).e;
                hsdVar.getClass();
                List<Certificate> a2 = hsdVar.a();
                ArrayList arrayList2 = new ArrayList(v75.o(a2, 10));
                for (Certificate certificate : a2) {
                    certificate.getClass();
                    arrayList2.add((X509Certificate) certificate);
                }
                return arrayList2;
            case 10:
                cnn cnnVar = (cnn) this.s;
                synchronized (cnnVar.c) {
                    y = cnnVar.y();
                    if (((zmn) cnnVar.u.getValue()).compareTo(zmn.b) <= 0) {
                        throw n7w.c("Recomposer shutdown; frame clock awaiter will never resume", cnnVar.e);
                    }
                }
                if (y != null) {
                    r7o r7oVar = z7o.b;
                    ((zt3) y).resumeWith(Unit.a);
                }
                return Unit.a;
            case 11:
                znn znnVar = (znn) this.s;
                znnVar.g = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    znnVar.a();
                    Trace.endSection();
                    return Unit.a;
                } catch (Throwable th5) {
                    Trace.endSection();
                    throw th5;
                }
            case 12:
                a aVar = (a) this.s;
                ClassLoader classLoader = aVar.b;
                lac lacVar = aVar.c;
                Enumeration<URL> resources = classLoader.getResources("");
                resources.getClass();
                ArrayList<URL> list = Collections.list(resources);
                list.getClass();
                ArrayList arrayList3 = new ArrayList();
                for (URL url : list) {
                    url.getClass();
                    if (Intrinsics.d(url.getProtocol(), "file")) {
                        String str3 = cak.b;
                        pair = new Pair(lacVar, h1b.N(new File(url.toURI())));
                    } else {
                        pair = null;
                    }
                    if (pair != null) {
                        arrayList3.add(pair);
                    }
                }
                Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                resources2.getClass();
                ArrayList<URL> list2 = Collections.list(resources2);
                list2.getClass();
                ArrayList arrayList4 = new ArrayList();
                for (URL url2 : list2) {
                    url2.getClass();
                    String url3 = url2.toString();
                    url3.getClass();
                    if (c.v(url3, "jar:file:", false) && (V = StringsKt.V(6, url3, "!")) != -1) {
                        String str4 = cak.b;
                        cak N = h1b.N(new File(URI.create(url3.substring(4, V))));
                        a9f j4 = lacVar.j(N);
                        try {
                            long size2 = j4.size() - 22;
                            long j5 = 0;
                            if (size2 < 0) {
                                throw new IOException("not a zip: size=" + j4.size());
                            }
                            long max = Math.max(size2 - 65536, 0L);
                            while (true) {
                                long j6 = j5;
                                ikn iknVar3 = new ikn(j4.a(size2));
                                try {
                                } catch (Throwable th6) {
                                    th = th6;
                                }
                                if (iknVar3.g() == 101010256) {
                                    int z2 = iknVar3.z() & 65535;
                                    int z3 = iknVar3.z() & 65535;
                                    a9fVar = j4;
                                    long z4 = iknVar3.z() & 65535;
                                    try {
                                        if (z4 != (iknVar3.z() & 65535) || z2 != 0 || z3 != 0) {
                                            iknVar = iknVar3;
                                            throw new IOException("unsupported zip: spanned");
                                        }
                                        iknVar = iknVar3;
                                        try {
                                            iknVar.skip(4L);
                                            int z5 = iknVar.z() & 65535;
                                            mgr mgrVar = new mgr(z5, z4, iknVar.g() & 4294967295L);
                                            iknVar.D(z5);
                                            try {
                                                iknVar.close();
                                                long j7 = size2 - 20;
                                                if (j7 > j6) {
                                                    a9fVar2 = a9fVar;
                                                    try {
                                                        ikn iknVar4 = new ikn(a9fVar2.a(j7));
                                                        try {
                                                            if (iknVar4.g() == 117853008) {
                                                                int g2 = iknVar4.g();
                                                                long o = iknVar4.o();
                                                                if (iknVar4.g() != 1 || g2 != 0) {
                                                                    throw new IOException("unsupported zip: spanned");
                                                                }
                                                                ikn iknVar5 = new ikn(a9fVar2.a(o));
                                                                try {
                                                                    g = iknVar5.g();
                                                                } catch (Throwable th7) {
                                                                    try {
                                                                        iknVar5.close();
                                                                    } catch (Throwable th8) {
                                                                        fob.a(th7, th8);
                                                                    }
                                                                    th4 = th7;
                                                                }
                                                                if (g != 101075792) {
                                                                    throw new IOException("bad zip: expected " + o8g.v(101075792) + " but was " + o8g.v(g));
                                                                }
                                                                iknVar5.skip(12L);
                                                                int g3 = iknVar5.g();
                                                                int g4 = iknVar5.g();
                                                                long o2 = iknVar5.o();
                                                                if (o2 != iknVar5.o() || g3 != 0 || g4 != 0) {
                                                                    throw new IOException("unsupported zip: spanned");
                                                                }
                                                                iknVar5.skip(8L);
                                                                mgr mgrVar2 = new mgr(z5, o2, iknVar5.o());
                                                                try {
                                                                    iknVar5.close();
                                                                    th4 = null;
                                                                } catch (Throwable th9) {
                                                                    th4 = th9;
                                                                }
                                                                mgrVar = mgrVar2;
                                                                if (th4 != null) {
                                                                    throw th4;
                                                                }
                                                            }
                                                            try {
                                                                iknVar4.close();
                                                                th3 = null;
                                                            } catch (Throwable th10) {
                                                                th3 = th10;
                                                            }
                                                        } catch (Throwable th11) {
                                                            try {
                                                                iknVar4.close();
                                                            } catch (Throwable th12) {
                                                                fob.a(th11, th12);
                                                            }
                                                            th3 = th11;
                                                        }
                                                        if (th3 != null) {
                                                            throw th3;
                                                        }
                                                    } catch (Throwable th13) {
                                                        th = th13;
                                                        a9fVar = a9fVar2;
                                                        if (a9fVar != null) {
                                                            throw th;
                                                        }
                                                        try {
                                                            a9fVar.close();
                                                            throw th;
                                                        } catch (Throwable th14) {
                                                            fob.a(th, th14);
                                                            throw th;
                                                        }
                                                    }
                                                } else {
                                                    a9fVar2 = a9fVar;
                                                }
                                                mgr mgrVar3 = mgrVar;
                                                ArrayList arrayList5 = new ArrayList();
                                                ikn iknVar6 = new ikn(a9fVar2.a(mgrVar3.b));
                                                try {
                                                    long j8 = mgrVar3.a;
                                                    long j9 = j6;
                                                    while (j9 < j8) {
                                                        stw G = o8g.G(iknVar6);
                                                        a9fVar = a9fVar2;
                                                        iknVar2 = iknVar6;
                                                        try {
                                                            if (G.h >= mgrVar3.b) {
                                                                throw new IOException("bad zip: local file header offset >= central directory offset");
                                                                break;
                                                            } else {
                                                                cak cakVar = a.e;
                                                                if (wfl.a(G.a)) {
                                                                    arrayList5.add(G);
                                                                }
                                                                j9++;
                                                                iknVar6 = iknVar2;
                                                                a9fVar2 = a9fVar;
                                                            }
                                                        } catch (Throwable th15) {
                                                            th = th15;
                                                            Throwable th16 = th;
                                                            try {
                                                                iknVar2.close();
                                                            } catch (Throwable th17) {
                                                                fob.a(th16, th17);
                                                            }
                                                            th2 = th16;
                                                            if (th2 == null) {
                                                            }
                                                        }
                                                    }
                                                    a9fVar = a9fVar2;
                                                    try {
                                                        iknVar6.close();
                                                        th2 = null;
                                                    } catch (Throwable th18) {
                                                        th2 = th18;
                                                    }
                                                } catch (Throwable th19) {
                                                    th = th19;
                                                    a9fVar = a9fVar2;
                                                    iknVar2 = iknVar6;
                                                }
                                                if (th2 == null) {
                                                    throw th2;
                                                }
                                                ttw ttwVar = new ttw(N, lacVar, o8g.k(arrayList5));
                                                try {
                                                    a9fVar.close();
                                                } catch (Throwable unused) {
                                                }
                                                r12 = new Pair(ttwVar, a.e);
                                            } catch (Throwable th20) {
                                                th = th20;
                                                th = th;
                                                if (a9fVar != null) {
                                                }
                                            }
                                        } catch (Throwable th21) {
                                            th = th21;
                                        }
                                        th = th21;
                                    } catch (Throwable th22) {
                                        th = th22;
                                        iknVar = iknVar3;
                                        iknVar.close();
                                        throw th;
                                    }
                                    iknVar.close();
                                    throw th;
                                }
                                a9f a9fVar3 = j4;
                                iknVar3.close();
                                size2--;
                                if (size2 < max) {
                                    throw new IOException("not a zip: end of central directory signature not found");
                                }
                                j5 = j6;
                                j4 = a9fVar3;
                            }
                        } catch (Throwable th23) {
                            th = th23;
                            a9fVar = j4;
                        }
                    }
                    if (r12 != null) {
                        arrayList4.add(r12);
                    }
                    r12 = null;
                }
                return CollectionsKt.g0(arrayList3, arrayList4);
            case 13:
                goo gooVar = (goo) this.s;
                zoo zooVar = gooVar.a;
                Object obj3 = gooVar.d;
                if (obj3 != null) {
                    return zooVar.a(gooVar, obj3);
                }
                xq0.x("Value should be initialized");
                return null;
            case 14:
                return new yf8((bf) ((rdk) this.s).e);
            case 15:
                return Boolean.valueOf(((lxo) this.s).n);
            case 16:
                eyo eyoVar = (eyo) this.s;
                rg0 rg0Var = (rg0) men.t(eyoVar, lzj.a);
                eyoVar.B = rg0Var;
                eyoVar.C = rg0Var != null ? new qg0(rg0Var.a, rg0Var.b, rg0Var.c, rg0Var.d) : null;
                return Unit.a;
            case 17:
                xip xipVar = (xip) this.s;
                return Boolean.valueOf(xipVar.j ? false : xipVar.a.p());
            case 18:
                mtp mtpVar = (mtp) this.s;
                x6k x6kVar = mtpVar.c;
                if (((nmq) x6kVar.getValue()).a == 9205357640488583168L || nmq.e(((nmq) x6kVar.getValue()).a)) {
                    return null;
                }
                return mtpVar.a.b(((nmq) x6kVar.getValue()).a);
            case 19:
                return AnimationUtils.loadInterpolator(((hdq) this.s).a, R.anim.paymentsdk_shimmer_interpolator);
            case 20:
                while (true) {
                    a42 a42Var = (a42) this.s;
                    synchronized (a42Var.b) {
                        try {
                            if (a42Var.a) {
                                c = c2;
                            } else {
                                a42Var.a = z;
                                try {
                                    eqi eqiVar = (eqi) a42Var.h;
                                    Object[] objArr = eqiVar.a;
                                    int i6 = eqiVar.c;
                                    int i7 = i3;
                                    while (i7 < i6) {
                                        v2r v2rVar = (v2r) objArr[i7];
                                        upi upiVar = v2rVar.g;
                                        Function1 function1 = v2rVar.a;
                                        Object[] objArr2 = upiVar.b;
                                        long[] jArr = upiVar.a;
                                        int length = jArr.length - 2;
                                        char c4 = c2;
                                        if (length >= 0) {
                                            int i8 = i3;
                                            while (true) {
                                                long j10 = jArr[i8];
                                                Object[] objArr3 = objArr2;
                                                if ((((~j10) << c4) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                                                    int i10 = 0;
                                                    while (i10 < i9) {
                                                        if ((j10 & 255) < 128) {
                                                            i = i2;
                                                            function1.invoke(objArr3[(i8 << 3) + i10]);
                                                        } else {
                                                            i = i2;
                                                        }
                                                        j10 >>= i;
                                                        i10++;
                                                        i2 = i;
                                                    }
                                                    if (i9 != i2) {
                                                    }
                                                }
                                                if (i8 != length) {
                                                    i8++;
                                                    objArr2 = objArr3;
                                                }
                                            }
                                        }
                                        upiVar.c();
                                        i7++;
                                        c2 = c4;
                                        i3 = 0;
                                    }
                                    c = c2;
                                    a42Var.a = i3;
                                } catch (Throwable th24) {
                                    a42Var.a = false;
                                    throw th24;
                                }
                            }
                        } catch (Throwable th25) {
                            throw th25;
                        }
                    }
                    if (!a42.a((a42) this.s)) {
                        return Unit.a;
                    }
                    c2 = c;
                    z = true;
                    i3 = 0;
                }
            case 21:
                return "Content type " + ((VideoType) this.s) + " was incorrectly started from 0 instead of default position";
            case 22:
                ktm ktmVar = (ktm) ((ltm) this.s);
                ktmVar.getClass();
                ktmVar.p0(null);
                return Unit.a;
            case 23:
                return ((ewe) ((yqf) this.s).get()).a;
            case 24:
                z2t z2tVar = ((slr) this.s).E;
                if (z2tVar != null) {
                    return z2tVar.v;
                }
                return null;
            case 25:
                s7e s7eVar = new s7e();
                wpt wptVar = ((ylr) this.s).f;
                s7eVar.n(wptVar.a);
                s7eVar.g(wptVar.b);
                s7eVar.c(wptVar.c, false);
                return s7eVar.e();
            case 26:
                zpf a3 = ((cnr) this.s).a();
                mpf mpfVar = a3.a;
                if (a3.n != ((eqi) ((epi) mpfVar.p()).b).c) {
                    tpi tpiVar2 = a3.f;
                    Object[] objArr4 = tpiVar2.c;
                    long[] jArr2 = tpiVar2.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i11 = 0;
                        while (true) {
                            long j11 = jArr2[i11];
                            if ((((~j11) << 7) & j11 & j3) != j3) {
                                int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                int i13 = 0;
                                while (i13 < i12) {
                                    if ((j11 & 255) < 128) {
                                        j2 = j3;
                                        ((spf) objArr4[(i11 << 3) + i13]).d = true;
                                    } else {
                                        j2 = j3;
                                    }
                                    j11 >>= 8;
                                    i13++;
                                    j3 = j2;
                                }
                                j = j3;
                                if (i12 != 8) {
                                }
                            } else {
                                j = j3;
                            }
                            if (i11 != length2) {
                                i11++;
                                j3 = j;
                            }
                        }
                    }
                    if (!mpfVar.r()) {
                        mpf.W(mpfVar, false, 7);
                    }
                }
                return Unit.a;
            case 27:
                return (Map) ((nvr) this.s).i.getValue();
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                try {
                    return MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException e) {
                    ((y7k) ((sml) this.s).a).a(new IllegalStateException("Storage cannot work with templates!", e));
                    return null;
                }
            default:
                t9s t9sVar = (t9s) this.s;
                t9sVar.E = null;
                neg.w(t9sVar);
                h4a.z(t9sVar);
                vq1.Z(t9sVar);
                return Boolean.TRUE;
        }
    }
}
