package com.squareup.cash.pools.views;

import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.pools.views.animation.GoalMetAnimationStateHolder;
import com.squareup.cash.pools.views.animation.GoalMetTimeline;
import com.squareup.cash.profile.views.ErrorView$$ExternalSyntheticLambda1;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda1;
import com.squareup.cash.profile.views.RingtoneView;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda4;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.random.XorWowRandom;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class PoolGoalMetKt {
    public static final List layout1 = CollectionsKt__CollectionsJVMKt.listOf(new Placement(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0.5f));
    public static final List layout4 = CollectionsKt__CollectionsKt.listOf((Object[]) new Placement[]{new Placement(45.0f, 0.32f, 0.5f), new Placement(229.0f, 0.56f, 0.37f), new Placement(296.0f, 0.59f, 0.25f), new Placement(161.0f, 0.57f, 0.25f)});
    public static final List layout7 = CollectionsKt__CollectionsKt.listOf((Object[]) new Placement[]{new Placement(60.0f, 0.28f, 0.5f), new Placement(225.0f, 0.61f, 0.37f), new Placement(291.0f, 0.55f, 0.25f), new Placement(164.0f, 0.65f, 0.25f), new Placement(334.0f, 0.68f, 0.2f), new Placement(266.0f, 0.95f, 0.25f), new Placement(118.0f, 0.88f, 0.25f)});
    public static final List layout9 = CollectionsKt__CollectionsKt.listOf((Object[]) new Placement[]{new Placement(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0.5f), new Placement(223.0f, 0.88f, 0.37f), new Placement(268.0f, 0.76f, 0.25f), new Placement(178.0f, 0.76f, 0.25f), new Placement(305.0f, 0.71f, 0.2f), new Placement(252.0f, 1.06f, 0.13f), new Placement(114.0f, 0.76f, 0.25f), new Placement(60.0f, 0.88f, 0.37f), new Placement(147.0f, 0.65f, 0.13f)});
    public static final List layout10 = CollectionsKt__CollectionsKt.listOf((Object[]) new Placement[]{new Placement(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0.5f), new Placement(223.0f, 0.88f, 0.37f), new Placement(268.0f, 0.76f, 0.25f), new Placement(178.0f, 0.76f, 0.25f), new Placement(328.0f, 0.71f, 0.2f), new Placement(252.0f, 1.06f, 0.13f), new Placement(114.0f, 0.76f, 0.25f), new Placement(60.0f, 0.88f, 0.37f), new Placement(147.0f, 0.65f, 0.13f), new Placement(299.0f, 0.65f, 0.13f)});
    public static final List layoutMore = CollectionsKt__CollectionsKt.listOf((Object[]) new Placement[]{new Placement(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0.5f), new Placement(223.0f, 0.88f, 0.37f), new Placement(276.0f, 0.76f, 0.25f), new Placement(157.0f, 0.76f, 0.25f), new Placement(336.0f, 0.71f, 0.2f), new Placement(255.0f, 0.99f, 0.13f), new Placement(90.0f, 0.76f, 0.25f), new Placement(41.0f, 0.88f, 0.37f), new Placement(125.0f, 0.65f, 0.13f), new Placement(307.0f, 0.65f, 0.13f), new Placement(188.0f, 0.65f, 0.13f), new Placement(5.0f, 0.65f, 0.13f), new Placement(304.0f, 1.04f, 0.25f), new Placement(185.0f, 1.04f, 0.25f), new Placement(358.0f, 0.98f, 0.2f), new Placement(119.0f, 1.03f, 0.25f), new Placement(141.0f, 1.06f, 0.13f)});

    public static final void AvatarLayoutAnimation(List list, Modifier modifier, GoalMetTimeline goalMetTimeline, Composer composer, int i) {
        list.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1806491520);
        int i2 = (gapComposer.changedInstance(list) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16) | (gapComposer.changed(goalMetTimeline) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            OffsetKt.BoxWithConstraints(modifier, Alignment.Companion.Center, false, Expect_jvmKt.rememberComposableLambda(-1344168470, new ProfileKt$$ExternalSyntheticLambda1(20, list, goalMetTimeline), gapComposer), gapComposer, ((i2 >> 3) & 14) | 3120, 4);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorView$$ExternalSyntheticLambda1(list, modifier, goalMetTimeline, i, 5);
        }
    }

    public static final void PoolGoalMet(String str, List list, GoalMetTimeline goalMetTimeline, Modifier modifier, Composer composer, int i) {
        String str2;
        int i2;
        Modifier modifier2;
        GapComposer gapComposer;
        str.getClass();
        list.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-159520007);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (gapComposer2.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(list) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(goalMetTimeline) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            modifier2 = modifier;
            i2 |= gapComposer2.changed(modifier2) ? 2048 : 1024;
        } else {
            modifier2 = modifier;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            boolean changed = gapComposer2.changed(list);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                int hashCode = str2.hashCode();
                rememberedValue = CollectionsKt__CollectionsKt.shuffled(list, new XorWowRandom(hashCode, hashCode >> 31));
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            List list2 = (List) rememberedValue;
            boolean booleanValue = ((Boolean) gapComposer2.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
            float f = RecyclerView.DECELERATION_RATE;
            float f2 = booleanValue ? 1.0f : 0.0f;
            float f3 = booleanValue ? 1.0f : 0.5f;
            if (booleanValue) {
                f = 1.0f;
            }
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new GoalMetAnimationStateHolder(f3, f2, f);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            GoalMetAnimationStateHolder goalMetAnimationStateHolder = (GoalMetAnimationStateHolder) rememberedValue2;
            Unit unit = Unit.INSTANCE;
            boolean changed2 = gapComposer2.changed(goalMetAnimationStateHolder) | ((i2 & 896) == 256);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new RingtoneView.AnonymousClass1(goalMetTimeline, goalMetAnimationStateHolder, null, 6);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue3);
            Colors colors = ColorsDarkKt.colorsDark;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-792179516, new PoolGoalMetKt$$ExternalSyntheticLambda0(modifier2, goalMetAnimationStateHolder, list2, goalMetTimeline, 0), gapComposer2);
            gapComposer = gapComposer2;
            ArcadeThemeKt.ArcadeTheme(colors, null, null, rememberComposableLambda, gapComposer, 3072, 6);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda4(str2, i, list, goalMetTimeline, modifier, 6);
        }
    }
}
