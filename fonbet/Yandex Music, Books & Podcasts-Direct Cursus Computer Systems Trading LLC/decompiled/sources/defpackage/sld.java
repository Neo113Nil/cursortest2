package defpackage;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.tasks.Task;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import java.lang.reflect.Proxy;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.Response;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public class sld implements igs, xi2, ms0, ib1, pm5, uug, jpj, cdv, t8s, pxh, rmp, os3, aqr, x7o, oa7, o1j {
    public static volatile sld c;
    public static final c3d d = new c3d(1);
    public static final String[] e = {"_data"};
    public final /* synthetic */ int a;
    public final Object b;

    public sld(int i) {
        qzh qzhVar;
        this.a = i;
        switch (i) {
            case 1:
                try {
                    qzhVar = (qzh) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    qzhVar = d;
                }
                qzh[] qzhVarArr = {c3d.b, qzhVar};
                w8h w8hVar = new w8h();
                w8hVar.a = qzhVarArr;
                Charset charset = tse.a;
                this.b = w8hVar;
                break;
            case 7:
                this.b = new s0d();
                break;
            case 9:
                this.b = new AtomicLong();
                break;
            case 29:
                this.b = new s7w(u75.j("success", "wait_for_notification", "wait_for_processing"));
                break;
            default:
                this.b = new HashSet();
                break;
        }
    }

    public static boolean J(int i) {
        if (i == -1 || i == 2002 || i == 0 || i == 16 || i == 2154 || i == 2158 || i == 2161) {
            return false;
        }
        if ((2250 <= i && i < 2280) || i == 17 || i == 10 || i == 5 || i == 6 || i == 3 || i == 2 || i == 4 || i == 2004 || i == 2005 || i == 2000 || i == 2200 || i == 2201 || i == 2202 || i == 2100 || i == 8 || i == 14 || i == 2001 || i == 2007 || i == 2006 || i == 7 || i == 2003 || i == 2103 || i == 15 || i == 13) {
            return true;
        }
        dfi.r(dfi.c(i, "What about: ", " reason?"), "ChromeCastStateListener");
        return false;
    }

    @Override // defpackage.os3
    public void A(Call call, Throwable th) {
        ((hm5) this.b).completeExceptionally(th);
    }

    @Override // defpackage.cdv
    public void C(bdv bdvVar) {
        ((z03) this.b).m.l(bdvVar);
    }

    @Override // defpackage.os3
    public void D(Call call, Response response) {
        ((hm5) this.b).complete(response);
    }

    @Override // defpackage.o1j
    public n1j E(q1f q1fVar, int i) {
        q1fVar.getClass();
        y7o a0 = bkp.a0(q1fVar, e27.A0);
        if (a0.b()) {
            return null;
        }
        return zc4.A((a38) a0.a(), i);
    }

    @Override // defpackage.rmp
    public void F(nkp nkpVar, String str) {
        p84 p84Var = (p84) nkpVar;
        p84Var.getClass();
        str.getClass();
        nmb nmbVar = j74.a;
        j74.a(okb.Chromecast, slb.Chromecast, tlb.Ondemand);
        L(new hxc(s84.b), p84Var);
    }

    @Override // defpackage.jpj
    public kqv G(View view, kqv kqvVar) {
        switch (this.a) {
            case 11:
                ju2 ju2Var = (ju2) this.b;
                ju2Var.m = kqvVar.a();
                ju2Var.n = kqvVar.b();
                ju2Var.o = kqvVar.c();
                ju2Var.f();
                break;
            default:
                ze3 ze3Var = (ze3) this.b;
                ye3 ye3Var = ze3Var.n;
                if (ye3Var != null) {
                    ze3Var.f.removeBottomSheetCallback(ye3Var);
                }
                ye3 ye3Var2 = new ye3(ze3Var.i, kqvVar);
                ze3Var.n = ye3Var2;
                ye3Var2.e(ze3Var.getWindow());
                ze3Var.f.addBottomSheetCallback(ze3Var.n);
                break;
        }
        return kqvVar;
    }

    public za6 H(Object obj, lm4 lm4Var, Activity activity, i1c i1cVar) {
        ya6 ya6Var = new ya6(lm4Var, i1cVar);
        ClassLoader classLoader = (ClassLoader) this.b;
        Class<?> loadClass = classLoader.loadClass("java.util.function.Consumer");
        loadClass.getClass();
        Object newProxyInstance = Proxy.newProxyInstance(classLoader, new Class[]{loadClass}, ya6Var);
        newProxyInstance.getClass();
        Class<?> cls = obj.getClass();
        Class<?> loadClass2 = classLoader.loadClass("java.util.function.Consumer");
        loadClass2.getClass();
        cls.getMethod("addWindowLayoutInfoListener", Activity.class, loadClass2).invoke(obj, activity, newProxyInstance);
        Class<?> cls2 = obj.getClass();
        Class<?> loadClass3 = classLoader.loadClass("java.util.function.Consumer");
        loadClass3.getClass();
        return new za6(cls2.getMethod("removeWindowLayoutInfoListener", loadClass3), obj, newProxyInstance);
    }

    public String I(ZonedDateTime zonedDateTime) {
        zonedDateTime.getClass();
        String format = ((DateTimeFormatter) this.b).format(zonedDateTime);
        format.getClass();
        return format;
    }

    public void K(s84 s84Var, int i) {
        v3w.k("Chrome cast failure, error code = ", i, 6, "ChromeCastCenter", null);
        ((dk4) ((ix6) this.b).b).d.a(s84Var);
    }

    public void L(hxc hxcVar, p84 p84Var) {
        ix6 ix6Var = (ix6) this.b;
        p84Var.getClass();
        dk4 dk4Var = (dk4) ix6Var.b;
        xdr xdrVar = dk4Var.b;
        xdrVar.getClass();
        xdrVar.m(null, hxcVar);
        xdr xdrVar2 = dk4Var.c;
        xdrVar2.getClass();
        xdrVar2.m(null, p84Var);
    }

    @Override // defpackage.oa7
    public Object a() {
        return this.b;
    }

    @Override // defpackage.pxh
    public void c(hxh hxhVar, MenuItem menuItem) {
        ((q54) this.b).f.removeCallbacksAndMessages(hxhVar);
    }

    @Override // defpackage.rmp
    public void e(nkp nkpVar) {
        p84 p84Var = (p84) nkpVar;
        p84Var.getClass();
        L(new hxc(s84.a), p84Var);
    }

    @Override // defpackage.o1j
    public n1j f(n1j n1jVar) {
        return n1jVar instanceof u28 ? n1jVar : n1jVar.b(r1c.c);
    }

    @Override // defpackage.rmp
    public void g(nkp nkpVar, boolean z) {
        p84 p84Var = (p84) nkpVar;
        p84Var.getClass();
        L(new hxc(s84.b), p84Var);
    }

    @Override // defpackage.t8s
    public d7f get(String str) {
        d7f d7fVar = (d7f) ((xy0) ((mka) this.b).a).get(str);
        if (d7fVar != null) {
            return d7fVar;
        }
        return null;
    }

    @Override // defpackage.ib1
    public vdr getState() {
        return ydr.a(new kb1("Toxi$", new sa1(t75.c(ogp.p())), ta1.a, new ra1("Российская поп-певица. Стала известна в 2017 году с песнями «Чак» и «Анестезия». Широкую популярность получила в конце 2018 года после выхода трека «Life». Трек «Life» стал самым разыскиваемым синглом в Shazam за 2019 год, а также занял первую строчку самых популярных треков 2019 года по версии Яндекс Музыки. Трек «Life» стал самым разыскиваемым синглом в Shazam за 2019 год, а также занял первую строчку самых популярных треков 2019 года по версии Яндекс"), new va1(new db1(114637396, 9315)), new ua1(u75.h(new w7g(new a8g("Telegram", "norimyxxxo", null), new r7g("https://www.google.com/")), new w7g(new a8g("Instagram", "norimyxxxo", null), new r7g("https://www.google.com/"))))));
    }

    @Override // defpackage.rmp
    public void h(nkp nkpVar, int i) {
        p84 p84Var = (p84) nkpVar;
        p84Var.getClass();
        L(new hxc(s84.f, J(i)), p84Var);
    }

    @Override // defpackage.uug
    public void i() {
        ((AtomicLong) this.b).getAndAdd(1L);
    }

    @Override // defpackage.rmp
    public void j(nkp nkpVar, int i) {
        String i2;
        p84 p84Var = (p84) nkpVar;
        p84Var.getClass();
        nmb nmbVar = w64.a;
        if (i >= -999 && i <= 999) {
            i2 = i != 0 ? i != 7 ? i != 14 ? i != 15 ? qld.G(i) : "TIMEOUT" : "INTERRUPTED" : "NETWORK_ERROR" : "SUCCESS";
        } else if (i < 2000 || i > 2049) {
            if (i >= 2050 && i <= 2059) {
                Locale locale = Locale.ROOT;
                i2 = k5r.i(i, "Cast controller status code ");
            } else if (i >= 2100 && i <= 2109) {
                Locale locale2 = Locale.ROOT;
                i2 = k5r.i(i, "Media control channel status code ");
            } else if (i >= 2150 && i <= 2169) {
                Locale locale3 = Locale.ROOT;
                i2 = k5r.i(i, "Cast session status code ");
            } else if (i >= 2200 && i <= 2219) {
                Locale locale4 = Locale.ROOT;
                i2 = k5r.i(i, "Cast remote display status code ");
            } else if (i >= 2250 && i <= 2299) {
                Locale locale5 = Locale.ROOT;
                i2 = k5r.i(i, "Cast socket status code ");
            } else if (i >= 2300 && i <= 2309) {
                Locale locale6 = Locale.ROOT;
                i2 = k5r.i(i, "Cast service status code ");
            } else if (i >= 2310 && i <= 2319) {
                Locale locale7 = Locale.ROOT;
                i2 = k5r.i(i, "Endpoint switch status code ");
            } else if (i >= 2350 && i <= 2359) {
                Locale locale8 = Locale.ROOT;
                i2 = k5r.i(i, "Cast multizone device status code ");
            } else if (i >= 2400 && i <= 2419) {
                Locale locale9 = Locale.ROOT;
                i2 = k5r.i(i, "Cast relay casting status code ");
            } else if (i >= 2450 && i <= 2469) {
                Locale locale10 = Locale.ROOT;
                i2 = k5r.i(i, "Cast nearby casting status code ");
            } else if (i >= 2420 && i <= 2439) {
                Locale locale11 = Locale.ROOT;
                i2 = k5r.i(i, "Remote connection status code ");
            } else if (i >= 2470 && i <= 2479) {
                Locale locale12 = Locale.ROOT;
                i2 = k5r.i(i, "Cast application status code ");
            } else if (i < 2490 || i > 2499) {
                Locale locale13 = Locale.ROOT;
                i2 = k5r.i(i, "Unknown cast status code ");
            } else {
                Locale locale14 = Locale.ROOT;
                i2 = k5r.i(i, "Cast media loading status code ");
            }
        } else if (i != 2015) {
            switch (i) {
                case 2000:
                    i2 = "AUTHENTICATION_FAILED";
                    break;
                case 2001:
                    i2 = "INVALID_REQUEST";
                    break;
                case 2002:
                    i2 = "CANCELED";
                    break;
                case 2003:
                    i2 = "NOT_ALLOWED";
                    break;
                case 2004:
                    i2 = "APPLICATION_NOT_FOUND";
                    break;
                case 2005:
                    i2 = "APPLICATION_NOT_RUNNING";
                    break;
                case 2006:
                    i2 = "MESSAGE_TOO_LARGE";
                    break;
                case 2007:
                    i2 = "MESSAGE_SEND_BUFFER_TOO_FULL";
                    break;
                default:
                    Locale locale15 = Locale.ROOT;
                    i2 = k5r.i(i, "Common cast status code ");
                    break;
            }
        } else {
            i2 = "TCP_PROBER_FAIL_TO_VERIFY_DEVICE";
        }
        w64.b(ulb.Connection, w64.a("ChromeCastException", i2));
        L(new hxc(s84.f, true), p84Var);
        K(s84.a, i);
    }

    @Override // defpackage.ib1
    public q0d k() {
        return (s0d) this.b;
    }

    @Override // defpackage.aqr
    public Task l(Object obj) {
        bpp bppVar = (bpp) obj;
        qne qneVar = (qne) this.b;
        if (bppVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return ywf.w(null);
        }
        gp6 gp6Var = (gp6) qneVar.b;
        gp6.a(gp6Var);
        gp6Var.m.s(null, (vq6) gp6Var.e.a);
        gp6Var.q.d(null);
        return ywf.w(null);
    }

    @Override // defpackage.pxh
    public void m(hxh hxhVar, rxh rxhVar) {
        q54 q54Var = (q54) this.b;
        Handler handler = q54Var.f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = q54Var.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (hxhVar == ((p54) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new t5(this, i2 < arrayList.size() ? (p54) arrayList.get(i2) : null, rxhVar, hxhVar, 3), hxhVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // defpackage.rmp
    public void n(nkp nkpVar, String str) {
        p84 p84Var = (p84) nkpVar;
        p84Var.getClass();
        str.getClass();
        L(new hxc(s84.c), p84Var);
    }

    @Override // defpackage.ib1
    public p7a o(m7a m7aVar) {
        m7aVar.getClass();
        return new r7a();
    }

    @Override // defpackage.x7o
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 23:
                en enVar = (en) obj;
                cz6 cz6Var = (cz6) this.b;
                voi voiVar = cz6Var.t;
                enVar.getClass();
                if (enVar instanceof zm) {
                    if (cz6Var.w != null) {
                        cz6Var.p.l(new yy6());
                        return;
                    } else {
                        Intrinsics.j("textProvider");
                        throw null;
                    }
                }
                if (enVar instanceof bn) {
                    bn bnVar = (bn) enVar;
                    voiVar.l(new j2c(bnVar.a, bnVar.b));
                    return;
                } else if (enVar instanceof xm) {
                    voiVar.l(h2c.a);
                    return;
                } else {
                    if (enVar instanceof dn) {
                        xq0.q("Sbp has its own fragment");
                        return;
                    }
                    return;
                }
            default:
                jg3 jg3Var = (jg3) obj;
                jg3Var.getClass();
                g47 g47Var = (g47) this.b;
                hpo hpoVar = g47Var.s;
                qs6 qs6Var = new qs6(6, g47Var, jg3Var);
                if (hpoVar.a) {
                    qs6Var.invoke();
                    return;
                }
                return;
        }
    }

    @Override // defpackage.o1j
    public mif p(n1j n1jVar) {
        return nif.d(p1j.b);
    }

    @Override // defpackage.igs
    public Cursor q(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return ((ContentResolver) this.b).query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, e, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
    }

    @Override // defpackage.pm5
    public void r(Exception exc) {
        nr1 nr1Var = (nr1) this.b;
        if (exc == null || nr1Var.j) {
            nr1Var.b(exc);
        } else {
            nr1Var.b(new my1("connection closed before response completed.", exc));
        }
    }

    @Override // defpackage.ib1
    public x7g u(r7g r7gVar, mm6 mm6Var) {
        mm6Var.getClass();
        return new x7g(r7gVar, new zs0(19));
    }

    @Override // defpackage.rmp
    public void v(nkp nkpVar, int i) {
        p84 p84Var = (p84) nkpVar;
        p84Var.getClass();
        boolean J = J(i);
        L(new hxc(s84.f, J), p84Var);
        if (J) {
            K(s84.b, i);
        }
    }

    @Override // defpackage.rmp
    public void w(nkp nkpVar, int i) {
        p84 p84Var = (p84) nkpVar;
        p84Var.getClass();
        boolean J = J(i);
        L(new hxc(s84.d, J), p84Var);
        if (J) {
            K(s84.b, i);
        }
    }

    @Override // defpackage.x7o
    public void x(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 23:
                bfk bfkVar = (bfk) obj;
                Integer valueOf = Integer.valueOf(R.string.paymentsdk_try_now_or_later);
                bfkVar.getClass();
                Pair pair = bz6.a[bfkVar.a.ordinal()] == 1 ? new Pair(Integer.valueOf(R.string.paymentsdk_something_wrong_with_internet_error_title), valueOf) : new Pair(Integer.valueOf(R.string.paymentsdk_something_went_wrong), valueOf);
                ((cz6) obj2).p.l(new wy6(((Number) pair.a).intValue(), Integer.valueOf(((Number) pair.b).intValue())));
                break;
            default:
                bfk bfkVar2 = (bfk) obj;
                bfkVar2.getClass();
                g47 g47Var = (g47) obj2;
                hpo hpoVar = g47Var.s;
                qs6 qs6Var = new qs6(5, g47Var, bfkVar2);
                if (hpoVar.a) {
                    qs6Var.invoke();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.rmp
    public void y(nkp nkpVar) {
        p84 p84Var = (p84) nkpVar;
        p84Var.getClass();
        L(new hxc(s84.e), p84Var);
    }

    @Override // defpackage.o1j
    public n1j z(q1f q1fVar) {
        q1fVar.getClass();
        y7o a0 = bkp.a0(q1fVar, e27.A0);
        if (a0.b()) {
            return null;
        }
        a38 a38Var = (a38) a0.a();
        s7w s7wVar = (s7w) this.b;
        if (s7wVar.a.contains(a38Var.a)) {
            return null;
        }
        return zc4.A(a38Var, 200);
    }

    @Override // defpackage.oa7
    public void b() {
    }

    public void B(int i) {
    }

    public void d(int i) {
    }

    public void s(int i, float f) {
    }

    public sld(smk smkVar, ix6 ix6Var) {
        this.a = 10;
        this.b = ix6Var;
    }

    public sld(mka mkaVar, vpl vplVar) {
        this.a = 14;
        this.b = mkaVar;
    }

    public sld(u7e u7eVar) {
        this.a = 27;
        if (u7eVar == null) {
            s7e s7eVar = new s7e();
            s7eVar.h(null, "https://log.strm.yandex.ru/perf");
            u7eVar = s7eVar.e();
        }
        this.b = u7eVar;
    }

    public sld(String str, Locale locale) {
        this.a = 20;
        this.b = DateTimeFormatter.ofPattern(str, locale);
    }

    public sld(SharedPreferences.Editor editor) {
        this.a = 28;
        editor.getClass();
        this.b = editor;
    }

    public /* synthetic */ sld(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public sld(ClassLoader classLoader) {
        this.a = 21;
        classLoader.getClass();
        this.b = classLoader;
    }
}
