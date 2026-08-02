package defpackage;

import android.util.AtomicFile;
import androidx.media3.exoplayer.ExoPlayer;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class nw1 extends aur implements Function2 {
    public final /* synthetic */ int j = 2;
    public Object k;
    public int l;
    public int m;
    public int n;
    public Object o;
    public Object p;
    public Object q;
    public Object r;
    public Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw1(ArrayList arrayList, fk0 fk0Var, aqi aqiVar, aqi aqiVar2, aqi aqiVar3, aqi aqiVar4, aqi aqiVar5, Continuation continuation) {
        super(2, continuation);
        this.p = arrayList;
        this.q = fk0Var;
        this.r = aqiVar;
        this.s = aqiVar2;
        this.k = aqiVar3;
        this.t = aqiVar4;
        this.u = aqiVar5;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                nw1 nw1Var = new nw1((n4c) this.q, (rdk) this.t, (ExoPlayer) this.u, (f4c) this.s, continuation);
                nw1Var.k = obj;
                return nw1Var;
            case 1:
                return new nw1((kzi) this.s, (String) this.t, (n71) this.u, continuation);
            case 2:
                return new nw1((auv) this.t, (wrv) this.u, continuation);
            default:
                return new nw1((ArrayList) this.p, (fk0) this.q, (aqi) this.r, (aqi) this.s, (aqi) this.k, (aqi) this.t, (aqi) this.u, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((nw1) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:136|137|(2:139|(2:141|(2:143|(8:145|146|147|148|149|150|151|152)(2:157|158))(10:159|160|161|162|163|164|165|150|151|152))(1:189))(4:201|(1:203)|171|172)|190|191|192|193|(7:195|163|164|165|150|151|152)|171|172) */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x03c7, code lost:
    
        if (r0.emit(r3, r30) == r1) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x020d, code lost:
    
        if (defpackage.fk0.c(r1, r1, r5, null, r30, 12) == r12) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x04db, code lost:
    
        r5 = 0;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0189, code lost:
    
        if (r8.f(r1, r30) != r12) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0294 A[LOOP:1: B:97:0x0294->B:106:0x02c9, LOOP_START, PHI: r0 r1 r2 r12
      0x0294: PHI (r0v64 nm6) = (r0v47 nm6), (r0v65 nm6) binds: [B:96:0x0292, B:106:0x02c9] A[DONT_GENERATE, DONT_INLINE]
      0x0294: PHI (r1v30 int) = (r1v22 int), (r1v31 int) binds: [B:96:0x0292, B:106:0x02c9] A[DONT_GENERATE, DONT_INLINE]
      0x0294: PHI (r2v35 java.util.Map) = (r2v29 java.util.Map), (r2v36 java.util.Map) binds: [B:96:0x0292, B:106:0x02c9] A[DONT_GENERATE, DONT_INLINE]
      0x0294: PHI (r12v9 int) = (r12v5 int), (r12v10 int) binds: [B:96:0x0292, B:106:0x02c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v27, types: [qdc] */
    /* JADX WARN: Type inference failed for: r2v7, types: [qdc] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.io.Closeable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x036e -> B:80:0x0264). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        n4c n4cVar;
        n4c n4cVar2;
        f4c f4cVar;
        int i;
        int i2;
        n4c n4cVar3;
        String str;
        kzi kziVar;
        String str2;
        Function2 function2;
        int i3;
        qdc qdcVar;
        String str3;
        FileInputStream openRead;
        qdc qdcVar2;
        int i4;
        Object invoke;
        Throwable th;
        qdc qdcVar3;
        qdc qdcVar4;
        qdc qdcVar5;
        auv auvVar;
        xdr xdrVar;
        wrv wrvVar;
        int i5;
        ArrayList arrayList;
        int i6;
        int i7;
        nm6 nm6Var;
        int i8;
        Map map;
        List list;
        int i9;
        List list2;
        int i10;
        int i11;
        int i12;
        int i13;
        ?? r2 = "call to 'resume' before 'invoke' with coroutine";
        switch (this.j) {
            case 0:
                mm6 mm6Var = (mm6) this.k;
                nm6 nm6Var2 = nm6.a;
                int i14 = this.n;
                if (i14 != 0) {
                    if (i14 == 1) {
                        int i15 = this.m;
                        i = this.l;
                        n4cVar2 = (n4c) this.p;
                        f4cVar = (f4c) this.r;
                        n4c n4cVar4 = (n4c) this.o;
                        try {
                            qgg.h0(obj);
                            i2 = i15;
                            n4cVar = n4cVar4;
                        } catch (Throwable th2) {
                            th = th2;
                            n4cVar3 = n4cVar4;
                        }
                    } else {
                        if (i14 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        n4cVar3 = (n4c) this.o;
                        try {
                            qgg.h0(obj);
                            n4cVar3.k = null;
                            return Unit.a;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    n4cVar3.k = null;
                    throw th;
                }
                qgg.h0(obj);
                n4cVar = (n4c) this.q;
                h4c h4cVar = h4c.QUEUE_LAUNCHER;
                rdk rdkVar = (rdk) this.t;
                ExoPlayer exoPlayer = (ExoPlayer) this.u;
                f4c f4cVar2 = (f4c) this.s;
                h4c h4cVar2 = n4cVar.k;
                if (h4cVar2 == null || 10 >= h4cVar2.a) {
                    n4cVar.k = h4cVar;
                    try {
                        this.k = mm6Var;
                        this.o = n4cVar;
                        this.r = f4cVar2;
                        this.p = n4cVar;
                        this.l = 0;
                        this.m = 0;
                        this.n = 1;
                        if (rdk.h(rdkVar, exoPlayer, this) == nm6Var2) {
                            return nm6Var2;
                        }
                        n4cVar2 = n4cVar;
                        f4cVar = f4cVar2;
                        i = 0;
                        i2 = 0;
                    } catch (Throwable th4) {
                        th = th4;
                        n4cVar3 = n4cVar;
                    }
                }
                return Unit.a;
                pjc x = f4cVar.x();
                mw1 mw1Var = new mw1(mm6Var, n4cVar2, 0);
                this.k = null;
                this.o = n4cVar;
                this.r = null;
                this.p = null;
                this.l = i;
                this.m = i2;
                this.n = 2;
                if (x.collect(mw1Var, this) != nm6Var2) {
                    n4cVar3 = n4cVar;
                    n4cVar3.k = null;
                    return Unit.a;
                }
                return nm6Var2;
            case 1:
                nm6 nm6Var3 = nm6.a;
                int i16 = this.n;
                try {
                    try {
                        if (i16 == 0) {
                            qgg.h0(obj);
                            kziVar = (kzi) this.s;
                            qdc qdcVar6 = kziVar.b;
                            str2 = (String) this.t;
                            n71 n71Var = (n71) this.u;
                            this.o = qdcVar6;
                            this.p = str2;
                            this.k = kziVar;
                            this.q = str2;
                            this.r = n71Var;
                            this.l = 0;
                            this.n = 1;
                            if (qdcVar6.I(str2, this) != nm6Var3) {
                                function2 = n71Var;
                                i3 = 0;
                                qdcVar = qdcVar6;
                                str3 = str2;
                            }
                            return nm6Var3;
                        }
                        if (i16 != 1) {
                            if (i16 != 2) {
                                if (i16 != 3) {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                str = (String) this.p;
                                r2 = (qdc) this.o;
                                try {
                                    qgg.h0(obj);
                                    invoke = obj;
                                    qdcVar5 = r2;
                                    str2 = str;
                                    qdcVar4 = qdcVar5;
                                    Object obj2 = invoke;
                                    qdcVar4.O(str2);
                                    return obj2;
                                } catch (Throwable th5) {
                                    th = th5;
                                    r2.O(str);
                                    throw th;
                                }
                            }
                            int i17 = this.m;
                            int i18 = this.l;
                            ?? r3 = (Closeable) this.r;
                            function2 = (Function2) this.k;
                            String str4 = (String) this.p;
                            qdcVar2 = (qdc) this.o;
                            try {
                                qgg.h0(obj);
                                invoke = obj;
                                i4 = i17;
                                openRead = r3;
                                str2 = str4;
                                i3 = i18;
                                qdcVar3 = qdcVar2;
                                try {
                                    yd5.q(openRead, null);
                                    qdcVar4 = qdcVar3;
                                } catch (FileNotFoundException unused) {
                                    int i19 = i4;
                                    qdc qdcVar7 = qdcVar3;
                                    this.o = qdcVar7;
                                    this.p = str2;
                                    this.k = null;
                                    this.q = null;
                                    this.r = null;
                                    this.l = i3;
                                    this.m = i19;
                                    this.n = 3;
                                    invoke = function2.invoke(null, this);
                                    if (invoke != nm6Var3) {
                                        str = str2;
                                        qdcVar5 = qdcVar7;
                                        str2 = str;
                                        qdcVar4 = qdcVar5;
                                        Object obj22 = invoke;
                                        qdcVar4.O(str2);
                                        return obj22;
                                    }
                                    return nm6Var3;
                                }
                                Object obj222 = invoke;
                                qdcVar4.O(str2);
                                return obj222;
                            } catch (Throwable th6) {
                                th = th6;
                                i4 = i17;
                                openRead = r3;
                                str2 = str4;
                                i3 = i18;
                                th = th;
                                try {
                                    throw th;
                                } catch (Throwable th7) {
                                    try {
                                        yd5.q(openRead, th);
                                        throw th7;
                                    } catch (FileNotFoundException unused2) {
                                        qdcVar3 = qdcVar2;
                                        int i192 = i4;
                                        qdc qdcVar72 = qdcVar3;
                                        this.o = qdcVar72;
                                        this.p = str2;
                                        this.k = null;
                                        this.q = null;
                                        this.r = null;
                                        this.l = i3;
                                        this.m = i192;
                                        this.n = 3;
                                        invoke = function2.invoke(null, this);
                                        if (invoke != nm6Var3) {
                                        }
                                        return nm6Var3;
                                    } catch (Throwable th8) {
                                        th = th8;
                                        str = str2;
                                        r2 = qdcVar2;
                                        r2.O(str);
                                        throw th;
                                    }
                                }
                            }
                        }
                        int i20 = this.l;
                        Function2 function22 = (Function2) this.r;
                        String str5 = (String) this.q;
                        kziVar = (kzi) this.k;
                        String str6 = (String) this.p;
                        qdc qdcVar8 = (qdc) this.o;
                        qgg.h0(obj);
                        i3 = i20;
                        str3 = str5;
                        str2 = str6;
                        function2 = function22;
                        qdcVar = qdcVar8;
                        this.o = qdcVar;
                        this.p = str2;
                        this.k = function2;
                        this.q = null;
                        this.r = openRead;
                        this.l = i3;
                        this.m = 0;
                        this.n = 2;
                        invoke = function2.invoke(openRead, this);
                        if (invoke != nm6Var3) {
                            i4 = 0;
                            qdcVar3 = qdcVar;
                            yd5.q(openRead, null);
                            qdcVar4 = qdcVar3;
                            Object obj2222 = invoke;
                            qdcVar4.O(str2);
                            return obj2222;
                        }
                        return nm6Var3;
                    } catch (Throwable th9) {
                        th = th9;
                        qdcVar2 = qdcVar;
                        i4 = 0;
                        th = th;
                        throw th;
                    }
                    kziVar.getClass();
                    openRead = new AtomicFile(new File((File) kziVar.a.getValue(), str3)).openRead();
                } catch (Throwable th10) {
                    th = th10;
                    str = 1;
                }
            case 2:
                nm6 nm6Var4 = nm6.a;
                int i21 = this.n;
                if (i21 == 0) {
                    qgg.h0(obj);
                    auv auvVar2 = (auv) this.t;
                    auvVar = auvVar2;
                    xdrVar = auvVar2.d;
                    wrvVar = (wrv) this.u;
                    i5 = 0;
                    Object value = xdrVar.getValue();
                    s2w s2wVar = (s2w) value;
                    Map map2 = s2wVar.a;
                    wrvVar.getClass();
                    int i22 = wrvVar.b;
                    int i23 = wrvVar.a;
                    arrayList = new ArrayList();
                    i6 = i23 - 5;
                    i7 = i23 + 5;
                    if (i6 > i7) {
                    }
                    if (!arrayList.isEmpty()) {
                    }
                } else {
                    if (i21 != 1) {
                        if (i21 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    int i24 = this.m;
                    int i25 = this.l;
                    Collection values = (Collection) this.s;
                    s2w s2wVar2 = (s2w) this.r;
                    Object obj3 = this.k;
                    auv auvVar3 = (auv) this.q;
                    wrvVar = (wrv) this.p;
                    xdrVar = (xdr) this.o;
                    qgg.h0(obj);
                    Object obj4 = obj3;
                    s2w s2wVar3 = s2wVar2;
                    auv auvVar4 = auvVar3;
                    int i26 = i24;
                    nm6 nm6Var5 = nm6Var4;
                    Object c = obj;
                    wrv wrvVar2 = wrvVar;
                    rj6 rj6Var = (rj6) c;
                    if (!(rj6Var instanceof qj6)) {
                        ArrayList g0 = CollectionsKt.g0(((n2w) ((qj6) rj6Var).a).a, values);
                        xdr xdrVar2 = xdrVar;
                        if (xdrVar2.k(obj4, auv.h(auvVar4, s2wVar3, g0, null, null, null, null, null, null, 126))) {
                            return Unit.a;
                        }
                        xdrVar = xdrVar2;
                        nm6Var4 = nm6Var5;
                        i5 = i25;
                        auvVar = auvVar4;
                        wrvVar = wrvVar2;
                        Object value2 = xdrVar.getValue();
                        s2w s2wVar4 = (s2w) value2;
                        Map map22 = s2wVar4.a;
                        wrvVar.getClass();
                        int i222 = wrvVar.b;
                        int i232 = wrvVar.a;
                        arrayList = new ArrayList();
                        i6 = i232 - 5;
                        i7 = i232 + 5;
                        if (i6 > i7) {
                            while (true) {
                                int i27 = i222 - 5;
                                int i28 = i222 + 5;
                                nm6Var = nm6Var4;
                                if (i27 <= i28) {
                                    while (true) {
                                        wrv wrvVar3 = new wrv(i6, i27);
                                        if (map22.containsKey(wrvVar3)) {
                                            i8 = i5;
                                            map = map22;
                                        } else {
                                            map = map22;
                                            i8 = i5;
                                            arrayList.add(new zrv("-1", wrvVar3));
                                        }
                                        if (i27 != i28) {
                                            i27++;
                                            map22 = map;
                                            i5 = i8;
                                        }
                                    }
                                } else {
                                    i8 = i5;
                                    map = map22;
                                }
                                if (i6 != i7) {
                                    i6++;
                                    nm6Var4 = nm6Var;
                                    map22 = map;
                                    i5 = i8;
                                }
                            }
                        } else {
                            nm6Var = nm6Var4;
                            i8 = i5;
                        }
                        if (!arrayList.isEmpty()) {
                            return Unit.a;
                        }
                        Map map3 = s2wVar4.a;
                        double d = 2;
                        double pow = Math.pow(15.0d, d);
                        double d2 = i232;
                        double d3 = i222;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : map3.entrySet()) {
                            double d4 = d3;
                            wrv wrvVar4 = (wrv) entry.getKey();
                            double d5 = d2;
                            if (Math.pow(wrvVar4.b - d4, d) + Math.pow(wrvVar4.a - d5, d) <= pow) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                            d3 = d4;
                            d2 = d5;
                        }
                        values = linkedHashMap.values();
                        n0w n0wVar = auvVar.a;
                        String str7 = s2wVar4.f;
                        ArrayList g02 = CollectionsKt.g0(arrayList, values);
                        b3w b3wVar = b3w.BOTH_DIMENSIONS;
                        this.o = xdrVar;
                        this.p = wrvVar;
                        this.q = auvVar;
                        this.k = value2;
                        this.r = s2wVar4;
                        this.s = values;
                        int i29 = i8;
                        this.l = i29;
                        this.m = 0;
                        this.n = 1;
                        c = n0wVar.c(str7, g02, b3wVar, this);
                        nm6Var5 = nm6Var;
                        if (c != nm6Var5) {
                            obj4 = value2;
                            i25 = i29;
                            s2wVar3 = s2wVar4;
                            auvVar4 = auvVar;
                            i26 = 0;
                            wrv wrvVar22 = wrvVar;
                            rj6 rj6Var2 = (rj6) c;
                            if (!(rj6Var2 instanceof qj6)) {
                                if (!(rj6Var2 instanceof pj6)) {
                                    b6e.s();
                                    return null;
                                }
                                x0q x0qVar = auvVar4.f;
                                Unit unit = Unit.a;
                                this.o = null;
                                this.p = null;
                                this.q = null;
                                this.k = null;
                                this.r = null;
                                this.s = null;
                                this.l = i25;
                                this.m = i26;
                                this.n = 2;
                                break;
                            }
                        }
                        return nm6Var5;
                    }
                }
            default:
                fk0 fk0Var = (fk0) this.q;
                aqi aqiVar = (aqi) this.u;
                aqi aqiVar2 = (aqi) this.t;
                aqi aqiVar3 = (aqi) this.r;
                ArrayList arrayList2 = (ArrayList) this.p;
                nm6 nm6Var6 = nm6.a;
                int i30 = this.n;
                if (i30 == 0) {
                    qgg.h0(obj);
                    int size = arrayList2.size();
                    float f = vvv.a;
                    int i31 = size <= 2 ? size : 3;
                    List r0 = CollectionsKt.r0(arrayList2, i31);
                    aqi aqiVar4 = (aqi) this.k;
                    List list3 = (List) aqiVar3.getValue();
                    int max = Math.max(((Number) ((aqi) this.s).getValue()).intValue(), i31 - 1);
                    if (r0.size() >= list3.size() || Intrinsics.d(CollectionsKt.firstOrNull(list3), CollectionsKt.firstOrNull(r0))) {
                        Iterator it = CollectionsKt.C0(r0, list3).iterator();
                        int i32 = -1;
                        int i33 = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i34 = i33 + 1;
                            if (i33 < 0) {
                                u75.n();
                                throw null;
                            }
                            Pair pair = (Pair) next;
                            if (!Intrinsics.d((ctv) pair.a, (ctv) pair.b)) {
                                i32 = i33;
                            }
                            i33 = i34;
                        }
                        if (i32 >= 0) {
                            max = i32;
                        }
                    } else {
                        max = 0;
                    }
                    aqiVar4.setValue(Integer.valueOf(max));
                    if (((Number) aqiVar2.getValue()).intValue() == arrayList2.size() || r0.equals((List) aqiVar3.getValue())) {
                        return Unit.a;
                    }
                    if (((Number) aqiVar2.getValue()).intValue() > arrayList2.size()) {
                        aqiVar2.setValue(Integer.valueOf(arrayList2.size()));
                        fk0 fk0Var2 = (fk0) this.q;
                        Float f2 = new Float(1.0f);
                        act S = weo.S(300, 0, lya.c, 2);
                        this.o = r0;
                        this.l = i31;
                        this.n = 1;
                        if (fk0.c(fk0Var2, f2, S, null, this, 12) != nm6Var6) {
                            list2 = r0;
                            i10 = i31;
                            float f3 = vvv.a;
                            aqiVar3.setValue(list2);
                            aqiVar.setValue(Integer.valueOf(i10));
                            Float f4 = new Float(0.0f);
                            this.o = null;
                            this.l = i10;
                            this.n = 2;
                        }
                    } else {
                        aqiVar2.setValue(Integer.valueOf(arrayList2.size()));
                        Float f5 = new Float(1.0f);
                        this.o = r0;
                        this.l = i31;
                        this.n = 3;
                        if (fk0Var.f(f5, this) != nm6Var6) {
                            list = r0;
                            i9 = i31;
                            float f6 = vvv.a;
                            aqiVar3.setValue(list);
                            if (i9 <= ((Number) aqiVar.getValue()).intValue()) {
                            }
                            aqiVar.setValue(Integer.valueOf(i9));
                            if (i11 != 0) {
                            }
                            fk0 fk0Var3 = (fk0) this.q;
                            Float f7 = new Float(0.0f);
                            float f8 = vvv.a;
                            act S2 = weo.S(300, 0, lya.c, 2);
                            this.o = null;
                            this.l = i9;
                            this.m = i11;
                            this.n = 5;
                        }
                    }
                    return nm6Var6;
                }
                if (i30 != 1) {
                    if (i30 != 2) {
                        if (i30 == 3) {
                            i9 = this.l;
                            list = (List) this.o;
                            qgg.h0(obj);
                            float f62 = vvv.a;
                            aqiVar3.setValue(list);
                            i11 = i9 <= ((Number) aqiVar.getValue()).intValue() ? 1 : 0;
                            aqiVar.setValue(Integer.valueOf(i9));
                            if (i11 != 0) {
                                this.o = null;
                                this.l = i9;
                                this.m = i11;
                                this.n = 4;
                                if (y2x.o(300L, this) != nm6Var6) {
                                    i12 = i9;
                                    i13 = i11;
                                    i11 = i13;
                                    i9 = i12;
                                }
                                return nm6Var6;
                            }
                            fk0 fk0Var32 = (fk0) this.q;
                            Float f72 = new Float(0.0f);
                            float f82 = vvv.a;
                            act S22 = weo.S(300, 0, lya.c, 2);
                            this.o = null;
                            this.l = i9;
                            this.m = i11;
                            this.n = 5;
                        } else if (i30 == 4) {
                            i13 = this.m;
                            i12 = this.l;
                            qgg.h0(obj);
                            i11 = i13;
                            i9 = i12;
                            fk0 fk0Var322 = (fk0) this.q;
                            Float f722 = new Float(0.0f);
                            float f822 = vvv.a;
                            act S222 = weo.S(300, 0, lya.c, 2);
                            this.o = null;
                            this.l = i9;
                            this.m = i11;
                            this.n = 5;
                            break;
                        } else if (i30 != 5) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    qgg.h0(obj);
                    return Unit.a;
                }
                i10 = this.l;
                list2 = (List) this.o;
                qgg.h0(obj);
                float f32 = vvv.a;
                aqiVar3.setValue(list2);
                aqiVar.setValue(Integer.valueOf(i10));
                Float f42 = new Float(0.0f);
                this.o = null;
                this.l = i10;
                this.n = 2;
                break;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw1(kzi kziVar, String str, n71 n71Var, Continuation continuation) {
        super(2, continuation);
        this.s = kziVar;
        this.t = str;
        this.u = n71Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw1(auv auvVar, wrv wrvVar, Continuation continuation) {
        super(2, continuation);
        this.t = auvVar;
        this.u = wrvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw1(n4c n4cVar, rdk rdkVar, ExoPlayer exoPlayer, f4c f4cVar, Continuation continuation) {
        super(2, continuation);
        this.q = n4cVar;
        this.t = rdkVar;
        this.u = exoPlayer;
        this.s = f4cVar;
    }
}
