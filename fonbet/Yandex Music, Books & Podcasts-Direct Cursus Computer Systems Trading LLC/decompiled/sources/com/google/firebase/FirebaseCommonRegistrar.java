package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.aec;
import defpackage.eg0;
import defpackage.ht7;
import defpackage.kac;
import defpackage.ld2;
import defpackage.m5n;
import defpackage.nj2;
import defpackage.ox7;
import defpackage.rj7;
import defpackage.rwd;
import defpackage.sm7;
import defpackage.swd;
import defpackage.twd;
import defpackage.um7;
import defpackage.vm5;
import defpackage.wxf;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        eg0 b = vm5.b(ht7.class);
        b.a(new ox7(2, 0, ld2.class));
        b.f = new rj7(10);
        arrayList.add(b.b());
        m5n m5nVar = new m5n(nj2.class, Executor.class);
        eg0 eg0Var = new eg0(um7.class, new Class[]{swd.class, twd.class});
        eg0Var.a(ox7.b(Context.class));
        eg0Var.a(ox7.b(aec.class));
        eg0Var.a(new ox7(2, 0, rwd.class));
        eg0Var.a(new ox7(1, 1, ht7.class));
        eg0Var.a(new ox7(m5nVar, 1, 0));
        eg0Var.f = new sm7(m5nVar, 0);
        arrayList.add(eg0Var.b());
        arrayList.add(wxf.q("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(wxf.q("fire-core", "21.0.0"));
        arrayList.add(wxf.q("device-name", a(Build.PRODUCT)));
        arrayList.add(wxf.q("device-model", a(Build.DEVICE)));
        arrayList.add(wxf.q("device-brand", a(Build.BRAND)));
        arrayList.add(wxf.w("android-target-sdk", new kac(1)));
        arrayList.add(wxf.w("android-min-sdk", new kac(2)));
        arrayList.add(wxf.w("android-platform", new kac(3)));
        arrayList.add(wxf.w("android-installer", new kac(4)));
        try {
            str = KotlinVersion.CURRENT.toString();
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(wxf.q("kotlin", str));
        }
        return arrayList;
    }
}
