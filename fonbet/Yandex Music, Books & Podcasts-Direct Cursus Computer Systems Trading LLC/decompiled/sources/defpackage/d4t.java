package defpackage;

import com.yandex.passport.common.logger.a;
import com.yandex.passport.common.logger.b;
import com.yandex.passport.internal.sloth.performers.webcard.f;
import com.yandex.passport.sloth.b1;
import com.yandex.passport.sloth.h0;
import com.yandex.plus.core.data.pay.t;
import com.yandex.plus.core.data.pay.u;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.f1;
import com.yandex.plus.pay.api.feature.inapp.restore.e;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class d4t extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d4t(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.j = i2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                d4t d4tVar = new d4t(2, 0, continuation);
                d4tVar.k = obj;
                return d4tVar;
            case 1:
                d4t d4tVar2 = new d4t(2, 1, continuation);
                d4tVar2.k = obj;
                return d4tVar2;
            case 2:
                d4t d4tVar3 = new d4t(2, 2, continuation);
                d4tVar3.k = obj;
                return d4tVar3;
            case 3:
                d4t d4tVar4 = new d4t(2, 3, continuation);
                d4tVar4.k = obj;
                return d4tVar4;
            case 4:
                d4t d4tVar5 = new d4t(2, 4, continuation);
                d4tVar5.k = obj;
                return d4tVar5;
            case 5:
                d4t d4tVar6 = new d4t(2, 5, continuation);
                d4tVar6.k = obj;
                return d4tVar6;
            case 6:
                d4t d4tVar7 = new d4t(2, 6, continuation);
                d4tVar7.k = obj;
                return d4tVar7;
            case 7:
                d4t d4tVar8 = new d4t(2, 7, continuation);
                d4tVar8.k = obj;
                return d4tVar8;
            case 8:
                d4t d4tVar9 = new d4t(2, 8, continuation);
                d4tVar9.k = obj;
                return d4tVar9;
            case 9:
                d4t d4tVar10 = new d4t(2, 9, continuation);
                d4tVar10.k = obj;
                return d4tVar10;
            case 10:
                d4t d4tVar11 = new d4t(2, 10, continuation);
                d4tVar11.k = obj;
                return d4tVar11;
            case 11:
                d4t d4tVar12 = new d4t(2, 11, continuation);
                d4tVar12.k = obj;
                return d4tVar12;
            case 12:
                d4t d4tVar13 = new d4t(2, 12, continuation);
                d4tVar13.k = obj;
                return d4tVar13;
            case 13:
                d4t d4tVar14 = new d4t(2, 13, continuation);
                d4tVar14.k = obj;
                return d4tVar14;
            case 14:
                d4t d4tVar15 = new d4t(2, 14, continuation);
                d4tVar15.k = obj;
                return d4tVar15;
            case 15:
                d4t d4tVar16 = new d4t(2, 15, continuation);
                d4tVar16.k = obj;
                return d4tVar16;
            default:
                d4t d4tVar17 = new d4t(2, 16, continuation);
                d4tVar17.k = obj;
                return d4tVar17;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((d4t) create((j1g) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((d4t) create((sjt) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((d4t) create((Pair) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((d4t) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((d4t) create((xqw) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((d4t) create((Pair) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((d4t) create((nnw) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((d4t) create((Pair) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((d4t) create((nnw) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((d4t) create((h0) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((d4t) create((b1) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 11:
                return ((d4t) create((f) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 12:
                return ((d4t) create((e) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 13:
                return ((d4t) create((u) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 14:
                return ((d4t) create((Pair) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 15:
                return ((d4t) create((f1) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((d4t) create((e) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                j1g j1gVar = (j1g) this.k;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(j1gVar == j1g.b);
            case 1:
                sjt sjtVar = (sjt) this.k;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                if (!(sjtVar instanceof rjt)) {
                    if (!(sjtVar instanceof qjt)) {
                        b6e.s();
                        return null;
                    }
                    fjt fjtVar = ((qjt) sjtVar).b;
                    if (!(fjtVar instanceof ejt)) {
                        if (!(fjtVar instanceof djt)) {
                            b6e.s();
                            return null;
                        }
                        return Boolean.valueOf(r1);
                    }
                }
                r1 = true;
                return Boolean.valueOf(r1);
            case 2:
                Pair pair = (Pair) this.k;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                return pair.b;
            case 3:
                lpi lpiVar = (lpi) this.k;
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                ec7.d(lpiVar, "is_one_to_one_hint_was_shown", true);
                return Unit.a;
            case 4:
                xqw xqwVar = (xqw) this.k;
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                ssg.a(4, afw.l, "Ynison " + (xqwVar.a() ? "started" : "stopped") + " cause " + xqwVar, null);
                return Unit.a;
            case 5:
                Pair pair2 = (Pair) this.k;
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                ((jcw) pair2.b).f.add("player_state");
                return Unit.a;
            case 6:
                nnw nnwVar = (nnw) this.k;
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                ssg.a(3, anw.l, "player_state " + nnwVar.c + " event by " + nnwVar.b, null);
                return Unit.a;
            case 7:
                Pair pair3 = (Pair) this.k;
                nm6 nm6Var8 = nm6.a;
                qgg.h0(obj);
                ((jcw) pair3.b).f.add("playing_status");
                return Unit.a;
            case 8:
                nnw nnwVar2 = (nnw) this.k;
                nm6 nm6Var9 = nm6.a;
                qgg.h0(obj);
                ssg.a(3, hnw.h, "playing_status " + nnwVar2.c + " event by " + nnwVar2.b, null);
                return Unit.a;
            case 9:
                h0 h0Var = (h0) this.k;
                nm6 nm6Var10 = nm6.a;
                qgg.h0(obj);
                if (a.a.isEnabled()) {
                    a.c(b.b, null, "New sloth commandRequest: " + h0Var, 8);
                }
                return Unit.a;
            case 10:
                b1 b1Var = (b1) this.k;
                nm6 nm6Var11 = nm6.a;
                qgg.h0(obj);
                if (a.a.isEnabled()) {
                    a.c(b.b, null, "New sloth result: " + b1Var, 8);
                }
                return Unit.a;
            case 11:
                f fVar = (f) this.k;
                nm6 nm6Var12 = nm6.a;
                qgg.h0(obj);
                if (a.a.isEnabled()) {
                    a.c(b.b, null, "New web card event: " + fVar, 8);
                }
                return Unit.a;
            case 12:
                e eVar = (e) this.k;
                nm6 nm6Var13 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(com.yandex.plus.bdui.flex.ui.a.y(eVar));
            case 13:
                u uVar = (u) this.k;
                nm6 nm6Var14 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(!(uVar instanceof t));
            case 14:
                Pair pair4 = (Pair) this.k;
                nm6 nm6Var15 = nm6.a;
                qgg.h0(obj);
                return pair4.a;
            case 15:
                f1 f1Var = (f1) this.k;
                nm6 nm6Var16 = nm6.a;
                qgg.h0(obj);
                com.yandex.plus.core.analytics.logging.e.b(com.yandex.plus.core.analytics.logging.b.g, "treasuryAdapter.eventsFlow.onEach(inMessage=" + f1Var + ')');
                return Unit.a;
            default:
                e eVar2 = (e) this.k;
                nm6 nm6Var17 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(com.yandex.plus.bdui.flex.ui.a.y(eVar2));
        }
    }
}
