package defpackage;

import android.net.Uri;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class zlr {
    public Set a = new LinkedHashSet(500);
    public final ReentrantLock b = new ReentrantLock();

    public final void a(Uri uri) {
        uri.getClass();
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            if (this.a.size() >= 500) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(500);
                linkedHashSet.addAll(CollectionsKt.m0(CollectionsKt.w0(this.a), yhn.m(250, 500)));
                this.a = linkedHashSet;
            }
            Set set = this.a;
            String uri2 = uri.toString();
            uri2.getClass();
            set.add(f8g.b0(uri2));
        } finally {
            reentrantLock.unlock();
        }
    }
}
