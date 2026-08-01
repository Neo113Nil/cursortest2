package L;

import C2.N;
import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class d implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1585a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1586b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f1587c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N f1588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1589e;

    public /* synthetic */ d(String str, Context context, N n9, int i, int i6) {
        this.f1585a = i6;
        this.f1586b = str;
        this.f1587c = context;
        this.f1588d = n9;
        this.f1589e = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f1585a) {
            case 0:
                return g.a(this.f1586b, this.f1587c, this.f1588d, this.f1589e);
            default:
                try {
                    return g.a(this.f1586b, this.f1587c, this.f1588d, this.f1589e);
                } catch (Throwable unused) {
                    return new f(-3);
                }
        }
    }
}
