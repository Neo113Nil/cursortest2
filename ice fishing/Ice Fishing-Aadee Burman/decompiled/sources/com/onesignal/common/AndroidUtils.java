package com.onesignal.common;

import Q7.q;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.UserManager;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import v7.AbstractC5130k;

/* loaded from: classes2.dex */
public final class AndroidUtils {
    public static final AndroidUtils INSTANCE = new AndroidUtils();
    private static final int androidSDKInt = Build.VERSION.SDK_INT;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ C7.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final C0174a Companion;
        private final String text;
        public static final a DATA = new a("DATA", 0, "data");
        public static final a HTTPS = new a("HTTPS", 1, "https");
        public static final a HTTP = new a("HTTP", 2, "http");

        /* renamed from: com.onesignal.common.AndroidUtils$a$a, reason: collision with other inner class name */
        public static final class C0174a {
            public /* synthetic */ C0174a(kotlin.jvm.internal.e eVar) {
                this();
            }

            public final a fromString(String str) {
                for (a aVar : a.values()) {
                    if (q.L(aVar.text, str)) {
                        return aVar;
                    }
                }
                return null;
            }

            private C0174a() {
            }
        }

        private static final /* synthetic */ a[] $values() {
            return new a[]{DATA, HTTPS, HTTP};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = com.bumptech.glide.e.b($values);
            Companion = new C0174a(null);
        }

        private a(String str, int i, String str2) {
            this.text = str2;
        }

        public static C7.a getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    private AndroidUtils() {
    }

    public final List<String> filterManifestPermissions(List<String> permissions, x4.f applicationService) {
        kotlin.jvm.internal.h.e(permissions, "permissions");
        kotlin.jvm.internal.h.e(applicationService, "applicationService");
        PackageInfo packageInfo = applicationService.getAppContext().getPackageManager().getPackageInfo(applicationService.getAppContext().getPackageName(), 4096);
        kotlin.jvm.internal.h.d(packageInfo, "getPackageInfo(...)");
        String[] requestedPermissions = packageInfo.requestedPermissions;
        kotlin.jvm.internal.h.d(requestedPermissions, "requestedPermissions");
        List v9 = AbstractC5130k.v(Arrays.copyOf(requestedPermissions, requestedPermissions.length));
        ArrayList arrayList = new ArrayList();
        for (Object obj : permissions) {
            if (v9.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void finishSafely(Activity activity) {
        kotlin.jvm.internal.h.e(activity, "activity");
        if (activity.isDestroyed() || activity.isFinishing()) {
            return;
        }
        activity.finish();
    }

    public final int getAndroidSDKInt() {
        return androidSDKInt;
    }

    public final String getAppVersion(Context context) {
        Integer num;
        kotlin.jvm.internal.h.e(context, "context");
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
        kotlin.jvm.internal.h.e(context, "context");
        Bundle manifestMetaBundle = getManifestMetaBundle(context);
        if (manifestMetaBundle != null) {
            return manifestMetaBundle.getString(str);
        }
        return null;
    }

    public final boolean getManifestMetaBoolean(Context context, String str) {
        kotlin.jvm.internal.h.e(context, "context");
        Bundle manifestMetaBundle = getManifestMetaBundle(context);
        if (manifestMetaBundle != null) {
            return manifestMetaBundle.getBoolean(str);
        }
        return false;
    }

    public final Bundle getManifestMetaBundle(Context context) {
        kotlin.jvm.internal.h.e(context, "context");
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            kotlin.jvm.internal.h.d(applicationInfo, "getApplicationInfo(...)");
            return applicationInfo.metaData;
        } catch (PackageManager.NameNotFoundException e9) {
            com.onesignal.debug.internal.logging.b.error("Manifest application info not found", e9);
            return null;
        }
    }

    public final int getRandomDelay(int i, int i6) {
        return new Random().nextInt((i6 + 1) - i) + i;
    }

    public final String getResourceString(Context context, String str, String str2) {
        kotlin.jvm.internal.h.e(context, "context");
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str, com.anythink.expressad.foundation.h.k.f19636g, context.getPackageName());
        return identifier != 0 ? resources.getString(identifier) : str2;
    }

    public final String getRootCauseMessage(Throwable throwable) {
        kotlin.jvm.internal.h.e(throwable, "throwable");
        return getRootCauseThrowable(throwable).getMessage();
    }

    public final Throwable getRootCauseThrowable(Throwable subjectThrowable) {
        kotlin.jvm.internal.h.e(subjectThrowable, "subjectThrowable");
        while (subjectThrowable.getCause() != null && subjectThrowable.getCause() != subjectThrowable) {
            subjectThrowable = subjectThrowable.getCause();
            kotlin.jvm.internal.h.b(subjectThrowable);
        }
        return subjectThrowable;
    }

    public final int getTargetSdkVersion(Context context) {
        kotlin.jvm.internal.h.e(context, "context");
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
            kotlin.jvm.internal.h.d(applicationInfo, "getApplicationInfo(...)");
            return applicationInfo.targetSdkVersion;
        } catch (PackageManager.NameNotFoundException e9) {
            e9.printStackTrace();
            return 21;
        }
    }

    public final boolean hasConfigChangeFlag(Activity activity, int i) {
        kotlin.jvm.internal.h.e(activity, "activity");
        try {
            return (activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).configChanges & i) != 0;
        } catch (PackageManager.NameNotFoundException e9) {
            e9.printStackTrace();
            return false;
        }
    }

    public final boolean hasNotificationManagerCompat() {
        return true;
    }

    public final boolean hasPermission(String permission, boolean z3, x4.f applicationService) {
        kotlin.jvm.internal.h.e(permission, "permission");
        kotlin.jvm.internal.h.e(applicationService, "applicationService");
        try {
            PackageInfo packageInfo = applicationService.getAppContext().getPackageManager().getPackageInfo(applicationService.getAppContext().getPackageName(), 4096);
            kotlin.jvm.internal.h.d(packageInfo, "getPackageInfo(...)");
            String[] requestedPermissions = packageInfo.requestedPermissions;
            kotlin.jvm.internal.h.d(requestedPermissions, "requestedPermissions");
            if (!AbstractC5130k.v(Arrays.copyOf(requestedPermissions, requestedPermissions.length)).contains(permission)) {
                return false;
            }
            if (z3) {
                return E.e.a(applicationService.getAppContext(), permission) != -1;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e9) {
            e9.printStackTrace();
            return false;
        }
    }

    public final boolean isActivityFullyReady(Activity activity) {
        kotlin.jvm.internal.h.e(activity, "activity");
        boolean z3 = activity.getWindow().getDecorView().getApplicationWindowToken() != null;
        View decorView = activity.getWindow().getDecorView();
        kotlin.jvm.internal.h.d(decorView, "getDecorView(...)");
        return z3 && (decorView.getRootWindowInsets() != null);
    }

    public final boolean isAndroidUserUnlocked(Context appContext) {
        kotlin.jvm.internal.h.e(appContext, "appContext");
        Object systemService = appContext.getSystemService("user");
        UserManager userManager = systemService instanceof UserManager ? (UserManager) systemService : null;
        if (userManager != null) {
            return userManager.isUserUnlocked();
        }
        return true;
    }

    public final boolean isRunningOnMainThread() {
        return kotlin.jvm.internal.h.a(Thread.currentThread(), Looper.getMainLooper().getThread());
    }

    public final boolean isStringNotEmpty(String str) {
        return !TextUtils.isEmpty(str);
    }

    public final boolean isValidResourceName(String str) {
        if (str == null) {
            return false;
        }
        Pattern compile = Pattern.compile("^[0-9]");
        kotlin.jvm.internal.h.d(compile, "compile(...)");
        return !compile.matcher(str).matches();
    }

    @Keep
    public final boolean opaqueHasClass(Class<?> _class) {
        kotlin.jvm.internal.h.e(_class, "_class");
        return true;
    }

    public final void openURLInBrowser(Context appContext, Uri uri) {
        kotlin.jvm.internal.h.e(appContext, "appContext");
        kotlin.jvm.internal.h.e(uri, "uri");
        appContext.startActivity(openURLInBrowserIntent(uri));
    }

    public final Intent openURLInBrowserIntent(Uri uri) {
        Intent makeMainSelectorActivity;
        kotlin.jvm.internal.h.e(uri, "uri");
        a fromString = uri.getScheme() != null ? a.Companion.fromString(uri.getScheme()) : null;
        if (fromString == null) {
            fromString = a.HTTP;
            String uri2 = uri.toString();
            kotlin.jvm.internal.h.d(uri2, "toString(...)");
            if (!Q7.j.U(uri2, "://", false)) {
                uri = Uri.parse("http://" + uri);
                kotlin.jvm.internal.h.d(uri, "parse(...)");
            }
        }
        int i = com.onesignal.common.a.$EnumSwitchMapping$0[fromString.ordinal()];
        if (i != 1) {
            makeMainSelectorActivity = (i == 2 || i == 3) ? new Intent("android.intent.action.VIEW", uri) : new Intent("android.intent.action.VIEW", uri);
        } else {
            makeMainSelectorActivity = Intent.makeMainSelectorActivity("android.intent.action.MAIN", "android.intent.category.APP_BROWSER");
            kotlin.jvm.internal.h.d(makeMainSelectorActivity, "makeMainSelectorActivity(...)");
            makeMainSelectorActivity.setData(uri);
        }
        makeMainSelectorActivity.addFlags(268435456);
        return makeMainSelectorActivity;
    }

    public final void openURLInBrowser(Context appContext, String url) {
        kotlin.jvm.internal.h.e(appContext, "appContext");
        kotlin.jvm.internal.h.e(url, "url");
        int length = url.length() - 1;
        int i = 0;
        boolean z3 = false;
        while (i <= length) {
            boolean z6 = kotlin.jvm.internal.h.f(url.charAt(!z3 ? i : length), 32) <= 0;
            if (z3) {
                if (!z6) {
                    break;
                } else {
                    length--;
                }
            } else if (z6) {
                i++;
            } else {
                z3 = true;
            }
        }
        Uri parse = Uri.parse(url.subSequence(i, length + 1).toString());
        kotlin.jvm.internal.h.d(parse, "parse(...)");
        openURLInBrowser(appContext, parse);
    }
}
