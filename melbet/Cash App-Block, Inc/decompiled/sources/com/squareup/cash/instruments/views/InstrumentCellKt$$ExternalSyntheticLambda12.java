package com.squareup.cash.instruments.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class InstrumentCellKt$$ExternalSyntheticLambda12 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ List f$1;
    public final /* synthetic */ AvatarSize f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ InstrumentCellKt$$ExternalSyntheticLambda12(Modifier modifier, List list, AvatarSize avatarSize, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = modifier;
        this.f$1 = list;
        this.f$2 = avatarSize;
        this.f$3 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                InstrumentCellKt.CircleAvatars(this.f$0, this.f$1, this.f$2, composer, Updater.updateChangedFlags(this.f$3 | 1));
                break;
            default:
                InstrumentCellKt.CardArtImages(this.f$0, this.f$1, this.f$2, composer, Updater.updateChangedFlags(this.f$3 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
