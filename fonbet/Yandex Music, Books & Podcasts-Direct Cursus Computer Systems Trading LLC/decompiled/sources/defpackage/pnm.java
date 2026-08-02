package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class pnm {
    public final Handler a;
    public kgk b;
    public final HashMap c;
    public final PriorityQueue d;

    public pnm(Handler handler) {
        this.a = handler;
        mj mjVar = new mj(25);
        this.c = new HashMap();
        this.d = new PriorityQueue(16, mjVar);
    }

    public final void a(nnm nnmVar, boolean z) {
        kgk kgkVar;
        Timber.INSTANCE.d("addRequest() called with: preloadRequest = " + nnmVar, new Object[0]);
        Intrinsics.d(this.a.getLooper(), Looper.myLooper());
        String str = nnmVar.l;
        HashMap hashMap = this.c;
        hashMap.containsKey(str);
        onm onmVar = new onm(nnmVar.c, nnmVar);
        hashMap.put(str, onmVar);
        this.d.add(onmVar);
        if (z || (kgkVar = this.b) == null) {
            return;
        }
        kgkVar.invoke();
    }

    public final nnm b(String str) {
        str.getClass();
        Intrinsics.d(this.a.getLooper(), Looper.myLooper());
        onm onmVar = (onm) this.c.get(str);
        if (onmVar != null) {
            return onmVar.b;
        }
        return null;
    }

    public final void c() {
        Intrinsics.d(this.a.getLooper(), Looper.myLooper());
        onm onmVar = (onm) this.d.poll();
        if (onmVar != null) {
            this.c.remove(onmVar.b.l);
        }
    }

    public final ArrayList d() {
        Timber.INSTANCE.d("removeAllRequests() called", new Object[0]);
        Intrinsics.d(this.a.getLooper(), Looper.myLooper());
        HashMap hashMap = this.c;
        Collection values = hashMap.values();
        values.getClass();
        List<onm> w0 = CollectionsKt.w0(values);
        ArrayList arrayList = new ArrayList(v75.o(w0, 10));
        for (onm onmVar : w0) {
            Timber.INSTANCE.d("request " + onmVar + " is removing", new Object[0]);
            arrayList.add(onmVar.b);
        }
        hashMap.clear();
        this.d.clear();
        return arrayList;
    }

    public final void e(nnm nnmVar) {
        Timber.INSTANCE.d("removeRequest() called with: request = " + nnmVar, new Object[0]);
        Intrinsics.d(this.a.getLooper(), Looper.myLooper());
        String str = nnmVar.l;
        HashMap hashMap = this.c;
        Object obj = hashMap.get(str);
        obj.getClass();
        hashMap.remove(str);
        this.d.remove((onm) obj);
    }
}
