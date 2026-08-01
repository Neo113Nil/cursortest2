package m;

import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0242a implements O.O {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3907a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f3908b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f3909c;

    public C0242a(ActionBarContextView actionBarContextView) {
        this.f3909c = actionBarContextView;
    }

    @Override // O.O
    public final void a() {
        if (this.f3907a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f3909c;
        actionBarContextView.f1781f = null;
        super/*android.view.View*/.setVisibility(this.f3908b);
    }

    @Override // O.O
    public final void b() {
        this.f3907a = true;
    }

    @Override // O.O
    public final void c() {
        super/*android.view.View*/.setVisibility(0);
        this.f3907a = false;
    }
}
