package l;

import android.view.ActionProvider;
import g1.C4522b;

/* loaded from: classes.dex */
public final class p implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public C4522b f38858a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f38859b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f38860c;

    public p(t tVar, ActionProvider actionProvider) {
        this.f38860c = tVar;
        this.f38859b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z3) {
        C4522b c4522b = this.f38858a;
        if (c4522b != null) {
            m mVar = ((o) c4522b.f37625u).f38836G;
            mVar.f38804A = true;
            mVar.p(true);
        }
    }
}
