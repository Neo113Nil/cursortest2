package com.squareup.cash.arcade.components.avatar;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.moneybot.genie.TextViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class AvatarKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ int f$0;
    public final /* synthetic */ AvatarSizeImpl f$1;

    public /* synthetic */ AvatarKt$$ExternalSyntheticLambda3(int i, AvatarSizeImpl avatarSizeImpl) {
        this.f$0 = i;
        this.f$1 = avatarSizeImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        AvatarSizeImpl avatarSizeImpl = this.f$1;
        int i2 = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    TextViewKt.CounterAvatar(i2, avatarSizeImpl, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                TextViewKt.CounterAvatar(i2, avatarSizeImpl, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AvatarKt$$ExternalSyntheticLambda3(int i, AvatarSizeImpl avatarSizeImpl, int i2) {
        this.f$0 = i;
        this.f$1 = avatarSizeImpl;
    }
}
