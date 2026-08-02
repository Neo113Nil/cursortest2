package defpackage;

import android.content.Context;
import androidx.datastore.core.b;
import androidx.datastore.preferences.core.a;
import java.util.List;

/* loaded from: classes.dex */
public final class rle0 implements vbi0 {
    public final String a;
    public final dxf0 b;
    public final tls c;
    public final tse w;
    public final Object x = new Object();
    public volatile a y;

    public rle0(String str, dxf0 dxf0Var, tls tlsVar, tse tseVar) {
        this.a = str;
        this.b = dxf0Var;
        this.c = tlsVar;
        this.w = tseVar;
    }

    @Override // defpackage.vbi0
    public final Object getValue(Object obj, kgx kgxVar) {
        a aVar;
        Context context = (Context) obj;
        a aVar2 = this.y;
        if (aVar2 != null) {
            return aVar2;
        }
        synchronized (this.x) {
            try {
                if (this.y == null) {
                    Context applicationContext = context.getApplicationContext();
                    this.y = new a(new a(b.a(new n1r(kl40.E, new ueo(4, new l2z(22, applicationContext, this))), this.b, (List) this.c.invoke(applicationContext), this.w)));
                }
                aVar = this.y;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }
}
