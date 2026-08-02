package com.bumptech.glide;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.I;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Collection;
import java.util.List;
import java.util.TreeMap;
import m.I0;
import m.c1;
import v7.AbstractC5118i;
import v7.AbstractC5119j;
import w7.C5155c;
import z0.C5214c;

/* loaded from: classes.dex */
public abstract class g {
    public static final c8.f d(String str, h hVar, c8.e[] eVarArr, I7.l lVar) {
        if (Q7.j.s0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (hVar.equals(c8.i.f5827b)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        c8.a aVar = new c8.a(str);
        lVar.invoke(aVar);
        return new c8.f(str, hVar, aVar.f5799b.size(), AbstractC5118i.B(eVarArr), aVar);
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static Drawable h(Context context, int i) {
        return I0.b().c(context, i);
    }

    public static t.k j(t.i iVar) {
        t.h hVar = new t.h();
        hVar.f40581c = new t.l();
        t.k kVar = new t.k(hVar);
        hVar.f40580b = kVar;
        hVar.f40579a = iVar.getClass();
        try {
            Object b9 = iVar.b(hVar);
            if (b9 != null) {
                hVar.f40579a = b9;
                return kVar;
            }
        } catch (Exception e9) {
            kVar.f40585u.k(e9);
        }
        return kVar;
    }

    public static Object o(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return K.d.a(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void r(final Context context) {
        final boolean z6;
        Context applicationContext;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (h.g(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
            packageManager = applicationContext.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
            z6 = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
            if (Build.VERSION.SDK_INT >= 29) {
                d.r(null);
                return;
            } else {
                final l3.h hVar = new l3.h();
                new Runnable() { // from class: l4.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        String notificationDelegate;
                        Context context2 = context;
                        l3.h hVar2 = hVar;
                        try {
                            if (!(Binder.getCallingUid() == context2.getApplicationInfo().uid)) {
                                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context2.getPackageName());
                                return;
                            }
                            SharedPreferences.Editor edit = com.bumptech.glide.h.g(context2).edit();
                            edit.putBoolean("proxy_notification_initialized", true);
                            edit.apply();
                            NotificationManager notificationManager = (NotificationManager) context2.getSystemService(NotificationManager.class);
                            if (z6) {
                                notificationManager.setNotificationDelegate("com.google.android.gms");
                            } else {
                                notificationDelegate = notificationManager.getNotificationDelegate();
                                if ("com.google.android.gms".equals(notificationDelegate)) {
                                    notificationManager.setNotificationDelegate(null);
                                }
                            }
                        } finally {
                            hVar2.d(null);
                        }
                    }
                }.run();
                return;
            }
        }
        z6 = true;
        if (Build.VERSION.SDK_INT >= 29) {
        }
    }

    public static final List x(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        C5155c c5155c = new C5155c(10);
        while (cursor.moveToNext()) {
            int i = cursor.getInt(columnIndex);
            int i4 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            kotlin.jvm.internal.h.d(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            kotlin.jvm.internal.h.d(string2, "cursor.getString(toColumnIndex)");
            c5155c.add(new w0.c(i, i4, string, string2));
        }
        return AbstractC5119j.H(Z2.d.g(c5155c));
    }

    public static final w0.d y(C5214c c5214c, String str, boolean z6) {
        Cursor E8 = c5214c.E("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = E8.getColumnIndex("seqno");
            int columnIndex2 = E8.getColumnIndex("cid");
            int columnIndex3 = E8.getColumnIndex("name");
            int columnIndex4 = E8.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (E8.moveToNext()) {
                    if (E8.getInt(columnIndex2) >= 0) {
                        int i = E8.getInt(columnIndex);
                        String columnName = E8.getString(columnIndex3);
                        String str2 = E8.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer valueOf = Integer.valueOf(i);
                        kotlin.jvm.internal.h.d(columnName, "columnName");
                        treeMap.put(valueOf, columnName);
                        treeMap2.put(Integer.valueOf(i), str2);
                    }
                }
                Collection values = treeMap.values();
                kotlin.jvm.internal.h.d(values, "columnsMap.values");
                List J = AbstractC5119j.J(values);
                Collection values2 = treeMap2.values();
                kotlin.jvm.internal.h.d(values2, "ordersMap.values");
                w0.d dVar = new w0.d(str, J, AbstractC5119j.J(values2), z6);
                E8.close();
                return dVar;
            }
            E8.close();
            return null;
        } finally {
        }
    }

    public abstract boolean A(View view, float f2);

    public abstract void B(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i4);

    public P2.c b(Context context, Looper looper, c1 c1Var, Object obj, P2.i iVar, P2.j jVar) {
        return c(context, looper, c1Var, obj, iVar, jVar);
    }

    public P2.c c(Context context, Looper looper, c1 c1Var, Object obj, P2.i iVar, P2.j jVar) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public abstract int e(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float f(int i);

    public abstract int i();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n(View view);

    public abstract int p(CoordinatorLayout coordinatorLayout);

    public abstract int q();

    public abstract boolean s(float f2);

    public abstract boolean t(View view);

    public abstract boolean u(float f2, float f9);

    public abstract void v(int i);

    public abstract void w(Typeface typeface, boolean z6);

    public abstract void z(I i, I i4, Window window, View view, boolean z6, boolean z9);

    public void a(Window window) {
    }
}
