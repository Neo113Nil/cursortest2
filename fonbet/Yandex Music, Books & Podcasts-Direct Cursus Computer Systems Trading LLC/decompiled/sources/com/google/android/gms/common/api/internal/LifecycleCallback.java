package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.fragment.app.a;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import defpackage.b6e;
import defpackage.e3x;
import defpackage.h7x;
import defpackage.oyf;
import defpackage.su4;
import defpackage.vyf;
import defpackage.xq0;
import defpackage.y1g;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class LifecycleCallback {
    public final Object a;

    public LifecycleCallback(vyf vyfVar) {
        this.a = vyfVar;
    }

    public static vyf c(oyf oyfVar) {
        e3x e3xVar;
        h7x h7xVar;
        Activity activity = oyfVar.a;
        if (!(activity instanceof t)) {
            if (activity == null) {
                xq0.x("Can't get fragment for unexpected activity.");
                return null;
            }
            WeakHashMap weakHashMap = e3x.d;
            WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
            if (weakReference != null && (e3xVar = (e3x) weakReference.get()) != null) {
                return e3xVar;
            }
            try {
                e3x e3xVar2 = (e3x) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (e3xVar2 == null || e3xVar2.isRemoving()) {
                    e3xVar2 = new e3x();
                    activity.getFragmentManager().beginTransaction().add(e3xVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                weakHashMap.put(activity, new WeakReference(e3xVar2));
                return e3xVar2;
            } catch (ClassCastException e) {
                b6e.o("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
                return null;
            }
        }
        t tVar = (t) activity;
        WeakHashMap weakHashMap2 = h7x.j;
        WeakReference weakReference2 = (WeakReference) weakHashMap2.get(tVar);
        if (weakReference2 != null && (h7xVar = (h7x) weakReference2.get()) != null) {
            return h7xVar;
        }
        try {
            h7x h7xVar2 = (h7x) tVar.getSupportFragmentManager().D("SupportLifecycleFragmentImpl");
            if (h7xVar2 == null || h7xVar2.isRemoving()) {
                h7xVar2 = new h7x();
                y supportFragmentManager = tVar.getSupportFragmentManager();
                a l = su4.l(supportFragmentManager, supportFragmentManager);
                l.d(0, h7xVar2, "SupportLifecycleFragmentImpl", 1);
                l.k(true, true);
            }
            weakHashMap2.put(tVar, new WeakReference(h7xVar2));
            return h7xVar2;
        } catch (ClassCastException e2) {
            b6e.o("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e2);
            return null;
        }
    }

    @Keep
    private static vyf getChimeraLifecycleFragmentImpl(oyf oyfVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, vyf] */
    public final Activity b() {
        Activity l = this.a.l();
        y1g.G(l);
        return l;
    }

    public void d(int i, int i2, Intent intent) {
    }

    public void e(Bundle bundle) {
    }

    public void f() {
    }

    public void g() {
    }

    public void h(Bundle bundle) {
    }

    public void i() {
    }

    public void j() {
    }
}
