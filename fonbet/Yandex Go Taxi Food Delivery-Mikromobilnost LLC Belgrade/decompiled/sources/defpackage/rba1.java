package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.r;
import com.google.android.gms.internal.measurement.zzin;
import com.google.android.gms.measurement.internal.b;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.n;
import com.google.android.gms.measurement.internal.zzjd;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes11.dex */
public final class rba1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzr b;
    public final /* synthetic */ zzjd c;

    public /* synthetic */ rba1(zzjd zzjdVar, zzr zzrVar, int i) {
        this.a = i;
        this.b = zzrVar;
        this.c = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zzr zzrVar = this.b;
        zzjd zzjdVar = this.c;
        switch (i) {
            case 0:
                zzjdVar.zzL().w();
                n zzL = zzjdVar.zzL();
                zzL.M1().Gg();
                zzL.f0();
                cvw.l(zzrVar);
                String str = zzrVar.zza;
                cvw.i(str);
                int i2 = 0;
                if (zzL.Y().Qg(null, nw91.z0)) {
                    ((kl40) zzL.q4()).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    int Og = zzL.Y().Og(null, nw91.i0);
                    zzL.Y();
                    long longValue = currentTimeMillis - ((Long) nw91.e.a(null)).longValue();
                    while (i2 < Og && zzL.D(longValue, null)) {
                        i2++;
                    }
                } else {
                    zzL.Y();
                    long intValue = ((Integer) nw91.l.a(null)).intValue();
                    while (i2 < intValue && zzL.D(0L, str)) {
                        i2++;
                    }
                }
                if (zzL.Y().Qg(null, nw91.A0)) {
                    zzL.M1().Gg();
                    zzL.C();
                }
                yab1 yab1Var = zzL.C;
                zzin a = zzin.a(zzrVar.zzE);
                yab1Var.Gg();
                if (a == zzin.CLIENT_UPLOAD_ELIGIBLE && !yab1.Jg(str)) {
                    p8a1 p8a1Var = yab1Var.c.a;
                    n.O(p8a1Var);
                    r Sg = p8a1Var.Sg(str);
                    if (Sg != null && Sg.F() && !Sg.G().s().isEmpty()) {
                        zzL.B0().H.b(str, "[sgtm] Going background, trigger client side upload. appId");
                        ((kl40) zzL.q4()).getClass();
                        zzL.m(System.currentTimeMillis(), str);
                        break;
                    }
                }
                break;
            default:
                zzjdVar.zzL().w();
                n zzL2 = zzjdVar.zzL();
                if (zzL2.R != null) {
                    ArrayList arrayList = new ArrayList();
                    zzL2.S = arrayList;
                    arrayList.addAll(zzL2.R);
                }
                b bVar = zzL2.c;
                n.O(bVar);
                g gVar = (g) bVar.b;
                String str2 = zzrVar.zza;
                cvw.l(str2);
                cvw.i(str2);
                bVar.Gg();
                bVar.Hg();
                try {
                    SQLiteDatabase vh = bVar.vh();
                    String[] strArr = {str2};
                    int delete = vh.delete(ClidProvider.APPS_TABLE_NAME, "app_id=?", strArr) + vh.delete("events", "app_id=?", strArr) + vh.delete("events_snapshot", "app_id=?", strArr) + vh.delete("user_attributes", "app_id=?", strArr) + vh.delete("conditional_properties", "app_id=?", strArr) + vh.delete("raw_events", "app_id=?", strArr) + vh.delete("raw_events_metadata", "app_id=?", strArr) + vh.delete("queue", "app_id=?", strArr) + vh.delete("audience_filter_values", "app_id=?", strArr) + vh.delete("main_event_params", "app_id=?", strArr) + vh.delete("default_event_params", "app_id=?", strArr) + vh.delete("trigger_uris", "app_id=?", strArr) + vh.delete("upload_queue", "app_id=?", strArr);
                    ((neb1) feb1.b.a.get()).getClass();
                    if (gVar.w.Qg(null, nw91.h1)) {
                        delete += vh.delete("no_data_mode_events", "app_id=?", strArr);
                    }
                    if (delete > 0) {
                        y1a1 y1a1Var = gVar.y;
                        g.g(y1a1Var);
                        y1a1Var.H.c("Reset analytics data. app, records", str2, Integer.valueOf(delete));
                    }
                } catch (SQLiteException e) {
                    y1a1 y1a1Var2 = gVar.y;
                    g.g(y1a1Var2);
                    y1a1Var2.z.c("Error resetting analytics data. appId, error", y1a1.Og(str2), e);
                }
                if (zzrVar.zzh) {
                    zzL2.S(zzrVar);
                    break;
                }
                break;
        }
    }
}
