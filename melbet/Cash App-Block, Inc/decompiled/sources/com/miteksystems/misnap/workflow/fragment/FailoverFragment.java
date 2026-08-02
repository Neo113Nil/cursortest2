package com.miteksystems.misnap.workflow.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.datastore.core.SimpleActor;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavDestination;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;
import androidx.viewbinding.ViewBindings;
import app.cash.redwood.widget.RedwoodLayoutKt$toAndroid$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.Extras;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.google.mlkit.vision.text.zzc;
import com.miteksystems.misnap.camera.a.b;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.core.UserAction;
import com.miteksystems.misnap.workflow.MiSnapWorkflowError;
import com.miteksystems.misnap.workflow.util.FailoverReasonsHandler;
import com.miteksystems.misnap.workflow.util.TextUtil;
import com.miteksystems.misnap.workflow.util.ViewBindingUtil$FragmentViewBindingDelegate;
import com.plaid.internal.Q0$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.Json;
import nl.dionsegijn.konfetti.core.Position;
import okhttp3.MultipartBody;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/FailoverFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "com/google/mlkit/vision/text/zzc", "WorkflowSettings", "workflow_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class FailoverFragment extends Fragment {
    public final ViewBindingUtil$FragmentViewBindingDelegate a;
    public List b;
    public boolean c;
    public Integer d;
    public final Lazy e;
    public final HelpFragment$$ExternalSyntheticLambda2 f;
    public final Lazy g;
    public final /* synthetic */ RedwoodLayoutKt$toAndroid$1 h;
    public static final /* synthetic */ KProperty[] i = {Reflection.factory.property1(new PropertyReference1Impl(FailoverFragment.class, "binding", "getBinding$workflow_release()Lcom/miteksystems/misnap/workflow/databinding/MisnapFragmentFailoverBinding;", 0))};
    public static final zzc Companion = new zzc(12);

    public abstract /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MiSnapSettings.UseCase.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[6] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[7] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr;
        }
    }

    public final /* synthetic */ class b extends FunctionReferenceImpl implements Function1 {
        public static final b a = new b(1, com.miteksystems.misnap.workflow.a.f.class, "bind", "bind(Landroid/view/View;)Lcom/miteksystems/misnap/workflow/databinding/MisnapFragmentFailoverBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            View view = (View) obj;
            view.getClass();
            int i = R.id.autoButton;
            MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.autoButton);
            if (materialButton != null) {
                i = R.id.failoverHeader;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.failoverHeader);
                if (frameLayout != null) {
                    i = R.id.failoverMessageRetry;
                    MaterialTextView materialTextView = (MaterialTextView) ViewBindings.findChildViewById(view, R.id.failoverMessageRetry);
                    if (materialTextView != null) {
                        i = R.id.failuresListContainer;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.failuresListContainer);
                        if (linearLayout != null) {
                            i = R.id.guidelineBottomContent;
                            if (((Guideline) ViewBindings.findChildViewById(view, R.id.guidelineBottomContent)) != null) {
                                i = R.id.guidelineButtonsDivider;
                                if (((Guideline) ViewBindings.findChildViewById(view, R.id.guidelineButtonsDivider)) != null) {
                                    i = R.id.guidelineEndContent;
                                    if (((Guideline) ViewBindings.findChildViewById(view, R.id.guidelineEndContent)) != null) {
                                        i = R.id.guidelineFooterTop;
                                        if (((Guideline) ViewBindings.findChildViewById(view, R.id.guidelineFooterTop)) != null) {
                                            i = R.id.guidelineStartContent;
                                            if (((Guideline) ViewBindings.findChildViewById(view, R.id.guidelineStartContent)) != null) {
                                                i = R.id.guidelineTopContent;
                                                if (((Guideline) ViewBindings.findChildViewById(view, R.id.guidelineTopContent)) != null) {
                                                    i = R.id.manualButton;
                                                    MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.manualButton);
                                                    if (materialButton2 != null) {
                                                        return new com.miteksystems.misnap.workflow.a.f((ConstraintLayout) view, materialButton, frameLayout, materialTextView, linearLayout, materialButton2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
            return null;
        }
    }

    public final class c extends Lambda implements Function0 {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ FailoverFragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(FailoverFragment failoverFragment, int i) {
            super(0);
            this.$r8$classId = i;
            this.a = failoverFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object failure;
            CharSequence charSequence;
            int i = this.$r8$classId;
            FailoverFragment failoverFragment = this.a;
            switch (i) {
                case 0:
                    try {
                        Result.Companion companion = Result.Companion;
                        NavDestination currentDestination$navigation_runtime_release = FragmentKt.findNavController(failoverFragment).impl.getCurrentDestination$navigation_runtime_release();
                        failure = (currentDestination$navigation_runtime_release == null || (charSequence = currentDestination$navigation_runtime_release.label) == null) ? null : charSequence.toString();
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        failure = new Result.Failure(th);
                    }
                    return (String) (failure instanceof Result.Failure ? null : failure);
                default:
                    FragmentActivity requireActivity = failoverFragment.requireActivity();
                    requireActivity.getClass();
                    ViewModelStore viewModelStore = requireActivity.getViewModelStore();
                    ViewModelProvider$Factory defaultViewModelProviderFactory = requireActivity.getDefaultViewModelProviderFactory();
                    CreationExtras defaultViewModelCreationExtras = requireActivity.getDefaultViewModelCreationExtras();
                    viewModelStore.getClass();
                    defaultViewModelProviderFactory.getClass();
                    defaultViewModelCreationExtras.getClass();
                    SimpleActor simpleActor = new SimpleActor(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
                    KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(MiSnapWorkflowViewModel.class);
                    String qualifiedName = orCreateKotlinClass.getQualifiedName();
                    if (qualifiedName != null) {
                        return (MiSnapWorkflowViewModel) simpleActor.getViewModel$lifecycle_viewmodel("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), orCreateKotlinClass);
                    }
                    a$$ExternalSyntheticBUOutline0.m$3("Local and anonymous classes can not be ViewModels");
                    return null;
            }
        }
    }

    public FailoverFragment() {
        super(R.layout.misnap_fragment_failover);
        this.a = new ViewBindingUtil$FragmentViewBindingDelegate(this, b.a);
        this.b = EmptyList.INSTANCE;
        this.c = true;
        this.e = LazyKt.lazy(new c(this, 0));
        int i2 = 4;
        this.f = new HelpFragment$$ExternalSyntheticLambda2(this, i2);
        this.g = LazyKt.lazy(new c(this, 1));
        this.h = new RedwoodLayoutKt$toAndroid$1(this, i2);
    }

    public final String a$3() {
        return (String) this.e.getValue();
    }

    public final MiSnapWorkflowViewModel b$2() {
        return (MiSnapWorkflowViewModel) this.g.getValue();
    }

    public final Integer b$3(MiSnapSettings miSnapSettings, String str) {
        Object obj;
        Integer num;
        String str2;
        if (str == null || (str2 = miSnapSettings.workflow.get(str)) == null) {
            obj = null;
        } else {
            Json.Default r0 = Json.Default;
            r0.getClass();
            obj = r0.decodeFromString(str2, WorkflowSettings.Companion.serializer());
        }
        WorkflowSettings workflowSettings = (WorkflowSettings) obj;
        if (workflowSettings != null && (num = workflowSettings.a) != null) {
            return num;
        }
        Integer d = MultipartBody.Companion.d(getArguments(), "headerLayoutId");
        if (d != null) {
            return d;
        }
        Companion.getClass();
        return zzc.getDefaultWorkflowSettings(miSnapSettings).a;
    }

    public final /* synthetic */ com.miteksystems.misnap.workflow.a.f getBinding$workflow_release() {
        return (com.miteksystems.misnap.workflow.a.f) this.a.getValue((Fragment) this, i[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Integer num;
        super.onDestroyView();
        this.h.remove();
        if (this.c) {
            try {
                FragmentKt.findNavController(this).removeOnDestinationChangedListener(this.f);
            } catch (Exception unused) {
                if (requireActivity().isChangingConfigurations() || (num = this.d) == null) {
                    return;
                }
                requireActivity().setRequestedOrientation(num.intValue());
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        List list = this.b;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Json.Default.encodeToString(UserAction.Companion.serializer(), (UserAction) it.next()));
        }
        bundle.putStringArray("failoverReasonsListStateKey", (String[]) arrayList.toArray(new String[0]));
        Integer num = this.d;
        if (num != null) {
            bundle.putInt("orientationKey", num.intValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        Boolean b2;
        int intValue;
        Object obj2;
        Integer d;
        Integer d2;
        List subList;
        int i2;
        String str;
        String str2;
        int intValue2;
        String str3;
        ?? r5;
        view.getClass();
        super.onViewCreated(view, bundle);
        StringBuilder sb = new StringBuilder();
        if (bundle != null) {
            if (bundle.containsKey("failoverReasonsListStateKey")) {
                String[] stringArray = bundle.getStringArray("failoverReasonsListStateKey");
                if (stringArray != null) {
                    r5 = new ArrayList(stringArray.length);
                    for (String str4 : stringArray) {
                        Json.Default r9 = Json.Default;
                        KSerializer serializer = UserAction.Companion.serializer();
                        str4.getClass();
                        r5.add((UserAction) r9.decodeFromString(str4, serializer));
                    }
                } else {
                    r5 = EmptyList.INSTANCE;
                }
                this.b = r5;
            }
            if (bundle.containsKey("orientationKey")) {
                this.d = Integer.valueOf(bundle.getInt("orientationKey"));
            }
        }
        MiSnapSettings miSnapSettings = (MiSnapSettings) b$2().f.getValue();
        Object obj3 = null;
        if (miSnapSettings != null) {
            MiSnapSettings.UseCase useCase = miSnapSettings.a;
            MiSnapSettings.Workflow workflow = miSnapSettings.workflow;
            if (Position.shouldShowExitConfirmationDialog(workflow, useCase)) {
                requireActivity().getOnBackPressedDispatcher().addCallback(this.h, requireActivity());
            }
            String a$3 = a$3();
            if (a$3 == null || (str3 = workflow.get(a$3)) == null) {
                obj = null;
            } else {
                Json.Default r8 = Json.Default;
                r8.getClass();
                obj = r8.decodeFromString(str3, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings = (WorkflowSettings) obj;
            zzc zzcVar = Companion;
            if ((workflowSettings == null || (b2 = workflowSettings.b) == null) && (b2 = MultipartBody.Companion.b(getArguments(), "handleOrientation")) == null) {
                zzcVar.getClass();
                b2 = Boolean.TRUE;
            }
            boolean booleanValue = b2.booleanValue();
            this.c = booleanValue;
            if (booleanValue) {
                try {
                    Result.Companion companion = Result.Companion;
                    FragmentKt.findNavController(this).addOnDestinationChangedListener(this.f);
                } catch (Throwable unused) {
                    Result.Companion companion2 = Result.Companion;
                }
                Integer forcedOrientation = Position.getForcedOrientation(workflow, useCase);
                if (forcedOrientation != null && requireActivity().getRequestedOrientation() != (intValue = forcedOrientation.intValue())) {
                    this.d = Integer.valueOf(requireActivity().getRequestedOrientation());
                    requireActivity().setRequestedOrientation(intValue);
                }
            }
            getBinding$workflow_release().b.setOnClickListener(new Q0$$ExternalSyntheticLambda0(this, 14));
            getBinding$workflow_release().n.setOnClickListener(new BottomSheet$$ExternalSyntheticLambda0(5, miSnapSettings, this));
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = "";
            Integer b$3 = b$3(miSnapSettings, a$3());
            if (b$3 != null && (intValue2 = b$3.intValue()) != 0) {
                View inflate = LayoutInflater.from(requireActivity()).inflate(intValue2, (ViewGroup) getBinding$workflow_release().c, false);
                getBinding$workflow_release().c.addView(inflate);
                ref$ObjectRef.element = String.valueOf(inflate.getContentDescription());
                StringBuilder sb2 = new StringBuilder();
                sb2.append((Object) inflate.getContentDescription());
                sb2.append('\n');
                sb.append(sb2.toString());
            }
            String a$32 = a$3();
            if (a$32 == null || (str2 = workflow.get(a$32)) == null) {
                obj2 = null;
            } else {
                Json.Default r12 = Json.Default;
                r12.getClass();
                obj2 = r12.decodeFromString(str2, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings2 = (WorkflowSettings) obj2;
            if ((workflowSettings2 == null || (d = workflowSettings2.c) == null) && (d = MultipartBody.Companion.d(getArguments(), "maxReasons")) == null) {
                zzcVar.getClass();
                d = 2;
            }
            String a$33 = a$3();
            if (a$33 != null && (str = workflow.get(a$33)) != null) {
                Json.Default r4 = Json.Default;
                r4.getClass();
                obj3 = r4.decodeFromString(str, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings3 = (WorkflowSettings) obj3;
            if ((workflowSettings3 == null || (d2 = workflowSettings3.d) == null) && (d2 = MultipartBody.Companion.d(getArguments(), "minReasonPercentage")) == null) {
                zzcVar.getClass();
                d2 = 25;
            }
            FailoverReasonsHandler failoverReasonsHandler = b$2().a;
            int intValue3 = d.intValue();
            int intValue4 = d2.intValue();
            LinkedHashMap linkedHashMap = failoverReasonsHandler.a;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                int intValue5 = ((Number) entry.getValue()).intValue();
                int i3 = failoverReasonsHandler.b;
                if ((i3 == 0 ? 0 : (int) ((intValue5 / i3) * 100.0f)) >= intValue4) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            int i4 = 1;
            if (linkedHashMap2.isEmpty()) {
                subList = CollectionsKt__CollectionsJVMKt.listOf(UserAction.NONE.INSTANCE);
            } else {
                List sortedWith = CollectionsKt.sortedWith(linkedHashMap2.entrySet(), new b.C0008b(i4));
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith, 10));
                Iterator it = sortedWith.iterator();
                while (it.hasNext()) {
                    arrayList.add((UserAction) ((Map.Entry) it.next()).getKey());
                }
                subList = arrayList.size() > intValue3 ? arrayList.subList(0, intValue3) : arrayList;
            }
            if (this.b.isEmpty()) {
                this.b = subList;
            }
            FailoverReasonsHandler failoverReasonsHandler2 = b$2().a;
            failoverReasonsHandler2.getClass();
            failoverReasonsHandler2.a = FailoverReasonsHandler.a();
            failoverReasonsHandler2.b = 0;
            for (UserAction userAction : this.b) {
                if (Intrinsics.areEqual(userAction, UserAction.Document.NOT_FOUND.INSTANCE)) {
                    i2 = R.string.misnapWorkflowFailoverFragmentDocumentNotFoundReason;
                } else if (Intrinsics.areEqual(userAction, UserAction.Document.MRZ_NOT_FOUND.INSTANCE)) {
                    i2 = R.string.misnapWorkflowFailoverFragmentDocumentMrzConfidenceReason;
                } else if (Intrinsics.areEqual(userAction, UserAction.Document.REDUCE_GLARE.INSTANCE)) {
                    i2 = R.string.misnapWorkflowFailoverFragmentDocumentGlareReason;
                } else if (Intrinsics.areEqual(userAction, UserAction.Document.STRAIGHTEN.INSTANCE)) {
                    i2 = R.string.misnapWorkflowFailoverFragmentDocumentBadAngleReason;
                } else if (Intrinsics.areEqual(userAction, UserAction.Document.TOO_BRIGHT.INSTANCE)) {
                    i2 = R.string.misnapWorkflowFailoverFragmentDocumentMaxBrightnessReason;
                } else if (Intrinsics.areEqual(userAction, UserAction.Document.TOO_CLOSE.INSTANCE)) {
                    i2 = R.string.misnapWorkflowFailoverFragmentDocumentMinPaddingReason;
                } else if (Intrinsics.areEqual(userAction, UserAction.Document.TOO_DARK.INSTANCE)) {
                    i2 = R.string.misnapWorkflowFailoverFragmentDocumentMinBrightnessReason;
                } else if (Intrinsics.areEqual(userAction, UserAction.Document.TOO_FAR.INSTANCE)) {
                    i2 = R.string.misnapWorkflowFailoverFragmentDocumentMinHorizontalFillReason;
                } else if (Intrinsics.areEqual(userAction, UserAction.Document.USE_DARK_BACKGROUND.INSTANCE)) {
                    i2 = R.string.misnapWorkflowFailoverFragmentDocumentLowContrastReason;
                } else if (Intrinsics.areEqual(userAction, UserAction.Document.USE_PLAIN_BACKGROUND.INSTANCE)) {
                    i2 = R.string.misnapWorkflowFailoverFragmentDocumentBusyBackgroundReason;
                } else {
                    if (Intrinsics.areEqual(userAction, UserAction.Document.WRONG_DOCUMENT.INSTANCE)) {
                        int i5 = a.a[useCase.ordinal()];
                        i2 = i5 != i4 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? R.string.misnapWorkflowFailoverFragmentDocumentWrongDocumentGenericReason : R.string.misnapWorkflowFailoverFragmentDocumentWrongDocumentCheckBackReason : R.string.misnapWorkflowFailoverFragmentDocumentWrongDocumentCheckFrontReason : R.string.misnapWorkflowFailoverFragmentDocumentWrongDocumentIdBackReason : R.string.misnapWorkflowFailoverFragmentDocumentWrongDocumentIdFrontReason : R.string.misnapWorkflowFailoverFragmentDocumentWrongDocumentPassportReason;
                    } else if (Intrinsics.areEqual(userAction, UserAction.Face.NOT_FOUND.INSTANCE)) {
                        i2 = R.string.misnapWorkflowFailoverFragmentFaceNotFoundReason;
                    } else if (Intrinsics.areEqual(userAction, UserAction.Face.OPEN_EYES.INSTANCE)) {
                        i2 = R.string.misnapWorkflowFailoverFragmentFaceEyesOpenReason;
                    } else if (Intrinsics.areEqual(userAction, UserAction.Face.TOO_CLOSE.INSTANCE)) {
                        i2 = R.string.misnapWorkflowFailoverFragmentFaceMinPaddingReason;
                    } else if (Intrinsics.areEqual(userAction, UserAction.Face.TOO_FAR.INSTANCE)) {
                        i2 = R.string.misnapWorkflowFailoverFragmentFaceMinFillReason;
                    } else if (Intrinsics.areEqual(userAction, UserAction.Face.MULTIPLE_FACES.INSTANCE)) {
                        i2 = R.string.misnapWorkflowFailoverFragmentFaceMultipleFacesReason;
                    } else if (Intrinsics.areEqual(userAction, UserAction.Face.STRAIGHTEN.INSTANCE)) {
                        i2 = R.string.misnapWorkflowFailoverFragmentFaceBadAngleReason;
                    } else if (Intrinsics.areEqual(userAction, UserAction.Barcode.NOT_FOUND.INSTANCE)) {
                        i2 = R.string.misnapWorkflowFailoverFragmentBarcodeNotFoundReason;
                    } else {
                        int i6 = a.a[useCase.ordinal()];
                        i2 = i6 != 6 ? i6 != 7 ? R.string.misnapWorkflowFailoverFragmentDocumentDefaultReason : R.string.misnapWorkflowFailoverFragmentFaceDefaultReason : R.string.misnapWorkflowFailoverFragmentBarcodeDefaultReason;
                    }
                    String string2 = getString(i2);
                    string2.getClass();
                    sb.append(string2.concat("\n"));
                    LinearLayout linearLayout = getBinding$workflow_release().e;
                    View inflate2 = getLayoutInflater().inflate(R.layout.misnap_failover_reason, (ViewGroup) getBinding$workflow_release().e, false);
                    inflate2.getClass();
                    MaterialTextView materialTextView = (MaterialTextView) inflate2;
                    materialTextView.setText(string2);
                    linearLayout.addView(materialTextView);
                    i4 = 1;
                }
                String string22 = getString(i2);
                string22.getClass();
                sb.append(string22.concat("\n"));
                LinearLayout linearLayout2 = getBinding$workflow_release().e;
                View inflate22 = getLayoutInflater().inflate(R.layout.misnap_failover_reason, (ViewGroup) getBinding$workflow_release().e, false);
                inflate22.getClass();
                MaterialTextView materialTextView2 = (MaterialTextView) inflate22;
                materialTextView2.setText(string22);
                linearLayout2.addView(materialTextView2);
                i4 = 1;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append((Object) getBinding$workflow_release().d.getContentDescription());
            sb3.append('\n');
            sb.append(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append((Object) getBinding$workflow_release().n.getContentDescription());
            sb4.append('\n');
            sb.append(sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append((Object) getBinding$workflow_release().b.getContentDescription());
            sb5.append('\n');
            sb.append(sb5.toString());
            Integer b$32 = b$3(miSnapSettings, a$3());
            zzcVar.getClass();
            if (Intrinsics.areEqual(b$32, zzc.getDefaultWorkflowSettings(miSnapSettings).a)) {
                FrameLayout frameLayout = getBinding$workflow_release().c;
                ViewCompat.setAccessibilityDelegate(frameLayout, new f(frameLayout, ref$ObjectRef));
                getBinding$workflow_release().c.setContentDescription(sb);
            }
            Iterator it2 = TextUtil.getTextViews$workflow_release(getBinding$workflow_release().e).iterator();
            while (it2.hasNext()) {
                TextView textView = (TextView) it2.next();
                textView.getClass();
                float f2 = textView.getContext().getResources().getConfiguration().fontScale;
                if (f2 > 1.0f) {
                    com.miteksystems.misnap.workflow.a.b.a(textView, f2);
                }
            }
            Iterator it3 = TextUtil.getTextViews$workflow_release(getBinding$workflow_release().c).iterator();
            while (it3.hasNext()) {
                TextView textView2 = (TextView) it3.next();
                textView2.getClass();
                float f3 = textView2.getContext().getResources().getConfiguration().fontScale;
                if (f3 > 1.0f) {
                    com.miteksystems.misnap.workflow.a.b.a(textView2, f3);
                }
            }
            MaterialTextView materialTextView3 = getBinding$workflow_release().d;
            float f4 = materialTextView3.getContext().getResources().getConfiguration().fontScale;
            if (f4 > 1.0f) {
                com.miteksystems.misnap.workflow.a.b.a(materialTextView3, f4);
            }
            obj3 = Unit.INSTANCE;
        }
        if (obj3 == null) {
            MiSnapWorkflowViewModel b$2 = b$2();
            Context requireContext = requireContext();
            requireContext.getClass();
            b$2.postError$workflow_release(requireContext, MiSnapWorkflowError.SettingState.INSTANCE);
        }
    }

    public final class f extends AccessibilityDelegateCompat {
        public final /* synthetic */ int $r8$classId;
        public final Object a;
        public final Object b;

        public f(RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate) {
            this.$r8$classId = 1;
            this.b = new WeakHashMap();
            this.a = recyclerViewAccessibilityDelegate;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            switch (this.$r8$classId) {
                case 1:
                    AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) ((WeakHashMap) this.b).get(view);
                    return accessibilityDelegateCompat != null ? accessibilityDelegateCompat.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
                default:
                    return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public Extras.Key getAccessibilityNodeProvider(View view) {
            switch (this.$r8$classId) {
                case 1:
                    AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) ((WeakHashMap) this.b).get(view);
                    if (accessibilityDelegateCompat == null) {
                        break;
                    } else {
                        break;
                    }
            }
            return super.getAccessibilityNodeProvider(view);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            int i = this.$r8$classId;
            Object obj = this.b;
            switch (i) {
                case 0:
                    view.getClass();
                    accessibilityEvent.getClass();
                    super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                    if (accessibilityEvent.getEventType() == 65536) {
                        ((FrameLayout) this.a).setContentDescription((CharSequence) ((Ref$ObjectRef) obj).element);
                        break;
                    }
                    break;
                default:
                    AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) ((WeakHashMap) obj).get(view);
                    if (accessibilityDelegateCompat == null) {
                        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                        break;
                    } else {
                        accessibilityDelegateCompat.onInitializeAccessibilityEvent(view, accessibilityEvent);
                        break;
                    }
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            RecyclerView.LayoutManager layoutManager;
            switch (this.$r8$classId) {
                case 1:
                    RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate = (RecyclerViewAccessibilityDelegate) this.a;
                    boolean hasPendingAdapterUpdates = recyclerViewAccessibilityDelegate.mRecyclerView.hasPendingAdapterUpdates();
                    View.AccessibilityDelegate accessibilityDelegate = this.mOriginalDelegate;
                    if (!hasPendingAdapterUpdates && (layoutManager = recyclerViewAccessibilityDelegate.mRecyclerView.mLayout) != null) {
                        layoutManager.onInitializeAccessibilityNodeInfoForItem(view, accessibilityNodeInfoCompat);
                        AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) ((WeakHashMap) this.b).get(view);
                        if (accessibilityDelegateCompat == null) {
                            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.unwrap());
                            break;
                        } else {
                            accessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                            break;
                        }
                    } else {
                        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.unwrap());
                        break;
                    }
                    break;
                default:
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                    break;
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            switch (this.$r8$classId) {
                case 1:
                    AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) ((WeakHashMap) this.b).get(view);
                    if (accessibilityDelegateCompat == null) {
                        super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                        break;
                    } else {
                        accessibilityDelegateCompat.onPopulateAccessibilityEvent(view, accessibilityEvent);
                        break;
                    }
                default:
                    super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                    break;
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            switch (this.$r8$classId) {
                case 1:
                    AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) ((WeakHashMap) this.b).get(viewGroup);
                    return accessibilityDelegateCompat != null ? accessibilityDelegateCompat.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
                default:
                    return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            switch (this.$r8$classId) {
                case 1:
                    RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate = (RecyclerViewAccessibilityDelegate) this.a;
                    RecyclerView recyclerView = recyclerViewAccessibilityDelegate.mRecyclerView;
                    RecyclerView recyclerView2 = recyclerViewAccessibilityDelegate.mRecyclerView;
                    if (!recyclerView.hasPendingAdapterUpdates() && recyclerView2.mLayout != null) {
                        AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) ((WeakHashMap) this.b).get(view);
                        if (accessibilityDelegateCompat == null ? !super.performAccessibilityAction(view, i, bundle) : !accessibilityDelegateCompat.performAccessibilityAction(view, i, bundle)) {
                            RecyclerView.Recycler recycler = recyclerView2.mLayout.mRecyclerView.mRecycler;
                            break;
                        }
                    } else {
                        break;
                    }
                    break;
            }
            return super.performAccessibilityAction(view, i, bundle);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void sendAccessibilityEvent(View view, int i) {
            switch (this.$r8$classId) {
                case 1:
                    AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) ((WeakHashMap) this.b).get(view);
                    if (accessibilityDelegateCompat == null) {
                        super.sendAccessibilityEvent(view, i);
                        break;
                    } else {
                        accessibilityDelegateCompat.sendAccessibilityEvent(view, i);
                        break;
                    }
                default:
                    super.sendAccessibilityEvent(view, i);
                    break;
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            switch (this.$r8$classId) {
                case 1:
                    AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) ((WeakHashMap) this.b).get(view);
                    if (accessibilityDelegateCompat == null) {
                        super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
                        break;
                    } else {
                        accessibilityDelegateCompat.sendAccessibilityEventUnchecked(view, accessibilityEvent);
                        break;
                    }
                default:
                    super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
                    break;
            }
        }

        public f(FrameLayout frameLayout, Ref$ObjectRef ref$ObjectRef) {
            this.$r8$classId = 0;
            this.a = frameLayout;
            this.b = ref$ObjectRef;
        }
    }

    @Serializable
    public final class WorkflowSettings {
        public static final Companion Companion = new Companion();
        public final Integer a;
        public final Boolean b;
        public final Integer c;
        public final Integer d;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/fragment/FailoverFragment$WorkflowSettings$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/fragment/FailoverFragment$WorkflowSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return FailoverFragment$WorkflowSettings$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ WorkflowSettings(int i, Integer num, Boolean bool, Integer num2, Integer num3) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = num;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = bool;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = num2;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = num3;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WorkflowSettings)) {
                return false;
            }
            WorkflowSettings workflowSettings = (WorkflowSettings) obj;
            return Intrinsics.areEqual(this.a, workflowSettings.a) && Intrinsics.areEqual(this.b, workflowSettings.b) && Intrinsics.areEqual(this.c, workflowSettings.c) && Intrinsics.areEqual(this.d, workflowSettings.d);
        }

        public final int hashCode() {
            Integer num = this.a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Boolean bool = this.b;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num2 = this.c;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.d;
            return hashCode3 + (num3 != null ? num3.hashCode() : 0);
        }

        public final String toString() {
            Json.Default r0 = Json.Default;
            r0.getClass();
            return r0.encodeToString(Companion.serializer(), this);
        }

        public WorkflowSettings(Integer num) {
            Boolean bool = Boolean.TRUE;
            this.a = num;
            this.b = bool;
            this.c = 2;
            this.d = 25;
        }
    }
}
