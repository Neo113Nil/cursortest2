package w0;

import S0.f;
import android.database.Cursor;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;
import v7.q;
import w7.C5159f;
import w7.C5162i;
import z0.C5247c;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f41645a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f41646b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractSet f41647c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractSet f41648d;

    public e(String str, Map map, AbstractSet foreignKeys, AbstractSet abstractSet) {
        h.e(foreignKeys, "foreignKeys");
        this.f41645a = str;
        this.f41646b = map;
        this.f41647c = foreignKeys;
        this.f41648d = abstractSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x01db, code lost:
    
        r9 = A8.b.c(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01df, code lost:
    
        r3.close();
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final e a(C5247c c5247c, String str) {
        Map c9;
        Cursor E8 = c5247c.E("PRAGMA table_info(`" + str + "`)");
        try {
            if (E8.getColumnCount() <= 0) {
                c9 = q.f41443n;
                E8.close();
            } else {
                int columnIndex = E8.getColumnIndex("name");
                int columnIndex2 = E8.getColumnIndex("type");
                int columnIndex3 = E8.getColumnIndex("notnull");
                int columnIndex4 = E8.getColumnIndex("pk");
                int columnIndex5 = E8.getColumnIndex("dflt_value");
                C5159f c5159f = new C5159f();
                while (E8.moveToNext()) {
                    String name = E8.getString(columnIndex);
                    String type = E8.getString(columnIndex2);
                    boolean z3 = E8.getInt(columnIndex3) != 0;
                    int i = E8.getInt(columnIndex4);
                    String string = E8.getString(columnIndex5);
                    h.d(name, "name");
                    h.d(type, "type");
                    c5159f.put(name, new C5141a(i, 2, name, type, string, z3));
                }
                c9 = c5159f.c();
                E8.close();
            }
            E8 = c5247c.E("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = E8.getColumnIndex("id");
                int columnIndex7 = E8.getColumnIndex("seq");
                int columnIndex8 = E8.getColumnIndex("table");
                int columnIndex9 = E8.getColumnIndex("on_delete");
                int columnIndex10 = E8.getColumnIndex("on_update");
                List s9 = f.s(E8);
                E8.moveToPosition(-1);
                C5162i c5162i = new C5162i();
                while (E8.moveToNext()) {
                    if (E8.getInt(columnIndex7) == 0) {
                        int i6 = E8.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i9 = columnIndex6;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : s9) {
                            int i10 = columnIndex7;
                            List list = s9;
                            if (((c) obj).f41637n == i6) {
                                arrayList3.add(obj);
                            }
                            columnIndex7 = i10;
                            s9 = list;
                        }
                        int i11 = columnIndex7;
                        List list2 = s9;
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            c cVar = (c) it.next();
                            arrayList.add(cVar.f41639v);
                            arrayList2.add(cVar.f41640w);
                        }
                        String string2 = E8.getString(columnIndex8);
                        h.d(string2, "cursor.getString(tableColumnIndex)");
                        String string3 = E8.getString(columnIndex9);
                        h.d(string3, "cursor.getString(onDeleteColumnIndex)");
                        String string4 = E8.getString(columnIndex10);
                        h.d(string4, "cursor.getString(onUpdateColumnIndex)");
                        c5162i.add(new C5142b(string2, string3, string4, arrayList, arrayList2));
                        columnIndex6 = i9;
                        columnIndex7 = i11;
                        s9 = list2;
                    }
                }
                C5162i c10 = A8.b.c(c5162i);
                E8.close();
                E8 = c5247c.E("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = E8.getColumnIndex("name");
                    int columnIndex12 = E8.getColumnIndex("origin");
                    int columnIndex13 = E8.getColumnIndex("unique");
                    C5162i c5162i2 = null;
                    if (columnIndex11 != -1 && columnIndex12 != -1 && columnIndex13 != -1) {
                        C5162i c5162i3 = new C5162i();
                        while (true) {
                            if (!E8.moveToNext()) {
                                break;
                            }
                            if ("c".equals(E8.getString(columnIndex12))) {
                                String name2 = E8.getString(columnIndex11);
                                boolean z6 = E8.getInt(columnIndex13) == 1;
                                h.d(name2, "name");
                                d t6 = f.t(c5247c, name2, z6);
                                if (t6 == null) {
                                    E8.close();
                                    break;
                                }
                                c5162i3.add(t6);
                            }
                        }
                        return new e(str, c9, c10, c5162i2);
                    }
                    E8.close();
                    return new e(str, c9, c10, c5162i2);
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public final boolean equals(Object obj) {
        AbstractSet abstractSet;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f41645a.equals(eVar.f41645a) || !this.f41646b.equals(eVar.f41646b) || !h.a(this.f41647c, eVar.f41647c)) {
            return false;
        }
        AbstractSet abstractSet2 = this.f41648d;
        if (abstractSet2 == null || (abstractSet = eVar.f41648d) == null) {
            return true;
        }
        return abstractSet2.equals(abstractSet);
    }

    public final int hashCode() {
        return this.f41647c.hashCode() + ((this.f41646b.hashCode() + (this.f41645a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f41645a + "', columns=" + this.f41646b + ", foreignKeys=" + this.f41647c + ", indices=" + this.f41648d + '}';
    }
}
