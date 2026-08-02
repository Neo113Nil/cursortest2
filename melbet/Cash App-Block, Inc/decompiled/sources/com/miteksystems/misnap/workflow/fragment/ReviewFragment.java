package com.miteksystems.misnap.workflow.fragment;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.datastore.core.SimpleActor;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavDestination;
import androidx.navigation.fragment.FragmentKt;
import androidx.viewbinding.ViewBindings;
import app.cash.redwood.widget.RedwoodLayoutKt$toAndroid$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.e;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.core.MibiData;
import com.miteksystems.misnap.workflow.MiSnapFinalResult;
import com.miteksystems.misnap.workflow.MiSnapWorkflowError;
import com.miteksystems.misnap.workflow.a.l;
import com.miteksystems.misnap.workflow.fragment.NavigationAction$Review;
import com.miteksystems.misnap.workflow.util.ViewBindingUtil$FragmentViewBindingDelegate;
import com.squareup.cash.R;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.Json;
import nl.dionsegijn.konfetti.core.Position;
import okhttp3.MultipartBody;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/ReviewFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "com/fillr/e", "WorkflowSettings", "workflow_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ReviewFragment extends Fragment {
    public final ViewBindingUtil$FragmentViewBindingDelegate a;
    public boolean b;
    public Integer c;
    public final MibiData.Session d;
    public final Lazy e;
    public final HelpFragment$$ExternalSyntheticLambda2 f;
    public final Lazy g;
    public final /* synthetic */ RedwoodLayoutKt$toAndroid$1 h;
    public static final /* synthetic */ KProperty[] i = {Reflection.factory.property1(new PropertyReference1Impl(ReviewFragment.class, "binding", "getBinding$workflow_release()Lcom/miteksystems/misnap/workflow/databinding/MisnapFragmentReviewBinding;", 0))};
    public static final e Companion = new e();

    @Serializable
    public final class WorkflowSettings {
        public static final Companion Companion = new Companion();
        public final Boolean a;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/fragment/ReviewFragment$WorkflowSettings$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/fragment/ReviewFragment$WorkflowSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return ReviewFragment$WorkflowSettings$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ WorkflowSettings(int i, Boolean bool) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = bool;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WorkflowSettings) && Intrinsics.areEqual(this.a, ((WorkflowSettings) obj).a);
        }

        public final int hashCode() {
            Boolean bool = this.a;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final String toString() {
            Json.Default r0 = Json.Default;
            r0.getClass();
            return r0.encodeToString(Companion.serializer(), this);
        }
    }

    public abstract /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MiSnapSettings.UseCase.values().length];
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[2] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            a = iArr;
        }
    }

    public final /* synthetic */ class b extends FunctionReferenceImpl implements Function1 {
        public static final b a = new b(1, l.class, "bind", "bind(Landroid/view/View;)Lcom/miteksystems/misnap/workflow/databinding/MisnapFragmentReviewBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            View view = (View) obj;
            view.getClass();
            int i = R.id.guidelineBottomContent;
            if (((Guideline) ViewBindings.findChildViewById(view, R.id.guidelineBottomContent)) != null) {
                i = R.id.guidelineEndContent;
                if (((Guideline) ViewBindings.findChildViewById(view, R.id.guidelineEndContent)) != null) {
                    i = R.id.guidelineStartContent;
                    if (((Guideline) ViewBindings.findChildViewById(view, R.id.guidelineStartContent)) != null) {
                        i = R.id.guidelineTopContent;
                        if (((Guideline) ViewBindings.findChildViewById(view, R.id.guidelineTopContent)) != null) {
                            i = R.id.imagePreview;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imagePreview);
                            if (appCompatImageView != null) {
                                i = R.id.retakeButton;
                                MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.retakeButton);
                                if (materialButton != null) {
                                    i = R.id.reviewText;
                                    MaterialTextView materialTextView = (MaterialTextView) ViewBindings.findChildViewById(view, R.id.reviewText);
                                    if (materialTextView != null) {
                                        i = R.id.satisfiedButton;
                                        MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.satisfiedButton);
                                        if (materialButton2 != null) {
                                            return new l((ConstraintLayout) view, appCompatImageView, materialButton, materialTextView, materialButton2);
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
        public final /* synthetic */ ReviewFragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(ReviewFragment reviewFragment, int i) {
            super(0);
            this.$r8$classId = i;
            this.a = reviewFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object failure;
            CharSequence charSequence;
            int i = this.$r8$classId;
            ReviewFragment reviewFragment = this.a;
            switch (i) {
                case 0:
                    try {
                        Result.Companion companion = Result.Companion;
                        NavDestination currentDestination$navigation_runtime_release = FragmentKt.findNavController(reviewFragment).impl.getCurrentDestination$navigation_runtime_release();
                        failure = (currentDestination$navigation_runtime_release == null || (charSequence = currentDestination$navigation_runtime_release.label) == null) ? null : charSequence.toString();
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        failure = new Result.Failure(th);
                    }
                    return (String) (failure instanceof Result.Failure ? null : failure);
                default:
                    FragmentActivity requireActivity = reviewFragment.requireActivity();
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

    public ReviewFragment() {
        super(R.layout.misnap_fragment_review);
        this.a = new ViewBindingUtil$FragmentViewBindingDelegate(this, b.a);
        this.b = true;
        this.d = MibiData.bindSession();
        this.e = LazyKt.lazy(new c(this, 0));
        this.f = new HelpFragment$$ExternalSyntheticLambda2(this, 9);
        this.g = LazyKt.lazy(new c(this, 1));
        this.h = new RedwoodLayoutKt$toAndroid$1(this, 6);
    }

    public final MiSnapWorkflowViewModel b$6() {
        return (MiSnapWorkflowViewModel) this.g.getValue();
    }

    public final /* synthetic */ l getBinding$workflow_release() {
        return (l) this.a.getValue((Fragment) this, i[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Integer num;
        super.onDestroyView();
        this.h.remove();
        if (this.b) {
            try {
                FragmentKt.findNavController(this).removeOnDestinationChangedListener(this.f);
            } catch (Exception unused) {
                if (requireActivity().isChangingConfigurations() || (num = this.c) == null) {
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
        Integer num = this.c;
        if (num != null) {
            bundle.putInt("orientationKey", num.intValue());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Unit unit;
        Bitmap decodeByteArray;
        int i2;
        Object obj;
        Boolean b2;
        int intValue;
        String str;
        view.getClass();
        super.onViewCreated(view, bundle);
        if (bundle != null && bundle.containsKey("orientationKey")) {
            this.c = Integer.valueOf(bundle.getInt("orientationKey"));
        }
        MiSnapSettings miSnapSettings = (MiSnapSettings) b$6().f.getValue();
        final int i3 = 1;
        final int i4 = 0;
        if (miSnapSettings != null) {
            MiSnapSettings.Workflow workflow = miSnapSettings.workflow;
            MiSnapSettings.UseCase useCase = miSnapSettings.a;
            switch (a.a[useCase.ordinal()]) {
                case 1:
                case 2:
                    i2 = R.string.misnapWorkflowReviewFragmentCheckPreviewContentDescription;
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    i2 = R.string.misnapWorkflowReviewFragmentDocumentPreviewContentDescription;
                    break;
                case 7:
                    i2 = R.string.misnapWorkflowReviewFragmentBarcodePreviewContentDescription;
                    break;
                case 8:
                    i2 = R.string.misnapWorkflowReviewFragmentSelfiePreviewContentDescription;
                    break;
                case 9:
                case 10:
                    i2 = 0;
                    break;
                default:
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
            }
            if (i2 != 0) {
                getBinding$workflow_release().l.setContentDescription(getString(i2));
            }
            if (Position.shouldShowExitConfirmationDialog(workflow, useCase)) {
                requireActivity().getOnBackPressedDispatcher().addCallback(this.h, requireActivity());
            }
            String str2 = (String) this.e.getValue();
            if (str2 == null || (str = workflow.get(str2)) == null) {
                obj = null;
            } else {
                Json.Default r4 = Json.Default;
                r4.getClass();
                obj = r4.decodeFromString(str, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings = (WorkflowSettings) obj;
            if ((workflowSettings == null || (b2 = workflowSettings.a) == null) && (b2 = MultipartBody.Companion.b(getArguments(), "handleOrientation")) == null) {
                Companion.getClass();
                b2 = Boolean.TRUE;
            }
            boolean booleanValue = b2.booleanValue();
            this.b = booleanValue;
            if (booleanValue) {
                try {
                    Result.Companion companion = Result.Companion;
                    FragmentKt.findNavController(this).addOnDestinationChangedListener(this.f);
                } catch (Throwable unused) {
                    Result.Companion companion2 = Result.Companion;
                }
                Integer forcedOrientation = Position.getForcedOrientation(workflow, useCase);
                if (forcedOrientation != null && requireActivity().getRequestedOrientation() != (intValue = forcedOrientation.intValue())) {
                    this.c = Integer.valueOf(requireActivity().getRequestedOrientation());
                    requireActivity().setRequestedOrientation(intValue);
                }
            }
            getBinding$workflow_release().o.setOnClickListener(new View.OnClickListener(this) { // from class: com.miteksystems.misnap.workflow.fragment.ReviewFragment$$ExternalSyntheticLambda0
                public final /* synthetic */ ReviewFragment f$0;

                {
                    this.f$0 = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i5 = i4;
                    ReviewFragment reviewFragment = this.f$0;
                    switch (i5) {
                        case 0:
                            e eVar = ReviewFragment.Companion;
                            try {
                                MiSnapFinalResult miSnapFinalResult = reviewFragment.b$6().i;
                                if (miSnapFinalResult != null) {
                                    reviewFragment.b$6().i = null;
                                    reviewFragment.b$6().postResults$workflow_release(miSnapFinalResult);
                                }
                                FragmentKt.findNavController(reviewFragment).navigate(R.id.navigateSatisfied);
                                break;
                            } catch (Exception e) {
                                Log.e("ReviewScreen", "Nav Graph Error", e);
                                reviewFragment.b$6().postNavigationError$workflow_release(new NavigationError(e, ReviewFragment.class, reviewFragment.hashCode(), NavigationAction$Review.NavigateRetake.INSTANCE$1));
                                return;
                            }
                        default:
                            e eVar2 = ReviewFragment.Companion;
                            MibiData.Session session = reviewFragment.d;
                            session.addUxpEvent("SRFRA", new String[0]);
                            if (session.isCurrentSession()) {
                                MibiData.reset$core_release(true);
                            }
                            try {
                                reviewFragment.b$6().i = null;
                                FragmentKt.findNavController(reviewFragment).navigate(R.id.navigateRetake);
                                break;
                            } catch (Exception e2) {
                                Log.e("ReviewScreen", "Nav Graph Error", e2);
                                reviewFragment.b$6().postNavigationError$workflow_release(new NavigationError(e2, ReviewFragment.class, reviewFragment.hashCode(), NavigationAction$Review.NavigateRetake.INSTANCE));
                            }
                    }
                }
            });
            getBinding$workflow_release().m.setOnClickListener(new View.OnClickListener(this) { // from class: com.miteksystems.misnap.workflow.fragment.ReviewFragment$$ExternalSyntheticLambda0
                public final /* synthetic */ ReviewFragment f$0;

                {
                    this.f$0 = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i5 = i3;
                    ReviewFragment reviewFragment = this.f$0;
                    switch (i5) {
                        case 0:
                            e eVar = ReviewFragment.Companion;
                            try {
                                MiSnapFinalResult miSnapFinalResult = reviewFragment.b$6().i;
                                if (miSnapFinalResult != null) {
                                    reviewFragment.b$6().i = null;
                                    reviewFragment.b$6().postResults$workflow_release(miSnapFinalResult);
                                }
                                FragmentKt.findNavController(reviewFragment).navigate(R.id.navigateSatisfied);
                                break;
                            } catch (Exception e) {
                                Log.e("ReviewScreen", "Nav Graph Error", e);
                                reviewFragment.b$6().postNavigationError$workflow_release(new NavigationError(e, ReviewFragment.class, reviewFragment.hashCode(), NavigationAction$Review.NavigateRetake.INSTANCE$1));
                                return;
                            }
                        default:
                            e eVar2 = ReviewFragment.Companion;
                            MibiData.Session session = reviewFragment.d;
                            session.addUxpEvent("SRFRA", new String[0]);
                            if (session.isCurrentSession()) {
                                MibiData.reset$core_release(true);
                            }
                            try {
                                reviewFragment.b$6().i = null;
                                FragmentKt.findNavController(reviewFragment).navigate(R.id.navigateRetake);
                                break;
                            } catch (Exception e2) {
                                Log.e("ReviewScreen", "Nav Graph Error", e2);
                                reviewFragment.b$6().postNavigationError$workflow_release(new NavigationError(e2, ReviewFragment.class, reviewFragment.hashCode(), NavigationAction$Review.NavigateRetake.INSTANCE));
                            }
                    }
                }
            });
            MaterialTextView materialTextView = getBinding$workflow_release().n;
            float f = materialTextView.getContext().getResources().getConfiguration().fontScale;
            if (f > 1.0f) {
                com.miteksystems.misnap.workflow.a.b.a(materialTextView, f);
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            MiSnapWorkflowViewModel b$6 = b$6();
            Context requireContext = requireContext();
            requireContext.getClass();
            b$6.postError$workflow_release(requireContext, MiSnapWorkflowError.SettingState.INSTANCE);
        }
        MiSnapFinalResult miSnapFinalResult = b$6().i;
        if (miSnapFinalResult != null) {
            if (miSnapFinalResult instanceof MiSnapFinalResult.BarcodeSession) {
                byte[] bArr = ((MiSnapFinalResult.BarcodeSession) miSnapFinalResult).b;
                decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            } else if (miSnapFinalResult instanceof MiSnapFinalResult.DocumentSession) {
                byte[] bArr2 = ((MiSnapFinalResult.DocumentSession) miSnapFinalResult).b;
                decodeByteArray = BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length);
            } else if (miSnapFinalResult instanceof MiSnapFinalResult.FaceSession) {
                byte[] bArr3 = ((MiSnapFinalResult.FaceSession) miSnapFinalResult).b;
                decodeByteArray = BitmapFactory.decodeByteArray(bArr3, 0, bArr3.length);
            }
            getBinding$workflow_release().l.setImageBitmap(decodeByteArray);
        }
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        Object systemService = requireContext2.getSystemService("accessibility");
        AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            getBinding$workflow_release().n.sendAccessibilityEvent(8);
        }
    }
}
