package io.flutter.embedding.android;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.play.core.splitcompat.SplitCompatApplication;
import defpackage.e03;
import defpackage.hfb1;
import defpackage.hxc0;
import defpackage.isr;
import defpackage.ixc0;
import defpackage.jsr;
import defpackage.lvt0;
import defpackage.ny61;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class FlutterPlayStoreSplitApplication extends SplitCompatApplication {
    @Override // android.app.Application
    public void onCreate() {
        Bundle bundle;
        super.onCreate();
        ixc0 ixc0Var = new ixc0();
        ixc0Var.d = this;
        ixc0Var.b = null;
        ixc0Var.e = e03.a(this);
        lvt0 a = hfb1.a(this);
        ixc0Var.a = a;
        hxc0 hxc0Var = new hxc0(ixc0Var);
        ixc0Var.l = hxc0Var;
        a.f(hxc0Var);
        ixc0Var.f = new SparseArray();
        ixc0Var.g = new SparseIntArray();
        ixc0Var.h = new SparseArray();
        ixc0Var.i = new HashMap();
        ixc0Var.j = new SparseArray();
        ixc0Var.k = new SparseArray();
        try {
            ApplicationInfo applicationInfo = ixc0Var.d.getPackageManager().getApplicationInfo(ixc0Var.d.getPackageName(), 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                String str = ixc0.m;
                String string = bundle.getString(str, null);
                if (string == null) {
                    Log.e("PlayStoreDeferredComponentManager", "No loading unit to dynamic feature module name found. Ensure '" + str + "' is defined in the base module's AndroidManifest.");
                } else if (!string.equals("")) {
                    for (String str2 : string.split(",")) {
                        String[] split = str2.split(":", -1);
                        int parseInt = Integer.parseInt(split[0]);
                        ixc0Var.j.put(parseInt, split[1]);
                        if (split.length > 2) {
                            ixc0Var.k.put(parseInt, split[2]);
                        }
                    }
                }
            }
            isr isrVar = new isr();
            isrVar.b = ixc0Var;
            jsr a2 = isrVar.a();
            if (jsr.f) {
                ny61.r("Cannot change the FlutterInjector instance once it's been read. If you're trying to dependency inject, be sure to do so at the beginning of the program");
            } else {
                jsr.e = a2;
            }
        } catch (PackageManager.NameNotFoundException e) {
            ny61.j(e);
        }
    }
}
