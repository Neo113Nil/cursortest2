package com.squareup.cash;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Typeface;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.core.content.res.ResourcesCompat;
import coil3.size.DimensionKt;
import com.bugsnag.android.Bugsnag;
import com.bugsnag.android.Client;
import com.bugsnag.android.MetadataState;
import com.squareup.cash.core.navigationcontainer.api.PresenterElement;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda8;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.initialscreenloader.backend.RealInitialScreenLoader;
import com.squareup.cash.lottie.CashSansFontsKt;
import com.squareup.cash.observability.backend.real.ObservabilitySetupTeardown;
import com.squareup.cash.observability.backend.real.bugsnag.RealBugsnagClient;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.MetadataSection$DeviceSection;
import com.squareup.cash.storage.RealStorage;
import com.squareup.cash.storage.context.KeyedStorageContextWrapper;
import com.squareup.cash.treehouse.android.RegisteredTreehouseApp;
import com.squareup.cash.treehouse.sqldelight.AndroidSqlDelightBridgeHolder;
import com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda5;
import com.squareup.cash.userjourneys.data.DiskUserJourneyDataSource;
import com.squareup.cash.userjourneys.data.UserJourneyRepositoryError;
import com.squareup.util.android.CashBackupAgent;
import com.squareup.util.android.RealBackupService;
import com.squareup.wire.GrpcMethod;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlinx.coroutines.CoroutineScope;
import okio.ByteString;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import papa.SafeTrace;
import retrofit2.OkHttpCall;

/* loaded from: classes.dex */
public final class CashApp$onCreate$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CashApp$onCreate$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                return new CashApp$onCreate$1((CashApp) obj2, continuation, 0);
            case 1:
                return new CashApp$onCreate$1((PresenterElement) obj2, continuation, 1);
            case 2:
                return new CashApp$onCreate$1((RealFeatureFlagManager) obj2, continuation, 2);
            case 3:
                return new CashApp$onCreate$1((RealInitialScreenLoader) obj2, continuation, 3);
            case 4:
                return new CashApp$onCreate$1((Context) obj2, continuation, 4);
            case 5:
                return new CashApp$onCreate$1((ObservabilitySetupTeardown) obj2, continuation, 5);
            case 6:
                return new CashApp$onCreate$1((RealBugsnagClient) obj2, continuation, 6);
            case 7:
                return new CashApp$onCreate$1((RealStorage) obj2, continuation, 7);
            case 8:
                return new CashApp$onCreate$1((OkHttpCall.AnonymousClass1) obj2, continuation, 8);
            case 9:
                return new CashApp$onCreate$1((Lazy) obj2, continuation, 9);
            case 10:
                return new CashApp$onCreate$1((AndroidSqlDelightBridgeHolder) obj2, continuation, 10);
            case 11:
                return new CashApp$onCreate$1((DiskUserJourneyDataSource) obj2, continuation, 11);
            case 12:
                return new CashApp$onCreate$1((RealBackupService) obj2, continuation, 12);
            default:
                return new CashApp$onCreate$1((FocusRequester) obj2, continuation, 13);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CashApp$onCreate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v56, types: [kotlin.collections.EmptySet] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Object systemService = ((CashApp) obj2).getSystemService("accessibility");
                systemService.getClass();
                ((AccessibilityManager) systemService).getEnabledAccessibilityServiceList(-1);
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                PresenterElement presenterElement = (PresenterElement) obj2;
                if (presenterElement != null) {
                    presenterElement.setState(PresenterElement.State.TransitioningOut);
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) obj2;
                realFeatureFlagManager.featureFlagQueries.transactionWithWrapper(new StorageLinkQueries$$ExternalSyntheticLambda8(realFeatureFlagManager, 23));
                return Unit.INSTANCE;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((RealInitialScreenLoader) obj2).versionUpdater.checkUpdate();
                return Unit.INSTANCE;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Context context = (Context) obj2;
                Typeface font = ResourcesCompat.getFont(context, R.font.cashsans_regular);
                font.getClass();
                LinkedHashMap linkedHashMap = CashSansFontsKt._CashSansFontMap;
                linkedHashMap.put("Cash Sans", font);
                Typeface font2 = ResourcesCompat.getFont(context, R.font.cashsans_medium);
                font2.getClass();
                linkedHashMap.put("Cash Sans Medium", font2);
                Typeface font3 = ResourcesCompat.getFont(context, R.font.cashsans_bold);
                font3.getClass();
                linkedHashMap.put("Cash Sans Bold", font3);
                linkedHashMap.put("Cash Market", font);
                linkedHashMap.put("Cash Market Medium", font2);
                linkedHashMap.put("Cash Market Bold", font3);
                return Unit.INSTANCE;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ObservabilitySetupTeardown observabilitySetupTeardown = (ObservabilitySetupTeardown) obj2;
                observabilitySetupTeardown.bugsnagClient.addMetadata(MetadataSection$DeviceSection.INSTANCE, MetadataSection$DeviceSection.IsTablet.INSTANCE, String.valueOf(observabilitySetupTeardown.deviceInfo.smallestScreenWidthDp >= 600));
                return Unit.INSTANCE;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Application application = ((RealBugsnagClient) obj2).context;
                if (application == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("context");
                    throw null;
                }
                PackageManager packageManager = application.getPackageManager();
                String packageName = application.getPackageName();
                String installerPackageName = packageManager.getInstallerPackageName(packageName);
                if (installerPackageName == null) {
                    installerPackageName = "null";
                }
                Client client = Bugsnag.getClient();
                client.getClass();
                MetadataState metadataState = client.metadataState;
                metadataState.metadata.addMetadata("App", "Installer", installerPackageName);
                metadataState.notifyMetadataAdded("App", "Installer", installerPackageName);
                try {
                    Signature[] signatureArr = packageManager.getPackageInfo(packageName, 64).signatures;
                    if (signatureArr != null) {
                        int i2 = 0;
                        for (Signature signature : signatureArr) {
                            i2++;
                            String str = "Signature " + i2;
                            ByteString.Companion companion = ByteString.Companion;
                            byte[] byteArray = signature.toByteArray();
                            byteArray.getClass();
                            String hex = ByteString.Companion.of$default(byteArray).digest$okio(McElieceCCA2KeyGenParameterSpec.SHA1).hex();
                            Locale locale = Locale.US;
                            locale.getClass();
                            String upperCase = hex.toUpperCase(locale);
                            upperCase.getClass();
                            String replace = new Regex("(?<=..)(..)").replace(upperCase, ":$1");
                            Client client2 = Bugsnag.getClient();
                            client2.getClass();
                            MetadataState metadataState2 = client2.metadataState;
                            metadataState2.metadata.addMetadata("App", str, replace);
                            metadataState2.notifyMetadataAdded("App", str, replace);
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                return Unit.INSTANCE;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return new Long(new File(String.valueOf(((RealStorage) obj2).context.getExternalFilesDir(null))).getUsableSpace());
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Set set = ArraysKt___ArraysKt.toSet(new String[]{"app-token", "session", "onboarded", "customer-token", "target-account-token", "forced_logout_401", "installation-id", "en_decision", "de_decision", "persisted-storage-link", "responseContextCountry", "onboarding-context-flow-token", "dogfood-seen-telescope-dialog"});
                SharedPreferences sharedPreferences = (SharedPreferences) ((OkHttpCall.AnonymousClass1) obj2).val$callback;
                SharedPreferences.Editor edit = sharedPreferences.edit();
                Iterator it = SetsKt___SetsKt.minus((Set) sharedPreferences.getAll().keySet(), (Iterable) set).iterator();
                while (it.hasNext()) {
                    edit.remove((String) it.next());
                }
                edit.commit();
                return Unit.INSTANCE;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Iterator it2 = ((Map) ((Lazy) obj2).getValue()).values().iterator();
                while (it2.hasNext()) {
                    ((RegisteredTreehouseApp) it2.next()).getTreehouseApp().stop();
                }
                return Unit.INSTANCE;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                AndroidSqlDelightBridgeHolder androidSqlDelightBridgeHolder = (AndroidSqlDelightBridgeHolder) obj2;
                Context context2 = androidSqlDelightBridgeHolder.context;
                LinkedHashSet<AndroidSqlDelightBridgeHolder.DatabasePathParts> linkedHashSet = androidSqlDelightBridgeHolder.openTreehouseDatabases;
                for (AndroidSqlDelightBridgeHolder.DatabasePathParts databasePathParts : linkedHashSet) {
                    String relativePath = databasePathParts.getRelativePath();
                    (relativePath != null ? new KeyedStorageContextWrapper(context2, relativePath) : context2).getDatabasePath(databasePathParts.getDatabaseFileName()).delete();
                }
                linkedHashSet.clear();
                return Unit.INSTANCE;
            case 11:
                DiskUserJourneyDataSource diskUserJourneyDataSource = (DiskUserJourneyDataSource) obj2;
                GrpcMethod grpcMethod = diskUserJourneyDataSource.journeysFile;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                try {
                    String str2 = new String(grpcMethod.readFully(), Charsets.UTF_8);
                    diskUserJourneyDataSource = str2.length() == 0 ? EmptySet.INSTANCE : diskUserJourneyDataSource.deserialize(str2);
                    return diskUserJourneyDataSource;
                } catch (Throwable th) {
                    diskUserJourneyDataSource.errorReporter.report(new UserJourneyRepositoryError("Error deserializing journeys e: " + th), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                    ((File) grpcMethod.path).delete();
                    ((File) grpcMethod.requestAdapter).delete();
                    ((File) grpcMethod.responseAdapter).delete();
                    diskUserJourneyDataSource.onPersistenceChanged("");
                    return EmptySet.INSTANCE;
                }
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Object obj3 = CashBackupAgent.lock;
                return DimensionKt.withBackupFile(((RealBackupService) obj2).context, new MainActivity$$ExternalSyntheticLambda5(27));
            default:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                FocusRequester.m605requestFocus3ESFkO8$default((FocusRequester) obj2);
                return Unit.INSTANCE;
        }
    }
}
