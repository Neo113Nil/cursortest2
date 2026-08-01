package D1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;
import s1.g;
import s1.h;
import s1.j;
import u1.x;

/* loaded from: classes.dex */
public final class c implements j {

    /* renamed from: b, reason: collision with root package name */
    public static final g f625b = new g("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, g.f40452e);

    /* renamed from: a, reason: collision with root package name */
    public final Context f626a;

    public c(Context context) {
        this.f626a = context.getApplicationContext();
    }

    @Override // s1.j
    public final /* bridge */ /* synthetic */ x a(Object obj, int i, int i6, h hVar) {
        return c((Uri) obj, hVar);
    }

    @Override // s1.j
    public final boolean b(Object obj, h hVar) {
        String scheme = ((Uri) obj).getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final x c(Uri uri, h hVar) {
        Context createPackageContext;
        List<String> pathSegments;
        int parseInt;
        Drawable f3;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException("Package name for " + uri + " is null or empty");
        }
        Context context = this.f626a;
        if (!authority.equals(context.getPackageName())) {
            try {
                createPackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e9) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e9);
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
                    parseInt = Resources.getSystem().getIdentifier(str2, str, com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID);
                }
                if (parseInt == 0) {
                    throw new IllegalArgumentException("Failed to find resource id for: " + uri);
                }
            } else {
                if (pathSegments.size() != 1) {
                    throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
                }
                try {
                    parseInt = Integer.parseInt(uri.getPathSegments().get(0));
                } catch (NumberFormatException e10) {
                    throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e10);
                }
            }
            Resources.Theme theme = !authority.equals(context.getPackageName()) ? (Resources.Theme) hVar.c(f625b) : null;
            f3 = theme != null ? d6.c.f(context, createPackageContext, parseInt, null) : d6.c.f(context, context, parseInt, theme);
            if (f3 == null) {
                return new b(f3, 0);
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
        if (f3 == null) {
        }
    }
}
