package com.squareup.cash.banking.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedScope;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.banking.viewmodels.BetterOverdraftViewModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.util.cash.Countries;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class BetterOverdraftViewKt$$ExternalSyntheticLambda9 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BetterOverdraftViewModel.Loaded.OverdraftLimitsInfo f$0;

    public /* synthetic */ BetterOverdraftViewKt$$ExternalSyntheticLambda9(BetterOverdraftViewModel.Loaded.OverdraftLimitsInfo overdraftLimitsInfo, int i) {
        this.$r8$classId = i;
        this.f$0 = overdraftLimitsInfo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        BetterOverdraftViewModel.Loaded.OverdraftLimitsInfo overdraftLimitsInfo = this.f$0;
        final int i2 = 0;
        final int i3 = 1;
        switch (i) {
            case 0:
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.padding(companion, paddingValues), 1.0f);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxWidth, colors.semantic.background.f1047app, ColorKt.RectangleShape);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
                    String str = overdraftLimitsInfo.title;
                    String str2 = overdraftLimitsInfo.body;
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Countries.PageHeader(str, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), (Function2) null, str2, gapComposer, 0, 4);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                    ListUnorderedKt.ListUnordered((Modifier) null, (ListUnorderedState) null, ListUnorderedProminence.Standard, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(10175984, new BetterOverdraftViewKt$$ExternalSyntheticLambda9(overdraftLimitsInfo, i3), gapComposer), gapComposer, 196992, 27);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((ListUnorderedScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    for (final BetterOverdraftViewModel.Loaded.OverdraftLimitsInfo.OverdraftLimitsInfoItem overdraftLimitsInfoItem : overdraftLimitsInfo.items) {
                        CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(Expect_jvmKt.rememberComposableLambda(1821844749, new Function2() { // from class: com.squareup.cash.banking.views.BetterOverdraftViewKt$$ExternalSyntheticLambda24
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                int i4 = i2;
                                BetterOverdraftViewModel.Loaded.OverdraftLimitsInfo.OverdraftLimitsInfoItem overdraftLimitsInfoItem2 = overdraftLimitsInfoItem;
                                switch (i4) {
                                    case 0:
                                        Composer composer3 = (Composer) obj4;
                                        int intValue3 = ((Integer) obj5).intValue();
                                        GapComposer gapComposer3 = (GapComposer) composer3;
                                        if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                            zzd zzdVar = Icons.Companion;
                                            String str3 = overdraftLimitsInfoItem2.icon.arcade_id;
                                            str3.getClass();
                                            zzdVar.getClass();
                                            Icons icons = zzd.get(str3);
                                            icons.getClass();
                                            Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer3, 48, 12);
                                        } else {
                                            gapComposer3.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer4 = (Composer) obj4;
                                        int intValue4 = ((Integer) obj5).intValue();
                                        GapComposer gapComposer4 = (GapComposer) composer4;
                                        if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, overdraftLimitsInfoItem2.text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer4.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer2), Expect_jvmKt.rememberComposableLambda(1878658190, new Function2() { // from class: com.squareup.cash.banking.views.BetterOverdraftViewKt$$ExternalSyntheticLambda24
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                int i4 = i3;
                                BetterOverdraftViewModel.Loaded.OverdraftLimitsInfo.OverdraftLimitsInfoItem overdraftLimitsInfoItem2 = overdraftLimitsInfoItem;
                                switch (i4) {
                                    case 0:
                                        Composer composer3 = (Composer) obj4;
                                        int intValue3 = ((Integer) obj5).intValue();
                                        GapComposer gapComposer3 = (GapComposer) composer3;
                                        if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                            zzd zzdVar = Icons.Companion;
                                            String str3 = overdraftLimitsInfoItem2.icon.arcade_id;
                                            str3.getClass();
                                            zzdVar.getClass();
                                            Icons icons = zzd.get(str3);
                                            icons.getClass();
                                            Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer3, 48, 12);
                                        } else {
                                            gapComposer3.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer4 = (Composer) obj4;
                                        int intValue4 = ((Integer) obj5).intValue();
                                        GapComposer gapComposer4 = (GapComposer) composer4;
                                        if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, overdraftLimitsInfoItem2.text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer4.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer2), null, null, false, false, null, null, null, 0L, gapComposer2, 54, 4092);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
