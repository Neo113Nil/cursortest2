package m;

import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4688a implements O.f0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f39172a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f39173b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f39174c;

    public C4688a(ActionBarContextView actionBarContextView) {
        this.f39174c = actionBarContextView;
    }

    @Override // O.f0
    public final void a() {
        this.f39172a = true;
    }

    @Override // O.f0
    public final void b() {
        super/*android.view.View*/.setVisibility(0);
        this.f39172a = false;
    }

    @Override // O.f0
    public final void c() {
        if (this.f39172a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f39174c;
        actionBarContextView.f4495y = null;
        super/*android.view.View*/.setVisibility(this.f39173b);
    }
}
