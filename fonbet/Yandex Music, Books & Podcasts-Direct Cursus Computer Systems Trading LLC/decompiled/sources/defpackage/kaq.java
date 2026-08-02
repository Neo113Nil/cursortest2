package defpackage;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class kaq extends aur implements pyc {
    public final /* synthetic */ int j;
    public /* synthetic */ wpw k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kaq(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.j = i2;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        wpw wpwVar = (wpw) obj;
        switch (this.j) {
            case 0:
                kaq kaqVar = new kaq(3, 0, (Continuation) obj3);
                kaqVar.k = wpwVar;
                return kaqVar.invokeSuspend(Unit.a);
            default:
                kaq kaqVar2 = new kaq(3, 1, (Continuation) obj3);
                kaqVar2.k = wpwVar;
                return kaqVar2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        x1u x1uVar;
        int i;
        naq p;
        mqs mqsVar;
        long j;
        switch (this.j) {
            case 0:
                wpw wpwVar = this.k;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                hqw b = wpwVar.b();
                if (b != null) {
                    if (!(b instanceof gqw)) {
                        if (!(b instanceof cqw)) {
                            if (!(b instanceof aqw) && !(b instanceof bqw)) {
                                b6e.s();
                                break;
                            }
                        } else {
                            cqw cqwVar = (cqw) b;
                            vaq vaqVar = cqwVar.f;
                            Integer q = vaqVar.q(1);
                            if (q != null) {
                                int intValue = q.intValue();
                                saq saqVar = (saq) CollectionsKt.S(vaqVar.c, intValue);
                                if (saqVar != null && (x1uVar = saqVar.e) != null) {
                                    ssg.a(4, "YnisonRemoteQueue", "skip queue", null);
                                    cqwVar.b().c.a(new npw(0L, x1uVar.f, intValue, cqwVar.a().b()));
                                }
                            }
                        }
                    } else {
                        ((gqw) b).g();
                    }
                }
                break;
            default:
                wpw wpwVar2 = this.k;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                hqw b2 = wpwVar2.b();
                if (b2 != null) {
                    if (!(b2 instanceof gqw)) {
                        if (!(b2 instanceof cqw)) {
                            if (!(b2 instanceof aqw) && !(b2 instanceof bqw)) {
                                b6e.s();
                                break;
                            }
                        } else {
                            cqw cqwVar2 = (cqw) b2;
                            ssg.a(4, "YnisonRemoteQueue", "rewind", null);
                            vaq vaqVar2 = cqwVar2.f;
                            Integer q2 = vaqVar2.q(-1);
                            if (q2 != null) {
                                int intValue2 = q2.intValue();
                                cqwVar2.b().c.a(new opw(0L, ((saq) vaqVar2.c.get(intValue2)).e.f, intValue2, cqwVar2.a().b()));
                            }
                        }
                    } else {
                        gqw gqwVar = (gqw) b2;
                        jyr jyrVar = gqwVar.d;
                        ssg.a(4, "YnisonRemoteQueue", "rewind", null);
                        jbq jbqVar = gqwVar.f;
                        gxj t = jbqVar.t(-1);
                        if (t != null && (p = jbqVar.p((i = t.a))) != null && (mqsVar = p.e) != null) {
                            mlw b3 = gqwVar.b();
                            Long a = ((msw) jyrVar.getValue()).a(mqsVar);
                            if (a != null) {
                                Long l = (((msw) jyrVar.getValue()).a == null || !r1l.c(a.longValue(), mqsVar.e)) ? a : null;
                                if (l != null) {
                                    j = l.longValue();
                                    b3.c.a(new opw(j, mqsVar.e, i, gqwVar.a().b()));
                                }
                            }
                            j = 0;
                            b3.c.a(new opw(j, mqsVar.e, i, gqwVar.a().b()));
                        }
                    }
                }
                break;
        }
        return null;
    }
}
