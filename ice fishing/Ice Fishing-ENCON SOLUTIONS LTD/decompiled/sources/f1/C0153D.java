package f1;

import A1.InterfaceC0020v;
import android.content.Context;
import h1.C0239i;
import m1.EnumC0985a;
import n1.AbstractC0995f;

/* renamed from: f1.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0153D extends AbstractC0995f implements t1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f2879e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f2880f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0161L f2881g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f2882h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0153D(String str, C0161L c0161l, boolean z2, l1.d dVar) {
        super(2, dVar);
        this.f2880f = str;
        this.f2881g = c0161l;
        this.f2882h = z2;
    }

    @Override // n1.AbstractC0991b
    public final l1.d b(Object obj, l1.d dVar) {
        return new C0153D(this.f2880f, this.f2881g, this.f2882h, dVar);
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        EnumC0985a enumC0985a = EnumC0985a.f8194a;
        int i2 = this.f2879e;
        if (i2 == 0) {
            R1.l.F(obj);
            I.d dVar = new I.d(this.f2880f);
            Context context = this.f2881g.f2909a;
            if (context == null) {
                kotlin.jvm.internal.i.i("context");
                throw null;
            }
            C.j a2 = AbstractC0162M.a(context);
            C0152C c0152c = new C0152C(dVar, this.f2882h, null);
            this.f2879e = 1;
            if (a2.j(new I.h(c0152c, null), this) == enumC0985a) {
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
        return ((C0153D) b((InterfaceC0020v) obj, (l1.d) obj2)).g(C0239i.f3393a);
    }
}
