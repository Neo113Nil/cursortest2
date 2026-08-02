package com.squareup.cash.activity.views;

import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda9;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.local.views.sheet.MenuPickerSheetKt$$ExternalSyntheticLambda4;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public final class EmbeddedHeaderScope {
    public final boolean hasMore;

    public EmbeddedHeaderScope(boolean z) {
        this.hasMore = z;
    }

    public final void CompactHeader(Function0 function0, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(913636890);
        int i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier clickableWithUnboundedRipple = RippleKt.clickableWithUnboundedRipple(SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 32.0f, 7), function0, gapComposer);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.CenterVertically, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, clickableWithUnboundedRipple);
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
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.activity_title), (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            Strings.getSizes(gapComposer).getClass();
            Trace.m1191Iconww6aTOc(Icons.SubtlePush16, (String) null, SpacerKt.m302paddingqDBjuR0$default(companion, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), Strings.getColors(gapComposer).semantic.icon.subtle, gapComposer, 54, 0);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MenuPickerSheetKt$$ExternalSyntheticLambda4(this, function0, i, 23);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0087, code lost:
    
        if ((r21 & 2) != 0) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void DefaultHeader(int i, int i2, Composer composer, String str, String str2, Function0 function0) {
        int i3;
        String str3;
        String str4;
        int i4;
        str.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2117556132);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                str3 = str2;
                if (gapComposer.changed(str3)) {
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                str3 = str2;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            str3 = str2;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changed(this) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                if ((i2 & 2) != 0) {
                    str3 = Room.stringResource(gapComposer, R.string.activity_embedded_show_all);
                    i3 &= -113;
                }
                String str5 = str3;
                gapComposer.endDefaults();
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                int i5 = i3 & 14;
                int i6 = i3 << 3;
                DefaultHeaderInternal(i5 | (i6 & 896) | (i6 & 7168) | (i6 & 57344), gapComposer, SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7), str, str5, function0);
                str4 = str5;
            } else {
                gapComposer.skipToGroupEnd();
            }
        } else {
            gapComposer.skipToGroupEnd();
            str4 = str3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EmbeddedHeaderScope$$ExternalSyntheticLambda0(this, str, str4, function0, i, i2, 0);
        }
    }

    public final void DefaultHeaderInternal(int i, Composer composer, Modifier modifier, String str, String str2, Function0 function0) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1336306486);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(this) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            ViewfinderDefaults.SectionHeader(str, modifier, this.hasMore ? str2 : null, function0, (String) null, gapComposer, i2 & 7294, 16);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TransitionKt$$ExternalSyntheticLambda9(this, str, modifier, str2, function0, i, 8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0080, code lost:
    
        if ((r13 & 2) != 0) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void DefaultHeaderWithoutSpace(int i, int i2, Composer composer, String str, String str2, Function0 function0) {
        int i3;
        String str3;
        String str4;
        int i4;
        str.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1642340574);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                str3 = str2;
                if (gapComposer.changed(str3)) {
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                str3 = str2;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            str3 = str2;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changed(this) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                if ((i2 & 2) != 0) {
                    str3 = Room.stringResource(gapComposer, R.string.activity_embedded_show_all);
                    i3 &= -113;
                }
                String str5 = str3;
                gapComposer.endDefaults();
                int i5 = (i3 & 14) | 48;
                int i6 = i3 << 3;
                DefaultHeaderInternal(i5 | (i6 & 896) | (i6 & 7168) | (i6 & 57344), gapComposer, Modifier.Companion.$$INSTANCE, str, str5, function0);
                str4 = str5;
            } else {
                gapComposer.skipToGroupEnd();
            }
        } else {
            gapComposer.skipToGroupEnd();
            str4 = str3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EmbeddedHeaderScope$$ExternalSyntheticLambda0(this, str, str4, function0, i, i2, 1);
        }
    }
}
