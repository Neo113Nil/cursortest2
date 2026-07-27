package i0;

import D.y;
import androidx.fragment.app.Q;
import androidx.lifecycle.S;
import s.l;

/* renamed from: i0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4572b extends S {

    /* renamed from: b, reason: collision with root package name */
    public static final Q f38273b = new Q(1);

    /* renamed from: a, reason: collision with root package name */
    public final l f38274a = new l();

    @Override // androidx.lifecycle.S
    public final void onCleared() {
        l lVar = this.f38274a;
        int i = lVar.f40413v;
        if (i > 0) {
            throw y.g(lVar.f40412u[0]);
        }
        Object[] objArr = lVar.f40412u;
        for (int i4 = 0; i4 < i; i4++) {
            objArr[i4] = null;
        }
        lVar.f40413v = 0;
    }
}
