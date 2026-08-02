package com.squareup.cash.arcade.components.cell;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.moneybot.genie.TextViewKt;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public final class RealCellActivityAvatarScope {
    public static final RealCellActivityAvatarScope INSTANCE = new RealCellActivityAvatarScope();

    public final void Avatar(AvatarEntry avatarEntry, Composer composer, int i) {
        int i2;
        AvatarEntry avatarEntry2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1694009429);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(avatarEntry) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        int i4 = 3;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            AvatarSize avatarSize = AvatarSize.Size48;
            gapComposer.startReplaceGroup(150463517);
            gapComposer.end(false);
            avatarEntry2 = avatarEntry;
            TextViewKt.Avatar(avatarSize, avatarEntry2, Modifier.Companion.$$INSTANCE, false, gapComposer, ((i3 << 3) & 112) | 6, 24);
        } else {
            avatarEntry2 = avatarEntry;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BalanceHomeViewKt$$ExternalSyntheticLambda11(this, avatarEntry2, i, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0056  */
    /* renamed from: Avatar-OadGlvw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3395AvatarOadGlvw(String str, long j, AvatarImage avatarImage, AvatarOverlay avatarOverlay, Composer composer, int i, int i2) {
        int i3;
        AvatarImage avatarImage2;
        int i4;
        AvatarOverlay avatarOverlay2;
        int i5;
        GapComposer gapComposer;
        AvatarImage avatarImage3;
        RecomposeScopeImpl endRestartGroup;
        str.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(124090596);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changed(j) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            avatarImage2 = avatarImage;
            i3 |= gapComposer2.changed(avatarImage2) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= gapComposer2.changed((Object) null) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                avatarOverlay2 = avatarOverlay;
                i3 |= gapComposer2.changed(avatarOverlay2) ? 16384 : PKIFailureInfo.certRevoked;
                i5 = i3 | 196608;
                if (gapComposer2.shouldExecute(i5 & 1, (74899 & i5) != 74898)) {
                    AvatarImage avatarImage4 = i6 != 0 ? null : avatarImage2;
                    AvatarOverlay avatarOverlay3 = i4 != 0 ? null : avatarOverlay2;
                    AvatarSize avatarSize = AvatarSize.Size48;
                    gapComposer2.startReplaceGroup(-1008008340);
                    gapComposer2.end(false);
                    int i7 = i5 << 3;
                    int i8 = (i7 & 896) | (i7 & 112) | 6 | (i5 & 7168);
                    int i9 = i5 << 9;
                    gapComposer = gapComposer2;
                    TextViewKt.m3613AvatarB_rZmmc(avatarSize, str, j, (String) null, (Modifier) Modifier.Companion.$$INSTANCE, avatarImage4, (Function2) null, avatarOverlay3, false, 0L, (Composer) gapComposer, i8 | (458752 & i9) | (i9 & 29360128), 0, 1856);
                    avatarImage3 = avatarImage4;
                    avatarOverlay2 = avatarOverlay3;
                } else {
                    gapComposer = gapComposer2;
                    gapComposer.skipToGroupEnd();
                    avatarImage3 = avatarImage2;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new CellActivityAvatarScope$$ExternalSyntheticLambda0(this, str, j, avatarImage3, avatarOverlay2, i, i2);
                    return;
                }
                return;
            }
            avatarOverlay2 = avatarOverlay;
            i5 = i3 | 196608;
            if (gapComposer2.shouldExecute(i5 & 1, (74899 & i5) != 74898)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        avatarImage2 = avatarImage;
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        avatarOverlay2 = avatarOverlay;
        i5 = i3 | 196608;
        if (gapComposer2.shouldExecute(i5 & 1, (74899 & i5) != 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
