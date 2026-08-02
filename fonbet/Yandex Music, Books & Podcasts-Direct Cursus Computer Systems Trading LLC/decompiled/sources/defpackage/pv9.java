package defpackage;

import android.content.ClipDescription;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import ru.yandex.music.common.media.context.d;
import ru.yandex.music.common.media.context.h;
import ru.yandex.video.m3.data.DrmType;

/* loaded from: classes3.dex */
public final class pv9 implements wpd, ver, wa6, arr, x7o, s4n, ika, s0o, yxk, r9i, lgk, tqj, adu {
    public final /* synthetic */ int a;
    public Object b;

    public pv9(int i) {
        this.a = i;
        switch (i) {
            case 13:
                this.b = t0o.b;
                break;
            case 14:
            default:
                this.b = new ArrayList(20);
                break;
            case 15:
                this.b = new ymf(1);
                break;
        }
    }

    public static int E() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i = 0;
        while (i == 0) {
            secureRandom.nextBytes(bArr);
            i = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i;
    }

    public void A(MotionEvent motionEvent) {
        motionEvent.getClass();
        h4b h4bVar = ((s2e) this.b).x;
        if (h4bVar != null) {
            u1e u1eVar = (u1e) h4bVar.a;
            tjf tjfVar = u1eVar.x;
            tjfVar.getClass();
            rjf rjfVar = tjfVar.f;
            rjfVar.getClass();
            l5v l5vVar = (l5v) rjfVar.f;
            if (l5vVar != null) {
                l5vVar.g(motionEvent);
            }
            if (motionEvent.getAction() == 1) {
                rar rarVar = u1eVar.J;
                if (rarVar == null || rarVar.X()) {
                    rar rarVar2 = u1eVar.J;
                    Continuation continuation = null;
                    if (rarVar2 != null) {
                        rarVar2.g(null);
                    }
                    u1eVar.J = x97.y(u1eVar.w, dm6.b, null, new t1e(u1eVar, continuation, 0), 2);
                }
            }
        }
    }

    public View C(e23 e23Var, jc8 jc8Var) {
        tb8 tb8Var = (tb8) ((szm) this.b).get();
        dp8 d = jc8Var.d();
        String H = d instanceof dm9 ? wvo.H((dm9) d) : d.getId();
        pm9 pm9Var = new pm9(c5b.a, 8, t75.c(CommonUrlParts.Values.FALSE_INTEGER.concat(H != null ? StringUtils.PROCESS_POSTFIX_DELIMITER.concat(H) : "")), 0L);
        tb8Var.getClass();
        xzb xzbVar = e23Var.b;
        wh9 wh9Var = tb8Var.c;
        gc8 gc8Var = e23Var.a;
        wh9Var.getClass();
        d0c a = gc8Var.getRuntimeStore$div_release().a();
        rdk rdkVar = a.c;
        if (rdkVar != null) {
            rdkVar.O(gc8Var);
        }
        wh9Var.b(jc8Var, gc8Var, pm9Var, a);
        View W = tb8Var.a.W(jc8Var, xzbVar);
        W.setLayoutParams(new u79(-1, -2));
        tb8Var.b.b(e23Var, W, jc8Var, pm9Var);
        dp8 d2 = jc8Var.d();
        xzb xzbVar2 = e23Var.b;
        DisplayMetrics displayMetrics = W.getContext().getResources().getDisplayMetrics();
        W.setLayoutParams(new ViewGroup.LayoutParams(vq1.j0(d2.c(), displayMetrics, xzbVar2, null), vq1.j0(d2.a(), displayMetrics, xzbVar2, null)));
        W.setFocusable(true);
        return W;
    }

    @Override // defpackage.wpd
    public void D(Object obj) {
        oq oqVar = (oq) obj;
        oqVar.getClass();
        rfa rfaVar = (rfa) this.b;
        rfaVar.getClass();
        efa efaVar = rfaVar.b;
        efaVar.getClass();
        lwg C = g0g.C(oqVar, null);
        y supportFragmentManager = efaVar.a.getSupportFragmentManager();
        szf.R(supportFragmentManager, vz1.f(supportFragmentManager, C), d.l());
    }

    public void I(String str) {
        ArrayList arrayList = (ArrayList) this.b;
        str.getClass();
        int i = 0;
        while (i < arrayList.size()) {
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    @Override // defpackage.wpd
    public void J(Object obj) {
        oq oqVar = (oq) obj;
        oqVar.getClass();
        rfa rfaVar = (rfa) this.b;
        rfaVar.getClass();
        efa efaVar = rfaVar.b;
        efaVar.getClass();
        h l = d.l();
        t tVar = efaVar.a;
        tVar.startActivity(quj.U(tVar, new uq(oqVar, l.b(oqVar).a(), null, qq.a, 92), l));
    }

    @Override // defpackage.ver
    public void U(qlr qlrVar) {
        ((yjj) ((n3m) this.b).d).a(qlrVar);
    }

    @Override // defpackage.ver
    public void V(qlr qlrVar) {
        qlrVar.getClass();
        ((n3m) this.b).V(qlrVar);
    }

    @Override // defpackage.s0o
    public t0o a() {
        return (t0o) this.b;
    }

    @Override // defpackage.wa6
    public void accept(Object obj) {
        ((n3m) this.b).accept((DrmType) obj);
    }

    @Override // defpackage.lgk
    public void b(oxa oxaVar) {
        e3j e3jVar = (e3j) this.b;
        ((mgk) e3jVar.k.invoke()).e(jfk.a, e3jVar.m, oxaVar);
    }

    @Override // defpackage.yxk
    public Object c(foc focVar) {
        focVar.getClass();
        return new fs(15, j1g.b);
    }

    @Override // defpackage.ika
    public void cancel() {
        ((qec) this.b).cancel();
    }

    @Override // defpackage.s4n
    public void d(Object obj) {
        byte[] bArr = (byte[]) obj;
        j2j j2jVar = (j2j) ((g8c) this.b).a;
        if (j2jVar.b) {
            ((rzc) j2jVar.e).i.update(bArr, 0, bArr.length);
        }
        j2jVar.c();
    }

    public void e(String str, String str2) {
        str.getClass();
        str2.getClass();
        qwp.D(str);
        qwp.G(str2, str);
        m(str, str2);
    }

    public void f(String str) {
        int S = StringsKt.S(str, ':', 1, 4);
        if (S != -1) {
            m(str.substring(0, S), str.substring(S + 1));
        } else if (str.charAt(0) == ':') {
            m("", str.substring(1));
        } else {
            m("", str);
        }
    }

    @Override // defpackage.yxk
    public Object g(faq faqVar) {
        t3g t3gVar = (t3g) this.b;
        faqVar.getClass();
        if (faqVar instanceof naq) {
            return t3gVar.w(((naq) faqVar).e);
        }
        if (faqVar instanceof saq) {
            return t3gVar.x(((saq) faqVar).e);
        }
        if (faqVar instanceof daq) {
            return ((f4d) t3gVar.f.getValue()).a(((daq) faqVar).e);
        }
        if (faqVar instanceof qaq) {
            return new fs(15, j1g.b);
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.arr
    public Object get() {
        return (DrmType) ((AtomicReference) ((n3m) this.b).c).get();
    }

    @Override // defpackage.yxk
    public Object h(jzs jzsVar) {
        jzsVar.getClass();
        return ((t3g) this.b).w(jzsVar.a);
    }

    @Override // defpackage.yxk
    public Object i(m1q m1qVar) {
        t3g t3gVar = (t3g) this.b;
        m1qVar.getClass();
        if (m1qVar instanceof c2q) {
            return t3gVar.w(((c2q) m1qVar).d);
        }
        if (m1qVar instanceof e2q) {
            return new fs(15, j1g.b);
        }
        if (m1qVar instanceof j1q) {
            return ((f4d) t3gVar.f.getValue()).a(((j1q) m1qVar).d);
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.yxk
    public Object j(i5u i5uVar) {
        i5uVar.getClass();
        return ((t3g) this.b).x(i5uVar.a);
    }

    @Override // defpackage.yxk
    public Object k(k4d k4dVar) {
        k4dVar.getClass();
        return ((f4d) ((t3g) this.b).f.getValue()).a(k4dVar.a);
    }

    @Override // defpackage.r9i
    public void l(String str) {
        str.getClass();
        v7g.C(new ssb(15, str, this));
    }

    public void m(String str, String str2) {
        str.getClass();
        str2.getClass();
        ArrayList arrayList = (ArrayList) this.b;
        arrayList.add(str);
        arrayList.add(StringsKt.t0(str2).toString());
    }

    public void n(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (str.length() <= 0) {
            xq0.x("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('!' > charAt || charAt >= 127) {
                xq0.o(cvt.i("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                return;
            }
        }
        m(str, str2);
    }

    @Override // defpackage.x7o
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 6:
                mgk mgkVar = (mgk) obj;
                mgkVar.getClass();
                ((oc4) ((ltm) this.b)).c(new u7o(mgkVar));
                break;
            default:
                ((oec) this.b).invoke(obj);
                break;
        }
    }

    @Override // defpackage.r9i
    public void p(t9i t9iVar) {
        t9iVar.getClass();
        v7g.C(new ssb(16, t9iVar, this));
    }

    public void q() {
        ((ymf) this.b).acquireShared(1);
    }

    public zvd r() {
        return new zvd((String[]) ((ArrayList) this.b).toArray(new String[0]));
    }

    @Override // defpackage.ika
    public void remove() {
        ((qec) this.b).remove();
    }

    public String s(String str) {
        str.getClass();
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size() - 2;
        int s = hag.s(size, 0, -2);
        if (s > size) {
            return null;
        }
        while (!str.equalsIgnoreCase((String) arrayList.get(size))) {
            if (size == s) {
                return null;
            }
            size -= 2;
        }
        return (String) arrayList.get(size + 1);
    }

    @Override // defpackage.ika
    public void t(hka hkaVar) {
        try {
            ((qec) this.b).t(hkaVar);
        } catch (IllegalStateException e) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            stackTrace.getClass();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (Intrinsics.d(stackTraceElement.getClassName(), vq1.class.getCanonicalName())) {
                    Assertions.throwOrSkip$default(new FailedAssertionException("IllegalStateException in downloader", e), null, 2, null);
                    throw new IOException(e);
                }
            }
            throw e;
        }
    }

    public String toString() {
        switch (this.a) {
            case 15:
                return super.toString() + "[Count = " + ((ymf) this.b).a() + "]";
            default:
                return super.toString();
        }
    }

    public synchronized cib u() {
        ncf ncfVar;
        ncfVar = (ncf) ((kcf) this.b).b();
        if (ncfVar.p() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new cib(9, ncfVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (r1 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List v(int i) {
        IntRange intRange;
        qdc qdcVar = (qdc) ((cr) this.b).c;
        x0 x0Var = (x0) qdcVar.c;
        if (x0Var != null) {
            y7g.Y(false, (qdc) x0Var.c);
            int i2 = x0Var.b;
            intRange = yhn.m(i2, ((ArrayList) x0Var.d).size() + i2);
        }
        IntRange.e.getClass();
        intRange = IntRange.f;
        int i3 = intRange.a;
        if (i > intRange.b || i3 > i) {
            return c5b.a;
        }
        x0 x0Var2 = (x0) qdcVar.c;
        if (x0Var2 == null) {
            xq0.q("Should call updateItems first!");
            return null;
        }
        y7g.Y(false, (qdc) x0Var2.c);
        Object obj = ((ArrayList) x0Var2.d).get(i - x0Var2.b);
        obj.getClass();
        return t75.c((imh) obj);
    }

    @Override // defpackage.x7o
    public void x(Object obj) {
        bfk bfkVar = (bfk) obj;
        bfkVar.getClass();
        ((oc4) ((ltm) this.b)).c(new s7o(bfkVar));
    }

    public synchronized boolean y(int i) {
        Iterator it = Collections.unmodifiableList(((ncf) ((kcf) this.b).b).q()).iterator();
        while (it.hasNext()) {
            if (((mcf) it.next()).r() == i) {
                return true;
            }
        }
        return false;
    }

    public synchronized mcf z(hbf hbfVar) {
        oaf e;
        int E;
        try {
            e = msn.e(hbfVar);
            synchronized (this) {
                E = E();
                while (y(E)) {
                    E = E();
                }
            }
            return (mcf) r2.b();
        } catch (Throwable th) {
            throw th;
        }
        oyj q = hbfVar.q();
        if (q == oyj.UNKNOWN_PREFIX) {
            q = oyj.TINK;
        }
        lcf v = mcf.v();
        v.d();
        mcf.m((mcf) v.b, e);
        v.d();
        mcf.p((mcf) v.b, E);
        v.d();
        mcf.o((mcf) v.b);
        v.d();
        mcf.n((mcf) v.b, q);
        return (mcf) v.b();
    }

    public /* synthetic */ pv9(int i, boolean z) {
        this.a = i;
    }

    public pv9(Context context) {
        this.a = 25;
        context.getClass();
        this.b = agv.a(context.getApplicationContext(), new h88(context.getApplicationContext()), new y9w(28));
    }

    public pv9(Handler handler) {
        this.a = 2;
        this.b = new n3m(handler);
    }

    public pv9(ddk ddkVar) {
        this.a = 28;
        this.b = dfi.n("platform", ddkVar.a);
    }

    public pv9(crh crhVar) {
        this.a = 20;
        crhVar.getClass();
        this.b = crhVar;
    }

    public pv9(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = 12;
        if (Build.VERSION.SDK_INT >= 25) {
            this.b = new cne(uri, clipDescription, uri2);
        } else {
            this.b = new vx6(29, uri, clipDescription, uri2);
        }
    }

    public /* synthetic */ pv9(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
