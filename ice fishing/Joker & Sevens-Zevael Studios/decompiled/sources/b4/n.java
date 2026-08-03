package b4;

import android.database.Cursor;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import bc.a0;
import bc.v;
import dd.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n extends h4.a {

    /* renamed from: b, reason: collision with root package name */
    public b f1001b;

    /* renamed from: c, reason: collision with root package name */
    public final m7.g f1002c;

    public n(b bVar, m7.g gVar) {
        super(16);
        this.f1001b = bVar;
        this.f1002c = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[ORIG_RETURN, RETURN] */
    @Override // h4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(i4.c cVar) {
        boolean z10;
        List list;
        Cursor m10 = cVar.m("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            if (m10.moveToFirst()) {
                if (m10.getInt(0) == 0) {
                    z10 = true;
                    m10.close();
                    m7.g.j(cVar);
                    if (!z10) {
                        m r5 = m7.g.r(cVar);
                        if (!r5.f1000c) {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + ((String) r5.f999b));
                        }
                    }
                    cVar.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                    cVar.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1002c.f4957h;
                    list = workDatabase_Impl.f759f;
                    if (list == null) {
                        int size = list.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            ((p4.b) workDatabase_Impl.f759f.get(i10)).getClass();
                        }
                        return;
                    }
                    return;
                }
            }
            z10 = false;
            m10.close();
            m7.g.j(cVar);
            if (!z10) {
            }
            cVar.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            cVar.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
            WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) this.f1002c.f4957h;
            list = workDatabase_Impl2.f759f;
            if (list == null) {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                a0.f(m10, th);
                throw th2;
            }
        }
    }

    @Override // h4.a
    public final void d(i4.c cVar, int i10, int i11) {
        f(cVar, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0067  */
    @Override // h4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(i4.c cVar) {
        boolean z10;
        h hVar;
        Cursor m10 = cVar.m("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            if (m10.moveToFirst()) {
                if (m10.getInt(0) != 0) {
                    z10 = true;
                    m10.close();
                    if (z10) {
                        m r5 = m7.g.r(cVar);
                        if (!r5.f1000c) {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + ((String) r5.f999b));
                        }
                        cVar.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                        cVar.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
                    } else {
                        Cursor l10 = cVar.l(new w("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                        try {
                            String string = l10.moveToFirst() ? l10.getString(0) : null;
                            l10.close();
                            if (!"5181942b9ebc31ce68dacb56c16fd79f".equals(string) && !"ae2044fb577e65ee8bb576ca48a2f06e".equals(string)) {
                                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 5181942b9ebc31ce68dacb56c16fd79f, found: " + string);
                            }
                        } finally {
                        }
                    }
                    m7.g gVar = this.f1002c;
                    ((WorkDatabase_Impl) gVar.f4957h).f754a = cVar;
                    cVar.g("PRAGMA foreign_keys = ON");
                    hVar = ((WorkDatabase_Impl) gVar.f4957h).f757d;
                    hVar.getClass();
                    synchronized (hVar.f977k) {
                        if (hVar.f972f) {
                            Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                        } else {
                            cVar.g("PRAGMA temp_store = MEMORY;");
                            cVar.g("PRAGMA recursive_triggers='ON';");
                            cVar.g("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                            hVar.c(cVar);
                            hVar.f973g = cVar.d("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
                            hVar.f972f = true;
                        }
                    }
                    List list = ((WorkDatabase_Impl) gVar.f4957h).f759f;
                    if (list != null) {
                        int size = list.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            ((p4.b) ((WorkDatabase_Impl) gVar.f4957h).f759f.get(i10)).getClass();
                            cVar.a();
                            try {
                                cVar.g("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - p4.k.f5487a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                                cVar.o();
                                cVar.f();
                            } catch (Throwable th) {
                                cVar.f();
                                throw th;
                            }
                        }
                    }
                    this.f1001b = null;
                    return;
                }
            }
            z10 = false;
            m10.close();
            if (z10) {
            }
            m7.g gVar2 = this.f1002c;
            ((WorkDatabase_Impl) gVar2.f4957h).f754a = cVar;
            cVar.g("PRAGMA foreign_keys = ON");
            hVar = ((WorkDatabase_Impl) gVar2.f4957h).f757d;
            hVar.getClass();
            synchronized (hVar.f977k) {
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x007d A[EDGE_INSN: B:86:0x007d->B:69:0x007d BREAK  A[LOOP:3: B:48:0x001c->B:70:?], SYNTHETIC] */
    @Override // h4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(i4.c cVar, int i10, int i11) {
        Set set;
        Iterable iterable;
        TreeMap treeMap;
        boolean z10;
        b bVar = this.f1001b;
        if (bVar != null) {
            l lVar = bVar.f950d;
            lVar.getClass();
            if (i10 == i11) {
                iterable = v.f1067g;
            } else {
                boolean z11 = i11 > i10;
                ArrayList arrayList = new ArrayList();
                int i12 = i10;
                do {
                    if (z11) {
                        if (i12 >= i11) {
                            iterable = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) lVar.f997a.get(Integer.valueOf(i12));
                        if (treeMap == null) {
                            break;
                        }
                        for (Integer num : z11 ? treeMap.descendingKeySet() : treeMap.keySet()) {
                            if (z11) {
                                int i13 = i12 + 1;
                                pc.j.d(num, "targetVersion");
                                int intValue = num.intValue();
                                if (i13 <= intValue && intValue <= i11) {
                                    Object obj = treeMap.get(num);
                                    pc.j.b(obj);
                                    arrayList.add(obj);
                                    i12 = num.intValue();
                                    z10 = true;
                                    break;
                                }
                            } else {
                                pc.j.d(num, "targetVersion");
                                int intValue2 = num.intValue();
                                if (i11 <= intValue2 && intValue2 < i12) {
                                    Object obj2 = treeMap.get(num);
                                    pc.j.b(obj2);
                                    arrayList.add(obj2);
                                    i12 = num.intValue();
                                    z10 = true;
                                    break;
                                    break;
                                }
                            }
                        }
                        z10 = false;
                    } else {
                        if (i12 <= i11) {
                            iterable = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) lVar.f997a.get(Integer.valueOf(i12));
                        if (treeMap == null) {
                        }
                    }
                } while (z10);
                iterable = null;
            }
            if (iterable != null) {
                cc.c cVar2 = new cc.c(10);
                Cursor m10 = cVar.m("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (m10.moveToNext()) {
                    try {
                        cVar2.add(m10.getString(0));
                    } finally {
                    }
                }
                m10.close();
                ListIterator listIterator = i7.b.n(cVar2).listIterator(0);
                while (true) {
                    cc.a aVar = (cc.a) listIterator;
                    if (!aVar.hasNext()) {
                        break;
                    }
                    String str = (String) aVar.next();
                    pc.j.d(str, "triggerName");
                    if (xc.h.x(str, "room_fts_content_sync_")) {
                        cVar.g("DROP TRIGGER IF EXISTS ".concat(str));
                    }
                }
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    ((c4.a) it.next()).a(cVar);
                }
                m r5 = m7.g.r(cVar);
                if (!r5.f1000c) {
                    throw new IllegalStateException("Migration didn't properly handle: " + ((String) r5.f999b));
                }
                cVar.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                cVar.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
                return;
            }
        }
        b bVar2 = this.f1001b;
        if (bVar2 != null) {
            if (!((i10 <= i11 || !bVar2.f957k) && bVar2.f956j && ((set = bVar2.f958l) == null || !set.contains(Integer.valueOf(i10))))) {
                cVar.g("DROP TABLE IF EXISTS `Dependency`");
                cVar.g("DROP TABLE IF EXISTS `WorkSpec`");
                cVar.g("DROP TABLE IF EXISTS `WorkTag`");
                cVar.g("DROP TABLE IF EXISTS `SystemIdInfo`");
                cVar.g("DROP TABLE IF EXISTS `WorkName`");
                cVar.g("DROP TABLE IF EXISTS `WorkProgress`");
                cVar.g("DROP TABLE IF EXISTS `Preference`");
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1002c.f4957h;
                List list = workDatabase_Impl.f759f;
                if (list != null) {
                    int size = list.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        ((p4.b) workDatabase_Impl.f759f.get(i14)).getClass();
                    }
                }
                m7.g.j(cVar);
                return;
            }
        }
        throw new IllegalStateException("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    @Override // h4.a
    public final void b(i4.c cVar) {
    }
}
