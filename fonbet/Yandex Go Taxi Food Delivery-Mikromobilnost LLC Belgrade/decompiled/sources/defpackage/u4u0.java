package defpackage;

import android.util.StateSet;
import com.google.android.material.shape.b;
import com.google.android.material.shape.c;

/* loaded from: classes11.dex */
public final class u4u0 {
    public int a;
    public b b;
    public int[][] c;
    public b[] d;
    public s4u0 e;
    public s4u0 f;
    public s4u0 g;
    public s4u0 h;

    public u4u0(b bVar) {
        c();
        a(StateSet.WILD_CARD, bVar);
    }

    public final void a(int[] iArr, b bVar) {
        int i = this.a;
        if (i == 0 || iArr.length == 0) {
            this.b = bVar;
        }
        int[][] iArr2 = this.c;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            int[][] iArr3 = new int[i2][];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.c = iArr3;
            b[] bVarArr = new b[i2];
            System.arraycopy(this.d, 0, bVarArr, 0, i);
            this.d = bVarArr;
        }
        int[][] iArr4 = this.c;
        int i3 = this.a;
        iArr4[i3] = iArr;
        this.d[i3] = bVar;
        this.a = i3 + 1;
    }

    public final c b() {
        if (this.a == 0) {
            return null;
        }
        return new c(this);
    }

    public final void c() {
        this.b = new b();
        this.c = new int[10][];
        this.d = new b[10];
    }
}
