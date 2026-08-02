package com.squareup.cash.borrow.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.ColorsLightKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.borrow.viewmodels.BorrowHomeViewModel;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class BulletinTileKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ BorrowHomeViewModel.Tile.BulletinTileModel f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ BulletinTileKt$$ExternalSyntheticLambda0(BorrowHomeViewModel.Tile.BulletinTileModel bulletinTileModel, Function1 function1) {
        this.f$1 = bulletinTileModel;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$2;
        BorrowHomeViewModel.Tile.BulletinTileModel bulletinTileModel = this.f$1;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(Modifier.Companion.$$INSTANCE, null, 3);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                    Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(ImageKt.m177backgroundbw27NRU(wrapContentSize$default, colors.semantic.background.f1047app, ColorKt.RectangleShape), RecyclerView.DECELERATION_RATE, 16.0f, 1);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
                    BorrowHomeKt.Bulletins(bulletinTileModel, function1, gapComposer, 6);
                    BorrowAppletBulletinsTile.Data.UpsellCard upsellCard = bulletinTileModel.tileData.upsell_card;
                    if (upsellCard == null) {
                        gapComposer.startReplaceGroup(-1346230025);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-1346230024);
                        Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        ArcadeThemeKt.ArcadeTheme(colors2.isLight ? ColorsLightKt.m3376createLightmxwnekA$default(3, 0L) : ColorsDarkKt.m3375createDarkmxwnekA$default(3, 0L), null, null, Expect_jvmKt.rememberComposableLambda(-1866413699, new BulletinTileKt$$ExternalSyntheticLambda2(0, upsellCard, function1), gapComposer), gapComposer, 3072, 6);
                        gapComposer.end(false);
                    }
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                num.getClass();
                BorrowHomeKt.Bulletins(bulletinTileModel, function1, composer, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ BulletinTileKt$$ExternalSyntheticLambda0(BorrowHomeViewModel.Tile.BulletinTileModel bulletinTileModel, Function1 function1, int i) {
        this.f$1 = bulletinTileModel;
        this.f$2 = function1;
    }
}
