package com.gamericefishpro.space.n9;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {
    public final /* synthetic */ int a = 0;
    public long b;
    public Object c;
    public Object d;
    public final Object e;

    public w0(long j, Bundle bundle, String str, String str2) {
        this.c = str;
        this.d = str2;
        this.e = bundle;
        this.b = j;
    }

    public static w0 b(u uVar) {
        String str = uVar.d;
        String str2 = uVar.i;
        return new w0(uVar.v, uVar.e.f(), str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ff A[PHI: r8 r16 r17
      0x00ff: PHI (r8v6 android.database.Cursor) = (r8v7 android.database.Cursor), (r8v10 android.database.Cursor) binds: [B:61:0x012a, B:46:0x00f8] A[DONT_GENERATE, DONT_INLINE]
      0x00ff: PHI (r16v3 com.gamericefishpro.space.i9.a3) = (r16v5 com.gamericefishpro.space.i9.a3), (r16v10 com.gamericefishpro.space.i9.a3) binds: [B:61:0x012a, B:46:0x00f8] A[DONT_GENERATE, DONT_INLINE]
      0x00ff: PHI (r17v2 long) = (r17v4 long), (r17v7 long) binds: [B:61:0x012a, B:46:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public com.gamericefishpro.space.i9.a3 a(com.gamericefishpro.space.i9.a3 a3Var, String str) {
        Cursor cursor;
        com.gamericefishpro.space.i9.a3 a3Var2;
        long j;
        Cursor cursorRawQuery;
        Pair pair;
        Object obj;
        Pair pair2;
        String strS = a3Var.s();
        List listP = a3Var.p();
        c cVar = (c) this.e;
        m4 m4Var = cVar.e;
        m4 m4Var2 = cVar.e;
        r1 r1Var = (r1) cVar.d;
        m4Var.i0();
        com.gamericefishpro.space.i9.d3 d3VarZ = z0.z(a3Var, "_eid");
        Long l = (Long) (d3VarZ == null ? null : z0.G(d3VarZ));
        if (l != null) {
            if (strS.equals("_ep")) {
                m4Var.i0();
                com.gamericefishpro.space.i9.d3 d3VarZ2 = z0.z(a3Var, "_en");
                String str2 = (String) (d3VarZ2 == null ? null : z0.G(d3VarZ2));
                if (TextUtils.isEmpty(str2)) {
                    v0 v0Var = r1Var.y;
                    r1.l(v0Var);
                    v0Var.z.b(l, "Extra parameter without an event name. eventId");
                    return null;
                }
                if (((com.gamericefishpro.space.i9.a3) this.c) == null || ((Long) this.d) == null || l.longValue() != ((Long) this.d).longValue()) {
                    m mVar = m4Var.i;
                    m4.T(mVar);
                    r1 r1Var2 = (r1) mVar.d;
                    mVar.r();
                    mVar.s();
                    try {
                        cursorRawQuery = mVar.g0().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                        try {
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    a3Var2 = null;
                                    try {
                                        try {
                                            Pair pairCreate = Pair.create((com.gamericefishpro.space.i9.a3) ((com.gamericefishpro.space.i9.z2) z0.e0(com.gamericefishpro.space.i9.a3.z(), cursorRawQuery.getBlob(0))).e(), Long.valueOf(cursorRawQuery.getLong(1)));
                                            cursorRawQuery.close();
                                            pair2 = pairCreate;
                                        } catch (SQLiteException e) {
                                            e = e;
                                            j = 0;
                                            v0 v0Var2 = r1Var2.y;
                                            r1.l(v0Var2);
                                            v0Var2.y.b(e, "Error selecting main event");
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            pair = a3Var2;
                                        }
                                    } catch (IOException e2) {
                                        v0 v0Var3 = r1Var2.y;
                                        r1.l(v0Var3);
                                        j = 0;
                                        try {
                                            v0Var3.y.d("Failed to merge main event. appId, eventId", v0.z(str), l, e2);
                                        } catch (SQLiteException e3) {
                                            e = e3;
                                            v0 v0Var4 = r1Var2.y;
                                            r1.l(v0Var4);
                                            v0Var4.y.b(e, "Error selecting main event");
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            pair = a3Var2;
                                            if (pair != 0) {
                                            }
                                            v0 v0Var5 = r1Var.y;
                                            r1.l(v0Var5);
                                            v0Var5.z.c("Extra parameter without existing main event. eventName, eventId", str2, l);
                                            return a3Var2;
                                        }
                                        cursorRawQuery.close();
                                        pair = a3Var2;
                                    }
                                } else {
                                    v0 v0Var6 = r1Var2.y;
                                    r1.l(v0Var6);
                                    v0Var6.G.a("Main event not found");
                                    cursorRawQuery.close();
                                    pair2 = null;
                                    a3Var2 = null;
                                }
                                j = 0;
                                pair = pair2;
                            } catch (SQLiteException e4) {
                                e = e4;
                                a3Var2 = null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursorRawQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        a3Var2 = null;
                        j = 0;
                        cursorRawQuery = null;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = null;
                    }
                    if (pair != 0 || (obj = pair.first) == null) {
                        v0 v0Var7 = r1Var.y;
                        r1.l(v0Var7);
                        v0Var7.z.c("Extra parameter without existing main event. eventName, eventId", str2, l);
                        return a3Var2;
                    }
                    this.c = (com.gamericefishpro.space.i9.a3) obj;
                    this.b = ((Long) pair.second).longValue();
                    m4Var2.i0();
                    this.d = (Long) z0.A((com.gamericefishpro.space.i9.a3) this.c, "_eid");
                } else {
                    j = 0;
                }
                long j2 = this.b - 1;
                this.b = j2;
                if (j2 <= j) {
                    m mVar2 = m4Var2.i;
                    m4.T(mVar2);
                    r1 r1Var3 = (r1) mVar2.d;
                    mVar2.r();
                    v0 v0Var8 = r1Var3.y;
                    r1.l(v0Var8);
                    v0Var8.G.b(str, "Clearing complex main event info. appId");
                    try {
                        mVar2.g0().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e6) {
                        v0 v0Var9 = r1Var3.y;
                        r1.l(v0Var9);
                        v0Var9.y.b(e6, "Error clearing complex main event");
                    }
                } else {
                    m mVar3 = m4Var2.i;
                    m4.T(mVar3);
                    mVar3.I(str, l, this.b, (com.gamericefishpro.space.i9.a3) this.c);
                }
                ArrayList arrayList = new ArrayList();
                for (com.gamericefishpro.space.i9.d3 d3Var : ((com.gamericefishpro.space.i9.a3) this.c).p()) {
                    m4Var2.i0();
                    if (z0.z(a3Var, d3Var.q()) == null) {
                        arrayList.add(d3Var);
                    }
                }
                if (arrayList.isEmpty()) {
                    v0 v0Var10 = r1Var.y;
                    r1.l(v0Var10);
                    v0Var10.z.b(str2, "No unique parameters in main event. eventName");
                } else {
                    arrayList.addAll(listP);
                    listP = arrayList;
                }
                strS = str2;
            } else {
                this.d = l;
                this.c = a3Var;
                m4Var.i0();
                com.gamericefishpro.space.i9.d3 d3VarZ3 = z0.z(a3Var, "_epc");
                Serializable serializableG = d3VarZ3 == null ? null : z0.G(d3VarZ3);
                long jLongValue = ((Long) (serializableG != null ? serializableG : 0L)).longValue();
                this.b = jLongValue;
                if (jLongValue <= 0) {
                    v0 v0Var11 = r1Var.y;
                    r1.l(v0Var11);
                    v0Var11.z.b(strS, "Complex event with zero extra param count. eventName");
                } else {
                    m mVar4 = m4Var.i;
                    m4.T(mVar4);
                    mVar4.I(str, l, this.b, a3Var);
                }
            }
        }
        com.gamericefishpro.space.i9.z2 z2Var = (com.gamericefishpro.space.i9.z2) a3Var.i();
        z2Var.b();
        ((com.gamericefishpro.space.i9.a3) z2Var.e).F(strS);
        z2Var.b();
        ((com.gamericefishpro.space.i9.a3) z2Var.e).D();
        z2Var.b();
        ((com.gamericefishpro.space.i9.a3) z2Var.e).C(listP);
        return (com.gamericefishpro.space.i9.a3) z2Var.e();
    }

    public u c() {
        return new u((String) this.c, new t(new Bundle((Bundle) this.e)), (String) this.d, this.b);
    }

    public String toString() {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String str = (String) this.d;
                String string = ((Bundle) this.e).toString();
                int length = String.valueOf(str).length();
                String str2 = (String) this.c;
                StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
                sb.append("origin=");
                sb.append(str);
                sb.append(",name=");
                sb.append(str2);
                return com.gamericefishpro.space.t0.y0.j(sb, ",params=", string);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ w0(c cVar) {
        this.e = cVar;
    }
}
