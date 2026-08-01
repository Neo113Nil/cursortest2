package l;

import android.view.ActionProvider;

/* loaded from: classes.dex */
public final class p implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public B.b f3759a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f3760b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f3761c;

    public p(t tVar, ActionProvider actionProvider) {
        this.f3761c = tVar;
        this.f3760b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z2) {
        B.b bVar = this.f3759a;
        if (bVar != null) {
            MenuC0229m menuC0229m = ((o) bVar.f10b).f3746n;
            menuC0229m.f3715h = true;
            menuC0229m.p(true);
        }
    }
}
