package coil3;

import android.content.Context;
import android.os.Parcelable;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidComposeView$snapshotObserver$1;
import androidx.core.os.BundleKt;
import androidx.core.provider.FontsContractCompat;
import androidx.core.text.TextUtilsCompat;
import androidx.work.Configuration;
import androidx.work.impl.Processor;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkLauncherImpl;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import app.cash.cdp.backend.android.AndroidDeviceInfoProvider;
import app.cash.cdp.backend.android.AndroidOperatingSystemInfoProvider;
import app.cash.cdp.backend.android.AndroidSessionIdProvider;
import app.cash.cdp.backend.android.CashApplicationInfoProvider;
import app.cash.cdp.integration.CdpModule$Companion$$ExternalSyntheticLambda1;
import app.cash.cdp.integration.CdpModule$Companion$provideCashCDP$1;
import app.cash.trifle.Trifle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.u4$$ExternalSyntheticLambda0;
import coil3.EventListener;
import coil3.Extras;
import coil3.RealImageLoader;
import coil3.request.ImageRequest;
import com.google.android.gms.dynamite.zzf;
import com.squareup.cash.R;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.cdf.AliasType;
import com.squareup.cash.cdf.account.AccountSignInComplete;
import com.squareup.cash.cdf.account.AccountSignInReceiveError;
import com.squareup.cash.cdf.alias.AliasRegisterComplete;
import com.squareup.cash.cdf.alias.AliasRegisterReceiveError;
import com.squareup.cash.common.messaging.api.ErrorMessaging;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.onboarding.util.AliasRegistrar$Args;
import com.squareup.cash.onboarding.util.AliasRegistrar$Result;
import com.squareup.cash.profile.views.RingtoneView;
import com.squareup.cash.registeralias.presenters.api.RegisterAliasResultHandler$RegisterAliasHandlingOutcome$ErrorMessaging;
import com.squareup.cash.registeralias.presenters.api.RegisterAliasResultHandler$RegisterAliasHandlingOutcome$Handled;
import com.squareup.cash.registeralias.presenters.api.RegisterAliasResultHandler$RegisterAliasHandlingOutcome$Navigation;
import com.squareup.cash.registeralias.presenters.real.ErrorType;
import com.squareup.cash.registeralias.presenters.real.RealRegisterAliasResultHandler$WhenMappings;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.session.backend.TimeToLiveSyncState;
import com.squareup.cash.storage.AndroidFileSaver$save$2;
import com.squareup.preferences.StringPreference;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.GrpcMethod;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class ImageLoader$Builder {
    public final Object application;
    public Object componentRegistry;
    public Object defaults;
    public Object diskCacheLazy;
    public Object eventListenerFactory;
    public Object extras;
    public final Object mainCoroutineContextLazy;
    public final Object memoryCacheLazy;

    public ImageLoader$Builder(RealImageLoader.Options options) {
        this.application = options.application;
        ImageRequest.Defaults defaults = options.defaults;
        this.defaults = defaults;
        this.mainCoroutineContextLazy = options.mainCoroutineContextLazy;
        this.memoryCacheLazy = options.memoryCacheLazy;
        this.diskCacheLazy = options.diskCacheLazy;
        this.eventListenerFactory = options.eventListenerFactory;
        this.componentRegistry = options.componentRegistry;
        Extras extras = defaults.extras;
        extras.getClass();
        this.extras = new Extras.Builder(extras);
    }

    public RealImageLoader build() {
        ComponentRegistry componentRegistry;
        Context context = (Context) this.application;
        ImageRequest.Defaults defaults = (ImageRequest.Defaults) this.defaults;
        Extras.Builder builder = (Extras.Builder) this.extras;
        builder.getClass();
        ImageRequest.Defaults copy$default = ImageRequest.Defaults.copy$default(defaults, null, null, null, new Extras(BundleKt.toImmutableMap(builder.data)), 8191);
        Lazy lazy = (Lazy) this.mainCoroutineContextLazy;
        if (lazy == null) {
            lazy = LazyKt.lazy(new u4$$ExternalSyntheticLambda0(16));
        }
        Lazy lazy2 = (Lazy) this.memoryCacheLazy;
        if (lazy2 == null) {
            lazy2 = LazyKt.lazy(new ImageLoader$Builder$$ExternalSyntheticLambda1(this, 0));
        }
        Lazy lazy3 = (Lazy) this.diskCacheLazy;
        if (lazy3 == null) {
            lazy3 = LazyKt.lazy(new u4$$ExternalSyntheticLambda0(17));
        }
        EventListener.Factory factory = (EventListener.Factory) this.eventListenerFactory;
        if (factory == null) {
            factory = EventListener.Factory.NONE;
        }
        ComponentRegistry componentRegistry2 = (ComponentRegistry) this.componentRegistry;
        if (componentRegistry2 == null) {
            EmptyList emptyList = EmptyList.INSTANCE;
            componentRegistry = new ComponentRegistry(emptyList, emptyList, emptyList, emptyList, emptyList);
        } else {
            componentRegistry = componentRegistry2;
        }
        return new RealImageLoader(new RealImageLoader.Options(context, copy$default, lazy, lazy2, lazy3, factory, componentRegistry));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x017e, code lost:
    
        if (r2 > 0) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FontsContractCompat handleRegisterAliasResult(AliasRegistrar$Result aliasRegistrar$Result, String str, String str2, boolean z, AliasRegistrar$Args.DeliveryMechanism deliveryMechanism, BlockersScreens blockersScreens, String str3) {
        AliasType aliasType;
        String str4;
        String str5;
        String str6;
        String str7;
        ErrorType errorType;
        ErrorMessaging errorMessaging;
        CoroutineScope coroutineScope;
        Continuation continuation;
        int i;
        Continuation continuation2;
        String str8;
        CoroutineScope coroutineScope2 = (CoroutineScope) this.memoryCacheLazy;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.componentRegistry;
        str.getClass();
        str2.getClass();
        blockersScreens.getClass();
        str3.getClass();
        if (deliveryMechanism != null) {
            int ordinal = deliveryMechanism.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    aliasType = AliasType.EMAIL;
                } else if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
            }
            aliasType = AliasType.SMS;
        } else {
            aliasType = null;
        }
        if (aliasRegistrar$Result instanceof AliasRegistrar$Result.Successful) {
            Timber.Forest.d("Successfully registered alias", new Object[0]);
            ((Analytics) this.application).track(z ? new AccountSignInComplete(aliasType, str2) : new AliasRegisterComplete(aliasType, Boolean.FALSE, str2), null);
            ((TimeToLiveSyncState) this.defaults).lastAttemptedRefresh = 0L;
            if (deliveryMechanism == AliasRegistrar$Args.DeliveryMechanism.EMAIL) {
                ((StringPreference) this.mainCoroutineContextLazy).set(str);
            }
            RedactedString redactedString = new RedactedString(null);
            RedactedString redactedString2 = new RedactedString(null);
            int i2 = deliveryMechanism == null ? -1 : RealRegisterAliasResultHandler$WhenMappings.$EnumSwitchMapping$0[deliveryMechanism.ordinal()];
            if (i2 == -1) {
                a$$ExternalSyntheticBUOutline0.m$1("deliveryMechanism is missing when an alias is successfully registered");
                return null;
            }
            if (i2 == 1 || i2 == 2) {
                redactedString = new RedactedString(str);
            } else {
                if (i2 != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                redactedString2 = new RedactedString(str);
            }
            BlockersData copy$default = BlockersData.copy$default(blockersScreens.getBlockersData(), null, str2, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, redactedString, redactedString2, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -1572867, 65535);
            AliasRegistrar$Result.Successful successful = (AliasRegistrar$Result.Successful) aliasRegistrar$Result;
            ResponseContext responseContext = successful.getResponseContext();
            responseContext.getClass();
            BlockersData updateFromResponseContext = copy$default.updateFromResponseContext(responseContext, false);
            if (blockersScreens.getBlockersData().flow == BlockersData.Flow.ONBOARDING) {
                continuation = null;
                coroutineScope = coroutineScope2;
                i = 3;
                JobKt.launch$default(coroutineScope, null, null, new RingtoneView.AnonymousClass1(this, str2, continuation, 25), 3);
            } else {
                coroutineScope = coroutineScope2;
                continuation = null;
                i = 3;
            }
            ResponseContext responseContext2 = successful.getResponseContext();
            if (responseContext2 != null && (str8 = responseContext2.dialog_message) != 0) {
                int length = str8.length();
                continuation2 = str8;
            }
            continuation2 = continuation;
            if (continuation2 != null) {
                ResponseContext responseContext3 = successful.getResponseContext();
                return new RegisterAliasResultHandler$RegisterAliasHandlingOutcome$Navigation(new BlockersScreens.SuccessMessageScreen(updateFromResponseContext, null, continuation2, responseContext3 != null ? responseContext3.dialog_title : continuation, 2));
            }
            ?? r4 = continuation;
            JobKt.launch$default(coroutineScope, r4, r4, new AndroidFileSaver$save$2(this, blockersScreens, updateFromResponseContext, r4, 22), i);
            return RegisterAliasResultHandler$RegisterAliasHandlingOutcome$Handled.INSTANCE;
        }
        if (aliasRegistrar$Result instanceof AliasRegistrar$Result.NetworkFailure) {
            Timber.Forest.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to ", str3, "."), new Object[0]);
            reportAnalyticsError(z, ErrorType.FAILURE, str2, aliasType);
            BlockersData blockersData = blockersScreens.getBlockersData();
            errorMessaging = TextUtilsCompat.errorMessaging(androidStringManager, ((AliasRegistrar$Result.NetworkFailure) aliasRegistrar$Result).getFailure(), null);
            return new RegisterAliasResultHandler$RegisterAliasHandlingOutcome$Navigation(new FailureMessageBlockerScreen(blockersData, errorMessaging.getMessage(), r12, 4), true);
        }
        if (!(aliasRegistrar$Result instanceof AliasRegistrar$Result.NotSuccessful)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        if (deliveryMechanism == null) {
            a$$ExternalSyntheticBUOutline0.m$3("deliveryMechanism is missing when an alias registration failed due to non-network errors");
            return null;
        }
        if (aliasType == null) {
            a$$ExternalSyntheticBUOutline0.m$3("aliasType is missing when an alias registration failed due to non-network errors");
            return null;
        }
        AliasRegistrar$Result.NotSuccessful notSuccessful = (AliasRegistrar$Result.NotSuccessful) aliasRegistrar$Result;
        ResponseContext responseContext4 = notSuccessful.getResponseContext();
        if (responseContext4 == null || (str4 = responseContext4.dialog_message) == null || str4.length() <= 0) {
            str4 = null;
        }
        if (str4 != null) {
            int ordinal2 = notSuccessful.getStatus().ordinal();
            if (ordinal2 == 0) {
                errorType = ErrorType.INVALID_ALIAS;
            } else if (ordinal2 == 1) {
                errorType = ErrorType.TOO_MANY_REQUESTS;
            } else {
                if (ordinal2 != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                errorType = ErrorType.DUPLICATE_ALIAS;
            }
            reportAnalyticsError(z, errorType, str2, aliasType);
            BlockersData blockersData2 = blockersScreens.getBlockersData();
            ResponseContext responseContext5 = notSuccessful.getResponseContext();
            responseContext5.getClass();
            Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
            BlockersData updateFromResponseContext2 = blockersData2.updateFromResponseContext(responseContext5, false);
            ResponseContext responseContext6 = notSuccessful.getResponseContext();
            return new RegisterAliasResultHandler$RegisterAliasHandlingOutcome$Navigation(new BlockersScreens.SuccessMessageScreen(updateFromResponseContext2, blockersScreens, str4, responseContext6 != null ? responseContext6.dialog_title : null));
        }
        int ordinal3 = notSuccessful.getStatus().ordinal();
        if (ordinal3 == 0) {
            Timber.Forest.d(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to ", str3, ". Invalid alias."), new Object[0]);
            reportAnalyticsError(z, ErrorType.INVALID_ALIAS, str2, aliasType);
            int ordinal4 = deliveryMechanism.ordinal();
            if (ordinal4 != 0) {
                if (ordinal4 == 1) {
                    str5 = androidStringManager.get(R.string.blockers_register_email_error_invalid);
                    return new RegisterAliasResultHandler$RegisterAliasHandlingOutcome$ErrorMessaging(str5);
                }
                if (ordinal4 != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
            }
            str5 = androidStringManager.get(R.string.blockers_register_sms_error_invalid);
            return new RegisterAliasResultHandler$RegisterAliasHandlingOutcome$ErrorMessaging(str5);
        }
        if (ordinal3 == 1) {
            Timber.Forest.d(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to ", str3, ". Too many requests."), new Object[0]);
            reportAnalyticsError(z, ErrorType.TOO_MANY_REQUESTS, str2, aliasType);
            int ordinal5 = deliveryMechanism.ordinal();
            if (ordinal5 != 0) {
                if (ordinal5 == 1) {
                    str6 = androidStringManager.get(R.string.blockers_register_email_error_too_many);
                    return new RegisterAliasResultHandler$RegisterAliasHandlingOutcome$Navigation(new BlockersScreens.RegisterErrorScreen(blockersScreens.getBlockersData(), str6));
                }
                if (ordinal5 != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
            }
            str6 = androidStringManager.get(R.string.blockers_register_sms_error_too_many);
            return new RegisterAliasResultHandler$RegisterAliasHandlingOutcome$Navigation(new BlockersScreens.RegisterErrorScreen(blockersScreens.getBlockersData(), str6));
        }
        if (ordinal3 != 2) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        Timber.Forest.d(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to ", str3, ". Duplicate alias."), new Object[0]);
        reportAnalyticsError(z, ErrorType.DUPLICATE_ALIAS, str2, aliasType);
        int ordinal6 = deliveryMechanism.ordinal();
        if (ordinal6 != 0) {
            if (ordinal6 == 1) {
                str7 = androidStringManager.get(R.string.blockers_register_email_error_duplicate);
                return new RegisterAliasResultHandler$RegisterAliasHandlingOutcome$ErrorMessaging(str7);
            }
            if (ordinal6 != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        str7 = androidStringManager.get(R.string.blockers_register_sms_error_duplicate);
        return new RegisterAliasResultHandler$RegisterAliasHandlingOutcome$ErrorMessaging(str7);
    }

    public void reportAnalyticsError(boolean z, ErrorType errorType, String str, AliasType aliasType) {
        ((Analytics) this.application).track(z ? new AccountSignInReceiveError(aliasType, errorType.getSignInType(), str) : new AliasRegisterReceiveError(aliasType, errorType.getRegisterType(), str), null);
    }

    public ImageLoader$Builder(AndroidComposeView$snapshotObserver$1 androidComposeView$snapshotObserver$1) {
        this.application = new SnapshotStateObserver(androidComposeView$snapshotObserver$1);
        this.defaults = OwnerSnapshotObserver$onCommitAffectingLayout$1.INSTANCE$10;
        this.mainCoroutineContextLazy = OwnerSnapshotObserver$onCommitAffectingLayout$1.INSTANCE$11;
        this.memoryCacheLazy = OwnerSnapshotObserver$onCommitAffectingLayout$1.INSTANCE$12;
        this.diskCacheLazy = OwnerSnapshotObserver$onCommitAffectingLayout$1.INSTANCE;
        this.eventListenerFactory = OwnerSnapshotObserver$onCommitAffectingLayout$1.INSTANCE$7;
        this.componentRegistry = OwnerSnapshotObserver$onCommitAffectingLayout$1.INSTANCE$8;
        this.extras = OwnerSnapshotObserver$onCommitAffectingLayout$1.INSTANCE$9;
    }

    public ImageLoader$Builder(CdpModule$Companion$provideCashCDP$1 cdpModule$Companion$provideCashCDP$1, AndroidDeviceInfoProvider androidDeviceInfoProvider, AndroidOperatingSystemInfoProvider androidOperatingSystemInfoProvider, CashApplicationInfoProvider cashApplicationInfoProvider, Trifle trifle, zzf zzfVar, CdpModule$Companion$$ExternalSyntheticLambda1 cdpModule$Companion$$ExternalSyntheticLambda1, WorkLauncherImpl workLauncherImpl, AndroidSessionIdProvider androidSessionIdProvider, OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0) {
        u4$$ExternalSyntheticLambda0 u4__externalsyntheticlambda0 = new u4$$ExternalSyntheticLambda0(13);
        this.application = cdpModule$Companion$provideCashCDP$1;
        this.defaults = androidDeviceInfoProvider;
        this.mainCoroutineContextLazy = cashApplicationInfoProvider;
        this.memoryCacheLazy = u4__externalsyntheticlambda0;
        this.diskCacheLazy = cdpModule$Companion$$ExternalSyntheticLambda1;
        this.eventListenerFactory = workLauncherImpl;
        this.componentRegistry = onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
        this.extras = FlowKt.asStateFlow(androidSessionIdProvider.sessionId);
    }

    public ImageLoader$Builder(Context context) {
        this.application = context.getApplicationContext();
        this.defaults = ImageRequest.Defaults.DEFAULT;
        this.mainCoroutineContextLazy = null;
        this.memoryCacheLazy = null;
        this.diskCacheLazy = null;
        this.eventListenerFactory = null;
        this.componentRegistry = null;
        this.extras = new Extras.Builder();
    }

    public /* synthetic */ ImageLoader$Builder(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        this.application = obj;
        this.defaults = obj2;
        this.mainCoroutineContextLazy = obj3;
        this.memoryCacheLazy = obj4;
        this.diskCacheLazy = obj5;
        this.eventListenerFactory = obj6;
        this.componentRegistry = obj7;
        this.extras = obj8;
    }

    public ImageLoader$Builder(Context context, Configuration configuration, WorkManagerTaskExecutor workManagerTaskExecutor, Processor processor, WorkDatabase workDatabase, WorkSpec workSpec, ArrayList arrayList) {
        context.getClass();
        processor.getClass();
        this.defaults = configuration;
        this.mainCoroutineContextLazy = workManagerTaskExecutor;
        this.memoryCacheLazy = processor;
        this.diskCacheLazy = workDatabase;
        this.eventListenerFactory = workSpec;
        this.componentRegistry = arrayList;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.application = applicationContext;
        this.extras = new GrpcMethod(17, false);
    }
}
