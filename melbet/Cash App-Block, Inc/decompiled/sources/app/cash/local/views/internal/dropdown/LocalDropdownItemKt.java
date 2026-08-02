package app.cash.local.views.internal.dropdown;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.views.cart.CartBannerViewKt$$ExternalSyntheticLambda2;
import app.cash.local.views.internal.dropdown.LocalDropdownItemModel;
import app.cash.local.views.sheet.EducationalSheetKt$$ExternalSyntheticLambda8;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import bo.app.n$$ExternalSyntheticLambda0;
import com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda10;
import com.mikepenz.markdown.compose.MarkdownKt$$ExternalSyntheticLambda2;
import com.plaid.internal.EnumC0170g;
import com.squareup.util.Strings;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class LocalDropdownItemKt {

    /* renamed from: lambda$-2067282216, reason: not valid java name */
    public static final ComposableLambdaImpl f50lambda$2067282216 = new ComposableLambdaImpl(new MarkerKt$$ExternalSyntheticLambda10(6), false, -2067282216);

    public static final void LocalDropdownItem(ColumnScope columnScope, LocalDropdownItemModel localDropdownItemModel, Function0 function0, Composer composer, int i) {
        int i2;
        ComposableLambdaImpl rememberComposableLambda;
        columnScope.getClass();
        localDropdownItemModel.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(870971771);
        if ((i & 48) == 0) {
            i2 = (gapComposer.changed(localDropdownItemModel) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
            PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(16.0f, 14.0f, 16.0f, 14.0f);
            LocalDropdownItemModel.IconState iconState = localDropdownItemModel.iconState;
            if (Intrinsics.areEqual(iconState, LocalDropdownItemModel.IconState.NoIcon.INSTANCE)) {
                gapComposer.startReplaceGroup(1223207906);
                gapComposer.end(false);
                rememberComposableLambda = null;
            } else if (Intrinsics.areEqual(iconState, LocalDropdownItemModel.IconState.Loading.INSTANCE)) {
                gapComposer.startReplaceGroup(1223233916);
                gapComposer.end(false);
                rememberComposableLambda = f50lambda$2067282216;
            } else {
                if (!(iconState instanceof LocalDropdownItemModel.IconState.WithIcon)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -514732423, false);
                }
                gapComposer.startReplaceGroup(1223338727);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(125231577, new CartBannerViewKt$$ExternalSyntheticLambda2(iconState, 9), gapComposer);
                gapComposer.end(false);
            }
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1263810645, new CartBannerViewKt$$ExternalSyntheticLambda2(localDropdownItemModel, 10), gapComposer);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new n$$ExternalSyntheticLambda0(4, localDropdownItemModel, function0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            AndroidMenu_androidKt.DropdownMenuItem(rememberComposableLambda2, (Function0) rememberedValue, null, null, rememberComposableLambda, false, null, paddingValuesImpl, gapComposer, 12582918, 364);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownKt$$ExternalSyntheticLambda2(columnScope, localDropdownItemModel, function0, i, 9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0094  */
    /* renamed from: LocalDropdownMenu-4kj-_NE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1326LocalDropdownMenu4kj_NE(Modifier modifier, final ComposableLambdaImpl composableLambdaImpl, final ImmutableList immutableList, long j, boolean z, boolean z2, boolean z3, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j2;
        final boolean z4;
        int i4;
        boolean z5;
        final Modifier modifier3;
        final long j3;
        final boolean z6;
        final boolean z7;
        RecomposeScopeImpl endRestartGroup;
        boolean z8;
        boolean z9;
        long j4;
        Object rememberedValue;
        Object obj;
        long j5;
        immutableList.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1950758134);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (gapComposer.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(composableLambdaImpl) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(immutableList) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            j2 = j;
            i3 |= ((i2 & 8) == 0 && gapComposer.changed(j2)) ? 2048 : 1024;
        } else {
            j2 = j;
        }
        int i6 = i3 | 24576;
        int i7 = i2 & 32;
        if (i7 != 0) {
            i6 = 221184 | i3;
        } else if ((196608 & i) == 0) {
            z4 = z2;
            i6 |= gapComposer.changed(z4) ? PKIFailureInfo.unsupportedVersion : 65536;
            i4 = i2 & 64;
            if (i4 == 0) {
                i6 |= 1572864;
            } else if ((1572864 & i) == 0) {
                z5 = z3;
                i6 |= gapComposer.changed(z5) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                if (gapComposer.shouldExecute(i6 & 1, (599187 & i6) != 599186)) {
                    gapComposer.startDefaults();
                    int i8 = i & 1;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    if (i8 == 0 || gapComposer.getDefaultsInvalid()) {
                        if (i5 != 0) {
                            modifier2 = companion;
                        }
                        if ((i2 & 8) != 0) {
                            i6 &= -7169;
                            j2 = 0;
                        }
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i4 != 0) {
                            j4 = j2;
                            z9 = true;
                            z8 = false;
                            gapComposer.endDefaults();
                            rememberedValue = gapComposer.rememberedValue();
                            obj = Composer.Companion.Empty;
                            if (rememberedValue == obj) {
                                rememberedValue = Recorder$$ExternalSyntheticOutline1.m(z8, gapComposer);
                            }
                            MutableState mutableState = (MutableState) rememberedValue;
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                            boolean z10 = z8;
                            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier2);
                            ComposeUiNode.Companion.getClass();
                            Modifier modifier4 = modifier2;
                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                            boolean z11 = z4;
                            if (gapComposer.applier != null) {
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
                            if (immutableList.isEmpty() && z11) {
                                gapComposer.startReplaceGroup(1302728466);
                                gapComposer.end(false);
                            } else {
                                gapComposer.startReplaceGroup(1302666001);
                                Object rememberedValue2 = gapComposer.rememberedValue();
                                if (rememberedValue2 == obj) {
                                    rememberedValue2 = new TabContentViewKt$$ExternalSyntheticLambda1(3, mutableState);
                                    gapComposer.updateRememberedValue(rememberedValue2);
                                }
                                composableLambdaImpl.invoke(BoxScopeInstance.INSTANCE, (Function0) rememberedValue2, gapComposer, Integer.valueOf(((i6 << 3) & 896) | 54));
                                gapComposer.end(false);
                            }
                            Modifier m276defaultMinSizeVpY3zN4$default = SizeKt.m276defaultMinSizeVpY3zN4$default(companion, 192.0f, RecyclerView.DECELERATION_RATE, 2);
                            boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(12.0f);
                            if (Strings.getColors(gapComposer).isLight) {
                                gapComposer.startReplaceGroup(1302962578);
                                j5 = Strings.getColors(gapComposer).semantic.background.f1047app;
                                gapComposer.end(false);
                            } else {
                                gapComposer.startReplaceGroup(1303034653);
                                j5 = Strings.getColors(gapComposer).semantic.background.subtle;
                                gapComposer.end(false);
                            }
                            long j6 = j5;
                            Object rememberedValue3 = gapComposer.rememberedValue();
                            if (rememberedValue3 == obj) {
                                rememberedValue3 = new TabContentViewKt$$ExternalSyntheticLambda1(4, mutableState);
                                gapComposer.updateRememberedValue(rememberedValue3);
                            }
                            AndroidMenu_androidKt.m516DropdownMenuIlH_yew(booleanValue, (Function0) rememberedValue3, m276defaultMinSizeVpY3zN4$default, j4, null, null, m340RoundedCornerShape0680j_4, j6, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(2122228149, new EducationalSheetKt$$ExternalSyntheticLambda8(immutableList, z9, mutableState, 2), gapComposer), gapComposer, (i6 & 7168) | 432, 1840);
                            gapComposer.end(true);
                            z6 = z10;
                            z4 = z11;
                            z7 = z9;
                            j3 = j4;
                            modifier3 = modifier4;
                        } else {
                            z8 = z5;
                            z9 = true;
                        }
                    } else {
                        gapComposer.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i6 &= -7169;
                        }
                        z9 = z;
                        z8 = z5;
                    }
                    j4 = j2;
                    gapComposer.endDefaults();
                    rememberedValue = gapComposer.rememberedValue();
                    obj = Composer.Companion.Empty;
                    if (rememberedValue == obj) {
                    }
                    MutableState mutableState2 = (MutableState) rememberedValue;
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    boolean z102 = z8;
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, modifier2);
                    ComposeUiNode.Companion.getClass();
                    Modifier modifier42 = modifier2;
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    boolean z112 = z4;
                    if (gapComposer.applier != null) {
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                    modifier3 = modifier2;
                    j3 = j2;
                    z6 = z5;
                    z7 = z;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new Function2() { // from class: app.cash.local.views.internal.dropdown.LocalDropdownMenuKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            LocalDropdownItemKt.m1326LocalDropdownMenu4kj_NE(Modifier.this, composableLambdaImpl, immutableList, j3, z7, z4, z6, (Composer) obj2, Updater.updateChangedFlags(i | 1), i2);
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            z5 = z3;
            if (gapComposer.shouldExecute(i6 & 1, (599187 & i6) != 599186)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        z4 = z2;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        z5 = z3;
        if (gapComposer.shouldExecute(i6 & 1, (599187 & i6) != 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
