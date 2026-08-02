package com.squareup.cash.card.onboarding;

import android.content.SharedPreferences;
import androidx.room.Room;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class PdpNotifiedPreference$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SharedPreferences f$0;

    public /* synthetic */ PdpNotifiedPreference$$ExternalSyntheticLambda0(SharedPreferences sharedPreferences, int i) {
        this.$r8$classId = i;
        this.f$0 = sharedPreferences;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        SharedPreferences sharedPreferences = this.f$0;
        String str = (String) obj;
        switch (i) {
            case 0:
                str.getClass();
                return Room.BooleanKeyValue(sharedPreferences, "hype_pdp_notified_".concat(str), false, false);
            default:
                str.getClass();
                return Room.BooleanKeyValue(sharedPreferences, "hype_pdp_dismissed_".concat(str), false, false);
        }
    }
}
