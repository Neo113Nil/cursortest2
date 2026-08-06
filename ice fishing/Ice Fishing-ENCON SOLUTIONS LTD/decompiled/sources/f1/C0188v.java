package f1;

import A1.InterfaceC0020v;
import F.InterfaceC0033i;
import android.content.Context;
import h1.C0239i;
import m1.EnumC0985a;
import n1.AbstractC0995f;

/* renamed from: f1.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0188v extends AbstractC0995f implements t1.p {

    /* renamed from: e, reason: collision with root package name */
    public kotlin.jvm.internal.p f2974e;

    /* renamed from: f, reason: collision with root package name */
    public int f2975f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f2976g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0161L f2977h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.p f2978i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0188v(String str, C0161L c0161l, kotlin.jvm.internal.p pVar, l1.d dVar) {
        super(2, dVar);
        this.f2976g = str;
        this.f2977h = c0161l;
        this.f2978i = pVar;
    }

    @Override // n1.AbstractC0991b
    public final l1.d b(Object obj, l1.d dVar) {
        return new C0188v(this.f2976g, this.f2977h, this.f2978i, dVar);
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        kotlin.jvm.internal.p pVar;
        EnumC0985a enumC0985a = EnumC0985a.f8194a;
        int i2 = this.f2975f;
        if (i2 == 0) {
            R1.l.F(obj);
            I.d dVar = new I.d(this.f2976g);
            Context context = this.f2977h.f2909a;
            if (context == null) {
                kotlin.jvm.internal.i.i("context");
                throw null;
            }
            C0183q c0183q = new C0183q(((InterfaceC0033i) AbstractC0162M.a(context).f124b).getData(), dVar, 1);
            kotlin.jvm.internal.p pVar2 = this.f2978i;
            this.f2974e = pVar2;
            this.f2975f = 1;
            Object c2 = D1.s.c(c0183q, this);
            if (c2 == enumC0985a) {
                return enumC0985a;
            }
            pVar = pVar2;
            obj = c2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pVar = this.f2974e;
            R1.l.F(obj);
        }
        pVar.f8076a = obj;
        return C0239i.f3393a;
    }

    @Override // t1.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0188v) b((InterfaceC0020v) obj, (l1.d) obj2)).g(C0239i.f3393a);
    }
}
