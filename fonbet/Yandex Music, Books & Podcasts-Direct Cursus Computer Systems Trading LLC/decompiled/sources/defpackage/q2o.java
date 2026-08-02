package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.List;

/* loaded from: classes.dex */
public final class q2o implements o2o {
    public static final cvj b = new cvj("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, cvj.e);
    public final Context a;

    public q2o(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.o2o
    public final boolean a(Object obj, pwj pwjVar) {
        String scheme = ((Uri) obj).getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    @Override // defpackage.o2o
    public final /* bridge */ /* synthetic */ k2o b(Object obj, int i, int i2, pwj pwjVar) {
        return c((Uri) obj, pwjVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k2o c(Uri uri, pwj pwjVar) {
        Context createPackageContext;
        List<String> pathSegments;
        int parseInt;
        Drawable v;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            rj7.n(uri, " is null or empty", "Package name for ");
            return null;
        }
        Context context = this.a;
        if (!authority.equals(context.getPackageName())) {
            try {
                createPackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException(k5r.k(uri, "Failed to obtain context or unrecognized Uri format for: "), e);
                }
            }
            pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                List<String> pathSegments2 = uri.getPathSegments();
                String authority2 = uri.getAuthority();
                String str = pathSegments2.get(0);
                String str2 = pathSegments2.get(1);
                parseInt = createPackageContext.getResources().getIdentifier(str2, str, authority2);
                if (parseInt == 0) {
                    parseInt = Resources.getSystem().getIdentifier(str2, str, ConstantDeviceInfo.APP_PLATFORM);
                }
                if (parseInt == 0) {
                    xq0.x(k5r.k(uri, "Failed to find resource id for: "));
                    return null;
                }
            } else {
                if (pathSegments.size() != 1) {
                    xq0.x(k5r.k(uri, "Unrecognized Uri format: "));
                    return null;
                }
                try {
                    parseInt = Integer.parseInt(uri.getPathSegments().get(0));
                } catch (NumberFormatException e2) {
                    throw new IllegalArgumentException(k5r.k(uri, "Unrecognized Uri format: "), e2);
                }
            }
            Resources.Theme theme = !authority.equals(context.getPackageName()) ? (Resources.Theme) pwjVar.c(b) : null;
            v = theme != null ? sj2.v(context, createPackageContext, parseInt, null) : sj2.v(context, context, parseInt, theme);
            if (v == null) {
                return new qcd(v, 1);
            }
            return null;
        }
        createPackageContext = context;
        pathSegments = uri.getPathSegments();
        if (pathSegments.size() != 2) {
        }
        if (!authority.equals(context.getPackageName())) {
        }
        if (theme != null) {
        }
        if (v == null) {
        }
    }
}
