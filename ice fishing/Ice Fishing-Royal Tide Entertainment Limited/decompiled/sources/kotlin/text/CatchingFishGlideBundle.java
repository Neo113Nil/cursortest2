package kotlin.text;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishGlideBundle extends CatchingFishLifecycleGson {
    public final /* synthetic */ ArrayList CatchingFishCoroutine;
    public final /* synthetic */ Matrix CatchingFishReduxKtor;

    public CatchingFishGlideBundle(ArrayList arrayList, Matrix matrix) {
        this.CatchingFishCoroutine = arrayList;
        this.CatchingFishReduxKtor = matrix;
    }

    @Override // kotlin.text.CatchingFishLifecycleGson
    public final void CatchingFishParcelableFAB(Matrix matrix, CatchingFishAsyncTaskFAB catchingFishAsyncTaskFAB, int i, Canvas canvas) {
        ArrayList arrayList = this.CatchingFishCoroutine;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((CatchingFishLifecycleGson) obj).CatchingFishParcelableFAB(this.CatchingFishReduxKtor, catchingFishAsyncTaskFAB, i, canvas);
        }
    }
}
