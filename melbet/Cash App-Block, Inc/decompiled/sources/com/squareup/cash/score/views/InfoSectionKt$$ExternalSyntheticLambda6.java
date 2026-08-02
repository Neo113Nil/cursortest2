package com.squareup.cash.score.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.formview.components.arcade.ArcadeLocalImageIconKt;
import com.squareup.cash.moneybot.genie.TextViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class InfoSectionKt$$ExternalSyntheticLambda6 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Icons f$0;

    public /* synthetic */ InfoSectionKt$$ExternalSyntheticLambda6(Icons icons, int i) {
        this.$r8$classId = i;
        this.f$0 = icons;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j;
        int i = this.$r8$classId;
        Icons icons = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(this.f$0, (String) null, (Modifier) null, 0L, gapComposer, 48, 12);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(this.f$0, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(this.f$0, (String) null, (Modifier) null, 0L, gapComposer3, 48, 12);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(this.f$0, (String) null, (Modifier) null, 0L, gapComposer4, 48, 12);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(this.f$0, (String) null, (Modifier) null, 0L, gapComposer5, 48, 12);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(this.f$0, (String) null, (Modifier) null, 0L, gapComposer6, 48, 12);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(this.f$0, (String) null, (Modifier) null, 0L, gapComposer7, 48, 12);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    Icons icons2 = this.f$0;
                    if (icons2 == null) {
                        gapComposer8.startReplaceGroup(1498195206);
                    } else {
                        gapComposer8.startReplaceGroup(1498195207);
                        Trace.m1191Iconww6aTOc(icons2, (String) null, (Modifier) null, 0L, gapComposer8, 48, 12);
                    }
                    gapComposer8.end(false);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    AvatarSize avatarSize = AvatarSize.Size48;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                    Colors colors = (Colors) gapComposer9.consume(staticProvidableCompositionLocal);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer9, -1762997026, gapComposer9, false);
                    } else {
                        gapComposer9.startReplaceGroup(-1762997739);
                        gapComposer9.end(false);
                    }
                    long j2 = colors.semantic.background.f1047app;
                    Colors colors2 = (Colors) gapComposer9.consume(staticProvidableCompositionLocal);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer9, -1762997026, gapComposer9, false);
                    } else {
                        gapComposer9.startReplaceGroup(-1762997739);
                        gapComposer9.end(false);
                    }
                    TextViewKt.Avatar(avatarSize, new AvatarEntry("", j2, null, new AvatarImage.LocalIcon(icons, colors2.semantic.icon.standard, 4), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer9, 6, 28);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(this.f$0, (String) null, (Modifier) null, 0L, gapComposer10, 48, 12);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (!gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    gapComposer11.skipToGroupEnd();
                } else if (icons == null) {
                    gapComposer11.startReplaceGroup(225054457);
                    gapComposer11.end(false);
                } else {
                    gapComposer11.startReplaceGroup(225054458);
                    AvatarSize avatarSize2 = AvatarSize.Size64;
                    Colors colors3 = (Colors) gapComposer11.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer11, -1762997026, gapComposer11, false);
                    } else {
                        gapComposer11.startReplaceGroup(-1762997739);
                        gapComposer11.end(false);
                    }
                    TextViewKt.Avatar(avatarSize2, new AvatarEntry("", colors3.semantic.background.brand, null, new AvatarImage.LocalIcon(icons, 0L, 6), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer11, 6, 28);
                    gapComposer11.end(false);
                }
                return Unit.INSTANCE;
            case 11:
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(this.f$0, (String) null, (Modifier) null, 0L, gapComposer12, 48, 12);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    AvatarSize avatarSize3 = AvatarSize.Size64;
                    Colors colors4 = (Colors) gapComposer13.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer13, -1762997026, gapComposer13, false);
                    } else {
                        gapComposer13.startReplaceGroup(-1762997739);
                        gapComposer13.end(false);
                    }
                    TextViewKt.m3613AvatarB_rZmmc(avatarSize3, "", colors4.semantic.background.brand, (String) null, (Modifier) null, (AvatarImage) new AvatarImage.LocalIcon(icons, 0L, 6), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer13, 3126, 0, 2000);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                Composer composer14 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    AvatarSize avatarSize4 = AvatarSize.Size48;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalColors;
                    Colors colors5 = (Colors) gapComposer14.consume(staticProvidableCompositionLocal2);
                    if (colors5 == null) {
                        colors5 = re$$ExternalSyntheticOutline0.m(gapComposer14, -1762997026, gapComposer14, false);
                    } else {
                        gapComposer14.startReplaceGroup(-1762997739);
                        gapComposer14.end(false);
                    }
                    long j3 = colors5.semantic.background.subtle;
                    Colors colors6 = (Colors) gapComposer14.consume(staticProvidableCompositionLocal2);
                    if (colors6 == null) {
                        colors6 = re$$ExternalSyntheticOutline0.m(gapComposer14, -1762997026, gapComposer14, false);
                    } else {
                        gapComposer14.startReplaceGroup(-1762997739);
                        gapComposer14.end(false);
                    }
                    TextViewKt.Avatar(avatarSize4, new AvatarEntry("", j3, null, new AvatarImage.LocalIcon(icons, colors6.semantic.icon.standard, 4), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer14, 6, 28);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Composer composer15 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    AvatarSize avatarSize5 = AvatarSize.Size48;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal3 = ArcadeThemeKt.LocalColors;
                    Colors colors7 = (Colors) gapComposer15.consume(staticProvidableCompositionLocal3);
                    if (colors7 == null) {
                        colors7 = re$$ExternalSyntheticOutline0.m(gapComposer15, -1762997026, gapComposer15, false);
                    } else {
                        gapComposer15.startReplaceGroup(-1762997739);
                        gapComposer15.end(false);
                    }
                    long j4 = colors7.semantic.background.subtle;
                    Colors colors8 = (Colors) gapComposer15.consume(staticProvidableCompositionLocal3);
                    if (colors8 == null) {
                        colors8 = re$$ExternalSyntheticOutline0.m(gapComposer15, -1762997026, gapComposer15, false);
                    } else {
                        gapComposer15.startReplaceGroup(-1762997739);
                        gapComposer15.end(false);
                    }
                    TextViewKt.Avatar(avatarSize5, new AvatarEntry("", j4, null, new AvatarImage.LocalIcon(icons, colors8.semantic.icon.standard, 4), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer15, 6, 28);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                Composer composer16 = (Composer) obj;
                int intValue16 = ((Integer) obj2).intValue();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(this.f$0, (String) null, (Modifier) null, 0L, gapComposer16, 48, 12);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                Composer composer17 = (Composer) obj;
                int intValue17 = ((Integer) obj2).intValue();
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 3) != 2)) {
                    BiasAlignment biasAlignment = Alignment.Companion.Center;
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 48.0f);
                    Icons icons3 = this.f$0;
                    if (icons3 == null) {
                        gapComposer17.startReplaceGroup(831629333);
                        gapComposer17.end(false);
                        j = Color.Unspecified;
                    } else {
                        gapComposer17.startReplaceGroup(831631631);
                        Colors colors9 = (Colors) gapComposer17.consume(ArcadeThemeKt.LocalColors);
                        if (colors9 == null) {
                            colors9 = re$$ExternalSyntheticOutline0.m(gapComposer17, -1762997026, gapComposer17, false);
                        } else {
                            gapComposer17.startReplaceGroup(-1762997739);
                            gapComposer17.end(false);
                        }
                        j = colors9.semantic.background.brand;
                        gapComposer17.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(m285size3ABfNKs, j, RoundedCornerShapeKt.CircleShape);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                    int hashCode = Long.hashCode(gapComposer17.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer17.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer17, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer17.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer17.startReusableNode();
                    if (gapComposer17.inserting) {
                        gapComposer17.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer17.useNode();
                    }
                    Updater.m576setimpl(gapComposer17, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer17, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer17, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer17, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer17, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    icons3.getClass();
                    Trace.m1191Iconww6aTOc(icons3, (String) null, (Modifier) null, 0L, gapComposer17, 48, 12);
                    gapComposer17.end(true);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                Composer composer18 = (Composer) obj;
                int intValue18 = ((Integer) obj2).intValue();
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (gapComposer18.shouldExecute(intValue18 & 1, (intValue18 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(this.f$0, (String) null, (Modifier) null, 0L, gapComposer18, 48, 12);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                Composer composer19 = (Composer) obj;
                int intValue19 = ((Integer) obj2).intValue();
                GapComposer gapComposer19 = (GapComposer) composer19;
                if (gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 3) != 2)) {
                    AvatarSize avatarSize6 = AvatarSize.Size64;
                    Colors colors10 = (Colors) gapComposer19.consume(ArcadeThemeKt.LocalColors);
                    if (colors10 == null) {
                        colors10 = re$$ExternalSyntheticOutline0.m(gapComposer19, -1762997026, gapComposer19, false);
                    } else {
                        gapComposer19.startReplaceGroup(-1762997739);
                        gapComposer19.end(false);
                    }
                    TextViewKt.Avatar(avatarSize6, new AvatarEntry("", colors10.semantic.background.inverse, null, new AvatarImage.LocalIcon(icons, 0L, 6), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer19, 6, 28);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                Composer composer20 = (Composer) obj;
                int intValue20 = ((Integer) obj2).intValue();
                GapComposer gapComposer20 = (GapComposer) composer20;
                if (gapComposer20.shouldExecute(intValue20 & 1, (intValue20 & 3) != 2)) {
                    Colors colors11 = (Colors) gapComposer20.consume(ArcadeThemeKt.LocalColors);
                    if (colors11 == null) {
                        colors11 = re$$ExternalSyntheticOutline0.m(gapComposer20, -1762997026, gapComposer20, false);
                    } else {
                        gapComposer20.startReplaceGroup(-1762997739);
                        gapComposer20.end(false);
                    }
                    ArcadeLocalImageIconKt.m3560ArcadeLocalIconjA1GFJw(this.f$0, null, 0L, colors11.semantic.background.brand, gapComposer20, 0, 14);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Composer composer21 = (Composer) obj;
                int intValue21 = ((Integer) obj2).intValue();
                GapComposer gapComposer21 = (GapComposer) composer21;
                if (gapComposer21.shouldExecute(intValue21 & 1, (intValue21 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(this.f$0, (String) null, (Modifier) null, 0L, gapComposer21, 48, 12);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                Composer composer22 = (Composer) obj;
                int intValue22 = ((Integer) obj2).intValue();
                GapComposer gapComposer22 = (GapComposer) composer22;
                if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(this.f$0, (String) null, (Modifier) null, 0L, gapComposer22, 48, 12);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Composer composer23 = (Composer) obj;
                int intValue23 = ((Integer) obj2).intValue();
                GapComposer gapComposer23 = (GapComposer) composer23;
                if (gapComposer23.shouldExecute(intValue23 & 1, (intValue23 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(this.f$0, (String) null, (Modifier) null, 0L, gapComposer23, 48, 12);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                Composer composer24 = (Composer) obj;
                int intValue24 = ((Integer) obj2).intValue();
                GapComposer gapComposer24 = (GapComposer) composer24;
                if (gapComposer24.shouldExecute(intValue24 & 1, (intValue24 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(this.f$0, (String) null, (Modifier) null, 0L, gapComposer24, 48, 12);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                Composer composer25 = (Composer) obj;
                int intValue25 = ((Integer) obj2).intValue();
                GapComposer gapComposer25 = (GapComposer) composer25;
                if (gapComposer25.shouldExecute(intValue25 & 1, (intValue25 & 3) != 2)) {
                    Icons icons4 = this.f$0;
                    if (icons4 == null) {
                        gapComposer25.startReplaceGroup(1122667670);
                    } else {
                        gapComposer25.startReplaceGroup(1122667671);
                        Trace.m1191Iconww6aTOc(icons4, (String) null, (Modifier) null, 0L, gapComposer25, 48, 12);
                    }
                    gapComposer25.end(false);
                } else {
                    gapComposer25.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                Composer composer26 = (Composer) obj;
                int intValue26 = ((Integer) obj2).intValue();
                GapComposer gapComposer26 = (GapComposer) composer26;
                if (gapComposer26.shouldExecute(intValue26 & 1, (intValue26 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(this.f$0, (String) null, (Modifier) null, 0L, gapComposer26, 48, 12);
                } else {
                    gapComposer26.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                Composer composer27 = (Composer) obj;
                int intValue27 = ((Integer) obj2).intValue();
                GapComposer gapComposer27 = (GapComposer) composer27;
                if (gapComposer27.shouldExecute(intValue27 & 1, (intValue27 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(this.f$0, (String) null, (Modifier) null, 0L, gapComposer27, 48, 12);
                } else {
                    gapComposer27.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                Composer composer28 = (Composer) obj;
                int intValue28 = ((Integer) obj2).intValue();
                GapComposer gapComposer28 = (GapComposer) composer28;
                if (gapComposer28.shouldExecute(intValue28 & 1, (intValue28 & 3) != 2)) {
                    Icons icons5 = this.f$0;
                    if (icons5 == null) {
                        gapComposer28.startReplaceGroup(-659290841);
                    } else {
                        gapComposer28.startReplaceGroup(-659290840);
                        Trace.m1191Iconww6aTOc(icons5, (String) null, (Modifier) null, 0L, gapComposer28, 48, 12);
                    }
                    gapComposer28.end(false);
                } else {
                    gapComposer28.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer29 = (Composer) obj;
                int intValue29 = ((Integer) obj2).intValue();
                GapComposer gapComposer29 = (GapComposer) composer29;
                if (gapComposer29.shouldExecute(intValue29 & 1, (intValue29 & 3) != 2)) {
                    Icons icons6 = this.f$0;
                    if (icons6 == null) {
                        gapComposer29.startReplaceGroup(1212900451);
                    } else {
                        gapComposer29.startReplaceGroup(1212900452);
                        Trace.m1191Iconww6aTOc(icons6, (String) null, (Modifier) null, 0L, gapComposer29, 48, 12);
                    }
                    gapComposer29.end(false);
                } else {
                    gapComposer29.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
