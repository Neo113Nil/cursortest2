package com.miteksystems.misnap.camera.a;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.biometric.KeyguardUtils;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.core.Preview;
import androidx.camera.core.SessionConfig$$ExternalSyntheticLambda0;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraCaptureCallbacks;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.Updater;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.credentials.CredentialManager$createCredential$2$callback$1;
import androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
import androidx.lifecycle.BlockRunner$cancel$1;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.api.ApiResult;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.rum.model.ActionEvent;
import com.fillr.browsersdk.utilities.Obfuscator;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzjx;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.android.gms.tasks.zzw;
import com.google.android.play.core.appupdate.internal.zzx;
import com.google.android.play.core.appupdate.zzg;
import com.google.android.play.core.appupdate.zzm;
import com.google.android.play.core.appupdate.zzr;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.splitcompat.zzb;
import com.google.android.play.core.splitcompat.zzk;
import com.google.android.play.core.splitcompat.zzl;
import com.google.android.play.core.splitcompat.zzn;
import com.google.android.play.core.splitinstall.internal.zzbl;
import com.google.common.base.Splitter;
import com.google.crypto.tink.aead.AesEaxKey;
import com.google.crypto.tink.aead.AesEaxParameters;
import com.google.crypto.tink.aead.AesGcmKey;
import com.google.crypto.tink.aead.AesGcmParameters;
import com.google.crypto.tink.aead.AesGcmSivKey;
import com.google.crypto.tink.aead.AesGcmSivParameters;
import com.google.crypto.tink.daead.AesSivKey;
import com.google.crypto.tink.daead.AesSivParameters;
import com.google.crypto.tink.internal.OutputPrefixUtil;
import com.google.crypto.tink.mac.AesCmacKey;
import com.google.crypto.tink.mac.AesCmacParameters;
import com.google.crypto.tink.mac.HmacKey;
import com.google.crypto.tink.mac.HmacParameters;
import com.google.crypto.tink.util.Bytes;
import com.google.firebase.analytics.ParametersBuilder;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.proto.ProtobufDataEncoderContext;
import com.google.firebase.messaging.CommonNotificationBuilder;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.ImageDownload;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;
import com.google.zxing.qrcode.encoder.Encoder;
import com.google.zxing.qrcode.encoder.MinimalEncoder$Edge;
import com.google.zxing.qrcode.encoder.MinimalEncoder$ResultList$ResultNode;
import com.miteksystems.misnap.workflow.util.PausableTimer$b;
import com.miteksystems.misnap.workflow.util.a;
import com.nimbusds.jose.jca.JCAContext;
import com.plaid.internal.r6$$ExternalSyntheticLambda0;
import com.squareup.card.entry.validators.InputValidator;
import com.squareup.card.entry.validators.UtilsKt;
import com.squareup.cash.R;
import com.squareup.cash.account.settings.backend.RealAccountRepository$getRemainingLimit$1;
import com.squareup.cash.activity.analytics.ActivityAnalyticsService;
import com.squareup.cash.activity.backend.RealActivityAnalyticsService;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.MainFeedSearchPageRequestHandler$requestPage$1;
import com.squareup.cash.appmessages.AppMessageImage;
import com.squareup.cash.appmessages.CardAppMessageViewModel;
import com.squareup.cash.appmessages.InlineAppMessageV2ViewModel;
import com.squareup.cash.appmessages.OnDemandMessageAnalyticsData;
import com.squareup.cash.appmessages.PromoterActivityMessages;
import com.squareup.cash.appmessages.presenters.RealAppMessageActionPresenterHelper;
import com.squareup.cash.appmessages.presenters.RealPromoterActivityMessageProvider$fetch$1;
import com.squareup.cash.appupdate.backend.api.AppUpdateAvailability;
import com.squareup.cash.appupdate.backend.real.RealPlayAppUpdateManager;
import com.squareup.cash.appupdate.navigation.real.RealAppUpdateInboundNavigator$showAppUpdateDialog$1;
import com.squareup.cash.appupdate.screen.AppUpdateDialogScreen;
import com.squareup.cash.benefits.presenters.BenefitsHubPresenter$models$1$1;
import com.squareup.cash.bitcoin.presenters.BitcoinDepositsPresenter$special$$inlined$filter$1;
import com.squareup.cash.bitcoin.presenters.applet.news.BitcoinNewsWidgetPresenter$models$1$1;
import com.squareup.cash.bitcoin.presenters.applet.widget.BitcoinHomeWidgetPresenter;
import com.squareup.cash.bitcoin.presenters.map.RealBitcoinMapEligibilityManager;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.boost.BitcoinBoostWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.map.BitcoinMapCardWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.news.BitcoinHomeNewsWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.pendingidv.BitcoinHomePendingIdvWidgetViewModel;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.AmountBlockerPresenter$models$1$2;
import com.squareup.cash.blockers.viewmodels.CardActivationQrViewEvent;
import com.squareup.cash.boost.backend.BoostConfigManager;
import com.squareup.cash.boost.backend.RealBoostConfigManager;
import com.squareup.cash.boost.db.BoostConfigQueries$get$2;
import com.squareup.cash.boost.db.RewardSlotQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.borrow.presenters.util.RealLoanFlowStarter$initiateLoan$1;
import com.squareup.cash.borrow.screens.BorrowHome;
import com.squareup.cash.card.onboarding.CardModelView$iconTexture$$inlined$map$1;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.idv.CryptoIdvStatus;
import com.squareup.cash.crypto.backend.idv.CryptoIdvStatusRepo;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.db.RealAppConfigManager$cashLiteConfig$$inlined$map$1;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.featureflags.AmplitudeExperiments$BitcoinMapCardV2;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlag$StringAmplitudeExperiment;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$UseAndroidAppUpdateManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.gps.backend.real.AndroidLocationSettingsChecker$check$2$1;
import com.squareup.cash.investing.primitives.NewsKind;
import com.squareup.cash.investingcrypto.presenters.news.InvestingCryptoNewsPresenter$Factory$Impl;
import com.squareup.cash.investingcrypto.viewmodels.ColoredLearnMoreConfigurationModel;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewModel;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.data.IssuedCardManager;
import com.squareup.cash.wallet.data.RealIssuedCardManager;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;
import com.squareup.protos.cash.activity.api.v1.ActivitySearchPageRequest;
import com.squareup.protos.cash.activity.api.v1.ActivitySearchRequest;
import com.squareup.protos.cash.activity.api.v1.ActivitySearchResponse;
import com.squareup.protos.cash.activity.api.v1.SearchOffset;
import com.squareup.protos.cash.cashapproxy.api.CashApProxyClientService;
import com.squareup.protos.cash.cashcustomerprofile.api.v1.GetDisplayNameStatusClientResponse;
import com.squareup.protos.cash.messagingplatformcommon.app.Animation;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageAction;
import com.squareup.protos.cash.messagingplatformcommon.app.CardMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.CardMessage$VisualAsset$Animation;
import com.squareup.protos.cash.messagingplatformcommon.app.CardMessage$VisualAsset$Image;
import com.squareup.protos.cash.messagingplatformcommon.app.InlineV2Message;
import com.squareup.protos.cash.messagingplatformcommon.app.InlineV2Message$VisualAsset$Avatar;
import com.squareup.protos.cash.messagingplatformcommon.ondemand.GetInAppMessagesRequest;
import com.squareup.protos.cash.messagingplatformcommon.ondemand.GetInAppMessagesResponse;
import com.squareup.protos.cash.messagingplatformcommon.ondemand.InAppMessage;
import com.squareup.protos.cash.messagingplatformcommon.ondemand.InAppMessage$Message$CardMessage;
import com.squareup.protos.cash.messagingplatformcommon.ondemand.InAppMessage$Message$InlineV2Message;
import com.squareup.protos.cash.messagingplatformcommon.ondemand.InAppMessageService;
import com.squareup.protos.cash.messagingplatformcommon.placements.Placement;
import com.squareup.protos.cash.postcard.CashAppCard;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.GetBoostConfigResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.lending.InitiateLoanRequest;
import com.squareup.protos.franklin.lending.InitiateLoanResponse;
import com.squareup.protos.franklin.lending.LendingAppService;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.scannerview.FlashState;
import com.squareup.scannerview.ManualErrorReason;
import com.squareup.scannerview.ScannerView;
import com.squareup.scannerview.Step;
import com.squareup.scannerview.StepResult;
import com.squareup.util.Strings;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ArrayIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.json.JSONArray;
import org.json.JSONException;
import papa.PapaEvent;
import papa.SafeTrace;
import retrofit2.AndroidMainExecutor;
import retrofit2.KotlinExtensions$awaitResponse$2$2;
import timber.log.Timber;

/* loaded from: classes4.dex */
public class n implements zzk, zzl, Preview.SurfaceProvider, InputValidator, ActivitiesManager.ActivityPageHandler, BitcoinHomeWidgetPresenter, ScannerView.Callback {
    public final /* synthetic */ int $r8$classId;
    public Object a;
    public Object b;
    public Object c;

    public n(Splitter splitter, Version version, MinimalEncoder$Edge minimalEncoder$Edge) {
        Mode mode;
        int i;
        int i2;
        this.$r8$classId = 14;
        this.c = splitter;
        this.a = new ArrayList();
        MinimalEncoder$Edge minimalEncoder$Edge2 = minimalEncoder$Edge;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            mode = Mode.ECI;
            if (minimalEncoder$Edge2 == null) {
                break;
            }
            int i5 = minimalEncoder$Edge2.charsetEncoderIndex;
            int i6 = i3 + minimalEncoder$Edge2.characterLength;
            MinimalEncoder$Edge minimalEncoder$Edge3 = minimalEncoder$Edge2.previous;
            int i7 = i4;
            Mode mode2 = minimalEncoder$Edge2.mode;
            boolean z = (mode2 == Mode.BYTE && minimalEncoder$Edge3 == null && i5 != 0) || !(minimalEncoder$Edge3 == null || i5 == minimalEncoder$Edge3.charsetEncoderIndex);
            i = z ? 1 : i7;
            if (minimalEncoder$Edge3 == null || minimalEncoder$Edge3.mode != mode2 || z) {
                ((ArrayList) this.a).add(0, new MinimalEncoder$ResultList$ResultNode(this, mode2, minimalEncoder$Edge2.fromPosition, i5, i6));
                i2 = 0;
            } else {
                i2 = i6;
            }
            if (z) {
                ((ArrayList) this.a).add(0, new MinimalEncoder$ResultList$ResultNode(this, mode, minimalEncoder$Edge2.fromPosition, minimalEncoder$Edge2.charsetEncoderIndex, 0));
            }
            i4 = i;
            minimalEncoder$Edge2 = minimalEncoder$Edge3;
            i3 = i2;
        }
        int i8 = i4;
        boolean z2 = splitter.omitEmptyStrings;
        int i9 = splitter.limit;
        if (z2) {
            MinimalEncoder$ResultList$ResultNode minimalEncoder$ResultList$ResultNode = (MinimalEncoder$ResultList$ResultNode) ((ArrayList) this.a).get(0);
            if (minimalEncoder$ResultList$ResultNode != null && minimalEncoder$ResultList$ResultNode.mode != mode && i8 != 0) {
                ((ArrayList) this.a).add(0, new MinimalEncoder$ResultList$ResultNode(this, mode, 0, 0, 0));
            }
            ((ArrayList) this.a).add(((MinimalEncoder$ResultList$ResultNode) ((ArrayList) this.a).get(0)).mode == mode ? 1 : 0, new MinimalEncoder$ResultList$ResultNode(this, Mode.FNC1_FIRST_POSITION, 0, 0, 0));
        }
        int i10 = version.versionNumber;
        int i11 = 26;
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i10 <= 9 ? 1 : i10 <= 26 ? 2 : 3);
        if (ordinal == 0) {
            i11 = 9;
        } else if (ordinal != 1) {
            i = 27;
            i11 = 40;
        } else {
            i = 10;
        }
        int size = getSize(version);
        while (i10 < i11 && !Encoder.willFit(size, Version.getVersionForNumber(i10), i9)) {
            i10++;
        }
        while (i10 > i && Encoder.willFit(size, Version.getVersionForNumber(i10 - 1), i9)) {
            i10--;
        }
        this.b = Version.getVersionForNumber(i10);
    }

    public static boolean monthValid(String str) {
        int charAt;
        char charAt2 = str.charAt(0);
        return charAt2 == '0' ? str.length() == 1 || str.charAt(1) != '0' : charAt2 == '1' && (str.length() == 1 || ((charAt = str.charAt(1) - '0') >= 0 && charAt < 3));
    }

    public static InlineAppMessageV2ViewModel.Ready toInlineV2ViewModel(InlineV2Message inlineV2Message, InAppMessage inAppMessage, String str, int i) {
        UiAvatar uiAvatar;
        InlineV2Message$VisualAsset$Avatar inlineV2Message$VisualAsset$Avatar = inlineV2Message.visualAsset;
        if (inlineV2Message$VisualAsset$Avatar == null) {
            inlineV2Message$VisualAsset$Avatar = null;
        }
        if (inlineV2Message$VisualAsset$Avatar == null || (uiAvatar = inlineV2Message$VisualAsset$Avatar.value) == null) {
            return null;
        }
        String emptyAsNull = Strings.emptyAsNull(inlineV2Message.message_title);
        String str2 = inlineV2Message.message_subtitle;
        return new InlineAppMessageV2ViewModel.Ready(str, uiAvatar, emptyAsNull, Strings.emptyAsNull(str2 != null ? StringsKt__StringsJVMKt.replace$default(str2, "\u2028", "\n") : null), inlineV2Message.url, i, new OnDemandMessageAnalyticsData(inAppMessage.campaign_token, inAppMessage.template_token, inAppMessage.template_version, inAppMessage.product_types, OnDemandMessageAnalyticsData.Format.INLINE_V2));
    }

    /* renamed from: build, reason: collision with other method in class */
    public HmacKey m2163build() {
        WireAdapter wireAdapter;
        Bytes legacyOutputPrefix;
        HmacParameters hmacParameters = (HmacParameters) this.a;
        if (hmacParameters == null || (wireAdapter = (WireAdapter) this.b) == null) {
            a$$ExternalSyntheticBUOutline0.m$6("Cannot build without parameters and/or key material");
            return null;
        }
        if (hmacParameters.keySizeBytes != ((Bytes) wireAdapter.adapter).data.length) {
            a$$ExternalSyntheticBUOutline0.m$6("Key size mismatch");
            return null;
        }
        if (hmacParameters.hasIdRequirement() && ((Integer) this.c) == null) {
            a$$ExternalSyntheticBUOutline0.m$6("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((HmacParameters) this.a).hasIdRequirement() && ((Integer) this.c) != null) {
            a$$ExternalSyntheticBUOutline0.m$6("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        HmacParameters.Variant variant = ((HmacParameters) this.a).variant;
        if (variant == HmacParameters.Variant.NO_PREFIX) {
            legacyOutputPrefix = OutputPrefixUtil.EMPTY_PREFIX;
        } else if (variant == HmacParameters.Variant.LEGACY || variant == HmacParameters.Variant.CRUNCHY) {
            legacyOutputPrefix = OutputPrefixUtil.getLegacyOutputPrefix(((Integer) this.c).intValue());
        } else {
            if (variant != HmacParameters.Variant.TINK) {
                a$$ExternalSyntheticBUOutline0.m$2(((HmacParameters) this.a).variant, "Unknown HmacParameters.Variant: ");
                return null;
            }
            legacyOutputPrefix = OutputPrefixUtil.getTinkOutputPrefix(((Integer) this.c).intValue());
        }
        return new HmacKey((HmacParameters) this.a, (WireAdapter) this.b, legacyOutputPrefix, (Integer) this.c);
    }

    public void cancel(Runnable runnable) {
        runnable.getClass();
        HashMap hashMap = (HashMap) this.c;
        a aVar = (a) hashMap.get(Integer.valueOf(runnable.hashCode()));
        if (aVar != null) {
            ((Handler) this.b).removeCallbacksAndMessages(aVar);
        }
    }

    public void cancelAll() {
        ((HashMap) this.c).clear();
        ((Handler) this.b).removeCallbacksAndMessages(null);
    }

    public void encode(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.a;
        ProtobufDataEncoderContext protobufDataEncoderContext = new ProtobufDataEncoderContext(byteArrayOutputStream, hashMap, (HashMap) this.b, (ObjectEncoder) this.c);
        if (obj == null) {
            return;
        }
        ObjectEncoder objectEncoder = (ObjectEncoder) hashMap.get(obj.getClass());
        if (objectEncoder != null) {
            objectEncoder.encode(obj, protobufDataEncoderContext);
            return;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e7, code lost:
    
        if (r8 == null) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005b A[Catch: Exception -> 0x002d, CancellationException -> 0x018f, TryCatch #2 {CancellationException -> 0x018f, Exception -> 0x002d, blocks: (B:10:0x0029, B:11:0x0055, B:13:0x005b, B:16:0x006a, B:17:0x007d, B:19:0x0083, B:21:0x0091, B:22:0x00bf, B:24:0x00cc, B:26:0x00df, B:30:0x00f9, B:33:0x010a, B:38:0x00e9, B:40:0x00ed, B:47:0x010e, B:48:0x0112, B:50:0x0118, B:52:0x0134, B:54:0x013a, B:56:0x013e, B:63:0x014c, B:64:0x0150, B:66:0x0156, B:68:0x0172, B:70:0x0178, B:72:0x017c, B:79:0x0189, B:97:0x0039), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a A[Catch: Exception -> 0x002d, CancellationException -> 0x018f, TryCatch #2 {CancellationException -> 0x018f, Exception -> 0x002d, blocks: (B:10:0x0029, B:11:0x0055, B:13:0x005b, B:16:0x006a, B:17:0x007d, B:19:0x0083, B:21:0x0091, B:22:0x00bf, B:24:0x00cc, B:26:0x00df, B:30:0x00f9, B:33:0x010a, B:38:0x00e9, B:40:0x00ed, B:47:0x010e, B:48:0x0112, B:50:0x0118, B:52:0x0134, B:54:0x013a, B:56:0x013e, B:63:0x014c, B:64:0x0150, B:66:0x0156, B:68:0x0172, B:70:0x0178, B:72:0x017c, B:79:0x0189, B:97:0x0039), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetch(ContinuationImpl continuationImpl) {
        RealPromoterActivityMessageProvider$fetch$1 realPromoterActivityMessageProvider$fetch$1;
        int i;
        InlineAppMessageV2ViewModel inlineAppMessageV2ViewModel;
        CardAppMessageViewModel cardAppMessageViewModel;
        ApiResult apiResult;
        CardAppMessageViewModel cardAppMessageViewModel2;
        InlineV2Message inlineV2Message;
        CardMessage cardMessage;
        Triple triple;
        try {
            if (continuationImpl instanceof RealPromoterActivityMessageProvider$fetch$1) {
                realPromoterActivityMessageProvider$fetch$1 = (RealPromoterActivityMessageProvider$fetch$1) continuationImpl;
                int i2 = realPromoterActivityMessageProvider$fetch$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    realPromoterActivityMessageProvider$fetch$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = realPromoterActivityMessageProvider$fetch$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realPromoterActivityMessageProvider$fetch$1.label;
                    inlineAppMessageV2ViewModel = InlineAppMessageV2ViewModel.NotAvailable.INSTANCE;
                    cardAppMessageViewModel = CardAppMessageViewModel.NotAvailable.INSTANCE;
                    InlineAppMessageV2ViewModel inlineAppMessageV2ViewModel2 = null;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        InAppMessageService inAppMessageService = (InAppMessageService) this.a;
                        GetInAppMessagesRequest getInAppMessagesRequest = new GetInAppMessagesRequest(CollectionsKt__CollectionsJVMKt.listOf(Placement.ACTIVITY_TAB), EmptyList.INSTANCE, ByteString.EMPTY);
                        realPromoterActivityMessageProvider$fetch$1.label = 1;
                        obj = inAppMessageService.getInAppMessages(getInAppMessagesRequest, realPromoterActivityMessageProvider$fetch$1);
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
                    apiResult = (ApiResult) obj;
                    if (apiResult instanceof ApiResult.Success) {
                        Timber.Forest.d("Promoter activity messages: fetch failed", new Object[0]);
                        return new PromoterActivityMessages(cardAppMessageViewModel, inlineAppMessageV2ViewModel);
                    }
                    List list = ((GetInAppMessagesResponse) ((ApiResult.Success) apiResult).response).placements_to_messages;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        CollectionsKt__MutableCollectionsKt.addAll(((GetInAppMessagesResponse.PlacementToMessages) it.next()).messages, arrayList);
                    }
                    Timber.Forest.d("Promoter activity messages: fetched " + arrayList.size() + " messages", new Object[0]);
                    IndexingIterable withIndex = CollectionsKt.withIndex(arrayList);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = withIndex.iterator();
                    while (((Iterator) ((ArrayIterator) it2).f1520array).hasNext()) {
                        IndexedValue indexedValue = (IndexedValue) ((ArrayIterator) it2).next();
                        int i3 = indexedValue.index;
                        InAppMessage inAppMessage = (InAppMessage) indexedValue.value;
                        String str = inAppMessage.idempotence_key;
                        if (str != null) {
                            if (str.length() <= 0) {
                                str = null;
                            }
                        }
                        str = inAppMessage.campaign_token;
                        if (str == null || str.length() <= 0) {
                            str = null;
                        }
                        if (str == null) {
                            triple = null;
                            if (triple == null) {
                                arrayList2.add(triple);
                            }
                        }
                        triple = new Triple(inAppMessage, str, new Integer(arrayList.size() - i3));
                        if (triple == null) {
                        }
                    }
                    Iterator it3 = arrayList2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            cardAppMessageViewModel2 = null;
                            break;
                        }
                        Triple triple2 = (Triple) it3.next();
                        InAppMessage inAppMessage2 = (InAppMessage) triple2.first;
                        String str2 = (String) triple2.second;
                        int intValue = ((Number) triple2.third).intValue();
                        zzjx zzjxVar = inAppMessage2.message;
                        InAppMessage$Message$CardMessage inAppMessage$Message$CardMessage = zzjxVar instanceof InAppMessage$Message$CardMessage ? (InAppMessage$Message$CardMessage) zzjxVar : null;
                        cardAppMessageViewModel2 = (inAppMessage$Message$CardMessage == null || (cardMessage = inAppMessage$Message$CardMessage.value) == null) ? null : toCardViewModel(cardMessage, inAppMessage2, str2, intValue);
                        if (cardAppMessageViewModel2 != null) {
                            break;
                        }
                    }
                    if (cardAppMessageViewModel2 == null) {
                        cardAppMessageViewModel2 = cardAppMessageViewModel;
                    }
                    Iterator it4 = arrayList2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        Triple triple3 = (Triple) it4.next();
                        InAppMessage inAppMessage3 = (InAppMessage) triple3.first;
                        String str3 = (String) triple3.second;
                        int intValue2 = ((Number) triple3.third).intValue();
                        zzjx zzjxVar2 = inAppMessage3.message;
                        InAppMessage$Message$InlineV2Message inAppMessage$Message$InlineV2Message = zzjxVar2 instanceof InAppMessage$Message$InlineV2Message ? (InAppMessage$Message$InlineV2Message) zzjxVar2 : null;
                        InlineAppMessageV2ViewModel inlineV2ViewModel = (inAppMessage$Message$InlineV2Message == null || (inlineV2Message = inAppMessage$Message$InlineV2Message.value) == null) ? null : toInlineV2ViewModel(inlineV2Message, inAppMessage3, str3, intValue2);
                        if (inlineV2ViewModel != null) {
                            inlineAppMessageV2ViewModel2 = inlineV2ViewModel;
                            break;
                        }
                    }
                    if (inlineAppMessageV2ViewModel2 == null) {
                        inlineAppMessageV2ViewModel2 = inlineAppMessageV2ViewModel;
                    }
                    return new PromoterActivityMessages(cardAppMessageViewModel2, inlineAppMessageV2ViewModel2);
                }
            }
            if (i != 0) {
            }
            apiResult = (ApiResult) obj;
            if (apiResult instanceof ApiResult.Success) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Timber.Forest.e("Failed to fetch promoter activity messages", new Object[0], e2);
            return new PromoterActivityMessages(cardAppMessageViewModel, inlineAppMessageV2ViewModel);
        }
        realPromoterActivityMessageProvider$fetch$1 = new RealPromoterActivityMessageProvider$fetch$1(this, continuationImpl);
        Object obj2 = realPromoterActivityMessageProvider$fetch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPromoterActivityMessageProvider$fetch$1.label;
        inlineAppMessageV2ViewModel = InlineAppMessageV2ViewModel.NotAvailable.INSTANCE;
        cardAppMessageViewModel = CardAppMessageViewModel.NotAvailable.INSTANCE;
        InlineAppMessageV2ViewModel inlineAppMessageV2ViewModel22 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getRemainingLimit(ContinuationImpl continuationImpl) {
        RealAccountRepository$getRemainingLimit$1 realAccountRepository$getRemainingLimit$1;
        int i;
        ApiResult apiResult;
        Long l;
        if (continuationImpl instanceof RealAccountRepository$getRemainingLimit$1) {
            realAccountRepository$getRemainingLimit$1 = (RealAccountRepository$getRemainingLimit$1) continuationImpl;
            int i2 = realAccountRepository$getRemainingLimit$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realAccountRepository$getRemainingLimit$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realAccountRepository$getRemainingLimit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realAccountRepository$getRemainingLimit$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    CoroutineContext coroutineContext = (CoroutineContext) this.c;
                    BlockRunner$cancel$1 blockRunner$cancel$1 = new BlockRunner$cancel$1(this, continuation, 28);
                    realAccountRepository$getRemainingLimit$1.label = 1;
                    obj = JobKt.withContext(coroutineContext, blockRunner$cancel$1, realAccountRepository$getRemainingLimit$1);
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
                apiResult = (ApiResult) obj;
                if ((apiResult instanceof ApiResult.Success) || (l = ((GetDisplayNameStatusClientResponse) ((ApiResult.Success) apiResult).response).remaining_limit) == null) {
                    return null;
                }
                return new Integer((int) l.longValue());
            }
        }
        realAccountRepository$getRemainingLimit$1 = new RealAccountRepository$getRemainingLimit$1(this, continuationImpl);
        Object obj2 = realAccountRepository$getRemainingLimit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAccountRepository$getRemainingLimit$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
        return null;
    }

    public int getSize(Version version) {
        Iterator it = ((ArrayList) this.a).iterator();
        int i = 0;
        while (it.hasNext()) {
            MinimalEncoder$ResultList$ResultNode minimalEncoder$ResultList$ResultNode = (MinimalEncoder$ResultList$ResultNode) it.next();
            int i2 = minimalEncoder$ResultList$ResultNode.characterLength;
            Mode mode = minimalEncoder$ResultList$ResultNode.mode;
            int characterCountBits = mode.getCharacterCountBits(version);
            int i3 = characterCountBits + 4;
            int ordinal = mode.ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i3 = Boxes$$ExternalSyntheticOutline1.m$1(i2, 2, 11, i3) + (i2 % 2 != 1 ? 0 : 6);
                } else if (ordinal == 4) {
                    i3 += minimalEncoder$ResultList$ResultNode.getCharacterCountIndicator() * 8;
                } else if (ordinal == 5) {
                    i3 = characterCountBits + 12;
                } else if (ordinal == 6) {
                    i3 += i2 * 13;
                }
            } else {
                int m$1 = Boxes$$ExternalSyntheticOutline1.m$1(i2, 3, 10, i3);
                int i4 = i2 % 3;
                i3 = m$1 + (i4 != 1 ? i4 == 2 ? 7 : 0 : 4);
            }
            i += i3;
        }
        return i;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(88:5|(2:7|(2:9|(2:10|(2:12|(3:14|15|(1:17)(0))(1:18))(1:19)))(0))(0)|20|(85:274|275|23|(1:25)|26|27|28|(1:30)|271|32|33|34|35|36|(76:249|(72:251|(1:254)|253|39|(1:41)|42|(1:44)|45|(62:47|(1:51)|52|(1:54)|55|(1:57)(2:233|(1:238)(1:237))|58|(1:60)|61|(1:63)(5:221|(1:223)|224|(1:226)(1:232)|(1:228)(2:229|(1:231)))|64|(1:66)(6:203|(4:206|(2:214|215)(1:212)|213|204)|216|217|(1:219)|220)|67|(1:69)(1:202)|(1:71)|72|(44:198|199|(1:78)|79|(1:81)|82|(38:189|(1:193)|(1:86)|87|(34:184|(1:188)|(1:91)|92|(30:181|(1:183)|(1:96)|97|(26:177|178|(1:101)|102|(3:167|168|(23:170|(1:172)|173|(1:106)|107|(4:152|153|154|(2:156|(17:158|(3:111|(1:116)(1:114)|115)|117|(1:119)|120|(1:122)|123|(1:125)|126|(1:151)|128|(6:136|137|(1:139)(1:146)|140|(1:142)(1:145)|143)|130|131|(1:133)|134|135)(2:159|160))(2:161|162))|109|(0)|117|(0)|120|(0)|123|(0)|126|(0)|128|(0)|130|131|(0)|134|135)(2:174|175))|104|(0)|107|(0)|109|(0)|117|(0)|120|(0)|123|(0)|126|(0)|128|(0)|130|131|(0)|134|135)|99|(0)|102|(0)|104|(0)|107|(0)|109|(0)|117|(0)|120|(0)|123|(0)|126|(0)|128|(0)|130|131|(0)|134|135)|94|(0)|97|(0)|99|(0)|102|(0)|104|(0)|107|(0)|109|(0)|117|(0)|120|(0)|123|(0)|126|(0)|128|(0)|130|131|(0)|134|135)|89|(0)|92|(0)|94|(0)|97|(0)|99|(0)|102|(0)|104|(0)|107|(0)|109|(0)|117|(0)|120|(0)|123|(0)|126|(0)|128|(0)|130|131|(0)|134|135)|84|(0)|87|(0)|89|(0)|92|(0)|94|(0)|97|(0)|99|(0)|102|(0)|104|(0)|107|(0)|109|(0)|117|(0)|120|(0)|123|(0)|126|(0)|128|(0)|130|131|(0)|134|135)|74|(44:194|195|(0)|79|(0)|82|(0)|84|(0)|87|(0)|89|(0)|92|(0)|94|(0)|97|(0)|99|(0)|102|(0)|104|(0)|107|(0)|109|(0)|117|(0)|120|(0)|123|(0)|126|(0)|128|(0)|130|131|(0)|134|135)|76|(0)|79|(0)|82|(0)|84|(0)|87|(0)|89|(0)|92|(0)|94|(0)|97|(0)|99|(0)|102|(0)|104|(0)|107|(0)|109|(0)|117|(0)|120|(0)|123|(0)|126|(0)|128|(0)|130|131|(0)|134|135)|239|(2:244|245)|(1:242)(1:243)|52|(0)|55|(0)(0)|58|(0)|61|(0)(0)|64|(0)(0)|67|(0)(0)|(0)|72|(0)|74|(0)|76|(0)|79|(0)|82|(0)|84|(0)|87|(0)|89|(0)|92|(0)|94|(0)|97|(0)|99|(0)|102|(0)|104|(0)|107|(0)|109|(0)|117|(0)|120|(0)|123|(0)|126|(0)|128|(0)|130|131|(0)|134|135)|255|(72:257|(1:259)|253|39|(0)|42|(0)|45|(0)|239|(0)|(0)(0)|52|(0)|55|(0)(0)|58|(0)|61|(0)(0)|64|(0)(0)|67|(0)(0)|(0)|72|(0)|74|(0)|76|(0)|79|(0)|82|(0)|84|(0)|87|(0)|89|(0)|92|(0)|94|(0)|97|(0)|99|(0)|102|(0)|104|(0)|107|(0)|109|(0)|117|(0)|120|(0)|123|(0)|126|(0)|128|(0)|130|131|(0)|134|135)(1:267)|260|(72:262|(1:264)(1:266)|265|39|(0)|42|(0)|45|(0)|239|(0)|(0)(0)|52|(0)|55|(0)(0)|58|(0)|61|(0)(0)|64|(0)(0)|67|(0)(0)|(0)|72|(0)|74|(0)|76|(0)|79|(0)|82|(0)|84|(0)|87|(0)|89|(0)|92|(0)|94|(0)|97|(0)|99|(0)|102|(0)|104|(0)|107|(0)|109|(0)|117|(0)|120|(0)|123|(0)|126|(0)|128|(0)|130|131|(0)|134|135)|253|39|(0)|42|(0)|45|(0)|239|(0)|(0)(0)|52|(0)|55|(0)(0)|58|(0)|61|(0)(0)|64|(0)(0)|67|(0)(0)|(0)|72|(0)|74|(0)|76|(0)|79|(0)|82|(0)|84|(0)|87|(0)|89|(0)|92|(0)|94|(0)|97|(0)|99|(0)|102|(0)|104|(0)|107|(0)|109|(0)|117|(0)|120|(0)|123|(0)|126|(0)|128|(0)|130|131|(0)|134|135)|38|39|(0)|42|(0)|45|(0)|239|(0)|(0)(0)|52|(0)|55|(0)(0)|58|(0)|61|(0)(0)|64|(0)(0)|67|(0)(0)|(0)|72|(0)|74|(0)|76|(0)|79|(0)|82|(0)|84|(0)|87|(0)|89|(0)|92|(0)|94|(0)|97|(0)|99|(0)|102|(0)|104|(0)|107|(0)|109|(0)|117|(0)|120|(0)|123|(0)|126|(0)|128|(0)|130|131|(0)|134|135)|22|23|(0)|26|27|28|(0)|271|32|33|34|35|36|(0)|38|39|(0)|42|(0)|45|(0)|239|(0)|(0)(0)|52|(0)|55|(0)(0)|58|(0)|61|(0)(0)|64|(0)(0)|67|(0)(0)|(0)|72|(0)|74|(0)|76|(0)|79|(0)|82|(0)|84|(0)|87|(0)|89|(0)|92|(0)|94|(0)|97|(0)|99|(0)|102|(0)|104|(0)|107|(0)|109|(0)|117|(0)|120|(0)|123|(0)|126|(0)|128|(0)|130|131|(0)|134|135) */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x00c1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x00c2, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bd, code lost:
    
        if (r0 != null) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x05e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x047c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x039a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0373 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x01ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb A[Catch: NameNotFoundException -> 0x00c1, TRY_LEAVE, TryCatch #8 {NameNotFoundException -> 0x00c1, blocks: (B:28:0x00b5, B:30:0x00bb), top: B:27:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x046a  */
    /* JADX WARN: Type inference failed for: r0v107, types: [int] */
    /* JADX WARN: Type inference failed for: r0v132 */
    /* JADX WARN: Type inference failed for: r0v191 */
    /* JADX WARN: Type inference failed for: r0v192 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean handleNotification() {
        ImageDownload imageDownload;
        FirebaseMessagingService firebaseMessagingService;
        ParametersBuilder parametersBuilder;
        Bundle bundle;
        int i;
        AtomicInteger atomicInteger;
        String possiblyLocalizedString;
        String possiblyLocalizedString2;
        String string2;
        int i2;
        int i3;
        String string3;
        Uri defaultUri;
        String string4;
        Intent launchIntentForPackage;
        PendingIntent activity;
        PendingIntent broadcast;
        String string5;
        Integer valueOf;
        String string6;
        Integer integer;
        Integer integer2;
        Integer integer3;
        String string7;
        Long valueOf2;
        JSONArray jSONArray;
        long[] jArr;
        JSONArray jSONArray2;
        int[] iArr;
        ?? r0;
        String string8;
        IconCompat iconCompat;
        IconCompat iconCompat2;
        boolean z;
        int i4;
        String string9;
        ApplicationInfo applicationInfo;
        if (((ParametersBuilder) this.c).getBoolean("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService2 = (FirebaseMessagingService) this.b;
        if (!((KeyguardManager) firebaseMessagingService2.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService2.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (next.importance == 100) {
                            return false;
                        }
                    }
                }
            }
        }
        String string10 = ((ParametersBuilder) this.c).getString("gcm.n.image");
        if (!TextUtils.isEmpty(string10)) {
            try {
                imageDownload = new ImageDownload(new URL(string10));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + string10);
            }
            int i5 = 4;
            if (imageDownload != null) {
                ExecutorService executorService = (ExecutorService) this.a;
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                imageDownload.future = executorService.submit(new r6$$ExternalSyntheticLambda0(i5, imageDownload, taskCompletionSource));
                imageDownload.task = taskCompletionSource.zza;
            }
            firebaseMessagingService = (FirebaseMessagingService) this.b;
            parametersBuilder = (ParametersBuilder) this.c;
            AtomicInteger atomicInteger2 = CommonNotificationBuilder.requestCodeProvider;
            applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
            if (applicationInfo != null) {
                bundle = applicationInfo.metaData;
            }
            bundle = Bundle.EMPTY;
            Bundle bundle2 = bundle;
            String string11 = parametersBuilder.getString("gcm.n.android_channel_id");
            if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
                NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                if (!TextUtils.isEmpty(string11)) {
                    if (notificationManager.getNotificationChannel(string11) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel requested (" + string11 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                    }
                    i = 1;
                    atomicInteger = CommonNotificationBuilder.requestCodeProvider;
                    String packageName = firebaseMessagingService.getPackageName();
                    Resources resources = firebaseMessagingService.getResources();
                    PackageManager packageManager = firebaseMessagingService.getPackageManager();
                    NotificationCompat.Builder builder = new NotificationCompat.Builder(firebaseMessagingService, string11);
                    possiblyLocalizedString = parametersBuilder.getPossiblyLocalizedString(resources, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(possiblyLocalizedString)) {
                        builder.setContentTitle(possiblyLocalizedString);
                    }
                    possiblyLocalizedString2 = parametersBuilder.getPossiblyLocalizedString(resources, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(possiblyLocalizedString2)) {
                        builder.setContentText(possiblyLocalizedString2);
                        NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle();
                        bigTextStyle.mBigText = NotificationCompat.Builder.limitCharSequenceLength(possiblyLocalizedString2);
                        builder.setStyle(bigTextStyle);
                    }
                    string2 = parametersBuilder.getString("gcm.n.icon");
                    if (!TextUtils.isEmpty(string2)) {
                        i3 = resources.getIdentifier(string2, "drawable", packageName);
                        if (i3 == 0 && (i3 = resources.getIdentifier(string2, "mipmap", packageName)) == 0) {
                            Log.w("FirebaseMessaging", "Icon resource " + string2 + " not found. Notification will use default icon.");
                        }
                        builder.mNotification.icon = i3;
                        string3 = parametersBuilder.getString("gcm.n.sound2");
                        if (TextUtils.isEmpty(string3)) {
                            string3 = parametersBuilder.getString("gcm.n.sound");
                        }
                        if (TextUtils.isEmpty(string3)) {
                            defaultUri = null;
                        } else if ("default".equals(string3) || resources.getIdentifier(string3, "raw", packageName) == 0) {
                            defaultUri = RingtoneManager.getDefaultUri(2);
                        } else {
                            defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + string3);
                        }
                        if (defaultUri != null) {
                            Notification notification = builder.mNotification;
                            notification.sound = defaultUri;
                            notification.audioStreamType = -1;
                            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
                        }
                        string4 = parametersBuilder.getString("gcm.n.click_action");
                        if (TextUtils.isEmpty(string4)) {
                            String string12 = parametersBuilder.getString("gcm.n.link_android");
                            if (TextUtils.isEmpty(string12)) {
                                string12 = parametersBuilder.getString("gcm.n.link");
                            }
                            Uri parse = !TextUtils.isEmpty(string12) ? Uri.parse(string12) : null;
                            if (parse != null) {
                                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                                launchIntentForPackage.setPackage(packageName);
                                launchIntentForPackage.setData(parse);
                            } else {
                                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                                if (launchIntentForPackage == null) {
                                    Log.w("FirebaseMessaging", "No activity found to launch app");
                                }
                            }
                        } else {
                            launchIntentForPackage = new Intent(string4);
                            launchIntentForPackage.setPackage(packageName);
                            launchIntentForPackage.setFlags(268435456);
                        }
                        if (launchIntentForPackage == null) {
                            activity = null;
                        } else {
                            launchIntentForPackage.addFlags(67108864);
                            Bundle bundle3 = parametersBuilder.zza;
                            Bundle bundle4 = new Bundle(bundle3);
                            for (String str : bundle3.keySet()) {
                                if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                                    bundle4.remove(str);
                                }
                            }
                            launchIntentForPackage.putExtras(bundle4);
                            if (parametersBuilder.getBoolean("google.c.a.e")) {
                                launchIntentForPackage.putExtra("gcm.n.analytics_data", parametersBuilder.paramsForAnalyticsIntent());
                            }
                            activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger.incrementAndGet(), launchIntentForPackage, 1140850688);
                        }
                        builder.mContentIntent = activity;
                        broadcast = !parametersBuilder.getBoolean("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(parametersBuilder.paramsForAnalyticsIntent())), 1140850688);
                        if (broadcast != null) {
                            builder.mNotification.deleteIntent = broadcast;
                        }
                        string5 = parametersBuilder.getString("gcm.n.color");
                        if (!TextUtils.isEmpty(string5)) {
                            try {
                                valueOf = Integer.valueOf(Color.parseColor(string5));
                            } catch (IllegalArgumentException unused2) {
                                Log.w("FirebaseMessaging", "Color is invalid: " + string5 + ". Notification will use default color.");
                            }
                            if (valueOf != null) {
                                builder.mColor = valueOf.intValue();
                            }
                            builder.setAutoCancel(!parametersBuilder.getBoolean("gcm.n.sticky"));
                            builder.mLocalOnly = parametersBuilder.getBoolean("gcm.n.local_only");
                            string6 = parametersBuilder.getString("gcm.n.ticker");
                            if (string6 != null) {
                                builder.setTicker(string6);
                            }
                            integer = parametersBuilder.getInteger("gcm.n.notification_priority");
                            if (integer != null) {
                                if (integer.intValue() < -2 || integer.intValue() > 2) {
                                    Log.w("FirebaseMessaging", "notificationPriority is invalid " + integer + ". Skipping setting notificationPriority.");
                                }
                                if (integer != null) {
                                    builder.mPriority = integer.intValue();
                                }
                                integer2 = parametersBuilder.getInteger("gcm.n.visibility");
                                if (integer2 != null) {
                                    if (integer2.intValue() < -1 || integer2.intValue() > i) {
                                        Log.w("NotificationParams", "visibility is invalid: " + integer2 + ". Skipping setting visibility.");
                                    }
                                    if (integer2 != null) {
                                        builder.mVisibility = integer2.intValue();
                                    }
                                    integer3 = parametersBuilder.getInteger("gcm.n.notification_count");
                                    if (integer3 != null) {
                                        if (integer3.intValue() < 0) {
                                            Log.w("FirebaseMessaging", "notificationCount is invalid: " + integer3 + ". Skipping setting notificationCount.");
                                        }
                                        if (integer3 != null) {
                                            builder.mNumber = integer3.intValue();
                                        }
                                        string7 = parametersBuilder.getString("gcm.n.event_time");
                                        if (!TextUtils.isEmpty(string7)) {
                                            try {
                                                valueOf2 = Long.valueOf(Long.parseLong(string7));
                                            } catch (NumberFormatException unused3) {
                                                Log.w("NotificationParams", "Couldn't parse value of " + ParametersBuilder.userFriendlyKey("gcm.n.event_time") + "(" + string7 + ") into a long");
                                            }
                                            if (valueOf2 != null) {
                                                builder.mShowWhen = true;
                                                builder.mNotification.when = valueOf2.longValue();
                                            }
                                            jSONArray = parametersBuilder.getJSONArray("gcm.n.vibrate_timings");
                                            if (jSONArray != null) {
                                                try {
                                                } catch (NumberFormatException | JSONException unused4) {
                                                    Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArray + ". Skipping setting vibrateTimings.");
                                                }
                                                if (jSONArray.length() <= 1) {
                                                    throw new JSONException("vibrateTimings have invalid length");
                                                }
                                                int length = jSONArray.length();
                                                jArr = new long[length];
                                                for (int i6 = 0; i6 < length; i6++) {
                                                    jArr[i6] = jSONArray.optLong(i6);
                                                }
                                                if (jArr != null) {
                                                    builder.mNotification.vibrate = jArr;
                                                }
                                                jSONArray2 = parametersBuilder.getJSONArray("gcm.n.light_settings");
                                                if (jSONArray2 != null) {
                                                    iArr = new int[3];
                                                    try {
                                                    } catch (IllegalArgumentException e) {
                                                        Log.w("NotificationParams", "LightSettings is invalid: " + jSONArray2 + ". " + e.getMessage() + ". Skipping setting LightSettings");
                                                    } catch (JSONException unused5) {
                                                        Log.w("NotificationParams", "LightSettings is invalid: " + jSONArray2 + ". Skipping setting LightSettings");
                                                    }
                                                    if (jSONArray2.length() != 3) {
                                                        throw new JSONException("lightSettings don't have all three fields");
                                                    }
                                                    int parseColor = Color.parseColor(jSONArray2.optString(0));
                                                    if (parseColor == -16777216) {
                                                        throw new IllegalArgumentException("Transparent color is invalid");
                                                    }
                                                    iArr[0] = parseColor;
                                                    iArr[1] = jSONArray2.optInt(1);
                                                    iArr[2] = jSONArray2.optInt(2);
                                                    if (iArr != null) {
                                                        int i7 = iArr[0];
                                                        int i8 = iArr[1];
                                                        int i9 = iArr[2];
                                                        Notification notification2 = builder.mNotification;
                                                        notification2.ledARGB = i7;
                                                        notification2.ledOnMS = i8;
                                                        notification2.ledOffMS = i9;
                                                        notification2.flags = ((i8 == 0 || i9 == 0) ? 0 : 1) | ((-2) & notification2.flags);
                                                    }
                                                    boolean z2 = parametersBuilder.getBoolean("gcm.n.default_sound");
                                                    boolean z3 = z2;
                                                    if (parametersBuilder.getBoolean("gcm.n.default_vibrate_timings")) {
                                                        z3 = (z2 ? 1 : 0) | 2;
                                                    }
                                                    r0 = z3;
                                                    if (parametersBuilder.getBoolean("gcm.n.default_light_settings")) {
                                                        r0 = (z3 ? 1 : 0) | 4;
                                                    }
                                                    Notification notification3 = builder.mNotification;
                                                    notification3.defaults = r0;
                                                    if ((r0 & 4) != 0) {
                                                        notification3.flags |= 1;
                                                    }
                                                    string8 = parametersBuilder.getString("gcm.n.tag");
                                                    if (TextUtils.isEmpty(string8)) {
                                                        string8 = "FCM-Notification:" + SystemClock.uptimeMillis();
                                                    }
                                                    String str2 = string8;
                                                    if (imageDownload != null) {
                                                        try {
                                                            zzw zzwVar = imageDownload.task;
                                                            zzae.checkNotNull(zzwVar);
                                                            Bitmap bitmap = (Bitmap) Room.await(zzwVar, 5L, TimeUnit.SECONDS);
                                                            if (bitmap == null) {
                                                                iconCompat = null;
                                                            } else {
                                                                iconCompat = new IconCompat(1);
                                                                iconCompat.mObj1 = bitmap;
                                                            }
                                                            builder.mLargeIcon = iconCompat;
                                                            NotificationCompat.BigPictureStyle bigPictureStyle = new NotificationCompat.BigPictureStyle();
                                                            if (bitmap == null) {
                                                                iconCompat2 = null;
                                                                z = true;
                                                            } else {
                                                                z = true;
                                                                iconCompat2 = new IconCompat(1);
                                                                iconCompat2.mObj1 = bitmap;
                                                            }
                                                            bigPictureStyle.mPictureIcon = iconCompat2;
                                                            bigPictureStyle.mBigLargeIcon = null;
                                                            bigPictureStyle.mBigLargeIconSet = z;
                                                            builder.setStyle(bigPictureStyle);
                                                        } catch (InterruptedException unused6) {
                                                            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                                                            imageDownload.close();
                                                            Thread.currentThread().interrupt();
                                                        } catch (ExecutionException e2) {
                                                            Log.w("FirebaseMessaging", "Failed to download image: " + e2.getCause());
                                                        } catch (TimeoutException unused7) {
                                                            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                                                            imageDownload.close();
                                                        }
                                                    }
                                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                        Log.d("FirebaseMessaging", "Showing notification");
                                                    }
                                                    ((NotificationManager) ((FirebaseMessagingService) this.b).getSystemService("notification")).notify(str2, 0, builder.build());
                                                    return true;
                                                }
                                                iArr = null;
                                                if (iArr != null) {
                                                }
                                                boolean z22 = parametersBuilder.getBoolean("gcm.n.default_sound");
                                                boolean z32 = z22;
                                                if (parametersBuilder.getBoolean("gcm.n.default_vibrate_timings")) {
                                                }
                                                r0 = z32;
                                                if (parametersBuilder.getBoolean("gcm.n.default_light_settings")) {
                                                }
                                                Notification notification32 = builder.mNotification;
                                                notification32.defaults = r0;
                                                if ((r0 & 4) != 0) {
                                                }
                                                string8 = parametersBuilder.getString("gcm.n.tag");
                                                if (TextUtils.isEmpty(string8)) {
                                                }
                                                String str22 = string8;
                                                if (imageDownload != null) {
                                                }
                                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                }
                                                ((NotificationManager) ((FirebaseMessagingService) this.b).getSystemService("notification")).notify(str22, 0, builder.build());
                                                return true;
                                            }
                                            jArr = null;
                                            if (jArr != null) {
                                            }
                                            jSONArray2 = parametersBuilder.getJSONArray("gcm.n.light_settings");
                                            if (jSONArray2 != null) {
                                            }
                                            iArr = null;
                                            if (iArr != null) {
                                            }
                                            boolean z222 = parametersBuilder.getBoolean("gcm.n.default_sound");
                                            boolean z322 = z222;
                                            if (parametersBuilder.getBoolean("gcm.n.default_vibrate_timings")) {
                                            }
                                            r0 = z322;
                                            if (parametersBuilder.getBoolean("gcm.n.default_light_settings")) {
                                            }
                                            Notification notification322 = builder.mNotification;
                                            notification322.defaults = r0;
                                            if ((r0 & 4) != 0) {
                                            }
                                            string8 = parametersBuilder.getString("gcm.n.tag");
                                            if (TextUtils.isEmpty(string8)) {
                                            }
                                            String str222 = string8;
                                            if (imageDownload != null) {
                                            }
                                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                            }
                                            ((NotificationManager) ((FirebaseMessagingService) this.b).getSystemService("notification")).notify(str222, 0, builder.build());
                                            return true;
                                        }
                                        valueOf2 = null;
                                        if (valueOf2 != null) {
                                        }
                                        jSONArray = parametersBuilder.getJSONArray("gcm.n.vibrate_timings");
                                        if (jSONArray != null) {
                                        }
                                        jArr = null;
                                        if (jArr != null) {
                                        }
                                        jSONArray2 = parametersBuilder.getJSONArray("gcm.n.light_settings");
                                        if (jSONArray2 != null) {
                                        }
                                        iArr = null;
                                        if (iArr != null) {
                                        }
                                        boolean z2222 = parametersBuilder.getBoolean("gcm.n.default_sound");
                                        boolean z3222 = z2222;
                                        if (parametersBuilder.getBoolean("gcm.n.default_vibrate_timings")) {
                                        }
                                        r0 = z3222;
                                        if (parametersBuilder.getBoolean("gcm.n.default_light_settings")) {
                                        }
                                        Notification notification3222 = builder.mNotification;
                                        notification3222.defaults = r0;
                                        if ((r0 & 4) != 0) {
                                        }
                                        string8 = parametersBuilder.getString("gcm.n.tag");
                                        if (TextUtils.isEmpty(string8)) {
                                        }
                                        String str2222 = string8;
                                        if (imageDownload != null) {
                                        }
                                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                                        }
                                        ((NotificationManager) ((FirebaseMessagingService) this.b).getSystemService("notification")).notify(str2222, 0, builder.build());
                                        return true;
                                    }
                                    integer3 = null;
                                    if (integer3 != null) {
                                    }
                                    string7 = parametersBuilder.getString("gcm.n.event_time");
                                    if (!TextUtils.isEmpty(string7)) {
                                    }
                                    valueOf2 = null;
                                    if (valueOf2 != null) {
                                    }
                                    jSONArray = parametersBuilder.getJSONArray("gcm.n.vibrate_timings");
                                    if (jSONArray != null) {
                                    }
                                    jArr = null;
                                    if (jArr != null) {
                                    }
                                    jSONArray2 = parametersBuilder.getJSONArray("gcm.n.light_settings");
                                    if (jSONArray2 != null) {
                                    }
                                    iArr = null;
                                    if (iArr != null) {
                                    }
                                    boolean z22222 = parametersBuilder.getBoolean("gcm.n.default_sound");
                                    boolean z32222 = z22222;
                                    if (parametersBuilder.getBoolean("gcm.n.default_vibrate_timings")) {
                                    }
                                    r0 = z32222;
                                    if (parametersBuilder.getBoolean("gcm.n.default_light_settings")) {
                                    }
                                    Notification notification32222 = builder.mNotification;
                                    notification32222.defaults = r0;
                                    if ((r0 & 4) != 0) {
                                    }
                                    string8 = parametersBuilder.getString("gcm.n.tag");
                                    if (TextUtils.isEmpty(string8)) {
                                    }
                                    String str22222 = string8;
                                    if (imageDownload != null) {
                                    }
                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    }
                                    ((NotificationManager) ((FirebaseMessagingService) this.b).getSystemService("notification")).notify(str22222, 0, builder.build());
                                    return true;
                                }
                                integer2 = null;
                                if (integer2 != null) {
                                }
                                integer3 = parametersBuilder.getInteger("gcm.n.notification_count");
                                if (integer3 != null) {
                                }
                                integer3 = null;
                                if (integer3 != null) {
                                }
                                string7 = parametersBuilder.getString("gcm.n.event_time");
                                if (!TextUtils.isEmpty(string7)) {
                                }
                                valueOf2 = null;
                                if (valueOf2 != null) {
                                }
                                jSONArray = parametersBuilder.getJSONArray("gcm.n.vibrate_timings");
                                if (jSONArray != null) {
                                }
                                jArr = null;
                                if (jArr != null) {
                                }
                                jSONArray2 = parametersBuilder.getJSONArray("gcm.n.light_settings");
                                if (jSONArray2 != null) {
                                }
                                iArr = null;
                                if (iArr != null) {
                                }
                                boolean z222222 = parametersBuilder.getBoolean("gcm.n.default_sound");
                                boolean z322222 = z222222;
                                if (parametersBuilder.getBoolean("gcm.n.default_vibrate_timings")) {
                                }
                                r0 = z322222;
                                if (parametersBuilder.getBoolean("gcm.n.default_light_settings")) {
                                }
                                Notification notification322222 = builder.mNotification;
                                notification322222.defaults = r0;
                                if ((r0 & 4) != 0) {
                                }
                                string8 = parametersBuilder.getString("gcm.n.tag");
                                if (TextUtils.isEmpty(string8)) {
                                }
                                String str222222 = string8;
                                if (imageDownload != null) {
                                }
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                }
                                ((NotificationManager) ((FirebaseMessagingService) this.b).getSystemService("notification")).notify(str222222, 0, builder.build());
                                return true;
                            }
                            integer = null;
                            if (integer != null) {
                            }
                            integer2 = parametersBuilder.getInteger("gcm.n.visibility");
                            if (integer2 != null) {
                            }
                            integer2 = null;
                            if (integer2 != null) {
                            }
                            integer3 = parametersBuilder.getInteger("gcm.n.notification_count");
                            if (integer3 != null) {
                            }
                            integer3 = null;
                            if (integer3 != null) {
                            }
                            string7 = parametersBuilder.getString("gcm.n.event_time");
                            if (!TextUtils.isEmpty(string7)) {
                            }
                            valueOf2 = null;
                            if (valueOf2 != null) {
                            }
                            jSONArray = parametersBuilder.getJSONArray("gcm.n.vibrate_timings");
                            if (jSONArray != null) {
                            }
                            jArr = null;
                            if (jArr != null) {
                            }
                            jSONArray2 = parametersBuilder.getJSONArray("gcm.n.light_settings");
                            if (jSONArray2 != null) {
                            }
                            iArr = null;
                            if (iArr != null) {
                            }
                            boolean z2222222 = parametersBuilder.getBoolean("gcm.n.default_sound");
                            boolean z3222222 = z2222222;
                            if (parametersBuilder.getBoolean("gcm.n.default_vibrate_timings")) {
                            }
                            r0 = z3222222;
                            if (parametersBuilder.getBoolean("gcm.n.default_light_settings")) {
                            }
                            Notification notification3222222 = builder.mNotification;
                            notification3222222.defaults = r0;
                            if ((r0 & 4) != 0) {
                            }
                            string8 = parametersBuilder.getString("gcm.n.tag");
                            if (TextUtils.isEmpty(string8)) {
                            }
                            String str2222222 = string8;
                            if (imageDownload != null) {
                            }
                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                            }
                            ((NotificationManager) ((FirebaseMessagingService) this.b).getSystemService("notification")).notify(str2222222, 0, builder.build());
                            return true;
                        }
                        i4 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                        if (i4 != 0) {
                            try {
                                valueOf = Integer.valueOf(firebaseMessagingService.getColor(i4));
                            } catch (Resources.NotFoundException unused8) {
                                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                            }
                            if (valueOf != null) {
                            }
                            builder.setAutoCancel(!parametersBuilder.getBoolean("gcm.n.sticky"));
                            builder.mLocalOnly = parametersBuilder.getBoolean("gcm.n.local_only");
                            string6 = parametersBuilder.getString("gcm.n.ticker");
                            if (string6 != null) {
                            }
                            integer = parametersBuilder.getInteger("gcm.n.notification_priority");
                            if (integer != null) {
                            }
                            integer = null;
                            if (integer != null) {
                            }
                            integer2 = parametersBuilder.getInteger("gcm.n.visibility");
                            if (integer2 != null) {
                            }
                            integer2 = null;
                            if (integer2 != null) {
                            }
                            integer3 = parametersBuilder.getInteger("gcm.n.notification_count");
                            if (integer3 != null) {
                            }
                            integer3 = null;
                            if (integer3 != null) {
                            }
                            string7 = parametersBuilder.getString("gcm.n.event_time");
                            if (!TextUtils.isEmpty(string7)) {
                            }
                            valueOf2 = null;
                            if (valueOf2 != null) {
                            }
                            jSONArray = parametersBuilder.getJSONArray("gcm.n.vibrate_timings");
                            if (jSONArray != null) {
                            }
                            jArr = null;
                            if (jArr != null) {
                            }
                            jSONArray2 = parametersBuilder.getJSONArray("gcm.n.light_settings");
                            if (jSONArray2 != null) {
                            }
                            iArr = null;
                            if (iArr != null) {
                            }
                            boolean z22222222 = parametersBuilder.getBoolean("gcm.n.default_sound");
                            boolean z32222222 = z22222222;
                            if (parametersBuilder.getBoolean("gcm.n.default_vibrate_timings")) {
                            }
                            r0 = z32222222;
                            if (parametersBuilder.getBoolean("gcm.n.default_light_settings")) {
                            }
                            Notification notification32222222 = builder.mNotification;
                            notification32222222.defaults = r0;
                            if ((r0 & 4) != 0) {
                            }
                            string8 = parametersBuilder.getString("gcm.n.tag");
                            if (TextUtils.isEmpty(string8)) {
                            }
                            String str22222222 = string8;
                            if (imageDownload != null) {
                            }
                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                            }
                            ((NotificationManager) ((FirebaseMessagingService) this.b).getSystemService("notification")).notify(str22222222, 0, builder.build());
                            return true;
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        builder.setAutoCancel(!parametersBuilder.getBoolean("gcm.n.sticky"));
                        builder.mLocalOnly = parametersBuilder.getBoolean("gcm.n.local_only");
                        string6 = parametersBuilder.getString("gcm.n.ticker");
                        if (string6 != null) {
                        }
                        integer = parametersBuilder.getInteger("gcm.n.notification_priority");
                        if (integer != null) {
                        }
                        integer = null;
                        if (integer != null) {
                        }
                        integer2 = parametersBuilder.getInteger("gcm.n.visibility");
                        if (integer2 != null) {
                        }
                        integer2 = null;
                        if (integer2 != null) {
                        }
                        integer3 = parametersBuilder.getInteger("gcm.n.notification_count");
                        if (integer3 != null) {
                        }
                        integer3 = null;
                        if (integer3 != null) {
                        }
                        string7 = parametersBuilder.getString("gcm.n.event_time");
                        if (!TextUtils.isEmpty(string7)) {
                        }
                        valueOf2 = null;
                        if (valueOf2 != null) {
                        }
                        jSONArray = parametersBuilder.getJSONArray("gcm.n.vibrate_timings");
                        if (jSONArray != null) {
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        jSONArray2 = parametersBuilder.getJSONArray("gcm.n.light_settings");
                        if (jSONArray2 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean z222222222 = parametersBuilder.getBoolean("gcm.n.default_sound");
                        boolean z322222222 = z222222222;
                        if (parametersBuilder.getBoolean("gcm.n.default_vibrate_timings")) {
                        }
                        r0 = z322222222;
                        if (parametersBuilder.getBoolean("gcm.n.default_light_settings")) {
                        }
                        Notification notification322222222 = builder.mNotification;
                        notification322222222.defaults = r0;
                        if ((r0 & 4) != 0) {
                        }
                        string8 = parametersBuilder.getString("gcm.n.tag");
                        if (TextUtils.isEmpty(string8)) {
                        }
                        String str222222222 = string8;
                        if (imageDownload != null) {
                        }
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                        }
                        ((NotificationManager) ((FirebaseMessagingService) this.b).getSystemService("notification")).notify(str222222222, 0, builder.build());
                        return true;
                    }
                    i2 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i2 == 0) {
                        try {
                            i2 = packageManager.getApplicationInfo(packageName, 0).icon;
                        } catch (PackageManager.NameNotFoundException e3) {
                            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e3);
                        }
                    }
                    i3 = i2 == 0 ? i2 : 17301651;
                    builder.mNotification.icon = i3;
                    string3 = parametersBuilder.getString("gcm.n.sound2");
                    if (TextUtils.isEmpty(string3)) {
                    }
                    if (TextUtils.isEmpty(string3)) {
                    }
                    if (defaultUri != null) {
                    }
                    string4 = parametersBuilder.getString("gcm.n.click_action");
                    if (TextUtils.isEmpty(string4)) {
                    }
                    if (launchIntentForPackage == null) {
                    }
                    builder.mContentIntent = activity;
                    if (!parametersBuilder.getBoolean("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    string5 = parametersBuilder.getString("gcm.n.color");
                    if (!TextUtils.isEmpty(string5)) {
                    }
                    i4 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i4 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    builder.setAutoCancel(!parametersBuilder.getBoolean("gcm.n.sticky"));
                    builder.mLocalOnly = parametersBuilder.getBoolean("gcm.n.local_only");
                    string6 = parametersBuilder.getString("gcm.n.ticker");
                    if (string6 != null) {
                    }
                    integer = parametersBuilder.getInteger("gcm.n.notification_priority");
                    if (integer != null) {
                    }
                    integer = null;
                    if (integer != null) {
                    }
                    integer2 = parametersBuilder.getInteger("gcm.n.visibility");
                    if (integer2 != null) {
                    }
                    integer2 = null;
                    if (integer2 != null) {
                    }
                    integer3 = parametersBuilder.getInteger("gcm.n.notification_count");
                    if (integer3 != null) {
                    }
                    integer3 = null;
                    if (integer3 != null) {
                    }
                    string7 = parametersBuilder.getString("gcm.n.event_time");
                    if (!TextUtils.isEmpty(string7)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    jSONArray = parametersBuilder.getJSONArray("gcm.n.vibrate_timings");
                    if (jSONArray != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    jSONArray2 = parametersBuilder.getJSONArray("gcm.n.light_settings");
                    if (jSONArray2 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean z2222222222 = parametersBuilder.getBoolean("gcm.n.default_sound");
                    boolean z3222222222 = z2222222222;
                    if (parametersBuilder.getBoolean("gcm.n.default_vibrate_timings")) {
                    }
                    r0 = z3222222222;
                    if (parametersBuilder.getBoolean("gcm.n.default_light_settings")) {
                    }
                    Notification notification3222222222 = builder.mNotification;
                    notification3222222222.defaults = r0;
                    if ((r0 & 4) != 0) {
                    }
                    string8 = parametersBuilder.getString("gcm.n.tag");
                    if (TextUtils.isEmpty(string8)) {
                    }
                    String str2222222222 = string8;
                    if (imageDownload != null) {
                    }
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                    }
                    ((NotificationManager) ((FirebaseMessagingService) this.b).getSystemService("notification")).notify(str2222222222, 0, builder.build());
                    return true;
                }
                string11 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                if (!TextUtils.isEmpty(string11)) {
                    if (notificationManager.getNotificationChannel(string11) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                    }
                    i = 1;
                    atomicInteger = CommonNotificationBuilder.requestCodeProvider;
                    String packageName2 = firebaseMessagingService.getPackageName();
                    Resources resources2 = firebaseMessagingService.getResources();
                    PackageManager packageManager2 = firebaseMessagingService.getPackageManager();
                    NotificationCompat.Builder builder2 = new NotificationCompat.Builder(firebaseMessagingService, string11);
                    possiblyLocalizedString = parametersBuilder.getPossiblyLocalizedString(resources2, packageName2, "gcm.n.title");
                    if (!TextUtils.isEmpty(possiblyLocalizedString)) {
                    }
                    possiblyLocalizedString2 = parametersBuilder.getPossiblyLocalizedString(resources2, packageName2, "gcm.n.body");
                    if (!TextUtils.isEmpty(possiblyLocalizedString2)) {
                    }
                    string2 = parametersBuilder.getString("gcm.n.icon");
                    if (!TextUtils.isEmpty(string2)) {
                    }
                    i2 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i2 == 0) {
                    }
                    if (i2 == 0) {
                    }
                    builder2.mNotification.icon = i3;
                    string3 = parametersBuilder.getString("gcm.n.sound2");
                    if (TextUtils.isEmpty(string3)) {
                    }
                    if (TextUtils.isEmpty(string3)) {
                    }
                    if (defaultUri != null) {
                    }
                    string4 = parametersBuilder.getString("gcm.n.click_action");
                    if (TextUtils.isEmpty(string4)) {
                    }
                    if (launchIntentForPackage == null) {
                    }
                    builder2.mContentIntent = activity;
                    if (!parametersBuilder.getBoolean("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    string5 = parametersBuilder.getString("gcm.n.color");
                    if (!TextUtils.isEmpty(string5)) {
                    }
                    i4 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i4 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    builder2.setAutoCancel(!parametersBuilder.getBoolean("gcm.n.sticky"));
                    builder2.mLocalOnly = parametersBuilder.getBoolean("gcm.n.local_only");
                    string6 = parametersBuilder.getString("gcm.n.ticker");
                    if (string6 != null) {
                    }
                    integer = parametersBuilder.getInteger("gcm.n.notification_priority");
                    if (integer != null) {
                    }
                    integer = null;
                    if (integer != null) {
                    }
                    integer2 = parametersBuilder.getInteger("gcm.n.visibility");
                    if (integer2 != null) {
                    }
                    integer2 = null;
                    if (integer2 != null) {
                    }
                    integer3 = parametersBuilder.getInteger("gcm.n.notification_count");
                    if (integer3 != null) {
                    }
                    integer3 = null;
                    if (integer3 != null) {
                    }
                    string7 = parametersBuilder.getString("gcm.n.event_time");
                    if (!TextUtils.isEmpty(string7)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    jSONArray = parametersBuilder.getJSONArray("gcm.n.vibrate_timings");
                    if (jSONArray != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    jSONArray2 = parametersBuilder.getJSONArray("gcm.n.light_settings");
                    if (jSONArray2 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean z22222222222 = parametersBuilder.getBoolean("gcm.n.default_sound");
                    boolean z32222222222 = z22222222222;
                    if (parametersBuilder.getBoolean("gcm.n.default_vibrate_timings")) {
                    }
                    r0 = z32222222222;
                    if (parametersBuilder.getBoolean("gcm.n.default_light_settings")) {
                    }
                    Notification notification32222222222 = builder2.mNotification;
                    notification32222222222.defaults = r0;
                    if ((r0 & 4) != 0) {
                    }
                    string8 = parametersBuilder.getString("gcm.n.tag");
                    if (TextUtils.isEmpty(string8)) {
                    }
                    String str22222222222 = string8;
                    if (imageDownload != null) {
                    }
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                    }
                    ((NotificationManager) ((FirebaseMessagingService) this.b).getSystemService("notification")).notify(str22222222222, 0, builder2.build());
                    return true;
                }
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                string11 = "fcm_fallback_notification_channel";
                if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                    i = 1;
                    int identifier = firebaseMessagingService.getResources().getIdentifier("fcm_fallback_notification_channel_label", InquiryField.StringField.TYPE, firebaseMessagingService.getPackageName());
                    if (identifier == 0) {
                        Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                        string9 = "Misc";
                    } else {
                        string9 = firebaseMessagingService.getString(identifier);
                    }
                    notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string9, 3));
                    atomicInteger = CommonNotificationBuilder.requestCodeProvider;
                    String packageName22 = firebaseMessagingService.getPackageName();
                    Resources resources22 = firebaseMessagingService.getResources();
                    PackageManager packageManager22 = firebaseMessagingService.getPackageManager();
                    NotificationCompat.Builder builder22 = new NotificationCompat.Builder(firebaseMessagingService, string11);
                    possiblyLocalizedString = parametersBuilder.getPossiblyLocalizedString(resources22, packageName22, "gcm.n.title");
                    if (!TextUtils.isEmpty(possiblyLocalizedString)) {
                    }
                    possiblyLocalizedString2 = parametersBuilder.getPossiblyLocalizedString(resources22, packageName22, "gcm.n.body");
                    if (!TextUtils.isEmpty(possiblyLocalizedString2)) {
                    }
                    string2 = parametersBuilder.getString("gcm.n.icon");
                    if (!TextUtils.isEmpty(string2)) {
                    }
                    i2 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i2 == 0) {
                    }
                    if (i2 == 0) {
                    }
                    builder22.mNotification.icon = i3;
                    string3 = parametersBuilder.getString("gcm.n.sound2");
                    if (TextUtils.isEmpty(string3)) {
                    }
                    if (TextUtils.isEmpty(string3)) {
                    }
                    if (defaultUri != null) {
                    }
                    string4 = parametersBuilder.getString("gcm.n.click_action");
                    if (TextUtils.isEmpty(string4)) {
                    }
                    if (launchIntentForPackage == null) {
                    }
                    builder22.mContentIntent = activity;
                    if (!parametersBuilder.getBoolean("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    string5 = parametersBuilder.getString("gcm.n.color");
                    if (!TextUtils.isEmpty(string5)) {
                    }
                    i4 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i4 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    builder22.setAutoCancel(!parametersBuilder.getBoolean("gcm.n.sticky"));
                    builder22.mLocalOnly = parametersBuilder.getBoolean("gcm.n.local_only");
                    string6 = parametersBuilder.getString("gcm.n.ticker");
                    if (string6 != null) {
                    }
                    integer = parametersBuilder.getInteger("gcm.n.notification_priority");
                    if (integer != null) {
                    }
                    integer = null;
                    if (integer != null) {
                    }
                    integer2 = parametersBuilder.getInteger("gcm.n.visibility");
                    if (integer2 != null) {
                    }
                    integer2 = null;
                    if (integer2 != null) {
                    }
                    integer3 = parametersBuilder.getInteger("gcm.n.notification_count");
                    if (integer3 != null) {
                    }
                    integer3 = null;
                    if (integer3 != null) {
                    }
                    string7 = parametersBuilder.getString("gcm.n.event_time");
                    if (!TextUtils.isEmpty(string7)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    jSONArray = parametersBuilder.getJSONArray("gcm.n.vibrate_timings");
                    if (jSONArray != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    jSONArray2 = parametersBuilder.getJSONArray("gcm.n.light_settings");
                    if (jSONArray2 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean z222222222222 = parametersBuilder.getBoolean("gcm.n.default_sound");
                    boolean z322222222222 = z222222222222;
                    if (parametersBuilder.getBoolean("gcm.n.default_vibrate_timings")) {
                    }
                    r0 = z322222222222;
                    if (parametersBuilder.getBoolean("gcm.n.default_light_settings")) {
                    }
                    Notification notification322222222222 = builder22.mNotification;
                    notification322222222222.defaults = r0;
                    if ((r0 & 4) != 0) {
                    }
                    string8 = parametersBuilder.getString("gcm.n.tag");
                    if (TextUtils.isEmpty(string8)) {
                    }
                    String str222222222222 = string8;
                    if (imageDownload != null) {
                    }
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                    }
                    ((NotificationManager) ((FirebaseMessagingService) this.b).getSystemService("notification")).notify(str222222222222, 0, builder22.build());
                    return true;
                }
                i = 1;
                atomicInteger = CommonNotificationBuilder.requestCodeProvider;
                String packageName222 = firebaseMessagingService.getPackageName();
                Resources resources222 = firebaseMessagingService.getResources();
                PackageManager packageManager222 = firebaseMessagingService.getPackageManager();
                NotificationCompat.Builder builder222 = new NotificationCompat.Builder(firebaseMessagingService, string11);
                possiblyLocalizedString = parametersBuilder.getPossiblyLocalizedString(resources222, packageName222, "gcm.n.title");
                if (!TextUtils.isEmpty(possiblyLocalizedString)) {
                }
                possiblyLocalizedString2 = parametersBuilder.getPossiblyLocalizedString(resources222, packageName222, "gcm.n.body");
                if (!TextUtils.isEmpty(possiblyLocalizedString2)) {
                }
                string2 = parametersBuilder.getString("gcm.n.icon");
                if (!TextUtils.isEmpty(string2)) {
                }
                i2 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                if (i2 == 0) {
                }
                if (i2 == 0) {
                }
                builder222.mNotification.icon = i3;
                string3 = parametersBuilder.getString("gcm.n.sound2");
                if (TextUtils.isEmpty(string3)) {
                }
                if (TextUtils.isEmpty(string3)) {
                }
                if (defaultUri != null) {
                }
                string4 = parametersBuilder.getString("gcm.n.click_action");
                if (TextUtils.isEmpty(string4)) {
                }
                if (launchIntentForPackage == null) {
                }
                builder222.mContentIntent = activity;
                if (!parametersBuilder.getBoolean("google.c.a.e")) {
                }
                if (broadcast != null) {
                }
                string5 = parametersBuilder.getString("gcm.n.color");
                if (!TextUtils.isEmpty(string5)) {
                }
                i4 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i4 != 0) {
                }
                valueOf = null;
                if (valueOf != null) {
                }
                builder222.setAutoCancel(!parametersBuilder.getBoolean("gcm.n.sticky"));
                builder222.mLocalOnly = parametersBuilder.getBoolean("gcm.n.local_only");
                string6 = parametersBuilder.getString("gcm.n.ticker");
                if (string6 != null) {
                }
                integer = parametersBuilder.getInteger("gcm.n.notification_priority");
                if (integer != null) {
                }
                integer = null;
                if (integer != null) {
                }
                integer2 = parametersBuilder.getInteger("gcm.n.visibility");
                if (integer2 != null) {
                }
                integer2 = null;
                if (integer2 != null) {
                }
                integer3 = parametersBuilder.getInteger("gcm.n.notification_count");
                if (integer3 != null) {
                }
                integer3 = null;
                if (integer3 != null) {
                }
                string7 = parametersBuilder.getString("gcm.n.event_time");
                if (!TextUtils.isEmpty(string7)) {
                }
                valueOf2 = null;
                if (valueOf2 != null) {
                }
                jSONArray = parametersBuilder.getJSONArray("gcm.n.vibrate_timings");
                if (jSONArray != null) {
                }
                jArr = null;
                if (jArr != null) {
                }
                jSONArray2 = parametersBuilder.getJSONArray("gcm.n.light_settings");
                if (jSONArray2 != null) {
                }
                iArr = null;
                if (iArr != null) {
                }
                boolean z2222222222222 = parametersBuilder.getBoolean("gcm.n.default_sound");
                boolean z3222222222222 = z2222222222222;
                if (parametersBuilder.getBoolean("gcm.n.default_vibrate_timings")) {
                }
                r0 = z3222222222222;
                if (parametersBuilder.getBoolean("gcm.n.default_light_settings")) {
                }
                Notification notification3222222222222 = builder222.mNotification;
                notification3222222222222.defaults = r0;
                if ((r0 & 4) != 0) {
                }
                string8 = parametersBuilder.getString("gcm.n.tag");
                if (TextUtils.isEmpty(string8)) {
                }
                String str2222222222222 = string8;
                if (imageDownload != null) {
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                }
                ((NotificationManager) ((FirebaseMessagingService) this.b).getSystemService("notification")).notify(str2222222222222, 0, builder222.build());
                return true;
            }
            i = 1;
            string11 = null;
            atomicInteger = CommonNotificationBuilder.requestCodeProvider;
            String packageName2222 = firebaseMessagingService.getPackageName();
            Resources resources2222 = firebaseMessagingService.getResources();
            PackageManager packageManager2222 = firebaseMessagingService.getPackageManager();
            NotificationCompat.Builder builder2222 = new NotificationCompat.Builder(firebaseMessagingService, string11);
            possiblyLocalizedString = parametersBuilder.getPossiblyLocalizedString(resources2222, packageName2222, "gcm.n.title");
            if (!TextUtils.isEmpty(possiblyLocalizedString)) {
            }
            possiblyLocalizedString2 = parametersBuilder.getPossiblyLocalizedString(resources2222, packageName2222, "gcm.n.body");
            if (!TextUtils.isEmpty(possiblyLocalizedString2)) {
            }
            string2 = parametersBuilder.getString("gcm.n.icon");
            if (!TextUtils.isEmpty(string2)) {
            }
            i2 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (i2 == 0) {
            }
            if (i2 == 0) {
            }
            builder2222.mNotification.icon = i3;
            string3 = parametersBuilder.getString("gcm.n.sound2");
            if (TextUtils.isEmpty(string3)) {
            }
            if (TextUtils.isEmpty(string3)) {
            }
            if (defaultUri != null) {
            }
            string4 = parametersBuilder.getString("gcm.n.click_action");
            if (TextUtils.isEmpty(string4)) {
            }
            if (launchIntentForPackage == null) {
            }
            builder2222.mContentIntent = activity;
            if (!parametersBuilder.getBoolean("google.c.a.e")) {
            }
            if (broadcast != null) {
            }
            string5 = parametersBuilder.getString("gcm.n.color");
            if (!TextUtils.isEmpty(string5)) {
            }
            i4 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i4 != 0) {
            }
            valueOf = null;
            if (valueOf != null) {
            }
            builder2222.setAutoCancel(!parametersBuilder.getBoolean("gcm.n.sticky"));
            builder2222.mLocalOnly = parametersBuilder.getBoolean("gcm.n.local_only");
            string6 = parametersBuilder.getString("gcm.n.ticker");
            if (string6 != null) {
            }
            integer = parametersBuilder.getInteger("gcm.n.notification_priority");
            if (integer != null) {
            }
            integer = null;
            if (integer != null) {
            }
            integer2 = parametersBuilder.getInteger("gcm.n.visibility");
            if (integer2 != null) {
            }
            integer2 = null;
            if (integer2 != null) {
            }
            integer3 = parametersBuilder.getInteger("gcm.n.notification_count");
            if (integer3 != null) {
            }
            integer3 = null;
            if (integer3 != null) {
            }
            string7 = parametersBuilder.getString("gcm.n.event_time");
            if (!TextUtils.isEmpty(string7)) {
            }
            valueOf2 = null;
            if (valueOf2 != null) {
            }
            jSONArray = parametersBuilder.getJSONArray("gcm.n.vibrate_timings");
            if (jSONArray != null) {
            }
            jArr = null;
            if (jArr != null) {
            }
            jSONArray2 = parametersBuilder.getJSONArray("gcm.n.light_settings");
            if (jSONArray2 != null) {
            }
            iArr = null;
            if (iArr != null) {
            }
            boolean z22222222222222 = parametersBuilder.getBoolean("gcm.n.default_sound");
            boolean z32222222222222 = z22222222222222;
            if (parametersBuilder.getBoolean("gcm.n.default_vibrate_timings")) {
            }
            r0 = z32222222222222;
            if (parametersBuilder.getBoolean("gcm.n.default_light_settings")) {
            }
            Notification notification32222222222222 = builder2222.mNotification;
            notification32222222222222.defaults = r0;
            if ((r0 & 4) != 0) {
            }
            string8 = parametersBuilder.getString("gcm.n.tag");
            if (TextUtils.isEmpty(string8)) {
            }
            String str22222222222222 = string8;
            if (imageDownload != null) {
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
            }
            ((NotificationManager) ((FirebaseMessagingService) this.b).getSystemService("notification")).notify(str22222222222222, 0, builder2222.build());
            return true;
        }
        imageDownload = null;
        int i52 = 4;
        if (imageDownload != null) {
        }
        firebaseMessagingService = (FirebaseMessagingService) this.b;
        parametersBuilder = (ParametersBuilder) this.c;
        AtomicInteger atomicInteger22 = CommonNotificationBuilder.requestCodeProvider;
        applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
        if (applicationInfo != null) {
        }
        bundle = Bundle.EMPTY;
        Bundle bundle22 = bundle;
        String string112 = parametersBuilder.getString("gcm.n.android_channel_id");
        if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
        }
        i = 1;
        string112 = null;
        atomicInteger = CommonNotificationBuilder.requestCodeProvider;
        String packageName22222 = firebaseMessagingService.getPackageName();
        Resources resources22222 = firebaseMessagingService.getResources();
        PackageManager packageManager22222 = firebaseMessagingService.getPackageManager();
        NotificationCompat.Builder builder22222 = new NotificationCompat.Builder(firebaseMessagingService, string112);
        possiblyLocalizedString = parametersBuilder.getPossiblyLocalizedString(resources22222, packageName22222, "gcm.n.title");
        if (!TextUtils.isEmpty(possiblyLocalizedString)) {
        }
        possiblyLocalizedString2 = parametersBuilder.getPossiblyLocalizedString(resources22222, packageName22222, "gcm.n.body");
        if (!TextUtils.isEmpty(possiblyLocalizedString2)) {
        }
        string2 = parametersBuilder.getString("gcm.n.icon");
        if (!TextUtils.isEmpty(string2)) {
        }
        i2 = bundle22.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i2 == 0) {
        }
        if (i2 == 0) {
        }
        builder22222.mNotification.icon = i3;
        string3 = parametersBuilder.getString("gcm.n.sound2");
        if (TextUtils.isEmpty(string3)) {
        }
        if (TextUtils.isEmpty(string3)) {
        }
        if (defaultUri != null) {
        }
        string4 = parametersBuilder.getString("gcm.n.click_action");
        if (TextUtils.isEmpty(string4)) {
        }
        if (launchIntentForPackage == null) {
        }
        builder22222.mContentIntent = activity;
        if (!parametersBuilder.getBoolean("google.c.a.e")) {
        }
        if (broadcast != null) {
        }
        string5 = parametersBuilder.getString("gcm.n.color");
        if (!TextUtils.isEmpty(string5)) {
        }
        i4 = bundle22.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i4 != 0) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        builder22222.setAutoCancel(!parametersBuilder.getBoolean("gcm.n.sticky"));
        builder22222.mLocalOnly = parametersBuilder.getBoolean("gcm.n.local_only");
        string6 = parametersBuilder.getString("gcm.n.ticker");
        if (string6 != null) {
        }
        integer = parametersBuilder.getInteger("gcm.n.notification_priority");
        if (integer != null) {
        }
        integer = null;
        if (integer != null) {
        }
        integer2 = parametersBuilder.getInteger("gcm.n.visibility");
        if (integer2 != null) {
        }
        integer2 = null;
        if (integer2 != null) {
        }
        integer3 = parametersBuilder.getInteger("gcm.n.notification_count");
        if (integer3 != null) {
        }
        integer3 = null;
        if (integer3 != null) {
        }
        string7 = parametersBuilder.getString("gcm.n.event_time");
        if (!TextUtils.isEmpty(string7)) {
        }
        valueOf2 = null;
        if (valueOf2 != null) {
        }
        jSONArray = parametersBuilder.getJSONArray("gcm.n.vibrate_timings");
        if (jSONArray != null) {
        }
        jArr = null;
        if (jArr != null) {
        }
        jSONArray2 = parametersBuilder.getJSONArray("gcm.n.light_settings");
        if (jSONArray2 != null) {
        }
        iArr = null;
        if (iArr != null) {
        }
        boolean z222222222222222 = parametersBuilder.getBoolean("gcm.n.default_sound");
        boolean z322222222222222 = z222222222222222;
        if (parametersBuilder.getBoolean("gcm.n.default_vibrate_timings")) {
        }
        r0 = z322222222222222;
        if (parametersBuilder.getBoolean("gcm.n.default_light_settings")) {
        }
        Notification notification322222222222222 = builder22222.mNotification;
        notification322222222222222.defaults = r0;
        if ((r0 & 4) != 0) {
        }
        string8 = parametersBuilder.getString("gcm.n.tag");
        if (TextUtils.isEmpty(string8)) {
        }
        String str222222222222222 = string8;
        if (imageDownload != null) {
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
        }
        ((NotificationManager) ((FirebaseMessagingService) this.b).getSystemService("notification")).notify(str222222222222222, 0, builder22222.build());
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object initiateLoan(BetterNavigator.ScreenNavigator screenNavigator, Money money, Function1 function1, ContinuationImpl continuationImpl) {
        RealLoanFlowStarter$initiateLoan$1 realLoanFlowStarter$initiateLoan$1;
        int i;
        String generateToken;
        Object initiateLoan;
        Function1 function12;
        ApiResult apiResult;
        if (continuationImpl instanceof RealLoanFlowStarter$initiateLoan$1) {
            realLoanFlowStarter$initiateLoan$1 = (RealLoanFlowStarter$initiateLoan$1) continuationImpl;
            int i2 = realLoanFlowStarter$initiateLoan$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realLoanFlowStarter$initiateLoan$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realLoanFlowStarter$initiateLoan$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realLoanFlowStarter$initiateLoan$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    BlockersData.Flow.INSTANCE.getClass();
                    generateToken = BlockersData.Flow.Companion.generateToken();
                    LendingAppService lendingAppService = (LendingAppService) this.a;
                    ClientScenario clientScenario = ClientScenario.INITIATE_LOAN;
                    InitiateLoanRequest initiateLoanRequest = new InitiateLoanRequest(null, null, UUID.randomUUID().toString(), money, ByteString.EMPTY);
                    realLoanFlowStarter$initiateLoan$1.L$0 = screenNavigator;
                    realLoanFlowStarter$initiateLoan$1.L$2 = function1;
                    realLoanFlowStarter$initiateLoan$1.L$3 = generateToken;
                    realLoanFlowStarter$initiateLoan$1.label = 1;
                    initiateLoan = lendingAppService.initiateLoan(clientScenario, generateToken, initiateLoanRequest, realLoanFlowStarter$initiateLoan$1);
                    if (initiateLoan == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    function12 = function1;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str = realLoanFlowStarter$initiateLoan$1.L$3;
                    function12 = realLoanFlowStarter$initiateLoan$1.L$2;
                    BetterNavigator.ScreenNavigator screenNavigator2 = realLoanFlowStarter$initiateLoan$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    generateToken = str;
                    screenNavigator = screenNavigator2;
                    initiateLoan = obj;
                }
                apiResult = (ApiResult) initiateLoan;
                if (!(apiResult instanceof ApiResult.Success)) {
                    BlockersData startProfileBlockersFlow$default = FlowStarter.startProfileBlockersFlow$default((FlowStarter) this.b, ClientScenario.INITIATE_LOAN, new BorrowHome(), generateToken, 8);
                    ResponseContext responseContext = ((InitiateLoanResponse) ((ApiResult.Success) apiResult).response).response_context;
                    responseContext.getClass();
                    screenNavigator.goTo(((BlockersDataNavigator) this.c).getNext(null, startProfileBlockersFlow$default.updateFromResponseContext(responseContext, false)));
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    function12.invoke(apiResult);
                }
                return Unit.INSTANCE;
            }
        }
        realLoanFlowStarter$initiateLoan$1 = new RealLoanFlowStarter$initiateLoan$1(this, continuationImpl);
        Object obj2 = realLoanFlowStarter$initiateLoan$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realLoanFlowStarter$initiateLoan$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) initiateLoan;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return Unit.INSTANCE;
    }

    @Override // com.squareup.card.entry.validators.InputValidator
    public boolean isComplete(String str) {
        str.getClass();
        Pattern pattern = UtilsKt.nonDigitPattern;
        pattern.getClass();
        String replaceAll = pattern.matcher(str).replaceAll("");
        replaceAll.getClass();
        return replaceAll.length() == 4;
    }

    public boolean isRunning(Runnable runnable) {
        runnable.getClass();
        a aVar = (a) ((HashMap) this.c).get(Integer.valueOf(runnable.hashCode()));
        if (aVar != null) {
            return aVar.c;
        }
        return false;
    }

    @Override // com.squareup.card.entry.validators.InputValidator
    public boolean isValid(String str) {
        str.getClass();
        Pattern pattern = UtilsKt.nonDigitPattern;
        pattern.getClass();
        String replaceAll = pattern.matcher(str).replaceAll("");
        replaceAll.getClass();
        int length = replaceAll.length();
        if (length != 0) {
            if (1 <= length && length < 3) {
                return monthValid(replaceAll);
            }
            if (length != 3) {
                if (length == 4 && monthValid(StringsKt.substring(replaceAll, new IntRange(0, 1, 1))) && validDecade(replaceAll.charAt(2))) {
                    Calendar calendar = (Calendar) this.b;
                    try {
                        int parseInt = Integer.parseInt(StringsKt.substring(replaceAll, new IntRange(2, 3, 1)));
                        int i = calendar.get(1);
                        int i2 = (i - (i % 100)) + parseInt;
                        Date parse = ((SimpleDateFormat) this.a).parse(StringsKt.substring(replaceAll, new IntRange(0, 1, 1)) + i2);
                        if (parse.getTime() >= calendar.getTime().getTime()) {
                            if (parse.getTime() <= ((Calendar) this.c).getTime().getTime()) {
                            }
                        }
                    } catch (ParseException unused) {
                    }
                }
                return false;
            }
            if (!monthValid(StringsKt.substring(replaceAll, new IntRange(0, 1, 1))) || !validDecade(replaceAll.charAt(2))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r2v11, types: [com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v6 */
    @Override // com.squareup.cash.bitcoin.presenters.applet.widget.BitcoinHomeWidgetPresenter
    public BitcoinHomeWidgetViewModel models(BetterNavigator.ScreenNavigator screenNavigator, Flow flow, GapComposer gapComposer, int i) {
        GetBoostConfigResponse.BtcBoostUpsell btcBoostUpsell;
        int i2 = this.$r8$classId;
        int i3 = 2;
        ?? r8 = 0;
        r8 = 0;
        int i4 = 1;
        int i5 = 4;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        int i6 = 0;
        switch (i2) {
            case 21:
                gapComposer.startReplaceGroup(1373362202);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = ((RealIssuedCardManager) ((IssuedCardManager) this.c)).getIssuedCardState();
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                CashAppCard.PhysicalCardOrderState physicalCardOrderState = CashAppCard.PhysicalCardOrderState.NO_CARD;
                MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, physicalCardOrderState, null, gapComposer, 48, 2);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new BitcoinDepositsPresenter$special$$inlined$filter$1(flow, 21);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Flow flow2 = (Flow) rememberedValue2;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = ((RealRouter$Factory$Impl) this.b).create$1(screenNavigator);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                RealRouter realRouter = (RealRouter) rememberedValue3;
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (rememberedValue4 == neverEqualPolicy) {
                    RealBoostConfigManager realBoostConfigManager = (RealBoostConfigManager) ((BoostConfigManager) this.a);
                    LocalTabContentQueries localTabContentQueries = realBoostConfigManager.boostConfigQueries;
                    localTabContentQueries.getClass();
                    int i7 = BoostConfigQueries$get$2.$r8$clinit;
                    SqlDriver sqlDriver = localTabContentQueries.driver;
                    RewardSlotQueries$$ExternalSyntheticLambda0 rewardSlotQueries$$ExternalSyntheticLambda0 = new RewardSlotQueries$$ExternalSyntheticLambda0(localTabContentQueries);
                    sqlDriver.getClass();
                    rememberedValue4 = new RealAppConfigManager$cashLiteConfig$$inlined$map$1(new FinishSetupTileBadgeCounter(i5, DBUtil.toFlow(new SimpleQuery(-281532318, new String[]{"boostConfig"}, sqlDriver, "BoostConfig.sq", "get", "SELECT boostConfig.expirationHintThresholdBps, boostConfig.bitcoinBoostUpsell\nFROM boostConfig", rewardSlotQueries$$ExternalSyntheticLambda0)), realBoostConfigManager.ioDispatcher), i4);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue4, null, null, gapComposer, 48, 2);
                Updater.LaunchedEffect(gapComposer, flow2, new AmountBlockerPresenter$models$1$2(flow2, (Continuation) r8, realRouter, i3));
                if (((CashAppCard.PhysicalCardOrderState) collectAsState.getValue()) == physicalCardOrderState && (btcBoostUpsell = (GetBoostConfigResponse.BtcBoostUpsell) collectAsState2.getValue()) != null) {
                    Image image = new Image("https://cash-f.squarecdn.com/static/bitcoin_boost_cash_card_upsell_v8.jpeg", "https://cash-f.squarecdn.com/static/bitcoin_boost_cash_card_upsell_dark_v8.jpeg", i5);
                    String str = btcBoostUpsell.image_url;
                    String str2 = btcBoostUpsell.title_text;
                    String str3 = btcBoostUpsell.body_text;
                    GetBoostConfigResponse.BtcBoostUpsell.Button button = btcBoostUpsell.primary_button;
                    r8 = new BitcoinBoostWidgetViewModel(image, str, str2, str3, button != null ? button.label_text : null, button != null ? button.url : null, ColoredLearnMoreConfigurationModel.LinkStyle.PILL_BUTTON);
                }
                gapComposer.end(false);
                return r8;
            case 22:
                RealBitcoinMapEligibilityManager realBitcoinMapEligibilityManager = (RealBitcoinMapEligibilityManager) this.a;
                gapComposer.startReplaceGroup(-879571670);
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = realBitcoinMapEligibilityManager.isEligible();
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                Boolean bool = Boolean.FALSE;
                MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue5, bool, null, gapComposer, 48, 2);
                Object rememberedValue6 = gapComposer.rememberedValue();
                if (rememberedValue6 == neverEqualPolicy) {
                    rememberedValue6 = realBitcoinMapEligibilityManager.isLightningWithdrawEligible();
                    gapComposer.updateRememberedValue(rememberedValue6);
                }
                MutableState collectAsState4 = Updater.collectAsState((Flow) rememberedValue6, bool, null, gapComposer, 48, 2);
                Object rememberedValue7 = gapComposer.rememberedValue();
                if (rememberedValue7 == neverEqualPolicy) {
                    rememberedValue7 = ((FeatureFlag$StringAmplitudeExperiment.Value) ((RealFeatureFlagManager) ((FeatureFlagManager) this.c)).currentValue(AmplitudeExperiments$BitcoinMapCardV2.INSTANCE)).value;
                    gapComposer.updateRememberedValue(rememberedValue7);
                }
                boolean areEqual = Intrinsics.areEqual((String) rememberedValue7, "disabled");
                Object rememberedValue8 = gapComposer.rememberedValue();
                if (rememberedValue8 == neverEqualPolicy) {
                    rememberedValue8 = new CardModelView$iconTexture$$inlined$map$1(flow, i4);
                    gapComposer.updateRememberedValue(rememberedValue8);
                }
                Flow flow3 = (Flow) rememberedValue8;
                ?? r2 = 0;
                r2 = 0;
                Updater.LaunchedEffect(gapComposer, flow3, new BenefitsHubPresenter$models$1$1(flow3, (Continuation) r2, this, screenNavigator, 26));
                if (((Boolean) collectAsState3.getValue()).booleanValue() && !areEqual) {
                    r2 = new BitcoinMapCardWidgetViewModel(((Boolean) collectAsState4.getValue()).booleanValue());
                }
                gapComposer.end(false);
                return r2;
            case 23:
                gapComposer.startReplaceGroup(156850525);
                Unit unit = Unit.INSTANCE;
                boolean changedInstance = gapComposer.changedInstance(this);
                Object rememberedValue9 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue9 == neverEqualPolicy) {
                    rememberedValue9 = new BitcoinNewsWidgetPresenter$models$1$1(i6, this, r8);
                    gapComposer.updateRememberedValue(rememberedValue9);
                }
                Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue9);
                boolean changed = gapComposer.changed(screenNavigator);
                Object rememberedValue10 = gapComposer.rememberedValue();
                if (changed || rememberedValue10 == neverEqualPolicy) {
                    rememberedValue10 = ((InvestingCryptoNewsPresenter$Factory$Impl) this.a).create(screenNavigator, NewsKind.BitcoinPortfolio.INSTANCE, null, true);
                    gapComposer.updateRememberedValue(rememberedValue10);
                }
                MoleculePresenter moleculePresenter = (MoleculePresenter) rememberedValue10;
                Object rememberedValue11 = gapComposer.rememberedValue();
                if (rememberedValue11 == neverEqualPolicy) {
                    DataStoreImpl$data$1$invokeSuspend$$inlined$map$1 dataStoreImpl$data$1$invokeSuspend$$inlined$map$1 = new DataStoreImpl$data$1$invokeSuspend$$inlined$map$1(new CardModelView$iconTexture$$inlined$map$1(flow, i3), 18);
                    gapComposer.updateRememberedValue(dataStoreImpl$data$1$invokeSuspend$$inlined$map$1);
                    rememberedValue11 = dataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
                }
                BitcoinHomeNewsWidgetViewModel bitcoinHomeNewsWidgetViewModel = new BitcoinHomeNewsWidgetViewModel((InvestingCryptoNewsViewModel) moleculePresenter.models((Flow) rememberedValue11, gapComposer, 0));
                gapComposer.end(false);
                return bitcoinHomeNewsWidgetViewModel;
            default:
                AndroidStringManager androidStringManager = (AndroidStringManager) this.a;
                gapComposer.startReplaceGroup(-1938004419);
                Object rememberedValue12 = gapComposer.rememberedValue();
                if (rememberedValue12 == neverEqualPolicy) {
                    rememberedValue12 = new CardModelView$iconTexture$$inlined$map$1(flow, i5);
                    gapComposer.updateRememberedValue(rememberedValue12);
                }
                Flow flow4 = (Flow) rememberedValue12;
                Object rememberedValue13 = gapComposer.rememberedValue();
                if (rememberedValue13 == neverEqualPolicy) {
                    rememberedValue13 = ((CryptoIdvStatusRepo) this.b).idvStatus();
                    gapComposer.updateRememberedValue(rememberedValue13);
                }
                MutableState collectAsState5 = Updater.collectAsState((Flow) rememberedValue13, CryptoIdvStatus.NOT_VERIFIED, null, gapComposer, 48, 2);
                Updater.LaunchedEffect(gapComposer, flow4, new BenefitsHubPresenter$models$1$1(flow4, (Continuation) (false ? 1 : 0), (Object) this, (Object) screenNavigator, 27));
                BitcoinHomePendingIdvWidgetViewModel bitcoinHomePendingIdvWidgetViewModel = ((CryptoIdvStatus) collectAsState5.getValue()) == CryptoIdvStatus.PENDING ? new BitcoinHomePendingIdvWidgetViewModel(androidStringManager.get(R.string.identity_being_verified), androidStringManager.get(R.string.notify_when_finished)) : null;
                gapComposer.end(false);
                return bitcoinHomePendingIdvWidgetViewModel;
        }
    }

    @Override // com.squareup.scannerview.ScannerView.Callback
    public void onComplete(ArrayList arrayList) {
        arrayList.getClass();
        Function1 function1 = (Function1) this.a;
        String str = ((StepResult) CollectionsKt.first((List) arrayList)).text;
        str.getClass();
        function1.invoke(new CardActivationQrViewEvent.Scanned(str));
    }

    @Override // com.squareup.scannerview.ScannerView.Callback
    public void onError() {
    }

    @Override // com.squareup.scannerview.ScannerView.Callback
    public void onFlashState(FlashState flashState) {
        flashState.getClass();
        ((MutableState) this.c).setValue(flashState);
    }

    @Override // com.squareup.scannerview.ScannerView.Callback
    public void onManualError(ManualErrorReason manualErrorReason) {
        manualErrorReason.getClass();
    }

    @Override // com.squareup.scannerview.ScannerView.Callback
    public void onOverlayBottom(int i) {
        ((ParcelableSnapshotMutableIntState) this.b).setIntValue(i);
    }

    @Override // com.squareup.scannerview.ScannerView.Callback
    public void onPreviewVisibilityChanged(boolean z, Step step) {
        step.getClass();
    }

    @Override // androidx.camera.core.Preview.SurfaceProvider
    public void onSurfaceRequested(SurfaceRequest surfaceRequest) {
        surfaceRequest.getClass();
        SurfaceHolder surfaceHolder = (SurfaceHolder) this.c;
        if (surfaceHolder != null) {
            Size size = surfaceRequest.mResolution;
            surfaceHolder.setFixedSize(size.getWidth(), size.getHeight());
            Surface surface = surfaceHolder.getSurface();
            surface.getClass();
            this.b = surface;
        }
        Surface surface2 = (Surface) this.b;
        if (surface2 != null) {
            surfaceRequest.provideSurface(surface2, (Executor) this.a, new SessionConfig$$ExternalSyntheticLambda0(6));
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("providedSurface");
            throw null;
        }
    }

    public void pause(Runnable runnable) {
        a aVar;
        PausableTimer$b pausableTimer$b = (PausableTimer$b) this.a;
        HashMap hashMap = (HashMap) this.c;
        runnable.getClass();
        if (!isRunning(runnable) || (aVar = (a) hashMap.get(Integer.valueOf(runnable.hashCode()))) == null) {
            return;
        }
        long longValue = aVar.b - (((Number) pausableTimer$b.invoke()).longValue() - aVar.a);
        ((Handler) this.b).removeCallbacksAndMessages(aVar);
        hashMap.put(Integer.valueOf(runnable.hashCode()), new a(false, ((Number) pausableTimer$b.invoke()).longValue(), longValue));
    }

    public long remainingTime(Runnable runnable) {
        runnable.getClass();
        boolean isRunning = isRunning(runnable);
        HashMap hashMap = (HashMap) this.c;
        if (isRunning) {
            a aVar = (a) hashMap.get(Integer.valueOf(runnable.hashCode()));
            if (aVar != null) {
                return aVar.b - (((Number) ((PausableTimer$b) this.a).invoke()).longValue() - aVar.a);
            }
            return 0L;
        }
        a aVar2 = (a) hashMap.get(Integer.valueOf(runnable.hashCode()));
        if (aVar2 != null) {
            return aVar2.b;
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // com.squareup.cash.activity.backend.loader.ActivitiesManager.ActivityPageHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object requestPage(ActivitiesManager.ActivityContext activityContext, ActivitiesManager.ActivityPage.PageOffset pageOffset, Continuation continuation) {
        MainFeedSearchPageRequestHandler$requestPage$1 mainFeedSearchPageRequestHandler$requestPage$1;
        int i;
        ActivitySearchResponse activitySearchResponse;
        if (continuation instanceof MainFeedSearchPageRequestHandler$requestPage$1) {
            mainFeedSearchPageRequestHandler$requestPage$1 = (MainFeedSearchPageRequestHandler$requestPage$1) continuation;
            int i2 = mainFeedSearchPageRequestHandler$requestPage$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                mainFeedSearchPageRequestHandler$requestPage$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = mainFeedSearchPageRequestHandler$requestPage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainFeedSearchPageRequestHandler$requestPage$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (KeyguardUtils.isValidSearchQuery((String) this.c)) {
                        ActivitySearchPageRequest activitySearchPageRequest = new ActivitySearchPageRequest(new ActivitySearchRequest((String) this.c, EmptyList.INSTANCE, null, pageOffset != null ? new SearchOffset(pageOffset.offset) : null, 25, activityContext.activityToken, ((RealActivityAnalyticsService) ((ActivityAnalyticsService) this.b)).queryToken, 3972), activityContext.activityScope, 26);
                        ActivityClientService activityClientService = (ActivityClientService) this.a;
                        mainFeedSearchPageRequestHandler$requestPage$1.label = 1;
                        obj = activityClientService.searchActivity(activitySearchPageRequest, mainFeedSearchPageRequestHandler$requestPage$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                ApiResult apiResult = (ApiResult) obj;
                activitySearchResponse = (ActivitySearchResponse) (!(apiResult instanceof ApiResult.Success) ? ((ApiResult.Success) apiResult).response : null);
                if (activitySearchResponse != null) {
                    return ActivitiesManager.ActivityPage.Companion.toActivityPage(activitySearchResponse);
                }
                return null;
            }
        }
        mainFeedSearchPageRequestHandler$requestPage$1 = new MainFeedSearchPageRequestHandler$requestPage$1(this, (ContinuationImpl) continuation);
        Object obj2 = mainFeedSearchPageRequestHandler$requestPage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainFeedSearchPageRequestHandler$requestPage$1.label;
        if (i != 0) {
        }
        ApiResult apiResult2 = (ApiResult) obj2;
        activitySearchResponse = (ActivitySearchResponse) (!(apiResult2 instanceof ApiResult.Success) ? ((ApiResult.Success) apiResult2).response : null);
        if (activitySearchResponse != null) {
        }
        return null;
    }

    public void resume(Runnable runnable) {
        a aVar;
        HashMap hashMap = (HashMap) this.c;
        runnable.getClass();
        if (isRunning(runnable) || (aVar = (a) hashMap.get(Integer.valueOf(runnable.hashCode()))) == null) {
            return;
        }
        long longValue = ((Number) ((PausableTimer$b) this.a).invoke()).longValue();
        long j = aVar.b;
        a aVar2 = new a(true, longValue, j);
        ((Handler) this.b).postDelayed(new r6$$ExternalSyntheticLambda0(8, runnable, this), aVar2, j);
        hashMap.put(Integer.valueOf(runnable.hashCode()), aVar2);
    }

    public void setAesKeyBytes(WireAdapter wireAdapter) {
        this.b = wireAdapter;
    }

    public void setIdRequirement(Integer num) {
        switch (this.$r8$classId) {
            case 6:
                this.c = num;
                break;
            case 7:
                this.c = num;
                break;
            case 8:
                this.c = num;
                break;
            case 9:
                this.c = num;
                break;
            case 10:
                this.c = num;
                break;
            default:
                this.c = num;
                break;
        }
    }

    public void setKeyBytes(WireAdapter wireAdapter) {
        switch (this.$r8$classId) {
            case 6:
                this.b = wireAdapter;
                break;
            case 7:
                this.b = wireAdapter;
                break;
            case 8:
                this.b = wireAdapter;
                break;
            case 9:
                this.b = wireAdapter;
                break;
            default:
                this.b = wireAdapter;
                break;
        }
    }

    public void setParameters(AesEaxParameters aesEaxParameters) {
        this.a = aesEaxParameters;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object showAppUpdateDialog(ContinuationImpl continuationImpl) {
        RealAppUpdateInboundNavigator$showAppUpdateDialog$1 realAppUpdateInboundNavigator$showAppUpdateDialog$1;
        Object obj;
        int i;
        zzw zzwVar;
        Navigator navigator = (Navigator) this.c;
        if (continuationImpl instanceof RealAppUpdateInboundNavigator$showAppUpdateDialog$1) {
            realAppUpdateInboundNavigator$showAppUpdateDialog$1 = (RealAppUpdateInboundNavigator$showAppUpdateDialog$1) continuationImpl;
            int i2 = realAppUpdateInboundNavigator$showAppUpdateDialog$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realAppUpdateInboundNavigator$showAppUpdateDialog$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = realAppUpdateInboundNavigator$showAppUpdateDialog$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realAppUpdateInboundNavigator$showAppUpdateDialog$1.label;
                AppUpdateDialogScreen appUpdateDialogScreen = AppUpdateDialogScreen.INSTANCE;
                int i3 = 1;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) this.b)).peekCurrentValue(LaunchDarklyFeatureFlags$UseAndroidAppUpdateManager.INSTANCE)).enabled()) {
                        navigator.goTo(appUpdateDialogScreen);
                        return Unit.INSTANCE;
                    }
                    RealPlayAppUpdateManager realPlayAppUpdateManager = (RealPlayAppUpdateManager) this.a;
                    realAppUpdateInboundNavigator$showAppUpdateDialog$1.label = 1;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(realAppUpdateInboundNavigator$showAppUpdateDialog$1));
                    cancellableContinuationImpl.initCancellability();
                    zzg zzgVar = realPlayAppUpdateManager.appUpdateManager;
                    zzr zzrVar = zzgVar.zza;
                    String packageName = zzgVar.zzc.getPackageName();
                    Obfuscator obfuscator = zzr.zzb;
                    zzx zzxVar = zzrVar.zza;
                    if (zzxVar == null) {
                        Object[] objArr = {-9};
                        obfuscator.getClass();
                        if (Log.isLoggable("PlayCore", 6)) {
                            Log.e("PlayCore", Obfuscator.zzf(obfuscator.salt, "onError(%d)", objArr));
                        }
                        zzwVar = Room.forException(new InstallException(-9));
                    } else {
                        obfuscator.zzd("requestUpdateInfo(%s)", packageName);
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        zzxVar.zzc().post(new zzm(zzxVar, taskCompletionSource, taskCompletionSource, new zzm(zzrVar, taskCompletionSource, packageName, taskCompletionSource)));
                        zzwVar = taskCompletionSource.zza;
                    }
                    JCAContext jCAContext = new JCAContext(new AndroidLocationSettingsChecker$check$2$1(cancellableContinuationImpl, 3), 15);
                    zzwVar.getClass();
                    AndroidMainExecutor androidMainExecutor = TaskExecutors.MAIN_THREAD;
                    zzwVar.addOnSuccessListener(androidMainExecutor, jCAContext);
                    zzwVar.addOnFailureListener(androidMainExecutor, new KotlinExtensions$awaitResponse$2$2(cancellableContinuationImpl, i3));
                    zzwVar.addOnCanceledListener(androidMainExecutor, new CredentialManager$createCredential$2$callback$1(cancellableContinuationImpl));
                    obj = cancellableContinuationImpl.getResult();
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
                if (((AppUpdateAvailability) obj) == AppUpdateAvailability.UPDATE_AVAILABLE) {
                    navigator.goTo(appUpdateDialogScreen);
                }
                return Unit.INSTANCE;
            }
        }
        realAppUpdateInboundNavigator$showAppUpdateDialog$1 = new RealAppUpdateInboundNavigator$showAppUpdateDialog$1(this, continuationImpl);
        obj = realAppUpdateInboundNavigator$showAppUpdateDialog$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAppUpdateInboundNavigator$showAppUpdateDialog$1.label;
        AppUpdateDialogScreen appUpdateDialogScreen2 = AppUpdateDialogScreen.INSTANCE;
        int i32 = 1;
        if (i != 0) {
        }
        if (((AppUpdateAvailability) obj) == AppUpdateAvailability.UPDATE_AVAILABLE) {
        }
        return Unit.INSTANCE;
    }

    public void start(Runnable runnable, long j) {
        Handler handler = (Handler) this.b;
        runnable.getClass();
        a aVar = new a(true, ((Number) ((PausableTimer$b) this.a).invoke()).longValue(), j);
        HashMap hashMap = (HashMap) this.c;
        a aVar2 = (a) hashMap.get(Integer.valueOf(runnable.hashCode()));
        if (aVar2 != null) {
            handler.removeCallbacksAndMessages(aVar2);
        }
        hashMap.put(Integer.valueOf(runnable.hashCode()), aVar);
        handler.postDelayed(new r6$$ExternalSyntheticLambda0(8, runnable, this), aVar, j);
    }

    public CardAppMessageViewModel.Ready toCardViewModel(CardMessage cardMessage, InAppMessage inAppMessage, String str, int i) {
        AppMessageImage asAppMessageImage;
        com.squareup.protos.cash.messagingplatformcommon.app.Image image;
        Animation animation;
        String str2 = cardMessage.message_title;
        ActionEvent.Os.Companion companion = cardMessage.visualAsset;
        if (str2 != null) {
            CardMessage$VisualAsset$Animation cardMessage$VisualAsset$Animation = companion instanceof CardMessage$VisualAsset$Animation ? (CardMessage$VisualAsset$Animation) companion : null;
            if (cardMessage$VisualAsset$Animation == null || (animation = cardMessage$VisualAsset$Animation.value) == null || (asAppMessageImage = CameraCaptureCallbacks.asAppMessageImage(animation)) == null) {
                CardMessage$VisualAsset$Image cardMessage$VisualAsset$Image = companion instanceof CardMessage$VisualAsset$Image ? (CardMessage$VisualAsset$Image) companion : null;
                asAppMessageImage = (cardMessage$VisualAsset$Image == null || (image = cardMessage$VisualAsset$Image.value) == null) ? null : CameraCaptureCallbacks.asAppMessageImage(image, false);
            }
            AppMessageAction appMessageAction = cardMessage.primary_navigation_action;
            if (appMessageAction != null) {
                String str3 = cardMessage.message_subtitle;
                return new CardAppMessageViewModel.Ready(str, asAppMessageImage, str2, Strings.emptyAsNull(str3 != null ? StringsKt__StringsJVMKt.replace$default(str3, "\u2028", "\n") : null), i, RealAppMessageActionPresenterHelper.viewModelActions(str, false, appMessageAction, null), new OnDemandMessageAnalyticsData(inAppMessage.campaign_token, inAppMessage.template_token, inAppMessage.template_version, inAppMessage.product_types, OnDemandMessageAnalyticsData.Format.CARD));
            }
        }
        return null;
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 14:
                StringBuilder sb = new StringBuilder();
                Iterator it = ((ArrayList) this.a).iterator();
                MinimalEncoder$ResultList$ResultNode minimalEncoder$ResultList$ResultNode = null;
                while (it.hasNext()) {
                    MinimalEncoder$ResultList$ResultNode minimalEncoder$ResultList$ResultNode2 = (MinimalEncoder$ResultList$ResultNode) it.next();
                    if (minimalEncoder$ResultList$ResultNode != null) {
                        sb.append(",");
                    }
                    sb.append(minimalEncoder$ResultList$ResultNode2.toString());
                    minimalEncoder$ResultList$ResultNode = minimalEncoder$ResultList$ResultNode2;
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public boolean validDecade(char c) {
        int i = c - '0';
        int i2 = ((Calendar) this.b).get(1);
        int i3 = ((i2 % 100) - (i2 % 10)) / 10;
        return i >= i3 && i <= i3 + 5;
    }

    @Override // com.google.android.play.core.splitcompat.zzl
    public void zza(com.google.android.play.core.splitcompat.zzm zzmVar, File file, boolean z) {
        ((HashSet) this.a).add(file);
        if (z) {
            return;
        }
        zzb zzbVar = (zzb) this.b;
        String str = zzbVar.zzb;
        String str2 = zzmVar.zza;
        ZipEntry zipEntry = zzmVar.zzb;
        String absolutePath = zzbVar.zza.getAbsolutePath();
        String name = zipEntry.getName();
        String absolutePath2 = file.getAbsolutePath();
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NativeLibraryExtractor: split '", str, "' has native library '", str2, "' that does not exist; extracting from '");
        Boxes$$ExternalSyntheticOutline1.m(m, absolutePath, "!", name, "' to '");
        m.append(absolutePath2);
        m.append("'");
        Log.i("SplitCompat", m.toString());
        ZipFile zipFile = (ZipFile) this.c;
        byte[] bArr = new byte[4096];
        if (file.exists()) {
            file.delete();
        }
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                file.setWritable(false, true);
                file.setWritable(false, false);
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        fileOutputStream.close();
                        inputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
            }
            throw th;
        }
    }

    public Object zzc() {
        Object obj = this.a;
        Field field = (Field) this.b;
        Class cls = (Class) this.c;
        try {
            return cls.cast(field.get(obj));
        } catch (Exception e) {
            String name = field.getName();
            String name2 = obj.getClass().getName();
            String name3 = cls.getName();
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to get value of field ", name, " of type ", name2, " on object of type ");
            m.append(name3);
            throw new zzbl(m.toString(), e);
        }
    }

    public void zze(Object obj) {
        Object obj2 = this.a;
        Field field = (Field) this.b;
        try {
            field.set(obj2, obj);
        } catch (Exception e) {
            String name = field.getName();
            String name2 = obj2.getClass().getName();
            String name3 = ((Class) this.c).getName();
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to set value of field ", name, " of type ", name2, " on object of type ");
            m.append(name3);
            throw new zzbl(m.toString(), e);
        }
    }

    public void setParameters(AesGcmParameters aesGcmParameters) {
        this.a = aesGcmParameters;
    }

    public void setParameters(AesGcmSivParameters aesGcmSivParameters) {
        this.a = aesGcmSivParameters;
    }

    public void setParameters(HmacParameters hmacParameters) {
        this.a = hmacParameters;
    }

    public void setParameters(AesSivParameters aesSivParameters) {
        this.a = aesSivParameters;
    }

    public void setParameters(AesCmacParameters aesCmacParameters) {
        this.a = aesCmacParameters;
    }

    @Override // com.google.android.play.core.splitcompat.zzk
    public void zza(ZipFile zipFile, HashSet hashSet) {
        HashSet hashSet2 = (HashSet) this.a;
        zzn zznVar = (zzn) this.c;
        zzb zzbVar = (zzb) this.b;
        HashSet hashSet3 = new HashSet();
        zznVar.zzf(zzbVar, hashSet, new n(2, hashSet3, zzbVar, zipFile));
        hashSet2.addAll(hashSet3);
    }

    public AesEaxKey build() {
        WireAdapter wireAdapter;
        Bytes tinkOutputPrefix;
        AesEaxParameters aesEaxParameters = (AesEaxParameters) this.a;
        if (aesEaxParameters != null && (wireAdapter = (WireAdapter) this.b) != null) {
            if (aesEaxParameters.keySizeBytes == ((Bytes) wireAdapter.adapter).data.length) {
                if (aesEaxParameters.hasIdRequirement() && ((Integer) this.c) == null) {
                    a$$ExternalSyntheticBUOutline0.m$6("Cannot create key without ID requirement with parameters with ID requirement");
                    return null;
                }
                if (!((AesEaxParameters) this.a).hasIdRequirement() && ((Integer) this.c) != null) {
                    a$$ExternalSyntheticBUOutline0.m$6("Cannot create key with ID requirement with parameters without ID requirement");
                    return null;
                }
                AesEaxParameters.Variant variant = ((AesEaxParameters) this.a).variant;
                if (variant == AesEaxParameters.Variant.NO_PREFIX) {
                    tinkOutputPrefix = OutputPrefixUtil.EMPTY_PREFIX;
                } else if (variant == AesEaxParameters.Variant.CRUNCHY) {
                    tinkOutputPrefix = OutputPrefixUtil.getLegacyOutputPrefix(((Integer) this.c).intValue());
                } else if (variant == AesEaxParameters.Variant.TINK) {
                    tinkOutputPrefix = OutputPrefixUtil.getTinkOutputPrefix(((Integer) this.c).intValue());
                } else {
                    a$$ExternalSyntheticBUOutline0.m$2(((AesEaxParameters) this.a).variant, "Unknown AesEaxParameters.Variant: ");
                    return null;
                }
                return new AesEaxKey((AesEaxParameters) this.a, (WireAdapter) this.b, tinkOutputPrefix, (Integer) this.c);
            }
            a$$ExternalSyntheticBUOutline0.m$6("Key size mismatch");
            return null;
        }
        a$$ExternalSyntheticBUOutline0.m$6("Cannot build without parameters and/or key material");
        return null;
    }

    /* renamed from: build, reason: collision with other method in class */
    public AesGcmKey m2159build() {
        WireAdapter wireAdapter;
        Bytes tinkOutputPrefix;
        AesGcmParameters aesGcmParameters = (AesGcmParameters) this.a;
        if (aesGcmParameters != null && (wireAdapter = (WireAdapter) this.b) != null) {
            if (aesGcmParameters.keySizeBytes == ((Bytes) wireAdapter.adapter).data.length) {
                if (aesGcmParameters.hasIdRequirement() && ((Integer) this.c) == null) {
                    a$$ExternalSyntheticBUOutline0.m$6("Cannot create key without ID requirement with parameters with ID requirement");
                    return null;
                }
                if (!((AesGcmParameters) this.a).hasIdRequirement() && ((Integer) this.c) != null) {
                    a$$ExternalSyntheticBUOutline0.m$6("Cannot create key with ID requirement with parameters without ID requirement");
                    return null;
                }
                AesEaxParameters.Variant variant = ((AesGcmParameters) this.a).variant;
                if (variant == AesEaxParameters.Variant.NO_PREFIX$2) {
                    tinkOutputPrefix = OutputPrefixUtil.EMPTY_PREFIX;
                } else if (variant == AesEaxParameters.Variant.CRUNCHY$2) {
                    tinkOutputPrefix = OutputPrefixUtil.getLegacyOutputPrefix(((Integer) this.c).intValue());
                } else if (variant == AesEaxParameters.Variant.TINK$2) {
                    tinkOutputPrefix = OutputPrefixUtil.getTinkOutputPrefix(((Integer) this.c).intValue());
                } else {
                    a$$ExternalSyntheticBUOutline0.m$2(((AesGcmParameters) this.a).variant, "Unknown AesGcmParameters.Variant: ");
                    return null;
                }
                return new AesGcmKey((AesGcmParameters) this.a, (WireAdapter) this.b, tinkOutputPrefix, (Integer) this.c);
            }
            a$$ExternalSyntheticBUOutline0.m$6("Key size mismatch");
            return null;
        }
        a$$ExternalSyntheticBUOutline0.m$6("Cannot build without parameters and/or key material");
        return null;
    }

    /* renamed from: build, reason: collision with other method in class */
    public AesGcmSivKey m2160build() {
        WireAdapter wireAdapter;
        Bytes tinkOutputPrefix;
        AesGcmSivParameters aesGcmSivParameters = (AesGcmSivParameters) this.a;
        if (aesGcmSivParameters != null && (wireAdapter = (WireAdapter) this.b) != null) {
            if (aesGcmSivParameters.keySizeBytes == ((Bytes) wireAdapter.adapter).data.length) {
                if (aesGcmSivParameters.hasIdRequirement() && ((Integer) this.c) == null) {
                    a$$ExternalSyntheticBUOutline0.m$6("Cannot create key without ID requirement with parameters with ID requirement");
                    return null;
                }
                if (!((AesGcmSivParameters) this.a).hasIdRequirement() && ((Integer) this.c) != null) {
                    a$$ExternalSyntheticBUOutline0.m$6("Cannot create key with ID requirement with parameters without ID requirement");
                    return null;
                }
                AesEaxParameters.Variant variant = ((AesGcmSivParameters) this.a).variant;
                if (variant == AesEaxParameters.Variant.NO_PREFIX$3) {
                    tinkOutputPrefix = OutputPrefixUtil.EMPTY_PREFIX;
                } else if (variant == AesEaxParameters.Variant.CRUNCHY$3) {
                    tinkOutputPrefix = OutputPrefixUtil.getLegacyOutputPrefix(((Integer) this.c).intValue());
                } else if (variant == AesEaxParameters.Variant.TINK$3) {
                    tinkOutputPrefix = OutputPrefixUtil.getTinkOutputPrefix(((Integer) this.c).intValue());
                } else {
                    a$$ExternalSyntheticBUOutline0.m$2(((AesGcmSivParameters) this.a).variant, "Unknown AesGcmSivParameters.Variant: ");
                    return null;
                }
                return new AesGcmSivKey((AesGcmSivParameters) this.a, (WireAdapter) this.b, tinkOutputPrefix, (Integer) this.c);
            }
            a$$ExternalSyntheticBUOutline0.m$6("Key size mismatch");
            return null;
        }
        a$$ExternalSyntheticBUOutline0.m$6("Cannot build without parameters and/or key material");
        return null;
    }

    /* renamed from: build, reason: collision with other method in class */
    public AesSivKey m2161build() {
        WireAdapter wireAdapter;
        Bytes tinkOutputPrefix;
        AesSivParameters aesSivParameters = (AesSivParameters) this.a;
        if (aesSivParameters != null && (wireAdapter = (WireAdapter) this.b) != null) {
            if (aesSivParameters.keySizeBytes == ((Bytes) wireAdapter.adapter).data.length) {
                if (aesSivParameters.hasIdRequirement() && ((Integer) this.c) == null) {
                    a$$ExternalSyntheticBUOutline0.m$6("Cannot create key without ID requirement with parameters with ID requirement");
                    return null;
                }
                if (!((AesSivParameters) this.a).hasIdRequirement() && ((Integer) this.c) != null) {
                    a$$ExternalSyntheticBUOutline0.m$6("Cannot create key with ID requirement with parameters without ID requirement");
                    return null;
                }
                AesSivParameters.Variant variant = ((AesSivParameters) this.a).variant;
                if (variant == AesSivParameters.Variant.NO_PREFIX) {
                    tinkOutputPrefix = OutputPrefixUtil.EMPTY_PREFIX;
                } else if (variant == AesSivParameters.Variant.CRUNCHY) {
                    tinkOutputPrefix = OutputPrefixUtil.getLegacyOutputPrefix(((Integer) this.c).intValue());
                } else if (variant == AesSivParameters.Variant.TINK) {
                    tinkOutputPrefix = OutputPrefixUtil.getTinkOutputPrefix(((Integer) this.c).intValue());
                } else {
                    a$$ExternalSyntheticBUOutline0.m$2(((AesSivParameters) this.a).variant, "Unknown AesSivParameters.Variant: ");
                    return null;
                }
                return new AesSivKey((AesSivParameters) this.a, (WireAdapter) this.b, tinkOutputPrefix, (Integer) this.c);
            }
            a$$ExternalSyntheticBUOutline0.m$6("Key size mismatch");
            return null;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Cannot build without parameters and/or key material");
        return null;
    }

    /* renamed from: build, reason: collision with other method in class */
    public AesCmacKey m2162build() {
        WireAdapter wireAdapter;
        Bytes legacyOutputPrefix;
        AesCmacParameters aesCmacParameters = (AesCmacParameters) this.a;
        if (aesCmacParameters != null && (wireAdapter = (WireAdapter) this.b) != null) {
            if (aesCmacParameters.keySizeBytes == ((Bytes) wireAdapter.adapter).data.length) {
                if (aesCmacParameters.hasIdRequirement() && ((Integer) this.c) == null) {
                    a$$ExternalSyntheticBUOutline0.m$6("Cannot create key without ID requirement with parameters with ID requirement");
                    return null;
                }
                if (!((AesCmacParameters) this.a).hasIdRequirement() && ((Integer) this.c) != null) {
                    a$$ExternalSyntheticBUOutline0.m$6("Cannot create key with ID requirement with parameters without ID requirement");
                    return null;
                }
                AesCmacParameters.Variant variant = ((AesCmacParameters) this.a).variant;
                if (variant == AesCmacParameters.Variant.NO_PREFIX) {
                    legacyOutputPrefix = OutputPrefixUtil.EMPTY_PREFIX;
                } else if (variant != AesCmacParameters.Variant.LEGACY && variant != AesCmacParameters.Variant.CRUNCHY) {
                    if (variant == AesCmacParameters.Variant.TINK) {
                        legacyOutputPrefix = OutputPrefixUtil.getTinkOutputPrefix(((Integer) this.c).intValue());
                    } else {
                        a$$ExternalSyntheticBUOutline0.m$2(((AesCmacParameters) this.a).variant, "Unknown AesCmacParametersParameters.Variant: ");
                        return null;
                    }
                } else {
                    legacyOutputPrefix = OutputPrefixUtil.getLegacyOutputPrefix(((Integer) this.c).intValue());
                }
                return new AesCmacKey((AesCmacParameters) this.a, (WireAdapter) this.b, legacyOutputPrefix, (Integer) this.c);
            }
            a$$ExternalSyntheticBUOutline0.m$6("Key size mismatch");
            return null;
        }
        a$$ExternalSyntheticBUOutline0.m$6("Cannot build without parameters and/or key material");
        return null;
    }

    public /* synthetic */ n(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ n(int i, boolean z) {
        this.$r8$classId = i;
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public n(zzn zznVar, HashSet hashSet, zzb zzbVar) {
        this.$r8$classId = 1;
        this.c = zznVar;
        this.a = hashSet;
        this.b = zzbVar;
    }

    public n() {
        this.$r8$classId = 15;
        Looper mainLooper = Looper.getMainLooper();
        mainLooper.getClass();
        this.a = PausableTimer$b.a;
        this.b = new Handler(mainLooper);
        this.c = new HashMap();
    }

    public n(Executor executor) {
        this.$r8$classId = 0;
        this.a = executor;
    }

    public n(CashApProxyClientService cashApProxyClientService, AndroidStringManager androidStringManager) {
        this.$r8$classId = 29;
        this.a = cashApProxyClientService;
        this.b = androidStringManager;
        this.c = PapaEvent.Channel$default(-1, null, null, 6);
    }

    public n(Calendar calendar) {
        this.$r8$classId = 16;
        calendar.getClass();
        this.a = new SimpleDateFormat("MMyyyy", Locale.US);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        this.b = calendar;
        Object clone = calendar.clone();
        clone.getClass();
        Calendar calendar2 = (Calendar) clone;
        calendar2.add(1, 50);
        this.c = calendar2;
    }

    public n(RealPlayAppUpdateManager realPlayAppUpdateManager, FeatureFlagManager featureFlagManager, Navigator navigator) {
        this.$r8$classId = 20;
        navigator.getClass();
        this.a = realPlayAppUpdateManager;
        this.b = featureFlagManager;
        this.c = navigator;
    }

    public n(ActivityClientService activityClientService, ActivityAnalyticsService activityAnalyticsService) {
        this.$r8$classId = 18;
        this.a = activityClientService;
        this.b = activityAnalyticsService;
        this.c = "";
    }

    public n(InAppMessageService inAppMessageService, RealAppMessageActionPresenterHelper realAppMessageActionPresenterHelper, AndroidClock androidClock, CoroutineContext coroutineContext) {
        this.$r8$classId = 19;
        this.a = inAppMessageService;
        this.b = androidClock;
        this.c = coroutineContext;
    }

    public n(FirebaseMessagingService firebaseMessagingService, ParametersBuilder parametersBuilder, ExecutorService executorService) {
        this.$r8$classId = 13;
        this.a = executorService;
        this.b = firebaseMessagingService;
        this.c = parametersBuilder;
    }

    public /* synthetic */ n(int i) {
        this.$r8$classId = i;
    }
}
