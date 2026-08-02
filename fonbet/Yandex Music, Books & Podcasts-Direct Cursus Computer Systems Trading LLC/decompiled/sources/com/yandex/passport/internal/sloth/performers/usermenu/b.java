package com.yandex.passport.internal.sloth.performers.usermenu;

import com.yandex.passport.sloth.command.data.x;
import com.yandex.passport.sloth.command.s;
import com.yandex.passport.sloth.command.t;
import com.yandex.passport.sloth.command.v;
import com.yandex.passport.sloth.data.m;
import defpackage.cg6;
import defpackage.ern;
import defpackage.gm5;
import defpackage.hld;
import defpackage.l1j;
import defpackage.l2b;
import defpackage.m2b;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class b implements t {
    public final /* synthetic */ int a;
    public final h b;

    public b(h hVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                hVar.getClass();
                this.b = hVar;
                break;
            default:
                hVar.getClass();
                this.b = hVar;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(com.yandex.passport.sloth.command.data.i iVar, cg6 cg6Var) {
        a aVar;
        int i;
        if (cg6Var instanceof a) {
            aVar = (a) cg6Var;
            int i2 = aVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.l = i2 - Integer.MIN_VALUE;
                Object obj = aVar.j;
                nm6 nm6Var = nm6.a;
                i = aVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    f fVar = new f(iVar.a, iVar.b);
                    aVar.l = 1;
                    Object emit = this.b.a.emit(fVar, aVar);
                    if (emit != nm6Var) {
                        emit = Unit.a;
                    }
                    if (emit == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return new l2b(v.c);
            }
        }
        aVar = new a(this, cg6Var);
        Object obj2 = aVar.j;
        nm6 nm6Var2 = nm6.a;
        i = aVar.l;
        if (i != 0) {
        }
        return new l2b(v.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r9 != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(x xVar, cg6 cg6Var) {
        d dVar;
        int i;
        gm5 gm5Var;
        if (cg6Var instanceof d) {
            dVar = (d) cg6Var;
            int i2 = dVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.m = i2 - Integer.MIN_VALUE;
                Object obj = dVar.k;
                nm6 nm6Var = nm6.a;
                i = dVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    gm5 j = hld.j();
                    e eVar = new e(xVar.a, new c(j, 0));
                    dVar.j = j;
                    dVar.m = 1;
                    Object emit = this.b.a.emit(eVar, dVar);
                    if (emit != nm6Var) {
                        emit = Unit.a;
                    }
                    if (emit != nm6Var) {
                        gm5Var = j;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    if (obj instanceof s) {
                        return new l2b(obj);
                    }
                    if (obj instanceof com.yandex.passport.sloth.command.d) {
                        return new m2b(obj);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(obj);
                    sb.append(" is neither ");
                    sb.append(ern.a(com.yandex.passport.sloth.command.d.class));
                    l1j.o(sb, " nor ", ern.a(s.class));
                    return null;
                }
                gm5Var = dVar.j;
                qgg.h0(obj);
                dVar.j = null;
                dVar.m = 2;
                obj = gm5Var.s(dVar);
            }
        }
        dVar = new d(this, cg6Var);
        Object obj2 = dVar.k;
        nm6 nm6Var2 = nm6.a;
        i = dVar.m;
        if (i != 0) {
        }
        dVar.j = null;
        dVar.m = 2;
        obj2 = gm5Var.s(dVar);
    }

    @Override // com.yandex.passport.sloth.command.t
    public final /* bridge */ /* synthetic */ Object q(m mVar, Object obj, com.yandex.passport.sloth.command.f fVar) {
        switch (this.a) {
            case 0:
                return a((com.yandex.passport.sloth.command.data.i) obj, fVar);
            default:
                return b((x) obj, fVar);
        }
    }
}
