package com.squareup.cash.formview.components.arcade;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.room.util.DBUtil;
import com.squareup.cash.formview.components.FormElementViewBuilder$$ExternalSyntheticLambda4;
import com.squareup.protos.franklin.api.FormBlocker;
import squareup.cash.ui.arcade.elements.BetweenSection;
import squareup.cash.ui.arcade.elements.WithinSection;

/* loaded from: classes6.dex */
public abstract class ArcadeFormFixedElementSpacerKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[WithinSection.Variant.values().length];
            try {
                iArr[WithinSection.Variant.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WithinSection.Variant.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BetweenSection.Variant.values().length];
            try {
                iArr2[BetweenSection.Variant.LARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[BetweenSection.Variant.X_LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[BetweenSection.Variant.X_LARGE_BELOW_CELL.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ArcadeFormFixedElementSpacer(FormBlocker.Element.FixedSpacerElement fixedSpacerElement, Composer composer, int i) {
        RecomposeScopeImpl endRestartGroup;
        FormElementViewBuilder$$ExternalSyntheticLambda4 formElementViewBuilder$$ExternalSyntheticLambda4;
        WithinSection withinSection;
        BetweenSection betweenSection;
        int i2;
        fixedSpacerElement.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1232460839);
        int i3 = (gapComposer.changedInstance(fixedSpacerElement) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            FormBlocker.Element.FixedSpacerElement.Spacing spacing = fixedSpacerElement.spacing;
            if (spacing != null) {
                FormBlocker.Element.FixedSpacerElement.Spacing.WithinSection withinSection2 = spacing instanceof FormBlocker.Element.FixedSpacerElement.Spacing.WithinSection ? (FormBlocker.Element.FixedSpacerElement.Spacing.WithinSection) spacing : null;
                if (withinSection2 != null) {
                    withinSection = withinSection2.getValue();
                    if (withinSection == null) {
                        gapComposer.startReplaceGroup(-1434406705);
                        WithinSection.Variant variant = withinSection.variant;
                        i2 = variant != null ? WhenMappings.$EnumSwitchMapping$0[variant.ordinal()] : -1;
                        if (i2 == 1) {
                            gapComposer.startReplaceGroup(-1016100319);
                            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
                            gapComposer.end(false);
                        } else if (i2 != 2) {
                            gapComposer.startReplaceGroup(-1434233415);
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(-1016098238);
                            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                            gapComposer.end(false);
                        }
                        gapComposer.end(false);
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        } else {
                            formElementViewBuilder$$ExternalSyntheticLambda4 = new FormElementViewBuilder$$ExternalSyntheticLambda4(fixedSpacerElement, i, 1);
                        }
                    } else {
                        gapComposer.startReplaceGroup(-1434210661);
                        gapComposer.end(false);
                        FormBlocker.Element.FixedSpacerElement.Spacing spacing2 = fixedSpacerElement.spacing;
                        if (spacing2 != null) {
                            FormBlocker.Element.FixedSpacerElement.Spacing.BetweenSection betweenSection2 = spacing2 instanceof FormBlocker.Element.FixedSpacerElement.Spacing.BetweenSection ? (FormBlocker.Element.FixedSpacerElement.Spacing.BetweenSection) spacing2 : null;
                            if (betweenSection2 != null) {
                                betweenSection = betweenSection2.getValue();
                                if (betweenSection == null) {
                                    gapComposer.startReplaceGroup(-1434114096);
                                    BetweenSection.Variant variant2 = betweenSection.variant;
                                    i2 = variant2 != null ? WhenMappings.$EnumSwitchMapping$1[variant2.ordinal()] : -1;
                                    if (i2 == 1) {
                                        gapComposer.startReplaceGroup(-1016090910);
                                        DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                                        gapComposer.end(false);
                                    } else if (i2 == 2) {
                                        gapComposer.startReplaceGroup(-1016088733);
                                        DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
                                        gapComposer.end(false);
                                    } else if (i2 != 3) {
                                        gapComposer.startReplaceGroup(-1433849511);
                                        gapComposer.end(false);
                                    } else {
                                        gapComposer.startReplaceGroup(-1016086164);
                                        DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
                                        gapComposer.end(false);
                                    }
                                    gapComposer.end(false);
                                    endRestartGroup = gapComposer.endRestartGroup();
                                    if (endRestartGroup == null) {
                                        return;
                                    } else {
                                        formElementViewBuilder$$ExternalSyntheticLambda4 = new FormElementViewBuilder$$ExternalSyntheticLambda4(fixedSpacerElement, i, 2);
                                    }
                                } else {
                                    gapComposer.startReplaceGroup(-1433826757);
                                    gapComposer.end(false);
                                }
                            }
                        }
                        betweenSection = null;
                        if (betweenSection == null) {
                        }
                    }
                    endRestartGroup.block = formElementViewBuilder$$ExternalSyntheticLambda4;
                }
            }
            withinSection = null;
            if (withinSection == null) {
            }
            endRestartGroup.block = formElementViewBuilder$$ExternalSyntheticLambda4;
        }
        gapComposer.skipToGroupEnd();
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            formElementViewBuilder$$ExternalSyntheticLambda4 = new FormElementViewBuilder$$ExternalSyntheticLambda4(fixedSpacerElement, i, 3);
            endRestartGroup.block = formElementViewBuilder$$ExternalSyntheticLambda4;
        }
    }
}
