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
    private static final int f11308e = 400;

    /* renamed from: a, reason: collision with root package name */
    protected double f11309a;

    /* renamed from: b, reason: collision with root package name */
    protected double f11310b;

    /* renamed from: c, reason: collision with root package name */
    protected final List<a> f11311c;

    /* renamed from: d, reason: collision with root package name */
    Random f11312d;

    /* renamed from: f, reason: collision with root package name */
    private final Matrix f11313f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<Integer, Float> f11314g;

    /* renamed from: h, reason: collision with root package name */
    private List<Integer> f11315h;
    private Paint i;

    /* renamed from: j, reason: collision with root package name */
    private int f11316j;

    /* renamed from: k, reason: collision with root package name */
    private int f11317k;

    /* renamed from: l, reason: collision with root package name */
    private int f11318l;

    /* renamed from: m, reason: collision with root package name */
    private int f11319m;

    /* renamed from: n, reason: collision with root package name */
    private int f11320n;

    /* renamed from: o, reason: collision with root package name */
    private Bitmap f11321o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f11322p;

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
        this.f11312d = new Random(System.currentTimeMillis());
    }

    private a b(Bitmap bitmap) {
        return new a(getContext(), bitmap, this.f11309a, this.f11310b, this.f11319m);
    }

    public void initRedPacketList(Bitmap bitmap) {
        Float f2;
        this.f11321o = bitmap;
        if (this.f11322p) {
            return;
        }
        this.f11322p = true;
        if (bitmap == null) {
            try {
                this.f11321o = BitmapFactory.decodeResource(getResources(), q.a(getContext(), "myoffer_icon_red_packet", k.f20419c));
            } catch (Exception e9) {
                Log.e(TAG, "initRedPacketList failed: " + e9.getMessage());
            }
        }
        if (this.f11321o == null) {
            Log.e(TAG, "redPacketBitmap is null, decodeResource failed.");
            return;
        }
        int height = (int) (this.f11320n / (((this.f11319m * this.f11310b) * r13.getHeight()) / r13.getWidth()));
        this.f11318l = height;
        this.f11317k = 3;
        int i = (height * 12) / 9;
        this.f11316j = i;
        if (i <= 0 || height <= 0) {
            return;
        }
        this.f11311c.clear();
        for (int i4 = 0; i4 < this.f11316j; i4++) {
            a aVar = new a(getContext(), this.f11321o, this.f11309a, this.f11310b, this.f11319m);
            if (aVar.b() > 0 && aVar.a() > 0) {
                int i6 = i4 % 4;
                if (i6 == 0) {
                    i6 = (i4 / 4) * 9;
                } else if (i6 == 1) {
                    i6 = ((i4 / 4) * 9) + 2;
                } else if (i6 == 2) {
                    i6 = ((i4 / 4) * 9) + 4;
                } else if (i6 == 3) {
                    i6 = ((i4 / 4) * 9) + 8;
                }
                int i9 = this.f11317k;
                int i10 = i6 / i9;
                int i11 = i6 % i9;
                int i12 = this.f11319m / i9;
                int i13 = this.f11320n / this.f11318l;
                int b9 = aVar.b();
                int a9 = aVar.a();
                aVar.f11323a = (i11 * i12) + ((i12 - b9) >> 1);
                int nextInt = this.f11312d.nextInt(21) - 10;
                int nextInt2 = this.f11312d.nextInt(a9 / 3) + (a9 / 3);
                if (i10 > 0 && (f2 = this.f11314g.get(Integer.valueOf(i6 - this.f11317k))) != null) {
                    float floatValue = f2.floatValue() + nextInt2 + nextInt;
                    aVar.f11324b = floatValue;
                    if ((this.f11320n - floatValue) - b() < a9) {
                        if (this.f11315h == null) {
                            this.f11315h = new ArrayList();
                        }
                        this.f11315h.add(Integer.valueOf(i4));
                    }
                }
                if (aVar.f11324b == 0.0f) {
                    aVar.f11324b = (i10 * i13) + nextInt2 + nextInt;
                }
                float f9 = a9;
                if (aVar.f11324b + f9 > this.f11320n) {
                    aVar.f11324b = (r7 - a9) - b();
                }
                if (aVar.f11324b < 0.0f) {
                    aVar.f11324b = a9 >> 1;
                }
                this.f11314g.put(Integer.valueOf(i6), Float.valueOf(aVar.f11324b + f9));
            }
            this.f11311c.add(aVar);
        }
        List<Integer> list = this.f11315h;
        if (list != null && list.size() > 0) {
            Iterator<Integer> it = this.f11315h.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (intValue >= 0 && intValue < this.f11311c.size()) {
                    a aVar2 = this.f11311c.get(intValue);
                    if (aVar2 != null) {
                        aVar2.d();
                    }
                    this.f11311c.remove(intValue);
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
        Iterator<a> it = this.f11311c.iterator();
        while (it.hasNext() && (c9 = (next = it.next()).c()) != null) {
            this.f11313f.setTranslate((-next.b()) >> 1, (-next.a()) >> 1);
            this.f11313f.postRotate(next.e());
            this.f11313f.postTranslate((next.b() >> 1) + next.f11323a, (next.a() >> 1) + next.f11324b);
            canvas.drawBitmap(c9, this.f11313f, this.i);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        this.f11319m = getMeasuredWidth();
        this.f11320n = getMeasuredHeight();
    }

    public void release() {
        this.f11322p = false;
        try {
            Bitmap bitmap = this.f11321o;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f11321o.recycle();
            }
            Iterator<a> it = this.f11311c.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
            this.f11311c.clear();
            Map<Integer, Float> map = this.f11314g;
            if (map != null) {
                map.clear();
            }
            List<Integer> list = this.f11315h;
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
        this.f11309a = 0.15d;
        this.f11310b = 0.2d;
        this.f11313f = new Matrix();
        this.f11311c = new ArrayList();
        this.f11314g = new HashMap();
        Paint paint = new Paint();
        this.i = paint;
        paint.setFilterBitmap(true);
        this.i.setDither(true);
        this.i.setAntiAlias(true);
        setLayerType(2, null);
        this.f11312d = new Random(System.currentTimeMillis());
    }

    private void a(Canvas canvas) {
        a next;
        Bitmap c9;
        Iterator<a> it = this.f11311c.iterator();
        while (it.hasNext() && (c9 = (next = it.next()).c()) != null) {
            this.f11313f.setTranslate((-next.b()) >> 1, (-next.a()) >> 1);
            this.f11313f.postRotate(next.e());
            this.f11313f.postTranslate((next.b() >> 1) + next.f11323a, (next.a() >> 1) + next.f11324b);
            canvas.drawBitmap(c9, this.f11313f, this.i);
        }
    }

    private void a(Bitmap bitmap) {
        int height = (int) (this.f11320n / (((this.f11319m * this.f11310b) * bitmap.getHeight()) / bitmap.getWidth()));
        this.f11318l = height;
        this.f11317k = 3;
        this.f11316j = (height * 12) / 9;
    }

    private static int a(int i) {
        int i4 = i % 4;
        if (i4 == 0) {
            return (i / 4) * 9;
        }
        if (i4 == 1) {
            return ((i / 4) * 9) + 2;
        }
        if (i4 == 2) {
            return ((i / 4) * 9) + 4;
        }
        return i4 == 3 ? ((i / 4) * 9) + 8 : i4;
    }

    private void a(a aVar, int i) {
        Float f2;
        if (aVar.b() <= 0 || aVar.a() <= 0) {
            return;
        }
        int i4 = i % 4;
        if (i4 == 0) {
            i4 = (i / 4) * 9;
        } else if (i4 == 1) {
            i4 = ((i / 4) * 9) + 2;
        } else if (i4 == 2) {
            i4 = ((i / 4) * 9) + 4;
        } else if (i4 == 3) {
            i4 = ((i / 4) * 9) + 8;
        }
        int i6 = this.f11317k;
        int i9 = i4 / i6;
        int i10 = i4 % i6;
        int i11 = this.f11319m / i6;
        int i12 = this.f11320n / this.f11318l;
        int b9 = aVar.b();
        int a9 = aVar.a();
        aVar.f11323a = (i10 * i11) + ((i11 - b9) >> 1);
        int nextInt = this.f11312d.nextInt(21) - 10;
        int i13 = a9 / 3;
        int nextInt2 = this.f11312d.nextInt(i13) + i13;
        if (i9 > 0 && (f2 = this.f11314g.get(Integer.valueOf(i4 - this.f11317k))) != null) {
            float floatValue = f2.floatValue() + nextInt2 + nextInt;
            aVar.f11324b = floatValue;
            if ((this.f11320n - floatValue) - b() < a9) {
                if (this.f11315h == null) {
                    this.f11315h = new ArrayList();
                }
                this.f11315h.add(Integer.valueOf(i));
            }
        }
        if (aVar.f11324b == 0.0f) {
            aVar.f11324b = (i9 * i12) + nextInt2 + nextInt;
        }
        float f9 = a9;
        if (aVar.f11324b + f9 > this.f11320n) {
            aVar.f11324b = (r3 - a9) - b();
        }
        if (aVar.f11324b < 0.0f) {
            aVar.f11324b = a9 >> 1;
        }
        this.f11314g.put(Integer.valueOf(i4), Float.valueOf(aVar.f11324b + f9));
    }
}
