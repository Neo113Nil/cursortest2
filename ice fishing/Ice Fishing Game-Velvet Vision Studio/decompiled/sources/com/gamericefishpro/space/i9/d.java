package com.gamericefishpro.space.i9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Iterable, n, j {
    public final TreeMap d;
    public final TreeMap e;

    public d() {
        this.d = new TreeMap();
        this.e = new TreeMap();
    }

    @Override // com.gamericefishpro.space.i9.n
    public final Boolean b() {
        return Boolean.TRUE;
    }

    @Override // com.gamericefishpro.space.i9.n
    public final Double c() {
        TreeMap treeMap = this.d;
        if (treeMap.size() == 1) {
            return s(0).c();
        }
        return treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (r() != dVar.r()) {
            return false;
        }
        TreeMap treeMap = this.d;
        if (treeMap.isEmpty()) {
            return dVar.d.isEmpty();
        }
        for (int iIntValue = ((Integer) treeMap.firstKey()).intValue(); iIntValue <= ((Integer) treeMap.lastKey()).intValue(); iIntValue++) {
            if (!s(iIntValue).equals(dVar.s(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.gamericefishpro.space.i9.j
    public final n f(String str) {
        n nVar;
        if ("length".equals(str)) {
            return new g(Double.valueOf(r()));
        }
        return (!i(str) || (nVar = (n) this.e.get(str)) == null) ? n.j : nVar;
    }

    @Override // com.gamericefishpro.space.i9.n
    public final Iterator h() {
        return new c(this, this.d.keySet().iterator(), this.e.keySet().iterator());
    }

    public final int hashCode() {
        return this.d.hashCode() * 31;
    }

    @Override // com.gamericefishpro.space.i9.j
    public final boolean i(String str) {
        return "length".equals(str) || this.e.containsKey(str);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new p(2, this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x0209  */
    /* JADX WARN: Code duplicated, block: B:103:0x0213  */
    /* JADX WARN: Code duplicated, block: B:105:0x0218  */
    /* JADX WARN: Code duplicated, block: B:107:0x023c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0244  */
    /* JADX WARN: Code duplicated, block: B:111:0x024f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0270  */
    /* JADX WARN: Code duplicated, block: B:114:0x0276  */
    /* JADX WARN: Code duplicated, block: B:118:0x0285 A[LOOP:2: B:116:0x0280->B:118:0x0285, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:120:0x0294  */
    /* JADX WARN: Code duplicated, block: B:122:0x029a  */
    /* JADX WARN: Code duplicated, block: B:125:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:127:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:129:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:131:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:134:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:137:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:139:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:141:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:143:0x0302  */
    /* JADX WARN: Code duplicated, block: B:145:0x030c  */
    /* JADX WARN: Code duplicated, block: B:147:0x031f  */
    /* JADX WARN: Code duplicated, block: B:148:0x0323  */
    /* JADX WARN: Code duplicated, block: B:152:0x0340 A[LOOP:3: B:151:0x033e->B:152:0x0340, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:154:0x0350  */
    /* JADX WARN: Code duplicated, block: B:156:0x0358  */
    /* JADX WARN: Code duplicated, block: B:158:0x036f  */
    /* JADX WARN: Code duplicated, block: B:161:0x0376  */
    /* JADX WARN: Code duplicated, block: B:164:0x0382  */
    /* JADX WARN: Code duplicated, block: B:172:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:174:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:176:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:178:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:180:0x03e0 A[LOOP:5: B:179:0x03de->B:180:0x03e0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:183:0x0407  */
    /* JADX WARN: Code duplicated, block: B:185:0x040f  */
    /* JADX WARN: Code duplicated, block: B:187:0x0419  */
    /* JADX WARN: Code duplicated, block: B:189:0x041c  */
    /* JADX WARN: Code duplicated, block: B:191:0x0422  */
    /* JADX WARN: Code duplicated, block: B:197:0x043f  */
    /* JADX WARN: Code duplicated, block: B:198:0x0442  */
    /* JADX WARN: Code duplicated, block: B:201:0x044e  */
    /* JADX WARN: Code duplicated, block: B:203:0x0456  */
    /* JADX WARN: Code duplicated, block: B:206:0x0462  */
    /* JADX WARN: Code duplicated, block: B:208:0x046c  */
    /* JADX WARN: Code duplicated, block: B:210:0x0476  */
    /* JADX WARN: Code duplicated, block: B:212:0x048d  */
    /* JADX WARN: Code duplicated, block: B:214:0x0493  */
    /* JADX WARN: Code duplicated, block: B:216:0x0499  */
    /* JADX WARN: Code duplicated, block: B:218:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:220:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:222:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:224:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:226:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:228:0x04d4 A[LOOP:6: B:225:0x04be->B:228:0x04d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:234:0x04f2 A[LOOP:7: B:232:0x04ec->B:234:0x04f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:238:0x0516 A[LOOP:8: B:236:0x0510->B:238:0x0516, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:241:0x053b  */
    /* JADX WARN: Code duplicated, block: B:243:0x0543  */
    /* JADX WARN: Code duplicated, block: B:245:0x054d  */
    /* JADX WARN: Code duplicated, block: B:248:0x056b  */
    /* JADX WARN: Code duplicated, block: B:250:0x0587  */
    /* JADX WARN: Code duplicated, block: B:252:0x0591  */
    /* JADX WARN: Code duplicated, block: B:255:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:256:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:259:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:261:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:263:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:272:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:274:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:276:0x0607  */
    /* JADX WARN: Code duplicated, block: B:279:0x060e  */
    /* JADX WARN: Code duplicated, block: B:281:0x0614  */
    /* JADX WARN: Code duplicated, block: B:283:0x061a  */
    /* JADX WARN: Code duplicated, block: B:285:0x0622  */
    /* JADX WARN: Code duplicated, block: B:287:0x0628  */
    /* JADX WARN: Code duplicated, block: B:289:0x062e  */
    /* JADX WARN: Code duplicated, block: B:291:0x0650  */
    /* JADX WARN: Code duplicated, block: B:292:0x065c  */
    /* JADX WARN: Code duplicated, block: B:294:0x0662  */
    /* JADX WARN: Code duplicated, block: B:297:0x0676  */
    /* JADX WARN: Code duplicated, block: B:299:0x0694  */
    /* JADX WARN: Code duplicated, block: B:302:0x069d A[LOOP:10: B:300:0x0695->B:302:0x069d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:305:0x06b5 A[LOOP:11: B:305:0x06b5->B:321:0x0707, LOOP_START, PHI: r6 r32
      0x06b5: PHI (r6v7 int) = (r6v6 int), (r6v8 int) binds: [B:304:0x06b3, B:321:0x0707] A[DONT_GENERATE, DONT_INLINE]
      0x06b5: PHI (r32v1 java.util.TreeMap) = (r32v0 java.util.TreeMap), (r32v4 java.util.TreeMap) binds: [B:304:0x06b3, B:321:0x0707] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:307:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:309:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:311:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:313:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:314:0x06db  */
    /* JADX WARN: Code duplicated, block: B:316:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:318:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:326:0x0735 A[ADDED_TO_REGION, LOOP:13: B:326:0x0735->B:327:0x0737, LOOP_START, PHI: r0
      0x0735: PHI (r0v34 int) = (r0v33 int), (r0v35 int) binds: [B:296:0x0674, B:327:0x0737] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:327:0x0737 A[LOOP:13: B:326:0x0735->B:327:0x0737, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:329:0x0749  */
    /* JADX WARN: Code duplicated, block: B:331:0x0751  */
    /* JADX WARN: Code duplicated, block: B:333:0x0757  */
    /* JADX WARN: Code duplicated, block: B:335:0x0764  */
    /* JADX WARN: Code duplicated, block: B:337:0x077a  */
    /* JADX WARN: Code duplicated, block: B:339:0x0780  */
    /* JADX WARN: Code duplicated, block: B:341:0x0786  */
    /* JADX WARN: Code duplicated, block: B:344:0x07a3 A[LOOP:14: B:342:0x079d->B:344:0x07a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:346:0x07ba  */
    /* JADX WARN: Code duplicated, block: B:348:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:350:0x07c8  */
    /* JADX WARN: Code duplicated, block: B:352:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:354:0x07db  */
    /* JADX WARN: Code duplicated, block: B:356:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:361:0x0803 A[LOOP:16: B:359:0x07fd->B:361:0x0803, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:366:0x0827  */
    /* JADX WARN: Code duplicated, block: B:368:0x082f  */
    /* JADX WARN: Code duplicated, block: B:370:0x083f  */
    /* JADX WARN: Code duplicated, block: B:380:0x01f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x04dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:400:0x072d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:0x070c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:406:0x06fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:0x081e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:411:0x081a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x07f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x012b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0131  */
    /* JADX WARN: Code duplicated, block: B:58:0x013b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0153  */
    /* JADX WARN: Code duplicated, block: B:63:0x0176  */
    /* JADX WARN: Code duplicated, block: B:65:0x017c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0180  */
    /* JADX WARN: Code duplicated, block: B:68:0x0188  */
    /* JADX WARN: Code duplicated, block: B:69:0x018a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0196  */
    /* JADX WARN: Code duplicated, block: B:81:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:90:0x01da  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:97:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:99:0x0203  */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02e5, code lost:
    
        if (com.gamericefishpro.space.hj.c.c0(r7, r2, (com.gamericefishpro.space.i9.m) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).r() != r7.r()) goto L170;
     */
    @Override // com.gamericefishpro.space.i9.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n l(String str, com.gamericefishpro.space.u6.n nVar, ArrayList arrayList) {
        String str2;
        Object obj;
        String str3;
        Object obj2;
        Double dValueOf;
        int iHashCode;
        n nVarC;
        TreeMap treeMap;
        h hVar;
        String str4;
        d dVar;
        int size;
        int i;
        n nVarC2;
        int iR;
        d dVar2;
        Iterator itQ;
        String str5;
        n nVarC3;
        d dVar3;
        d dVar4;
        Iterator itQ2;
        t tVar;
        int iR2;
        int iR3;
        d dVar5;
        int iMax;
        int i2;
        n nVarC4;
        int i3;
        int iIntValue;
        TreeMap treeMap2;
        Integer numValueOf;
        TreeMap treeMap3;
        n nVar2;
        int i4;
        String str6;
        n nVarC5;
        int iR4;
        double d;
        double dR;
        int iMin;
        n nVarC6;
        d dVar6;
        int size2;
        int i5;
        int iR5;
        Iterator itQ3;
        Iterator itQ4;
        n nVarC7;
        n nVarC8;
        int iR6;
        String strM;
        n nVarC9;
        int size3;
        int i6;
        n nVarC10;
        Iterator itQ5;
        int iIntValue2;
        ArrayList arrayList2;
        int size4;
        int i7;
        int i8;
        n nVarC11;
        n nVarC12;
        double dR2;
        double dR3;
        double dMin;
        d dVar7;
        int i9;
        double dR4;
        int iR7;
        int i10;
        int i11;
        double dR5;
        Iterator itQ6;
        double d2;
        double dR6;
        String str7 = "toString";
        String str8 = "forEach";
        String str9 = "splice";
        if (!"concat".equals(str) && !"every".equals(str) && !"filter".equals(str) && !"forEach".equals(str) && !"indexOf".equals(str) && !"join".equals(str) && !"lastIndexOf".equals(str) && !"map".equals(str) && !"pop".equals(str) && !"push".equals(str) && !"reduce".equals(str) && !"reduceRight".equals(str) && !"reverse".equals(str) && !"shift".equals(str) && !"slice".equals(str) && !"some".equals(str)) {
            str2 = "filter";
            str3 = "sort";
            if (str3.equals(str)) {
                obj2 = "reduce";
            } else {
                obj2 = "reduce";
                if (str9.equals(str)) {
                    str9 = str9;
                } else if (str7.equals(str)) {
                    str9 = str9;
                    str7 = str7;
                } else {
                    if (!"unshift".equals(str)) {
                        str9 = str9;
                        str7 = str7;
                        return j.d(this, new q(str), nVar, arrayList);
                    }
                    str9 = str9;
                    str7 = str7;
                    obj = "unshift";
                }
            }
            obj = "unshift";
            nVar = nVar;
            str8 = "forEach";
            this = this;
            dValueOf = Double.valueOf(-1.0d);
            iHashCode = str.hashCode();
            TreeMap treeMap4 = this.d;
            nVarC = n.j;
            treeMap = treeMap4;
            hVar = null;
            switch (iHashCode) {
                case -1776922004:
                    str4 = str7;
                    if (str.equals(str4)) {
                        a4.K(str4, arrayList, 0);
                        return new q(this.w(","));
                    }
                    throw new IllegalArgumentException("Command not supported");
                case -1354795244:
                    if (str.equals("concat")) {
                        dVar = (d) this.o();
                        if (!arrayList.isEmpty()) {
                            size = arrayList.size();
                            i = 0;
                            while (i < size) {
                                Object obj3 = arrayList.get(i);
                                i++;
                                nVarC2 = ((t) nVar.e).c(nVar, (n) obj3);
                                if (!(nVarC2 instanceof f)) {
                                    throw new IllegalStateException("Failed evaluation of arguments");
                                }
                                iR = dVar.r();
                                if (nVarC2 instanceof d) {
                                    dVar2 = (d) nVarC2;
                                    itQ = dVar2.q();
                                    while (itQ.hasNext()) {
                                        Integer num = (Integer) itQ.next();
                                        dVar.t(num.intValue() + iR, dVar2.s(num.intValue()));
                                    }
                                } else {
                                    dVar.t(iR, nVarC2);
                                }
                            }
                        }
                        return dVar;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case -1274492040:
                    str5 = str2;
                    if (str.equals(str5)) {
                        a4.K(str5, arrayList, 1);
                        nVarC3 = ((t) nVar.e).c(nVar, (n) arrayList.get(0));
                        if (nVarC3 instanceof m) {
                            throw new IllegalArgumentException("Callback should be a method");
                        }
                        if (treeMap.size() == 0) {
                            return new d();
                        }
                        dVar3 = (d) this.o();
                        d dVarC0 = com.gamericefishpro.space.hj.c.c0(this, nVar, (m) nVarC3, null, Boolean.TRUE);
                        dVar4 = new d();
                        itQ2 = dVarC0.q();
                        while (itQ2.hasNext()) {
                            dVar4.t(dVar4.r(), dVar3.s(((Integer) itQ2.next()).intValue()));
                        }
                        return dVar4;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case -934873754:
                    if (str.equals(obj2)) {
                        return com.gamericefishpro.space.hj.c.a0(this, nVar, arrayList, true);
                    }
                    throw new IllegalArgumentException("Command not supported");
                case -895859076:
                    if (str.equals(str9)) {
                        if (arrayList.isEmpty()) {
                            return new d();
                        }
                        n nVar3 = (n) arrayList.get(0);
                        t tVar2 = (t) nVar.e;
                        tVar = (t) nVar.e;
                        iR2 = (int) a4.R(tVar2.c(nVar, nVar3).c().doubleValue());
                        if (iR2 < 0) {
                            iR2 = Math.max(0, this.r() + iR2);
                        } else if (iR2 > this.r()) {
                            iR2 = this.r();
                        }
                        iR3 = this.r();
                        dVar5 = new d();
                        if (arrayList.size() > 1) {
                            iMax = Math.max(0, (int) a4.R(tVar.c(nVar, (n) arrayList.get(1)).c().doubleValue()));
                            if (iMax > 0) {
                                for (i4 = iR2; i4 < Math.min(iR3, iR2 + iMax); i4++) {
                                    dVar5.t(dVar5.r(), this.s(iR2));
                                    this.v(iR2);
                                }
                            }
                            i2 = 2;
                            if (arrayList.size() > 2) {
                                while (i2 < arrayList.size()) {
                                    nVarC4 = tVar.c(nVar, (n) arrayList.get(i2));
                                    if (!(nVarC4 instanceof f)) {
                                        throw new IllegalArgumentException("Failed to parse elements to add");
                                    }
                                    i3 = (iR2 + i2) - 2;
                                    if (i3 >= 0) {
                                        StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 21);
                                        sb.append("Invalid value index: ");
                                        sb.append(i3);
                                        throw new IllegalArgumentException(sb.toString());
                                    }
                                    if (i3 >= this.r()) {
                                        this.t(i3, nVarC4);
                                        treeMap2 = treeMap;
                                    } else {
                                        iIntValue = ((Integer) treeMap.lastKey()).intValue();
                                        while (iIntValue >= i3) {
                                            numValueOf = Integer.valueOf(iIntValue);
                                            treeMap3 = treeMap;
                                            nVar2 = (n) treeMap3.get(numValueOf);
                                            if (nVar2 != null) {
                                                this.t(iIntValue + 1, nVar2);
                                                treeMap3.remove(numValueOf);
                                            }
                                            iIntValue--;
                                            treeMap = treeMap3;
                                        }
                                        treeMap2 = treeMap;
                                        this.t(i3, nVarC4);
                                    }
                                    i2++;
                                    treeMap = treeMap2;
                                }
                            }
                        } else {
                            while (iR2 < iR3) {
                                dVar5.t(dVar5.r(), this.s(iR2));
                                this.t(iR2, null);
                                iR2++;
                            }
                        }
                        return dVar5;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case -678635926:
                    str6 = str8;
                    if (str.equals(str6)) {
                        a4.K(str6, arrayList, 1);
                        nVarC5 = ((t) nVar.e).c(nVar, (n) arrayList.get(0));
                        if (nVarC5 instanceof m) {
                            throw new IllegalArgumentException("Callback should be a method");
                        }
                        if (treeMap.size() != 0) {
                            com.gamericefishpro.space.hj.c.c0(this, nVar, (m) nVarC5, null, null);
                            return nVarC;
                        }
                        return nVarC;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case -467511597:
                    if (str.equals("lastIndexOf")) {
                        a4.M("lastIndexOf", 2, arrayList);
                        if (!arrayList.isEmpty()) {
                            nVarC = ((t) nVar.e).c(nVar, (n) arrayList.get(0));
                        }
                        n nVar4 = nVarC;
                        iR4 = this.r() - 1;
                        if (arrayList.size() > 1) {
                            nVarC6 = ((t) nVar.e).c(nVar, (n) arrayList.get(1));
                            if (Double.isNaN(nVarC6.c().doubleValue())) {
                                dR = this.r() - 1;
                            } else {
                                dR = a4.R(nVarC6.c().doubleValue());
                            }
                            d = 0.0d;
                            if (dR < 0.0d) {
                                dR += (double) this.r();
                            }
                        } else {
                            d = 0.0d;
                            dR = iR4;
                        }
                        if (dR < d) {
                            return new g(dValueOf);
                        }
                        for (iMin = (int) Math.min(this.r(), dR); iMin >= 0; iMin--) {
                            if (!this.u(iMin) && a4.P(this.s(iMin), nVar4)) {
                                return new g(Double.valueOf(iMin));
                            }
                        }
                        return new g(dValueOf);
                    }
                    throw new IllegalArgumentException("Command not supported");
                case -277637751:
                    if (str.equals(obj)) {
                        if (!arrayList.isEmpty()) {
                            dVar6 = new d();
                            size2 = arrayList.size();
                            i5 = 0;
                            while (i5 < size2) {
                                Object obj4 = arrayList.get(i5);
                                i5++;
                                nVarC7 = ((t) nVar.e).c(nVar, (n) obj4);
                                if (!(nVarC7 instanceof f)) {
                                    throw new IllegalStateException("Argument evaluation failed");
                                }
                                dVar6.t(dVar6.r(), nVarC7);
                            }
                            iR5 = dVar6.r();
                            itQ3 = this.q();
                            while (itQ3.hasNext()) {
                                Integer num2 = (Integer) itQ3.next();
                                dVar6.t(num2.intValue() + iR5, this.s(num2.intValue()));
                            }
                            treeMap.clear();
                            itQ4 = dVar6.q();
                            while (itQ4.hasNext()) {
                                Integer num3 = (Integer) itQ4.next();
                                this.t(num3.intValue(), dVar6.s(num3.intValue()));
                            }
                        }
                        return new g(Double.valueOf(this.r()));
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 107868:
                    if (str.equals("map")) {
                        a4.K("map", arrayList, 1);
                        nVarC8 = ((t) nVar.e).c(nVar, (n) arrayList.get(0));
                        if (nVarC8 instanceof m) {
                            return this.r() == 0 ? new d() : com.gamericefishpro.space.hj.c.c0(this, nVar, (m) nVarC8, null, null);
                        }
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 111185:
                    if (str.equals("pop")) {
                        a4.K("pop", arrayList, 0);
                        iR6 = this.r();
                        if (iR6 != 0) {
                            int i12 = iR6 - 1;
                            n nVarS = this.s(i12);
                            this.v(i12);
                            return nVarS;
                        }
                        return nVarC;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 3267882:
                    if (str.equals("join")) {
                        a4.M("join", 1, arrayList);
                        if (this.r() == 0) {
                            return n.q;
                        }
                        if (arrayList.isEmpty()) {
                            strM = ",";
                        } else {
                            nVarC9 = ((t) nVar.e).c(nVar, (n) arrayList.get(0));
                            if (!(nVarC9 instanceof l) || (nVarC9 instanceof r)) {
                                strM = "";
                            } else {
                                strM = nVarC9.m();
                            }
                        }
                        return new q(this.w(strM));
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 3452698:
                    if (str.equals("push")) {
                        if (!arrayList.isEmpty()) {
                            size3 = arrayList.size();
                            i6 = 0;
                            while (i6 < size3) {
                                Object obj5 = arrayList.get(i6);
                                i6++;
                                this.t(this.r(), ((t) nVar.e).c(nVar, (n) obj5));
                            }
                        }
                        return new g(Double.valueOf(this.r()));
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 3536116:
                    if (str.equals("some")) {
                        a4.K("some", arrayList, 1);
                        nVarC10 = ((t) nVar.e).c(nVar, (n) arrayList.get(0));
                        if (nVarC10 instanceof h) {
                            throw new IllegalArgumentException("Callback should be a method");
                        }
                        if (this.r() != 0) {
                            h hVar2 = (h) nVarC10;
                            itQ5 = this.q();
                            while (itQ5.hasNext()) {
                                iIntValue2 = ((Integer) itQ5.next()).intValue();
                                if (!this.u(iIntValue2) && hVar2.a(nVar, Arrays.asList(this.s(iIntValue2), new g(Double.valueOf(iIntValue2)), this)).b().booleanValue()) {
                                    return n.o;
                                }
                            }
                        }
                        return n.p;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 3536286:
                    if (str.equals(str3)) {
                        a4.M(str3, 1, arrayList);
                        if (this.r() >= 2) {
                            List listP = this.p();
                            if (!arrayList.isEmpty()) {
                                nVarC11 = ((t) nVar.e).c(nVar, (n) arrayList.get(0));
                                if (nVarC11 instanceof h) {
                                    throw new IllegalArgumentException("Comparator should be a method");
                                }
                                hVar = (h) nVarC11;
                            }
                            Collections.sort(listP, new u(hVar, nVar));
                            treeMap.clear();
                            arrayList2 = (ArrayList) listP;
                            size4 = arrayList2.size();
                            i7 = 0;
                            i8 = 0;
                            while (i7 < size4) {
                                Object obj6 = arrayList2.get(i7);
                                i7++;
                                this.t(i8, (n) obj6);
                                i8++;
                            }
                        }
                        return this;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 96891675:
                    if (str.equals("every")) {
                        a4.K("every", arrayList, 1);
                        nVarC12 = ((t) nVar.e).c(nVar, (n) arrayList.get(0));
                        if (nVarC12 instanceof m) {
                            throw new IllegalArgumentException("Callback should be a method");
                        }
                        if (this.r() != 0) {
                            break;
                        }
                        return n.o;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 109407362:
                    if (str.equals("shift")) {
                        a4.K("shift", arrayList, 0);
                        if (this.r() != 0) {
                            n nVarS2 = this.s(0);
                            this.v(0);
                            return nVarS2;
                        }
                        return nVarC;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 109526418:
                    if (str.equals("slice")) {
                        a4.M("slice", 2, arrayList);
                        if (arrayList.isEmpty()) {
                            return this.o();
                        }
                        dR2 = this.r();
                        dR3 = a4.R(((t) nVar.e).c(nVar, (n) arrayList.get(0)).c().doubleValue());
                        if (dR3 < 0.0d) {
                            dMin = Math.max(dR3 + dR2, 0.0d);
                        } else {
                            dMin = Math.min(dR3, dR2);
                        }
                        if (arrayList.size() == 2) {
                            dR4 = a4.R(((t) nVar.e).c(nVar, (n) arrayList.get(1)).c().doubleValue());
                            if (dR4 < 0.0d) {
                                dR2 = Math.max(dR2 + dR4, 0.0d);
                            } else {
                                dR2 = Math.min(dR2, dR4);
                            }
                        }
                        dVar7 = new d();
                        for (i9 = (int) dMin; i9 < dR2; i9++) {
                            dVar7.t(dVar7.r(), this.s(i9));
                        }
                        return dVar7;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 965561430:
                    if (str.equals("reduceRight")) {
                        return com.gamericefishpro.space.hj.c.a0(this, nVar, arrayList, false);
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 1099846370:
                    if (str.equals("reverse")) {
                        a4.K("reverse", arrayList, 0);
                        iR7 = this.r();
                        if (iR7 != 0) {
                            for (i10 = 0; i10 < iR7 / 2; i10++) {
                                if (this.u(i10)) {
                                    n nVarS3 = this.s(i10);
                                    this.t(i10, null);
                                    i11 = (iR7 - 1) - i10;
                                    if (this.u(i11)) {
                                        this.t(i10, this.s(i11));
                                    }
                                    this.t(i11, nVarS3);
                                }
                            }
                        }
                        return this;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 1943291465:
                    if (str.equals("indexOf")) {
                        a4.M("indexOf", 2, arrayList);
                        if (!arrayList.isEmpty()) {
                            nVarC = ((t) nVar.e).c(nVar, (n) arrayList.get(0));
                        }
                        n nVar5 = nVarC;
                        if (arrayList.size() > 1) {
                            dR6 = a4.R(((t) nVar.e).c(nVar, (n) arrayList.get(1)).c().doubleValue());
                            if (dR6 >= this.r()) {
                                return new g(dValueOf);
                            }
                            if (dR6 < 0.0d) {
                                dR5 = ((double) this.r()) + dR6;
                            } else {
                                dR5 = dR6;
                            }
                        } else {
                            dR5 = 0.0d;
                        }
                        itQ6 = this.q();
                        while (itQ6.hasNext()) {
                            int iIntValue3 = ((Integer) itQ6.next()).intValue();
                            d2 = iIntValue3;
                            if (d2 < dR5 && a4.P(this.s(iIntValue3), nVar5)) {
                                return new g(Double.valueOf(d2));
                            }
                        }
                        return new g(dValueOf);
                    }
                    throw new IllegalArgumentException("Command not supported");
                default:
                    throw new IllegalArgumentException("Command not supported");
            }
        }
        str2 = "filter";
        obj = "unshift";
        str3 = "sort";
        obj2 = "reduce";
        dValueOf = Double.valueOf(-1.0d);
        iHashCode = str.hashCode();
        TreeMap treeMap5 = this.d;
        nVarC = n.j;
        treeMap = treeMap5;
        hVar = null;
        switch (iHashCode) {
            case -1776922004:
                str4 = str7;
                if (str.equals(str4)) {
                    a4.K(str4, arrayList, 0);
                    return new q(this.w(","));
                }
                throw new IllegalArgumentException("Command not supported");
            case -1354795244:
                if (str.equals("concat")) {
                    dVar = (d) this.o();
                    if (!arrayList.isEmpty()) {
                        size = arrayList.size();
                        i = 0;
                        while (i < size) {
                            Object obj7 = arrayList.get(i);
                            i++;
                            nVarC2 = ((t) nVar.e).c(nVar, (n) obj7);
                            if (!(nVarC2 instanceof f)) {
                                throw new IllegalStateException("Failed evaluation of arguments");
                            }
                            iR = dVar.r();
                            if (nVarC2 instanceof d) {
                                dVar2 = (d) nVarC2;
                                itQ = dVar2.q();
                                while (itQ.hasNext()) {
                                    Integer num4 = (Integer) itQ.next();
                                    dVar.t(num4.intValue() + iR, dVar2.s(num4.intValue()));
                                }
                            } else {
                                dVar.t(iR, nVarC2);
                            }
                        }
                    }
                    return dVar;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1274492040:
                str5 = str2;
                if (str.equals(str5)) {
                    a4.K(str5, arrayList, 1);
                    nVarC3 = ((t) nVar.e).c(nVar, (n) arrayList.get(0));
                    if (nVarC3 instanceof m) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (treeMap.size() == 0) {
                        return new d();
                    }
                    dVar3 = (d) this.o();
                    d dVarC1 = com.gamericefishpro.space.hj.c.c0(this, nVar, (m) nVarC3, null, Boolean.TRUE);
                    dVar4 = new d();
                    itQ2 = dVarC1.q();
                    while (itQ2.hasNext()) {
                        dVar4.t(dVar4.r(), dVar3.s(((Integer) itQ2.next()).intValue()));
                    }
                    return dVar4;
                }
                throw new IllegalArgumentException("Command not supported");
            case -934873754:
                if (str.equals(obj2)) {
                    return com.gamericefishpro.space.hj.c.a0(this, nVar, arrayList, true);
                }
                throw new IllegalArgumentException("Command not supported");
            case -895859076:
                if (str.equals(str9)) {
                    if (arrayList.isEmpty()) {
                        return new d();
                    }
                    n nVar6 = (n) arrayList.get(0);
                    t tVar3 = (t) nVar.e;
                    tVar = (t) nVar.e;
                    iR2 = (int) a4.R(tVar3.c(nVar, nVar6).c().doubleValue());
                    if (iR2 < 0) {
                        iR2 = Math.max(0, this.r() + iR2);
                    } else if (iR2 > this.r()) {
                        iR2 = this.r();
                    }
                    iR3 = this.r();
                    dVar5 = new d();
                    if (arrayList.size() > 1) {
                        iMax = Math.max(0, (int) a4.R(tVar.c(nVar, (n) arrayList.get(1)).c().doubleValue()));
                        if (iMax > 0) {
                            while (i4 < Math.min(iR3, iR2 + iMax)) {
                                dVar5.t(dVar5.r(), this.s(iR2));
                                this.v(iR2);
                            }
                        }
                        i2 = 2;
                        if (arrayList.size() > 2) {
                            while (i2 < arrayList.size()) {
                                nVarC4 = tVar.c(nVar, (n) arrayList.get(i2));
                                if (!(nVarC4 instanceof f)) {
                                    throw new IllegalArgumentException("Failed to parse elements to add");
                                }
                                i3 = (iR2 + i2) - 2;
                                if (i3 >= 0) {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 21);
                                    sb2.append("Invalid value index: ");
                                    sb2.append(i3);
                                    throw new IllegalArgumentException(sb2.toString());
                                }
                                if (i3 >= this.r()) {
                                    this.t(i3, nVarC4);
                                    treeMap2 = treeMap;
                                } else {
                                    iIntValue = ((Integer) treeMap.lastKey()).intValue();
                                    while (iIntValue >= i3) {
                                        numValueOf = Integer.valueOf(iIntValue);
                                        treeMap3 = treeMap;
                                        nVar2 = (n) treeMap3.get(numValueOf);
                                        if (nVar2 != null) {
                                            this.t(iIntValue + 1, nVar2);
                                            treeMap3.remove(numValueOf);
                                        }
                                        iIntValue--;
                                        treeMap = treeMap3;
                                    }
                                    treeMap2 = treeMap;
                                    this.t(i3, nVarC4);
                                }
                                i2++;
                                treeMap = treeMap2;
                            }
                        }
                    } else {
                        while (iR2 < iR3) {
                            dVar5.t(dVar5.r(), this.s(iR2));
                            this.t(iR2, null);
                            iR2++;
                        }
                    }
                    return dVar5;
                }
                throw new IllegalArgumentException("Command not supported");
            case -678635926:
                str6 = str8;
                if (str.equals(str6)) {
                    a4.K(str6, arrayList, 1);
                    nVarC5 = ((t) nVar.e).c(nVar, (n) arrayList.get(0));
                    if (nVarC5 instanceof m) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (treeMap.size() != 0) {
                        com.gamericefishpro.space.hj.c.c0(this, nVar, (m) nVarC5, null, null);
                        return nVarC;
                    }
                    return nVarC;
                }
                throw new IllegalArgumentException("Command not supported");
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    a4.M("lastIndexOf", 2, arrayList);
                    if (!arrayList.isEmpty()) {
                        nVarC = ((t) nVar.e).c(nVar, (n) arrayList.get(0));
                    }
                    n nVar7 = nVarC;
                    iR4 = this.r() - 1;
                    if (arrayList.size() > 1) {
                        nVarC6 = ((t) nVar.e).c(nVar, (n) arrayList.get(1));
                        if (Double.isNaN(nVarC6.c().doubleValue())) {
                            dR = this.r() - 1;
                        } else {
                            dR = a4.R(nVarC6.c().doubleValue());
                        }
                        d = 0.0d;
                        if (dR < 0.0d) {
                            dR += (double) this.r();
                        }
                    } else {
                        d = 0.0d;
                        dR = iR4;
                    }
                    if (dR < d) {
                        return new g(dValueOf);
                    }
                    while (iMin >= 0) {
                        if (!this.u(iMin)) {
                        }
                    }
                    return new g(dValueOf);
                }
                throw new IllegalArgumentException("Command not supported");
            case -277637751:
                if (str.equals(obj)) {
                    if (!arrayList.isEmpty()) {
                        dVar6 = new d();
                        size2 = arrayList.size();
                        i5 = 0;
                        while (i5 < size2) {
                            Object obj8 = arrayList.get(i5);
                            i5++;
                            nVarC7 = ((t) nVar.e).c(nVar, (n) obj8);
                            if (!(nVarC7 instanceof f)) {
                                throw new IllegalStateException("Argument evaluation failed");
                            }
                            dVar6.t(dVar6.r(), nVarC7);
                        }
                        iR5 = dVar6.r();
                        itQ3 = this.q();
                        while (itQ3.hasNext()) {
                            Integer num5 = (Integer) itQ3.next();
                            dVar6.t(num5.intValue() + iR5, this.s(num5.intValue()));
                        }
                        treeMap.clear();
                        itQ4 = dVar6.q();
                        while (itQ4.hasNext()) {
                            Integer num6 = (Integer) itQ4.next();
                            this.t(num6.intValue(), dVar6.s(num6.intValue()));
                        }
                    }
                    return new g(Double.valueOf(this.r()));
                }
                throw new IllegalArgumentException("Command not supported");
            case 107868:
                if (str.equals("map")) {
                    a4.K("map", arrayList, 1);
                    nVarC8 = ((t) nVar.e).c(nVar, (n) arrayList.get(0));
                    if (nVarC8 instanceof m) {
                        if (this.r() == 0) {
                        }
                    }
                    throw new IllegalArgumentException("Callback should be a method");
                }
                throw new IllegalArgumentException("Command not supported");
            case 111185:
                if (str.equals("pop")) {
                    a4.K("pop", arrayList, 0);
                    iR6 = this.r();
                    if (iR6 != 0) {
                        int i13 = iR6 - 1;
                        n nVarS4 = this.s(i13);
                        this.v(i13);
                        return nVarS4;
                    }
                    return nVarC;
                }
                throw new IllegalArgumentException("Command not supported");
            case 3267882:
                if (str.equals("join")) {
                    a4.M("join", 1, arrayList);
                    if (this.r() == 0) {
                        return n.q;
                    }
                    if (arrayList.isEmpty()) {
                        nVarC9 = ((t) nVar.e).c(nVar, (n) arrayList.get(0));
                        if (nVarC9 instanceof l) {
                            strM = "";
                        } else {
                            strM = "";
                        }
                    } else {
                        strM = ",";
                    }
                    return new q(this.w(strM));
                }
                throw new IllegalArgumentException("Command not supported");
            case 3452698:
                if (str.equals("push")) {
                    if (!arrayList.isEmpty()) {
                        size3 = arrayList.size();
                        i6 = 0;
                        while (i6 < size3) {
                            Object obj9 = arrayList.get(i6);
                            i6++;
                            this.t(this.r(), ((t) nVar.e).c(nVar, (n) obj9));
                        }
                    }
                    return new g(Double.valueOf(this.r()));
                }
                throw new IllegalArgumentException("Command not supported");
            case 3536116:
                if (str.equals("some")) {
                    a4.K("some", arrayList, 1);
                    nVarC10 = ((t) nVar.e).c(nVar, (n) arrayList.get(0));
                    if (nVarC10 instanceof h) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (this.r() != 0) {
                        h hVar3 = (h) nVarC10;
                        itQ5 = this.q();
                        while (itQ5.hasNext()) {
                            iIntValue2 = ((Integer) itQ5.next()).intValue();
                            if (!this.u(iIntValue2)) {
                            }
                        }
                    }
                    return n.p;
                }
                throw new IllegalArgumentException("Command not supported");
            case 3536286:
                if (str.equals(str3)) {
                    a4.M(str3, 1, arrayList);
                    if (this.r() >= 2) {
                        List listP2 = this.p();
                        if (!arrayList.isEmpty()) {
                            nVarC11 = ((t) nVar.e).c(nVar, (n) arrayList.get(0));
                            if (nVarC11 instanceof h) {
                                throw new IllegalArgumentException("Comparator should be a method");
                            }
                            hVar = (h) nVarC11;
                        }
                        Collections.sort(listP2, new u(hVar, nVar));
                        treeMap.clear();
                        arrayList2 = (ArrayList) listP2;
                        size4 = arrayList2.size();
                        i7 = 0;
                        i8 = 0;
                        while (i7 < size4) {
                            Object obj10 = arrayList2.get(i7);
                            i7++;
                            this.t(i8, (n) obj10);
                            i8++;
                        }
                    }
                    return this;
                }
                throw new IllegalArgumentException("Command not supported");
            case 96891675:
                if (str.equals("every")) {
                    a4.K("every", arrayList, 1);
                    nVarC12 = ((t) nVar.e).c(nVar, (n) arrayList.get(0));
                    if (nVarC12 instanceof m) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (this.r() != 0) {
                        break;
                    }
                    return n.o;
                }
                throw new IllegalArgumentException("Command not supported");
            case 109407362:
                if (str.equals("shift")) {
                    a4.K("shift", arrayList, 0);
                    if (this.r() != 0) {
                        n nVarS5 = this.s(0);
                        this.v(0);
                        return nVarS5;
                    }
                    return nVarC;
                }
                throw new IllegalArgumentException("Command not supported");
            case 109526418:
                if (str.equals("slice")) {
                    a4.M("slice", 2, arrayList);
                    if (arrayList.isEmpty()) {
                        return this.o();
                    }
                    dR2 = this.r();
                    dR3 = a4.R(((t) nVar.e).c(nVar, (n) arrayList.get(0)).c().doubleValue());
                    if (dR3 < 0.0d) {
                        dMin = Math.max(dR3 + dR2, 0.0d);
                    } else {
                        dMin = Math.min(dR3, dR2);
                    }
                    if (arrayList.size() == 2) {
                        dR4 = a4.R(((t) nVar.e).c(nVar, (n) arrayList.get(1)).c().doubleValue());
                        if (dR4 < 0.0d) {
                            dR2 = Math.max(dR2 + dR4, 0.0d);
                        } else {
                            dR2 = Math.min(dR2, dR4);
                        }
                    }
                    dVar7 = new d();
                    while (i9 < dR2) {
                        dVar7.t(dVar7.r(), this.s(i9));
                    }
                    return dVar7;
                }
                throw new IllegalArgumentException("Command not supported");
            case 965561430:
                if (str.equals("reduceRight")) {
                    return com.gamericefishpro.space.hj.c.a0(this, nVar, arrayList, false);
                }
                throw new IllegalArgumentException("Command not supported");
            case 1099846370:
                if (str.equals("reverse")) {
                    a4.K("reverse", arrayList, 0);
                    iR7 = this.r();
                    if (iR7 != 0) {
                        while (i10 < iR7 / 2) {
                            if (this.u(i10)) {
                                n nVarS6 = this.s(i10);
                                this.t(i10, null);
                                i11 = (iR7 - 1) - i10;
                                if (this.u(i11)) {
                                    this.t(i10, this.s(i11));
                                }
                                this.t(i11, nVarS6);
                            }
                        }
                    }
                    return this;
                }
                throw new IllegalArgumentException("Command not supported");
            case 1943291465:
                if (str.equals("indexOf")) {
                    a4.M("indexOf", 2, arrayList);
                    if (!arrayList.isEmpty()) {
                        nVarC = ((t) nVar.e).c(nVar, (n) arrayList.get(0));
                    }
                    n nVar8 = nVarC;
                    if (arrayList.size() > 1) {
                        dR6 = a4.R(((t) nVar.e).c(nVar, (n) arrayList.get(1)).c().doubleValue());
                        if (dR6 >= this.r()) {
                            return new g(dValueOf);
                        }
                        if (dR6 < 0.0d) {
                            dR5 = ((double) this.r()) + dR6;
                        } else {
                            dR5 = dR6;
                        }
                    } else {
                        dR5 = 0.0d;
                    }
                    itQ6 = this.q();
                    while (itQ6.hasNext()) {
                        int iIntValue4 = ((Integer) itQ6.next()).intValue();
                        d2 = iIntValue4;
                        if (d2 < dR5) {
                        }
                    }
                    return new g(dValueOf);
                }
                throw new IllegalArgumentException("Command not supported");
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    @Override // com.gamericefishpro.space.i9.n
    public final String m() {
        return w(",");
    }

    @Override // com.gamericefishpro.space.i9.j
    public final void n(String str, n nVar) {
        TreeMap treeMap = this.e;
        if (nVar == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, nVar);
        }
    }

    @Override // com.gamericefishpro.space.i9.n
    public final n o() {
        d dVar = new d();
        for (Map.Entry entry : this.d.entrySet()) {
            boolean z = entry.getValue() instanceof j;
            TreeMap treeMap = dVar.d;
            if (z) {
                treeMap.put((Integer) entry.getKey(), (n) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((n) entry.getValue()).o());
            }
        }
        return dVar;
    }

    public final List p() {
        ArrayList arrayList = new ArrayList(r());
        for (int i = 0; i < r(); i++) {
            arrayList.add(s(i));
        }
        return arrayList;
    }

    public final Iterator q() {
        return this.d.keySet().iterator();
    }

    public final int r() {
        TreeMap treeMap = this.d;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final n s(int i) {
        n nVar;
        if (i < r()) {
            return (!u(i) || (nVar = (n) this.d.get(Integer.valueOf(i))) == null) ? n.j : nVar;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final void t(int i, n nVar) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
            sb.append("Out of bounds index: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        TreeMap treeMap = this.d;
        if (nVar == null) {
            treeMap.remove(Integer.valueOf(i));
        } else {
            treeMap.put(Integer.valueOf(i), nVar);
        }
    }

    public final String toString() {
        return w(",");
    }

    public final boolean u(int i) {
        if (i >= 0) {
            TreeMap treeMap = this.d;
            if (i <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i));
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
        sb.append("Out of bounds index: ");
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final void v(int i) {
        TreeMap treeMap = this.d;
        int iIntValue = ((Integer) treeMap.lastKey()).intValue();
        if (i > iIntValue || i < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i));
        if (i == iIntValue) {
            int i2 = i - 1;
            Integer numValueOf = Integer.valueOf(i2);
            if (treeMap.containsKey(numValueOf) || i2 < 0) {
                return;
            }
            treeMap.put(numValueOf, n.j);
            return;
        }
        while (true) {
            i++;
            if (i > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            Integer numValueOf2 = Integer.valueOf(i);
            n nVar = (n) treeMap.get(numValueOf2);
            if (nVar != null) {
                treeMap.put(Integer.valueOf(i - 1), nVar);
                treeMap.remove(numValueOf2);
            }
        }
    }

    public final String w(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.d.isEmpty()) {
            int i = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i >= r()) {
                    break;
                }
                n nVarS = s(i);
                sb.append(str2);
                if (!(nVarS instanceof r) && !(nVarS instanceof l)) {
                    sb.append(nVarS.m());
                }
                i++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    public d(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                t(i, (n) list.get(i));
            }
        }
    }
}
