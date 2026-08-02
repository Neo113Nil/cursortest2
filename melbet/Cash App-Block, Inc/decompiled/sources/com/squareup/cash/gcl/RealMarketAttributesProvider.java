package com.squareup.cash.gcl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.room.Room;
import coil3.RealImageLoader;
import com.google.android.play.integrity.internal.ax;
import com.squareup.cash.R;
import com.squareup.cash.api.AppServiceContextWrapper;
import com.squareup.cash.clientsync.pipeline.ReceiptSyncEntityObserver;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.formview.viewevents.real.RealFormAnalytics;
import com.squareup.cash.gcl.delegate.InstrumentLinkingPostcodeConfigItemDelegate;
import com.squareup.cash.history.payments.presenters.ProfileActivityItemEventDecorator;
import com.squareup.cash.inappreview.real.RealRequestReviewFlagWrapper;
import com.squareup.cash.initialscreenloader.backend.RealInitialScreenPreludeNavigator;
import com.squareup.cash.initialscreenloader.backend.RealSquareStaffSwitchAccountContextStore;
import com.squareup.cash.instruments.backend.real.RealInstrumentLinkingOptionManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentVerifier;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.api.CommonApiModule;
import com.squareup.cash.integration.api.CommonInterceptor;
import com.squareup.cash.limits.views.LimitsViewFactory;
import com.squareup.cash.localization.RealRegionProvider;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.score.views.ScoreUiFactory;
import com.squareup.cash.util.money.Moneys$$ExternalSyntheticLambda0;
import com.squareup.preferences.BooleanPreference;
import com.squareup.preferences.MoshiPreference;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.scannerview.SizeMap;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.reflect.full.KCallables;
import kotlinx.coroutines.Job;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.internal.connection.RealCall;
import okio.Buffer;

/* loaded from: classes6.dex */
public final class RealMarketAttributesProvider {
    public final RealRegionProvider regionProvider;

    public RealMarketAttributesProvider(RealRegionProvider realRegionProvider) {
        this.regionProvider = realRegionProvider;
    }

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider regionProvider;

        public MetroFactory(CommonApiModule commonApiModule, DoubleCheck doubleCheck) {
            this.$r8$classId = 22;
            this.regionProvider = doubleCheck;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            int i2 = 3;
            boolean z = false;
            Object[] objArr = 0;
            Provider provider = this.regionProvider;
            switch (i) {
                case 0:
                    RealRegionProvider realRegionProvider = (RealRegionProvider) provider.invoke();
                    realRegionProvider.getClass();
                    return new RealMarketAttributesProvider(realRegionProvider);
                case 1:
                    Analytics analytics = (Analytics) provider.invoke();
                    analytics.getClass();
                    return new RealFormAnalytics(analytics);
                case 2:
                    AndroidStringManager androidStringManager = (AndroidStringManager) provider.invoke();
                    androidStringManager.getClass();
                    return new InstrumentLinkingPostcodeConfigItemDelegate(androidStringManager, 1);
                case 3:
                    AndroidStringManager androidStringManager2 = (AndroidStringManager) provider.invoke();
                    androidStringManager2.getClass();
                    return new InstrumentLinkingPostcodeConfigItemDelegate(androidStringManager2, 2);
                case 4:
                    AndroidStringManager androidStringManager3 = (AndroidStringManager) provider.invoke();
                    androidStringManager3.getClass();
                    return new InstrumentLinkingPostcodeConfigItemDelegate(androidStringManager3, objArr == true ? 1 : 0);
                case 5:
                    RealImageLoader realImageLoader = (RealImageLoader) provider.invoke();
                    realImageLoader.getClass();
                    return new LimitsViewFactory(realImageLoader, i2);
                case 6:
                    OkHttpClient okHttpClient = (OkHttpClient) provider.invoke();
                    okHttpClient.getClass();
                    return new SizeMap(okHttpClient, 20);
                case 7:
                    SharedPreferences sharedPreferences = (SharedPreferences) provider.invoke();
                    sharedPreferences.getClass();
                    return KCallables.provideTracker(sharedPreferences);
                case 8:
                    RealImageLoader realImageLoader2 = (RealImageLoader) provider.invoke();
                    realImageLoader2.getClass();
                    return new LimitsViewFactory(realImageLoader2, 4);
                case 9:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider.invoke();
                    cashAccountDatabaseImpl.getClass();
                    return new ReceiptSyncEntityObserver(cashAccountDatabaseImpl, 3);
                case 10:
                    Analytics analytics2 = (Analytics) provider.invoke();
                    analytics2.getClass();
                    return new ProfileActivityItemEventDecorator(analytics2);
                case 11:
                    BooleanPreference booleanPreference = (BooleanPreference) provider.invoke();
                    booleanPreference.getClass();
                    return new RealRequestReviewFlagWrapper(booleanPreference);
                case 12:
                    SharedPreferences sharedPreferences2 = (SharedPreferences) provider.invoke();
                    sharedPreferences2.getClass();
                    return Room.BooleanKeyValue(sharedPreferences2, "forced_logout_401", false, false);
                case 13:
                    SharedPreferences sharedPreferences3 = (SharedPreferences) provider.invoke();
                    sharedPreferences3.getClass();
                    return new RealSquareStaffSwitchAccountContextStore(Room.StringKeyValue(sharedPreferences3, "square_staff_switch_account_invitation_token", null, false), Room.LongKeyValue$default(sharedPreferences3, "square_staff_switch_account_expires_at"), new Moneys$$ExternalSyntheticLambda0(9));
                case 14:
                    MoshiPreference moshiPreference = (MoshiPreference) provider.invoke();
                    moshiPreference.getClass();
                    return new WireAdapter(moshiPreference);
                case 15:
                    Job job = (Job) provider.invoke();
                    job.getClass();
                    return new RealInitialScreenPreludeNavigator(job);
                case 16:
                    SyncValueReader syncValueReader = (SyncValueReader) provider.invoke();
                    syncValueReader.getClass();
                    return new RealInstrumentLinkingOptionManager(syncValueReader);
                case 17:
                    AppService appService = (AppService) provider.invoke();
                    appService.getClass();
                    return new RealInstrumentVerifier(appService);
                case 18:
                    RealImageLoader realImageLoader3 = (RealImageLoader) provider.invoke();
                    realImageLoader3.getClass();
                    return new ScoreUiFactory(realImageLoader3, 6);
                case 19:
                    RealImageLoader realImageLoader4 = (RealImageLoader) provider.invoke();
                    realImageLoader4.getClass();
                    return new LimitsViewFactory(realImageLoader4, 5);
                case 20:
                    Analytics analytics3 = (Analytics) provider.invoke();
                    analytics3.getClass();
                    return analytics3;
                case 21:
                    Context context = (Context) provider.invoke();
                    context.getClass();
                    return new ax(context, z);
                case 22:
                    provider.getClass();
                    final Lazy doubleCheck = provider instanceof Lazy ? (Lazy) provider : new DoubleCheck(provider);
                    return new Call.Factory() { // from class: com.squareup.cash.integration.api.CommonApiModule$$ExternalSyntheticLambda0
                        @Override // okhttp3.Call.Factory
                        public final Call newCall(Request request) {
                            request.getClass();
                            OkHttpClient okHttpClient2 = (OkHttpClient) Lazy.this.getValue();
                            okHttpClient2.getClass();
                            return new RealCall(okHttpClient2, request, false);
                        }
                    };
                case 23:
                    String str = (String) provider.invoke();
                    str.getClass();
                    return new CommonInterceptor(str);
                case 24:
                    Context context2 = (Context) provider.invoke();
                    context2.getClass();
                    StringBuilder sb = new StringBuilder("com.squareup.cash/");
                    String string2 = context2.getResources().getString(R.string.commit_sha);
                    string2.getClass();
                    sb.append(string2);
                    sb.append(" (Android ");
                    sb.append(Build.VERSION.RELEASE);
                    sb.append("; ");
                    sb.append(Build.MANUFACTURER);
                    sb.append(' ');
                    sb.append(Build.BRAND);
                    sb.append(' ');
                    sb.append(Build.MODEL);
                    sb.append("; ");
                    sb.append(Locale.getDefault());
                    sb.append(") Version/5.58.0");
                    String sb2 = sb.toString();
                    int i3 = 0;
                    while (i3 < sb2.length()) {
                        int codePointAt = sb2.codePointAt(i3);
                        if (codePointAt <= 31 || codePointAt >= 127) {
                            Buffer buffer = new Buffer();
                            buffer.m4338writeUtf8(0, i3, sb2);
                            while (i3 < sb2.length()) {
                                int codePointAt2 = sb2.codePointAt(i3);
                                buffer.writeUtf8CodePoint((codePointAt2 <= 31 || codePointAt2 >= 127) ? 63 : codePointAt2);
                                i3 += Character.charCount(codePointAt2);
                            }
                            return buffer.readUtf8();
                        }
                        i3 += Character.charCount(codePointAt);
                    }
                    return sb2;
                case 25:
                    AppServiceContextWrapper appServiceContextWrapper = (AppServiceContextWrapper) provider.invoke();
                    appServiceContextWrapper.getClass();
                    return appServiceContextWrapper;
                case 26:
                    AppServiceContextWrapper appServiceContextWrapper2 = (AppServiceContextWrapper) provider.invoke();
                    appServiceContextWrapper2.getClass();
                    return appServiceContextWrapper2;
                case 27:
                    AppServiceContextWrapper appServiceContextWrapper3 = (AppServiceContextWrapper) provider.invoke();
                    appServiceContextWrapper3.getClass();
                    return appServiceContextWrapper3;
                case 28:
                    AppServiceContextWrapper appServiceContextWrapper4 = (AppServiceContextWrapper) provider.invoke();
                    appServiceContextWrapper4.getClass();
                    return appServiceContextWrapper4;
                default:
                    AppServiceContextWrapper appServiceContextWrapper5 = (AppServiceContextWrapper) provider.invoke();
                    appServiceContextWrapper5.getClass();
                    return appServiceContextWrapper5;
            }
        }

        public /* synthetic */ MetroFactory(Provider provider, int i) {
            this.$r8$classId = i;
            this.regionProvider = provider;
        }
    }
}
