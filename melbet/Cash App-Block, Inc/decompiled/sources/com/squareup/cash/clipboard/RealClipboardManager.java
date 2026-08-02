package com.squareup.cash.clipboard;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.room.Room;
import com.google.crypto.tink.KeysetHandle;
import com.google.mlkit.vision.text.zzd;
import com.squareup.cash.cashapplite.CashAppLiteReleaseModule$$ExternalSyntheticLambda0;
import com.squareup.cash.clientsync.errors.RealClientSyncErrorReporter;
import com.squareup.cash.clientsync.persistence.SqlClientSyncTransactor;
import com.squareup.cash.clientsync.persistence.SqlSyncRangeStore;
import com.squareup.cash.clientsync.pipeline.AnalyticsObserver;
import com.squareup.cash.clientsync.pipeline.InvitationSyncEntityStorageObserver;
import com.squareup.cash.clientsync.pipeline.RealClientSyncStorageOperationBatchSanitizer;
import com.squareup.cash.clientsync.pipeline.ReceiptSyncEntityObserver;
import com.squareup.cash.clientsync.pipeline.SearchPaymentSyncEntityStorageObserver;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.RealSyncEntityReader;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.contacts.photo.ContactPhotoResolver;
import com.squareup.cash.crypto.analytics.RealCryptoFlowLogger;
import com.squareup.cash.crypto.backend.payroll.RealCryptoPayrollProvider;
import com.squareup.cash.crypto.navigation.RealCryptoAnalytics;
import com.squareup.cash.data.SandboxedDataModule$Companion$provideMoneyTabStateOnSignOutAction$1;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.multiplatform.bitcoin.parsers.RealBitcoinAddressParser;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.profile.views.ProfilePhotoInterceptor;
import com.squareup.cash.qrcodes.views.CashQrCodesViewFactory;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.preferences.BooleanPreference;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.syncentitygateway.api.SyncEntityGatewayApp;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealClipboardManager implements Handler.Callback {
    public final ClipboardManager clipboard;
    public final Handler handler = new Handler(Looper.getMainLooper(), this);

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider clipboard;

        public /* synthetic */ MetroFactory(Provider provider, int i) {
            this.$r8$classId = i;
            this.clipboard = provider;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            int i2 = 2;
            int i3 = 1;
            int i4 = 0;
            Provider provider = this.clipboard;
            switch (i) {
                case 0:
                    ClipboardManager clipboardManager = (ClipboardManager) provider.invoke();
                    clipboardManager.getClass();
                    return new RealClipboardManager(clipboardManager);
                case 1:
                    ((RealClientSyncErrorReporter) provider.invoke()).getClass();
                    return new RealClientSyncStorageOperationBatchSanitizer();
                case 2:
                    SyncValueReader syncValueReader = (SyncValueReader) provider.invoke();
                    syncValueReader.getClass();
                    return new KeysetHandle(syncValueReader, AndroidSyncValueSpecs.ClientSyncConfig);
                case 3:
                    SyncEntityGatewayApp syncEntityGatewayApp = (SyncEntityGatewayApp) provider.invoke();
                    syncEntityGatewayApp.getClass();
                    return new WireAdapter(syncEntityGatewayApp);
                case 4:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider.invoke();
                    cashAccountDatabaseImpl.getClass();
                    return new SqlClientSyncTransactor(cashAccountDatabaseImpl, i2);
                case 5:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl2 = (CashAccountDatabaseImpl) provider.invoke();
                    cashAccountDatabaseImpl2.getClass();
                    return new SqlSyncRangeStore(cashAccountDatabaseImpl2);
                case 6:
                    Analytics analytics = (Analytics) provider.invoke();
                    analytics.getClass();
                    return new AnalyticsObserver(analytics, i4);
                case 7:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl3 = (CashAccountDatabaseImpl) provider.invoke();
                    cashAccountDatabaseImpl3.getClass();
                    return new InvitationSyncEntityStorageObserver(cashAccountDatabaseImpl3, 0);
                case 8:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl4 = (CashAccountDatabaseImpl) provider.invoke();
                    cashAccountDatabaseImpl4.getClass();
                    return new ReceiptSyncEntityObserver(cashAccountDatabaseImpl4, 0);
                case 9:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl5 = (CashAccountDatabaseImpl) provider.invoke();
                    cashAccountDatabaseImpl5.getClass();
                    return new SearchPaymentSyncEntityStorageObserver(cashAccountDatabaseImpl5, 1);
                case 10:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl6 = (CashAccountDatabaseImpl) provider.invoke();
                    cashAccountDatabaseImpl6.getClass();
                    return new SearchPaymentSyncEntityStorageObserver(cashAccountDatabaseImpl6, 0);
                case 11:
                    ErrorReporter errorReporter = (ErrorReporter) provider.invoke();
                    errorReporter.getClass();
                    return new AnalyticsObserver(errorReporter, i2);
                case 12:
                    ContactPhotoResolver contactPhotoResolver = (ContactPhotoResolver) provider.invoke();
                    contactPhotoResolver.getClass();
                    return new ProfilePhotoInterceptor(contactPhotoResolver, i3);
                case 13:
                    ErrorReporter errorReporter2 = (ErrorReporter) provider.invoke();
                    errorReporter2.getClass();
                    return new WireAdapter(errorReporter2);
                case 14:
                    ((CashAppLiteReleaseModule$$ExternalSyntheticLambda0) provider.invoke()).getClass();
                    return new RealBitcoinAddressParser();
                case 15:
                    Analytics analytics2 = (Analytics) provider.invoke();
                    analytics2.getClass();
                    return new RealCryptoFlowLogger(analytics2);
                case 16:
                    RealSyncEntityReader realSyncEntityReader = (RealSyncEntityReader) provider.invoke();
                    realSyncEntityReader.getClass();
                    return new RealCryptoPayrollProvider(realSyncEntityReader);
                case 17:
                    RealCashVibrator realCashVibrator = (RealCashVibrator) provider.invoke();
                    realCashVibrator.getClass();
                    return new CashQrCodesViewFactory(realCashVibrator, i3);
                case 18:
                    Analytics analytics3 = (Analytics) provider.invoke();
                    analytics3.getClass();
                    return new RealCryptoAnalytics(analytics3);
                case 19:
                    RealUuidGenerator realUuidGenerator = (RealUuidGenerator) provider.invoke();
                    realUuidGenerator.getClass();
                    return new zzd(realUuidGenerator, 22);
                case 20:
                    SharedPreferences sharedPreferences = (SharedPreferences) provider.invoke();
                    sharedPreferences.getClass();
                    return Room.BooleanKeyValue(sharedPreferences, "activity-viewed", false, false);
                case 21:
                    KeyValue keyValue = (KeyValue) provider.invoke();
                    keyValue.getClass();
                    return new SandboxedDataModule$Companion$provideMoneyTabStateOnSignOutAction$1(keyValue, i3);
                case 22:
                    SharedPreferences sharedPreferences2 = (SharedPreferences) provider.invoke();
                    sharedPreferences2.getClass();
                    return new BooleanPreference(sharedPreferences2, "afterpay-info-sheet-viewed", false);
                case 23:
                    SharedPreferences sharedPreferences3 = (SharedPreferences) provider.invoke();
                    sharedPreferences3.getClass();
                    return new BooleanPreference(sharedPreferences3, "app-messages-light", true);
                case 24:
                    SharedPreferences sharedPreferences4 = (SharedPreferences) provider.invoke();
                    sharedPreferences4.getClass();
                    return new BooleanPreference(sharedPreferences4, "app-messages-ringtone-initialized", false);
                case 25:
                    SharedPreferences sharedPreferences5 = (SharedPreferences) provider.invoke();
                    sharedPreferences5.getClass();
                    return new BooleanPreference(sharedPreferences5, "app-messages-vibrate", true);
                case 26:
                    SharedPreferences sharedPreferences6 = (SharedPreferences) provider.invoke();
                    sharedPreferences6.getClass();
                    return new BooleanPreference(sharedPreferences6, "asked_contacts_payment", false);
                case 27:
                    SharedPreferences sharedPreferences7 = (SharedPreferences) provider.invoke();
                    sharedPreferences7.getClass();
                    return Room.BooleanKeyValue(sharedPreferences7, "asked-nearby-bluetooth-permission", false, false);
                case 28:
                    SharedPreferences sharedPreferences8 = (SharedPreferences) provider.invoke();
                    sharedPreferences8.getClass();
                    return Room.BooleanKeyValue(sharedPreferences8, "asked-nearby-location-permission", false, false);
                default:
                    SharedPreferences sharedPreferences9 = (SharedPreferences) provider.invoke();
                    sharedPreferences9.getClass();
                    return new BooleanPreference(sharedPreferences9, "business-grant-linked", false);
            }
        }
    }

    public RealClipboardManager(ClipboardManager clipboardManager) {
        this.clipboard = clipboardManager;
    }

    public final void copy(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.handler.removeMessages(0);
        this.clipboard.setPrimaryClip(ClipData.newPlainText(str, str2));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        CharSequence label;
        message.getClass();
        ClipboardManager clipboardManager = this.clipboard;
        ClipDescription primaryClipDescription = clipboardManager.getPrimaryClipDescription();
        if (primaryClipDescription != null && (label = primaryClipDescription.getLabel()) != null && label.equals(message.obj)) {
            try {
                clipboardManager.clearPrimaryClip();
            } catch (Exception e) {
                Timber.Forest.w("Couldn't clear clipboard.", new Object[0], e);
                clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
            }
            Timber.Forest.d("Clipboard cleared (label: %s).", message.obj);
        }
        return true;
    }
}
