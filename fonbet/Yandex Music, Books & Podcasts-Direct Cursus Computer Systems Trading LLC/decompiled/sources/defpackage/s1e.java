package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes3.dex */
public final class s1e extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ u1e k;
    public final /* synthetic */ boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1e(u1e u1eVar, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = u1eVar;
        this.l = z;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new s1e(this.k, this.l, continuation, 0);
            default:
                return new s1e(this.k, this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((s1e) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        boolean z = this.l;
        u1e u1eVar = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                ekf ekfVar = u1eVar.D;
                StationId a = u1eVar.x.a();
                if (a == null) {
                    break;
                } else {
                    ekfVar.a(a.h(), wre.d, true, z ? ah.d : ah.e);
                    break;
                }
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                ekf ekfVar2 = u1eVar.D;
                StationId a2 = u1eVar.x.a();
                if (a2 == null) {
                    break;
                } else {
                    ekfVar2.a(a2.h(), wre.b, !z, !z ? ah.g : ah.f);
                    break;
                }
        }
        return Unit.a;
    }
}
