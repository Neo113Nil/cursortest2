package s2;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import u.AbstractC5050e;

/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final e1 f40429a = new e1();

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e7, code lost:
    
        if (r2.contains(r1) == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c1 a(Context context, F0 f02) {
        boolean z6;
        Context applicationContext;
        String str;
        int i;
        int i4;
        String str2;
        String str3 = f02.f40323a;
        Set set = f02.f40325c;
        List unmodifiableList = !set.isEmpty() ? Collections.unmodifiableList(new ArrayList(set)) : null;
        m2.r rVar = J0.c().f40361j;
        x2.d dVar = C4949p.f40498g.f40499a;
        String c9 = x2.d.c(context);
        if (!f02.f40330h.contains(c9)) {
            rVar.getClass();
            if (!new ArrayList(rVar.f39397b).contains(c9)) {
                z6 = false;
                Bundle bundle = f02.f40326d.getBundle(AdMobAdapter.class.getName());
                applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    String packageName = applicationContext.getPackageName();
                    StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                    while (true) {
                        i4 = i + 1;
                        if (i4 >= stackTrace.length) {
                            str2 = null;
                            break;
                        }
                        StackTraceElement stackTraceElement = stackTrace[i];
                        String className = stackTraceElement.getClassName();
                        i = ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (x2.d.f41853c.equalsIgnoreCase(className) || x2.d.f41854d.equalsIgnoreCase(className) || x2.d.f41855e.equalsIgnoreCase(className) || x2.d.f41856f.equalsIgnoreCase(className) || x2.d.f41857g.equalsIgnoreCase(className))) ? 0 : i4;
                    }
                    str2 = stackTrace[i4].getClassName();
                    if (packageName != null) {
                        StringTokenizer stringTokenizer = new StringTokenizer(packageName, com.anythink.core.common.d.j.f13164z);
                        StringBuilder sb = new StringBuilder();
                        if (stringTokenizer.hasMoreElements()) {
                            sb.append(stringTokenizer.nextToken());
                            for (int i6 = 2; i6 > 0 && stringTokenizer.hasMoreElements(); i6--) {
                                sb.append(com.anythink.core.common.d.j.f13164z);
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
                m2.r rVar2 = J0.c().f40361j;
                return new c1(8, -1L, bundle, -1, unmodifiableList, z6, Math.max(f02.f40329g, rVar2.f39396a), false, f02.f40327e, null, null, str3, f02.f40326d, f02.i, Collections.unmodifiableList(new ArrayList(f02.f40331j)), f02.f40328f, str, f02.f40332k, null, -1, (String) Collections.max(Arrays.asList(null, ""), d1.f40426n), new ArrayList(f02.f40324b), f02.f40334m, f02.f40333l, AbstractC5050e.d(rVar2.f39398c), f02.f40335n, 0L, -1);
            }
        }
        z6 = true;
        Bundle bundle2 = f02.f40326d.getBundle(AdMobAdapter.class.getName());
        applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
        }
        m2.r rVar22 = J0.c().f40361j;
        return new c1(8, -1L, bundle2, -1, unmodifiableList, z6, Math.max(f02.f40329g, rVar22.f39396a), false, f02.f40327e, null, null, str3, f02.f40326d, f02.i, Collections.unmodifiableList(new ArrayList(f02.f40331j)), f02.f40328f, str, f02.f40332k, null, -1, (String) Collections.max(Arrays.asList(null, ""), d1.f40426n), new ArrayList(f02.f40324b), f02.f40334m, f02.f40333l, AbstractC5050e.d(rVar22.f39398c), f02.f40335n, 0L, -1);
    }
}
