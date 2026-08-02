package defpackage;

import android.animation.Animator;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public abstract class dyj extends niu {
    @Override // defpackage.niu
    public final Animator W(ViewGroup viewGroup, b9t b9tVar, int i, b9t b9tVar2, int i2) {
        Object obj = b9tVar2 != null ? b9tVar2.b : null;
        p7t p7tVar = obj instanceof p7t ? (p7t) obj : null;
        if (p7tVar != null) {
            p7tVar.d(b9tVar2.b);
        }
        b(new cyj(this, p7tVar, b9tVar2, 0));
        return super.W(viewGroup, b9tVar, i, b9tVar2, i2);
    }

    @Override // defpackage.niu
    public final Animator Y(ViewGroup viewGroup, b9t b9tVar, int i, b9t b9tVar2, int i2) {
        Object obj = b9tVar != null ? b9tVar.b : null;
        p7t p7tVar = obj instanceof p7t ? (p7t) obj : null;
        if (p7tVar != null) {
            p7tVar.d(b9tVar.b);
        }
        b(new cyj(this, p7tVar, b9tVar, 1));
        return super.Y(viewGroup, b9tVar, i, b9tVar2, i2);
    }
}
