package com.onesignal.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class AndroidUtils {
    public static final AndroidUtils INSTANCE = new AndroidUtils();

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public enum a {
        DATA("data"),
        HTTPS("https"),
        HTTP("http");

        public static final C0000a Companion = new C0000a(null);
        private final String text;

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        /* renamed from: com.onesignal.common.AndroidUtils$a$a, reason: collision with other inner class name */
        public static final class C0000a {
            public /* synthetic */ C0000a(pc.f fVar) {
                this();
            }

            public final a fromString(String str) {
                for (a aVar : a.values()) {
                    if (xc.h.o(aVar.text, str)) {
                        return aVar;
                    }
                }
                return null;
            }

            private C0000a() {
            }
        }

        a(String str) {
            this.text = str;
        }
    }

    private AndroidUtils() {
    }

    public final List<String> filterManifestPermissions(List<String> list, q8.f fVar) {
        pc.j.e(list, "permissions");
        pc.j.e(fVar, "applicationService");
        PackageInfo packageInfo = fVar.getAppContext().getPackageManager().getPackageInfo(fVar.getAppContext().getPackageName(), 4096);
        pc.j.d(packageInfo, "applicationService.appCo…eManager.GET_PERMISSIONS)");
        String[] strArr = packageInfo.requestedPermissions;
        pc.j.d(strArr, "packageInfo.requestedPermissions");
        List L = bc.n.L(Arrays.copyOf(strArr, strArr.length));
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (L.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final String getAppVersion(Context context) {
        Integer num;
        pc.j.e(context, "context");
        try {
            num = Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            num = null;
        }
        if (num != null) {
            return num.toString();
        }
        return null;
    }

    public final String getManifestMeta(Context context, String str) {
        pc.j.e(context, "context");
        Bundle manifestMetaBundle = getManifestMetaBundle(context);
        if (manifestMetaBundle != null) {
            return manifestMetaBundle.getString(str);
        }
        return null;
    }

    public final boolean getManifestMetaBoolean(Context context, String str) {
        pc.j.e(context, "context");
        Bundle manifestMetaBundle = getManifestMetaBundle(context);
        if (manifestMetaBundle != null) {
            return manifestMetaBundle.getBoolean(str);
        }
        return false;
    }

    public final Bundle getManifestMetaBundle(Context context) {
        pc.j.e(context, "context");
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            pc.j.d(applicationInfo, "context.packageManager.g…A_DATA,\n                )");
            return applicationInfo.metaData;
        } catch (PackageManager.NameNotFoundException e10) {
            com.onesignal.debug.internal.logging.b.error("Manifest application info not found", e10);
            return null;
        }
    }

    public final int getRandomDelay(int i10, int i11) {
        return new Random().nextInt((i11 + 1) - i10) + i10;
    }

    public final String getResourceString(Context context, String str, String str2) {
        pc.j.e(context, "context");
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str, "string", context.getPackageName());
        return identifier != 0 ? resources.getString(identifier) : str2;
    }

    public final String getRootCauseMessage(Throwable th) {
        pc.j.e(th, "throwable");
        return getRootCauseThrowable(th).getMessage();
    }

    public final Throwable getRootCauseThrowable(Throwable th) {
        pc.j.e(th, "subjectThrowable");
        while (th.getCause() != null && th.getCause() != th) {
            th = th.getCause();
            pc.j.b(th);
        }
        return th;
    }

    public final int getTargetSdkVersion(Context context) {
        pc.j.e(context, "context");
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
            pc.j.d(applicationInfo, "packageManager.getApplicationInfo(packageName, 0)");
            return applicationInfo.targetSdkVersion;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return 21;
        }
    }

    public final boolean hasConfigChangeFlag(Activity activity, int i10) {
        pc.j.e(activity, "activity");
        try {
            return (activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).configChanges & i10) != 0;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public final boolean hasNotificationManagerCompat() {
        return true;
    }

    public final boolean hasPermission(String str, boolean z10, q8.f fVar) {
        pc.j.e(str, "permission");
        pc.j.e(fVar, "applicationService");
        try {
            PackageInfo packageInfo = fVar.getAppContext().getPackageManager().getPackageInfo(fVar.getAppContext().getPackageName(), 4096);
            pc.j.d(packageInfo, "applicationService.appCo…NS,\n                    )");
            String[] strArr = packageInfo.requestedPermissions;
            pc.j.d(strArr, "packageInfo.requestedPermissions");
            if (!bc.n.L(Arrays.copyOf(strArr, strArr.length)).contains(str)) {
                return false;
            }
            if (z10) {
                return y2.a.a(fVar.getAppContext(), str) != -1;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public final boolean isActivityFullyReady(Activity activity) {
        pc.j.e(activity, "activity");
        boolean z10 = activity.getWindow().getDecorView().getApplicationWindowToken() != null;
        View decorView = activity.getWindow().getDecorView();
        pc.j.d(decorView, "activity.window.decorView");
        return z10 && (decorView.getRootWindowInsets() != null);
    }

    public final boolean isRunningOnMainThread() {
        return pc.j.a(Thread.currentThread(), Looper.getMainLooper().getThread());
    }

    public final boolean isStringNotEmpty(String str) {
        return !TextUtils.isEmpty(str);
    }

    public final boolean isValidResourceName(String str) {
        if (str == null) {
            return false;
        }
        Pattern compile = Pattern.compile("^[0-9]");
        pc.j.d(compile, "compile(...)");
        return !compile.matcher(str).matches();
    }

    public final boolean opaqueHasClass(Class<?> cls) {
        pc.j.e(cls, "_class");
        return true;
    }

    public final void openURLInBrowser(Context context, Uri uri) {
        pc.j.e(context, "appContext");
        pc.j.e(uri, "uri");
        context.startActivity(openURLInBrowserIntent(uri));
    }

    public final Intent openURLInBrowserIntent(Uri uri) {
        Intent makeMainSelectorActivity;
        pc.j.e(uri, "uri");
        a fromString = uri.getScheme() != null ? a.Companion.fromString(uri.getScheme()) : null;
        if (fromString == null) {
            fromString = a.HTTP;
            String uri2 = uri.toString();
            pc.j.d(uri2, "uri.toString()");
            if (!xc.h.n(uri2, "://", false)) {
                uri = Uri.parse("http://" + uri);
                pc.j.d(uri, "parse(\"http://$uri\")");
            }
        }
        int i10 = com.onesignal.common.a.$EnumSwitchMapping$0[fromString.ordinal()];
        if (i10 != 1) {
            makeMainSelectorActivity = (i10 == 2 || i10 == 3) ? new Intent("android.intent.action.VIEW", uri) : new Intent("android.intent.action.VIEW", uri);
        } else {
            makeMainSelectorActivity = Intent.makeMainSelectorActivity("android.intent.action.MAIN", "android.intent.category.APP_BROWSER");
            pc.j.d(makeMainSelectorActivity, "makeMainSelectorActivity…ent.CATEGORY_APP_BROWSER)");
            makeMainSelectorActivity.setData(uri);
        }
        makeMainSelectorActivity.addFlags(268435456);
        return makeMainSelectorActivity;
    }

    public final void openURLInBrowser(Context context, String str) {
        pc.j.e(context, "appContext");
        pc.j.e(str, "url");
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = pc.j.f(str.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                } else {
                    length--;
                }
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        Uri parse = Uri.parse(str.subSequence(i10, length + 1).toString());
        pc.j.d(parse, "parse(url.trim { it <= ' ' })");
        openURLInBrowser(context, parse);
    }
}
