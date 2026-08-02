package com.squareup.cash.borrow.views;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.room.Room;
import androidx.tracing.Trace;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.moneybot.genie.TextViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class BulletinInfoOverlayKt$$ExternalSyntheticLambda20 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Icons f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ BulletinInfoOverlayKt$$ExternalSyntheticLambda20(Icons icons, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = icons;
        this.f$1 = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Icons icons = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(this.f$0, (String) null, SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo231toDpGaN1DYA(Room.getSp(24))), this.f$1, gapComposer, 48, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    TextViewKt.m3613AvatarB_rZmmc(AvatarSize.Size64, "", this.f$1, (String) null, (Modifier) null, (AvatarImage) new AvatarImage.LocalIcon(icons, 0L, 6), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer2, 3126, 0, 2000);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    TextViewKt.m3613AvatarB_rZmmc(AvatarSize.Size64, "", this.f$1, (String) null, (Modifier) null, (AvatarImage) new AvatarImage.LocalIcon(icons, 0L, 6), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer3, 3126, 0, 2000);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            default:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    TextViewKt.m3613AvatarB_rZmmc(AvatarSize.Size64, "", this.f$1, (String) null, (Modifier) null, (AvatarImage) new AvatarImage.LocalIcon(icons, 0L, 6), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer4, 3126, 0, 2000);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
