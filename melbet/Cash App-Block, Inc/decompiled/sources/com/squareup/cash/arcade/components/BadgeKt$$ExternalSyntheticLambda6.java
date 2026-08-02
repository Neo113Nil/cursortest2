package com.squareup.cash.arcade.components;

import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import com.squareup.cash.arcade.components.Badge;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class BadgeKt$$ExternalSyntheticLambda6 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ TextStyle f$1;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ Modifier f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ BadgeKt$$ExternalSyntheticLambda6(Badge.Large large, TextStyle textStyle, float f, Modifier modifier, int i) {
        this.f$0 = large;
        this.f$1 = textStyle;
        this.f$2 = f;
        this.f$3 = modifier;
        this.f$4 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                Room.m1161BadgeLargeBase942rkJo((Badge.Large) obj3, this.f$1, this.f$2, this.f$3, (Composer) obj, Updater.updateChangedFlags(this.f$4 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(1);
                PagerKt.m329ThinkingTexthGBTI10((String) obj3, this.f$3, this.f$1, this.f$2, this.f$4, (Composer) obj, updateChangedFlags);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ BadgeKt$$ExternalSyntheticLambda6(String str, Modifier modifier, TextStyle textStyle, float f, int i, int i2) {
        this.f$0 = str;
        this.f$3 = modifier;
        this.f$1 = textStyle;
        this.f$2 = f;
        this.f$4 = i;
    }
}
