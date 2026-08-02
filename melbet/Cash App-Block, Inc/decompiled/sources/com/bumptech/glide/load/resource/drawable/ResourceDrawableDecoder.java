package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.gif.GifDrawableResource;
import com.google.android.gms.internal.mlkit_vision_common.zzbs;
import java.util.List;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class ResourceDrawableDecoder implements ResourceDecoder {
    public static final Option THEME = new Option("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, Option.EMPTY_UPDATER);
    public final Context context;

    public ResourceDrawableDecoder(Context context) {
        this.context = context.getApplicationContext();
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
    public final Resource decode(Uri uri, Options options) {
        Context createPackageContext;
        List<String> pathSegments;
        int parseInt;
        Drawable drawable;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Package name for ", uri, " is null or empty");
            return null;
        }
        Context context = this.context;
        if (!authority.equals(context.getPackageName())) {
            try {
                createPackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                if (!authority.contains(context.getPackageName())) {
                    Handlers$$ExternalSyntheticBUOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(uri, "Failed to obtain context or unrecognized Uri format for: "), e);
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
                    parseInt = Resources.getSystem().getIdentifier(str2, str, "android");
                }
                if (parseInt == 0) {
                    a$$ExternalSyntheticBUOutline0.m$3(CameraState$Type$EnumUnboxingLocalUtility.m(uri, "Failed to find resource id for: "));
                    return null;
                }
            } else {
                if (pathSegments.size() != 1) {
                    a$$ExternalSyntheticBUOutline0.m$3(CameraState$Type$EnumUnboxingLocalUtility.m(uri, "Unrecognized Uri format: "));
                    return null;
                }
                try {
                    parseInt = Integer.parseInt(uri.getPathSegments().get(0));
                } catch (NumberFormatException e2) {
                    Handlers$$ExternalSyntheticBUOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(uri, "Unrecognized Uri format: "), e2);
                    return null;
                }
            }
            Resources.Theme theme = !authority.equals(context.getPackageName()) ? (Resources.Theme) options.get(THEME) : null;
            drawable = theme != null ? zzbs.getDrawable(context, createPackageContext, parseInt, null) : zzbs.getDrawable(context, context, parseInt, theme);
            if (drawable == null) {
                return new GifDrawableResource(drawable, 1);
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
        if (drawable == null) {
        }
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final boolean handles(Object obj, Options options) {
        String scheme = ((Uri) obj).getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final /* bridge */ /* synthetic */ Resource decode(Object obj, int i, int i2, Options options) {
        return decode((Uri) obj, options);
    }
}
