package defpackage;

import android.util.LruCache;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class dhx extends LruCache {
    public final /* synthetic */ wmh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhx(wmh wmhVar) {
        super(20);
        this.a = wmhVar;
    }

    @Override // android.util.LruCache
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = (ArrayList) this.a.g;
        Integer num = (Integer) obj;
        if (z) {
            y1g.G(arrayList);
            arrayList.add(num);
        }
    }
}
