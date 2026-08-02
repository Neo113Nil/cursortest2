package com.squareup.cash.arcade.treehouse;

import androidx.camera.video.internal.config.AudioConfigUtil;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import app.cash.arcade.values.ArcadeAvatarSizes;
import app.cash.arcade.values.AvatarSize;
import app.cash.arcade.viewmodels.AvatarBadgeViewModel;
import app.cash.arcade.viewmodels.AvatarViewModel;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.arcade.components.avatar.DiagonalAvatarValues;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.moneybot.genie.TextViewKt;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class ArcadeAvatarBinding$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ArcadeAvatarBinding f$0;

    public /* synthetic */ ArcadeAvatarBinding$$ExternalSyntheticLambda0(ArcadeAvatarBinding arcadeAvatarBinding, int i) {
        this.$r8$classId = 1;
        this.f$0 = arcadeAvatarBinding;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = 2;
        final ArcadeAvatarBinding arcadeAvatarBinding = this.f$0;
        final byte b = 0;
        final int i3 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(549112880, new ArcadeAvatarBinding$$ExternalSyntheticLambda0(arcadeAvatarBinding, i2, b), gapComposer), gapComposer, 3072, 7);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                arcadeAvatarBinding.Content((Composer) obj, Updater.updateChangedFlags(1));
                break;
            default:
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = arcadeAvatarBinding.size$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = arcadeAvatarBinding.onClick$delegate;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    SnapshotStateList snapshotStateList = arcadeAvatarBinding.avatars;
                    int size = snapshotStateList.size();
                    Modifier modifier = Modifier.Companion.$$INSTANCE;
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (size == 1) {
                        gapComposer2.startReplaceGroup(-908560103);
                        AvatarViewModel avatarViewModel = (AvatarViewModel) CollectionsKt.single((List) snapshotStateList);
                        if (((Function0) parcelableSnapshotMutableState2.getValue()) != null) {
                            gapComposer2.startReplaceGroup(-908407397);
                            boolean changed = gapComposer2.changed(arcadeAvatarBinding);
                            Object rememberedValue = gapComposer2.rememberedValue();
                            if (changed || rememberedValue == neverEqualPolicy) {
                                rememberedValue = new Function0() { // from class: com.squareup.cash.arcade.treehouse.ArcadeAvatarBinding$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i4 = b;
                                        ArcadeAvatarBinding arcadeAvatarBinding2 = arcadeAvatarBinding;
                                        switch (i4) {
                                            case 0:
                                                Function0 function0 = (Function0) arcadeAvatarBinding2.onClick$delegate.getValue();
                                                if (function0 != null) {
                                                    function0.invoke();
                                                }
                                                break;
                                            default:
                                                Function0 function02 = (Function0) arcadeAvatarBinding2.onClick$delegate.getValue();
                                                if (function02 != null) {
                                                    function02.invoke();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                gapComposer2.updateRememberedValue(rememberedValue);
                            }
                            modifier = ArcadeAvatarBinding.clickableWithUnboundedRipple((Function0) rememberedValue, gapComposer2);
                            gapComposer2.end(false);
                        } else {
                            gapComposer2.startReplaceGroup(-908285319);
                            gapComposer2.end(false);
                        }
                        Modifier modifier2 = modifier;
                        AvatarSize avatarSize = (AvatarSize) parcelableSnapshotMutableState.getValue();
                        TextViewKt.Avatar(Intrinsics.areEqual(avatarSize, ArcadeAvatarSizes.size48) ? com.squareup.cash.arcade.components.avatar.AvatarSize.Size48 : Intrinsics.areEqual(avatarSize, ArcadeAvatarSizes.size64) ? com.squareup.cash.arcade.components.avatar.AvatarSize.Size64 : com.squareup.cash.arcade.components.avatar.AvatarSize.Size48, ArcadeAvatarBinding.rememberAvatarEntry(avatarViewModel, (AvatarBadgeViewModel) arcadeAvatarBinding.badge$delegate.getValue(), gapComposer2, 0), modifier2, false, gapComposer2, 0, 24);
                        gapComposer2.end(false);
                    } else if (size != 2) {
                        gapComposer2.startReplaceGroup(-583464296);
                        gapComposer2.end(false);
                        a$$ExternalSyntheticBUOutline0.m("Only 1 or 2 avatars are supported");
                        break;
                    } else {
                        gapComposer2.startReplaceGroup(-908041938);
                        AvatarViewModel avatarViewModel2 = (AvatarViewModel) snapshotStateList.get(0);
                        AvatarViewModel avatarViewModel3 = (AvatarViewModel) snapshotStateList.get(1);
                        if (((Function0) parcelableSnapshotMutableState2.getValue()) != null) {
                            gapComposer2.startReplaceGroup(-907915489);
                            boolean changed2 = gapComposer2.changed(arcadeAvatarBinding);
                            Object rememberedValue2 = gapComposer2.rememberedValue();
                            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                                rememberedValue2 = new Function0() { // from class: com.squareup.cash.arcade.treehouse.ArcadeAvatarBinding$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i4 = i3;
                                        ArcadeAvatarBinding arcadeAvatarBinding2 = arcadeAvatarBinding;
                                        switch (i4) {
                                            case 0:
                                                Function0 function0 = (Function0) arcadeAvatarBinding2.onClick$delegate.getValue();
                                                if (function0 != null) {
                                                    function0.invoke();
                                                }
                                                break;
                                            default:
                                                Function0 function02 = (Function0) arcadeAvatarBinding2.onClick$delegate.getValue();
                                                if (function02 != null) {
                                                    function02.invoke();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                gapComposer2.updateRememberedValue(rememberedValue2);
                            }
                            modifier = ArcadeAvatarBinding.clickableWithUnboundedRipple((Function0) rememberedValue2, gapComposer2);
                            gapComposer2.end(false);
                        } else {
                            gapComposer2.startReplaceGroup(-907797379);
                            gapComposer2.end(false);
                        }
                        Modifier modifier3 = modifier;
                        AvatarSize avatarSize2 = (AvatarSize) parcelableSnapshotMutableState.getValue();
                        AudioConfigUtil.DiagonalStackedAvatars(Intrinsics.areEqual(avatarSize2, ArcadeAvatarSizes.size48) ? DiagonalAvatarValues.Size48 : Intrinsics.areEqual(avatarSize2, ArcadeAvatarSizes.size64) ? DiagonalAvatarValues.Size64 : DiagonalAvatarValues.Size48, ArcadeAvatarBinding.rememberAvatarEntry(avatarViewModel3, null, gapComposer2, 2), ArcadeAvatarBinding.rememberAvatarEntry(avatarViewModel2, null, gapComposer2, 2), modifier3, gapComposer2, 0, 0);
                        gapComposer2.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ArcadeAvatarBinding$$ExternalSyntheticLambda0(ArcadeAvatarBinding arcadeAvatarBinding, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = arcadeAvatarBinding;
    }
}
