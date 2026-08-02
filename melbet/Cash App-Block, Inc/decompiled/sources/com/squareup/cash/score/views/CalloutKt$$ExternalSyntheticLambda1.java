package com.squareup.cash.score.views;

import android.hardware.SensorEvent;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.tracing.Trace;
import app.cash.api.ApiResult;
import coil3.size.DimensionKt;
import com.squareup.cash.blockers.analytics.BlockerResponse;
import com.squareup.cash.db.Session;
import com.squareup.cash.money.core.states.AppletTileInstallationState;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.score.applets.viewmodels.ScoreAppletTileViewModel;
import com.squareup.cash.scrubbing.FakeTextFieldBuffer$BufferEntry;
import com.squareup.cash.scrubbing.HyphenatingScrubber;
import com.squareup.cash.securityhub.viewmodels.BookletViewEvent;
import com.squareup.cash.securityhub.viewmodels.RecoveryGuideViewEvent;
import com.squareup.cash.securityhub.viewmodels.SecurityHubViewEvent;
import com.squareup.cash.sensors.GyroscopeEvent;
import com.squareup.cash.sensors.LifecycleSensorEvent;
import com.squareup.protos.cash.security.SetPasswordResponse;
import com.squareup.protos.cash.security.VerifyPasswordResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final /* synthetic */ class CalloutKt$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ CalloutKt$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        String str2;
        boolean z = true;
        switch (this.$r8$classId) {
            case 0:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 1:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            case 2:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl.getClass();
                return Strings.fadeAndScaleLoadingTransition(animatedContentTransitionScopeImpl);
            case 3:
                ScoreAppletTileViewModel scoreAppletTileViewModel = (ScoreAppletTileViewModel) obj;
                scoreAppletTileViewModel.getClass();
                if (scoreAppletTileViewModel instanceof ScoreAppletTileViewModel.Loading) {
                    return AppletTileInstallationState.Loading.INSTANCE;
                }
                if (scoreAppletTileViewModel instanceof ScoreAppletTileViewModel.Installed) {
                    return AppletTileInstallationState.Installed.INSTANCE;
                }
                if (scoreAppletTileViewModel instanceof ScoreAppletTileViewModel.Uninstalled) {
                    return AppletTileInstallationState.Uninstalled.INSTANCE;
                }
                if (scoreAppletTileViewModel instanceof ScoreAppletTileViewModel.Failure) {
                    return new AppletTileInstallationState.Failure(((ScoreAppletTileViewModel.Failure) scoreAppletTileViewModel).cause);
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 4:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 5:
                ((AnimatedContentTransitionScopeImpl) obj).getClass();
                return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInVertically$default(1, new CalloutKt$$ExternalSyntheticLambda1(7)).plus(EnterExitTransitionKt.fadeIn$default(null, 3)), EnterExitTransitionKt.slideOutVertically$default(1, new CalloutKt$$ExternalSyntheticLambda1(8)).plus(EnterExitTransitionKt.fadeOut$default(null, 3)));
            case 6:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.m949setLiveRegionhR3wRGc(semanticsPropertyReceiver2, 0);
                return Unit.INSTANCE;
            case 7:
                return Integer.valueOf(((Integer) obj).intValue() / 2);
            case 8:
                return Integer.valueOf((-((Integer) obj).intValue()) / 2);
            case 9:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope.getClass();
                reusableGraphicsLayerScope.setClip(false);
                return Unit.INSTANCE;
            case 10:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope2 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope2.getClass();
                reusableGraphicsLayerScope2.setClip(false);
                return Unit.INSTANCE;
            case 11:
                FakeTextFieldBuffer$BufferEntry fakeTextFieldBuffer$BufferEntry = (FakeTextFieldBuffer$BufferEntry) obj;
                fakeTextFieldBuffer$BufferEntry.getClass();
                return String.valueOf(fakeTextFieldBuffer$BufferEntry.getChar());
            case 12:
                ((Integer) obj).intValue();
                return HyphenatingScrubber.HyphenateMode.PREFIX;
            case 13:
                String str3 = (String) obj;
                str3.getClass();
                ArrayList arrayList = new ArrayList(str3.length());
                int i = 0;
                int i2 = 0;
                while (i < str3.length()) {
                    char charAt = str3.charAt(i);
                    int i3 = i2 + 1;
                    arrayList.add(Boolean.valueOf(i2 % 2 == 1 ? Character.isDigit(charAt) : Character.isLetter(charAt)));
                    i++;
                    i2 = i3;
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!((Boolean) it.next()).booleanValue()) {
                                z = false;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 14:
                ((String) obj).getClass();
                return Boolean.TRUE;
            case 15:
                ApiResult.Success success = (ApiResult.Success) obj;
                success.getClass();
                ResponseContext responseContext = ((SetPasswordResponse) success.response).response_context;
                if (responseContext == null || (str = responseContext.dialog_message) == null) {
                    return null;
                }
                return new BlockerResponse.Error((String) null, str, 5);
            case 16:
                ApiResult.Success success2 = (ApiResult.Success) obj;
                success2.getClass();
                VerifyPasswordResponse verifyPasswordResponse = (VerifyPasswordResponse) success2.response;
                if (Intrinsics.areEqual(verifyPasswordResponse.invalidate_password_token, Boolean.TRUE)) {
                    return new BlockerResponse.Error("-1", (String) null, 6);
                }
                ResponseContext responseContext2 = verifyPasswordResponse.response_context;
                if (responseContext2 == null || (str2 = responseContext2.dialog_message) == null) {
                    return null;
                }
                return new BlockerResponse.Error((String) null, str2, 5);
            case 17:
                ThemeInfo themeInfo = (ThemeInfo) obj;
                themeInfo.getClass();
                return Trace.taxesStyle(themeInfo);
            case 18:
                ((BookletViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 19:
                ((BookletViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 20:
                ((BookletViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 21:
                ((BookletViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 22:
                ((BookletViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 23:
                ((RecoveryGuideViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 24:
                ((RecoveryGuideViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 25:
                ((SecurityHubViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 26:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 27:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 28:
                LifecycleSensorEvent lifecycleSensorEvent = (LifecycleSensorEvent) obj;
                lifecycleSensorEvent.getClass();
                if (lifecycleSensorEvent instanceof LifecycleSensorEvent.MissingSensor) {
                    return GyroscopeEvent.MissingSensor.INSTANCE;
                }
                if (!(lifecycleSensorEvent instanceof LifecycleSensorEvent.Data)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                SensorEvent sensorEvent = ((LifecycleSensorEvent.Data) lifecycleSensorEvent).event;
                float[] fArr = sensorEvent.values;
                return new GyroscopeEvent.Data(sensorEvent.timestamp, fArr[0], fArr[1], fArr[2]);
            default:
                Session session = (Session) obj;
                session.getClass();
                return DimensionKt.onboardedAccountStatus(session.account_token, session.onboarded);
        }
    }
}
