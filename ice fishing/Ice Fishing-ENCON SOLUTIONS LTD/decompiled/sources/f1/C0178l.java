package f1;

import A1.InterfaceC0020v;
import android.content.Context;
import h1.C0239i;
import java.util.List;
import m1.EnumC0985a;
import n1.AbstractC0995f;

/* renamed from: f1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0178l extends AbstractC0995f implements t1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f2940e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0161L f2941f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f2942g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0178l(C0161L c0161l, List list, l1.d dVar) {
        super(2, dVar);
        this.f2941f = c0161l;
        this.f2942g = list;
    }

    @Override // n1.AbstractC0991b
    public final l1.d b(Object obj, l1.d dVar) {
        return new C0178l(this.f2941f, this.f2942g, dVar);
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        EnumC0985a enumC0985a = EnumC0985a.f8194a;
        int i2 = this.f2940e;
        if (i2 == 0) {
            R1.l.F(obj);
            Context context = this.f2941f.f2909a;
            if (context == null) {
                kotlin.jvm.internal.i.i("context");
                throw null;
            }
            C.j a2 = AbstractC0162M.a(context);
            C0177k c0177k = new C0177k(this.f2942g, null);
            this.f2940e = 1;
            obj = a2.j(new I.h(c0177k, null), this);
            if (obj == enumC0985a) {
                return enumC0985a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.l.F(obj);
        }
        return obj;
    }

    @Override // t1.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0178l) b((InterfaceC0020v) obj, (l1.d) obj2)).g(C0239i.f3393a);
    }
}
