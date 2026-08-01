package S0;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class f extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public k f1062a;

    /* renamed from: b, reason: collision with root package name */
    public K0.a f1063b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f1064c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f1065d;
    public ColorStateList e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f1066f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f1067g;

    /* renamed from: h, reason: collision with root package name */
    public final float f1068h;
    public float i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public int f1069k;

    /* renamed from: l, reason: collision with root package name */
    public float f1070l;

    /* renamed from: m, reason: collision with root package name */
    public float f1071m;

    /* renamed from: n, reason: collision with root package name */
    public int f1072n;

    /* renamed from: o, reason: collision with root package name */
    public int f1073o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint.Style f1074p;

    public f(k kVar) {
        this.f1064c = null;
        this.f1065d = null;
        this.e = null;
        this.f1066f = PorterDuff.Mode.SRC_IN;
        this.f1067g = null;
        this.f1068h = 1.0f;
        this.i = 1.0f;
        this.f1069k = 255;
        this.f1070l = RecyclerView.f2111C0;
        this.f1071m = RecyclerView.f2111C0;
        this.f1072n = 0;
        this.f1073o = 0;
        this.f1074p = Paint.Style.FILL_AND_STROKE;
        this.f1062a = kVar;
        this.f1063b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.e = true;
        return gVar;
    }

    public f(f fVar) {
        this.f1064c = null;
        this.f1065d = null;
        this.e = null;
        this.f1066f = PorterDuff.Mode.SRC_IN;
        this.f1067g = null;
        this.f1068h = 1.0f;
        this.i = 1.0f;
        this.f1069k = 255;
        this.f1070l = RecyclerView.f2111C0;
        this.f1071m = RecyclerView.f2111C0;
        this.f1072n = 0;
        this.f1073o = 0;
        this.f1074p = Paint.Style.FILL_AND_STROKE;
        this.f1062a = fVar.f1062a;
        this.f1063b = fVar.f1063b;
        this.j = fVar.j;
        this.f1064c = fVar.f1064c;
        this.f1065d = fVar.f1065d;
        this.f1066f = fVar.f1066f;
        this.e = fVar.e;
        this.f1069k = fVar.f1069k;
        this.f1068h = fVar.f1068h;
        this.f1073o = fVar.f1073o;
        this.i = fVar.i;
        this.f1070l = fVar.f1070l;
        this.f1071m = fVar.f1071m;
        this.f1072n = fVar.f1072n;
        this.f1074p = fVar.f1074p;
        if (fVar.f1067g != null) {
            this.f1067g = new Rect(fVar.f1067g);
        }
    }
}
