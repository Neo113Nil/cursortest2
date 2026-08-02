package androidx.compose.ui.window;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onCommit$4;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.glance.appwidget.action.ListAdapterTrampolineApi26Impl;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.core.internal.DatadogCore;
import com.datadog.android.core.internal.SdkFeature;
import com.datadog.android.rum.Rum$createMonitor$1;
import com.datadog.android.rum.internal.domain.RumContext;
import com.datadog.android.rum.internal.domain.scope.RumApplicationScope;
import com.datadog.android.rum.internal.domain.scope.RumRawEvent;
import com.datadog.android.rum.internal.monitor.DatadogRumMonitor;
import com.datadog.android.rum.internal.vitals.VitalReaderRunnable;
import com.google.android.gms.internal.mlkit_vision_common.zzhw;
import com.miteksystems.misnap.camera.frameproducers.CameraWrapper;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.workflow.fragment.BarcodeAnalysisFragment;
import com.miteksystems.misnap.workflow.fragment.DocumentAnalysisFragment;
import com.miteksystems.misnap.workflow.fragment.FaceAnalysisFragment;
import com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel;
import com.miteksystems.misnap.workflow.view.MiSnapView;
import com.miteksystems.misnap.workflow.view.RecordingIconView;
import com.miteksystems.misnap.workflow.view.TorchView;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.json.Json;
import net.idrnd.face.iad.capture.internal.s;
import okhttp3.MultipartBody;

/* loaded from: classes3.dex */
public final class AndroidPopup_androidKt$Popup$3$1 extends Lambda implements Function0 {
    public final /* synthetic */ Object $layoutDirection;
    public final /* synthetic */ Object $onDismissRequest;
    public final /* synthetic */ Object $popupLayout;
    public final /* synthetic */ Object $properties;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$3$1(PopupLayout popupLayout, Function0 function0, PopupProperties popupProperties, String str, LayoutDirection layoutDirection) {
        super(0);
        this.$r8$classId = 0;
        this.$popupLayout = popupLayout;
        this.$onDismissRequest = function0;
        this.$properties = popupProperties;
        this.$layoutDirection = layoutDirection;
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0393, code lost:
    
        if (r1 != 4) goto L145;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [androidx.lifecycle.Observer, com.miteksystems.misnap.workflow.fragment.FaceAnalysisFragment$$ExternalSyntheticLambda7] */
    /* JADX WARN: Type inference failed for: r2v21, types: [androidx.lifecycle.Observer, com.miteksystems.misnap.workflow.fragment.FaceAnalysisFragment$$ExternalSyntheticLambda7] */
    /* JADX WARN: Type inference failed for: r2v27, types: [androidx.lifecycle.Observer, com.miteksystems.misnap.workflow.fragment.FaceAnalysisFragment$$ExternalSyntheticLambda7] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Object obj;
        Integer d;
        Integer d2;
        String str;
        String str2;
        Object obj2;
        Integer d3;
        Integer d4;
        String str3;
        String str4;
        Object obj3;
        Integer d5;
        Integer d6;
        String str5;
        String str6;
        final int i = 0;
        Object obj4 = null;
        final int i2 = 1;
        final int i3 = 2;
        switch (this.$r8$classId) {
            case 0:
                ((PopupLayout) this.$popupLayout).updateParameters((Function0) this.$onDismissRequest, (PopupProperties) this.$properties, (LayoutDirection) this.$layoutDirection);
                break;
            case 1:
                ((DialogWrapper) this.$popupLayout).updateParameters((Function0) this.$onDismissRequest, (DialogProperties) this.$properties, (LayoutDirection) this.$layoutDirection);
                break;
            case 2:
                Object obj5 = this.$properties;
                ViewGroup viewGroup = (ViewGroup) this.$onDismissRequest;
                DefaultSpecialEffectsController.TransitionEffect transitionEffect = (DefaultSpecialEffectsController.TransitionEffect) this.$popupLayout;
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "Attempting to create TransitionSeekController");
                }
                Object controlDelayedTransition = transitionEffect.transitionImpl.controlDelayedTransition(viewGroup, obj5);
                transitionEffect.controller = controlDelayedTransition;
                if (controlDelayedTransition == null) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "TransitionSeekController was not created.");
                    }
                    transitionEffect.noControllerReturned = true;
                } else {
                    ((Ref$ObjectRef) this.$layoutDirection).element = new DefaultSpecialEffectsController$TransitionEffect$onCommit$4(transitionEffect, obj5, viewGroup);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "Started executing operations from " + transitionEffect.firstOut + " to " + transitionEffect.lastIn);
                    }
                }
                break;
            case 3:
                Intent intent = (Intent) this.$properties;
                Activity activity = (Activity) this.$onDismissRequest;
                String str7 = (String) this.$popupLayout;
                if (str7 == null) {
                    a$$ExternalSyntheticBUOutline0.m$2("Name is null");
                } else if (str7.equals("ACTIVITY")) {
                    i = 1;
                } else if (str7.equals("BROADCAST")) {
                    i = 2;
                } else if (str7.equals("SERVICE")) {
                    i = 3;
                } else if (str7.equals("FOREGROUND_SERVICE")) {
                    i = 4;
                } else if (str7.equals("CALLBACK")) {
                    i = 5;
                } else {
                    a$$ExternalSyntheticBUOutline0.m$3("No enum constant androidx.glance.appwidget.action.ActionTrampolineType.".concat(str7));
                }
                int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i);
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            activity.startService(intent);
                        } else if (ordinal == 3) {
                            ListAdapterTrampolineApi26Impl.INSTANCE.startForegroundService(activity, intent);
                        }
                    }
                    activity.sendBroadcast(intent);
                } else {
                    activity.startActivity(intent, (Bundle) this.$layoutDirection);
                }
                break;
            case 4:
                LinkedHashMap linkedHashMap = ((SdkFeature) this.$popupLayout).featureContext;
                ((Function1) this.$onDismissRequest).invoke(linkedHashMap);
                Set<VitalReaderRunnable> set = ((DatadogCore) this.$properties).featureContextUpdateReceivers;
                String str8 = (String) this.$layoutDirection;
                for (VitalReaderRunnable vitalReaderRunnable : set) {
                    vitalReaderRunnable.getClass();
                    linkedHashMap.getClass();
                    if (str8.equals("rum")) {
                        String str9 = RumContext.NULL_UUID;
                        vitalReaderRunnable.currentRumContext = zzhw.fromFeatureContext(linkedHashMap);
                    }
                }
                break;
            case 5:
                DatadogRumMonitor datadogRumMonitor = (DatadogRumMonitor) this.$popupLayout;
                RumApplicationScope rumApplicationScope = datadogRumMonitor.rootScope;
                rumApplicationScope.handleEvent((RumRawEvent) this.$onDismissRequest, (DatadogContext) this.$properties, (Function1) this.$layoutDirection, datadogRumMonitor.writer);
                break;
            case 6:
                Log.e("CameraWrapper", "Camera timeout: " + ((String) this.$popupLayout));
                ((CameraWrapper) this.$onDismissRequest).g.unregisterAvailabilityCallback((CameraWrapper.l) this.$properties);
                ((Rum$createMonitor$1) this.$layoutDirection).invoke();
                break;
            case 7:
                final BarcodeAnalysisFragment barcodeAnalysisFragment = (BarcodeAnalysisFragment) this.$onDismissRequest;
                final MiSnapSettings miSnapSettings = (MiSnapSettings) this.$popupLayout;
                MiSnapSettings.Camera camera = miSnapSettings.camera;
                MiSnapSettings.Workflow workflow = miSnapSettings.workflow;
                if (s.shouldRecordSession(camera.videoRecord)) {
                    RecordingIconView recordingIconView = barcodeAnalysisFragment.getBinding$workflow_release().l;
                    String str10 = (String) this.$layoutDirection;
                    if (str10 == null || (str2 = workflow.get(str10)) == null) {
                        obj = null;
                    } else {
                        Json.Default r10 = Json.Default;
                        r10.getClass();
                        obj = r10.decodeFromString(str2, BarcodeAnalysisFragment.WorkflowSettings.Companion.serializer());
                    }
                    BarcodeAnalysisFragment.WorkflowSettings workflowSettings = (BarcodeAnalysisFragment.WorkflowSettings) obj;
                    if ((workflowSettings == null || (d = workflowSettings.h) == null) && (d = MultipartBody.Companion.d(barcodeAnalysisFragment.getArguments(), "recordingIconDrawableId")) == null) {
                        BarcodeAnalysisFragment.Companion.getClass();
                        d = BarcodeAnalysisFragment.Companion.getDefaultWorkflowSettings(miSnapSettings).h;
                    }
                    if (d != null) {
                        recordingIconView.setDrawableId(d.intValue());
                    }
                    if (str10 != null && (str = workflow.get(str10)) != null) {
                        Json.Default r4 = Json.Default;
                        r4.getClass();
                        obj4 = r4.decodeFromString(str, BarcodeAnalysisFragment.WorkflowSettings.Companion.serializer());
                    }
                    BarcodeAnalysisFragment.WorkflowSettings workflowSettings2 = (BarcodeAnalysisFragment.WorkflowSettings) obj4;
                    if ((workflowSettings2 == null || (d2 = workflowSettings2.i) == null) && (d2 = MultipartBody.Companion.d(barcodeAnalysisFragment.getArguments(), "recordingIconAnimationId")) == null) {
                        BarcodeAnalysisFragment.Companion.getClass();
                        d2 = BarcodeAnalysisFragment.Companion.getDefaultWorkflowSettings(miSnapSettings).i;
                    }
                    if (d2 != null) {
                        int intValue = d2.intValue();
                        Context requireContext = barcodeAnalysisFragment.requireContext();
                        requireContext.getClass();
                        recordingIconView.setAnimation(MultipartBody.Companion.a(requireContext, intValue));
                    }
                    recordingIconView.start();
                }
                final MiSnapWorkflowViewModel miSnapWorkflowViewModel = (MiSnapWorkflowViewModel) this.$properties;
                BarcodeAnalysisFragment.Companion companion = BarcodeAnalysisFragment.Companion;
                ?? r2 = new Observer() { // from class: com.miteksystems.misnap.workflow.fragment.FaceAnalysisFragment$$ExternalSyntheticLambda7
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj6) {
                        int i4 = i2;
                        MiSnapSettings.Camera.TorchMode torchMode = MiSnapSettings.Camera.TorchMode.OFF;
                        MiSnapSettings.Camera.TorchMode torchMode2 = MiSnapSettings.Camera.TorchMode.ON;
                        MiSnapWorkflowViewModel miSnapWorkflowViewModel2 = miSnapWorkflowViewModel;
                        MiSnapSettings miSnapSettings2 = miSnapSettings;
                        Fragment fragment = barcodeAnalysisFragment;
                        switch (i4) {
                            case 0:
                                FaceAnalysisFragment faceAnalysisFragment = (FaceAnalysisFragment) fragment;
                                Boolean bool = (Boolean) obj6;
                                FaceAnalysisFragment.Companion companion2 = FaceAnalysisFragment.Companion;
                                miSnapWorkflowViewModel2.getClass();
                                if (bool != null) {
                                    boolean booleanValue = bool.booleanValue();
                                    MiSnapView.setTorchEnabled$default(faceAnalysisFragment.getBinding$workflow_release().m, booleanValue, null, 2, null);
                                    MiSnapSettings.Camera camera2 = miSnapSettings2.camera;
                                    if (booleanValue) {
                                        torchMode = torchMode2;
                                    }
                                    camera2.a = torchMode;
                                    miSnapWorkflowViewModel2.updateState$workflow_release(miSnapSettings2);
                                    break;
                                }
                                break;
                            case 1:
                                BarcodeAnalysisFragment barcodeAnalysisFragment2 = (BarcodeAnalysisFragment) fragment;
                                Boolean bool2 = (Boolean) obj6;
                                BarcodeAnalysisFragment.Companion companion3 = BarcodeAnalysisFragment.Companion;
                                miSnapWorkflowViewModel2.getClass();
                                if (bool2 != null) {
                                    boolean booleanValue2 = bool2.booleanValue();
                                    MiSnapView.setTorchEnabled$default(barcodeAnalysisFragment2.getBinding$workflow_release().k, booleanValue2, null, 2, null);
                                    MiSnapSettings.Camera camera3 = miSnapSettings2.camera;
                                    if (booleanValue2) {
                                        torchMode = torchMode2;
                                    }
                                    camera3.a = torchMode;
                                    miSnapWorkflowViewModel2.updateState$workflow_release(miSnapSettings2);
                                    break;
                                }
                                break;
                            default:
                                DocumentAnalysisFragment documentAnalysisFragment = (DocumentAnalysisFragment) fragment;
                                Boolean bool3 = (Boolean) obj6;
                                DocumentAnalysisFragment.Companion companion4 = DocumentAnalysisFragment.Companion;
                                miSnapWorkflowViewModel2.getClass();
                                if (bool3 != null) {
                                    boolean booleanValue3 = bool3.booleanValue();
                                    MiSnapView.setTorchEnabled$default(documentAnalysisFragment.getBinding$workflow_release().l, booleanValue3, null, 2, null);
                                    MiSnapSettings.Camera camera4 = miSnapSettings2.camera;
                                    if (booleanValue3) {
                                        torchMode = torchMode2;
                                    }
                                    camera4.a = torchMode;
                                    miSnapWorkflowViewModel2.updateState$workflow_release(miSnapSettings2);
                                    break;
                                }
                                break;
                        }
                    }
                };
                barcodeAnalysisFragment.getBinding$workflow_release().n.b.observe(barcodeAnalysisFragment.getViewLifecycleOwner(), r2);
                barcodeAnalysisFragment.p = r2;
                TorchView torchView = barcodeAnalysisFragment.getBinding$workflow_release().n;
                LifecycleOwner viewLifecycleOwner = barcodeAnalysisFragment.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                torchView.observe(viewLifecycleOwner, barcodeAnalysisFragment.getBinding$workflow_release().k.A);
                break;
            case 8:
                final DocumentAnalysisFragment documentAnalysisFragment = (DocumentAnalysisFragment) this.$onDismissRequest;
                final MiSnapSettings miSnapSettings2 = (MiSnapSettings) this.$popupLayout;
                MiSnapSettings.Camera camera2 = miSnapSettings2.camera;
                MiSnapSettings.Workflow workflow2 = miSnapSettings2.workflow;
                if (s.shouldRecordSession(camera2.videoRecord)) {
                    RecordingIconView recordingIconView2 = documentAnalysisFragment.getBinding$workflow_release().m;
                    String str11 = (String) this.$layoutDirection;
                    if (str11 == null || (str4 = workflow2.get(str11)) == null) {
                        obj2 = null;
                    } else {
                        Json.Default r102 = Json.Default;
                        r102.getClass();
                        obj2 = r102.decodeFromString(str4, DocumentAnalysisFragment.WorkflowSettings.Companion.serializer());
                    }
                    DocumentAnalysisFragment.WorkflowSettings workflowSettings3 = (DocumentAnalysisFragment.WorkflowSettings) obj2;
                    if ((workflowSettings3 == null || (d3 = workflowSettings3.n) == null) && (d3 = MultipartBody.Companion.d(documentAnalysisFragment.getArguments(), "recordingIconDrawableId")) == null) {
                        DocumentAnalysisFragment.Companion.getClass();
                        d3 = DocumentAnalysisFragment.Companion.getDefaultWorkflowSettings(miSnapSettings2).n;
                    }
                    if (d3 != null) {
                        recordingIconView2.setDrawableId(d3.intValue());
                    }
                    if (str11 != null && (str3 = workflow2.get(str11)) != null) {
                        Json.Default r42 = Json.Default;
                        r42.getClass();
                        obj4 = r42.decodeFromString(str3, DocumentAnalysisFragment.WorkflowSettings.Companion.serializer());
                    }
                    DocumentAnalysisFragment.WorkflowSettings workflowSettings4 = (DocumentAnalysisFragment.WorkflowSettings) obj4;
                    if ((workflowSettings4 == null || (d4 = workflowSettings4.o) == null) && (d4 = MultipartBody.Companion.d(documentAnalysisFragment.getArguments(), "recordingIconAnimationId")) == null) {
                        DocumentAnalysisFragment.Companion.getClass();
                        d4 = DocumentAnalysisFragment.Companion.getDefaultWorkflowSettings(miSnapSettings2).o;
                    }
                    if (d4 != null) {
                        int intValue2 = d4.intValue();
                        Context requireContext2 = documentAnalysisFragment.requireContext();
                        requireContext2.getClass();
                        recordingIconView2.setAnimation(MultipartBody.Companion.a(requireContext2, intValue2));
                    }
                    recordingIconView2.start();
                }
                final MiSnapWorkflowViewModel miSnapWorkflowViewModel2 = (MiSnapWorkflowViewModel) this.$properties;
                DocumentAnalysisFragment.Companion companion2 = DocumentAnalysisFragment.Companion;
                ?? r22 = new Observer() { // from class: com.miteksystems.misnap.workflow.fragment.FaceAnalysisFragment$$ExternalSyntheticLambda7
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj6) {
                        int i4 = i3;
                        MiSnapSettings.Camera.TorchMode torchMode = MiSnapSettings.Camera.TorchMode.OFF;
                        MiSnapSettings.Camera.TorchMode torchMode2 = MiSnapSettings.Camera.TorchMode.ON;
                        MiSnapWorkflowViewModel miSnapWorkflowViewModel22 = miSnapWorkflowViewModel2;
                        MiSnapSettings miSnapSettings22 = miSnapSettings2;
                        Fragment fragment = documentAnalysisFragment;
                        switch (i4) {
                            case 0:
                                FaceAnalysisFragment faceAnalysisFragment = (FaceAnalysisFragment) fragment;
                                Boolean bool = (Boolean) obj6;
                                FaceAnalysisFragment.Companion companion22 = FaceAnalysisFragment.Companion;
                                miSnapWorkflowViewModel22.getClass();
                                if (bool != null) {
                                    boolean booleanValue = bool.booleanValue();
                                    MiSnapView.setTorchEnabled$default(faceAnalysisFragment.getBinding$workflow_release().m, booleanValue, null, 2, null);
                                    MiSnapSettings.Camera camera22 = miSnapSettings22.camera;
                                    if (booleanValue) {
                                        torchMode = torchMode2;
                                    }
                                    camera22.a = torchMode;
                                    miSnapWorkflowViewModel22.updateState$workflow_release(miSnapSettings22);
                                    break;
                                }
                                break;
                            case 1:
                                BarcodeAnalysisFragment barcodeAnalysisFragment2 = (BarcodeAnalysisFragment) fragment;
                                Boolean bool2 = (Boolean) obj6;
                                BarcodeAnalysisFragment.Companion companion3 = BarcodeAnalysisFragment.Companion;
                                miSnapWorkflowViewModel22.getClass();
                                if (bool2 != null) {
                                    boolean booleanValue2 = bool2.booleanValue();
                                    MiSnapView.setTorchEnabled$default(barcodeAnalysisFragment2.getBinding$workflow_release().k, booleanValue2, null, 2, null);
                                    MiSnapSettings.Camera camera3 = miSnapSettings22.camera;
                                    if (booleanValue2) {
                                        torchMode = torchMode2;
                                    }
                                    camera3.a = torchMode;
                                    miSnapWorkflowViewModel22.updateState$workflow_release(miSnapSettings22);
                                    break;
                                }
                                break;
                            default:
                                DocumentAnalysisFragment documentAnalysisFragment2 = (DocumentAnalysisFragment) fragment;
                                Boolean bool3 = (Boolean) obj6;
                                DocumentAnalysisFragment.Companion companion4 = DocumentAnalysisFragment.Companion;
                                miSnapWorkflowViewModel22.getClass();
                                if (bool3 != null) {
                                    boolean booleanValue3 = bool3.booleanValue();
                                    MiSnapView.setTorchEnabled$default(documentAnalysisFragment2.getBinding$workflow_release().l, booleanValue3, null, 2, null);
                                    MiSnapSettings.Camera camera4 = miSnapSettings22.camera;
                                    if (booleanValue3) {
                                        torchMode = torchMode2;
                                    }
                                    camera4.a = torchMode;
                                    miSnapWorkflowViewModel22.updateState$workflow_release(miSnapSettings22);
                                    break;
                                }
                                break;
                        }
                    }
                };
                documentAnalysisFragment.getBinding$workflow_release().o.b.observe(documentAnalysisFragment.getViewLifecycleOwner(), r22);
                documentAnalysisFragment.t = r22;
                TorchView torchView2 = documentAnalysisFragment.getBinding$workflow_release().o;
                LifecycleOwner viewLifecycleOwner2 = documentAnalysisFragment.getViewLifecycleOwner();
                viewLifecycleOwner2.getClass();
                torchView2.observe(viewLifecycleOwner2, documentAnalysisFragment.getBinding$workflow_release().l.A);
                break;
            default:
                final FaceAnalysisFragment faceAnalysisFragment = (FaceAnalysisFragment) this.$onDismissRequest;
                final MiSnapSettings miSnapSettings3 = (MiSnapSettings) this.$popupLayout;
                MiSnapSettings.Camera camera3 = miSnapSettings3.camera;
                MiSnapSettings.Workflow workflow3 = miSnapSettings3.workflow;
                if (s.shouldRecordSession(camera3.videoRecord)) {
                    RecordingIconView recordingIconView3 = faceAnalysisFragment.getBinding$workflow_release().n;
                    String str12 = (String) this.$layoutDirection;
                    if (str12 == null || (str6 = workflow3.get(str12)) == null) {
                        obj3 = null;
                    } else {
                        Json.Default r103 = Json.Default;
                        r103.getClass();
                        obj3 = r103.decodeFromString(str6, FaceAnalysisFragment.WorkflowSettings.Companion.serializer());
                    }
                    FaceAnalysisFragment.WorkflowSettings workflowSettings5 = (FaceAnalysisFragment.WorkflowSettings) obj3;
                    if ((workflowSettings5 == null || (d5 = workflowSettings5.p) == null) && (d5 = MultipartBody.Companion.d(faceAnalysisFragment.getArguments(), "recordingIconDrawableId")) == null) {
                        FaceAnalysisFragment.Companion.getClass();
                        d5 = FaceAnalysisFragment.Companion.getDefaultWorkflowSettings(miSnapSettings3).p;
                    }
                    if (d5 != null) {
                        recordingIconView3.setDrawableId(d5.intValue());
                    }
                    if (str12 != null && (str5 = workflow3.get(str12)) != null) {
                        Json.Default r43 = Json.Default;
                        r43.getClass();
                        obj4 = r43.decodeFromString(str5, FaceAnalysisFragment.WorkflowSettings.Companion.serializer());
                    }
                    FaceAnalysisFragment.WorkflowSettings workflowSettings6 = (FaceAnalysisFragment.WorkflowSettings) obj4;
                    if ((workflowSettings6 == null || (d6 = workflowSettings6.q) == null) && (d6 = MultipartBody.Companion.d(faceAnalysisFragment.getArguments(), "recordingIconAnimationId")) == null) {
                        FaceAnalysisFragment.Companion.getClass();
                        d6 = FaceAnalysisFragment.Companion.getDefaultWorkflowSettings(miSnapSettings3).q;
                    }
                    if (d6 != null) {
                        int intValue3 = d6.intValue();
                        Context requireContext3 = faceAnalysisFragment.requireContext();
                        requireContext3.getClass();
                        recordingIconView3.setAnimation(MultipartBody.Companion.a(requireContext3, intValue3));
                    }
                    recordingIconView3.start();
                }
                final MiSnapWorkflowViewModel miSnapWorkflowViewModel3 = (MiSnapWorkflowViewModel) this.$properties;
                FaceAnalysisFragment.Companion companion3 = FaceAnalysisFragment.Companion;
                ?? r23 = new Observer() { // from class: com.miteksystems.misnap.workflow.fragment.FaceAnalysisFragment$$ExternalSyntheticLambda7
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj6) {
                        int i4 = i;
                        MiSnapSettings.Camera.TorchMode torchMode = MiSnapSettings.Camera.TorchMode.OFF;
                        MiSnapSettings.Camera.TorchMode torchMode2 = MiSnapSettings.Camera.TorchMode.ON;
                        MiSnapWorkflowViewModel miSnapWorkflowViewModel22 = miSnapWorkflowViewModel3;
                        MiSnapSettings miSnapSettings22 = miSnapSettings3;
                        Fragment fragment = faceAnalysisFragment;
                        switch (i4) {
                            case 0:
                                FaceAnalysisFragment faceAnalysisFragment2 = (FaceAnalysisFragment) fragment;
                                Boolean bool = (Boolean) obj6;
                                FaceAnalysisFragment.Companion companion22 = FaceAnalysisFragment.Companion;
                                miSnapWorkflowViewModel22.getClass();
                                if (bool != null) {
                                    boolean booleanValue = bool.booleanValue();
                                    MiSnapView.setTorchEnabled$default(faceAnalysisFragment2.getBinding$workflow_release().m, booleanValue, null, 2, null);
                                    MiSnapSettings.Camera camera22 = miSnapSettings22.camera;
                                    if (booleanValue) {
                                        torchMode = torchMode2;
                                    }
                                    camera22.a = torchMode;
                                    miSnapWorkflowViewModel22.updateState$workflow_release(miSnapSettings22);
                                    break;
                                }
                                break;
                            case 1:
                                BarcodeAnalysisFragment barcodeAnalysisFragment2 = (BarcodeAnalysisFragment) fragment;
                                Boolean bool2 = (Boolean) obj6;
                                BarcodeAnalysisFragment.Companion companion32 = BarcodeAnalysisFragment.Companion;
                                miSnapWorkflowViewModel22.getClass();
                                if (bool2 != null) {
                                    boolean booleanValue2 = bool2.booleanValue();
                                    MiSnapView.setTorchEnabled$default(barcodeAnalysisFragment2.getBinding$workflow_release().k, booleanValue2, null, 2, null);
                                    MiSnapSettings.Camera camera32 = miSnapSettings22.camera;
                                    if (booleanValue2) {
                                        torchMode = torchMode2;
                                    }
                                    camera32.a = torchMode;
                                    miSnapWorkflowViewModel22.updateState$workflow_release(miSnapSettings22);
                                    break;
                                }
                                break;
                            default:
                                DocumentAnalysisFragment documentAnalysisFragment2 = (DocumentAnalysisFragment) fragment;
                                Boolean bool3 = (Boolean) obj6;
                                DocumentAnalysisFragment.Companion companion4 = DocumentAnalysisFragment.Companion;
                                miSnapWorkflowViewModel22.getClass();
                                if (bool3 != null) {
                                    boolean booleanValue3 = bool3.booleanValue();
                                    MiSnapView.setTorchEnabled$default(documentAnalysisFragment2.getBinding$workflow_release().l, booleanValue3, null, 2, null);
                                    MiSnapSettings.Camera camera4 = miSnapSettings22.camera;
                                    if (booleanValue3) {
                                        torchMode = torchMode2;
                                    }
                                    camera4.a = torchMode;
                                    miSnapWorkflowViewModel22.updateState$workflow_release(miSnapSettings22);
                                    break;
                                }
                                break;
                        }
                    }
                };
                faceAnalysisFragment.getBinding$workflow_release().p.b.observe(faceAnalysisFragment.getViewLifecycleOwner(), r23);
                faceAnalysisFragment.t = r23;
                TorchView torchView3 = faceAnalysisFragment.getBinding$workflow_release().p;
                LifecycleOwner viewLifecycleOwner3 = faceAnalysisFragment.getViewLifecycleOwner();
                viewLifecycleOwner3.getClass();
                torchView3.observe(viewLifecycleOwner3, faceAnalysisFragment.getBinding$workflow_release().m.A);
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndroidPopup_androidKt$Popup$3$1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(0);
        this.$r8$classId = i;
        this.$popupLayout = obj;
        this.$onDismissRequest = obj2;
        this.$properties = obj3;
        this.$layoutDirection = obj4;
    }
}
