package V7;

import I7.q;
import com.onesignal.core.activities.PermissionsActivity;
import u7.v;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class g extends B7.h implements q {

    /* renamed from: n, reason: collision with root package name */
    public int f3337n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ c f3338u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f3339v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PermissionsActivity.b.a f3340w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(PermissionsActivity.b.a aVar, InterfaceC5267d interfaceC5267d) {
        super(3, interfaceC5267d);
        this.f3340w = aVar;
    }

    @Override // I7.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        g gVar = new g(this.f3340w, (InterfaceC5267d) obj3);
        gVar.f3338u = (c) obj;
        gVar.f3339v = obj2;
        return gVar.invokeSuspend(v.f41353a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r1.a(r5, r4) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r5 == r0) goto L15;
     */
    @Override // B7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c cVar;
        A7.a aVar = A7.a.f58n;
        int i = this.f3337n;
        if (i == 0) {
            com.bumptech.glide.d.k(obj);
            cVar = this.f3338u;
            Object obj2 = this.f3339v;
            this.f3338u = cVar;
            this.f3337n = 1;
            obj = this.f3340w.invoke(obj2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.d.k(obj);
                return v.f41353a;
            }
            cVar = this.f3338u;
            com.bumptech.glide.d.k(obj);
        }
        this.f3338u = null;
        this.f3337n = 2;
    }
}
