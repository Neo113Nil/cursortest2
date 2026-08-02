package com.squareup.cash.activity.views.compact;

import androidx.camera.video.internal.config.AudioConfigUtil;
import androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarKt$$ExternalSyntheticLambda7;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.avatar.DiagonalAvatarValues;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.moneybot.genie.TextViewKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public final class RealCompactActivityAvatarScope {
    public static final RealCompactActivityAvatarScope INSTANCE = new RealCompactActivityAvatarScope();

    public final void Avatar(AvatarEntry avatarEntry, AvatarBadgeViewModel avatarBadgeViewModel, Function0 function0, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-223839244);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(avatarEntry) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? gapComposer.changed(avatarBadgeViewModel) : gapComposer.changedInstance(avatarBadgeViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier modifier = Modifier.Companion.$$INSTANCE;
            if (avatarBadgeViewModel == null) {
                gapComposer.startReplaceGroup(1689444555);
                int i3 = i2;
                AvatarSize avatarSize = AvatarSize.Size32;
                if (function0 != null) {
                    gapComposer.startReplaceGroup(-361139815);
                    modifier = RippleKt.clickableWithUnboundedRipple(modifier, function0, gapComposer);
                } else {
                    gapComposer.startReplaceGroup(-361138468);
                }
                gapComposer.end(false);
                TextViewKt.Avatar(avatarSize, avatarEntry, modifier, false, gapComposer, ((i3 << 3) & 112) | 6, 24);
                gapComposer.end(false);
            } else {
                int i4 = i2;
                gapComposer.startReplaceGroup(1689644939);
                String str = avatarEntry.contentDescription;
                if (function0 != null) {
                    gapComposer.startReplaceGroup(-361132359);
                    modifier = RippleKt.clickableWithUnboundedRipple(modifier, function0, gapComposer);
                } else {
                    gapComposer.startReplaceGroup(-361131012);
                }
                gapComposer.end(false);
                CompactActivityScopesKt.CompactBadgeAvatar(avatarBadgeViewModel, str, modifier, gapComposer, (i4 >> 3) & 14);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertDialogKt$$ExternalSyntheticLambda0(i, 20, this, avatarEntry, avatarBadgeViewModel, function0);
        }
    }

    /* renamed from: Avatar-OadGlvw, reason: not valid java name */
    public final void m2974AvatarOadGlvw(long j, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1615796935);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changed("N") ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(j) ? 32 : 16;
        }
        int i3 = i2 | 224640;
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            AvatarSize avatarSize = AvatarSize.Size32;
            gapComposer.startReplaceGroup(1997319809);
            gapComposer.end(false);
            int i4 = i3 << 3;
            int i5 = (i4 & 896) | (i4 & 112) | 6 | (i3 & 7168);
            int i6 = i3 << 9;
            TextViewKt.m3613AvatarB_rZmmc(avatarSize, "N", j, (String) null, (Modifier) Modifier.Companion.$$INSTANCE, (AvatarImage) null, (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer, i5 | (458752 & i6) | (i6 & 29360128), 0, 1856);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarKt$$ExternalSyntheticLambda7(this, j, i);
        }
    }

    public final void DiagonalStackedAvatars(AvatarEntry avatarEntry, AvatarEntry avatarEntry2, Function0 function0, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(400974478);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(avatarEntry) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(avatarEntry2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            DiagonalAvatarValues diagonalAvatarValues = DiagonalAvatarValues.Size48;
            Modifier modifier = Modifier.Companion.$$INSTANCE;
            if (function0 != null) {
                gapComposer.startReplaceGroup(-1210572845);
                modifier = RippleKt.clickableWithUnboundedRipple(modifier, function0, gapComposer);
            } else {
                gapComposer.startReplaceGroup(-1210571498);
            }
            gapComposer.end(false);
            int i3 = i2 << 3;
            AudioConfigUtil.DiagonalStackedAvatars(diagonalAvatarValues, avatarEntry, avatarEntry2, modifier, gapComposer, (i3 & 112) | 6 | (i3 & 896), 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertDialogKt$$ExternalSyntheticLambda0(i, 21, this, avatarEntry, avatarEntry2, function0);
        }
    }
}
