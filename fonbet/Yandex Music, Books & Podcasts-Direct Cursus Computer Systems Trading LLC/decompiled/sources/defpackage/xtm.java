package defpackage;

import androidx.fragment.app.t;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.profile.ProfileActivity;

/* loaded from: classes6.dex */
public final class xtm extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ ytm l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xtm(ytm ytmVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = ytmVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new xtm(this.l, continuation, 0);
            default:
                return new xtm(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((xtm) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    t l = this.l.l();
                    ProfileActivity profileActivity = l instanceof ProfileActivity ? (ProfileActivity) l : null;
                    if (profileActivity != null) {
                        this.k = 1;
                        vx6 vx6Var = profileActivity.v0;
                        if (vx6Var == null) {
                            Intrinsics.j("deleteAccountManager");
                            throw null;
                        }
                        Object z = vx6Var.z(this);
                        if (z != nm6Var) {
                            z = Unit.a;
                        }
                        if (z == nm6Var) {
                            return nm6Var;
                        }
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    t l2 = this.l.l();
                    ProfileActivity profileActivity2 = l2 instanceof ProfileActivity ? (ProfileActivity) l2 : null;
                    if (profileActivity2 != null) {
                        this.k = 1;
                        t1f t1fVar = profileActivity2.Z;
                        if (t1fVar == null) {
                            Intrinsics.j("logoutManagerImpl");
                            throw null;
                        }
                        Object y = t1fVar.y(this);
                        if (y != nm6Var2) {
                            y = Unit.a;
                        }
                        if (y == nm6Var2) {
                            return nm6Var2;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }
}
