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
import l0.C0208k;

/* renamed from: p0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0226a implements InterfaceC0188a {

    /* renamed from: e, reason: collision with root package name */
    public final PackageManager f2823e;

    /* renamed from: f, reason: collision with root package name */
    public C0114d f2824f;

    /* renamed from: g, reason: collision with root package name */
    public HashMap f2825g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f2826h = new HashMap();

    public C0226a(Q q2) {
        this.f2823e = (PackageManager) q2.f519f;
        q2.f520g = this;
    }

    public final void a(String str, String str2, boolean z2, C0208k c0208k) {
        if (this.f2824f == null) {
            c0208k.a("error", "Plugin not bound to an Activity", null);
            return;
        }
        HashMap hashMap = this.f2825g;
        if (hashMap == null) {
            c0208k.a("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) hashMap.get(str);
        if (resolveInfo == null) {
            c0208k.a("error", "Text processing activity not found", null);
            return;
        }
        int hashCode = c0208k.hashCode();
        this.f2826h.put(Integer.valueOf(hashCode), c0208k);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z2);
        ((AbstractActivityC0104f) this.f2824f.f1807a).startActivityForResult(intent, hashCode);
    }

    public final HashMap b() {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        HashMap hashMap = this.f2825g;
        PackageManager packageManager = this.f2823e;
        if (hashMap == null) {
            this.f2825g = new HashMap();
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
                this.f2825g.put(str, resolveInfo);
            }
        }
        HashMap hashMap2 = new HashMap();
        for (String str2 : this.f2825g.keySet()) {
            hashMap2.put(str2, ((ResolveInfo) this.f2825g.get(str2)).loadLabel(packageManager).toString());
        }
        return hashMap2;
    }

    @Override // j0.InterfaceC0188a
    public final void c(Q q2) {
    }

    @Override // j0.InterfaceC0188a
    public final void h(Q q2) {
    }
}
