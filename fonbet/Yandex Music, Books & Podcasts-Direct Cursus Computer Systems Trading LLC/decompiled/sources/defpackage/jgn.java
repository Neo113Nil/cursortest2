package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class jgn extends aur implements Function2 {
    public oqi j;
    public cr k;
    public c0t l;
    public String m;
    public int n;
    public int o;
    public int p;
    public int q;
    public long r;
    public int s;
    public final /* synthetic */ cr t;
    public final /* synthetic */ int u;
    public final /* synthetic */ long v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgn(cr crVar, int i, long j, Continuation continuation) {
        super(2, continuation);
        this.t = crVar;
        this.u = i;
        this.v = j;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new jgn(this.t, this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((jgn) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0078: MOVE (r2 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:121), block:B:153:0x0078 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0393 A[Catch: all -> 0x0029, TRY_ENTER, TryCatch #5 {all -> 0x0029, blocks: (B:8:0x0024, B:10:0x0276, B:12:0x0393, B:13:0x0397, B:18:0x0036, B:41:0x0085, B:43:0x0094), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0194 A[Catch: all -> 0x01d4, TRY_ENTER, TryCatch #0 {all -> 0x01d4, blocks: (B:24:0x033f, B:36:0x02de, B:48:0x0257, B:57:0x01f7, B:66:0x017e, B:69:0x0194, B:71:0x01a4, B:75:0x01b6, B:77:0x01bc, B:79:0x01c2, B:81:0x01c6, B:82:0x01d6, B:86:0x0227, B:91:0x027c, B:93:0x0280, B:95:0x0290, B:99:0x029f, B:101:0x02a5, B:103:0x02ab, B:105:0x02af, B:106:0x02bc, B:110:0x030e, B:115:0x035f, B:117:0x0363, B:119:0x036b, B:122:0x0374, B:123:0x0379, B:124:0x037a, B:133:0x0161, B:142:0x013f), top: B:141:0x013f }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x027c A[Catch: all -> 0x01d4, TRY_ENTER, TryCatch #0 {all -> 0x01d4, blocks: (B:24:0x033f, B:36:0x02de, B:48:0x0257, B:57:0x01f7, B:66:0x017e, B:69:0x0194, B:71:0x01a4, B:75:0x01b6, B:77:0x01bc, B:79:0x01c2, B:81:0x01c6, B:82:0x01d6, B:86:0x0227, B:91:0x027c, B:93:0x0280, B:95:0x0290, B:99:0x029f, B:101:0x02a5, B:103:0x02ab, B:105:0x02af, B:106:0x02bc, B:110:0x030e, B:115:0x035f, B:117:0x0363, B:119:0x036b, B:122:0x0374, B:123:0x0379, B:124:0x037a, B:133:0x0161, B:142:0x013f), top: B:141:0x013f }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, nm6] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v24, types: [oqi] */
    /* JADX WARN: Type inference failed for: r2v3, types: [oqi] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        cr crVar;
        oqi oqiVar;
        int i;
        int i2;
        long j;
        n3m n3mVar;
        int i3;
        int i4;
        bjt bjtVar;
        int i5;
        rgn rgnVar;
        Boolean bool;
        String str;
        Object y0;
        c0t c0tVar;
        int i6;
        cr crVar2;
        int i7;
        int i8;
        int i9;
        Object y02;
        String str2;
        cr crVar3;
        c0t c0tVar2;
        int i10;
        int i11;
        int i12;
        String str3;
        Object y03;
        c0t c0tVar3;
        int i13;
        int i14;
        int i15;
        int i16;
        Object y04;
        String str4;
        cr crVar4;
        c0t c0tVar4;
        int i17;
        int i18;
        int i19;
        f7u a;
        oqi oqiVar2;
        oqi oqiVar3;
        f7u a2;
        boolean z;
        oqi oqiVar4;
        ?? r2 = nm6.a;
        int i20 = this.s;
        x2l x2lVar = x2l.a;
        try {
            try {
                switch (i20) {
                    case 0:
                        qgg.h0(obj);
                        cr crVar5 = this.t;
                        qqi qqiVar = (qqi) crVar5.i;
                        this.j = qqiVar;
                        this.k = crVar5;
                        int i21 = this.u;
                        this.n = i21;
                        long j2 = this.v;
                        this.r = j2;
                        this.o = 0;
                        this.s = 1;
                        if (qqiVar.a(this) != r2) {
                            crVar = crVar5;
                            oqiVar = qqiVar;
                            i = 0;
                            i2 = i21;
                            j = j2;
                            try {
                                ssg.a(3, "RadioPlaybackImpl", "setCurrentPosition", null);
                                n3mVar = (n3m) crVar.e;
                                this.j = oqiVar;
                                this.k = crVar;
                                this.n = i2;
                                this.r = j;
                                this.o = i;
                                this.p = 0;
                                this.s = 2;
                                if (n3mVar.O0(this) == r2) {
                                    i3 = i;
                                    i4 = 0;
                                    bjtVar = (bjt) crVar.d;
                                    this.j = oqiVar;
                                    this.k = crVar;
                                    this.n = i2;
                                    this.r = j;
                                    this.o = i3;
                                    this.p = i4;
                                    this.s = 3;
                                    if (bjtVar.n(this) == r2) {
                                        i5 = i3;
                                        long j3 = j;
                                        xdr xdrVar = (xdr) crVar.b;
                                        yks yksVar = (yks) crVar.f;
                                        rgnVar = (rgn) xdrVar.getValue();
                                        if (!(rgnVar instanceof ogn)) {
                                            f7u f7uVar = ((ogn) rgnVar).b;
                                            str3 = ((ogn) rgnVar).a;
                                            c0t c0tVar5 = ((ogn) rgnVar).c;
                                            if (i2 >= 0 && i2 < f7uVar.b.size()) {
                                                if (f7uVar.e()) {
                                                    e7u e7uVar = f7uVar.c;
                                                    if (e7uVar.c && e7uVar.a != i2) {
                                                        yksVar.n(w5j.a, str3, f7uVar.c(), j3);
                                                        str3 = str3;
                                                    }
                                                }
                                                this.j = oqiVar;
                                                this.k = crVar;
                                                this.l = c0tVar5;
                                                this.m = str3;
                                                this.n = i2;
                                                this.o = i5;
                                                this.p = i4;
                                                this.q = 0;
                                                this.s = 4;
                                                y04 = crVar.y0(f7uVar, this);
                                                if (y04 != r2) {
                                                    str4 = str3;
                                                    crVar4 = crVar;
                                                    c0tVar4 = c0tVar5;
                                                    i17 = i5;
                                                    i18 = i4;
                                                    i19 = 0;
                                                    a = ((f7u) y04).a(i2);
                                                    ((xdr) crVar4.b).m(null, new pgn(str4, a, c0tVar4, x2lVar));
                                                    this.j = oqiVar;
                                                    this.k = null;
                                                    this.l = null;
                                                    this.m = null;
                                                    this.n = i17;
                                                    this.o = i18;
                                                    this.p = i19;
                                                    this.q = 0;
                                                    this.s = 7;
                                                    if (crVar4.A(str4, a, c0tVar4, this) == r2) {
                                                        oqiVar2 = oqiVar;
                                                        z = true;
                                                        oqiVar4 = oqiVar2;
                                                        bool = Boolean.valueOf(z);
                                                        r2 = oqiVar4;
                                                        Boolean valueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                                                        r2.b(null);
                                                        return valueOf;
                                                    }
                                                }
                                            } else {
                                                ssg.a(6, "RadioPlaybackImpl", "Unable to perform setCurrentPosition operation. Queue does not contain item at position " + i2, null);
                                                this.j = oqiVar;
                                                this.k = crVar;
                                                this.l = c0tVar5;
                                                this.m = str3;
                                                this.n = i5;
                                                this.o = i4;
                                                this.p = 0;
                                                this.q = 0;
                                                this.s = 5;
                                                y03 = crVar.y0(f7uVar, this);
                                                if (y03 != r2) {
                                                    c0tVar3 = c0tVar5;
                                                    i13 = 0;
                                                    i14 = i5;
                                                    i15 = i4;
                                                    i16 = 0;
                                                    this.j = oqiVar;
                                                    this.k = null;
                                                    this.l = null;
                                                    this.m = null;
                                                    this.n = i14;
                                                    this.o = i15;
                                                    this.p = i13;
                                                    this.q = i16;
                                                    this.s = 6;
                                                    if (crVar.A(str3, (f7u) y03, c0tVar3, this) != r2) {
                                                        oqiVar3 = oqiVar;
                                                        z = false;
                                                        oqiVar4 = oqiVar3;
                                                        bool = Boolean.valueOf(z);
                                                        r2 = oqiVar4;
                                                        Boolean valueOf2 = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                                                        r2.b(null);
                                                        return valueOf2;
                                                    }
                                                }
                                            }
                                        } else {
                                            if (!(rgnVar instanceof pgn)) {
                                                if (!(rgnVar instanceof mgn) && !Intrinsics.d(rgnVar, ngn.a) && !Intrinsics.d(rgnVar, qgn.a)) {
                                                    throw new x7j();
                                                }
                                                ssg.a(6, "RadioPlaybackImpl", "Inappropriate state for setCurrentPosition (" + rgnVar + "). Call skipped", null);
                                                bool = null;
                                                r2 = oqiVar;
                                                Boolean valueOf22 = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                                                r2.b(null);
                                                return valueOf22;
                                            }
                                            f7u f7uVar2 = ((pgn) rgnVar).b;
                                            str = ((pgn) rgnVar).a;
                                            c0t c0tVar6 = ((pgn) rgnVar).c;
                                            if (i2 >= 0 && i2 < f7uVar2.b.size()) {
                                                if (f7uVar2.e()) {
                                                    e7u e7uVar2 = f7uVar2.c;
                                                    if (e7uVar2.c && e7uVar2.a != i2) {
                                                        yksVar.n(w5j.a, str, f7uVar2.c(), j3);
                                                        str = str;
                                                    }
                                                }
                                                this.j = oqiVar;
                                                this.k = crVar;
                                                this.l = c0tVar6;
                                                this.m = str;
                                                this.n = i2;
                                                this.o = i5;
                                                this.p = i4;
                                                this.q = 0;
                                                this.s = 8;
                                                y02 = crVar.y0(f7uVar2, this);
                                                if (y02 != r2) {
                                                    str2 = str;
                                                    crVar3 = crVar;
                                                    c0tVar2 = c0tVar6;
                                                    i10 = i5;
                                                    i11 = i4;
                                                    i12 = 0;
                                                    a2 = ((f7u) y02).a(i2);
                                                    ((xdr) crVar3.b).m(null, new pgn(str2, a2, c0tVar2, x2lVar));
                                                    this.j = oqiVar;
                                                    this.k = null;
                                                    this.l = null;
                                                    this.m = null;
                                                    this.n = i10;
                                                    this.o = i11;
                                                    this.p = i12;
                                                    this.q = 0;
                                                    this.s = 11;
                                                    if (crVar3.A(str2, a2, c0tVar2, this) == r2) {
                                                        oqiVar2 = oqiVar;
                                                        z = true;
                                                        oqiVar4 = oqiVar2;
                                                        bool = Boolean.valueOf(z);
                                                        r2 = oqiVar4;
                                                        Boolean valueOf222 = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                                                        r2.b(null);
                                                        return valueOf222;
                                                    }
                                                }
                                            } else {
                                                ssg.a(6, "RadioPlaybackImpl", "Unable to perform setCurrentPosition operation. Queue does not contain item at position " + i2, null);
                                                this.j = oqiVar;
                                                this.k = crVar;
                                                this.l = c0tVar6;
                                                this.m = str;
                                                this.n = i5;
                                                this.o = i4;
                                                this.p = 0;
                                                this.q = 0;
                                                this.s = 9;
                                                y0 = crVar.y0(f7uVar2, this);
                                                if (y0 != r2) {
                                                    c0tVar = c0tVar6;
                                                    i6 = 0;
                                                    crVar2 = crVar;
                                                    i7 = i5;
                                                    i8 = i4;
                                                    i9 = 0;
                                                    this.j = oqiVar;
                                                    this.k = null;
                                                    this.l = null;
                                                    this.m = null;
                                                    this.n = i7;
                                                    this.o = i8;
                                                    this.p = i6;
                                                    this.q = i9;
                                                    this.s = 10;
                                                    if (crVar2.A(str, (f7u) y0, c0tVar, this) != r2) {
                                                        oqiVar3 = oqiVar;
                                                        z = false;
                                                        oqiVar4 = oqiVar3;
                                                        bool = Boolean.valueOf(z);
                                                        r2 = oqiVar4;
                                                        Boolean valueOf2222 = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                                                        r2.b(null);
                                                        return valueOf2222;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                r2 = oqiVar;
                                r2.b(null);
                                throw th;
                            }
                        }
                        return r2;
                    case 1:
                        i = this.o;
                        j = this.r;
                        i2 = this.n;
                        cr crVar6 = this.k;
                        oqiVar = this.j;
                        qgg.h0(obj);
                        crVar = crVar6;
                        ssg.a(3, "RadioPlaybackImpl", "setCurrentPosition", null);
                        n3mVar = (n3m) crVar.e;
                        this.j = oqiVar;
                        this.k = crVar;
                        this.n = i2;
                        this.r = j;
                        this.o = i;
                        this.p = 0;
                        this.s = 2;
                        if (n3mVar.O0(this) == r2) {
                        }
                        break;
                    case 2:
                        i4 = this.p;
                        int i22 = this.o;
                        long j4 = this.r;
                        int i23 = this.n;
                        crVar = this.k;
                        oqi oqiVar5 = this.j;
                        try {
                            qgg.h0(obj);
                            oqiVar = oqiVar5;
                            i2 = i23;
                            i3 = i22;
                            j = j4;
                            bjtVar = (bjt) crVar.d;
                            this.j = oqiVar;
                            this.k = crVar;
                            this.n = i2;
                            this.r = j;
                            this.o = i3;
                            this.p = i4;
                            this.s = 3;
                            if (bjtVar.n(this) == r2) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r2 = oqiVar5;
                            r2.b(null);
                            throw th;
                        }
                        break;
                    case 3:
                        i4 = this.p;
                        i5 = this.o;
                        j = this.r;
                        int i24 = this.n;
                        cr crVar7 = this.k;
                        oqi oqiVar6 = this.j;
                        try {
                            qgg.h0(obj);
                            crVar = crVar7;
                            oqiVar = oqiVar6;
                            i2 = i24;
                            long j32 = j;
                            xdr xdrVar2 = (xdr) crVar.b;
                            yks yksVar2 = (yks) crVar.f;
                            rgnVar = (rgn) xdrVar2.getValue();
                            if (!(rgnVar instanceof ogn)) {
                            }
                            return r2;
                        } catch (Throwable th3) {
                            th = th3;
                            r2 = oqiVar6;
                            r2.b(null);
                            throw th;
                        }
                    case 4:
                        int i25 = this.q;
                        int i26 = this.p;
                        int i27 = this.o;
                        i2 = this.n;
                        str4 = this.m;
                        c0tVar4 = this.l;
                        crVar4 = this.k;
                        oqi oqiVar7 = this.j;
                        qgg.h0(obj);
                        i17 = i27;
                        oqiVar = oqiVar7;
                        i18 = i26;
                        i19 = i25;
                        y04 = obj;
                        a = ((f7u) y04).a(i2);
                        ((xdr) crVar4.b).m(null, new pgn(str4, a, c0tVar4, x2lVar));
                        this.j = oqiVar;
                        this.k = null;
                        this.l = null;
                        this.m = null;
                        this.n = i17;
                        this.o = i18;
                        this.p = i19;
                        this.q = 0;
                        this.s = 7;
                        if (crVar4.A(str4, a, c0tVar4, this) == r2) {
                        }
                        break;
                    case 5:
                        int i28 = this.q;
                        int i29 = this.p;
                        int i30 = this.o;
                        int i31 = this.n;
                        String str5 = this.m;
                        c0tVar3 = this.l;
                        cr crVar8 = this.k;
                        oqi oqiVar8 = this.j;
                        try {
                            qgg.h0(obj);
                            crVar = crVar8;
                            oqiVar = oqiVar8;
                            str3 = str5;
                            i14 = i31;
                            i15 = i30;
                            i13 = i29;
                            i16 = i28;
                            y03 = obj;
                            this.j = oqiVar;
                            this.k = null;
                            this.l = null;
                            this.m = null;
                            this.n = i14;
                            this.o = i15;
                            this.p = i13;
                            this.q = i16;
                            this.s = 6;
                            if (crVar.A(str3, (f7u) y03, c0tVar3, this) != r2) {
                            }
                            return r2;
                        } catch (Throwable th4) {
                            th = th4;
                            r2 = oqiVar8;
                            r2.b(null);
                            throw th;
                        }
                    case 6:
                        oqi oqiVar9 = this.j;
                        qgg.h0(obj);
                        oqiVar3 = oqiVar9;
                        z = false;
                        oqiVar4 = oqiVar3;
                        bool = Boolean.valueOf(z);
                        r2 = oqiVar4;
                        Boolean valueOf22222 = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                        r2.b(null);
                        return valueOf22222;
                    case 7:
                        oqi oqiVar10 = this.j;
                        qgg.h0(obj);
                        oqiVar2 = oqiVar10;
                        z = true;
                        oqiVar4 = oqiVar2;
                        bool = Boolean.valueOf(z);
                        r2 = oqiVar4;
                        Boolean valueOf222222 = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                        r2.b(null);
                        return valueOf222222;
                    case 8:
                        int i32 = this.q;
                        int i33 = this.p;
                        int i34 = this.o;
                        i2 = this.n;
                        str2 = this.m;
                        c0tVar2 = this.l;
                        crVar3 = this.k;
                        oqi oqiVar11 = this.j;
                        qgg.h0(obj);
                        i10 = i34;
                        oqiVar = oqiVar11;
                        i11 = i33;
                        i12 = i32;
                        y02 = obj;
                        a2 = ((f7u) y02).a(i2);
                        ((xdr) crVar3.b).m(null, new pgn(str2, a2, c0tVar2, x2lVar));
                        this.j = oqiVar;
                        this.k = null;
                        this.l = null;
                        this.m = null;
                        this.n = i10;
                        this.o = i11;
                        this.p = i12;
                        this.q = 0;
                        this.s = 11;
                        if (crVar3.A(str2, a2, c0tVar2, this) == r2) {
                        }
                        break;
                    case 9:
                        int i35 = this.q;
                        int i36 = this.p;
                        int i37 = this.o;
                        int i38 = this.n;
                        String str6 = this.m;
                        c0tVar = this.l;
                        crVar2 = this.k;
                        oqi oqiVar12 = this.j;
                        try {
                            qgg.h0(obj);
                            oqiVar = oqiVar12;
                            str = str6;
                            i7 = i38;
                            i8 = i37;
                            i6 = i36;
                            i9 = i35;
                            y0 = obj;
                            this.j = oqiVar;
                            this.k = null;
                            this.l = null;
                            this.m = null;
                            this.n = i7;
                            this.o = i8;
                            this.p = i6;
                            this.q = i9;
                            this.s = 10;
                            if (crVar2.A(str, (f7u) y0, c0tVar, this) != r2) {
                            }
                            return r2;
                        } catch (Throwable th5) {
                            th = th5;
                            r2 = oqiVar12;
                            r2.b(null);
                            throw th;
                        }
                    case 10:
                        oqi oqiVar13 = this.j;
                        qgg.h0(obj);
                        oqiVar3 = oqiVar13;
                        z = false;
                        oqiVar4 = oqiVar3;
                        bool = Boolean.valueOf(z);
                        r2 = oqiVar4;
                        Boolean valueOf2222222 = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                        r2.b(null);
                        return valueOf2222222;
                    case 11:
                        oqi oqiVar14 = this.j;
                        qgg.h0(obj);
                        oqiVar2 = oqiVar14;
                        z = true;
                        oqiVar4 = oqiVar2;
                        bool = Boolean.valueOf(z);
                        r2 = oqiVar4;
                        Boolean valueOf22222222 = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                        r2.b(null);
                        return valueOf22222222;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            } catch (Throwable th6) {
                th = th6;
                r2 = obj2;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }
}
