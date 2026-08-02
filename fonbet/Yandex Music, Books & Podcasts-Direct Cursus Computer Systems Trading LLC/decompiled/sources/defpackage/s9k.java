package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.yandex.passport.api.exception.t;
import com.yandex.passport.api.m;
import com.yandex.passport.common.logger.d;
import com.yandex.passport.internal.entities.e;
import com.yandex.passport.internal.entities.j;
import com.yandex.passport.internal.entities.k;
import com.yandex.passport.internal.entities.v;
import com.yandex.passport.internal.impl.r0;
import com.yandex.passport.internal.methods.h3;
import com.yandex.passport.internal.methods.requester.b;
import com.yandex.passport.internal.methods.requester.f;
import com.yandex.passport.internal.ui.a;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public abstract class s9k {
    public static final jyr a = btf.b(xuj.w);

    public static void a(Context context, e9k e9kVar, String str) {
        context.getClass();
        str.getClass();
        r0 a2 = m.a(context);
        a2.q();
        try {
            if (StringsKt.U(str)) {
                a2.b(0L, "dropToken");
            }
            f fVar = a2.d;
            h3 h3Var = new h3(new e(str, ""));
            int i = 0;
            f9f[] f9fVarArr = new f9f[0];
            if (!"robolectric".equals(Build.FINGERPRINT)) {
                Looper.getMainLooper();
                Looper.myLooper();
            }
            Object A = a.A(new b(fVar, h3Var, null, i));
            f9f[] f9fVarArr2 = (f9f[]) Arrays.copyOf(f9fVarArr, 0);
            Throwable a3 = z7o.a(A);
            if (a3 == null) {
                return;
            }
            int length = f9fVarArr2.length;
            while (i < length) {
                if (((lm4) f9fVarArr2[i]).i(a3)) {
                    throw a3;
                }
                i++;
            }
            d dVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "catch non-PassportException from provider", a3);
            }
            throw new t(a3);
        } catch (RuntimeException e) {
            a2.r(e);
            throw e;
        }
    }

    public static e9k b() {
        Function0 function0 = (Function0) a.getValue();
        if (function0 != null) {
            return (e9k) function0.invoke();
        }
        return null;
    }

    public static void c(androidx.fragment.app.t tVar, e9k e9kVar, kmk kmkVar, boolean z) {
        com.yandex.passport.api.impl.b bVar;
        tVar.getClass();
        kmkVar.getClass();
        String str = kmkVar.c;
        String str2 = kmkVar.d;
        String str3 = kmkVar.a;
        String str4 = kmkVar.b;
        j jVar = new j();
        if (z) {
            bVar = m.b;
            bVar.getClass();
        } else {
            bVar = m.a;
            bVar.getClass();
        }
        jVar.O(bVar);
        k l = jVar.l();
        com.yandex.passport.internal.properties.k kVar = new com.yandex.passport.internal.properties.k();
        kVar.s = new v(new v(com.yandex.plus.core.network.api.utils.a.z(str), com.yandex.plus.core.network.api.utils.a.z(str2), com.yandex.plus.core.network.api.utils.a.z(str3), com.yandex.plus.core.network.api.utils.a.z(str4)));
        kVar.b = a.s(l);
        tVar.startActivityForResult(m.a(tVar).e.d(tVar, kVar.a()), 38215);
    }
}
