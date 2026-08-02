package com.squareup.cash.earningstracker.views.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import com.squareup.cash.charting.components.EarningsBarChartConfig;
import com.squareup.cash.db.contacts.Recipient$$ExternalSyntheticLambda2;
import com.squareup.cash.education.stories.db.StoryQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.views.OffersSearchViewKt$$ExternalSyntheticLambda6;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class BarChartKt {
    static {
        EarningsBarChartConfig.m3457copyY9O4PVA$default(BarChartConfigKt.DEFAULT_BAR_CHART_CONFIG, new StoryQueries$$ExternalSyntheticLambda0(11), null, false, false, 111);
    }

    public static final void BarChart(List list, String str, Modifier modifier, EarningsBarChartConfig earningsBarChartConfig, Function1 function1, Function0 function0, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Function1 function12;
        int i4;
        Function0 function02;
        int i5;
        Function0 function03;
        Function1 function13;
        Function0 function04;
        list.getClass();
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1088107160);
        int i6 = i | (gapComposer.changedInstance(list) ? 4 : 2) | (gapComposer.changed(str) ? 32 : 16);
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 = i6 | MLKEMEngine.KyberPolyBytes;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i6 | (gapComposer.changed(modifier2) ? 256 : 128);
        }
        int i8 = i3 | (gapComposer.changed(earningsBarChartConfig) ? 2048 : 1024);
        int i9 = i2 & 16;
        if (i9 != 0) {
            i4 = i8 | 24576;
            function12 = function1;
        } else {
            function12 = function1;
            i4 = i8 | (gapComposer.changedInstance(function12) ? 16384 : PKIFailureInfo.certRevoked);
        }
        int i10 = i2 & 32;
        if (i10 != 0) {
            i5 = i4 | 196608;
            function02 = function0;
        } else {
            function02 = function0;
            i5 = i4 | (gapComposer.changedInstance(function02) ? PKIFailureInfo.unsupportedVersion : 65536);
        }
        if (gapComposer.shouldExecute(i5 & 1, (74899 & i5) != 74898)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                Modifier modifier3 = i7 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                Object obj = Composer.Companion.Empty;
                if (i9 != 0) {
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == obj) {
                        rememberedValue = new StoryQueries$$ExternalSyntheticLambda0(10);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    function13 = (Function1) rememberedValue;
                } else {
                    function13 = function12;
                }
                if (i10 != 0) {
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (rememberedValue2 == obj) {
                        rememberedValue2 = new Recipient$$ExternalSyntheticLambda2(17);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    function04 = (Function0) rememberedValue2;
                    function12 = function13;
                    modifier2 = modifier3;
                    gapComposer.endDefaults();
                    com.squareup.cash.charting.components.BarChartKt.EarningsBarChart(list, str, modifier2, earningsBarChartConfig, function12, function04, gapComposer, i5 & 524286, 0);
                    function03 = function04;
                } else {
                    modifier2 = modifier3;
                    function12 = function13;
                }
            } else {
                gapComposer.skipToGroupEnd();
            }
            function04 = function02;
            gapComposer.endDefaults();
            com.squareup.cash.charting.components.BarChartKt.EarningsBarChart(list, str, modifier2, earningsBarChartConfig, function12, function04, gapComposer, i5 & 524286, 0);
            function03 = function04;
        } else {
            gapComposer.skipToGroupEnd();
            function03 = function02;
        }
        Modifier modifier4 = modifier2;
        Function1 function14 = function12;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OffersSearchViewKt$$ExternalSyntheticLambda6(list, str, modifier4, earningsBarChartConfig, function14, function03, i, i2);
        }
    }
}
