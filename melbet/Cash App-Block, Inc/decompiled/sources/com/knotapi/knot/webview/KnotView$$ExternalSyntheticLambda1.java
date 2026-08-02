package com.knotapi.knot.webview;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.animation.Animation;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1;
import androidx.customview.widget.ViewDragHelper;
import androidx.media3.ui.DefaultTimeBar$$ExternalSyntheticLambda1;
import androidx.recyclerview.widget.RecyclerView;
import coil3.ComponentRegistry;
import com.fillr.n;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.ClearTextEndIconDelegate;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.timepicker.RadialViewGroup;
import com.google.common.base.Splitter;
import com.google.firebase.messaging.WithinAppServiceConnection;
import com.google.maps.android.clustering.view.DefaultClusterRenderer;
import com.knotapi.knot.interfaces.ImageLoadCallback;
import com.knotapi.knot.models.JavaScriptInterface;
import com.knotapi.knot.ui.activities.KnotActivity;
import com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment;
import com.knotapi.knot.ui.views.KnotSpinnerView$$ExternalSyntheticLambda3;
import com.knotapi.knot.utilities.WebAppJSFetcher;
import com.miteksystems.misnap.camera.view.CameraView;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.workflow.MiSnapWorkflowError;
import com.miteksystems.misnap.workflow.fragment.BarcodeAnalysisFragment;
import com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel;
import com.miteksystems.misnap.workflow.view.CountdownTimerView;
import com.miteksystems.misnap.workflow.view.MiSnapView;
import com.squareup.cash.R;
import com.squareup.cash.blockers.views.FileBlockerView;
import com.squareup.cash.card.onboarding.InteractiveCardView;
import com.squareup.cash.card.onboarding.InteractiveCardView$$ExternalSyntheticLambda3;
import com.squareup.cash.card.onboarding.InteractiveCardView$showNFC$lambda$0$$inlined$doOnEnd$1;
import com.squareup.cash.filament.BaseModelView;
import com.squareup.cash.filament.SlerpAnimator;
import com.squareup.cash.formview.components.CardFormElementView;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.swampgl.GLThread;
import com.squareup.cash.investing.components.MooncakeMyInvestmentsTileView;
import com.squareup.cash.mooncake.components.AlertDialogView;
import com.squareup.cash.reactions.views.ReactionBuilder;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda0;
import com.squareup.scannerview.ScannerView;
import com.squareup.util.android.Keyboards;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.JobImpl;

/* loaded from: classes4.dex */
public final /* synthetic */ class KnotView$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ KnotView$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MaterialShapeDrawable materialShapeDrawable;
        int i = this.$r8$classId;
        Unit unit = null;
        int i2 = 0;
        int i3 = 1;
        int i4 = 2;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((ImageLoadCallback) obj).onImageLoadFailed();
                return;
            case 1:
                n nVar = (n) obj;
                ((SQLiteEventStore) nVar.d).runCriticalSection(new MaterialButton$$ExternalSyntheticLambda3(nVar, i3));
                return;
            case 2:
                MaterialButton materialButton = (MaterialButton) obj;
                if (materialButton.opticalCenterEnabled && materialButton.isInHorizontalButtonGroup && (materialShapeDrawable = materialButton.materialButtonHelper.getMaterialShapeDrawable(false)) != null) {
                    i2 = (int) (materialShapeDrawable.getCornerSizeDiffX() * 0.11f);
                }
                materialButton.opticalCenterShift = i2;
                materialButton.updatePaddingsAndSizeForWidthAnimation();
                materialButton.invalidate();
                return;
            case 3:
                ((CarouselLayoutManager) obj).requestLayout();
                return;
            case 4:
                MaterialCalendarGridView.$r8$lambda$PqZsnkFZF7YntKmtXySyj_K1Prk((MaterialCalendarGridView) obj);
                return;
            case 5:
                ((EditText) obj).requestFocus();
                return;
            case 6:
                Splitter splitter = (Splitter) obj;
                splitter.omitEmptyStrings = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) splitter.strategy;
                ViewDragHelper viewDragHelper = sideSheetBehavior.viewDragHelper;
                if (viewDragHelper != null && viewDragHelper.continueSettling()) {
                    splitter.continueSettlingToState(splitter.limit);
                    return;
                } else {
                    if (sideSheetBehavior.state == 2) {
                        sideSheetBehavior.setStateInternal(splitter.limit);
                        return;
                    }
                    return;
                }
            case 7:
                ((ClearTextEndIconDelegate) obj).animateIcon(true);
                return;
            case 8:
                DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = (DropdownMenuEndIconDelegate) obj;
                boolean isPopupShowing = dropdownMenuEndIconDelegate.autoCompleteTextView.isPopupShowing();
                dropdownMenuEndIconDelegate.setEndIconChecked(isPopupShowing);
                dropdownMenuEndIconDelegate.dropdownPopupDirty = isPopupShowing;
                return;
            case 9:
                ((TextInputLayout) obj).editText.requestLayout();
                return;
            case 10:
                ((RadialViewGroup) obj).updateLayoutParams();
                return;
            case 11:
                ComponentRegistry.Builder builder = (ComponentRegistry.Builder) obj;
                synchronized (((ArrayDeque) builder.lazyFetcherFactories)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) builder.interceptors).edit();
                    String str = (String) builder.mappers;
                    StringBuilder sb = new StringBuilder();
                    Iterator it = ((ArrayDeque) builder.lazyFetcherFactories).iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append((String) builder.keyers);
                    }
                    edit.putString(str, sb.toString()).apply();
                }
                return;
            case 12:
                WithinAppServiceConnection.BindRequest bindRequest = (WithinAppServiceConnection.BindRequest) obj;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + bindRequest.intent.getAction() + " finishing.");
                bindRequest.taskCompletionSource.trySetResult(null);
                return;
            case 13:
                ((DefaultClusterRenderer.ViewModifier) obj).sendEmptyMessage(1);
                return;
            case 14:
                ((JavaScriptInterface) obj).lambda$startTask$1();
                return;
            case 15:
                KnotActivity.lambda$triggerFinalStepOnActiveMerchantWebView$10((MerchantWebViewListenerFragment) obj);
                return;
            case 16:
                WebAppJSFetcher.lambda$fetchJS$0((WebAppJSFetcher.JSFetchCallback) obj);
                return;
            case 17:
                ((KnotViewClient) obj).lambda$sendPasskeyLogs$0();
                return;
            case 18:
                ((AndroidPopup_androidKt$Popup$3$1) obj).invoke();
                return;
            case 19:
                BarcodeAnalysisFragment barcodeAnalysisFragment = (BarcodeAnalysisFragment) obj;
                BarcodeAnalysisFragment.Companion companion = BarcodeAnalysisFragment.Companion;
                MiSnapSettings miSnapSettings = (MiSnapSettings) barcodeAnalysisFragment.b().f.getValue();
                if (miSnapSettings != null) {
                    miSnapSettings.analysis.barcode.d = MiSnapSettings.Analysis.Barcode.Trigger.MANUAL;
                    barcodeAnalysisFragment.b().updateState$workflow_release(miSnapSettings);
                    AppCompatImageView appCompatImageView = barcodeAnalysisFragment.getBinding$workflow_release().i;
                    appCompatImageView.setVisibility(0);
                    appCompatImageView.setOnClickListener(new BottomSheet$$ExternalSyntheticLambda0(i4, barcodeAnalysisFragment, appCompatImageView));
                    barcodeAnalysisFragment.a(miSnapSettings, barcodeAnalysisFragment.a$1(), barcodeAnalysisFragment.b());
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    MiSnapWorkflowViewModel b = barcodeAnalysisFragment.b();
                    Context requireContext = barcodeAnalysisFragment.requireContext();
                    requireContext.getClass();
                    b.postError$workflow_release(requireContext, MiSnapWorkflowError.SettingState.INSTANCE);
                    return;
                }
                return;
            case 20:
                CountdownTimerView countdownTimerView = (CountdownTimerView) obj;
                int i5 = CountdownTimerView.$r8$clinit;
                countdownTimerView.setText(countdownTimerView.d < countdownTimerView.a.size() ? (CharSequence) countdownTimerView.a.get(countdownTimerView.d) : null);
                Animation animation = countdownTimerView.e;
                if (animation != null) {
                    if (animation.getDuration() == 0) {
                        int repeatMode = animation.getRepeatMode();
                        int i6 = countdownTimerView.c;
                        animation.setDuration(repeatMode == 2 ? i6 / 2 : i6);
                    }
                    countdownTimerView.startAnimation(animation);
                }
                CharSequence text = countdownTimerView.getText();
                if (text != null) {
                    countdownTimerView.setContentDescription(text);
                }
                if (countdownTimerView.d >= countdownTimerView.a.size()) {
                    countdownTimerView.d = -1;
                    return;
                } else {
                    countdownTimerView.d++;
                    countdownTimerView.f.postDelayed(countdownTimerView.g, countdownTimerView.c);
                    return;
                }
            case 21:
                MiSnapView miSnapView = (MiSnapView) obj;
                int i7 = MiSnapView.$r8$clinit;
                miSnapView.l.addUxpEvent("MVFAF", new String[0]);
                CameraView cameraView = miSnapView.c;
                int i8 = CameraView.$r8$clinit;
                cameraView.startAutoFocus(null);
                return;
            case 22:
                FileBlockerView fileBlockerView = (FileBlockerView) obj;
                ScannerView scannerView = fileBlockerView.getScannerView();
                String string2 = fileBlockerView.getContext().getString(R.string.selfie_no_face);
                string2.getClass();
                scannerView.setCurrentText(string2);
                return;
            case 23:
                InteractiveCardView interactiveCardView = (InteractiveCardView) obj;
                interactiveCardView.cancelAnimationInternal();
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(3000L);
                int i9 = 3;
                animatorSet.addListener(new InteractiveCardView$showNFC$lambda$0$$inlined$doOnEnd$1(interactiveCardView, i9));
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ref$ObjectRef.element = new Quat(RecyclerView.DECELERATION_RATE, InteractiveCardView.X_AXIS);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f, 1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
                ofFloat.addUpdateListener(new DefaultTimeBar$$ExternalSyntheticLambda1(ref$ObjectRef, 14));
                Quat quat = interactiveCardView.cardRotation;
                Quat quat2 = InteractiveCardView.NFC_CARD_DOWN_ROTATION;
                SlerpAnimator slerpAnimator = new SlerpAnimator(quat, quat.slerp(quat2, 0.5f), quat2, quat2, interactiveCardView.frontRightResting.slerp(quat2, 0.5f), interactiveCardView.frontRightResting);
                slerpAnimator.addUpdateListener(new KnotSpinnerView$$ExternalSyntheticLambda3(6, interactiveCardView, ref$ObjectRef));
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f, RecyclerView.DECELERATION_RATE);
                ofFloat2.addUpdateListener(new InteractiveCardView$$ExternalSyntheticLambda3(interactiveCardView, ofFloat2, i4));
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f, 1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
                ofFloat3.addUpdateListener(new InteractiveCardView$$ExternalSyntheticLambda3(interactiveCardView, ofFloat3, i9));
                animatorSet.playTogether(ofFloat, slerpAnimator, ofFloat2, ofFloat3);
                animatorSet.addListener(new InteractiveCardView$showNFC$lambda$0$$inlined$doOnEnd$1(interactiveCardView, i4));
                animatorSet.addListener(new InteractiveCardView$showNFC$lambda$0$$inlined$doOnEnd$1(interactiveCardView, i3));
                animatorSet.start();
                interactiveCardView.animator = animatorSet;
                return;
            case 24:
                Function0 function0 = ((BaseModelView) obj).onFirstFrame;
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            case 25:
                ((CardFormElementView) obj).requestLayout();
                return;
            case 26:
                GLThread gLThread = (GLThread) obj;
                JobImpl jobImpl = gLThread.cleanupJob;
                try {
                    GLThread.access$cleanupEglResources(gLThread);
                    return;
                } finally {
                    jobImpl.complete$1();
                }
            case 27:
                int i10 = MooncakeMyInvestmentsTileView.$r8$clinit;
                ((MooncakeMyInvestmentsTileView) obj).requestLayout();
                return;
            case 28:
                int i11 = AlertDialogView.$r8$clinit;
                Keyboards.hideKeyboard((AlertDialogView) obj);
                return;
            default:
                ((ReactionBuilder) obj).submitReaction();
                return;
        }
    }
}
