package defpackage;

import android.os.Handler;
import java.io.Closeable;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final /* synthetic */ class jdv implements Closeable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ cr b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jdv(cr crVar, String str, mlt mltVar) {
        this.b = crVar;
        this.c = str;
        this.d = mltVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                k0j k0jVar = (k0j) this.c;
                ndv ndvVar = (ndv) this.d;
                k0jVar.close();
                ((Handler) dwt.a.getValue()).post(new bhp(19, new hav(1, this.b, ndvVar)));
                break;
            default:
                String str = (String) this.c;
                mlt mltVar = (mlt) this.d;
                List list = (List) ((HashMap) this.b.c).get(str);
                if (list != null) {
                    list.remove(mltVar);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ jdv(k0j k0jVar, cr crVar, ndv ndvVar) {
        this.c = k0jVar;
        this.b = crVar;
        this.d = ndvVar;
    }
}
