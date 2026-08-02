package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public interface ull0 extends AutoCloseable {
    void C();

    default boolean Q1() {
        return getLong(0) != 0;
    }

    String Y1(int i);

    void b(int i, long j);

    void g1(int i, String str);

    byte[] getBlob(int i);

    int getColumnCount();

    String getColumnName(int i);

    default List getColumnNames() {
        int columnCount = getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(getColumnName(i));
        }
        return arrayList;
    }

    double getDouble(int i);

    long getLong(int i);

    boolean isNull(int i);

    void m(int i, byte[] bArr);

    void p(int i);

    boolean q();

    void reset();

    void z(double d, int i);
}
