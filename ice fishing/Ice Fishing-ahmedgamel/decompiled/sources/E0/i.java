package E0;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* loaded from: classes.dex */
public final class i extends l {

    /* renamed from: d, reason: collision with root package name */
    public F.d f651d;

    /* renamed from: e, reason: collision with root package name */
    public float f652e;

    /* renamed from: f, reason: collision with root package name */
    public F.d f653f;

    /* renamed from: g, reason: collision with root package name */
    public float f654g;

    /* renamed from: h, reason: collision with root package name */
    public float f655h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f656j;

    /* renamed from: k, reason: collision with root package name */
    public float f657k;

    /* renamed from: l, reason: collision with root package name */
    public Paint.Cap f658l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Join f659m;

    /* renamed from: n, reason: collision with root package name */
    public float f660n;

    @Override // E0.k
    public final boolean a() {
        return this.f653f.g() || this.f651d.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // E0.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int[] iArr) {
        boolean z6;
        F.d dVar;
        F.d dVar2 = this.f653f;
        boolean z9 = false;
        if (dVar2.g()) {
            ColorStateList colorStateList = (ColorStateList) dVar2.f919d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != dVar2.f917b) {
                dVar2.f917b = colorForState;
                z6 = true;
                dVar = this.f651d;
                if (dVar.g()) {
                    ColorStateList colorStateList2 = (ColorStateList) dVar.f919d;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != dVar.f917b) {
                        dVar.f917b = colorForState2;
                        z9 = true;
                    }
                }
                return z6 | z9;
            }
        }
        z6 = false;
        dVar = this.f651d;
        if (dVar.g()) {
        }
        return z6 | z9;
    }

    public float getFillAlpha() {
        return this.f655h;
    }

    public int getFillColor() {
        return this.f653f.f917b;
    }

    public float getStrokeAlpha() {
        return this.f654g;
    }

    public int getStrokeColor() {
        return this.f651d.f917b;
    }

    public float getStrokeWidth() {
        return this.f652e;
    }

    public float getTrimPathEnd() {
        return this.f656j;
    }

    public float getTrimPathOffset() {
        return this.f657k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float f2) {
        this.f655h = f2;
    }

    public void setFillColor(int i) {
        this.f653f.f917b = i;
    }

    public void setStrokeAlpha(float f2) {
        this.f654g = f2;
    }

    public void setStrokeColor(int i) {
        this.f651d.f917b = i;
    }

    public void setStrokeWidth(float f2) {
        this.f652e = f2;
    }

    public void setTrimPathEnd(float f2) {
        this.f656j = f2;
    }

    public void setTrimPathOffset(float f2) {
        this.f657k = f2;
    }

    public void setTrimPathStart(float f2) {
        this.i = f2;
    }
}
