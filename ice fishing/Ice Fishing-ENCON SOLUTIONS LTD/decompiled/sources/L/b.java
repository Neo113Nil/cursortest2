package L;

import P.C0067p;
import P.w;
import android.graphics.Rect;
import android.view.View;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1058a;

    public b() {
        this.f1058a = new LinkedHashMap();
    }

    public static b a(w wVar, int i2) {
        if (i2 == 0) {
            return new C0067p(wVar, 0);
        }
        if (i2 == 1) {
            return new C0067p(wVar, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public b(w wVar) {
        new Rect();
        this.f1058a = wVar;
    }
}
