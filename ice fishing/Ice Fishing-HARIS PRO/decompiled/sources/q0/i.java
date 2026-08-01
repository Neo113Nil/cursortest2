package q0;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* loaded from: classes.dex */
public final class i extends l {

    /* renamed from: d, reason: collision with root package name */
    public F.d f4250d;
    public float e;

    /* renamed from: f, reason: collision with root package name */
    public F.d f4251f;

    /* renamed from: g, reason: collision with root package name */
    public float f4252g;

    /* renamed from: h, reason: collision with root package name */
    public float f4253h;
    public float i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public float f4254k;

    /* renamed from: l, reason: collision with root package name */
    public Paint.Cap f4255l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Join f4256m;

    /* renamed from: n, reason: collision with root package name */
    public float f4257n;

    @Override // q0.k
    public final boolean a() {
        return this.f4251f.c() || this.f4250d.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // q0.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int[] iArr) {
        boolean z2;
        F.d dVar;
        F.d dVar2 = this.f4251f;
        boolean z3 = false;
        if (dVar2.c()) {
            ColorStateList colorStateList = (ColorStateList) dVar2.f196c;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != dVar2.f194a) {
                dVar2.f194a = colorForState;
                z2 = true;
                dVar = this.f4250d;
                if (dVar.c()) {
                    ColorStateList colorStateList2 = (ColorStateList) dVar.f196c;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != dVar.f194a) {
                        dVar.f194a = colorForState2;
                        z3 = true;
                    }
                }
                return z2 | z3;
            }
        }
        z2 = false;
        dVar = this.f4250d;
        if (dVar.c()) {
        }
        return z2 | z3;
    }

    public float getFillAlpha() {
        return this.f4253h;
    }

    public int getFillColor() {
        return this.f4251f.f194a;
    }

    public float getStrokeAlpha() {
        return this.f4252g;
    }

    public int getStrokeColor() {
        return this.f4250d.f194a;
    }

    public float getStrokeWidth() {
        return this.e;
    }

    public float getTrimPathEnd() {
        return this.j;
    }

    public float getTrimPathOffset() {
        return this.f4254k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float f2) {
        this.f4253h = f2;
    }

    public void setFillColor(int i) {
        this.f4251f.f194a = i;
    }

    public void setStrokeAlpha(float f2) {
        this.f4252g = f2;
    }

    public void setStrokeColor(int i) {
        this.f4250d.f194a = i;
    }

    public void setStrokeWidth(float f2) {
        this.e = f2;
    }

    public void setTrimPathEnd(float f2) {
        this.j = f2;
    }

    public void setTrimPathOffset(float f2) {
        this.f4254k = f2;
    }

    public void setTrimPathStart(float f2) {
        this.i = f2;
    }
}
