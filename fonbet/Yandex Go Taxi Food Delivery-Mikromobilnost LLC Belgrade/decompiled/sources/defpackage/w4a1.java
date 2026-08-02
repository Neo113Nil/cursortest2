package defpackage;

import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.j;

/* loaded from: classes11.dex */
public abstract class w4a1 {
    public static final tb2 a = new tb2(1022);

    public static int a(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static final float b(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        return ((Resources) btsVar.m(AndroidCompositionLocals_androidKt.c)).getDimension(i) / ((fwi) btsVar.m(j.h)).getDensity();
    }
}
