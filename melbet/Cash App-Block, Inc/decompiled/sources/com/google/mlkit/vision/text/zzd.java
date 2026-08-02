package com.google.mlkit.vision.text;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.braze.enums.DataStoreKey$$ExternalSyntheticLambda0;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.event.EventMapper;
import com.datadog.android.rum.tracking.TrackingStrategy;
import com.datadog.android.trace.model.SpanEvent;
import com.fillr.browsersdk.Fillr;
import com.fillr.featuretoggle.ActivationStrategy;
import com.fillr.featuretoggle.DefaultUnleash;
import com.fillr.featuretoggle.FeatureToggle;
import com.fillr.featuretoggle.UnleashContext;
import com.fillr.featuretoggle.metric.ToggleCount;
import com.fillr.featuretoggle.repository.ToggleCollection;
import com.fillr.featuretoggle.strategy.DevKeyStrategy;
import com.fillr.featuretoggle.strategy.StrategyUtils;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.internal.location.zzdh;
import com.google.android.gms.internal.mlkit_genai_prompt.zzadn;
import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvd;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.tabs.TabLayout;
import com.google.crypto.tink.Aead;
import com.google.mlkit.vision.text.Text;
import com.ionspin.kotlin.bignum.decimal.BigDecimal;
import com.ionspin.kotlin.bignum.decimal.DecimalMode;
import com.ionspin.kotlin.bignum.decimal.RoundingMode;
import com.ionspin.kotlin.bignum.integer.BigInteger;
import com.ionspin.kotlin.bignum.integer.Sign;
import com.ionspin.kotlin.bignum.integer.base63.array.BigInteger63Arithmetic;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import com.squareup.cash.appmessages.overlay.OverlayAppMessagePlacement;
import com.squareup.cash.autofillweb.api.AutofillWebField;
import com.squareup.cash.bankingbenefits.api.v1_0.core.PaycheckDepositStatusActiveBenefitType;
import com.squareup.cash.card.onboarding.core.instancing.GridConfig;
import com.squareup.cash.cashsubscriptions.common.v1_0.SubscriptionState;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.papermoney.PaperMoneyDepositSearchAddress;
import com.squareup.cash.cdf.papermoney.PaperMoneyDepositSelectAddress;
import com.squareup.cash.deposits.physical.presenter.address.AddressAnalyticsFactory;
import com.squareup.cash.investing.presenters.custom.order.GraphInformationPresenter$HistoricalData;
import com.squareup.cash.investing.presenters.custom.order.InvestingCustomOrderPresenter;
import com.squareup.cash.multiplatform.investing.CustomOrderPriceTickCalculator$RoundingRule;
import com.squareup.cash.multiplatform.investing.CustomOrderPriceTickCalculatorKt;
import com.squareup.cash.multiplatform.investing.PriceValue;
import com.squareup.cash.portfolio.graphs.RealInvestingGraphSmoother;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel$AccentColorType$StaleData;
import com.squareup.protos.cash.messagingplatformcommon.app.HalfSheetMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.PopupMessage;
import com.squareup.protos.cash.portfolios.BalanceHistory;
import com.squareup.protos.cash.portfolios.BalanceTick;
import com.squareup.protos.cash.portfolios.GetPortfoliosHistoricalDataResponse;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.stripe.android.utils.MapUtilsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import io.noties.markwon.RenderPropsImpl;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.ULong;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.enums.EnumEntriesList;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.ArrayIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public /* synthetic */ class zzd implements TrackingStrategy, EventMapper, ListenerHolder.Notifier, OnFailureListener, zzu, AddressAnalyticsFactory {
    public static zzd instance = null;
    public static DefaultUnleash unleash = null;
    public static String userId = "NoAndroidID";
    public final /* synthetic */ int $r8$classId;

    public zzd(Aead aead, int i) {
        this.$r8$classId = 9;
    }

    public static RectF calculateIndicatorWidthForTab(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.tabIndicatorFullWidth || !(view instanceof TabLayout.TabView)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        TabLayout.TabView tabView = (TabLayout.TabView) view;
        View[] viewArr = {tabView.textView, tabView.iconView, tabView.customView};
        int i = 0;
        int i2 = 0;
        boolean z = false;
        for (int i3 = 0; i3 < 3; i3++) {
            View view2 = viewArr[i3];
            if (view2 != null && view2.getVisibility() == 0) {
                i2 = z ? Math.min(i2, view2.getLeft()) : view2.getLeft();
                i = z ? Math.max(i, view2.getRight()) : view2.getRight();
                z = true;
            }
        }
        int i4 = i - i2;
        View[] viewArr2 = {tabView.textView, tabView.iconView, tabView.customView};
        int i5 = 0;
        int i6 = 0;
        boolean z2 = false;
        for (int i7 = 0; i7 < 3; i7++) {
            View view3 = viewArr2[i7];
            if (view3 != null && view3.getVisibility() == 0) {
                i6 = z2 ? Math.min(i6, view3.getTop()) : view3.getTop();
                i5 = z2 ? Math.max(i5, view3.getBottom()) : view3.getBottom();
                z2 = true;
            }
        }
        int i8 = i5 - i6;
        int dpToPx = (int) ViewUtils.dpToPx(tabView.getContext(), 24);
        if (i4 < dpToPx) {
            i4 = dpToPx;
        }
        int right = (tabView.getRight() + tabView.getLeft()) / 2;
        int bottom = (tabView.getBottom() + tabView.getTop()) / 2;
        int i9 = i4 / 2;
        return new RectF(right - i9, bottom - (i8 / 2), i9 + right, (right / 2) + bottom);
    }

    public static GridConfig create$default(float f, float f2, int i) {
        return new GridConfig(Math.max(1, (int) Math.ceil(i / 4.0f)), f, f2, i, f2 * 1.5f, f * 1.5f, f2 * 1.65f, f * 1.75f);
    }

    public static BigInteger fromByte(byte b) {
        Sign sign;
        BigInteger.arithmetic.getClass();
        long abs = Math.abs((int) b);
        ULong.Companion companion = ULong.Companion;
        long[] jArr = {abs};
        Number valueOf = Byte.valueOf(b);
        ReflectionFactory reflectionFactory = Reflection.factory;
        KClass orCreateKotlinClass = reflectionFactory.getOrCreateKotlinClass(Byte.class);
        if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Long.TYPE))) {
            sign = Intrinsics.compare(valueOf.longValue(), 0L) < 0 ? Sign.NEGATIVE : Intrinsics.compare(valueOf.longValue(), 0L) > 0 ? Sign.POSITIVE : Sign.ZERO;
        } else if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Integer.TYPE))) {
            sign = Intrinsics.compare(valueOf.intValue(), 0) < 0 ? Sign.NEGATIVE : Intrinsics.compare(valueOf.intValue(), 0) > 0 ? Sign.POSITIVE : Sign.ZERO;
        } else if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Short.TYPE))) {
            sign = Intrinsics.compare(valueOf.intValue(), 0) < 0 ? Sign.NEGATIVE : Intrinsics.compare(valueOf.intValue(), 0) > 0 ? Sign.POSITIVE : Sign.ZERO;
        } else {
            if (!orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Byte.TYPE))) {
                JWK$$ExternalSyntheticBUOutline0.m$1(reflectionFactory.getOrCreateKotlinClass(Byte.class), "Unsupported type ");
                return null;
            }
            sign = Intrinsics.compare(valueOf.intValue(), 0) < 0 ? Sign.NEGATIVE : Intrinsics.compare(valueOf.intValue(), 0) > 0 ? Sign.POSITIVE : Sign.ZERO;
        }
        return new BigInteger(jArr, sign);
    }

    public static BigInteger fromInt(int i) {
        Sign sign;
        BigInteger.arithmetic.getClass();
        long abs = Math.abs(i);
        ULong.Companion companion = ULong.Companion;
        long[] jArr = {abs};
        Number valueOf = Integer.valueOf(i);
        ReflectionFactory reflectionFactory = Reflection.factory;
        KClass orCreateKotlinClass = reflectionFactory.getOrCreateKotlinClass(Integer.class);
        if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Long.TYPE))) {
            sign = Intrinsics.compare(valueOf.longValue(), 0L) < 0 ? Sign.NEGATIVE : Intrinsics.compare(valueOf.longValue(), 0L) > 0 ? Sign.POSITIVE : Sign.ZERO;
        } else if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Integer.TYPE))) {
            sign = Intrinsics.compare(i, 0) < 0 ? Sign.NEGATIVE : Intrinsics.compare(i, 0) > 0 ? Sign.POSITIVE : Sign.ZERO;
        } else if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Short.TYPE))) {
            sign = Intrinsics.compare(i, 0) < 0 ? Sign.NEGATIVE : Intrinsics.compare(i, 0) > 0 ? Sign.POSITIVE : Sign.ZERO;
        } else {
            if (!orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Byte.TYPE))) {
                JWK$$ExternalSyntheticBUOutline0.m$1(reflectionFactory.getOrCreateKotlinClass(Integer.class), "Unsupported type ");
                return null;
            }
            sign = Intrinsics.compare(i, 0) < 0 ? Sign.NEGATIVE : Intrinsics.compare(i, 0) > 0 ? Sign.POSITIVE : Sign.ZERO;
        }
        return new BigInteger(jArr, sign);
    }

    public static BigInteger fromLong(long j) {
        long[] jArr;
        Sign sign;
        BigInteger.arithmetic.getClass();
        if (j == Long.MIN_VALUE) {
            jArr = new long[]{0, 1};
        } else {
            long abs = Math.abs(j);
            ULong.Companion companion = ULong.Companion;
            jArr = new long[]{abs & Long.MAX_VALUE};
        }
        Number valueOf = Long.valueOf(j);
        ReflectionFactory reflectionFactory = Reflection.factory;
        KClass orCreateKotlinClass = reflectionFactory.getOrCreateKotlinClass(Long.class);
        if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Long.TYPE))) {
            sign = Intrinsics.compare(j, 0L) < 0 ? Sign.NEGATIVE : Intrinsics.compare(j, 0L) > 0 ? Sign.POSITIVE : Sign.ZERO;
        } else if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Integer.TYPE))) {
            sign = Intrinsics.compare(valueOf.intValue(), 0) < 0 ? Sign.NEGATIVE : Intrinsics.compare(valueOf.intValue(), 0) > 0 ? Sign.POSITIVE : Sign.ZERO;
        } else if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Short.TYPE))) {
            sign = Intrinsics.compare(valueOf.intValue(), 0) < 0 ? Sign.NEGATIVE : Intrinsics.compare(valueOf.intValue(), 0) > 0 ? Sign.POSITIVE : Sign.ZERO;
        } else {
            if (!orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Byte.TYPE))) {
                JWK$$ExternalSyntheticBUOutline0.m$1(reflectionFactory.getOrCreateKotlinClass(Long.class), "Unsupported type ");
                return null;
            }
            sign = Intrinsics.compare(valueOf.intValue(), 0) < 0 ? Sign.NEGATIVE : Intrinsics.compare(valueOf.intValue(), 0) > 0 ? Sign.POSITIVE : Sign.ZERO;
        }
        return new BigInteger(jArr, sign);
    }

    public static BigInteger fromShort(short s) {
        Sign sign;
        BigInteger.arithmetic.getClass();
        long abs = Math.abs((int) s);
        ULong.Companion companion = ULong.Companion;
        long[] jArr = {abs};
        Number valueOf = Short.valueOf(s);
        ReflectionFactory reflectionFactory = Reflection.factory;
        KClass orCreateKotlinClass = reflectionFactory.getOrCreateKotlinClass(Short.class);
        if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Long.TYPE))) {
            sign = Intrinsics.compare(valueOf.longValue(), 0L) < 0 ? Sign.NEGATIVE : Intrinsics.compare(valueOf.longValue(), 0L) > 0 ? Sign.POSITIVE : Sign.ZERO;
        } else if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Integer.TYPE))) {
            sign = Intrinsics.compare(valueOf.intValue(), 0) < 0 ? Sign.NEGATIVE : Intrinsics.compare(valueOf.intValue(), 0) > 0 ? Sign.POSITIVE : Sign.ZERO;
        } else if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Short.TYPE))) {
            sign = Intrinsics.compare(valueOf.intValue(), 0) < 0 ? Sign.NEGATIVE : Intrinsics.compare(valueOf.intValue(), 0) > 0 ? Sign.POSITIVE : Sign.ZERO;
        } else {
            if (!orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Byte.TYPE))) {
                JWK$$ExternalSyntheticBUOutline0.m$1(reflectionFactory.getOrCreateKotlinClass(Short.class), "Unsupported type ");
                return null;
            }
            sign = Intrinsics.compare(valueOf.intValue(), 0) < 0 ? Sign.NEGATIVE : Intrinsics.compare(valueOf.intValue(), 0) > 0 ? Sign.POSITIVE : Sign.ZERO;
        }
        return new BigInteger(jArr, sign);
    }

    /* renamed from: fromULong-VKZWuLQ, reason: not valid java name */
    public static BigInteger m2070fromULongVKZWuLQ(long j) {
        BigInteger.arithmetic.getClass();
        long j2 = Long.MIN_VALUE & j;
        ULong.Companion companion = ULong.Companion;
        return new BigInteger(j2 != 0 ? new long[]{j & Long.MAX_VALUE, 1} : new long[]{j}, Sign.POSITIVE);
    }

    public static PaycheckDepositStatusActiveBenefitType fromValue(int i) {
        switch (i) {
            case 0:
                return PaycheckDepositStatusActiveBenefitType.UNSPECIFIED;
            case 1:
                return PaycheckDepositStatusActiveBenefitType.FREE_OVERDRAFT_COVERAGE;
            case 2:
                return PaycheckDepositStatusActiveBenefitType.HIGH_INTEREST_SAVINGS;
            case 3:
                return PaycheckDepositStatusActiveBenefitType.PRIORITY_PHONE_SUPPORT;
            case 4:
                return PaycheckDepositStatusActiveBenefitType.REIMBURSED_ATM_FEES;
            case 5:
                return PaycheckDepositStatusActiveBenefitType.COVERED_PAPER_MONEY_DEPOSIT;
            case 6:
                return PaycheckDepositStatusActiveBenefitType.GUARANTEED_ACCESS_TO_BORROW;
            case 7:
                return PaycheckDepositStatusActiveBenefitType.FREE_INTERNATIONAL_CARD_TRANSACTION;
            case 8:
                return PaycheckDepositStatusActiveBenefitType.INCREASED_BORROW_LIMIT;
            case 9:
                return PaycheckDepositStatusActiveBenefitType.CUSTOM_WEEKLY_OFFERS;
            default:
                return null;
        }
    }

    public static zzd getInstance() {
        if (instance == null) {
            instance = new zzd(5);
        }
        return instance;
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x016d, code lost:
    
        if (1 <= r6) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b0, code lost:
    
        if (1 <= r6) goto L129;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean isFeatureEnabledForProperties(String str, HashMap hashMap) {
        String str2;
        boolean z;
        String[] split;
        String str3;
        DefaultUnleash defaultUnleash = unleash;
        boolean z2 = false;
        if (defaultUnleash != null) {
            UnleashContext unleashContext = new UnleashContext(userId, "session_id_unused", "remoteaddres_unused", hashMap);
            ToggleCollection toggleCollection = (ToggleCollection) defaultUnleash.toggleRepository.zbb;
            FeatureToggle featureToggle = toggleCollection != null ? (FeatureToggle) toggleCollection.cache.get(str) : null;
            if (featureToggle != null && featureToggle.isEnabled()) {
                if (featureToggle.getStrategies().isEmpty()) {
                    return true;
                }
                Iterator it = featureToggle.getStrategies().iterator();
                while (true) {
                    if (it.hasNext()) {
                        ActivationStrategy activationStrategy = (ActivationStrategy) it.next();
                        String str4 = activationStrategy.name;
                        HashMap hashMap2 = defaultUnleash.strategyMap;
                        DevKeyStrategy devKeyStrategy = hashMap2.containsKey(str4) ? (DevKeyStrategy) hashMap2.get(str4) : DefaultUnleash.UNKNOWN_STRATEGY;
                        if (devKeyStrategy != null) {
                            Map map = activationStrategy.parameters;
                            switch (devKeyStrategy.$r8$classId) {
                                case 0:
                                    HashMap hashMap3 = (HashMap) unleashContext.properties;
                                    if (map != null && map.size() > 0 && hashMap3.containsKey("devkey")) {
                                        String str5 = (String) hashMap3.get("devkey");
                                        Iterator it2 = map.entrySet().iterator();
                                        while (it2.hasNext()) {
                                            String str6 = (String) ((Map.Entry) it2.next()).getValue();
                                            if (str6 != null && str6.equals(str5)) {
                                                z = true;
                                                break;
                                            }
                                        }
                                    }
                                    z = false;
                                    break;
                                case 1:
                                    HashMap hashMap4 = (HashMap) unleashContext.properties;
                                    if (map != null && map.size() > 0 && hashMap4.containsKey("url")) {
                                        str2 = hashMap4.get("url") != null ? (String) hashMap4.get("url") : "";
                                        String str7 = (String) map.get("url_list");
                                        if (str7 != null) {
                                            for (String str8 : str7.split(",")) {
                                                if (str8.length() > 0 && Pattern.compile(Pattern.quote(str8), 2).matcher(str2).find()) {
                                                    z = true;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    z = false;
                                    break;
                                case 2:
                                case 5:
                                case 9:
                                    z = false;
                                    break;
                                case 3:
                                    z = true;
                                    break;
                                case 4:
                                    HashMap hashMap5 = (HashMap) unleashContext.properties;
                                    String str9 = (String) hashMap5.get("dev_key");
                                    String str10 = (String) hashMap5.get("url");
                                    if (str9 != null && str10 != null) {
                                        String str11 = (String) map.get("domainDevKey");
                                        String str12 = (String) map.get("devkey");
                                        if (str12 != null) {
                                            String[] split2 = str12.split(",");
                                            int length = split2.length;
                                            int i = 0;
                                            while (true) {
                                                if (i < length) {
                                                    if (!split2[i].equals(str9)) {
                                                        i++;
                                                    } else if (str11 != null && str11.length() > 0 && (split = str11.split(",")) != null && split.length > 0) {
                                                        for (String str13 : split) {
                                                            String[] split3 = str13.split(":");
                                                            if (split3 != null && split3.length > 1) {
                                                                String str14 = split3[0];
                                                                String str15 = split3[1];
                                                                try {
                                                                    str3 = new URI(str10).getHost();
                                                                    if (str3.startsWith("www.")) {
                                                                        str3 = str3.substring(4);
                                                                    }
                                                                } catch (Exception e) {
                                                                    e.printStackTrace();
                                                                    str3 = str10;
                                                                }
                                                                if (str14.equals(str9) && str15.length() > 0 && Pattern.compile(Pattern.quote(str15), 2).matcher(str3).find()) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            z = true;
                                            break;
                                        }
                                    }
                                    z = false;
                                    break;
                                case 6:
                                    String str16 = (String) unleashContext.sessionId;
                                    if (str16 != null && str16.trim().length() != 0) {
                                        int percentage = StrategyUtils.getPercentage((String) map.get("percentage"));
                                        ((map.get("groupId") != null ? (String) map.get("groupId") : "") + ':' + str16).getBytes();
                                        if (percentage > 0) {
                                        }
                                    }
                                    z = false;
                                    break;
                                case 7:
                                    String str17 = (String) unleashContext.userId;
                                    if (str17 != null && str17.trim().length() != 0) {
                                        int percentage2 = StrategyUtils.getPercentage((String) map.get("percentage"));
                                        ((map.get("groupId") != null ? (String) map.get("groupId") : "") + ':' + str17).getBytes();
                                        if (percentage2 > 0) {
                                        }
                                    }
                                    z = false;
                                    break;
                                case 8:
                                    String str18 = (String) map.get("IPs");
                                    if (str18 != null) {
                                        for (String str19 : str18.split(",\\s*")) {
                                            if (str19.contains((String) unleashContext.remoteAddress)) {
                                                z = true;
                                                break;
                                            }
                                        }
                                    }
                                    z = false;
                                    break;
                                case 10:
                                    String str20 = (String) unleashContext.userId;
                                    String str21 = (String) map.get("userIds");
                                    if (str21 != null && str20 != null) {
                                        for (String str22 : str21.split(",\\s?")) {
                                            if (str22.contains(str20)) {
                                                z = true;
                                                break;
                                            }
                                        }
                                    }
                                    z = false;
                                    break;
                                default:
                                    HashMap hashMap6 = (HashMap) unleashContext.properties;
                                    if (map != null && map.size() > 0 && hashMap6.containsKey("url")) {
                                        str2 = hashMap6.get("url") != null ? (String) hashMap6.get("url") : "";
                                        if (str2 != null) {
                                            Iterator it3 = map.entrySet().iterator();
                                            while (it3.hasNext()) {
                                                for (String str23 : ((String) ((Map.Entry) it3.next()).getValue()).split(",")) {
                                                    if (str23.length() > 0 && Pattern.compile(Pattern.quote(str23), 2).matcher(str2).find()) {
                                                        z = true;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    z = false;
                                    break;
                            }
                            if (z) {
                                z2 = true;
                            }
                        }
                    }
                }
            }
            HashMap hashMap7 = ((RenderPropsImpl) defaultUnleash.metricService.clientRegistrationURL).values;
            if (hashMap7.containsKey(str)) {
                ((ToggleCount) hashMap7.get(str)).getClass();
                return z2;
            }
            hashMap7.put(str, new ToggleCount());
        }
        return z2;
    }

    public static boolean isFeatureEnabledForUrl(String str, String str2) {
        HashMap hashMap = new HashMap();
        if (Fillr.getInstance().getDeveloperKey() != null) {
            hashMap.put("devkey", Fillr.getInstance().getDeveloperKey());
            hashMap.put("dev_key", Fillr.getInstance().getDeveloperKey());
        }
        if (str2 != null) {
            hashMap.put("url", str2);
        }
        return isFeatureEnabledForProperties(str, hashMap);
    }

    public static boolean isPropertyDisabledForDevKeyUrl(String str, String str2) {
        if (str2 == null || str2.length() <= 0) {
            return true;
        }
        HashMap hashMap = new HashMap();
        if (Fillr.getInstance().getDeveloperKey() != null) {
            hashMap.put("dev_key", Fillr.getInstance().getDeveloperKey());
        }
        hashMap.put("url", str2);
        return isFeatureEnabledForProperties(str, hashMap);
    }

    public static boolean isRefillEnabled(String str) {
        if (str.length() <= 0) {
            return true;
        }
        HashMap hashMap = new HashMap();
        if (Fillr.getInstance().getDeveloperKey() != null) {
            hashMap.put("dev_key", Fillr.getInstance().getDeveloperKey());
        }
        hashMap.put("url", str);
        return isFeatureEnabledForProperties("EnableRefillFields", hashMap);
    }

    public static BigInteger parseString(String str) {
        str.getClass();
        if (!StringsKt.contains((CharSequence) str, '.', false)) {
            if (str.charAt(0) != '-' && str.charAt(0) != '+') {
                if (str.length() == 1 && str.charAt(0) == '0') {
                    return BigInteger.ZERO;
                }
                BigInteger.arithmetic.getClass();
                return new BigInteger(BigInteger63Arithmetic.m2120parseForBase_llDaS8(str), Sign.POSITIVE);
            }
            if (str.length() == 1) {
                throw new NumberFormatException("Invalid big integer: ".concat(str));
            }
            Sign sign = str.charAt(0) == '-' ? Sign.NEGATIVE : Sign.POSITIVE;
            if (str.length() == 2 && str.charAt(1) == '0') {
                return BigInteger.ZERO;
            }
            BigInteger63Arithmetic bigInteger63Arithmetic = BigInteger.arithmetic;
            String substring = str.substring(1, str.length());
            bigInteger63Arithmetic.getClass();
            return new BigInteger(BigInteger63Arithmetic.m2120parseForBase_llDaS8(substring), sign);
        }
        BigDecimal bigDecimal = BigDecimal.ZERO;
        BigDecimal parseStringWithMode = zzc.parseStringWithMode(str);
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        long j = parseStringWithMode.exponent;
        if (j < 0) {
            int ordinal = parseStringWithMode.significand.sign.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    BigDecimal bigDecimal3 = BigDecimal.ONE;
                    bigDecimal2 = new BigDecimal(bigDecimal3.significand.negate(), bigDecimal3.exponent, bigDecimal3.decimalMode);
                } else if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
            }
        } else {
            bigDecimal2 = parseStringWithMode.roundSignificand(new DecimalMode(j + 1, RoundingMode.FLOOR, 4));
        }
        bigDecimal2.getClass();
        BigDecimal.ScaleOps[] scaleOpsArr = BigDecimal.ScaleOps.$VALUES;
        if (parseStringWithMode.subtract(bigDecimal2, parseStringWithMode.computeMode(bigDecimal2)).compareTo(0) <= 0) {
            return parseStringWithMode.toBigInteger();
        }
        throw new NumberFormatException("Supplied string is decimal, which cannot be converted to BigInteger without precision loss.");
    }

    public static float[] splitFloats$default(String str) {
        List drop = CollectionsKt.drop(StringsKt.split$default(str, new char[]{' '}, 6), 1);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(drop, 10));
        Iterator it = drop.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(Float.parseFloat((String) it.next())));
        }
        return CollectionsKt.toFloatArray(arrayList);
    }

    public static ArrayList toAutofillFields(List list) {
        Object obj;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            EnumEntriesList enumEntriesList = AutofillWebField.$ENTRIES;
            ArrayIterator m = CameraState$Type$EnumUnboxingLocalUtility.m(enumEntriesList, enumEntriesList);
            while (true) {
                if (!m.hasNext()) {
                    obj = null;
                    break;
                }
                obj = m.next();
                if (((AutofillWebField) obj).value.equals(str)) {
                    break;
                }
            }
            AutofillWebField autofillWebField = (AutofillWebField) obj;
            if (autofillWebField != null) {
                arrayList.add(autofillWebField);
            }
        }
        return arrayList;
    }

    public static OverlayAppMessagePlacement valueOf(PopupMessage.Placement placement) {
        placement.getClass();
        switch (placement.ordinal()) {
            case 0:
                return OverlayAppMessagePlacement.MoneyTab;
            case 1:
                return OverlayAppMessagePlacement.CardTab;
            case 2:
                return OverlayAppMessagePlacement.PaymentPadTab;
            case 3:
                return OverlayAppMessagePlacement.InvestingTab;
            case 4:
                return OverlayAppMessagePlacement.ActivityTab;
            case 5:
                return OverlayAppMessagePlacement.BitcoinTab;
            case 6:
                return OverlayAppMessagePlacement.OffersTab;
            case 7:
                return OverlayAppMessagePlacement.DiscoverTab;
            case 8:
                return OverlayAppMessagePlacement.LocalTab;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }

    @Override // com.datadog.android.event.EventMapper
    public Object map(Object obj) {
        SpanEvent spanEvent = (SpanEvent) obj;
        spanEvent.getClass();
        return spanEvent;
    }

    public InvestingCustomOrderPresenter.GraphInformation model(GraphInformationPresenter$HistoricalData graphInformationPresenter$HistoricalData, HistoricalRange historicalRange, GapComposer gapComposer) {
        HistoricalRange historicalRange2;
        long j;
        InvestingGraphContentModel.Loaded loaded;
        historicalRange.getClass();
        GetPortfoliosHistoricalDataResponse getPortfoliosHistoricalDataResponse = graphInformationPresenter$HistoricalData.portfolioModel;
        CurrencyCode currencyCode = graphInformationPresenter$HistoricalData.currencyCode;
        boolean changed = gapComposer.changed(graphInformationPresenter$HistoricalData);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            BalanceHistory balanceHistory = getPortfoliosHistoricalDataResponse.balance_history;
            if (balanceHistory != null) {
                Long l = balanceHistory.tick_frequency_ms;
                List list = balanceHistory.balance_ticks;
                if (list.isEmpty()) {
                    a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                    return null;
                }
                float size = list.size() - 1.0f;
                List list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                int i = 0;
                for (Object obj : list2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    ((BalanceTick) obj).gain_amount_cents.getClass();
                    arrayList.add(new InvestingGraphContentModel.Point(i, r13.longValue(), InvestingGraphContentModel.LineDashEffect.SOLID, InvestingGraphContentModel.PointTreatment.NONE, new InvestingGraphContentModel.NonComparableStringProvider(new DataStoreKey$$ExternalSyntheticLambda0(17))));
                    i = i2;
                }
                j = 0;
                historicalRange2 = historicalRange;
                if (historicalRange2 == HistoricalRange.DAY) {
                    l.getClass();
                    if (l.longValue() > 0) {
                        Long l2 = balanceHistory.end_time;
                        l2.getClass();
                        long longValue = l2.longValue();
                        long millis = TimeUnit.SECONDS.toMillis(longValue);
                        ((BalanceTick) CollectionsKt.last(list)).time_sec.getClass();
                        size += (millis - r0.toMillis(r3.longValue())) / l.longValue();
                    }
                }
                loaded = new InvestingGraphContentModel.Loaded(arrayList, RealInvestingGraphSmoother.smoothPointsBlocking(arrayList), size, InvestingGraphContentModel$AccentColorType$StaleData.INSTANCE, null, null, null, null, null, 496);
            } else {
                historicalRange2 = historicalRange;
                j = 0;
                loaded = null;
            }
            loaded.getClass();
            rememberedValue = Updater.mutableStateOf$default(loaded);
            gapComposer.updateRememberedValue(rememberedValue);
        } else {
            historicalRange2 = historicalRange;
            j = 0;
        }
        MutableState mutableState = (MutableState) rememberedValue;
        List list3 = ((InvestingGraphContentModel.Loaded) mutableState.getValue()).points;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList2.add(new PriceValue((long) ((InvestingGraphContentModel.Point) it.next()).y));
        }
        Object lastOrNull = CollectionsKt.lastOrNull((List) arrayList2);
        if (lastOrNull == null) {
            a$$ExternalSyntheticBUOutline0.m$3("No price ticks");
            return null;
        }
        long j2 = ((PriceValue) lastOrNull).value;
        Comparable maxOrNull = CollectionsKt.maxOrNull((Iterable) arrayList2);
        maxOrNull.getClass();
        long j3 = ((PriceValue) maxOrNull).value;
        Comparable minOrNull = CollectionsKt.minOrNull((Iterable) arrayList2);
        minOrNull.getClass();
        long max = Math.max(Math.abs((((((PriceValue) minOrNull).value - j2) * 10000) / j2) * 2), Math.abs((((j3 - j2) * 10000) / j2) * 2));
        long max2 = Math.max(Math.min(-max, -300L), -10000L);
        long max3 = Math.max(max, 300L);
        long m2015roundedPrice3FuaEw$investing_release = zzadn.m2015roundedPrice3FuaEw$investing_release(((max2 * j2) / 10000) + j2, CustomOrderPriceTickCalculator$RoundingRule.DOWN);
        long m2015roundedPrice3FuaEw$investing_release2 = zzadn.m2015roundedPrice3FuaEw$investing_release(((j2 * max3) / 10000) + j2, CustomOrderPriceTickCalculator$RoundingRule.UP);
        long j4 = ((PriceValue) CustomOrderPriceTickCalculatorKt.valueBelow((Map) CustomOrderPriceTickCalculatorKt.valueBelow(CustomOrderPriceTickCalculatorKt.BUDDS_MAP, Long.valueOf(max3)), new PriceValue(j2))).value;
        InvestingGraphContentModel.Loaded loaded2 = (InvestingGraphContentModel.Loaded) mutableState.getValue();
        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        if (j4 <= j) {
            a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m(j4, "Step must be positive, was: ", "."));
            return null;
        }
        long progressionLastElement = ProgressionUtilKt.getProgressionLastElement(m2015roundedPrice3FuaEw$investing_release, m2015roundedPrice3FuaEw$investing_release2, j4);
        if (m2015roundedPrice3FuaEw$investing_release <= progressionLastElement) {
            long j5 = m2015roundedPrice3FuaEw$investing_release;
            while (true) {
                createListBuilder.add(new PriceValue(j5));
                if (j5 == progressionLastElement) {
                    break;
                }
                j5 += j4;
            }
        }
        if (!PriceValue.m3663equalsimpl0(((PriceValue) CollectionsKt.last((List) createListBuilder)).value, m2015roundedPrice3FuaEw$investing_release2)) {
            createListBuilder.add(new PriceValue(m2015roundedPrice3FuaEw$investing_release2));
        }
        long j6 = (long) ((InvestingGraphContentModel.Point) CollectionsKt.last(loaded2.points)).y;
        if (CollectionsKt__CollectionsKt.binarySearch$default(createListBuilder, new PriceValue(j6)) < 0) {
            createListBuilder.add((-r4) - 1, new PriceValue(j6));
        }
        return new InvestingCustomOrderPresenter.GraphInformation(m2015roundedPrice3FuaEw$investing_release2, m2015roundedPrice3FuaEw$investing_release, CollectionsKt__CollectionsJVMKt.build(createListBuilder), (InvestingGraphContentModel.Loaded) mutableState.getValue(), currencyCode, historicalRange2);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public /* synthetic */ void notifyListener(Object obj) {
        ((zzdh) obj).getClass();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override // com.datadog.android.rum.tracking.TrackingStrategy
    public void register(InternalSdkCore internalSdkCore, Context context) {
        internalSdkCore.getClass();
        context.getClass();
    }

    @Override // com.squareup.cash.deposits.physical.presenter.address.AddressAnalyticsFactory
    public Event searchAddressEvent() {
        return new PaperMoneyDepositSearchAddress();
    }

    @Override // com.squareup.cash.deposits.physical.presenter.address.AddressAnalyticsFactory
    public Event selectAddressEvent(boolean z) {
        return new PaperMoneyDepositSelectAddress(Boolean.valueOf(z));
    }

    @Override // com.datadog.android.rum.tracking.TrackingStrategy
    public void unregister(Context context) {
    }

    public void updateIndicatorForOffset(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF calculateIndicatorWidthForTab = calculateIndicatorWidthForTab(tabLayout, view);
        RectF calculateIndicatorWidthForTab2 = calculateIndicatorWidthForTab(tabLayout, view2);
        drawable.setBounds(AnimationUtils.lerp((int) calculateIndicatorWidthForTab.left, (int) calculateIndicatorWidthForTab2.left, f), drawable.getBounds().top, AnimationUtils.lerp((int) calculateIndicatorWidthForTab.right, (int) calculateIndicatorWidthForTab2.right, f), drawable.getBounds().bottom);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
    public Object zza(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                zzvd zzvdVar = (zzvd) obj;
                float f = zzvdVar.zzf;
                Text.Line line = new Text.Line(zzvdVar.zza, zzvdVar.zzb, zzvdVar.zzc, zzvdVar.zzd);
                MapUtilsKt.zza(zzvdVar.zze, new zzc(0));
                return line;
            default:
                String str = (String) ((Text.Line) obj).zza;
                return str == null ? "" : str;
        }
    }

    public /* synthetic */ zzd(Object obj, int i) {
        this.$r8$classId = i;
    }

    public /* synthetic */ zzd(int i) {
        this.$r8$classId = i;
    }

    /* renamed from: fromValue, reason: collision with other method in class */
    public static SubscriptionState m2071fromValue(int i) {
        switch (i) {
            case 0:
                return SubscriptionState.SUBSCRIPTION_STATE_UNKNOWN;
            case 1:
                return SubscriptionState.PENDING_BILLING;
            case 2:
                return SubscriptionState.PENDING_PAYMENT;
            case 3:
                return SubscriptionState.ACTIVE;
            case 4:
                return SubscriptionState.PAST_DUE;
            case 5:
                return SubscriptionState.CANCELLED;
            case 6:
                return SubscriptionState.EXPIRED;
            case 7:
                return SubscriptionState.GRANT_REVOKED;
            case 8:
                return SubscriptionState.PENDING_ACTIVATION;
            default:
                return null;
        }
    }

    public static OverlayAppMessagePlacement valueOf(HalfSheetMessage.Placement placement) {
        placement.getClass();
        int ordinal = placement.ordinal();
        if (ordinal == 0) {
            return OverlayAppMessagePlacement.MoneyTab;
        }
        if (ordinal == 1) {
            return OverlayAppMessagePlacement.CardTab;
        }
        if (ordinal == 2) {
            return OverlayAppMessagePlacement.PaymentPadTab;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
