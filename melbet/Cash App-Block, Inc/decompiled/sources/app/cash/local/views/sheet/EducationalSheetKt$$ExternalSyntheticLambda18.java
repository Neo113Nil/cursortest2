package app.cash.local.views.sheet;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.viewmodels.sheet.EducationalSheetModel;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.money.viewmodels.api.Item;
import com.squareup.cash.money.views.HypeWelcomeUIKt;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda1;
import com.squareup.cash.wallet.views.CardTransitionKt;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final /* synthetic */ class EducationalSheetKt$$ExternalSyntheticLambda18 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ int f$3;
    public final /* synthetic */ Object f$4;

    public /* synthetic */ EducationalSheetKt$$ExternalSyntheticLambda18(Density density, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3, int i) {
        this.$r8$classId = 1;
        this.f$0 = density;
        this.f$1 = parcelableSnapshotMutableIntState;
        this.f$2 = parcelableSnapshotMutableIntState2;
        this.f$4 = parcelableSnapshotMutableIntState3;
        this.f$3 = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        float f;
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj4 = this.f$4;
        int i2 = this.f$3;
        Object obj5 = this.f$2;
        Object obj6 = this.f$1;
        Object obj7 = this.f$0;
        switch (i) {
            case 0:
                Modifier modifier = (Modifier) obj7;
                EducationalSheetModel.Text text = (EducationalSheetModel.Text) obj6;
                Function1 function1 = (Function1) obj5;
                TextStyle textStyle = (TextStyle) obj4;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(modifier, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, 7);
                    String str = text.value;
                    int ordinal = text.style.ordinal();
                    if (ordinal == 0 || ordinal == 1) {
                        gapComposer.startReplaceGroup(954824836);
                        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        j = colors.semantic.text.prominent;
                        gapComposer.end(false);
                    } else if (ordinal == 2 || ordinal == 3) {
                        gapComposer.startReplaceGroup(954827619);
                        Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        j = colors2.semantic.text.standard;
                        gapComposer.end(false);
                    } else {
                        if (ordinal != 4 && ordinal != 5) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 954822204, false);
                        }
                        gapComposer.startReplaceGroup(954830657);
                        Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors3 == null) {
                            colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        j = colors3.semantic.text.subtle;
                        gapComposer.end(false);
                    }
                    long j2 = j;
                    boolean changed = gapComposer.changed(function1) | gapComposer.changed(i2);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new NfcNotAvailableKt$$ExternalSyntheticLambda1(function1, i2, 1, false);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue, m302paddingqDBjuR0$default, textStyle, j2, null, null, null, 0, 0, 1, gapComposer, 0, 992);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Density density = (Density) obj7;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj6;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) obj5;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3 = (ParcelableSnapshotMutableIntState) obj4;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    SpacerKt.Spacer(gapComposer2, SizeKt.m277height3ABfNKs(companion, (((density.mo233toDpu2uoSUM(parcelableSnapshotMutableIntState.getIntValue()) - density.mo233toDpu2uoSUM(parcelableSnapshotMutableIntState2.getIntValue())) - density.mo233toDpu2uoSUM(parcelableSnapshotMutableIntState3.getIntValue())) - density.mo233toDpu2uoSUM(i2)) - 24.0f));
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Dp dp = (Dp) obj7;
                Item item = (Item) obj6;
                Dp dp2 = (Dp) obj5;
                List list = (List) obj4;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    Modifier evolutionBackground = HypeWelcomeUIKt.evolutionBackground(CardTransitionKt.cardSlideInOut(companion, gapComposer3), null, gapComposer3, 3);
                    float f2 = 16.0f;
                    if (dp == null) {
                        gapComposer3.startReplaceGroup(-1635358621);
                        ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        DefaultSizes.spacing.getClass();
                        gapComposer3.end(false);
                        f = 16.0f;
                    } else {
                        gapComposer3.startReplaceGroup(-1635360295);
                        gapComposer3.end(false);
                        f = dp.value;
                    }
                    if (dp == null) {
                        gapComposer3.startReplaceGroup(-1635355997);
                        ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        DefaultSizes.spacing.getClass();
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(-1635357671);
                        gapComposer3.end(false);
                        f2 = dp.value;
                    }
                    Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(evolutionBackground, f, RecyclerView.DECELERATION_RATE, f2, RecyclerView.DECELERATION_RATE, 8);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, m302paddingqDBjuR0$default2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer3.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    item.UI(gapComposer3, 0);
                    if (dp2 == null || i2 >= CollectionsKt__CollectionsKt.getLastIndex(list)) {
                        gapComposer3.startReplaceGroup(188901403);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(188802420);
                        re$$ExternalSyntheticOutline0.m(companion, dp2.value, gapComposer3, false);
                    }
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ EducationalSheetKt$$ExternalSyntheticLambda18(Object obj, Object obj2, Object obj3, int i, Object obj4, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = i;
        this.f$4 = obj4;
    }
}
