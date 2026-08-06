package v;

import J1.u;
import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8484a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8485b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f8486c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f8487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8488e;

    public /* synthetic */ c(String str, Context context, u uVar, int i2, int i3) {
        this.f8484a = i3;
        this.f8485b = str;
        this.f8486c = context;
        this.f8487d = uVar;
        this.f8488e = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f8484a) {
            case 0:
                return f.a(this.f8485b, this.f8486c, this.f8487d, this.f8488e);
            default:
                try {
                    return f.a(this.f8485b, this.f8486c, this.f8487d, this.f8488e);
                } catch (Throwable unused) {
                    return new e(-3);
                }
        }
    }
}
