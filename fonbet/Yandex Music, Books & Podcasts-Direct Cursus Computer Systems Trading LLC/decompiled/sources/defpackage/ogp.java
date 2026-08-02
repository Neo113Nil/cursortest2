package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.NetcastTVService;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;
import ru.yandex.music.common.media.queue.GlagolRemoteQueueStartException;

/* loaded from: classes.dex */
public final class ogp implements nx1, u6c, gyf, rek, p7q, w2q, en3, c8k {
    public static jyr h;
    public static final ogp a = new ogp();
    public static final ogp b = new ogp();
    public static final ogp c = new ogp();
    public static final String[] d = {ConnectableDevice.KEY_ID, NetcastTVService.UDAP_API_EVENT};
    public static final ogp e = new ogp();
    public static final ogp f = new ogp();
    public static final ogp g = new ogp();
    public static final ogp i = new ogp();
    public static final ogp j = new ogp();
    public static final ogp k = new ogp();
    public static final ogp l = new ogp();
    public static final ogp m = new ogp();
    public static final ogp n = new ogp();
    public static final ogp o = new ogp();

    public static o0k A(hq5 hq5Var) {
        vdr vdrVar;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(-1086841865);
        if (v() == null) {
            float f2 = 0;
            q0k q0kVar = new q0k(f2, f2, f2, f2);
            oq5Var.p(false);
            return q0kVar;
        }
        boolean booleanValue = ((Boolean) oq5Var.j(koe.a)).booleanValue();
        Object obj = gq5.a;
        if (booleanValue) {
            oq5Var.Z(-1315964929);
            oq5Var.p(false);
            vdrVar = ydr.a(null);
        } else {
            oq5Var.Z(-1315915980);
            Object K = oq5Var.K();
            if (K == obj) {
                K = tlm.f(gld.R(g.a, oq5Var), oq5Var);
            }
            mm6 mm6Var = ((fs5) K).a;
            Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
            boolean f3 = oq5Var.f(context) | oq5Var.f(mm6Var);
            Object K2 = oq5Var.K();
            if (f3 || K2 == obj) {
                K2 = rke.a(context).d(mm6Var);
                oq5Var.k0(K2);
            }
            vdrVar = (vdr) K2;
            oq5Var.p(false);
        }
        aqi O = gld.O(vdrVar, oq5Var);
        jx7 jx7Var = (jx7) oq5Var.j(es5.h);
        boolean f4 = oq5Var.f(O) | oq5Var.f(jx7Var);
        Object K3 = oq5Var.K();
        if (f4 || K3 == obj) {
            K3 = new u0k(O, jx7Var);
            oq5Var.k0(K3);
        }
        u0k u0kVar = (u0k) K3;
        oq5Var.p(false);
        return u0kVar;
    }

    public static void B(Context context, int i2) {
        boolean z = (i2 & 2) == 0;
        boolean z2 = (i2 & 4) == 0;
        kle b2 = r().b();
        context.getClass();
        b2.getClass();
        if (z2) {
            b2 = null;
        } else if (z) {
            b2 = r().c();
        }
        if (b2 == null || v() == null) {
            return;
        }
        rke.a(context).c(b2);
    }

    public static cr d(rc rcVar, q08 q08Var) {
        int i2 = 19;
        return new cr(rcVar, q08Var, new bs4(20), new i9w(), new y9w(i2), new ehv(i2), new gos(i2), new ujl(), 6);
    }

    public static u51 l(String str) {
        return new u51("123", str, new u9b("avatars.yandex.net/get-music-content/10103188/b0fc313e.a.26709117-2/%%", "#079F65", null), null, null);
    }

    public static m7a p() {
        return new m7a("http://donation.com", new u7a("На запись альбома"), new u51("123", "Баста", new u9b("avatars.yandex.net/get-music-content/10103188/b0fc313e.a.26709117-2/%%", "#079F65", null), null, null));
    }

    public static mle r() {
        gle gleVar;
        mle mleVar;
        jyr jyrVar = h;
        return (jyrVar == null || (gleVar = (gle) jyrVar.getValue()) == null || (mleVar = (mle) gleVar.b.getValue()) == null) ? mle.b : mleVar;
    }

    public static rke v() {
        gle gleVar;
        jyr jyrVar = h;
        if (jyrVar == null || (gleVar = (gle) jyrVar.getValue()) == null) {
            return null;
        }
        return (rke) gleVar.a.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e A[Catch: all -> 0x00cf, TRY_LEAVE, TryCatch #5 {all -> 0x00cf, blocks: (B:4:0x000f, B:6:0x0013, B:11:0x0037, B:13:0x0040, B:17:0x005e, B:21:0x007c, B:25:0x0099, B:43:0x00c8, B:52:0x0093, B:60:0x0076, B:68:0x0058, B:78:0x0031, B:72:0x001f, B:75:0x0029, B:46:0x0089, B:54:0x006b, B:62:0x004d, B:32:0x00a5, B:35:0x00af, B:37:0x00b5, B:40:0x00bc), top: B:3:0x000f, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c A[Catch: all -> 0x00cf, TRY_LEAVE, TryCatch #5 {all -> 0x00cf, blocks: (B:4:0x000f, B:6:0x0013, B:11:0x0037, B:13:0x0040, B:17:0x005e, B:21:0x007c, B:25:0x0099, B:43:0x00c8, B:52:0x0093, B:60:0x0076, B:68:0x0058, B:78:0x0031, B:72:0x001f, B:75:0x0029, B:46:0x0089, B:54:0x006b, B:62:0x004d, B:32:0x00a5, B:35:0x00af, B:37:0x00b5, B:40:0x00bc), top: B:3:0x000f, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099 A[Catch: all -> 0x00cf, TRY_LEAVE, TryCatch #5 {all -> 0x00cf, blocks: (B:4:0x000f, B:6:0x0013, B:11:0x0037, B:13:0x0040, B:17:0x005e, B:21:0x007c, B:25:0x0099, B:43:0x00c8, B:52:0x0093, B:60:0x0076, B:68:0x0058, B:78:0x0031, B:72:0x001f, B:75:0x0029, B:46:0x0089, B:54:0x006b, B:62:0x004d, B:32:0x00a5, B:35:0x00af, B:37:0x00b5, B:40:0x00bc), top: B:3:0x000f, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean x(View view) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean matches;
        ogp ogpVar = a;
        Set set = bp6.a;
        if (set.contains(ogp.class)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            TextView textView = (TextView) view;
            if (!set.contains(ogpVar)) {
                try {
                    z = textView.getInputType() == 128 ? true : textView.getTransformationMethod() instanceof PasswordTransformationMethod;
                } catch (Throwable th) {
                    bp6.a(ogpVar, th);
                }
                if (!z && !ogpVar.w((TextView) view)) {
                    TextView textView2 = (TextView) view;
                    if (!bp6.a.contains(ogpVar)) {
                        try {
                        } catch (Throwable th2) {
                            bp6.a(ogpVar, th2);
                        }
                        if (textView2.getInputType() == 96) {
                            z2 = true;
                            if (!z2) {
                                TextView textView3 = (TextView) view;
                                if (!bp6.a.contains(ogpVar)) {
                                    try {
                                    } catch (Throwable th3) {
                                        bp6.a(ogpVar, th3);
                                    }
                                    if (textView3.getInputType() == 112) {
                                        z3 = true;
                                        if (!z3) {
                                            TextView textView4 = (TextView) view;
                                            if (!bp6.a.contains(ogpVar)) {
                                                try {
                                                } catch (Throwable th4) {
                                                    bp6.a(ogpVar, th4);
                                                }
                                                if (textView4.getInputType() == 3) {
                                                    z4 = true;
                                                    if (!z4) {
                                                        TextView textView5 = (TextView) view;
                                                        if (!bp6.a.contains(ogpVar)) {
                                                            try {
                                                                if (textView5.getInputType() == 32) {
                                                                    matches = true;
                                                                } else {
                                                                    String j2 = qeu.j(textView5);
                                                                    if (j2 != null && j2.length() != 0) {
                                                                        matches = Patterns.EMAIL_ADDRESS.matcher(j2).matches();
                                                                    }
                                                                }
                                                            } catch (Throwable th5) {
                                                                bp6.a(ogpVar, th5);
                                                            }
                                                            if (!matches) {
                                                                return false;
                                                            }
                                                        }
                                                        matches = false;
                                                        if (!matches) {
                                                        }
                                                    }
                                                }
                                            }
                                            z4 = false;
                                            if (!z4) {
                                            }
                                        }
                                    }
                                }
                                z3 = false;
                                if (!z3) {
                                }
                            }
                        }
                    }
                    z2 = false;
                    if (!z2) {
                    }
                }
                return true;
            }
            z = false;
            if (!z) {
                TextView textView22 = (TextView) view;
                if (!bp6.a.contains(ogpVar)) {
                }
                z2 = false;
                if (!z2) {
                }
            }
            return true;
        } catch (Throwable th6) {
            bp6.a(ogp.class, th6);
            return false;
        }
    }

    public static GlagolRemoteQueueStartException y(a0q a0qVar, IllegalStateException illegalStateException, String str, int i2) {
        int i3 = GlagolRemoteQueueStartException.c;
        String str2 = null;
        if ((i2 & 2) != 0) {
            illegalStateException = null;
        }
        if ((i2 & 4) != 0) {
            str = null;
        }
        vid vidVar = vid.a;
        if (str == null) {
            if (a0qVar != null) {
                str2 = a0qVar.getClass().getSimpleName() + "(" + System.identityHashCode(a0qVar) + ")";
            }
            str = str2 + "(id = " + a0qVar + ")";
        }
        return new GlagolRemoteQueueStartException(vidVar, str, illegalStateException);
    }

    @Override // defpackage.u6c
    public void L(boolean z) {
        if (z) {
            HashSet hashSet = j3c.a;
            if (gtt.c()) {
                x6c.a(h1b.c, v6c.CrashReport);
                x6c.a(rwd.e, v6c.ErrorReport);
                x6c.a(kjn.d, v6c.AnrReport);
            }
        }
    }

    @Override // defpackage.en3
    public byte[] b(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return bArr2;
    }

    @Override // defpackage.w2q
    public Object c(foc focVar) {
        focVar.getClass();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(boolean z, boolean z2, kle kleVar, hq5 hq5Var, int i2, int i3) {
        int i4;
        boolean z3;
        boolean z4;
        kle b2;
        kle kleVar2;
        boolean z5;
        boolean z6;
        kle kleVar3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-315864934);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (oq5Var.g(z) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= oq5Var.g(z2) ? 32 : 16;
        }
        int i7 = i4 | (((i3 & 4) == 0 && oq5Var.h(kleVar)) ? 256 : 128) | (oq5Var.h(this) ? 2048 : 1024);
        if ((i7 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            z5 = z;
            z6 = z2;
            kleVar3 = kleVar;
        } else {
            oq5Var.U();
            if ((i2 & 1) == 0 || oq5Var.y()) {
                z3 = i5 != 0 ? false : z;
                z4 = i6 != 0 ? false : z2;
                if ((i3 & 4) != 0) {
                    i7 &= -897;
                    b2 = ((Boolean) oq5Var.j(koe.a)).booleanValue() ? jle.b : r().b();
                    oq5Var.q();
                    kleVar2 = null;
                    if (!((Boolean) oq5Var.j(koe.a)).booleanValue() && !z4) {
                        kleVar2 = !z3 ? r().c() : b2;
                    }
                    if (kleVar2 == null) {
                        oq5Var.Z(341456499);
                        f(kleVar2, oq5Var, (i7 >> 6) & 112);
                    } else {
                        oq5Var.Z(338090984);
                    }
                    oq5Var.p(false);
                    z5 = z3;
                    z6 = z4;
                    kleVar3 = b2;
                }
            } else {
                oq5Var.S();
                if ((i3 & 4) != 0) {
                    i7 &= -897;
                }
                z3 = z;
                z4 = z2;
            }
            b2 = kleVar;
            oq5Var.q();
            kleVar2 = null;
            if (!((Boolean) oq5Var.j(koe.a)).booleanValue()) {
                if (!z3) {
                }
            }
            if (kleVar2 == null) {
            }
            oq5Var.p(false);
            z5 = z3;
            z6 = z4;
            kleVar3 = b2;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vkg(this, z5, z6, kleVar3, i2, i3, 0);
        }
    }

    public void f(final kle kleVar, hq5 hq5Var, final int i2) {
        int i3;
        final kle kleVar2;
        kleVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-435689365);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(kleVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(this) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            kleVar2 = kleVar;
        } else {
            if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
                xmn r = oq5Var.r();
                if (r != null) {
                    final int i4 = 0;
                    r.d = new Function2(this) { // from class: wkg
                        public final /* synthetic */ ogp b;

                        {
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i4;
                            hq5 hq5Var2 = (hq5) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    this.b.f(kleVar, hq5Var2, rvf.R(i2 | 1));
                                    break;
                                case 1:
                                    this.b.f(kleVar, hq5Var2, rvf.R(i2 | 1));
                                    break;
                                default:
                                    this.b.f(kleVar, hq5Var2, rvf.R(i2 | 1));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            rke v = v();
            if (v == null) {
                xmn r2 = oq5Var.r();
                if (r2 != null) {
                    final int i5 = 1;
                    r2.d = new Function2(this) { // from class: wkg
                        public final /* synthetic */ ogp b;

                        {
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i52 = i5;
                            hq5 hq5Var2 = (hq5) obj;
                            ((Integer) obj2).getClass();
                            switch (i52) {
                                case 0:
                                    this.b.f(kleVar, hq5Var2, rvf.R(i2 | 1));
                                    break;
                                case 1:
                                    this.b.f(kleVar, hq5Var2, rvf.R(i2 | 1));
                                    break;
                                default:
                                    this.b.f(kleVar, hq5Var2, rvf.R(i2 | 1));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
            boolean h2 = oq5Var.h(v) | oq5Var.h(context) | oq5Var.h(kleVar);
            Object K = oq5Var.K();
            if (h2 || K == gq5.a) {
                kleVar2 = kleVar;
                n71 n71Var = new n71(v, context, kleVar2, (Continuation) null, 18);
                oq5Var.k0(n71Var);
                K = n71Var;
            } else {
                kleVar2 = kleVar;
            }
            gld.y(context, kleVar2, (Function2) K, oq5Var);
        }
        xmn r3 = oq5Var.r();
        if (r3 != null) {
            final int i6 = 2;
            r3.d = new Function2(this) { // from class: wkg
                public final /* synthetic */ ogp b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = i6;
                    hq5 hq5Var2 = (hq5) obj;
                    ((Integer) obj2).getClass();
                    switch (i52) {
                        case 0:
                            this.b.f(kleVar2, hq5Var2, rvf.R(i2 | 1));
                            break;
                        case 1:
                            this.b.f(kleVar2, hq5Var2, rvf.R(i2 | 1));
                            break;
                        default:
                            this.b.f(kleVar2, hq5Var2, rvf.R(i2 | 1));
                            break;
                    }
                    return Unit.a;
                }
            };
        }
    }

    @Override // defpackage.w2q
    public Object g(faq faqVar) {
        faqVar.getClass();
        if (faqVar instanceof naq) {
            mqs mqsVar = ((naq) faqVar).e;
            return new nwk(mqsVar.a, mqsVar.c);
        }
        if (faqVar instanceof daq) {
            e5d e5dVar = ((daq) faqVar).e;
            return new nwk(e5dVar.a, e5dVar.c);
        }
        if (faqVar instanceof saq) {
            x1u x1uVar = ((saq) faqVar).e;
            return new nwk(x1uVar.a, x1uVar.b);
        }
        if (faqVar instanceof qaq) {
            return new nwk("unknown", "unknown");
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.w2q
    public Object h(jzs jzsVar) {
        jzsVar.getClass();
        mqs mqsVar = jzsVar.a;
        return new nwk(mqsVar.a, mqsVar.c);
    }

    @Override // defpackage.w2q
    public Object i(m1q m1qVar) {
        m1qVar.getClass();
        if (m1qVar instanceof e2q) {
            return new nwk("unknown", "unknown");
        }
        if (m1qVar instanceof j1q) {
            e5d e5dVar = ((j1q) m1qVar).d;
            return new nwk(e5dVar.a, e5dVar.c);
        }
        if (m1qVar instanceof c2q) {
            mqs mqsVar = ((c2q) m1qVar).d;
            return new nwk(mqsVar.a, mqsVar.c);
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.w2q
    public Object j(i5u i5uVar) {
        i5uVar.getClass();
        x1u x1uVar = i5uVar.a;
        return new nwk(x1uVar.a, x1uVar.b);
    }

    @Override // defpackage.w2q
    public Object k(k4d k4dVar) {
        k4dVar.getClass();
        e5d e5dVar = k4dVar.a;
        return new nwk(e5dVar.a, e5dVar.c);
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        iocVar.getClass();
        return 0;
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        szuVar.getClass();
        return Integer.valueOf(szuVar.i());
    }

    @Override // defpackage.c8k
    public Object o(Uri uri, kb7 kb7Var) {
        return Long.valueOf(dvt.b0(new BufferedReader(new InputStreamReader(kb7Var)).readLine()));
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        y4dVar.getClass();
        return 0;
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        int i2;
        maqVar.getClass();
        if (maqVar instanceof jbq) {
            i2 = ((jbq) maqVar).i;
        } else if (maqVar instanceof vaq) {
            i2 = ((vaq) maqVar).d;
        } else {
            if (!(maqVar instanceof eaq) && !(maqVar instanceof raq)) {
                b6e.s();
                return null;
            }
            i2 = 0;
        }
        return Integer.valueOf(i2);
    }

    public l2j s(Context context) {
        l2j l2jVar;
        context.getClass();
        l2j l2jVar2 = l2j.e;
        if (l2jVar2 != null) {
            return l2jVar2;
        }
        synchronized (this) {
            l2jVar = l2j.e;
            if (l2jVar == null) {
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                l2jVar = new l2j(applicationContext, l2j.f);
                l2j.e = l2jVar;
            }
        }
        return l2jVar;
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        t1qVar.getClass();
        return Integer.valueOf(t1qVar.f);
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        u7uVar.getClass();
        return Integer.valueOf(u7uVar.i);
    }

    public boolean w(TextView textView) {
        if (bp6.a.contains(this)) {
            return false;
        }
        try {
            String replace = new Regex("\\s").replace(qeu.j(textView), "");
            int length = replace.length();
            if (length >= 12 && length <= 19) {
                int i2 = 0;
                boolean z = false;
                for (int i3 = length - 1; i3 >= 0; i3--) {
                    char charAt = replace.charAt(i3);
                    if (!Character.isDigit(charAt)) {
                        return false;
                    }
                    int digit = Character.digit((int) charAt, 10);
                    if (digit < 0) {
                        throw new IllegalArgumentException("Char " + charAt + " is not a decimal digit");
                    }
                    if (z && (digit = digit * 2) > 9) {
                        digit = (digit % 10) + 1;
                    }
                    i2 += digit;
                    z = !z;
                }
                if (i2 % 10 == 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            bp6.a(this, th);
            return false;
        }
    }

    @Override // defpackage.gyf
    public void D(Function0 function0) {
    }
}
