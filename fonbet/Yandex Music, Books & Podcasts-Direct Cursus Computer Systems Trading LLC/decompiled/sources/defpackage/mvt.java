package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class mvt implements u6c, x2r, p7q, z7q, ab0, gn3, spr, dfs, w2q, n03 {
    public static final mvt f;
    public static final mvt g;
    public final /* synthetic */ int a;
    public static final mvt b = new mvt(0);
    public static final mvt c = new mvt(1);
    public static final mvt d = new mvt(2);
    public static final mvt e = new mvt(3);
    public static final mvt h = new mvt(5);
    public static final mvt i = new mvt(6);
    public static final mvt j = new mvt(7);
    public static final mvt k = new mvt(8);
    public static final mvt l = new mvt(9);
    public static final mvt m = new mvt(10);
    public static final mvt n = new mvt(11);
    public static final mvt o = new mvt(12);

    static {
        int i2 = 4;
        f = new mvt(i2);
        g = new mvt(i2);
    }

    public /* synthetic */ mvt(int i2) {
        this.a = i2;
    }

    public static float A(float f2, float f3, float f4, int i2) {
        float f5 = ((f2 / 30.0f) + i2) % 12.0f;
        return f4 - (Math.max(-1.0f, Math.min(f5 - 3, Math.min(9 - f5, 1.0f))) * (Math.min(f4, 1.0f - f4) * f3));
    }

    public static l5j w(Integer num, List list, int i2) {
        Integer num2 = (i2 & 4) != 0 ? null : num;
        lt V = x2i.V();
        list.getClass();
        return new l5j(new u9b("avatars.yandex.net/get-music-content/10103188/b0fc313e.a.26709117-2/%%", "#079F65", null), list, V, "24 марта 2024", num2, null, -65536, new u9b("avatars.yandex.net/get-music-content/10103188/b0fc313e.a.26709117-2/%%", "#079F65", null), new u9b("avatars.yandex.net/get-music-content/10103188/b0fc313e.a.26709117-2/%%", "#079F65", null), "Новый релиз", true, "Крутое описание релиза от нашей редакции! Релиз просто ВАУ!");
    }

    public static final File y() {
        if (bp6.a.contains(mvt.class)) {
            return null;
        }
        try {
            File file = new File(j3c.b().getFilesDir(), "facebook_ml/");
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return null;
                }
            }
            return file;
        } catch (Throwable th) {
            bp6.a(mvt.class, th);
            return null;
        }
    }

    public static long z(float f2, float f3, float f4, float f5, int i2) {
        int i3 = d85.o;
        if ((i2 & 8) != 0) {
            f5 = 1.0f;
        }
        rdo rdoVar = n95.e;
        if (0.0f > f2 || f2 > 360.0f || 0.0f > f3 || f3 > 1.0f || 0.0f > f4 || f4 > 1.0f) {
            rme.a("HSL (" + f2 + ", " + f3 + ", " + f4 + ") must be in range (0..360, 0..1, 0..1)");
        }
        return c3x.e(A(f2, f3, f4, 0), A(f2, f3, f4, 8), A(f2, f3, f4, 4), f5, rdoVar);
    }

    @Override // defpackage.n03
    public jxt B(jxt jxtVar, jxt jxtVar2) {
        int i2 = this.a;
        jxtVar.getClass();
        jxtVar2.getClass();
        switch (i2) {
            case 25:
                return new y9w(24).B(jxtVar2, jxtVar);
            case 26:
                return gld.G(jxtVar, jxtVar2, fl5.b);
            default:
                yxt yxtVar = jxtVar2.a;
                yxt yxtVar2 = jxtVar.a;
                yxt yxtVar3 = yxt.Boolean;
                if (yxtVar2 == yxtVar3 && yxtVar == yxtVar3) {
                    return new vc3(jxtVar.c() || jxtVar2.c());
                }
                if (yxtVar2 != yxtVar3) {
                    yxtVar = yxtVar2;
                }
                throw new mac(yxtVar, yxtVar3);
        }
    }

    public String C(String str) {
        if (bp6.a.contains(this)) {
            return null;
        }
        try {
            str.getClass();
            int length = str.length() - 1;
            int i2 = 0;
            boolean z = false;
            while (i2 <= length) {
                boolean z2 = Intrinsics.e(str.charAt(!z ? i2 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i2++;
                } else {
                    z = true;
                }
            }
            Object[] array = new Regex("\\s+").g(0, str.subSequence(i2, length + 1).toString()).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String join = TextUtils.join(StringUtil.SPACE, (String[]) array);
            join.getClass();
            return join;
        } catch (Throwable th) {
            bp6.a(this, th);
            return null;
        }
    }

    @Override // defpackage.z7q
    public Object D(z1q z1qVar) {
        z1qVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.z7q
    public Object E(k9q k9qVar) {
        k9qVar.getClass();
        return Boolean.TRUE;
    }

    public void F(String str) {
        if (p(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    @Override // defpackage.z7q
    public Object G(b1q b1qVar) {
        b1qVar.getClass();
        return Boolean.TRUE;
    }

    public int[] H(String str) {
        if (bp6.a.contains(this)) {
            return null;
        }
        try {
            str.getClass();
            int[] iArr = new int[128];
            String C = C(str);
            Charset forName = Charset.forName("UTF-8");
            forName.getClass();
            if (C == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = C.getBytes(forName);
            bytes.getClass();
            for (int i2 = 0; i2 < 128; i2++) {
                if (i2 < bytes.length) {
                    iArr[i2] = bytes[i2] & 255;
                } else {
                    iArr[i2] = 0;
                }
            }
            return iArr;
        } catch (Throwable th) {
            bp6.a(this, th);
            return null;
        }
    }

    public void I(String str, Exception exc) {
        if (p(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }

    @Override // defpackage.u6c
    public void L(boolean z) {
        if (z) {
            j3c.k = true;
        }
    }

    @Override // defpackage.ab0
    public apo a(Function1 function1) {
        function1.getClass();
        j3 j3Var = new j3(10);
        u10 u10Var = new u10(22);
        apo apoVar = bpo.a;
        return new apo(0, j3Var, u10Var);
    }

    @Override // defpackage.gn3
    public byte[] b(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return bArr2;
    }

    @Override // defpackage.w2q
    public Object c(foc focVar) {
        focVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.spr
    public boolean d(dsc dscVar) {
        String str = dscVar.n;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // defpackage.ab0
    public ya0 e(Function1 function1) {
        d44 d44Var = d44.b;
        function1.getClass();
        return new xa0(d44Var);
    }

    @Override // defpackage.spr
    public upr f(dsc dscVar) {
        String str = dscVar.n;
        List list = dscVar.q;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new rn5(list);
                case "application/pgs":
                    return new xdh(17);
                case "application/x-mp4-vtt":
                    return new agi();
                case "text/vtt":
                    return new atn(18);
                case "application/x-quicktime-tx3g":
                    return new sct(list);
                case "text/x-ssa":
                    return new w9r(list);
                case "application/vobsub":
                    return new bjt(list);
                case "application/x-subrip":
                    return new hnr();
                case "application/ttml+xml":
                    return new jbt();
            }
        }
        xq0.x(f1d.g("Unsupported MIME type: ", str));
        return null;
    }

    @Override // defpackage.w2q
    public Object g(faq faqVar) {
        faqVar.getClass();
        boolean z = true;
        if (!(faqVar instanceof naq) && !(faqVar instanceof saq) && !(faqVar instanceof daq)) {
            if (!(faqVar instanceof qaq)) {
                b6e.s();
                return null;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.w2q
    public Object h(jzs jzsVar) {
        jzsVar.getClass();
        return Boolean.TRUE;
    }

    @Override // defpackage.w2q
    public Object i(m1q m1qVar) {
        m1qVar.getClass();
        boolean z = true;
        if (!(m1qVar instanceof c2q) && !(m1qVar instanceof j1q)) {
            if (!(m1qVar instanceof e2q)) {
                b6e.s();
                return null;
            }
            z = false;
        }
        return Boolean.valueOf(z);
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

    @Override // defpackage.spr
    public int l(dsc dscVar) {
        String str = dscVar.n;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        xq0.x(f1d.g("Unsupported MIME type: ", str));
        return 0;
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        switch (this.a) {
            case 6:
                iocVar.getClass();
                return null;
            default:
                iocVar.getClass();
                return Boolean.FALSE;
        }
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        switch (this.a) {
            case 6:
                szuVar.getClass();
                eu7 eu7Var = (eu7) szuVar.b.g.getValue();
                if (eu7Var != null) {
                    return (jzs) eu7Var.b();
                }
                return null;
            default:
                szuVar.getClass();
                return Boolean.TRUE;
        }
    }

    @Override // defpackage.z7q
    public Object o(a1q a1qVar) {
        a1qVar.getClass();
        return Boolean.TRUE;
    }

    public boolean p(int i2) {
        return 4 <= i2 || Log.isLoggable("FirebaseCrashlytics", i2);
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        switch (this.a) {
            case 6:
                y4dVar.getClass();
                return null;
            default:
                y4dVar.getClass();
                return Boolean.FALSE;
        }
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [arf, java.lang.Object] */
    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        switch (this.a) {
            case 6:
                maqVar.getClass();
                if (maqVar instanceof jbq) {
                    return (naq) ((jbq) maqVar).m.getValue();
                }
                if (maqVar instanceof vaq) {
                    return ((vaq) maqVar).o();
                }
                if ((maqVar instanceof eaq) || (maqVar instanceof raq)) {
                    return null;
                }
                b6e.s();
                return null;
            default:
                maqVar.getClass();
                List E = bzf.E(maqVar);
                boolean z = true;
                if (!(E instanceof Collection) || !E.isEmpty()) {
                    Iterator it = E.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((faq) it.next()).a() == null) {
                                z = false;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    @Override // defpackage.z7q
    public Object r(a8q a8qVar) {
        a8qVar.getClass();
        return Boolean.TRUE;
    }

    @Override // defpackage.z7q
    public Object s(wpw wpwVar) {
        wpwVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        switch (this.a) {
            case 6:
                t1qVar.getClass();
                return t1qVar.d;
            default:
                t1qVar.getClass();
                return Boolean.FALSE;
        }
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        switch (this.a) {
            case 6:
                u7uVar.getClass();
                return u7uVar.d;
            default:
                u7uVar.getClass();
                ArrayList arrayList = u7uVar.g;
                boolean z = true;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        ((i5u) it.next()).getClass();
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    public void v(String str) {
        if (p(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    @Override // defpackage.dfs
    public int x() {
        return R.style.PaymentsdkYaTheme_TransportCards_Light;
    }
}
