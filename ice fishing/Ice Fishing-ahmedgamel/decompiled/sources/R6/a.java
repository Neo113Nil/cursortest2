package R6;

import E2.M;
import N6.f;
import S0.e;
import S0.s;
import Y6.c;
import com.google.android.gms.internal.ads.C2964aq;
import i8.n;
import i8.r;
import java.util.Arrays;
import java.util.Map;
import java.util.function.BiFunction;
import k6.d;
import kotlin.jvm.internal.h;
import m8.m;
import m8.p;
import p6.AbstractC4844e;
import p6.C4840a;
import p6.InterfaceC4845f;
import s2.C4945n;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements BiFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M6.b f2881a;

    public /* synthetic */ a(M6.b bVar) {
        this.f2881a = bVar;
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
        int i4 = 0;
        f fVar = (f) obj;
        int intValue = ((Integer) obj2).intValue();
        M6.b bVar = this.f2881a;
        if (bVar.f1878b.get()) {
            return c.f3920f;
        }
        e eVar = new e(((O6.b) bVar.f1881e.f1291u).a(intValue));
        c cVar = new c();
        int a9 = fVar.a();
        M6.a aVar = new M6.a(bVar, cVar, eVar, i4);
        M6.a aVar2 = new M6.a(bVar, cVar, eVar, i);
        S6.f fVar2 = bVar.f1880d;
        fVar2.getClass();
        M m9 = new M();
        n url = fVar2.f2984c;
        h.e(url, "url");
        m9.f761u = url;
        ((Map) fVar2.f2985d.get()).forEach(new S6.b(0, m9));
        m9.p("POST", new S6.e(fVar, a9, fVar2.f2986e));
        C4840a a10 = C4840a.a();
        F2.b bVar2 = d.f38611a;
        Boolean bool = Boolean.TRUE;
        int i6 = 0;
        while (true) {
            Object[] objArr = a10.f39822a;
            if (i6 >= objArr.length) {
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 2);
                copyOf[copyOf.length - 2] = bVar2;
                copyOf[copyOf.length - 1] = bool;
                c4840a = new C4840a(copyOf);
                break;
            }
            if (objArr[i6] == bVar2) {
                int i9 = i6 + 1;
                if (objArr[i9] != bool) {
                    Object[] objArr2 = (Object[]) objArr.clone();
                    objArr2[i9] = bool;
                    c4840a = new C4840a(objArr2);
                }
            } else {
                i6 += 2;
            }
        }
        InterfaceC4845f k9 = AbstractC4844e.f39826b.k(a10);
        try {
            r rVar = fVar2.f2983b;
            C4945n c4945n = new C4945n(m9);
            rVar.getClass();
            p pVar = new p(rVar, c4945n);
            s sVar = new s(5, aVar2, aVar);
            if (!pVar.f39548x.compareAndSet(false, true)) {
                throw new IllegalStateException("Already Executed");
            }
            s8.f fVar3 = s8.f.f40554a;
            pVar.f39549y = s8.f.f40554a.h();
            C2964aq c2964aq = rVar.f38314a;
            m mVar = new m(pVar, sVar);
            c2964aq.getClass();
            C2964aq.j(c2964aq, mVar, null, 6);
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
