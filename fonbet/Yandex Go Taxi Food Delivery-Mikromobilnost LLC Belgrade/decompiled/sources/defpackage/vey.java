package defpackage;

import androidx.lifecycle.Lifecycle;

/* loaded from: classes10.dex */
public final class vey implements hey {
    public final /* synthetic */ Lifecycle a;
    public final /* synthetic */ wey b;

    public vey(wey weyVar, Lifecycle lifecycle) {
        this.b = weyVar;
        this.a = lifecycle;
    }

    @Override // defpackage.hey
    public final void onDestroy() {
        this.b.a.remove(this.a);
    }

    @Override // defpackage.hey
    public final void onStart() {
    }

    @Override // defpackage.hey
    public final void onStop() {
    }
}
