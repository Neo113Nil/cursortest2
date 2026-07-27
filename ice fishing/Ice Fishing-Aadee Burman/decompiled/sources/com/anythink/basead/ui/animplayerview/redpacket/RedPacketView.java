package com.anythink.basead.ui.animplayerview.redpacket;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* loaded from: classes.dex */
public class RedPacketView extends View {
    public static final String TAG = "RedPacketView";

    /* renamed from: e, reason: collision with root package name */
    private static final int f10522e = 400;

    /* renamed from: a, reason: collision with root package name */
    protected double f10523a;

    /* renamed from: b, reason: collision with root package name */
    protected double f10524b;

    /* renamed from: c, reason: collision with root package name */
    protected final List<a> f10525c;

    /* renamed from: d, reason: collision with root package name */
    Random f10526d;

    /* renamed from: f, reason: collision with root package name */
    private final Matrix f10527f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<Integer, Float> f10528g;

    /* renamed from: h, reason: collision with root package name */
    private List<Integer> f10529h;
    private Paint i;

    /* renamed from: j, reason: collision with root package name */
    private int f10530j;

    /* renamed from: k, reason: collision with root package name */
    private int f10531k;

    /* renamed from: l, reason: collision with root package name */
    private int f10532l;

    /* renamed from: m, reason: collision with root package name */
    private int f10533m;

    /* renamed from: n, reason: collision with root package name */
    private int f10534n;

    /* renamed from: o, reason: collision with root package name */
    private Bitmap f10535o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f10536p;

    public RedPacketView(Context context) {
        this(context, null);
    }

    private void a() {
        Paint paint = new Paint();
        this.i = paint;
        paint.setFilterBitmap(true);
        this.i.setDither(true);
        this.i.setAntiAlias(true);
        setLayerType(2, null);
        this.f10526d = new Random(System.currentTimeMillis());
    }

    private a b(Bitmap bitmap) {
        return new a(getContext(), bitmap, this.f10523a, this.f10524b, this.f10533m);
    }

    public void initRedPacketList(Bitmap bitmap) {
        Float f3;
        this.f10535o = bitmap;
        if (this.f10536p) {
            return;
        }
        this.f10536p = true;
        if (bitmap == null) {
            try {
                this.f10535o = BitmapFactory.decodeResource(getResources(), q.a(getContext(), "myoffer_icon_red_packet", k.f19632c));
            } catch (Exception e9) {
                Log.e(TAG, "initRedPacketList failed: " + e9.getMessage());
            }
        }
        if (this.f10535o == null) {
            Log.e(TAG, "redPacketBitmap is null, decodeResource failed.");
            return;
        }
        int height = (int) (this.f10534n / (((this.f10533m * this.f10524b) * r13.getHeight()) / r13.getWidth()));
        this.f10532l = height;
        this.f10531k = 3;
        int i = (height * 12) / 9;
        this.f10530j = i;
        if (i <= 0 || height <= 0) {
            return;
        }
        this.f10525c.clear();
        for (int i6 = 0; i6 < this.f10530j; i6++) {
            a aVar = new a(getContext(), this.f10535o, this.f10523a, this.f10524b, this.f10533m);
            if (aVar.b() > 0 && aVar.a() > 0) {
                int i9 = i6 % 4;
                if (i9 == 0) {
                    i9 = (i6 / 4) * 9;
                } else if (i9 == 1) {
                    i9 = ((i6 / 4) * 9) + 2;
                } else if (i9 == 2) {
                    i9 = ((i6 / 4) * 9) + 4;
                } else if (i9 == 3) {
                    i9 = ((i6 / 4) * 9) + 8;
                }
                int i10 = this.f10531k;
                int i11 = i9 / i10;
                int i12 = i9 % i10;
                int i13 = this.f10533m / i10;
                int i14 = this.f10534n / this.f10532l;
                int b9 = aVar.b();
                int a9 = aVar.a();
                aVar.f10537a = (i12 * i13) + ((i13 - b9) >> 1);
                int nextInt = this.f10526d.nextInt(21) - 10;
                int nextInt2 = this.f10526d.nextInt(a9 / 3) + (a9 / 3);
                if (i11 > 0 && (f3 = this.f10528g.get(Integer.valueOf(i9 - this.f10531k))) != null) {
                    float floatValue = f3.floatValue() + nextInt2 + nextInt;
                    aVar.f10538b = floatValue;
                    if ((this.f10534n - floatValue) - b() < a9) {
                        if (this.f10529h == null) {
                            this.f10529h = new ArrayList();
                        }
                        this.f10529h.add(Integer.valueOf(i6));
                    }
                }
                if (aVar.f10538b == 0.0f) {
                    aVar.f10538b = (i11 * i14) + nextInt2 + nextInt;
                }
                float f9 = a9;
                if (aVar.f10538b + f9 > this.f10534n) {
                    aVar.f10538b = (r7 - a9) - b();
                }
                if (aVar.f10538b < 0.0f) {
                    aVar.f10538b = a9 >> 1;
                }
                this.f10528g.put(Integer.valueOf(i9), Float.valueOf(aVar.f10538b + f9));
            }
            this.f10525c.add(aVar);
        }
        List<Integer> list = this.f10529h;
        if (list != null && list.size() > 0) {
            Iterator<Integer> it = this.f10529h.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (intValue >= 0 && intValue < this.f10525c.size()) {
                    a aVar2 = this.f10525c.get(intValue);
                    if (aVar2 != null) {
                        aVar2.d();
                    }
                    this.f10525c.remove(intValue);
                }
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        a next;
        Bitmap c9;
        super.onDraw(canvas);
        Iterator<a> it = this.f10525c.iterator();
        while (it.hasNext() && (c9 = (next = it.next()).c()) != null) {
            this.f10527f.setTranslate((-next.b()) >> 1, (-next.a()) >> 1);
            this.f10527f.postRotate(next.e());
            this.f10527f.postTranslate((next.b() >> 1) + next.f10537a, (next.a() >> 1) + next.f10538b);
            canvas.drawBitmap(c9, this.f10527f, this.i);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i6) {
        super.onMeasure(i, i6);
        this.f10533m = getMeasuredWidth();
        this.f10534n = getMeasuredHeight();
    }

    public void release() {
        this.f10536p = false;
        try {
            Bitmap bitmap = this.f10535o;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f10535o.recycle();
            }
            Iterator<a> it = this.f10525c.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
            this.f10525c.clear();
            Map<Integer, Float> map = this.f10528g;
            if (map != null) {
                map.clear();
            }
            List<Integer> list = this.f10529h;
            if (list != null) {
                list.clear();
            }
        } catch (Exception e9) {
            Log.e(TAG, "release failed: " + e9.getMessage());
        }
    }

    public RedPacketView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int b() {
        return q.a(getContext(), 5.0f);
    }

    public RedPacketView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10523a = 0.15d;
        this.f10524b = 0.2d;
        this.f10527f = new Matrix();
        this.f10525c = new ArrayList();
        this.f10528g = new HashMap();
        Paint paint = new Paint();
        this.i = paint;
        paint.setFilterBitmap(true);
        this.i.setDither(true);
        this.i.setAntiAlias(true);
        setLayerType(2, null);
        this.f10526d = new Random(System.currentTimeMillis());
    }

    private void a(Canvas canvas) {
        a next;
        Bitmap c9;
        Iterator<a> it = this.f10525c.iterator();
        while (it.hasNext() && (c9 = (next = it.next()).c()) != null) {
            this.f10527f.setTranslate((-next.b()) >> 1, (-next.a()) >> 1);
            this.f10527f.postRotate(next.e());
            this.f10527f.postTranslate((next.b() >> 1) + next.f10537a, (next.a() >> 1) + next.f10538b);
            canvas.drawBitmap(c9, this.f10527f, this.i);
        }
    }

    private void a(Bitmap bitmap) {
        int height = (int) (this.f10534n / (((this.f10533m * this.f10524b) * bitmap.getHeight()) / bitmap.getWidth()));
        this.f10532l = height;
        this.f10531k = 3;
        this.f10530j = (height * 12) / 9;
    }

    private static int a(int i) {
        int i6 = i % 4;
        if (i6 == 0) {
            return (i / 4) * 9;
        }
        if (i6 == 1) {
            return ((i / 4) * 9) + 2;
        }
        if (i6 == 2) {
            return ((i / 4) * 9) + 4;
        }
        return i6 == 3 ? ((i / 4) * 9) + 8 : i6;
    }

    private void a(a aVar, int i) {
        Float f3;
        if (aVar.b() <= 0 || aVar.a() <= 0) {
            return;
        }
        int i6 = i % 4;
        if (i6 == 0) {
            i6 = (i / 4) * 9;
        } else if (i6 == 1) {
            i6 = ((i / 4) * 9) + 2;
        } else if (i6 == 2) {
            i6 = ((i / 4) * 9) + 4;
        } else if (i6 == 3) {
            i6 = ((i / 4) * 9) + 8;
        }
        int i9 = this.f10531k;
        int i10 = i6 / i9;
        int i11 = i6 % i9;
        int i12 = this.f10533m / i9;
        int i13 = this.f10534n / this.f10532l;
        int b9 = aVar.b();
        int a9 = aVar.a();
        aVar.f10537a = (i11 * i12) + ((i12 - b9) >> 1);
        int nextInt = this.f10526d.nextInt(21) - 10;
        int i14 = a9 / 3;
        int nextInt2 = this.f10526d.nextInt(i14) + i14;
        if (i10 > 0 && (f3 = this.f10528g.get(Integer.valueOf(i6 - this.f10531k))) != null) {
            float floatValue = f3.floatValue() + nextInt2 + nextInt;
            aVar.f10538b = floatValue;
            if ((this.f10534n - floatValue) - b() < a9) {
                if (this.f10529h == null) {
                    this.f10529h = new ArrayList();
                }
                this.f10529h.add(Integer.valueOf(i));
            }
        }
        if (aVar.f10538b == 0.0f) {
            aVar.f10538b = (i10 * i13) + nextInt2 + nextInt;
        }
        float f9 = a9;
        if (aVar.f10538b + f9 > this.f10534n) {
            aVar.f10538b = (r3 - a9) - b();
        }
        if (aVar.f10538b < 0.0f) {
            aVar.f10538b = a9 >> 1;
        }
        this.f10528g.put(Integer.valueOf(i6), Float.valueOf(aVar.f10538b + f9));
    }
}
