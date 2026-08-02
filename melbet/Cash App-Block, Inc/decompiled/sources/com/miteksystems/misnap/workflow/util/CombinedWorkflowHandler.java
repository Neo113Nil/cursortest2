package com.miteksystems.misnap.workflow.util;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.datastore.core.SimpleActor;
import androidx.fragment.app.BackStackRecord;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.NavHostFragment;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.miteksystems.misnap.core.DocumentExtraction;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.core.MibiData;
import com.miteksystems.misnap.core.Mrz;
import com.miteksystems.misnap.core.MrzData;
import com.miteksystems.misnap.core.ValidationUtil;
import com.miteksystems.misnap.document.DocumentAnalysisSettings;
import com.miteksystems.misnap.nfc.util.NfcDocumentUtil;
import com.miteksystems.misnap.nfc.util.NfcUtil;
import com.miteksystems.misnap.workflow.MiSnapErrorResult;
import com.miteksystems.misnap.workflow.MiSnapFinalResult;
import com.miteksystems.misnap.workflow.MiSnapWorkflowError;
import com.miteksystems.misnap.workflow.MiSnapWorkflowStep;
import com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel;
import com.miteksystems.misnap.workflow.fragment.NavigationAction$NavigateNfcSession;
import com.miteksystems.misnap.workflow.fragment.NavigationError;
import com.squareup.cash.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.internal.concurrent.TaskLoggerKt;

/* loaded from: classes4.dex */
public final class CombinedWorkflowHandler implements DefaultLifecycleObserver {
    public final Context b;
    public final WeakReference c;
    public final MiSnapWorkflowViewModel d;
    public final CombinedViewModel e;
    public final MutableLiveData f;
    public final MutableLiveData g;

    public final class CombinedViewModel extends ViewModel {
        public final ArrayList a = new ArrayList();
        public List b = EmptyList.INSTANCE;
        public StateMachine c;

        public final MiSnapWorkflowStep getCurrentCombinedWorkflowStep() {
            Object failure;
            if (!isCombinedWorkflowConfigured()) {
                return null;
            }
            try {
                Result.Companion companion = Result.Companion;
                failure = (MiSnapWorkflowStep) this.b.get(this.a.size());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                failure = new Result.Failure(th);
            }
            return (MiSnapWorkflowStep) (failure instanceof Result.Failure ? null : failure);
        }

        public final boolean isCombinedWorkflowConfigured() {
            return (this.b.isEmpty() || this.c == null) ? false : true;
        }
    }

    public final class StateMachine {
        public /* synthetic */ Mrz a;
        public /* synthetic */ boolean b;

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
        
            if (r0.a == null) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x00fc, code lost:
        
            if (r7.b == false) goto L69;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final TaskLoggerKt processNextState(MiSnapWorkflowStep.Result result, MiSnapWorkflowStep miSnapWorkflowStep, MiSnapWorkflowStep miSnapWorkflowStep2) {
            Mrz mrz;
            result.getClass();
            miSnapWorkflowStep.getClass();
            MiSnapSettings miSnapSettings = miSnapWorkflowStep.a;
            if (miSnapWorkflowStep2 == null) {
                return CombinedWorkflowHandler$StateMachine$Action$Finish.INSTANCE;
            }
            MiSnapSettings miSnapSettings2 = miSnapWorkflowStep2.a;
            if (result instanceof MiSnapWorkflowStep.Result.Success) {
                MiSnapFinalResult miSnapFinalResult = ((MiSnapWorkflowStep.Result.Success) result).b;
                if ((miSnapFinalResult instanceof MiSnapFinalResult.DocumentSession) && this.a == null) {
                    DocumentExtraction documentExtraction = ((MiSnapFinalResult.DocumentSession) miSnapFinalResult).d;
                    this.a = documentExtraction != null ? documentExtraction.a : null;
                }
            }
            List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new MiSnapSettings.UseCase[]{MiSnapSettings.UseCase.ID_FRONT, MiSnapSettings.UseCase.ID_BACK, MiSnapSettings.UseCase.PASSPORT});
            if ((listOf.contains(miSnapSettings.a) || listOf.contains(miSnapSettings2.a)) && ((DocumentAnalysisSettings.shouldRedactOptionalData(miSnapSettings.analysis.document) || DocumentAnalysisSettings.shouldRedactOptionalData(miSnapSettings2.analysis.document)) && !this.b)) {
                this.b = true;
            }
            MiSnapWorkflowStep.Behavior behavior = miSnapWorkflowStep2.c;
            if (behavior instanceof MiSnapWorkflowStep.Behavior.OnNfcMrzExtraction) {
                MiSnapSettings.UseCase useCase = miSnapSettings2.a;
                MiSnapSettings.Nfc nfc = miSnapSettings2.nfc;
                if (useCase == MiSnapSettings.UseCase.NFC) {
                    if (behavior.equals(MiSnapWorkflowStep.Behavior.OnNfcMrzExtraction.SkipStepIfMrzMissing.INSTANCE)) {
                        Mrz mrz2 = this.a;
                        if (mrz2 != null) {
                            nfc.a = mrz2;
                        }
                    } else if (behavior.equals(MiSnapWorkflowStep.Behavior.OnNfcMrzExtraction.UseMrzIfAvailable.INSTANCE) && (mrz = this.a) != null) {
                        nfc.a = mrz;
                    }
                }
                return new CombinedWorkflowHandler$StateMachine$Action$Next(miSnapWorkflowStep2);
            }
            if (behavior instanceof MiSnapWorkflowStep.Behavior.OnMissingNldBSN) {
                Mrz mrz3 = this.a;
                boolean z = false;
                if (mrz3 != null && (mrz3 instanceof MrzData)) {
                    MrzData mrzData = (MrzData) mrz3;
                    String str = mrzData.g;
                    StringBuilder sb = new StringBuilder();
                    int length = str.length();
                    for (int i = 0; i < length; i++) {
                        char charAt = str.charAt(i);
                        if (!CharsKt.isWhitespace(charAt)) {
                            sb.append(charAt);
                        }
                    }
                    String sb2 = sb.toString();
                    boolean isFieldLengthIncorrect = ValidationUtil.isFieldLengthIncorrect(sb2, ValidationUtil.i);
                    if (StringsKt__StringsJVMKt.startsWith(mrzData.f, "P", false) && Intrinsics.areEqual(mrzData.e, "NLD") && !isFieldLengthIncorrect) {
                        String obj = sb2.subSequence(0, 9).toString();
                        obj.getClass();
                        z = !ValidationUtil.c.matches(obj);
                    }
                }
                if (z) {
                }
                return CombinedWorkflowHandler$StateMachine$Action$Skip.INSTANCE;
            }
            Intrinsics.areEqual(behavior, MiSnapWorkflowStep.Behavior.None.INSTANCE);
            return new CombinedWorkflowHandler$StateMachine$Action$Next(miSnapWorkflowStep2);
        }
    }

    public abstract /* synthetic */ class b {
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

    public final class c implements Observer {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ CombinedWorkflowHandler a;

        public /* synthetic */ c(CombinedWorkflowHandler combinedWorkflowHandler, int i) {
            this.$r8$classId = i;
            this.a = combinedWorkflowHandler;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            int i = this.$r8$classId;
            CombinedWorkflowHandler combinedWorkflowHandler = this.a;
            switch (i) {
                case 0:
                    CombinedViewModel combinedViewModel = combinedWorkflowHandler.e;
                    MiSnapErrorResult miSnapErrorResult = (MiSnapErrorResult) obj;
                    if (miSnapErrorResult != null && combinedViewModel.isCombinedWorkflowConfigured()) {
                        combinedViewModel.a.add(new MiSnapWorkflowStep.Result.Error(miSnapErrorResult));
                        MibiData.i = null;
                        if (!(miSnapErrorResult.a instanceof MiSnapWorkflowError.CombinedWorkflow)) {
                            combinedWorkflowHandler.d.clearLiveData$workflow_release();
                            CombinedWorkflowHandler.access$processNextStep(combinedWorkflowHandler);
                            break;
                        } else {
                            combinedWorkflowHandler.a$6$1();
                            break;
                        }
                    }
                    break;
                default:
                    CombinedViewModel combinedViewModel2 = combinedWorkflowHandler.e;
                    MiSnapFinalResult miSnapFinalResult = (MiSnapFinalResult) obj;
                    if (miSnapFinalResult != null && combinedViewModel2.isCombinedWorkflowConfigured()) {
                        combinedViewModel2.a.add(new MiSnapWorkflowStep.Result.Success(miSnapFinalResult));
                        combinedWorkflowHandler.d.clearLiveData$workflow_release();
                        CombinedWorkflowHandler.access$processNextStep(combinedWorkflowHandler);
                        break;
                    }
                    break;
            }
        }
    }

    public CombinedWorkflowHandler(AppCompatActivity appCompatActivity) {
        this.b = appCompatActivity.getApplicationContext();
        this.c = new WeakReference(appCompatActivity);
        ViewModelStore viewModelStore = appCompatActivity.getViewModelStore();
        ViewModelProvider$Factory defaultViewModelProviderFactory = appCompatActivity.getDefaultViewModelProviderFactory();
        CreationExtras defaultViewModelCreationExtras = appCompatActivity.getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        SimpleActor simpleActor = new SimpleActor(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        ReflectionFactory reflectionFactory = Reflection.factory;
        KClass orCreateKotlinClass = reflectionFactory.getOrCreateKotlinClass(MiSnapWorkflowViewModel.class);
        String qualifiedName = orCreateKotlinClass.getQualifiedName();
        if (qualifiedName == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Local and anonymous classes can not be ViewModels");
            throw null;
        }
        this.d = (MiSnapWorkflowViewModel) simpleActor.getViewModel$lifecycle_viewmodel("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), orCreateKotlinClass);
        ViewModelStore viewModelStore2 = appCompatActivity.getViewModelStore();
        ViewModelProvider$Factory defaultViewModelProviderFactory2 = appCompatActivity.getDefaultViewModelProviderFactory();
        CreationExtras defaultViewModelCreationExtras2 = appCompatActivity.getDefaultViewModelCreationExtras();
        viewModelStore2.getClass();
        defaultViewModelProviderFactory2.getClass();
        defaultViewModelCreationExtras2.getClass();
        SimpleActor simpleActor2 = new SimpleActor(viewModelStore2, defaultViewModelProviderFactory2, defaultViewModelCreationExtras2);
        KClass orCreateKotlinClass2 = reflectionFactory.getOrCreateKotlinClass(CombinedViewModel.class);
        String qualifiedName2 = orCreateKotlinClass2.getQualifiedName();
        if (qualifiedName2 == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Local and anonymous classes can not be ViewModels");
            throw null;
        }
        this.e = (CombinedViewModel) simpleActor2.getViewModel$lifecycle_viewmodel("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName2), orCreateKotlinClass2);
        this.f = new MutableLiveData();
        this.g = new MutableLiveData();
        appCompatActivity.getLifecycle().addObserver(this);
    }

    public static final void access$processNextStep(CombinedWorkflowHandler combinedWorkflowHandler) {
        Unit unit;
        Context context = combinedWorkflowHandler.b;
        MiSnapWorkflowViewModel miSnapWorkflowViewModel = combinedWorkflowHandler.d;
        CombinedViewModel combinedViewModel = combinedWorkflowHandler.e;
        List list = CollectionsKt.toList(combinedViewModel.a);
        List list2 = combinedViewModel.b;
        StateMachine stateMachine = combinedViewModel.c;
        if (stateMachine != null) {
            try {
                TaskLoggerKt processNextState = stateMachine.processNextState((MiSnapWorkflowStep.Result) CollectionsKt.last(list), (MiSnapWorkflowStep) list2.get(list.size() - 1), (MiSnapWorkflowStep) CollectionsKt.getOrNull(list.size(), list2));
                if (processNextState instanceof CombinedWorkflowHandler$StateMachine$Action$Next) {
                    combinedWorkflowHandler.a$1(((CombinedWorkflowHandler$StateMachine$Action$Next) processNextState).a);
                } else if (processNextState instanceof CombinedWorkflowHandler$StateMachine$Action$Skip) {
                    if (MibiData.bindSession().isCurrentSession()) {
                        MibiData.reset$core_release(false);
                    }
                    context.getClass();
                    miSnapWorkflowViewModel.postError$workflow_release(context, MiSnapWorkflowError.CombinedWorkflowSkippedStep.INSTANCE);
                } else if (processNextState instanceof CombinedWorkflowHandler$StateMachine$Action$Finish) {
                    combinedWorkflowHandler.a$6$1();
                }
            } catch (Exception e) {
                Log.e("CombinedWorkflowHandler", "Error processing the next workflow step", e);
                context.getClass();
                miSnapWorkflowViewModel.postError$workflow_release(context, MiSnapWorkflowError.CombinedWorkflow.INSTANCE);
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            context.getClass();
            miSnapWorkflowViewModel.postError$workflow_release(context, MiSnapWorkflowError.CombinedWorkflow.INSTANCE);
        }
    }

    public final void a$1(MiSnapWorkflowStep miSnapWorkflowStep) {
        int i;
        Bundle bundle;
        AppCompatActivity appCompatActivity = (AppCompatActivity) this.c.get();
        Context context = this.b;
        MiSnapWorkflowViewModel miSnapWorkflowViewModel = this.d;
        if (appCompatActivity == null) {
            context.getClass();
            miSnapWorkflowViewModel.postError$workflow_release(context, MiSnapWorkflowError.SettingState.INSTANCE);
            return;
        }
        Integer num = miSnapWorkflowStep.b;
        MiSnapSettings miSnapSettings = miSnapWorkflowStep.a;
        if (num == null && miSnapSettings.a == MiSnapSettings.UseCase.NFC) {
            if (!NfcUtil.isNfcSupported(appCompatActivity)) {
                context.getClass();
                miSnapWorkflowViewModel.postError$workflow_release(context, MiSnapWorkflowError.Nfc.DeviceDoesNotSupportNfc.INSTANCE);
                return;
            }
            Mrz mrz = miSnapSettings.nfc.a;
            if (mrz != null && !NfcDocumentUtil.isDocumentNfcEnabled(appCompatActivity, mrz)) {
                context.getClass();
                miSnapWorkflowViewModel.postError$workflow_release(context, MiSnapWorkflowError.Nfc.DocumentNotNfcEnabled.INSTANCE);
                return;
            }
        }
        miSnapWorkflowViewModel.clearLiveData$workflow_release();
        miSnapWorkflowViewModel.h = null;
        miSnapWorkflowViewModel.i = null;
        miSnapWorkflowViewModel.b = new ArrayList();
        miSnapWorkflowViewModel.c = null;
        miSnapWorkflowViewModel.applySettings(miSnapSettings);
        MiSnapSettings.UseCase useCase = miSnapSettings.a;
        MutableLiveData mutableLiveData = this.g;
        if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
            mutableLiveData.setValue(miSnapWorkflowStep);
        } else {
            mutableLiveData.postValue(miSnapWorkflowStep);
        }
        Integer num2 = miSnapWorkflowStep.b;
        if (num2 != null) {
            i = num2.intValue();
        } else {
            int i2 = b.a[useCase.ordinal()];
            i = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? R.navigation.document_session_flow : R.navigation.voice_session_flow : R.navigation.nfc_reader_flow : R.navigation.face_session_flow : R.navigation.barcode_session_flow;
        }
        if (i != 0) {
            try {
                bundle = new Bundle();
                bundle.putInt("android-support-nav:fragment:graphId", i);
            } catch (Exception unused) {
                int i3 = b.a[useCase.ordinal()];
                miSnapWorkflowViewModel.postNavigationError$workflow_release(new NavigationError(i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? new NavigationAction$NavigateNfcSession() : new NavigationAction$NavigateNfcSession() : new NavigationAction$NavigateNfcSession() : new NavigationAction$NavigateNfcSession() : new NavigationAction$NavigateNfcSession(), null));
                return;
            }
        } else {
            bundle = null;
        }
        NavHostFragment navHostFragment = new NavHostFragment();
        if (bundle != null) {
            navHostFragment.setArguments(bundle);
        }
        FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        BackStackRecord backStackRecord = new BackStackRecord(supportFragmentManager);
        backStackRecord.replace(R.id.fragmentContainer, null, navHostFragment);
        backStackRecord.setPrimaryNavigationFragment(navHostFragment);
        backStackRecord.commit();
    }

    public final void a$6$1() {
        CombinedViewModel combinedViewModel = this.e;
        List list = CollectionsKt.toList(combinedViewModel.a);
        MutableLiveData mutableLiveData = this.f;
        if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
            mutableLiveData.setValue(list);
        } else {
            mutableLiveData.postValue(list);
        }
        combinedViewModel.b = EmptyList.INSTANCE;
        combinedViewModel.a.clear();
        combinedViewModel.c = null;
        MiSnapWorkflowViewModel miSnapWorkflowViewModel = this.d;
        miSnapWorkflowViewModel.clearLiveData$workflow_release();
        miSnapWorkflowViewModel.h = null;
        miSnapWorkflowViewModel.i = null;
        miSnapWorkflowViewModel.b = new ArrayList();
        miSnapWorkflowViewModel.c = null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        MiSnapWorkflowViewModel miSnapWorkflowViewModel = this.d;
        miSnapWorkflowViewModel.d.observe(lifecycleOwner, new c(this, 0));
        miSnapWorkflowViewModel.g.observe(lifecycleOwner, new c(this, 1));
    }

    public final void startCombinedWorkflow(List list) {
        list.getClass();
        CombinedViewModel combinedViewModel = this.e;
        if (combinedViewModel.isCombinedWorkflowConfigured()) {
            return;
        }
        EmptyList emptyList = EmptyList.INSTANCE;
        combinedViewModel.b = emptyList;
        combinedViewModel.a.clear();
        combinedViewModel.b = list;
        combinedViewModel.c = new StateMachine();
        if (combinedViewModel.isCombinedWorkflowConfigured()) {
            a$1((MiSnapWorkflowStep) CollectionsKt.first(combinedViewModel.b));
            return;
        }
        combinedViewModel.b = emptyList;
        combinedViewModel.a.clear();
        combinedViewModel.c = null;
        MiSnapWorkflowViewModel miSnapWorkflowViewModel = this.d;
        miSnapWorkflowViewModel.clearLiveData$workflow_release();
        miSnapWorkflowViewModel.h = null;
        miSnapWorkflowViewModel.i = null;
        miSnapWorkflowViewModel.b = new ArrayList();
        miSnapWorkflowViewModel.c = null;
    }
}
