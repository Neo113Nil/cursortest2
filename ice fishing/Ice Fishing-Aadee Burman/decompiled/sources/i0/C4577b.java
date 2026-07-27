package i0;

import D.y;
import androidx.fragment.app.Q;
import androidx.lifecycle.S;
import s.l;

/* renamed from: i0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4577b extends S {

    /* renamed from: b, reason: collision with root package name */
    public static final Q f38026b = new Q(1);

    /* renamed from: a, reason: collision with root package name */
    public final l f38027a = new l();

    @Override // androidx.lifecycle.S
    public final void onCleared() {
        l lVar = this.f38027a;
        int i = lVar.f40441v;
        if (i > 0) {
            throw y.i(lVar.f40440u[0]);
        }
        Object[] objArr = lVar.f40440u;
        for (int i6 = 0; i6 < i; i6++) {
            objArr[i6] = null;
        }
        lVar.f40441v = 0;
    }
}
