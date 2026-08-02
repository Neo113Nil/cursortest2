package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes11.dex */
public final class uzy {
    public static final nyk0[] d = {a810.d(a810.g, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), a810.d(a810.f, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), a810.d(a810.c, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), a810.d(a810.b, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), a810.d(a810.d, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), a810.d(a810.e, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), a810.d(a810.a, new RectF(-1.0f, -1.0f, 1.0f, 1.0f))};
    public static final swh[] e = new swh[7];
    public final vzy a;
    public final Path b = new Path();
    public final Matrix c = new Matrix();

    static {
        int i = 0;
        while (true) {
            nyk0[] nyk0VarArr = d;
            if (i >= nyk0VarArr.length) {
                return;
            }
            int i2 = i + 1;
            e[i] = new swh(nyk0VarArr[i], nyk0VarArr[i2 % nyk0VarArr.length]);
            i = i2;
        }
    }

    public uzy(vzy vzyVar) {
        this.a = vzyVar;
    }
}
