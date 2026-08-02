package defpackage;

import com.yandex.music.shared.ynison.api.queue.YnisonEditQueueCommand$AddLast;
import com.yandex.music.shared.ynison.api.queue.YnisonEditQueueCommand$AddNext;
import com.yandex.music.shared.ynison.api.queue.YnisonEditQueueCommand$Move;
import com.yandex.music.shared.ynison.api.queue.YnisonEditQueueCommand$RemoveAt;
import com.yandex.music.shared.ynison.api.queue.YnisonNavigateCommand$OriginalPosition;
import com.yandex.music.shared.ynison.api.queue.YnisonNavigateCommand$QueuePosition;
import com.yandex.music.shared.ynison.api.queue.YnisonOptionCommand$ShuffleToggle;
import com.yandex.pulse.metrics.o;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes3.dex */
public final class t81 extends aur implements pyc {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t81(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.j = i;
        this.l = obj;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.j) {
            case 0:
                t81 t81Var = new t81(3, 0, (Continuation) obj3);
                t81Var.k = (y81) obj;
                t81Var.l = (e91) obj2;
                return t81Var.invokeSuspend(Unit.a);
            case 1:
                t81 t81Var2 = new t81(3, 1, (Continuation) obj3);
                t81Var2.k = (List) obj;
                t81Var2.l = (rr5) obj2;
                return t81Var2.invokeSuspend(Unit.a);
            case 2:
                t81 t81Var3 = new t81(3, 2, (Continuation) obj3);
                t81Var3.k = (wgg) obj;
                t81Var3.l = (rj6) obj2;
                return t81Var3.invokeSuspend(Unit.a);
            case 3:
                t81 t81Var4 = new t81(3, 3, (Continuation) obj3);
                t81Var4.k = (s84) obj;
                t81Var4.l = (p84) obj2;
                return t81Var4.invokeSuspend(Unit.a);
            case 4:
                t81 t81Var5 = new t81((nq7) this.l, (Continuation) obj3, 4);
                t81Var5.k = (Pair) obj;
                return t81Var5.invokeSuspend(Unit.a);
            case 5:
                t81 t81Var6 = new t81(3, 5, (Continuation) obj3);
                t81Var6.k = (jia) obj;
                t81Var6.l = (kia) obj2;
                return t81Var6.invokeSuspend(Unit.a);
            case 6:
                t81 t81Var7 = new t81(3, 6, (Continuation) obj3);
                t81Var7.k = (xxq) obj;
                t81Var7.l = (lja) obj2;
                return t81Var7.invokeSuspend(Unit.a);
            case 7:
                t81 t81Var8 = new t81(3, 7, (Continuation) obj3);
                t81Var8.k = (Pair) obj;
                t81Var8.l = (Set) obj2;
                return t81Var8.invokeSuspend(Unit.a);
            case 8:
                t81 t81Var9 = new t81(3, 8, (Continuation) obj3);
                t81Var9.k = (nuu) obj;
                t81Var9.l = (ymk) obj2;
                return t81Var9.invokeSuspend(Unit.a);
            case 9:
                t81 t81Var10 = new t81(3, 9, (Continuation) obj3);
                t81Var10.k = (List) obj;
                t81Var10.l = (ahn) obj2;
                return t81Var10.invokeSuspend(Unit.a);
            case 10:
                t81 t81Var11 = new t81(3, 10, (Continuation) obj3);
                t81Var11.k = (s2g) obj;
                t81Var11.l = (s2g) obj2;
                return t81Var11.invokeSuspend(Unit.a);
            case 11:
                t81 t81Var12 = new t81(3, 11, (Continuation) obj3);
                t81Var12.k = (y7p) obj;
                t81Var12.l = (y7p) obj2;
                return t81Var12.invokeSuspend(Unit.a);
            case 12:
                t81 t81Var13 = new t81(3, 12, (Continuation) obj3);
                t81Var13.k = (pbj) obj;
                t81Var13.l = (e6l) obj2;
                return t81Var13.invokeSuspend(Unit.a);
            case 13:
                t81 t81Var14 = new t81(3, 13, (Continuation) obj3);
                t81Var14.k = (pbj) obj;
                t81Var14.l = (pbj) obj2;
                return t81Var14.invokeSuspend(Unit.a);
            case 14:
                t81 t81Var15 = new t81(3, 14, (Continuation) obj3);
                t81Var15.k = (xxq) obj;
                t81Var15.l = (kvu) obj2;
                return t81Var15.invokeSuspend(Unit.a);
            case 15:
                t81 t81Var16 = new t81(this.l, (Continuation) obj3, 15);
                t81Var16.k = obj;
                return t81Var16.invokeSuspend(Unit.a);
            case 16:
                t81 t81Var17 = new t81(3, 16, (Continuation) obj3);
                t81Var17.k = (xwk) obj;
                t81Var17.l = (xwk) obj2;
                return t81Var17.invokeSuspend(Unit.a);
            case 17:
                t81 t81Var18 = new t81(3, 17, (Continuation) obj3);
                t81Var18.k = (a74) obj;
                t81Var18.l = (ok4) obj2;
                return t81Var18.invokeSuspend(Unit.a);
            case 18:
                t81 t81Var19 = new t81(3, 18, (Continuation) obj3);
                t81Var19.k = (y7q) obj;
                t81Var19.l = (y7q) obj2;
                return t81Var19.invokeSuspend(Unit.a);
            case 19:
                t81 t81Var20 = new t81(3, 19, (Continuation) obj3);
                t81Var20.k = (z0m) obj;
                t81Var20.l = (ndc) obj2;
                return t81Var20.invokeSuspend(Unit.a);
            case 20:
                t81 t81Var21 = new t81(3, 20, (Continuation) obj3);
                t81Var21.k = (a1m) obj;
                t81Var21.l = (a1m) obj2;
                return t81Var21.invokeSuspend(Unit.a);
            case 21:
                t81 t81Var22 = new t81(3, 21, (Continuation) obj3);
                t81Var22.k = (List) obj;
                t81Var22.l = (String) obj2;
                return t81Var22.invokeSuspend(Unit.a);
            case 22:
                t81 t81Var23 = new t81(3, 22, (Continuation) obj3);
                t81Var23.k = (k84) obj;
                t81Var23.l = (m84) obj2;
                return t81Var23.invokeSuspend(Unit.a);
            case 23:
                t81 t81Var24 = new t81(3, 23, (Continuation) obj3);
                t81Var24.k = (wpw) obj;
                t81Var24.l = (YnisonEditQueueCommand$AddNext) obj2;
                return t81Var24.invokeSuspend(Unit.a);
            case 24:
                t81 t81Var25 = new t81(3, 24, (Continuation) obj3);
                t81Var25.k = (wpw) obj;
                t81Var25.l = (YnisonEditQueueCommand$AddLast) obj2;
                return t81Var25.invokeSuspend(Unit.a);
            case 25:
                t81 t81Var26 = new t81(3, 25, (Continuation) obj3);
                t81Var26.k = (wpw) obj;
                t81Var26.l = (YnisonEditQueueCommand$RemoveAt) obj2;
                return t81Var26.invokeSuspend(Unit.a);
            case 26:
                t81 t81Var27 = new t81(3, 26, (Continuation) obj3);
                t81Var27.k = (wpw) obj;
                t81Var27.l = (YnisonEditQueueCommand$Move) obj2;
                return t81Var27.invokeSuspend(Unit.a);
            case 27:
                t81 t81Var28 = new t81(3, 27, (Continuation) obj3);
                t81Var28.k = (wpw) obj;
                t81Var28.l = (YnisonNavigateCommand$OriginalPosition) obj2;
                return t81Var28.invokeSuspend(Unit.a);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                t81 t81Var29 = new t81(3, 28, (Continuation) obj3);
                t81Var29.k = (wpw) obj;
                t81Var29.l = (YnisonNavigateCommand$QueuePosition) obj2;
                return t81Var29.invokeSuspend(Unit.a);
            default:
                t81 t81Var30 = new t81(3, 29, (Continuation) obj3);
                t81Var30.k = (wpw) obj;
                t81Var30.l = (YnisonOptionCommand$ShuffleToggle) obj2;
                return t81Var30.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Integer num;
        Integer num2;
        boolean z = false;
        Float f = null;
        r5 = null;
        Float f2 = null;
        f = null;
        switch (this.j) {
            case 0:
                y81 y81Var = (y81) this.k;
                e91 e91Var = (e91) this.l;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                break;
            case 1:
                List list = (List) this.k;
                rr5 rr5Var = (rr5) this.l;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (Intrinsics.d(((y62) obj2).a, rr5Var.a)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                y62 y62Var = (y62) obj2;
                if (y62Var != null) {
                    break;
                }
                break;
            case 2:
                wgg wggVar = (wgg) this.k;
                rj6 rj6Var = (rj6) this.l;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                break;
            case 3:
                s84 s84Var = (s84) this.k;
                p84 p84Var = (p84) this.l;
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                if (s84Var != s84.f) {
                    break;
                }
                break;
            case 4:
                Pair pair = (Pair) this.k;
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                e5d e5dVar = (e5d) pair.a;
                b3l b3lVar = (b3l) pair.b;
                nq7 nq7Var = (nq7) this.l;
                w3d w3dVar = new w3d(nq7Var.r);
                String str = e5dVar.c;
                c5d c5dVar = nq7Var.f;
                break;
            case 5:
                jia jiaVar = (jia) this.k;
                kia kiaVar = (kia) this.l;
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                break;
            case 6:
                xxq xxqVar = (xxq) this.k;
                lja ljaVar = (lja) this.l;
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                break;
            case 7:
                Pair pair2 = (Pair) this.k;
                Set set = (Set) this.l;
                nm6 nm6Var8 = nm6.a;
                qgg.h0(obj);
                break;
            case 8:
                nuu nuuVar = (nuu) this.k;
                ymk ymkVar = (ymk) this.l;
                nm6 nm6Var9 = nm6.a;
                qgg.h0(obj);
                bzs bzsVar = nuuVar.a;
                Float f3 = ymkVar.e;
                if (bzsVar != bzs.e) {
                    if (f3 != null && f3.floatValue() >= 0.0f) {
                        f = f3;
                    }
                    break;
                } else {
                    if (f3 != null && f3.floatValue() >= 0.0f) {
                        f2 = f3;
                    }
                    break;
                }
            case 9:
                List list2 = (List) this.k;
                ahn ahnVar = (ahn) this.l;
                nm6 nm6Var10 = nm6.a;
                qgg.h0(obj);
                break;
            case 10:
                s2g s2gVar = (s2g) this.k;
                s2g s2gVar2 = (s2g) this.l;
                nm6 nm6Var11 = nm6.a;
                qgg.h0(obj);
                break;
            case 11:
                y7p y7pVar = (y7p) this.k;
                y7p y7pVar2 = (y7p) this.l;
                nm6 nm6Var12 = nm6.a;
                qgg.h0(obj);
                if (y7pVar != null && y7pVar2 != null && (y7pVar instanceof j7p) && !(y7pVar2 instanceof j7p)) {
                    break;
                }
                break;
            case 12:
                pbj pbjVar = (pbj) this.k;
                e6l e6lVar = (e6l) this.l;
                nm6 nm6Var13 = nm6.a;
                qgg.h0(obj);
                d6l x = p6g.x(e6lVar);
                if (x != null && pbjVar != null && gut.Y(x.a, pbjVar)) {
                    if (x.b != w0l.b) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 13:
                pbj pbjVar2 = (pbj) this.k;
                pbj pbjVar3 = (pbj) this.l;
                nm6 nm6Var14 = nm6.a;
                qgg.h0(obj);
                if (pbjVar3 instanceof lbj) {
                    lbj lbjVar = (lbj) pbjVar3;
                    mqs mqsVar = lbjVar.b;
                    if (Intrinsics.d(lbjVar.c, pbjVar2.getId())) {
                        lbj lbjVar2 = (lbj) (Intrinsics.d(mqsVar, pbjVar2.a()) ? pbjVar3 : null);
                        if (lbjVar2 != null) {
                            break;
                        } else {
                            mqs a = pbjVar2.a();
                            if (a != null) {
                                mqsVar = a;
                            }
                            oq oqVar = lbjVar.a;
                            oqVar.getClass();
                            break;
                        }
                    }
                }
                if (pbjVar2 instanceof nbj) {
                    break;
                }
                break;
            case 14:
                xxq xxqVar2 = (xxq) this.k;
                kvu kvuVar = (kvu) this.l;
                nm6 nm6Var15 = nm6.a;
                qgg.h0(obj);
                break;
            case 15:
                nm6 nm6Var16 = nm6.a;
                qgg.h0(obj);
                if (this.k == null) {
                    break;
                }
                break;
            case 16:
                xwk xwkVar = (xwk) this.k;
                xwk xwkVar2 = (xwk) this.l;
                nm6 nm6Var17 = nm6.a;
                qgg.h0(obj);
                if (xwkVar != null) {
                    if (gl5.b(Long.valueOf(xwkVar.b), xwkVar2 != null ? Long.valueOf(xwkVar2.b) : null) <= 0) {
                        xwkVar = null;
                    }
                    if (xwkVar != null) {
                        xwkVar2 = xwkVar;
                    }
                }
                if (xwkVar2 != null) {
                    break;
                }
                break;
            case 17:
                a74 a74Var = (a74) this.k;
                ok4 ok4Var = (ok4) this.l;
                nm6 nm6Var18 = nm6.a;
                qgg.h0(obj);
                if (!a74Var.a && !ok4Var.a.isEmpty()) {
                    break;
                } else {
                    break;
                }
                break;
            case 18:
                y7q y7qVar = (y7q) this.k;
                y7q y7qVar2 = (y7q) this.l;
                nm6 nm6Var19 = nm6.a;
                qgg.h0(obj);
                if (!(y7qVar instanceof u7q) || (!(y7qVar2 instanceof x7q) && !(y7qVar2 instanceof w7q))) {
                    break;
                }
                break;
            case 19:
                z0m z0mVar = (z0m) this.k;
                ndc ndcVar = (ndc) this.l;
                nm6 nm6Var20 = nm6.a;
                qgg.h0(obj);
                break;
            case 20:
                a1m a1mVar = (a1m) this.k;
                a1m a1mVar2 = (a1m) this.l;
                nm6 nm6Var21 = nm6.a;
                qgg.h0(obj);
                if (!(a1mVar instanceof z0m)) {
                    if (a1mVar2 instanceof z0m) {
                        break;
                    } else if (a1mVar2 == null) {
                    }
                }
                break;
            case 21:
                List list3 = (List) this.k;
                String str2 = (String) this.l;
                nm6 nm6Var22 = nm6.a;
                qgg.h0(obj);
                List list4 = list3;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    Iterator it2 = list4.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (Intrinsics.d(((ggd) it2.next()).a(), str2)) {
                                z = true;
                            }
                        }
                    }
                }
                break;
            case 22:
                k84 k84Var = (k84) this.k;
                m84 m84Var = (m84) this.l;
                nm6 nm6Var23 = nm6.a;
                qgg.h0(obj);
                if (k84Var == null) {
                    break;
                }
                break;
            case 23:
                wpw wpwVar = (wpw) this.k;
                YnisonEditQueueCommand$AddNext ynisonEditQueueCommand$AddNext = (YnisonEditQueueCommand$AddNext) this.l;
                nm6 nm6Var24 = nm6.a;
                qgg.h0(obj);
                List playables = ynisonEditQueueCommand$AddNext.getPlayables();
                wpwVar.getClass();
                playables.getClass();
                hqw b = wpwVar.b();
                if (b != null) {
                    if (!(b instanceof gqw)) {
                        if (!(b instanceof cqw) && !(b instanceof aqw) && !(b instanceof bqw)) {
                            b6e.s();
                            break;
                        }
                    } else {
                        gqw gqwVar = (gqw) b;
                        ouj.B("add next ", playables, 4, "YnisonRemoteQueue", null);
                        gqwVar.b().c.a(new hpw(playables, gqwVar.a().b()));
                    }
                }
                break;
            case 24:
                wpw wpwVar2 = (wpw) this.k;
                YnisonEditQueueCommand$AddLast ynisonEditQueueCommand$AddLast = (YnisonEditQueueCommand$AddLast) this.l;
                nm6 nm6Var25 = nm6.a;
                qgg.h0(obj);
                List playables2 = ynisonEditQueueCommand$AddLast.getPlayables();
                wpwVar2.getClass();
                playables2.getClass();
                hqw b2 = wpwVar2.b();
                if (b2 != null) {
                    if (!(b2 instanceof gqw)) {
                        if (!(b2 instanceof cqw) && !(b2 instanceof aqw) && !(b2 instanceof bqw)) {
                            b6e.s();
                            break;
                        }
                    } else {
                        gqw gqwVar2 = (gqw) b2;
                        ouj.B("add last ", playables2, 4, "YnisonRemoteQueue", null);
                        gqwVar2.b().c.a(new gpw(playables2, gqwVar2.a().b()));
                    }
                }
                break;
            case 25:
                wpw wpwVar3 = (wpw) this.k;
                YnisonEditQueueCommand$RemoveAt ynisonEditQueueCommand$RemoveAt = (YnisonEditQueueCommand$RemoveAt) this.l;
                nm6 nm6Var26 = nm6.a;
                qgg.h0(obj);
                int position = ynisonEditQueueCommand$RemoveAt.getPosition();
                hqw b3 = wpwVar3.b();
                if (b3 != null) {
                    if (!(b3 instanceof gqw)) {
                        if (!(b3 instanceof cqw) && !(b3 instanceof aqw) && !(b3 instanceof bqw)) {
                            b6e.s();
                            break;
                        }
                    } else {
                        gqw gqwVar3 = (gqw) b3;
                        ssg.a(4, "YnisonRemoteQueue", "remove at queuePosition=".concat(ran.a(position)), null);
                        jbq jbqVar = gqwVar3.f;
                        int size = jbqVar.n().size();
                        if (position >= 0 && position < size) {
                            List r = jbqVar.r();
                            if (r != null && (num = (Integer) CollectionsKt.S(r, position)) != null) {
                                position = num.intValue();
                            }
                            gqwVar3.b().c.a(new kpw(position, gqwVar3.a().b()));
                        }
                    }
                }
                break;
            case 26:
                wpw wpwVar4 = (wpw) this.k;
                YnisonEditQueueCommand$Move ynisonEditQueueCommand$Move = (YnisonEditQueueCommand$Move) this.l;
                nm6 nm6Var27 = nm6.a;
                qgg.h0(obj);
                int from = ynisonEditQueueCommand$Move.getFrom();
                int to = ynisonEditQueueCommand$Move.getTo();
                hqw b4 = wpwVar4.b();
                if (b4 != null) {
                    if (!(b4 instanceof gqw)) {
                        if (!(b4 instanceof cqw) && !(b4 instanceof aqw) && !(b4 instanceof bqw)) {
                            b6e.s();
                            break;
                        }
                    } else {
                        gqw gqwVar4 = (gqw) b4;
                        ssg.a(4, "YnisonRemoteQueue", f1d.e(from, to, "move from ", " to "), null);
                        gqwVar4.b().c.a(new jpw(gqwVar4.a().b(), from, to));
                    }
                }
                break;
            case 27:
                wpw wpwVar5 = (wpw) this.k;
                YnisonNavigateCommand$OriginalPosition ynisonNavigateCommand$OriginalPosition = (YnisonNavigateCommand$OriginalPosition) this.l;
                nm6 nm6Var28 = nm6.a;
                qgg.h0(obj);
                int index = ynisonNavigateCommand$OriginalPosition.getIndex();
                hqw b5 = wpwVar5.b();
                if (b5 != null) {
                    if (!(b5 instanceof gqw)) {
                        if (!(b5 instanceof cqw)) {
                            if (!(b5 instanceof aqw) && !(b5 instanceof bqw)) {
                                b6e.s();
                                break;
                            }
                        } else {
                            ((cqw) b5).e(index);
                        }
                    } else {
                        ((gqw) b5).e(index);
                    }
                }
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                wpw wpwVar6 = (wpw) this.k;
                YnisonNavigateCommand$QueuePosition ynisonNavigateCommand$QueuePosition = (YnisonNavigateCommand$QueuePosition) this.l;
                nm6 nm6Var29 = nm6.a;
                qgg.h0(obj);
                int index2 = ynisonNavigateCommand$QueuePosition.getIndex();
                hqw b6 = wpwVar6.b();
                if (b6 != null) {
                    if (!(b6 instanceof gqw)) {
                        if (!(b6 instanceof cqw)) {
                            if (!(b6 instanceof aqw) && !(b6 instanceof bqw)) {
                                b6e.s();
                                break;
                            }
                        } else {
                            ((cqw) b6).e(index2);
                        }
                    } else {
                        gqw gqwVar5 = (gqw) b6;
                        ssg.a(4, "YnisonRemoteQueue", "setPosition queuePosition=".concat(ran.a(index2)), null);
                        jbq jbqVar2 = gqwVar5.f;
                        IntRange m = yhn.m(0, jbqVar2.n().size() + (1 ^ jbqVar2.q().isEmpty()));
                        int i = m.a;
                        int i2 = m.b;
                        if (i <= index2 && index2 <= i2) {
                            List r2 = jbqVar2.r();
                            if (r2 != null && (num2 = (Integer) CollectionsKt.S(r2, index2)) != null) {
                                index2 = num2.intValue();
                            }
                            gqwVar5.e(index2);
                        }
                    }
                }
                break;
            default:
                wpw wpwVar7 = (wpw) this.k;
                YnisonOptionCommand$ShuffleToggle ynisonOptionCommand$ShuffleToggle = (YnisonOptionCommand$ShuffleToggle) this.l;
                nm6 nm6Var30 = nm6.a;
                qgg.h0(obj);
                boolean enabled = ynisonOptionCommand$ShuffleToggle.getEnabled();
                hqw b7 = wpwVar7.b();
                if (b7 != null) {
                    if (!(b7 instanceof gqw)) {
                        if (!(b7 instanceof cqw) && !(b7 instanceof aqw) && !(b7 instanceof bqw)) {
                            b6e.s();
                            break;
                        }
                    } else {
                        ((gqw) b7).f(enabled);
                    }
                }
                break;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t81(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.j = i2;
    }
}
