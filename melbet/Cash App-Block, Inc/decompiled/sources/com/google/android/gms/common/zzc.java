package com.google.android.gms.common;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import app.cash.zipline.loader.internal.fetcher.FetcherKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import com.squareup.cash.checks.VerifyCheckDepositKt$$ExternalSyntheticLambda14;
import com.squareup.cash.core.views.ArcadeBottomNavigationKt$$ExternalSyntheticLambda3;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.shopping.views.search.ShopMessageKt$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.discover.api.app.v1.model.Button;
import com.squareup.protos.cash.discover.api.app.v1.model.Button$Content$Icon;
import com.squareup.protos.cash.discover.api.app.v1.model.Button$Content$Text;
import com.squareup.protos.cash.ui.Image;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.utils.Experiment;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class zzc {
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SectionHeaderButton(Button button, RealImageLoader realImageLoader, Modifier modifier, Function1 function1, Composer composer, int i) {
        Modifier modifier2;
        String str;
        button.getClass();
        FetcherKt fetcherKt = button.content;
        realImageLoader.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-411212170);
        int i2 = i | (gapComposer.changedInstance(button) ? 4 : 2) | (gapComposer.changedInstance(realImageLoader) ? 32 : 16) | MLKEMEngine.KyberPolyBytes | (gapComposer.changed(false) ? 2048 : 1024) | (gapComposer.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            Image image = null;
            image = null;
            if (fetcherKt != null) {
                Button$Content$Text button$Content$Text = fetcherKt instanceof Button$Content$Text ? (Button$Content$Text) fetcherKt : null;
                if (button$Content$Text != null) {
                    str = button$Content$Text.value;
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    if (str == null) {
                        gapComposer.startReplaceGroup(-1174793017);
                        fetcherKt.getClass();
                        Button$Content$Text button$Content$Text2 = fetcherKt instanceof Button$Content$Text ? (Button$Content$Text) fetcherKt : null;
                        String str2 = button$Content$Text2 != null ? button$Content$Text2.value : null;
                        if (str2 == null) {
                            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                            return;
                        }
                        MooncakePillButton.Style style = MooncakePillButton.Style.TERTIARY;
                        MooncakePillButton.Size size = MooncakePillButton.Size.SMALL;
                        boolean changedInstance = ((i2 & 57344) == 16384) | gapComposer.changedInstance(button);
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (changedInstance || rememberedValue == neverEqualPolicy) {
                            rememberedValue = new ShopMessageKt$$ExternalSyntheticLambda0(function1, button, 1);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        KeypadKt.m3640ButtonGFipHI0(str2, (Function0) rememberedValue, companion, null, size, style, null, false, 0, null, null, gapComposer, 221568, 0, 4040);
                        companion = companion;
                        gapComposer = gapComposer;
                        gapComposer.end(false);
                    } else {
                        if (fetcherKt != null) {
                            Button$Content$Icon button$Content$Icon = fetcherKt instanceof Button$Content$Icon ? (Button$Content$Icon) fetcherKt : null;
                            if (button$Content$Icon != null) {
                                image = button$Content$Icon.value;
                            }
                        }
                        if (image != null) {
                            gapComposer.startReplaceGroup(-1174486210);
                            boolean changedInstance2 = gapComposer.changedInstance(button) | ((i2 & 57344) == 16384);
                            Object rememberedValue2 = gapComposer.rememberedValue();
                            if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                                rememberedValue2 = new ShopMessageKt$$ExternalSyntheticLambda0(function1, button, 2);
                                gapComposer.updateRememberedValue(rememberedValue2);
                            }
                            KeypadKt.IconButton((Function0) rememberedValue2, SizeKt.m285size3ABfNKs(companion, 16.0f), null, false, Expect_jvmKt.rememberComposableLambda(-260340173, new ArcadeBottomNavigationKt$$ExternalSyntheticLambda3(17, button, realImageLoader), gapComposer), gapComposer, 24576, 12);
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(-1174069012);
                            gapComposer.end(false);
                        }
                    }
                    modifier2 = companion;
                }
            }
            str = null;
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (str == null) {
            }
            modifier2 = companion2;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new VerifyCheckDepositKt$$ExternalSyntheticLambda14(button, i, realImageLoader, modifier2, function1, 24);
        }
    }

    public static final String experimentAssignment(FinancialConnectionsSessionManifest financialConnectionsSessionManifest, Experiment experiment) {
        financialConnectionsSessionManifest.getClass();
        Map map = financialConnectionsSessionManifest.experimentAssignments;
        if (map != null) {
            return (String) map.get(experiment.key);
        }
        return null;
    }

    public static final void trackExposure(FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl, Experiment experiment, FinancialConnectionsSessionManifest financialConnectionsSessionManifest) {
        financialConnectionsAnalyticsTrackerImpl.getClass();
        financialConnectionsSessionManifest.getClass();
        String str = financialConnectionsSessionManifest.assignmentEventId;
        String str2 = financialConnectionsSessionManifest.accountholderToken;
        if (experimentAssignment(financialConnectionsSessionManifest, experiment) == null || str == null || str2 == null) {
            return;
        }
        financialConnectionsAnalyticsTrackerImpl.track(new FinancialConnectionsAnalyticsEvent.Click(MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsKt.mapOf(new Pair("experiment_retrieved", experiment.key), new Pair("arb_id", str), new Pair("account_holder_id", str2))), "preloaded_experiment_retrieved", false));
    }

    public static int zza(int i) {
        int[] iArr = {1, 2, 3};
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }
}
