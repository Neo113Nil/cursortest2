package com.bumptech.glide.load.data.mediastore;

import android.net.Uri;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;

/* loaded from: classes4.dex */
public abstract class MediaStoreUtil {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewLoanRepayDeprecated.deepLinkSpecs;
    }

    public static boolean isMediaStoreUri(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }
}
