package D3;

import G.c;
import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: classes2.dex */
public final class a {
    public static final int[] i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f635j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f636k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f637l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f638a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f639b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f640c;

    /* renamed from: d, reason: collision with root package name */
    public final int f641d;

    /* renamed from: e, reason: collision with root package name */
    public final int f642e;

    /* renamed from: f, reason: collision with root package name */
    public final int f643f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f644g = new Path();

    /* renamed from: h, reason: collision with root package name */
    public final Paint f645h;

    public a() {
        Paint paint = new Paint();
        this.f645h = paint;
        Paint paint2 = new Paint();
        this.f638a = paint2;
        this.f641d = c.d(-16777216, 68);
        this.f642e = c.d(-16777216, 20);
        this.f643f = c.d(-16777216, 0);
        paint2.setColor(this.f641d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f639b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f640c = new Paint(paint3);
    }
}
