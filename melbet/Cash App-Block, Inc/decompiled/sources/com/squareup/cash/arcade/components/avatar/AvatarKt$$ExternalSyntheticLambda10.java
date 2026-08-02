package com.squareup.cash.arcade.components.avatar;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.moneybot.genie.TextViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class AvatarKt$$ExternalSyntheticLambda10 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ AvatarImage f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ AvatarSizeImpl f$2;
    public final /* synthetic */ long f$3;

    public /* synthetic */ AvatarKt$$ExternalSyntheticLambda10(AvatarImage avatarImage, String str, AvatarSizeImpl avatarSizeImpl, long j) {
        this.f$0 = avatarImage;
        this.f$1 = str;
        this.f$2 = avatarSizeImpl;
        this.f$3 = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    AvatarImage avatarImage = this.f$0;
                    AvatarImage.Remote remote = avatarImage instanceof AvatarImage.Remote ? (AvatarImage.Remote) avatarImage : null;
                    TextViewKt.m3621PlaceholderOrMonogramBx497Mc(remote != null ? remote.getPlaceholder$1() : null, this.f$1, this.f$2, this.f$3, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                TextViewKt.m3621PlaceholderOrMonogramBx497Mc(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AvatarKt$$ExternalSyntheticLambda10(AvatarImage avatarImage, String str, AvatarSizeImpl avatarSizeImpl, long j, int i) {
        this.f$0 = avatarImage;
        this.f$1 = str;
        this.f$2 = avatarSizeImpl;
        this.f$3 = j;
    }
}
