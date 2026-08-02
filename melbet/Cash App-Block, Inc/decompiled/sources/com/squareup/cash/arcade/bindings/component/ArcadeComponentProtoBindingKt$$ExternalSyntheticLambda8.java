package com.squareup.cash.arcade.bindings.component;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.protos.franklin.ui.UiAvatar;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import squareup.cash.ui.arcade.elements.CellDefault;

/* loaded from: classes5.dex */
public final /* synthetic */ class ArcadeComponentProtoBindingKt$$ExternalSyntheticLambda8 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CellDefault.CellDefaultIcon f$0;

    public /* synthetic */ ArcadeComponentProtoBindingKt$$ExternalSyntheticLambda8(CellDefault.CellDefaultIcon cellDefaultIcon, int i) {
        this.$r8$classId = i;
        this.f$0 = cellDefaultIcon;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        UiAvatar uiAvatar;
        int i = this.$r8$classId;
        UiAvatar uiAvatar2 = null;
        CellDefault.CellDefaultIcon cellDefaultIcon = this.f$0;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    CellDefault.CellDefaultIcon.IconStyle iconStyle = cellDefaultIcon.icon_style;
                    if (iconStyle != null) {
                        CellDefault.CellDefaultIcon.IconStyle.Avatar avatar = iconStyle instanceof CellDefault.CellDefaultIcon.IconStyle.Avatar ? (CellDefault.CellDefaultIcon.IconStyle.Avatar) iconStyle : null;
                        if (avatar != null) {
                            uiAvatar2 = avatar.getValue();
                        }
                    }
                    uiAvatar2.getClass();
                    ArcadeComponentProtoBindingKt.AvatarIcon(uiAvatar2, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    AvatarSize avatarSize = AvatarSize.Size48;
                    CellDefault.CellDefaultIcon.IconStyle iconStyle2 = cellDefaultIcon.icon_style;
                    if (iconStyle2 != null) {
                        CellDefault.CellDefaultIcon.IconStyle.Avatar avatar2 = iconStyle2 instanceof CellDefault.CellDefaultIcon.IconStyle.Avatar ? (CellDefault.CellDefaultIcon.IconStyle.Avatar) iconStyle2 : null;
                        if (avatar2 != null) {
                            uiAvatar = avatar2.getValue();
                            uiAvatar.getClass();
                            TextViewKt.Avatar(avatarSize, AvatarsKt.toAvatarEntry(uiAvatar, null, gapComposer2, 1), null, false, gapComposer2, 6, 28);
                        }
                    }
                    uiAvatar = null;
                    uiAvatar.getClass();
                    TextViewKt.Avatar(avatarSize, AvatarsKt.toAvatarEntry(uiAvatar, null, gapComposer2, 1), null, false, gapComposer2, 6, 28);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
