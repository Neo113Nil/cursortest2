package defpackage;

import android.content.Context;
import androidx.media3.exoplayer.trackselection.a;
import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class qw1 implements yqr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ qw1(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.yqr
    public final Object get() {
        jk7 jk7Var;
        switch (this.a) {
            case 0:
                return fx1.f(this.b);
            case 1:
                return new wp7(this.b);
            case 2:
                return new to7(this.b, new hm7());
            case 3:
                return new ct7(this.b, a.y0, new hs4(13));
            default:
                Context context = this.b;
                qsn qsnVar = jk7.p;
                synchronized (jk7.class) {
                    try {
                        if (jk7.v == null) {
                            Context applicationContext = context == null ? null : context.getApplicationContext();
                            HashMap hashMap = new HashMap(8);
                            hashMap.put(0, 1000000L);
                            hashMap.put(2, -9223372036854775807L);
                            hashMap.put(3, -9223372036854775807L);
                            hashMap.put(4, -9223372036854775807L);
                            hashMap.put(5, -9223372036854775807L);
                            hashMap.put(10, -9223372036854775807L);
                            hashMap.put(9, -9223372036854775807L);
                            hashMap.put(7, -9223372036854775807L);
                            jk7.v = new jk7(applicationContext, hashMap);
                        }
                        jk7Var = jk7.v;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return jk7Var;
        }
    }
}
