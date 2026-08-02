package com.squareup.cash.keystore;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.room.Room;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import com.braze.enums.DataStoreKey$$ExternalSyntheticLambda0;
import com.google.mlkit.vision.text.internal.zzr;
import com.squareup.cash.cashapplite.CashAppLiteReleaseModule$$ExternalSyntheticLambda0;
import com.squareup.cash.clientsync.pipeline.CustomerSyncEntityStorageObserver;
import com.squareup.cash.clientsync.pipeline.InvitationSyncEntityStorageObserver;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.investing.backend.real.InvestmentEntitySyncEntityStorageObserver;
import com.squareup.cash.investing.backend.real.RecurringScheduleBuilder;
import com.squareup.cash.investing.backend.real.categories.InvestmentCategorySyncEntityStorageObserver;
import com.squareup.cash.investing.db.InvestmentHoldingQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.limits.views.LimitsViewFactory;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.localization.RealUrlLocalizer;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda0;
import com.squareup.cash.merchant.backend.real.RealThirdPartyOfferAnalyticsFlowProvider;
import com.squareup.cash.money.presenters.HypeDismissedPreference;
import com.squareup.cash.money.privacy.RealBalancePrivacy;
import com.squareup.cash.moneybot.backend.real.managers.RealMoneybotPreambleManager;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.score.views.ScoreUiFactory;
import com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda5;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.money.Moneys$$ExternalSyntheticLambda0;
import com.squareup.preferences.KeyValue;
import com.squareup.preferences.LongPreference;
import com.squareup.preferences.SharedPreferencesKeyValue;
import com.squareup.protos.cash.security.mri.api.v1.AttestedKeySigningData;
import com.squareup.protos.common.signing.AttestedKeyClientError;
import com.squareup.protos.common.signing.SigningData;
import com.squareup.protos.common.signing.SigningData$SignatureData$AttestedKey;
import com.squareup.wire.Message;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlinx.coroutines.JobKt;
import net.oneformapp.helper.HelperFunctions;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import radiography.internal.RenderTreeStringKt;

/* loaded from: classes.dex */
public final class RealMessageSigner {
    public final CoroutineContext computationDispatcher;

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider computationDispatcher;

        public /* synthetic */ MetroFactory(Provider provider, int i) {
            this.$r8$classId = i;
            this.computationDispatcher = provider;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            SharedPreferencesKeyValue SerDeKeyValue$default;
            SharedPreferencesKeyValue SerDeKeyValue$default2;
            int i = this.$r8$classId;
            int i2 = 6;
            int i3 = 8;
            int i4 = 7;
            int i5 = 0;
            Provider provider = this.computationDispatcher;
            switch (i) {
                case 0:
                    CoroutineContext coroutineContext = (CoroutineContext) provider.invoke();
                    coroutineContext.getClass();
                    return new RealMessageSigner(coroutineContext);
                case 1:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider.invoke();
                    cashAccountDatabaseImpl.getClass();
                    return new InvestmentEntitySyncEntityStorageObserver(cashAccountDatabaseImpl, 1);
                case 2:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl2 = (CashAccountDatabaseImpl) provider.invoke();
                    cashAccountDatabaseImpl2.getClass();
                    return new InvestmentEntitySyncEntityStorageObserver(cashAccountDatabaseImpl2, 0);
                case 3:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl3 = (CashAccountDatabaseImpl) provider.invoke();
                    cashAccountDatabaseImpl3.getClass();
                    return new CustomerSyncEntityStorageObserver(cashAccountDatabaseImpl3);
                case 4:
                    AndroidClock androidClock = (AndroidClock) provider.invoke();
                    androidClock.getClass();
                    return new RecurringScheduleBuilder(androidClock);
                case 5:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl4 = (CashAccountDatabaseImpl) provider.invoke();
                    cashAccountDatabaseImpl4.getClass();
                    return new InvestmentCategorySyncEntityStorageObserver(cashAccountDatabaseImpl4);
                case 6:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl5 = (CashAccountDatabaseImpl) provider.invoke();
                    cashAccountDatabaseImpl5.getClass();
                    return new InvitationSyncEntityStorageObserver(cashAccountDatabaseImpl5, 1);
                case 7:
                    SharedPreferences sharedPreferences = (SharedPreferences) provider.invoke();
                    sharedPreferences.getClass();
                    SerDeKeyValue$default = Room.SerDeKeyValue$default(sharedPreferences, "metric_type_for_dependent_portfolio_stocks", new InvestmentHoldingQueries$$ExternalSyntheticLambda4(20), new InvestmentHoldingQueries$$ExternalSyntheticLambda4(21), new ClusterItemKt$$ExternalSyntheticLambda0(16), 96);
                    return SerDeKeyValue$default;
                case 8:
                    SharedPreferences sharedPreferences2 = (SharedPreferences) provider.invoke();
                    sharedPreferences2.getClass();
                    return HelperFunctions.metricTypePreferenceForFollowing(sharedPreferences2);
                case 9:
                    SharedPreferences sharedPreferences3 = (SharedPreferences) provider.invoke();
                    sharedPreferences3.getClass();
                    SerDeKeyValue$default2 = Room.SerDeKeyValue$default(sharedPreferences3, "metric_type_for_portfolio_stocks", new InvestmentHoldingQueries$$ExternalSyntheticLambda4(22), new InvestmentHoldingQueries$$ExternalSyntheticLambda4(23), new ClusterItemKt$$ExternalSyntheticLambda0(17), 96);
                    return SerDeKeyValue$default2;
                case 10:
                    RealImageLoader realImageLoader = (RealImageLoader) provider.invoke();
                    realImageLoader.getClass();
                    return new ScoreUiFactory(realImageLoader, i4);
                case 11:
                    SharedPreferences sharedPreferences4 = (SharedPreferences) provider.invoke();
                    sharedPreferences4.getClass();
                    return new LongPreference(sharedPreferences4, "last-seen-limits-pagelet-version", -1L);
                case 12:
                    RealImageLoader realImageLoader2 = (RealImageLoader) provider.invoke();
                    realImageLoader2.getClass();
                    return new LimitsViewFactory(realImageLoader2, i5);
                case 13:
                    RealLocaleManager realLocaleManager = (RealLocaleManager) provider.invoke();
                    realLocaleManager.getClass();
                    return new RealUrlLocalizer(realLocaleManager);
                case 14:
                    SharedPreferences sharedPreferences5 = (SharedPreferences) provider.invoke();
                    sharedPreferences5.getClass();
                    return Room.SerDeKeyValue$default(sharedPreferences5, "lastResolvedLocale", new MainActivity$$ExternalSyntheticLambda5(3), new MainActivity$$ExternalSyntheticLambda5(4), new Moneys$$ExternalSyntheticLambda0(11), 96);
                case 15:
                    SharedPreferences sharedPreferences6 = (SharedPreferences) provider.invoke();
                    sharedPreferences6.getClass();
                    return Room.BooleanKeyValue(sharedPreferences6, "is_language_disclosure_acceptance_pending", false, false);
                case 16:
                    SharedPreferences sharedPreferences7 = (SharedPreferences) provider.invoke();
                    sharedPreferences7.getClass();
                    return Room.BooleanKeyValue(sharedPreferences7, "is_spanish_enabled", false, false);
                case 17:
                    SharedPreferences sharedPreferences8 = (SharedPreferences) provider.invoke();
                    sharedPreferences8.getClass();
                    return Room.SerDeKeyValue$default(sharedPreferences8, "responseContextCountry", new MainActivity$$ExternalSyntheticLambda5(5), new MainActivity$$ExternalSyntheticLambda5(i2), new DataStoreKey$$ExternalSyntheticLambda0(17), 96);
                case 18:
                    RealUuidGenerator realUuidGenerator = (RealUuidGenerator) provider.invoke();
                    realUuidGenerator.getClass();
                    return new RealThirdPartyOfferAnalyticsFlowProvider(realUuidGenerator);
                case 19:
                    RealImageLoader realImageLoader3 = (RealImageLoader) provider.invoke();
                    realImageLoader3.getClass();
                    return new ScoreUiFactory(realImageLoader3, i3);
                case 20:
                    RealImageLoader realImageLoader4 = (RealImageLoader) provider.invoke();
                    realImageLoader4.getClass();
                    return new LimitsViewFactory(realImageLoader4, i2);
                case 21:
                    CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda0 = (CashAppLiteReleaseModule$$ExternalSyntheticLambda0) provider.invoke();
                    cashAppLiteReleaseModule$$ExternalSyntheticLambda0.getClass();
                    return RenderTreeStringKt.provideAppletTileUninstalledRowVariantProvider$sections(cashAppLiteReleaseModule$$ExternalSyntheticLambda0);
                case 22:
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider.invoke();
                    featureFlagManager.getClass();
                    return new zzr(featureFlagManager, 25);
                case 23:
                    SharedPreferences sharedPreferences9 = (SharedPreferences) provider.invoke();
                    sharedPreferences9.getClass();
                    return Room.SerDeKeyValue$default(sharedPreferences9, "promoted_applet_tile_cache_locale", new MainActivity$$ExternalSyntheticLambda5(i4), new MainActivity$$ExternalSyntheticLambda5(i3), new Moneys$$ExternalSyntheticLambda0(12), 96);
                case 24:
                    RealImageLoader realImageLoader5 = (RealImageLoader) provider.invoke();
                    realImageLoader5.getClass();
                    return new ScoreUiFactory(realImageLoader5, 9);
                case 25:
                    SharedPreferences sharedPreferences10 = (SharedPreferences) provider.invoke();
                    sharedPreferences10.getClass();
                    return new HypeDismissedPreference(sharedPreferences10);
                case 26:
                    SharedPreferences sharedPreferences11 = (SharedPreferences) provider.invoke();
                    sharedPreferences11.getClass();
                    return new RealBalancePrivacy(sharedPreferences11);
                case 27:
                    KeyValue keyValue = (KeyValue) provider.invoke();
                    keyValue.getClass();
                    return new RealMoneybotPreambleManager(keyValue);
                case 28:
                    Context context = (Context) provider.invoke();
                    context.getClass();
                    return new zzr(context);
                default:
                    RealLocaleManager realLocaleManager2 = (RealLocaleManager) provider.invoke();
                    realLocaleManager2.getClass();
                    return new LocalizedMoneyFormatter.Factory(realLocaleManager2);
            }
        }
    }

    public RealMessageSigner(CoroutineContext coroutineContext) {
        this.computationDispatcher = coroutineContext;
    }

    /* renamed from: addSigningDataToMessage-yxL6bBk$default, reason: not valid java name */
    public static Serializable m3591addSigningDataToMessageyxL6bBk$default(RealMessageSigner realMessageSigner, Message message, byte[] bArr, boolean z, AttestedKeySigningData attestedKeySigningData, AttestedKeyClientError attestedKeyClientError, int i) {
        List list;
        if ((i & 8) != 0) {
            attestedKeySigningData = null;
        }
        if ((i & 16) != 0) {
            attestedKeyClientError = null;
        }
        ByteString.Companion companion = ByteString.Companion;
        ByteString of$default = ByteString.Companion.of$default(bArr);
        ByteString byteString = attestedKeySigningData != null ? attestedKeySigningData.signature : null;
        String str = attestedKeySigningData != null ? attestedKeySigningData.key_alias : null;
        if (attestedKeySigningData == null || (list = attestedKeySigningData.certificate_chain) == null) {
            list = EmptyList.INSTANCE;
        }
        SigningData signingData = new SigningData(of$default, new SigningData$SignatureData$AttestedKey(new SigningData.AttestedKeySigningData(byteString, str, list, attestedKeyClientError)));
        if (z) {
            return m3592copyAndAddSigningDatagIAlus(message, signingData);
        }
        try {
            return m3592copyAndAddSigningDatagIAlus((Message) message.adapter().decode(new byte[0]), signingData);
        } catch (IllegalStateException e) {
            String message2 = e.getMessage();
            if (message2 == null || !new Regex(".*Required.*not set.*", RegexOption.DOT_MATCHES_ALL).matches(message2)) {
                throw e;
            }
            Result.Companion companion2 = Result.Companion;
            return new Result.Failure(new RequiredFieldsException(Reflection.factory.getOrCreateKotlinClass(message.getClass()), e));
        }
    }

    /* renamed from: copyAndAddSigningData-gIAlu-s, reason: not valid java name */
    public static Serializable m3592copyAndAddSigningDatagIAlus(Message message, SigningData signingData) {
        Method method;
        Message.Builder newBuilder = message.newBuilder();
        try {
            method = newBuilder.getClass().getMethod("signing_data_", (Class[]) Arrays.copyOf(new Class[]{SigningData.class}, 1));
        } catch (NoSuchMethodException unused) {
            method = null;
        }
        if (method == null) {
            Result.Companion companion = Result.Companion;
            return new Result.Failure(new ReflectionException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Builder for ", Reflection.factory.getOrCreateKotlinClass(message.getClass()).getQualifiedName(), " has no signing_data_() method")));
        }
        method.invoke(newBuilder, signingData);
        Result.Companion companion2 = Result.Companion;
        Message build = newBuilder.build();
        build.getClass();
        return build;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: sign-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3594signyxL6bBk(Message message, AttestedKeyService attestedKeyService, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        RealMessageSigner$sign$1 realMessageSigner$sign$1;
        int i;
        if (continuationImpl instanceof RealMessageSigner$sign$1) {
            realMessageSigner$sign$1 = (RealMessageSigner$sign$1) continuationImpl;
            int i2 = realMessageSigner$sign$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realMessageSigner$sign$1.label = i2 - PKIFailureInfo.systemUnavail;
                RealMessageSigner$sign$1 realMessageSigner$sign$12 = realMessageSigner$sign$1;
                Object obj = realMessageSigner$sign$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realMessageSigner$sign$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealMessageSigner$sign$2 realMessageSigner$sign$2 = new RealMessageSigner$sign$2(this, message, z2, attestedKeyService, z, null);
                    realMessageSigner$sign$12.label = 1;
                    obj = JobKt.withContext(this.computationDispatcher, realMessageSigner$sign$2, realMessageSigner$sign$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return ((Result) obj).value;
            }
        }
        realMessageSigner$sign$1 = new RealMessageSigner$sign$1(this, continuationImpl);
        RealMessageSigner$sign$1 realMessageSigner$sign$122 = realMessageSigner$sign$1;
        Object obj2 = realMessageSigner$sign$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realMessageSigner$sign$122.label;
        if (i != 0) {
        }
        return ((Result) obj2).value;
    }
}
