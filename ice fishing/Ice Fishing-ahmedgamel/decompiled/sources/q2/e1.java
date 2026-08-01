package q2;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import u.AbstractC5049e;

/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final e1 f40130a = new e1();

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e7, code lost:
    
        if (r2.contains(r1) == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c1 a(Context context, F0 f02) {
        boolean z3;
        Context applicationContext;
        String str;
        int i;
        int i6;
        String str2;
        String str3 = f02.f40024a;
        Set set = f02.f40026c;
        List unmodifiableList = !set.isEmpty() ? Collections.unmodifiableList(new ArrayList(set)) : null;
        k2.r rVar = J0.c().f40062j;
        v2.d dVar = C4900p.f40199g.f40200a;
        String c9 = v2.d.c(context);
        if (!f02.f40031h.contains(c9)) {
            rVar.getClass();
            if (!new ArrayList(rVar.f38608b).contains(c9)) {
                z3 = false;
                Bundle bundle = f02.f40027d.getBundle(AdMobAdapter.class.getName());
                applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    String packageName = applicationContext.getPackageName();
                    StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                    while (true) {
                        i6 = i + 1;
                        if (i6 >= stackTrace.length) {
                            str2 = null;
                            break;
                        }
                        StackTraceElement stackTraceElement = stackTrace[i];
                        String className = stackTraceElement.getClassName();
                        i = ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (v2.d.f41399c.equalsIgnoreCase(className) || v2.d.f41400d.equalsIgnoreCase(className) || v2.d.f41401e.equalsIgnoreCase(className) || v2.d.f41402f.equalsIgnoreCase(className) || v2.d.f41403g.equalsIgnoreCase(className))) ? 0 : i6;
                    }
                    str2 = stackTrace[i6].getClassName();
                    if (packageName != null) {
                        StringTokenizer stringTokenizer = new StringTokenizer(packageName, com.anythink.core.common.d.j.f12378z);
                        StringBuilder sb = new StringBuilder();
                        if (stringTokenizer.hasMoreElements()) {
                            sb.append(stringTokenizer.nextToken());
                            for (int i9 = 2; i9 > 0 && stringTokenizer.hasMoreElements(); i9--) {
                                sb.append(com.anythink.core.common.d.j.f12378z);
                                sb.append(stringTokenizer.nextToken());
                            }
                            packageName = sb.toString();
                        }
                        if (str2 != null) {
                        }
                    }
                    str2 = null;
                    str = str2;
                } else {
                    str = null;
                }
                k2.r rVar2 = J0.c().f40062j;
                return new c1(8, -1L, bundle, -1, unmodifiableList, z3, Math.max(f02.f40030g, rVar2.f38607a), false, f02.f40028e, null, null, str3, f02.f40027d, f02.i, Collections.unmodifiableList(new ArrayList(f02.f40032j)), f02.f40029f, str, f02.f40033k, null, -1, (String) Collections.max(Arrays.asList(null, ""), d1.f40127n), new ArrayList(f02.f40025b), f02.f40035m, f02.f40034l, AbstractC5049e.d(rVar2.f38609c), f02.f40036n, 0L, -1);
            }
        }
        z3 = true;
        Bundle bundle2 = f02.f40027d.getBundle(AdMobAdapter.class.getName());
        applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
        }
        k2.r rVar22 = J0.c().f40062j;
        return new c1(8, -1L, bundle2, -1, unmodifiableList, z3, Math.max(f02.f40030g, rVar22.f38607a), false, f02.f40028e, null, null, str3, f02.f40027d, f02.i, Collections.unmodifiableList(new ArrayList(f02.f40032j)), f02.f40029f, str, f02.f40033k, null, -1, (String) Collections.max(Arrays.asList(null, ""), d1.f40127n), new ArrayList(f02.f40025b), f02.f40035m, f02.f40034l, AbstractC5049e.d(rVar22.f38609c), f02.f40036n, 0L, -1);
    }
}
