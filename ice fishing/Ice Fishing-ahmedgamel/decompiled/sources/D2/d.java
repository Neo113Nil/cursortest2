package D2;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f598a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f599b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f600c = new AtomicReference(a.UNKNOWN);

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f601d = new AtomicReference(b.UNKNOWN);

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f602e = new AtomicReference(c.UNKNOWN);

    public d(Context context) {
        this.f598a = context;
    }
}
