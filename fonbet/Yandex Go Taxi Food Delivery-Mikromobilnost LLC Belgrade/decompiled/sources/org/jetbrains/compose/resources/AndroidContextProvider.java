package org.jetbrains.compose.resources;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.ny61;
import defpackage.y82;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u0000 $2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJQ\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0010\u0010\u0012\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0011\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0010\u0010\u0014\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0011\u0018\u00010\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001d\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010 \u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0010\u0010\u0014\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0011\u0018\u00010\u0010H\u0016¢\u0006\u0004\b \u0010!J=\u0010\"\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0010\u0010\u0014\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0011\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lorg/jetbrains/compose/resources/AndroidContextProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "", "onCreate", "()Z", "Landroid/content/Context;", "context", "Landroid/content/pm/ProviderInfo;", "info", "Lzy11;", "attachInfo", "(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V", "Landroid/net/Uri;", LaunchBrowserActivity.KEY_URI, "", "", "projection", "selection", "selectionArgs", "sortOrder", "Landroid/database/Cursor;", "query", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "getType", "(Landroid/net/Uri;)Ljava/lang/String;", "Landroid/content/ContentValues;", "values", "insert", "(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;", "", "delete", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "Companion", "y82", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AndroidContextProvider extends ContentProvider {
    public static final int $stable = 0;
    private static Context ANDROID_CONTEXT;
    public static final y82 Companion = new y82();

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo info) {
        if (info == null) {
            ny61.t("AndroidContextProvider ProviderInfo cannot be null.");
        } else if ("org.jetbrains.compose.components.resources.resources.AndroidContextProvider".equals(info.authority)) {
            ny61.r("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable your application's build.gradle.");
        } else {
            super.attachInfo(context, info);
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues values) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        ANDROID_CONTEXT = getContext();
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        return 0;
    }
}
