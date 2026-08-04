package com.gamericefishpro.space.y6;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import com.gamericefishpro.space.hj.c;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.l6.q;
import com.gamericefishpro.space.s5.v;
import com.gamericefishpro.space.u6.g;
import com.gamericefishpro.space.u6.i;
import com.gamericefishpro.space.u6.j;
import com.gamericefishpro.space.u6.l;
import com.gamericefishpro.space.u6.p;
import com.gamericefishpro.space.u6.s;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final /* synthetic */ int a = 0;

    static {
        Intrinsics.checkNotNullExpressionValue(q.d("DiagnosticsWrkr"), "tagWithPrefix(\"DiagnosticsWrkr\")");
    }

    public static final void a(l lVar, s sVar, i iVar, ArrayList arrayList) {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            p pVar = (p) obj;
            j jVarY = a4.y(pVar);
            String str = pVar.a;
            g gVarC = iVar.c(jVarY);
            Integer numValueOf = gVarC != null ? Integer.valueOf(gVarC.c) : null;
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) lVar.d;
            v vVarB = v.b(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str == null) {
                vVarB.p(1);
            } else {
                vVarB.i(1, str);
            }
            workDatabase_Impl.b();
            Cursor cursorL = c.L(workDatabase_Impl, vVarB);
            try {
                ArrayList arrayList2 = new ArrayList(cursorL.getCount());
                while (cursorL.moveToNext()) {
                    arrayList2.add(cursorL.isNull(0) ? null : cursorL.getString(0));
                }
                cursorL.close();
                vVarB.c();
                String strA = CollectionsKt.A(arrayList2, ",", null, null, null, 62);
                String strA2 = CollectionsKt.A(sVar.j(str), ",", null, null, null, 62);
                StringBuilder sbL = com.gamericefishpro.space.m5.a.l("\n", str, "\t ");
                sbL.append(pVar.c);
                sbL.append("\t ");
                sbL.append(numValueOf);
                sbL.append("\t ");
                sbL.append(pVar.b.name());
                sbL.append("\t ");
                sbL.append(strA);
                sbL.append("\t ");
                sbL.append(strA2);
                sbL.append('\t');
                sb.append(sbL.toString());
            } catch (Throwable th) {
                cursorL.close();
                vVarB.c();
                throw th;
            }
        }
        Intrinsics.checkNotNullExpressionValue(sb.toString(), "StringBuilder().apply(builderAction).toString()");
    }
}
