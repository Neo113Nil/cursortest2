package y1;

import android.view.accessibility.AccessibilityEvent;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class x extends pc.k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8674g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y f8675h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(y yVar, int i10) {
        super(1);
        this.f8674g = i10;
        this.f8675h = yVar;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        switch (this.f8674g) {
            case 0:
                y yVar = this.f8675h;
                return Boolean.valueOf(yVar.f8679d.getParent().requestSendAccessibilityEvent(yVar.f8679d, (AccessibilityEvent) obj));
            default:
                j1 j1Var = (j1) obj;
                if (j1Var.f8571h.contains(j1Var)) {
                    y yVar2 = this.f8675h;
                    yVar2.f8679d.getSnapshotObserver().a(j1Var, yVar2.P, new c1.b(11, j1Var, yVar2));
                }
                return ac.o.f277a;
        }
    }
}
