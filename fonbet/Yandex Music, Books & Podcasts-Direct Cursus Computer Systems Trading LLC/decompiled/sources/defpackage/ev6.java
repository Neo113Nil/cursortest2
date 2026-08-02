package defpackage;

import com.yandex.plus.core.debug.panel.internal.model.log.a;
import com.yandex.plus.core.debug.panel.internal.model.log.d;
import com.yandex.plus.core.debug.panel.internal.model.log.g;
import com.yandex.plus.core.debug.panel.internal.presentation.state.e;
import com.yandex.plus.core.debug.panel.internal.presentation.viewModel.c;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class ev6 extends aur implements ryc {
    public final /* synthetic */ int j;
    public /* synthetic */ boolean k;
    public /* synthetic */ Object l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ev6(Object obj, Continuation continuation, int i) {
        super(4, continuation);
        this.j = i;
        this.n = obj;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.j) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ev6 ev6Var = new ev6((kv6) this.n, (Continuation) obj4, 0);
                ev6Var.k = booleanValue;
                ev6Var.l = (u2q) obj2;
                ev6Var.m = (u2q) obj3;
                return ev6Var.invokeSuspend(Unit.a);
            case 1:
                boolean booleanValue2 = ((Boolean) obj3).booleanValue();
                ev6 ev6Var2 = new ev6((xpl) this.n, (Continuation) obj4, 1);
                ev6Var2.l = (nvm) obj;
                ev6Var2.m = (h4q) obj2;
                ev6Var2.k = booleanValue2;
                return ev6Var2.invokeSuspend(Unit.a);
            case 2:
                boolean booleanValue3 = ((Boolean) obj3).booleanValue();
                ev6 ev6Var3 = new ev6((t1w) this.n, (Continuation) obj4, 2);
                ev6Var3.l = (a1w) obj;
                ev6Var3.m = (zzv) obj2;
                ev6Var3.k = booleanValue3;
                return ev6Var3.invokeSuspend(Unit.a);
            default:
                boolean booleanValue4 = ((Boolean) obj2).booleanValue();
                ev6 ev6Var4 = new ev6((c) this.n, (Continuation) obj4, 3);
                ev6Var4.l = (List) obj;
                ev6Var4.k = booleanValue4;
                ev6Var4.m = (d) obj3;
                return ev6Var4.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        g gVar;
        int i = this.j;
        Object obj2 = this.n;
        int i2 = 0;
        switch (i) {
            case 0:
                kv6 kv6Var = (kv6) obj2;
                boolean z = this.k;
                u2q u2qVar = (u2q) this.l;
                u2q u2qVar2 = (u2q) this.m;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                if (u2qVar2 == null) {
                    return null;
                }
                ssg.a(3, "CrossfadingExoPlayerImpl", "combine crossfadeEnabled=" + z + " nextPlayable=" + u2qVar + " current=" + u2qVar2, null);
                int ordinal = u2qVar.g.ordinal();
                if (ordinal != 0 && ordinal != 1) {
                    if (ordinal == 2 || ordinal == 3) {
                        return null;
                    }
                    b6e.s();
                    return null;
                }
                if (u2qVar.b.equals(u2qVar2.b)) {
                    return null;
                }
                r2 = z && u2qVar.d && kv6Var.m;
                if (r2 || ((Boolean) kv6Var.g.a.a).booleanValue()) {
                    return new vat(u2qVar, u2qVar2, Boolean.valueOf(r2));
                }
                return null;
            case 1:
                nvm nvmVar = (nvm) this.l;
                h4q h4qVar = (h4q) this.m;
                boolean z2 = this.k;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                float f = h4qVar.a;
                m2v m2vVar = xpl.f;
                Long l = nvmVar.c;
                return new m2v(l.longValue() != 0 ? nvmVar.b / l.longValue() : 0.0f, f, l.longValue(), z2);
            case 2:
                a1w a1wVar = (a1w) this.l;
                zzv zzvVar = (zzv) this.m;
                boolean z3 = this.k;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                if (a1wVar instanceof y0w) {
                    if (((t1w) obj2).p && !z3) {
                        r2 = false;
                    }
                    return new vyv(r2);
                }
                if (a1wVar instanceof z0w) {
                    return new wyv(((z0w) a1wVar).a, zzvVar);
                }
                b6e.s();
                return null;
            default:
                List list = (List) this.l;
                boolean z4 = this.k;
                d dVar = (d) this.m;
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                c cVar = (c) obj2;
                a aVar = (a) cVar.l.getValue();
                if (aVar != null && (gVar = aVar.b) != null) {
                    i2 = yhn.d(gVar.a, 0, cVar.h.size() - 1);
                }
                return new e(list, i2, z4, dVar);
        }
    }
}
