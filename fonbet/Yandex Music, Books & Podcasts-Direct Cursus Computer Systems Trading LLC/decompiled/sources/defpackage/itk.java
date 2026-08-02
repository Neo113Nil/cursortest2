package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import com.yandex.messenger.websdk.api.SupportInfoProvider;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.landing.skeleton.SkeletonScreenActivity;

/* loaded from: classes5.dex */
public final class itk implements fxh, w2q, pf1, SupportInfoProvider, lci, i2a {
    public static ArrayList b(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((izm) obj) != izm.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((izm) it.next()).a);
        }
        return arrayList2;
    }

    public static byte[] d(List list) {
        list.getClass();
        hi3 hi3Var = new hi3();
        Iterator it = b(list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            hi3Var.M0(str.length());
            hi3Var.S0(str);
        }
        return hi3Var.X(hi3Var.b);
    }

    public static String e(mwk mwkVar) {
        mwkVar.getClass();
        if (mwkVar.equals(h1b.e)) {
            return null;
        }
        xqn xqnVar = new xqn();
        dag.p(mwkVar, new f4m(26, xqnVar));
        return (String) xqnVar.a;
    }

    public static Intent f(Context context, String str, String str2, String str3, c0p c0pVar) {
        context.getClass();
        Intent putExtra = new Intent(context, (Class<?>) SkeletonScreenActivity.class).putExtra("extra.skeleton.id", str).putExtra("extra.skeleton.tab.id", str2).putExtra("extra.skeleton.block.id", str3).putExtra("extra.search.context", c0pVar);
        putExtra.getClass();
        return putExtra;
    }

    public static /* synthetic */ Intent l(Context context, String str, int i, String str2, String str3) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        return f(context, str, str2, str3, null);
    }

    public static boolean n() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    @Override // defpackage.fxh
    public boolean B(hxh hxhVar, MenuItem menuItem) {
        return false;
    }

    @Override // defpackage.w2q
    public Object c(foc focVar) {
        focVar.getClass();
        throw null;
    }

    @Override // defpackage.w2q
    public Object g(faq faqVar) {
        faqVar.getClass();
        return rzf.c(faqVar.e().d, faqVar.e().f);
    }

    @Override // defpackage.w2q
    public Object h(jzs jzsVar) {
        jzsVar.getClass();
        mqs mqsVar = jzsVar.a;
        String str = mqsVar.c;
        CoverPath coverPath = mqsVar.w;
        return rzf.c(str, coverPath != null ? coverPath.getUri() : null);
    }

    @Override // defpackage.w2q
    public Object i(m1q m1qVar) {
        m1qVar.getClass();
        return rzf.c(m1qVar.d().d, m1qVar.d().f);
    }

    @Override // defpackage.w2q
    public Object j(i5u i5uVar) {
        i5uVar.getClass();
        x1u x1uVar = i5uVar.a;
        return rzf.c(x1uVar.b, x1uVar.o.a.getUri());
    }

    @Override // defpackage.w2q
    public Object k(k4d k4dVar) {
        k4dVar.getClass();
        e5d e5dVar = k4dVar.a;
        return rzf.c(e5dVar.c, e5dVar.e);
    }

    @Override // defpackage.pf1
    public int m(boolean z) {
        return z ? R.string.accessibility_uncheck_action : R.string.accessibility_check_action;
    }

    @Override // com.yandex.messenger.websdk.api.SupportInfoProvider
    public Map q() {
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        return e5bVar;
    }

    @Override // defpackage.lci
    public kci y(kkp kkpVar) {
        return new iqt(kkpVar.n(old.class, InputStream.class));
    }

    @Override // defpackage.fxh
    public void a(hxh hxhVar) {
    }

    @Override // com.yandex.messenger.websdk.api.SupportInfoProvider
    public void z(k0r k0rVar) {
    }
}
