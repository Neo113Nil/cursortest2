package defpackage;

/* loaded from: classes.dex */
public interface cko extends AutoCloseable {
    void E(int i, String str);

    void bindBlob(int i, byte[] bArr);

    void bindDouble(int i, double d);

    void bindLong(int i, long j);

    void bindNull(int i);

    void clearBindings();

    byte[] getBlob(int i);

    int getColumnCount();

    String getColumnName(int i);

    double getDouble(int i);

    long getLong(int i);

    boolean isNull(int i);

    default boolean p0() {
        return getLong(0) != 0;
    }

    boolean q();

    void reset();

    String x0(int i);
}
