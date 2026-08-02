package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

/* loaded from: classes10.dex */
public final /* synthetic */ class tf3 implements rhw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ tf3(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.rhw0
    public final Object get() {
        v6h v6hVar;
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                return eg3.i(context);
            case 1:
                return new rih(context);
            case 2:
                ImmutableList immutableList = v6h.p;
                synchronized (v6h.class) {
                    try {
                        if (v6h.v == null) {
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
                            v6h.v = new v6h(applicationContext, hashMap);
                        }
                        v6hVar = v6h.v;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return v6hVar;
            case 3:
                return new ueh(context, new lbh());
            case 4:
                return new ueh(context, new lbh());
            default:
                return new vmh(context);
        }
    }
}
