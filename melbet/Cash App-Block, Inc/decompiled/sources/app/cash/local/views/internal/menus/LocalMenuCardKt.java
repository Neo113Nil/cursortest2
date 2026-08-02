package app.cash.local.views.internal.menus;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.viewmodels.CartItemCounterViewModel;
import app.cash.local.viewmodels.MenuItemAvailability;
import app.cash.local.views.internal.CartItemCounterStyle;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.util.Strings;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class LocalMenuCardKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void LocalMenuCard(final Modifier modifier, final CartItemCounterViewModel cartItemCounterViewModel, final Function1 function1, final String str, final Function2 function2, final String str2, final MenuItemAvailability menuItemAvailability, String str3, final boolean z, String str4, final MutableInteractionSourceImpl mutableInteractionSourceImpl, final Function0 function0, Composer composer, final int i, final int i2) {
        int i3;
        String str5;
        int i4;
        final String str6;
        final String str7;
        int i5;
        boolean z2;
        BiasAlignment.Horizontal horizontal;
        boolean z3;
        String str8;
        String str9;
        str2.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1676030508);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i3 | (gapComposer.changedInstance(cartItemCounterViewModel) ? 32 : 16);
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i6 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        int i7 = i6 | (gapComposer.changed(str) ? 2048 : 1024) | (gapComposer.changedInstance(function2) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(str2) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changedInstance(menuItemAvailability) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer.changed(str3) ? 8388608 : 4194304) | (gapComposer.changed(z) ? 67108864 : 33554432);
        int i8 = i2 & 512;
        if (i8 != 0) {
            i4 = i7 | 805306368;
            str5 = str4;
        } else {
            str5 = str4;
            i4 = i7 | (gapComposer.changed(str5) ? PKIFailureInfo.duplicateCertReq : 268435456);
        }
        if (gapComposer.shouldExecute(i4 & 1, ((i4 & 306783379) == 306783378 && (((gapComposer.changed(mutableInteractionSourceImpl) ? (char) 4 : (char) 2) | (gapComposer.changedInstance(function0) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            if (i8 != 0) {
                str5 = null;
            }
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m182clickableO2vRcR0$default(ClipKt.clip(modifier, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(7.0f)), mutableInteractionSourceImpl, RippleKt.m3400rippleYJYuY3k(0L, true, RecyclerView.DECELERATION_RATE, null, gapComposer, 48, 13), false, null, null, function0, 28), 4.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(14.0f);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            String str10 = str5;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(OffsetKt.aspectRatio(1.0f, SizeKt.fillMaxWidth(companion, 1.0f), false), Strings.getColors(gapComposer).semantic.background.subtle, m340RoundedCornerShape0680j_4);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            LocalMapKt.LocalAsyncImage(ClipKt.clip(SizeKt.fillMaxSize(companion, 1.0f), m340RoundedCornerShape0680j_4), null, str, ContentScale.Companion.FillBounds, null, null, Expect_jvmKt.rememberComposableLambda(1296473678, new LocalMenuCardKt$$ExternalSyntheticLambda0(0, function2), gapComposer), gapComposer, ((i4 >> 3) & 896) | 1575936, 50);
            if (cartItemCounterViewModel == null) {
                gapComposer.startReplaceGroup(1379630157);
                gapComposer.end(false);
                i5 = i4;
                z2 = false;
                horizontal = null;
                z3 = true;
                str8 = str10;
            } else {
                gapComposer.startReplaceGroup(1379630158);
                CartItemCounterStyle cartItemCounterStyle = new CartItemCounterStyle(32.0f, Strings.getColors(gapComposer).semantic.icon.standard, Strings.getColors(gapComposer).semantic.icon.subtle, Strings.getColors(gapComposer).semantic.icon.inverse);
                i5 = i4;
                z2 = false;
                horizontal = null;
                z3 = true;
                str8 = str10;
                LocalMapKt.CartItemCounterView(SpacerKt.m298padding3ABfNKs(BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.TopEnd), 16.0f), cartItemCounterViewModel, function1, cartItemCounterStyle, cartItemCounterStyle, gapComposer, i4 & 896, 32);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
            Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, z3, companion, 12.0f, gapComposer);
            int i9 = i5 >> 15;
            boolean z4 = z3;
            Room.m1165Text25TpFw(2, 2, 0, 0, (i9 & 14) | 1769520, 0, 3984, Strings.getColors(gapComposer).semantic.text.prominent, (Composer) gapComposer, SizeKt.wrapContentWidth$default(companion, horizontal, 3), Strings.getTypography(gapComposer).labelSmall, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            LocalMapKt.LocalMenuAvailabilityText(null, menuItemAvailability, false, null, gapComposer, (i9 & 112) | MLKEMEngine.KyberPolyBytes, 9);
            if (z) {
                str9 = re$$ExternalSyntheticOutline0.m(gapComposer, 406815331, R.string.local_views_preorder, gapComposer, z2);
            } else {
                gapComposer.startReplaceGroup(-273577305);
                gapComposer.end(z2);
                str9 = horizontal;
            }
            if (str9 == 0 && str3 == null && str8 == null) {
                gapComposer.startReplaceGroup(-272271956);
                gapComposer.end(z2);
                str6 = str3;
            } else {
                re$$ExternalSyntheticOutline0.m(gapComposer, -273457830, companion, 6.0f, gapComposer);
                Modifier wrapContentWidth$default = SizeKt.wrapContentWidth$default(companion, horizontal, 3);
                gapComposer.startReplaceGroup(406824744);
                AnnotatedString.Builder builder = new AnnotatedString.Builder();
                if (str9 == 0) {
                    gapComposer.startReplaceGroup(519246793);
                    gapComposer.end(z2);
                } else {
                    gapComposer.startReplaceGroup(519246794);
                    builder.append(AnnotatedStringKt.AnnotatedString$default(str9, SpanStyle.m973copyGSF8kmg$default(Strings.getTypography(gapComposer).labelSmall.spanStyle, Strings.getColors(gapComposer).semantic.text.warning, null, 0L, JpegConstants.COM_MARKER)));
                    if (str3 != null || str8 != null) {
                        builder.append(" · ");
                    }
                    gapComposer.end(z2);
                }
                if (str3 == null) {
                    gapComposer.startReplaceGroup(519718830);
                    gapComposer.end(z2);
                    str6 = str3;
                } else {
                    gapComposer.startReplaceGroup(519718831);
                    str6 = str3;
                    builder.append(AnnotatedStringKt.AnnotatedString$default(str6, new SpanStyle(Strings.getColors(gapComposer).semantic.text.success, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, JpegConstants.COM_MARKER)));
                    if (str8 != null) {
                        builder.append(" · ");
                    }
                    gapComposer.end(z2);
                }
                if (str8 != null) {
                    builder.append(str8);
                }
                AnnotatedString annotatedString = builder.toAnnotatedString();
                gapComposer.end(z2);
                Room.m1164Text25TpFw(2, 3, 0, 0, 1769520, 0, 3984, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, wrapContentWidth$default, annotatedString, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                gapComposer.end(z2);
            }
            gapComposer.end(z4);
            str7 = str8;
        } else {
            str6 = str3;
            gapComposer.skipToGroupEnd();
            str7 = str5;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: app.cash.local.views.internal.menus.LocalMenuCardKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                    LocalMenuCardKt.LocalMenuCard(Modifier.this, cartItemCounterViewModel, function1, str, function2, str2, menuItemAvailability, str6, z, str7, mutableInteractionSourceImpl, function0, (Composer) obj, updateChangedFlags, i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewDocumentBankingStatements.deepLinkSpecs;
    }
}
