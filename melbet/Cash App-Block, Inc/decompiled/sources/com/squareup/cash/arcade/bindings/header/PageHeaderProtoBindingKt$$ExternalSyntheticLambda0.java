package com.squareup.cash.arcade.bindings.header;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.arcade.bindings.component.ArcadeComponentProtoBindingKt;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.protos.franklin.ui.UiAvatar;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class PageHeaderProtoBindingKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ UiAvatar f$0;

    public /* synthetic */ PageHeaderProtoBindingKt$$ExternalSyntheticLambda0(UiAvatar uiAvatar, int i) {
        this.$r8$classId = i;
        this.f$0 = uiAvatar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        UiAvatar uiAvatar = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    TextViewKt.Avatar(AvatarSize.Size64, AvatarsKt.toAvatarEntry(uiAvatar, null, gapComposer, 1), null, false, gapComposer, 6, 28);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                int intValue2 = num.intValue();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ArcadeComponentProtoBindingKt.PageHeaderAvatar(uiAvatar, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                num.getClass();
                ArcadeComponentProtoBindingKt.PageHeaderAvatar(uiAvatar, composer, Updater.updateChangedFlags(1));
                break;
            default:
                num.getClass();
                ArcadeComponentProtoBindingKt.AvatarIcon(uiAvatar, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ PageHeaderProtoBindingKt$$ExternalSyntheticLambda0(UiAvatar uiAvatar, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = uiAvatar;
    }
}
