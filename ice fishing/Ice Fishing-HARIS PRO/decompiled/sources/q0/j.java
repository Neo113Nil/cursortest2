package q0;

import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import r.C0338f;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f4258a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4259b;

    /* renamed from: c, reason: collision with root package name */
    public float f4260c;

    /* renamed from: d, reason: collision with root package name */
    public float f4261d;
    public float e;

    /* renamed from: f, reason: collision with root package name */
    public float f4262f;

    /* renamed from: g, reason: collision with root package name */
    public float f4263g;

    /* renamed from: h, reason: collision with root package name */
    public float f4264h;
    public float i;
    public final Matrix j;

    /* renamed from: k, reason: collision with root package name */
    public String f4265k;

    public j() {
        this.f4258a = new Matrix();
        this.f4259b = new ArrayList();
        this.f4260c = RecyclerView.f2111C0;
        this.f4261d = RecyclerView.f2111C0;
        this.e = RecyclerView.f2111C0;
        this.f4262f = 1.0f;
        this.f4263g = 1.0f;
        this.f4264h = RecyclerView.f2111C0;
        this.i = RecyclerView.f2111C0;
        this.j = new Matrix();
        this.f4265k = null;
    }

    @Override // q0.k
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4259b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((k) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // q0.k
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.f4259b;
            if (i >= arrayList.size()) {
                return z2;
            }
            z2 |= ((k) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.f4261d, -this.e);
        matrix.postScale(this.f4262f, this.f4263g);
        matrix.postRotate(this.f4260c, RecyclerView.f2111C0, RecyclerView.f2111C0);
        matrix.postTranslate(this.f4264h + this.f4261d, this.i + this.e);
    }

    public String getGroupName() {
        return this.f4265k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.f4261d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f4260c;
    }

    public float getScaleX() {
        return this.f4262f;
    }

    public float getScaleY() {
        return this.f4263g;
    }

    public float getTranslateX() {
        return this.f4264h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f2) {
        if (f2 != this.f4261d) {
            this.f4261d = f2;
            c();
        }
    }

    public void setPivotY(float f2) {
        if (f2 != this.e) {
            this.e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f4260c) {
            this.f4260c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f4262f) {
            this.f4262f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f4263g) {
            this.f4263g = f2;
            c();
        }
    }

    public void setTranslateX(float f2) {
        if (f2 != this.f4264h) {
            this.f4264h = f2;
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
    public j(j jVar, C0338f c0338f) {
        h hVar;
        this.f4258a = new Matrix();
        this.f4259b = new ArrayList();
        this.f4260c = RecyclerView.f2111C0;
        this.f4261d = RecyclerView.f2111C0;
        this.e = RecyclerView.f2111C0;
        this.f4262f = 1.0f;
        this.f4263g = 1.0f;
        this.f4264h = RecyclerView.f2111C0;
        this.i = RecyclerView.f2111C0;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.f4265k = null;
        this.f4260c = jVar.f4260c;
        this.f4261d = jVar.f4261d;
        this.e = jVar.e;
        this.f4262f = jVar.f4262f;
        this.f4263g = jVar.f4263g;
        this.f4264h = jVar.f4264h;
        this.i = jVar.i;
        String str = jVar.f4265k;
        this.f4265k = str;
        if (str != null) {
            c0338f.put(str, this);
        }
        matrix.set(jVar.j);
        ArrayList arrayList = jVar.f4259b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof j) {
                this.f4259b.add(new j((j) obj, c0338f));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    i iVar2 = new i(iVar);
                    iVar2.e = RecyclerView.f2111C0;
                    iVar2.f4252g = 1.0f;
                    iVar2.f4253h = 1.0f;
                    iVar2.i = RecyclerView.f2111C0;
                    iVar2.j = 1.0f;
                    iVar2.f4254k = RecyclerView.f2111C0;
                    iVar2.f4255l = Paint.Cap.BUTT;
                    iVar2.f4256m = Paint.Join.MITER;
                    iVar2.f4257n = 4.0f;
                    iVar2.f4250d = iVar.f4250d;
                    iVar2.e = iVar.e;
                    iVar2.f4252g = iVar.f4252g;
                    iVar2.f4251f = iVar.f4251f;
                    iVar2.f4268c = iVar.f4268c;
                    iVar2.f4253h = iVar.f4253h;
                    iVar2.i = iVar.i;
                    iVar2.j = iVar.j;
                    iVar2.f4254k = iVar.f4254k;
                    iVar2.f4255l = iVar.f4255l;
                    iVar2.f4256m = iVar.f4256m;
                    iVar2.f4257n = iVar.f4257n;
                    hVar = iVar2;
                } else if (obj instanceof h) {
                    hVar = new h((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f4259b.add(hVar);
                Object obj2 = hVar.f4267b;
                if (obj2 != null) {
                    c0338f.put(obj2, hVar);
                }
            }
        }
    }
}
