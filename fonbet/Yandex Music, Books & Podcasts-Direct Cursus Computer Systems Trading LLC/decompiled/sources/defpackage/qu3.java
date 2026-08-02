package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class qu3 extends View implements wpr {
    public final ArrayList a;
    public List b;
    public float c;

    public qu3(Context context, int i) {
        super(context, null);
        this.a = new ArrayList();
        this.b = Collections.EMPTY_LIST;
        this.c = 0.0533f;
    }

    @Override // defpackage.wpr
    public final void a(List list, tu3 tu3Var, float f, float f2) {
        this.b = list;
        this.c = f;
        while (true) {
            ArrayList arrayList = this.a;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            Context context = getContext();
            dxl dxlVar = new dxl();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
            obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.getFloat(1, 1.0f);
            obtainStyledAttributes.recycle();
            Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
            TextPaint textPaint = new TextPaint();
            textPaint.setAntiAlias(true);
            textPaint.setSubpixelText(true);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
            Paint paint2 = new Paint();
            paint2.setAntiAlias(true);
            paint2.setFilterBitmap(true);
            arrayList.add(dxlVar);
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        List list = this.b;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i = paddingBottom - paddingTop;
        float f = this.c;
        if ((f != -3.4028235E38f ? f * i : -3.4028235E38f) > 0.0f && list.size() > 0) {
            list.get(0).getClass();
            l1j.f();
        }
    }
}
