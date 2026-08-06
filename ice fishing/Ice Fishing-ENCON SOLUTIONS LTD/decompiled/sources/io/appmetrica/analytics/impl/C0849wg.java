package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import h1.C0234d;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.wg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0849wg {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7109a;

    /* renamed from: b, reason: collision with root package name */
    public final SafePackageManager f7110b;

    /* renamed from: c, reason: collision with root package name */
    public final Ra f7111c;

    /* renamed from: d, reason: collision with root package name */
    public final Dc f7112d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7113e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7114f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7115g;

    public C0849wg(Context context, SafePackageManager safePackageManager, Ra ra) {
        this.f7109a = context;
        this.f7110b = safePackageManager;
        this.f7111c = ra;
        Dc dc = new Dc(0);
        dc.a(EnumC0590mg.f6521d, 1);
        dc.a(EnumC0590mg.f6520c, 2);
        this.f7112d = dc;
        this.f7113e = TimeUnit.DAYS.toSeconds(1L);
        this.f7114f = "com.android.vending";
        this.f7115g = "com.huawei.appmarket";
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
    
        if (((java.lang.Number) r7).longValue() < r13.f7113e) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0616ng a(List list) {
        C0616ng c0616ng;
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return (C0616ng) list.get(0);
        }
        SafePackageManager safePackageManager = this.f7110b;
        Context context = this.f7109a;
        PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 0);
        if (packageInfo != null) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(packageInfo.firstInstallTime);
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            C0616ng c0616ng2 = (C0616ng) it.next();
            C0234d c0234d = new C0234d(c0616ng2, Long.valueOf(Math.abs(c0616ng2.f6626c - seconds)));
            while (true) {
                boolean hasNext = it.hasNext();
                Object obj = c0234d.f3387b;
                if (!hasNext) {
                    break;
                }
                C0616ng c0616ng3 = (C0616ng) it.next();
                Long valueOf = Long.valueOf(Math.abs(c0616ng3.f6626c - seconds));
                C0234d c0234d2 = new C0234d(c0616ng3, valueOf);
                Comparable comparable = (Comparable) obj;
                if ((comparable == valueOf ? 0 : comparable == null ? -1 : comparable.compareTo(valueOf)) > 0) {
                    c0234d = c0234d2;
                }
            }
            c0616ng = (C0616ng) c0234d.f3386a;
        }
        c0616ng = null;
        if (c0616ng == null) {
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            C0616ng c0616ng4 = (C0616ng) it2.next();
            while (it2.hasNext()) {
                C0616ng c0616ng5 = (C0616ng) it2.next();
                if (a(this, c0616ng4, c0616ng5) < 0) {
                    c0616ng4 = c0616ng5;
                }
            }
            c0616ng = c0616ng4;
        }
        Ra ra = this.f7111c;
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList(i1.k.E(list));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            C0616ng c0616ng6 = (C0616ng) it3.next();
            arrayList.add(new JSONObject().put("referrer", c0616ng6.f6624a).put("install_timestamp_seconds", c0616ng6.f6626c).put("click_timestamp_seconds", c0616ng6.f6625b).put(AdRevenueConstants.SOURCE_KEY, c0616ng6.f6627d.f6523a));
        }
        ra.reportEvent("several_filled_referrers", jSONObject.put("candidates", AbstractC0572lo.a((Collection) arrayList) ? null : new JSONArray((Collection) arrayList)).put("chosen", new JSONObject().put("referrer", c0616ng.f6624a).put("install_timestamp_seconds", c0616ng.f6626c).put("click_timestamp_seconds", c0616ng.f6625b).put(AdRevenueConstants.SOURCE_KEY, c0616ng.f6627d.f6523a)).putOpt("install_time", packageInfo != null ? Long.valueOf(packageInfo.firstInstallTime) : null).toString());
        return c0616ng;
    }

    public /* synthetic */ C0849wg(Context context) {
        this(context, new SafePackageManager(), AbstractC0860x1.a());
    }

    public static final int a(C0849wg c0849wg, C0616ng c0616ng, C0616ng c0616ng2) {
        int signum = Long.signum(c0616ng.f6626c - c0616ng2.f6626c);
        return signum == 0 ? ((Number) c0849wg.f7112d.a(c0616ng.f6627d)).intValue() - ((Number) c0849wg.f7112d.a(c0616ng2.f6627d)).intValue() : signum;
    }
}
