package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.List;

/* loaded from: classes10.dex */
public final class utj0 implements rtj0 {
    public static final ce70 b = new ce70("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, ce70.e);
    public final Context a;

    public utj0(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.rtj0
    public final /* bridge */ /* synthetic */ otj0 a(Object obj, int i, int i2, mg70 mg70Var) {
        return c((Uri) obj, mg70Var);
    }

    @Override // defpackage.rtj0
    public final boolean b(Object obj, mg70 mg70Var) {
        String scheme = ((Uri) obj).getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final otj0 c(Uri uri, mg70 mg70Var) {
        Context createPackageContext;
        List<String> pathSegments;
        int parseInt;
        Drawable e;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            ny61.r(g8e.m(uri, "Package name for ", " is null or empty"));
            return null;
        }
        Context context = this.a;
        if (!authority.equals(context.getPackageName())) {
            try {
                createPackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e2) {
                if (!authority.contains(context.getPackageName())) {
                    yci0.p(unr0.n(uri, "Failed to obtain context or unrecognized Uri format for: "), e2);
                    return null;
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
                    ny61.g(unr0.n(uri, "Failed to find resource id for: "));
                    return null;
                }
            } else {
                if (pathSegments.size() != 1) {
                    ny61.g(unr0.n(uri, "Unrecognized Uri format: "));
                    return null;
                }
                try {
                    parseInt = Integer.parseInt(uri.getPathSegments().get(0));
                } catch (NumberFormatException e3) {
                    yci0.p(unr0.n(uri, "Unrecognized Uri format: "), e3);
                    return null;
                }
            }
            Resources.Theme theme = !authority.equals(context.getPackageName()) ? (Resources.Theme) mg70Var.c(b) : null;
            e = theme != null ? jm91.e(context, createPackageContext, parseInt, null) : jm91.e(context, context, parseInt, theme);
            if (e == null) {
                return new pgt(e, 1);
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
        if (e == null) {
        }
    }
}
