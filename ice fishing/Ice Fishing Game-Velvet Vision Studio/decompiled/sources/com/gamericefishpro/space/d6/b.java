package com.gamericefishpro.space.d6;

import android.content.ContentValues;
import android.database.Cursor;
import com.gamericefishpro.space.e6.j;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface b extends Closeable {
    void A(Object[] objArr);

    void B();

    void D();

    int I(ContentValues contentValues, Object[] objArr);

    void d();

    void e();

    Cursor f(h hVar);

    void h(String str);

    boolean isOpen();

    j m(String str);

    void q();

    boolean r();

    boolean v();
}
