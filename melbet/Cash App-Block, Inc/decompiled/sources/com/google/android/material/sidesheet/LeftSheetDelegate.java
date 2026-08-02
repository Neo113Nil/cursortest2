package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.n;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.google.android.material.snackbar.SnackbarManager$SnackbarRecord;
import com.squareup.cash.R;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.family.familyhub.views.FamilyHomeViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.genericelements.viewmodels.GenericComponentViewModel;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda4;
import com.withpersona.sdk2.inquiry.shared.SnackBarStateKt$renderErrorSnackbarIfNeeded$2;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes4.dex */
public final class LeftSheetDelegate {
    public final /* synthetic */ int $r8$classId;
    public final SideSheetBehavior sheetBehavior;

    public /* synthetic */ LeftSheetDelegate(SideSheetBehavior sideSheetBehavior, int i) {
        this.$r8$classId = i;
        this.sheetBehavior = sideSheetBehavior;
    }

    public static final void ValueUnitWidget(GenericComponentViewModel.ValueUnitViewModel valueUnitViewModel, Modifier modifier, Function1 function1, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Modifier wrapContentHeight;
        valueUnitViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(337243957);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(valueUnitViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(companion, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            boolean changedInstance = gapComposer.changedInstance(valueUnitViewModel) | ((i3 & 896) == 256);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new GLSceneScope$$ExternalSyntheticLambda4(25, valueUnitViewModel, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier onVisible$default = VisibleKt.onVisible$default(wrapContentHeight, (Function0) rememberedValue);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new GpsConfigQueries$$ExternalSyntheticLambda1(20);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier semantics = SemanticsModifierKt.semantics(onVisible$default, true, (Function1) rememberedValue2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, semantics);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            MaterialColors.GenericText(valueUnitViewModel.numericValue, SizeKt.wrapContentWidth$default(companion, null, 3), gapComposer, 48);
            MaterialColors.GenericText(valueUnitViewModel.unitDescription, SizeKt.wrapContentWidth$default(companion, null, 3), gapComposer, 48);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeViewKt$$ExternalSyntheticLambda1(valueUnitViewModel, modifier2, function1, i, 29);
        }
    }

    public static final void renderErrorSnackbarIfNeeded(View view, String str, Function0 function0, View view2, int i, int i2) {
        ViewGroup viewGroup;
        view.getClass();
        function0.getClass();
        if (str == null) {
            return;
        }
        int[] iArr = Snackbar.SNACKBAR_CONTENT_STYLE_ATTRS;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (view instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) view;
                break;
            }
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    viewGroup = (ViewGroup) view;
                    break;
                }
                viewGroup2 = (ViewGroup) view;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
            if (view == null) {
                viewGroup = viewGroup2;
                break;
            }
        }
        if (viewGroup == null) {
            a$$ExternalSyntheticBUOutline0.m$3("No suitable parent found from the given view. Please provide a valid view.");
            return;
        }
        Context context = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Snackbar.SNACKBAR_CONTENT_STYLE_ATTRS);
        boolean z = false;
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate((resourceId == -1 || resourceId2 == -1) ? R.layout.design_layout_snackbar_include : R.layout.mtrl_layout_snackbar_include, viewGroup, false);
        Snackbar snackbar = new Snackbar(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
        ((SnackbarContentLayout) snackbar.view.getChildAt(0)).messageView.setText(str);
        snackbar.duration = i2;
        ((SnackbarContentLayout) snackbar.view.getChildAt(0)).messageView.setMaxLines(i);
        if (view2 != null) {
            BaseTransientBottomBar.Anchor anchor = snackbar.anchor;
            if (anchor != null) {
                anchor.unanchor();
            }
            BaseTransientBottomBar.Anchor anchor2 = new BaseTransientBottomBar.Anchor(snackbar, view2);
            if (view2.isAttachedToWindow()) {
                view2.getViewTreeObserver().addOnGlobalLayoutListener(anchor2);
            }
            view2.addOnAttachStateChangeListener(anchor2);
            snackbar.anchor = anchor2;
        }
        SnackBarStateKt$renderErrorSnackbarIfNeeded$2 snackBarStateKt$renderErrorSnackbarIfNeeded$2 = new SnackBarStateKt$renderErrorSnackbarIfNeeded$2(function0);
        if (snackbar.callbacks == null) {
            snackbar.callbacks = new ArrayList();
        }
        snackbar.callbacks.add(snackBarStateKt$renderErrorSnackbarIfNeeded$2);
        n nVar = n.getInstance();
        int i3 = snackbar.duration;
        int recommendedTimeoutMillis = i3 != -2 ? snackbar.accessibilityManager.getRecommendedTimeoutMillis(i3, 3) : -2;
        BaseTransientBottomBar.AnonymousClass5 anonymousClass5 = snackbar.managerCallback;
        synchronized (nVar.a) {
            try {
                if (nVar.isCurrentSnackbarLocked(anonymousClass5)) {
                    SnackbarManager$SnackbarRecord snackbarManager$SnackbarRecord = (SnackbarManager$SnackbarRecord) nVar.c;
                    snackbarManager$SnackbarRecord.duration = recommendedTimeoutMillis;
                    ((Handler) nVar.b).removeCallbacksAndMessages(snackbarManager$SnackbarRecord);
                    nVar.scheduleTimeoutLocked((SnackbarManager$SnackbarRecord) nVar.c);
                    return;
                }
                SnackbarManager$SnackbarRecord snackbarManager$SnackbarRecord2 = (SnackbarManager$SnackbarRecord) nVar.d;
                if (snackbarManager$SnackbarRecord2 != null && snackbarManager$SnackbarRecord2.callback.get() == anonymousClass5) {
                    z = true;
                }
                if (z) {
                    ((SnackbarManager$SnackbarRecord) nVar.d).duration = recommendedTimeoutMillis;
                } else {
                    nVar.d = new SnackbarManager$SnackbarRecord(recommendedTimeoutMillis, anonymousClass5);
                }
                SnackbarManager$SnackbarRecord snackbarManager$SnackbarRecord3 = (SnackbarManager$SnackbarRecord) nVar.c;
                if (snackbarManager$SnackbarRecord3 == null || !nVar.cancelSnackbarLocked(snackbarManager$SnackbarRecord3, 4)) {
                    nVar.c = null;
                    nVar.showNextSnackbarLocked();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int getExpandedOffset() {
        int i = this.$r8$classId;
        SideSheetBehavior sideSheetBehavior = this.sheetBehavior;
        switch (i) {
            case 0:
                return Math.max(0, sideSheetBehavior.parentInnerEdge + sideSheetBehavior.innerMargin);
            default:
                return Math.max(0, (sideSheetBehavior.parentWidth - sideSheetBehavior.childWidth) - sideSheetBehavior.innerMargin);
        }
    }

    public final int getHiddenOffset() {
        int i = this.$r8$classId;
        SideSheetBehavior sideSheetBehavior = this.sheetBehavior;
        switch (i) {
            case 0:
                return (-sideSheetBehavior.childWidth) - sideSheetBehavior.innerMargin;
            default:
                return sideSheetBehavior.parentWidth;
        }
    }

    public final int getOuterEdge(View view) {
        int i = this.$r8$classId;
        SideSheetBehavior sideSheetBehavior = this.sheetBehavior;
        switch (i) {
            case 0:
                return view.getRight() + sideSheetBehavior.innerMargin;
            default:
                return view.getLeft() - sideSheetBehavior.innerMargin;
        }
    }

    public final int getSheetEdge() {
        switch (this.$r8$classId) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    public final void updateCoplanarSiblingAdjacentMargin(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        switch (this.$r8$classId) {
            case 0:
                marginLayoutParams.leftMargin = i;
                break;
            default:
                marginLayoutParams.rightMargin = i;
                break;
        }
    }
}
