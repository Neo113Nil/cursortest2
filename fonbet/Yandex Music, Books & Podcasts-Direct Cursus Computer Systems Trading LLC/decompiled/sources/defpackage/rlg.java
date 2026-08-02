package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.yandex.music.databases.main.MainDatabase;
import com.yandex.music.databases.user.UserDatabase;
import com.yandex.music.shared.playback.api.commands.PlayCommand;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import com.yandex.passport.api.impl.b;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlin.text.c;
import ru.yandex.music.utils.LoginAccountsChangedReceiver;
import ru.yandex.video.m3.player.utils.network.NetworkType;

/* loaded from: classes3.dex */
public final class rlg extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ Object l;
    public Object m;
    public Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public rlg(nyf nyfVar, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.j = 21;
        lyf lyfVar = lyf.a;
        this.n = nyfVar;
        this.l = (aur) function2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x0056, code lost:
    
        if (defpackage.kvf.a(r0, r1, r2, r3, true, r5, r6, r7, r16) == r9) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x008f, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x008d, code lost:
    
        if (defpackage.kvf.a(r6, r1, 0, 0, false, null, null, r7, r16) == r9) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02e9 A[LOOP:2: B:83:0x02e3->B:85:0x02e9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object k(Object obj) {
        g1k g1kVar;
        Iterator it;
        g1k g1kVar2;
        boolean z;
        pfg pfgVar = pfg.c;
        pfg pfgVar2 = pfg.b;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i != 0) {
            if (i == 1 || i == 2) {
                qgg.h0(obj);
                g1kVar = (g1k) this.m;
                if (!(g1kVar instanceof a1k) || (g1kVar instanceof w0k) || (g1kVar instanceof f1k)) {
                    it = ((kvf) this.n).g.iterator();
                    while (it.hasNext()) {
                        ((Function0) it.next()).invoke();
                    }
                }
                return Unit.a;
            }
            if (i != 3) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
            kvf kvfVar = (kvf) this.n;
            c2k c2kVar = kvfVar.e;
            g1kVar2 = (g1k) this.m;
            mka mkaVar = kvfVar.k;
            c2kVar.getClass();
            g1kVar2.getClass();
            mkaVar.getClass();
            if (!(g1kVar2 instanceof a1k)) {
                a1k a1kVar = (a1k) g1kVar2;
                ArrayList arrayList = c2kVar.a;
                List list = a1kVar.b;
                Iterator it2 = list.iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    i2 += ((c7t) it2.next()).b.size();
                }
                int d = c2kVar.d();
                int ordinal = a1kVar.a.ordinal();
                if (ordinal == 0) {
                    xq0.q("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
                    return null;
                }
                if (ordinal == 1) {
                    int min = Math.min(c2kVar.c, i2);
                    int i3 = i2 - min;
                    arrayList.addAll(0, list);
                    c2kVar.b += i2;
                    c2kVar.c = a1kVar.c;
                    mkaVar.s(min);
                    mkaVar.x(i3);
                    int d2 = (c2kVar.d() - d) - i3;
                    if (d2 > 0) {
                        mkaVar.x(d2);
                    } else if (d2 < 0) {
                        mkaVar.y(-d2);
                    }
                } else if (ordinal == 2) {
                    int min2 = Math.min(c2kVar.d, i2);
                    int i4 = i2 - min2;
                    arrayList.addAll(arrayList.size(), list);
                    c2kVar.b += i2;
                    c2kVar.d = a1kVar.d;
                    mkaVar.s(min2);
                    mkaVar.x(i4);
                    int d3 = (c2kVar.d() - d) - i4;
                    if (d3 > 0) {
                        mkaVar.x(d3);
                    } else if (d3 < 0) {
                        mkaVar.y(-d3);
                    }
                }
                ofg ofgVar = a1kVar.e;
                ofg ofgVar2 = a1kVar.f;
                ofgVar.getClass();
                t1f t1fVar = ((kvf) mkaVar.a).f;
                t1fVar.getClass();
                t1fVar.u(new lma(11, t1fVar, ofgVar, ofgVar2));
            } else if (g1kVar2 instanceof w0k) {
                int d4 = c2kVar.d();
                int i5 = c2kVar.d;
                IntRange intRange = new IntRange(0, 0, 1);
                Iterator it3 = c2kVar.a.iterator();
                int i6 = 0;
                while (it3.hasNext()) {
                    c7t c7tVar = (c7t) it3.next();
                    int[] iArr = c7tVar.a;
                    int length = iArr.length;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length) {
                            break;
                        }
                        if (intRange.q(iArr[i7])) {
                            i6 += c7tVar.b.size();
                            it3.remove();
                            break;
                        }
                        i7++;
                    }
                }
                c2kVar.b -= i6;
                c2kVar.d = 0;
                int d5 = c2kVar.d() - d4;
                if (d5 > 0) {
                    mkaVar.x(d5);
                } else if (d5 < 0) {
                    mkaVar.y(-d5);
                }
                int min3 = 0 - (i5 - (d5 < 0 ? Math.min(i5, -d5) : 0));
                if (min3 > 0) {
                    mkaVar.s(min3);
                }
                t1f t1fVar2 = ((kvf) mkaVar.a).f;
                t1fVar2.getClass();
                t1fVar2.u(new afg(6, pfgVar, t1fVar2));
            } else if (g1kVar2 instanceof b1k) {
                b1k b1kVar = (b1k) g1kVar2;
                ofg ofgVar3 = b1kVar.a;
                ofg ofgVar4 = b1kVar.b;
                t1f t1fVar3 = ((kvf) mkaVar.a).f;
                t1fVar3.getClass();
                t1fVar3.u(new lma(11, t1fVar3, ofgVar3, ofgVar4));
            } else if (g1kVar2 instanceof f1k) {
                xq0.q("Paging received an event to display a static list, while still actively loading\nfrom an existing generation of PagingData. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
                return null;
            }
            if (((g1k) this.m) instanceof w0k) {
                ((kvf) this.n).i = false;
            }
            if (((g1k) this.m) instanceof a1k) {
                mb5 mb5Var = (mb5) ((fkn) ((kvf) this.n).f.d).a.getValue();
                ofg ofgVar5 = mb5Var != null ? mb5Var.d : null;
                if (ofgVar5 == null) {
                    xq0.q("PagingDataDiffer.combinedLoadStatesCollection.stateFlow shouldnot hold null CombinedLoadStates after Insert event.");
                    return null;
                }
                boolean z2 = ofgVar5.b.a;
                boolean z3 = ofgVar5.c.a;
                a1k a1kVar2 = (a1k) ((g1k) this.m);
                pfg pfgVar3 = a1kVar2.a;
                boolean z4 = ((pfgVar3 == pfgVar2 && z2) || (pfgVar3 == pfgVar && z3)) ? false : true;
                List list2 = a1kVar2.b;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it4 = list2.iterator();
                    while (it4.hasNext()) {
                        if (!((c7t) it4.next()).b.isEmpty()) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                kvf kvfVar2 = (kvf) this.n;
                if (!z4) {
                    kvfVar2.i = false;
                } else if (kvfVar2.i || z) {
                    if (!z) {
                        int i8 = ((kvf) this.n).j;
                        kvf kvfVar3 = (kvf) this.n;
                        if (i8 >= kvfVar3.e.c) {
                            int i9 = kvfVar3.j;
                            kvf kvfVar4 = (kvf) this.n;
                            c2k c2kVar2 = kvfVar4.e;
                            if (i9 <= c2kVar2.c + c2kVar2.b) {
                                kvfVar4.i = false;
                            }
                        }
                    }
                    kvf kvfVar5 = (kvf) this.n;
                    gyd gydVar = kvfVar5.c;
                    if (gydVar != null) {
                        gydVar.k(kvfVar5.e.a(kvfVar5.j));
                    }
                }
            }
            g1kVar = (g1k) this.m;
            if (!(g1kVar instanceof a1k)) {
            }
            it = ((kvf) this.n).g.iterator();
            while (it.hasNext()) {
            }
            return Unit.a;
        }
        qgg.h0(obj);
        g1k g1kVar3 = (g1k) this.m;
        if (g1kVar3 instanceof a1k) {
            a1k a1kVar3 = (a1k) g1kVar3;
            if (a1kVar3.a == pfg.a) {
                kvf kvfVar6 = (kvf) this.n;
                List list3 = a1kVar3.b;
                int i10 = a1kVar3.c;
                int i11 = a1kVar3.d;
                ofg ofgVar6 = a1kVar3.e;
                ofg ofgVar7 = a1kVar3.f;
                gyd gydVar2 = ((v3k) this.l).c;
                this.k = 1;
            }
        }
        boolean z5 = g1kVar3 instanceof f1k;
        kvf kvfVar7 = (kvf) this.n;
        if (!z5) {
            kvfVar7.getClass();
            kvf kvfVar8 = (kvf) this.n;
            c2k c2kVar3 = kvfVar8.e;
            g1kVar2 = (g1k) this.m;
            mka mkaVar2 = kvfVar8.k;
            c2kVar3.getClass();
            g1kVar2.getClass();
            mkaVar2.getClass();
            if (!(g1kVar2 instanceof a1k)) {
            }
            if (((g1k) this.m) instanceof w0k) {
            }
            if (((g1k) this.m) instanceof a1k) {
            }
            g1kVar = (g1k) this.m;
            if (!(g1kVar instanceof a1k)) {
            }
            it = ((kvf) this.n).g.iterator();
            while (it.hasNext()) {
            }
            return Unit.a;
        }
        List c = t75.c(new c7t(((f1k) ((g1k) this.m)).a, 0));
        ((f1k) ((g1k) this.m)).getClass();
        gyd gydVar3 = ((v3k) this.l).c;
        this.k = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0030, code lost:
    
        if (r8 == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object l(Object obj) {
        Object obj2;
        long longValue;
        xlw xlwVar = (xlw) this.n;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            pbx pbxVar = (pbx) xlwVar.c.c;
            this.k = 1;
            obj = pbxVar.b(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.m;
                qgg.h0(obj);
                rgw rgwVar = (rgw) this.l;
                longValue = ((Number) obj).longValue();
                rgwVar.getClass();
                if (rgw.b() && longValue < 0) {
                    longValue = 0;
                }
                return new Pair(obj2, new Long(longValue));
            }
            qgg.h0(obj);
        }
        pbx pbxVar2 = (pbx) xlwVar.c.d;
        this.m = obj;
        this.k = 2;
        Object b = pbxVar2.b(this);
        if (b != nm6Var) {
            obj2 = obj;
            obj = b;
            rgw rgwVar2 = (rgw) this.l;
            longValue = ((Number) obj).longValue();
            rgwVar2.getClass();
            if (rgw.b()) {
                longValue = 0;
            }
            return new Pair(obj2, new Long(longValue));
        }
        return nm6Var;
    }

    private final Object n(Object obj) {
        rjc rjcVar = (rjc) this.m;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            xqn i2 = hrg.i(obj);
            xqn xqnVar = new xqn();
            a1l a1lVar = (a1l) this.n;
            tl0 tl0Var = new tl0(i2, xqnVar, rjcVar, (t1f) this.l);
            this.m = null;
            this.k = 1;
            if (a1lVar.collect(tl0Var, this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.j;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                return new rlg((xlg) obj2, (cvl) this.n, continuation);
            case 1:
                return new rlg((xlg) obj2, (cvl) this.m, continuation, (xlg) this.n);
            case 2:
                return new rlg((Intent) this.n, (LoginAccountsChangedReceiver) obj2, continuation, 2);
            case 3:
                return new rlg((rn5) this.m, (n7q) this.n, (mwk) obj2, continuation, 3);
            case 4:
                return new rlg((eno) this.m, (wnh) this.n, (xdr) obj2, continuation, 4);
            case 5:
                return new rlg((af5) this.m, (n1p) this.n, (j7i) obj2, continuation, 5);
            case 6:
                return new rlg((bci) this.n, (aqi) obj2, continuation, 6);
            case 7:
                return new rlg((bci) this.m, (mm6) this.n, (vm0) obj2, continuation, 7);
            case 8:
                rlg rlgVar = new rlg((aqi) this.n, (aqi) obj2, continuation, 8);
                rlgVar.m = obj;
                return rlgVar;
            case 9:
                rlg rlgVar2 = new rlg((xqn) this.n, (h7e) obj2, continuation, 9);
                rlgVar2.m = obj;
                return rlgVar2;
            case 10:
                rlg rlgVar3 = new rlg((n7b) this.n, (gmi) obj2, continuation, 10);
                rlgVar3.m = obj;
                return rlgVar3;
            case 11:
                rlg rlgVar4 = new rlg((fa6) this.n, (i1j) obj2, continuation, 11);
                rlgVar4.m = obj;
                return rlgVar4;
            case 12:
                rlg rlgVar5 = new rlg((l2j) this.n, (Context) obj2, continuation, 12);
                rlgVar5.m = obj;
                return rlgVar5;
            case 13:
                return new rlg((cr) this.m, (lt) this.n, (String) obj2, continuation, 13);
            case 14:
                return new rlg((jtc) this.m, (oq) this.n, (mq) obj2, continuation, 14);
            case 15:
                rlg rlgVar6 = new rlg(continuation, (tqn) this.n, (llj) obj2);
                rlgVar6.m = obj;
                return rlgVar6;
            case 16:
                return new rlg((pjc) this.m, continuation, (tqn) this.n, (llj) obj2);
            case 17:
                return new rlg((fvf) this.m, (Function0) this.n, (Function0) obj2, continuation, 17);
            case 18:
                return new rlg((avj) obj2, continuation, 18);
            case 19:
                rlg rlgVar7 = new rlg((zi3) this.n, (w1k) obj2, continuation, 19);
                rlgVar7.m = obj;
                return rlgVar7;
            case 20:
                return new rlg((g1k) this.m, (kvf) this.n, (v3k) obj2, continuation, 20);
            case 21:
                nyf nyfVar = (nyf) this.n;
                lyf lyfVar = lyf.a;
                rlg rlgVar8 = new rlg(nyfVar, (Function2) obj2, continuation);
                rlgVar8.m = obj;
                return rlgVar8;
            case 22:
                return new rlg((lhk) this.n, (iv8) obj2, continuation, 22);
            case 23:
                return new rlg((ekk) this.m, (String) this.n, (tf6) obj2, continuation, 23);
            case 24:
                return new rlg((h4b) this.m, (String) this.n, (Collection) obj2, continuation, 24);
            case 25:
                return new rlg((vx6) this.m, (wvk) this.n, (PlayCommand) obj2, continuation, 25);
            case 26:
                return new rlg((xlw) this.n, (rgw) obj2, continuation, 26);
            case 27:
                return new rlg((ime) this.m, (zug) this.n, (h2l) obj2, continuation, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                rlg rlgVar9 = new rlg((a1l) this.n, (t1f) obj2, continuation, 28);
                rlgVar9.m = obj;
                return rlgVar9;
            default:
                return new rlg((x3l) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((rlg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((rlg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((rlg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((rlg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((rlg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((rlg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((rlg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((rlg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((rlg) create((pfm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((rlg) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((rlg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 11:
                return ((rlg) create((ltm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 12:
                return ((rlg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 13:
                return ((rlg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 14:
                return ((rlg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 15:
                return ((rlg) create(obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 16:
                return ((rlg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 17:
                return ((rlg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 18:
                return ((rlg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 19:
                return ((rlg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 20:
                return ((rlg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 21:
                return ((rlg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 22:
                return ((rlg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 23:
                return ((rlg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 24:
                return ((rlg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 25:
                return ((rlg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 26:
                return ((rlg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 27:
                return ((rlg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return ((rlg) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((rlg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:177:0x0337, code lost:
    
        if (r2.a(r24) == r1) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0aa8, code lost:
    
        if (((defpackage.iv0) r0).b(r24) == r1) goto L467;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0a8b, code lost:
    
        if (r3 == r1) goto L467;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x013f, code lost:
    
        if (r1.invoke(r24) == r0) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:320:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x079f  */
    /* JADX WARN: Type inference failed for: r1v108, types: [aur, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:291:0x0784 -> B:281:0x0788). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        cvl cvlVar;
        cvl cvlVar2;
        Object V;
        String str;
        Object f;
        Object h0;
        aqi aqiVar;
        String str2;
        rjc rjcVar;
        Object obj2;
        List e0;
        String str3;
        dhi dhiVar;
        int i;
        fo7 fo7Var;
        Function0 vdVar;
        Object t7oVar;
        Object L;
        oqi oqiVar;
        oqi oqiVar2;
        pyf pyfVar;
        pyf pyfVar2;
        Object V2;
        Object a;
        xdr xdrVar;
        x3l x3lVar;
        qqi qqiVar;
        int i2 = 6;
        int i3 = 2;
        switch (this.j) {
            case 0:
                Object obj3 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    xlg xlgVar = (xlg) this.l;
                    cvl cvlVar3 = (cvl) this.n;
                    String str4 = xlgVar.e.c().a;
                    str4.getClass();
                    this.m = cvlVar3;
                    this.k = 1;
                    b = xlg.b(xlgVar, str4, cvlVar3, this);
                    if (b != obj3) {
                        cvlVar = cvlVar3;
                    }
                    return obj3;
                }
                if (i4 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cvl cvlVar4 = (cvl) this.m;
                qgg.h0(obj);
                b = obj;
                cvlVar = cvlVar4;
                obj3 = (cvl) b;
                if (obj3 == null) {
                    return cvlVar;
                }
                return obj3;
            case 1:
                cvl cvlVar5 = (cvl) this.m;
                nm6 nm6Var = nm6.a;
                int i5 = this.k;
                try {
                    try {
                        if (i5 == 0) {
                            qgg.h0(obj);
                            xlg xlgVar2 = (xlg) this.l;
                            String str5 = xlgVar2.e.c().a;
                            str5.getClass();
                            f44 f44Var = new f44(xlgVar2, (Continuation) null, xlgVar2, str5, cvlVar5, (xlg) this.n);
                            cvlVar2 = cvlVar5;
                            try {
                                mn7 mn7Var = dm6.b;
                                this.k = 1;
                                V = x97.V(mn7Var, f44Var, this);
                                if (V == nm6Var) {
                                    return nm6Var;
                                }
                            } catch (IllegalStateException e) {
                                e = e;
                                Assertions.throwOrSkip("LocalPlaylistRepository", new FailedAssertionException(hrg.r("Failed to get playlist ", cvlVar2.b, ", id ", cvlVar2.e()), e));
                                return null;
                            }
                        } else {
                            if (i5 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj);
                            V = obj;
                            cvlVar2 = cvlVar5;
                        }
                        return (rrl) V;
                    } catch (IllegalStateException e2) {
                        e = e2;
                        cvlVar2 = cvlVar5;
                    }
                } catch (CancellationException e3) {
                    throw e3;
                }
            case 2:
                jyr jyrVar = ((LoginAccountsChangedReceiver) this.l).a;
                nm6 nm6Var2 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    Bundle extras = ((Intent) this.n).getExtras();
                    if (extras != null) {
                        int i7 = extras.getInt("environment");
                        long j = extras.getLong("uid");
                        b.a(i7).getClass();
                        str = String.valueOf(j);
                    } else {
                        str = null;
                    }
                    av0 av0Var = (av0) jyrVar.getValue();
                    this.m = str;
                    this.k = 1;
                    f = ((iv0) av0Var).a.f(this);
                    break;
                } else {
                    if (i6 != 1) {
                        if (i6 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) this.m;
                    qgg.h0(obj);
                    f = obj;
                }
                if (Intrinsics.d(str, ((xxq) f).a)) {
                    av0 av0Var2 = (av0) jyrVar.getValue();
                    this.m = null;
                    this.k = 2;
                    break;
                }
                return Unit.a;
            case 3:
                mwk mwkVar = (mwk) this.l;
                rn5 rn5Var = (rn5) this.m;
                mm6 mm6Var = (mm6) rn5Var.b;
                nm6 nm6Var3 = nm6.a;
                int i8 = this.k;
                if (i8 != 0) {
                    if (i8 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                wqr wqrVar = new wqr(saf.Q(mm6Var.getCoroutineContext()));
                rn5Var.g = wqrVar;
                wqrVar.R((dgh) rn5Var.d);
                ggh gghVar = new ggh(((t3g) ((wsh) rn5Var.c).a.getValue()).v(mwkVar), ((Boolean) wdg.A((n7q) this.n, b3i.g)).booleanValue(), ((Boolean) dag.p(mwkVar, e88.c)).booleanValue());
                tf6 X = gld.X(mm6Var, wqrVar);
                this.k = 1;
                Object G0 = zsd.G0(gghVar, X, this);
                return G0 == nm6Var3 ? nm6Var3 : G0;
            case 4:
                nm6 nm6Var4 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    pjc C = zsd.C(zsd.s0((eno) this.m, new zig(this.n, (Continuation) (null == true ? 1 : 0), 16)), 0);
                    otd otdVar = new otd(27, (xdr) this.l);
                    this.k = 1;
                    if (C.collect(otdVar, this) == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 5:
                af5 af5Var = (af5) this.m;
                j7i j7iVar = (j7i) this.l;
                n1p n1pVar = (n1p) this.n;
                nm6 nm6Var5 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    n1p n1pVar2 = af5Var.b;
                    if (!(n1pVar2 != null ? n1pVar2.a : "top").equals(n1pVar.a)) {
                        x0q x0qVar = j7iVar.w;
                        af5 af5Var2 = new af5(af5Var.a, n1pVar);
                        this.k = 1;
                        if (x0qVar.emit(af5Var2, this) == nm6Var5) {
                            return nm6Var5;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Iterator it = ((List) j7iVar.M().b).iterator();
                int i11 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i11 = -1;
                    } else if (!((n1p) it.next()).a.equals(n1pVar.a)) {
                        i11++;
                    }
                }
                Integer num = new Integer(i11);
                Integer num2 = num.intValue() != -1 ? num : null;
                r7 = num2 != null ? num2.intValue() : 0;
                grh grhVar = (grh) j7iVar.p.b;
                n1pVar.getClass();
                String str6 = (String) grhVar.i;
                if (str6 != null) {
                    tao taoVar = (tao) grhVar.d;
                    nmb nmbVar = (nmb) taoVar.d;
                    String str7 = (String) taoVar.b;
                    long b2 = ((zzp) taoVar.e).b();
                    mkb k = tao.k((c0p) taoVar.c);
                    String G = ((fnb) taoVar.a).G();
                    amb t = tao.t(tao.d(n1pVar));
                    nmbVar.getClass();
                    str7.getClass();
                    G.getClass();
                    LinkedHashMap r = su4.r("search_session_id", str7);
                    r.put("event_timestamp", String.valueOf(b2));
                    r.put("page_id", k.a);
                    r.put("hash", G);
                    eta.m(r7, "filter_type", t.a, "filter_pos", r);
                    dfi.p(1, "req_id", str6, "_meta", r);
                    nmbVar.C("Search.SearchFilter.Tapped", r);
                }
                return Unit.a;
            case 6:
                nm6 nm6Var6 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    aqi aqiVar2 = (aqi) this.l;
                    eno s0 = szf.s0(new abi((bci) this.n, 0));
                    lf2 lf2Var = new lf2(i3, 9, null == true ? 1 : 0);
                    this.m = aqiVar2;
                    this.k = 1;
                    h0 = zsd.h0(s0, lf2Var, this);
                    if (h0 == nm6Var6) {
                        return nm6Var6;
                    }
                    aqiVar = aqiVar2;
                } else {
                    if (i12 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aqiVar = (aqi) this.m;
                    qgg.h0(obj);
                    h0 = obj;
                }
                Boolean bool = (Boolean) h0;
                bool.getClass();
                act actVar = rbi.a;
                aqiVar.setValue(bool);
                return Unit.a;
            case 7:
                nm6 nm6Var7 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    eno s02 = szf.s0(new abi((bci) this.m, 1));
                    lrf lrfVar = new lrf(11, (mm6) this.n, (vm0) this.l);
                    this.k = 1;
                    if (s02.collect(lrfVar, this) == nm6Var7) {
                        return nm6Var7;
                    }
                } else {
                    if (i13 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 8:
                pfm pfmVar = (pfm) this.m;
                nm6 nm6Var8 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    ui6 ui6Var = new ui6((aqi) this.n, (aqi) this.l, i3);
                    this.m = null;
                    this.k = 1;
                    if (g6s.e(pfmVar, null, null, ui6Var, this, 7) == nm6Var8) {
                        return nm6Var8;
                    }
                } else {
                    if (i14 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 9:
                h7e h7eVar = (h7e) this.l;
                xqn xqnVar = (xqn) this.n;
                nm6 nm6Var9 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar2 = (rjc) this.m;
                    ij3 ij3Var = h7eVar.c;
                    String m0 = vq1.m0(h7eVar.b);
                    if (m0 != null) {
                        List e02 = StringsKt.e0(m0, new char[]{';'}, 6);
                        ArrayList arrayList = new ArrayList(v75.o(e02, 10));
                        Iterator it2 = e02.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(StringsKt.t0((String) it2.next()).toString());
                        }
                        Iterator it3 = arrayList.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj2 = it3.next();
                                if (c.v((String) obj2, "boundary=", false)) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        String str8 = (String) obj2;
                        if (str8 != null && (e0 = StringsKt.e0(str8, new char[]{'='}, 6)) != null && (str3 = (String) CollectionsKt.S(e0, 1)) != null) {
                            str2 = StringsKt.u0(str3, '\"', '\'');
                            if (str2 != null) {
                                throw new ep0("Expected the Content-Type to have a boundary parameter", null);
                            }
                            xqnVar.a = new dhi(ij3Var, str2);
                            rjcVar = rjcVar2;
                            Object obj4 = xqnVar.a;
                            obj4.getClass();
                            dhiVar = (dhi) obj4;
                            pn3 pn3Var = dhiVar.b;
                            ij3 ij3Var2 = dhiVar.a;
                            if (dhiVar.e) {
                            }
                        }
                    }
                    str2 = null;
                    if (str2 != null) {
                    }
                } else {
                    if (i15 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rjcVar = (rjc) this.m;
                    qgg.h0(obj);
                    int i16 = 6;
                    xqn xqnVar2 = xqnVar;
                    i2 = i16;
                    xqnVar = xqnVar2;
                    Object obj42 = xqnVar.a;
                    obj42.getClass();
                    dhiVar = (dhi) obj42;
                    pn3 pn3Var2 = dhiVar.b;
                    ij3 ij3Var22 = dhiVar.a;
                    if (dhiVar.e) {
                        xq0.q("closed");
                        return null;
                    }
                    if (dhiVar.f) {
                        i16 = i2;
                        xqnVar2 = xqnVar;
                        fo7Var = null;
                        i = 1;
                    } else {
                        xqnVar2 = xqnVar;
                        if (dhiVar.d == 0 && ij3Var22.A0(0L, pn3Var2)) {
                            ij3Var22.skip(pn3Var2.d());
                        } else {
                            while (true) {
                                long a2 = dhiVar.a(8192L);
                                if (a2 != 0) {
                                    ij3Var22.skip(a2);
                                } else {
                                    ij3Var22.skip(dhiVar.c.d());
                                }
                            }
                        }
                        boolean z = false;
                        while (true) {
                            int h02 = ij3Var22.h0(dhiVar.h);
                            if (h02 == -1) {
                                throw new ep0("unexpected characters after boundary", null);
                            }
                            if (h02 == 0) {
                                i16 = 6;
                                if (dhiVar.d == 0) {
                                    throw new ep0("expected at least 1 part", null);
                                }
                                i = 1;
                                dhiVar.f = true;
                                fo7Var = null;
                            } else if (h02 == 1) {
                                dhiVar.d++;
                                ArrayList arrayList2 = new ArrayList();
                                while (true) {
                                    String T = ij3Var22.T();
                                    if (T.length() == 0) {
                                        chi chiVar = new chi(dhiVar);
                                        dhiVar.g = chiVar;
                                        fo7Var = new fo7(arrayList2, new ikn(chiVar));
                                        i = 1;
                                    } else {
                                        int S = StringsKt.S(T, ':', 0, 6);
                                        if (S == -1) {
                                            wb8.h("Unexpected header: ".concat(T));
                                            return null;
                                        }
                                        arrayList2.add(new t6e(StringsKt.t0(T.substring(0, S)).toString(), StringsKt.t0(T.substring(S + 1)).toString()));
                                    }
                                }
                            } else if (h02 == 2) {
                                if (z) {
                                    throw new ep0("unexpected characters after boundary", null);
                                }
                                if (dhiVar.d == 0) {
                                    throw new ep0("expected at least 1 part", null);
                                }
                                i = 1;
                                dhiVar.f = true;
                                fo7Var = null;
                            } else if (h02 == 3 || h02 == 4) {
                                z = true;
                            }
                        }
                        i16 = 6;
                    }
                    if (fo7Var == null) {
                        return Unit.a;
                    }
                    ikn iknVar = (ikn) fo7Var.b;
                    this.m = rjcVar;
                    this.k = i;
                    if (rjcVar.emit(iknVar, this) == nm6Var9) {
                        return nm6Var9;
                    }
                    i2 = i16;
                    xqnVar = xqnVar2;
                    Object obj422 = xqnVar.a;
                    obj422.getClass();
                    dhiVar = (dhi) obj422;
                    pn3 pn3Var22 = dhiVar.b;
                    ij3 ij3Var222 = dhiVar.a;
                    if (dhiVar.e) {
                    }
                }
                break;
            case 10:
                mm6 mm6Var2 = (mm6) this.m;
                nm6 nm6Var10 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    dkn Y = bkp.Y(mm6Var2, (pjc) ((n7b) this.n).a);
                    fmi fmiVar = new fmi(r7, (gmi) this.l);
                    this.m = null;
                    this.k = 1;
                    if (Y.a.collect(fmiVar, this) == nm6Var10) {
                        return nm6Var10;
                    }
                } else {
                    if (i17 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 11:
                i1j i1jVar = (i1j) this.l;
                ConnectivityManager connectivityManager = i1jVar.a;
                nm6 nm6Var11 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    ltm ltmVar = (ltm) this.m;
                    NetworkRequest a3 = ((fa6) this.n).a();
                    if (a3 == null) {
                        ktm ktmVar = (ktm) ltmVar;
                        ktmVar.getClass();
                        ktmVar.p0(null);
                        return Unit.a;
                    }
                    avi aviVar = new avi(1, x97.y(ltmVar, null, null, new h1j((Object) i1jVar, (Object) ltmVar, (Continuation) (null == true ? 1 : 0), r7), 3), ltmVar);
                    if (Build.VERSION.SDK_INT >= 30) {
                        p2q.a.getClass();
                        vdVar = p2q.a(connectivityManager, a3, aviVar);
                    } else {
                        int i19 = xd0.c;
                        xd0 xd0Var = new xd0(aviVar);
                        tqn tqnVar = new tqn();
                        try {
                            jsg.j().e(r3w.a, "NetworkRequestConstraintController register callback");
                            connectivityManager.registerNetworkCallback(a3, xd0Var);
                            tqnVar.a = true;
                        } catch (RuntimeException e4) {
                            if (!c.n(e4.getClass().getName(), "TooManyRequestsException", false)) {
                                throw e4;
                            }
                            jsg.j().f(r3w.a, "NetworkRequestConstraintController couldn't register callback", e4);
                            aviVar.invoke(new ma6(7));
                        }
                        vdVar = new vd(29, tqnVar, connectivityManager, xd0Var);
                    }
                    g1j g1jVar = new g1j(r7, vdVar);
                    this.k = 1;
                    if (y7g.q(ltmVar, g1jVar, this) == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i18 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 12:
                nm6 nm6Var12 = nm6.a;
                int i20 = this.k;
                try {
                    if (i20 == 0) {
                        qgg.h0(obj);
                        l2j l2jVar = (l2j) this.n;
                        Context context = (Context) this.l;
                        r7o r7oVar = z7o.b;
                        k2j k2jVar = new k2j(l2jVar, context, null == true ? 1 : 0, 1);
                        this.k = 1;
                        L = tyf.L(50L, k2jVar, this);
                        if (L == nm6Var12) {
                            return nm6Var12;
                        }
                    } else {
                        if (i20 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        L = obj;
                    }
                    t7oVar = (NetworkType) L;
                    if (t7oVar == null) {
                        t7oVar = NetworkType.NETWORK_TYPE_UNKNOWN;
                    }
                    r7o r7oVar2 = z7o.b;
                } catch (Throwable th) {
                    r7o r7oVar3 = z7o.b;
                    t7oVar = new t7o(th);
                }
                Throwable a4 = z7o.a(t7oVar);
                if (a4 != null) {
                    Log.d("YP:NetworkTypeProvider", fob.b(a4));
                }
                Object obj5 = t7oVar instanceof t7o ? NetworkType.NETWORK_TYPE_UNKNOWN : t7oVar;
                ((l2j) this.n).c = (NetworkType) obj5;
                return obj5;
            case 13:
                nm6 nm6Var13 = nm6.a;
                int i21 = this.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    cr crVar = (cr) this.m;
                    lt ltVar = (lt) this.n;
                    String str9 = (String) this.l;
                    this.k = 1;
                    if (cr.q(crVar, ltVar, str9, this) == nm6Var13) {
                        return nm6Var13;
                    }
                } else {
                    if (i21 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 14:
                nm6 nm6Var14 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    ms msVar = (ms) ((jtc) this.m).a;
                    oq oqVar = (oq) this.n;
                    mq mqVar = (mq) this.l;
                    this.k = 1;
                    if (msVar.f(oqVar, mqVar, this) == nm6Var14) {
                        return nm6Var14;
                    }
                } else {
                    if (i22 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 15:
                Object obj6 = this.m;
                nm6 nm6Var15 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    Pair pair = (Pair) obj6;
                    String str10 = (String) pair.a;
                    kvu kvuVar = (kvu) pair.b;
                    tqn tqnVar2 = (tqn) this.n;
                    boolean z2 = tqnVar2.a;
                    tqnVar2.a = false;
                    llj lljVar = (llj) this.l;
                    this.m = null;
                    this.k = 1;
                    if (llj.a(lljVar, str10, kvuVar, z2, this) == nm6Var15) {
                        return nm6Var15;
                    }
                } else {
                    if (i23 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 16:
                nm6 nm6Var16 = nm6.a;
                int i24 = this.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar = (pjc) this.m;
                    rlg rlgVar = new rlg((Continuation) null, (tqn) this.n, (llj) this.l);
                    this.k = 1;
                    if (zsd.O(pjcVar, rlgVar, this) == nm6Var16) {
                        return nm6Var16;
                    }
                } else {
                    if (i24 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 17:
                nm6 nm6Var17 = nm6.a;
                int i25 = this.k;
                if (i25 == 0) {
                    qgg.h0(obj);
                    eno s03 = szf.s0(new ga2((fvf) this.m, 8));
                    lrf lrfVar2 = new lrf(25, (Function0) this.n, (Function0) this.l);
                    this.k = 1;
                    if (s03.collect(lrfVar2, this) == nm6Var17) {
                        return nm6Var17;
                    }
                } else {
                    if (i25 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 18:
                avj avjVar = (avj) this.l;
                nm6 nm6Var18 = nm6.a;
                int i26 = this.k;
                try {
                    if (i26 == 0) {
                        qgg.h0(obj);
                        oqiVar = (oqi) avjVar.G.getValue();
                        this.m = oqiVar;
                        this.n = avjVar;
                        this.k = 1;
                        break;
                    } else {
                        if (i26 != 1) {
                            if (i26 != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar2 = (oqi) this.m;
                            try {
                                qgg.h0(obj);
                                oqiVar2.b(null);
                                return Unit.a;
                            } catch (Throwable th2) {
                                th = th2;
                                oqiVar2.b(null);
                                throw th;
                            }
                        }
                        avjVar = (avj) this.n;
                        oqiVar = (oqi) this.m;
                        qgg.h0(obj);
                    }
                    l8j l8jVar = l8j.c;
                    m1i m1iVar = new m1i(avjVar, null == true ? 1 : 0, 20);
                    this.m = oqiVar;
                    this.n = null;
                    this.k = 2;
                    if (x97.V(l8jVar, m1iVar, this) != nm6Var18) {
                        oqiVar2 = oqiVar;
                        oqiVar2.b(null);
                        return Unit.a;
                    }
                    return nm6Var18;
                } catch (Throwable th3) {
                    th = th3;
                    oqiVar2 = oqiVar;
                    oqiVar2.b(null);
                    throw th;
                }
            case 19:
                nm6 nm6Var19 = nm6.a;
                int i27 = this.k;
                if (i27 == 0) {
                    qgg.h0(obj);
                    mm6 mm6Var3 = (mm6) this.m;
                    nc4 V3 = zsd.V((zi3) this.n);
                    u1k u1kVar = new u1k((w1k) this.l, mm6Var3);
                    this.k = 1;
                    if (V3.collect(u1kVar, this) == nm6Var19) {
                        return nm6Var19;
                    }
                } else {
                    if (i27 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 20:
                return k(obj);
            case 21:
                nm6 nm6Var20 = nm6.a;
                int i28 = this.k;
                if (i28 == 0) {
                    qgg.h0(obj);
                    r2f r2fVar = (r2f) ((mm6) this.m).getCoroutineContext().get(o6c.l);
                    if (r2fVar == null) {
                        xq0.q("when[State] methods should have a parent job");
                        return null;
                    }
                    rbk rbkVar = new rbk();
                    nyf nyfVar = (nyf) this.n;
                    lyf lyfVar = lyf.a;
                    pyfVar = new pyf(nyfVar, rbkVar.d, r2fVar);
                    try {
                        ?? r1 = (aur) this.l;
                        this.m = pyfVar;
                        this.k = 1;
                        V2 = x97.V(rbkVar, r1, this);
                        if (V2 == nm6Var20) {
                            return nm6Var20;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        pyfVar2 = pyfVar;
                        pyfVar2.a();
                        throw th;
                    }
                } else {
                    if (i28 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pyfVar2 = (pyf) this.m;
                    try {
                        qgg.h0(obj);
                        pyfVar = pyfVar2;
                        V2 = obj;
                    } catch (Throwable th5) {
                        th = th5;
                        pyfVar2.a();
                        throw th;
                    }
                }
                pyfVar.a();
                return V2;
            case 22:
                nm6 nm6Var21 = nm6.a;
                int i29 = this.k;
                if (i29 == 0) {
                    qgg.h0(obj);
                    lhk lhkVar = (lhk) this.n;
                    xdr xdrVar2 = lhkVar.v;
                    oek oekVar = (oek) lhkVar.o.getValue();
                    String str11 = ((iv8) this.l).a;
                    this.m = xdrVar2;
                    this.k = 1;
                    jyr jyrVar2 = oekVar.a;
                    jyr jyrVar3 = oekVar.b;
                    a = ((k5m) jyrVar2.getValue()).b().a(new rkj(6, "music_communication_screen", null, ((mh7) jyrVar3.getValue()).a(), str11, ((mh7) jyrVar3.getValue()).b()), this);
                    if (a == nm6Var21) {
                        return nm6Var21;
                    }
                    xdrVar = xdrVar2;
                } else {
                    if (i29 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xdrVar = (xdr) this.m;
                    qgg.h0(obj);
                    a = obj;
                }
                xdrVar.l(a);
                return Unit.a;
            case 23:
                Object obj7 = nm6.a;
                int i30 = this.k;
                if (i30 == 0) {
                    qgg.h0(obj);
                    Function1 function1 = ((ekk) this.m).f;
                    this.k = 1;
                    break;
                } else {
                    if (i30 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                obj7 = ((ekk) this.m).b.invoke((String) this.n);
                ekk ekkVar = (ekk) this.m;
                String str12 = (String) this.n;
                tf6 tf6Var = (tf6) this.l;
                ueo ueoVar = (ueo) obj7;
                ueoVar.j().getWritableDatabase();
                d5h d5hVar = ekkVar.d;
                if (d5hVar != null) {
                    MainDatabase mainDatabase = (MainDatabase) ueoVar;
                    str12.getClass();
                    HashMap hashMap = d5h.f;
                    synchronized (hashMap) {
                        try {
                            Integer num3 = (Integer) hashMap.get(str12);
                            if (num3 == null) {
                                hashMap.put(str12, 1);
                            } else {
                                ssg.a(7, "MainDatabaseInitializer", "Initialize db for (" + (num3.intValue() + 1) + ") time for user " + str12, null);
                                hashMap.put(str12, Integer.valueOf(num3.intValue() + 1));
                            }
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    }
                    x97.y(tf6Var, null, null, new rfg((UserDatabase) ((dst) d5hVar.a.getValue()).c(str12), mainDatabase, d5hVar, str12, null, 10), 3);
                    x97.y(tf6Var, null, null, new zig(d5hVar, mainDatabase, null == true ? 1 : 0, i2), 3);
                }
                return obj7;
            case 24:
                nm6 nm6Var22 = nm6.a;
                int i31 = this.k;
                if (i31 == 0) {
                    qgg.h0(obj);
                    fnk fnkVar = (fnk) ((h4b) this.m).a;
                    String str13 = (String) this.n;
                    Collection collection = (Collection) this.l;
                    this.k = 1;
                    if (fnkVar.b(str13, collection, this) == nm6Var22) {
                        return nm6Var22;
                    }
                } else {
                    if (i31 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 25:
                nm6 nm6Var23 = nm6.a;
                int i32 = this.k;
                if (i32 != 0) {
                    if (i32 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                vx6 vx6Var = (vx6) this.m;
                aem aemVar = ((wvk) this.n).a;
                boolean forSecondaryQueue = ((PlayCommand) this.l).getForSecondaryQueue();
                this.k = 1;
                Object F = ixf.F(vx6Var, aemVar, forSecondaryQueue, this);
                return F == nm6Var23 ? nm6Var23 : F;
            case 26:
                return l(obj);
            case 27:
                nm6 nm6Var24 = nm6.a;
                int i33 = this.k;
                if (i33 == 0) {
                    qgg.h0(obj);
                    x0q x0qVar2 = (x0q) ((ime) this.m).d;
                    Pair pair2 = new Pair((zug) this.n, (h2l) this.l);
                    this.k = 1;
                    if (x0qVar2.emit(pair2, this) == nm6Var24) {
                        return nm6Var24;
                    }
                } else {
                    if (i33 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return n(obj);
            default:
                ecn ecnVar = ecn.a;
                nm6 nm6Var25 = nm6.a;
                int i34 = this.k;
                if (i34 == 0) {
                    qgg.h0(obj);
                    x3l x3lVar2 = (x3l) this.l;
                    qqi qqiVar2 = x3lVar2.h;
                    this.m = qqiVar2;
                    this.n = x3lVar2;
                    this.k = 1;
                    if (qqiVar2.a(this) == nm6Var25) {
                        return nm6Var25;
                    }
                    x3lVar = x3lVar2;
                    qqiVar = qqiVar2;
                } else {
                    if (i34 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    x3lVar = (x3l) this.n;
                    qqiVar = (qqi) this.m;
                    qgg.h0(obj);
                }
                try {
                    xdr xdrVar3 = x3lVar.a;
                    xdr xdrVar4 = x3lVar.c;
                    g4q g4qVar = (g4q) xdrVar3.getValue();
                    g4q g4qVar2 = (g4q) xdrVar4.getValue();
                    x3lVar.a.l(null);
                    xdrVar4.l(null);
                    if (g4qVar != null) {
                        g4qVar.a(ecnVar);
                    }
                    if (g4qVar2 != null) {
                        g4qVar2.a(ecnVar);
                    }
                    qqiVar.b(null);
                    return Unit.a;
                } catch (Throwable th7) {
                    qqiVar.b(null);
                    throw th7;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rlg(pjc pjcVar, Continuation continuation, tqn tqnVar, llj lljVar) {
        super(2, continuation);
        this.j = 16;
        this.m = pjcVar;
        this.n = tqnVar;
        this.l = lljVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rlg(xlg xlgVar, cvl cvlVar, Continuation continuation) {
        super(2, continuation);
        this.j = 0;
        this.l = xlgVar;
        this.n = cvlVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rlg(xlg xlgVar, cvl cvlVar, Continuation continuation, xlg xlgVar2) {
        super(2, continuation);
        this.j = 1;
        this.l = xlgVar;
        this.m = cvlVar;
        this.n = xlgVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rlg(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.n = obj2;
        this.l = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rlg(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.n = obj;
        this.l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rlg(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rlg(Continuation continuation, tqn tqnVar, llj lljVar) {
        super(2, continuation);
        this.j = 15;
        this.n = tqnVar;
        this.l = lljVar;
    }
}
