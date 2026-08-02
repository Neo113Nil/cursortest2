package defpackage;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yandex.pulse.metrics.o;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.player.impl.data.dto.AdapterFactory;

/* loaded from: classes6.dex */
public final class grb extends uif implements Function0 {
    public static final grb A;
    public static final grb A0;
    public static final grb B;
    public static final grb B0;
    public static final grb C;
    public static final grb D;
    public static final grb E;
    public static final grb F;
    public static final grb G;
    public static final grb H;
    public static final grb I;
    public static final grb J;
    public static final grb K;
    public static final grb L;
    public static final grb X;
    public static final grb Y;
    public static final grb Z;
    public static final grb s;
    public static final grb t;
    public static final grb u;
    public static final grb v;
    public static final grb v0;
    public static final grb w;
    public static final grb w0;
    public static final grb x;
    public static final grb x0;
    public static final grb y;
    public static final grb y0;
    public static final grb z;
    public static final grb z0;
    public final /* synthetic */ int r;

    static {
        int i = 0;
        s = new grb(i, 0);
        t = new grb(i, 1);
        u = new grb(i, 2);
        v = new grb(i, 3);
        w = new grb(i, 4);
        x = new grb(i, 5);
        y = new grb(i, 6);
        z = new grb(i, 7);
        A = new grb(i, 8);
        B = new grb(i, 9);
        C = new grb(i, 10);
        D = new grb(i, 11);
        E = new grb(i, 12);
        F = new grb(i, 13);
        G = new grb(i, 14);
        H = new grb(i, 15);
        I = new grb(i, 16);
        J = new grb(i, 17);
        K = new grb(i, 18);
        L = new grb(i, 19);
        X = new grb(i, 20);
        Y = new grb(i, 21);
        Z = new grb(i, 22);
        v0 = new grb(i, 23);
        w0 = new grb(i, 24);
        x0 = new grb(i, 25);
        y0 = new grb(i, 26);
        z0 = new grb(i, 27);
        A0 = new grb(i, 28);
        B0 = new grb(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ grb(int i, int i2) {
        super(i);
        this.r = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 3;
        switch (this.r) {
            case 0:
                wqr n = a4g.n();
                dq7 dq7Var = ca8.a;
                mn7.d.getClass();
                return gld.e(e.c(n, wkt.d.I0(1)).plus(new im6("YP:reportLogger")).plus(new b43(rre.f, i)));
            case 1:
                return Unit.a;
            case 2:
                return Unit.a;
            case 3:
                return Boolean.FALSE;
            case 4:
                return Unit.a;
            case 5:
                return Unit.a;
            case 6:
                return Unit.a;
            case 7:
                return new ConcurrentHashMap();
            case 8:
                return new yo6();
            case 9:
                return c5b.a;
            case 10:
                return new OkHttpClient();
            case 11:
                return null;
            case 12:
                return jl7.a;
            case 13:
                return Boolean.FALSE;
            case 14:
                return null;
            case 15:
                return Boolean.TRUE;
            case 16:
                return Boolean.TRUE;
            case 17:
                return new cma(48);
            case 18:
                GsonBuilder gsonBuilder = new GsonBuilder();
                gsonBuilder.e.add(new AdapterFactory());
                gsonBuilder.i = false;
                return gsonBuilder.a();
            case 19:
                String[] iSOLanguages = Locale.getISOLanguages();
                HashMap hashMap = new HashMap(iSOLanguages.length);
                for (String str : iSOLanguages) {
                    try {
                        String iSO3Language = new Locale(str).getISO3Language();
                        iSO3Language.getClass();
                        if (iSO3Language.length() > 0) {
                            str.getClass();
                            hashMap.put(str, iSO3Language);
                        }
                    } catch (MissingResourceException unused) {
                    }
                }
                return hashMap;
            case 20:
                return new mpf(3);
            case 21:
                return new iag();
            case 22:
                return Unit.a;
            case 23:
            case 24:
                return null;
            case 25:
                return Boolean.FALSE;
            case 26:
                return new Gson();
            case 27:
                return UUID.randomUUID();
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return "NetEventListener" + wzi.a.getAndIncrement();
            default:
                return j6j.m;
        }
    }
}
