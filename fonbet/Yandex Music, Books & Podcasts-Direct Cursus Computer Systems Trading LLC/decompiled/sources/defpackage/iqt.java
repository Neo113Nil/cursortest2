package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class iqt implements kci {
    public static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    public final kci a;

    public iqt(kci kciVar) {
        this.a = kciVar;
    }

    @Override // defpackage.kci
    public final jci a(Object obj, int i, int i2, pwj pwjVar) {
        return this.a.a(new old(((Uri) obj).toString(), bwd.a), i, i2, pwjVar);
    }

    @Override // defpackage.kci
    public final boolean b(Object obj) {
        return b.contains(((Uri) obj).getScheme());
    }
}
