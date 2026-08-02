package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class iog extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ ime l;
    public final /* synthetic */ String m;
    public final /* synthetic */ boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iog(ime imeVar, String str, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = imeVar;
        this.m = str;
        this.n = z;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new iog(this.l, this.m, this.n, continuation, 0);
            case 1:
                return new iog(this.l, this.m, this.n, continuation, 1);
            case 2:
                return new iog(this.l, this.m, this.n, continuation, 2);
            case 3:
                return new iog(this.l, this.m, this.n, continuation, 3);
            case 4:
                return new iog(this.l, this.m, this.n, continuation, 4);
            case 5:
                return new iog(this.l, this.m, this.n, continuation, 5);
            case 6:
                return new iog(this.l, this.m, this.n, continuation, 6);
            case 7:
                return new iog(this.l, this.m, this.n, continuation, 7);
            case 8:
                return new iog(this.l, this.m, this.n, continuation, 8);
            case 9:
                return new iog(this.l, this.m, this.n, continuation, 9);
            case 10:
                return new iog(this.l, this.m, this.n, continuation, 10);
            case 11:
                return new iog(this.l, this.m, this.n, continuation, 11);
            case 12:
                return new iog(this.l, this.m, this.n, continuation, 12);
            case 13:
                return new iog(this.l, this.m, this.n, continuation, 13);
            case 14:
                return new iog(this.l, this.m, this.n, continuation, 14);
            case 15:
                return new iog(this.l, this.m, this.n, continuation, 15);
            case 16:
                return new iog(this.l, this.m, this.n, continuation, 16);
            case 17:
                return new iog(this.l, this.m, this.n, continuation, 17);
            default:
                return new iog(this.l, this.m, this.n, continuation, 18);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((iog) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                ime imeVar = this.l;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    String str = this.m;
                    paj pajVar = paj.d;
                    boolean z = this.n;
                    this.k = 1;
                    obj = ime.f(imeVar, str, pajVar, z, this);
                    if (obj == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                Iterable<Pair> iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                for (Pair pair : iterable) {
                    arrayList.add(new Pair(pair.a, ime.o(imeVar, (oq) pair.b)));
                }
                break;
            case 1:
                ime imeVar2 = this.l;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    String str2 = this.m;
                    boolean z2 = this.n;
                    this.k = 1;
                    imeVar2.getClass();
                    e30 e30Var = new e30(z2);
                    l18 l18Var = l18.b;
                    bdt I = hag.I(g0p.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    obj = e30Var.a(g0p.a(), str2, this);
                    if (obj != nm6Var2) {
                        obj = (List) obj;
                    }
                    if (obj == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                Iterable<Pair> iterable2 = (Iterable) obj;
                ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
                for (Pair pair2 : iterable2) {
                    arrayList2.add(new Pair((String) pair2.a, ime.o(imeVar2, (oq) pair2.b)));
                }
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    ime imeVar3 = this.l;
                    String str3 = this.m;
                    boolean z3 = this.n;
                    this.k = 1;
                    obj = ime.d(imeVar3, str3, z3, this);
                    if (obj == nm6Var3) {
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                Iterable<Pair> iterable3 = (Iterable) obj;
                ArrayList arrayList3 = new ArrayList(v75.o(iterable3, 10));
                for (Pair pair3 : iterable3) {
                    arrayList3.add(new Pair(pair3.a, new cpg((c01) pair3.b)));
                }
                break;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    ime imeVar4 = this.l;
                    String str4 = this.m;
                    paj pajVar2 = paj.g;
                    boolean z4 = this.n;
                    this.k = 1;
                    obj = ime.f(imeVar4, str4, pajVar2, z4, this);
                    if (obj == nm6Var4) {
                    }
                } else if (i4 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                Iterable<Pair> iterable4 = (Iterable) obj;
                ArrayList arrayList4 = new ArrayList(v75.o(iterable4, 10));
                for (Pair pair4 : iterable4) {
                    arrayList4.add(new Pair(pair4.a, new epg((oq) pair4.b)));
                }
                break;
            case 4:
                ime imeVar5 = this.l;
                nm6 nm6Var5 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    String str5 = this.m;
                    boolean z5 = this.n;
                    this.k = 1;
                    imeVar5.getClass();
                    obj = ime.P(str5, z5, this);
                    if (obj == nm6Var5) {
                    }
                } else if (i5 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                Iterable<Pair> iterable5 = (Iterable) obj;
                ArrayList arrayList5 = new ArrayList(v75.o(iterable5, 10));
                for (Pair pair5 : iterable5) {
                    arrayList5.add(new Pair(pair5.a, ime.p(imeVar5, (mqs) pair5.b)));
                }
                break;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    ime imeVar6 = this.l;
                    String str6 = this.m;
                    paj pajVar3 = paj.c;
                    boolean z6 = this.n;
                    this.k = 1;
                    obj = ime.f(imeVar6, str6, pajVar3, z6, this);
                    if (obj == nm6Var6) {
                    }
                } else if (i6 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                Iterable<Pair> iterable6 = (Iterable) obj;
                ArrayList arrayList6 = new ArrayList(v75.o(iterable6, 10));
                for (Pair pair6 : iterable6) {
                    arrayList6.add(new Pair(pair6.a, new epg((oq) pair6.b)));
                }
                break;
            case 6:
                nm6 nm6Var7 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    ime imeVar7 = this.l;
                    String str7 = this.m;
                    paj pajVar4 = paj.b;
                    boolean z7 = this.n;
                    this.k = 1;
                    obj = ime.f(imeVar7, str7, pajVar4, z7, this);
                    if (obj == nm6Var7) {
                    }
                } else if (i7 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                Iterable<Pair> iterable7 = (Iterable) obj;
                ArrayList arrayList7 = new ArrayList(v75.o(iterable7, 10));
                for (Pair pair7 : iterable7) {
                    arrayList7.add(new Pair(pair7.a, new epg((oq) pair7.b)));
                }
                break;
            case 7:
                nm6 nm6Var8 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    ime imeVar8 = this.l;
                    String str8 = this.m;
                    boolean z8 = this.n;
                    this.k = 1;
                    obj = ime.m(imeVar8, str8, z8, this);
                    if (obj == nm6Var8) {
                    }
                } else if (i8 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                Iterable<Pair> iterable8 = (Iterable) obj;
                ArrayList arrayList8 = new ArrayList(v75.o(iterable8, 10));
                for (Pair pair8 : iterable8) {
                    arrayList8.add(new Pair(pair8.a, new dpg((cvl) pair8.b)));
                }
                break;
            case 8:
                nm6 nm6Var9 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    ime imeVar9 = this.l;
                    String str9 = this.m;
                    paj pajVar5 = paj.e;
                    boolean z9 = this.n;
                    this.k = 1;
                    obj = ime.f(imeVar9, str9, pajVar5, z9, this);
                    if (obj == nm6Var9) {
                    }
                } else if (i9 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                Iterable<Pair> iterable9 = (Iterable) obj;
                ArrayList arrayList9 = new ArrayList(v75.o(iterable9, 10));
                for (Pair pair9 : iterable9) {
                    arrayList9.add(new Pair(pair9.a, new epg((oq) pair9.b)));
                }
                break;
            case 9:
                nm6 nm6Var10 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    ime imeVar10 = this.l;
                    String str10 = this.m;
                    boolean z10 = this.n;
                    this.k = 1;
                    imeVar10.getClass();
                    if (StringsKt.U(str10)) {
                        obj = c5b.a;
                    } else {
                        kj3 kj3Var = new kj3(zdj.a, z10, true);
                        l18 l18Var2 = l18.b;
                        bdt I2 = hag.I(g0p.class);
                        qdc qdcVar2 = l18Var2.a;
                        qdcVar2.getClass();
                        obj = kj3Var.b(g0p.a(), str10, this);
                        if (obj != nm6Var10) {
                            obj = (List) obj;
                        }
                    }
                    if (obj == nm6Var10) {
                    }
                } else if (i10 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                Iterable<Pair> iterable10 = (Iterable) obj;
                ArrayList arrayList10 = new ArrayList(v75.o(iterable10, 10));
                for (Pair pair10 : iterable10) {
                    arrayList10.add(new Pair(pair10.a, new fpg((mqs) pair10.b)));
                }
                break;
            case 10:
                ime imeVar11 = this.l;
                nm6 nm6Var11 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    String str11 = this.m;
                    boolean z11 = this.n;
                    this.k = 1;
                    imeVar11.getClass();
                    if (StringsKt.U(str11)) {
                        obj = c5b.a;
                    } else {
                        x3t x3tVar = new x3t(z11);
                        l18 l18Var3 = l18.b;
                        bdt I3 = hag.I(g0p.class);
                        qdc qdcVar3 = l18Var3.a;
                        qdcVar3.getClass();
                        obj = x3tVar.a(g0p.a(), str11, this);
                        if (obj != nm6Var11) {
                            obj = (List) obj;
                        }
                    }
                    if (obj == nm6Var11) {
                    }
                } else if (i11 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                Iterable<Pair> iterable11 = (Iterable) obj;
                ArrayList arrayList11 = new ArrayList(v75.o(iterable11, 10));
                for (Pair pair11 : iterable11) {
                    arrayList11.add(new Pair((String) pair11.a, ime.p(imeVar11, (mqs) pair11.b)));
                }
                break;
            case 11:
                nm6 nm6Var12 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    ime imeVar12 = this.l;
                    String str12 = this.m;
                    boolean z12 = this.n;
                    this.k = 1;
                    obj = ime.n(imeVar12, str12, z12, this);
                    if (obj == nm6Var12) {
                    }
                } else if (i12 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                Iterable<Pair> iterable12 = (Iterable) obj;
                ArrayList arrayList12 = new ArrayList(v75.o(iterable12, 10));
                for (Pair pair12 : iterable12) {
                    arrayList12.add(new Pair(pair12.a, new hpg((x1u) pair12.b)));
                }
                break;
            case 12:
                ime imeVar13 = this.l;
                nm6 nm6Var13 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    String str13 = this.m;
                    paj pajVar6 = paj.d;
                    boolean z13 = this.n;
                    this.k = 1;
                    obj = ime.f(imeVar13, str13, pajVar6, z13, this);
                    if (obj == nm6Var13) {
                    }
                } else if (i13 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                Iterable<Pair> iterable13 = (Iterable) obj;
                ArrayList arrayList13 = new ArrayList(v75.o(iterable13, 10));
                for (Pair pair13 : iterable13) {
                    arrayList13.add(new Pair(pair13.a, ime.o(imeVar13, (oq) pair13.b)));
                }
                break;
            case 13:
                ime imeVar14 = this.l;
                nm6 nm6Var14 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    String str14 = this.m;
                    paj pajVar7 = paj.d;
                    boolean z14 = this.n;
                    this.k = 1;
                    obj = ime.f(imeVar14, str14, pajVar7, z14, this);
                    if (obj == nm6Var14) {
                    }
                } else if (i14 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                Iterable<Pair> iterable14 = (Iterable) obj;
                ArrayList arrayList14 = new ArrayList(v75.o(iterable14, 10));
                for (Pair pair14 : iterable14) {
                    arrayList14.add(new Pair(pair14.a, ime.o(imeVar14, (oq) pair14.b)));
                }
                break;
            case 14:
                nm6 nm6Var15 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    ime imeVar15 = this.l;
                    String str15 = this.m;
                    boolean z15 = this.n;
                    this.k = 1;
                    obj = ime.b(imeVar15, str15, z15, this);
                    if (obj == nm6Var15) {
                    }
                } else if (i15 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                Iterable<Pair> iterable15 = (Iterable) obj;
                ArrayList arrayList15 = new ArrayList(v75.o(iterable15, 10));
                for (Pair pair15 : iterable15) {
                    arrayList15.add(new Pair(pair15.a, new cpg((c01) pair15.b)));
                }
                break;
            case 15:
                nm6 nm6Var16 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    ime imeVar16 = this.l;
                    String str16 = this.m;
                    paj pajVar8 = paj.g;
                    boolean z16 = this.n;
                    this.k = 1;
                    obj = ime.f(imeVar16, str16, pajVar8, z16, this);
                    if (obj == nm6Var16) {
                    }
                } else if (i16 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                Iterable<Pair> iterable16 = (Iterable) obj;
                ArrayList arrayList16 = new ArrayList(v75.o(iterable16, 10));
                for (Pair pair16 : iterable16) {
                    arrayList16.add(new Pair(pair16.a, new epg((oq) pair16.b)));
                }
                break;
            case 16:
                ime imeVar17 = this.l;
                nm6 nm6Var17 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    String str17 = this.m;
                    boolean z17 = this.n;
                    this.k = 1;
                    imeVar17.getClass();
                    obj = ime.P(str17, z17, this);
                    if (obj == nm6Var17) {
                    }
                } else if (i17 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                Iterable<Pair> iterable17 = (Iterable) obj;
                ArrayList arrayList17 = new ArrayList(v75.o(iterable17, 10));
                for (Pair pair17 : iterable17) {
                    arrayList17.add(new Pair(pair17.a, ime.p(imeVar17, (mqs) pair17.b)));
                }
                break;
            case 17:
                nm6 nm6Var18 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    ime imeVar18 = this.l;
                    String str18 = this.m;
                    boolean z18 = this.n;
                    this.k = 1;
                    obj = ime.e(imeVar18, str18, z18, this);
                    if (obj == nm6Var18) {
                    }
                } else if (i18 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                Iterable<Pair> iterable18 = (Iterable) obj;
                ArrayList arrayList18 = new ArrayList(v75.o(iterable18, 10));
                for (Pair pair18 : iterable18) {
                    arrayList18.add(new Pair(pair18.a, new dpg((cvl) pair18.b)));
                }
                break;
            default:
                nm6 nm6Var19 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    ime imeVar19 = this.l;
                    String str19 = this.m;
                    paj pajVar9 = paj.e;
                    boolean z19 = this.n;
                    this.k = 1;
                    obj = ime.f(imeVar19, str19, pajVar9, z19, this);
                    if (obj == nm6Var19) {
                    }
                } else if (i19 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                Iterable<Pair> iterable19 = (Iterable) obj;
                ArrayList arrayList19 = new ArrayList(v75.o(iterable19, 10));
                for (Pair pair19 : iterable19) {
                    arrayList19.add(new Pair(pair19.a, new epg((oq) pair19.b)));
                }
                break;
        }
        return null;
    }
}
