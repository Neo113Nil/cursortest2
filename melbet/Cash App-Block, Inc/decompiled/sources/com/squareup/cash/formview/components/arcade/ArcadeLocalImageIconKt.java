package com.squareup.cash.formview.components.arcade;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.ArcadeBannerCardKt$$ExternalSyntheticLambda5;
import com.squareup.protos.franklin.api.FormBlocker;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public abstract class ArcadeLocalImageIconKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FormBlocker.Element.LocalImageElement.Icon.values().length];
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.INSTANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.ACTION_REQUIRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.SUCCESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.LOCKED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.RECURRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.BORROW.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.DEPOSIT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.VERIFICATION.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.VERIFYING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.VERIFICATION_FAILED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.DOCUMENT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.SCRIBBLE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.QR_CODE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.CVV.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.CALENDAR.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.CARD.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.INVESTING_ROUND_UPS.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.BANK.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.SECURITY_WARNING.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.ENVELOPE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.LOGOMARK.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.CAMERA.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.UNLOCK.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.FAMILY.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.PERSON.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.INVESTING.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.GOAL.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.WIRE.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.RECURRING_DOUBLE_ARROW.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.GLOBE.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.CARD_TOP_RIGHT_PLUS.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.CARD_CHECKMARK.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.CARD_EXPIRED.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.LOCATION.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.WARNING.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.DECLINED.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.ELIGIBILITY_WARNING.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.LOCK_IN_SHIELD.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.DASH.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.GREEN_EXCLAMATION.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.NOTE.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.CLEAR.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.SAVINGS.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.BITCOIN.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.CARD_CVV_LOCATION_HERO.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.CARD_MAILER_HERO.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.CHECK_DEPOSIT_ENDORSEMENT_HERO.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.INVESTING_ROUND_UPS_INTRO_ILLUSTRATION.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.DIVIDEND_REINVESTMENT_HERO.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.BELL.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ArcadeLocalIconForeground.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                ArcadeLocalIconForeground arcadeLocalIconForeground = ArcadeLocalIconForeground.INVERSE;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                ArcadeLocalIconForeground arcadeLocalIconForeground2 = ArcadeLocalIconForeground.INVERSE;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused55) {
            }
            int[] iArr3 = new int[ArcadeLocalIconBackground.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                ArcadeLocalIconBackground arcadeLocalIconBackground = ArcadeLocalIconBackground.BRAND;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                ArcadeLocalIconBackground arcadeLocalIconBackground2 = ArcadeLocalIconBackground.BRAND;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                ArcadeLocalIconBackground arcadeLocalIconBackground3 = ArcadeLocalIconBackground.BRAND;
                iArr3[3] = 4;
            } catch (NoSuchFieldError unused59) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x003a  */
    /* renamed from: ArcadeLocalIcon-jA1GFJw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3560ArcadeLocalIconjA1GFJw(Icons icons, Modifier modifier, long j, long j2, Composer composer, int i, int i2) {
        long j3;
        int i3;
        int i4;
        long j4;
        Modifier modifier2;
        RecomposeScopeImpl endRestartGroup;
        long j5;
        Modifier modifier3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-342903868);
        int i5 = i | (gapComposer.changed(icons.ordinal()) ? 4 : 2) | 432;
        if ((i2 & 8) == 0) {
            j3 = j;
            if (gapComposer.changed(j3)) {
                i3 = 2048;
                i4 = i5 | i3 | (!gapComposer.changed(j2) ? 16384 : PKIFailureInfo.certRevoked);
                if (gapComposer.shouldExecute(i4 & 1, (i4 & 9363) == 9362)) {
                    gapComposer.skipToGroupEnd();
                    j4 = j3;
                    modifier2 = modifier;
                } else {
                    gapComposer.startDefaults();
                    int i6 = i & 1;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    if (i6 == 0 || gapComposer.getDefaultsInvalid()) {
                        if ((i2 & 8) != 0) {
                            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                            if (colors == null) {
                                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                            } else {
                                gapComposer.startReplaceGroup(-1762997739);
                                gapComposer.end(false);
                            }
                            j3 = colors.semantic.icon.inverse;
                            i4 &= -7169;
                        }
                        j5 = j3;
                        modifier3 = companion;
                    } else {
                        gapComposer.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i4 &= -7169;
                        }
                        modifier3 = modifier;
                        j5 = j3;
                    }
                    gapComposer.endDefaults();
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.m285size3ABfNKs(companion, 64.0f), j2, RoundedCornerShapeKt.CircleShape);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
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
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Trace.m1191Iconww6aTOc(icons, (String) null, modifier3, j5, gapComposer, (i4 & 14) | 432 | (i4 & 7168), 0);
                    gapComposer.end(true);
                    modifier2 = modifier3;
                    j4 = j5;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                    endRestartGroup.block = new ArcadeBannerCardKt$$ExternalSyntheticLambda5(icons, modifier2, j4, j2, i, i2);
                    return;
                }
                return;
            }
        } else {
            j3 = j;
        }
        i3 = 1024;
        i4 = i5 | i3 | (!gapComposer.changed(j2) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 9363) == 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
