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
    private static final int f10679e = 400;

    /* renamed from: a, reason: collision with root package name */
    protected double f10680a;

    /* renamed from: b, reason: collision with root package name */
    protected double f10681b;

    /* renamed from: c, reason: collision with root package name */
    protected final List<a> f10682c;

    /* renamed from: d, reason: collision with root package name */
    Random f10683d;

    /* renamed from: f, reason: collision with root package name */
    private final Matrix f10684f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<Integer, Float> f10685g;

    /* renamed from: h, reason: collision with root package name */
    private List<Integer> f10686h;
    private Paint i;

    /* renamed from: j, reason: collision with root package name */
    private int f10687j;

    /* renamed from: k, reason: collision with root package name */
    private int f10688k;

    /* renamed from: l, reason: collision with root package name */
    private int f10689l;

    /* renamed from: m, reason: collision with root package name */
    private int f10690m;

    /* renamed from: n, reason: collision with root package name */
    private int f10691n;

    /* renamed from: o, reason: collision with root package name */
    private Bitmap f10692o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f10693p;

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
        this.f10683d = new Random(System.currentTimeMillis());
    }

    private a b(Bitmap bitmap) {
        return new a(getContext(), bitmap, this.f10680a, this.f10681b, this.f10690m);
    }

    public void initRedPacketList(Bitmap bitmap) {
        Float f6;
        this.f10692o = bitmap;
        if (this.f10693p) {
            return;
        }
        this.f10693p = true;
        if (bitmap == null) {
            try {
                this.f10692o = BitmapFactory.decodeResource(getResources(), q.a(getContext(), "myoffer_icon_red_packet", k.f19790c));
            } catch (Exception e6) {
                Log.e(TAG, "initRedPacketList failed: " + e6.getMessage());
            }
        }
        if (this.f10692o == null) {
            Log.e(TAG, "redPacketBitmap is null, decodeResource failed.");
            return;
        }
        int height = (int) (this.f10691n / (((this.f10690m * this.f10681b) * r13.getHeight()) / r13.getWidth()));
        this.f10689l = height;
        this.f10688k = 3;
        int i = (height * 12) / 9;
        this.f10687j = i;
        if (i <= 0 || height <= 0) {
            return;
        }
        this.f10682c.clear();
        for (int i4 = 0; i4 < this.f10687j; i4++) {
            a aVar = new a(getContext(), this.f10692o, this.f10680a, this.f10681b, this.f10690m);
            if (aVar.b() > 0 && aVar.a() > 0) {
                int i9 = i4 % 4;
                if (i9 == 0) {
                    i9 = (i4 / 4) * 9;
                } else if (i9 == 1) {
                    i9 = ((i4 / 4) * 9) + 2;
                } else if (i9 == 2) {
                    i9 = ((i4 / 4) * 9) + 4;
                } else if (i9 == 3) {
                    i9 = ((i4 / 4) * 9) + 8;
                }
                int i10 = this.f10688k;
                int i11 = i9 / i10;
                int i12 = i9 % i10;
                int i13 = this.f10690m / i10;
                int i14 = this.f10691n / this.f10689l;
                int b9 = aVar.b();
                int a9 = aVar.a();
                aVar.f10694a = (i12 * i13) + ((i13 - b9) >> 1);
                int nextInt = this.f10683d.nextInt(21) - 10;
                int nextInt2 = this.f10683d.nextInt(a9 / 3) + (a9 / 3);
                if (i11 > 0 && (f6 = this.f10685g.get(Integer.valueOf(i9 - this.f10688k))) != null) {
                    float floatValue = f6.floatValue() + nextInt2 + nextInt;
                    aVar.f10695b = floatValue;
                    if ((this.f10691n - floatValue) - b() < a9) {
                        if (this.f10686h == null) {
                            this.f10686h = new ArrayList();
                        }
                        this.f10686h.add(Integer.valueOf(i4));
                    }
                }
                if (aVar.f10695b == 0.0f) {
                    aVar.f10695b = (i11 * i14) + nextInt2 + nextInt;
                }
                float f9 = a9;
                if (aVar.f10695b + f9 > this.f10691n) {
                    aVar.f10695b = (r7 - a9) - b();
                }
                if (aVar.f10695b < 0.0f) {
                    aVar.f10695b = a9 >> 1;
                }
                this.f10685g.put(Integer.valueOf(i9), Float.valueOf(aVar.f10695b + f9));
            }
            this.f10682c.add(aVar);
        }
        List<Integer> list = this.f10686h;
        if (list != null && list.size() > 0) {
            Iterator<Integer> it = this.f10686h.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (intValue >= 0 && intValue < this.f10682c.size()) {
                    a aVar2 = this.f10682c.get(intValue);
                    if (aVar2 != null) {
                        aVar2.d();
                    }
                    this.f10682c.remove(intValue);
                }
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        a next;
        Bitmap c4;
        super.onDraw(canvas);
        Iterator<a> it = this.f10682c.iterator();
        while (it.hasNext() && (c4 = (next = it.next()).c()) != null) {
            this.f10684f.setTranslate((-next.b()) >> 1, (-next.a()) >> 1);
            this.f10684f.postRotate(next.e());
            this.f10684f.postTranslate((next.b() >> 1) + next.f10694a, (next.a() >> 1) + next.f10695b);
            canvas.drawBitmap(c4, this.f10684f, this.i);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        this.f10690m = getMeasuredWidth();
        this.f10691n = getMeasuredHeight();
    }

    public void release() {
        this.f10693p = false;
        try {
            Bitmap bitmap = this.f10692o;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f10692o.recycle();
            }
            Iterator<a> it = this.f10682c.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
            this.f10682c.clear();
            Map<Integer, Float> map = this.f10685g;
            if (map != null) {
                map.clear();
            }
            List<Integer> list = this.f10686h;
            if (list != null) {
                list.clear();
            }
        } catch (Exception e6) {
            Log.e(TAG, "release failed: " + e6.getMessage());
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
        this.f10680a = 0.15d;
        this.f10681b = 0.2d;
        this.f10684f = new Matrix();
        this.f10682c = new ArrayList();
        this.f10685g = new HashMap();
        Paint paint = new Paint();
        this.i = paint;
        paint.setFilterBitmap(true);
        this.i.setDither(true);
        this.i.setAntiAlias(true);
        setLayerType(2, null);
        this.f10683d = new Random(System.currentTimeMillis());
    }

    private void a(Canvas canvas) {
        a next;
        Bitmap c4;
        Iterator<a> it = this.f10682c.iterator();
        while (it.hasNext() && (c4 = (next = it.next()).c()) != null) {
            this.f10684f.setTranslate((-next.b()) >> 1, (-next.a()) >> 1);
            this.f10684f.postRotate(next.e());
            this.f10684f.postTranslate((next.b() >> 1) + next.f10694a, (next.a() >> 1) + next.f10695b);
            canvas.drawBitmap(c4, this.f10684f, this.i);
        }
    }

    private void a(Bitmap bitmap) {
        int height = (int) (this.f10691n / (((this.f10690m * this.f10681b) * bitmap.getHeight()) / bitmap.getWidth()));
        this.f10689l = height;
        this.f10688k = 3;
        this.f10687j = (height * 12) / 9;
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
        Float f6;
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
        int i9 = this.f10688k;
        int i10 = i4 / i9;
        int i11 = i4 % i9;
        int i12 = this.f10690m / i9;
        int i13 = this.f10691n / this.f10689l;
        int b9 = aVar.b();
        int a9 = aVar.a();
        aVar.f10694a = (i11 * i12) + ((i12 - b9) >> 1);
        int nextInt = this.f10683d.nextInt(21) - 10;
        int i14 = a9 / 3;
        int nextInt2 = this.f10683d.nextInt(i14) + i14;
        if (i10 > 0 && (f6 = this.f10685g.get(Integer.valueOf(i4 - this.f10688k))) != null) {
            float floatValue = f6.floatValue() + nextInt2 + nextInt;
            aVar.f10695b = floatValue;
            if ((this.f10691n - floatValue) - b() < a9) {
                if (this.f10686h == null) {
                    this.f10686h = new ArrayList();
                }
                this.f10686h.add(Integer.valueOf(i));
            }
        }
        if (aVar.f10695b == 0.0f) {
            aVar.f10695b = (i10 * i13) + nextInt2 + nextInt;
        }
        float f9 = a9;
        if (aVar.f10695b + f9 > this.f10691n) {
            aVar.f10695b = (r3 - a9) - b();
        }
        if (aVar.f10695b < 0.0f) {
            aVar.f10695b = a9 >> 1;
        }
        this.f10685g.put(Integer.valueOf(i4), Float.valueOf(aVar.f10695b + f9));
    }
}
