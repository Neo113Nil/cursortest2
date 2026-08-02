package defpackage;

import androidx.window.extensions.layout.WindowLayoutComponent;
import com.yandex.pulse.metrics.o;
import java.lang.annotation.Annotation;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;

/* loaded from: classes6.dex */
public final class wjp extends uif implements Function0 {
    public static final wjp A;
    public static final wjp A0;
    public static final wjp B;
    public static final wjp B0;
    public static final wjp C;
    public static final wjp D;
    public static final wjp E;
    public static final wjp F;
    public static final wjp G;
    public static final wjp H;
    public static final wjp I;
    public static final wjp J;
    public static final wjp K;
    public static final wjp L;
    public static final wjp X;
    public static final wjp Y;
    public static final wjp Z;
    public static final wjp s;
    public static final wjp t;
    public static final wjp u;
    public static final wjp v;
    public static final wjp v0;
    public static final wjp w;
    public static final wjp w0;
    public static final wjp x;
    public static final wjp x0;
    public static final wjp y;
    public static final wjp y0;
    public static final wjp z;
    public static final wjp z0;
    public final /* synthetic */ int r;

    static {
        int i = 0;
        s = new wjp(i, 0);
        t = new wjp(i, 1);
        u = new wjp(i, 2);
        v = new wjp(i, 3);
        w = new wjp(i, 4);
        x = new wjp(i, 5);
        y = new wjp(i, 6);
        z = new wjp(i, 7);
        A = new wjp(i, 8);
        B = new wjp(i, 9);
        C = new wjp(i, 10);
        D = new wjp(i, 11);
        E = new wjp(i, 12);
        F = new wjp(i, 13);
        G = new wjp(i, 14);
        H = new wjp(i, 15);
        I = new wjp(i, 16);
        J = new wjp(i, 17);
        K = new wjp(i, 18);
        L = new wjp(i, 19);
        X = new wjp(i, 20);
        Y = new wjp(i, 21);
        Z = new wjp(i, 22);
        v0 = new wjp(i, 23);
        w0 = new wjp(i, 24);
        x0 = new wjp(i, 25);
        y0 = new wjp(i, 26);
        z0 = new wjp(i, 27);
        A0 = new wjp(i, 28);
        B0 = new wjp(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wjp(int i, int i2) {
        super(i);
        this.r = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        WindowLayoutComponent a;
        long j = 0;
        switch (this.r) {
            case 0:
                return new tyo("ru.yandex.video.m3.ab.config.service.ServiceAbFlag", ern.a(yjp.class), new f9f[]{ern.a(rc3.class), ern.a(y5b.class), ern.a(b6b.class), ern.a(fqe.class)}, new t9f[]{pc3.a, w5b.a, z5b.a, dqe.a}, new Annotation[0]);
            case 1:
                return new hvp(jup.a, jup.b, jup.c, jup.d, jup.e);
            case 2:
                return new ivp();
            case 3:
                return xz0.Y(new String[]{jpt.a(20).a, jpt.a(15).a, jpt.a(13).a, jpt.a(19).a});
            case 4:
                return y2x.y(2, "AppResumeStatus");
            case 5:
                return new Regex("\\.(\\w*)(?:$|\\?)");
            case 6:
                return new n4f();
            case 7:
                return new cma(0);
            case 8:
                return ydt.a;
            case 9:
                return wdt.a;
            case 10:
                return new wpe(j);
            case 11:
                return new wpe(j);
            case 12:
                return yds.b;
            case 13:
                long j2 = d85.n;
                return new h95(j2, j2, j2, j2, j2, j2, j2);
            case 14:
                long j3 = d85.n;
                return new g95(j3, j3, j3, j3, j3, j3, j3);
            case 15:
                return new u3r(Float.NaN, Float.NaN, Float.NaN, 0);
            case 16:
                return new v3r(Float.NaN, Float.NaN, Float.NaN);
            case 17:
                return new tdt(ges.d, kes.c, Float.NaN);
            case 18:
                return new sdt(ges.d, Float.NaN);
            case 19:
                return new fgc();
            case 20:
                a42 a42Var = new a42(rvr.v0);
                a42Var.g();
                return a42Var;
            case 21:
                return new rdt(null, null, null, null, null, null, null, null, null, null, 32767);
            case 22:
                return new udt(null, 16383);
            case 23:
                return new SimpleDateFormat("HH:mm:ss.SSS", Locale.ROOT);
            case 24:
                return Unit.a;
            case 25:
                n8t n8tVar = new n8t();
                n8tVar.W(new w3c());
                n8tVar.W(new qb4());
                return n8tVar;
            case 26:
                try {
                    ClassLoader classLoader = npv.class.getClassLoader();
                    sno snoVar = classLoader != null ? new sno(classLoader, new sld(classLoader)) : null;
                    if (snoVar == null || (a = snoVar.a()) == null) {
                        return null;
                    }
                    classLoader.getClass();
                    sld sldVar = new sld(classLoader);
                    int a2 = m1c.a();
                    return a2 >= 2 ? new k1c(a) : a2 == 1 ? new j1c(a, sldVar) : new h1c();
                } catch (Throwable unused) {
                    mpv mpvVar = mpv.a;
                    return null;
                }
            case 27:
                return new wfc();
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                String language = Locale.getDefault().getLanguage();
                if (language != null) {
                    int hashCode = language.hashCode();
                    if (hashCode != 3241) {
                        if (hashCode != 3651) {
                            if (hashCode != 3710) {
                                if (hashCode == 3734 && language.equals("uk")) {
                                    return emf.Uk;
                                }
                            } else if (language.equals("tr")) {
                                return emf.Tr;
                            }
                        } else if (language.equals("ru")) {
                            return emf.Ru;
                        }
                    } else if (language.equals("en")) {
                        return emf.En;
                    }
                }
                return emf.Other;
            default:
                return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        }
    }
}
