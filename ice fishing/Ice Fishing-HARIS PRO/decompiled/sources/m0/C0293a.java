package m0;

import android.view.animation.PathInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import p0.C0328f;
import p0.q;

/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0293a implements O1.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0297e f4063a;

    public C0293a(C0297e c0297e) {
        this.f4063a = c0297e;
    }

    @Override // O1.f
    public final Object a(Object obj, v1.d dVar) {
        t1.i iVar;
        androidx.window.layout.f fVar = (androidx.window.layout.f) obj;
        C0298f c0298f = this.f4063a.f4073d;
        t1.i iVar2 = t1.i.f4388c;
        if (c0298f == null) {
            iVar = null;
        } else {
            C0303k c0303k = (C0303k) c0298f.f4074a;
            c0303k.f4100v = fVar;
            C0328f c0328f = new C0328f();
            c0328f.f4186c = 300L;
            c0328f.f4187d = new PathInterpolator(0.2f, RecyclerView.f2111C0, RecyclerView.f2111C0, 1.0f);
            q.a(c0303k, c0328f);
            c0303k.requestLayout();
            iVar = iVar2;
        }
        return iVar == w1.a.f4662a ? iVar : iVar2;
    }
}
