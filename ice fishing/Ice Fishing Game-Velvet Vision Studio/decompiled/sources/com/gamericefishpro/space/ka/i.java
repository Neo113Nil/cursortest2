package com.gamericefishpro.space.ka;

import com.gamericefishpro.space.i9.d5;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends d5 {
    public final int c;

    public i(int i) {
        this.c = i;
    }

    @Override // com.gamericefishpro.space.i9.d5
    public final float H(y yVar) {
        float[] fArr = ((j) yVar).U;
        if (fArr != null) {
            return fArr[this.c];
        }
        return 0.0f;
    }

    @Override // com.gamericefishpro.space.i9.d5
    public final void Z(y yVar, float f) {
        j jVar = (j) yVar;
        float[] fArr = jVar.U;
        if (fArr != null) {
            int i = this.c;
            if (fArr[i] != f) {
                fArr[i] = f;
                com.gamericefishpro.space.a8.b bVar = jVar.W;
                if (bVar != null) {
                    float fH = jVar.h();
                    MaterialButton materialButton = (MaterialButton) bVar.e;
                    int i2 = (int) (fH * 0.11f);
                    if (materialButton.Q != i2) {
                        materialButton.Q = i2;
                        materialButton.j();
                        materialButton.invalidate();
                    }
                }
                jVar.invalidateSelf();
            }
        }
    }
}
