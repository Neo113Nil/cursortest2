package com.gamericefishpro.space.n9;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.gamericefishpro.space.i9.l5;
import com.gamericefishpro.space.i9.w7;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends g4 {
    public Long A;
    public String v;
    public HashSet w;
    public com.gamericefishpro.space.t.e y;
    public Long z;

    /* JADX WARN: Code duplicated, block: B:102:0x0242 A[LOOP:20: B:85:0x01f2->B:102:0x0242, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x0274  */
    /* JADX WARN: Code duplicated, block: B:121:0x027e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0289  */
    /* JADX WARN: Code duplicated, block: B:125:0x0294  */
    /* JADX WARN: Code duplicated, block: B:131:0x02c2 A[Catch: all -> 0x02dd, SQLiteException -> 0x02df, LOOP:11: B:131:0x02c2->B:568:?, LOOP_START, TryCatch #4 {SQLiteException -> 0x02df, blocks: (B:129:0x02bc, B:131:0x02c2, B:133:0x02d3, B:139:0x02e1, B:142:0x02f6), top: B:478:0x02bc }] */
    /* JADX WARN: Code duplicated, block: B:133:0x02d3 A[Catch: all -> 0x02dd, SQLiteException -> 0x02df, TryCatch #4 {SQLiteException -> 0x02df, blocks: (B:129:0x02bc, B:131:0x02c2, B:133:0x02d3, B:139:0x02e1, B:142:0x02f6), top: B:478:0x02bc }] */
    /* JADX WARN: Code duplicated, block: B:142:0x02f6 A[Catch: all -> 0x02dd, SQLiteException -> 0x02df, TRY_ENTER, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x02df, blocks: (B:129:0x02bc, B:131:0x02c2, B:133:0x02d3, B:139:0x02e1, B:142:0x02f6), top: B:478:0x02bc }] */
    /* JADX WARN: Code duplicated, block: B:159:0x0335  */
    /* JADX WARN: Code duplicated, block: B:162:0x0343  */
    /* JADX WARN: Code duplicated, block: B:164:0x035a  */
    /* JADX WARN: Code duplicated, block: B:190:0x0455  */
    /* JADX WARN: Code duplicated, block: B:194:0x0466  */
    /* JADX WARN: Code duplicated, block: B:196:0x0486  */
    /* JADX WARN: Code duplicated, block: B:202:0x049d  */
    /* JADX WARN: Code duplicated, block: B:206:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:207:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:211:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:217:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:223:0x051d  */
    /* JADX WARN: Code duplicated, block: B:226:0x0526  */
    /* JADX WARN: Code duplicated, block: B:228:0x0532  */
    /* JADX WARN: Code duplicated, block: B:230:0x0554  */
    /* JADX WARN: Code duplicated, block: B:231:0x0558  */
    /* JADX WARN: Code duplicated, block: B:236:0x0571 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:247:0x0590  */
    /* JADX WARN: Code duplicated, block: B:249:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:252:0x05be  */
    /* JADX WARN: Code duplicated, block: B:255:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:262:0x060d  */
    /* JADX WARN: Code duplicated, block: B:265:0x0621  */
    /* JADX WARN: Code duplicated, block: B:271:0x0654  */
    /* JADX WARN: Code duplicated, block: B:275:0x0695  */
    /* JADX WARN: Code duplicated, block: B:282:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:288:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:299:0x06f9 A[LOOP:3: B:276:0x0697->B:299:0x06f9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:300:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:315:0x072c  */
    /* JADX WARN: Code duplicated, block: B:320:0x0737  */
    /* JADX WARN: Code duplicated, block: B:322:0x073b  */
    /* JADX WARN: Code duplicated, block: B:326:0x074d  */
    /* JADX WARN: Code duplicated, block: B:332:0x077c  */
    /* JADX WARN: Code duplicated, block: B:334:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:336:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:339:0x07bf A[LOOP:5: B:330:0x0776->B:339:0x07bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:343:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:346:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:349:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:352:0x07fd  */
    /* JADX WARN: Code duplicated, block: B:354:0x0810  */
    /* JADX WARN: Code duplicated, block: B:358:0x084b  */
    /* JADX WARN: Code duplicated, block: B:365:0x0873  */
    /* JADX WARN: Code duplicated, block: B:371:0x0884  */
    /* JADX WARN: Code duplicated, block: B:382:0x08b3 A[LOOP:7: B:359:0x084d->B:382:0x08b3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:385:0x08ba  */
    /* JADX WARN: Code duplicated, block: B:400:0x08ee  */
    /* JADX WARN: Code duplicated, block: B:404:0x08f8  */
    /* JADX WARN: Code duplicated, block: B:406:0x08fc  */
    /* JADX WARN: Code duplicated, block: B:410:0x090c  */
    /* JADX WARN: Code duplicated, block: B:414:0x092d  */
    /* JADX WARN: Code duplicated, block: B:417:0x093e  */
    /* JADX WARN: Code duplicated, block: B:419:0x0955  */
    /* JADX WARN: Code duplicated, block: B:421:0x0963  */
    /* JADX WARN: Code duplicated, block: B:423:0x096e  */
    /* JADX WARN: Code duplicated, block: B:425:0x0999  */
    /* JADX WARN: Code duplicated, block: B:428:0x09a3  */
    /* JADX WARN: Code duplicated, block: B:441:0x0a0e  */
    /* JADX WARN: Code duplicated, block: B:442:0x0a17  */
    /* JADX WARN: Code duplicated, block: B:446:0x0a2a A[PHI: r16 r20 r21
      0x0a2a: PHI (r16v2 java.util.Map) = (r16v3 java.util.Map), (r16v4 java.util.Map) binds: [B:445:0x0a28, B:443:0x0a18] A[DONT_GENERATE, DONT_INLINE]
      0x0a2a: PHI (r20v5 com.gamericefishpro.space.t.r0) = (r20v6 com.gamericefishpro.space.t.r0), (r2v41 com.gamericefishpro.space.t.r0) binds: [B:445:0x0a28, B:443:0x0a18] A[DONT_GENERATE, DONT_INLINE]
      0x0a2a: PHI (r21v20 java.util.Iterator) = (r21v21 java.util.Iterator), (r3v56 java.util.Iterator) binds: [B:445:0x0a28, B:443:0x0a18] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:451:0x0a53  */
    /* JADX WARN: Code duplicated, block: B:464:0x0ad9  */
    /* JADX WARN: Code duplicated, block: B:467:0x0ae1  */
    /* JADX WARN: Code duplicated, block: B:536:0x062f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:0x0646 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:0x061b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:540:0x061b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:0x06f4 A[EDGE_INSN: B:542:0x06f4->B:298:0x06f4 BREAK  A[LOOP:3: B:276:0x0697->B:299:0x06f9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:0x076b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:0x075f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:0x07cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:0x07d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:0x08ae A[EDGE_INSN: B:553:0x08ae->B:381:0x08ae BREAK  A[LOOP:7: B:359:0x084d->B:382:0x08b3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:0x091e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:0x0a2f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:0x0a22 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:0x09fa A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:562:0x0aaf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:0x0a4d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:0x04a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:0x0497 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:0x04f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:579:0x04e1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:0x05d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:590:0x0360 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:604:0x023e A[EDGE_INSN: B:604:0x023e->B:101:0x023e BREAK  A[LOOP:20: B:85:0x01f2->B:102:0x0242], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x018e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0195  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d1 A[Catch: all -> 0x01dd, SQLiteException -> 0x01e0, TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x01e0, blocks: (B:72:0x01cb, B:74:0x01d1, B:83:0x01eb), top: B:476:0x01cb }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01eb A[Catch: all -> 0x01dd, SQLiteException -> 0x01e0, TRY_ENTER, TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x01e0, blocks: (B:72:0x01cb, B:74:0x01d1, B:83:0x01eb), top: B:476:0x01cb }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v202 */
    /* JADX WARN: Type inference failed for: r0v203 */
    /* JADX WARN: Type inference failed for: r0v31, types: [com.gamericefishpro.space.t.e, com.gamericefishpro.space.t.r0] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v20, types: [com.gamericefishpro.space.t.e, com.gamericefishpro.space.t.r0] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2, types: [com.gamericefishpro.space.n9.r1] */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v22 */
    /* JADX WARN: Type inference failed for: r17v23 */
    /* JADX WARN: Type inference failed for: r17v24, types: [com.gamericefishpro.space.n9.r1] */
    /* JADX WARN: Type inference failed for: r17v30 */
    /* JADX WARN: Type inference failed for: r17v31 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v14 */
    /* JADX WARN: Type inference failed for: r18v16 */
    /* JADX WARN: Type inference failed for: r18v17 */
    /* JADX WARN: Type inference failed for: r18v18 */
    /* JADX WARN: Type inference failed for: r18v19 */
    /* JADX WARN: Type inference failed for: r18v20, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r18v24 */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r18v26 */
    /* JADX WARN: Type inference failed for: r18v27 */
    /* JADX WARN: Type inference failed for: r18v28 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v30 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v69, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r3v69, types: [com.gamericefishpro.space.n9.t0] */
    /* JADX WARN: Type inference failed for: r3v83, types: [com.gamericefishpro.space.n9.t0] */
    /* JADX WARN: Type inference failed for: r42v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r42v10 */
    /* JADX WARN: Type inference failed for: r42v11, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r42v12 */
    /* JADX WARN: Type inference failed for: r42v13 */
    /* JADX WARN: Type inference failed for: r42v14 */
    /* JADX WARN: Type inference failed for: r42v15 */
    /* JADX WARN: Type inference failed for: r42v16, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r42v17 */
    /* JADX WARN: Type inference failed for: r42v18 */
    /* JADX WARN: Type inference failed for: r42v19 */
    /* JADX WARN: Type inference failed for: r42v2 */
    /* JADX WARN: Type inference failed for: r42v20 */
    /* JADX WARN: Type inference failed for: r42v21 */
    /* JADX WARN: Type inference failed for: r42v22 */
    /* JADX WARN: Type inference failed for: r42v23 */
    /* JADX WARN: Type inference failed for: r42v24 */
    /* JADX WARN: Type inference failed for: r42v25 */
    /* JADX WARN: Type inference failed for: r42v26 */
    /* JADX WARN: Type inference failed for: r42v27 */
    /* JADX WARN: Type inference failed for: r42v28 */
    /* JADX WARN: Type inference failed for: r42v29 */
    /* JADX WARN: Type inference failed for: r42v3 */
    /* JADX WARN: Type inference failed for: r42v30 */
    /* JADX WARN: Type inference failed for: r42v31 */
    /* JADX WARN: Type inference failed for: r42v32 */
    /* JADX WARN: Type inference failed for: r42v33 */
    /* JADX WARN: Type inference failed for: r42v4 */
    /* JADX WARN: Type inference failed for: r42v5 */
    /* JADX WARN: Type inference failed for: r42v6 */
    /* JADX WARN: Type inference failed for: r42v7 */
    /* JADX WARN: Type inference failed for: r42v8 */
    /* JADX WARN: Type inference failed for: r42v9 */
    /* JADX WARN: Type inference failed for: r4v31, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v59, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v64 */
    /* JADX WARN: Type inference failed for: r7v65 */
    /* JADX WARN: Type inference failed for: r7v66, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v67, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v68, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v69 */
    /* JADX WARN: Type inference failed for: r7v70 */
    /* JADX WARN: Type inference failed for: r7v71 */
    /* JADX WARN: Type inference failed for: r7v72 */
    /* JADX WARN: Type inference failed for: r7v73, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v75 */
    /* JADX WARN: Type inference failed for: r7v80 */
    /* JADX WARN: Type inference failed for: r7v81 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final ArrayList v(String str, List list, List list2, Long l, Long l2, boolean z) throws Throwable {
        boolean z2;
        boolean z3;
        String str2;
        Map map;
        Object obj;
        ?? r5;
        Cursor cursorQuery;
        ?? r17;
        String str3;
        Object obj2;
        ?? r21;
        Map map2;
        String str4;
        r1 r1Var;
        Map map3;
        Map map4;
        Map map5;
        String str5;
        com.gamericefishpro.space.i9.l3 l3Var;
        BitSet bitSet;
        BitSet bitSet2;
        com.gamericefishpro.space.t.e eVar;
        com.gamericefishpro.space.i9.l3 l3Var2;
        com.gamericefishpro.space.t.e eVar2;
        List<com.gamericefishpro.space.i9.n1> list3;
        long jLongValue;
        Integer numValueOf;
        int i;
        boolean z4;
        Iterator it;
        com.gamericefishpro.space.i9.n3 n3Var;
        Long lValueOf;
        m mVarF0;
        String str6;
        ?? eVar3;
        ?? r7;
        Cursor cursorRawQuery;
        ?? r0;
        com.gamericefishpro.space.t.e eVar4;
        Iterator it2;
        Integer num;
        com.gamericefishpro.space.i9.l3 l3Var3;
        List list4;
        ?? r18;
        Iterator it3;
        r1 r1Var2;
        Integer numValueOf2;
        List arrayList;
        String str7;
        ArrayList arrayList2;
        m mVarF1;
        r1 r1Var3;
        String str8;
        ContentValues contentValues;
        Iterator it4;
        com.gamericefishpro.space.t.r0 r0Var;
        String strR;
        Map map6;
        Iterator it5;
        Iterator it6;
        com.gamericefishpro.space.t.r0 r0Var2;
        Integer num2;
        int iIntValue;
        Iterator it7;
        boolean zB;
        com.gamericefishpro.space.t.r0 r0Var3;
        Map map7;
        com.gamericefishpro.space.i9.u1 u1Var;
        Integer numValueOf3;
        b bVar;
        int i2;
        Integer numValueOf4;
        r1 r1Var4;
        String str9;
        com.gamericefishpro.space.t.e eVar5;
        Cursor cursor;
        r1 r1Var5;
        String str10;
        Cursor cursorQuery2;
        Integer numValueOf5;
        List list5;
        List arrayList3;
        w0 w0Var;
        ?? eVar6;
        com.gamericefishpro.space.i9.a3 a3VarA;
        r rVarX;
        long j;
        String strS;
        Map map8;
        int iIntValue2;
        Iterator it8;
        boolean zA;
        Map map9;
        w0 w0Var2;
        Integer num3;
        b bVar2;
        int iQ;
        v4 v4Var;
        boolean z5;
        String str11;
        com.gamericefishpro.space.t.e eVar7;
        ?? r8;
        String str12;
        ?? r2;
        ?? r42;
        ?? r43;
        ?? Query;
        ?? r44;
        ?? r45;
        ?? r46;
        ?? r47;
        Integer numValueOf6;
        List list6;
        ?? r48;
        List arrayList4;
        com.gamericefishpro.space.t.e eVar8;
        int i3;
        ?? r6;
        Object obj3;
        ?? r9;
        ?? r19;
        ?? r110;
        List arrayList5;
        r1 r1Var6 = (r1) this.d;
        com.gamericefishpro.space.v8.c0.d(str);
        com.gamericefishpro.space.v8.c0.g(list);
        com.gamericefishpro.space.v8.c0.g(list2);
        this.v = str;
        this.w = new HashSet();
        this.y = new com.gamericefishpro.space.t.e();
        this.z = l;
        this.A = l2;
        Iterator it9 = list.iterator();
        while (true) {
            if (!it9.hasNext()) {
                z2 = false;
                break;
            }
            if ("_s".equals(((com.gamericefishpro.space.i9.a3) it9.next()).s())) {
                z2 = true;
                break;
            }
        }
        w7.a();
        boolean zB2 = r1Var6.v.B(this.v, e0.F0);
        w7.a();
        boolean zB3 = r1Var6.v.B(this.v, e0.E0);
        m4 m4Var = this.e;
        if (z2) {
            m mVarF2 = m4Var.f0();
            String str13 = this.v;
            mVarF2.s();
            mVarF2.r();
            com.gamericefishpro.space.v8.c0.d(str13);
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("current_session_count", (Integer) 0);
            try {
                mVarF2.g0().update("events", contentValues2, "app_id = ?", new String[]{str13});
            } catch (SQLiteException e) {
                ((r1) mVarF2.d).a().v().c("Error resetting session-scoped event counts. appId", v0.z(str13), e);
            }
        }
        Map map10 = Collections.EMPTY_MAP;
        String str14 = "Failed to merge filter. appId";
        Object objZ = "Database error querying filters. appId";
        String str15 = "audience_id";
        try {
            try {
                try {
                    if (zB3 && zB2) {
                        m mVarF3 = m4Var.f0();
                        r1 r1Var7 = (r1) mVarF3.d;
                        String str16 = this.v;
                        com.gamericefishpro.space.v8.c0.d(str16);
                        z3 = z2;
                        com.gamericefishpro.space.t.e eVar9 = new com.gamericefishpro.space.t.e();
                        try {
                            ?? Query2 = mVarF3.g0().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str16}, null, null, null);
                            try {
                                try {
                                    if (Query2.moveToFirst()) {
                                        str2 = "data";
                                        Query2 = Query2;
                                        ?? r111 = "event_filters";
                                        while (true) {
                                            try {
                                                try {
                                                    com.gamericefishpro.space.i9.n1 n1Var = (com.gamericefishpro.space.i9.n1) ((com.gamericefishpro.space.i9.m1) z0.e0(com.gamericefishpro.space.i9.n1.B(), Query2.getBlob(1))).e();
                                                    if (n1Var.v()) {
                                                        Integer numValueOf7 = Integer.valueOf(Query2.getInt(0));
                                                        List list7 = (List) eVar9.get(numValueOf7);
                                                        if (list7 == null) {
                                                            arrayList5 = new ArrayList();
                                                            eVar9.put(numValueOf7, arrayList5);
                                                        } else {
                                                            arrayList5 = list7;
                                                        }
                                                        arrayList5.add(n1Var);
                                                        r111 = Query2;
                                                    } else {
                                                        r111 = Query2;
                                                    }
                                                } catch (IOException e2) {
                                                    r111 = Query2;
                                                    r1Var7.a().v().c("Failed to merge filter. appId", v0.z(str16), e2);
                                                }
                                                try {
                                                    if (!r111.moveToNext()) {
                                                        break;
                                                    }
                                                    Query2 = r111;
                                                    r111 = r111;
                                                } catch (SQLiteException e3) {
                                                    e = e3;
                                                    r110 = r111;
                                                    r9 = r110;
                                                    try {
                                                        r1Var7.a().v().c("Database error querying filters. appId", v0.z(str16), e);
                                                        map10 = Collections.EMPTY_MAP;
                                                        if (r9 != 0) {
                                                            r9.close();
                                                        }
                                                        map = map10;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        if (r9 != 0) {
                                                            r9.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    r19 = r111;
                                                    r9 = r19;
                                                    if (r9 != 0) {
                                                        r9.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (SQLiteException e4) {
                                                e = e4;
                                                r110 = Query2;
                                                r9 = r110;
                                                r1Var7.a().v().c("Database error querying filters. appId", v0.z(str16), e);
                                                map10 = Collections.EMPTY_MAP;
                                                if (r9 != 0) {
                                                    r9.close();
                                                }
                                                map = map10;
                                                m mVarF4 = m4Var.f0();
                                                obj = (r1) mVarF4.d;
                                                r5 = this.v;
                                                mVarF4.s();
                                                mVarF4.r();
                                                com.gamericefishpro.space.v8.c0.d(r5);
                                                cursorQuery = mVarF4.g0().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r5}, null, null, null);
                                                if (cursorQuery.moveToFirst()) {
                                                    eVar8 = new com.gamericefishpro.space.t.e();
                                                    r17 = obj;
                                                    r21 = r5;
                                                    while (true) {
                                                        try {
                                                            i3 = cursorQuery.getInt(0);
                                                            try {
                                                                com.gamericefishpro.space.i9.l3 l3Var4 = (com.gamericefishpro.space.i9.l3) ((com.gamericefishpro.space.i9.k3) z0.e0(com.gamericefishpro.space.i9.l3.x(), cursorQuery.getBlob(1))).e();
                                                                Object objValueOf = Integer.valueOf(i3);
                                                                eVar8.put(objValueOf, l3Var4);
                                                                str3 = str14;
                                                                obj2 = objZ;
                                                                obj3 = objValueOf;
                                                                r6 = r21;
                                                            } catch (IOException e5) {
                                                                t0 t0VarV = r17.a().v();
                                                                str3 = str14;
                                                                str14 = "Failed to merge filter results. appId, audienceId, error";
                                                                obj2 = objZ;
                                                                try {
                                                                    objZ = v0.z(r21);
                                                                    Integer numValueOf8 = Integer.valueOf(i3);
                                                                    t0VarV.d("Failed to merge filter results. appId, audienceId, error", objZ, numValueOf8, e5);
                                                                    obj3 = t0VarV;
                                                                    r6 = numValueOf8;
                                                                } catch (SQLiteException e6) {
                                                                    e = e6;
                                                                    r21 = r21;
                                                                    r17.a().v().c("Database error querying filter results. appId", v0.z(r21), e);
                                                                    Map map11 = Collections.EMPTY_MAP;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    map2 = map11;
                                                                    if (map2.isEmpty()) {
                                                                        str5 = "audience_id";
                                                                        r1Var = r1Var6;
                                                                    } else {
                                                                        HashSet<Integer> hashSet = new HashSet(map2.keySet());
                                                                        if (z3) {
                                                                            String str17 = this.v;
                                                                            mVarF0 = m4Var.f0();
                                                                            str6 = this.v;
                                                                            mVarF0.s();
                                                                            mVarF0.r();
                                                                            com.gamericefishpro.space.v8.c0.d(str6);
                                                                            eVar3 = new com.gamericefishpro.space.t.e();
                                                                            try {
                                                                                try {
                                                                                    cursorRawQuery = mVarF0.g0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                                                    try {
                                                                                        if (cursorRawQuery.moveToFirst()) {
                                                                                            do {
                                                                                                numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                                                arrayList = (List) eVar3.get(numValueOf2);
                                                                                                if (arrayList == null) {
                                                                                                    arrayList = new ArrayList();
                                                                                                    eVar3.put(numValueOf2, arrayList);
                                                                                                }
                                                                                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                                            } while (cursorRawQuery.moveToNext());
                                                                                        } else {
                                                                                            eVar3 = Collections.EMPTY_MAP;
                                                                                        }
                                                                                    } catch (SQLiteException e7) {
                                                                                        e = e7;
                                                                                        ((r1) mVarF0.d).a().v().c("Database error querying scoped filters. appId", v0.z(str6), e);
                                                                                        eVar3 = Collections.EMPTY_MAP;
                                                                                        r0 = eVar3;
                                                                                        if (cursorRawQuery != null) {
                                                                                        }
                                                                                        com.gamericefishpro.space.v8.c0.d(str17);
                                                                                        eVar4 = new com.gamericefishpro.space.t.e();
                                                                                        if (!map2.isEmpty()) {
                                                                                            it2 = map2.keySet().iterator();
                                                                                            while (it2.hasNext()) {
                                                                                                num = (Integer) it2.next();
                                                                                                num.getClass();
                                                                                                l3Var3 = (com.gamericefishpro.space.i9.l3) map2.get(num);
                                                                                                list4 = (List) r0.get(num);
                                                                                                if (list4 != null) {
                                                                                                }
                                                                                                r18 = r0;
                                                                                                it3 = it2;
                                                                                                r1Var2 = r1Var6;
                                                                                                eVar4.put(num, l3Var3);
                                                                                                r0 = r18;
                                                                                                str15 = str15;
                                                                                                it2 = it3;
                                                                                                r1Var6 = r1Var2;
                                                                                            }
                                                                                        }
                                                                                        str4 = str15;
                                                                                        r1Var = r1Var6;
                                                                                        map3 = eVar4;
                                                                                        map5 = map3;
                                                                                        map4 = map2;
                                                                                        for (Integer num4 : hashSet) {
                                                                                            num4.getClass();
                                                                                            l3Var = (com.gamericefishpro.space.i9.l3) map5.get(num4);
                                                                                            bitSet = new BitSet();
                                                                                            bitSet2 = new BitSet();
                                                                                            eVar = new com.gamericefishpro.space.t.e();
                                                                                            if (l3Var != null) {
                                                                                                for (com.gamericefishpro.space.i9.y2 y2Var : l3Var.t()) {
                                                                                                    if (y2Var.p()) {
                                                                                                        com.gamericefishpro.space.i9.l3 l3Var5 = l3Var;
                                                                                                        Integer numValueOf9 = Integer.valueOf(y2Var.q());
                                                                                                        if (y2Var.r()) {
                                                                                                            lValueOf = Long.valueOf(y2Var.s());
                                                                                                        } else {
                                                                                                            lValueOf = null;
                                                                                                        }
                                                                                                        eVar.put(numValueOf9, lValueOf);
                                                                                                        l3Var = l3Var5;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            l3Var2 = l3Var;
                                                                                            eVar2 = new com.gamericefishpro.space.t.e();
                                                                                            if (l3Var2 != null) {
                                                                                                it = l3Var2.v().iterator();
                                                                                                while (it.hasNext()) {
                                                                                                    n3Var = (com.gamericefishpro.space.i9.n3) it.next();
                                                                                                    if (!n3Var.p()) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            Map map12 = map5;
                                                                                            if (l3Var2 != null) {
                                                                                                i = 0;
                                                                                                while (i < l3Var2.q() * 64) {
                                                                                                    if (z0.Y((l5) l3Var2.p(), i)) {
                                                                                                        z4 = zB2;
                                                                                                        r1Var.a().y().c("Filter already evaluated. audience ID, filter ID", num4, Integer.valueOf(i));
                                                                                                        bitSet2.set(i);
                                                                                                        if (z0.Y((l5) l3Var2.r(), i)) {
                                                                                                            bitSet.set(i);
                                                                                                        }
                                                                                                        i++;
                                                                                                        zB2 = z4;
                                                                                                    } else {
                                                                                                        z4 = zB2;
                                                                                                    }
                                                                                                    eVar.remove(Integer.valueOf(i));
                                                                                                    i++;
                                                                                                    zB2 = z4;
                                                                                                }
                                                                                            }
                                                                                            boolean z6 = zB2;
                                                                                            com.gamericefishpro.space.i9.l3 l3Var6 = (com.gamericefishpro.space.i9.l3) map4.get(num4);
                                                                                            if (zB3) {
                                                                                                for (com.gamericefishpro.space.i9.n1 n1Var2 : list3) {
                                                                                                    int iQ2 = n1Var2.q();
                                                                                                    Integer num5 = num4;
                                                                                                    jLongValue = this.A.longValue() / 1000;
                                                                                                    if (n1Var2.y()) {
                                                                                                        jLongValue = this.z.longValue() / 1000;
                                                                                                    }
                                                                                                    numValueOf = Integer.valueOf(iQ2);
                                                                                                    if (eVar.containsKey(numValueOf)) {
                                                                                                        eVar.put(numValueOf, Long.valueOf(jLongValue));
                                                                                                    }
                                                                                                    if (eVar2.containsKey(numValueOf)) {
                                                                                                        eVar2.put(numValueOf, Long.valueOf(jLongValue));
                                                                                                    }
                                                                                                    num4 = num5;
                                                                                                }
                                                                                            }
                                                                                            this.y.put(num4, new v4(this, this.v, l3Var6, bitSet, bitSet2, eVar, eVar2));
                                                                                            map = map;
                                                                                            zB2 = z6;
                                                                                            map4 = map4;
                                                                                            zB3 = zB3;
                                                                                            str3 = str3;
                                                                                            map5 = map12;
                                                                                        }
                                                                                        str5 = str4;
                                                                                        str7 = str2;
                                                                                        String str18 = str3;
                                                                                        ?? r10 = obj2;
                                                                                        if (!list.isEmpty()) {
                                                                                            w0Var = new w0(this);
                                                                                            eVar6 = new com.gamericefishpro.space.t.e();
                                                                                            for (com.gamericefishpro.space.i9.a3 a3Var : list) {
                                                                                                a3VarA = w0Var.a(a3Var, this.v);
                                                                                                if (a3VarA != null) {
                                                                                                    rVarX = m4Var.f0().X(this.v, a3Var, a3VarA.s());
                                                                                                    m4Var.f0().Q("events", rVarX);
                                                                                                    if (z) {
                                                                                                        continue;
                                                                                                    } else {
                                                                                                        j = rVarX.c;
                                                                                                        strS = a3VarA.s();
                                                                                                        map8 = (Map) eVar6.get(strS);
                                                                                                        if (map8 == null) {
                                                                                                            m mVarF5 = m4Var.f0();
                                                                                                            r1 r1Var8 = (r1) mVarF5.d;
                                                                                                            str11 = this.v;
                                                                                                            mVarF5.s();
                                                                                                            mVarF5.r();
                                                                                                            com.gamericefishpro.space.v8.c0.d(str11);
                                                                                                            com.gamericefishpro.space.v8.c0.d(strS);
                                                                                                            eVar7 = new com.gamericefishpro.space.t.e();
                                                                                                            try {
                                                                                                                Query = mVarF5.g0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strS}, null, null, null);
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (Query.moveToFirst()) {
                                                                                                                            str12 = str11;
                                                                                                                            Query = Query;
                                                                                                                            r46 = list;
                                                                                                                            while (true) {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        com.gamericefishpro.space.i9.n1 n1Var3 = (com.gamericefishpro.space.i9.n1) ((com.gamericefishpro.space.i9.m1) z0.e0(com.gamericefishpro.space.i9.n1.B(), Query.getBlob(1))).e();
                                                                                                                                        numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                                                                                        list6 = (List) eVar7.get(numValueOf6);
                                                                                                                                        if (list6 == null) {
                                                                                                                                            r46 = Query;
                                                                                                                                            try {
                                                                                                                                                arrayList4 = new ArrayList();
                                                                                                                                                eVar7.put(numValueOf6, arrayList4);
                                                                                                                                                r48 = r46;
                                                                                                                                            } catch (SQLiteException e8) {
                                                                                                                                                e = e8;
                                                                                                                                                r45 = r46;
                                                                                                                                                r2 = r45;
                                                                                                                                                r42 = r45;
                                                                                                                                                try {
                                                                                                                                                    r1Var8.a().v().c(r10, v0.z(str12), e);
                                                                                                                                                    map8 = Collections.EMPTY_MAP;
                                                                                                                                                    r43 = r42;
                                                                                                                                                    if (r2 != 0) {
                                                                                                                                                        r2.close();
                                                                                                                                                        r43 = r42;
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th3) {
                                                                                                                                                    th = th3;
                                                                                                                                                    r8 = r2;
                                                                                                                                                    if (r8 != 0) {
                                                                                                                                                        r8.close();
                                                                                                                                                    }
                                                                                                                                                    throw th;
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th4) {
                                                                                                                                                th = th4;
                                                                                                                                                r44 = r46;
                                                                                                                                                r8 = r44;
                                                                                                                                                if (r8 != 0) {
                                                                                                                                                    r8.close();
                                                                                                                                                }
                                                                                                                                                throw th;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            r48 = Query;
                                                                                                                                            arrayList4 = list6;
                                                                                                                                        }
                                                                                                                                        arrayList4.add(n1Var3);
                                                                                                                                        r47 = r48;
                                                                                                                                    } catch (IOException e9) {
                                                                                                                                        r47 = Query;
                                                                                                                                        r1Var8.a().v().c(str18, v0.z(str12), e9);
                                                                                                                                    }
                                                                                                                                    if (!r47.moveToNext()) {
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    Query = r47;
                                                                                                                                    r46 = r47;
                                                                                                                                } catch (SQLiteException e10) {
                                                                                                                                    e = e10;
                                                                                                                                    r45 = Query;
                                                                                                                                    r2 = r45;
                                                                                                                                    r42 = r45;
                                                                                                                                    r1Var8.a().v().c(r10, v0.z(str12), e);
                                                                                                                                    map8 = Collections.EMPTY_MAP;
                                                                                                                                    r43 = r42;
                                                                                                                                    if (r2 != 0) {
                                                                                                                                        r2.close();
                                                                                                                                        r43 = r42;
                                                                                                                                    }
                                                                                                                                    eVar6.put(strS, map8);
                                                                                                                                    list = r43;
                                                                                                                                    for (Integer num6 : map8.keySet()) {
                                                                                                                                        iIntValue2 = num6.intValue();
                                                                                                                                        if (this.w.contains(num6)) {
                                                                                                                                            r1Var.a().y().b(num6, "Skipping failed audience ID");
                                                                                                                                        } else {
                                                                                                                                            it8 = ((List) map8.get(num6)).iterator();
                                                                                                                                            zA = true;
                                                                                                                                            while (true) {
                                                                                                                                                if (!it8.hasNext()) {
                                                                                                                                                    map9 = map8;
                                                                                                                                                    w0Var2 = w0Var;
                                                                                                                                                    num3 = num6;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                com.gamericefishpro.space.i9.n1 n1Var4 = (com.gamericefishpro.space.i9.n1) it8.next();
                                                                                                                                                w0Var2 = w0Var;
                                                                                                                                                num3 = num6;
                                                                                                                                                map9 = map8;
                                                                                                                                                bVar2 = new b(this, this.v, iIntValue2, n1Var4, 0);
                                                                                                                                                Long l3 = this.z;
                                                                                                                                                Long l4 = this.A;
                                                                                                                                                iQ = n1Var4.q();
                                                                                                                                                v4Var = (v4) this.y.get(num3);
                                                                                                                                                if (v4Var == null) {
                                                                                                                                                    z5 = false;
                                                                                                                                                } else {
                                                                                                                                                    z5 = v4Var.d.get(iQ);
                                                                                                                                                }
                                                                                                                                                zA = bVar2.a(l3, l4, a3VarA, j, rVarX, z5);
                                                                                                                                                if (!zA) {
                                                                                                                                                    this.w.add(num3);
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                w(num3).a(bVar2);
                                                                                                                                                num6 = num3;
                                                                                                                                                map8 = map9;
                                                                                                                                                w0Var = w0Var2;
                                                                                                                                            }
                                                                                                                                            if (!zA) {
                                                                                                                                                this.w.add(num3);
                                                                                                                                            }
                                                                                                                                            w0Var = w0Var2;
                                                                                                                                            map8 = map9;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            r47.close();
                                                                                                                            map8 = eVar7;
                                                                                                                            r43 = r47;
                                                                                                                        } else {
                                                                                                                            ?? r49 = Query;
                                                                                                                            map8 = Collections.EMPTY_MAP;
                                                                                                                            r49.close();
                                                                                                                            r43 = r49;
                                                                                                                        }
                                                                                                                    } catch (SQLiteException e11) {
                                                                                                                        e = e11;
                                                                                                                        str12 = str11;
                                                                                                                    }
                                                                                                                } catch (Throwable th5) {
                                                                                                                    th = th5;
                                                                                                                    r44 = Query;
                                                                                                                }
                                                                                                            } catch (SQLiteException e12) {
                                                                                                                e = e12;
                                                                                                                str12 = str11;
                                                                                                                r2 = 0;
                                                                                                                r42 = list;
                                                                                                            } catch (Throwable th6) {
                                                                                                                th = th6;
                                                                                                                r8 = 0;
                                                                                                            }
                                                                                                            eVar6.put(strS, map8);
                                                                                                            list = r43;
                                                                                                        } else {
                                                                                                            list = list;
                                                                                                        }
                                                                                                        while (r19.hasNext()) {
                                                                                                            iIntValue2 = num6.intValue();
                                                                                                            if (this.w.contains(num6)) {
                                                                                                                r1Var.a().y().b(num6, "Skipping failed audience ID");
                                                                                                            } else {
                                                                                                                it8 = ((List) map8.get(num6)).iterator();
                                                                                                                zA = true;
                                                                                                                while (true) {
                                                                                                                    if (!it8.hasNext()) {
                                                                                                                        map9 = map8;
                                                                                                                        w0Var2 = w0Var;
                                                                                                                        num3 = num6;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    com.gamericefishpro.space.i9.n1 n1Var5 = (com.gamericefishpro.space.i9.n1) it8.next();
                                                                                                                    w0Var2 = w0Var;
                                                                                                                    num3 = num6;
                                                                                                                    map9 = map8;
                                                                                                                    bVar2 = new b(this, this.v, iIntValue2, n1Var5, 0);
                                                                                                                    Long l5 = this.z;
                                                                                                                    Long l6 = this.A;
                                                                                                                    iQ = n1Var5.q();
                                                                                                                    v4Var = (v4) this.y.get(num3);
                                                                                                                    if (v4Var == null) {
                                                                                                                        z5 = false;
                                                                                                                    } else {
                                                                                                                        z5 = v4Var.d.get(iQ);
                                                                                                                    }
                                                                                                                    zA = bVar2.a(l5, l6, a3VarA, j, rVarX, z5);
                                                                                                                    if (!zA) {
                                                                                                                        this.w.add(num3);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    w(num3).a(bVar2);
                                                                                                                    num6 = num3;
                                                                                                                    map8 = map9;
                                                                                                                    w0Var = w0Var2;
                                                                                                                }
                                                                                                                if (!zA) {
                                                                                                                    this.w.add(num3);
                                                                                                                }
                                                                                                                w0Var = w0Var2;
                                                                                                                map8 = map9;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if (!z) {
                                                                                            return new ArrayList();
                                                                                        }
                                                                                        if (!list2.isEmpty()) {
                                                                                            com.gamericefishpro.space.t.e eVar10 = new com.gamericefishpro.space.t.e();
                                                                                            it4 = list2.iterator();
                                                                                            r0Var = eVar10;
                                                                                            while (it4.hasNext()) {
                                                                                                com.gamericefishpro.space.i9.r3 r3Var = (com.gamericefishpro.space.i9.r3) it4.next();
                                                                                                strR = r3Var.r();
                                                                                                map6 = (Map) r0Var.get(strR);
                                                                                                if (map6 == null) {
                                                                                                    m mVarF6 = m4Var.f0();
                                                                                                    r1Var4 = (r1) mVarF6.d;
                                                                                                    str9 = this.v;
                                                                                                    mVarF6.s();
                                                                                                    mVarF6.r();
                                                                                                    com.gamericefishpro.space.v8.c0.d(str9);
                                                                                                    com.gamericefishpro.space.v8.c0.d(strR);
                                                                                                    eVar5 = new com.gamericefishpro.space.t.e();
                                                                                                    try {
                                                                                                        cursorQuery2 = mVarF6.g0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strR}, null, null, null);
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (cursorQuery2.moveToFirst()) {
                                                                                                                    it5 = it4;
                                                                                                                    while (true) {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                com.gamericefishpro.space.i9.u1 u1Var2 = (com.gamericefishpro.space.i9.u1) ((com.gamericefishpro.space.i9.t1) z0.e0(com.gamericefishpro.space.i9.u1.x(), cursorQuery2.getBlob(1))).e();
                                                                                                                                numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                                                list5 = (List) eVar5.get(numValueOf5);
                                                                                                                                if (list5 == null) {
                                                                                                                                    r1Var5 = r1Var4;
                                                                                                                                    try {
                                                                                                                                        arrayList3 = new ArrayList();
                                                                                                                                        eVar5.put(numValueOf5, arrayList3);
                                                                                                                                    } catch (SQLiteException e13) {
                                                                                                                                        e = e13;
                                                                                                                                        str10 = str9;
                                                                                                                                        cursor = cursorQuery2;
                                                                                                                                        try {
                                                                                                                                            r1Var5.a().v().c(r10, v0.z(str10), e);
                                                                                                                                            map6 = Collections.EMPTY_MAP;
                                                                                                                                            if (cursor != null) {
                                                                                                                                                cursor.close();
                                                                                                                                            }
                                                                                                                                            r0Var.put(strR, map6);
                                                                                                                                            it6 = map6.keySet().iterator();
                                                                                                                                            r0Var2 = r0Var;
                                                                                                                                            while (it6.hasNext()) {
                                                                                                                                                num2 = (Integer) it6.next();
                                                                                                                                                iIntValue = num2.intValue();
                                                                                                                                                if (this.w.contains(num2)) {
                                                                                                                                                    r1Var.a().y().b(num2, "Skipping failed audience ID");
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                it7 = ((List) map6.get(num2)).iterator();
                                                                                                                                                zB = true;
                                                                                                                                                r0Var3 = r0Var2;
                                                                                                                                                while (true) {
                                                                                                                                                    if (it7.hasNext()) {
                                                                                                                                                        u1Var = (com.gamericefishpro.space.i9.u1) it7.next();
                                                                                                                                                        map7 = map6;
                                                                                                                                                        if (Log.isLoggable(r1Var.a().B(), 2)) {
                                                                                                                                                            t0 t0VarY = r1Var.a().y();
                                                                                                                                                            if (u1Var.p()) {
                                                                                                                                                                numValueOf4 = Integer.valueOf(u1Var.q());
                                                                                                                                                            } else {
                                                                                                                                                                numValueOf4 = null;
                                                                                                                                                            }
                                                                                                                                                            t0VarY.d("Evaluating filter. audience, filter, property", num2, numValueOf4, r1Var.m().c(u1Var.r()));
                                                                                                                                                            r1Var.a().y().b(m4Var.i0().V(u1Var), "Filter definition");
                                                                                                                                                        }
                                                                                                                                                        if (u1Var.p()) {
                                                                                                                                                        }
                                                                                                                                                        t0 t0VarW = r1Var.a().w();
                                                                                                                                                        u0 u0VarZ = v0.z(this.v);
                                                                                                                                                        if (u1Var.p()) {
                                                                                                                                                            numValueOf3 = Integer.valueOf(u1Var.q());
                                                                                                                                                        } else {
                                                                                                                                                            numValueOf3 = null;
                                                                                                                                                        }
                                                                                                                                                        t0VarW.c("Invalid property filter ID. appId, id", u0VarZ, String.valueOf(numValueOf3));
                                                                                                                                                        this.w.add(num2);
                                                                                                                                                        map6 = map7;
                                                                                                                                                        r0Var2 = r0Var3;
                                                                                                                                                        it6 = it6;
                                                                                                                                                    } else {
                                                                                                                                                        map7 = map6;
                                                                                                                                                        r0Var3 = r0Var3;
                                                                                                                                                        it6 = it6;
                                                                                                                                                    }
                                                                                                                                                    if (!zB) {
                                                                                                                                                        this.w.add(num2);
                                                                                                                                                    }
                                                                                                                                                    map6 = map7;
                                                                                                                                                    r0Var2 = r0Var3;
                                                                                                                                                    it6 = it6;
                                                                                                                                                    w(num2).a(bVar);
                                                                                                                                                    iIntValue = i2;
                                                                                                                                                    map6 = map7;
                                                                                                                                                    r0Var3 = r0Var3;
                                                                                                                                                    it6 = it6;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            it4 = it5;
                                                                                                                                            r0Var = r0Var2;
                                                                                                                                        } catch (Throwable th7) {
                                                                                                                                            th = th7;
                                                                                                                                            if (cursor != null) {
                                                                                                                                                cursor.close();
                                                                                                                                            }
                                                                                                                                            throw th;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    r1Var5 = r1Var4;
                                                                                                                                    arrayList3 = list5;
                                                                                                                                }
                                                                                                                                arrayList3.add(u1Var2);
                                                                                                                                str10 = str9;
                                                                                                                            } catch (IOException e14) {
                                                                                                                                r1Var5 = r1Var4;
                                                                                                                                str10 = str9;
                                                                                                                                r1Var5.a().v().c("Failed to merge filter", v0.z(str10), e14);
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                if (!cursorQuery2.moveToNext()) {
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                r1Var4 = r1Var5;
                                                                                                                                str9 = str10;
                                                                                                                            } catch (SQLiteException e15) {
                                                                                                                                e = e15;
                                                                                                                                cursor = cursorQuery2;
                                                                                                                                r1Var5.a().v().c(r10, v0.z(str10), e);
                                                                                                                                map6 = Collections.EMPTY_MAP;
                                                                                                                                if (cursor != null) {
                                                                                                                                    cursor.close();
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } catch (SQLiteException e16) {
                                                                                                                            e = e16;
                                                                                                                            r1Var5 = r1Var4;
                                                                                                                            str10 = str9;
                                                                                                                            cursor = cursorQuery2;
                                                                                                                            r1Var5.a().v().c(r10, v0.z(str10), e);
                                                                                                                            map6 = Collections.EMPTY_MAP;
                                                                                                                            if (cursor != null) {
                                                                                                                                cursor.close();
                                                                                                                            }
                                                                                                                            r0Var.put(strR, map6);
                                                                                                                            it6 = map6.keySet().iterator();
                                                                                                                            r0Var2 = r0Var;
                                                                                                                            while (it6.hasNext()) {
                                                                                                                                num2 = (Integer) it6.next();
                                                                                                                                iIntValue = num2.intValue();
                                                                                                                                if (this.w.contains(num2)) {
                                                                                                                                    r1Var.a().y().b(num2, "Skipping failed audience ID");
                                                                                                                                    break;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                it7 = ((List) map6.get(num2)).iterator();
                                                                                                                                zB = true;
                                                                                                                                r0Var3 = r0Var2;
                                                                                                                                while (true) {
                                                                                                                                    if (it7.hasNext()) {
                                                                                                                                        u1Var = (com.gamericefishpro.space.i9.u1) it7.next();
                                                                                                                                        map7 = map6;
                                                                                                                                        if (Log.isLoggable(r1Var.a().B(), 2)) {
                                                                                                                                            t0 t0VarY2 = r1Var.a().y();
                                                                                                                                            if (u1Var.p()) {
                                                                                                                                                numValueOf4 = Integer.valueOf(u1Var.q());
                                                                                                                                            } else {
                                                                                                                                                numValueOf4 = null;
                                                                                                                                            }
                                                                                                                                            t0VarY2.d("Evaluating filter. audience, filter, property", num2, numValueOf4, r1Var.m().c(u1Var.r()));
                                                                                                                                            r1Var.a().y().b(m4Var.i0().V(u1Var), "Filter definition");
                                                                                                                                        }
                                                                                                                                        if (u1Var.p()) {
                                                                                                                                        }
                                                                                                                                        t0 t0VarW2 = r1Var.a().w();
                                                                                                                                        u0 u0VarZ2 = v0.z(this.v);
                                                                                                                                        if (u1Var.p()) {
                                                                                                                                            numValueOf3 = Integer.valueOf(u1Var.q());
                                                                                                                                        } else {
                                                                                                                                            numValueOf3 = null;
                                                                                                                                        }
                                                                                                                                        t0VarW2.c("Invalid property filter ID. appId, id", u0VarZ2, String.valueOf(numValueOf3));
                                                                                                                                        this.w.add(num2);
                                                                                                                                        map6 = map7;
                                                                                                                                        r0Var2 = r0Var3;
                                                                                                                                        it6 = it6;
                                                                                                                                    } else {
                                                                                                                                        map7 = map6;
                                                                                                                                        r0Var3 = r0Var3;
                                                                                                                                        it6 = it6;
                                                                                                                                    }
                                                                                                                                    if (!zB) {
                                                                                                                                        this.w.add(num2);
                                                                                                                                    }
                                                                                                                                    map6 = map7;
                                                                                                                                    r0Var2 = r0Var3;
                                                                                                                                    it6 = it6;
                                                                                                                                    w(num2).a(bVar);
                                                                                                                                    iIntValue = i2;
                                                                                                                                    map6 = map7;
                                                                                                                                    r0Var3 = r0Var3;
                                                                                                                                    it6 = it6;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            it4 = it5;
                                                                                                                            r0Var = r0Var2;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    cursorQuery2.close();
                                                                                                                    map6 = eVar5;
                                                                                                                } else {
                                                                                                                    it5 = it4;
                                                                                                                    map6 = Collections.EMPTY_MAP;
                                                                                                                    cursorQuery2.close();
                                                                                                                }
                                                                                                            } catch (Throwable th8) {
                                                                                                                th = th8;
                                                                                                                cursor = cursorQuery2;
                                                                                                                if (cursor != null) {
                                                                                                                    cursor.close();
                                                                                                                }
                                                                                                                throw th;
                                                                                                            }
                                                                                                        } catch (SQLiteException e17) {
                                                                                                            e = e17;
                                                                                                            it5 = it4;
                                                                                                        }
                                                                                                    } catch (SQLiteException e18) {
                                                                                                        e = e18;
                                                                                                        it5 = it4;
                                                                                                        r1Var5 = r1Var4;
                                                                                                        str10 = str9;
                                                                                                        cursor = null;
                                                                                                    } catch (Throwable th9) {
                                                                                                        th = th9;
                                                                                                        cursor = null;
                                                                                                    }
                                                                                                    r0Var.put(strR, map6);
                                                                                                } else {
                                                                                                    it5 = it4;
                                                                                                }
                                                                                                it6 = map6.keySet().iterator();
                                                                                                r0Var2 = r0Var;
                                                                                                while (it6.hasNext()) {
                                                                                                    num2 = (Integer) it6.next();
                                                                                                    iIntValue = num2.intValue();
                                                                                                    if (this.w.contains(num2)) {
                                                                                                        r1Var.a().y().b(num2, "Skipping failed audience ID");
                                                                                                        break;
                                                                                                        break;
                                                                                                    }
                                                                                                    it7 = ((List) map6.get(num2)).iterator();
                                                                                                    zB = true;
                                                                                                    r0Var3 = r0Var2;
                                                                                                    while (true) {
                                                                                                        if (it7.hasNext()) {
                                                                                                            u1Var = (com.gamericefishpro.space.i9.u1) it7.next();
                                                                                                            map7 = map6;
                                                                                                            if (Log.isLoggable(r1Var.a().B(), 2)) {
                                                                                                                t0 t0VarY3 = r1Var.a().y();
                                                                                                                if (u1Var.p()) {
                                                                                                                    numValueOf4 = Integer.valueOf(u1Var.q());
                                                                                                                } else {
                                                                                                                    numValueOf4 = null;
                                                                                                                }
                                                                                                                t0VarY3.d("Evaluating filter. audience, filter, property", num2, numValueOf4, r1Var.m().c(u1Var.r()));
                                                                                                                r1Var.a().y().b(m4Var.i0().V(u1Var), "Filter definition");
                                                                                                            }
                                                                                                            if (u1Var.p()) {
                                                                                                            }
                                                                                                            t0 t0VarW3 = r1Var.a().w();
                                                                                                            u0 u0VarZ3 = v0.z(this.v);
                                                                                                            if (u1Var.p()) {
                                                                                                                numValueOf3 = Integer.valueOf(u1Var.q());
                                                                                                            } else {
                                                                                                                numValueOf3 = null;
                                                                                                            }
                                                                                                            t0VarW3.c("Invalid property filter ID. appId, id", u0VarZ3, String.valueOf(numValueOf3));
                                                                                                            this.w.add(num2);
                                                                                                            map6 = map7;
                                                                                                            r0Var2 = r0Var3;
                                                                                                            it6 = it6;
                                                                                                        } else {
                                                                                                            map7 = map6;
                                                                                                            r0Var3 = r0Var3;
                                                                                                            it6 = it6;
                                                                                                        }
                                                                                                        if (!zB) {
                                                                                                            this.w.add(num2);
                                                                                                        }
                                                                                                        map6 = map7;
                                                                                                        r0Var2 = r0Var3;
                                                                                                        it6 = it6;
                                                                                                        w(num2).a(bVar);
                                                                                                        iIntValue = i2;
                                                                                                        map6 = map7;
                                                                                                        r0Var3 = r0Var3;
                                                                                                        it6 = it6;
                                                                                                    }
                                                                                                }
                                                                                                it4 = it5;
                                                                                                r0Var = r0Var2;
                                                                                            }
                                                                                        }
                                                                                        arrayList2 = new ArrayList();
                                                                                        com.gamericefishpro.space.t.b<Integer> bVar3 = (com.gamericefishpro.space.t.b) this.y.keySet();
                                                                                        bVar3.removeAll(this.w);
                                                                                        for (Integer num7 : bVar3) {
                                                                                            int iIntValue3 = num7.intValue();
                                                                                            v4 v4Var2 = (v4) this.y.get(num7);
                                                                                            com.gamericefishpro.space.v8.c0.g(v4Var2);
                                                                                            com.gamericefishpro.space.i9.s2 s2VarB = v4Var2.b(iIntValue3);
                                                                                            arrayList2.add(s2VarB);
                                                                                            mVarF1 = m4Var.f0();
                                                                                            r1Var3 = (r1) mVarF1.d;
                                                                                            str8 = this.v;
                                                                                            com.gamericefishpro.space.i9.l3 l3VarR = s2VarB.r();
                                                                                            mVarF1.s();
                                                                                            mVarF1.r();
                                                                                            com.gamericefishpro.space.v8.c0.d(str8);
                                                                                            com.gamericefishpro.space.v8.c0.g(l3VarR);
                                                                                            byte[] bArrA = l3VarR.a();
                                                                                            contentValues = new ContentValues();
                                                                                            contentValues.put("app_id", str8);
                                                                                            contentValues.put(str5, num7);
                                                                                            contentValues.put("current_results", bArrA);
                                                                                            try {
                                                                                                try {
                                                                                                    if (mVarF1.g0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                                                        r1Var3.a().v().b(v0.z(str8), "Failed to insert filter results (got -1). appId");
                                                                                                    }
                                                                                                } catch (SQLiteException e19) {
                                                                                                    e = e19;
                                                                                                    r1Var3.a().v().c("Error storing filter results. appId", v0.z(str8), e);
                                                                                                }
                                                                                            } catch (SQLiteException e20) {
                                                                                                e = e20;
                                                                                            }
                                                                                        }
                                                                                        return arrayList2;
                                                                                    }
                                                                                } catch (SQLiteException e21) {
                                                                                    e = e21;
                                                                                    cursorRawQuery = null;
                                                                                } catch (Throwable th10) {
                                                                                    th = th10;
                                                                                    r7 = 0;
                                                                                    if (r7 != 0) {
                                                                                        r7.close();
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                                cursorRawQuery.close();
                                                                                r0 = eVar3;
                                                                                com.gamericefishpro.space.v8.c0.d(str17);
                                                                                eVar4 = new com.gamericefishpro.space.t.e();
                                                                                if (!map2.isEmpty()) {
                                                                                    it2 = map2.keySet().iterator();
                                                                                    while (it2.hasNext()) {
                                                                                        num = (Integer) it2.next();
                                                                                        num.getClass();
                                                                                        l3Var3 = (com.gamericefishpro.space.i9.l3) map2.get(num);
                                                                                        list4 = (List) r0.get(num);
                                                                                        if (list4 != null) {
                                                                                        }
                                                                                        r18 = r0;
                                                                                        it3 = it2;
                                                                                        r1Var2 = r1Var6;
                                                                                        eVar4.put(num, l3Var3);
                                                                                        r0 = r18;
                                                                                        str15 = str15;
                                                                                        it2 = it3;
                                                                                        r1Var6 = r1Var2;
                                                                                    }
                                                                                }
                                                                                str4 = str15;
                                                                                r1Var = r1Var6;
                                                                                map3 = eVar4;
                                                                            } catch (Throwable th11) {
                                                                                th = th11;
                                                                                r7 = hashSet;
                                                                            }
                                                                        } else {
                                                                            str4 = "audience_id";
                                                                            r1Var = r1Var6;
                                                                            map3 = map2;
                                                                        }
                                                                        map5 = map3;
                                                                        map4 = map2;
                                                                        while (r17.hasNext()) {
                                                                            num4.getClass();
                                                                            l3Var = (com.gamericefishpro.space.i9.l3) map5.get(num4);
                                                                            bitSet = new BitSet();
                                                                            bitSet2 = new BitSet();
                                                                            eVar = new com.gamericefishpro.space.t.e();
                                                                            if (l3Var != null) {
                                                                                while (r3.hasNext()) {
                                                                                    if (y2Var.p()) {
                                                                                        com.gamericefishpro.space.i9.l3 l3Var7 = l3Var;
                                                                                        Integer numValueOf10 = Integer.valueOf(y2Var.q());
                                                                                        if (y2Var.r()) {
                                                                                            lValueOf = Long.valueOf(y2Var.s());
                                                                                        } else {
                                                                                            lValueOf = null;
                                                                                        }
                                                                                        eVar.put(numValueOf10, lValueOf);
                                                                                        l3Var = l3Var7;
                                                                                    }
                                                                                }
                                                                            }
                                                                            l3Var2 = l3Var;
                                                                            eVar2 = new com.gamericefishpro.space.t.e();
                                                                            if (l3Var2 != null) {
                                                                                it = l3Var2.v().iterator();
                                                                                while (it.hasNext()) {
                                                                                    n3Var = (com.gamericefishpro.space.i9.n3) it.next();
                                                                                    if (!n3Var.p()) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            Map map13 = map5;
                                                                            if (l3Var2 != null) {
                                                                                i = 0;
                                                                                while (i < l3Var2.q() * 64) {
                                                                                    if (z0.Y((l5) l3Var2.p(), i)) {
                                                                                        z4 = zB2;
                                                                                        r1Var.a().y().c("Filter already evaluated. audience ID, filter ID", num4, Integer.valueOf(i));
                                                                                        bitSet2.set(i);
                                                                                        if (z0.Y((l5) l3Var2.r(), i)) {
                                                                                            bitSet.set(i);
                                                                                        }
                                                                                        i++;
                                                                                        zB2 = z4;
                                                                                    } else {
                                                                                        z4 = zB2;
                                                                                    }
                                                                                    eVar.remove(Integer.valueOf(i));
                                                                                    i++;
                                                                                    zB2 = z4;
                                                                                }
                                                                            }
                                                                            boolean z7 = zB2;
                                                                            com.gamericefishpro.space.i9.l3 l3Var8 = (com.gamericefishpro.space.i9.l3) map4.get(num4);
                                                                            if (zB3) {
                                                                                while (r2.hasNext()) {
                                                                                    int iQ3 = n1Var2.q();
                                                                                    Integer num8 = num4;
                                                                                    jLongValue = this.A.longValue() / 1000;
                                                                                    if (n1Var2.y()) {
                                                                                        jLongValue = this.z.longValue() / 1000;
                                                                                    }
                                                                                    numValueOf = Integer.valueOf(iQ3);
                                                                                    if (eVar.containsKey(numValueOf)) {
                                                                                        eVar.put(numValueOf, Long.valueOf(jLongValue));
                                                                                    }
                                                                                    if (eVar2.containsKey(numValueOf)) {
                                                                                        eVar2.put(numValueOf, Long.valueOf(jLongValue));
                                                                                    }
                                                                                    num4 = num8;
                                                                                }
                                                                            }
                                                                            this.y.put(num4, new v4(this, this.v, l3Var8, bitSet, bitSet2, eVar, eVar2));
                                                                            map = map;
                                                                            zB2 = z7;
                                                                            map4 = map4;
                                                                            zB3 = zB3;
                                                                            str3 = str3;
                                                                            map5 = map13;
                                                                        }
                                                                        str5 = str4;
                                                                    }
                                                                    str7 = str2;
                                                                    String str19 = str3;
                                                                    ?? r11 = obj2;
                                                                    if (!list.isEmpty()) {
                                                                        w0Var = new w0(this);
                                                                        eVar6 = new com.gamericefishpro.space.t.e();
                                                                        while (r17.hasNext()) {
                                                                            a3VarA = w0Var.a(a3Var, this.v);
                                                                            if (a3VarA != null) {
                                                                                rVarX = m4Var.f0().X(this.v, a3Var, a3VarA.s());
                                                                                m4Var.f0().Q("events", rVarX);
                                                                                if (z) {
                                                                                    j = rVarX.c;
                                                                                    strS = a3VarA.s();
                                                                                    map8 = (Map) eVar6.get(strS);
                                                                                    if (map8 == null) {
                                                                                        m mVarF7 = m4Var.f0();
                                                                                        r1 r1Var9 = (r1) mVarF7.d;
                                                                                        str11 = this.v;
                                                                                        mVarF7.s();
                                                                                        mVarF7.r();
                                                                                        com.gamericefishpro.space.v8.c0.d(str11);
                                                                                        com.gamericefishpro.space.v8.c0.d(strS);
                                                                                        eVar7 = new com.gamericefishpro.space.t.e();
                                                                                        Query = mVarF7.g0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strS}, null, null, null);
                                                                                        if (Query.moveToFirst()) {
                                                                                            str12 = str11;
                                                                                            Query = Query;
                                                                                            r46 = list;
                                                                                            while (true) {
                                                                                                com.gamericefishpro.space.i9.n1 n1Var6 = (com.gamericefishpro.space.i9.n1) ((com.gamericefishpro.space.i9.m1) z0.e0(com.gamericefishpro.space.i9.n1.B(), Query.getBlob(1))).e();
                                                                                                numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                                                list6 = (List) eVar7.get(numValueOf6);
                                                                                                if (list6 == null) {
                                                                                                    r46 = Query;
                                                                                                    arrayList4 = new ArrayList();
                                                                                                    eVar7.put(numValueOf6, arrayList4);
                                                                                                    r48 = r46;
                                                                                                } else {
                                                                                                    r48 = Query;
                                                                                                    arrayList4 = list6;
                                                                                                }
                                                                                                arrayList4.add(n1Var6);
                                                                                                r47 = r48;
                                                                                                if (!r47.moveToNext()) {
                                                                                                    break;
                                                                                                    break;
                                                                                                }
                                                                                                Query = r47;
                                                                                                r46 = r47;
                                                                                            }
                                                                                            r47.close();
                                                                                            map8 = eVar7;
                                                                                            r43 = r47;
                                                                                        } else {
                                                                                            ?? r410 = Query;
                                                                                            map8 = Collections.EMPTY_MAP;
                                                                                            r410.close();
                                                                                            r43 = r410;
                                                                                        }
                                                                                        eVar6.put(strS, map8);
                                                                                        list = r43;
                                                                                    } else {
                                                                                        list = list;
                                                                                    }
                                                                                    while (r19.hasNext()) {
                                                                                        iIntValue2 = num6.intValue();
                                                                                        if (this.w.contains(num6)) {
                                                                                            r1Var.a().y().b(num6, "Skipping failed audience ID");
                                                                                        } else {
                                                                                            it8 = ((List) map8.get(num6)).iterator();
                                                                                            zA = true;
                                                                                            while (true) {
                                                                                                if (!it8.hasNext()) {
                                                                                                    map9 = map8;
                                                                                                    w0Var2 = w0Var;
                                                                                                    num3 = num6;
                                                                                                    break;
                                                                                                }
                                                                                                com.gamericefishpro.space.i9.n1 n1Var7 = (com.gamericefishpro.space.i9.n1) it8.next();
                                                                                                w0Var2 = w0Var;
                                                                                                num3 = num6;
                                                                                                map9 = map8;
                                                                                                bVar2 = new b(this, this.v, iIntValue2, n1Var7, 0);
                                                                                                Long l7 = this.z;
                                                                                                Long l8 = this.A;
                                                                                                iQ = n1Var7.q();
                                                                                                v4Var = (v4) this.y.get(num3);
                                                                                                if (v4Var == null) {
                                                                                                    z5 = false;
                                                                                                } else {
                                                                                                    z5 = v4Var.d.get(iQ);
                                                                                                }
                                                                                                zA = bVar2.a(l7, l8, a3VarA, j, rVarX, z5);
                                                                                                if (!zA) {
                                                                                                    this.w.add(num3);
                                                                                                    break;
                                                                                                }
                                                                                                w(num3).a(bVar2);
                                                                                                num6 = num3;
                                                                                                map8 = map9;
                                                                                                w0Var = w0Var2;
                                                                                            }
                                                                                            if (!zA) {
                                                                                                this.w.add(num3);
                                                                                            }
                                                                                            w0Var = w0Var2;
                                                                                            map8 = map9;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    continue;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (!z) {
                                                                        return new ArrayList();
                                                                    }
                                                                    if (!list2.isEmpty()) {
                                                                        com.gamericefishpro.space.t.e eVar11 = new com.gamericefishpro.space.t.e();
                                                                        it4 = list2.iterator();
                                                                        r0Var = eVar11;
                                                                        while (it4.hasNext()) {
                                                                            com.gamericefishpro.space.i9.r3 r3Var2 = (com.gamericefishpro.space.i9.r3) it4.next();
                                                                            strR = r3Var2.r();
                                                                            map6 = (Map) r0Var.get(strR);
                                                                            if (map6 == null) {
                                                                                m mVarF8 = m4Var.f0();
                                                                                r1Var4 = (r1) mVarF8.d;
                                                                                str9 = this.v;
                                                                                mVarF8.s();
                                                                                mVarF8.r();
                                                                                com.gamericefishpro.space.v8.c0.d(str9);
                                                                                com.gamericefishpro.space.v8.c0.d(strR);
                                                                                eVar5 = new com.gamericefishpro.space.t.e();
                                                                                cursorQuery2 = mVarF8.g0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strR}, null, null, null);
                                                                                if (cursorQuery2.moveToFirst()) {
                                                                                    it5 = it4;
                                                                                    while (true) {
                                                                                        com.gamericefishpro.space.i9.u1 u1Var3 = (com.gamericefishpro.space.i9.u1) ((com.gamericefishpro.space.i9.t1) z0.e0(com.gamericefishpro.space.i9.u1.x(), cursorQuery2.getBlob(1))).e();
                                                                                        numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                        list5 = (List) eVar5.get(numValueOf5);
                                                                                        if (list5 == null) {
                                                                                            r1Var5 = r1Var4;
                                                                                            arrayList3 = new ArrayList();
                                                                                            eVar5.put(numValueOf5, arrayList3);
                                                                                        } else {
                                                                                            r1Var5 = r1Var4;
                                                                                            arrayList3 = list5;
                                                                                        }
                                                                                        arrayList3.add(u1Var3);
                                                                                        str10 = str9;
                                                                                        if (!cursorQuery2.moveToNext()) {
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        r1Var4 = r1Var5;
                                                                                        str9 = str10;
                                                                                    }
                                                                                    cursorQuery2.close();
                                                                                    map6 = eVar5;
                                                                                } else {
                                                                                    it5 = it4;
                                                                                    map6 = Collections.EMPTY_MAP;
                                                                                    cursorQuery2.close();
                                                                                }
                                                                                r0Var.put(strR, map6);
                                                                            } else {
                                                                                it5 = it4;
                                                                            }
                                                                            it6 = map6.keySet().iterator();
                                                                            r0Var2 = r0Var;
                                                                            while (it6.hasNext()) {
                                                                                num2 = (Integer) it6.next();
                                                                                iIntValue = num2.intValue();
                                                                                if (this.w.contains(num2)) {
                                                                                    r1Var.a().y().b(num2, "Skipping failed audience ID");
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                it7 = ((List) map6.get(num2)).iterator();
                                                                                zB = true;
                                                                                r0Var3 = r0Var2;
                                                                                while (true) {
                                                                                    if (it7.hasNext()) {
                                                                                        u1Var = (com.gamericefishpro.space.i9.u1) it7.next();
                                                                                        map7 = map6;
                                                                                        if (Log.isLoggable(r1Var.a().B(), 2)) {
                                                                                            t0 t0VarY4 = r1Var.a().y();
                                                                                            if (u1Var.p()) {
                                                                                                numValueOf4 = Integer.valueOf(u1Var.q());
                                                                                            } else {
                                                                                                numValueOf4 = null;
                                                                                            }
                                                                                            t0VarY4.d("Evaluating filter. audience, filter, property", num2, numValueOf4, r1Var.m().c(u1Var.r()));
                                                                                            r1Var.a().y().b(m4Var.i0().V(u1Var), "Filter definition");
                                                                                        }
                                                                                        if (u1Var.p()) {
                                                                                        }
                                                                                        t0 t0VarW4 = r1Var.a().w();
                                                                                        u0 u0VarZ4 = v0.z(this.v);
                                                                                        if (u1Var.p()) {
                                                                                            numValueOf3 = Integer.valueOf(u1Var.q());
                                                                                        } else {
                                                                                            numValueOf3 = null;
                                                                                        }
                                                                                        t0VarW4.c("Invalid property filter ID. appId, id", u0VarZ4, String.valueOf(numValueOf3));
                                                                                        this.w.add(num2);
                                                                                        map6 = map7;
                                                                                        r0Var2 = r0Var3;
                                                                                        it6 = it6;
                                                                                    } else {
                                                                                        map7 = map6;
                                                                                        r0Var3 = r0Var3;
                                                                                        it6 = it6;
                                                                                    }
                                                                                    if (!zB) {
                                                                                        this.w.add(num2);
                                                                                    }
                                                                                    map6 = map7;
                                                                                    r0Var2 = r0Var3;
                                                                                    it6 = it6;
                                                                                    w(num2).a(bVar);
                                                                                    iIntValue = i2;
                                                                                    map6 = map7;
                                                                                    r0Var3 = r0Var3;
                                                                                    it6 = it6;
                                                                                }
                                                                            }
                                                                            it4 = it5;
                                                                            r0Var = r0Var2;
                                                                        }
                                                                    }
                                                                    arrayList2 = new ArrayList();
                                                                    com.gamericefishpro.space.t.b<Integer> bVar4 = (com.gamericefishpro.space.t.b) this.y.keySet();
                                                                    bVar4.removeAll(this.w);
                                                                    while (r3.hasNext()) {
                                                                        int iIntValue4 = num7.intValue();
                                                                        v4 v4Var3 = (v4) this.y.get(num7);
                                                                        com.gamericefishpro.space.v8.c0.g(v4Var3);
                                                                        com.gamericefishpro.space.i9.s2 s2VarB2 = v4Var3.b(iIntValue4);
                                                                        arrayList2.add(s2VarB2);
                                                                        mVarF1 = m4Var.f0();
                                                                        r1Var3 = (r1) mVarF1.d;
                                                                        str8 = this.v;
                                                                        com.gamericefishpro.space.i9.l3 l3VarR2 = s2VarB2.r();
                                                                        mVarF1.s();
                                                                        mVarF1.r();
                                                                        com.gamericefishpro.space.v8.c0.d(str8);
                                                                        com.gamericefishpro.space.v8.c0.g(l3VarR2);
                                                                        byte[] bArrA2 = l3VarR2.a();
                                                                        contentValues = new ContentValues();
                                                                        contentValues.put("app_id", str8);
                                                                        contentValues.put(str5, num7);
                                                                        contentValues.put("current_results", bArrA2);
                                                                        if (mVarF1.g0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                            r1Var3.a().v().b(v0.z(str8), "Failed to insert filter results (got -1). appId");
                                                                        }
                                                                    }
                                                                    return arrayList2;
                                                                }
                                                            }
                                                            try {
                                                                if (!cursorQuery.moveToNext()) {
                                                                    break;
                                                                }
                                                                str14 = str3;
                                                                objZ = obj2;
                                                                r21 = r21;
                                                            } catch (SQLiteException e22) {
                                                                e = e22;
                                                                r17.a().v().c("Database error querying filter results. appId", v0.z(r21), e);
                                                                Map map14 = Collections.EMPTY_MAP;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                map2 = map14;
                                                            }
                                                        } catch (SQLiteException e23) {
                                                            e = e23;
                                                            r21 = r21;
                                                            r17 = r17;
                                                            str3 = str14;
                                                            obj2 = objZ;
                                                            r21 = r21;
                                                            r17.a().v().c("Database error querying filter results. appId", v0.z(r21), e);
                                                            Map map15 = Collections.EMPTY_MAP;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            map2 = map15;
                                                            if (map2.isEmpty()) {
                                                                str5 = "audience_id";
                                                                r1Var = r1Var6;
                                                            } else {
                                                                HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
                                                                if (z3) {
                                                                    String str110 = this.v;
                                                                    mVarF0 = m4Var.f0();
                                                                    str6 = this.v;
                                                                    mVarF0.s();
                                                                    mVarF0.r();
                                                                    com.gamericefishpro.space.v8.c0.d(str6);
                                                                    eVar3 = new com.gamericefishpro.space.t.e();
                                                                    cursorRawQuery = mVarF0.g0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                                    if (cursorRawQuery.moveToFirst()) {
                                                                        do {
                                                                            numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                            arrayList = (List) eVar3.get(numValueOf2);
                                                                            if (arrayList == null) {
                                                                                arrayList = new ArrayList();
                                                                                eVar3.put(numValueOf2, arrayList);
                                                                            }
                                                                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                        } while (cursorRawQuery.moveToNext());
                                                                    } else {
                                                                        eVar3 = Collections.EMPTY_MAP;
                                                                    }
                                                                    cursorRawQuery.close();
                                                                    r0 = eVar3;
                                                                    com.gamericefishpro.space.v8.c0.d(str110);
                                                                    eVar4 = new com.gamericefishpro.space.t.e();
                                                                    if (!map2.isEmpty()) {
                                                                        it2 = map2.keySet().iterator();
                                                                        while (it2.hasNext()) {
                                                                            num = (Integer) it2.next();
                                                                            num.getClass();
                                                                            l3Var3 = (com.gamericefishpro.space.i9.l3) map2.get(num);
                                                                            list4 = (List) r0.get(num);
                                                                            if (list4 != null) {
                                                                            }
                                                                            r18 = r0;
                                                                            it3 = it2;
                                                                            r1Var2 = r1Var6;
                                                                            eVar4.put(num, l3Var3);
                                                                            r0 = r18;
                                                                            str15 = str15;
                                                                            it2 = it3;
                                                                            r1Var6 = r1Var2;
                                                                        }
                                                                    }
                                                                    str4 = str15;
                                                                    r1Var = r1Var6;
                                                                    map3 = eVar4;
                                                                } else {
                                                                    str4 = "audience_id";
                                                                    r1Var = r1Var6;
                                                                    map3 = map2;
                                                                }
                                                                map5 = map3;
                                                                map4 = map2;
                                                                while (r17.hasNext()) {
                                                                    num4.getClass();
                                                                    l3Var = (com.gamericefishpro.space.i9.l3) map5.get(num4);
                                                                    bitSet = new BitSet();
                                                                    bitSet2 = new BitSet();
                                                                    eVar = new com.gamericefishpro.space.t.e();
                                                                    if (l3Var != null) {
                                                                        while (r3.hasNext()) {
                                                                            if (y2Var.p()) {
                                                                                com.gamericefishpro.space.i9.l3 l3Var9 = l3Var;
                                                                                Integer numValueOf11 = Integer.valueOf(y2Var.q());
                                                                                if (y2Var.r()) {
                                                                                    lValueOf = Long.valueOf(y2Var.s());
                                                                                } else {
                                                                                    lValueOf = null;
                                                                                }
                                                                                eVar.put(numValueOf11, lValueOf);
                                                                                l3Var = l3Var9;
                                                                            }
                                                                        }
                                                                    }
                                                                    l3Var2 = l3Var;
                                                                    eVar2 = new com.gamericefishpro.space.t.e();
                                                                    if (l3Var2 != null) {
                                                                        it = l3Var2.v().iterator();
                                                                        while (it.hasNext()) {
                                                                            n3Var = (com.gamericefishpro.space.i9.n3) it.next();
                                                                            if (!n3Var.p()) {
                                                                            }
                                                                        }
                                                                    }
                                                                    Map map16 = map5;
                                                                    if (l3Var2 != null) {
                                                                        i = 0;
                                                                        while (i < l3Var2.q() * 64) {
                                                                            if (z0.Y((l5) l3Var2.p(), i)) {
                                                                                z4 = zB2;
                                                                                r1Var.a().y().c("Filter already evaluated. audience ID, filter ID", num4, Integer.valueOf(i));
                                                                                bitSet2.set(i);
                                                                                if (z0.Y((l5) l3Var2.r(), i)) {
                                                                                    bitSet.set(i);
                                                                                }
                                                                                i++;
                                                                                zB2 = z4;
                                                                            } else {
                                                                                z4 = zB2;
                                                                            }
                                                                            eVar.remove(Integer.valueOf(i));
                                                                            i++;
                                                                            zB2 = z4;
                                                                        }
                                                                    }
                                                                    boolean z8 = zB2;
                                                                    com.gamericefishpro.space.i9.l3 l3Var10 = (com.gamericefishpro.space.i9.l3) map4.get(num4);
                                                                    if (zB3) {
                                                                        while (r2.hasNext()) {
                                                                            int iQ4 = n1Var2.q();
                                                                            Integer num9 = num4;
                                                                            jLongValue = this.A.longValue() / 1000;
                                                                            if (n1Var2.y()) {
                                                                                jLongValue = this.z.longValue() / 1000;
                                                                            }
                                                                            numValueOf = Integer.valueOf(iQ4);
                                                                            if (eVar.containsKey(numValueOf)) {
                                                                                eVar.put(numValueOf, Long.valueOf(jLongValue));
                                                                            }
                                                                            if (eVar2.containsKey(numValueOf)) {
                                                                                eVar2.put(numValueOf, Long.valueOf(jLongValue));
                                                                            }
                                                                            num4 = num9;
                                                                        }
                                                                    }
                                                                    this.y.put(num4, new v4(this, this.v, l3Var10, bitSet, bitSet2, eVar, eVar2));
                                                                    map = map;
                                                                    zB2 = z8;
                                                                    map4 = map4;
                                                                    zB3 = zB3;
                                                                    str3 = str3;
                                                                    map5 = map16;
                                                                }
                                                                str5 = str4;
                                                            }
                                                            str7 = str2;
                                                            String str111 = str3;
                                                            ?? r12 = obj2;
                                                            if (!list.isEmpty()) {
                                                                w0Var = new w0(this);
                                                                eVar6 = new com.gamericefishpro.space.t.e();
                                                                while (r17.hasNext()) {
                                                                    a3VarA = w0Var.a(a3Var, this.v);
                                                                    if (a3VarA != null) {
                                                                        rVarX = m4Var.f0().X(this.v, a3Var, a3VarA.s());
                                                                        m4Var.f0().Q("events", rVarX);
                                                                        if (z) {
                                                                            j = rVarX.c;
                                                                            strS = a3VarA.s();
                                                                            map8 = (Map) eVar6.get(strS);
                                                                            if (map8 == null) {
                                                                                m mVarF9 = m4Var.f0();
                                                                                r1 r1Var10 = (r1) mVarF9.d;
                                                                                str11 = this.v;
                                                                                mVarF9.s();
                                                                                mVarF9.r();
                                                                                com.gamericefishpro.space.v8.c0.d(str11);
                                                                                com.gamericefishpro.space.v8.c0.d(strS);
                                                                                eVar7 = new com.gamericefishpro.space.t.e();
                                                                                Query = mVarF9.g0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strS}, null, null, null);
                                                                                if (Query.moveToFirst()) {
                                                                                    str12 = str11;
                                                                                    Query = Query;
                                                                                    r46 = list;
                                                                                    while (true) {
                                                                                        com.gamericefishpro.space.i9.n1 n1Var8 = (com.gamericefishpro.space.i9.n1) ((com.gamericefishpro.space.i9.m1) z0.e0(com.gamericefishpro.space.i9.n1.B(), Query.getBlob(1))).e();
                                                                                        numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                                        list6 = (List) eVar7.get(numValueOf6);
                                                                                        if (list6 == null) {
                                                                                            r46 = Query;
                                                                                            arrayList4 = new ArrayList();
                                                                                            eVar7.put(numValueOf6, arrayList4);
                                                                                            r48 = r46;
                                                                                        } else {
                                                                                            r48 = Query;
                                                                                            arrayList4 = list6;
                                                                                        }
                                                                                        arrayList4.add(n1Var8);
                                                                                        r47 = r48;
                                                                                        if (!r47.moveToNext()) {
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        Query = r47;
                                                                                        r46 = r47;
                                                                                    }
                                                                                    r47.close();
                                                                                    map8 = eVar7;
                                                                                    r43 = r47;
                                                                                } else {
                                                                                    ?? r411 = Query;
                                                                                    map8 = Collections.EMPTY_MAP;
                                                                                    r411.close();
                                                                                    r43 = r411;
                                                                                }
                                                                                eVar6.put(strS, map8);
                                                                                list = r43;
                                                                            } else {
                                                                                list = list;
                                                                            }
                                                                            while (r19.hasNext()) {
                                                                                iIntValue2 = num6.intValue();
                                                                                if (this.w.contains(num6)) {
                                                                                    r1Var.a().y().b(num6, "Skipping failed audience ID");
                                                                                } else {
                                                                                    it8 = ((List) map8.get(num6)).iterator();
                                                                                    zA = true;
                                                                                    while (true) {
                                                                                        if (!it8.hasNext()) {
                                                                                            map9 = map8;
                                                                                            w0Var2 = w0Var;
                                                                                            num3 = num6;
                                                                                            break;
                                                                                        }
                                                                                        com.gamericefishpro.space.i9.n1 n1Var9 = (com.gamericefishpro.space.i9.n1) it8.next();
                                                                                        w0Var2 = w0Var;
                                                                                        num3 = num6;
                                                                                        map9 = map8;
                                                                                        bVar2 = new b(this, this.v, iIntValue2, n1Var9, 0);
                                                                                        Long l9 = this.z;
                                                                                        Long l10 = this.A;
                                                                                        iQ = n1Var9.q();
                                                                                        v4Var = (v4) this.y.get(num3);
                                                                                        if (v4Var == null) {
                                                                                            z5 = false;
                                                                                        } else {
                                                                                            z5 = v4Var.d.get(iQ);
                                                                                        }
                                                                                        zA = bVar2.a(l9, l10, a3VarA, j, rVarX, z5);
                                                                                        if (!zA) {
                                                                                            this.w.add(num3);
                                                                                            break;
                                                                                        }
                                                                                        w(num3).a(bVar2);
                                                                                        num6 = num3;
                                                                                        map8 = map9;
                                                                                        w0Var = w0Var2;
                                                                                    }
                                                                                    if (!zA) {
                                                                                        this.w.add(num3);
                                                                                    }
                                                                                    w0Var = w0Var2;
                                                                                    map8 = map9;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            continue;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            if (!z) {
                                                                return new ArrayList();
                                                            }
                                                            if (!list2.isEmpty()) {
                                                                com.gamericefishpro.space.t.e eVar12 = new com.gamericefishpro.space.t.e();
                                                                it4 = list2.iterator();
                                                                r0Var = eVar12;
                                                                while (it4.hasNext()) {
                                                                    com.gamericefishpro.space.i9.r3 r3Var3 = (com.gamericefishpro.space.i9.r3) it4.next();
                                                                    strR = r3Var3.r();
                                                                    map6 = (Map) r0Var.get(strR);
                                                                    if (map6 == null) {
                                                                        m mVarF10 = m4Var.f0();
                                                                        r1Var4 = (r1) mVarF10.d;
                                                                        str9 = this.v;
                                                                        mVarF10.s();
                                                                        mVarF10.r();
                                                                        com.gamericefishpro.space.v8.c0.d(str9);
                                                                        com.gamericefishpro.space.v8.c0.d(strR);
                                                                        eVar5 = new com.gamericefishpro.space.t.e();
                                                                        cursorQuery2 = mVarF10.g0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strR}, null, null, null);
                                                                        if (cursorQuery2.moveToFirst()) {
                                                                            it5 = it4;
                                                                            while (true) {
                                                                                com.gamericefishpro.space.i9.u1 u1Var4 = (com.gamericefishpro.space.i9.u1) ((com.gamericefishpro.space.i9.t1) z0.e0(com.gamericefishpro.space.i9.u1.x(), cursorQuery2.getBlob(1))).e();
                                                                                numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                list5 = (List) eVar5.get(numValueOf5);
                                                                                if (list5 == null) {
                                                                                    r1Var5 = r1Var4;
                                                                                    arrayList3 = new ArrayList();
                                                                                    eVar5.put(numValueOf5, arrayList3);
                                                                                } else {
                                                                                    r1Var5 = r1Var4;
                                                                                    arrayList3 = list5;
                                                                                }
                                                                                arrayList3.add(u1Var4);
                                                                                str10 = str9;
                                                                                if (!cursorQuery2.moveToNext()) {
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                r1Var4 = r1Var5;
                                                                                str9 = str10;
                                                                            }
                                                                            cursorQuery2.close();
                                                                            map6 = eVar5;
                                                                        } else {
                                                                            it5 = it4;
                                                                            map6 = Collections.EMPTY_MAP;
                                                                            cursorQuery2.close();
                                                                        }
                                                                        r0Var.put(strR, map6);
                                                                    } else {
                                                                        it5 = it4;
                                                                    }
                                                                    it6 = map6.keySet().iterator();
                                                                    r0Var2 = r0Var;
                                                                    while (it6.hasNext()) {
                                                                        num2 = (Integer) it6.next();
                                                                        iIntValue = num2.intValue();
                                                                        if (this.w.contains(num2)) {
                                                                            r1Var.a().y().b(num2, "Skipping failed audience ID");
                                                                            break;
                                                                            break;
                                                                        }
                                                                        it7 = ((List) map6.get(num2)).iterator();
                                                                        zB = true;
                                                                        r0Var3 = r0Var2;
                                                                        while (true) {
                                                                            if (it7.hasNext()) {
                                                                                u1Var = (com.gamericefishpro.space.i9.u1) it7.next();
                                                                                map7 = map6;
                                                                                if (Log.isLoggable(r1Var.a().B(), 2)) {
                                                                                    t0 t0VarY5 = r1Var.a().y();
                                                                                    if (u1Var.p()) {
                                                                                        numValueOf4 = Integer.valueOf(u1Var.q());
                                                                                    } else {
                                                                                        numValueOf4 = null;
                                                                                    }
                                                                                    t0VarY5.d("Evaluating filter. audience, filter, property", num2, numValueOf4, r1Var.m().c(u1Var.r()));
                                                                                    r1Var.a().y().b(m4Var.i0().V(u1Var), "Filter definition");
                                                                                }
                                                                                if (u1Var.p()) {
                                                                                }
                                                                                t0 t0VarW5 = r1Var.a().w();
                                                                                u0 u0VarZ5 = v0.z(this.v);
                                                                                if (u1Var.p()) {
                                                                                    numValueOf3 = Integer.valueOf(u1Var.q());
                                                                                } else {
                                                                                    numValueOf3 = null;
                                                                                }
                                                                                t0VarW5.c("Invalid property filter ID. appId, id", u0VarZ5, String.valueOf(numValueOf3));
                                                                                this.w.add(num2);
                                                                                map6 = map7;
                                                                                r0Var2 = r0Var3;
                                                                                it6 = it6;
                                                                            } else {
                                                                                map7 = map6;
                                                                                r0Var3 = r0Var3;
                                                                                it6 = it6;
                                                                            }
                                                                            if (!zB) {
                                                                                this.w.add(num2);
                                                                            }
                                                                            map6 = map7;
                                                                            r0Var2 = r0Var3;
                                                                            it6 = it6;
                                                                            w(num2).a(bVar);
                                                                            iIntValue = i2;
                                                                            map6 = map7;
                                                                            r0Var3 = r0Var3;
                                                                            it6 = it6;
                                                                        }
                                                                    }
                                                                    it4 = it5;
                                                                    r0Var = r0Var2;
                                                                }
                                                            }
                                                            arrayList2 = new ArrayList();
                                                            com.gamericefishpro.space.t.b<Integer> bVar5 = (com.gamericefishpro.space.t.b) this.y.keySet();
                                                            bVar5.removeAll(this.w);
                                                            while (r3.hasNext()) {
                                                                int iIntValue5 = num7.intValue();
                                                                v4 v4Var4 = (v4) this.y.get(num7);
                                                                com.gamericefishpro.space.v8.c0.g(v4Var4);
                                                                com.gamericefishpro.space.i9.s2 s2VarB3 = v4Var4.b(iIntValue5);
                                                                arrayList2.add(s2VarB3);
                                                                mVarF1 = m4Var.f0();
                                                                r1Var3 = (r1) mVarF1.d;
                                                                str8 = this.v;
                                                                com.gamericefishpro.space.i9.l3 l3VarR3 = s2VarB3.r();
                                                                mVarF1.s();
                                                                mVarF1.r();
                                                                com.gamericefishpro.space.v8.c0.d(str8);
                                                                com.gamericefishpro.space.v8.c0.g(l3VarR3);
                                                                byte[] bArrA3 = l3VarR3.a();
                                                                contentValues = new ContentValues();
                                                                contentValues.put("app_id", str8);
                                                                contentValues.put(str5, num7);
                                                                contentValues.put("current_results", bArrA3);
                                                                if (mVarF1.g0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                    r1Var3.a().v().b(v0.z(str8), "Failed to insert filter results (got -1). appId");
                                                                }
                                                            }
                                                            return arrayList2;
                                                        }
                                                    }
                                                    cursorQuery.close();
                                                    obj = obj3;
                                                    r5 = r6;
                                                    map2 = eVar8;
                                                } else {
                                                    Map map17 = Collections.EMPTY_MAP;
                                                    cursorQuery.close();
                                                    map2 = map17;
                                                    str3 = "Failed to merge filter. appId";
                                                    obj2 = "Database error querying filters. appId";
                                                    obj = obj;
                                                    r5 = r5;
                                                }
                                                if (map2.isEmpty()) {
                                                    str5 = "audience_id";
                                                    r1Var = r1Var6;
                                                } else {
                                                    HashSet<Integer> hashSet3 = new HashSet(map2.keySet());
                                                    if (z3) {
                                                        String str112 = this.v;
                                                        mVarF0 = m4Var.f0();
                                                        str6 = this.v;
                                                        mVarF0.s();
                                                        mVarF0.r();
                                                        com.gamericefishpro.space.v8.c0.d(str6);
                                                        eVar3 = new com.gamericefishpro.space.t.e();
                                                        cursorRawQuery = mVarF0.g0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                        if (cursorRawQuery.moveToFirst()) {
                                                            do {
                                                                numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                arrayList = (List) eVar3.get(numValueOf2);
                                                                if (arrayList == null) {
                                                                    arrayList = new ArrayList();
                                                                    eVar3.put(numValueOf2, arrayList);
                                                                }
                                                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                            } while (cursorRawQuery.moveToNext());
                                                        } else {
                                                            eVar3 = Collections.EMPTY_MAP;
                                                        }
                                                        cursorRawQuery.close();
                                                        r0 = eVar3;
                                                        com.gamericefishpro.space.v8.c0.d(str112);
                                                        eVar4 = new com.gamericefishpro.space.t.e();
                                                        if (!map2.isEmpty()) {
                                                            it2 = map2.keySet().iterator();
                                                            while (it2.hasNext()) {
                                                                num = (Integer) it2.next();
                                                                num.getClass();
                                                                l3Var3 = (com.gamericefishpro.space.i9.l3) map2.get(num);
                                                                list4 = (List) r0.get(num);
                                                                if (list4 != null) {
                                                                }
                                                                r18 = r0;
                                                                it3 = it2;
                                                                r1Var2 = r1Var6;
                                                                eVar4.put(num, l3Var3);
                                                                r0 = r18;
                                                                str15 = str15;
                                                                it2 = it3;
                                                                r1Var6 = r1Var2;
                                                            }
                                                        }
                                                        str4 = str15;
                                                        r1Var = r1Var6;
                                                        map3 = eVar4;
                                                    } else {
                                                        str4 = "audience_id";
                                                        r1Var = r1Var6;
                                                        map3 = map2;
                                                    }
                                                    map5 = map3;
                                                    map4 = map2;
                                                    while (r17.hasNext()) {
                                                        num4.getClass();
                                                        l3Var = (com.gamericefishpro.space.i9.l3) map5.get(num4);
                                                        bitSet = new BitSet();
                                                        bitSet2 = new BitSet();
                                                        eVar = new com.gamericefishpro.space.t.e();
                                                        if (l3Var != null) {
                                                            while (r3.hasNext()) {
                                                                if (y2Var.p()) {
                                                                    com.gamericefishpro.space.i9.l3 l3Var11 = l3Var;
                                                                    Integer numValueOf12 = Integer.valueOf(y2Var.q());
                                                                    if (y2Var.r()) {
                                                                        lValueOf = Long.valueOf(y2Var.s());
                                                                    } else {
                                                                        lValueOf = null;
                                                                    }
                                                                    eVar.put(numValueOf12, lValueOf);
                                                                    l3Var = l3Var11;
                                                                }
                                                            }
                                                        }
                                                        l3Var2 = l3Var;
                                                        eVar2 = new com.gamericefishpro.space.t.e();
                                                        if (l3Var2 != null) {
                                                            it = l3Var2.v().iterator();
                                                            while (it.hasNext()) {
                                                                n3Var = (com.gamericefishpro.space.i9.n3) it.next();
                                                                if (!n3Var.p()) {
                                                                }
                                                            }
                                                        }
                                                        Map map18 = map5;
                                                        if (l3Var2 != null) {
                                                            i = 0;
                                                            while (i < l3Var2.q() * 64) {
                                                                if (z0.Y((l5) l3Var2.p(), i)) {
                                                                    z4 = zB2;
                                                                    r1Var.a().y().c("Filter already evaluated. audience ID, filter ID", num4, Integer.valueOf(i));
                                                                    bitSet2.set(i);
                                                                    if (z0.Y((l5) l3Var2.r(), i)) {
                                                                        bitSet.set(i);
                                                                    }
                                                                    i++;
                                                                    zB2 = z4;
                                                                } else {
                                                                    z4 = zB2;
                                                                }
                                                                eVar.remove(Integer.valueOf(i));
                                                                i++;
                                                                zB2 = z4;
                                                            }
                                                        }
                                                        boolean z9 = zB2;
                                                        com.gamericefishpro.space.i9.l3 l3Var12 = (com.gamericefishpro.space.i9.l3) map4.get(num4);
                                                        if (zB3) {
                                                            while (r2.hasNext()) {
                                                                int iQ5 = n1Var2.q();
                                                                Integer num10 = num4;
                                                                jLongValue = this.A.longValue() / 1000;
                                                                if (n1Var2.y()) {
                                                                    jLongValue = this.z.longValue() / 1000;
                                                                }
                                                                numValueOf = Integer.valueOf(iQ5);
                                                                if (eVar.containsKey(numValueOf)) {
                                                                    eVar.put(numValueOf, Long.valueOf(jLongValue));
                                                                }
                                                                if (eVar2.containsKey(numValueOf)) {
                                                                    eVar2.put(numValueOf, Long.valueOf(jLongValue));
                                                                }
                                                                num4 = num10;
                                                            }
                                                        }
                                                        this.y.put(num4, new v4(this, this.v, l3Var12, bitSet, bitSet2, eVar, eVar2));
                                                        map = map;
                                                        zB2 = z9;
                                                        map4 = map4;
                                                        zB3 = zB3;
                                                        str3 = str3;
                                                        map5 = map18;
                                                    }
                                                    str5 = str4;
                                                }
                                                str7 = str2;
                                                String str113 = str3;
                                                ?? r13 = obj2;
                                                if (!list.isEmpty()) {
                                                    w0Var = new w0(this);
                                                    eVar6 = new com.gamericefishpro.space.t.e();
                                                    while (r17.hasNext()) {
                                                        a3VarA = w0Var.a(a3Var, this.v);
                                                        if (a3VarA != null) {
                                                            rVarX = m4Var.f0().X(this.v, a3Var, a3VarA.s());
                                                            m4Var.f0().Q("events", rVarX);
                                                            if (z) {
                                                                j = rVarX.c;
                                                                strS = a3VarA.s();
                                                                map8 = (Map) eVar6.get(strS);
                                                                if (map8 == null) {
                                                                    m mVarF11 = m4Var.f0();
                                                                    r1 r1Var11 = (r1) mVarF11.d;
                                                                    str11 = this.v;
                                                                    mVarF11.s();
                                                                    mVarF11.r();
                                                                    com.gamericefishpro.space.v8.c0.d(str11);
                                                                    com.gamericefishpro.space.v8.c0.d(strS);
                                                                    eVar7 = new com.gamericefishpro.space.t.e();
                                                                    Query = mVarF11.g0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strS}, null, null, null);
                                                                    if (Query.moveToFirst()) {
                                                                        str12 = str11;
                                                                        Query = Query;
                                                                        r46 = list;
                                                                        while (true) {
                                                                            com.gamericefishpro.space.i9.n1 n1Var10 = (com.gamericefishpro.space.i9.n1) ((com.gamericefishpro.space.i9.m1) z0.e0(com.gamericefishpro.space.i9.n1.B(), Query.getBlob(1))).e();
                                                                            numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                            list6 = (List) eVar7.get(numValueOf6);
                                                                            if (list6 == null) {
                                                                                r46 = Query;
                                                                                arrayList4 = new ArrayList();
                                                                                eVar7.put(numValueOf6, arrayList4);
                                                                                r48 = r46;
                                                                            } else {
                                                                                r48 = Query;
                                                                                arrayList4 = list6;
                                                                            }
                                                                            arrayList4.add(n1Var10);
                                                                            r47 = r48;
                                                                            if (!r47.moveToNext()) {
                                                                                break;
                                                                                break;
                                                                            }
                                                                            Query = r47;
                                                                            r46 = r47;
                                                                        }
                                                                        r47.close();
                                                                        map8 = eVar7;
                                                                        r43 = r47;
                                                                    } else {
                                                                        ?? r412 = Query;
                                                                        map8 = Collections.EMPTY_MAP;
                                                                        r412.close();
                                                                        r43 = r412;
                                                                    }
                                                                    eVar6.put(strS, map8);
                                                                    list = r43;
                                                                } else {
                                                                    list = list;
                                                                }
                                                                while (r19.hasNext()) {
                                                                    iIntValue2 = num6.intValue();
                                                                    if (this.w.contains(num6)) {
                                                                        r1Var.a().y().b(num6, "Skipping failed audience ID");
                                                                    } else {
                                                                        it8 = ((List) map8.get(num6)).iterator();
                                                                        zA = true;
                                                                        while (true) {
                                                                            if (!it8.hasNext()) {
                                                                                map9 = map8;
                                                                                w0Var2 = w0Var;
                                                                                num3 = num6;
                                                                                break;
                                                                            }
                                                                            com.gamericefishpro.space.i9.n1 n1Var11 = (com.gamericefishpro.space.i9.n1) it8.next();
                                                                            w0Var2 = w0Var;
                                                                            num3 = num6;
                                                                            map9 = map8;
                                                                            bVar2 = new b(this, this.v, iIntValue2, n1Var11, 0);
                                                                            Long l11 = this.z;
                                                                            Long l12 = this.A;
                                                                            iQ = n1Var11.q();
                                                                            v4Var = (v4) this.y.get(num3);
                                                                            if (v4Var == null) {
                                                                                z5 = false;
                                                                            } else {
                                                                                z5 = v4Var.d.get(iQ);
                                                                            }
                                                                            zA = bVar2.a(l11, l12, a3VarA, j, rVarX, z5);
                                                                            if (!zA) {
                                                                                this.w.add(num3);
                                                                                break;
                                                                            }
                                                                            w(num3).a(bVar2);
                                                                            num6 = num3;
                                                                            map8 = map9;
                                                                            w0Var = w0Var2;
                                                                        }
                                                                        if (!zA) {
                                                                            this.w.add(num3);
                                                                        }
                                                                        w0Var = w0Var2;
                                                                        map8 = map9;
                                                                    }
                                                                }
                                                            } else {
                                                                continue;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (!z) {
                                                    return new ArrayList();
                                                }
                                                if (!list2.isEmpty()) {
                                                    com.gamericefishpro.space.t.e eVar13 = new com.gamericefishpro.space.t.e();
                                                    it4 = list2.iterator();
                                                    r0Var = eVar13;
                                                    while (it4.hasNext()) {
                                                        com.gamericefishpro.space.i9.r3 r3Var4 = (com.gamericefishpro.space.i9.r3) it4.next();
                                                        strR = r3Var4.r();
                                                        map6 = (Map) r0Var.get(strR);
                                                        if (map6 == null) {
                                                            m mVarF12 = m4Var.f0();
                                                            r1Var4 = (r1) mVarF12.d;
                                                            str9 = this.v;
                                                            mVarF12.s();
                                                            mVarF12.r();
                                                            com.gamericefishpro.space.v8.c0.d(str9);
                                                            com.gamericefishpro.space.v8.c0.d(strR);
                                                            eVar5 = new com.gamericefishpro.space.t.e();
                                                            cursorQuery2 = mVarF12.g0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strR}, null, null, null);
                                                            if (cursorQuery2.moveToFirst()) {
                                                                it5 = it4;
                                                                while (true) {
                                                                    com.gamericefishpro.space.i9.u1 u1Var5 = (com.gamericefishpro.space.i9.u1) ((com.gamericefishpro.space.i9.t1) z0.e0(com.gamericefishpro.space.i9.u1.x(), cursorQuery2.getBlob(1))).e();
                                                                    numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                    list5 = (List) eVar5.get(numValueOf5);
                                                                    if (list5 == null) {
                                                                        r1Var5 = r1Var4;
                                                                        arrayList3 = new ArrayList();
                                                                        eVar5.put(numValueOf5, arrayList3);
                                                                    } else {
                                                                        r1Var5 = r1Var4;
                                                                        arrayList3 = list5;
                                                                    }
                                                                    arrayList3.add(u1Var5);
                                                                    str10 = str9;
                                                                    if (!cursorQuery2.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    r1Var4 = r1Var5;
                                                                    str9 = str10;
                                                                }
                                                                cursorQuery2.close();
                                                                map6 = eVar5;
                                                            } else {
                                                                it5 = it4;
                                                                map6 = Collections.EMPTY_MAP;
                                                                cursorQuery2.close();
                                                            }
                                                            r0Var.put(strR, map6);
                                                        } else {
                                                            it5 = it4;
                                                        }
                                                        it6 = map6.keySet().iterator();
                                                        r0Var2 = r0Var;
                                                        while (it6.hasNext()) {
                                                            num2 = (Integer) it6.next();
                                                            iIntValue = num2.intValue();
                                                            if (this.w.contains(num2)) {
                                                                r1Var.a().y().b(num2, "Skipping failed audience ID");
                                                                break;
                                                                break;
                                                            }
                                                            it7 = ((List) map6.get(num2)).iterator();
                                                            zB = true;
                                                            r0Var3 = r0Var2;
                                                            while (true) {
                                                                if (it7.hasNext()) {
                                                                    u1Var = (com.gamericefishpro.space.i9.u1) it7.next();
                                                                    map7 = map6;
                                                                    if (Log.isLoggable(r1Var.a().B(), 2)) {
                                                                        t0 t0VarY6 = r1Var.a().y();
                                                                        if (u1Var.p()) {
                                                                            numValueOf4 = Integer.valueOf(u1Var.q());
                                                                        } else {
                                                                            numValueOf4 = null;
                                                                        }
                                                                        t0VarY6.d("Evaluating filter. audience, filter, property", num2, numValueOf4, r1Var.m().c(u1Var.r()));
                                                                        r1Var.a().y().b(m4Var.i0().V(u1Var), "Filter definition");
                                                                    }
                                                                    if (u1Var.p()) {
                                                                    }
                                                                    t0 t0VarW6 = r1Var.a().w();
                                                                    u0 u0VarZ6 = v0.z(this.v);
                                                                    if (u1Var.p()) {
                                                                        numValueOf3 = Integer.valueOf(u1Var.q());
                                                                    } else {
                                                                        numValueOf3 = null;
                                                                    }
                                                                    t0VarW6.c("Invalid property filter ID. appId, id", u0VarZ6, String.valueOf(numValueOf3));
                                                                    this.w.add(num2);
                                                                    map6 = map7;
                                                                    r0Var2 = r0Var3;
                                                                    it6 = it6;
                                                                } else {
                                                                    map7 = map6;
                                                                    r0Var3 = r0Var3;
                                                                    it6 = it6;
                                                                }
                                                                if (!zB) {
                                                                    this.w.add(num2);
                                                                }
                                                                map6 = map7;
                                                                r0Var2 = r0Var3;
                                                                it6 = it6;
                                                                w(num2).a(bVar);
                                                                iIntValue = i2;
                                                                map6 = map7;
                                                                r0Var3 = r0Var3;
                                                                it6 = it6;
                                                            }
                                                        }
                                                        it4 = it5;
                                                        r0Var = r0Var2;
                                                    }
                                                }
                                                arrayList2 = new ArrayList();
                                                com.gamericefishpro.space.t.b<Integer> bVar6 = (com.gamericefishpro.space.t.b) this.y.keySet();
                                                bVar6.removeAll(this.w);
                                                while (r3.hasNext()) {
                                                    int iIntValue6 = num7.intValue();
                                                    v4 v4Var5 = (v4) this.y.get(num7);
                                                    com.gamericefishpro.space.v8.c0.g(v4Var5);
                                                    com.gamericefishpro.space.i9.s2 s2VarB4 = v4Var5.b(iIntValue6);
                                                    arrayList2.add(s2VarB4);
                                                    mVarF1 = m4Var.f0();
                                                    r1Var3 = (r1) mVarF1.d;
                                                    str8 = this.v;
                                                    com.gamericefishpro.space.i9.l3 l3VarR4 = s2VarB4.r();
                                                    mVarF1.s();
                                                    mVarF1.r();
                                                    com.gamericefishpro.space.v8.c0.d(str8);
                                                    com.gamericefishpro.space.v8.c0.g(l3VarR4);
                                                    byte[] bArrA4 = l3VarR4.a();
                                                    contentValues = new ContentValues();
                                                    contentValues.put("app_id", str8);
                                                    contentValues.put(str5, num7);
                                                    contentValues.put("current_results", bArrA4);
                                                    if (mVarF1.g0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                        r1Var3.a().v().b(v0.z(str8), "Failed to insert filter results (got -1). appId");
                                                    }
                                                }
                                                return arrayList2;
                                            }
                                        }
                                        r111.close();
                                        map = eVar9;
                                    } else {
                                        str2 = "data";
                                        Query2.close();
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    r19 = Query2;
                                }
                            } catch (SQLiteException e24) {
                                e = e24;
                                str2 = "data";
                            }
                        } catch (SQLiteException e25) {
                            e = e25;
                            str2 = "data";
                            r9 = 0;
                        } catch (Throwable th13) {
                            th = th13;
                            r9 = 0;
                        }
                        m mVarF13 = m4Var.f0();
                        obj = (r1) mVarF13.d;
                        r5 = this.v;
                        mVarF13.s();
                        mVarF13.r();
                        com.gamericefishpro.space.v8.c0.d(r5);
                        cursorQuery = mVarF13.g0().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r5}, null, null, null);
                        if (cursorQuery.moveToFirst()) {
                            Map map19 = Collections.EMPTY_MAP;
                            cursorQuery.close();
                            map2 = map19;
                            str3 = "Failed to merge filter. appId";
                            obj2 = "Database error querying filters. appId";
                            obj = obj;
                            r5 = r5;
                        } else {
                            eVar8 = new com.gamericefishpro.space.t.e();
                            r17 = obj;
                            r21 = r5;
                            while (true) {
                                i3 = cursorQuery.getInt(0);
                                com.gamericefishpro.space.i9.l3 l3Var13 = (com.gamericefishpro.space.i9.l3) ((com.gamericefishpro.space.i9.k3) z0.e0(com.gamericefishpro.space.i9.l3.x(), cursorQuery.getBlob(1))).e();
                                Object objValueOf2 = Integer.valueOf(i3);
                                eVar8.put(objValueOf2, l3Var13);
                                str3 = str14;
                                obj2 = objZ;
                                obj3 = objValueOf2;
                                r6 = r21;
                                if (!cursorQuery.moveToNext()) {
                                    break;
                                    break;
                                }
                                str14 = str3;
                                objZ = obj2;
                                r21 = r21;
                            }
                            cursorQuery.close();
                            obj = obj3;
                            r5 = r6;
                            map2 = eVar8;
                        }
                        if (map2.isEmpty()) {
                            str5 = "audience_id";
                            r1Var = r1Var6;
                        } else {
                            HashSet<Integer> hashSet4 = new HashSet(map2.keySet());
                            if (z3) {
                                String str114 = this.v;
                                mVarF0 = m4Var.f0();
                                str6 = this.v;
                                mVarF0.s();
                                mVarF0.r();
                                com.gamericefishpro.space.v8.c0.d(str6);
                                eVar3 = new com.gamericefishpro.space.t.e();
                                cursorRawQuery = mVarF0.g0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                if (cursorRawQuery.moveToFirst()) {
                                    do {
                                        numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                        arrayList = (List) eVar3.get(numValueOf2);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            eVar3.put(numValueOf2, arrayList);
                                        }
                                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                    } while (cursorRawQuery.moveToNext());
                                } else {
                                    eVar3 = Collections.EMPTY_MAP;
                                }
                                cursorRawQuery.close();
                                r0 = eVar3;
                                com.gamericefishpro.space.v8.c0.d(str114);
                                eVar4 = new com.gamericefishpro.space.t.e();
                                if (!map2.isEmpty()) {
                                    it2 = map2.keySet().iterator();
                                    while (it2.hasNext()) {
                                        num = (Integer) it2.next();
                                        num.getClass();
                                        l3Var3 = (com.gamericefishpro.space.i9.l3) map2.get(num);
                                        list4 = (List) r0.get(num);
                                        if (list4 != null || list4.isEmpty()) {
                                            r18 = r0;
                                            it3 = it2;
                                            r1Var2 = r1Var6;
                                            eVar4.put(num, l3Var3);
                                            r0 = r18;
                                            str15 = str15;
                                            it2 = it3;
                                            r1Var6 = r1Var2;
                                        } else {
                                            ?? r112 = r0;
                                            it3 = it2;
                                            List listA0 = m4Var.i0().a0((l5) l3Var3.r(), list4);
                                            if (listA0.isEmpty()) {
                                                r0 = r112;
                                                it2 = it3;
                                            } else {
                                                com.gamericefishpro.space.i9.k3 k3Var = (com.gamericefishpro.space.i9.k3) l3Var3.i();
                                                k3Var.i();
                                                k3Var.b();
                                                ((com.gamericefishpro.space.i9.l3) k3Var.e).B(listA0);
                                                List listA1 = m4Var.i0().a0((l5) l3Var3.p(), list4);
                                                k3Var.h();
                                                k3Var.b();
                                                ((com.gamericefishpro.space.i9.l3) k3Var.e).z(listA1);
                                                ArrayList arrayList6 = new ArrayList();
                                                Iterator it10 = l3Var3.t().iterator();
                                                while (it10.hasNext()) {
                                                    Iterator it11 = it10;
                                                    com.gamericefishpro.space.i9.y2 y2Var2 = (com.gamericefishpro.space.i9.y2) it10.next();
                                                    r1 r1Var12 = r1Var6;
                                                    if (!list4.contains(Integer.valueOf(y2Var2.q()))) {
                                                        arrayList6.add(y2Var2);
                                                    }
                                                    it10 = it11;
                                                    r1Var6 = r1Var12;
                                                }
                                                r1Var2 = r1Var6;
                                                k3Var.j();
                                                k3Var.b();
                                                ((com.gamericefishpro.space.i9.l3) k3Var.e).D(arrayList6);
                                                ArrayList arrayList7 = new ArrayList();
                                                for (com.gamericefishpro.space.i9.n3 n3Var2 : l3Var3.v()) {
                                                    if (!list4.contains(Integer.valueOf(n3Var2.q()))) {
                                                        arrayList7.add(n3Var2);
                                                    }
                                                }
                                                k3Var.k();
                                                k3Var.b();
                                                ((com.gamericefishpro.space.i9.l3) k3Var.e).F(arrayList7);
                                                eVar4.put(num, (com.gamericefishpro.space.i9.l3) k3Var.e());
                                                r18 = r112;
                                                r0 = r18;
                                                str15 = str15;
                                                it2 = it3;
                                                r1Var6 = r1Var2;
                                            }
                                        }
                                    }
                                }
                                str4 = str15;
                                r1Var = r1Var6;
                                map3 = eVar4;
                            } else {
                                str4 = "audience_id";
                                r1Var = r1Var6;
                                map3 = map2;
                            }
                            map5 = map3;
                            map4 = map2;
                            while (r17.hasNext()) {
                                num4.getClass();
                                l3Var = (com.gamericefishpro.space.i9.l3) map5.get(num4);
                                bitSet = new BitSet();
                                bitSet2 = new BitSet();
                                eVar = new com.gamericefishpro.space.t.e();
                                if (l3Var != null && l3Var.u() != 0) {
                                    while (r3.hasNext()) {
                                        if (y2Var.p()) {
                                            com.gamericefishpro.space.i9.l3 l3Var14 = l3Var;
                                            Integer numValueOf13 = Integer.valueOf(y2Var.q());
                                            if (y2Var.r()) {
                                                lValueOf = Long.valueOf(y2Var.s());
                                            } else {
                                                lValueOf = null;
                                            }
                                            eVar.put(numValueOf13, lValueOf);
                                            l3Var = l3Var14;
                                        }
                                    }
                                }
                                l3Var2 = l3Var;
                                eVar2 = new com.gamericefishpro.space.t.e();
                                if (l3Var2 != null && l3Var2.w() != 0) {
                                    it = l3Var2.v().iterator();
                                    while (it.hasNext()) {
                                        n3Var = (com.gamericefishpro.space.i9.n3) it.next();
                                        if (!n3Var.p() && n3Var.s() > 0) {
                                            eVar2.put(Integer.valueOf(n3Var.q()), Long.valueOf(n3Var.t(n3Var.s() - 1)));
                                            it = it;
                                            map5 = map5;
                                        }
                                    }
                                }
                                Map map110 = map5;
                                if (l3Var2 != null) {
                                    i = 0;
                                    while (i < l3Var2.q() * 64) {
                                        if (z0.Y((l5) l3Var2.p(), i)) {
                                            z4 = zB2;
                                            r1Var.a().y().c("Filter already evaluated. audience ID, filter ID", num4, Integer.valueOf(i));
                                            bitSet2.set(i);
                                            if (z0.Y((l5) l3Var2.r(), i)) {
                                                bitSet.set(i);
                                            }
                                            i++;
                                            zB2 = z4;
                                        } else {
                                            z4 = zB2;
                                        }
                                        eVar.remove(Integer.valueOf(i));
                                        i++;
                                        zB2 = z4;
                                    }
                                }
                                boolean z10 = zB2;
                                com.gamericefishpro.space.i9.l3 l3Var15 = (com.gamericefishpro.space.i9.l3) map4.get(num4);
                                if (zB3 && z10 && (list3 = (List) map.get(num4)) != null && this.A != null && this.z != null) {
                                    while (r2.hasNext()) {
                                        int iQ6 = n1Var2.q();
                                        Integer num11 = num4;
                                        jLongValue = this.A.longValue() / 1000;
                                        if (n1Var2.y()) {
                                            jLongValue = this.z.longValue() / 1000;
                                        }
                                        numValueOf = Integer.valueOf(iQ6);
                                        if (eVar.containsKey(numValueOf)) {
                                            eVar.put(numValueOf, Long.valueOf(jLongValue));
                                        }
                                        if (eVar2.containsKey(numValueOf)) {
                                            eVar2.put(numValueOf, Long.valueOf(jLongValue));
                                        }
                                        num4 = num11;
                                    }
                                }
                                this.y.put(num4, new v4(this, this.v, l3Var15, bitSet, bitSet2, eVar, eVar2));
                                map = map;
                                zB2 = z10;
                                map4 = map4;
                                zB3 = zB3;
                                str3 = str3;
                                map5 = map110;
                            }
                            str5 = str4;
                        }
                        str7 = str2;
                        String str115 = str3;
                        ?? r14 = obj2;
                        if (!list.isEmpty()) {
                            w0Var = new w0(this);
                            eVar6 = new com.gamericefishpro.space.t.e();
                            while (r17.hasNext()) {
                                a3VarA = w0Var.a(a3Var, this.v);
                                if (a3VarA != null) {
                                    rVarX = m4Var.f0().X(this.v, a3Var, a3VarA.s());
                                    m4Var.f0().Q("events", rVarX);
                                    if (z) {
                                        j = rVarX.c;
                                        strS = a3VarA.s();
                                        map8 = (Map) eVar6.get(strS);
                                        if (map8 == null) {
                                            m mVarF14 = m4Var.f0();
                                            r1 r1Var13 = (r1) mVarF14.d;
                                            str11 = this.v;
                                            mVarF14.s();
                                            mVarF14.r();
                                            com.gamericefishpro.space.v8.c0.d(str11);
                                            com.gamericefishpro.space.v8.c0.d(strS);
                                            eVar7 = new com.gamericefishpro.space.t.e();
                                            Query = mVarF14.g0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strS}, null, null, null);
                                            if (Query.moveToFirst()) {
                                                str12 = str11;
                                                Query = Query;
                                                r46 = list;
                                                while (true) {
                                                    com.gamericefishpro.space.i9.n1 n1Var12 = (com.gamericefishpro.space.i9.n1) ((com.gamericefishpro.space.i9.m1) z0.e0(com.gamericefishpro.space.i9.n1.B(), Query.getBlob(1))).e();
                                                    numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                    list6 = (List) eVar7.get(numValueOf6);
                                                    if (list6 == null) {
                                                        r46 = Query;
                                                        arrayList4 = new ArrayList();
                                                        eVar7.put(numValueOf6, arrayList4);
                                                        r48 = r46;
                                                    } else {
                                                        r48 = Query;
                                                        arrayList4 = list6;
                                                    }
                                                    arrayList4.add(n1Var12);
                                                    r47 = r48;
                                                    if (!r47.moveToNext()) {
                                                        break;
                                                        break;
                                                    }
                                                    Query = r47;
                                                    r46 = r47;
                                                }
                                                r47.close();
                                                map8 = eVar7;
                                                r43 = r47;
                                            } else {
                                                ?? r413 = Query;
                                                map8 = Collections.EMPTY_MAP;
                                                r413.close();
                                                r43 = r413;
                                            }
                                            eVar6.put(strS, map8);
                                            list = r43;
                                        } else {
                                            list = list;
                                        }
                                        while (r19.hasNext()) {
                                            iIntValue2 = num6.intValue();
                                            if (this.w.contains(num6)) {
                                                r1Var.a().y().b(num6, "Skipping failed audience ID");
                                            } else {
                                                it8 = ((List) map8.get(num6)).iterator();
                                                zA = true;
                                                while (true) {
                                                    if (!it8.hasNext()) {
                                                        map9 = map8;
                                                        w0Var2 = w0Var;
                                                        num3 = num6;
                                                        break;
                                                    }
                                                    com.gamericefishpro.space.i9.n1 n1Var13 = (com.gamericefishpro.space.i9.n1) it8.next();
                                                    w0Var2 = w0Var;
                                                    num3 = num6;
                                                    map9 = map8;
                                                    bVar2 = new b(this, this.v, iIntValue2, n1Var13, 0);
                                                    Long l13 = this.z;
                                                    Long l14 = this.A;
                                                    iQ = n1Var13.q();
                                                    v4Var = (v4) this.y.get(num3);
                                                    if (v4Var == null) {
                                                        z5 = false;
                                                    } else {
                                                        z5 = v4Var.d.get(iQ);
                                                    }
                                                    zA = bVar2.a(l13, l14, a3VarA, j, rVarX, z5);
                                                    if (!zA) {
                                                        this.w.add(num3);
                                                        break;
                                                    }
                                                    w(num3).a(bVar2);
                                                    num6 = num3;
                                                    map8 = map9;
                                                    w0Var = w0Var2;
                                                }
                                                if (!zA) {
                                                    this.w.add(num3);
                                                }
                                                w0Var = w0Var2;
                                                map8 = map9;
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                        if (!z) {
                            return new ArrayList();
                        }
                        if (!list2.isEmpty()) {
                            com.gamericefishpro.space.t.e eVar14 = new com.gamericefishpro.space.t.e();
                            it4 = list2.iterator();
                            r0Var = eVar14;
                            while (it4.hasNext()) {
                                com.gamericefishpro.space.i9.r3 r3Var5 = (com.gamericefishpro.space.i9.r3) it4.next();
                                strR = r3Var5.r();
                                map6 = (Map) r0Var.get(strR);
                                if (map6 == null) {
                                    m mVarF15 = m4Var.f0();
                                    r1Var4 = (r1) mVarF15.d;
                                    str9 = this.v;
                                    mVarF15.s();
                                    mVarF15.r();
                                    com.gamericefishpro.space.v8.c0.d(str9);
                                    com.gamericefishpro.space.v8.c0.d(strR);
                                    eVar5 = new com.gamericefishpro.space.t.e();
                                    cursorQuery2 = mVarF15.g0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strR}, null, null, null);
                                    if (cursorQuery2.moveToFirst()) {
                                        it5 = it4;
                                        while (true) {
                                            com.gamericefishpro.space.i9.u1 u1Var6 = (com.gamericefishpro.space.i9.u1) ((com.gamericefishpro.space.i9.t1) z0.e0(com.gamericefishpro.space.i9.u1.x(), cursorQuery2.getBlob(1))).e();
                                            numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                            list5 = (List) eVar5.get(numValueOf5);
                                            if (list5 == null) {
                                                r1Var5 = r1Var4;
                                                arrayList3 = new ArrayList();
                                                eVar5.put(numValueOf5, arrayList3);
                                            } else {
                                                r1Var5 = r1Var4;
                                                arrayList3 = list5;
                                            }
                                            arrayList3.add(u1Var6);
                                            str10 = str9;
                                            if (!cursorQuery2.moveToNext()) {
                                                break;
                                                break;
                                            }
                                            r1Var4 = r1Var5;
                                            str9 = str10;
                                        }
                                        cursorQuery2.close();
                                        map6 = eVar5;
                                    } else {
                                        it5 = it4;
                                        map6 = Collections.EMPTY_MAP;
                                        cursorQuery2.close();
                                    }
                                    r0Var.put(strR, map6);
                                } else {
                                    it5 = it4;
                                }
                                it6 = map6.keySet().iterator();
                                r0Var2 = r0Var;
                                while (it6.hasNext()) {
                                    num2 = (Integer) it6.next();
                                    iIntValue = num2.intValue();
                                    if (this.w.contains(num2)) {
                                        r1Var.a().y().b(num2, "Skipping failed audience ID");
                                        break;
                                        break;
                                    }
                                    it7 = ((List) map6.get(num2)).iterator();
                                    zB = true;
                                    r0Var3 = r0Var2;
                                    while (true) {
                                        if (it7.hasNext()) {
                                            u1Var = (com.gamericefishpro.space.i9.u1) it7.next();
                                            map7 = map6;
                                            if (Log.isLoggable(r1Var.a().B(), 2)) {
                                                t0 t0VarY7 = r1Var.a().y();
                                                if (u1Var.p()) {
                                                    numValueOf4 = Integer.valueOf(u1Var.q());
                                                } else {
                                                    numValueOf4 = null;
                                                }
                                                t0VarY7.d("Evaluating filter. audience, filter, property", num2, numValueOf4, r1Var.m().c(u1Var.r()));
                                                r1Var.a().y().b(m4Var.i0().V(u1Var), "Filter definition");
                                            }
                                            if (u1Var.p() || u1Var.q() > 256) {
                                                t0 t0VarW7 = r1Var.a().w();
                                                u0 u0VarZ7 = v0.z(this.v);
                                                if (u1Var.p()) {
                                                    numValueOf3 = Integer.valueOf(u1Var.q());
                                                } else {
                                                    numValueOf3 = null;
                                                }
                                                t0VarW7.c("Invalid property filter ID. appId, id", u0VarZ7, String.valueOf(numValueOf3));
                                                this.w.add(num2);
                                                map6 = map7;
                                                r0Var2 = r0Var3;
                                                it6 = it6;
                                            } else {
                                                i2 = iIntValue;
                                                bVar = new b(this, this.v, i2, u1Var, 1);
                                                Long l15 = this.z;
                                                Long l16 = this.A;
                                                int iQ7 = u1Var.q();
                                                v4 v4Var6 = (v4) this.y.get(num2);
                                                zB = bVar.b(l15, l16, r3Var5, v4Var6 == null ? false : v4Var6.d.get(iQ7));
                                                if (zB) {
                                                    w(num2).a(bVar);
                                                    iIntValue = i2;
                                                    map6 = map7;
                                                    r0Var3 = r0Var3;
                                                    it6 = it6;
                                                } else {
                                                    this.w.add(num2);
                                                    r0Var3 = r0Var3;
                                                }
                                            }
                                        } else {
                                            map7 = map6;
                                            r0Var3 = r0Var3;
                                            it6 = it6;
                                        }
                                        if (!zB) {
                                            this.w.add(num2);
                                        }
                                        map6 = map7;
                                        r0Var2 = r0Var3;
                                        it6 = it6;
                                    }
                                }
                                it4 = it5;
                                r0Var = r0Var2;
                            }
                        }
                        arrayList2 = new ArrayList();
                        com.gamericefishpro.space.t.b<Integer> bVar7 = (com.gamericefishpro.space.t.b) this.y.keySet();
                        bVar7.removeAll(this.w);
                        while (r3.hasNext()) {
                            int iIntValue7 = num7.intValue();
                            v4 v4Var7 = (v4) this.y.get(num7);
                            com.gamericefishpro.space.v8.c0.g(v4Var7);
                            com.gamericefishpro.space.i9.s2 s2VarB5 = v4Var7.b(iIntValue7);
                            arrayList2.add(s2VarB5);
                            mVarF1 = m4Var.f0();
                            r1Var3 = (r1) mVarF1.d;
                            str8 = this.v;
                            com.gamericefishpro.space.i9.l3 l3VarR5 = s2VarB5.r();
                            mVarF1.s();
                            mVarF1.r();
                            com.gamericefishpro.space.v8.c0.d(str8);
                            com.gamericefishpro.space.v8.c0.g(l3VarR5);
                            byte[] bArrA5 = l3VarR5.a();
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str8);
                            contentValues.put(str5, num7);
                            contentValues.put("current_results", bArrA5);
                            if (mVarF1.g0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                r1Var3.a().v().b(v0.z(str8), "Failed to insert filter results (got -1). appId");
                            }
                        }
                        return arrayList2;
                    }
                    z3 = z2;
                    str2 = "data";
                    if (cursorQuery.moveToFirst()) {
                        Map map111 = Collections.EMPTY_MAP;
                        cursorQuery.close();
                        map2 = map111;
                        str3 = "Failed to merge filter. appId";
                        obj2 = "Database error querying filters. appId";
                        obj = obj;
                        r5 = r5;
                    } else {
                        eVar8 = new com.gamericefishpro.space.t.e();
                        r17 = obj;
                        r21 = r5;
                        while (true) {
                            i3 = cursorQuery.getInt(0);
                            com.gamericefishpro.space.i9.l3 l3Var16 = (com.gamericefishpro.space.i9.l3) ((com.gamericefishpro.space.i9.k3) z0.e0(com.gamericefishpro.space.i9.l3.x(), cursorQuery.getBlob(1))).e();
                            Object objValueOf3 = Integer.valueOf(i3);
                            eVar8.put(objValueOf3, l3Var16);
                            str3 = str14;
                            obj2 = objZ;
                            obj3 = objValueOf3;
                            r6 = r21;
                            if (!cursorQuery.moveToNext()) {
                                break;
                                break;
                            }
                            str14 = str3;
                            objZ = obj2;
                            r21 = r21;
                        }
                        cursorQuery.close();
                        obj = obj3;
                        r5 = r6;
                        map2 = eVar8;
                    }
                } catch (SQLiteException e26) {
                    e = e26;
                    r17 = obj;
                    r21 = r5;
                }
            } catch (Throwable th14) {
                th = th14;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
            cursorQuery = mVarF13.g0().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r5}, null, null, null);
        } catch (SQLiteException e27) {
            e = e27;
            r17 = obj;
            str3 = "Failed to merge filter. appId";
            obj2 = "Database error querying filters. appId";
            r21 = r5;
            cursorQuery = null;
        } catch (Throwable th15) {
            th = th15;
            cursorQuery = null;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
        map = map10;
        m mVarF16 = m4Var.f0();
        obj = (r1) mVarF16.d;
        r5 = this.v;
        mVarF16.s();
        mVarF16.r();
        com.gamericefishpro.space.v8.c0.d(r5);
        if (map2.isEmpty()) {
            str5 = "audience_id";
            r1Var = r1Var6;
        } else {
            HashSet<Integer> hashSet5 = new HashSet(map2.keySet());
            if (z3) {
                String str116 = this.v;
                mVarF0 = m4Var.f0();
                str6 = this.v;
                mVarF0.s();
                mVarF0.r();
                com.gamericefishpro.space.v8.c0.d(str6);
                eVar3 = new com.gamericefishpro.space.t.e();
                cursorRawQuery = mVarF0.g0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                        arrayList = (List) eVar3.get(numValueOf2);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            eVar3.put(numValueOf2, arrayList);
                        }
                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                    } while (cursorRawQuery.moveToNext());
                } else {
                    eVar3 = Collections.EMPTY_MAP;
                }
                cursorRawQuery.close();
                r0 = eVar3;
                com.gamericefishpro.space.v8.c0.d(str116);
                eVar4 = new com.gamericefishpro.space.t.e();
                if (!map2.isEmpty()) {
                    it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        num = (Integer) it2.next();
                        num.getClass();
                        l3Var3 = (com.gamericefishpro.space.i9.l3) map2.get(num);
                        list4 = (List) r0.get(num);
                        if (list4 != null) {
                        }
                        r18 = r0;
                        it3 = it2;
                        r1Var2 = r1Var6;
                        eVar4.put(num, l3Var3);
                        r0 = r18;
                        str15 = str15;
                        it2 = it3;
                        r1Var6 = r1Var2;
                    }
                }
                str4 = str15;
                r1Var = r1Var6;
                map3 = eVar4;
            } else {
                str4 = "audience_id";
                r1Var = r1Var6;
                map3 = map2;
            }
            map5 = map3;
            map4 = map2;
            while (r17.hasNext()) {
                num4.getClass();
                l3Var = (com.gamericefishpro.space.i9.l3) map5.get(num4);
                bitSet = new BitSet();
                bitSet2 = new BitSet();
                eVar = new com.gamericefishpro.space.t.e();
                if (l3Var != null) {
                    while (r3.hasNext()) {
                        if (y2Var.p()) {
                            com.gamericefishpro.space.i9.l3 l3Var17 = l3Var;
                            Integer numValueOf14 = Integer.valueOf(y2Var.q());
                            if (y2Var.r()) {
                                lValueOf = Long.valueOf(y2Var.s());
                            } else {
                                lValueOf = null;
                            }
                            eVar.put(numValueOf14, lValueOf);
                            l3Var = l3Var17;
                        }
                    }
                }
                l3Var2 = l3Var;
                eVar2 = new com.gamericefishpro.space.t.e();
                if (l3Var2 != null) {
                    it = l3Var2.v().iterator();
                    while (it.hasNext()) {
                        n3Var = (com.gamericefishpro.space.i9.n3) it.next();
                        if (!n3Var.p()) {
                        }
                    }
                }
                Map map112 = map5;
                if (l3Var2 != null) {
                    i = 0;
                    while (i < l3Var2.q() * 64) {
                        if (z0.Y((l5) l3Var2.p(), i)) {
                            z4 = zB2;
                            r1Var.a().y().c("Filter already evaluated. audience ID, filter ID", num4, Integer.valueOf(i));
                            bitSet2.set(i);
                            if (z0.Y((l5) l3Var2.r(), i)) {
                                bitSet.set(i);
                            }
                            i++;
                            zB2 = z4;
                        } else {
                            z4 = zB2;
                        }
                        eVar.remove(Integer.valueOf(i));
                        i++;
                        zB2 = z4;
                    }
                }
                boolean z11 = zB2;
                com.gamericefishpro.space.i9.l3 l3Var18 = (com.gamericefishpro.space.i9.l3) map4.get(num4);
                if (zB3) {
                    while (r2.hasNext()) {
                        int iQ8 = n1Var2.q();
                        Integer num12 = num4;
                        jLongValue = this.A.longValue() / 1000;
                        if (n1Var2.y()) {
                            jLongValue = this.z.longValue() / 1000;
                        }
                        numValueOf = Integer.valueOf(iQ8);
                        if (eVar.containsKey(numValueOf)) {
                            eVar.put(numValueOf, Long.valueOf(jLongValue));
                        }
                        if (eVar2.containsKey(numValueOf)) {
                            eVar2.put(numValueOf, Long.valueOf(jLongValue));
                        }
                        num4 = num12;
                    }
                }
                this.y.put(num4, new v4(this, this.v, l3Var18, bitSet, bitSet2, eVar, eVar2));
                map = map;
                zB2 = z11;
                map4 = map4;
                zB3 = zB3;
                str3 = str3;
                map5 = map112;
            }
            str5 = str4;
        }
        str7 = str2;
        String str117 = str3;
        ?? r15 = obj2;
        if (!list.isEmpty()) {
            w0Var = new w0(this);
            eVar6 = new com.gamericefishpro.space.t.e();
            while (r17.hasNext()) {
                a3VarA = w0Var.a(a3Var, this.v);
                if (a3VarA != null) {
                    rVarX = m4Var.f0().X(this.v, a3Var, a3VarA.s());
                    m4Var.f0().Q("events", rVarX);
                    if (z) {
                        j = rVarX.c;
                        strS = a3VarA.s();
                        map8 = (Map) eVar6.get(strS);
                        if (map8 == null) {
                            m mVarF17 = m4Var.f0();
                            r1 r1Var14 = (r1) mVarF17.d;
                            str11 = this.v;
                            mVarF17.s();
                            mVarF17.r();
                            com.gamericefishpro.space.v8.c0.d(str11);
                            com.gamericefishpro.space.v8.c0.d(strS);
                            eVar7 = new com.gamericefishpro.space.t.e();
                            Query = mVarF17.g0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strS}, null, null, null);
                            if (Query.moveToFirst()) {
                                str12 = str11;
                                Query = Query;
                                r46 = list;
                                while (true) {
                                    com.gamericefishpro.space.i9.n1 n1Var14 = (com.gamericefishpro.space.i9.n1) ((com.gamericefishpro.space.i9.m1) z0.e0(com.gamericefishpro.space.i9.n1.B(), Query.getBlob(1))).e();
                                    numValueOf6 = Integer.valueOf(Query.getInt(0));
                                    list6 = (List) eVar7.get(numValueOf6);
                                    if (list6 == null) {
                                        r46 = Query;
                                        arrayList4 = new ArrayList();
                                        eVar7.put(numValueOf6, arrayList4);
                                        r48 = r46;
                                    } else {
                                        r48 = Query;
                                        arrayList4 = list6;
                                    }
                                    arrayList4.add(n1Var14);
                                    r47 = r48;
                                    if (!r47.moveToNext()) {
                                        break;
                                        break;
                                    }
                                    Query = r47;
                                    r46 = r47;
                                }
                                r47.close();
                                map8 = eVar7;
                                r43 = r47;
                            } else {
                                ?? r414 = Query;
                                map8 = Collections.EMPTY_MAP;
                                r414.close();
                                r43 = r414;
                            }
                            eVar6.put(strS, map8);
                            list = r43;
                        } else {
                            list = list;
                        }
                        while (r19.hasNext()) {
                            iIntValue2 = num6.intValue();
                            if (this.w.contains(num6)) {
                                r1Var.a().y().b(num6, "Skipping failed audience ID");
                            } else {
                                it8 = ((List) map8.get(num6)).iterator();
                                zA = true;
                                while (true) {
                                    if (!it8.hasNext()) {
                                        map9 = map8;
                                        w0Var2 = w0Var;
                                        num3 = num6;
                                        break;
                                    }
                                    com.gamericefishpro.space.i9.n1 n1Var15 = (com.gamericefishpro.space.i9.n1) it8.next();
                                    w0Var2 = w0Var;
                                    num3 = num6;
                                    map9 = map8;
                                    bVar2 = new b(this, this.v, iIntValue2, n1Var15, 0);
                                    Long l17 = this.z;
                                    Long l18 = this.A;
                                    iQ = n1Var15.q();
                                    v4Var = (v4) this.y.get(num3);
                                    if (v4Var == null) {
                                        z5 = false;
                                    } else {
                                        z5 = v4Var.d.get(iQ);
                                    }
                                    zA = bVar2.a(l17, l18, a3VarA, j, rVarX, z5);
                                    if (!zA) {
                                        this.w.add(num3);
                                        break;
                                    }
                                    w(num3).a(bVar2);
                                    num6 = num3;
                                    map8 = map9;
                                    w0Var = w0Var2;
                                }
                                if (!zA) {
                                    this.w.add(num3);
                                }
                                w0Var = w0Var2;
                                map8 = map9;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        if (!z) {
            return new ArrayList();
        }
        if (!list2.isEmpty()) {
            com.gamericefishpro.space.t.e eVar15 = new com.gamericefishpro.space.t.e();
            it4 = list2.iterator();
            r0Var = eVar15;
            while (it4.hasNext()) {
                com.gamericefishpro.space.i9.r3 r3Var6 = (com.gamericefishpro.space.i9.r3) it4.next();
                strR = r3Var6.r();
                map6 = (Map) r0Var.get(strR);
                if (map6 == null) {
                    m mVarF18 = m4Var.f0();
                    r1Var4 = (r1) mVarF18.d;
                    str9 = this.v;
                    mVarF18.s();
                    mVarF18.r();
                    com.gamericefishpro.space.v8.c0.d(str9);
                    com.gamericefishpro.space.v8.c0.d(strR);
                    eVar5 = new com.gamericefishpro.space.t.e();
                    cursorQuery2 = mVarF18.g0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strR}, null, null, null);
                    if (cursorQuery2.moveToFirst()) {
                        it5 = it4;
                        while (true) {
                            com.gamericefishpro.space.i9.u1 u1Var7 = (com.gamericefishpro.space.i9.u1) ((com.gamericefishpro.space.i9.t1) z0.e0(com.gamericefishpro.space.i9.u1.x(), cursorQuery2.getBlob(1))).e();
                            numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                            list5 = (List) eVar5.get(numValueOf5);
                            if (list5 == null) {
                                r1Var5 = r1Var4;
                                arrayList3 = new ArrayList();
                                eVar5.put(numValueOf5, arrayList3);
                            } else {
                                r1Var5 = r1Var4;
                                arrayList3 = list5;
                            }
                            arrayList3.add(u1Var7);
                            str10 = str9;
                            if (!cursorQuery2.moveToNext()) {
                                break;
                                break;
                            }
                            r1Var4 = r1Var5;
                            str9 = str10;
                        }
                        cursorQuery2.close();
                        map6 = eVar5;
                    } else {
                        it5 = it4;
                        map6 = Collections.EMPTY_MAP;
                        cursorQuery2.close();
                    }
                    r0Var.put(strR, map6);
                } else {
                    it5 = it4;
                }
                it6 = map6.keySet().iterator();
                r0Var2 = r0Var;
                while (it6.hasNext()) {
                    num2 = (Integer) it6.next();
                    iIntValue = num2.intValue();
                    if (this.w.contains(num2)) {
                        r1Var.a().y().b(num2, "Skipping failed audience ID");
                        break;
                        break;
                    }
                    it7 = ((List) map6.get(num2)).iterator();
                    zB = true;
                    r0Var3 = r0Var2;
                    while (true) {
                        if (it7.hasNext()) {
                            u1Var = (com.gamericefishpro.space.i9.u1) it7.next();
                            map7 = map6;
                            if (Log.isLoggable(r1Var.a().B(), 2)) {
                                t0 t0VarY8 = r1Var.a().y();
                                if (u1Var.p()) {
                                    numValueOf4 = Integer.valueOf(u1Var.q());
                                } else {
                                    numValueOf4 = null;
                                }
                                t0VarY8.d("Evaluating filter. audience, filter, property", num2, numValueOf4, r1Var.m().c(u1Var.r()));
                                r1Var.a().y().b(m4Var.i0().V(u1Var), "Filter definition");
                            }
                            if (u1Var.p()) {
                            }
                            t0 t0VarW8 = r1Var.a().w();
                            u0 u0VarZ8 = v0.z(this.v);
                            if (u1Var.p()) {
                                numValueOf3 = Integer.valueOf(u1Var.q());
                            } else {
                                numValueOf3 = null;
                            }
                            t0VarW8.c("Invalid property filter ID. appId, id", u0VarZ8, String.valueOf(numValueOf3));
                            this.w.add(num2);
                            map6 = map7;
                            r0Var2 = r0Var3;
                            it6 = it6;
                        } else {
                            map7 = map6;
                            r0Var3 = r0Var3;
                            it6 = it6;
                        }
                        if (!zB) {
                            this.w.add(num2);
                        }
                        map6 = map7;
                        r0Var2 = r0Var3;
                        it6 = it6;
                        w(num2).a(bVar);
                        iIntValue = i2;
                        map6 = map7;
                        r0Var3 = r0Var3;
                        it6 = it6;
                    }
                }
                it4 = it5;
                r0Var = r0Var2;
            }
        }
        arrayList2 = new ArrayList();
        com.gamericefishpro.space.t.b<Integer> bVar8 = (com.gamericefishpro.space.t.b) this.y.keySet();
        bVar8.removeAll(this.w);
        while (r3.hasNext()) {
            int iIntValue8 = num7.intValue();
            v4 v4Var8 = (v4) this.y.get(num7);
            com.gamericefishpro.space.v8.c0.g(v4Var8);
            com.gamericefishpro.space.i9.s2 s2VarB6 = v4Var8.b(iIntValue8);
            arrayList2.add(s2VarB6);
            mVarF1 = m4Var.f0();
            r1Var3 = (r1) mVarF1.d;
            str8 = this.v;
            com.gamericefishpro.space.i9.l3 l3VarR6 = s2VarB6.r();
            mVarF1.s();
            mVarF1.r();
            com.gamericefishpro.space.v8.c0.d(str8);
            com.gamericefishpro.space.v8.c0.g(l3VarR6);
            byte[] bArrA6 = l3VarR6.a();
            contentValues = new ContentValues();
            contentValues.put("app_id", str8);
            contentValues.put(str5, num7);
            contentValues.put("current_results", bArrA6);
            if (mVarF1.g0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                r1Var3.a().v().b(v0.z(str8), "Failed to insert filter results (got -1). appId");
            }
        }
        return arrayList2;
    }

    public final v4 w(Integer num) {
        if (this.y.containsKey(num)) {
            return (v4) this.y.get(num);
        }
        v4 v4Var = new v4(this, this.v);
        this.y.put(num, v4Var);
        return v4Var;
    }

    @Override // com.gamericefishpro.space.n9.g4
    public final void u() {
    }
}
