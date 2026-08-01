package R0;

import android.graphics.Paint;
import android.graphics.Path;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class a {
    public static final int[] i = new int[3];
    public static final float[] j = {RecyclerView.f2111C0, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f1010k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f1011l = {RecyclerView.f2111C0, RecyclerView.f2111C0, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f1012a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f1013b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f1014c;

    /* renamed from: d, reason: collision with root package name */
    public int f1015d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f1016f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f1017g = new Path();

    /* renamed from: h, reason: collision with root package name */
    public final Paint f1018h;

    public a() {
        Paint paint = new Paint();
        this.f1018h = paint;
        this.f1012a = new Paint();
        a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f1013b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f1014c = new Paint(paint2);
    }

    public final void a(int i2) {
        this.f1015d = G.a.d(i2, 68);
        this.e = G.a.d(i2, 20);
        this.f1016f = G.a.d(i2, 0);
        this.f1012a.setColor(this.f1015d);
    }
}
