package m;

import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4675a implements O.f0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f39105a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f39106b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f39107c;

    public C4675a(ActionBarContextView actionBarContextView) {
        this.f39107c = actionBarContextView;
    }

    @Override // O.f0
    public final void a() {
        this.f39105a = true;
    }

    @Override // O.f0
    public final void b() {
        super/*android.view.View*/.setVisibility(0);
        this.f39105a = false;
    }

    @Override // O.f0
    public final void c() {
        if (this.f39105a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f39107c;
        actionBarContextView.f4527y = null;
        super/*android.view.View*/.setVisibility(this.f39106b);
    }
}
