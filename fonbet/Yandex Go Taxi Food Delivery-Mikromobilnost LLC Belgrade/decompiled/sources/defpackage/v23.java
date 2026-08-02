package defpackage;

import android.view.View;
import androidx.core.view.b;
import androidx.core.view.e;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes11.dex */
public final class v23 extends e {
    public u1w a;
    public u1w b;
    public u1w c;
    public u1w w;
    public float x;
    public final /* synthetic */ View y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v23(View view, int i) {
        super(0);
        this.y = view;
        this.z = i;
        u1w u1wVar = u1w.e;
        this.a = u1wVar;
        this.b = u1wVar;
        this.c = u1wVar;
        this.w = u1wVar;
    }

    @Override // androidx.core.view.e
    public final void onEnd(u651 u651Var) {
        this.y.setTranslationY(this.x);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r0 == null) goto L6;
     */
    @Override // androidx.core.view.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onPrepare(u651 u651Var) {
        u1w u1wVar;
        WeakHashMap weakHashMap = b.a;
        View view = this.y;
        n751 a = op31.a(view);
        if (a != null) {
            u1wVar = a.a.g(this.z);
        }
        u1wVar = u1w.e;
        this.a = u1wVar;
        this.x = view.getTranslationY();
    }

    @Override // androidx.core.view.e
    public final n751 onProgress(n751 n751Var, List list) {
        Object obj;
        float f;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if ((((u651) obj).a.d() & 8) != 0) {
                break;
            }
        }
        u651 u651Var = (u651) obj;
        if (u651Var != null) {
            t651 t651Var = u651Var.a;
            float f2 = this.x;
            int i = this.b.d;
            int i2 = this.a.d;
            if (i > i2) {
                f = (1.0f - t651Var.c()) * this.c.d;
                float f3 = this.c.d;
                float f4 = f3 - f;
                float f5 = this.w.d;
                if (f4 <= f5) {
                    f = f3 - f5;
                }
            } else {
                if (i < i2) {
                    float c = (1.0f - t651Var.c()) * this.c.d;
                    float f6 = this.w.d;
                    if (c > f6) {
                        f = f6 - c;
                    }
                }
                f = 0.0f;
            }
            this.y.setTranslationY(f2 + f);
        }
        return n751Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r2 == null) goto L6;
     */
    @Override // androidx.core.view.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q651 onStart(u651 u651Var, q651 q651Var) {
        u1w u1wVar;
        WeakHashMap weakHashMap = b.a;
        n751 a = op31.a(this.y);
        if (a != null) {
            u1wVar = a.a.g(this.z);
        }
        u1wVar = u1w.e;
        this.b = u1wVar;
        this.c = u1w.a(this.a, u1wVar);
        this.w = u1w.b(this.a, this.b);
        return q651Var;
    }
}
