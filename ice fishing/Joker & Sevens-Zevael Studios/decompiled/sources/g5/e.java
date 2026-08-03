package g5;

import bc.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e extends h4.a {

    /* renamed from: b, reason: collision with root package name */
    public final f5.a[] f2523b;

    public e(f5.a... aVarArr) {
        super((int) 3);
        this.f2523b = aVarArr;
    }

    @Override // h4.a
    public final void c(i4.c cVar) {
        j jVar = new j(cVar);
        jVar.a(null, "CREATE TABLE player_data(\n    id INTEGER NOT NULL PRIMARY KEY DEFAULT 1,\n    chips INTEGER NOT NULL DEFAULT 0,\n    total_jokers_collected INTEGER NOT NULL DEFAULT 0,\n    CHECK (id = 1)\n)", null);
        jVar.a(null, "CREATE TABLE high_scores(\n    id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    score INTEGER NOT NULL,\n    chips_earned INTEGER NOT NULL,\n    created_at INTEGER NOT NULL\n)", null);
        jVar.a(null, "CREATE TABLE power_ups(\n    id TEXT NOT NULL PRIMARY KEY,\n    name TEXT NOT NULL,\n    description TEXT NOT NULL,\n    price INTEGER NOT NULL,\n    quantity INTEGER NOT NULL DEFAULT 0\n)", null);
        jVar.a(null, "CREATE TABLE card_skins(\n    id TEXT NOT NULL PRIMARY KEY,\n    name TEXT NOT NULL,\n    skin_type TEXT NOT NULL,\n    price INTEGER NOT NULL,\n    is_purchased INTEGER NOT NULL DEFAULT 0,\n    is_active INTEGER NOT NULL DEFAULT 0\n)", null);
        jVar.a(null, "CREATE TABLE stored_url (\n    id INTEGER PRIMARY KEY,\n    url TEXT NOT NULL\n)", null);
        jVar.a(null, "CREATE TABLE stored_uuid (\n    id INTEGER PRIMARY KEY,\n    uuid TEXT NOT NULL\n)", null);
        f5.e.f2316a.getClass();
    }

    @Override // h4.a
    public final void f(i4.c cVar, int i10, int i11) {
        j jVar = new j(cVar);
        long j3 = i10;
        long j6 = i11;
        f5.a[] aVarArr = (f5.a[]) Arrays.copyOf(this.f2523b, 0);
        pc.j.e(aVarArr, "callbacks");
        ArrayList arrayList = new ArrayList();
        if (aVarArr.length > 0) {
            f5.a aVar = aVarArr[0];
            throw null;
        }
        Iterator it = m.c0(arrayList, new od.a()).iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        if (j3 < j6) {
            if (j3 <= 2 && j6 > 2) {
                jVar.a(null, "CREATE TABLE IF NOT EXISTS stored_url (\n    id INTEGER PRIMARY KEY,\n    url TEXT NOT NULL\n)", null);
                jVar.a(null, "CREATE TABLE IF NOT EXISTS stored_uuid (\n    id INTEGER PRIMARY KEY,\n    uuid TEXT NOT NULL\n)", null);
            }
            f5.e.f2316a.getClass();
        }
        f5.e.f2316a.getClass();
    }
}
