package app.cash.sqldelight.driver.android;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface AndroidStatement {
    void bindBoolean(int i, Boolean bool);

    void bindBytes(int i, byte[] bArr);

    void bindDouble(int i, Double d);

    void bindLong(int i, Long l);

    void bindString(int i, String str);

    void close();

    long execute();

    Object executeQuery(Function1 function1);
}
