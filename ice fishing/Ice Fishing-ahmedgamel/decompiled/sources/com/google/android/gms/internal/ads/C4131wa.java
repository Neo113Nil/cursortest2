package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;
import p.C4824j;

/* renamed from: com.google.android.gms.internal.ads.wa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4131wa {

    /* renamed from: a, reason: collision with root package name */
    public S0.i f35615a;

    /* renamed from: b, reason: collision with root package name */
    public C4824j f35616b;

    /* renamed from: c, reason: collision with root package name */
    public C3696oN f35617c;

    /* renamed from: d, reason: collision with root package name */
    public l4.q f35618d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, com.anythink.basead.exoplayer.b.aX);
            if (queryIntentActivities != null && resolveActivity != null) {
                for (int i = 0; i < queryIntentActivities.size(); i++) {
                    if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                        return resolveActivity.activityInfo.packageName.equals(AbstractC4117wD.a(context));
                    }
                }
            }
        }
        return false;
    }
}
