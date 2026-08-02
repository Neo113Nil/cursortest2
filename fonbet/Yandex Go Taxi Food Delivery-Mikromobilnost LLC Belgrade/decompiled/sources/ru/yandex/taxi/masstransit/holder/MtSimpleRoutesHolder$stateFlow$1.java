package ru.yandex.taxi.masstransit.holder;

import com.yandex.mapkit.transport.masstransit.TransportContour;
import defpackage.aqb1;
import defpackage.avj0;
import defpackage.b3v0;
import defpackage.bdc;
import defpackage.bs30;
import defpackage.c040;
import defpackage.dj40;
import defpackage.ezy;
import defpackage.f5q0;
import defpackage.fb11;
import defpackage.g8e;
import defpackage.gb11;
import defpackage.gdc;
import defpackage.gz30;
import defpackage.hb11;
import defpackage.hj40;
import defpackage.hz30;
import defpackage.hzy;
import defpackage.igl0;
import defpackage.j73;
import defpackage.jb11;
import defpackage.jl40;
import defpackage.jm30;
import defpackage.kd60;
import defpackage.kdc;
import defpackage.kyh0;
import defpackage.l540;
import defpackage.lj40;
import defpackage.mvg;
import defpackage.nk31;
import defpackage.nw8;
import defpackage.ny61;
import defpackage.ob60;
import defpackage.oov0;
import defpackage.oyr;
import defpackage.py30;
import defpackage.q2h0;
import defpackage.qn30;
import defpackage.r440;
import defpackage.scc;
import defpackage.su30;
import defpackage.t3t0;
import defpackage.tcc;
import defpackage.tog0;
import defpackage.u3t0;
import defpackage.uu30;
import defpackage.v3t0;
import defpackage.vi30;
import defpackage.w1u;
import defpackage.w3t0;
import defpackage.w511;
import defpackage.wls;
import defpackage.x3t0;
import defpackage.xng0;
import defpackage.xob1;
import defpackage.y3t0;
import defpackage.ycc;
import defpackage.yi40;
import defpackage.zi40;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.datasource.routing.HasNoDestinationPointException;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpy30;", "it", "Le040;", "<anonymous>", "(Lpy30;)Le040;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.holder.MtSimpleRoutesHolder$stateFlow$1", f = "MtSimpleRoutesHolder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtSimpleRoutesHolder$stateFlow$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtSimpleRoutesHolder$stateFlow$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtSimpleRoutesHolder$stateFlow$1 mtSimpleRoutesHolder$stateFlow$1 = new MtSimpleRoutesHolder$stateFlow$1(this.this$0, continuation);
        mtSimpleRoutesHolder$stateFlow$1.L$0 = obj;
        return mtSimpleRoutesHolder$stateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtSimpleRoutesHolder$stateFlow$1) create((py30) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:204:0x0462, code lost:
    
        if (r15.isEmpty() == false) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0464, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0561, code lost:
    
        if (r13 == null) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0563, code lost:
    
        r8.add(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0468, code lost:
    
        r14 = r10.e;
        r16 = r17.toString();
        r1 = r3.b;
        r2 = r0.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0476, code lost:
    
        if (r15.isEmpty() == false) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0478, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0490, code lost:
    
        if (r12 != false) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0492, code lost:
    
        r4 = defpackage.rcc.a();
        r2 = (defpackage.avj0) r2;
        r4.add(r2.i(defpackage.kyh0.mt_route_number_with_count_content_description, java.lang.Integer.valueOf(r23), java.lang.Integer.valueOf(r24)));
        r4.add(r2.i(defpackage.kyh0.mt_route_travel_time, r17));
        r2 = new java.util.ArrayList();
        r6 = r15.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x04c7, code lost:
    
        if (r6.hasNext() == false) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x04c9, code lost:
    
        r9 = (defpackage.y3t0) r6.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x04d3, code lost:
    
        if (defpackage.jl40.l(r9, r7) == false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x04d5, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x04fb, code lost:
    
        if (r9 == null) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x04fd, code lost:
    
        r2.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x04da, code lost:
    
        if ((r9 instanceof defpackage.w3t0) == false) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x04dc, code lost:
    
        r9 = ((defpackage.w3t0) r9).g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x04e3, code lost:
    
        if ((r9 instanceof defpackage.x3t0) == false) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x04e5, code lost:
    
        r9 = ((defpackage.x3t0) r9).e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x04ec, code lost:
    
        if ((r9 instanceof defpackage.u3t0) == false) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x04ee, code lost:
    
        r9 = ((defpackage.u3t0) r9).b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x04f5, code lost:
    
        if ((r9 instanceof defpackage.v3t0) == false) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x04f7, code lost:
    
        r9 = ((defpackage.v3t0) r9).b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0501, code lost:
    
        defpackage.w511.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0504, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0505, code lost:
    
        r4.addAll(r2);
        r4.add(r3.b);
        r2 = r4.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0548, code lost:
    
        r13 = new defpackage.c040(r14, r15, r16, r1, r10, r25, kotlin.collections.a.X(r2, ru.CryptoPro.JCP.tools.CertReader.Extension.FIX_SPACE, null, null, null, 62));
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0515, code lost:
    
        if (r12 != true) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0517, code lost:
    
        r3 = (defpackage.y3t0) kotlin.collections.a.R(r15);
        r4 = defpackage.rcc.a();
        r4.add(((defpackage.avj0) r2).i(defpackage.kyh0.mt_route_number_with_count_content_description, java.lang.Integer.valueOf(r23), java.lang.Integer.valueOf(r24)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x053a, code lost:
    
        if ((r3 instanceof defpackage.v3t0) == false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x053c, code lost:
    
        r4.add(((defpackage.v3t0) r3).b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0543, code lost:
    
        r2 = r4.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0572, code lost:
    
        defpackage.w511.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0575, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x047a, code lost:
    
        r4 = r15.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0482, code lost:
    
        if (r4.hasNext() == false) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x048c, code lost:
    
        if ((((defpackage.y3t0) r4.next()) instanceof defpackage.v3t0) != false) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x048e, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0402 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r26v1, types: [x3t0] */
    /* JADX WARN: Type inference failed for: r26v2, types: [x3t0] */
    /* JADX WARN: Type inference failed for: r26v8, types: [w3t0] */
    /* JADX WARN: Type inference failed for: r2v49, types: [u3t0] */
    /* JADX WARN: Type inference failed for: r41v0, types: [w3t0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CharSequence charSequence;
        List list;
        boolean z;
        CharSequence charSequence2;
        oov0 oov0Var;
        uu30 uu30Var;
        Iterator it;
        int i;
        oov0 oov0Var2;
        boolean z2;
        uu30 uu30Var2;
        boolean z3;
        int i2;
        int i3;
        Iterator it2;
        v3t0 v3t0Var;
        List list2;
        String name;
        boolean z4;
        TransportContour transportContour;
        jb11 hb11Var;
        String h;
        String str;
        String str2;
        v3t0 v3t0Var2;
        boolean z5;
        jb11 gb11Var;
        String str3;
        String str4;
        String str5;
        py30 py30Var = (py30) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c cVar = this.this$0;
        cVar.getClass();
        if (py30Var.c) {
            ArrayList arrayList = new ArrayList(3);
            for (int i4 = 0; i4 < 3; i4++) {
                arrayList.add(qn30.a);
            }
            return new ezy(arrayList);
        }
        Throwable th = py30Var.d;
        if (th != null) {
            return th instanceof HasNoDestinationPointException ? ob60.a : hzy.a;
        }
        List list3 = py30Var.a;
        su30 su30Var = py30Var.b;
        uu30 uu30Var3 = py30Var.e;
        oov0 oov0Var3 = py30Var.g.b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = list3.iterator();
        int i5 = 0;
        while (true) {
            String str6 = "";
            if (!it3.hasNext()) {
                oov0 oov0Var4 = oov0Var3;
                uu30 uu30Var4 = uu30Var3;
                if (arrayList2.isEmpty()) {
                    return kd60.a;
                }
                Iterator it4 = arrayList2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it4.next();
                    if (jl40.l(((c040) obj2).e.e, su30Var != null ? su30Var.e : null)) {
                        break;
                    }
                }
                c040 c040Var = (c040) obj2;
                List list4 = EmptyList.a;
                List list5 = oov0Var4 != null ? oov0Var4.c : list4;
                if (oov0Var4 != null) {
                    list4 = oov0Var4.d;
                }
                if (c040Var != null) {
                    return new igl0(arrayList2, c040Var.d, uu30Var4, c.a(arrayList2, list5, list4));
                }
                c040 c040Var2 = (c040) kotlin.collections.a.R(arrayList2);
                CharSequence charSequence3 = (c040Var2 == null || (charSequence = c040Var2.d) == null) ? "" : charSequence;
                ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                Iterator it5 = arrayList2.iterator();
                int i6 = 0;
                while (it5.hasNext()) {
                    Object next = it5.next();
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        scc.m();
                        throw null;
                    }
                    c040 c040Var3 = (c040) next;
                    if (i6 == 0) {
                        c040Var3 = new c040(c040Var3.a, c040Var3.b, c040Var3.c, c040Var3.d, c040Var3.e, true, c040Var3.g);
                    }
                    arrayList3.add(c040Var3);
                    i6 = i7;
                }
                return new igl0(arrayList3, charSequence3, uu30Var4, c.a(arrayList3, list5, list4));
            }
            Object next2 = it3.next();
            int i8 = i5 + 1;
            if (i5 < 0) {
                scc.m();
                throw null;
            }
            su30 su30Var2 = (su30) next2;
            boolean l = jl40.l(su30Var2.e, su30Var != null ? su30Var.e : null);
            int size = list3.size();
            nw8 nw8Var = cVar.c;
            List list6 = su30Var2.a;
            vi30 vi30Var = su30Var2.d;
            CharSequence charSequence4 = su30Var2.c.b;
            list = list3;
            zuj0 zuj0Var = nw8Var.a;
            List list7 = list6;
            if (!(list7 instanceof Collection) || !list7.isEmpty()) {
                Iterator it6 = list7.iterator();
                while (it6.hasNext()) {
                    if (!(((hz30) it6.next()) instanceof bs30)) {
                        z = false;
                        charSequence2 = charSequence4;
                        break;
                    }
                }
            }
            charSequence2 = charSequence4;
            z = true;
            ArrayList arrayList4 = new ArrayList();
            Iterator it7 = list7.iterator();
            while (it7.hasNext()) {
                Iterator it8 = it3;
                hz30 hz30Var = (hz30) it7.next();
                String str7 = str6;
                if ((hz30Var instanceof yi40) || (hz30Var instanceof l540)) {
                    oov0Var2 = oov0Var3;
                    z2 = z;
                    uu30Var2 = uu30Var3;
                    z3 = l;
                    i2 = i8;
                    i3 = size;
                } else {
                    if (hz30Var instanceof bs30) {
                        i2 = i8;
                        if (z) {
                            f5q0 f5q0Var = ((bs30) hz30Var).a;
                            if (f5q0Var == null || (str5 = f5q0Var.a) == null) {
                                str5 = str7;
                            }
                            z2 = z;
                            i3 = size;
                            v3t0Var = new v3t0(g8e.p(((avj0) zuj0Var).i(kyh0.mt_pedestrian_section_description, f5q0Var != null ? f5q0Var.b : null), Extension.FIX_SPACE, str5), q2h0.ic_walk_16, str5, l);
                            oov0Var2 = oov0Var3;
                            uu30Var2 = uu30Var3;
                            z3 = l;
                            it2 = it7;
                        } else {
                            z2 = z;
                            i3 = size;
                            if (z2) {
                                w511.b();
                                return null;
                            }
                            oov0Var2 = oov0Var3;
                            uu30Var2 = uu30Var3;
                            z3 = l;
                        }
                    } else {
                        z2 = z;
                        i2 = i8;
                        i3 = size;
                        if (hz30Var instanceof jm30) {
                            jm30 jm30Var = (jm30) hz30Var;
                            w1u f = jm30Var.f();
                            List list8 = jm30Var.i;
                            dj40 dj40Var = f.d;
                            z3 = l;
                            String str8 = f.a;
                            MtTransportType mtTransportType = dj40Var.b;
                            boolean z6 = jm30Var.b;
                            if (z6) {
                                z5 = z6;
                                it2 = it7;
                                gdc gdcVar = new gdc(tog0.mt_aeroexpress_color);
                                StringBuilder v = oyr.v(str8, " · ");
                                uu30Var2 = uu30Var3;
                                v.append(((avj0) zuj0Var).h(kyh0.mt_routes_bus_express));
                                oov0Var2 = oov0Var3;
                                gb11Var = new fb11(v.toString(), gdcVar, new bdc(xng0.everFront));
                            } else {
                                oov0Var2 = oov0Var3;
                                uu30Var2 = uu30Var3;
                                z5 = z6;
                                it2 = it7;
                                gb11Var = new gb11(str8, jm30Var.e, new bdc(xng0.everFront));
                            }
                            int size2 = jm30Var.a.size() - 1;
                            if (size2 < 0) {
                                size2 = 0;
                            }
                            kdc kdcVar = f.h;
                            mtTransportType.getClass();
                            kdc kdcVar2 = mtTransportType == MtTransportType.AEROEXPRESS ? kdcVar : null;
                            boolean z7 = z5;
                            int b = xob1.b(mtTransportType);
                            String i9 = size2 > 0 ? ((avj0) zuj0Var).i(kyh0.mt_other_variants, Integer.valueOf(size2)) : null;
                            bdc bdcVar = new bdc(xng0.bgMain);
                            bdc bdcVar2 = new bdc(xng0.controlMinor);
                            String p = g8e.p(((avj0) zuj0Var).h(aqb1.b(mtTransportType)), Extension.FIX_SPACE, gb11Var.a);
                            String str9 = z7 ? jm30Var.m : null;
                            hj40 hj40Var = (hj40) kotlin.collections.a.R(list8);
                            String str10 = (hj40Var == null || (str4 = hj40Var.c) == null || !z7) ? null : str4;
                            hj40 hj40Var2 = (hj40) kotlin.collections.a.b0(list8);
                            v3t0Var2 = new w3t0(b, kdcVar2, gb11Var, i9, bdcVar2, bdcVar, p, str10, (hj40Var2 == null || (str3 = hj40Var2.c) == null || !z7) ? null : str3, str9, mtTransportType);
                        } else {
                            oov0Var2 = oov0Var3;
                            uu30Var2 = uu30Var3;
                            z3 = l;
                            it2 = it7;
                            if (hz30Var instanceof r440) {
                                r440 r440Var = (r440) hz30Var;
                                b3v0 f2 = r440Var.f();
                                List list9 = r440Var.h;
                                boolean z8 = r440Var.b;
                                MtTransportType mtTransportType2 = f2.b;
                                TransportContour transportContour2 = f2.g;
                                mtTransportType2.getClass();
                                MtTransportType mtTransportType3 = MtTransportType.AEROEXPRESS;
                                boolean z9 = mtTransportType2 == mtTransportType3 || f2.e;
                                if (z9) {
                                    list2 = list9;
                                    name = ((avj0) zuj0Var).h(kyh0.mt_routes_aeroexpress);
                                } else {
                                    list2 = list9;
                                    name = transportContour2 != null ? transportContour2.getName() : ((avj0) zuj0Var).h(kyh0.mt_routes_suburban);
                                }
                                kdc kdcVar3 = r440Var.d;
                                if (z9) {
                                    z4 = z8;
                                    transportContour = transportContour2;
                                    hb11Var = new fb11(name, kdcVar3, new bdc(xng0.everFront));
                                } else {
                                    z4 = z8;
                                    transportContour = transportContour2;
                                    hb11Var = new hb11(transportContour != null, name, kdcVar3, new bdc(xng0.everFront));
                                }
                                kdc kdcVar4 = f2.h;
                                MtTransportType mtTransportType4 = f2.b;
                                mtTransportType4.getClass();
                                kdc kdcVar5 = mtTransportType4 == mtTransportType3 ? kdcVar4 : null;
                                int b2 = xob1.b(r440Var.f().b);
                                bdc bdcVar3 = new bdc(xng0.bgMain);
                                bdc bdcVar4 = new bdc(xng0.controlMinor);
                                avj0 avj0Var = (avj0) zuj0Var;
                                String h2 = avj0Var.h(aqb1.b(r440Var.f().b));
                                if (transportContour == null || (h = transportContour.getName()) == null) {
                                    h = avj0Var.h(kyh0.mt_routes_suburban);
                                }
                                String p2 = g8e.p(h2, Extension.FIX_SPACE, h);
                                MtTransportType mtTransportType5 = f2.b;
                                String str11 = z4 ? r440Var.l : null;
                                hj40 hj40Var3 = (hj40) kotlin.collections.a.R(list2);
                                String str12 = (hj40Var3 == null || (str2 = hj40Var3.c) == null || !z4) ? null : str2;
                                hj40 hj40Var4 = (hj40) kotlin.collections.a.b0(list2);
                                v3t0Var = new w3t0(b2, kdcVar5, hb11Var, null, bdcVar4, bdcVar3, p2, str12, (hj40Var4 == null || (str = hj40Var4.c) == null || !z4) ? null : str, str11, mtTransportType5);
                            } else if (hz30Var instanceof lj40) {
                                lj40 lj40Var = (lj40) hz30Var;
                                kdc kdcVar6 = lj40Var.h;
                                MtTransportType mtTransportType6 = lj40Var.g;
                                String str13 = lj40Var.c;
                                String str14 = str13 == null ? str7 : str13;
                                Integer c = xob1.c(lj40Var.b);
                                v3t0Var2 = new x3t0(kdcVar6, str14, c != null ? c.intValue() : 0, xob1.b(mtTransportType6), nw8Var.a(str13, mtTransportType6), lj40Var.g);
                            } else if (hz30Var instanceof zi40) {
                                zi40 zi40Var = (zi40) hz30Var;
                                kdc kdcVar7 = zi40Var.b;
                                MtTransportType mtTransportType7 = zi40Var.h;
                                String str15 = zi40Var.d;
                                String str16 = str15 == null ? str7 : str15;
                                Integer c2 = xob1.c(zi40Var.e);
                                v3t0Var2 = new x3t0(kdcVar7, str16, c2 != null ? c2.intValue() : 0, xob1.b(mtTransportType7), nw8Var.a(str15, mtTransportType7), zi40Var.h);
                            } else if (hz30Var instanceof nk31) {
                                nk31 nk31Var = (nk31) hz30Var;
                                v3t0Var = new u3t0(String.valueOf(nk31Var.c), g8e.p(((avj0) zuj0Var).h(kyh0.route_point), " ", nk31Var.a));
                            } else {
                                if (!(hz30Var instanceof gz30)) {
                                    w511.b();
                                    return null;
                                }
                                v3t0Var = null;
                            }
                        }
                        v3t0Var = v3t0Var2;
                    }
                    if (v3t0Var == null) {
                        arrayList4.add(v3t0Var);
                    }
                    str6 = str7;
                    z = z2;
                    it3 = it8;
                    i8 = i2;
                    size = i3;
                    l = z3;
                    it7 = it2;
                    uu30Var3 = uu30Var2;
                    oov0Var3 = oov0Var2;
                }
                it2 = it7;
                v3t0Var = null;
                if (v3t0Var == null) {
                }
                str6 = str7;
                z = z2;
                it3 = it8;
                i8 = i2;
                size = i3;
                l = z3;
                it7 = it2;
                uu30Var3 = uu30Var2;
                oov0Var3 = oov0Var2;
            }
            oov0Var = oov0Var3;
            uu30Var = uu30Var3;
            it = it3;
            boolean z10 = l;
            i = i8;
            int i10 = size;
            ArrayList arrayList5 = new ArrayList();
            Iterator it9 = arrayList4.iterator();
            int i11 = 0;
            while (true) {
                boolean hasNext = it9.hasNext();
                t3t0 t3t0Var = t3t0.a;
                if (!hasNext) {
                    break;
                }
                Object next3 = it9.next();
                int i12 = i11 + 1;
                if (i11 < 0) {
                    scc.m();
                    throw null;
                }
                y3t0 y3t0Var = (y3t0) next3;
                if (i11 == scc.f(arrayList4)) {
                    t3t0Var = null;
                }
                ycc.r(j73.A(new y3t0[]{y3t0Var, t3t0Var}), arrayList5);
                i11 = i12;
            }
            list3 = list;
            it3 = it;
            i5 = i;
            uu30Var3 = uu30Var;
            oov0Var3 = oov0Var;
        }
    }
}
