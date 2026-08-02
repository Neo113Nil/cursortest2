package yads;

import android.util.LruCache;
import defpackage.eq71;

/* loaded from: classes7.dex */
public final class fo0 extends LruCache {
    public fo0(int i) {
        super(i);
    }

    @Override // android.util.LruCache
    public final void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        eq71 eq71Var = (eq71) obj2;
        if (eq71Var != null) {
            eq71Var.g();
        }
    }
}
