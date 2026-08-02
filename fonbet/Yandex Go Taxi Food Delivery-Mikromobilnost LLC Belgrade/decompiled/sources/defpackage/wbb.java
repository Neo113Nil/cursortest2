package defpackage;

import com.yandex.messaging.internal.view.timeline.i;

/* loaded from: classes15.dex */
public final class wbb implements tv10 {
    public final /* synthetic */ i a;
    public final /* synthetic */ jw10 b;

    public wbb(i iVar, jw10 jw10Var) {
        this.a = iVar;
        this.b = jw10Var;
    }

    @Override // defpackage.tv10
    public final void onSelectionChanged() {
        this.a.L.invalidate();
        this.b.l = !((uv10) r0.D.get()).b();
    }
}
