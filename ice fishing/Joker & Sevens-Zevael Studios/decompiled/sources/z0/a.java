package z0;

import ac.o;
import android.graphics.Rect;
import android.view.autofill.AutofillManager;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends pc.k implements oc.g {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f9048g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9049h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, int i10) {
        super(4);
        this.f9048g = bVar;
        this.f9049h = i10;
    }

    @Override // oc.g
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue();
        b bVar = this.f9048g;
        m7.g gVar = bVar.f9050a;
        ((AutofillManager) gVar.f4957h).notifyViewEntered(bVar.f9052c, this.f9049h, new Rect(intValue, intValue2, intValue3, intValue4));
        return o.f277a;
    }
}
