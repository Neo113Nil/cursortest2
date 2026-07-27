package p0;

import L.Q;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import c0.AbstractActivityC0104f;
import d0.C0114d;
import j0.InterfaceC0188a;
import java.util.HashMap;
import java.util.List;
import l0.k;

/* renamed from: p0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0225a implements InterfaceC0188a {

    /* renamed from: f, reason: collision with root package name */
    public final PackageManager f2815f;

    /* renamed from: g, reason: collision with root package name */
    public C0114d f2816g;

    /* renamed from: h, reason: collision with root package name */
    public HashMap f2817h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f2818i = new HashMap();

    public C0225a(Q q2) {
        this.f2815f = (PackageManager) q2.f597g;
        q2.f598h = this;
    }

    public final void a(String str, String str2, boolean z2, k kVar) {
        if (this.f2816g == null) {
            kVar.a("error", "Plugin not bound to an Activity", null);
            return;
        }
        HashMap hashMap = this.f2817h;
        if (hashMap == null) {
            kVar.a("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) hashMap.get(str);
        if (resolveInfo == null) {
            kVar.a("error", "Text processing activity not found", null);
            return;
        }
        int hashCode = kVar.hashCode();
        this.f2818i.put(Integer.valueOf(hashCode), kVar);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z2);
        ((AbstractActivityC0104f) this.f2816g.f1799a).startActivityForResult(intent, hashCode);
    }

    public final HashMap b() {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        HashMap hashMap = this.f2817h;
        PackageManager packageManager = this.f2815f;
        if (hashMap == null) {
            this.f2817h = new HashMap();
            Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
            if (Build.VERSION.SDK_INT >= 33) {
                of = PackageManager.ResolveInfoFlags.of(0L);
                queryIntentActivities = packageManager.queryIntentActivities(type, of);
            } else {
                queryIntentActivities = packageManager.queryIntentActivities(type, 0);
            }
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                String str = resolveInfo.activityInfo.name;
                resolveInfo.loadLabel(packageManager).toString();
                this.f2817h.put(str, resolveInfo);
            }
        }
        HashMap hashMap2 = new HashMap();
        for (String str2 : this.f2817h.keySet()) {
            hashMap2.put(str2, ((ResolveInfo) this.f2817h.get(str2)).loadLabel(packageManager).toString());
        }
        return hashMap2;
    }

    @Override // j0.InterfaceC0188a
    public final void c(Q q2) {
    }

    @Override // j0.InterfaceC0188a
    public final void n(Q q2) {
    }
}
