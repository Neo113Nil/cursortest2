package y4;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.UUID;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends o6.r {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8734i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p4.n f8735j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f8736k;

    public /* synthetic */ b(p4.n nVar, Object obj, int i10) {
        this.f8734i = i10;
        this.f8735j = nVar;
        this.f8736k = obj;
    }

    @Override // o6.r
    public final void b() {
        WorkDatabase workDatabase;
        switch (this.f8734i) {
            case 0:
                p4.n nVar = this.f8735j;
                workDatabase = nVar.f5495c;
                workDatabase.c();
                try {
                    o6.r.a(nVar, ((UUID) this.f8736k).toString());
                    workDatabase.o();
                    workDatabase.k();
                    p4.h.a(nVar.f5494b, nVar.f5495c, nVar.f5497e);
                    return;
                } finally {
                    workDatabase.k();
                }
            default:
                p4.n nVar2 = this.f8735j;
                workDatabase = nVar2.f5495c;
                workDatabase.c();
                try {
                    ArrayList j3 = workDatabase.t().j((String) this.f8736k);
                    int size = j3.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = j3.get(i10);
                        i10++;
                        o6.r.a(nVar2, (String) obj);
                    }
                    workDatabase.o();
                    return;
                } catch (Throwable th) {
                    throw th;
                }
        }
    }
}
