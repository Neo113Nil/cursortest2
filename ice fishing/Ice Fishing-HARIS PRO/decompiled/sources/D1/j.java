package D1;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class j implements f, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int f165a;

    public j(int i) {
        this.f165a = i;
    }

    @Override // D1.f
    public final int f() {
        return this.f165a;
    }

    public final String toString() {
        o.f171a.getClass();
        String a2 = p.a(this);
        i.d(a2, "renderLambdaToString(...)");
        return a2;
    }
}
