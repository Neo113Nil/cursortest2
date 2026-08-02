package androidx.compose.ui.spatial;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.text.TextStyle;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypography;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypographyKt;
import com.squareup.cash.paymentpad.viewmodels.PaymentPadTheme;
import com.squareup.protos.cash.cashapproxy.api.SemanticColor;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.NotImplementedError;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public abstract class ThrottledCallbacksKt {
    public static final Integer qrLogoColor(PaymentPadTheme paymentPadTheme, Integer num) {
        paymentPadTheme.getClass();
        int ordinal = paymentPadTheme.ordinal();
        if (ordinal == 0) {
            return num;
        }
        if (ordinal == 1) {
            return -16777216;
        }
        if (ordinal == 2) {
            return -655227;
        }
        if (ordinal == 3) {
            return -1723881900;
        }
        if (ordinal == 4) {
            return -1914747;
        }
        if (ordinal == 5) {
            return -7680512;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    /* renamed from: rectInfoFor-Dg36KO4, reason: not valid java name */
    public static final RelativeLayoutBounds m956rectInfoForDg36KO4(long j, long j2, long j3, long j4, long j5, Modifier.Node node, float[] fArr) {
        NodeCoordinator m864requireCoordinator64DMado = DepthSortedSetKt.m864requireCoordinator64DMado(node, 2);
        LayoutNode requireLayoutNode = DepthSortedSetKt.requireLayoutNode(node);
        boolean isPlaced = requireLayoutNode.isPlaced();
        NodeChain nodeChain = requireLayoutNode.nodes;
        if (!isPlaced) {
            return null;
        }
        if (((NodeCoordinator) nodeChain.outerCoordinator) == m864requireCoordinator64DMado) {
            return new RelativeLayoutBounds(j, j2, j3, j4, j5, node, fArr);
        }
        float f = (int) (j & BodyPartID.bodyIdMax);
        long floatToRawIntBits = (Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits(f) & BodyPartID.bodyIdMax);
        long j6 = m864requireCoordinator64DMado.measuredSize;
        NodeCoordinator nodeCoordinator = (NodeCoordinator) nodeChain.outerCoordinator;
        nodeCoordinator.getClass();
        long m1344roundk4lQ0M = PlatformKt.m1344roundk4lQ0M(nodeCoordinator.mo840localPositionOfS_NoaFU(m864requireCoordinator64DMado, floatToRawIntBits, true));
        return new RelativeLayoutBounds(m1344roundk4lQ0M, (BodyPartID.bodyIdMax & (((int) (m1344roundk4lQ0M & BodyPartID.bodyIdMax)) + ((int) (j6 & BodyPartID.bodyIdMax)))) | ((((int) (m1344roundk4lQ0M >> 32)) + ((int) (j6 >> 32))) << 32), j3, j4, j5, node, fArr);
    }

    public static final long toMoonCakeColor(SemanticColor semanticColor, GapComposer gapComposer) {
        semanticColor.getClass();
        int ordinal = semanticColor.ordinal();
        if (ordinal == 0) {
            gapComposer.startReplaceGroup(1245037286);
            long j = MooncakeTheme.getColors(gapComposer).label;
            gapComposer.end(false);
            return j;
        }
        if (ordinal == 1) {
            gapComposer.startReplaceGroup(1245039375);
            long j2 = MooncakeTheme.getColors(gapComposer).secondaryLabel;
            gapComposer.end(false);
            return j2;
        }
        if (ordinal == 2) {
            gapComposer.startReplaceGroup(1245041414);
            long j3 = MooncakeTheme.getColors(gapComposer).error;
            gapComposer.end(false);
            return j3;
        }
        if (ordinal == 3) {
            gapComposer.startReplaceGroup(1245043470);
            long j4 = MooncakeTheme.getColors(gapComposer).tertiaryLabel;
            gapComposer.end(false);
            return j4;
        }
        if (ordinal != 4) {
            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1245035585, false);
        }
        gapComposer.startReplaceGroup(1245045191);
        gapComposer.end(false);
        throw new NotImplementedError(null, 1, null);
    }

    public static final TextStyle toMoonCakeThemeStyle(com.squareup.protos.cash.cashapproxy.api.TextStyle textStyle, GapComposer gapComposer) {
        textStyle.getClass();
        switch (textStyle) {
            case TEXT_STYLE_BIG_MONEY:
                gapComposer.startReplaceGroup(83160364);
                MooncakeTypography mooncakeTypography = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                if (mooncakeTypography == null) {
                    mooncakeTypography = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                }
                TextStyle textStyle2 = mooncakeTypography.bigMoney;
                gapComposer.end(false);
                return textStyle2;
            case TEXT_STYLE_HEADER_1:
                gapComposer.startReplaceGroup(83162315);
                MooncakeTypography mooncakeTypography2 = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                if (mooncakeTypography2 == null) {
                    mooncakeTypography2 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                }
                TextStyle textStyle3 = mooncakeTypography2.header1;
                gapComposer.end(false);
                return textStyle3;
            case TEXT_STYLE_HEADER_2:
                gapComposer.startReplaceGroup(83164235);
                MooncakeTypography mooncakeTypography3 = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                if (mooncakeTypography3 == null) {
                    mooncakeTypography3 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                }
                TextStyle textStyle4 = mooncakeTypography3.header2;
                gapComposer.end(false);
                return textStyle4;
            case TEXT_STYLE_HEADER_3:
                gapComposer.startReplaceGroup(83166155);
                MooncakeTypography mooncakeTypography4 = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                if (mooncakeTypography4 == null) {
                    mooncakeTypography4 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                }
                TextStyle textStyle5 = mooncakeTypography4.header3;
                gapComposer.end(false);
                return textStyle5;
            case TEXT_STYLE_HEADER_4:
                gapComposer.startReplaceGroup(83168075);
                MooncakeTypography mooncakeTypography5 = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                if (mooncakeTypography5 == null) {
                    mooncakeTypography5 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                }
                TextStyle textStyle6 = mooncakeTypography5.header4;
                gapComposer.end(false);
                return textStyle6;
            case TEXT_STYLE_MAIN_TITLE:
                gapComposer.startReplaceGroup(83170061);
                MooncakeTypography mooncakeTypography6 = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                if (mooncakeTypography6 == null) {
                    mooncakeTypography6 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                }
                TextStyle textStyle7 = mooncakeTypography6.mainTitle;
                gapComposer.end(false);
                return textStyle7;
            case TEXT_STYLE_MAIN_BODY:
                gapComposer.startReplaceGroup(83172076);
                MooncakeTypography mooncakeTypography7 = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                if (mooncakeTypography7 == null) {
                    mooncakeTypography7 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                }
                TextStyle textStyle8 = mooncakeTypography7.mainBody;
                gapComposer.end(false);
                return textStyle8;
            case TEXT_STYLE_SMALL_TITLE:
                gapComposer.startReplaceGroup(83174126);
                MooncakeTypography mooncakeTypography8 = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                if (mooncakeTypography8 == null) {
                    mooncakeTypography8 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                }
                TextStyle textStyle9 = mooncakeTypography8.smallTitle;
                gapComposer.end(false);
                return textStyle9;
            case TEXT_STYLE_SMALL_BODY:
                gapComposer.startReplaceGroup(83176205);
                MooncakeTypography mooncakeTypography9 = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                if (mooncakeTypography9 == null) {
                    mooncakeTypography9 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                }
                TextStyle textStyle10 = mooncakeTypography9.smallBody;
                gapComposer.end(false);
                return textStyle10;
            case TEXT_STYLE_STRONG_CAPTION:
                gapComposer.startReplaceGroup(83178385);
                MooncakeTypography mooncakeTypography10 = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                if (mooncakeTypography10 == null) {
                    mooncakeTypography10 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                }
                TextStyle textStyle11 = mooncakeTypography10.strongCaption;
                gapComposer.end(false);
                return textStyle11;
            case TEXT_STYLE_CAPTION:
                gapComposer.startReplaceGroup(83180459);
                MooncakeTypography mooncakeTypography11 = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                if (mooncakeTypography11 == null) {
                    mooncakeTypography11 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                }
                TextStyle textStyle12 = mooncakeTypography11.caption;
                gapComposer.end(false);
                return textStyle12;
            case TEXT_STYLE_IDENTIFIER:
                gapComposer.startReplaceGroup(83182446);
                MooncakeTypography mooncakeTypography12 = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                if (mooncakeTypography12 == null) {
                    mooncakeTypography12 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                }
                TextStyle textStyle13 = mooncakeTypography12.identifier;
                gapComposer.end(false);
                return textStyle13;
            default:
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 83158983, false);
        }
    }
}
