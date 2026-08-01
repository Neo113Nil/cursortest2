package E0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f681a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f682b;

    /* renamed from: c, reason: collision with root package name */
    public float f683c;

    /* renamed from: d, reason: collision with root package name */
    public float f684d;

    /* renamed from: e, reason: collision with root package name */
    public float f685e;

    /* renamed from: f, reason: collision with root package name */
    public float f686f;

    /* renamed from: g, reason: collision with root package name */
    public float f687g;

    /* renamed from: h, reason: collision with root package name */
    public float f688h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f689j;

    /* renamed from: k, reason: collision with root package name */
    public String f690k;

    public j() {
        this.f681a = new Matrix();
        this.f682b = new ArrayList();
        this.f683c = 0.0f;
        this.f684d = 0.0f;
        this.f685e = 0.0f;
        this.f686f = 1.0f;
        this.f687g = 1.0f;
        this.f688h = 0.0f;
        this.i = 0.0f;
        this.f689j = new Matrix();
        this.f690k = null;
    }

    @Override // E0.k
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f682b;
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
        boolean z3 = false;
        while (true) {
            ArrayList arrayList = this.f682b;
            if (i >= arrayList.size()) {
                return z3;
            }
            z3 |= ((k) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.f689j;
        matrix.reset();
        matrix.postTranslate(-this.f684d, -this.f685e);
        matrix.postScale(this.f686f, this.f687g);
        matrix.postRotate(this.f683c, 0.0f, 0.0f);
        matrix.postTranslate(this.f688h + this.f684d, this.i + this.f685e);
    }

    public String getGroupName() {
        return this.f690k;
    }

    public Matrix getLocalMatrix() {
        return this.f689j;
    }

    public float getPivotX() {
        return this.f684d;
    }

    public float getPivotY() {
        return this.f685e;
    }

    public float getRotation() {
        return this.f683c;
    }

    public float getScaleX() {
        return this.f686f;
    }

    public float getScaleY() {
        return this.f687g;
    }

    public float getTranslateX() {
        return this.f688h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f3) {
        if (f3 != this.f684d) {
            this.f684d = f3;
            c();
        }
    }

    public void setPivotY(float f3) {
        if (f3 != this.f685e) {
            this.f685e = f3;
            c();
        }
    }

    public void setRotation(float f3) {
        if (f3 != this.f683c) {
            this.f683c = f3;
            c();
        }
    }

    public void setScaleX(float f3) {
        if (f3 != this.f686f) {
            this.f686f = f3;
            c();
        }
    }

    public void setScaleY(float f3) {
        if (f3 != this.f687g) {
            this.f687g = f3;
            c();
        }
    }

    public void setTranslateX(float f3) {
        if (f3 != this.f688h) {
            this.f688h = f3;
            c();
        }
    }

    public void setTranslateY(float f3) {
        if (f3 != this.i) {
            this.i = f3;
            c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(j jVar, s.b bVar) {
        h hVar;
        this.f681a = new Matrix();
        this.f682b = new ArrayList();
        this.f683c = 0.0f;
        this.f684d = 0.0f;
        this.f685e = 0.0f;
        this.f686f = 1.0f;
        this.f687g = 1.0f;
        this.f688h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.f689j = matrix;
        this.f690k = null;
        this.f683c = jVar.f683c;
        this.f684d = jVar.f684d;
        this.f685e = jVar.f685e;
        this.f686f = jVar.f686f;
        this.f687g = jVar.f687g;
        this.f688h = jVar.f688h;
        this.i = jVar.i;
        String str = jVar.f690k;
        this.f690k = str;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(jVar.f689j);
        ArrayList arrayList = jVar.f682b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof j) {
                this.f682b.add(new j((j) obj, bVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    i iVar2 = new i(iVar);
                    iVar2.f672e = 0.0f;
                    iVar2.f674g = 1.0f;
                    iVar2.f675h = 1.0f;
                    iVar2.i = 0.0f;
                    iVar2.f676j = 1.0f;
                    iVar2.f677k = 0.0f;
                    iVar2.f678l = Paint.Cap.BUTT;
                    iVar2.f679m = Paint.Join.MITER;
                    iVar2.f680n = 4.0f;
                    iVar2.f671d = iVar.f671d;
                    iVar2.f672e = iVar.f672e;
                    iVar2.f674g = iVar.f674g;
                    iVar2.f673f = iVar.f673f;
                    iVar2.f693c = iVar.f693c;
                    iVar2.f675h = iVar.f675h;
                    iVar2.i = iVar.i;
                    iVar2.f676j = iVar.f676j;
                    iVar2.f677k = iVar.f677k;
                    iVar2.f678l = iVar.f678l;
                    iVar2.f679m = iVar.f679m;
                    iVar2.f680n = iVar.f680n;
                    hVar = iVar2;
                } else if (obj instanceof h) {
                    hVar = new h((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f682b.add(hVar);
                Object obj2 = hVar.f692b;
                if (obj2 != null) {
                    bVar.put(obj2, hVar);
                }
            }
        }
    }
}
