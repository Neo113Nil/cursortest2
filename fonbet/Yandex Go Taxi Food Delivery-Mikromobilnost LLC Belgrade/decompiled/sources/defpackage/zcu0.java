package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.LinearInterpolator;
import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.random.Random;
import ru.yandex.taxi.eatskit.widget.placeholder.grocery.GrocerySplashView;

/* loaded from: classes5.dex */
public final class zcu0 {
    public final Context a;
    public GrocerySplashView b;
    public List c = EmptyList.a;
    public ValueAnimator d = new ValueAnimator();
    public ValueAnimator e = new ValueAnimator();
    public final Handler f = new Handler(Looper.getMainLooper());

    public zcu0(Context context) {
        this.a = context;
    }

    public final void a() {
        int i;
        List list;
        int i2;
        List list2;
        Iterator it;
        int i3;
        int i4;
        float f;
        boolean z;
        float f2;
        float f3;
        c();
        GrocerySplashView grocerySplashView = this.b;
        if (grocerySplashView == null) {
            return;
        }
        int width = grocerySplashView.getWidth();
        int height = grocerySplashView.getHeight();
        if (width <= 0 || grocerySplashView.getHeight() <= 0) {
            return;
        }
        bcu0 bcu0Var = new bcu0(this.a, width, height);
        ArrayList arrayList = new ArrayList();
        List list3 = bcu0Var.e;
        int size = list3.size();
        while (true) {
            if (-1 >= size) {
                size = list3.size();
                break;
            } else if (height > bcu0Var.a(size)) {
                break;
            } else {
                size--;
            }
        }
        List list4 = list3;
        Iterator it2 = list4.iterator();
        int i5 = 0;
        int i6 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i7 = i6 + 1;
            if (i6 < 0) {
                scc.m();
                throw null;
            }
            tbu0 tbu0Var = (tbu0) next;
            if (i6 < size) {
                float b = bcu0Var.b(48.0f);
                float f4 = b / bcu0Var.c;
                int i8 = tbu0Var.e;
                Paint paint = new Paint(1);
                paint.setTextSize(f4);
                paint.setStyle(Paint.Style.FILL);
                Context context = bcu0Var.a;
                paint.setColor(qje.t(i8, context));
                Typeface typeface = xub1.a;
                if (typeface == null) {
                    typeface = wuj0.b(x4h0.ya_medium, context);
                }
                xub1.a = typeface;
                paint.setTypeface(typeface);
                paint.setTextAlign(Paint.Align.CENTER);
                paint.setAlpha(i5);
                Rect rect = new Rect();
                String str = tbu0Var.d;
                list2 = list4;
                paint.getTextBounds(str, i5, str.length(), rect);
                float b2 = (bcu0Var.b(tbu0Var.h) * 2.0f) + rect.width();
                float b3 = bcu0Var.b(tbu0Var.a);
                float f5 = bcu0Var.b;
                float b4 = bcu0Var.b(134.0f);
                int i9 = ((tbu0) list3.get(i5)).a;
                list = list3;
                int i10 = 0;
                for (Object obj : list2) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        scc.m();
                        throw null;
                    }
                    float f6 = b4;
                    tbu0 tbu0Var2 = (tbu0) obj;
                    if (i10 < size) {
                        i9 = Math.max(i9, tbu0Var2.a);
                    }
                    i10 = i11;
                    b4 = f6;
                }
                float b5 = ((f5 - (bcu0Var.b(Math.abs(i9)) + b4)) / 2.0f) + b3;
                float max = Math.max(0.0f, ((height - bcu0Var.a(size)) / 2.0f) * 0.8f) + bcu0Var.b(tbu0Var.b);
                i = height;
                RectF rectF = new RectF(b5, max, b5 + b2, max + b);
                RectF rectF2 = new RectF(0.0f, 0.0f, b2, b);
                boolean z2 = tbu0Var.f;
                Path path = new Path();
                path.moveTo(bcu0Var.b(10.0f) + rectF2.left, 0.0f);
                if (z2) {
                    float width2 = ((rectF2.width() - bcu0Var.b(11.0f)) / 2.0f) + rectF2.left;
                    path.lineTo(width2, 0.0f);
                    f = 0.0f;
                    i2 = size;
                    it = it2;
                    z = z2;
                    path.arcTo(new RectF(width2, 0.0f - bcu0Var.b(5.5f), bcu0Var.b(11.0f) + width2, bcu0Var.b(5.5f) + 0.0f), 180.0f, -180.0f);
                } else {
                    f = 0.0f;
                    i2 = size;
                    it = it2;
                    z = z2;
                }
                path.lineTo(rectF2.right - bcu0Var.b(10.0f), f);
                path.cubicTo(rectF2.width() - bcu0Var.b(10.0f), rectF2.height() * 0.15f, rectF2.width() - bcu0Var.b(7.0f), rectF2.height() * 0.22f, rectF2.width() - bcu0Var.b(4.5f), rectF2.height() * 0.29f);
                path.cubicTo(rectF2.width() - bcu0Var.b(2.0f), rectF2.height() * 0.35f, rectF2.width(), rectF2.height() * 0.4f, rectF2.width(), rectF2.height() * 0.5f);
                path.cubicTo(rectF2.width(), rectF2.height() * 0.6f, rectF2.width() - bcu0Var.b(2.0f), rectF2.height() * 0.65f, rectF2.width() - bcu0Var.b(4.5f), rectF2.height() * 0.71f);
                path.cubicTo(rectF2.width() - bcu0Var.b(7.0f), rectF2.height() * 0.78f, rectF2.width() - bcu0Var.b(10.0f), rectF2.height() * 0.85f, rectF2.width() - bcu0Var.b(10.0f), rectF2.bottom);
                if (z) {
                    f2 = 0.22f;
                    float width3 = (rectF2.width() - bcu0Var.b(11.0f)) / 2.0f;
                    f3 = 0.35f;
                    path.lineTo(width3, rectF2.bottom);
                    i4 = i7;
                    path.arcTo(new RectF(width3, rectF2.bottom - bcu0Var.b(5.5f), bcu0Var.b(11.0f) + width3, bcu0Var.b(5.5f) + rectF2.bottom), 0.0f, -180.0f);
                } else {
                    f2 = 0.22f;
                    i4 = i7;
                    f3 = 0.35f;
                }
                path.lineTo(bcu0Var.b(10.0f), rectF2.bottom);
                path.cubicTo(bcu0Var.b(10.0f), rectF2.height() * 0.85f, bcu0Var.b(7.0f), rectF2.height() * 0.78f, bcu0Var.b(4.5f), rectF2.height() * 0.71f);
                path.cubicTo(bcu0Var.b(2.0f), rectF2.height() * 0.65f, rectF2.left, rectF2.height() * 0.6f, rectF2.left, rectF2.height() * 0.5f);
                path.cubicTo(bcu0Var.b(0.0f), rectF2.height() * 0.4f, bcu0Var.b(2.0f), rectF2.height() * f3, bcu0Var.b(4.5f), rectF2.height() * 0.29f);
                path.cubicTo(bcu0Var.b(7.0f), rectF2.height() * f2, bcu0Var.b(10.0f), rectF2.height() * 0.15f, bcu0Var.b(10.0f), 0.0f);
                path.close();
                Matrix matrix = new Matrix();
                matrix.setTranslate(b5, max);
                path.transform(matrix);
                String str2 = tbu0Var.d;
                float f7 = tbu0Var.c;
                int i12 = tbu0Var.g;
                Paint paint2 = new Paint(1);
                paint2.setColor(context.getResources().getColor(i12));
                i3 = 0;
                paint2.setAlpha(0);
                arrayList.add(new acu0(str2, rectF, paint, paint2, path, f7));
            } else {
                i = height;
                list = list3;
                i2 = size;
                list2 = list4;
                it = it2;
                i3 = i5;
                i4 = i7;
            }
            i5 = i3;
            list4 = list2;
            list3 = list;
            height = i;
            i6 = i4;
            size = i2;
            it2 = it;
        }
        this.c = arrayList;
        b();
    }

    public final void b() {
        ValueAnimator valueAnimator = this.d;
        valueAnimator.removeAllListeners();
        valueAnimator.removeAllUpdateListeners();
        valueAnimator.cancel();
        for (acu0 acu0Var : this.c) {
            Random.a.getClass();
            acu0Var.g = Random.b.f(-60, 60);
        }
        this.d = new ValueAnimator();
        int size = (this.c.size() * Constants.MINIMAL_ERROR_STATUS_CODE) + 999;
        this.d.setIntValues(0, size);
        this.d.setDuration(size);
        this.d.setInterpolator(new LinearInterpolator());
        this.d.addUpdateListener(new xcu0(this, 0));
        Handler handler = this.f;
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(new ycu0(this, 0), this.d.getDuration());
        this.d.start();
    }

    public final void c() {
        ValueAnimator valueAnimator = this.d;
        valueAnimator.removeAllListeners();
        valueAnimator.removeAllUpdateListeners();
        valueAnimator.cancel();
        ValueAnimator valueAnimator2 = this.e;
        valueAnimator2.removeAllListeners();
        valueAnimator2.removeAllUpdateListeners();
        valueAnimator2.cancel();
        this.f.removeCallbacksAndMessages(null);
        this.c = EmptyList.a;
    }
}
