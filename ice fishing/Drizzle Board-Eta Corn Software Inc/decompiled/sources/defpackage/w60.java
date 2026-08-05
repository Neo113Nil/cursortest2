package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class w60 extends c70 {
    public final /* synthetic */ ArrayList MdtA4re8;
    public final /* synthetic */ Matrix wxUZMvaN;

    public w60(ArrayList arrayList, Matrix matrix) {
        this.MdtA4re8 = arrayList;
        this.wxUZMvaN = matrix;
    }

    @Override // defpackage.c70
    public final void qoPGr6Ce(Matrix matrix, q60 q60Var, int i, Canvas canvas) {
        ArrayList arrayList = this.MdtA4re8;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((c70) obj).qoPGr6Ce(this.wxUZMvaN, q60Var, i, canvas);
        }
    }
}
