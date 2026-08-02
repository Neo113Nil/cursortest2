package yads;

import android.content.Context;
import android.util.LruCache;
import defpackage.b671;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes7.dex */
public final class yn0 extends LruCache {
    public static final b671 c = new b671();
    public final Context a;
    public final Queue b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn0(Context context) {
        super(4);
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        this.a = context;
        this.b = new ArrayDeque(4);
    }

    @Override // android.util.LruCache
    public final void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        if (obj != null) {
            throw new ClassCastException();
        }
        throw null;
    }
}
