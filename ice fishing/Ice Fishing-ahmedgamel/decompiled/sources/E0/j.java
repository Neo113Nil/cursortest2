package E0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f661a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f662b;

    /* renamed from: c, reason: collision with root package name */
    public float f663c;

    /* renamed from: d, reason: collision with root package name */
    public float f664d;

    /* renamed from: e, reason: collision with root package name */
    public float f665e;

    /* renamed from: f, reason: collision with root package name */
    public float f666f;

    /* renamed from: g, reason: collision with root package name */
    public float f667g;

    /* renamed from: h, reason: collision with root package name */
    public float f668h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f669j;

    /* renamed from: k, reason: collision with root package name */
    public String f670k;

    public j() {
        this.f661a = new Matrix();
        this.f662b = new ArrayList();
        this.f663c = 0.0f;
        this.f664d = 0.0f;
        this.f665e = 0.0f;
        this.f666f = 1.0f;
        this.f667g = 1.0f;
        this.f668h = 0.0f;
        this.i = 0.0f;
        this.f669j = new Matrix();
        this.f670k = null;
    }

    @Override // E0.k
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f662b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((k) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // E0.k
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z6 = false;
        while (true) {
            ArrayList arrayList = this.f662b;
            if (i >= arrayList.size()) {
                return z6;
            }
            z6 |= ((k) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.f669j;
        matrix.reset();
        matrix.postTranslate(-this.f664d, -this.f665e);
        matrix.postScale(this.f666f, this.f667g);
        matrix.postRotate(this.f663c, 0.0f, 0.0f);
        matrix.postTranslate(this.f668h + this.f664d, this.i + this.f665e);
    }

    public String getGroupName() {
        return this.f670k;
    }

    public Matrix getLocalMatrix() {
        return this.f669j;
    }

    public float getPivotX() {
        return this.f664d;
    }

    public float getPivotY() {
        return this.f665e;
    }

    public float getRotation() {
        return this.f663c;
    }

    public float getScaleX() {
        return this.f666f;
    }

    public float getScaleY() {
        return this.f667g;
    }

    public float getTranslateX() {
        return this.f668h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f2) {
        if (f2 != this.f664d) {
            this.f664d = f2;
            c();
        }
    }

    public void setPivotY(float f2) {
        if (f2 != this.f665e) {
            this.f665e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f663c) {
            this.f663c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f666f) {
            this.f666f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f667g) {
            this.f667g = f2;
            c();
        }
    }

    public void setTranslateX(float f2) {
        if (f2 != this.f668h) {
            this.f668h = f2;
            c();
        }
    }

    public void setTranslateY(float f2) {
        if (f2 != this.i) {
            this.i = f2;
            c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(j jVar, s.b bVar) {
        h hVar;
        this.f661a = new Matrix();
        this.f662b = new ArrayList();
        this.f663c = 0.0f;
        this.f664d = 0.0f;
        this.f665e = 0.0f;
        this.f666f = 1.0f;
        this.f667g = 1.0f;
        this.f668h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.f669j = matrix;
        this.f670k = null;
        this.f663c = jVar.f663c;
        this.f664d = jVar.f664d;
        this.f665e = jVar.f665e;
        this.f666f = jVar.f666f;
        this.f667g = jVar.f667g;
        this.f668h = jVar.f668h;
        this.i = jVar.i;
        String str = jVar.f670k;
        this.f670k = str;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(jVar.f669j);
        ArrayList arrayList = jVar.f662b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof j) {
                this.f662b.add(new j((j) obj, bVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    i iVar2 = new i(iVar);
                    iVar2.f652e = 0.0f;
                    iVar2.f654g = 1.0f;
                    iVar2.f655h = 1.0f;
                    iVar2.i = 0.0f;
                    iVar2.f656j = 1.0f;
                    iVar2.f657k = 0.0f;
                    iVar2.f658l = Paint.Cap.BUTT;
                    iVar2.f659m = Paint.Join.MITER;
                    iVar2.f660n = 4.0f;
                    iVar2.f651d = iVar.f651d;
                    iVar2.f652e = iVar.f652e;
                    iVar2.f654g = iVar.f654g;
                    iVar2.f653f = iVar.f653f;
                    iVar2.f673c = iVar.f673c;
                    iVar2.f655h = iVar.f655h;
                    iVar2.i = iVar.i;
                    iVar2.f656j = iVar.f656j;
                    iVar2.f657k = iVar.f657k;
                    iVar2.f658l = iVar.f658l;
                    iVar2.f659m = iVar.f659m;
                    iVar2.f660n = iVar.f660n;
                    hVar = iVar2;
                } else if (obj instanceof h) {
                    hVar = new h((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f662b.add(hVar);
                Object obj2 = hVar.f672b;
                if (obj2 != null) {
                    bVar.put(obj2, hVar);
                }
            }
        }
    }
}
