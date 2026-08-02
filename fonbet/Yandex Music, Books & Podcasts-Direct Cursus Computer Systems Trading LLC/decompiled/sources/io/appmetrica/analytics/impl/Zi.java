package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import defpackage.gl5;
import defpackage.v75;
import defpackage.wvs;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class Zi {
    public final Context a;
    public final SafePackageManager b;
    public final InterfaceC0228ec c;
    public final C0374je d;
    public final long e;
    public final String f;
    public final String g;

    public Zi(Context context, SafePackageManager safePackageManager, InterfaceC0228ec interfaceC0228ec) {
        this.a = context;
        this.b = safePackageManager;
        this.c = interfaceC0228ec;
        C0374je c0374je = new C0374je(0);
        c0374je.a(Pi.d, 1);
        c0374je.a(Pi.c, 2);
        this.d = c0374je;
        this.e = 86400L;
        this.f = "com.android.vending";
        this.g = "com.huawei.appmarket";
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
    
        if (((java.lang.Number) r6).longValue() < r13.e) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Qi a(List list) {
        Qi qi;
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return (Qi) list.get(0);
        }
        SafePackageManager safePackageManager = this.b;
        Context context = this.a;
        PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 0);
        if (packageInfo != null) {
            long j = packageInfo.firstInstallTime / 1000;
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                wvs.n();
                return null;
            }
            Qi qi2 = (Qi) it.next();
            Pair pair = new Pair(qi2, Long.valueOf(Math.abs(qi2.c - j)));
            while (true) {
                boolean hasNext = it.hasNext();
                Object obj = pair.b;
                if (!hasNext) {
                    break;
                }
                Qi qi3 = (Qi) it.next();
                Long valueOf = Long.valueOf(Math.abs(qi3.c - j));
                Pair pair2 = new Pair(qi3, valueOf);
                if (gl5.b((Comparable) obj, valueOf) > 0) {
                    pair = pair2;
                }
            }
            qi = (Qi) pair.a;
        }
        qi = null;
        if (qi == null) {
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                wvs.n();
                return null;
            }
            Qi qi4 = (Qi) it2.next();
            while (it2.hasNext()) {
                Qi qi5 = (Qi) it2.next();
                if (a(this, qi4, qi5) < 0) {
                    qi4 = qi5;
                }
            }
            qi = qi4;
        }
        InterfaceC0228ec interfaceC0228ec = this.c;
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Qi qi6 = (Qi) it3.next();
            arrayList.add(new JSONObject().put(Constants.KEY_REFERRER, qi6.a).put("install_timestamp_seconds", qi6.c).put("click_timestamp_seconds", qi6.b).put("source", qi6.d.a));
        }
        interfaceC0228ec.reportEvent("several_filled_referrers", jSONObject.put("candidates", AbstractC0734vr.a((Collection) arrayList) ? null : new JSONArray((Collection) arrayList)).put("chosen", new JSONObject().put(Constants.KEY_REFERRER, qi.a).put("install_timestamp_seconds", qi.c).put("click_timestamp_seconds", qi.b).put("source", qi.d.a)).putOpt("install_time", packageInfo != null ? Long.valueOf(packageInfo.firstInstallTime) : null).toString());
        return qi;
    }

    public /* synthetic */ Zi(Context context) {
        this(context, new SafePackageManager(), R1.a());
    }

    public static final int a(Zi zi, Qi qi, Qi qi2) {
        int signum = Long.signum(qi.c - qi2.c);
        return signum == 0 ? ((Number) zi.d.a(qi.d)).intValue() - ((Number) zi.d.a(qi2.d)).intValue() : signum;
    }
}
