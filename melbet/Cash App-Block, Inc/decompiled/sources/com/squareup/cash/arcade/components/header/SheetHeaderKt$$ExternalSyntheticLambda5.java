package com.squareup.cash.arcade.components.header;

import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.moneybot.views.chat.EmptyChatKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class SheetHeaderKt$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Modifier f$1;
    public final /* synthetic */ Function2 f$2;
    public final /* synthetic */ String f$3;
    public final /* synthetic */ int f$4;
    public final /* synthetic */ int f$5;

    public /* synthetic */ SheetHeaderKt$$ExternalSyntheticLambda5(String str, Modifier modifier, Function2 function2, String str2, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = str;
        this.f$1 = modifier;
        this.f$2 = function2;
        this.f$3 = str2;
        this.f$4 = i;
        this.f$5 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                Transformations.SheetHeader(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, Updater.updateChangedFlags(this.f$4 | 1), this.f$5);
                break;
            default:
                ((Integer) obj2).getClass();
                EmptyChatKt.ProfileHeader(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, Updater.updateChangedFlags(this.f$4 | 1), this.f$5);
                break;
        }
        return Unit.INSTANCE;
    }
}
