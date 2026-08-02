package com.squareup.cash.launcher;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.core.content.FileProvider;
import androidx.room.CoroutinesRoom;
import app.cash.cdp.backend.android.AndroidDeviceInfoProvider;
import app.cash.local.navigation.launcher.RealLocalLauncher;
import coil3.RealImageLoader;
import com.miteksystems.misnap.core.LiveDataUtil;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cash.advertising.views.AdUiFactory;
import com.squareup.cash.afterpayapplet.applets.presenters.RealAfterpayAppletAvailabilityStateManager;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository;
import com.squareup.cash.banking.backend.real.RealBankingOptionBadgeUpdater;
import com.squareup.cash.biometrics.AndroidSecureStore;
import com.squareup.cash.bitcoin.views.deposits.BitcoinDepositNoteScreenView$Factory$Impl;
import com.squareup.cash.boost.backend.BoostBackendModule$Companion$bindBoostSignOutAction$1;
import com.squareup.cash.borrow.applets.presenters.RealBorrowAppletRepository;
import com.squareup.cash.borrow.backend.RealBorrowDataManager;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.validation.CashAppLiteRouteAllowlistProvider;
import com.squareup.cash.contacts.photo.ContactPhotoResolver;
import com.squareup.cash.data.contacts.RealContactSync;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.profile.RealReferralManager;
import com.squareup.cash.education.stories.presenters.EducationStoryPresenter$Factory$Impl;
import com.squareup.cash.education.stories.presenters.EducationStoryViewPagerPresenter$Factory$Impl;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.investing.presenters.stockdetails.LastSelectedRange;
import com.squareup.cash.money.presenters.MoneyPresenterFactory;
import com.squareup.cash.nearby.backend.ble.RealBleManager;
import com.squareup.cash.payments.backend.api.PaymentManager;
import com.squareup.cash.payments.common.RealPaymentListener;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.permissions.PermissionChecker;
import com.squareup.cash.securitysignals.backend.RealScreenRecordingDetector;
import com.squareup.cash.securitysignals.backend.RealSecuritySignalsAggregator;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.cash.storage.StorageLink;
import com.squareup.cash.support.backend.real.RealSupportPhoneService;
import com.squareup.cash.util.cache.Cache;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.supportal.app.SupportalAppService;
import com.squareup.protos.cash.unicorn.service.UnicornService;
import com.squareup.util.android.AndroidAudioManager;
import com.squareup.util.android.Intents;
import com.squareup.util.android.RealIntentFactory;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.io.File;
import java.net.URI;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import net.oneformapp.helper.HelperFunctions;

/* loaded from: classes.dex */
public final class IntentLauncher {
    public final Activity activity;
    public final RealIntentFactory intentFactory;

    public IntentLauncher(Activity activity, RealIntentFactory realIntentFactory) {
        this.activity = activity;
        this.intentFactory = realIntentFactory;
    }

    public final boolean launchAppLink(String str, String str2) {
        String scheme;
        str.getClass();
        str2.getClass();
        Uri parse = Uri.parse(str);
        String scheme2 = parse.getScheme();
        int i = 0;
        RealIntentFactory realIntentFactory = this.intentFactory;
        Activity activity = this.activity;
        if ((scheme2 == null || !scheme2.equals("http")) && ((scheme = parse.getScheme()) == null || !scheme.equals("https"))) {
            Intent addCategory = new Intent("android.intent.action.VIEW", Uri.parse(realIntentFactory.authenticatedUrls(str).getRawUrl())).addCategory("android.intent.category.BROWSABLE");
            addCategory.getClass();
            return Intents.maybeStartActivity(activity, addCategory, new IntentLauncher$$ExternalSyntheticLambda0(i, this, str2));
        }
        if (activity.getPackageManager().getLaunchIntentForPackage(str2) == null) {
            return launchPlayStore(str2);
        }
        Intent addCategory2 = new Intent("android.intent.action.VIEW", Uri.parse(realIntentFactory.authenticatedUrls(str).getRawUrl())).addCategory("android.intent.category.BROWSABLE");
        addCategory2.getClass();
        return Intents.maybeStartActivity(activity, addCategory2, new IntentLauncher$$ExternalSyntheticLambda0(i, this, str2));
    }

    public final boolean launchMap(String str, double d, double d2) {
        boolean maybeStartActivity;
        Uri.Builder appendPath = new Uri.Builder().scheme("geo").appendPath(d + "," + d2);
        if (str != null && str.length() != 0) {
            appendPath.appendQueryParameter("q", str);
        }
        maybeStartActivity = Intents.maybeStartActivity(r2, new Intent("android.intent.action.VIEW", appendPath.build()), new CameraX$$ExternalSyntheticLambda0(this.activity, 12));
        return maybeStartActivity;
    }

    public final void launchNotificationSettings() {
        Activity activity = this.activity;
        String packageName = activity.getPackageName();
        packageName.getClass();
        Intent putExtra = new Intent("android.settings.APP_NOTIFICATION_SETTINGS").addFlags(268435456).putExtra("android.provider.extra.APP_PACKAGE", packageName);
        putExtra.getClass();
        Intents.maybeStartActivity(activity, putExtra, new CameraX$$ExternalSyntheticLambda0(activity, 12));
    }

    public final boolean launchPlayStore(String str) {
        str.getClass();
        return launchUrlInInternalBrowser("https://play.google.com/store/apps/details?id=" + str);
    }

    public final void launchSettings() {
        Activity activity = this.activity;
        String packageName = activity.getPackageName();
        packageName.getClass();
        Intents.maybeStartActivity(activity, new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", packageName, null)), new CameraX$$ExternalSyntheticLambda0(activity, 12));
    }

    public final void launchUrlInExternalApp(String str) {
        str.getClass();
        Intents.maybeStartActivity(r2, new Intent("android.intent.action.VIEW", Uri.parse(this.intentFactory.authenticatedUrls(str).getRawUrl())), new CameraX$$ExternalSyntheticLambda0(this.activity, 12));
    }

    public final void launchUrlInExternalBrowser(String str) {
        ActivityInfo activityInfo;
        str.getClass();
        RealIntentFactory realIntentFactory = this.intentFactory;
        ResolveInfo resolveActivity = realIntentFactory.context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.google.com")), 65536);
        String str2 = (resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null) ? null : activityInfo.packageName;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(realIntentFactory.authenticatedUrls(str).getRawUrl()));
        intent.setPackage(str2);
        intent.addCategory("android.intent.category.BROWSABLE");
        Intents.maybeStartActivity(r5, intent, new CameraX$$ExternalSyntheticLambda0(this.activity, 12));
    }

    public final boolean launchUrlInInternalBrowser(String str) {
        str.getClass();
        return this.intentFactory.maybeStartUrlIntent(str, this.activity, true);
    }

    public final void sendEmail(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.SUBJECT", str);
        intent.putExtra("android.intent.extra.TEXT", str2);
        if (str3 != null) {
            intent.putExtra("android.intent.extra.STREAM", Uri.parse(str3));
        }
        intent.addFlags(1);
        Intent intent2 = new Intent("android.intent.action.SENDTO");
        intent2.setData(Uri.parse("mailto:"));
        intent.setSelector(intent2);
        Intent createChooser = Intent.createChooser(intent, null);
        createChooser.getClass();
        Intents.maybeStartActivity(r2, createChooser, new CameraX$$ExternalSyntheticLambda0(this.activity, 12));
    }

    public final void sendSms(String str, String str2) {
        str.getClass();
        str2.getClass();
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:".concat(str2)));
        intent.putExtra("sms_body", str);
        Intents.maybeStartActivity(r2, intent, new CameraX$$ExternalSyntheticLambda0(this.activity, 12));
    }

    public final boolean shareText(String str, String str2, String str3) {
        boolean maybeStartActivity;
        str.getClass();
        maybeStartActivity = Intents.maybeStartActivity(r1, this.intentFactory.createTextIntent(str, str2, str3), new CameraX$$ExternalSyntheticLambda0(this.activity, 12));
        return maybeStartActivity;
    }

    public final boolean viewData(String str, boolean z) {
        String str2;
        Uri parse;
        boolean maybeStartActivity;
        str.getClass();
        RealIntentFactory realIntentFactory = this.intentFactory;
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl == null || (str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl)) == null) {
            str2 = "*/*";
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        if (z) {
            Context context = realIntentFactory.context;
            parse = FileProvider.getUriForFile(context, Recorder$$ExternalSyntheticOutline2.m$1(context.getApplicationContext().getPackageName(), ".fileprovider"), new File(URI.create(str)));
        } else {
            parse = Uri.parse(str);
        }
        intent.setDataAndType(parse, str2);
        intent.addFlags(1);
        Intent createChooser = Intent.createChooser(intent, null);
        createChooser.getClass();
        maybeStartActivity = Intents.maybeStartActivity(r4, createChooser, new CameraX$$ExternalSyntheticLambda0(this.activity, 12));
        return maybeStartActivity;
    }

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final InstanceFactory activity;
        public final Provider intentFactory;

        public /* synthetic */ MetroFactory(int i, DoubleCheck doubleCheck, InstanceFactory instanceFactory) {
            this.$r8$classId = i;
            this.activity = instanceFactory;
            this.intentFactory = doubleCheck;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            int i2 = 3;
            InstanceFactory instanceFactory = this.activity;
            Provider provider = this.intentFactory;
            switch (i) {
                case 0:
                    Activity activity = (Activity) instanceFactory.value;
                    RealIntentFactory realIntentFactory = (RealIntentFactory) provider.invoke();
                    activity.getClass();
                    realIntentFactory.getClass();
                    return new IntentLauncher(activity, realIntentFactory);
                case 1:
                    Context context = (Context) instanceFactory.value;
                    String str = (String) provider.invoke();
                    context.getClass();
                    str.getClass();
                    return new AndroidDeviceInfoProvider(context, str);
                case 2:
                    CoroutinesRoom.Companion companion = new CoroutinesRoom.Companion(15);
                    RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) provider.invoke();
                    Activity activity2 = (Activity) instanceFactory.value;
                    realRouter$Factory$Impl.getClass();
                    activity2.getClass();
                    return new RealLocalLauncher(companion, realRouter$Factory$Impl, activity2);
                case 3:
                    KeyValue keyValue = (KeyValue) provider.invoke();
                    StorageLink storageLink = (StorageLink) instanceFactory.value;
                    keyValue.getClass();
                    storageLink.getClass();
                    return new BoostBackendModule$Companion$bindBoostSignOutAction$1(1, storageLink, keyValue);
                case 4:
                    RealImageLoader realImageLoader = (RealImageLoader) provider.invoke();
                    Flow flow = (Flow) instanceFactory.value;
                    realImageLoader.getClass();
                    flow.getClass();
                    return new AdUiFactory(realImageLoader, flow, 0);
                case 5:
                    RealAfterpayAppletRepository realAfterpayAppletRepository = (RealAfterpayAppletRepository) provider.invoke();
                    CoroutineScope coroutineScope = (CoroutineScope) instanceFactory.value;
                    realAfterpayAppletRepository.getClass();
                    coroutineScope.getClass();
                    return new RealAfterpayAppletAvailabilityStateManager(realAfterpayAppletRepository, coroutineScope);
                case 6:
                    UnicornService unicornService = (UnicornService) provider.invoke();
                    CoroutineScope coroutineScope2 = (CoroutineScope) instanceFactory.value;
                    unicornService.getClass();
                    coroutineScope2.getClass();
                    return new RealBankingOptionBadgeUpdater(unicornService, coroutineScope2);
                case 7:
                    AndroidSecureStore androidSecureStore = (AndroidSecureStore) provider.invoke();
                    StorageLink storageLink2 = (StorageLink) instanceFactory.value;
                    androidSecureStore.getClass();
                    storageLink2.getClass();
                    return new BoostBackendModule$Companion$bindBoostSignOutAction$1(2, storageLink2, androidSecureStore);
                case 8:
                    BitcoinDepositNoteScreenView$Factory$Impl bitcoinDepositNoteScreenView$Factory$Impl = (BitcoinDepositNoteScreenView$Factory$Impl) instanceFactory.value;
                    RealImageLoader realImageLoader2 = (RealImageLoader) provider.invoke();
                    bitcoinDepositNoteScreenView$Factory$Impl.getClass();
                    realImageLoader2.getClass();
                    return new AdUiFactory(bitcoinDepositNoteScreenView$Factory$Impl, realImageLoader2);
                case 9:
                    RealBorrowDataManager realBorrowDataManager = (RealBorrowDataManager) provider.invoke();
                    CoroutineScope coroutineScope3 = (CoroutineScope) instanceFactory.value;
                    realBorrowDataManager.getClass();
                    coroutineScope3.getClass();
                    return new RealBorrowAppletRepository(realBorrowDataManager, coroutineScope3);
                case 10:
                    AppConfigManager appConfigManager = (AppConfigManager) provider.invoke();
                    CoroutineScope coroutineScope4 = (CoroutineScope) instanceFactory.value;
                    appConfigManager.getClass();
                    coroutineScope4.getClass();
                    return new CashAppLiteRouteAllowlistProvider(appConfigManager, coroutineScope4);
                case 11:
                    Context context2 = (Context) instanceFactory.value;
                    PermissionChecker permissionChecker = (PermissionChecker) provider.invoke();
                    context2.getClass();
                    permissionChecker.getClass();
                    return new ContactPhotoResolver(context2, permissionChecker);
                case 12:
                    RealContactSync realContactSync = (RealContactSync) provider.invoke();
                    StorageLink storageLink3 = (StorageLink) instanceFactory.value;
                    realContactSync.getClass();
                    storageLink3.getClass();
                    return new BoostBackendModule$Companion$bindBoostSignOutAction$1(i2, storageLink3, realContactSync);
                case 13:
                    RealReferralManager realReferralManager = (RealReferralManager) provider.invoke();
                    StorageLink storageLink4 = (StorageLink) instanceFactory.value;
                    realReferralManager.getClass();
                    storageLink4.getClass();
                    return new BoostBackendModule$Companion$bindBoostSignOutAction$1(4, storageLink4, realReferralManager);
                case 14:
                    RealFeatureEligibilityRepository realFeatureEligibilityRepository = (RealFeatureEligibilityRepository) provider.invoke();
                    CoroutineScope coroutineScope5 = (CoroutineScope) instanceFactory.value;
                    realFeatureEligibilityRepository.getClass();
                    coroutineScope5.getClass();
                    return new JCAContext(realFeatureEligibilityRepository, coroutineScope5);
                case 15:
                    EducationStoryPresenter$Factory$Impl educationStoryPresenter$Factory$Impl = (EducationStoryPresenter$Factory$Impl) provider.invoke();
                    EducationStoryViewPagerPresenter$Factory$Impl educationStoryViewPagerPresenter$Factory$Impl = (EducationStoryViewPagerPresenter$Factory$Impl) instanceFactory.value;
                    educationStoryPresenter$Factory$Impl.getClass();
                    educationStoryViewPagerPresenter$Factory$Impl.getClass();
                    return new MoneyPresenterFactory(i2, educationStoryPresenter$Factory$Impl, educationStoryViewPagerPresenter$Factory$Impl);
                case 16:
                    Flow flow2 = (Flow) provider.invoke();
                    CoroutineScope coroutineScope6 = (CoroutineScope) instanceFactory.value;
                    flow2.getClass();
                    coroutineScope6.getClass();
                    return new Cache(flow2, coroutineScope6);
                case 17:
                    Flow flow3 = (Flow) provider.invoke();
                    CoroutineScope coroutineScope7 = (CoroutineScope) instanceFactory.value;
                    flow3.getClass();
                    coroutineScope7.getClass();
                    return HelperFunctions.filterConfigurationCacheForCategoryDetail(flow3, coroutineScope7);
                case 18:
                    Flow flow4 = (Flow) provider.invoke();
                    CoroutineScope coroutineScope8 = (CoroutineScope) instanceFactory.value;
                    flow4.getClass();
                    coroutineScope8.getClass();
                    return HelperFunctions.provideInvestingViewModelCache(flow4, coroutineScope8);
                case 19:
                    Flow flow5 = (Flow) provider.invoke();
                    CoroutineScope coroutineScope9 = (CoroutineScope) instanceFactory.value;
                    flow5.getClass();
                    coroutineScope9.getClass();
                    return HelperFunctions.rangeSelectionCacheForStock(flow5, coroutineScope9);
                case 20:
                    Flow flow6 = (Flow) provider.invoke();
                    CoroutineScope coroutineScope10 = (CoroutineScope) instanceFactory.value;
                    flow6.getClass();
                    coroutineScope10.getClass();
                    return LiveDataUtil.historicalRangeCache(flow6, coroutineScope10);
                case 21:
                    Flow flow7 = (Flow) provider.invoke();
                    CoroutineScope coroutineScope11 = (CoroutineScope) instanceFactory.value;
                    flow7.getClass();
                    coroutineScope11.getClass();
                    return LiveDataUtil.selectHistoricalRangeCache(flow7, coroutineScope11);
                case 22:
                    Flow flow8 = (Flow) provider.invoke();
                    CoroutineScope coroutineScope12 = (CoroutineScope) instanceFactory.value;
                    flow8.getClass();
                    coroutineScope12.getClass();
                    return LiveDataUtil.selectedPriceCache(flow8, coroutineScope12);
                case 23:
                    Flow flow9 = (Flow) provider.invoke();
                    CoroutineScope coroutineScope13 = (CoroutineScope) instanceFactory.value;
                    flow9.getClass();
                    coroutineScope13.getClass();
                    return LiveDataUtil.topSearchFilterConfigurationCache(flow9, coroutineScope13);
                case 24:
                    Flow flow10 = (Flow) provider.invoke();
                    CoroutineScope coroutineScope14 = (CoroutineScope) instanceFactory.value;
                    flow10.getClass();
                    coroutineScope14.getClass();
                    return new LastSelectedRange(flow10, coroutineScope14);
                case 25:
                    AndroidPermissionManager androidPermissionManager = (AndroidPermissionManager) provider.invoke();
                    Activity activity3 = (Activity) instanceFactory.value;
                    androidPermissionManager.getClass();
                    activity3.getClass();
                    return new RealBleManager(androidPermissionManager, activity3);
                case 26:
                    PaymentManager paymentManager = (PaymentManager) provider.invoke();
                    CoroutineScope coroutineScope15 = (CoroutineScope) instanceFactory.value;
                    paymentManager.getClass();
                    coroutineScope15.getClass();
                    return new RealPaymentListener(paymentManager, coroutineScope15);
                case 27:
                    AndroidAudioManager androidAudioManager = (AndroidAudioManager) provider.invoke();
                    RealScreenRecordingDetector realScreenRecordingDetector = (RealScreenRecordingDetector) instanceFactory.value;
                    androidAudioManager.getClass();
                    realScreenRecordingDetector.getClass();
                    return new RealSecuritySignalsAggregator(androidAudioManager, realScreenRecordingDetector);
                case 28:
                    RealFileDownloader realFileDownloader = (RealFileDownloader) provider.invoke();
                    StorageLink storageLink5 = (StorageLink) instanceFactory.value;
                    realFileDownloader.getClass();
                    storageLink5.getClass();
                    return new BoostBackendModule$Companion$bindBoostSignOutAction$1(5, storageLink5, realFileDownloader);
                default:
                    SupportalAppService supportalAppService = (SupportalAppService) provider.invoke();
                    CoroutineScope coroutineScope16 = (CoroutineScope) instanceFactory.value;
                    supportalAppService.getClass();
                    coroutineScope16.getClass();
                    return new RealSupportPhoneService(supportalAppService, coroutineScope16);
            }
        }

        public /* synthetic */ MetroFactory(Provider provider, InstanceFactory instanceFactory, int i) {
            this.$r8$classId = i;
            this.intentFactory = provider;
            this.activity = instanceFactory;
        }
    }
}
