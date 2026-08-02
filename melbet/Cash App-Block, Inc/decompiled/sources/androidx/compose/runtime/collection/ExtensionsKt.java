package androidx.compose.runtime.collection;

import androidx.collection.MutableObjectList;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Horizontal;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda3;
import com.squareup.cash.benefits.components.viewmodels.GreenStatus;
import com.squareup.cash.benefits.components.views.Style;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class ExtensionsKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CashGreenRectangleRow(GreenStatus greenStatus, Modifier modifier, Arrangement$Horizontal arrangement$Horizontal, Style style, Function3 function3, Composer composer, int i, int i2) {
        int i3;
        Arrangement$Horizontal arrangement$Horizontal2;
        int i4;
        int i5;
        Function3 function32;
        Style style2;
        Function3 function33;
        RecomposeScopeImpl endRestartGroup;
        int i6;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(457064101);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(greenStatus.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            arrangement$Horizontal2 = arrangement$Horizontal;
            i3 |= gapComposer.changed(arrangement$Horizontal2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= gapComposer.changed(style == null ? -1 : style.ordinal()) ? 2048 : 1024;
            }
            i5 = i2 & 16;
            if (i5 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function32 = function3;
                i3 |= gapComposer.changedInstance(function32) ? 16384 : PKIFailureInfo.certRevoked;
                if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
                    Arrangement$Horizontal arrangement$Horizontal3 = i7 != 0 ? SpacerKt.Start : arrangement$Horizontal2;
                    Style style3 = i4 != 0 ? Style.LARGE : style;
                    function33 = i5 != 0 ? null : function32;
                    Modifier height = OffsetKt.height(modifier, IntrinsicSize.Min);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$Horizontal3, Alignment.Companion.CenterVertically, gapComposer, (((((i3 >> 3) & 112) | MLKEMEngine.KyberPolyBytes) >> 3) & 14) | 48);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, height);
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
                    Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    int ordinal = greenStatus.ordinal();
                    if (ordinal == 0) {
                        int ordinal2 = style3.ordinal();
                        if (ordinal2 == 0) {
                            i6 = R.drawable.cash_green_status_inactive_large;
                        } else {
                            if (ordinal2 != 1) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return;
                            }
                            i6 = R.drawable.cash_green_status_inactive_small;
                        }
                    } else {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        int ordinal3 = style3.ordinal();
                        if (ordinal3 == 0) {
                            i6 = R.drawable.cash_green_status_active_large;
                        } else {
                            if (ordinal3 != 1) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return;
                            }
                            i6 = R.drawable.cash_green_status_active_small;
                        }
                    }
                    ImageKt.Image(Countries.painterResource(i6, 0, gapComposer), null, null, null, null, RecyclerView.DECELERATION_RATE, null, gapComposer, Painter.$stable | 48, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                    if (function33 == null) {
                        gapComposer.startReplaceGroup(-2047543276);
                    } else {
                        gapComposer.startReplaceGroup(72497549);
                        function33.invoke(RowScopeInstance.INSTANCE, gapComposer, Integer.valueOf(((i3 >> 9) & 112) | 6));
                    }
                    gapComposer.end(false);
                    gapComposer.end(true);
                    style2 = style3;
                    arrangement$Horizontal2 = arrangement$Horizontal3;
                } else {
                    gapComposer.skipToGroupEnd();
                    style2 = style;
                    function33 = function32;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda3((Object) greenStatus, modifier, (Object) arrangement$Horizontal2, (Object) style2, (Object) function33, i, i2, 13);
                    return;
                }
                return;
            }
            function32 = function3;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        arrangement$Horizontal2 = arrangement$Horizontal;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        function32 = function3;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final float btSymbolBrightness(float f) {
        if (f < RecyclerView.DECELERATION_RATE || f >= 2.4f) {
            return RecyclerView.DECELERATION_RATE;
        }
        if (f < 0.8f) {
            float f2 = f * 1.25f;
            return f2 * f2 * f2;
        }
        if (f < 1.4000001f) {
            return 1.0f;
        }
        float f3 = 1.0f - ((f - 1.4000001f) * 1.0f);
        return f3 * f3 * f3;
    }

    public static final Object removeLast(MutableObjectList mutableObjectList) {
        if (mutableObjectList.isEmpty()) {
            OptionalProvider$$ExternalSyntheticLambda0.m("List is empty.");
            return null;
        }
        int i = mutableObjectList._size - 1;
        Object obj = mutableObjectList.get(i);
        mutableObjectList.removeAt(i);
        return obj;
    }
}
