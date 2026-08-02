package com.squareup.cash.appmessages.db;

import android.os.Parcelable;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.driver.android.AndroidStatement;
import coil3.ImageLoader$Builder;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.db.WireAdapter;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageAction;
import com.squareup.protos.cash.messagingplatformcommon.app.FullScreenMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.Video;
import com.squareup.protos.cash.ui.Color;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.WorkflowAction;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.governmentid.CaptureConfig;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdPart$SideIdPart;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda7;
import com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdRequestArguments;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Instant;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import net.oneformapp.helper.matching.POPMatchingFactory;
import okio.AsyncTimeout;

/* loaded from: classes9.dex */
public final /* synthetic */ class FullScreenMessageQueries$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Object f$10;
    public final /* synthetic */ Object f$11;
    public final /* synthetic */ Object f$12;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ Parcelable f$3;
    public final /* synthetic */ Parcelable f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Parcelable f$6;
    public final /* synthetic */ Object f$7;
    public final /* synthetic */ Object f$8;
    public final /* synthetic */ int f$9;

    public /* synthetic */ FullScreenMessageQueries$$ExternalSyntheticLambda3(GovernmentIdState governmentIdState, GovernmentId governmentId, int i, List list, GovernmentIdWorkflow.Input input, POPMatchingFactory pOPMatchingFactory, IdConfig idConfig, boolean z, String str, VideoCaptureMethod videoCaptureMethod, CameraProperties cameraProperties, String str2, StatefulWorkflow.RenderContext renderContext) {
        this.f$3 = governmentIdState;
        this.f$4 = governmentId;
        this.f$9 = i;
        this.f$5 = list;
        this.f$6 = input;
        this.f$7 = pOPMatchingFactory;
        this.f$8 = idConfig;
        this.f$2 = z;
        this.f$0 = str;
        this.f$10 = videoCaptureMethod;
        this.f$11 = cameraProperties;
        this.f$1 = str2;
        this.f$12 = renderContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object submit;
        int i = this.$r8$classId;
        Object obj2 = this.f$12;
        Object obj3 = this.f$11;
        Object obj4 = this.f$10;
        boolean z = this.f$2;
        Object obj5 = this.f$8;
        Object obj6 = this.f$7;
        Parcelable parcelable = this.f$6;
        Object obj7 = this.f$5;
        int i2 = this.f$9;
        Parcelable parcelable2 = this.f$4;
        Parcelable parcelable3 = this.f$3;
        int i3 = 1;
        switch (i) {
            case 0:
                Video video = (Video) parcelable3;
                AppMessageAction appMessageAction = (AppMessageAction) parcelable2;
                AppMessageAction appMessageAction2 = (AppMessageAction) obj7;
                Color color = (Color) parcelable;
                Color color2 = (Color) obj6;
                LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) obj5;
                Instant instant = (Instant) obj4;
                Instant instant2 = (Instant) obj3;
                FullScreenMessage.Placement placement = (FullScreenMessage.Placement) obj2;
                AndroidStatement androidStatement = (AndroidStatement) obj;
                Request$Priority$EnumUnboxingLocalUtility.m(androidStatement, 0, this.f$0, 1, this.f$1);
                androidStatement.bindBoolean(2, Boolean.valueOf(z));
                androidStatement.bindBytes(3, video != null ? (byte[]) ((WireAdapter) ((ImageLoader$Builder) localTabContentQueries.local_tab_contentAdapter).application).encode(video) : null);
                androidStatement.bindBytes(4, appMessageAction != null ? (byte[]) ((WireAdapter) ((ImageLoader$Builder) localTabContentQueries.local_tab_contentAdapter).defaults).encode(appMessageAction) : null);
                androidStatement.bindBytes(5, appMessageAction2 != null ? (byte[]) ((WireAdapter) ((ImageLoader$Builder) localTabContentQueries.local_tab_contentAdapter).mainCoroutineContextLazy).encode(appMessageAction2) : null);
                androidStatement.bindBytes(6, color != null ? (byte[]) ((WireAdapter) ((ImageLoader$Builder) localTabContentQueries.local_tab_contentAdapter).memoryCacheLazy).encode(color) : null);
                androidStatement.bindBytes(7, color2 != null ? (byte[]) ((WireAdapter) ((ImageLoader$Builder) localTabContentQueries.local_tab_contentAdapter).diskCacheLazy).encode(color2) : null);
                ImageLoader$Builder imageLoader$Builder = (ImageLoader$Builder) localTabContentQueries.local_tab_contentAdapter;
                imageLoader$Builder.getClass();
                androidStatement.bindLong(8, Long.valueOf(i2));
                androidStatement.bindLong(9, (Long) ((AsyncTimeout.Companion) imageLoader$Builder.eventListenerFactory).encode(instant));
                androidStatement.bindLong(10, instant2 != null ? Long.valueOf(((Number) ((AsyncTimeout.Companion) imageLoader$Builder.extras).encode(instant2)).longValue()) : null);
                androidStatement.bindString(11, placement != null ? (String) ((EnumColumnAdapter) imageLoader$Builder.componentRegistry).encode(placement) : null);
                return Unit.INSTANCE;
            default:
                GovernmentId governmentId = (GovernmentId) parcelable2;
                List list = (List) obj7;
                GovernmentIdWorkflow.Input input = (GovernmentIdWorkflow.Input) parcelable;
                POPMatchingFactory pOPMatchingFactory = (POPMatchingFactory) obj6;
                IdConfig idConfig = (IdConfig) obj5;
                VideoCaptureMethod videoCaptureMethod = (VideoCaptureMethod) obj4;
                CameraProperties cameraProperties = (CameraProperties) obj3;
                StatefulWorkflow.RenderContext renderContext = (StatefulWorkflow.RenderContext) obj2;
                WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
                updater.getClass();
                if (updater.state.getClass() != ((GovernmentIdState) parcelable3).getClass()) {
                    return Unit.INSTANCE;
                }
                Object obj8 = updater.state;
                List plus = governmentId != null ? CollectionsKt.plus((Collection) ((GovernmentIdState) obj8).getUploadingIds$government_id_release(), (Object) governmentId) : ((GovernmentIdState) obj8).getUploadingIds$government_id_release();
                if (i2 != list.size()) {
                    i2++;
                }
                IdPart$SideIdPart idPart$SideIdPart = (IdPart$SideIdPart) CollectionsKt.getOrNull(i2, list);
                String str = this.f$0;
                if (idPart$SideIdPart == null) {
                    int i4 = i2;
                    if (idPart$SideIdPart != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    if (videoCaptureMethod == VideoCaptureMethod.Stream) {
                        Object obj9 = updater.state;
                        if (!(obj9 instanceof GovernmentIdState.FinalizeWebRtc) && !(obj9 instanceof GovernmentIdState.ReviewSelectedImage)) {
                            submit = new GovernmentIdState.FinalizeWebRtc((IdPart$SideIdPart) CollectionsKt.last(list), plus, list, i4, GovernmentIdWorkflowUtilsKt.createBackState(updater, z), str, idConfig, cameraProperties);
                        }
                    }
                    if (videoCaptureMethod == VideoCaptureMethod.Upload) {
                        Object obj10 = updater.state;
                        if (!(obj10 instanceof GovernmentIdState.FinalizeLocalVideoCapture) && !(obj10 instanceof GovernmentIdState.ReviewSelectedImage)) {
                            submit = new GovernmentIdState.FinalizeLocalVideoCapture(idConfig, plus, (IdPart$SideIdPart) CollectionsKt.last(list), list, i4, GovernmentIdWorkflowUtilsKt.createBackState(updater, z), str, new GovernmentIdRequestArguments(plus, input.fieldKeyDocument, input.fieldKeyIdClass), 3000L, false);
                        }
                    }
                    submit = new GovernmentIdState.Submit(idConfig, plus, list, i4, GovernmentIdWorkflowUtilsKt.createBackState(updater, z), str, new GovernmentIdRequestArguments(plus, input.fieldKeyDocument, input.fieldKeyIdClass), this.f$1, cameraProperties);
                } else if (input.enabledCaptureOptionsNativeMobile.size() > 1) {
                    pOPMatchingFactory.getClass();
                    submit = new GovernmentIdState.ChooseCaptureMethod(idPart$SideIdPart, plus, list, i2, str, new CaptureConfig.IdCaptureConfig(idConfig), GovernmentIdWorkflowUtilsKt.createBackState(updater, z));
                } else {
                    CaptureConfig.IdCaptureConfig idCaptureConfig = new CaptureConfig.IdCaptureConfig(idConfig);
                    Screen.CameraScreen.ManualCapture manualCaptureDefaultState = GovernmentIdWorkflowUtilsKt.getManualCaptureDefaultState((GovernmentIdWorkflow.Input) updater.props, idPart$SideIdPart.side);
                    GovernmentIdState createBackState = GovernmentIdWorkflowUtilsKt.createBackState(updater, z);
                    String str2 = input.videoCaptureConfig.webRtcJwt;
                    pOPMatchingFactory.getClass();
                    submit = new GovernmentIdState.WaitForAutocapture(idPart$SideIdPart, plus, idCaptureConfig, manualCaptureDefaultState, list, i2, createBackState, WebRtcState.Disconnected, str2, null, false, false, str, null, new CaptureRenderer$$ExternalSyntheticLambda7(renderContext, pOPMatchingFactory, i3), 11776);
                }
                updater.state = submit;
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ FullScreenMessageQueries$$ExternalSyntheticLambda3(String str, String str2, boolean z, Video video, AppMessageAction appMessageAction, AppMessageAction appMessageAction2, Color color, Color color2, LocalTabContentQueries localTabContentQueries, int i, Instant instant, Instant instant2, FullScreenMessage.Placement placement) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = z;
        this.f$3 = video;
        this.f$4 = appMessageAction;
        this.f$5 = appMessageAction2;
        this.f$6 = color;
        this.f$7 = color2;
        this.f$8 = localTabContentQueries;
        this.f$9 = i;
        this.f$10 = instant;
        this.f$11 = instant2;
        this.f$12 = placement;
    }
}
