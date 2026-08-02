package l;

import android.view.ActionProvider;
import i1.C4586c;

/* loaded from: classes.dex */
public final class p implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public C4586c f38785a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f38786b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f38787c;

    public p(t tVar, ActionProvider actionProvider) {
        this.f38787c = tVar;
        this.f38786b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z6) {
        C4586c c4586c = this.f38785a;
        if (c4586c != null) {
            m mVar = ((o) c4586c.f38154u).f38763G;
            mVar.f38731A = true;
            mVar.p(true);
        }
    }
}
