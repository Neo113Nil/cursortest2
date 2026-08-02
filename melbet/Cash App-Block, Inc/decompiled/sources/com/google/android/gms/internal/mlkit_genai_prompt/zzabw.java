package com.google.android.gms.internal.mlkit_genai_prompt;

import android.util.Rational;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.local.views.brand.orders.OrderStatusRowKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import coil3.memory.RealWeakMemoryCache;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.moneybot.backend.api.GeneralMoneybotError;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.moneybot.screens.MoneybotStaticPickerOption;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class zzabw {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HorizontalStackedAvatars(AvatarSize avatarSize, ImmutableList immutableList, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        RecomposeScopeImpl endRestartGroup;
        avatarSize.getClass();
        immutableList.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(604224644);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(avatarSize.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changed(immutableList) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 256 : 128;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) == 146)) {
                gapComposer.skipToGroupEnd();
            } else {
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                if (i4 != 0) {
                    modifier2 = companion;
                }
                RealWeakMemoryCache realWeakMemoryCache = new RealWeakMemoryCache(1);
                gapComposer.startReplaceGroup(-1696657945);
                AvatarSize avatarSize2 = avatarSize;
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned((-avatarSize2.size) / 3.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer, 48);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier2);
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
                gapComposer.startReplaceGroup(759524988);
                Iterator<E> it = immutableList.iterator();
                while (it.hasNext()) {
                    TextViewKt.Avatar(avatarSize2, (AvatarEntry) it.next(), realWeakMemoryCache.m1459clippedOutlinewH6b6FI(companion, RoundedCornerShapeKt.CircleShape, 3.0f), false, gapComposer, 0, 24);
                    avatarSize2 = avatarSize;
                }
                Boxes$$ExternalSyntheticOutline1.m(gapComposer, false, true, false);
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new OrderStatusRowKt$$ExternalSyntheticLambda1(avatarSize, immutableList, modifier2, i, i2, 13);
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) == 146)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final boolean access$isEnabled(MoneybotStaticPickerOption moneybotStaticPickerOption, Money money, ErrorReporter errorReporter) {
        CurrencyCode currencyCode;
        Money money2 = moneybotStaticPickerOption.maxAmount;
        if (money2 != null && money != null) {
            CurrencyCode currencyCode2 = money.currency_code;
            if (currencyCode2 != null && (currencyCode = money2.currency_code) != null && currencyCode2 != currencyCode) {
                errorReporter.report(new GeneralMoneybotError("Moneybot static picker option " + moneybotStaticPickerOption.value + " max amount currency " + money2.currency_code + " does not match linked amount currency " + money.currency_code), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                return true;
            }
            Long l = money.amount;
            long longValue = l != null ? l.longValue() : Long.MIN_VALUE;
            Long l2 = money2.amount;
            if (longValue > (l2 != null ? l2.longValue() : Long.MAX_VALUE)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean isInvalidCaptureToEncodeRatio(Rational rational) {
        return Intrinsics.areEqual(rational, Rational.NaN) || Intrinsics.areEqual(rational, Rational.ZERO) || Intrinsics.areEqual(rational, Rational.NEGATIVE_INFINITY) || Intrinsics.areEqual(rational, Rational.POSITIVE_INFINITY);
    }
}
