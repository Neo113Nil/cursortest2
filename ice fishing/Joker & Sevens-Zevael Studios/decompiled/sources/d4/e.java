package d4;

import android.database.Cursor;
import bc.a0;
import bc.w;
import cc.g;
import com.onesignal.inAppMessages.internal.display.impl.n;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f1675a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1676b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f1677c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f1678d;

    public e(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        j.e(abstractSet, "foreignKeys");
        this.f1675a = str;
        this.f1676b = map;
        this.f1677c = abstractSet;
        this.f1678d = abstractSet2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x01dd, code lost:
    
        r9 = v6.a.n(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01e1, code lost:
    
        r3.close();
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final e a(i4.c cVar, String str) {
        Map b2;
        Cursor m10 = cVar.m("PRAGMA table_info(`" + str + "`)");
        try {
            if (m10.getColumnCount() <= 0) {
                b2 = w.f1068g;
                m10.close();
            } else {
                int columnIndex = m10.getColumnIndex("name");
                int columnIndex2 = m10.getColumnIndex(n.EVENT_TYPE_KEY);
                int columnIndex3 = m10.getColumnIndex("notnull");
                int columnIndex4 = m10.getColumnIndex("pk");
                int columnIndex5 = m10.getColumnIndex("dflt_value");
                g gVar = new g();
                while (m10.moveToNext()) {
                    String string = m10.getString(columnIndex);
                    String string2 = m10.getString(columnIndex2);
                    boolean z10 = m10.getInt(columnIndex3) != 0;
                    int i10 = m10.getInt(columnIndex4);
                    String string3 = m10.getString(columnIndex5);
                    j.d(string, "name");
                    j.d(string2, n.EVENT_TYPE_KEY);
                    gVar.put(string, new a(string, string2, z10, i10, string3, 2));
                }
                b2 = gVar.b();
                m10.close();
            }
            m10 = cVar.m("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = m10.getColumnIndex("id");
                int columnIndex7 = m10.getColumnIndex("seq");
                int columnIndex8 = m10.getColumnIndex("table");
                int columnIndex9 = m10.getColumnIndex("on_delete");
                int columnIndex10 = m10.getColumnIndex("on_update");
                List G = a0.G(m10);
                m10.moveToPosition(-1);
                cc.j jVar = new cc.j();
                while (m10.moveToNext()) {
                    if (m10.getInt(columnIndex7) == 0) {
                        int i11 = m10.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i12 = columnIndex6;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : G) {
                            int i13 = columnIndex7;
                            List list = G;
                            if (((c) obj).f1667g == i11) {
                                arrayList3.add(obj);
                            }
                            columnIndex7 = i13;
                            G = list;
                        }
                        int i14 = columnIndex7;
                        List list2 = G;
                        int size = arrayList3.size();
                        int i15 = 0;
                        while (i15 < size) {
                            Object obj2 = arrayList3.get(i15);
                            i15++;
                            c cVar2 = (c) obj2;
                            arrayList.add(cVar2.f1669i);
                            arrayList2.add(cVar2.f1670j);
                            arrayList3 = arrayList3;
                        }
                        String string4 = m10.getString(columnIndex8);
                        j.d(string4, "cursor.getString(tableColumnIndex)");
                        String string5 = m10.getString(columnIndex9);
                        j.d(string5, "cursor.getString(onDeleteColumnIndex)");
                        String string6 = m10.getString(columnIndex10);
                        j.d(string6, "cursor.getString(onUpdateColumnIndex)");
                        jVar.add(new b(string4, string5, string6, arrayList, arrayList2));
                        columnIndex6 = i12;
                        columnIndex7 = i14;
                        G = list2;
                    }
                }
                cc.j n7 = v6.a.n(jVar);
                m10.close();
                m10 = cVar.m("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = m10.getColumnIndex("name");
                    int columnIndex12 = m10.getColumnIndex("origin");
                    int columnIndex13 = m10.getColumnIndex("unique");
                    cc.j jVar2 = null;
                    if (columnIndex11 != -1 && columnIndex12 != -1 && columnIndex13 != -1) {
                        cc.j jVar3 = new cc.j();
                        while (true) {
                            if (!m10.moveToNext()) {
                                break;
                            }
                            if ("c".equals(m10.getString(columnIndex12))) {
                                String string7 = m10.getString(columnIndex11);
                                boolean z11 = m10.getInt(columnIndex13) == 1;
                                j.d(string7, "name");
                                d H = a0.H(cVar, string7, z11);
                                if (H == null) {
                                    m10.close();
                                    break;
                                }
                                jVar3.add(H);
                            }
                        }
                        return new e(str, b2, n7, jVar2);
                    }
                    m10.close();
                    return new e(str, b2, n7, jVar2);
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
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f1675a.equals(eVar.f1675a) || !this.f1676b.equals(eVar.f1676b) || !j.a(this.f1677c, eVar.f1677c)) {
            return false;
        }
        Set set2 = this.f1678d;
        if (set2 == null || (set = eVar.f1678d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.f1677c.hashCode() + ((this.f1676b.hashCode() + (this.f1675a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f1675a + "', columns=" + this.f1676b + ", foreignKeys=" + this.f1677c + ", indices=" + this.f1678d + '}';
    }
}
