package w0;

import android.database.Cursor;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;
import r7.q;
import s7.C5006f;
import s7.C5009i;
import z0.C5260c;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f41580a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f41581b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractSet f41582c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractSet f41583d;

    public e(String str, Map map, AbstractSet foreignKeys, AbstractSet abstractSet) {
        h.e(foreignKeys, "foreignKeys");
        this.f41580a = str;
        this.f41581b = map;
        this.f41582c = foreignKeys;
        this.f41583d = abstractSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x01db, code lost:
    
        r9 = K3.b.a(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01df, code lost:
    
        r3.close();
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final e a(C5260c c5260c, String str) {
        Map c4;
        Cursor E8 = c5260c.E("PRAGMA table_info(`" + str + "`)");
        try {
            if (E8.getColumnCount() <= 0) {
                c4 = q.f40359n;
                E8.close();
            } else {
                int columnIndex = E8.getColumnIndex("name");
                int columnIndex2 = E8.getColumnIndex("type");
                int columnIndex3 = E8.getColumnIndex("notnull");
                int columnIndex4 = E8.getColumnIndex("pk");
                int columnIndex5 = E8.getColumnIndex("dflt_value");
                C5006f c5006f = new C5006f();
                while (E8.moveToNext()) {
                    String name = E8.getString(columnIndex);
                    String type = E8.getString(columnIndex2);
                    boolean z8 = E8.getInt(columnIndex3) != 0;
                    int i = E8.getInt(columnIndex4);
                    String string = E8.getString(columnIndex5);
                    h.d(name, "name");
                    h.d(type, "type");
                    c5006f.put(name, new C5146a(i, 2, name, type, string, z8));
                }
                c4 = c5006f.c();
                E8.close();
            }
            E8 = c5260c.E("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = E8.getColumnIndex("id");
                int columnIndex7 = E8.getColumnIndex("seq");
                int columnIndex8 = E8.getColumnIndex("table");
                int columnIndex9 = E8.getColumnIndex("on_delete");
                int columnIndex10 = E8.getColumnIndex("on_update");
                List y6 = com.bumptech.glide.h.y(E8);
                E8.moveToPosition(-1);
                C5009i c5009i = new C5009i();
                while (E8.moveToNext()) {
                    if (E8.getInt(columnIndex7) == 0) {
                        int i4 = E8.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i9 = columnIndex6;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : y6) {
                            int i10 = columnIndex7;
                            List list = y6;
                            if (((c) obj).f41572n == i4) {
                                arrayList3.add(obj);
                            }
                            columnIndex7 = i10;
                            y6 = list;
                        }
                        int i11 = columnIndex7;
                        List list2 = y6;
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            c cVar = (c) it.next();
                            arrayList.add(cVar.f41574v);
                            arrayList2.add(cVar.f41575w);
                        }
                        String string2 = E8.getString(columnIndex8);
                        h.d(string2, "cursor.getString(tableColumnIndex)");
                        String string3 = E8.getString(columnIndex9);
                        h.d(string3, "cursor.getString(onDeleteColumnIndex)");
                        String string4 = E8.getString(columnIndex10);
                        h.d(string4, "cursor.getString(onUpdateColumnIndex)");
                        c5009i.add(new C5147b(string2, string3, string4, arrayList, arrayList2));
                        columnIndex6 = i9;
                        columnIndex7 = i11;
                        y6 = list2;
                    }
                }
                C5009i a9 = K3.b.a(c5009i);
                E8.close();
                E8 = c5260c.E("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = E8.getColumnIndex("name");
                    int columnIndex12 = E8.getColumnIndex("origin");
                    int columnIndex13 = E8.getColumnIndex("unique");
                    C5009i c5009i2 = null;
                    if (columnIndex11 != -1 && columnIndex12 != -1 && columnIndex13 != -1) {
                        C5009i c5009i3 = new C5009i();
                        while (true) {
                            if (!E8.moveToNext()) {
                                break;
                            }
                            if ("c".equals(E8.getString(columnIndex12))) {
                                String name2 = E8.getString(columnIndex11);
                                boolean z9 = E8.getInt(columnIndex13) == 1;
                                h.d(name2, "name");
                                d z10 = com.bumptech.glide.h.z(c5260c, name2, z9);
                                if (z10 == null) {
                                    E8.close();
                                    break;
                                }
                                c5009i3.add(z10);
                            }
                        }
                        return new e(str, c4, a9, c5009i2);
                    }
                    E8.close();
                    return new e(str, c4, a9, c5009i2);
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
        if (!this.f41580a.equals(eVar.f41580a) || !this.f41581b.equals(eVar.f41581b) || !h.a(this.f41582c, eVar.f41582c)) {
            return false;
        }
        AbstractSet abstractSet2 = this.f41583d;
        if (abstractSet2 == null || (abstractSet = eVar.f41583d) == null) {
            return true;
        }
        return abstractSet2.equals(abstractSet);
    }

    public final int hashCode() {
        return this.f41582c.hashCode() + ((this.f41581b.hashCode() + (this.f41580a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f41580a + "', columns=" + this.f41581b + ", foreignKeys=" + this.f41582c + ", indices=" + this.f41583d + '}';
    }
}
