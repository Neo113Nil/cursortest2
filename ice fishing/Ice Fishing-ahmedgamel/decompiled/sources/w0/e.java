package w0;

import android.database.Cursor;
import com.bumptech.glide.g;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;
import v7.q;
import w7.C5158f;
import w7.C5161i;
import z0.C5214c;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f41424a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f41425b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractSet f41426c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractSet f41427d;

    public e(String str, Map map, AbstractSet foreignKeys, AbstractSet abstractSet) {
        h.e(foreignKeys, "foreignKeys");
        this.f41424a = str;
        this.f41425b = map;
        this.f41426c = foreignKeys;
        this.f41427d = abstractSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x01db, code lost:
    
        r9 = com.bumptech.glide.d.f(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01df, code lost:
    
        r3.close();
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final e a(C5214c c5214c, String str) {
        Map c9;
        Cursor E8 = c5214c.E("PRAGMA table_info(`" + str + "`)");
        try {
            if (E8.getColumnCount() <= 0) {
                c9 = q.f41222n;
                E8.close();
            } else {
                int columnIndex = E8.getColumnIndex("name");
                int columnIndex2 = E8.getColumnIndex("type");
                int columnIndex3 = E8.getColumnIndex("notnull");
                int columnIndex4 = E8.getColumnIndex("pk");
                int columnIndex5 = E8.getColumnIndex("dflt_value");
                C5158f c5158f = new C5158f();
                while (E8.moveToNext()) {
                    String name = E8.getString(columnIndex);
                    String type = E8.getString(columnIndex2);
                    boolean z6 = E8.getInt(columnIndex3) != 0;
                    int i = E8.getInt(columnIndex4);
                    String string = E8.getString(columnIndex5);
                    h.d(name, "name");
                    h.d(type, "type");
                    c5158f.put(name, new C5131a(i, 2, name, type, string, z6));
                }
                c9 = c5158f.c();
                E8.close();
            }
            E8 = c5214c.E("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = E8.getColumnIndex("id");
                int columnIndex7 = E8.getColumnIndex("seq");
                int columnIndex8 = E8.getColumnIndex("table");
                int columnIndex9 = E8.getColumnIndex("on_delete");
                int columnIndex10 = E8.getColumnIndex("on_update");
                List x9 = g.x(E8);
                E8.moveToPosition(-1);
                C5161i c5161i = new C5161i();
                while (E8.moveToNext()) {
                    if (E8.getInt(columnIndex7) == 0) {
                        int i4 = E8.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i6 = columnIndex6;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : x9) {
                            int i9 = columnIndex7;
                            List list = x9;
                            if (((c) obj).f41416n == i4) {
                                arrayList3.add(obj);
                            }
                            columnIndex7 = i9;
                            x9 = list;
                        }
                        int i10 = columnIndex7;
                        List list2 = x9;
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            c cVar = (c) it.next();
                            arrayList.add(cVar.f41418v);
                            arrayList2.add(cVar.f41419w);
                        }
                        String string2 = E8.getString(columnIndex8);
                        h.d(string2, "cursor.getString(tableColumnIndex)");
                        String string3 = E8.getString(columnIndex9);
                        h.d(string3, "cursor.getString(onDeleteColumnIndex)");
                        String string4 = E8.getString(columnIndex10);
                        h.d(string4, "cursor.getString(onUpdateColumnIndex)");
                        c5161i.add(new C5132b(string2, string3, string4, arrayList, arrayList2));
                        columnIndex6 = i6;
                        columnIndex7 = i10;
                        x9 = list2;
                    }
                }
                C5161i f2 = com.bumptech.glide.d.f(c5161i);
                E8.close();
                E8 = c5214c.E("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = E8.getColumnIndex("name");
                    int columnIndex12 = E8.getColumnIndex("origin");
                    int columnIndex13 = E8.getColumnIndex("unique");
                    C5161i c5161i2 = null;
                    if (columnIndex11 != -1 && columnIndex12 != -1 && columnIndex13 != -1) {
                        C5161i c5161i3 = new C5161i();
                        while (true) {
                            if (!E8.moveToNext()) {
                                break;
                            }
                            if ("c".equals(E8.getString(columnIndex12))) {
                                String name2 = E8.getString(columnIndex11);
                                boolean z9 = E8.getInt(columnIndex13) == 1;
                                h.d(name2, "name");
                                d y7 = g.y(c5214c, name2, z9);
                                if (y7 == null) {
                                    E8.close();
                                    break;
                                }
                                c5161i3.add(y7);
                            }
                        }
                        return new e(str, c9, f2, c5161i2);
                    }
                    E8.close();
                    return new e(str, c9, f2, c5161i2);
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
        if (!this.f41424a.equals(eVar.f41424a) || !this.f41425b.equals(eVar.f41425b) || !h.a(this.f41426c, eVar.f41426c)) {
            return false;
        }
        AbstractSet abstractSet2 = this.f41427d;
        if (abstractSet2 == null || (abstractSet = eVar.f41427d) == null) {
            return true;
        }
        return abstractSet2.equals(abstractSet);
    }

    public final int hashCode() {
        return this.f41426c.hashCode() + ((this.f41425b.hashCode() + (this.f41424a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f41424a + "', columns=" + this.f41425b + ", foreignKeys=" + this.f41426c + ", indices=" + this.f41427d + '}';
    }
}
