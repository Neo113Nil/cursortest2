package E0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f761a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f762b;

    /* renamed from: c, reason: collision with root package name */
    public float f763c;

    /* renamed from: d, reason: collision with root package name */
    public float f764d;

    /* renamed from: e, reason: collision with root package name */
    public float f765e;

    /* renamed from: f, reason: collision with root package name */
    public float f766f;

    /* renamed from: g, reason: collision with root package name */
    public float f767g;

    /* renamed from: h, reason: collision with root package name */
    public float f768h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f769j;

    /* renamed from: k, reason: collision with root package name */
    public String f770k;

    public j() {
        this.f761a = new Matrix();
        this.f762b = new ArrayList();
        this.f763c = 0.0f;
        this.f764d = 0.0f;
        this.f765e = 0.0f;
        this.f766f = 1.0f;
        this.f767g = 1.0f;
        this.f768h = 0.0f;
        this.i = 0.0f;
        this.f769j = new Matrix();
        this.f770k = null;
    }

    @Override // E0.k
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f762b;
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
        boolean z8 = false;
        while (true) {
            ArrayList arrayList = this.f762b;
            if (i >= arrayList.size()) {
                return z8;
            }
            z8 |= ((k) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.f769j;
        matrix.reset();
        matrix.postTranslate(-this.f764d, -this.f765e);
        matrix.postScale(this.f766f, this.f767g);
        matrix.postRotate(this.f763c, 0.0f, 0.0f);
        matrix.postTranslate(this.f768h + this.f764d, this.i + this.f765e);
    }

    public String getGroupName() {
        return this.f770k;
    }

    public Matrix getLocalMatrix() {
        return this.f769j;
    }

    public float getPivotX() {
        return this.f764d;
    }

    public float getPivotY() {
        return this.f765e;
    }

    public float getRotation() {
        return this.f763c;
    }

    public float getScaleX() {
        return this.f766f;
    }

    public float getScaleY() {
        return this.f767g;
    }

    public float getTranslateX() {
        return this.f768h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f6) {
        if (f6 != this.f764d) {
            this.f764d = f6;
            c();
        }
    }

    public void setPivotY(float f6) {
        if (f6 != this.f765e) {
            this.f765e = f6;
            c();
        }
    }

    public void setRotation(float f6) {
        if (f6 != this.f763c) {
            this.f763c = f6;
            c();
        }
    }

    public void setScaleX(float f6) {
        if (f6 != this.f766f) {
            this.f766f = f6;
            c();
        }
    }

    public void setScaleY(float f6) {
        if (f6 != this.f767g) {
            this.f767g = f6;
            c();
        }
    }

    public void setTranslateX(float f6) {
        if (f6 != this.f768h) {
            this.f768h = f6;
            c();
        }
    }

    public void setTranslateY(float f6) {
        if (f6 != this.i) {
            this.i = f6;
            c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(j jVar, s.b bVar) {
        h hVar;
        this.f761a = new Matrix();
        this.f762b = new ArrayList();
        this.f763c = 0.0f;
        this.f764d = 0.0f;
        this.f765e = 0.0f;
        this.f766f = 1.0f;
        this.f767g = 1.0f;
        this.f768h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.f769j = matrix;
        this.f770k = null;
        this.f763c = jVar.f763c;
        this.f764d = jVar.f764d;
        this.f765e = jVar.f765e;
        this.f766f = jVar.f766f;
        this.f767g = jVar.f767g;
        this.f768h = jVar.f768h;
        this.i = jVar.i;
        String str = jVar.f770k;
        this.f770k = str;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(jVar.f769j);
        ArrayList arrayList = jVar.f762b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof j) {
                this.f762b.add(new j((j) obj, bVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    i iVar2 = new i(iVar);
                    iVar2.f752e = 0.0f;
                    iVar2.f754g = 1.0f;
                    iVar2.f755h = 1.0f;
                    iVar2.i = 0.0f;
                    iVar2.f756j = 1.0f;
                    iVar2.f757k = 0.0f;
                    iVar2.f758l = Paint.Cap.BUTT;
                    iVar2.f759m = Paint.Join.MITER;
                    iVar2.f760n = 4.0f;
                    iVar2.f751d = iVar.f751d;
                    iVar2.f752e = iVar.f752e;
                    iVar2.f754g = iVar.f754g;
                    iVar2.f753f = iVar.f753f;
                    iVar2.f773c = iVar.f773c;
                    iVar2.f755h = iVar.f755h;
                    iVar2.i = iVar.i;
                    iVar2.f756j = iVar.f756j;
                    iVar2.f757k = iVar.f757k;
                    iVar2.f758l = iVar.f758l;
                    iVar2.f759m = iVar.f759m;
                    iVar2.f760n = iVar.f760n;
                    hVar = iVar2;
                } else if (obj instanceof h) {
                    hVar = new h((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f762b.add(hVar);
                Object obj2 = hVar.f772b;
                if (obj2 != null) {
                    bVar.put(obj2, hVar);
                }
            }
        }
    }
}
