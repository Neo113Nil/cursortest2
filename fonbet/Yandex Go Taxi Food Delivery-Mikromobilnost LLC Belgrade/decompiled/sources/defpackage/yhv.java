package defpackage;

import android.content.Context;
import com.yandex.images.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes15.dex */
public final class yhv implements yvf0 {
    public final Context a;
    public final abe b;
    public final ArrayList c;
    public final ArrayList d;
    public final w3i e;
    public final biv f;
    public volatile xav g;

    public yhv(Context context, abe abeVar, ArrayList arrayList, ArrayList arrayList2, w3i w3iVar, biv bivVar) {
        this.a = context.getApplicationContext();
        this.b = abeVar;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = w3iVar;
        this.f = bivVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        xav xavVar = this.g;
        if (xavVar == null) {
            Context context = this.a;
            abe abeVar = this.b;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new u150(), new ThreadPoolExecutor.AbortPolicy());
            ArrayList arrayList = this.d;
            y9v y9vVar = new y9v();
            ArrayList arrayList2 = this.c;
            if (arrayList2.isEmpty() && arrayList.isEmpty()) {
                y9vVar.a.add(new kes0());
            } else {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    y9vVar.a.add((zn50) it.next());
                }
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    throw unr0.i(it2);
                }
            }
            y9vVar.a.add(new wxk0(this.a, y9vVar));
            hdh hdhVar = this.f;
            if (hdhVar == null) {
                hdhVar = new hdh();
            }
            xavVar = new b(context, abeVar, threadPoolExecutor, y9vVar, hdhVar, this.e);
        }
        this.g = xavVar;
        return xavVar;
    }
}
