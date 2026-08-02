package i0;

import D.x;
import androidx.fragment.app.Q;
import androidx.lifecycle.S;
import s.l;

/* renamed from: i0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4582b extends S {

    /* renamed from: b, reason: collision with root package name */
    public static final Q f38143b = new Q(1);

    /* renamed from: a, reason: collision with root package name */
    public final l f38144a = new l();

    @Override // androidx.lifecycle.S
    public final void onCleared() {
        l lVar = this.f38144a;
        int i = lVar.f40280v;
        if (i > 0) {
            throw x.h(lVar.f40279u[0]);
        }
        Object[] objArr = lVar.f40279u;
        for (int i4 = 0; i4 < i; i4++) {
            objArr[i4] = null;
        }
        lVar.f40280v = 0;
    }
}
