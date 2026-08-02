package com.google.android.material.resources;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.instantapps.InstantApps;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.family.familyhub.views.FamilyHomeViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.genericelements.viewmodels.GenericComponentViewModel;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda4;
import com.squareup.workflow1.internal.SubtreeManager;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.permissions.Permission;
import com.withpersona.sdk2.inquiry.permissions.PermissionsStateKt;
import com.withpersona.sdk2.inquiry.selfie.CameraState;
import com.withpersona.sdk2.inquiry.selfie.PoseConfig;
import com.withpersona.sdk2.inquiry.selfie.PoseConfigs;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieKt;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.SelfiePage;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes9.dex */
public abstract class MaterialAttributes {
    public static final void FullWidthWidget(GenericComponentViewModel.FullWidthViewModel fullWidthViewModel, Modifier modifier, Function1 function1, Composer composer, int i) {
        int i2;
        fullWidthViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(95947343);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(fullWidthViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            modifier = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            int i4 = i3 & 896;
            boolean changedInstance = (i4 == 256) | gapComposer.changedInstance(fullWidthViewModel);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GLSceneScope$$ExternalSyntheticLambda4(23, fullWidthViewModel, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier onVisible$default = VisibleKt.onVisible$default(fillMaxWidth, (Function0) rememberedValue);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, onVisible$default);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            InstantApps.GenericBaseElement(fullWidthViewModel.model, SizeKt.fillMaxWidth(modifier, 1.0f), function1, gapComposer, i4 | 48);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeViewKt$$ExternalSyntheticLambda1(fullWidthViewModel, modifier2, function1, i, 28);
        }
    }

    public static final SelfieState createBackState(SubtreeManager subtreeManager, boolean z) {
        subtreeManager.getClass();
        if (z) {
            return (SelfieState) subtreeManager.getState();
        }
        SelfieState selfieState = (SelfieState) subtreeManager.getState();
        if (selfieState != null) {
            return selfieState.getBackState$selfie_release();
        }
        return null;
    }

    public static final void deleteAllSelfies(SelfieState selfieState) {
        selfieState.getClass();
        Iterator it = selfieState.getSelfies$selfie_release().iterator();
        while (it.hasNext()) {
            new File(((Selfie) it.next()).getAbsoluteFilePath()).delete();
        }
    }

    public static final void handlePermissionChanged(Context context, SubtreeManager subtreeManager, SelfieWorkflow.Input input, boolean z) {
        SelfieState selfieState;
        context.getClass();
        subtreeManager.getClass();
        input.getClass();
        ArrayList mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(Permission.Camera);
        if (z && ContextUtilsKt.isMicPresent(context) && input.videoCaptureConfig.recordAudio) {
            mutableListOf.add(Permission.RecordAudio);
        }
        if (PermissionsStateKt.getMissingPermissions(context, mutableListOf).isEmpty() || (selfieState = (SelfieState) subtreeManager.getState()) == null) {
            return;
        }
        if (selfieState instanceof SelfieState.WaitForCameraFeed) {
            subtreeManager.updateState(SelfieState.WaitForCameraFeed.copy$default((SelfieState.WaitForCameraFeed) selfieState, !r2.contains(r0), !r2.contains(Permission.RecordAudio), false, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE));
        } else {
            deleteAllSelfies(selfieState);
            subtreeManager.updateState(new SelfieState.RestartCamera(false, false, createBackState(subtreeManager, false), selfieState.getCameraFacingMode$selfie_release()));
        }
    }

    public static TypedValue resolve(Resources.Theme theme, int i) {
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean resolveBoolean(Resources.Theme theme, int i, boolean z) {
        TypedValue resolve = resolve(theme, i);
        return (resolve == null || resolve.type != 18) ? z : resolve.data != 0;
    }

    public static TypedValue resolveTypedValueOrThrow(Context context, int i, String str) {
        TypedValue resolve = resolve(context.getTheme(), i);
        if (resolve != null) {
            return resolve;
        }
        JWK$$ExternalSyntheticBUOutline0.m("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)});
        return null;
    }

    public static final SelfieState reviewStateIfNeeded(SubtreeManager subtreeManager, PoseConfigs poseConfigs, List list, String str, CameraProperties cameraProperties, long j, SelfieState selfieState) {
        boolean z;
        subtreeManager.getClass();
        poseConfigs.getClass();
        list.getClass();
        cameraProperties.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Selfie selfie = (Selfie) obj;
            if (selfie instanceof Selfie.SelfieImage) {
                Selfie.Pose pose = ((Selfie.SelfieImage) selfie).pose;
                pose.getClass();
                PoseConfig poseConfig = (PoseConfig) poseConfigs.poseConfigs.get(pose);
                if (poseConfig == null) {
                    poseConfig = PoseConfig.Default;
                }
                z = poseConfig.allowReview;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            WorkflowState state = subtreeManager.getState();
            if (state != null) {
                return new SelfieState.Submit(list, str, cameraProperties, j, selfieState, ((SelfieState) state).getCameraFacingMode$selfie_release());
            }
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
            return null;
        }
        WorkflowState state2 = subtreeManager.getState();
        if (state2 != null) {
            return new SelfieState.ReviewCaptures(list, arrayList, str, cameraProperties, j, selfieState, ((SelfieState) state2).getCameraFacingMode$selfie_release());
        }
        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final SelfiePage toSelfiePage(SelfieState selfieState) {
        selfieState.getClass();
        boolean z = selfieState instanceof SelfieState.ShowInstructions;
        SelfiePage.Prompt prompt = SelfiePage.Prompt.INSTANCE;
        if (z) {
            return prompt;
        }
        if (selfieState instanceof SelfieState.ShowPoseHint) {
            Selfie.Pose currentPoseOrNull = ((SelfieState.ShowPoseHint) selfieState).getCurrentPoseOrNull();
            return new SelfiePage.LeadInAnimation(currentPoseOrNull != null ? SelfieKt.getPathName(currentPoseOrNull) : null);
        }
        if (selfieState instanceof SelfieState.RestartCamera) {
            return prompt;
        }
        if (selfieState instanceof CameraState) {
            Selfie.Pose currentPoseOrNull2 = ((CameraState) selfieState).getCurrentPoseOrNull();
            return new SelfiePage.TakePhoto(currentPoseOrNull2 != null ? SelfieKt.getPathName(currentPoseOrNull2) : null);
        }
        if (selfieState instanceof SelfieState.CaptureTransition) {
            return toSelfiePage(((SelfieState.CaptureTransition) selfieState).nextState);
        }
        if ((selfieState instanceof SelfieState.FinalizeLocalVideoCapture) || (selfieState instanceof SelfieState.FinalizeWebRtc) || (selfieState instanceof SelfieState.WebRtcFinished)) {
            return SelfiePage.FinalizeVideo.INSTANCE;
        }
        if (selfieState instanceof SelfieState.ReviewCaptures) {
            return SelfiePage.CheckUpload.INSTANCE;
        }
        if (selfieState instanceof SelfieState.Submit) {
            return SelfiePage.Pending.INSTANCE;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static boolean resolveBoolean(Context context, int i, boolean z) {
        return resolveBoolean(context.getTheme(), i, z);
    }

    public static TypedValue resolveTypedValueOrThrow(View view, int i) {
        return resolveTypedValueOrThrow(view.getContext(), i, view.getClass().getCanonicalName());
    }
}
