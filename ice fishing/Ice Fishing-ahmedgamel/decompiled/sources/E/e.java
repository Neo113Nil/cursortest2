package E;

import D.AbstractC0280j;
import D.AbstractC0281k;
import D.H;
import D.M;
import F.k;
import F.l;
import F.m;
import F.q;
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
    public static final Object f630a = null;

    public static int a(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : H.a(new M(context).f358b) ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static int b(Context context, String str) {
        int c9;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String d9 = AbstractC0280j.d(str);
            if (d9 != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                    c9 = AbstractC0280j.c((AppOpsManager) AbstractC0280j.a(context, AppOpsManager.class), d9, packageName);
                } else if (Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager c10 = AbstractC0281k.c(context);
                    c9 = AbstractC0281k.a(c10, d9, Binder.getCallingUid(), packageName);
                    if (c9 == 0) {
                        c9 = AbstractC0281k.a(c10, d9, myUid, AbstractC0281k.b(context));
                    }
                } else {
                    c9 = AbstractC0280j.c((AppOpsManager) AbstractC0280j.a(context, AppOpsManager.class), d9, packageName);
                }
                if (c9 != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r5.f933c == r8.hashCode()) goto L21;
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
        synchronized (q.f944c) {
            try {
                SparseArray sparseArray = (SparseArray) q.f943b.get(mVar);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (lVar = (l) sparseArray.get(i)) != null) {
                    if (lVar.f932b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (lVar.f933c != 0) {
                            }
                            colorStateList2 = lVar.f931a;
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
        ThreadLocal threadLocal = q.f942a;
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
            } catch (Exception e9) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e9);
            }
        }
        if (colorStateList == null) {
            return k.b(resources, i, theme);
        }
        synchronized (q.f944c) {
            try {
                WeakHashMap weakHashMap = q.f943b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(mVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(mVar, sparseArray2);
                }
                sparseArray2.append(i, new l(colorStateList, mVar.f934a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateList;
    }
}
