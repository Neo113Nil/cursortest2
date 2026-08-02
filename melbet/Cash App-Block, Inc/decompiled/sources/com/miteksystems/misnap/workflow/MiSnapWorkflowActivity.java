package com.miteksystems.misnap.workflow;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.impl.LiveDataObservable$$ExternalSyntheticLambda5;
import androidx.datastore.core.SimpleActor;
import androidx.fragment.app.BackStackRecord;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.NavHostFragment;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.miteksystems.misnap.core.MiSnapMibiData;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.core.MibiData;
import com.miteksystems.misnap.core.Mrz;
import com.miteksystems.misnap.nfc.util.NfcDocumentUtil;
import com.miteksystems.misnap.nfc.util.NfcUtil;
import com.miteksystems.misnap.workflow.MiSnapWorkflowError;
import com.miteksystems.misnap.workflow.MiSnapWorkflowStep;
import com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel;
import com.miteksystems.misnap.workflow.util.CombinedWorkflowHandler;
import com.squareup.cash.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.json.Json;
import nl.dionsegijn.konfetti.compose.KonfettiViewKt;
import nl.dionsegijn.konfetti.core.Position;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class MiSnapWorkflowActivity extends AppCompatActivity {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final Lazy a = LazyKt.lazy(new b(this, 0));
    public final Lazy b = LazyKt.lazy(new b(this, 2));
    public final Lazy c = LazyKt.lazy(new b(this, 1));
    public Integer d;

    public abstract /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MiSnapSettings.UseCase.values().length];
            try {
                iArr[6] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[7] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[8] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[9] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public final class b extends Lambda implements Function0 {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ MiSnapWorkflowActivity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(MiSnapWorkflowActivity miSnapWorkflowActivity, int i) {
            super(0);
            this.$r8$classId = i;
            this.a = miSnapWorkflowActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            MiSnapWorkflowActivity miSnapWorkflowActivity = this.a;
            switch (i) {
                case 0:
                    break;
                case 1:
                    ViewModelStore viewModelStore = miSnapWorkflowActivity.getViewModelStore();
                    ViewModelProvider$Factory defaultViewModelProviderFactory = miSnapWorkflowActivity.getDefaultViewModelProviderFactory();
                    CreationExtras defaultViewModelCreationExtras = miSnapWorkflowActivity.getDefaultViewModelCreationExtras();
                    viewModelStore.getClass();
                    defaultViewModelProviderFactory.getClass();
                    defaultViewModelCreationExtras.getClass();
                    SimpleActor simpleActor = new SimpleActor(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
                    KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CombinedWorkflowHandler.CombinedViewModel.class);
                    String qualifiedName = orCreateKotlinClass.getQualifiedName();
                    if (qualifiedName == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Local and anonymous classes can not be ViewModels");
                        break;
                    } else {
                        break;
                    }
                default:
                    ViewModelStore viewModelStore2 = miSnapWorkflowActivity.getViewModelStore();
                    ViewModelProvider$Factory defaultViewModelProviderFactory2 = miSnapWorkflowActivity.getDefaultViewModelProviderFactory();
                    CreationExtras defaultViewModelCreationExtras2 = miSnapWorkflowActivity.getDefaultViewModelCreationExtras();
                    viewModelStore2.getClass();
                    defaultViewModelProviderFactory2.getClass();
                    defaultViewModelCreationExtras2.getClass();
                    SimpleActor simpleActor2 = new SimpleActor(viewModelStore2, defaultViewModelProviderFactory2, defaultViewModelCreationExtras2);
                    KClass orCreateKotlinClass2 = Reflection.factory.getOrCreateKotlinClass(MiSnapWorkflowViewModel.class);
                    String qualifiedName2 = orCreateKotlinClass2.getQualifiedName();
                    if (qualifiedName2 == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Local and anonymous classes can not be ViewModels");
                        break;
                    } else {
                        break;
                    }
            }
            return null;
        }
    }

    public final class e extends Lambda implements Function1 {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ MiSnapWorkflowActivity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ e(MiSnapWorkflowActivity miSnapWorkflowActivity, int i) {
            super(1);
            this.$r8$classId = i;
            this.a = miSnapWorkflowActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            int i = this.$r8$classId;
            MiSnapWorkflowActivity miSnapWorkflowActivity = this.a;
            switch (i) {
                case 0:
                    List list = (List) obj;
                    if (list != null) {
                        KonfettiViewKt.a = list;
                        MiSnapWorkflowStep.Result result = (MiSnapWorkflowStep.Result) CollectionsKt.last(list);
                        if ((result instanceof MiSnapWorkflowStep.Result.Error) && (((MiSnapWorkflowStep.Result.Error) result).b.a instanceof MiSnapWorkflowError.CombinedWorkflow)) {
                            int i2 = MiSnapWorkflowActivity.$r8$clinit;
                            miSnapWorkflowActivity.a(0);
                        } else {
                            int i3 = MiSnapWorkflowActivity.$r8$clinit;
                            miSnapWorkflowActivity.a(-1);
                        }
                    }
                    break;
                case 1:
                    MiSnapWorkflowStep miSnapWorkflowStep = (MiSnapWorkflowStep) obj;
                    if (miSnapWorkflowStep != null) {
                        MiSnapSettings miSnapSettings = miSnapWorkflowStep.a;
                        int i4 = MiSnapWorkflowActivity.$r8$clinit;
                        miSnapWorkflowActivity.a(miSnapSettings);
                    }
                    break;
                case 2:
                    MiSnapFinalResult miSnapFinalResult = (MiSnapFinalResult) obj;
                    if (miSnapFinalResult != null) {
                        KonfettiViewKt.setResults$workflow_release(CollectionsKt__CollectionsJVMKt.listOf(new MiSnapWorkflowStep.Result.Success(miSnapFinalResult)));
                        int i5 = MiSnapWorkflowActivity.$r8$clinit;
                        miSnapWorkflowActivity.a(-1);
                    }
                    break;
                case 3:
                    MiSnapErrorResult miSnapErrorResult = (MiSnapErrorResult) obj;
                    if (miSnapErrorResult != null) {
                        KonfettiViewKt.setResults$workflow_release(CollectionsKt__CollectionsJVMKt.listOf(new MiSnapWorkflowStep.Result.Error(miSnapErrorResult)));
                        int i6 = MiSnapWorkflowActivity.$r8$clinit;
                        miSnapWorkflowActivity.a(0);
                    }
                    break;
                default:
                    ((OnBackPressedCallback) obj).getClass();
                    Lazy lazy = miSnapWorkflowActivity.a;
                    int i7 = MiSnapWorkflowActivity.$r8$clinit;
                    miSnapWorkflowActivity.setResult(0);
                    Context applicationContext = miSnapWorkflowActivity.getApplicationContext();
                    applicationContext.getClass();
                    MiSnapMibiData miSnapMibiData = MibiData.toMiSnapMibiData(applicationContext);
                    MibiData.i = null;
                    Lazy lazy2 = miSnapWorkflowActivity.c;
                    if (((CombinedWorkflowHandler.CombinedViewModel) lazy2.getValue()).isCombinedWorkflowConfigured()) {
                        CombinedWorkflowHandler.CombinedViewModel combinedViewModel = (CombinedWorkflowHandler.CombinedViewModel) lazy2.getValue();
                        combinedViewModel.a.add(new MiSnapWorkflowStep.Result.Error(new MiSnapErrorResult(MiSnapWorkflowError.Cancelled.INSTANCE, miSnapMibiData)));
                        KonfettiViewKt.setResults$workflow_release(CollectionsKt.toList(((CombinedWorkflowHandler) lazy.getValue()).e.a));
                        CombinedWorkflowHandler combinedWorkflowHandler = (CombinedWorkflowHandler) lazy.getValue();
                        CombinedWorkflowHandler.CombinedViewModel combinedViewModel2 = combinedWorkflowHandler.e;
                        combinedViewModel2.b = EmptyList.INSTANCE;
                        combinedViewModel2.a.clear();
                        combinedViewModel2.c = null;
                        MiSnapWorkflowViewModel miSnapWorkflowViewModel = combinedWorkflowHandler.d;
                        miSnapWorkflowViewModel.clearLiveData$workflow_release();
                        miSnapWorkflowViewModel.h = null;
                        miSnapWorkflowViewModel.i = null;
                        miSnapWorkflowViewModel.b = new ArrayList();
                        miSnapWorkflowViewModel.c = null;
                    } else {
                        KonfettiViewKt.setResults$workflow_release(CollectionsKt__CollectionsJVMKt.listOf(new MiSnapWorkflowStep.Result.Error(new MiSnapErrorResult(MiSnapWorkflowError.Cancelled.INSTANCE, miSnapMibiData))));
                    }
                    miSnapWorkflowActivity.finish();
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    public final void a(MiSnapSettings miSnapSettings) {
        Unit unit;
        Integer num;
        Integer forcedOrientation = Position.getForcedOrientation(miSnapSettings.workflow, miSnapSettings.a);
        if (forcedOrientation != null) {
            int intValue = forcedOrientation.intValue();
            if (getRequestedOrientation() != intValue) {
                if (this.d == null) {
                    this.d = Integer.valueOf(getRequestedOrientation());
                }
                setRequestedOrientation(intValue);
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit != null || isChangingConfigurations() || (num = this.d) == null) {
            return;
        }
        setRequestedOrientation(num.intValue());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        context.getClass();
        super.attachBaseContext(context);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        MiSnapWorkflowStep.Result.Error error;
        Bundle bundle2;
        MiSnapWorkflowViewModel miSnapWorkflowViewModel;
        Context applicationContext;
        MiSnapWorkflowError miSnapWorkflowError;
        Lazy lazy = this.a;
        Lazy lazy2 = this.b;
        super.onCreate(bundle);
        if (bundle != null && bundle.containsKey("orientationKey")) {
            this.d = Integer.valueOf(bundle.getInt("orientationKey"));
        }
        String[] stringArrayExtra = getIntent().getStringArrayExtra("WORKFLOW_SETTINGS");
        int i = 1;
        if (getIntent().getBooleanExtra("WORKFLOW_ACTIVITY_DISABLE_SCREENSHOTS", true)) {
            getWindow().setFlags(PKIFailureInfo.certRevoked, PKIFailureInfo.certRevoked);
        }
        setContentView(R.layout.misnap_activity_root);
        int i2 = 4;
        int i3 = 2;
        int i4 = 0;
        if (stringArrayExtra != null && stringArrayExtra.length != 0) {
            try {
                ArrayList arrayList = new ArrayList(stringArrayExtra.length);
                for (String str : stringArrayExtra) {
                    Json.Default r11 = Json.Default;
                    str.getClass();
                    r11.getClass();
                    arrayList.add((MiSnapWorkflowStep) r11.decodeFromString(str, MiSnapWorkflowStep.Companion.serializer()));
                }
                if (arrayList.size() > 1) {
                    ((CombinedWorkflowHandler) lazy.getValue()).f.observe(this, new LiveDataObservable$$ExternalSyntheticLambda5(new e(this, i4), 1));
                    ((CombinedWorkflowHandler) lazy.getValue()).g.observe(this, new LiveDataObservable$$ExternalSyntheticLambda5(new e(this, i), 2));
                    if (bundle == null) {
                        ((CombinedWorkflowHandler) lazy.getValue()).startCombinedWorkflow(CollectionsKt.toList(arrayList));
                    }
                } else {
                    MiSnapSettings miSnapSettings = ((MiSnapWorkflowStep) CollectionsKt.first((List) arrayList)).a;
                    Integer num = ((MiSnapWorkflowStep) CollectionsKt.first((List) arrayList)).b;
                    int intValue = num != null ? num.intValue() : -1;
                    int i5 = 3;
                    if (intValue == -1) {
                        int i6 = a.a[miSnapSettings.a.ordinal()];
                        intValue = i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? R.navigation.document_session_flow : R.navigation.voice_session_flow : R.navigation.nfc_reader_flow : R.navigation.face_session_flow : R.navigation.barcode_session_flow;
                    }
                    a(miSnapSettings);
                    ((MiSnapWorkflowViewModel) lazy2.getValue()).g.observe(this, new LiveDataObservable$$ExternalSyntheticLambda5(new e(this, i3), 3));
                    ((MiSnapWorkflowViewModel) lazy2.getValue()).d.observe(this, new LiveDataObservable$$ExternalSyntheticLambda5(new e(this, i5), 4));
                    if (bundle == null) {
                        if (miSnapSettings.a == MiSnapSettings.UseCase.NFC) {
                            if (NfcUtil.isNfcSupported(this)) {
                                Mrz mrz = miSnapSettings.nfc.a;
                                if (mrz != null && !NfcDocumentUtil.isDocumentNfcEnabled(this, mrz)) {
                                    miSnapWorkflowViewModel = (MiSnapWorkflowViewModel) lazy2.getValue();
                                    applicationContext = getApplicationContext();
                                    applicationContext.getClass();
                                    miSnapWorkflowError = MiSnapWorkflowError.Nfc.DocumentNotNfcEnabled.INSTANCE;
                                }
                            } else {
                                miSnapWorkflowViewModel = (MiSnapWorkflowViewModel) lazy2.getValue();
                                applicationContext = getApplicationContext();
                                applicationContext.getClass();
                                miSnapWorkflowError = MiSnapWorkflowError.Nfc.DeviceDoesNotSupportNfc.INSTANCE;
                            }
                            miSnapWorkflowViewModel.postError$workflow_release(applicationContext, miSnapWorkflowError);
                            return;
                        }
                        ((MiSnapWorkflowViewModel) lazy2.getValue()).applySettings(miSnapSettings);
                        if (intValue != 0) {
                            bundle2 = new Bundle();
                            bundle2.putInt("android-support-nav:fragment:graphId", intValue);
                        } else {
                            bundle2 = null;
                        }
                        NavHostFragment navHostFragment = new NavHostFragment();
                        if (bundle2 != null) {
                            navHostFragment.setArguments(bundle2);
                        }
                        FragmentManager supportFragmentManager = getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        BackStackRecord backStackRecord = new BackStackRecord(supportFragmentManager);
                        backStackRecord.replace(R.id.fragmentContainer, null, navHostFragment);
                        backStackRecord.setPrimaryNavigationFragment(navHostFragment);
                        backStackRecord.commit();
                    }
                }
            } catch (Exception unused) {
                MiSnapWorkflowError.SettingState settingState = MiSnapWorkflowError.SettingState.INSTANCE;
                Context applicationContext2 = getApplicationContext();
                applicationContext2.getClass();
                error = new MiSnapWorkflowStep.Result.Error(new MiSnapErrorResult(settingState, MibiData.toMiSnapMibiData(applicationContext2)));
            }
            OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
            onBackPressedDispatcher.getClass();
            OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, this, new e(this, i2), 2);
        }
        MiSnapWorkflowError.SettingState settingState2 = MiSnapWorkflowError.SettingState.INSTANCE;
        Context applicationContext3 = getApplicationContext();
        applicationContext3.getClass();
        error = new MiSnapWorkflowStep.Result.Error(new MiSnapErrorResult(settingState2, MibiData.toMiSnapMibiData(applicationContext3)));
        KonfettiViewKt.setResults$workflow_release(CollectionsKt__CollectionsJVMKt.listOf(error));
        a(0);
        OnBackPressedDispatcher onBackPressedDispatcher2 = getOnBackPressedDispatcher();
        onBackPressedDispatcher2.getClass();
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher2, this, new e(this, i2), 2);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        isFinishing();
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        Integer num = this.d;
        if (num != null) {
            bundle.putInt("orientationKey", num.intValue());
        }
    }

    public final void a(int i) {
        setResult(i);
        MibiData.i = null;
        finish();
    }
}
