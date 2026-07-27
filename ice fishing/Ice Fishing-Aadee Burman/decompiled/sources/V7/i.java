package V7;

import X.C0408a;
import X.E;
import X.F;
import kotlin.jvm.internal.r;
import u7.v;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class i implements c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3342n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f3343u;

    public /* synthetic */ i(int i, Object obj) {
        this.f3342n = i;
        this.f3343u = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    @Override // V7.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, InterfaceC5267d interfaceC5267d) {
        X.p pVar;
        int i;
        switch (this.f3342n) {
            case 0:
                ((r) this.f3343u).f38717n = obj;
                throw new W7.a(this);
            default:
                if (interfaceC5267d instanceof X.p) {
                    pVar = (X.p) interfaceC5267d;
                    int i6 = pVar.f3523u;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        pVar.f3523u = i6 - Integer.MIN_VALUE;
                        Object obj2 = pVar.f3522n;
                        A7.a aVar = A7.a.f58n;
                        i = pVar.f3523u;
                        if (i != 0) {
                            com.bumptech.glide.d.k(obj2);
                            E e9 = (E) obj;
                            if (e9 instanceof X.h) {
                                throw ((X.h) e9).f3506a;
                            }
                            if (e9 instanceof X.g) {
                                throw ((X.g) e9).f3505a;
                            }
                            if (!(e9 instanceof C0408a)) {
                                if (e9 instanceof F) {
                                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                }
                                throw new B0.c();
                            }
                            Object obj3 = ((C0408a) e9).f3489a;
                            pVar.f3523u = 1;
                            if (((c) this.f3343u).a(obj3, pVar) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            com.bumptech.glide.d.k(obj2);
                        }
                        return v.f41350a;
                    }
                }
                pVar = new X.p(this, interfaceC5267d);
                Object obj22 = pVar.f3522n;
                A7.a aVar2 = A7.a.f58n;
                i = pVar.f3523u;
                if (i != 0) {
                }
                return v.f41350a;
        }
    }
}
