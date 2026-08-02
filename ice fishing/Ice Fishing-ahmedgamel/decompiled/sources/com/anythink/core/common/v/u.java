package com.anythink.core.common.v;

import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATSDK;
import com.anythink.core.common.h.bv;
import java.lang.reflect.Constructor;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    protected static u f17676a = new u();

    /* renamed from: b, reason: collision with root package name */
    protected static final String f17677b = k.b(com.anythink.core.common.d.j.f13162x);

    /* renamed from: c, reason: collision with root package name */
    protected static final String f17678c = ah.a(com.anythink.core.common.d.j.f13163y);

    private static boolean a(int i) {
        return 6 == i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.anythink.core.common.h.p c(bv bvVar) {
        try {
            String b9 = 6 == bvVar.g() ? b(bvVar.m()) : "";
            ATBaseAdAdapter a9 = !TextUtils.isEmpty(b9) ? a(b9) : null;
            if (a9 == null) {
                a9 = a(bvVar.m());
            }
            try {
                m.a(bvVar.g(), a9.getInternalNetworkSDKVersion());
            } catch (Throwable unused) {
            }
            return new com.anythink.core.common.h.p(a9);
        } catch (Throwable th) {
            return new com.anythink.core.common.h.p(th);
        }
    }

    private static com.anythink.core.common.h.p d(final bv bvVar) {
        final com.anythink.core.common.h.p[] pVarArr = new com.anythink.core.common.h.p[1];
        try {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            com.anythink.core.common.d.s c9 = com.anythink.core.common.d.t.b().c();
            if (c9 != null) {
                c9.addPlLoadStateListener(new com.anythink.core.common.k.d() { // from class: com.anythink.core.common.v.u.1
                    @Override // com.anythink.core.common.k.d
                    public final void a() {
                        pVarArr[0] = u.c(bvVar);
                        countDownLatch.countDown();
                    }
                });
            }
            try {
                countDownLatch.await(com.anythink.basead.exoplayer.i.a.f8669f, TimeUnit.MILLISECONDS);
            } catch (Exception e9) {
                e9.printStackTrace();
            }
            th = null;
        } catch (Throwable th) {
            th = th;
            th.printStackTrace();
        }
        com.anythink.core.common.h.p pVar = pVarArr[0];
        return pVar == null ? new com.anythink.core.common.h.p(th) : pVar;
    }

    public static ATBaseAdAdapter a(String str) {
        if (str == null) {
            return null;
        }
        Class<? extends U> asSubclass = Class.forName(str).asSubclass(ATBaseAdAdapter.class);
        if (asSubclass == 0) {
            Log.w("anythink", "can not find adapter");
        }
        Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        return (ATBaseAdAdapter) declaredConstructor.newInstance(new Object[0]);
    }

    private static String b(String str) {
        try {
            String a9 = a();
            String[] split = str.replace(a9 + com.anythink.core.common.d.j.f13164z, "").split("\\.");
            if (split != null && split.length > 1) {
                String str2 = split[split.length - 1];
                String str3 = f17678c;
                String str4 = f17677b;
                Locale locale = Locale.ENGLISH;
                return a9 + com.anythink.core.common.d.j.f13164z + split[0] + com.anythink.core.common.d.j.f13164z + str4.toLowerCase(locale) + com.anythink.core.common.d.j.f13164z + str2.replace(str3, str4.toUpperCase(locale));
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    private static ATBaseAdAdapter a(Class<? extends com.anythink.core.common.d.f> cls) {
        if (cls == null) {
            Log.w("anythink", "can not find adapter");
        }
        Constructor<? extends com.anythink.core.common.d.f> declaredConstructor = cls.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        return (ATBaseAdAdapter) declaredConstructor.newInstance(new Object[0]);
    }

    public static com.anythink.core.common.h.p a(bv bvVar) {
        com.anythink.core.common.h.p c9;
        com.anythink.core.common.d.s c10;
        if (ATSDK.isCnSDK()) {
            int g9 = bvVar.g();
            if (g9 == 46) {
                return d(bvVar);
            }
            if (g9 > 100000) {
                String m9 = bvVar.m();
                if (!TextUtils.isEmpty(m9) && (c10 = com.anythink.core.common.d.t.b().c()) != null && c10.isContainsPlStr(m9)) {
                    return d(bvVar);
                }
                c9 = null;
            } else {
                c9 = c(bvVar);
            }
        } else {
            c9 = c(bvVar);
        }
        return c9 == null ? c(bvVar) : c9;
    }

    private static void a(bv bvVar, ATBaseAdAdapter aTBaseAdAdapter) {
        try {
            m.a(bvVar.g(), aTBaseAdAdapter.getInternalNetworkSDKVersion());
        } catch (Throwable unused) {
        }
    }

    private static String a(int i, String str) {
        if (6 == i) {
            return b(str);
        }
        return "";
    }

    private static String a() {
        String[] split = u.class.getPackage().getName().split("\\.");
        if (split != null) {
            try {
                if (split.length > 1) {
                    return split[0] + com.anythink.core.common.d.j.f13164z + split[1];
                }
                return "";
            } catch (Throwable unused) {
                return "";
            }
        }
        return "";
    }
}
