package defpackage;

import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import com.yandex.div.core.util.text.DivBackgroundSpan;

/* loaded from: classes11.dex */
public final class ql40 extends phl {
    public final /* synthetic */ int b;
    public final View c;
    public final rvo d;

    public /* synthetic */ ql40(View view, rvo rvoVar, int i) {
        this.b = i;
        this.c = view;
        this.d = rvoVar;
    }

    @Override // defpackage.phl
    public final void a(Canvas canvas, Layout layout, int i, int i2, int i3, int i4, DivBackgroundSpan divBackgroundSpan) {
        int i5 = this.b;
        View view = this.c;
        switch (i5) {
            case 0:
                int paragraphDirection = layout.getParagraphDirection(i);
                int lineLeft = (int) (paragraphDirection == -1 ? layout.getLineLeft(i) : layout.getLineRight(i));
                ohl b = b(layout, i, divBackgroundSpan, true);
                j4n j4nVar = new j4n(view.getResources().getDisplayMetrics(), divBackgroundSpan.getBorder(), divBackgroundSpan.getBackground(), canvas, this.d);
                float[] fArr = (float[]) j4nVar.w;
                float f = i3;
                float f2 = b.a;
                float f3 = lineLeft;
                float f4 = b.b;
                float[] fArr2 = new float[8];
                boolean z = false;
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
                j4nVar.p(f, f2, f3, f4, fArr2);
                int i6 = i + 1;
                while (i6 < i2) {
                    ohl b2 = b(layout, i6, divBackgroundSpan, z);
                    j4nVar.p((int) layout.getLineLeft(i6), b2.a, (int) layout.getLineRight(i6), b2.b, new float[8]);
                    i6++;
                    z = false;
                }
                float lineRight = paragraphDirection == -1 ? layout.getLineRight(i) : layout.getLineLeft(i);
                ohl b3 = b(layout, i2, divBackgroundSpan, false);
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
                j4nVar.p(f5, f6, f7, f8, fArr3);
                break;
            default:
                ohl b4 = b(layout, i, divBackgroundSpan, true);
                int min = Math.min(i3, i4);
                int max = Math.max(i3, i4);
                j4n j4nVar2 = new j4n(view.getResources().getDisplayMetrics(), divBackgroundSpan.getBorder(), divBackgroundSpan.getBackground(), canvas, this.d);
                j4nVar2.p(min, b4.a, max, b4.b, (float[]) j4nVar2.w);
                break;
        }
    }
}
