package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class kjn implements p7q, nn5, u6c, w2q, z1r, dup, aqr, j23, n03 {
    public static final kjn b = new kjn(1);
    public static final kjn c = new kjn(3);
    public static final kjn d = new kjn(4);
    public static final kjn e = new kjn(5);
    public static final kjn f = new kjn(6);
    public static final kjn g = new kjn(7);
    public static final kjn h = new kjn(8);
    public static final kjn i = new kjn(9);
    public static final kjn j = new kjn(10);
    public static final kjn k = new kjn(11);
    public static final /* synthetic */ kjn l = new kjn(12);
    public static kjn m;
    public static kjn n;
    public final /* synthetic */ int a;

    public /* synthetic */ kjn(int i2) {
        this.a = i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r3.equals("r5") != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        r5 = new kotlin.text.Regex("[^a-z]+").replace(r5, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        if (r3.equals("r4") != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(String str, HashMap hashMap, String str2) {
        HashMap hashMap2 = i3i.e;
        switch (str.hashCode()) {
            case 3585:
                if (str.equals("r3")) {
                    str2 = (c.v(str2, "m", false) || c.v(str2, "b", false) || c.v(str2, "ge", false)) ? "m" : "f";
                }
                hashMap.put(str, str2);
                break;
            case 3586:
                break;
            case 3587:
                break;
            case 3588:
                if (str.equals("r6") && StringsKt.M(str2, "-", false)) {
                    Object[] array = new Regex("-").g(0, str2).toArray(new String[0]);
                    if (array == null) {
                        jj4.j("null cannot be cast to non-null type kotlin.Array<T>");
                        break;
                    } else {
                        str2 = ((String[]) array)[0];
                    }
                }
                hashMap.put(str, str2);
                break;
            default:
                hashMap.put(str, str2);
                break;
        }
    }

    public static int d(Uri uri) {
        String queryParameter = uri.getQueryParameter("step");
        if (queryParameter == null) {
            return 1;
        }
        try {
            return Integer.parseInt(queryParameter);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    public static void f(Activity activity) {
        View E;
        int hashCode = activity.hashCode();
        HashMap hashMap = null;
        if (!bp6.a.contains(i3i.class)) {
            try {
                hashMap = i3i.e;
            } catch (Throwable th) {
                bp6.a(i3i.class, th);
            }
        }
        Integer valueOf = Integer.valueOf(hashCode);
        Object obj = hashMap.get(valueOf);
        if (obj == null) {
            obj = new i3i(activity);
            hashMap.put(valueOf, obj);
        }
        i3i i3iVar = (i3i) obj;
        Set set = bp6.a;
        if (set.contains(i3i.class)) {
            return;
        }
        try {
            if (set.contains(i3iVar)) {
                return;
            }
            try {
                if (i3iVar.d.getAndSet(true) || (E = ot0.E((Activity) i3iVar.c.get())) == null) {
                    return;
                }
                ViewTreeObserver viewTreeObserver = E.getViewTreeObserver();
                viewTreeObserver.getClass();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnGlobalFocusChangeListener(i3iVar);
                }
            } catch (Throwable th2) {
                bp6.a(i3iVar, th2);
            }
        } catch (Throwable th3) {
            bp6.a(i3i.class, th3);
        }
    }

    @Override // defpackage.n03
    public jxt B(jxt jxtVar, jxt jxtVar2) {
        jxtVar.getClass();
        jxtVar2.getClass();
        return new vc3(!gld.G(jxtVar, jxtVar2, fl5.b).c());
    }

    @Override // defpackage.nn5
    public Object C(rdk rdkVar) {
        Object k2 = rdkVar.k(new m5n(ozf.class, Executor.class));
        k2.getClass();
        return u2x.E((Executor) k2);
    }

    @Override // defpackage.dup
    public ocg I(long j2, xof xofVar, jx7 jx7Var) {
        float L = jx7Var.L(jp4.a);
        return new ayj(new ynn(-L, 0.0f, Float.intBitsToFloat((int) (j2 >> 32)) + L, Float.intBitsToFloat((int) (j2 & 4294967295L))));
    }

    @Override // defpackage.u6c
    public void L(boolean z) {
        if (z) {
            AtomicBoolean atomicBoolean = u.a;
            synchronized (u.class) {
                Set set = bp6.a;
                if (set.contains(u.class)) {
                    return;
                }
                try {
                } catch (Throwable th) {
                    bp6.a(u.class, th);
                }
                if (u.a.getAndSet(true)) {
                    return;
                }
                HashSet hashSet = j3c.a;
                if (gtt.c()) {
                    u.a();
                }
                int i2 = r.a;
                if (!set.contains(r.class)) {
                    try {
                        r.b.scheduleAtFixedRate(r.d, 0L, 500, TimeUnit.MILLISECONDS);
                    } catch (Throwable th2) {
                        bp6.a(r.class, th2);
                    }
                }
            }
        }
    }

    @Override // defpackage.z1r
    public int a(int i2, int i3, int i4, int i5) {
        return (((i2 - i4) - i5) / 2) - (i3 / 2);
    }

    @Override // defpackage.w2q
    public Object c(foc focVar) {
        focVar.getClass();
        throw null;
    }

    public CharSequence e(Preference preference) {
        switch (this.a) {
            case 21:
                EditTextPreference editTextPreference = (EditTextPreference) preference;
                if (TextUtils.isEmpty(null)) {
                    return editTextPreference.a.getString(R.string.not_set);
                }
                return null;
            default:
                ListPreference listPreference = (ListPreference) preference;
                if (TextUtils.isEmpty(null)) {
                    return listPreference.a.getString(R.string.not_set);
                }
                return null;
        }
    }

    @Override // defpackage.w2q
    public Object g(faq faqVar) {
        faqVar.getClass();
        if (faqVar instanceof naq) {
            return ((naq) faqVar).e.a;
        }
        if (faqVar instanceof saq) {
            return ((saq) faqVar).e.a;
        }
        if (faqVar instanceof daq) {
            return String.valueOf(((daq) faqVar).e.b);
        }
        if (faqVar instanceof qaq) {
            return ((qaq) faqVar).c.a;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.w2q
    public Object h(jzs jzsVar) {
        jzsVar.getClass();
        return jzsVar.a.a;
    }

    @Override // defpackage.w2q
    public Object i(m1q m1qVar) {
        m1qVar.getClass();
        return m1qVar.d().a;
    }

    @Override // defpackage.w2q
    public Object j(i5u i5uVar) {
        i5uVar.getClass();
        return i5uVar.a.a;
    }

    @Override // defpackage.w2q
    public Object k(k4d k4dVar) {
        k4dVar.getClass();
        return String.valueOf(k4dVar.a.b);
    }

    @Override // defpackage.aqr
    public Task l(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i2 = rho.h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? ywf.w(bundle) : ywf.w(null);
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        switch (this.a) {
            case 1:
                iocVar.getClass();
                return Boolean.FALSE;
            case 5:
                iocVar.getClass();
                return Boolean.TRUE;
            case 7:
                iocVar.getClass();
                return Boolean.FALSE;
            case 16:
                iocVar.getClass();
                return Boolean.FALSE;
            default:
                iocVar.getClass();
                return null;
        }
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        jzs jzsVar;
        izs izsVar;
        switch (this.a) {
            case 1:
                szuVar.getClass();
                break;
            case 5:
                szuVar.getClass();
                break;
            case 7:
                szuVar.getClass();
                break;
            case 16:
                szuVar.getClass();
                break;
            default:
                szuVar.getClass();
                if (!gut.R(szuVar.a)) {
                    jzs jzsVar2 = szuVar.l;
                    if (!swf.R(jzsVar2.g) || !szuVar.m.b.c || ((jzsVar = (jzs) CollectionsKt.firstOrNull(szuVar.o())) != null && (izsVar = jzsVar.g) != null && !swf.R(izsVar))) {
                    }
                }
                break;
        }
        return Boolean.TRUE;
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        switch (this.a) {
            case 1:
                y4dVar.getClass();
                return Boolean.TRUE;
            case 5:
                y4dVar.getClass();
                return Boolean.TRUE;
            case 7:
                y4dVar.getClass();
                return Boolean.FALSE;
            case 16:
                y4dVar.getClass();
                return Boolean.FALSE;
            default:
                y4dVar.getClass();
                return null;
        }
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        boolean z;
        switch (this.a) {
            case 1:
                maqVar.getClass();
                break;
            case 5:
                maqVar.getClass();
                break;
            case 7:
                maqVar.getClass();
                if (!(maqVar instanceof jbq)) {
                    if (!(maqVar instanceof vaq) && !(maqVar instanceof eaq) && !(maqVar instanceof raq)) {
                        b6e.s();
                        break;
                    } else {
                        z = false;
                    }
                } else {
                    z = true;
                }
                break;
            case 16:
                maqVar.getClass();
                f5q k2 = maqVar.k();
                boolean z2 = true;
                if (!(k2 instanceof o9q) && !(k2 instanceof p9q) && !(k2 instanceof q9q) && !(k2 instanceof r9q) && !(k2 instanceof bbq)) {
                    z2 = false;
                    if (!(k2 instanceof taq) && !(k2 instanceof baq) && !(k2 instanceof oaq)) {
                        b6e.s();
                        break;
                    }
                }
                break;
            default:
                maqVar.getClass();
                break;
        }
        return null;
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        switch (this.a) {
            case 1:
                t1qVar.getClass();
                return Boolean.TRUE;
            case 5:
                t1qVar.getClass();
                return Boolean.FALSE;
            case 7:
                t1qVar.getClass();
                return Boolean.FALSE;
            case 16:
                t1qVar.getClass();
                return Boolean.FALSE;
            default:
                t1qVar.getClass();
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 8:
                return "Center";
            case 17:
                return "Empty";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        switch (this.a) {
            case 1:
                u7uVar.getClass();
                return Boolean.TRUE;
            case 5:
                u7uVar.getClass();
                return Boolean.TRUE;
            case 7:
                u7uVar.getClass();
                return Boolean.FALSE;
            case 16:
                u7uVar.getClass();
                return Boolean.FALSE;
            default:
                u7uVar.getClass();
                return null;
        }
    }
}
