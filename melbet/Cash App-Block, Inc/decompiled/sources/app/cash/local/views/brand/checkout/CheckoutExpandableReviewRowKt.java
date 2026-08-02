package app.cash.local.views.brand.checkout;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.pager.PagerDefaults$$ExternalSyntheticLambda0;
import androidx.compose.foundation.selection.ToggleableNode$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
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
import app.cash.local.views.internal.LocalMapKt;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.FilterBarKt$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SignatureViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.earnings.views.home.EarningsHeaderKt$$ExternalSyntheticLambda9;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import radiography.ViewStateRenderers$$ExternalSyntheticLambda5;

/* loaded from: classes3.dex */
public abstract class CheckoutExpandableReviewRowKt {
    public static final PaddingValuesImpl CheckoutReviewRowTouchTargetPadding = SpacerKt.m297PaddingValuesa9UjIt4$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7);
    public static final PaddingValuesImpl CheckoutReviewCompactRowTouchTargetPadding = SpacerKt.m297PaddingValuesa9UjIt4$default(RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 5);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v23, types: [kotlin.jvm.functions.Function0] */
    /* renamed from: CheckoutExpandableReviewRow-IBGS8fI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1298CheckoutExpandableReviewRowIBGS8fI(Modifier modifier, final String str, final String str2, Color color, final boolean z, final Function1 function1, boolean z2, boolean z3, boolean z4, PaddingValues paddingValues, PaddingValues paddingValues2, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        Color color2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        final boolean z5;
        final boolean z6;
        final PaddingValues paddingValues3;
        final Modifier modifier3;
        GapComposer gapComposer;
        final Color color3;
        final boolean z7;
        final PaddingValues paddingValues4;
        RecomposeScopeImpl endRestartGroup;
        Throwable th;
        PaddingValues paddingValues5;
        boolean z8;
        Object obj;
        str.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-329115);
        int i14 = i3 & 1;
        if (i14 != 0) {
            i4 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i4 = (gapComposer2.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= gapComposer2.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer2.changed(str2) ? 256 : 128;
        }
        int i15 = i3 & 8;
        if (i15 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            color2 = color;
            i4 |= gapComposer2.changed(color2) ? 2048 : 1024;
            if ((i & 24576) == 0) {
                i4 |= gapComposer2.changed(z) ? 16384 : PKIFailureInfo.certRevoked;
            }
            if ((196608 & i) == 0) {
                i4 |= gapComposer2.changedInstance(function1) ? PKIFailureInfo.unsupportedVersion : 65536;
            }
            i5 = i3 & 64;
            if (i5 == 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i4 |= gapComposer2.changed(z2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            }
            i6 = i3 & 128;
            if (i6 == 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i4 |= gapComposer2.changed(z3) ? 8388608 : 4194304;
            }
            i7 = i3 & 256;
            if (i7 == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i8 = i7;
                i4 |= gapComposer2.changed(z4) ? 67108864 : 33554432;
                i9 = i3 & 512;
                if (i9 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i10 = i9;
                    i4 |= gapComposer2.changed(paddingValues) ? PKIFailureInfo.duplicateCertReq : 268435456;
                    i11 = i3 & 1024;
                    if (i11 == 0) {
                        i13 = 54;
                        i12 = i11;
                    } else if ((i2 & 6) == 0) {
                        i12 = i11;
                        i13 = i2 | (gapComposer2.changed(paddingValues2) ? 4 : 2);
                    } else {
                        i12 = i11;
                        i13 = i2;
                    }
                    if (gapComposer2.shouldExecute(i4 & 1, (i4 & 306783379) == 306783378 || (i13 & 19) != 18)) {
                        gapComposer2.skipToGroupEnd();
                        z5 = z3;
                        z6 = z4;
                        paddingValues3 = paddingValues2;
                        modifier3 = modifier2;
                        gapComposer = gapComposer2;
                        color3 = color2;
                        z7 = z2;
                        paddingValues4 = paddingValues;
                    } else {
                        Modifier modifier4 = i14 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                        if (i15 != 0) {
                            color2 = null;
                        }
                        boolean z9 = i5 != 0 ? true : z2;
                        boolean z10 = i6 != 0 ? true : z3;
                        boolean z11 = i8 != 0 ? false : z4;
                        PaddingValues paddingValues6 = i10 != 0 ? CheckoutReviewRowTouchTargetPadding : paddingValues;
                        if (i12 != 0) {
                            th = null;
                            paddingValues5 = SpacerKt.m297PaddingValuesa9UjIt4$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7);
                        } else {
                            th = null;
                            paddingValues5 = paddingValues2;
                        }
                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier4, 1.0f);
                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                        boolean z12 = z10;
                        int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                        Modifier modifier5 = modifier4;
                        if (gapComposer2.applier == null) {
                            Updater.invalidApplier();
                            throw th;
                        }
                        gapComposer2.startReusableNode();
                        if (gapComposer2.inserting) {
                            gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer2.useNode();
                        }
                        Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                        if (z9) {
                            gapComposer2.startReplaceGroup(-1129288761);
                            boolean z13 = ((458752 & i4) == 131072) | ((57344 & i4) == 16384);
                            Object rememberedValue = gapComposer2.rememberedValue();
                            if (z13 || rememberedValue == Composer.Companion.Empty) {
                                z8 = true;
                                rememberedValue = new ToggleableNode$$ExternalSyntheticLambda1(function1, z, 1);
                                gapComposer2.updateRememberedValue(rememberedValue);
                            } else {
                                z8 = true;
                            }
                            gapComposer2.end(false);
                            obj = (Function0) rememberedValue;
                        } else {
                            z8 = true;
                            gapComposer2.startReplaceGroup(-1129250942);
                            gapComposer2.end(false);
                            obj = th;
                        }
                        int i16 = i4 >> 9;
                        int i17 = (65520 & i4) | (i16 & 3670016) | (29360128 & i4) | (234881024 & i4);
                        Color color4 = color2;
                        m1299CheckoutReviewRow_6dBP3U(null, str, str2, color4, z, obj, paddingValues6, z12, z11, gapComposer2, i17, 1);
                        boolean z14 = z11;
                        AnimatedContentKt.AnimatedVisibility(ColumnScopeInstance.INSTANCE, z, null, null, null, null, Expect_jvmKt.rememberComposableLambda(37430323, new PagerDefaults$$ExternalSyntheticLambda0(13, paddingValues5, composableLambdaImpl), gapComposer2), gapComposer2, 1572870 | (i16 & 112), 30);
                        gapComposer2.end(z8);
                        gapComposer = gapComposer2;
                        color3 = color4;
                        z5 = z12;
                        paddingValues3 = paddingValues5;
                        z7 = z9;
                        z6 = z14;
                        modifier3 = modifier5;
                        paddingValues4 = paddingValues6;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new Function2() { // from class: app.cash.local.views.brand.checkout.CheckoutExpandableReviewRowKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                                int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                                CheckoutExpandableReviewRowKt.m1298CheckoutExpandableReviewRowIBGS8fI(Modifier.this, str, str2, color3, z, function1, z7, z5, z6, paddingValues4, paddingValues3, composableLambdaImpl, (Composer) obj2, updateChangedFlags, updateChangedFlags2, i3);
                                return Unit.INSTANCE;
                            }
                        };
                        return;
                    }
                    return;
                }
                i10 = i9;
                i11 = i3 & 1024;
                if (i11 == 0) {
                }
                if (gapComposer2.shouldExecute(i4 & 1, (i4 & 306783379) == 306783378 || (i13 & 19) != 18)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i8 = i7;
            i9 = i3 & 512;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i3 & 1024;
            if (i11 == 0) {
            }
            if (gapComposer2.shouldExecute(i4 & 1, (i4 & 306783379) == 306783378 || (i13 & 19) != 18)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        color2 = color;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i3 & 64;
        if (i5 == 0) {
        }
        i6 = i3 & 128;
        if (i6 == 0) {
        }
        i7 = i3 & 256;
        if (i7 == 0) {
        }
        i8 = i7;
        i9 = i3 & 512;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i3 & 1024;
        if (i11 == 0) {
        }
        if (gapComposer2.shouldExecute(i4 & 1, (i4 & 306783379) == 306783378 || (i13 & 19) != 18)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CheckoutReviewRow(Modifier modifier, String str, AnnotatedString annotatedString, boolean z, Function0 function0, PaddingValues paddingValues, boolean z2, boolean z3, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        int i4;
        int i5;
        GapComposer gapComposer;
        boolean z4;
        PaddingValues paddingValues2;
        boolean z5;
        boolean z6;
        Modifier modifier3;
        RecomposeScopeImpl endRestartGroup;
        Modifier modifier4;
        PaddingValues paddingValues3;
        int i6;
        Modifier modifier5;
        boolean z7;
        Modifier modifier6;
        PaddingValues paddingValues4;
        boolean z8;
        boolean z9;
        str.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(536507100);
        Applier applier = gapComposer2.applier;
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (gapComposer2.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changed(annotatedString) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer2.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= gapComposer2.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked;
        }
        int i8 = i2 & 32;
        if (i8 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            i3 |= gapComposer2.changed(paddingValues) ? PKIFailureInfo.unsupportedVersion : 65536;
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= gapComposer2.changed(z2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            }
            i5 = i2 & 128;
            if (i5 == 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i3 |= gapComposer2.changed(z3) ? 8388608 : 4194304;
            }
            boolean z10 = true;
            char c = 1;
            if (gapComposer2.shouldExecute(i3 & 1, (i3 & 4793491) == 4793490)) {
                gapComposer = gapComposer2;
                z4 = z;
                gapComposer.skipToGroupEnd();
                paddingValues2 = paddingValues;
                z5 = z2;
                z6 = z3;
                modifier3 = modifier2;
            } else {
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier modifier7 = i7 != 0 ? companion : modifier2;
                PaddingValues paddingValues5 = i8 != 0 ? CheckoutReviewRowTouchTargetPadding : paddingValues;
                boolean z11 = i4 != 0 ? true : z2;
                boolean z12 = i5 != 0 ? false : z3;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier7, 1.0f);
                if (function0 != null) {
                    gapComposer2.startReplaceGroup(1510110314);
                    boolean z13 = ((i3 & 7168) == 2048) | ((57344 & i3) == 16384);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (z13 || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new EarningsHeaderKt$$ExternalSyntheticLambda9(z, function0, 1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    Modifier semantics = SemanticsModifierKt.semantics(companion, true, (Function1) rememberedValue);
                    i6 = i3;
                    modifier4 = modifier7;
                    paddingValues3 = paddingValues5;
                    modifier5 = fillMaxWidth;
                    modifier6 = ImageKt.m183clickableoSLSa3U$default(semantics, false, null, null, function0, 15);
                    z7 = false;
                    gapComposer2.end(false);
                } else {
                    modifier4 = modifier7;
                    paddingValues3 = paddingValues5;
                    i6 = i3;
                    modifier5 = fillMaxWidth;
                    z7 = false;
                    gapComposer2.startReplaceGroup(1510513252);
                    gapComposer2.end(false);
                    modifier6 = companion;
                }
                Modifier padding = SpacerKt.padding(modifier5.then(modifier6), paddingValues3);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, z7);
                int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, padding);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                ComposableLambdaImpl composableLambdaImpl = null;
                if (applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer2.startReusableNode();
                if (gapComposer2.inserting) {
                    gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer2.useNode();
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                Integer valueOf = Integer.valueOf(hashCode);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
                if (annotatedString == null) {
                    gapComposer2.startReplaceGroup(-687162552);
                    Modifier fillMaxWidth2 = z12 ? SizeKt.fillMaxWidth(companion, 1.0f) : SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.CenterVertically, gapComposer2, 54);
                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth2);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14, 1.0f, true);
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        z8 = false;
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        z8 = false;
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    gapComposer = gapComposer2;
                    paddingValues4 = paddingValues3;
                    int i9 = i6;
                    Room.m1165Text25TpFw(0, 0, 0, 0, (i6 >> 3) & 14, 0, 4080, colors.semantic.text.standard, (Composer) gapComposer, (Modifier) m, ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).listNumber, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    if (z11) {
                        gapComposer.startReplaceGroup(-1218364438);
                        z4 = z;
                        CheckoutReviewRowCaret(z4, gapComposer, (i9 >> 9) & 14);
                        z9 = false;
                        gapComposer.end(false);
                    } else {
                        z4 = z;
                        z9 = false;
                        gapComposer.startReplaceGroup(-1218301973);
                        gapComposer.end(false);
                    }
                    z10 = true;
                    gapComposer.end(true);
                    gapComposer.end(z9);
                } else {
                    gapComposer = gapComposer2;
                    paddingValues4 = paddingValues3;
                    int i10 = i6;
                    z4 = z;
                    gapComposer.startReplaceGroup(-686559013);
                    Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
                    AnnotatedString annotatedString2 = new AnnotatedString(str);
                    if (z11) {
                        gapComposer.startReplaceGroup(-686386653);
                        composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(1937174776, new SignatureViewKt$$ExternalSyntheticLambda2(z4, c == true ? 1 : 0), gapComposer);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-686309618);
                        gapComposer.end(false);
                    }
                    LocalMapKt.InfoEntry(fillMaxWidth3, annotatedString2, annotatedString, (Function2) null, composableLambdaImpl, (Function0) null, gapComposer, (i10 & 896) | 6, 40);
                    gapComposer.end(false);
                }
                gapComposer.end(z10);
                z5 = z11;
                z6 = z12;
                modifier3 = modifier4;
                paddingValues2 = paddingValues4;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new FilterBarKt$$ExternalSyntheticLambda3(modifier3, str, annotatedString, z4, function0, paddingValues2, z5, z6, i, i2);
                return;
            }
            return;
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        i5 = i2 & 128;
        if (i5 == 0) {
        }
        boolean z102 = true;
        char c2 = 1;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 4793491) == 4793490)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0094  */
    /* renamed from: CheckoutReviewRow-_6dBP3U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1299CheckoutReviewRow_6dBP3U(Modifier modifier, final String str, final String str2, Color color, final boolean z, final Function0 function0, final PaddingValues paddingValues, boolean z2, boolean z3, Composer composer, final int i, final int i2) {
        int i3;
        Color color2;
        Function0 function02;
        PaddingValues paddingValues2;
        int i4;
        int i5;
        int i6;
        GapComposer gapComposer;
        final Modifier modifier2;
        final boolean z4;
        final boolean z5;
        RecomposeScopeImpl endRestartGroup;
        str.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1619923363);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changed(str2) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            color2 = color;
            i3 |= gapComposer2.changed(color2) ? 2048 : 1024;
            if ((i & 24576) == 0) {
                i3 |= gapComposer2.changed(z) ? 16384 : PKIFailureInfo.certRevoked;
            }
            if ((196608 & i) != 0) {
                function02 = function0;
                i3 |= gapComposer2.changedInstance(function02) ? PKIFailureInfo.unsupportedVersion : 65536;
            } else {
                function02 = function0;
            }
            if ((1572864 & i) != 0) {
                paddingValues2 = paddingValues;
                i3 |= gapComposer2.changed(paddingValues2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            } else {
                paddingValues2 = paddingValues;
            }
            i4 = i2 & 128;
            if (i4 == 0) {
                i3 |= 12582912;
            } else if ((12582912 & i) == 0) {
                i3 |= gapComposer2.changed(z2) ? 8388608 : 4194304;
                i5 = i2 & 256;
                if (i5 != 0) {
                    i3 |= 100663296;
                    i6 = i7;
                } else {
                    i6 = i7;
                    if ((i & 100663296) == 0) {
                        i3 |= gapComposer2.changed(z3) ? 67108864 : 33554432;
                    }
                }
                if (gapComposer2.shouldExecute(i3 & 1, (i3 & 38347923) != 38347922)) {
                    Modifier modifier3 = i6 != 0 ? Modifier.Companion.$$INSTANCE : modifier;
                    if (i8 != 0) {
                        color2 = null;
                    }
                    boolean z6 = i4 != 0 ? true : z2;
                    boolean z7 = i5 != 0 ? false : z3;
                    int i9 = i3 >> 3;
                    gapComposer = gapComposer2;
                    CheckoutReviewRow(modifier3, str, str2 != null ? color2 != null ? AnnotatedStringKt.AnnotatedString$default(str2, new SpanStyle(color2.value, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, JpegConstants.COM_MARKER)) : new AnnotatedString(str2) : null, z, function02, paddingValues2, z6, z7, gapComposer, (i3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | (i9 & 29360128), 0);
                    modifier2 = modifier3;
                    z4 = z6;
                    z5 = z7;
                } else {
                    gapComposer = gapComposer2;
                    gapComposer.skipToGroupEnd();
                    modifier2 = modifier;
                    z4 = z2;
                    z5 = z3;
                }
                final Color color3 = color2;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new Function2() { // from class: app.cash.local.views.brand.checkout.CheckoutExpandableReviewRowKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            CheckoutExpandableReviewRowKt.m1299CheckoutReviewRow_6dBP3U(Modifier.this, str, str2, color3, z, function0, paddingValues, z4, z5, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            i5 = i2 & 256;
            if (i5 != 0) {
            }
            if (gapComposer2.shouldExecute(i3 & 1, (i3 & 38347923) != 38347922)) {
            }
            final Color color32 = color2;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        color2 = color;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        i4 = i2 & 128;
        if (i4 == 0) {
        }
        i5 = i2 & 256;
        if (i5 != 0) {
        }
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 38347923) != 38347922)) {
        }
        final Color color322 = color2;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void CheckoutReviewRowCaret(boolean z, Composer composer, int i) {
        int i2;
        Painter painter;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(704179671);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, 12.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), 16.0f);
            if (z) {
                gapComposer.startReplaceGroup(1596456224);
                painter = Icons.CaretUp16.painter(gapComposer);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1596504894);
                painter = Icons.CaretDown16.painter(gapComposer);
                gapComposer.end(false);
            }
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.icon.extraSubtle;
            ImageKt.Image(painter, null, m285size3ABfNKs, null, ContentScale.Companion.None, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 25008, 40);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ViewStateRenderers$$ExternalSyntheticLambda5(i, 2, z);
        }
    }
}
