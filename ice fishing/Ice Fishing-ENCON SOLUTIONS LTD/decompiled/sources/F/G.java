package F;

import h1.C0239i;
import m1.EnumC0985a;
import n1.AbstractC0995f;

/* loaded from: classes.dex */
public final class G extends AbstractC0995f implements t1.p {

    /* renamed from: e, reason: collision with root package name */
    public Object f377e;

    /* renamed from: f, reason: collision with root package name */
    public int f378f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ boolean f379g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ P f380h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f381i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(P p2, int i2, l1.d dVar) {
        super(2, dVar);
        this.f380h = p2;
        this.f381i = i2;
    }

    @Override // n1.AbstractC0991b
    public final l1.d b(Object obj, l1.d dVar) {
        G g2 = new G(this.f380h, this.f381i, dVar);
        g2.f379g = ((Boolean) obj).booleanValue();
        return g2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0055  */
    @Override // n1.AbstractC0991b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        boolean z2;
        Object obj2;
        int i2;
        EnumC0985a enumC0985a = EnumC0985a.f8194a;
        int i3 = this.f378f;
        P p2 = this.f380h;
        if (i3 == 0) {
            R1.l.F(obj);
            z2 = this.f379g;
            this.f379g = z2;
            this.f378f = 1;
            obj = p2.h(this);
            if (obj == enumC0985a) {
                return enumC0985a;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f377e;
                R1.l.F(obj);
                i2 = ((Number) obj).intValue();
                return new C0028d(obj2 != null ? obj2.hashCode() : 0, i2, obj2);
            }
            z2 = this.f379g;
            R1.l.F(obj);
        }
        if (!z2) {
            obj2 = obj;
            i2 = this.f381i;
            return new C0028d(obj2 != null ? obj2.hashCode() : 0, i2, obj2);
        }
        j0 f2 = p2.f();
        this.f377e = obj;
        this.f378f = 2;
        Integer a2 = f2.a();
        if (a2 == enumC0985a) {
            return enumC0985a;
        }
        obj2 = obj;
        obj = a2;
        i2 = ((Number) obj).intValue();
        return new C0028d(obj2 != null ? obj2.hashCode() : 0, i2, obj2);
    }

    @Override // t1.p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((G) b(bool, (l1.d) obj2)).g(C0239i.f3393a);
    }
}
