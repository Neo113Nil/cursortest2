package R6;

import C2.N;
import L3.v;
import N6.f;
import S0.l;
import S6.d;
import S6.e;
import Y6.c;
import com.google.android.gms.internal.ads.C2941aq;
import i8.n;
import i8.r;
import java.util.Arrays;
import java.util.Map;
import java.util.function.BiFunction;
import kotlin.jvm.internal.h;
import m8.q;
import p6.AbstractC4844e;
import p6.C4840a;
import p6.InterfaceC4845f;
import q2.C4896n;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements BiFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M6.b f2754a;

    public /* synthetic */ a(M6.b bVar) {
        this.f2754a = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x008d, code lost:
    
        r12 = r4;
     */
    @Override // java.util.function.BiFunction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object apply(Object obj, Object obj2) {
        C4840a c4840a;
        int i = 1;
        int i6 = 0;
        f fVar = (f) obj;
        int intValue = ((Integer) obj2).intValue();
        M6.b bVar = this.f2754a;
        if (bVar.f1876b.get()) {
            return c.f3976f;
        }
        l lVar = new l(((O6.b) bVar.f1879e.f1264u).a(intValue));
        c cVar = new c();
        int a9 = fVar.a();
        M6.a aVar = new M6.a(bVar, cVar, lVar, i6);
        M6.a aVar2 = new M6.a(bVar, cVar, lVar, i);
        e eVar = bVar.f1878d;
        eVar.getClass();
        N n9 = new N();
        n url = eVar.f2901c;
        h.e(url, "url");
        n9.f301u = url;
        ((Map) eVar.f2902d.get()).forEach(new S6.a(0, n9));
        n9.p("POST", new d(fVar, a9, eVar.f2903e));
        C4840a a10 = C4840a.a();
        v vVar = k6.d.f38684a;
        Boolean bool = Boolean.TRUE;
        int i9 = 0;
        while (true) {
            Object[] objArr = a10.f39772a;
            if (i9 >= objArr.length) {
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 2);
                copyOf[copyOf.length - 2] = vVar;
                copyOf[copyOf.length - 1] = bool;
                c4840a = new C4840a(copyOf);
                break;
            }
            if (objArr[i9] == vVar) {
                int i10 = i9 + 1;
                if (objArr[i10] != bool) {
                    Object[] objArr2 = (Object[]) objArr.clone();
                    objArr2[i10] = bool;
                    c4840a = new C4840a(objArr2);
                }
            } else {
                i9 += 2;
            }
        }
        InterfaceC4845f k9 = AbstractC4844e.f39776b.k(a10);
        try {
            r rVar = eVar.f2900b;
            C4896n c4896n = new C4896n(n9);
            rVar.getClass();
            q qVar = new q(rVar, c4896n);
            l lVar2 = new l(5, aVar2, aVar);
            if (!qVar.f39391x.compareAndSet(false, true)) {
                throw new IllegalStateException("Already Executed");
            }
            s8.f fVar2 = s8.f.f40497a;
            qVar.f39392y = s8.f.f40497a.h();
            C2941aq c2941aq = rVar.f38195a;
            m8.n nVar = new m8.n(qVar, lVar2);
            c2941aq.getClass();
            C2941aq.j(c2941aq, nVar, null, 6);
            k9.close();
            return cVar;
        } catch (Throwable th) {
            try {
                k9.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
