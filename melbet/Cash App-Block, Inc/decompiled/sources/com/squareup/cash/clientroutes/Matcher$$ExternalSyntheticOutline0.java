package com.squareup.cash.clientroutes;

import android.animation.ValueAnimator;
import android.net.Uri;
import android.os.Parcel;
import androidx.compose.ui.unit.Dp;
import androidx.room.TransactorKt;
import app.cash.api.ApiResult;
import app.cash.sqldelight.driver.android.AndroidCursor;
import com.google.android.gms.internal.mlkit_genai_prompt.zzms;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.BrowserOrigin;
import com.squareup.cash.cdf.browser.InfoContext;
import com.squareup.cash.formview.components.FormSpacings;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.ui.UiAvatar;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SharedFlowImpl;
import xyz.block.protos.genie.Expression;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class Matcher$$ExternalSyntheticOutline0 {
    public static Iterator m(Parcel parcel, int i, Map map) {
        parcel.writeInt(i);
        parcel.writeInt(map.size());
        return map.entrySet().iterator();
    }

    public static ApiResult.Success m(ResponseContext responseContext, ResponseContext responseContext2) {
        responseContext.getClass();
        return new ApiResult.Success(responseContext2);
    }

    public static Boolean m(Boolean bool, AndroidCursor androidCursor, int i) {
        bool.getClass();
        Boolean bool2 = androidCursor.getBoolean(i);
        bool2.getClass();
        return bool2;
    }

    public static Object m(ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        return animatedValue;
    }

    public static Object m(SharedFlowImpl sharedFlowImpl, zzms zzmsVar, Continuation continuation) {
        return FlowKt.collect(new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(sharedFlowImpl, zzmsVar, 0), continuation);
    }

    public static String m(BlockersData blockersData, String str, String str2) {
        return str + blockersData + str2;
    }

    public static String m(Boolean bool, String str, String str2) {
        return str + bool + str2;
    }

    public static String m(String str, AndroidCursor androidCursor, int i) {
        str.getClass();
        String string2 = androidCursor.getString(i);
        string2.getClass();
        return string2;
    }

    public static String m(String str, BlockerAction blockerAction, String str2) {
        return str + blockerAction + str2;
    }

    public static StringBuilder m(BlockersData blockersData, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(blockersData);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder m(BrowserOrigin browserOrigin, InfoContext infoContext, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(infoContext);
        sb.append(str2);
        sb.append(browserOrigin);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder m(ClientRouteSpec clientRouteSpec, String str, String str2, String str3, ArrayList arrayList) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(clientRouteSpec);
        sb.append(str2);
        sb.append(arrayList);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder m(ClientRouteSpec clientRouteSpec, String str, String str2, String str3, List list) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(clientRouteSpec);
        sb.append(str2);
        sb.append(list);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder m(Image image, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(image);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    public static int m(Expression expression, int i, int i2) {
        return (expression.hashCode() + i) * i2;
    }

    public static Pair m(float f, MapBuilder mapBuilder, Pair pair, FormSpacings.SpacingType spacingType, FormSpacings.SpacingType spacingType2) {
        mapBuilder.put(pair, new Dp(f));
        return new Pair(spacingType, spacingType2);
    }

    public static void m(float f, MapBuilder mapBuilder, Pair pair) {
        mapBuilder.put(pair, new Dp(f));
    }

    public static void m(String str, LocalizableString localizableString, ArrayList arrayList) {
        arrayList.add(str + localizableString);
    }

    public static void m(String str, LocalizedString localizedString, ArrayList arrayList) {
        arrayList.add(str + localizedString);
    }

    public static void m(String str, Icon icon, ArrayList arrayList) {
        arrayList.add(str + icon);
    }

    public static void m(String str, CurrencyCode currencyCode, ArrayList arrayList) {
        arrayList.add(str + currencyCode);
    }

    public static void m(String str, Money money, ArrayList arrayList) {
        arrayList.add(str + money);
    }

    public static void m(String str, ClientScenario clientScenario, ArrayList arrayList) {
        arrayList.add(str + clientScenario);
    }

    public static void m(String str, RequestContext requestContext, ArrayList arrayList) {
        arrayList.add(str + requestContext);
    }

    public static void m(String str, ResponseContext responseContext, ArrayList arrayList) {
        arrayList.add(str + responseContext);
    }

    public static void m(String str, UiAvatar uiAvatar, ArrayList arrayList) {
        arrayList.add(str + uiAvatar);
    }

    public static void m(String str, Instant instant, ArrayList arrayList) {
        arrayList.add(str + instant);
    }

    public static void m(String str, Expression expression, ArrayList arrayList) {
        arrayList.add(str + expression);
    }

    public static ClientRouteSpec m(DeepLinkSpec deepLinkSpec, ClientRouteSpec clientRouteSpec, AccountRequirement accountRequirement, AuthenticationRequirement authenticationRequirement) {
        return ClientRouteSpec.copy$default(clientRouteSpec, accountRequirement, authenticationRequirement, deepLinkSpec.clientRouteSpec.isDeprecated);
    }

    public static Map m(DeepLinkSpec deepLinkSpec, Uri uri, String str, boolean z) {
        return TransactorKt.matchWithAllParameters(uri, str, z, deepLinkSpec.clientRouteSpec.parameterNames);
    }
}
