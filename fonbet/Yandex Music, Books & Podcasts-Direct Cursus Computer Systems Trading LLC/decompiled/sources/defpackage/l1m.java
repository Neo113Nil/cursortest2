package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class l1m implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;

    public /* synthetic */ l1m(String str, long j) {
        this.a = 3;
        this.c = str;
        this.b = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        cko D0;
        switch (this.a) {
            case 0:
                long j = this.b;
                String str = this.c;
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                D0 = xjoVar.D0("SELECT _id FROM playlist_track WHERE playlist_id = ? AND track_id = ?");
                try {
                    D0.bindLong(1, j);
                    D0.E(2, str);
                    ArrayList arrayList = new ArrayList();
                    while (D0.q()) {
                        arrayList.add(Long.valueOf(D0.getLong(0)));
                    }
                    return arrayList;
                } finally {
                }
            case 1:
                long j2 = this.b;
                String str2 = this.c;
                xjo xjoVar2 = (xjo) obj;
                xjoVar2.getClass();
                D0 = xjoVar2.D0("SELECT _id FROM playlist_track WHERE playlist_id = ? AND track_id = ?");
                try {
                    D0.bindLong(1, j2);
                    D0.E(2, str2);
                    ArrayList arrayList2 = new ArrayList();
                    while (D0.q()) {
                        arrayList2.add(Long.valueOf(D0.getLong(0)));
                    }
                    return arrayList2;
                } finally {
                }
            case 2:
                long j3 = this.b;
                String str3 = this.c;
                xjo xjoVar3 = (xjo) obj;
                xjoVar3.getClass();
                D0 = xjoVar3.D0("SELECT EXISTS(SELECT * FROM playlist_track WHERE playlist_id=? AND track_id=?)");
                try {
                    D0.bindLong(1, j3);
                    D0.E(2, str3);
                    boolean z = false;
                    if (D0.q()) {
                        z = ((int) D0.getLong(0)) != 0;
                    }
                    D0.close();
                    return Boolean.valueOf(z);
                } finally {
                }
            case 3:
                String str4 = this.c;
                long j4 = this.b;
                xjo xjoVar4 = (xjo) obj;
                xjoVar4.getClass();
                D0 = xjoVar4.D0("UPDATE playlist SET cover_info=? WHERE _id=?");
                try {
                    D0.E(1, str4);
                    D0.bindLong(2, j4);
                    D0.q();
                    D0.close();
                    return Unit.a;
                } finally {
                }
            case 4:
                String str5 = this.c;
                kn0 kn0Var = (kn0) obj;
                kn0Var.getClass();
                int g = kn0Var.g(new c4r(this.b, 0L, (tqc) null, (oqc) null, (pqc) null, (qpc) null, (String) null, 0L, (wu2) null, (ccs) null, (bqg) null, 0L, (aas) null, (otp) null, 65534));
                try {
                    kn0Var.d(str5);
                    kn0Var.f(g);
                    return Unit.a;
                } catch (Throwable th) {
                    kn0Var.f(g);
                    throw th;
                }
            case 5:
                long j5 = this.b;
                String str6 = this.c;
                xjo xjoVar5 = (xjo) obj;
                xjoVar5.getClass();
                D0 = xjoVar5.D0("UPDATE workspec SET schedule_requested_at=? WHERE id=?");
                try {
                    D0.bindLong(1, j5);
                    D0.E(2, str6);
                    D0.q();
                    int L = gut.L(xjoVar5);
                    D0.close();
                    return Integer.valueOf(L);
                } finally {
                }
            default:
                long j6 = this.b;
                String str7 = this.c;
                xjo xjoVar6 = (xjo) obj;
                xjoVar6.getClass();
                D0 = xjoVar6.D0("UPDATE workspec SET last_enqueue_time=? WHERE id=?");
                try {
                    D0.bindLong(1, j6);
                    D0.E(2, str7);
                    D0.q();
                    D0.close();
                    return Unit.a;
                } finally {
                }
        }
    }

    public /* synthetic */ l1m(String str, int i, long j) {
        this.a = i;
        this.b = j;
        this.c = str;
    }
}
