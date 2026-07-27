package S7;

import D.H;
import O7.AbstractC0399y;
import O7.EnumC0398x;
import O7.InterfaceC0397w;
import O7.Y;
import O7.h0;
import v7.InterfaceC5133d;
import w7.EnumC5179a;

/* loaded from: classes2.dex */
public final class i implements R7.c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.r f3002n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0397w f3003u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ H f3004v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ R7.c f3005w;

    public i(kotlin.jvm.internal.r rVar, InterfaceC0397w interfaceC0397w, H h9, R7.c cVar) {
        this.f3002n = rVar;
        this.f3003u = interfaceC0397w;
        this.f3004v = h9;
        this.f3005w = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // R7.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, InterfaceC5133d interfaceC5133d) {
        h hVar;
        int i;
        i iVar;
        if (interfaceC5133d instanceof h) {
            hVar = (h) interfaceC5133d;
            int i4 = hVar.f3001x;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                hVar.f3001x = i4 - Integer.MIN_VALUE;
                Object obj2 = hVar.f2999v;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = hVar.f3001x;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj2);
                    Y y6 = (Y) this.f3002n.f38861n;
                    if (y6 != null) {
                        y6.a(new k("Child of the scoped flow was cancelled"));
                        hVar.f2997n = this;
                        hVar.f2998u = obj;
                        hVar.f3001x = 1;
                        if (((h0) y6).I(hVar) == enumC5179a) {
                            return enumC5179a;
                        }
                    }
                    iVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = hVar.f2998u;
                    iVar = hVar.f2997n;
                    com.bumptech.glide.f.r(obj2);
                }
                kotlin.jvm.internal.r rVar = iVar.f3002n;
                EnumC0398x enumC0398x = EnumC0398x.f2637n;
                rVar.f38861n = AbstractC0399y.o(iVar.f3003u, null, new g(iVar.f3004v, iVar.f3005w, obj, null), 1);
                return q7.v.f40183a;
            }
        }
        hVar = new h(this, interfaceC5133d);
        Object obj22 = hVar.f2999v;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = hVar.f3001x;
        if (i != 0) {
        }
        kotlin.jvm.internal.r rVar2 = iVar.f3002n;
        EnumC0398x enumC0398x2 = EnumC0398x.f2637n;
        rVar2.f38861n = AbstractC0399y.o(iVar.f3003u, null, new g(iVar.f3004v, iVar.f3005w, obj, null), 1);
        return q7.v.f40183a;
    }
}
