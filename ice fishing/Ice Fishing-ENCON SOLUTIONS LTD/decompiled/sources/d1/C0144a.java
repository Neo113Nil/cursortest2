package d1;

import P0.AbstractActivityC0072e;
import Q0.c;
import W0.b;
import Z0.j;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import x0.e;

/* renamed from: d1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0144a implements b, X0.a {

    /* renamed from: a, reason: collision with root package name */
    public final PackageManager f2827a;

    /* renamed from: b, reason: collision with root package name */
    public X0.b f2828b;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f2829c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f2830d = new HashMap();

    public C0144a(e eVar) {
        this.f2827a = (PackageManager) eVar.f8530b;
        eVar.f8531c = this;
    }

    public final void a(String str, String str2, boolean z2, j jVar) {
        if (this.f2828b == null) {
            jVar.a("error", "Plugin not bound to an Activity", null);
            return;
        }
        HashMap hashMap = this.f2829c;
        if (hashMap == null) {
            jVar.a("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) hashMap.get(str);
        if (resolveInfo == null) {
            jVar.a("error", "Text processing activity not found", null);
            return;
        }
        int hashCode = jVar.hashCode();
        this.f2830d.put(Integer.valueOf(hashCode), jVar);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z2);
        ((AbstractActivityC0072e) ((c) this.f2828b).f1518a).startActivityForResult(intent, hashCode);
    }

    public final HashMap b() {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        HashMap hashMap = this.f2829c;
        PackageManager packageManager = this.f2827a;
        if (hashMap == null) {
            this.f2829c = new HashMap();
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
                this.f2829c.put(str, resolveInfo);
            }
        }
        HashMap hashMap2 = new HashMap();
        for (String str2 : this.f2829c.keySet()) {
            hashMap2.put(str2, ((ResolveInfo) this.f2829c.get(str2)).loadLabel(packageManager).toString());
        }
        return hashMap2;
    }

    @Override // X0.a
    public final void onAttachedToActivity(X0.b bVar) {
        this.f2828b = bVar;
        ((HashSet) ((c) bVar).f1520c).add(this);
    }

    @Override // X0.a
    public final void onDetachedFromActivity() {
        ((HashSet) ((c) this.f2828b).f1520c).remove(this);
        this.f2828b = null;
    }

    @Override // X0.a
    public final void onDetachedFromActivityForConfigChanges() {
        ((HashSet) ((c) this.f2828b).f1520c).remove(this);
        this.f2828b = null;
    }

    @Override // X0.a
    public final void onReattachedToActivityForConfigChanges(X0.b bVar) {
        this.f2828b = bVar;
        ((HashSet) ((c) bVar).f1520c).add(this);
    }

    @Override // W0.b
    public final void onAttachedToEngine(W0.a aVar) {
    }

    @Override // W0.b
    public final void onDetachedFromEngine(W0.a aVar) {
    }
}
