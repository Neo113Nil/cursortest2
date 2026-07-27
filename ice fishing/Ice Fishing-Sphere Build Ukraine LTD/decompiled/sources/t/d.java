package t;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class d implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2963a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2964b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f2965c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f2966d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2967e;

    public /* synthetic */ d(String str, Context context, c cVar, int i2, int i3) {
        this.f2963a = i3;
        this.f2964b = str;
        this.f2965c = context;
        this.f2966d = cVar;
        this.f2967e = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f2963a) {
            case 0:
                return g.a(this.f2964b, this.f2965c, this.f2966d, this.f2967e);
            default:
                try {
                    return g.a(this.f2964b, this.f2965c, this.f2966d, this.f2967e);
                } catch (Throwable unused) {
                    return new f(-3);
                }
        }
    }
}
