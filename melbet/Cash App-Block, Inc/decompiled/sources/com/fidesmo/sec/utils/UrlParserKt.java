package com.fidesmo.sec.utils;

import android.net.Uri;
import android.util.Base64;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.fidesmo.sec.utils.FidesmoUrlSchemaType;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\u0014\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003H\u0002\u001a\u001c\u0010\u0018\u001a\u00020\u0019*\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001b\u001a\u00020\u0003\u001a\u0012\u0010\u001c\u001a\u00020\u0003*\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"appIdIndex", "", "fidesmoHost", "", "fidesmoPayAppId", "fidesmoPayStagingAppId", "fidesmoScheme", "fidesmoSchemeQuery", "fidesmoStagingHost", "masterCardCallback", "pushProvisioningAppIds", "", "pushProvisioningServiceId", "serviceIdIndex", "visaCallback", "webActivationIndex", "webActivationPath", "buildCallbackUrl", UrlParserKt.masterCardCallback, "pushAccountReceipts", "result", "isServiceUrl", "", "path", "addUriParameter", "Landroid/net/Uri;", "key", "newValue", "getCallback", "Lcom/fidesmo/sec/utils/FidesmoUrlSchemaType$PushProvisioningUrl;", "reason", "Lcom/fidesmo/sec/utils/PushProvisioningFailedReason;", "sec-client-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UrlParserKt {
    private static final int appIdIndex = 0;
    private static final String fidesmoHost = "apps.fidesmo.com";
    private static final String fidesmoScheme = "fidesmo://";
    public static final String fidesmoSchemeQuery = "fidesmoscheme";
    private static final String fidesmoStagingHost = "apps-staging.fidesmo.com";
    public static final String masterCardCallback = "callbackUrl";
    private static final String pushProvisioningServiceId = "install-push";
    private static final int serviceIdIndex = 2;
    public static final String visaCallback = "wpcallback";
    private static final int webActivationIndex = 0;
    private static final String webActivationPath = "webactivation";
    private static final String fidesmoPayAppId = "f374c57e";
    private static final String fidesmoPayStagingAppId = "af1cc990";
    private static final List<String> pushProvisioningAppIds = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{fidesmoPayAppId, fidesmoPayStagingAppId});

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PushProvisioningFailedReason.values().length];
            try {
                iArr[PushProvisioningFailedReason.Cancelled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PushProvisioningFailedReason.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Uri addUriParameter(Uri uri, String str, String str2) {
        uri.getClass();
        str2.getClass();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        boolean z = false;
        for (String str3 : queryParameterNames) {
            clearQuery.appendQueryParameter(str3, Intrinsics.areEqual(str3, str) ? str2 : uri.getQueryParameter(str3));
            if (Intrinsics.areEqual(str3, str)) {
                z = true;
            }
        }
        if (!z) {
            clearQuery.appendQueryParameter(str, str2);
        }
        Uri build = clearQuery.build();
        build.getClass();
        return build;
    }

    private static final String buildCallbackUrl(String str, List<String> list, final String str2) {
        if (list.isEmpty()) {
            return str;
        }
        String query = new URI(str).getQuery();
        return Recorder$$ExternalSyntheticOutline2.m(str, (query == null || query.length() == 0) ? "?" : "&", CollectionsKt.joinToString$default(list, "&", null, null, 0, null, new Function1<String, CharSequence>() { // from class: com.fidesmo.sec.utils.UrlParserKt$buildCallbackUrl$queryString$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(String str3) {
                str3.getClass();
                return "results%5B" + str3 + "%5D=" + str2;
            }
        }, 30));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ce, code lost:
    
        r8 = kotlin.text.StringsKt__StringsKt.split$default(r8, new java.lang.String[]{","}, false, 0, 6, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String getCallback(FidesmoUrlSchemaType.PushProvisioningUrl pushProvisioningUrl, PushProvisioningFailedReason pushProvisioningFailedReason) {
        String str;
        String str2;
        List split$default;
        Pair pair;
        List split$default2;
        JsonArray asJsonArray;
        pushProvisioningUrl.getClass();
        pushProvisioningFailedReason.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[pushProvisioningFailedReason.ordinal()];
        if (i == 1) {
            str = "CANCELLED";
        } else {
            if (i != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            str = "ERROR";
        }
        Map<String, String> queryParams = pushProvisioningUrl.getQueryParams();
        if (queryParams == null || !queryParams.containsKey("pushAccountData")) {
            Map<String, String> queryParams2 = pushProvisioningUrl.getQueryParams();
            if (queryParams2 == null || (str2 = queryParams2.get("callbackURL")) == null) {
                return "";
            }
            String str3 = pushProvisioningUrl.getQueryParams().get("pushAccountReceipts");
            if (str3 == null || split$default == null) {
                return str2;
            }
            pair = new Pair(str2, split$default);
        } else {
            String str4 = pushProvisioningUrl.getQueryParams().get("pushAccountData");
            if (str4 == null) {
                return "";
            }
            split$default2 = StringsKt__StringsKt.split$default(str4, new String[]{"."}, false, 0, 6, null);
            String str5 = (String) CollectionsKt.getOrNull(1, split$default2);
            if (str5 == null) {
                return "";
            }
            byte[] decode = Base64.decode(str5, 0);
            decode.getClass();
            JsonObject asJsonObject = new JsonParser().parse(new String(decode, Charsets.UTF_8)).getAsJsonObject();
            JsonElement jsonElement = asJsonObject.get("callbackURL");
            String asString = jsonElement != null ? jsonElement.getAsString() : null;
            if (asString == null) {
                return "";
            }
            JsonElement jsonElement2 = asJsonObject.get("pushAccountReceipts");
            if (jsonElement2 == null || (asJsonArray = jsonElement2.getAsJsonArray()) == null) {
                return asString;
            }
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(asJsonArray, 10));
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getAsString());
            }
            pair = new Pair(asString, arrayList);
        }
        return buildCallbackUrl((String) pair.first, (List) pair.second, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isServiceUrl(String str) {
        return new Regex("/([A-Za-z0-9_-]+)/services/([A-Za-z0-9_-]+)").matches(str);
    }
}
