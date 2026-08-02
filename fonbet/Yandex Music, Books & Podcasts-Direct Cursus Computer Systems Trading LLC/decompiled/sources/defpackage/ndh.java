package defpackage;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.shape.a;

/* loaded from: classes3.dex */
public final class ndh extends y2x {
    public final int j;

    public ndh(int i) {
        this.j = i;
    }

    @Override // defpackage.y2x
    public final float A(Object obj) {
        float[] fArr = ((a) obj).C;
        if (fArr != null) {
            return fArr[this.j];
        }
        return 0.0f;
    }

    @Override // defpackage.y2x
    public final void Y(Object obj, float f) {
        a aVar = (a) obj;
        float[] fArr = aVar.C;
        if (fArr != null) {
            int i = this.j;
            if (fArr[i] != f) {
                fArr[i] = f;
                uvg uvgVar = aVar.E;
                if (uvgVar != null) {
                    float i2 = aVar.i();
                    MaterialButton materialButton = (MaterialButton) uvgVar.b;
                    int i3 = (int) (i2 * 0.11f);
                    if (materialButton.x != i3) {
                        materialButton.x = i3;
                        materialButton.j();
                        materialButton.invalidate();
                    }
                }
                aVar.invalidateSelf();
            }
        }
    }
}
