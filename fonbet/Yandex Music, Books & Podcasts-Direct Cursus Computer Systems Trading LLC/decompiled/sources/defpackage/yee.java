package defpackage;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.HashSet;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* loaded from: classes3.dex */
public final class yee implements p7q, rzb {
    public final String a;

    public yee(String str, int i) {
        switch (i) {
            case 2:
                this.a = str;
                break;
            case 3:
                this.a = dfi.f("UID: [", Process.myUid(), Process.myPid(), "]  PID: [", "] ").concat(str);
                break;
            default:
                str.getClass();
                this.a = str;
                break;
        }
    }

    public static void a(yee yeeVar, String str, String str2, String str3, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        LinkedHashMap g = uah.g(new Pair("place", yeeVar.a), new Pair("step", str));
        if (str2 != null) {
            g.put("errorMessage", str2);
        }
        if (str3 != null) {
            g.put("state", str3);
        }
        it0.b.e().c(new y70("in_app_restore", g), "Restore");
    }

    public static String f(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = k5r.m(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return ouj.o(str, " : ", str2);
    }

    public void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", f(this.a, str, objArr));
        }
    }

    public void c(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", f(this.a, str, objArr), remoteException);
        }
    }

    @Override // defpackage.rzb
    public jxt d(Map map) {
        return new elr(this.a);
    }

    public void e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", f(this.a, str, objArr));
        }
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        iocVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        szuVar.getClass();
        HashSet hashSet = szuVar.o;
        boolean z = true;
        if (hashSet == null || !hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!up6.A((a0q) it.next(), this.a)) {
                    z = false;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        y4dVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        maqVar.getClass();
        boolean z = false;
        if (maqVar instanceof jbq) {
            Set o = ((jbq) maqVar).o();
            if (!(o instanceof Collection) || !o.isEmpty()) {
                Iterator it = o.iterator();
                while (it.hasNext()) {
                    if (!up6.A((a0q) it.next(), this.a)) {
                        break;
                    }
                }
            }
            z = true;
        } else if (!(maqVar instanceof vaq) && !(maqVar instanceof eaq) && !(maqVar instanceof raq)) {
            b6e.s();
            return null;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        t1qVar.getClass();
        return Boolean.valueOf(up6.A(t1qVar.a.getId(), this.a));
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        u7uVar.getClass();
        return Boolean.FALSE;
    }

    public yee(String str, it0 it0Var) {
        this.a = str;
    }
}
