package f1;

import A1.InterfaceC0020v;
import android.content.Context;
import h1.C0239i;
import m1.EnumC0985a;
import n1.AbstractC0995f;

/* renamed from: f1.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0159J extends AbstractC0995f implements t1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f2901e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f2902f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0161L f2903g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f2904h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0159J(String str, C0161L c0161l, long j2, l1.d dVar) {
        super(2, dVar);
        this.f2902f = str;
        this.f2903g = c0161l;
        this.f2904h = j2;
    }

    @Override // n1.AbstractC0991b
    public final l1.d b(Object obj, l1.d dVar) {
        return new C0159J(this.f2902f, this.f2903g, this.f2904h, dVar);
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        EnumC0985a enumC0985a = EnumC0985a.f8194a;
        int i2 = this.f2901e;
        if (i2 == 0) {
            R1.l.F(obj);
            I.d dVar = new I.d(this.f2902f);
            Context context = this.f2903g.f2909a;
            if (context == null) {
                kotlin.jvm.internal.i.i("context");
                throw null;
            }
            C.j a2 = AbstractC0162M.a(context);
            C0158I c0158i = new C0158I(dVar, this.f2904h, null);
            this.f2901e = 1;
            if (a2.j(new I.h(c0158i, null), this) == enumC0985a) {
                return enumC0985a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.l.F(obj);
        }
        return C0239i.f3393a;
    }

    @Override // t1.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0159J) b((InterfaceC0020v) obj, (l1.d) obj2)).g(C0239i.f3393a);
    }
}
