package c5;

import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.ArrayList;
import pc.j;
import pc.k;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1225g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b f1226h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i10) {
        super(1);
        this.f1225g = i10;
        this.f1226h = bVar;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        switch (this.f1225g) {
            case 0:
                g5.a aVar = (g5.a) obj;
                j.e(aVar, "cursor");
                if (!((Boolean) aVar.c().f2315b).booleanValue()) {
                    return new f5.d(null);
                }
                b bVar = this.f1226h;
                Object invoke = bVar.f1227a.invoke(aVar);
                if (!((Boolean) aVar.c().f2315b).booleanValue()) {
                    return new f5.d(invoke);
                }
                throw new IllegalStateException(("ResultSet returned more than 1 row for " + bVar).toString());
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                g5.a aVar2 = (g5.a) obj;
                j.e(aVar2, "cursor");
                f5.d c3 = aVar2.c();
                ArrayList arrayList = new ArrayList();
                if (!((Boolean) c3.f2315b).booleanValue()) {
                    return new f5.d(arrayList);
                }
                b bVar2 = this.f1226h;
                arrayList.add(bVar2.f1227a.invoke(aVar2));
                while (((Boolean) aVar2.c().f2315b).booleanValue()) {
                    arrayList.add(bVar2.f1227a.invoke(aVar2));
                }
                return new f5.d(arrayList);
            default:
                g5.a aVar3 = (g5.a) obj;
                j.e(aVar3, "cursor");
                f5.d c7 = aVar3.c();
                b bVar3 = this.f1226h;
                if (!((Boolean) c7.f2315b).booleanValue()) {
                    return new f5.d(null);
                }
                Object invoke2 = bVar3.f1227a.invoke(aVar3);
                if (!((Boolean) aVar3.c().f2315b).booleanValue()) {
                    return new f5.d(invoke2);
                }
                throw new IllegalStateException(("ResultSet returned more than 1 row for " + bVar3).toString());
        }
    }
}
