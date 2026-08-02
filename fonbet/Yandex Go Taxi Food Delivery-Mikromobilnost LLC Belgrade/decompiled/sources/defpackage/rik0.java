package defpackage;

import android.content.Context;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes6.dex */
public abstract class rik0 {
    public final Context a;
    public final wnt b;
    public final i3y c = a.b(LazyThreadSafetyMode.NONE, new zfj0(28));
    public final i3y d;

    public rik0(int i, Context context, wnt wntVar) {
        this.a = context;
        this.b = wntVar;
        this.d = a.a(new ys0(this, i, 12));
    }
}
