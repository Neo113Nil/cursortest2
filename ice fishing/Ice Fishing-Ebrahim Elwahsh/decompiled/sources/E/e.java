package E;

import D.AbstractC0291k;
import D.AbstractC0292l;
import D.I;
import D.N;
import F.k;
import F.l;
import F.m;
import F.o;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f730a = null;

    public static int a(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : I.a(new N(context).f516b) ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static int b(Context context, String str) {
        int c4;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String d2 = AbstractC0291k.d(str);
            if (d2 != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                    c4 = AbstractC0291k.c((AppOpsManager) AbstractC0291k.a(context, AppOpsManager.class), d2, packageName);
                } else if (Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager c9 = AbstractC0292l.c(context);
                    c4 = AbstractC0292l.a(c9, d2, Binder.getCallingUid(), packageName);
                    if (c4 == 0) {
                        c4 = AbstractC0292l.a(c9, d2, myUid, AbstractC0292l.b(context));
                    }
                } else {
                    c4 = AbstractC0291k.c((AppOpsManager) AbstractC0291k.a(context, AppOpsManager.class), d2, packageName);
                }
                if (c4 != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r5.f924c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList c(Context context, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        l lVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        m mVar = new m(resources, theme);
        synchronized (o.f929c) {
            try {
                SparseArray sparseArray = (SparseArray) o.f928b.get(mVar);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (lVar = (l) sparseArray.get(i)) != null) {
                    if (lVar.f923b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (lVar.f924c != 0) {
                            }
                            colorStateList2 = lVar.f922a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i);
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = o.f927a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i4 = typedValue.type;
        if (i4 < 28 || i4 > 31) {
            try {
                colorStateList = F.c.a(resources, resources.getXml(i), theme);
            } catch (Exception e6) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e6);
            }
        }
        if (colorStateList == null) {
            return k.b(resources, i, theme);
        }
        synchronized (o.f929c) {
            try {
                WeakHashMap weakHashMap = o.f928b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(mVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(mVar, sparseArray2);
                }
                sparseArray2.append(i, new l(colorStateList, mVar.f925a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateList;
    }
}
