package com.braze.ui.support;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.b2$$ExternalSyntheticLambda0;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.support.BrazeLogger;
import com.braze.ui.BrazeDeeplinkHandler;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0016\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0003*\u00020\u0004\u001a\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u001a\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"TAG", "", "getQueryParameters", "", "Landroid/net/Uri;", "getMainActivityIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "extras", "Landroid/os/Bundle;", "isActivityRegisteredInManifest", "", "className", "android-sdk-ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class UriUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("UriUtils");

    public static final Intent getMainActivityIntent(Context context, Bundle bundle) {
        context.getClass();
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setFlags(BrazeDeeplinkHandler.INSTANCE.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_UTILS_GET_MAIN_ACTIVITY_INTENT));
        }
        if (bundle != null && launchIntentForPackage != null) {
            launchIntentForPackage.putExtras(bundle);
        }
        return launchIntentForPackage;
    }

    public static final Map<String, String> getQueryParameters(Uri uri) {
        uri.getClass();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = uri;
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new b2$$ExternalSyntheticLambda0(10, ref$ObjectRef), 12, (Object) null);
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            return emptyMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            if (((Uri) ref$ObjectRef.element).isOpaque()) {
                Uri build = Uri.parse("://").buildUpon().encodedQuery(encodedQuery).build();
                build.getClass();
                ref$ObjectRef.element = build;
            }
            Set<String> queryParameterNames = ((Uri) ref$ObjectRef.element).getQueryParameterNames();
            queryParameterNames.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj : queryParameterNames) {
                String str = (String) obj;
                if (str != null && str.length() != 0) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String queryParameter = ((Uri) ref$ObjectRef.element).getQueryParameter(str2);
                if (queryParameter != null && queryParameter.length() != 0) {
                    linkedHashMap.put(str2, queryParameter);
                }
            }
            return linkedHashMap;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new b2$$ExternalSyntheticLambda0(11, ref$ObjectRef), 8, (Object) null);
            return linkedHashMap;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getQueryParameters$lambda$0(Ref$ObjectRef ref$ObjectRef) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Encoded query is null for Uri: ", " Returning empty map for query parameters", ref$ObjectRef.element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getQueryParameters$lambda$2(Ref$ObjectRef ref$ObjectRef) {
        return Boxes$$ExternalSyntheticOutline1.m("Failed to map the query parameters of Uri: ", ref$ObjectRef.element);
    }

    public static final boolean isActivityRegisteredInManifest(Context context, String str) {
        context.getClass();
        str.getClass();
        int i = 0;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                context.getPackageManager().getActivityInfo(new ComponentName(context, str), PackageManager.ComponentInfoFlags.of(0L));
                return true;
            }
            context.getPackageManager().getActivityInfo(new ComponentName(context, str), 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new UriUtils$$ExternalSyntheticLambda2(str, i), 8, (Object) null);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isActivityRegisteredInManifest$lambda$0(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Could not find activity info for class with name: ", str);
    }
}
