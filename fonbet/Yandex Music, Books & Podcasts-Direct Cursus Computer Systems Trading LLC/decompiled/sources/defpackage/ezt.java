package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ezt extends fzt {
    public final Matrix a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public String k;

    /* JADX WARN: Multi-variable type inference failed */
    public ezt(ezt eztVar, xy0 xy0Var) {
        czt cztVar;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.k = null;
        this.c = eztVar.c;
        this.d = eztVar.d;
        this.e = eztVar.e;
        this.f = eztVar.f;
        this.g = eztVar.g;
        this.h = eztVar.h;
        this.i = eztVar.i;
        String str = eztVar.k;
        this.k = str;
        if (str != null) {
            xy0Var.put(str, this);
        }
        matrix.set(eztVar.j);
        ArrayList arrayList = eztVar.b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof ezt) {
                this.b.add(new ezt((ezt) obj, xy0Var));
            } else {
                if (obj instanceof dzt) {
                    dzt dztVar = (dzt) obj;
                    dzt dztVar2 = new dzt(dztVar);
                    dztVar2.e = 0.0f;
                    dztVar2.g = 1.0f;
                    dztVar2.h = 1.0f;
                    dztVar2.i = 0.0f;
                    dztVar2.j = 1.0f;
                    dztVar2.k = 0.0f;
                    dztVar2.l = Paint.Cap.BUTT;
                    dztVar2.m = Paint.Join.MITER;
                    dztVar2.n = 4.0f;
                    dztVar2.d = dztVar.d;
                    dztVar2.e = dztVar.e;
                    dztVar2.g = dztVar.g;
                    dztVar2.f = dztVar.f;
                    dztVar2.c = dztVar.c;
                    dztVar2.h = dztVar.h;
                    dztVar2.i = dztVar.i;
                    dztVar2.j = dztVar.j;
                    dztVar2.k = dztVar.k;
                    dztVar2.l = dztVar.l;
                    dztVar2.m = dztVar.m;
                    dztVar2.n = dztVar.n;
                    cztVar = dztVar2;
                } else {
                    if (!(obj instanceof czt)) {
                        xq0.q("Unknown object in the tree!");
                        throw null;
                    }
                    cztVar = new czt((czt) obj);
                }
                this.b.add(cztVar);
                Object obj2 = cztVar.b;
                if (obj2 != null) {
                    xy0Var.put(obj2, cztVar);
                }
            }
        }
    }

    @Override // defpackage.fzt
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((fzt) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.fzt
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return z;
            }
            z |= ((fzt) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    public String getGroupName() {
        return this.k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            c();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            c();
        }
    }

    public ezt() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.k = null;
    }
}
