package com.squareup.cash.profile.views;

import android.content.Context;
import android.net.Uri;
import android.provider.ContactsContract;
import com.squareup.cash.permissions.PermissionChecker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ProfilePhotoResolver {
    public Uri cachedKey;
    public Uri cachedValue;
    public final Context context;
    public final PermissionChecker permissionChecker;
    public final ProfilePhotoUrlRegistry profilePhotoUrlRegistry;
    public static final Uri URI = ContactsContract.Profile.CONTENT_URI;
    public static final String[] PROJECTION = {"photo_uri"};

    /* loaded from: classes4.dex */
    public final class Result {
        public final Uri uri;
        public final boolean wasCached;

        public Result(boolean z, Uri uri) {
            uri.getClass();
            this.uri = uri;
            this.wasCached = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Result)) {
                return false;
            }
            Result result = (Result) obj;
            return Intrinsics.areEqual(this.uri, result.uri) && this.wasCached == result.wasCached;
        }

        public final Uri getUri() {
            return this.uri;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.wasCached) + (this.uri.hashCode() * 31);
        }

        public final String toString() {
            return "Result(uri=" + this.uri + ", wasCached=" + this.wasCached + ")";
        }
    }

    public ProfilePhotoResolver(Context context, PermissionChecker permissionChecker, ProfilePhotoUrlRegistry profilePhotoUrlRegistry) {
        this.context = context;
        this.permissionChecker = permissionChecker;
        this.profilePhotoUrlRegistry = profilePhotoUrlRegistry;
    }
}
