package com.braze;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class Braze$$ExternalSyntheticLambda33 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Braze f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ Braze$$ExternalSyntheticLambda33(String str, Braze braze, String str2) {
        this.$r8$classId = 2;
        this.f$0 = str;
        this.f$2 = str2;
        this.f$1 = braze;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit changeUser$lambda$1;
        Unit addSerializedCardJsonToStorage$lambda$1;
        Unit logPushStoryPageClicked$lambda$1;
        int i = this.$r8$classId;
        Braze braze = this.f$1;
        String str = this.f$2;
        String str2 = this.f$0;
        switch (i) {
            case 0:
                changeUser$lambda$1 = Braze.changeUser$lambda$1(str2, braze, str);
                return changeUser$lambda$1;
            case 1:
                addSerializedCardJsonToStorage$lambda$1 = Braze.addSerializedCardJsonToStorage$lambda$1(str2, braze, str);
                return addSerializedCardJsonToStorage$lambda$1;
            default:
                logPushStoryPageClicked$lambda$1 = Braze.logPushStoryPageClicked$lambda$1(str2, str, braze);
                return logPushStoryPageClicked$lambda$1;
        }
    }

    public /* synthetic */ Braze$$ExternalSyntheticLambda33(String str, Braze braze, String str2, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = braze;
        this.f$2 = str2;
    }
}
