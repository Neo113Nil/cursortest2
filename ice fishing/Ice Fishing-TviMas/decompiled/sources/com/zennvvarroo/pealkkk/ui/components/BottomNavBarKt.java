package com.zennvvarroo.pealkkk.ui.components;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.zennvvarroo.pealkkk.ui.model.ZenvaroTab;
import com.zennvvarroo.pealkkk.ui.theme.ColorKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BottomNavBar.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u0084\u0002²\u0006\n\u0010\n\u001a\u00020\tX\u008a\u0084\u0002²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002"}, d2 = {"BottomNavBar", "", "selectedTab", "Lcom/zennvvarroo/pealkkk/ui/model/ZenvaroTab;", "onTabSelected", "Lkotlin/Function1;", "(Lcom/zennvvarroo/pealkkk/ui/model/ZenvaroTab;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "app_release", "bg", "Landroidx/compose/ui/graphics/Color;", "textColor", "scale", ""}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BottomNavBarKt {
    public static final void BottomNavBar(final ZenvaroTab selectedTab, final Function1<? super ZenvaroTab, Unit> onTabSelected, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(onTabSelected, "onTabSelected");
        Composer startRestartGroup = composer.startRestartGroup(1520296683);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(selectedTab) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(onTabSelected) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1520296683, i3, -1, "com.zennvvarroo.pealkkk.ui.components.BottomNavBar (BottomNavBar.kt:34)");
            }
            boolean z = false;
            List listOf = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(ZenvaroTab.OVERVIEW, "Overview"), TuplesKt.to(ZenvaroTab.AREAS, "Areas"), TuplesKt.to(ZenvaroTab.SHELVES, "Shelves"), TuplesKt.to(ZenvaroTab.ITEMS, "Items")});
            Modifier m563paddingVpY3zN4 = PaddingKt.m563paddingVpY3zN4(WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null)), Dp.m5734constructorimpl(14), Dp.m5734constructorimpl(10));
            startRestartGroup.startReplaceableGroup(733328855);
            String str = "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo";
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            String str2 = "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh";
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m563paddingVpY3zN4);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
            Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            String str3 = "C73@3426L9:Box.kt#2w3rfo";
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            float f = 24;
            Modifier m562padding3ABfNKs = PaddingKt.m562padding3ABfNKs(BorderKt.m221borderxT4_qwU(BackgroundKt.m210backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m832RoundedCornerShape0680j_4(Dp.m5734constructorimpl(f))), Color.m3406copywmQWz5c$default(ColorKt.getPeakPanel(), 0.95f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m5734constructorimpl(1), Color.m3406copywmQWz5c$default(Color.INSTANCE.m3444getWhite0d7_KjU(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m832RoundedCornerShape0680j_4(Dp.m5734constructorimpl(f))), Dp.m5734constructorimpl(6));
            Arrangement.HorizontalOrVertical m471spacedBy0680j_4 = Arrangement.INSTANCE.m471spacedBy0680j_4(Dp.m5734constructorimpl(4));
            startRestartGroup.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m471spacedBy0680j_4, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m562padding3ABfNKs);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2937constructorimpl2 = Updater.m2937constructorimpl(startRestartGroup);
            Updater.m2944setimpl(m2937constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m2944setimpl(m2937constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m2937constructorimpl2.getInserting() || !Intrinsics.areEqual(m2937constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2937constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2937constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326681643, "C92@4661L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(60979329);
            Iterator it = listOf.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                final ZenvaroTab zenvaroTab = (ZenvaroTab) pair.component1();
                String str4 = (String) pair.component2();
                boolean z2 = zenvaroTab == selectedTab ? true : z;
                String str5 = str;
                String str6 = str3;
                Iterator it2 = it;
                boolean z3 = z;
                State<Color> m104animateColorAsStateeuL9pac = SingleValueAnimationKt.m104animateColorAsStateeuL9pac(z2 ? Color.m3406copywmQWz5c$default(ColorKt.getPeakCyan(), 0.18f, 0.0f, 0.0f, 0.0f, 14, null) : Color.INSTANCE.m3442getTransparent0d7_KjU(), null, "tabBg", null, startRestartGroup, 384, 10);
                State<Color> m104animateColorAsStateeuL9pac2 = SingleValueAnimationKt.m104animateColorAsStateeuL9pac(z2 ? ColorKt.getPeakCyan() : ColorKt.getPeakMuted(), null, "tabText", null, startRestartGroup, 384, 10);
                State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z2 ? 1.05f : 1.0f, null, 0.0f, "tabScale", null, startRestartGroup, 3072, 22);
                Modifier m210backgroundbw27NRU$default = BackgroundKt.m210backgroundbw27NRU$default(ClipKt.clip(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), RoundedCornerShapeKt.m832RoundedCornerShape0680j_4(Dp.m5734constructorimpl(18))), BottomNavBar$lambda$7$lambda$6$lambda$5$lambda$0(m104animateColorAsStateeuL9pac), null, 2, null);
                startRestartGroup.startReplaceableGroup(779218132);
                boolean changed = startRestartGroup.changed(zenvaroTab) | ((i3 & 112) == 32 ? true : z3 ? 1 : 0);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = (Function0) new Function0<Unit>() { // from class: com.zennvvarroo.pealkkk.ui.components.BottomNavBarKt$BottomNavBar$1$1$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            onTabSelected.invoke(zenvaroTab);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                Modifier m564paddingVpY3zN4$default = PaddingKt.m564paddingVpY3zN4$default(ClickableKt.m244clickableXHw0xAI$default(m210backgroundbw27NRU$default, false, null, null, (Function0) rememberedValue, 7, null), 0.0f, Dp.m5734constructorimpl(12), 1, null);
                Alignment center = Alignment.INSTANCE.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, str5);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, z3, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, str2);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, z3 ? 1 : 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(m564paddingVpY3zN4$default);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m2937constructorimpl3 = Updater.m2937constructorimpl(startRestartGroup);
                Updater.m2944setimpl(m2937constructorimpl3, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m2944setimpl(m2937constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m2937constructorimpl3.getInserting() || !Intrinsics.areEqual(m2937constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m2937constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m2937constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                modifierMaterializerOf3.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf(z3 ? 1 : 0));
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, str6);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                long BottomNavBar$lambda$7$lambda$6$lambda$5$lambda$1 = BottomNavBar$lambda$7$lambda$6$lambda$5$lambda$1(m104animateColorAsStateeuL9pac2);
                long sp = TextUnitKt.getSp(13);
                FontWeight.Companion companion = FontWeight.INSTANCE;
                Composer composer3 = startRestartGroup;
                TextKt.m2125Text4IGK_g(str4, ScaleKt.scale(Modifier.INSTANCE, BottomNavBar$lambda$7$lambda$6$lambda$5$lambda$2(animateFloatAsState)), BottomNavBar$lambda$7$lambda$6$lambda$5$lambda$1, sp, (FontStyle) null, z2 ? companion.getBold() : companion.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3072, 0, 131024);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer3.endReplaceableGroup();
                composer3.endNode();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                z = z3 ? 1 : 0;
                str3 = str6;
                str2 = str2;
                i3 = i3;
                str = str5;
                startRestartGroup = composer3;
                it = it2;
            }
            composer2 = startRestartGroup;
            composer2.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.components.BottomNavBarKt$BottomNavBar$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                    invoke(composer4, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer4, int i4) {
                    BottomNavBarKt.BottomNavBar(ZenvaroTab.this, onTabSelected, composer4, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    private static final long BottomNavBar$lambda$7$lambda$6$lambda$5$lambda$0(State<Color> state) {
        return state.getValue().m3417unboximpl();
    }

    private static final long BottomNavBar$lambda$7$lambda$6$lambda$5$lambda$1(State<Color> state) {
        return state.getValue().m3417unboximpl();
    }

    private static final float BottomNavBar$lambda$7$lambda$6$lambda$5$lambda$2(State<Float> state) {
        return state.getValue().floatValue();
    }
}
