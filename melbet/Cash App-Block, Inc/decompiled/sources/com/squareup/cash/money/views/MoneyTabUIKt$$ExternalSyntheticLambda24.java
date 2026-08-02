package com.squareup.cash.money.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.sqldelight.driver.android.AndroidStatement;
import com.squareup.cash.R;
import com.squareup.cash.blockers.views.BlockerLayout;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.workflow1.WorkflowAction;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.selfie.CameraState;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneyTabUIKt$$ExternalSyntheticLambda24 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda24(boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        Object copy$default;
        int i = this.$r8$classId;
        float f = RecyclerView.DECELERATION_RATE;
        boolean z = true;
        int i2 = 0;
        boolean z2 = this.f$0;
        switch (i) {
            case 0:
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                LazyListScope.item$default(lazyListScope, null, null, HypeWelcomeUIKt.lambda$371650462, 3);
                LazyListScope.item$default(lazyListScope, null, null, HypeWelcomeUIKt.lambda$1127266183, 3);
                LazyListScope.item$default(lazyListScope, null, null, new ComposableLambdaImpl(new MoneyTabUIKt$$ExternalSyntheticLambda38(z2, i2), true, -265667226), 3);
                LazyListScope.item$default(lazyListScope, null, null, HypeWelcomeUIKt.f475lambda$1658600635, 3);
                LazyListScope.item$default(lazyListScope, null, null, HypeWelcomeUIKt.lambda$1243433252, 3);
                LazyListScope.item$default(lazyListScope, null, null, HypeWelcomeUIKt.f473lambda$149500157, 3);
                LazyListScope.items$default(lazyListScope, 5, null, HypeWelcomeUIKt.lambda$550885429, 6);
                LazyListScope.item$default(lazyListScope, null, null, HypeWelcomeUIKt.f474lambda$1542433566, 3);
                break;
            case 1:
                LocalImage localImage = (LocalImage) obj;
                localImage.getClass();
                if (z2) {
                    str = localImage.light_url;
                } else {
                    String str2 = localImage.dark_url;
                    if (str2 != null) {
                        if (StringsKt.isBlank(str2)) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            str = str2;
                        }
                    }
                    str = localImage.light_url;
                }
                if (str != null && !StringsKt.isBlank(str)) {
                    break;
                }
                break;
            case 2:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope.getClass();
                if (z2) {
                    f = 180.0f;
                }
                reusableGraphicsLayerScope.setRotationY(f);
                break;
            case 3:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, z2);
                break;
            case 4:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver2, z2);
                break;
            case 5:
                View view = (View) obj;
                int i3 = BlockerLayout.$r8$clinit;
                view.getClass();
                if (view instanceof MooncakePillButton) {
                    ((MooncakePillButton) view).setEnabled(!z2);
                }
                break;
            case 6:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope2 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope2.getClass();
                reusableGraphicsLayerScope2.setAlpha(z2 ? 1.0f : 0.0f);
                break;
            case 7:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope3 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope3.getClass();
                reusableGraphicsLayerScope3.setAlpha(z2 ? 1.0f : 0.0f);
                break;
            case 8:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindBoolean(0, Boolean.valueOf(z2));
                break;
            case 9:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindBoolean(0, Boolean.valueOf(z2));
                break;
            case 10:
                FamilyProfile familyProfile = (FamilyProfile) obj;
                familyProfile.getClass();
                if (!z2 && !(familyProfile instanceof FamilyProfile.ManagedAccount)) {
                    z = false;
                }
                break;
            case 11:
                ((AnimatedContentTransitionScopeImpl) obj).getClass();
                break;
            case 12:
                int intValue = ((Integer) obj).intValue();
                if (!z2) {
                    intValue = -intValue;
                }
                break;
            case 13:
                int intValue2 = ((Integer) obj).intValue();
                if (z2) {
                    intValue2 = -intValue2;
                }
                break;
            case 14:
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver3.getClass();
                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver3, 3);
                SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver3, z2);
                break;
            case 15:
                SemanticsPropertyReceiver semanticsPropertyReceiver4 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver4.getClass();
                if (!z2) {
                    SemanticsPropertiesKt.disabled(semanticsPropertyReceiver4);
                }
                break;
            case 16:
                SemanticsPropertyReceiver semanticsPropertyReceiver5 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver5.getClass();
                if (z2) {
                    SemanticsPropertiesKt.disabled(semanticsPropertyReceiver5);
                }
                break;
            case 17:
                TextView textView = (TextView) obj;
                textView.getClass();
                textView.setTypeface(ResourcesCompat.getFont(textView.getContext(), z2 ? R.font.cashsans_medium : R.font.cashsans_regular));
                textView.setLetterSpacing(0.1f);
                int[][] iArr = {new int[]{android.R.attr.state_selected}, new int[0]};
                Context context = textView.getContext();
                context.getClass();
                textView.setTextColor(new ColorStateList(iArr, new int[]{ColorKt.m694toArgb8_81llA(ThemeHelpersKt.findThemeInfo(context).arcadeColors.semantic.text.standard), textView.getContext().getColor(R.color.investing_graph_line_color_gray)}));
                break;
            case 18:
                SemanticsPropertyReceiver semanticsPropertyReceiver6 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver6.getClass();
                if (!z2) {
                    SemanticsPropertiesKt.m949setLiveRegionhR3wRGc(semanticsPropertyReceiver6, 0);
                }
                break;
            case 19:
                int intValue3 = ((Integer) obj).intValue();
                if (!z2) {
                    intValue3 = -intValue3;
                }
                break;
            case 20:
                int intValue4 = ((Integer) obj).intValue();
                if (z2) {
                    intValue4 = -intValue4;
                }
                break;
            case 21:
                SemanticsPropertyReceiver semanticsPropertyReceiver7 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver7.getClass();
                SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver7, z2);
                break;
            case 22:
                WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
                updater.getClass();
                if (z2) {
                    updater.state = PermissionRequestWorkflow.PermissionRequestState.ShowRequestPermissionRationale.INSTANCE;
                } else {
                    updater.state = PermissionRequestWorkflow.PermissionRequestState.RequestPermission.INSTANCE;
                }
                break;
            default:
                WorkflowAction.Updater updater2 = (WorkflowAction.Updater) obj;
                updater2.getClass();
                SelfieState selfieState = (SelfieState) updater2.state;
                if (!(selfieState instanceof CameraState)) {
                    break;
                } else {
                    boolean z3 = selfieState instanceof SelfieState.Capture;
                    boolean z4 = this.f$0;
                    if (!z3) {
                        if (!(selfieState instanceof SelfieState.CountdownToManualCapture)) {
                            if (!(selfieState instanceof SelfieState.StartCapture)) {
                                if (!(selfieState instanceof SelfieState.CountdownToCapture)) {
                                    if (!(selfieState instanceof SelfieState.ShowPoseHint)) {
                                        if (!(selfieState instanceof SelfieState.StartCaptureFaceDetected)) {
                                            if (!(selfieState instanceof SelfieState.WaitForCameraFeed)) {
                                                if (!(selfieState instanceof SelfieState.WaitForWebRtcSetup)) {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    break;
                                                } else {
                                                    copy$default = SelfieState.WaitForWebRtcSetup.copy$default((SelfieState.WaitForWebRtcSetup) selfieState, z4);
                                                }
                                            } else {
                                                copy$default = SelfieState.WaitForCameraFeed.copy$default((SelfieState.WaitForCameraFeed) selfieState, false, false, z4, 127);
                                            }
                                        } else {
                                            copy$default = SelfieState.StartCaptureFaceDetected.copy$default((SelfieState.StartCaptureFaceDetected) selfieState, z4);
                                        }
                                    } else {
                                        copy$default = SelfieState.ShowPoseHint.copy$default((SelfieState.ShowPoseHint) selfieState, z4);
                                    }
                                } else {
                                    copy$default = SelfieState.CountdownToCapture.copy$default((SelfieState.CountdownToCapture) selfieState, 0, null, z4, 8191);
                                }
                            } else {
                                copy$default = SelfieState.StartCapture.copy$default((SelfieState.StartCapture) selfieState, null, RecyclerView.DECELERATION_RATE, null, z4, 8191);
                            }
                        } else {
                            copy$default = SelfieState.CountdownToManualCapture.copy$default((SelfieState.CountdownToManualCapture) selfieState, 0, null, z4, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG2);
                        }
                    } else {
                        copy$default = SelfieState.Capture.copy$default((SelfieState.Capture) selfieState, null, RecyclerView.DECELERATION_RATE, null, z4, null, 12287);
                    }
                    updater2.state = copy$default;
                    break;
                }
        }
        return Unit.INSTANCE;
    }
}
