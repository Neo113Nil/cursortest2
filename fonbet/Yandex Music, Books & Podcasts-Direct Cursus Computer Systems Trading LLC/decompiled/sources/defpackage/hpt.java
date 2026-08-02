package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class hpt implements kci {
    public static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));
    public final Object a;

    public hpt(gpt gptVar) {
        this.a = gptVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [gpt, java.lang.Object] */
    @Override // defpackage.kci
    public final jci a(Object obj, int i, int i2, pwj pwjVar) {
        Uri uri = (Uri) obj;
        return new jci(new vhj(uri), this.a.s(uri));
    }

    @Override // defpackage.kci
    public final boolean b(Object obj) {
        return b.contains(((Uri) obj).getScheme());
    }
}
