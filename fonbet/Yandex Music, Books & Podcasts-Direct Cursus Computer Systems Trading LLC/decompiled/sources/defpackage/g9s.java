package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class g9s extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ i9s k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g9s(i9s i9sVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = i9sVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new g9s(this.k, continuation, 0);
            case 1:
                return new g9s(this.k, continuation, 1);
            case 2:
                return new g9s(this.k, continuation, 2);
            case 3:
                return new g9s(this.k, continuation, 3);
            case 4:
                return new g9s(this.k, continuation, 4);
            case 5:
                return new g9s(this.k, continuation, 5);
            default:
                return new g9s(this.k, continuation, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((g9s) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                ssg.a(4, "TestPlayer", "pause", null);
                this.k.j = false;
                i9s.y(this.k);
                break;
            case 3:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                ssg.a(4, "TestPlayer", "play", null);
                i9s i9sVar = this.k;
                caw cawVar = i9sVar.c;
                mwk mwkVar = i9sVar.g;
                cawVar.getClass();
                mwkVar.getClass();
                this.k.j = true;
                this.k.k = tnl.d;
                i9s.y(this.k);
                i9s i9sVar2 = this.k;
                i9sVar2.d.g();
                x97.y(i9sVar2.e, null, null, new h9s(i9sVar2, null), 3);
                break;
            case 4:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                break;
            case 5:
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                i9s.y(this.k);
                break;
            default:
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                ssg.a(4, "TestPlayer", "stop", null);
                this.k.i = 0L;
                this.k.k = tnl.a;
                i9s.y(this.k);
                this.k.g = h1b.e;
                this.k.d.V();
                break;
        }
        return Unit.a;
    }
}
