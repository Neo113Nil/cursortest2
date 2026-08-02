package com.braze;

import bo.app.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class Braze$$ExternalSyntheticLambda12 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Braze f$0;
    public final /* synthetic */ f f$1;

    public /* synthetic */ Braze$$ExternalSyntheticLambda12(Braze braze, f fVar, int i) {
        this.$r8$classId = i;
        this.f$0 = braze;
        this.f$1 = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit closeSession$lambda$2;
        Unit openSession$lambda$2;
        int i = this.$r8$classId;
        f fVar = this.f$1;
        Braze braze = this.f$0;
        switch (i) {
            case 0:
                closeSession$lambda$2 = Braze.closeSession$lambda$2(braze, fVar);
                return closeSession$lambda$2;
            default:
                openSession$lambda$2 = Braze.openSession$lambda$2(braze, fVar);
                return openSession$lambda$2;
        }
    }
}
