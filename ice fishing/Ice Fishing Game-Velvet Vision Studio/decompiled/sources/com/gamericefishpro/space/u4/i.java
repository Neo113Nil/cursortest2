package com.gamericefishpro.space.u4;

import android.text.InputFilter;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends com.gamericefishpro.space.d9.h {
    public final h i;

    public i(TextView textView) {
        this.i = new h(textView);
    }

    @Override // com.gamericefishpro.space.d9.h
    public final void L(boolean z) {
        if (com.gamericefishpro.space.s4.k.c()) {
            this.i.L(z);
        }
    }

    @Override // com.gamericefishpro.space.d9.h
    public final void M(boolean z) {
        boolean zC = com.gamericefishpro.space.s4.k.c();
        h hVar = this.i;
        if (zC) {
            hVar.M(z);
        } else {
            hVar.k = z;
        }
    }

    @Override // com.gamericefishpro.space.d9.h
    public final InputFilter[] z(InputFilter[] inputFilterArr) {
        return !com.gamericefishpro.space.s4.k.c() ? inputFilterArr : this.i.z(inputFilterArr);
    }
}
