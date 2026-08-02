package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.util.Log;
import android.view.Display;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;
import kotlin.coroutines.f;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class e88 implements ng3, w2q, p7q, f, ksg, jd6, dfs, i1, xjh {
    public static final e88 b = new e88(1);
    public static final e88 c = new e88(2);
    public static final e88 d = new e88(3);
    public static final e88 e = new e88(4);
    public static final /* synthetic */ e88 f = new e88(5);
    public static final e88 g = new e88(6);
    public static final e88 h = new e88(7);
    public static final String[] i = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};
    public static final e88 j = new e88(9);
    public static final e88 k = new e88(10);
    public static final e88 l = new e88(11);
    public static final e88 m = new e88(12);
    public final /* synthetic */ int a;

    public /* synthetic */ e88(int i2) {
        this.a = i2;
    }

    public static final int r(nu1 nu1Var) {
        mu1 mu1Var;
        nu1Var.getClass();
        int ordinal = nu1Var.W().ordinal();
        if (ordinal == 0) {
            mu1Var = mu1.N;
            mu1Var.getClass();
        } else if (ordinal == 1) {
            mu1Var = mu1.O;
            mu1Var.getClass();
        } else {
            if (ordinal != 2) {
                b6e.s();
                return 0;
            }
            mu1Var = mu1.P;
            mu1Var.getClass();
        }
        return mu1Var.x(nu1Var);
    }

    @Override // defpackage.xjh
    public boolean A() {
        return false;
    }

    public kt1 B(File file) {
        file.getClass();
        try {
            Logger logger = epj.a;
            return new kt1(new FileOutputStream(file, false), new vis());
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            Logger logger2 = epj.a;
            return new kt1(new FileOutputStream(file, false), new vis());
        }
    }

    public Uri C(List list) {
        k7h k7hVar = (k7h) o8g.E(list).b.getValue();
        if (k7hVar instanceof j9p) {
            String str = ((j9p) k7hVar).a;
            str.getClass();
            jyr jyrVar = im1.i;
            return ff7.t(str);
        }
        if (k7hVar instanceof i9p) {
            return ybl.a(((i9p) k7hVar).a);
        }
        if (k7hVar instanceof q9p) {
            String str2 = ((q9p) k7hVar).a;
            str2.getClass();
            Uri m2 = new r20(d2t.c).c(str2).m();
            m2.getClass();
            return m2;
        }
        if (k7hVar instanceof p9p) {
            p9p p9pVar = (p9p) k7hVar;
            String str3 = p9pVar.b;
            String str4 = p9pVar.c;
            if (str3 != null && str4 != null) {
                return ybl.g(str3, str4);
            }
        } else if (!(k7hVar instanceof h9p) && !(k7hVar instanceof k9p) && !(k7hVar instanceof l9p) && !(k7hVar instanceof n9p) && !Intrinsics.d(k7hVar, r9p.a) && k7hVar != null) {
            b6e.s();
        }
        return null;
    }

    @Override // defpackage.xjh
    public MediaCodecInfo a(int i2) {
        return MediaCodecList.getCodecInfoAt(i2);
    }

    @Override // defpackage.ksg
    public void b(String str) {
        Log.e("MVIKotlin", str);
    }

    @Override // defpackage.w2q
    public Object c(foc focVar) {
        switch (this.a) {
            case 2:
                focVar.getClass();
                return Boolean.FALSE;
            case 6:
                focVar.getClass();
                return Boolean.TRUE;
            default:
                focVar.getClass();
                return Boolean.FALSE;
        }
    }

    @Override // defpackage.xjh
    public boolean d(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // defpackage.jd6
    public long f(long j2, long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j2 >> 32));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
        int i2 = sso.a;
        return floatToRawIntBits;
    }

    @Override // defpackage.w2q
    public Object g(faq faqVar) {
        c5b c5bVar;
        switch (this.a) {
            case 2:
                faqVar.getClass();
                boolean z = true;
                if (!(faqVar instanceof naq) && !(faqVar instanceof daq) && !(faqVar instanceof saq)) {
                    if (!(faqVar instanceof qaq)) {
                        b6e.s();
                        return null;
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                faqVar.getClass();
                return Boolean.FALSE;
            default:
                faqVar.getClass();
                if (faqVar instanceof naq) {
                    if (faqVar.b == null || (c5bVar = c5b.a) == null) {
                        c5bVar = c5b.a;
                    }
                    eow eowVar = eow.a;
                    c5bVar.getClass();
                } else if (!(faqVar instanceof saq) && !(faqVar instanceof daq) && !(faqVar instanceof qaq)) {
                    b6e.s();
                    return null;
                }
                return Boolean.FALSE;
        }
    }

    @Override // defpackage.i1
    public q1 getConfig() {
        q1.Companion.getClass();
        return q1.g;
    }

    @Override // defpackage.w2q
    public Object h(jzs jzsVar) {
        switch (this.a) {
            case 2:
                jzsVar.getClass();
                return Boolean.TRUE;
            case 6:
                jzsVar.getClass();
                return Boolean.TRUE;
            default:
                jzsVar.getClass();
                return Boolean.valueOf(a4g.G(jzsVar.a));
        }
    }

    @Override // defpackage.w2q
    public Object i(m1q m1qVar) {
        boolean z;
        switch (this.a) {
            case 2:
                m1qVar.getClass();
                if ((m1qVar instanceof c2q) || (m1qVar instanceof j1q)) {
                    z = true;
                } else {
                    if (!(m1qVar instanceof e2q)) {
                        b6e.s();
                        return null;
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                m1qVar.getClass();
                return Boolean.FALSE;
            default:
                m1qVar.getClass();
                boolean z2 = false;
                if (!(m1qVar instanceof j1q)) {
                    if (m1qVar instanceof c2q) {
                        z2 = a4g.G(((c2q) m1qVar).f);
                    } else if (!(m1qVar instanceof e2q)) {
                        b6e.s();
                        return null;
                    }
                }
                return Boolean.valueOf(z2);
        }
    }

    @Override // defpackage.w2q
    public Object j(i5u i5uVar) {
        switch (this.a) {
            case 2:
                i5uVar.getClass();
                break;
            case 6:
                i5uVar.getClass();
                break;
            default:
                i5uVar.getClass();
                break;
        }
        return Boolean.FALSE;
    }

    @Override // defpackage.w2q
    public Object k(k4d k4dVar) {
        switch (this.a) {
            case 2:
                k4dVar.getClass();
                return Boolean.TRUE;
            case 6:
                k4dVar.getClass();
                return Boolean.TRUE;
            default:
                k4dVar.getClass();
                return Boolean.FALSE;
        }
    }

    @Override // defpackage.xjh
    public boolean l(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        switch (this.a) {
            case 4:
                iocVar.getClass();
                return vys.a;
            case 7:
                iocVar.getClass();
                throw null;
            default:
                iocVar.getClass();
                return null;
        }
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        switch (this.a) {
            case 4:
                szuVar.getClass();
                return szuVar.e;
            case 7:
                szuVar.getClass();
                return jj2.a;
            default:
                szuVar.getClass();
                return y(szuVar.l.g);
        }
    }

    @Override // defpackage.xjh
    public int o() {
        return MediaCodecList.getCodecCount();
    }

    @Override // defpackage.ng3
    public Rect p(Activity activity) {
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!activity.isInMultiWindowMode()) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", ConstantDeviceInfo.APP_PLATFORM);
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i2 = rect.bottom + dimensionPixelSize;
            if (i2 == point.y) {
                rect.bottom = i2;
                return rect;
            }
            int i3 = rect.right + dimensionPixelSize;
            if (i3 == point.x) {
                rect.right = i3;
            }
        }
        return rect;
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        switch (this.a) {
            case 4:
                y4dVar.getClass();
                return vys.a;
            case 7:
                y4dVar.getClass();
                return lsq.n(y4dVar.b.a);
            default:
                y4dVar.getClass();
                return null;
        }
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        switch (this.a) {
            case 4:
                maqVar.getClass();
                break;
            case 7:
                maqVar.getClass();
                faq b2 = maqVar.b();
                if (!(b2 instanceof daq)) {
                    if (!(b2 instanceof naq) && !(b2 instanceof qaq) && !(b2 instanceof saq)) {
                        b6e.s();
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            default:
                maqVar.getClass();
                if (!(maqVar instanceof jbq)) {
                    if (!(maqVar instanceof eaq) && !(maqVar instanceof vaq) && !(maqVar instanceof raq)) {
                        b6e.s();
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return null;
    }

    public void s(File file) {
        file.getClass();
        if (file.delete() || !file.exists()) {
            return;
        }
        tiu.j(file, "failed to delete ");
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        switch (this.a) {
            case 4:
                t1qVar.getClass();
                break;
            case 7:
                t1qVar.getClass();
                m1q m1qVar = t1qVar.c;
                if (!(m1qVar instanceof c2q)) {
                    if (!(m1qVar instanceof j1q)) {
                        if (!(m1qVar instanceof e2q)) {
                            b6e.s();
                            break;
                        }
                    } else {
                        break;
                    }
                }
                break;
            default:
                t1qVar.getClass();
                z3q z3qVar = t1qVar.a;
                if (!(z3qVar instanceof c1q)) {
                    if (!(z3qVar instanceof e1q)) {
                        if (!(z3qVar instanceof r1q)) {
                            if (!(z3qVar instanceof a2q)) {
                                if (!(z3qVar instanceof u1q)) {
                                    if (!(z3qVar instanceof h1q) && !(z3qVar instanceof k1q)) {
                                        b6e.s();
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        } else {
                            nvl nvlVar = ((r1q) z3qVar).c.a;
                            break;
                        }
                    } else {
                        String str = ((e1q) z3qVar).c.a;
                        str.getClass();
                        jyr jyrVar = im1.i;
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return null;
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return "FileSystem.SYSTEM";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        switch (this.a) {
            case 4:
                u7uVar.getClass();
                return vys.a;
            case 7:
                u7uVar.getClass();
                return jj2.a;
            default:
                u7uVar.getClass();
                return null;
        }
    }

    public void v(File file) {
        file.getClass();
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            tiu.j(file, "not a readable directory: ");
            return;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                v(file2);
            }
            if (!file2.delete()) {
                tiu.j(file2, "failed to delete ");
                return;
            }
        }
    }

    public boolean w(File file) {
        file.getClass();
        return file.exists();
    }

    @Override // defpackage.dfs
    public int x() {
        return R.style.PaymentsdkYaTheme_Payments_Light;
    }

    public Uri y(izs izsVar) {
        s9p s9pVar;
        if (!(izsVar instanceof e6v)) {
            if (Intrinsics.d(izsVar, hzs.a)) {
                ssg.a(7, null, "This should not happen. Track source should be always filled in wave queue", null);
                return null;
            }
            b6e.s();
            return null;
        }
        e6v e6vVar = (e6v) izsVar;
        if (e6vVar instanceof d6v) {
            z4q z4qVar = ((d6v) e6vVar).a;
            if (z4qVar instanceof u4q) {
                s9pVar = ((u4q) z4qVar).a.a;
            } else if (z4qVar instanceof s4q) {
                s9pVar = ((s4q) z4qVar).a.a;
            } else {
                if (!(z4qVar instanceof w4q)) {
                    b6e.s();
                    return null;
                }
                s9pVar = ((w4q) z4qVar).a.a;
            }
            return C(o8g.R(s9pVar));
        }
        if (!(e6vVar instanceof b6v)) {
            b6e.s();
            return null;
        }
        r3q r3qVar = ((b6v) e6vVar).a;
        if (r3qVar instanceof j3q) {
            return ybl.a(((j3q) r3qVar).a.a);
        }
        if (r3qVar instanceof l3q) {
            String str = ((l3q) r3qVar).a.a;
            str.getClass();
            jyr jyrVar = im1.i;
            return ff7.t(str);
        }
        if (r3qVar instanceof p3q) {
            bd5 bd5Var = ((p3q) r3qVar).a;
            return ybl.g(bd5Var.s(), bd5Var.a());
        }
        if (r3qVar instanceof m3q) {
            return null;
        }
        b6e.s();
        return null;
    }

    public void z(File file, File file2) {
        file.getClass();
        file2.getClass();
        s(file2);
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException("failed to rename " + file + " to " + file2);
    }

    public /* synthetic */ e88(int i2, Object obj) {
        this.a = i2;
    }

    @Override // defpackage.i1
    public void invalidate() {
    }

    @Override // defpackage.i1
    public void e(q1 q1Var) {
    }
}
