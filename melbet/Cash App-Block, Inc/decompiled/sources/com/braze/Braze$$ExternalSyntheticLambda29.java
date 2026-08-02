package com.braze;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class Braze$$ExternalSyntheticLambda29 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Braze f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ Braze$$ExternalSyntheticLambda29(Braze braze, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = braze;
        this.f$1 = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit _set_registeredPushToken_$lambda$1;
        Unit logPushMaxCampaign$lambda$1;
        int i = this.$r8$classId;
        String str = this.f$1;
        Braze braze = this.f$0;
        switch (i) {
            case 0:
                _set_registeredPushToken_$lambda$1 = Braze._set_registeredPushToken_$lambda$1(braze, str);
                return _set_registeredPushToken_$lambda$1;
            default:
                logPushMaxCampaign$lambda$1 = Braze.logPushMaxCampaign$lambda$1(braze, str);
                return logPushMaxCampaign$lambda$1;
        }
    }
}
