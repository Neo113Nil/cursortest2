package com.gamericefishpro.space.bb;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.gamericefishpro.space.na.z;
import com.gamericefishpro.space.t0.c2;
import com.google.android.gms.tasks.Task;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements e, c2, com.gamericefishpro.space.i6.n, com.gamericefishpro.space.j8.g, z, com.gamericefishpro.space.p1.i, com.gamericefishpro.space.t0.g, com.gamericefishpro.space.r9.a {
    public final /* synthetic */ int d;

    public /* synthetic */ s(int i) {
        this.d = i;
    }

    @Override // com.gamericefishpro.space.bb.e
    public Object a(com.gamericefishpro.space.b1.d dVar) {
        switch (this.d) {
            case 2:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 3:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 4:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                q qVar = ExecutorsRegistrar.a;
                return com.gamericefishpro.space.cb.k.d;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(dVar);
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                return TransportRegistrar.lambda$getComponents$0(dVar);
            case 9:
                return TransportRegistrar.lambda$getComponents$1(dVar);
            case 10:
                return TransportRegistrar.lambda$getComponents$2(dVar);
        }
    }

    @Override // com.gamericefishpro.space.j8.g
    public Object apply(Object obj) {
        Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorRawQuery.moveToNext()) {
                com.gamericefishpro.space.a8.c cVarA = com.gamericefishpro.space.c8.j.a();
                cVarA.C(cursorRawQuery.getString(1));
                cVarA.i = com.gamericefishpro.space.m8.a.b(cursorRawQuery.getInt(2));
                String string = cursorRawQuery.getString(3);
                cVarA.e = string == null ? null : Base64.decode(string, 0);
                arrayList.add(cVarA.e());
            }
            return arrayList;
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // com.gamericefishpro.space.i6.n
    public void b(com.gamericefishpro.space.i6.m mVar, com.gamericefishpro.space.i6.o oVar, boolean z) {
        switch (this.d) {
            case 13:
                mVar.a(oVar);
                break;
            case 14:
                mVar.d(oVar);
                break;
            case 15:
                mVar.e(oVar);
                break;
            case 16:
                mVar.b();
                break;
            default:
                mVar.c();
                break;
        }
    }

    @Override // com.gamericefishpro.space.t0.c2
    public boolean c() {
        return false;
    }

    @Override // com.gamericefishpro.space.p1.i
    public double d(double d) {
        switch (this.d) {
            case 21:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 22:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case 23:
                float[] fArr = com.gamericefishpro.space.p1.d.a;
                return com.gamericefishpro.space.p1.d.b(com.gamericefishpro.space.p1.d.c, d);
            case 24:
                float[] fArr2 = com.gamericefishpro.space.p1.d.a;
                return com.gamericefishpro.space.p1.d.a(com.gamericefishpro.space.p1.d.c, d);
            case 25:
                float[] fArr3 = com.gamericefishpro.space.p1.d.a;
                return com.gamericefishpro.space.p1.d.d(com.gamericefishpro.space.p1.d.d, d);
            case 26:
                float[] fArr4 = com.gamericefishpro.space.p1.d.a;
                return com.gamericefishpro.space.p1.d.c(com.gamericefishpro.space.p1.d.d, d);
            default:
                return d;
        }
    }

    @Override // com.gamericefishpro.space.r9.a
    public Object e(Task task) {
        return 403;
    }

    @Override // com.gamericefishpro.space.t0.g
    public void cancel() {
    }
}
