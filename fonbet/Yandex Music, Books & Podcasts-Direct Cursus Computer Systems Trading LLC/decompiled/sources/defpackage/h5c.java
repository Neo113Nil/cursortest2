package defpackage;

import com.yandex.plus.home.api.exception.a;
import com.yandex.plus.home.family.b;
import com.yandex.plus.home.t;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class h5c implements e5c {
    public final t a;

    public h5c(t tVar) {
        this.a = tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // defpackage.e5c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        f5c f5cVar;
        int i;
        try {
            if (continuation instanceof f5c) {
                f5cVar = (f5c) continuation;
                int i2 = f5cVar.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    f5cVar.l = i2 - Integer.MIN_VALUE;
                    Object obj = f5cVar.j;
                    nm6 nm6Var = nm6.a;
                    i = f5cVar.l;
                    if (i != 0) {
                        qgg.h0(obj);
                        t tVar = this.a;
                        f5cVar.l = 1;
                        obj = ((b) ((jyr) tVar.g.c).getValue()).a(f5cVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    return ((com.yandex.plus.core.data.family.b) obj).a;
                }
            }
            if (i != 0) {
            }
            return ((com.yandex.plus.core.data.family.b) obj).a;
        } catch (a unused) {
            return null;
        }
        f5cVar = new f5c(this, (cg6) continuation);
        Object obj2 = f5cVar.j;
        nm6 nm6Var2 = nm6.a;
        i = f5cVar.l;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:10)(2:21|22))(3:23|24|(1:26))|11|(3:13|14|(1:16))|18|19))|28|6|7|(0)(0)|11|(0)|18|19) */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[Catch: a -> 0x005d, TRY_LEAVE, TryCatch #0 {a -> 0x005d, blocks: (B:10:0x0026, B:11:0x004b, B:13:0x0053, B:24:0x0034), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // defpackage.e5c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Continuation continuation) {
        g5c g5cVar;
        int i;
        int i2;
        if (continuation instanceof g5c) {
            g5cVar = (g5c) continuation;
            int i3 = g5cVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                g5cVar.l = i3 - Integer.MIN_VALUE;
                Object obj = g5cVar.j;
                nm6 nm6Var = nm6.a;
                i = g5cVar.l;
                boolean z = false;
                if (i != 0) {
                    qgg.h0(obj);
                    t tVar = this.a;
                    g5cVar.l = 1;
                    obj = ((com.yandex.plus.home.user.b) ((jyr) tVar.g.b).getValue()).a(g5cVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                com.yandex.plus.core.data.family.a aVar = ((com.yandex.plus.core.data.user.a) obj).c;
                i2 = aVar.a;
                if (i2 != 0) {
                    if (i2 > aVar.c.size() + 1) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }
        }
        g5cVar = new g5c(this, (cg6) continuation);
        Object obj2 = g5cVar.j;
        nm6 nm6Var2 = nm6.a;
        i = g5cVar.l;
        boolean z2 = false;
        if (i != 0) {
        }
        com.yandex.plus.core.data.family.a aVar2 = ((com.yandex.plus.core.data.user.a) obj2).c;
        i2 = aVar2.a;
        if (i2 != 0) {
        }
        return Boolean.valueOf(z2);
    }
}
