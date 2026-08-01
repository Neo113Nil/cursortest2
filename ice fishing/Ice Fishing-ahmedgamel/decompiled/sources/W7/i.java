package W7;

import D.H;
import S7.AbstractC0406y;
import S7.EnumC0405x;
import S7.InterfaceC0404w;
import S7.Y;
import S7.h0;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class i implements V7.c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.r f3436n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0404w f3437u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ H f3438v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ V7.c f3439w;

    public i(kotlin.jvm.internal.r rVar, InterfaceC0404w interfaceC0404w, H h9, V7.c cVar) {
        this.f3436n = rVar;
        this.f3437u = interfaceC0404w;
        this.f3438v = h9;
        this.f3439w = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // V7.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, InterfaceC5267d interfaceC5267d) {
        h hVar;
        int i;
        i iVar;
        if (interfaceC5267d instanceof h) {
            hVar = (h) interfaceC5267d;
            int i6 = hVar.f3435x;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                hVar.f3435x = i6 - Integer.MIN_VALUE;
                Object obj2 = hVar.f3433v;
                A7.a aVar = A7.a.f58n;
                i = hVar.f3435x;
                if (i != 0) {
                    com.bumptech.glide.d.k(obj2);
                    Y y7 = (Y) this.f3436n.f38717n;
                    if (y7 != null) {
                        y7.a(new k("Child of the scoped flow was cancelled"));
                        hVar.f3431n = this;
                        hVar.f3432u = obj;
                        hVar.f3435x = 1;
                        if (((h0) y7).I(hVar) == aVar) {
                            return aVar;
                        }
                    }
                    iVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = hVar.f3432u;
                    iVar = hVar.f3431n;
                    com.bumptech.glide.d.k(obj2);
                }
                kotlin.jvm.internal.r rVar = iVar.f3436n;
                EnumC0405x enumC0405x = EnumC0405x.f3001n;
                rVar.f38717n = AbstractC0406y.o(iVar.f3437u, null, new g(iVar.f3438v, iVar.f3439w, obj, null), 1);
                return u7.v.f41353a;
            }
        }
        hVar = new h(this, interfaceC5267d);
        Object obj22 = hVar.f3433v;
        A7.a aVar2 = A7.a.f58n;
        i = hVar.f3435x;
        if (i != 0) {
        }
        kotlin.jvm.internal.r rVar2 = iVar.f3436n;
        EnumC0405x enumC0405x2 = EnumC0405x.f3001n;
        rVar2.f38717n = AbstractC0406y.o(iVar.f3437u, null, new g(iVar.f3438v, iVar.f3439w, obj, null), 1);
        return u7.v.f41353a;
    }
}
