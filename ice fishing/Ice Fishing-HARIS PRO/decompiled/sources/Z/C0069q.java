package Z;

import android.view.View;

/* renamed from: Z.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0069q extends R.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0070s f1569a;

    public C0069q(AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s) {
        this.f1569a = abstractComponentCallbacksC0070s;
    }

    @Override // R.j
    public final View X(int i) {
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = this.f1569a;
        View view = abstractComponentCallbacksC0070s.f1584F;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0070s + " does not have a view");
    }

    @Override // R.j
    public final boolean Y() {
        return this.f1569a.f1584F != null;
    }
}
