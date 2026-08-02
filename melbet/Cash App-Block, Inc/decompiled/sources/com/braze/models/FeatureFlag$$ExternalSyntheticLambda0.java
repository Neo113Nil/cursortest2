package com.braze.models;

import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final /* synthetic */ class FeatureFlag$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FeatureFlag f$0;

    public /* synthetic */ FeatureFlag$$ExternalSyntheticLambda0(FeatureFlag featureFlag, int i) {
        this.$r8$classId = i;
        this.f$0 = featureFlag;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        JSONObject _init_$lambda$0;
        String _init_$lambda$0$0;
        JSONObject properties_delegate$lambda$0;
        String properties_delegate$lambda$0$0;
        int i = this.$r8$classId;
        FeatureFlag featureFlag = this.f$0;
        switch (i) {
            case 0:
                _init_$lambda$0 = FeatureFlag._init_$lambda$0(featureFlag);
                return _init_$lambda$0;
            case 1:
                _init_$lambda$0$0 = FeatureFlag._init_$lambda$0$0(featureFlag);
                return _init_$lambda$0$0;
            case 2:
                properties_delegate$lambda$0 = FeatureFlag.properties_delegate$lambda$0(featureFlag);
                return properties_delegate$lambda$0;
            default:
                properties_delegate$lambda$0$0 = FeatureFlag.properties_delegate$lambda$0$0(featureFlag);
                return properties_delegate$lambda$0$0;
        }
    }
}
