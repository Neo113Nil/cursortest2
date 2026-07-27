package m;

import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4723a implements O.f0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f39374a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f39375b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f39376c;

    public C4723a(ActionBarContextView actionBarContextView) {
        this.f39376c = actionBarContextView;
    }

    @Override // O.f0
    public final void a() {
        this.f39374a = true;
    }

    @Override // O.f0
    public final void b() {
        super/*android.view.View*/.setVisibility(0);
        this.f39374a = false;
    }

    @Override // O.f0
    public final void c() {
        if (this.f39374a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f39376c;
        actionBarContextView.f4642y = null;
        super/*android.view.View*/.setVisibility(this.f39375b);
    }
}
