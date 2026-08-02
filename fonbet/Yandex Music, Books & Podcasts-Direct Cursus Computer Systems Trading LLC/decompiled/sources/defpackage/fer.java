package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class fer extends Drawable.ConstantState {
    public PorterDuff.Mode A;
    public boolean B;
    public boolean C;
    public int[][] D;
    public final ger a;
    public Resources b;
    public int c;
    public int d;
    public int e;
    public SparseArray f;
    public Drawable[] g;
    public int h;
    public boolean i;
    public Rect j;
    public boolean k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public boolean p;
    public int q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public boolean w;
    public ColorFilter x;
    public boolean y;
    public ColorStateList z;

    public fer(fer ferVar, ger gerVar, Resources resources) {
        this.u = true;
        this.a = gerVar;
        this.b = resources != null ? resources : ferVar != null ? ferVar.b : null;
        int i = resources != null ? resources.getDisplayMetrics().densityDpi : ferVar != null ? ferVar.c : 0;
        i = i == 0 ? 160 : i;
        this.c = i;
        if (ferVar != null) {
            this.d = ferVar.d;
            this.e = ferVar.e;
            this.s = true;
            this.t = true;
            this.u = ferVar.u;
            this.v = ferVar.v;
            this.w = ferVar.w;
            this.x = ferVar.x;
            this.y = ferVar.y;
            this.z = ferVar.z;
            this.A = ferVar.A;
            this.B = ferVar.B;
            this.C = ferVar.C;
            if (ferVar.c == i) {
                if (ferVar.i) {
                    this.j = ferVar.j != null ? new Rect(ferVar.j) : null;
                    this.i = true;
                }
                if (ferVar.k) {
                    this.l = ferVar.l;
                    this.m = ferVar.m;
                    this.n = ferVar.n;
                    this.o = ferVar.o;
                    this.k = true;
                }
            }
            if (ferVar.p) {
                this.q = ferVar.q;
                this.p = true;
            }
            if (ferVar.r) {
                this.r = true;
            }
            Drawable[] drawableArr = ferVar.g;
            this.g = new Drawable[drawableArr.length];
            this.h = ferVar.h;
            SparseArray sparseArray = ferVar.f;
            if (sparseArray != null) {
                this.f = sparseArray.clone();
            } else {
                this.f = new SparseArray(this.h);
            }
            int i2 = this.h;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f.put(i3, constantState);
                    } else {
                        this.g[i3] = drawableArr[i3];
                    }
                }
            }
        } else {
            this.g = new Drawable[10];
            this.h = 0;
        }
        if (ferVar != null) {
            this.D = ferVar.D;
        } else {
            this.D = new int[this.g.length][];
        }
    }

    public final void a() {
        SparseArray sparseArray = this.f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = this.f.keyAt(i);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f.valueAt(i);
                Drawable[] drawableArr = this.g;
                Drawable newDrawable = constantState.newDrawable(this.b);
                newDrawable.setLayoutDirection(this.v);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.a);
                drawableArr[keyAt] = mutate;
            }
            this.f = null;
        }
    }

    public final Drawable b(int i) {
        int indexOfKey;
        Drawable drawable = this.g[i];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f.valueAt(indexOfKey)).newDrawable(this.b);
        newDrawable.setLayoutDirection(this.v);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.a);
        this.g[i] = mutate;
        this.f.removeAt(indexOfKey);
        if (this.f.size() == 0) {
            this.f = null;
        }
        return mutate;
    }

    public final void c() {
        int[][] iArr = this.D;
        int[][] iArr2 = new int[iArr.length][];
        for (int length = iArr.length - 1; length >= 0; length--) {
            int[] iArr3 = this.D[length];
            iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
        }
        this.D = iArr2;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i = this.h;
        Drawable[] drawableArr = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f.get(i2);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (drawable.canApplyTheme()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.d | this.e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new ger(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new ger(this, resources);
    }
}
