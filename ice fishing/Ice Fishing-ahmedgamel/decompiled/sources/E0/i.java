package E0;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* loaded from: classes.dex */
public final class i extends l {

    /* renamed from: d, reason: collision with root package name */
    public F.d f671d;

    /* renamed from: e, reason: collision with root package name */
    public float f672e;

    /* renamed from: f, reason: collision with root package name */
    public F.d f673f;

    /* renamed from: g, reason: collision with root package name */
    public float f674g;

    /* renamed from: h, reason: collision with root package name */
    public float f675h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f676j;

    /* renamed from: k, reason: collision with root package name */
    public float f677k;

    /* renamed from: l, reason: collision with root package name */
    public Paint.Cap f678l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Join f679m;

    /* renamed from: n, reason: collision with root package name */
    public float f680n;

    @Override // E0.k
    public final boolean a() {
        return this.f673f.g() || this.f671d.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // E0.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int[] iArr) {
        boolean z3;
        F.d dVar;
        F.d dVar2 = this.f673f;
        boolean z6 = false;
        if (dVar2.g()) {
            ColorStateList colorStateList = (ColorStateList) dVar2.f856d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != dVar2.f854b) {
                dVar2.f854b = colorForState;
                z3 = true;
                dVar = this.f671d;
                if (dVar.g()) {
                    ColorStateList colorStateList2 = (ColorStateList) dVar.f856d;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != dVar.f854b) {
                        dVar.f854b = colorForState2;
                        z6 = true;
                    }
                }
                return z3 | z6;
            }
        }
        z3 = false;
        dVar = this.f671d;
        if (dVar.g()) {
        }
        return z3 | z6;
    }

    public float getFillAlpha() {
        return this.f675h;
    }

    public int getFillColor() {
        return this.f673f.f854b;
    }

    public float getStrokeAlpha() {
        return this.f674g;
    }

    public int getStrokeColor() {
        return this.f671d.f854b;
    }

    public float getStrokeWidth() {
        return this.f672e;
    }

    public float getTrimPathEnd() {
        return this.f676j;
    }

    public float getTrimPathOffset() {
        return this.f677k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float f3) {
        this.f675h = f3;
    }

    public void setFillColor(int i) {
        this.f673f.f854b = i;
    }

    public void setStrokeAlpha(float f3) {
        this.f674g = f3;
    }

    public void setStrokeColor(int i) {
        this.f671d.f854b = i;
    }

    public void setStrokeWidth(float f3) {
        this.f672e = f3;
    }

    public void setTrimPathEnd(float f3) {
        this.f676j = f3;
    }

    public void setTrimPathOffset(float f3) {
        this.f677k = f3;
    }

    public void setTrimPathStart(float f3) {
        this.i = f3;
    }
}
