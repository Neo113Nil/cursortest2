package com.squareup.cash.graphics.backend.gl.core;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import com.squareup.cash.graphics.backend.gl.core.PBRMaterial;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class PBRMaterial$PBRMaterialInstance$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PBRMaterial.PBRMaterialInstance f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ State f$2;

    public /* synthetic */ PBRMaterial$PBRMaterialInstance$$ExternalSyntheticLambda1(PBRMaterial.PBRMaterialInstance pBRMaterialInstance, String str, State state, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = pBRMaterialInstance;
        this.f$1 = str;
        this.f$2 = state;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        State state = this.f$2;
        String str = this.f$1;
        PBRMaterial.PBRMaterialInstance pBRMaterialInstance = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                pBRMaterialInstance.bindFloat(str, state, composer, Updater.updateChangedFlags(7));
                break;
            default:
                pBRMaterialInstance.bindTexture(str, state, composer, Updater.updateChangedFlags(7));
                break;
        }
        return Unit.INSTANCE;
    }
}
