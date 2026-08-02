package defpackage;

import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import com.yandex.div.core.util.text.DivBackgroundSpan;

/* loaded from: classes3.dex */
public final class kgi extends ut9 {
    public final /* synthetic */ int b;
    public final View c;
    public final xzb d;

    public /* synthetic */ kgi(View view, xzb xzbVar, int i) {
        this.b = i;
        this.c = view;
        this.d = xzbVar;
    }

    @Override // defpackage.ut9
    public final void a(Canvas canvas, Layout layout, int i, int i2, int i3, int i4, DivBackgroundSpan divBackgroundSpan) {
        switch (this.b) {
            case 0:
                int paragraphDirection = layout.getParagraphDirection(i);
                int lineLeft = (int) (paragraphDirection == -1 ? layout.getLineLeft(i) : layout.getLineRight(i));
                tt9 b = b(layout, i, divBackgroundSpan, true);
                jac jacVar = new jac(this.c.getResources().getDisplayMetrics(), divBackgroundSpan.a, divBackgroundSpan.b, canvas, this.d);
                float[] fArr = (float[]) jacVar.g;
                float f = i3;
                float f2 = b.a;
                float f3 = lineLeft;
                float f4 = b.b;
                float[] fArr2 = new float[8];
                if (fArr != null) {
                    fArr2[0] = fArr[0];
                    fArr2[1] = fArr[1];
                    fArr2[2] = 0.0f;
                    fArr2[3] = 0.0f;
                    fArr2[4] = 0.0f;
                    fArr2[5] = 0.0f;
                    fArr2[6] = fArr[6];
                    fArr2[7] = fArr[7];
                }
                jacVar.g(f, f2, f3, f4, fArr2);
                for (int i5 = i + 1; i5 < i2; i5++) {
                    tt9 b2 = b(layout, i5, divBackgroundSpan, false);
                    jacVar.g((int) layout.getLineLeft(i5), b2.a, (int) layout.getLineRight(i5), b2.b, new float[8]);
                }
                float lineRight = paragraphDirection == -1 ? layout.getLineRight(i) : layout.getLineLeft(i);
                tt9 b3 = b(layout, i2, divBackgroundSpan, false);
                float f5 = (int) lineRight;
                float f6 = b3.a;
                float f7 = i4;
                float f8 = b3.b;
                float[] fArr3 = new float[8];
                if (fArr != null) {
                    fArr3[0] = 0.0f;
                    fArr3[1] = 0.0f;
                    fArr3[2] = fArr[2];
                    fArr3[3] = fArr[3];
                    fArr3[4] = fArr[4];
                    fArr3[5] = fArr[5];
                    fArr3[6] = 0.0f;
                    fArr3[7] = 0.0f;
                }
                jacVar.g(f5, f6, f7, f8, fArr3);
                break;
            default:
                tt9 b4 = b(layout, i, divBackgroundSpan, true);
                int min = Math.min(i3, i4);
                int max = Math.max(i3, i4);
                jac jacVar2 = new jac(this.c.getResources().getDisplayMetrics(), divBackgroundSpan.a, divBackgroundSpan.b, canvas, this.d);
                jacVar2.g(min, b4.a, max, b4.b, (float[]) jacVar2.g);
                break;
        }
    }
}
