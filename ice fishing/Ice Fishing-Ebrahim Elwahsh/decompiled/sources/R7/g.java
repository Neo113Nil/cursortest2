package R7;

import E7.q;
import com.onesignal.core.activities.PermissionsActivity;
import q7.v;
import v7.InterfaceC5133d;
import w7.EnumC5179a;

/* loaded from: classes2.dex */
public final class g extends x7.h implements q {

    /* renamed from: n, reason: collision with root package name */
    public int f2858n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ c f2859u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f2860v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PermissionsActivity.b.a f2861w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(PermissionsActivity.b.a aVar, InterfaceC5133d interfaceC5133d) {
        super(3, interfaceC5133d);
        this.f2861w = aVar;
    }

    @Override // E7.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        g gVar = new g(this.f2861w, (InterfaceC5133d) obj3);
        gVar.f2859u = (c) obj;
        gVar.f2860v = obj2;
        return gVar.invokeSuspend(v.f40183a);
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
    @Override // x7.AbstractC5217a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c cVar;
        EnumC5179a enumC5179a = EnumC5179a.f41704n;
        int i = this.f2858n;
        if (i == 0) {
            com.bumptech.glide.f.r(obj);
            cVar = this.f2859u;
            Object obj2 = this.f2860v;
            this.f2859u = cVar;
            this.f2858n = 1;
            obj = this.f2861w.invoke(obj2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.f.r(obj);
                return v.f40183a;
            }
            cVar = this.f2859u;
            com.bumptech.glide.f.r(obj);
        }
        this.f2859u = null;
        this.f2858n = 2;
    }
}
