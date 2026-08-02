package L;

import E2.M;
import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class d implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1694a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1695b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f1696c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ M f1697d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1698e;

    public /* synthetic */ d(String str, Context context, M m9, int i, int i4) {
        this.f1694a = i4;
        this.f1695b = str;
        this.f1696c = context;
        this.f1697d = m9;
        this.f1698e = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f1694a) {
            case 0:
                return g.a(this.f1695b, this.f1696c, this.f1697d, this.f1698e);
            default:
                try {
                    return g.a(this.f1695b, this.f1696c, this.f1697d, this.f1698e);
                } catch (Throwable unused) {
                    return new f(-3);
                }
        }
    }
}
