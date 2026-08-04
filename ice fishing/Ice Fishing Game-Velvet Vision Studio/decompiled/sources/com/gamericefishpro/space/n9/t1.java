package com.gamericefishpro.space.n9;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ t4 e;
    public final /* synthetic */ y1 i;

    public /* synthetic */ t1(y1 y1Var, t4 t4Var, int i) {
        this.d = i;
        this.e = t4Var;
        this.i = y1Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                y1 y1Var = this.i;
                y1Var.d.B();
                y1Var.d.X(this.e);
                break;
            case 1:
                y1 y1Var2 = this.i;
                y1Var2.d.B();
                m4 m4Var = y1Var2.d;
                m4Var.c().r();
                m4Var.k0();
                t4 t4Var = this.e;
                com.gamericefishpro.space.v8.c0.g(t4Var);
                String str = t4Var.d;
                com.gamericefishpro.space.v8.c0.d(str);
                int i = 0;
                if (m4Var.d0().B(null, e0.z0)) {
                    m4Var.e().getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int iZ = m4Var.d0().z(null, e0.i0);
                    m4Var.d0();
                    long jLongValue = jCurrentTimeMillis - ((Long) e0.e.a(null)).longValue();
                    while (i < iZ && m4Var.I(null, jLongValue)) {
                        i++;
                    }
                } else {
                    m4Var.d0();
                    long jIntValue = ((Integer) e0.l.a(null)).intValue();
                    while (i < jIntValue && m4Var.I(str, 0L)) {
                        i++;
                    }
                }
                if (m4Var.d0().B(null, e0.A0)) {
                    m4Var.c().r();
                    m4Var.H();
                }
                i4 i4Var = m4Var.C;
                int iA = com.gamericefishpro.space.m5.a.a(t4Var.X);
                i4Var.r();
                if (iA == 2 && !i4.u(str)) {
                    l1 l1Var = i4Var.e.d;
                    m4.T(l1Var);
                    com.gamericefishpro.space.i9.e2 e2VarD = l1Var.D(str);
                    if (e2VarD != null && e2VarD.D() && !e2VarD.E().q().isEmpty()) {
                        m4Var.a().G.b(str, "[sgtm] Going background, trigger client side upload. appId");
                        m4Var.e().getClass();
                        m4Var.r(str, System.currentTimeMillis());
                        break;
                    }
                }
                break;
            case 2:
                y1 y1Var3 = this.i;
                y1Var3.d.B();
                m4 m4Var2 = y1Var3.d;
                m4Var2.c().r();
                m4Var2.k0();
                t4 t4Var2 = this.e;
                com.gamericefishpro.space.v8.c0.d(t4Var2.d);
                m4Var2.b0(t4Var2);
                break;
            case 3:
                y1 y1Var4 = this.i;
                y1Var4.d.B();
                m4 m4Var3 = y1Var4.d;
                if (m4Var3.R != null) {
                    ArrayList arrayList = new ArrayList();
                    m4Var3.S = arrayList;
                    arrayList.addAll(m4Var3.R);
                }
                m mVar = m4Var3.i;
                m4.T(mVar);
                r1 r1Var = (r1) mVar.d;
                t4 t4Var3 = this.e;
                String str2 = t4Var3.d;
                com.gamericefishpro.space.v8.c0.g(str2);
                com.gamericefishpro.space.v8.c0.d(str2);
                mVar.r();
                mVar.s();
                try {
                    SQLiteDatabase sQLiteDatabaseG0 = mVar.g0();
                    String[] strArr = {str2};
                    int iDelete = sQLiteDatabaseG0.delete("apps", "app_id=?", strArr) + sQLiteDatabaseG0.delete("events", "app_id=?", strArr) + sQLiteDatabaseG0.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseG0.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseG0.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseG0.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseG0.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseG0.delete("queue", "app_id=?", strArr) + sQLiteDatabaseG0.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseG0.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseG0.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseG0.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseG0.delete("upload_queue", "app_id=?", strArr);
                    if (r1Var.v.B(null, e0.h1)) {
                        iDelete += sQLiteDatabaseG0.delete("no_data_mode_events", "app_id=?", strArr);
                    }
                    if (iDelete > 0) {
                        v0 v0Var = r1Var.y;
                        r1.l(v0Var);
                        v0Var.G.c("Reset analytics data. app, records", str2, Integer.valueOf(iDelete));
                    }
                } catch (SQLiteException e) {
                    v0 v0Var2 = r1Var.y;
                    r1.l(v0Var2);
                    v0Var2.y.c("Error resetting analytics data. appId, error", v0.z(str2), e);
                }
                if (t4Var3.A) {
                    m4Var3.X(t4Var3);
                }
                break;
            case 4:
                y1 y1Var5 = this.i;
                y1Var5.d.B();
                m4 m4Var4 = y1Var5.d;
                m4Var4.c().r();
                m4Var4.k0();
                t4 t4Var4 = this.e;
                com.gamericefishpro.space.v8.c0.d(t4Var4.d);
                m4Var4.l0(t4Var4);
                m4Var4.m0(t4Var4);
                break;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                m4 m4Var5 = this.i.d;
                m4Var5.B();
                m4Var5.m0(this.e);
                break;
            default:
                m4 m4Var6 = this.i.d;
                m4Var6.B();
                m4Var6.l0(this.e);
                break;
        }
    }
}
