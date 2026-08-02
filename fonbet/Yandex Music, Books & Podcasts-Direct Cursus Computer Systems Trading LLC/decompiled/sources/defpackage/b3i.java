package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.google.android.gms.tasks.Task;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes.dex */
public final class b3i implements u6c, ju6, w2q, vp3, p7q, rek, b0t, ag6, fn3, nq4, q26, r8e, b0q {
    public static final b3i b = new b3i(0);
    public static final b3i c = new b3i(1);
    public static final b3i d = new b3i(2);
    public static final b3i e = new b3i(3);
    public static final b3i f = new b3i(4);
    public static final b3i g = new b3i(5);
    public static final b3i h = new b3i(6);
    public static final b3i i = new b3i(7);
    public static final b3i j = new b3i(8);
    public static final b3i k = new b3i(9);
    public static final /* synthetic */ b3i l = new b3i(10);
    public static final b3i m = new b3i(11);
    public static final b3i n = new b3i(12);
    public final /* synthetic */ int a;

    public b3i(it0 it0Var) {
        this.a = 22;
    }

    public static v0j C(Integer num) {
        Object obj;
        rdb rdbVar = v0j.g;
        rdbVar.getClass();
        c7 c7Var = new c7(0, rdbVar);
        while (true) {
            if (!c7Var.hasNext()) {
                obj = null;
                break;
            }
            obj = c7Var.next();
            if (((v0j) obj).a == num.intValue()) {
                break;
            }
        }
        v0j v0jVar = (v0j) obj;
        return v0jVar == v0j.d ? v0j.c : v0jVar;
    }

    public static final ArrayList H(View view) {
        if (bp6.a.contains(b3i.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            ViewGroup i2 = qeu.i(view);
            if (i2 != null) {
                Iterator it = qeu.b(i2).iterator();
                while (it.hasNext()) {
                    View view2 = (View) it.next();
                    if (view != view2) {
                        arrayList.addAll(b.O(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            bp6.a(b3i.class, th);
            return null;
        }
    }

    public static final ArrayList J(View view) {
        if (bp6.a.contains(b3i.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(qeu.h(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            try {
                if (view.getId() != -1) {
                    String resourceName = view.getResources().getResourceName(view.getId());
                    resourceName.getClass();
                    Object[] array = new Regex("/").g(0, resourceName).toArray(new String[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    String[] strArr = (String[]) array;
                    if (strArr.length == 2) {
                        arrayList.add(strArr[1]);
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str.length() > 0 && str.length() <= 100) {
                    String lowerCase = str.toLowerCase();
                    lowerCase.getClass();
                    arrayList2.add(lowerCase);
                }
            }
            return arrayList2;
        } catch (Throwable th) {
            bp6.a(b3i.class, th);
            return null;
        }
    }

    public static uk2 K(double d2) {
        uk2 uk2Var = uk2.e;
        uk2 uk2Var2 = uk2.e;
        if (uk2Var2 != null) {
            return uk2Var2;
        }
        qzc qzcVar = uk2.f;
        if (qzc.c) {
            uk2 uk2Var3 = uk2.e;
            if (uk2Var3 != null) {
                return uk2Var3;
            }
            uk2 uk2Var4 = new uk2(d2);
            uk2.e = uk2Var4;
            return uk2Var4;
        }
        synchronized (((cuk) qzcVar.b)) {
            uk2 uk2Var5 = uk2.e;
            if (uk2Var5 != null) {
                return uk2Var5;
            }
            uk2 uk2Var6 = new uk2(d2);
            uk2.e = uk2Var6;
            return uk2Var6;
        }
    }

    public static void Q(tsg tsgVar, String str, String str2) {
        tsgVar.getClass();
        str.getClass();
        synchronized (j3c.a) {
        }
    }

    public static x6a S(ujg ujgVar) {
        p6a p6aVar;
        ujgVar.getClass();
        fjg q = ujgVar.q();
        if (q == null) {
            p6aVar = null;
        } else {
            if (!(q instanceof ejg)) {
                b6e.s();
                return null;
            }
            p6aVar = new p6a(((ejg) q).a);
        }
        if (ujgVar instanceof kjg) {
            kjg kjgVar = (kjg) ujgVar;
            return new q6a(kjgVar.a, kjgVar.b, p6aVar, kjgVar.d);
        }
        if (ujgVar instanceof njg) {
            njg njgVar = (njg) ujgVar;
            return new s6a(njgVar.a, njgVar.b, p6aVar, njgVar.d);
        }
        if (ujgVar instanceof qjg) {
            qjg qjgVar = (qjg) ujgVar;
            return new t6a(qjgVar.a, qjgVar.b, p6aVar, qjgVar.d);
        }
        if (ujgVar instanceof tjg) {
            tjg tjgVar = (tjg) ujgVar;
            return new u6a(tjgVar.a, tjgVar.b, p6aVar, tjgVar.d);
        }
        b6e.s();
        return null;
    }

    public static final boolean T(ArrayList arrayList, ArrayList arrayList2) {
        if (!bp6.a.contains(b3i.class)) {
            try {
                arrayList.getClass();
                arrayList2.getClass();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    b3i b3iVar = b;
                    if (!bp6.a.contains(b3iVar)) {
                        try {
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                if (StringsKt.M(str, (String) it2.next(), false)) {
                                    return true;
                                }
                            }
                        } catch (Throwable th) {
                            bp6.a(b3iVar, th);
                        }
                    }
                }
            } catch (Throwable th2) {
                bp6.a(b3i.class, th2);
                return false;
            }
        }
        return false;
    }

    public static l47 U(rfk rfkVar, String str, boolean z) {
        l47 l47Var = new l47();
        l47Var.setArguments(cxb.K(new Pair("ARG_PREFERRED_METHOD", rfkVar), new Pair("ARG_META_JSON", str), new Pair("ARG_DK_SELECT_VIEW_MODEL_REFACTORING_ENABLED", Boolean.valueOf(z))));
        return l47Var;
    }

    public static String W(long j2, twh twhVar) {
        String str;
        String str2;
        if (j2 >= 0) {
            str = j2 + "-byte";
        } else {
            str = "unknown length";
        }
        if (twhVar != null) {
            str2 = "'" + twhVar + "'";
        } else {
            str2 = "unknown content-type";
        }
        return hrg.s("(", str, StringUtil.SPACE, str2, " body)");
    }

    public static final void o(cib cibVar, zvd zvdVar) {
        Charset charset = xoj.c;
        cibVar.C("-- HEADERS --");
        if (zvdVar.size() == 0) {
            cibVar.C("(no headers)");
            return;
        }
        int size = zvdVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            cibVar.C(zvdVar.g(i2) + ": " + zvdVar.q(i2));
        }
    }

    @Override // defpackage.ju6
    public pjc A() {
        l18 l18Var = l18.b;
        bdt I = hag.I(kmd.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        return new d64(((kmd) qdcVar.C(I)).e, 21);
    }

    @Override // defpackage.b0q
    public Object B(aaq aaqVar) {
        aaqVar.getClass();
        return aaqVar.getId();
    }

    @Override // defpackage.b0q
    public Object D(yc5 yc5Var) {
        yc5Var.getClass();
        return yc5Var.a;
    }

    @Override // defpackage.r8e
    public void E(String str, String str2, Throwable th) {
        str2.getClass();
        th.getClass();
        ssg.a(6, "gSDK", str + ": " + str2, th);
    }

    @Override // defpackage.b0q
    public Object F(doc docVar) {
        docVar.getClass();
        throw null;
    }

    @Override // defpackage.b0q
    public Object G(xc5 xc5Var) {
        xc5Var.getClass();
        return xc5Var.a;
    }

    @Override // defpackage.nq4
    public OutputStream I(ozh ozhVar) {
        return new GZIPOutputStream(ozhVar);
    }

    @Override // defpackage.u6c
    public void L(boolean z) {
        if (z) {
            boolean z2 = aib.a;
            if (bp6.a.contains(aib.class)) {
                return;
            }
            try {
                aib.a = true;
                aib.d.a();
            } catch (Throwable th) {
                bp6.a(aib.class, th);
            }
        }
    }

    @Override // defpackage.b0q
    public Object M(g1q g1qVar) {
        g1qVar.getClass();
        return g1qVar.getId();
    }

    @Override // defpackage.b0q
    public Object N(cd5 cd5Var) {
        cd5Var.getClass();
        return null;
    }

    public ArrayList O(View view) {
        if (bp6.a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (view instanceof TextView) {
                String obj = ((TextView) view).getText().toString();
                if (obj.length() > 0 && obj.length() < 100) {
                    String lowerCase = obj.toLowerCase();
                    lowerCase.getClass();
                    arrayList.add(lowerCase);
                    return arrayList;
                }
            } else {
                Iterator it = qeu.b(view).iterator();
                while (it.hasNext()) {
                    arrayList.addAll(O((View) it.next()));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            bp6.a(this, th);
            return null;
        }
    }

    public void P(String str, String str2) {
        str2.getClass();
        ot0.L(it0.b.e(), str, str2);
    }

    @Override // defpackage.b0q
    public Object R(w3d w3dVar) {
        w3dVar.getClass();
        return w3dVar.a.a();
    }

    public synchronized void V(String str) {
        str.getClass();
        synchronized (j3c.a) {
        }
        synchronized (this) {
            str.getClass();
            lsg.d.put(str, "ACCESS_TOKEN_REMOVED");
        }
    }

    @Override // defpackage.r8e
    public void a(String str, String str2) {
        str2.getClass();
        ssg.a(6, "gSDK", str + ": " + str2, null);
    }

    @Override // defpackage.fn3
    public byte[] b(byte[] bArr, int i2, int i3) {
        return Arrays.copyOfRange(bArr, i2, i3 + i2);
    }

    @Override // defpackage.w2q
    public Object c(foc focVar) {
        focVar.getClass();
        return null;
    }

    @Override // defpackage.b0q
    public Object d(w6u w6uVar) {
        w6uVar.getClass();
        return w6uVar.a;
    }

    @Override // defpackage.r8e
    public void e(String str, String str2) {
        str2.getClass();
        ssg.a(3, "gSDK", str + ": " + str2, null);
    }

    @Override // defpackage.vp3
    public String f(nb7 nb7Var) {
        nb7Var.getClass();
        String str = nb7Var.h;
        Uri uri = nb7Var.a;
        if (str != null) {
            return str;
        }
        String uri2 = uri.toString();
        uri2.getClass();
        u7e u7eVar = null;
        try {
            s7e s7eVar = new s7e();
            s7eVar.h(null, uri2);
            u7eVar = s7eVar.e();
        } catch (IllegalArgumentException unused) {
        }
        if (u7eVar == null) {
            throw new NullPointerException("cannot parse url: " + uri + " (" + str + ")");
        }
        s7e f2 = u7eVar.f();
        boolean n2 = c.n(u7eVar.d, ".strm.yandex.net", false);
        String str2 = (String) CollectionsKt.Z(u7eVar.f);
        boolean M = str2 != null ? StringsKt.M(str2, ".m3u8", false) : false;
        if (n2) {
            f2.g("strm.yandex.ru");
        }
        if (n2 || M) {
            etn.g0(f2, u7eVar);
        }
        return f2.toString();
    }

    @Override // defpackage.w2q
    public Object g(faq faqVar) {
        faqVar.getClass();
        mqs a = faqVar.a();
        if (a != null) {
            return a.i();
        }
        return null;
    }

    @Override // defpackage.w2q
    public Object h(jzs jzsVar) {
        jzsVar.getClass();
        return jzsVar.a.i();
    }

    @Override // defpackage.w2q
    public Object i(m1q m1qVar) {
        m1qVar.getClass();
        mqs a = m1qVar.a();
        if (a != null) {
            return a.i();
        }
        return null;
    }

    @Override // defpackage.w2q
    public Object j(i5u i5uVar) {
        i5uVar.getClass();
        return i5uVar.a.n;
    }

    @Override // defpackage.w2q
    public Object k(k4d k4dVar) {
        k4dVar.getClass();
        return null;
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        switch (this.a) {
            case 5:
                iocVar.getClass();
                return Boolean.TRUE;
            case 8:
                iocVar.getClass();
                return "fm";
            default:
                iocVar.getClass();
                return null;
        }
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        switch (this.a) {
            case 5:
                szuVar.getClass();
                return Boolean.TRUE;
            case 8:
                szuVar.getClass();
                return "wave";
            default:
                szuVar.getClass();
                return new ggr(szuVar.l);
        }
    }

    @Override // defpackage.ag6
    public Object p(Task task) {
        if (task.l()) {
            return (Bundle) task.h();
        }
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.g())));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.g());
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        switch (this.a) {
            case 5:
                y4dVar.getClass();
                return Boolean.TRUE;
            case 8:
                y4dVar.getClass();
                return "generative";
            default:
                y4dVar.getClass();
                return null;
        }
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        switch (this.a) {
            case 5:
                maqVar.getClass();
                faq b2 = maqVar.b();
                boolean z = true;
                if (!(b2 instanceof naq) && !(b2 instanceof daq) && !(b2 instanceof saq)) {
                    if (!(b2 instanceof qaq)) {
                        b6e.s();
                        break;
                    } else {
                        z = false;
                    }
                }
                break;
            case 8:
                maqVar.getClass();
                if (!(maqVar instanceof jbq)) {
                    if (!(maqVar instanceof vaq)) {
                        if (!(maqVar instanceof eaq)) {
                            if (!(maqVar instanceof raq)) {
                                b6e.s();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                maqVar.getClass();
                break;
        }
        return null;
    }

    @Override // defpackage.nq4
    public InputStream r(yjn yjnVar) {
        return new GZIPInputStream(yjnVar);
    }

    @Override // defpackage.b0q
    public Object s(d0t d0tVar) {
        d0tVar.getClass();
        return StationId.e(d0tVar.a).h();
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        boolean z;
        switch (this.a) {
            case 5:
                t1qVar.getClass();
                m1q m1qVar = t1qVar.c;
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
            case 8:
                t1qVar.getClass();
                return "glagol";
            default:
                t1qVar.getClass();
                return null;
        }
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        switch (this.a) {
            case 5:
                u7uVar.getClass();
                return Boolean.TRUE;
            case 8:
                u7uVar.getClass();
                return "video_radio";
            default:
                u7uVar.getClass();
                return null;
        }
    }

    @Override // defpackage.b0q
    public Object w(bd5 bd5Var) {
        bd5Var.getClass();
        return bd5Var.getId();
    }

    @Override // defpackage.b0q
    public Object x(aou aouVar) {
        aouVar.getClass();
        if (aouVar instanceof tnu) {
            return CollectionsKt.X(o8g.R(((tnu) aouVar).a), StringUtils.COMMA, null, null, null, 62);
        }
        if (aouVar instanceof unu) {
            return CollectionsKt.X(o8g.R(((unu) aouVar).a), StringUtils.COMMA, null, null, null, 62);
        }
        if (aouVar instanceof znu) {
            return null;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.nq4
    public String z() {
        return "gzip";
    }

    public /* synthetic */ b3i(int i2) {
        this.a = i2;
    }

    @Override // defpackage.q26
    public void l(boolean z) {
    }

    @Override // defpackage.q26
    public void v(v13 v13Var) {
    }

    @Override // defpackage.q26
    public void y(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
    }
}
