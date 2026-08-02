package defpackage;

import android.os.Build;
import android.view.View;
import androidx.core.view.b;
import java.io.Serializable;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes9.dex */
public abstract class uf00 {
    public int a;
    public int b;
    public int c;
    public final Serializable w;

    public uf00(MapBuilder mapBuilder) {
        int i;
        this.w = mapBuilder;
        this.b = -1;
        i = mapBuilder.modCount;
        this.c = i;
        d();
    }

    public void a() {
        int i;
        i = ((MapBuilder) this.w).modCount;
        if (i == this.c) {
            return;
        }
        ny61.y();
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d() {
        int[] iArr;
        MapBuilder mapBuilder = (MapBuilder) this.w;
        while (this.a < mapBuilder.length) {
            iArr = mapBuilder.presenceArray;
            int i = this.a;
            if (iArr[i] >= 0) {
                return;
            } else {
                this.a = i + 1;
            }
        }
    }

    public void e(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.a);
            if (!((Class) this.w).isInstance(tag)) {
                tag = null;
            }
        }
        if (f(tag, obj)) {
            b.e(view);
            view.setTag(this.a, obj);
            b.j(this.c, view);
        }
    }

    public abstract boolean f(Object obj, Object obj2);

    public boolean hasNext() {
        return this.a < ((MapBuilder) this.w).length;
    }

    public void remove() {
        int i;
        MapBuilder mapBuilder = (MapBuilder) this.w;
        a();
        if (this.b == -1) {
            ny61.r("Call next() before removing element from the iterator.");
            return;
        }
        mapBuilder.k();
        mapBuilder.v(this.b);
        this.b = -1;
        i = mapBuilder.modCount;
        this.c = i;
    }

    public uf00(int i, Class cls, int i2, int i3) {
        this.a = i;
        this.w = cls;
        this.c = i2;
        this.b = i3;
    }
}
