package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1;
import androidx.camera.video.Recorder;
import androidx.constraintlayout.compose.State;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.parser.CLString;
import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.Dimension;
import androidx.constraintlayout.core.state.State$Chain;
import androidx.constraintlayout.core.state.helpers.ChainReference;
import androidx.constraintlayout.core.state.helpers.GuidelineReference;
import androidx.constraintlayout.core.state.helpers.HorizontalChainReference;
import androidx.constraintlayout.core.state.helpers.VerticalChainReference;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.api.ApiResult;
import com.squareup.cash.cdf.account.AccountConfigureUpdateNotificationPreference;
import com.squareup.cash.cdf.notificationssettings.AliasType;
import com.squareup.cash.cdf.notificationssettings.NotificationsSettingsChangeSetting;
import com.squareup.cash.cdf.notificationssettings.NotificationsSettingsChangeSettingError;
import com.squareup.cash.cdf.notificationssettings.NotificationsSettingsToggleAlias;
import com.squareup.cash.cdf.system.SystemNotificationSettingsOrigin;
import com.squareup.cash.cdf.system.SystemOpenNotificationSettings;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.profile.presenters.notifications.NotificationsAnalyticsHelperKt$WhenMappings;
import com.squareup.cash.profile.viewmodels.CategoryListType;
import com.squareup.cash.profile.viewmodels.ChannelType;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategory;
import com.squareup.protos.franklin.api.UiAlias;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import net.idrnd.face.iad.capture.internal.c0;

/* loaded from: classes6.dex */
public abstract class zzaky {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r2v10, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v12, types: [float[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v13, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int[], java.io.Serializable] */
    public static void applyAttribute(Recorder.AnonymousClass3 anonymousClass3, State state, CLObject cLObject, ConstraintReference constraintReference, String str) {
        char c;
        long j;
        char c2;
        char c3;
        str.getClass();
        switch (str.hashCode()) {
            case -1448775240:
                if (str.equals("centerVertically")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1349088399:
                if (str.equals("custom")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1221029593:
                if (str.equals("height")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1068318794:
                if (str.equals("motion")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -247669061:
                if (str.equals("hRtlBias")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -61505906:
                if (str.equals("vWeight")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 98116417:
                if (str.equals("hBias")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 111045711:
                if (str.equals("vBias")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 113126854:
                if (str.equals("width")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 398344448:
                if (str.equals("hWeight")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1404070310:
                if (str.equals("centerHorizontally")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                String string2 = cLObject.getString(str);
                ConstraintReference constraints = string2.equals("parent") ? state.constraints(0) : state.constraints(string2);
                constraintReference.topToTop(constraints);
                constraintReference.bottomToBottom(constraints);
                return;
            case 1:
                String string3 = cLObject.getString(str);
                ConstraintReference constraints2 = string3.equals("parent") ? state.constraints(0) : state.constraints(string3);
                constraintReference.startToStart(constraints2);
                constraintReference.endToEnd(constraints2);
                constraintReference.topToTop(constraints2);
                constraintReference.bottomToBottom(constraints2);
                return;
            case 2:
                CLElement orNull = cLObject.getOrNull(str);
                CLObject cLObject2 = orNull instanceof CLObject ? (CLObject) orNull : null;
                if (cLObject2 == null) {
                    return;
                }
                Iterator it = cLObject2.names().iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    CLElement cLElement = cLObject2.get(str2);
                    if (cLElement instanceof CLNumber) {
                        float f = cLElement.getFloat();
                        if (constraintReference.mCustomFloats == null) {
                            constraintReference.mCustomFloats = new HashMap();
                        }
                        constraintReference.mCustomFloats.put(str2, Float.valueOf(f));
                    } else if (cLElement instanceof CLString) {
                        String content = cLElement.content();
                        if (content.startsWith("#")) {
                            String substring = content.substring(1);
                            if (substring.length() == 6) {
                                substring = "FF".concat(substring);
                            }
                            j = Long.parseLong(substring, 16);
                        } else {
                            j = -1;
                        }
                        if (j != -1) {
                            constraintReference.mCustomColors.put(str2, Integer.valueOf((int) j));
                        }
                    }
                }
                return;
            case 3:
                constraintReference.mRotationX = anonymousClass3.get(cLObject.get(str));
                return;
            case 4:
                constraintReference.mRotationY = anonymousClass3.get(cLObject.get(str));
                return;
            case 5:
                constraintReference.mRotationZ = anonymousClass3.get(cLObject.get(str));
                return;
            case 6:
                constraintReference.mTranslationX = state.mDpToPixel.toPixels(anonymousClass3.get(cLObject.get(str)));
                return;
            case 7:
                constraintReference.mTranslationY = state.mDpToPixel.toPixels(anonymousClass3.get(cLObject.get(str)));
                return;
            case '\b':
                constraintReference.mTranslationZ = state.mDpToPixel.toPixels(anonymousClass3.get(cLObject.get(str)));
                return;
            case '\t':
                constraintReference.mVerticalDimension = parseDimension(cLObject, str, state, state.mDpToPixel);
                return;
            case '\n':
                CLElement cLElement2 = cLObject.get(str);
                if (cLElement2 instanceof CLObject) {
                    CLObject cLObject3 = (CLObject) cLElement2;
                    c0 c0Var = new c0();
                    c0Var.a = new int[10];
                    c0Var.b = new int[10];
                    c0Var.f = 0;
                    c0Var.c = new int[10];
                    c0Var.d = new float[10];
                    c0Var.g = 0;
                    c0Var.e = new int[5];
                    c0Var.i = new String[5];
                    c0Var.h = 0;
                    Iterator it2 = cLObject3.names().iterator();
                    while (it2.hasNext()) {
                        String str3 = (String) it2.next();
                        str3.getClass();
                        switch (str3.hashCode()) {
                            case -1897525331:
                                if (str3.equals("stagger")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1310311125:
                                if (str3.equals("easing")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1285003983:
                                if (str3.equals("quantize")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -791482387:
                                if (str3.equals("pathArc")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -236944793:
                                if (str3.equals("relativeTo")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                                c0Var.add(cLObject3.getFloat(str3), 600);
                                continue;
                            case 1:
                                c0Var.add(603, cLObject3.getString(str3));
                                continue;
                            case 2:
                                CLElement cLElement3 = cLObject3.get(str3);
                                if (cLElement3 instanceof CLArray) {
                                    CLArray cLArray = (CLArray) cLElement3;
                                    int size = cLArray.mElements.size();
                                    if (size <= 0) {
                                        break;
                                    } else {
                                        c0Var.add(610, cLArray.getInt(0));
                                        if (size <= 1) {
                                            break;
                                        } else {
                                            c0Var.add(611, cLArray.getString(1));
                                            if (size > 2) {
                                                c0Var.add(cLArray.getFloat(2), 602);
                                            }
                                        }
                                    }
                                } else {
                                    CLElement cLElement4 = cLObject3.get(str3);
                                    if (cLElement4 == null) {
                                        StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("no int found for key <", str3, ">, found [");
                                        m3m.append(cLElement4.getStrClass());
                                        m3m.append("] : ");
                                        m3m.append(cLElement4);
                                        throw new CLParsingException(m3m.toString(), cLObject3);
                                    }
                                    c0Var.add(610, cLElement4.getInt$1());
                                }
                            case 3:
                                String string4 = cLObject3.getString(str3);
                                String[] strArr = {"none", "startVertical", "startHorizontal", "flip", "below", "above"};
                                int i = 0;
                                while (true) {
                                    if (i >= 6) {
                                        i = -1;
                                    } else if (!strArr[i].equals(string4)) {
                                        i++;
                                    }
                                }
                                if (i != -1) {
                                    c0Var.add(607, i);
                                    break;
                                } else {
                                    System.err.println("0 pathArc = '" + string4 + "'");
                                    break;
                                }
                            case 4:
                                c0Var.add(605, cLObject3.getString(str3));
                                break;
                        }
                    }
                    constraintReference.getClass();
                    return;
                }
                return;
            case 11:
                constraintReference.mPivotX = anonymousClass3.get(cLObject.get(str));
                return;
            case '\f':
                constraintReference.mPivotY = anonymousClass3.get(cLObject.get(str));
                return;
            case '\r':
                constraintReference.mScaleX = anonymousClass3.get(cLObject.get(str));
                return;
            case 14:
                constraintReference.mScaleY = anonymousClass3.get(cLObject.get(str));
                return;
            case 15:
                float f2 = anonymousClass3.get(cLObject.get(str));
                if (!state.mIsLtr) {
                    f2 = 1.0f - f2;
                }
                constraintReference.mHorizontalBias = f2;
                return;
            case 16:
                constraintReference.mVerticalChainWeight = anonymousClass3.get(cLObject.get(str));
                return;
            case 17:
                constraintReference.mAlpha = anonymousClass3.get(cLObject.get(str));
                return;
            case 18:
                constraintReference.mHorizontalBias = anonymousClass3.get(cLObject.get(str));
                return;
            case 19:
                constraintReference.mVerticalBias = anonymousClass3.get(cLObject.get(str));
                return;
            case 20:
                constraintReference.mHorizontalDimension = parseDimension(cLObject, str, state, state.mDpToPixel);
                return;
            case 21:
                constraintReference.mHorizontalChainWeight = anonymousClass3.get(cLObject.get(str));
                return;
            case 22:
                String string5 = cLObject.getString(str);
                ConstraintReference constraints3 = string5.equals("parent") ? state.constraints(0) : state.constraints(string5);
                constraintReference.startToStart(constraints3);
                constraintReference.endToEnd(constraints3);
                return;
            case 23:
                String string6 = cLObject.getString(str);
                switch (string6.hashCode()) {
                    case -1901805651:
                        if (string6.equals("invisible")) {
                            c3 = 0;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 3178655:
                        if (string6.equals("gone")) {
                            c3 = 1;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 466743410:
                        if (string6.equals("visible")) {
                            c3 = 2;
                            break;
                        }
                        c3 = 65535;
                        break;
                    default:
                        c3 = 65535;
                        break;
                }
                switch (c3) {
                    case 0:
                        constraintReference.mVisibility = 4;
                        constraintReference.mAlpha = RecyclerView.DECELERATION_RATE;
                        return;
                    case 1:
                        constraintReference.mVisibility = 8;
                        return;
                    case 2:
                        constraintReference.mVisibility = 0;
                        return;
                    default:
                        return;
                }
            default:
                parseConstraint(anonymousClass3, state, cLObject, constraintReference, str);
                return;
        }
    }

    public static final String getCategoryListSettingsPage(CategoryListType categoryListType) {
        categoryListType.getClass();
        int ordinal = categoryListType.ordinal();
        if (ordinal == 0) {
            return "activity";
        }
        if (ordinal == 1) {
            return "stocks";
        }
        if (ordinal == 2) {
            return "marketingNewsAndExclusives";
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final String getChannelListSettingsPage(NotificationCategory notificationCategory) {
        switch (notificationCategory == null ? -1 : NotificationsAnalyticsHelperKt$WhenMappings.$EnumSwitchMapping$2[notificationCategory.ordinal()]) {
            case 1:
                return "accountSecurity";
            case 2:
                return "accountNotices";
            case 3:
                return "accountChanges";
            case 4:
                return "activityTransactions";
            case 5:
                return "investingOwnedStockPriceChanges";
            case 6:
                return "investingFollowedStockPriceChanges";
            case 7:
                return "investingOwnedStockEarningsReports";
            case 8:
                return "investingFollowedStockEarningsReports";
            case 9:
                return "bitcoinPriceAlerts";
            case 10:
                return "marketingCashAppNews";
            case 11:
                return "marketingOffers";
            case 12:
                return "marketingExclusives";
            case 13:
                return "cashAppTaxes";
            case 14:
                return "family";
            default:
                return null;
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.DeprecatedViewCashAppPayOfferInAppBrowser.deepLinkSpecs;
    }

    public static final String getReasonCode(ApiResult.Failure failure) {
        if (failure instanceof ApiResult.Failure.NetworkFailure) {
            return "noNetworkConnection";
        }
        if (failure instanceof ApiResult.Failure.HttpFailure) {
            return String.valueOf(((ApiResult.Failure.HttpFailure) failure).code);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final String getToggleState(boolean z) {
        return z ? "ON" : "OFF";
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void parseChain(int i, State state, Recorder.AnonymousClass3 anonymousClass3, CLArray cLArray) {
        String content;
        ChainReference chainReference = i == 0 ? (HorizontalChainReference) state.helper(1) : (VerticalChainReference) state.helper(2);
        CLElement cLElement = cLArray.get(1);
        if (cLElement instanceof CLArray) {
            CLArray cLArray2 = (CLArray) cLElement;
            if (cLArray2.mElements.size() < 1) {
                return;
            }
            for (int i2 = 0; i2 < cLArray2.mElements.size(); i2++) {
                chainReference.add(cLArray2.getString(i2));
            }
            if (cLArray.mElements.size() > 2) {
                CLElement cLElement2 = cLArray.get(2);
                if (cLElement2 instanceof CLObject) {
                    CLObject cLObject = (CLObject) cLElement2;
                    Iterator it = cLObject.names().iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        str.getClass();
                        if (str.equals("style")) {
                            CLElement cLElement3 = cLObject.get(str);
                            if (cLElement3 instanceof CLArray) {
                                CLArray cLArray3 = (CLArray) cLElement3;
                                if (cLArray3.mElements.size() > 1) {
                                    content = cLArray3.getString(0);
                                    chainReference.mBias = cLArray3.getFloat(1);
                                    if (!content.equals("packed")) {
                                        chainReference.mStyle = State$Chain.PACKED;
                                    } else if (content.equals("spread_inside")) {
                                        chainReference.mStyle = State$Chain.SPREAD_INSIDE;
                                    } else {
                                        chainReference.mStyle = State$Chain.SPREAD;
                                    }
                                }
                            }
                            content = cLElement3.content();
                            if (!content.equals("packed")) {
                            }
                        } else {
                            parseConstraint(anonymousClass3, state, cLObject, chainReference, str);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void parseConstraint(Recorder.AnonymousClass3 anonymousClass3, State state, CLObject cLObject, ConstraintReference constraintReference, String str) {
        ConstraintReference constraints;
        char c;
        boolean z;
        boolean z2;
        char c2;
        boolean z3;
        boolean z4 = state.mIsLtr;
        CLElement orNull = cLObject.getOrNull(str);
        CLArray cLArray = orNull instanceof CLArray ? (CLArray) orNull : null;
        if (cLArray == null || cLArray.mElements.size() <= 1) {
            String stringOrNull = cLObject.getStringOrNull(str);
            if (stringOrNull != null) {
                constraints = stringOrNull.equals("parent") ? state.constraints(0) : state.constraints(stringOrNull);
                str.getClass();
                switch (str) {
                    case "baseline":
                        state.baselineNeededFor(constraintReference.mKey);
                        state.baselineNeededFor(constraints.mKey);
                        constraintReference.mLast = 15;
                        constraintReference.mBaselineToBaseline = constraints;
                        break;
                    case "bottom":
                        constraintReference.bottomToBottom(constraints);
                        break;
                    case "end":
                        if (!z4) {
                            constraintReference.mLast = 1;
                            constraintReference.mLeftToLeft = constraints;
                            break;
                        } else {
                            constraintReference.mLast = 4;
                            constraintReference.mRightToRight = constraints;
                            break;
                        }
                    case "top":
                        constraintReference.topToTop(constraints);
                        break;
                    case "start":
                        if (!z4) {
                            constraintReference.mLast = 4;
                            constraintReference.mRightToRight = constraints;
                            break;
                        } else {
                            constraintReference.mLast = 1;
                            constraintReference.mLeftToLeft = constraints;
                            break;
                        }
                }
            }
            return;
        }
        String string2 = cLArray.getString(0);
        CLElement orNull2 = cLArray.getOrNull(1);
        String content = orNull2 instanceof CLString ? orNull2.content() : null;
        int size = cLArray.mElements.size();
        float f = RecyclerView.DECELERATION_RATE;
        float pixels = size > 2 ? state.mDpToPixel.toPixels(anonymousClass3.get(cLArray.getOrNull(2))) : 0.0f;
        float pixels2 = cLArray.mElements.size() > 3 ? state.mDpToPixel.toPixels(anonymousClass3.get(cLArray.getOrNull(3))) : 0.0f;
        ConstraintReference constraints2 = string2.equals("parent") ? state.constraints(0) : state.constraints(string2);
        str.getClass();
        switch (str.hashCode()) {
            case -1720785339:
                if (str.equals("baseline")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1498085729:
                if (str.equals("circular")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1383228885:
                if (str.equals("bottom")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 100571:
                if (str.equals("end")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 115029:
                if (str.equals("top")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 3317767:
                if (str.equals("left")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 108511772:
                if (str.equals("right")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 109757538:
                if (str.equals("start")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                content.getClass();
                switch (content) {
                    case "baseline":
                        state.baselineNeededFor(constraintReference.mKey);
                        state.baselineNeededFor(constraints2.mKey);
                        constraintReference.mLast = 15;
                        constraintReference.mBaselineToBaseline = constraints2;
                        break;
                    case "bottom":
                        state.baselineNeededFor(constraintReference.mKey);
                        constraintReference.mLast = 17;
                        constraintReference.mBaselineToBottom = constraints2;
                        break;
                    case "top":
                        state.baselineNeededFor(constraintReference.mKey);
                        constraintReference.mLast = 16;
                        constraintReference.mBaselineToTop = constraints2;
                        break;
                }
                z = false;
                z2 = true;
                break;
            case 1:
                float f2 = anonymousClass3.get(cLArray.get(1));
                if (cLArray.mElements.size() > 2) {
                    f = state.mDpToPixel.toPixels(anonymousClass3.get(cLArray.getOrNull(2)));
                }
                constraintReference.mCircularConstraint = constraintReference.get(constraints2);
                constraintReference.mCircularAngle = f2;
                constraintReference.mCircularDistance = f;
                constraintReference.mLast = 20;
                z = false;
                z2 = true;
                break;
            case 2:
                content.getClass();
                switch (content) {
                    case "baseline":
                        state.baselineNeededFor(constraints2.mKey);
                        constraintReference.mLast = 14;
                        constraintReference.mBottomToBaseline = constraints2;
                        break;
                    case "bottom":
                        constraintReference.bottomToBottom(constraints2);
                        break;
                    case "top":
                        constraintReference.mLast = 12;
                        constraintReference.mBottomToTop = constraints2;
                        break;
                }
                z = false;
                z2 = true;
                break;
            case 3:
                z2 = !z4;
                z = true;
                break;
            case 4:
                content.getClass();
                switch (content) {
                    case "baseline":
                        state.baselineNeededFor(constraints2.mKey);
                        constraintReference.mLast = 11;
                        constraintReference.mTopToBaseline = constraints2;
                        break;
                    case "bottom":
                        constraintReference.mLast = 10;
                        constraintReference.mTopToBottom = constraints2;
                        break;
                    case "top":
                        constraintReference.topToTop(constraints2);
                        break;
                }
                z = false;
                z2 = true;
                break;
            case 5:
                z = true;
                z2 = true;
                break;
            case 6:
                z = true;
                z2 = false;
                break;
            case 7:
                z2 = z4;
                z = true;
                break;
            default:
                z = false;
                z2 = true;
                break;
        }
        if (z) {
            content.getClass();
            switch (content.hashCode()) {
                case 100571:
                    if (content.equals("end")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 108511772:
                    if (content.equals("right")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109757538:
                    if (content.equals("start")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    z3 = !z4;
                    break;
                case 1:
                    z3 = false;
                    break;
                case 2:
                    z3 = z4;
                    break;
                default:
                    z3 = true;
                    break;
            }
            if (z2) {
                if (z3) {
                    constraintReference.mLast = 1;
                    constraintReference.mLeftToLeft = constraints2;
                } else {
                    constraintReference.mLast = 2;
                    constraintReference.mLeftToRight = constraints2;
                }
            } else if (z3) {
                constraintReference.mLast = 3;
                constraintReference.mRightToLeft = constraints2;
            } else {
                constraintReference.mLast = 4;
                constraintReference.mRightToRight = constraints2;
            }
        }
        constraintReference.margin(Float.valueOf(pixels)).marginGone(Float.valueOf(pixels2));
    }

    public static Dimension parseDimension(CLObject cLObject, String str, State state, StreamSharing$$ExternalSyntheticLambda1 streamSharing$$ExternalSyntheticLambda1) {
        CLElement cLElement = cLObject.get(str);
        Dimension createFixed = Dimension.createFixed(0);
        if (cLElement instanceof CLString) {
            return parseDimensionMode(cLElement.content());
        }
        if (cLElement instanceof CLNumber) {
            return Dimension.createFixed(state.convertDimension(Float.valueOf(streamSharing$$ExternalSyntheticLambda1.toPixels(cLObject.getFloat(str)))));
        }
        if (cLElement instanceof CLObject) {
            CLObject cLObject2 = (CLObject) cLElement;
            String stringOrNull = cLObject2.getStringOrNull("value");
            if (stringOrNull != null) {
                createFixed = parseDimensionMode(stringOrNull);
            }
            CLElement orNull = cLObject2.getOrNull("min");
            if (orNull != null) {
                if (orNull instanceof CLNumber) {
                    int convertDimension = state.convertDimension(Float.valueOf(streamSharing$$ExternalSyntheticLambda1.toPixels(((CLNumber) orNull).getFloat())));
                    if (convertDimension >= 0) {
                        createFixed.mMin = convertDimension;
                    }
                } else if (orNull instanceof CLString) {
                    createFixed.mMin = -2;
                }
            }
            CLElement orNull2 = cLObject2.getOrNull("max");
            if (orNull2 != null) {
                if (orNull2 instanceof CLNumber) {
                    int convertDimension2 = state.convertDimension(Float.valueOf(streamSharing$$ExternalSyntheticLambda1.toPixels(((CLNumber) orNull2).getFloat())));
                    if (createFixed.mMax >= 0) {
                        createFixed.mMax = convertDimension2;
                        return createFixed;
                    }
                } else if ((orNull2 instanceof CLString) && createFixed.mIsSuggested) {
                    createFixed.mInitialValue = Dimension.WRAP_DIMENSION;
                    createFixed.mMax = Integer.MAX_VALUE;
                }
            }
        }
        return createFixed;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Dimension parseDimensionMode(String str) {
        Dimension createFixed = Dimension.createFixed(0);
        char c = 65535;
        switch (str.hashCode()) {
            case -1460244870:
                if (str.equals("preferWrap")) {
                    c = 0;
                    break;
                }
                break;
            case -995424086:
                if (str.equals("parent")) {
                    c = 1;
                    break;
                }
                break;
            case -895684237:
                if (str.equals("spread")) {
                    c = 2;
                    break;
                }
                break;
            case 3657802:
                if (str.equals("wrap")) {
                    c = 3;
                    break;
                }
                break;
        }
        String str2 = Dimension.WRAP_DIMENSION;
        String str3 = Dimension.SPREAD_DIMENSION;
        switch (c) {
            case 0:
                return Dimension.createSuggested(str2);
            case 1:
                return new Dimension(Dimension.PARENT_DIMENSION);
            case 2:
                return Dimension.createSuggested(str3);
            case 3:
                return new Dimension(str2);
            default:
                if (str.endsWith("%")) {
                    float parseFloat = Float.parseFloat(str.substring(0, str.indexOf(37))) / 100.0f;
                    Dimension dimension = new Dimension(Dimension.PERCENT_DIMENSION);
                    dimension.mPercent = parseFloat;
                    dimension.mIsSuggested = true;
                    dimension.mMax = 0;
                    return dimension;
                }
                if (!str.contains(":")) {
                    return createFixed;
                }
                Dimension dimension2 = new Dimension(Dimension.RATIO_DIMENSION);
                dimension2.mRatioString = str;
                dimension2.mInitialValue = str3;
                dimension2.mIsSuggested = true;
                return dimension2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void parseGuidelineParams(int i, State state, String str, CLObject cLObject) {
        char c;
        char c2;
        ArrayList names = cLObject.names();
        ConstraintReference constraints = state.constraints(str);
        if (i == 0) {
            state.guideline(0, str);
        } else {
            state.guideline(1, str);
        }
        boolean z = state.mIsLtr || i == 0;
        GuidelineReference guidelineReference = (GuidelineReference) constraints.mFacade;
        Iterator it = names.iterator();
        boolean z2 = false;
        boolean z3 = true;
        float f = RecyclerView.DECELERATION_RATE;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            str2.getClass();
            switch (str2.hashCode()) {
                case -678927291:
                    if (str2.equals("percent")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 100571:
                    if (str2.equals("end")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3317767:
                    if (str2.equals("left")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 108511772:
                    if (str2.equals("right")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 109757538:
                    if (str2.equals("start")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    CLElement orNull = cLObject.getOrNull(str2);
                    CLArray cLArray = orNull instanceof CLArray ? (CLArray) orNull : null;
                    if (cLArray != null) {
                        if (cLArray.mElements.size() > 1) {
                            String string2 = cLArray.getString(0);
                            float f2 = cLArray.getFloat(1);
                            switch (string2.hashCode()) {
                                case 100571:
                                    if (string2.equals("end")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3317767:
                                    if (string2.equals("left")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 108511772:
                                    if (string2.equals("right")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 109757538:
                                    if (string2.equals("start")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            switch (c2) {
                                case 0:
                                    z3 = !z;
                                    break;
                                case 1:
                                    z3 = true;
                                    f = f2;
                                    z2 = true;
                                    continue;
                                case 2:
                                    z3 = false;
                                    break;
                                case 3:
                                    z3 = z;
                                    break;
                            }
                            f = f2;
                        }
                        z2 = true;
                        break;
                    } else {
                        f = cLObject.getFloat(str2);
                        z2 = true;
                        z3 = true;
                        break;
                    }
                    break;
                case 1:
                    f = state.mDpToPixel.toPixels(cLObject.getFloat(str2));
                    z3 = !z;
                    break;
                case 2:
                    f = state.mDpToPixel.toPixels(cLObject.getFloat(str2));
                    z3 = true;
                    break;
                case 3:
                    f = state.mDpToPixel.toPixels(cLObject.getFloat(str2));
                    z3 = false;
                    break;
                case 4:
                    f = state.mDpToPixel.toPixels(cLObject.getFloat(str2));
                    z3 = z;
                    break;
            }
        }
        if (z2) {
            if (z3) {
                guidelineReference.mStart = -1;
                guidelineReference.mEnd = -1;
                guidelineReference.mPercent = f;
                return;
            } else {
                guidelineReference.mStart = -1;
                guidelineReference.mEnd = -1;
                guidelineReference.mPercent = 1.0f - f;
                return;
            }
        }
        if (z3) {
            guidelineReference.mStart = guidelineReference.mState.convertDimension(Float.valueOf(f));
            guidelineReference.mEnd = -1;
            guidelineReference.mPercent = RecyclerView.DECELERATION_RATE;
        } else {
            Float valueOf = Float.valueOf(f);
            guidelineReference.mStart = -1;
            guidelineReference.mEnd = guidelineReference.mState.convertDimension(valueOf);
            guidelineReference.mPercent = RecyclerView.DECELERATION_RATE;
        }
    }

    public static void parseWidget(State state, Recorder.AnonymousClass3 anonymousClass3, String str, CLObject cLObject) {
        ConstraintReference constraints = state.constraints(str);
        Dimension dimension = constraints.mHorizontalDimension;
        String str2 = Dimension.WRAP_DIMENSION;
        if (dimension == null) {
            constraints.mHorizontalDimension = new Dimension(str2);
        }
        if (constraints.mVerticalDimension == null) {
            constraints.mVerticalDimension = new Dimension(str2);
        }
        Iterator it = cLObject.names().iterator();
        while (it.hasNext()) {
            applyAttribute(anonymousClass3, state, cLObject, constraints, (String) it.next());
        }
    }

    public static final AliasType toAnalyticsAliasType(ChannelType channelType) {
        channelType.getClass();
        int ordinal = channelType.ordinal();
        if (ordinal == 0) {
            return AliasType.EMAIL;
        }
        if (ordinal == 1) {
            return AliasType.SMS;
        }
        if (ordinal == 2) {
            return AliasType.PUSH;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final void trackChangeNotificationSettingToggle(Analytics analytics, String str, String str2, boolean z, ChannelType channelType) {
        AliasType aliasType;
        String str3;
        String str4;
        AliasType aliasType2;
        String toggleState = getToggleState(!z);
        String toggleState2 = getToggleState(z);
        int i = channelType == null ? -1 : NotificationsAnalyticsHelperKt$WhenMappings.$EnumSwitchMapping$1[channelType.ordinal()];
        if (i == 1) {
            aliasType = AliasType.SMS;
        } else if (i == 2) {
            aliasType = AliasType.EMAIL;
        } else {
            if (i != 3) {
                str3 = str;
                str4 = str2;
                aliasType2 = null;
                analytics.track(new NotificationsSettingsChangeSetting(str3, str4, toggleState, toggleState2, aliasType2), null);
            }
            aliasType = AliasType.PUSH;
        }
        str3 = str;
        str4 = str2;
        aliasType2 = aliasType;
        analytics.track(new NotificationsSettingsChangeSetting(str3, str4, toggleState, toggleState2, aliasType2), null);
    }

    public static final void trackChangeSettingError(Analytics analytics, String str) {
        str.getClass();
        analytics.track(new NotificationsSettingsChangeSettingError(str), null);
    }

    public static final void trackSystemOpenNotificationSettings(Analytics analytics, SystemNotificationSettingsOrigin systemNotificationSettingsOrigin) {
        analytics.track(new SystemOpenNotificationSettings(systemNotificationSettingsOrigin), null);
    }

    public static final void trackToggleAlias(Analytics analytics, boolean z, UiAlias.Type type2, boolean z2) {
        type2.getClass();
        String toggleState = getToggleState(!z);
        String toggleState2 = getToggleState(z);
        int ordinal = type2.ordinal();
        analytics.track(new NotificationsSettingsToggleAlias(toggleState, toggleState2, ordinal != 0 ? ordinal != 1 ? null : AliasType.EMAIL : AliasType.SMS), null);
        if (z2) {
            int ordinal2 = type2.ordinal();
            analytics.track(new AccountConfigureUpdateNotificationPreference(ordinal2 != 0 ? ordinal2 != 1 ? null : AccountConfigureUpdateNotificationPreference.AliasType.EMAIL : AccountConfigureUpdateNotificationPreference.AliasType.SMS, Boolean.valueOf(z)), null);
        }
    }
}
