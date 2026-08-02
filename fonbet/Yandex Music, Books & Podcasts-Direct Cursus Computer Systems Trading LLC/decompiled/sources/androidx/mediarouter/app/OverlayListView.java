package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import defpackage.aqh;
import defpackage.fzj;
import defpackage.irh;
import defpackage.qdc;
import defpackage.su4;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OverlayListView extends ListView {
    public final ArrayList a;

    public OverlayListView(Context context) {
        super(context);
        this.a = new ArrayList();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        super.onDraw(canvas);
        ArrayList arrayList = this.a;
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fzj fzjVar = (fzj) it.next();
                BitmapDrawable bitmapDrawable = fzjVar.a;
                if (bitmapDrawable != null) {
                    bitmapDrawable.draw(canvas);
                }
                long drawingTime = getDrawingTime();
                BitmapDrawable bitmapDrawable2 = fzjVar.a;
                Rect rect = fzjVar.c;
                if (fzjVar.k) {
                    z = false;
                } else {
                    float max = fzjVar.j ? Math.max(0.0f, Math.min(1.0f, (drawingTime - fzjVar.i) / fzjVar.e)) : 0.0f;
                    Interpolator interpolator = fzjVar.d;
                    float interpolation = interpolator == null ? max : interpolator.getInterpolation(max);
                    int i = (int) (fzjVar.g * interpolation);
                    Rect rect2 = fzjVar.f;
                    rect.top = rect2.top + i;
                    rect.bottom = rect2.bottom + i;
                    float e = su4.e(fzjVar.h, 1.0f, interpolation, 1.0f);
                    fzjVar.b = e;
                    if (bitmapDrawable2 != null) {
                        bitmapDrawable2.setAlpha((int) (e * 255.0f));
                        bitmapDrawable2.setBounds(rect);
                    }
                    if (fzjVar.j && max >= 1.0f) {
                        fzjVar.k = true;
                        qdc qdcVar = fzjVar.l;
                        if (qdcVar != null) {
                            aqh aqhVar = (aqh) qdcVar.c;
                            aqhVar.J.remove((irh) qdcVar.b);
                            aqhVar.F.notifyDataSetChanged();
                        }
                    }
                    z = !fzjVar.k;
                }
                if (!z) {
                    it.remove();
                }
            }
        }
    }

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
    }

    public OverlayListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new ArrayList();
    }
}
