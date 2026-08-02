package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class gx4 extends aur implements Function1 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx4(odd oddVar, boolean z, bz2 bz2Var, String str, vgd vgdVar, Continuation continuation) {
        super(1, continuation);
        this.j = 1;
        this.m = oddVar;
        this.l = z;
        this.n = bz2Var;
        this.o = str;
        this.p = vgdVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new gx4((ueo) this.m, continuation, (Set) this.n, (vhn) this.o, (Boolean) this.p, this.l, 0);
            case 1:
                return new gx4((odd) this.m, this.l, (bz2) this.n, (String) this.o, (vgd) this.p, continuation);
            default:
                return new gx4((ueo) this.m, continuation, (b4m) this.n, (String) this.o, (cvl) this.p, this.l, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((gx4) create(continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        hed hedVar;
        Object obj2;
        bz2 bz2Var;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i != 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                uxs Q = ((MainDatabase) ((ueo) this.m)).Q();
                ysr ysrVar = new ysr("track_mview");
                um4 um4Var = new um4(pgp.a);
                um4Var.e("original_id", (Set) this.n);
                vhn vhnVar = (vhn) this.o;
                if (vhnVar != null) {
                    um4Var.h("track_type", vhnVar);
                }
                Boolean bool = (Boolean) this.p;
                if (bool != null) {
                    um4Var.c("track_for_kids", bool.booleanValue());
                }
                if (this.l) {
                    um4Var.i("(playlist_original_ids NOT LIKE '%' || ? || '%') OR (playlist_original_ids IS NULL)", t75.c("-14"));
                }
                tt0.K(ysrVar, um4Var);
                atn a = ysrVar.a();
                this.k = 1;
                Object b = Q.b(a, this);
                return b == nm6Var ? nm6Var : b;
            case 1:
                vgd vgdVar = (vgd) this.p;
                String str = (String) this.o;
                odd oddVar = (odd) this.m;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    hedVar = null;
                    ssg.a(3, null, "connect to " + str + " with target " + vgdVar, null);
                    Iterator it = ((Iterable) oddVar.b.i.getValue()).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            String deviceId = ((egd) obj2).b.getDeviceId();
                            deviceId.getClass();
                            if (deviceId.equals(str)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    egd egdVar = (egd) obj2;
                    if (egdVar != null) {
                        ked kedVar = oddVar.c;
                        this.k = 1;
                        obj = kedVar.b(egdVar, vgdVar, this);
                        if (obj == nm6Var2) {
                            return nm6Var2;
                        }
                    }
                    bz2Var = (bz2) this.n;
                    this.k = 2;
                    if (odd.a(oddVar, hedVar, this.l, bz2Var, this) == nm6Var2) {
                        return nm6Var2;
                    }
                    return Unit.a;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                hedVar = (hed) obj;
                bz2Var = (bz2) this.n;
                this.k = 2;
                if (odd.a(oddVar, hedVar, this.l, bz2Var, this) == nm6Var2) {
                }
                return Unit.a;
            default:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    MainDatabase mainDatabase = (MainDatabase) ((ueo) this.m);
                    b4m b4mVar = (b4m) this.n;
                    cvl cvlVar = (cvl) this.p;
                    this.k = 1;
                    obj = b4m.a(b4mVar, mainDatabase, cvlVar, this.l, this);
                    if (obj == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return new Long(((t3m) obj).a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gx4(ueo ueoVar, Continuation continuation, Object obj, Object obj2, Serializable serializable, boolean z, int i) {
        super(1, continuation);
        this.j = i;
        this.m = ueoVar;
        this.n = obj;
        this.o = obj2;
        this.p = serializable;
        this.l = z;
    }
}
