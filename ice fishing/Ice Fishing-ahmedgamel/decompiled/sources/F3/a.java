package F3;

import G.c;
import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: classes2.dex */
public final class a {
    public static final int[] i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f979j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f980k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f981l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f982a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f983b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f984c;

    /* renamed from: d, reason: collision with root package name */
    public final int f985d;

    /* renamed from: e, reason: collision with root package name */
    public final int f986e;

    /* renamed from: f, reason: collision with root package name */
    public final int f987f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f988g = new Path();

    /* renamed from: h, reason: collision with root package name */
    public final Paint f989h;

    public a() {
        Paint paint = new Paint();
        this.f989h = paint;
        Paint paint2 = new Paint();
        this.f982a = paint2;
        this.f985d = c.d(-16777216, 68);
        this.f986e = c.d(-16777216, 20);
        this.f987f = c.d(-16777216, 0);
        paint2.setColor(this.f985d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f983b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f984c = new Paint(paint3);
    }
}
