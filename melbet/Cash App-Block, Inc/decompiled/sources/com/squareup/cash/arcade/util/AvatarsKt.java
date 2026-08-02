package com.squareup.cash.arcade.util;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.internal.config.AudioConfigUtil;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.ContentScale;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabw;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.avatar.DiagonalAvatarValues;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.common.viewmodels.AvatarViewModel;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.util.cash.ColorsKt;
import com.squareup.wire.GrpcStatus;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import okhttp3.internal.Tags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class AvatarsKt {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Avatar(AvatarSize avatarSize, StackedAvatarViewModel.Single single, Modifier modifier, AvatarBadgeViewModel avatarBadgeViewModel, Function3 function3, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function3 function32;
        AvatarBadgeViewModel avatarBadgeViewModel2;
        RecomposeScopeImpl endRestartGroup;
        int i5;
        Modifier modifier3;
        Function3 function33;
        int i6;
        AvatarBadgeViewModel avatarBadgeViewModel3 = avatarBadgeViewModel;
        avatarSize.getClass();
        single.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(120652814);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(avatarSize.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? gapComposer.changed(single) : gapComposer.changedInstance(single) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= (i & 4096) == 0 ? gapComposer.changed(avatarBadgeViewModel3) : gapComposer.changedInstance(avatarBadgeViewModel3) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    function32 = function3;
                    if (gapComposer.changedInstance(function32)) {
                        i6 = 16384;
                        i3 |= i6;
                    }
                } else {
                    function32 = function3;
                }
                i6 = PKIFailureInfo.certRevoked;
                i3 |= i6;
            } else {
                function32 = function3;
            }
            int i8 = 0;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
                gapComposer.skipToGroupEnd();
                avatarBadgeViewModel2 = avatarBadgeViewModel3;
            } else {
                gapComposer.startDefaults();
                if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                    Modifier modifier4 = i7 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                    if (i4 != 0) {
                        avatarBadgeViewModel3 = null;
                    }
                    if ((i2 & 16) != 0) {
                        AvatarsKt$$ExternalSyntheticLambda0 avatarsKt$$ExternalSyntheticLambda0 = new AvatarsKt$$ExternalSyntheticLambda0(i8);
                        i5 = i3 & (-57345);
                        modifier3 = modifier4;
                        function33 = avatarsKt$$ExternalSyntheticLambda0;
                        AvatarBadgeViewModel avatarBadgeViewModel4 = avatarBadgeViewModel3;
                        gapComposer.endDefaults();
                        int i9 = i5 >> 6;
                        TextViewKt.Avatar(avatarSize, toAvatarEntry(single.avatar, avatarBadgeViewModel4, function33, gapComposer, (i9 & 112) | 8 | (i9 & 896), 0), modifier3, false, gapComposer, i5 & 910, 24);
                        avatarBadgeViewModel2 = avatarBadgeViewModel4;
                        function32 = function33;
                        modifier2 = modifier3;
                    } else {
                        i5 = i3;
                        modifier3 = modifier4;
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    i5 = i3;
                    modifier3 = modifier2;
                }
                function33 = function32;
                AvatarBadgeViewModel avatarBadgeViewModel42 = avatarBadgeViewModel3;
                gapComposer.endDefaults();
                int i92 = i5 >> 6;
                TextViewKt.Avatar(avatarSize, toAvatarEntry(single.avatar, avatarBadgeViewModel42, function33, gapComposer, (i92 & 112) | 8 | (i92 & 896), 0), modifier3, false, gapComposer, i5 & 910, 24);
                avatarBadgeViewModel2 = avatarBadgeViewModel42;
                function32 = function33;
                modifier2 = modifier3;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda3(avatarSize, single, modifier2, avatarBadgeViewModel2, function32, i, i2, 0);
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        if ((i & 24576) != 0) {
        }
        int i82 = 0;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void DiagonalStackedAvatars(DiagonalAvatarValues diagonalAvatarValues, StackedAvatarViewModel stackedAvatarViewModel, Modifier modifier, AvatarSize avatarSize, Function3 function3, Composer composer, int i) {
        Modifier modifier2;
        Function3 function32;
        Modifier modifier3;
        Function3 function33;
        Function3 function34;
        diagonalAvatarValues.getClass();
        stackedAvatarViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-327355627);
        int i2 = i | (gapComposer.changed(stackedAvatarViewModel) ? 32 : 16) | 205184;
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                AvatarsKt$$ExternalSyntheticLambda0 avatarsKt$$ExternalSyntheticLambda0 = new AvatarsKt$$ExternalSyntheticLambda0(i3);
                modifier3 = Modifier.Companion.$$INSTANCE;
                function33 = avatarsKt$$ExternalSyntheticLambda0;
            } else {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier;
                function33 = function3;
            }
            gapComposer.endDefaults();
            if (stackedAvatarViewModel instanceof StackedAvatarViewModel.Single) {
                gapComposer.startReplaceGroup(1619679633);
                TextViewKt.Avatar(avatarSize, toAvatarEntry(((StackedAvatarViewModel.Single) stackedAvatarViewModel).avatar, null, function33, gapComposer, 56, 0), modifier3, false, gapComposer, 390, 24);
                gapComposer = gapComposer;
                gapComposer.end(false);
                function34 = function33;
            } else {
                Function3 function35 = function33;
                if (!(stackedAvatarViewModel instanceof StackedAvatarViewModel.Duo)) {
                    if (!(stackedAvatarViewModel instanceof StackedAvatarViewModel.Trio)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1056132147, false);
                    }
                    gapComposer.startReplaceGroup(1620336492);
                    gapComposer.end(false);
                    a$$ExternalSyntheticBUOutline0.m$3("Diagonal Stacked Avatars requires a model with at most 2 avatars.");
                    return;
                }
                gapComposer.startReplaceGroup(1620006962);
                StackedAvatarViewModel.Duo duo = (StackedAvatarViewModel.Duo) stackedAvatarViewModel;
                function34 = function35;
                AudioConfigUtil.DiagonalStackedAvatars(diagonalAvatarValues, toAvatarEntry(duo.backAvatar, null, function35, gapComposer, 8, 1), toAvatarEntry(duo.frontAvatar, null, function35, gapComposer, 8, 1), modifier3, gapComposer, 3078, 0);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
            modifier2 = modifier3;
            function32 = function34;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            function32 = function3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda4(diagonalAvatarValues, stackedAvatarViewModel, modifier2, avatarSize, function32, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HorizontalStackedAvatars(AvatarSize avatarSize, StackedAvatarViewModel stackedAvatarViewModel, Modifier modifier, Function3 function3, Composer composer, int i, int i2) {
        int i3;
        Function3 function32;
        int i4;
        int i5;
        Modifier modifier2;
        Function3 function33;
        RecomposeScopeImpl endRestartGroup;
        Function3 function34;
        int i6;
        Modifier modifier3;
        Function3 function35;
        ImmutableList immutableList;
        ImmutableList immutableList2;
        ImmutableList immutableList3;
        avatarSize.getClass();
        stackedAvatarViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(335011988);
        if ((i & 6) == 0) {
            i3 = i | (gapComposer.changed(avatarSize.ordinal()) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i7 = i3 | ((i & 64) == 0 ? gapComposer.changed(stackedAvatarViewModel) : gapComposer.changedInstance(stackedAvatarViewModel) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if ((i2 & 8) == 0) {
            function32 = function3;
            if (gapComposer.changedInstance(function32)) {
                i4 = 2048;
                int i8 = i7 | i4;
                AvatarEntry avatarEntry = null;
                if ((i2 & 16) == 0) {
                    i5 = i8 | 24576;
                } else {
                    i5 = i8 | (gapComposer.changed((Object) null) ? 16384 : PKIFailureInfo.certRevoked);
                }
                int i9 = 0;
                if (gapComposer.shouldExecute(i5 & 1, (i5 & 9363) == 9362)) {
                    gapComposer.skipToGroupEnd();
                    modifier2 = modifier;
                    function33 = function32;
                } else {
                    gapComposer.startDefaults();
                    if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                        if ((i2 & 8) != 0) {
                            function32 = new AvatarsKt$$ExternalSyntheticLambda0(i9);
                            i5 &= -7169;
                        }
                        function34 = function32;
                        i6 = i5;
                        modifier3 = Modifier.Companion.$$INSTANCE;
                    } else {
                        gapComposer.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i5 &= -7169;
                        }
                        function34 = function32;
                        i6 = i5;
                        modifier3 = modifier;
                    }
                    gapComposer.endDefaults();
                    if (stackedAvatarViewModel instanceof StackedAvatarViewModel.Single) {
                        gapComposer.startReplaceGroup(-1161500616);
                        immutableList3 = Tags.toImmutableList(CollectionsKt__CollectionsJVMKt.listOf(toAvatarEntry(((StackedAvatarViewModel.Single) stackedAvatarViewModel).avatar, null, function34, gapComposer, ((i6 >> 3) & 896) | 8 | ((i6 >> 9) & 112), 0)));
                        gapComposer.end(false);
                    } else if (stackedAvatarViewModel instanceof StackedAvatarViewModel.Duo) {
                        gapComposer.startReplaceGroup(-1161268085);
                        StackedAvatarViewModel.Duo duo = (StackedAvatarViewModel.Duo) stackedAvatarViewModel;
                        int i10 = ((i6 >> 3) & 896) | 8;
                        immutableList3 = Tags.toImmutableList(CollectionsKt__CollectionsKt.listOf((Object[]) new AvatarEntry[]{toAvatarEntry(duo.frontAvatar, null, function34, gapComposer, i10, 1), toAvatarEntry(duo.backAvatar, null, function34, gapComposer, i10, 1)}));
                        gapComposer.end(false);
                    } else {
                        if (!(stackedAvatarViewModel instanceof StackedAvatarViewModel.Trio)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -176015661, false);
                        }
                        gapComposer.startReplaceGroup(-1160948506);
                        StackedAvatarViewModel.Trio trio = (StackedAvatarViewModel.Trio) stackedAvatarViewModel;
                        int i11 = ((i6 >> 3) & 896) | 8;
                        AvatarEntry avatarEntry2 = toAvatarEntry(trio.frontAvatar, null, function34, gapComposer, i11, 1);
                        int i12 = trio.overflowCount;
                        Integer valueOf = Integer.valueOf(i12);
                        if (!trio.showOverflow || i12 <= 0) {
                            valueOf = null;
                        }
                        if (valueOf == null) {
                            gapComposer.startReplaceGroup(933115521);
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(933115522);
                            int intValue = valueOf.intValue();
                            Color forTheme = ThemablesKt.forTheme(ColorModel.Background.INSTANCE, gapComposer);
                            forTheme.getClass();
                            AvatarEntry avatarEntry3 = new AvatarEntry("", forTheme.value, null, null, null, null, null, Integer.valueOf(intValue), 108);
                            gapComposer.end(false);
                            avatarEntry = avatarEntry3;
                        }
                        if (avatarEntry != null) {
                            gapComposer.startReplaceGroup(-1160696445);
                            gapComposer.end(false);
                            immutableList = Tags.toImmutableList(CollectionsKt__CollectionsKt.listOf((Object[]) new AvatarEntry[]{avatarEntry2, avatarEntry}));
                            function35 = function34;
                        } else {
                            gapComposer.startReplaceGroup(-1160608560);
                            AvatarEntry avatarEntry4 = toAvatarEntry(trio.middleAvatar, null, function34, gapComposer, i11, 1);
                            AvatarEntry avatarEntry5 = toAvatarEntry(trio.backAvatar, null, function34, gapComposer, i11, 1);
                            function35 = function34;
                            immutableList = Tags.toImmutableList(CollectionsKt__CollectionsKt.listOf((Object[]) new AvatarEntry[]{avatarEntry2, avatarEntry4, avatarEntry5}));
                            gapComposer.end(false);
                        }
                        gapComposer.end(false);
                        immutableList2 = immutableList;
                        Modifier modifier4 = modifier3;
                        zzabw.HorizontalStackedAvatars(avatarSize, immutableList2, modifier4, gapComposer, i6 & 910, 0);
                        modifier2 = modifier4;
                        function33 = function35;
                    }
                    immutableList2 = immutableList3;
                    function35 = function34;
                    Modifier modifier42 = modifier3;
                    zzabw.HorizontalStackedAvatars(avatarSize, immutableList2, modifier42, gapComposer, i6 & 910, 0);
                    modifier2 = modifier42;
                    function33 = function35;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                    endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda5(avatarSize, stackedAvatarViewModel, modifier2, function33, i, i2, 0);
                    return;
                }
                return;
            }
        } else {
            function32 = function3;
        }
        i4 = 1024;
        int i82 = i7 | i4;
        AvatarEntry avatarEntry6 = null;
        if ((i2 & 16) == 0) {
        }
        int i92 = 0;
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 9363) == 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: asAvatarImage-3IgeMak, reason: not valid java name */
    public static final AvatarImage.LocalResource m3403asAvatarImage3IgeMak(StackedAvatarViewModel.Avatar.AvatarDrawableRes avatarDrawableRes, long j, Function1 function1, Composer composer, int i) {
        avatarDrawableRes.getClass();
        int i2 = 0;
        if ((i & 2) != 0) {
            GapComposer gapComposer = (GapComposer) composer;
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new AvatarsKt$$ExternalSyntheticLambda2(i2);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            function1 = (Function1) rememberedValue;
        }
        Function1 function12 = function1;
        if (!(avatarDrawableRes instanceof StackedAvatarViewModel.Avatar.AvatarDrawableRes)) {
            throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer, -1131130558, false);
        }
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startReplaceGroup(-1131129025);
        Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
        if (colors == null) {
            colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
        } else {
            gapComposer2.startReplaceGroup(-1762997739);
            gapComposer2.end(false);
        }
        boolean z = colors.isLight;
        AvatarImage.LocalResource localResource = new AvatarImage.LocalResource(avatarDrawableRes.lightDrawableRes, j, !Color.m676equalsimpl0(j, Color.Unspecified), ContentScale.Companion.Crop, function12);
        gapComposer2.end(false);
        return localResource;
    }

    public static final AvatarOverlay toAvatarBadge(AvatarBadgeViewModel avatarBadgeViewModel, Function3 function3, Composer composer) {
        Color m;
        if (avatarBadgeViewModel instanceof AvatarBadgeViewModel.CardUrl) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(-239357871);
            AvatarOverlay.RemoteImage remoteImage = new AvatarOverlay.RemoteImage(ThemablesKt.urlForTheme(((AvatarBadgeViewModel.CardUrl) avatarBadgeViewModel).image, gapComposer), true, 0L, 0L, null, function3, 28);
            gapComposer.end(false);
            return remoteImage;
        }
        if (avatarBadgeViewModel instanceof AvatarBadgeViewModel.IconRes) {
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startReplaceGroup(-238848262);
            int i = ((AvatarBadgeViewModel.IconRes) avatarBadgeViewModel).resId;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            long j = colors.semantic.background.subtle;
            gapComposer2.startReplaceGroup(-238685761);
            gapComposer2.end(false);
            gapComposer2.startReplaceGroup(-1393171360);
            Colors colors2 = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            long j2 = colors2.semantic.icon.standard;
            gapComposer2.end(false);
            AvatarOverlay.LocalResource localResource = new AvatarOverlay.LocalResource(i, j, j2, true);
            gapComposer2.end(false);
            return localResource;
        }
        if (!(avatarBadgeViewModel instanceof AvatarBadgeViewModel.IconToken)) {
            if (!(avatarBadgeViewModel instanceof AvatarBadgeViewModel.IconUrl)) {
                throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer, -1393194155, false);
            }
            GapComposer gapComposer3 = (GapComposer) composer;
            gapComposer3.startReplaceGroup(-238241499);
            AvatarBadgeViewModel.IconUrl iconUrl = (AvatarBadgeViewModel.IconUrl) avatarBadgeViewModel;
            String urlForTheme = ThemablesKt.urlForTheme(iconUrl.image, gapComposer3);
            ColorModel colorModel = iconUrl.backgroundColor;
            if (colorModel == null) {
                gapComposer3.startReplaceGroup(-238101473);
                gapComposer3.end(false);
                m = null;
            } else {
                m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer3, -1393154014, colorModel, gapComposer3, false);
            }
            AvatarOverlay.RemoteImage remoteImage2 = new AvatarOverlay.RemoteImage(urlForTheme, true, m != null ? m.value : Color.Unspecified, 0L, null, function3, 24);
            gapComposer3.end(false);
            return remoteImage2;
        }
        GapComposer gapComposer4 = (GapComposer) composer;
        gapComposer4.startReplaceGroup(-238555777);
        int i2 = ((AvatarBadgeViewModel.IconToken) avatarBadgeViewModel).icon.drawableRes;
        gapComposer4.startReplaceGroup(-238433793);
        gapComposer4.end(false);
        gapComposer4.startReplaceGroup(-1393163042);
        StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalColors;
        Colors colors3 = (Colors) gapComposer4.consume(staticProvidableCompositionLocal2);
        if (colors3 == null) {
            colors3 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
        } else {
            gapComposer4.startReplaceGroup(-1762997739);
            gapComposer4.end(false);
        }
        long j3 = colors3.semantic.background.subtle;
        gapComposer4.end(false);
        Colors colors4 = (Colors) gapComposer4.consume(staticProvidableCompositionLocal2);
        if (colors4 == null) {
            colors4 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
        } else {
            gapComposer4.startReplaceGroup(-1762997739);
            gapComposer4.end(false);
        }
        AvatarOverlay.LocalResource localResource2 = new AvatarOverlay.LocalResource(i2, j3, colors4.semantic.icon.standard, true);
        gapComposer4.end(false);
        return localResource2;
    }

    public static final AvatarEntry toAvatarEntry(UiAvatar uiAvatar, Function3 function3, Composer composer, int i) {
        Icons icons;
        Color m;
        long j;
        long j2;
        Color m2;
        AvatarImage avatarImage;
        Color m3;
        Color m4;
        Color m5;
        Icons icons2;
        AvatarOverlay localIcon;
        long j3;
        AvatarOverlay avatarOverlay;
        AvatarOverlay avatarOverlay2;
        String str;
        Color m6;
        uiAvatar.getClass();
        Function3 avatarsKt$$ExternalSyntheticLambda0 = (i & 1) != 0 ? new AvatarsKt$$ExternalSyntheticLambda0(0) : function3;
        Icon icon = uiAvatar.icon;
        if (icon != null) {
            zzd zzdVar = Icons.Companion;
            String str2 = icon.arcade_id;
            str2.getClass();
            zzdVar.getClass();
            icons = zzd.get(str2);
        } else {
            icons = null;
        }
        com.squareup.protos.cash.ui.Color color = uiAvatar.background_color;
        if (color == null) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(817743195);
            gapComposer.end(false);
            m = null;
        } else {
            GapComposer gapComposer2 = (GapComposer) composer;
            m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer2, 1411852134, color, gapComposer2, false);
        }
        if (m != null) {
            j2 = m.value;
        } else {
            if (uiAvatar.image != null) {
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(1411855044);
                Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                } else {
                    gapComposer3.startReplaceGroup(-1762997739);
                    gapComposer3.end(false);
                }
                j = colors.semantic.background.standard;
                gapComposer3.end(false);
            } else {
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startReplaceGroup(1411856900);
                Colors colors2 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                } else {
                    gapComposer4.startReplaceGroup(-1762997739);
                    gapComposer4.end(false);
                }
                j = colors2.semantic.icon.standard;
                gapComposer4.end(false);
            }
            j2 = j;
        }
        com.squareup.protos.cash.ui.Color color2 = uiAvatar.border_color;
        if (color2 == null) {
            GapComposer gapComposer5 = (GapComposer) composer;
            gapComposer5.startReplaceGroup(817962427);
            gapComposer5.end(false);
            m2 = null;
        } else {
            GapComposer gapComposer6 = (GapComposer) composer;
            m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer6, 1411859206, color2, gapComposer6, false);
        }
        String str3 = uiAvatar.monogram_text;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = str3;
        Color color3 = new Color(j2);
        Boolean bool = uiAvatar.is_template_avatar;
        Boolean bool2 = Boolean.TRUE;
        if (!Intrinsics.areEqual(bool, bool2) && uiAvatar.image != null) {
            color3 = null;
        }
        long j4 = color3 != null ? color3.value : Color.Unspecified;
        if (uiAvatar.image != null) {
            GapComposer gapComposer7 = (GapComposer) composer;
            gapComposer7.startReplaceGroup(818310434);
            Image image = uiAvatar.image;
            image.getClass();
            String urlForTheme = ThemablesKt.urlForTheme(image, gapComposer7);
            com.squareup.protos.cash.ui.Color color4 = uiAvatar.tint_color;
            if (color4 == null) {
                gapComposer7.startReplaceGroup(818391963);
                gapComposer7.end(false);
                m6 = null;
            } else {
                m6 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer7, 1411873062, color4, gapComposer7, false);
            }
            AvatarImage.Remote.Image image2 = new AvatarImage.Remote.Image(urlForTheme, Intrinsics.areEqual(uiAvatar.is_template_avatar, bool2), null, m6 != null ? m6.value : Color.Unspecified, avatarsKt$$ExternalSyntheticLambda0, 44);
            gapComposer7.end(false);
            avatarImage = image2;
        } else if (icons != null) {
            GapComposer gapComposer8 = (GapComposer) composer;
            gapComposer8.startReplaceGroup(1411879319);
            com.squareup.protos.cash.ui.Color color5 = uiAvatar.tint_color;
            if (color5 == null) {
                gapComposer8.startReplaceGroup(818659803);
                gapComposer8.end(false);
                m3 = null;
            } else {
                m3 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer8, 1411881702, color5, gapComposer8, false);
            }
            AvatarImage.LocalIcon localIcon2 = new AvatarImage.LocalIcon(icons, m3 != null ? m3.value : AvatarImage.Remote.Defaults.tintColor, 4);
            gapComposer8.end(false);
            avatarImage = localIcon2;
        } else {
            GapComposer gapComposer9 = (GapComposer) composer;
            gapComposer9.startReplaceGroup(818721121);
            gapComposer9.end(false);
            avatarImage = null;
        }
        String str5 = uiAvatar.accessibility_value;
        GapComposer gapComposer10 = (GapComposer) composer;
        gapComposer10.startReplaceGroup(1411887187);
        com.squareup.protos.cash.ui.Color color6 = uiAvatar.badge_background_color;
        if (color6 == null) {
            gapComposer10.startReplaceGroup(586877893);
            gapComposer10.end(false);
            m4 = null;
        } else {
            m4 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer10, -950899780, color6, gapComposer10, false);
        }
        if (m4 == null) {
            gapComposer10.startReplaceGroup(586948604);
            gapComposer10.end(false);
            m5 = null;
        } else {
            gapComposer10.startReplaceGroup(586948605);
            long j5 = m4.value;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors3 = (Colors) gapComposer10.consume(staticProvidableCompositionLocal);
            if (colors3 == null) {
                colors3 = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
            } else {
                gapComposer10.startReplaceGroup(-1762997739);
                gapComposer10.end(false);
            }
            long j6 = colors3.semantic.icon.standard;
            Colors colors4 = (Colors) gapComposer10.consume(staticProvidableCompositionLocal);
            if (colors4 == null) {
                colors4 = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
            } else {
                gapComposer10.startReplaceGroup(-1762997739);
                gapComposer10.end(false);
            }
            m5 = Recorder$$ExternalSyntheticOutline1.m(gapComposer10, false, ColorsKt.m3988contrastAdjustedColorysEtTa8(j6, colors4.semantic.icon.inverse, j5));
        }
        long j7 = m5 != null ? m5.value : Color.Unspecified;
        Icon icon2 = uiAvatar.badge_icon;
        if (icon2 == null || (str = icon2.arcade_id) == null) {
            icons2 = null;
        } else {
            Icons.Companion.getClass();
            icons2 = zzd.get(str);
        }
        if (icons2 == null) {
            gapComposer10.startReplaceGroup(587294719);
            gapComposer10.end(false);
            localIcon = null;
        } else {
            gapComposer10.startReplaceGroup(587294720);
            if (m4 == null) {
                gapComposer10.startReplaceGroup(-853731075);
                Colors colors5 = (Colors) gapComposer10.consume(ArcadeThemeKt.LocalColors);
                if (colors5 == null) {
                    colors5 = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
                } else {
                    gapComposer10.startReplaceGroup(-1762997739);
                    gapComposer10.end(false);
                }
                j3 = colors5.semantic.background.subtle;
                gapComposer10.end(false);
            } else {
                gapComposer10.startReplaceGroup(-853732780);
                gapComposer10.end(false);
                j3 = m4.value;
            }
            localIcon = new AvatarOverlay.LocalIcon(8, j3, j7, icons2);
            gapComposer10.end(false);
        }
        if (localIcon == null) {
            gapComposer10.startReplaceGroup(587560514);
            Image image3 = uiAvatar.badge_image;
            if (image3 == null) {
                gapComposer10.startReplaceGroup(587560513);
                gapComposer10.end(false);
                avatarOverlay2 = null;
            } else {
                gapComposer10.startReplaceGroup(587560514);
                AvatarOverlay remoteImage = new AvatarOverlay.RemoteImage(ThemablesKt.urlForTheme(image3, gapComposer10), false, m4 != null ? m4.value : Color.Unspecified, 0L, null, avatarsKt$$ExternalSyntheticLambda0, 24);
                gapComposer10.end(false);
                avatarOverlay2 = remoteImage;
            }
            gapComposer10.end(false);
            avatarOverlay = avatarOverlay2;
        } else {
            gapComposer10.startReplaceGroup(-950888362);
            gapComposer10.end(false);
            avatarOverlay = localIcon;
        }
        gapComposer10.end(false);
        return new AvatarEntry(str4, j4, null, avatarImage, str5, avatarOverlay, m2, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x026d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final AvatarEntry toAvatarEntry(StackedAvatarViewModel.Avatar avatar, AvatarBadgeViewModel avatarBadgeViewModel, Function3 function3, Composer composer, int i, int i2) {
        Color m;
        long j;
        Color m2;
        Color m3;
        Icons icons;
        long j2;
        String str;
        AvatarOverlay avatarOverlay;
        String str2;
        Color color;
        AvatarImage avatarImage;
        long j3;
        ColorModel colorModel;
        avatar.getClass();
        AvatarBadgeViewModel avatarBadgeViewModel2 = (i2 & 1) != 0 ? null : avatarBadgeViewModel;
        Function3 avatarsKt$$ExternalSyntheticLambda0 = (i2 & 2) != 0 ? new AvatarsKt$$ExternalSyntheticLambda0(0) : function3;
        ColorModel colorModel2 = avatar.transformTintColor;
        Icon icon = avatar.localArcadeIcon;
        ColorModel colorModel3 = avatar.placeholderFillColor;
        String str3 = avatar.monogramText;
        Character ch = avatar.character;
        Image image = avatar.remoteImage;
        StackedAvatarViewModel.Avatar.AvatarDrawableRes avatarDrawableRes = avatar.localImage;
        if (colorModel2 == null) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(-109275649);
            gapComposer.end(false);
            m = null;
        } else {
            GapComposer gapComposer2 = (GapComposer) composer;
            m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer2, -1111903678, colorModel2, gapComposer2, false);
        }
        if (m != null) {
            j = m.value;
        } else {
            j = Color.Unspecified;
        }
        ColorModel colorModel4 = avatar.placeholderTintColor;
        if (colorModel4 == null) {
            GapComposer gapComposer3 = (GapComposer) composer;
            gapComposer3.startReplaceGroup(-109193313);
            gapComposer3.end(false);
            m2 = null;
        } else {
            GapComposer gapComposer4 = (GapComposer) composer;
            m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer4, -1111901022, colorModel4, gapComposer4, false);
        }
        GapComposer gapComposer5 = (GapComposer) composer;
        Object rememberedValue = gapComposer5.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer5.updateRememberedValue(rememberedValue);
        }
        if (((Boolean) ((MutableState) rememberedValue).getValue()).booleanValue()) {
            gapComposer5.startReplaceGroup(-109040544);
            if (colorModel3 == null) {
                gapComposer5.startReplaceGroup(-109040545);
                gapComposer5.end(false);
                m3 = null;
            } else {
                m3 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer5, -1111896094, colorModel3, gapComposer5, false);
            }
            gapComposer5.end(false);
        } else if (icon != null || avatarDrawableRes != null || image != null) {
            gapComposer5.startReplaceGroup(-108922496);
            ColorModel colorModel5 = avatar.transformFillColor;
            if (colorModel5 == null) {
                gapComposer5.startReplaceGroup(-108922497);
                gapComposer5.end(false);
                m3 = null;
            } else {
                m3 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer5, -1111892286, colorModel5, gapComposer5, false);
            }
            gapComposer5.end(false);
        } else if (ch == null && str3 == null) {
            gapComposer5.startReplaceGroup(-108711200);
            if (colorModel3 == null) {
                gapComposer5.startReplaceGroup(-108711201);
                gapComposer5.end(false);
                m3 = null;
            } else {
                m3 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer5, -1111885470, colorModel3, gapComposer5, false);
            }
            gapComposer5.end(false);
        } else {
            gapComposer5.startReplaceGroup(-108660608);
            ColorModel colorModel6 = avatar.backgroundColor;
            if (colorModel6 == null) {
                gapComposer5.startReplaceGroup(-108660609);
                gapComposer5.end(false);
                m3 = null;
            } else {
                m3 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer5, -1111883838, colorModel6, gapComposer5, false);
            }
            gapComposer5.end(false);
        }
        if (icon != null) {
            zzd zzdVar = Icons.Companion;
            String str4 = icon.arcade_id;
            str4.getClass();
            zzdVar.getClass();
            icons = zzd.get(str4);
        } else {
            icons = null;
        }
        gapComposer5.startReplaceGroup(-108506973);
        gapComposer5.end(false);
        if (avatarBadgeViewModel2 == null) {
            if (avatar.isSponsorAllowlisted) {
                avatarBadgeViewModel2 = new AvatarBadgeViewModel.IconToken(Icons.SecurityCheckFill24);
            } else {
                avatarBadgeViewModel2 = avatar.isFavorite ? new AvatarBadgeViewModel.IconToken(Icons.FavoriteFill24) : null;
            }
        }
        if (m3 == null) {
            gapComposer5.startReplaceGroup(-1111860838);
            Color forTheme = ThemablesKt.forTheme(ColorModel.Background.INSTANCE, gapComposer5);
            forTheme.getClass();
            j2 = forTheme.value;
            gapComposer5.end(false);
        } else {
            gapComposer5.startReplaceGroup(-1111861427);
            gapComposer5.end(false);
            j2 = m3.value;
        }
        long j4 = j2;
        if (str3 == null) {
            String valueOf = ch != null ? String.valueOf(ch.charValue()) : null;
            if (valueOf == null) {
                valueOf = "";
            }
            str = valueOf;
        } else {
            str = str3;
        }
        String str5 = avatar.contentDescription;
        if (avatarBadgeViewModel2 == null) {
            gapComposer5.startReplaceGroup(-107771281);
            gapComposer5.end(false);
            avatarOverlay = null;
        } else {
            gapComposer5.startReplaceGroup(-1111855150);
            AvatarOverlay avatarBadge = toAvatarBadge(avatarBadgeViewModel2, avatarsKt$$ExternalSyntheticLambda0, gapComposer5);
            gapComposer5.end(false);
            avatarOverlay = avatarBadge;
        }
        if (avatarDrawableRes != null) {
            gapComposer5.startReplaceGroup(-107671150);
            gapComposer5.startReplaceGroup(-1111851920);
            AvatarImage.LocalResource m3403asAvatarImage3IgeMak = m3403asAvatarImage3IgeMak(avatarDrawableRes, j, null, gapComposer5, 2);
            gapComposer5.end(false);
            gapComposer5.end(false);
            avatarImage = m3403asAvatarImage3IgeMak;
        } else if (icons != null) {
            gapComposer5.startReplaceGroup(-1111849782);
            gapComposer5.end(false);
            avatarImage = new AvatarImage.LocalIcon(icons, j, 4);
        } else {
            if (image != null) {
                gapComposer5.startReplaceGroup(-107486204);
                str2 = str5;
                color = null;
                AvatarImage.Remote.Image image2 = new AvatarImage.Remote.Image(ThemablesKt.urlForTheme(image, gapComposer5), !Color.m676equalsimpl0(j, Color.Unspecified), null, j, avatarsKt$$ExternalSyntheticLambda0, 32);
                gapComposer5.end(false);
                avatarImage = image2;
            } else {
                str2 = str5;
                color = null;
                if (ch == null && str3 == null) {
                    gapComposer5.startReplaceGroup(-107087761);
                    Icons icons2 = Icons.AvatarFill24;
                    if (m2 == null) {
                        gapComposer5.startReplaceGroup(-1111826304);
                        Colors colors = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                        } else {
                            gapComposer5.startReplaceGroup(-1762997739);
                            gapComposer5.end(false);
                        }
                        j3 = colors.semantic.icon.standard;
                        gapComposer5.end(false);
                    } else {
                        gapComposer5.startReplaceGroup(-1111828071);
                        gapComposer5.end(false);
                        j3 = m2.value;
                    }
                    AvatarImage.LocalIcon localIcon = new AvatarImage.LocalIcon(icons2, j3, 4);
                    gapComposer5.end(false);
                    avatarImage = localIcon;
                } else {
                    gapComposer5.startReplaceGroup(-106828571);
                    gapComposer5.end(false);
                    avatarImage = null;
                }
            }
            colorModel = avatar.borderColor;
            if (colorModel != null) {
                gapComposer5.startReplaceGroup(-106783745);
                gapComposer5.end(false);
            } else {
                color = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer5, -1111823294, colorModel, gapComposer5, false);
            }
            return new AvatarEntry(str, j4, null, avatarImage, str2, avatarOverlay, color, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE);
        }
        str2 = str5;
        color = null;
        colorModel = avatar.borderColor;
        if (colorModel != null) {
        }
        return new AvatarEntry(str, j4, null, avatarImage, str2, avatarOverlay, color, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE);
    }

    public static final AvatarEntry toAvatarEntry(AvatarViewModel avatarViewModel, Composer composer) {
        long j;
        Color color;
        Color color2;
        AvatarImage avatarImage;
        long j2;
        AvatarsKt$$ExternalSyntheticLambda0 avatarsKt$$ExternalSyntheticLambda0 = new AvatarsKt$$ExternalSyntheticLambda0(0);
        boolean z = avatarViewModel.colorizeAvatar;
        Integer num = avatarViewModel.photoRes;
        if (z) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(1166731398);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            j = colors.semantic.icon.standard;
            gapComposer.end(false);
        } else {
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startReplaceGroup(1166732041);
            gapComposer2.end(false);
            j = Color.Unspecified;
        }
        String str = avatarViewModel.displayName;
        AvatarOverlay avatarOverlay = null;
        Character monogram = str != null ? GrpcStatus.Companion.monogram(str) : null;
        if (avatarViewModel.fillBackground) {
            GapComposer gapComposer3 = (GapComposer) composer;
            gapComposer3.startReplaceGroup(1809078874);
            ColorModel colorModel = avatarViewModel.accentColor;
            if (colorModel == null) {
                gapComposer3.startReplaceGroup(1809078873);
                gapComposer3.end(false);
                color = null;
            } else {
                color = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer3, 1166736040, colorModel, gapComposer3, false);
            }
            gapComposer3.end(false);
        } else if (num == null && GrpcStatus.Companion.getImage(avatarViewModel) == null && monogram == null) {
            GapComposer gapComposer4 = (GapComposer) composer;
            gapComposer4.startReplaceGroup(1166739908);
            Colors colors2 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
            } else {
                gapComposer4.startReplaceGroup(-1762997739);
                gapComposer4.end(false);
            }
            color = Recorder$$ExternalSyntheticOutline1.m(gapComposer4, false, colors2.semantic.background.subtle);
        } else {
            GapComposer gapComposer5 = (GapComposer) composer;
            gapComposer5.startReplaceGroup(1809219551);
            gapComposer5.end(false);
            color = null;
        }
        Image image = GrpcStatus.Companion.getImage(avatarViewModel);
        if (num != null) {
            GapComposer gapComposer6 = (GapComposer) composer;
            gapComposer6.startReplaceGroup(1809376908);
            StackedAvatarViewModel.Avatar.AvatarDrawableRes avatarDrawableRes = new StackedAvatarViewModel.Avatar.AvatarDrawableRes(num.intValue(), true, 0);
            gapComposer6.startReplaceGroup(1166745654);
            AvatarImage.LocalResource m3403asAvatarImage3IgeMak = m3403asAvatarImage3IgeMak(avatarDrawableRes, j, null, gapComposer6, 2);
            gapComposer6.end(false);
            gapComposer6.end(false);
            avatarImage = m3403asAvatarImage3IgeMak;
            color2 = color;
        } else if (image != null) {
            GapComposer gapComposer7 = (GapComposer) composer;
            gapComposer7.startReplaceGroup(1809464328);
            color2 = color;
            AvatarImage.Remote.Image image2 = new AvatarImage.Remote.Image(ThemablesKt.urlForTheme(image, gapComposer7), avatarViewModel.colorizeAvatar, null, j, avatarsKt$$ExternalSyntheticLambda0, 36);
            gapComposer7.end(false);
            avatarImage = image2;
        } else {
            color2 = color;
            if (monogram == null) {
                GapComposer gapComposer8 = (GapComposer) composer;
                gapComposer8.startReplaceGroup(1809710189);
                Icons icons = Icons.AvatarFill24;
                Colors colors3 = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                } else {
                    gapComposer8.startReplaceGroup(-1762997739);
                    gapComposer8.end(false);
                }
                AvatarImage.LocalIcon localIcon = new AvatarImage.LocalIcon(icons, colors3.semantic.icon.standard, 4);
                gapComposer8.end(false);
                avatarImage = localIcon;
            } else {
                GapComposer gapComposer9 = (GapComposer) composer;
                gapComposer9.startReplaceGroup(1809932799);
                gapComposer9.end(false);
                avatarImage = null;
            }
        }
        AvatarBadgeViewModel avatarBadgeViewModel = avatarViewModel.badge;
        if (avatarBadgeViewModel == null) {
            if (avatarViewModel.isSponsorAllowlisted) {
                avatarBadgeViewModel = new AvatarBadgeViewModel.IconToken(Icons.SecurityCheckFill24);
            } else {
                avatarBadgeViewModel = avatarViewModel.isFavorite ? new AvatarBadgeViewModel.IconToken(Icons.FavoriteFill24) : null;
            }
        }
        GapComposer gapComposer10 = (GapComposer) composer;
        if (color2 == null) {
            gapComposer10.startReplaceGroup(1166774496);
            Color forTheme = ThemablesKt.forTheme(ColorModel.Background.INSTANCE, gapComposer10);
            forTheme.getClass();
            j2 = forTheme.value;
            gapComposer10.end(false);
        } else {
            gapComposer10.startReplaceGroup(1166773907);
            gapComposer10.end(false);
            j2 = color2.value;
        }
        long j3 = j2;
        String valueOf = monogram != null ? String.valueOf(monogram.charValue()) : null;
        if (valueOf == null) {
            valueOf = "";
        }
        String str2 = valueOf;
        String str3 = avatarViewModel.displayName;
        if (avatarBadgeViewModel == null) {
            GapComposer gapComposer11 = (GapComposer) composer;
            gapComposer11.startReplaceGroup(1810418569);
            gapComposer11.end(false);
        } else {
            GapComposer gapComposer12 = (GapComposer) composer;
            gapComposer12.startReplaceGroup(1166779256);
            avatarOverlay = toAvatarBadge(avatarBadgeViewModel, avatarsKt$$ExternalSyntheticLambda0, gapComposer12);
            gapComposer12.end(false);
        }
        return new AvatarEntry(str2, j3, null, avatarImage, str3, avatarOverlay, null, null, EnumC0170g.SDK_ASSET_ICON_ARROW_DOWN_VALUE);
    }
}
