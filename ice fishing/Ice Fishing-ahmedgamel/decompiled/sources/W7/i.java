package W7;

import D.G;
import S7.AbstractC0410y;
import S7.EnumC0409x;
import S7.InterfaceC0408w;
import S7.Y;
import S7.h0;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class i implements V7.c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.r f3598n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0408w f3599u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ G f3600v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ V7.c f3601w;

    public i(kotlin.jvm.internal.r rVar, InterfaceC0408w interfaceC0408w, G g9, V7.c cVar) {
        this.f3598n = rVar;
        this.f3599u = interfaceC0408w;
        this.f3600v = g9;
        this.f3601w = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // V7.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, InterfaceC5240d interfaceC5240d) {
        h hVar;
        int i;
        i iVar;
        if (interfaceC5240d instanceof h) {
            hVar = (h) interfaceC5240d;
            int i4 = hVar.f3597x;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                hVar.f3597x = i4 - Integer.MIN_VALUE;
                Object obj2 = hVar.f3595v;
                A7.a aVar = A7.a.f215n;
                i = hVar.f3597x;
                if (i != 0) {
                    Q3.b.s(obj2);
                    Y y7 = (Y) this.f3598n.f38644n;
                    if (y7 != null) {
                        y7.a(new k("Child of the scoped flow was cancelled"));
                        hVar.f3593n = this;
                        hVar.f3594u = obj;
                        hVar.f3597x = 1;
                        if (((h0) y7).I(hVar) == aVar) {
                            return aVar;
                        }
                    }
                    iVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = hVar.f3594u;
                    iVar = hVar.f3593n;
                    Q3.b.s(obj2);
                }
                kotlin.jvm.internal.r rVar = iVar.f3598n;
                EnumC0409x enumC0409x = EnumC0409x.f3084n;
                rVar.f38644n = AbstractC0410y.o(iVar.f3599u, null, new g(iVar.f3600v, iVar.f3601w, obj, null), 1);
                return u7.v.f41073a;
            }
        }
        hVar = new h(this, interfaceC5240d);
        Object obj22 = hVar.f3595v;
        A7.a aVar2 = A7.a.f215n;
        i = hVar.f3597x;
        if (i != 0) {
        }
        kotlin.jvm.internal.r rVar2 = iVar.f3598n;
        EnumC0409x enumC0409x2 = EnumC0409x.f3084n;
        rVar2.f38644n = AbstractC0410y.o(iVar.f3599u, null, new g(iVar.f3600v, iVar.f3601w, obj, null), 1);
        return u7.v.f41073a;
    }
}
