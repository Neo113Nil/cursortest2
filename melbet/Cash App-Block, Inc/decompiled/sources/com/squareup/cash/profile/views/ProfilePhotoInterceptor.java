package com.squareup.cash.profile.views;

import android.database.Cursor;
import android.net.Uri;
import android.util.LruCache;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.intercept.Interceptor;
import coil3.request.ErrorResult;
import coil3.request.ImageRequest;
import com.squareup.cash.contacts.photo.ContactPhotoResolver;
import com.squareup.cash.contacts.photo.ContactPhotoResolver$Result$Error;
import com.squareup.cash.contacts.photo.ContactPhotoResolver$Result$Success;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.profile.ProfileQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.db2.profile.ProfileQueries$selectPhotoUrl$2;
import com.squareup.cash.db2.profile.SelectPhotoUrl;
import com.squareup.cash.notification.photo.NotificationPhotoInterceptor$intercept$1;
import com.squareup.cash.profile.views.ProfilePhotoResolver;
import com.squareup.util.coil.UtilsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import net.oneformapp.ProfileStore_;
import okio.Utf8;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import retrofit2.OkHttpCall;

/* loaded from: classes.dex */
public final class ProfilePhotoInterceptor implements Interceptor {
    public final /* synthetic */ int $r8$classId;
    public final Object resolver;

    public /* synthetic */ ProfilePhotoInterceptor(Object obj, int i) {
        this.$r8$classId = i;
        this.resolver = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
    
        if (r0 == r2) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015f  */
    @Override // coil3.intercept.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object intercept(ProfileStore_ profileStore_, ContinuationImpl continuationImpl) {
        Uri parse;
        String string2;
        Object obj;
        final Uri uri;
        NotificationPhotoInterceptor$intercept$1 notificationPhotoInterceptor$intercept$1;
        int i;
        Uri uri2;
        ProfileStore_ profileStore_2 = profileStore_;
        int i2 = this.$r8$classId;
        final boolean z = false;
        Object obj2 = this.resolver;
        final boolean z2 = true;
        ProfilePhotoResolver.Result result = null;
        switch (i2) {
            case 0:
                ProfilePhotoResolver profilePhotoResolver = (ProfilePhotoResolver) obj2;
                Uri dataUriOrNull = UtilsKt.dataUriOrNull(profileStore_2.getRequest());
                if (dataUriOrNull == null || !"profile".equals(dataUriOrNull.getScheme())) {
                    return profileStore_.proceed(continuationImpl);
                }
                if (dataUriOrNull.equals(profilePhotoResolver.cachedKey)) {
                    Uri uri3 = profilePhotoResolver.cachedValue;
                    if (uri3 != Uri.EMPTY && uri3 != null) {
                        result = new ProfilePhotoResolver.Result(true, uri3);
                    }
                } else {
                    List list = CollectionsKt.toList(profilePhotoResolver.profilePhotoUrlRegistry.activeProviders);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        InstrumentQueries instrumentQueries = ((ProfilePhotoUrlProvider) it.next()).cashDatabase.profileQueries;
                        instrumentQueries.getClass();
                        ProfileQueries$selectPhotoUrl$2 profileQueries$selectPhotoUrl$2 = ProfileQueries$selectPhotoUrl$2.INSTANCE;
                        SqlDriver sqlDriver = instrumentQueries.driver;
                        ProfileQueries$$ExternalSyntheticLambda4 profileQueries$$ExternalSyntheticLambda4 = new ProfileQueries$$ExternalSyntheticLambda4();
                        sqlDriver.getClass();
                        String photo_url = ((SelectPhotoUrl) new SimpleQuery(84512947, new String[]{"profile"}, sqlDriver, "Profile.sq", "selectPhotoUrl", "SELECT photo_url\nFROM profile", profileQueries$$ExternalSyntheticLambda4).executeAsOne()).getPhoto_url();
                        if (photo_url != null) {
                            arrayList.add(photo_url);
                        }
                    }
                    String str = (String) CollectionsKt.firstOrNull((List) arrayList);
                    if (str == null) {
                        if (dataUriOrNull.getBooleanQueryParameter("local", true) && profilePhotoResolver.permissionChecker.hasProfile()) {
                            Cursor query = profilePhotoResolver.context.getContentResolver().query(ProfilePhotoResolver.URI, ProfilePhotoResolver.PROJECTION, null, null, null);
                            if (query != null) {
                                try {
                                    if (query.moveToFirst() && (string2 = query.getString(0)) != null) {
                                        parse = Uri.parse(string2);
                                        query.close();
                                    }
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        Utf8.closeFinally(query, th);
                                        throw th2;
                                    }
                                }
                            }
                            Utf8.closeFinally(query, null);
                        }
                        parse = null;
                    } else {
                        parse = Uri.parse(str);
                    }
                    if (parse != null) {
                        profilePhotoResolver.cachedKey = dataUriOrNull;
                        profilePhotoResolver.cachedValue = parse;
                        result = new ProfilePhotoResolver.Result(false, parse);
                    } else {
                        profilePhotoResolver.cachedKey = dataUriOrNull;
                        profilePhotoResolver.cachedValue = Uri.EMPTY;
                    }
                }
                if (result == null) {
                    return new ErrorResult(profileStore_2.getRequest().error(), profileStore_2.getRequest(), new IllegalArgumentException("Unable to resolve profile URI"));
                }
                ImageRequest.Builder newBuilder$default = ImageRequest.newBuilder$default(profileStore_2.getRequest());
                newBuilder$default.data(result.getUri());
                return profileStore_2.withRequest(newBuilder$default.build()).proceed(continuationImpl);
            case 1:
                Uri dataUriOrNull2 = UtilsKt.dataUriOrNull(profileStore_2.getRequest());
                if (dataUriOrNull2 == null || !"contact".equals(dataUriOrNull2.getScheme())) {
                    return profileStore_.proceed(continuationImpl);
                }
                ContactPhotoResolver contactPhotoResolver = (ContactPhotoResolver) obj2;
                LruCache lruCache = contactPhotoResolver.uriCache;
                String query2 = dataUriOrNull2.getQuery();
                if (contactPhotoResolver.permissionChecker.hasContacts() && query2 != null) {
                    try {
                        uri = (Uri) lruCache.get(dataUriOrNull2);
                    } catch (Exception e) {
                        obj = new Object(e) { // from class: com.squareup.cash.contacts.photo.ContactPhotoResolver$Result$Error
                            public final Exception exception;

                            {
                                this.exception = e;
                            }

                            public final boolean equals(Object obj3) {
                                if (this == obj3) {
                                    return true;
                                }
                                return (obj3 instanceof ContactPhotoResolver$Result$Error) && this.exception.equals(((ContactPhotoResolver$Result$Error) obj3).exception);
                            }

                            public final Exception getException() {
                                return this.exception;
                            }

                            public final int hashCode() {
                                return this.exception.hashCode();
                            }

                            public final String toString() {
                                return "Error(exception=" + this.exception + ")";
                            }
                        };
                    }
                    if (uri == null) {
                        final Uri photoUri = contactPhotoResolver.getPhotoUri(query2);
                        lruCache.put(dataUriOrNull2, photoUri == null ? Uri.EMPTY : photoUri);
                        if (photoUri != null) {
                            obj = new Object(z, photoUri) { // from class: com.squareup.cash.contacts.photo.ContactPhotoResolver$Result$Success
                                public final boolean cached;
                                public final Uri photoUri;

                                {
                                    this.photoUri = photoUri;
                                    this.cached = z;
                                }

                                public final boolean equals(Object obj3) {
                                    if (this == obj3) {
                                        return true;
                                    }
                                    if (!(obj3 instanceof ContactPhotoResolver$Result$Success)) {
                                        return false;
                                    }
                                    ContactPhotoResolver$Result$Success contactPhotoResolver$Result$Success = (ContactPhotoResolver$Result$Success) obj3;
                                    return this.photoUri.equals(contactPhotoResolver$Result$Success.photoUri) && this.cached == contactPhotoResolver$Result$Success.cached;
                                }

                                public final Uri getPhotoUri() {
                                    return this.photoUri;
                                }

                                public final int hashCode() {
                                    return Boolean.hashCode(this.cached) + (this.photoUri.hashCode() * 31);
                                }

                                public final String toString() {
                                    return "Success(photoUri=" + this.photoUri + ", cached=" + this.cached + ")";
                                }
                            };
                            if (obj != null || (obj instanceof ContactPhotoResolver$Result$Error)) {
                                ContactPhotoResolver$Result$Error contactPhotoResolver$Result$Error = (ContactPhotoResolver$Result$Error) obj;
                                return new ErrorResult(profileStore_2.getRequest().error(), profileStore_2.getRequest(), contactPhotoResolver$Result$Error != null ? contactPhotoResolver$Result$Error.getException() : new IOException("Failed to resolve photo URI"));
                            }
                            if (!(obj instanceof ContactPhotoResolver$Result$Success)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            ImageRequest.Builder newBuilder$default2 = ImageRequest.newBuilder$default(profileStore_2.getRequest());
                            newBuilder$default2.data(((ContactPhotoResolver$Result$Success) obj).getPhotoUri());
                            return profileStore_2.withRequest(newBuilder$default2.build()).proceed(continuationImpl);
                        }
                    } else if (!uri.equals(Uri.EMPTY)) {
                        obj = new Object(z2, uri) { // from class: com.squareup.cash.contacts.photo.ContactPhotoResolver$Result$Success
                            public final boolean cached;
                            public final Uri photoUri;

                            {
                                this.photoUri = uri;
                                this.cached = z2;
                            }

                            public final boolean equals(Object obj3) {
                                if (this == obj3) {
                                    return true;
                                }
                                if (!(obj3 instanceof ContactPhotoResolver$Result$Success)) {
                                    return false;
                                }
                                ContactPhotoResolver$Result$Success contactPhotoResolver$Result$Success = (ContactPhotoResolver$Result$Success) obj3;
                                return this.photoUri.equals(contactPhotoResolver$Result$Success.photoUri) && this.cached == contactPhotoResolver$Result$Success.cached;
                            }

                            public final Uri getPhotoUri() {
                                return this.photoUri;
                            }

                            public final int hashCode() {
                                return Boolean.hashCode(this.cached) + (this.photoUri.hashCode() * 31);
                            }

                            public final String toString() {
                                return "Success(photoUri=" + this.photoUri + ", cached=" + this.cached + ")";
                            }
                        };
                        if (obj != null) {
                        }
                        ContactPhotoResolver$Result$Error contactPhotoResolver$Result$Error2 = (ContactPhotoResolver$Result$Error) obj;
                        return new ErrorResult(profileStore_2.getRequest().error(), profileStore_2.getRequest(), contactPhotoResolver$Result$Error2 != null ? contactPhotoResolver$Result$Error2.getException() : new IOException("Failed to resolve photo URI"));
                    }
                }
                obj = null;
                if (obj != null) {
                }
                ContactPhotoResolver$Result$Error contactPhotoResolver$Result$Error22 = (ContactPhotoResolver$Result$Error) obj;
                return new ErrorResult(profileStore_2.getRequest().error(), profileStore_2.getRequest(), contactPhotoResolver$Result$Error22 != null ? contactPhotoResolver$Result$Error22.getException() : new IOException("Failed to resolve photo URI"));
            default:
                if (continuationImpl instanceof NotificationPhotoInterceptor$intercept$1) {
                    notificationPhotoInterceptor$intercept$1 = (NotificationPhotoInterceptor$intercept$1) continuationImpl;
                    int i3 = notificationPhotoInterceptor$intercept$1.label;
                    if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                        notificationPhotoInterceptor$intercept$1.label = i3 - PKIFailureInfo.systemUnavail;
                        Object obj3 = notificationPhotoInterceptor$intercept$1.result;
                        Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = notificationPhotoInterceptor$intercept$1.label;
                        if (i == 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    profileStore_2 = notificationPhotoInterceptor$intercept$1.L$0;
                                    SafeTrace.throwOnFailure(obj3);
                                } else if (i != 3) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            }
                            SafeTrace.throwOnFailure(obj3);
                            return obj3;
                        }
                        SafeTrace.throwOnFailure(obj3);
                        Uri dataUriOrNull3 = UtilsKt.dataUriOrNull(profileStore_2.getRequest());
                        if (dataUriOrNull3 != null && "notification".equals(dataUriOrNull3.getScheme())) {
                            notificationPhotoInterceptor$intercept$1.L$0 = profileStore_2;
                            notificationPhotoInterceptor$intercept$1.label = 2;
                            obj3 = ((OkHttpCall.AnonymousClass1) obj2).resolve(dataUriOrNull3, notificationPhotoInterceptor$intercept$1);
                            break;
                        } else {
                            notificationPhotoInterceptor$intercept$1.L$0 = null;
                            notificationPhotoInterceptor$intercept$1.label = 1;
                            Object proceed = profileStore_2.proceed(notificationPhotoInterceptor$intercept$1);
                            if (proceed != obj4) {
                                return proceed;
                            }
                        }
                        return obj4;
                        uri2 = (Uri) obj3;
                        if (uri2 != null) {
                            return new ErrorResult(profileStore_2.getRequest().error(), profileStore_2.getRequest(), new IOException("Failed to resolve photo URI"));
                        }
                        ImageRequest.Builder newBuilder$default3 = ImageRequest.newBuilder$default(profileStore_2.getRequest());
                        newBuilder$default3.data(uri2);
                        ProfileStore_ withRequest = profileStore_2.withRequest(newBuilder$default3.build());
                        notificationPhotoInterceptor$intercept$1.L$0 = null;
                        notificationPhotoInterceptor$intercept$1.label = 3;
                        Object proceed2 = withRequest.proceed(notificationPhotoInterceptor$intercept$1);
                        if (proceed2 != obj4) {
                            return proceed2;
                        }
                        return obj4;
                    }
                }
                notificationPhotoInterceptor$intercept$1 = new NotificationPhotoInterceptor$intercept$1(this, continuationImpl);
                Object obj32 = notificationPhotoInterceptor$intercept$1.result;
                Object obj42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = notificationPhotoInterceptor$intercept$1.label;
                if (i == 0) {
                }
                uri2 = (Uri) obj32;
                if (uri2 != null) {
                }
                break;
        }
    }
}
