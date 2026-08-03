package n5;

import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Iterator;
import m0.l0;
import pc.j;
import pc.k;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c extends k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5061g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m5.c f5062h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(m5.c cVar, int i10) {
        super(1);
        this.f5061g = i10;
        this.f5062h = cVar;
    }

    public static final void a(m5.c cVar) {
        d.d(cVar);
        i5.a aVar = cVar.f4885h;
        Iterator it = aVar.values().iterator();
        while (it.hasNext()) {
            a((m5.c) it.next());
        }
        aVar.clear();
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        i5.a aVar;
        switch (this.f5061g) {
            case 0:
                j.e((l0) obj, "$this$DisposableEffectIgnoringConfiguration");
                return new b(this.f5062h, 0);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                j.e((l0) obj, "$this$DisposableEffectIgnoringConfiguration");
                m5.c cVar = this.f5062h;
                m5.c cVar2 = cVar.f4880c;
                if (cVar2 != null && (aVar = cVar2.f4885h) != null) {
                }
                return new b(cVar, 1);
            default:
                j.e((l0) obj, "$this$DisposableEffectIgnoringConfiguration");
                return new b(this.f5062h, 2);
        }
    }
}
