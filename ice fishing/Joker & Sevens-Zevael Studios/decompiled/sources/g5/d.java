package g5;

import android.database.Cursor;
import java.util.ArrayList;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d implements h4.f, k {

    /* renamed from: g, reason: collision with root package name */
    public final String f2520g;

    /* renamed from: h, reason: collision with root package name */
    public final i4.c f2521h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f2522i;

    public d(String str, i4.c cVar, int i10) {
        pc.j.e(str, "sql");
        pc.j.e(cVar, "database");
        this.f2520g = str;
        this.f2521h = cVar;
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(null);
        }
        this.f2522i = arrayList;
    }

    @Override // g5.k
    public final long a() {
        throw new UnsupportedOperationException();
    }

    @Override // h4.f
    public final void b(h4.e eVar) {
        ArrayList arrayList = this.f2522i;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            oc.c cVar = (oc.c) obj;
            pc.j.b(cVar);
            cVar.invoke(eVar);
        }
    }

    @Override // g5.k
    public final void c(String str, int i10) {
        this.f2522i.set(i10, new c(i10, 1, str));
    }

    @Override // h4.f
    public final String d() {
        return this.f2520g;
    }

    @Override // g5.k
    public final void e(int i10, Long l10) {
        this.f2522i.set(i10, new c(i10, 0, l10));
    }

    @Override // g5.k
    public final Object f(oc.c cVar) {
        Cursor l10 = this.f2521h.l(this);
        try {
            Object value = ((f5.e) cVar.invoke(new a(l10))).getValue();
            l10.close();
            return value;
        } finally {
        }
    }

    public final String toString() {
        return this.f2520g;
    }

    @Override // g5.k
    public final void close() {
    }
}
