package com.gamericefishpro.space.n9;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.gamericefishpro.space.i9.p5;
import com.gamericefishpro.space.i9.v5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends g4 implements f {
    public final com.gamericefishpro.space.t.e A;
    public final com.gamericefishpro.space.t.e B;
    public final i1 C;
    public final com.gamericefishpro.space.m.d D;
    public final com.gamericefishpro.space.t.e E;
    public final com.gamericefishpro.space.t.e F;
    public final com.gamericefishpro.space.t.e G;
    public final com.gamericefishpro.space.t.e v;
    public final com.gamericefishpro.space.t.e w;
    public final com.gamericefishpro.space.t.e y;
    public final com.gamericefishpro.space.t.e z;

    public l1(m4 m4Var) {
        super(m4Var);
        this.v = new com.gamericefishpro.space.t.e(0);
        this.w = new com.gamericefishpro.space.t.e(0);
        this.y = new com.gamericefishpro.space.t.e(0);
        this.z = new com.gamericefishpro.space.t.e(0);
        this.A = new com.gamericefishpro.space.t.e(0);
        this.E = new com.gamericefishpro.space.t.e(0);
        this.F = new com.gamericefishpro.space.t.e(0);
        this.G = new com.gamericefishpro.space.t.e(0);
        this.B = new com.gamericefishpro.space.t.e(0);
        this.C = new i1(this);
        this.D = new com.gamericefishpro.space.m.d(11, this);
    }

    public static final com.gamericefishpro.space.t.e B(com.gamericefishpro.space.i9.e2 e2Var) {
        com.gamericefishpro.space.t.e eVar = new com.gamericefishpro.space.t.e(0);
        for (com.gamericefishpro.space.i9.i2 i2Var : e2Var.t()) {
            eVar.put(i2Var.p(), i2Var.q());
        }
        return eVar;
    }

    public static final d2 C(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return d2.AD_STORAGE;
        }
        if (i2 == 2) {
            return d2.ANALYTICS_STORAGE;
        }
        if (i2 == 3) {
            return d2.AD_USER_DATA;
        }
        if (i2 != 4) {
            return null;
        }
        return d2.AD_PERSONALIZATION;
    }

    public final com.gamericefishpro.space.i9.e2 A(String str, byte[] bArr) {
        r1 r1Var = (r1) this.d;
        if (bArr == null) {
            return com.gamericefishpro.space.i9.e2.G();
        }
        try {
            com.gamericefishpro.space.i9.e2 e2Var = (com.gamericefishpro.space.i9.e2) ((com.gamericefishpro.space.i9.d2) z0.e0(com.gamericefishpro.space.i9.e2.F(), bArr)).e();
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            v0Var.G.c("Parsed config. version, gmp_app_id", e2Var.p() ? Long.valueOf(e2Var.q()) : null, e2Var.r() ? e2Var.s() : null);
            return e2Var;
        } catch (p5 e) {
            v0 v0Var2 = r1Var.y;
            r1.l(v0Var2);
            v0Var2.B.c("Unable to merge remote config. appId", v0.z(str), e);
            return com.gamericefishpro.space.i9.e2.G();
        } catch (RuntimeException e2) {
            v0 v0Var3 = r1Var.y;
            r1.l(v0Var3);
            v0Var3.B.c("Unable to merge remote config. appId", v0.z(str), e2);
            return com.gamericefishpro.space.i9.e2.G();
        }
    }

    public final com.gamericefishpro.space.i9.e2 D(String str) {
        s();
        r();
        com.gamericefishpro.space.v8.c0.d(str);
        x(str);
        return (com.gamericefishpro.space.i9.e2) this.A.get(str);
    }

    public final String E(String str) {
        r();
        x(str);
        return (String) this.E.get(str);
    }

    public final void F(String str, byte[] bArr, String str2, String str3) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        com.gamericefishpro.space.i9.d2 d2Var;
        byte[] bArrA;
        int i;
        int i2;
        boolean z;
        s();
        r();
        com.gamericefishpro.space.v8.c0.d(str);
        com.gamericefishpro.space.i9.d2 d2Var2 = (com.gamericefishpro.space.i9.d2) A(str, bArr).i();
        y(str, d2Var2);
        z(str, (com.gamericefishpro.space.i9.e2) d2Var2.e());
        com.gamericefishpro.space.i9.e2 e2Var = (com.gamericefishpro.space.i9.e2) d2Var2.e();
        com.gamericefishpro.space.t.e eVar = this.A;
        eVar.put(str, e2Var);
        this.E.put(str, ((com.gamericefishpro.space.i9.e2) d2Var2.e).A());
        this.F.put(str, str2);
        this.G.put(str, str3);
        this.v.put(str, B((com.gamericefishpro.space.i9.e2) d2Var2.e()));
        m4 m4Var = this.e;
        m mVar = m4Var.i;
        m4.T(mVar);
        ArrayList arrayList = new ArrayList(Collections.unmodifiableList(((com.gamericefishpro.space.i9.e2) d2Var2.e).w()));
        r1 r1Var = (r1) mVar.d;
        int i3 = 0;
        while (i3 < arrayList.size()) {
            com.gamericefishpro.space.i9.k1 k1Var = (com.gamericefishpro.space.i9.k1) ((com.gamericefishpro.space.i9.l1) arrayList.get(i3)).i();
            com.gamericefishpro.space.t.e eVar2 = eVar;
            if (((com.gamericefishpro.space.i9.l1) k1Var.e).v() != 0) {
                int i4 = 0;
                while (i4 < ((com.gamericefishpro.space.i9.l1) k1Var.e).v()) {
                    com.gamericefishpro.space.i9.m1 m1Var = (com.gamericefishpro.space.i9.m1) ((com.gamericefishpro.space.i9.l1) k1Var.e).w(i4).i();
                    com.gamericefishpro.space.i9.m1 m1Var2 = (com.gamericefishpro.space.i9.m1) m1Var.clone();
                    m4 m4Var2 = m4Var;
                    com.gamericefishpro.space.i9.d2 d2Var3 = d2Var2;
                    String strG = f2.g(((com.gamericefishpro.space.i9.n1) m1Var.e).r(), f2.a, f2.c);
                    if (strG != null) {
                        m1Var2.b();
                        ((com.gamericefishpro.space.i9.n1) m1Var2.e).C(strG);
                        z = true;
                    } else {
                        z = false;
                    }
                    int i5 = 0;
                    while (i5 < ((com.gamericefishpro.space.i9.n1) m1Var.e).t()) {
                        com.gamericefishpro.space.i9.p1 p1VarU = ((com.gamericefishpro.space.i9.n1) m1Var.e).u(i5);
                        boolean z2 = z;
                        com.gamericefishpro.space.i9.m1 m1Var3 = m1Var;
                        String strG2 = f2.g(p1VarU.w(), f2.e, f2.f);
                        if (strG2 != null) {
                            com.gamericefishpro.space.i9.o1 o1Var = (com.gamericefishpro.space.i9.o1) p1VarU.i();
                            o1Var.b();
                            ((com.gamericefishpro.space.i9.p1) o1Var.e).y(strG2);
                            com.gamericefishpro.space.i9.p1 p1Var = (com.gamericefishpro.space.i9.p1) o1Var.e();
                            m1Var2.b();
                            ((com.gamericefishpro.space.i9.n1) m1Var2.e).D(i5, p1Var);
                            z = true;
                        } else {
                            z = z2;
                        }
                        i5++;
                        m1Var = m1Var3;
                    }
                    if (z) {
                        k1Var.b();
                        ((com.gamericefishpro.space.i9.l1) k1Var.e).y(i4, (com.gamericefishpro.space.i9.n1) m1Var2.e());
                        arrayList.set(i3, (com.gamericefishpro.space.i9.l1) k1Var.e());
                    }
                    i4++;
                    m4Var = m4Var2;
                    d2Var2 = d2Var3;
                }
            }
            com.gamericefishpro.space.i9.d2 d2Var4 = d2Var2;
            m4 m4Var3 = m4Var;
            if (((com.gamericefishpro.space.i9.l1) k1Var.e).s() != 0) {
                for (int i6 = 0; i6 < ((com.gamericefishpro.space.i9.l1) k1Var.e).s(); i6++) {
                    com.gamericefishpro.space.i9.u1 u1VarT = ((com.gamericefishpro.space.i9.l1) k1Var.e).t(i6);
                    String strG3 = f2.g(u1VarT.r(), f2.i, f2.j);
                    if (strG3 != null) {
                        com.gamericefishpro.space.i9.t1 t1Var = (com.gamericefishpro.space.i9.t1) u1VarT.i();
                        t1Var.b();
                        ((com.gamericefishpro.space.i9.u1) t1Var.e).y(strG3);
                        k1Var.b();
                        ((com.gamericefishpro.space.i9.l1) k1Var.e).x(i6, (com.gamericefishpro.space.i9.u1) t1Var.e());
                        arrayList.set(i3, (com.gamericefishpro.space.i9.l1) k1Var.e());
                    }
                }
            }
            i3++;
            eVar = eVar2;
            m4Var = m4Var3;
            d2Var2 = d2Var4;
        }
        com.gamericefishpro.space.i9.d2 d2Var5 = d2Var2;
        com.gamericefishpro.space.t.e eVar3 = eVar;
        m4 m4Var4 = m4Var;
        mVar.s();
        mVar.r();
        com.gamericefishpro.space.v8.c0.d(str);
        SQLiteDatabase sQLiteDatabaseG0 = mVar.g0();
        sQLiteDatabaseG0.beginTransaction();
        try {
            mVar.s();
            mVar.r();
            com.gamericefishpro.space.v8.c0.d(str);
            SQLiteDatabase sQLiteDatabaseG1 = mVar.g0();
            sQLiteDatabaseG1.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseG1.delete("event_filters", "app_id=?", new String[]{str});
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                try {
                    int i8 = i7 + 1;
                    com.gamericefishpro.space.i9.l1 l1Var = (com.gamericefishpro.space.i9.l1) arrayList.get(i7);
                    mVar.s();
                    mVar.r();
                    com.gamericefishpro.space.v8.c0.d(str);
                    com.gamericefishpro.space.v8.c0.g(l1Var);
                    if (l1Var.p()) {
                        int iQ = l1Var.q();
                        Iterator it = l1Var.u().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                Iterator it2 = l1Var.r().iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        Iterator it3 = l1Var.u().iterator();
                                        while (true) {
                                            boolean zHasNext = it3.hasNext();
                                            Iterator it4 = it3;
                                            String str4 = "filter_id";
                                            sQLiteDatabase = sQLiteDatabaseG0;
                                            i = size;
                                            String str5 = "app_id";
                                            if (!zHasNext) {
                                                i2 = i8;
                                                Iterator it5 = l1Var.r().iterator();
                                                while (it5.hasNext()) {
                                                    com.gamericefishpro.space.i9.u1 u1Var = (com.gamericefishpro.space.i9.u1) it5.next();
                                                    mVar.s();
                                                    mVar.r();
                                                    com.gamericefishpro.space.v8.c0.d(str);
                                                    com.gamericefishpro.space.v8.c0.g(u1Var);
                                                    if (u1Var.r().isEmpty()) {
                                                        v0 v0Var = r1Var.y;
                                                        r1.l(v0Var);
                                                        v0Var.B.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", v0.z(str), Integer.valueOf(iQ), String.valueOf(u1Var.p() ? Integer.valueOf(u1Var.q()) : null));
                                                    } else {
                                                        byte[] bArrA2 = u1Var.a();
                                                        Iterator it6 = it5;
                                                        ContentValues contentValues = new ContentValues();
                                                        contentValues.put(str5, str);
                                                        String str6 = str5;
                                                        contentValues.put("audience_id", Integer.valueOf(iQ));
                                                        contentValues.put(str4, u1Var.p() ? Integer.valueOf(u1Var.q()) : null);
                                                        String str7 = str4;
                                                        contentValues.put("property_name", u1Var.r());
                                                        contentValues.put("session_scoped", u1Var.v() ? Boolean.valueOf(u1Var.w()) : null);
                                                        contentValues.put("data", bArrA2);
                                                        try {
                                                            if (mVar.g0().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                                                                v0 v0Var2 = r1Var.y;
                                                                r1.l(v0Var2);
                                                                v0Var2.y.b(v0.z(str), "Failed to insert property filter (got -1). appId");
                                                            } else {
                                                                it5 = it6;
                                                                str5 = str6;
                                                                str4 = str7;
                                                            }
                                                        } catch (SQLiteException e) {
                                                            v0 v0Var3 = r1Var.y;
                                                            r1.l(v0Var3);
                                                            v0Var3.y.c("Error storing property filter. appId", v0.z(str), e);
                                                        }
                                                    }
                                                }
                                                break;
                                            }
                                            try {
                                                com.gamericefishpro.space.i9.n1 n1Var = (com.gamericefishpro.space.i9.n1) it4.next();
                                                mVar.s();
                                                mVar.r();
                                                com.gamericefishpro.space.v8.c0.d(str);
                                                com.gamericefishpro.space.v8.c0.g(n1Var);
                                                if (n1Var.r().isEmpty()) {
                                                    v0 v0Var4 = r1Var.y;
                                                    r1.l(v0Var4);
                                                    v0Var4.B.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", v0.z(str), Integer.valueOf(iQ), String.valueOf(n1Var.p() ? Integer.valueOf(n1Var.q()) : null));
                                                    i2 = i8;
                                                } else {
                                                    com.gamericefishpro.space.i9.l1 l1Var2 = l1Var;
                                                    byte[] bArrA3 = n1Var.a();
                                                    i2 = i8;
                                                    ContentValues contentValues2 = new ContentValues();
                                                    contentValues2.put("app_id", str);
                                                    contentValues2.put("audience_id", Integer.valueOf(iQ));
                                                    contentValues2.put("filter_id", n1Var.p() ? Integer.valueOf(n1Var.q()) : null);
                                                    contentValues2.put("event_name", n1Var.r());
                                                    contentValues2.put("session_scoped", n1Var.z() ? Boolean.valueOf(n1Var.A()) : null);
                                                    contentValues2.put("data", bArrA3);
                                                    try {
                                                        if (mVar.g0().insertWithOnConflict("event_filters", null, contentValues2, 5) == -1) {
                                                            v0 v0Var5 = r1Var.y;
                                                            r1.l(v0Var5);
                                                            v0Var5.y.b(v0.z(str), "Failed to insert event filter (got -1). appId");
                                                        }
                                                        it3 = it4;
                                                        sQLiteDatabaseG0 = sQLiteDatabase;
                                                        size = i;
                                                        l1Var = l1Var2;
                                                        i8 = i2;
                                                    } catch (SQLiteException e2) {
                                                        v0 v0Var6 = r1Var.y;
                                                        r1.l(v0Var6);
                                                        v0Var6.y.c("Error storing event filter. appId", v0.z(str), e2);
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                sQLiteDatabase.endTransaction();
                                                throw th;
                                            }
                                            mVar.s();
                                            mVar.r();
                                            com.gamericefishpro.space.v8.c0.d(str);
                                            SQLiteDatabase sQLiteDatabaseG2 = mVar.g0();
                                            sQLiteDatabaseG2.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iQ)});
                                            sQLiteDatabaseG2.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iQ)});
                                            break;
                                        }
                                        sQLiteDatabaseG0 = sQLiteDatabase;
                                        size = i;
                                        i7 = i2;
                                        break;
                                    }
                                    if (!((com.gamericefishpro.space.i9.u1) it2.next()).p()) {
                                        v0 v0Var7 = r1Var.y;
                                        r1.l(v0Var7);
                                        v0Var7.B.c("Property filter with no ID. Audience definition ignored. appId, audienceId", v0.z(str), Integer.valueOf(iQ));
                                    }
                                }
                            } else if (!((com.gamericefishpro.space.i9.n1) it.next()).p()) {
                                v0 v0Var8 = r1Var.y;
                                r1.l(v0Var8);
                                v0Var8.B.c("Event filter with no ID. Audience definition ignored. appId, audienceId", v0.z(str), Integer.valueOf(iQ));
                            }
                        }
                    } else {
                        v0 v0Var9 = r1Var.y;
                        r1.l(v0Var9);
                        v0Var9.B.b(v0.z(str), "Audience with no ID. appId");
                    }
                    i7 = i8;
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabase = sQLiteDatabaseG0;
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            }
            sQLiteDatabase = sQLiteDatabaseG0;
            ArrayList arrayList2 = new ArrayList();
            int size2 = arrayList.size();
            int i9 = 0;
            while (i9 < size2) {
                Object obj = arrayList.get(i9);
                i9++;
                com.gamericefishpro.space.i9.l1 l1Var3 = (com.gamericefishpro.space.i9.l1) obj;
                arrayList2.add(l1Var3.p() ? Integer.valueOf(l1Var3.q()) : null);
            }
            com.gamericefishpro.space.v8.c0.d(str);
            mVar.s();
            mVar.r();
            SQLiteDatabase sQLiteDatabaseG3 = mVar.g0();
            try {
                long jB0 = mVar.b0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int iMax = Math.max(0, Math.min(2000, r1Var.v.z(str, e0.U)));
                if (jB0 > iMax) {
                    ArrayList arrayList3 = new ArrayList();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList2.size()) {
                            String strJoin = TextUtils.join(",", arrayList3);
                            StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
                            sb.append("(");
                            sb.append(strJoin);
                            sb.append(")");
                            String string = sb.toString();
                            StringBuilder sb2 = new StringBuilder(string.length() + 140);
                            sb2.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb2.append(string);
                            sb2.append(" order by rowid desc limit -1 offset ?)");
                            sQLiteDatabaseG3.delete("audience_filter_values", sb2.toString(), new String[]{str, Integer.toString(iMax)});
                            break;
                        }
                        Integer num = (Integer) arrayList2.get(i10);
                        if (num == null) {
                            break;
                        }
                        arrayList3.add(Integer.toString(num.intValue()));
                        i10++;
                    }
                }
            } catch (SQLiteException e3) {
                v0 v0Var10 = r1Var.y;
                r1.l(v0Var10);
                v0Var10.y.c("Database error querying filters. appId", v0.z(str), e3);
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            try {
                d2Var5.b();
                d2Var = d2Var5;
                try {
                    ((com.gamericefishpro.space.i9.e2) d2Var.e).I();
                    bArrA = ((com.gamericefishpro.space.i9.e2) d2Var.e()).a();
                } catch (RuntimeException e4) {
                    e = e4;
                    v0 v0Var11 = ((r1) this.d).y;
                    r1.l(v0Var11);
                    v0Var11.B.c("Unable to serialize reduced-size config. Storing full config instead. appId", v0.z(str), e);
                    bArrA = bArr;
                }
            } catch (RuntimeException e5) {
                e = e5;
                d2Var = d2Var5;
            }
            m mVar2 = m4Var4.i;
            m4.T(mVar2);
            r1 r1Var2 = (r1) mVar2.d;
            com.gamericefishpro.space.v8.c0.d(str);
            mVar2.r();
            mVar2.s();
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("remote_config", bArrA);
            contentValues3.put("config_last_modified_time", str2);
            contentValues3.put("e_tag", str3);
            try {
                if (mVar2.g0().update("apps", contentValues3, "app_id = ?", new String[]{str}) == 0) {
                    v0 v0Var12 = r1Var2.y;
                    r1.l(v0Var12);
                    v0Var12.y.b(v0.z(str), "Failed to update remote config (got 0). appId");
                }
            } catch (SQLiteException e6) {
                v0 v0Var13 = r1Var2.y;
                r1.l(v0Var13);
                v0Var13.y.c("Error storing remote config. appId", v0.z(str), e6);
            }
            d2Var.b();
            ((com.gamericefishpro.space.i9.e2) d2Var.e).J();
            eVar3.put(str, (com.gamericefishpro.space.i9.e2) d2Var.e());
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase = sQLiteDatabaseG0;
        }
    }

    public final boolean G(String str, String str2) {
        Boolean bool;
        r();
        x(str);
        if ("1".equals(b(str, "measurement.upload.blacklist_internal")) && r4.P(str2)) {
            return true;
        }
        if ("1".equals(b(str, "measurement.upload.blacklist_public")) && r4.p0(str2)) {
            return true;
        }
        Map map = (Map) this.y.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean H(String str, String str2) {
        Boolean bool;
        r();
        x(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.z.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final int I(String str, String str2) {
        Integer num;
        r();
        x(str);
        Map map = (Map) this.B.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean J(String str) {
        r();
        x(str);
        com.gamericefishpro.space.t.e eVar = this.w;
        if (eVar.get(str) != null) {
            return ((Set) eVar.get(str)).contains("os_version") || ((Set) eVar.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean K(String str) {
        r();
        x(str);
        com.gamericefishpro.space.t.e eVar = this.w;
        return eVar.get(str) != null && ((Set) eVar.get(str)).contains("app_instance_id");
    }

    public final boolean L(String str, d2 d2Var) {
        r();
        x(str);
        com.gamericefishpro.space.i9.z1 z1VarM = M(str);
        if (z1VarM == null) {
            return false;
        }
        for (com.gamericefishpro.space.i9.w1 w1Var : z1VarM.p()) {
            if (d2Var == C(w1Var.p())) {
                return w1Var.q() == 2;
            }
        }
        return false;
    }

    public final com.gamericefishpro.space.i9.z1 M(String str) {
        r();
        x(str);
        com.gamericefishpro.space.i9.e2 e2VarD = D(str);
        if (e2VarD == null || !e2VarD.B()) {
            return null;
        }
        return e2VarD.C();
    }

    @Override // com.gamericefishpro.space.n9.f
    public final String b(String str, String str2) {
        r();
        x(str);
        Map map = (Map) this.v.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final b2 v(String str, d2 d2Var) {
        r();
        x(str);
        com.gamericefishpro.space.i9.z1 z1VarM = M(str);
        if (z1VarM != null) {
            for (com.gamericefishpro.space.i9.w1 w1Var : z1VarM.u()) {
                if (C(w1Var.p()) == d2Var) {
                    int iQ = w1Var.q() - 1;
                    if (iQ == 1) {
                        return b2.GRANTED;
                    }
                    if (iQ != 2) {
                        break;
                    }
                    return b2.DENIED;
                }
            }
        }
        return b2.UNINITIALIZED;
    }

    public final boolean w(String str) {
        r();
        x(str);
        com.gamericefishpro.space.i9.z1 z1VarM = M(str);
        if (z1VarM == null) {
            return false;
        }
        for (com.gamericefishpro.space.i9.w1 w1Var : z1VarM.p()) {
            if (w1Var.p() == 3 && w1Var.r() == 3) {
                return true;
            }
        }
        return false;
    }

    public final void x(String str) {
        s();
        r();
        com.gamericefishpro.space.v8.c0.d(str);
        com.gamericefishpro.space.t.e eVar = this.A;
        if (eVar.get(str) == null) {
            m mVar = this.e.i;
            m4.T(mVar);
            com.gamericefishpro.space.a8.c cVarX0 = mVar.x0(str);
            com.gamericefishpro.space.t.e eVar2 = this.G;
            com.gamericefishpro.space.t.e eVar3 = this.F;
            com.gamericefishpro.space.t.e eVar4 = this.E;
            com.gamericefishpro.space.t.e eVar5 = this.v;
            if (cVarX0 != null) {
                com.gamericefishpro.space.i9.d2 d2Var = (com.gamericefishpro.space.i9.d2) A(str, (byte[]) cVarX0.e).i();
                y(str, d2Var);
                eVar5.put(str, B((com.gamericefishpro.space.i9.e2) d2Var.e()));
                eVar.put(str, (com.gamericefishpro.space.i9.e2) d2Var.e());
                z(str, (com.gamericefishpro.space.i9.e2) d2Var.e());
                eVar4.put(str, ((com.gamericefishpro.space.i9.e2) d2Var.e).A());
                eVar3.put(str, (String) cVarX0.v);
                eVar2.put(str, (String) cVarX0.i);
                return;
            }
            eVar5.put(str, null);
            this.y.put(str, null);
            this.w.put(str, null);
            this.z.put(str, null);
            eVar.put(str, null);
            eVar4.put(str, null);
            eVar3.put(str, null);
            eVar2.put(str, null);
            this.B.put(str, null);
        }
    }

    public final void y(String str, com.gamericefishpro.space.i9.d2 d2Var) {
        r1 r1Var = (r1) this.d;
        HashSet hashSet = new HashSet();
        com.gamericefishpro.space.t.e eVar = new com.gamericefishpro.space.t.e(0);
        com.gamericefishpro.space.t.e eVar2 = new com.gamericefishpro.space.t.e(0);
        com.gamericefishpro.space.t.e eVar3 = new com.gamericefishpro.space.t.e(0);
        Iterator it = Collections.unmodifiableList(((com.gamericefishpro.space.i9.e2) d2Var.e).z()).iterator();
        while (it.hasNext()) {
            hashSet.add(((com.gamericefishpro.space.i9.a2) it.next()).p());
        }
        for (int i = 0; i < ((com.gamericefishpro.space.i9.e2) d2Var.e).u(); i++) {
            com.gamericefishpro.space.i9.b2 b2Var = (com.gamericefishpro.space.i9.b2) ((com.gamericefishpro.space.i9.e2) d2Var.e).v(i).i();
            if (b2Var.h().isEmpty()) {
                v0 v0Var = r1Var.y;
                r1.l(v0Var);
                v0Var.B.a("EventConfig contained null event name");
            } else {
                String strH = b2Var.h();
                String strG = f2.g(b2Var.h(), f2.a, f2.c);
                if (!TextUtils.isEmpty(strG)) {
                    b2Var.b();
                    ((com.gamericefishpro.space.i9.c2) b2Var.e).w(strG);
                    d2Var.b();
                    ((com.gamericefishpro.space.i9.e2) d2Var.e).H(i, (com.gamericefishpro.space.i9.c2) b2Var.e());
                }
                if (((com.gamericefishpro.space.i9.c2) b2Var.e).q() && ((com.gamericefishpro.space.i9.c2) b2Var.e).r()) {
                    eVar.put(strH, Boolean.TRUE);
                }
                if (((com.gamericefishpro.space.i9.c2) b2Var.e).s() && ((com.gamericefishpro.space.i9.c2) b2Var.e).t()) {
                    eVar2.put(b2Var.h(), Boolean.TRUE);
                }
                if (((com.gamericefishpro.space.i9.c2) b2Var.e).u()) {
                    if (((com.gamericefishpro.space.i9.c2) b2Var.e).v() < 2 || ((com.gamericefishpro.space.i9.c2) b2Var.e).v() > 65535) {
                        v0 v0Var2 = r1Var.y;
                        r1.l(v0Var2);
                        v0Var2.B.c("Invalid sampling rate. Event name, sample rate", b2Var.h(), Integer.valueOf(((com.gamericefishpro.space.i9.c2) b2Var.e).v()));
                    } else {
                        eVar3.put(b2Var.h(), Integer.valueOf(((com.gamericefishpro.space.i9.c2) b2Var.e).v()));
                    }
                }
            }
        }
        this.w.put(str, hashSet);
        this.y.put(str, eVar);
        this.z.put(str, eVar2);
        this.B.put(str, eVar3);
    }

    public final void z(String str, com.gamericefishpro.space.i9.e2 e2Var) {
        r1 r1Var = (r1) this.d;
        int iY = e2Var.y();
        i1 i1Var = this.C;
        if (iY == 0) {
            i1Var.h(str);
            return;
        }
        v0 v0Var = r1Var.y;
        r1.l(v0Var);
        v0Var.G.b(Integer.valueOf(e2Var.y()), "EES programs found");
        com.gamericefishpro.space.i9.u3 u3Var = (com.gamericefishpro.space.i9.u3) e2Var.x().get(0);
        try {
            com.gamericefishpro.space.i9.d0 d0Var = new com.gamericefishpro.space.i9.d0();
            com.gamericefishpro.space.u6.i iVar = d0Var.a;
            ((HashMap) ((v5) iVar.d).d).put("internal.remoteConfig", new j1(this, str, 2));
            ((HashMap) ((v5) iVar.d).d).put("internal.appMetadata", new j1(this, str, 0));
            ((HashMap) ((v5) iVar.d).d).put("internal.logger", new k1(0, this));
            d0Var.b(u3Var);
            i1Var.g(str, d0Var);
            r1.l(v0Var);
            t0 t0Var = v0Var.G;
            t0Var.c("EES program loaded for appId, activities", str, Integer.valueOf(u3Var.q().q()));
            for (com.gamericefishpro.space.i9.t3 t3Var : u3Var.q().p()) {
                r1.l(v0Var);
                t0Var.b(t3Var.p(), "EES program activity");
            }
        } catch (com.gamericefishpro.space.i9.p0 unused) {
            v0 v0Var2 = r1Var.y;
            r1.l(v0Var2);
            v0Var2.y.b(str, "Failed to load EES program. appId");
        }
    }

    @Override // com.gamericefishpro.space.n9.g4
    public final void u() {
    }
}
