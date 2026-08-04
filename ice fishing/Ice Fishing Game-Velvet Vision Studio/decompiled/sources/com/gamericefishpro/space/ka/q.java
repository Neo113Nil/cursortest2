package com.gamericefishpro.space.ka;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends w {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Matrix d;

    public q(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    @Override // com.gamericefishpro.space.ka.w
    public final void a(Matrix matrix, com.gamericefishpro.space.ja.a aVar, int i, Canvas canvas) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((w) obj).a(this.d, aVar, i, canvas);
        }
    }
}
