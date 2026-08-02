package com.squareup.cash.onboarding.accountpicker.backend;

import android.os.Parcelable;
import androidx.camera.camera2.adapter.ZslControlImpl$$ExternalSyntheticLambda1;
import androidx.core.text.TextUtilsCompat;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.cdf.AliasType;
import com.squareup.cash.cdf.account.AccountReturningLoginLoginAttempted;
import com.squareup.cash.cdf.account.AccountReturningLoginLoginSuccess;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingAccountPickerErrorScreen;
import com.squareup.cash.onboarding.util.AliasRegistrar$Args;
import com.squareup.cash.onboarding.util.AliasRegistrar$Result;
import com.squareup.cash.onboarding.util.RealAliasRegistrar;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.RedactedString;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealSelectedAliasRegistrar {
    public final RealAliasRegistrar aliasRegistrar;
    public final Analytics analytics;
    public final BlockersDataNavigator blockersNavigator;
    public final FlowStarter flowStarter;
    public final AndroidStringManager stringManager;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UiAlias.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                UiAlias.Type.Companion companion = UiAlias.Type.Companion;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AliasRegistrar$Args.DeliveryMechanism.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AliasRegistrar$Args.DeliveryMechanism deliveryMechanism = AliasRegistrar$Args.DeliveryMechanism.SMS;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AliasRegistrar$Args.DeliveryMechanism deliveryMechanism2 = AliasRegistrar$Args.DeliveryMechanism.SMS;
                iArr2[1] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[AliasRegistrar$Result.NotSuccessful.Status.values().length];
            try {
                iArr3[1] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AliasRegistrar$Result.NotSuccessful.Status status = AliasRegistrar$Result.NotSuccessful.Status.INVALID_ALIAS;
                iArr3[0] = 2;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public RealSelectedAliasRegistrar(BlockersDataNavigator blockersDataNavigator, RealAliasRegistrar realAliasRegistrar, AndroidStringManager androidStringManager, FlowStarter flowStarter, Analytics analytics) {
        this.blockersNavigator = blockersDataNavigator;
        this.aliasRegistrar = realAliasRegistrar;
        this.stringManager = androidStringManager;
        this.flowStarter = flowStarter;
        this.analytics = analytics;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object registerSelectedAlias(UiAlias uiAlias, String str, ClientScenario clientScenario, Screen screen, ContinuationImpl continuationImpl) {
        RealSelectedAliasRegistrar$registerSelectedAlias$1 realSelectedAliasRegistrar$registerSelectedAlias$1;
        int i;
        AliasRegistrar$Args.DeliveryMechanism deliveryMechanism;
        AliasType aliasType;
        BlockersData blockersData;
        Screen screen2;
        AliasRegistrar$Args.DeliveryMechanism deliveryMechanism2;
        String str2;
        boolean z;
        String str3;
        String str4;
        if (continuationImpl instanceof RealSelectedAliasRegistrar$registerSelectedAlias$1) {
            realSelectedAliasRegistrar$registerSelectedAlias$1 = (RealSelectedAliasRegistrar$registerSelectedAlias$1) continuationImpl;
            int i2 = realSelectedAliasRegistrar$registerSelectedAlias$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realSelectedAliasRegistrar$registerSelectedAlias$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realSelectedAliasRegistrar$registerSelectedAlias$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realSelectedAliasRegistrar$registerSelectedAlias$1.label;
                String str5 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    UiAlias.Type type2 = uiAlias.f1363type;
                    String str6 = uiAlias.canonical_text;
                    int i3 = type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
                    if (i3 == 1) {
                        deliveryMechanism = AliasRegistrar$Args.DeliveryMechanism.SMS;
                    } else {
                        if (i3 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("Unknown alias type.");
                            return null;
                        }
                        deliveryMechanism = AliasRegistrar$Args.DeliveryMechanism.EMAIL;
                    }
                    AliasRegistrar$Args.DeliveryMechanism deliveryMechanism3 = deliveryMechanism;
                    RedactedString redactedString = new RedactedString(str6);
                    RedactedString redactedString2 = new RedactedString(null);
                    BlockersData copy$default = BlockersData.copy$default(FlowStarter.startFlow$default(this.flowStarter, BlockersData.Flow.ONBOARDING, screen, null, clientScenario, null, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_BW_HALFTONING_INFO), null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, deliveryMechanism3 == AliasRegistrar$Args.DeliveryMechanism.SMS ? redactedString : redactedString2, deliveryMechanism3 == AliasRegistrar$Args.DeliveryMechanism.EMAIL ? redactedString : redactedString2, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -1572865, 65535);
                    String str7 = copy$default.flowToken;
                    str6.getClass();
                    AliasRegistrar$Args aliasRegistrar$Args = new AliasRegistrar$Args(str6, deliveryMechanism3, new RequestContext(null, null, null, null, null, null, null, null, 8191), clientScenario, str7, false, str, 32);
                    UiAlias.Type type3 = uiAlias.f1363type;
                    int i4 = type3 != null ? WhenMappings.$EnumSwitchMapping$0[type3.ordinal()] : -1;
                    if (i4 == 1) {
                        aliasType = AliasType.SMS;
                    } else {
                        if (i4 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("Unknown alias type.");
                            return null;
                        }
                        aliasType = AliasType.EMAIL;
                    }
                    realSelectedAliasRegistrar$registerSelectedAlias$1.L$3 = screen;
                    realSelectedAliasRegistrar$registerSelectedAlias$1.L$4 = deliveryMechanism3;
                    realSelectedAliasRegistrar$registerSelectedAlias$1.L$7 = copy$default;
                    realSelectedAliasRegistrar$registerSelectedAlias$1.L$8 = str7;
                    realSelectedAliasRegistrar$registerSelectedAlias$1.L$10 = aliasType;
                    realSelectedAliasRegistrar$registerSelectedAlias$1.label = 1;
                    Object register = this.aliasRegistrar.register(aliasRegistrar$Args, realSelectedAliasRegistrar$registerSelectedAlias$1);
                    if (register == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    blockersData = copy$default;
                    obj = register;
                    screen2 = screen;
                    deliveryMechanism2 = deliveryMechanism3;
                    str2 = str7;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aliasType = realSelectedAliasRegistrar$registerSelectedAlias$1.L$10;
                    str2 = realSelectedAliasRegistrar$registerSelectedAlias$1.L$8;
                    blockersData = realSelectedAliasRegistrar$registerSelectedAlias$1.L$7;
                    deliveryMechanism2 = realSelectedAliasRegistrar$registerSelectedAlias$1.L$4;
                    screen2 = realSelectedAliasRegistrar$registerSelectedAlias$1.L$3;
                    SafeTrace.throwOnFailure(obj);
                }
                AliasRegistrar$Result aliasRegistrar$Result = (AliasRegistrar$Result) obj;
                AccountReturningLoginLoginAttempted accountReturningLoginLoginAttempted = new AccountReturningLoginLoginAttempted(aliasType, str2);
                Analytics analytics = this.analytics;
                analytics.track(accountReturningLoginLoginAttempted, null);
                z = aliasRegistrar$Result instanceof AliasRegistrar$Result.NetworkFailure;
                AndroidStringManager androidStringManager = this.stringManager;
                if (!z) {
                    return new FailureMessageBlockerScreen(blockersData, TextUtilsCompat.errorMessaging(androidStringManager, ((AliasRegistrar$Result.NetworkFailure) aliasRegistrar$Result).failure, null).message, null, 4);
                }
                if (!(aliasRegistrar$Result instanceof AliasRegistrar$Result.NotSuccessful)) {
                    if (!(aliasRegistrar$Result instanceof AliasRegistrar$Result.Successful)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    analytics.track(new AccountReturningLoginLoginSuccess(aliasType, str2), null);
                    ResponseContext responseContext = ((AliasRegistrar$Result.Successful) aliasRegistrar$Result).responseContext;
                    responseContext.getClass();
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    BlockersData updateFromResponseContext = blockersData.updateFromResponseContext(responseContext, false);
                    String str8 = responseContext.dialog_message;
                    if (str8 != null && str8.length() > 0) {
                        str5 = str8;
                    }
                    return str5 != null ? new BlockersScreens.SuccessMessageScreen(updateFromResponseContext, null, str5, responseContext.dialog_title, 2) : this.blockersNavigator.getNext(screen2, updateFromResponseContext);
                }
                AliasRegistrar$Result.NotSuccessful notSuccessful = (AliasRegistrar$Result.NotSuccessful) aliasRegistrar$Result;
                AliasRegistrar$Result.NotSuccessful.Status status = notSuccessful.status;
                ResponseContext responseContext2 = notSuccessful.responseContext;
                if (responseContext2 == null || (str3 = responseContext2.dialog_message) == null || str3.length() <= 0) {
                    str3 = null;
                }
                if (str3 != null) {
                    responseContext2.getClass();
                    Parcelable.Creator<BlockersData> creator2 = BlockersData.CREATOR;
                    return new BlockersScreens.SuccessMessageScreen(blockersData.updateFromResponseContext(responseContext2, false), screen2, str3, responseContext2.dialog_title);
                }
                int ordinal = status.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        return new OnboardingAccountPickerErrorScreen(androidStringManager.get(R.string.register_preferred_alias_too_many_attempts));
                    }
                    ZslControlImpl$$ExternalSyntheticLambda1.m(status, "Unexpected response status: ");
                    return null;
                }
                int ordinal2 = deliveryMechanism2.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        str4 = androidStringManager.get(R.string.blockers_register_email_error_invalid);
                        return new OnboardingAccountPickerErrorScreen(str4);
                    }
                    if (ordinal2 != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                }
                str4 = androidStringManager.get(R.string.blockers_register_sms_error_invalid);
                return new OnboardingAccountPickerErrorScreen(str4);
            }
        }
        realSelectedAliasRegistrar$registerSelectedAlias$1 = new RealSelectedAliasRegistrar$registerSelectedAlias$1(this, continuationImpl);
        Object obj2 = realSelectedAliasRegistrar$registerSelectedAlias$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSelectedAliasRegistrar$registerSelectedAlias$1.label;
        String str52 = null;
        if (i != 0) {
        }
        AliasRegistrar$Result aliasRegistrar$Result2 = (AliasRegistrar$Result) obj2;
        AccountReturningLoginLoginAttempted accountReturningLoginLoginAttempted2 = new AccountReturningLoginLoginAttempted(aliasType, str2);
        Analytics analytics2 = this.analytics;
        analytics2.track(accountReturningLoginLoginAttempted2, null);
        z = aliasRegistrar$Result2 instanceof AliasRegistrar$Result.NetworkFailure;
        AndroidStringManager androidStringManager2 = this.stringManager;
        if (!z) {
        }
    }
}
