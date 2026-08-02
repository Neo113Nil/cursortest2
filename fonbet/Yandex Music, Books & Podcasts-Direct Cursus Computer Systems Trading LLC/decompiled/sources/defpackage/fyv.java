package defpackage;

import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* loaded from: classes4.dex */
public final class fyv extends aur implements Function2 {
    public final /* synthetic */ int j = 0;
    public /* synthetic */ Object k;
    public final /* synthetic */ lyv l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyv(lyv lyvVar, Continuation continuation) {
        super(2, continuation);
        this.l = lyvVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                fyv fyvVar = new fyv(continuation, this.l);
                fyvVar.k = obj;
                return fyvVar;
            default:
                fyv fyvVar2 = new fyv(this.l, continuation);
                fyvVar2.k = obj;
                return fyvVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((fyv) create(obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((fyv) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0122 A[SYNTHETIC] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        geh gehVar;
        int i;
        geh gehVar2;
        int i2 = this.j;
        int i3 = 2;
        int i4 = 1;
        lyv lyvVar = this.l;
        Continuation continuation = null;
        switch (i2) {
            case 0:
                Object obj2 = this.k;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                yyv yyvVar = (yyv) obj2;
                u2r u2rVar = lyvVar.d;
                if (lyvVar.a.e() == heh.a) {
                    Map map = yyvVar.a;
                    jtv a = yyvVar.c.a();
                    if (a != null) {
                        geh G = hag.G(a);
                        int i5 = G.a;
                        u2rVar.clear();
                        Iterator it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            geh G2 = hag.G(((nyv) ((Map.Entry) it.next()).getValue()).b);
                            int i6 = G2.b;
                            int i7 = G2.a;
                            int i8 = G.b;
                            if (i6 == i8 || i6 == i8 + 1) {
                                int i9 = i5 + 1;
                                if (i5 - 1 <= i7 && i7 <= i9) {
                                    gehVar2 = G;
                                    if (G2.equals(gehVar2)) {
                                        u2rVar.put(G2, new fk0(new enj(enj.g(swf.i(gehVar2.a, gehVar2.b), swf.i(i7, i6))), azt.f, null, 12));
                                    }
                                    i3 = 2;
                                    i4 = 1;
                                }
                            }
                            if (i6 == i8 && i7 > i5) {
                                gehVar2 = geh.a(G2, i7 - 1, 0, i3);
                            } else if (i6 != i8 || i7 >= i5) {
                                if (i6 > i8) {
                                    int i10 = i5 + 1;
                                    if (i5 - 1 <= i7 && i7 <= i10) {
                                        gehVar2 = geh.a(G2, 0, i6 - 1, i4);
                                    }
                                }
                                gehVar2 = G2;
                            } else {
                                gehVar2 = geh.a(G2, i7 + 1, 0, i3);
                            }
                            if (G2.equals(gehVar2)) {
                            }
                            i3 = 2;
                            i4 = 1;
                        }
                    }
                } else {
                    Map map2 = yyvVar.a;
                    axv axvVar = yyvVar.c;
                    jtv a2 = axvVar.a();
                    jtv b = axvVar.b();
                    if (a2 != null) {
                        geh G3 = hag.G(a2);
                        int i11 = G3.a;
                        if (b != null) {
                            u2rVar.clear();
                            int i12 = b.a;
                            IntRange intRange = i11 < i12 ? new IntRange(i11, i11 + 2, 1) : i11 > i12 ? new IntRange(i11 - 2, i11, 1) : new IntRange(i11 - 1, i11 + 1, 1);
                            Iterator it2 = map2.entrySet().iterator();
                            while (it2.hasNext()) {
                                geh G4 = hag.G(((nyv) ((Map.Entry) it2.next()).getValue()).b);
                                int i13 = G4.b;
                                int i14 = G4.a;
                                if (intRange.a <= i14 && i14 <= intRange.b) {
                                    int i15 = G3.b;
                                    if (i13 == i15 || i13 == (i = i15 + 1)) {
                                        gehVar = G3;
                                    } else if (i13 > i) {
                                        gehVar = geh.a(G4, 0, i13 - 1, 1);
                                    } else if (i13 < i15) {
                                        gehVar = geh.a(G4, 0, i13 + 1, 1);
                                    }
                                    if (G4.equals(gehVar)) {
                                        u2rVar.put(G4, new fk0(new enj(enj.g(swf.i(gehVar.a, gehVar.b), swf.i(i14, i13))), azt.f, null, 12));
                                    }
                                }
                                gehVar = G4;
                                if (G4.equals(gehVar)) {
                                }
                            }
                        }
                    }
                }
                break;
            default:
                mm6 mm6Var = (mm6) this.k;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                x97.y(mm6Var, null, null, new kyv(lyvVar, continuation, i4), 3);
                x97.y(mm6Var, null, null, new kyv(lyvVar, continuation, i3), 3);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyv(Continuation continuation, lyv lyvVar) {
        super(2, continuation);
        this.l = lyvVar;
    }
}
