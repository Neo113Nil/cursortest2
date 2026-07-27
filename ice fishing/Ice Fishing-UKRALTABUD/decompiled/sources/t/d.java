package t;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class d implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2958a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2959b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f2960c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f2961d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2962e;

    public /* synthetic */ d(String str, Context context, c cVar, int i2, int i3) {
        this.f2958a = i3;
        this.f2959b = str;
        this.f2960c = context;
        this.f2961d = cVar;
        this.f2962e = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f2958a) {
            case 0:
                return g.a(this.f2959b, this.f2960c, this.f2961d, this.f2962e);
            default:
                try {
                    return g.a(this.f2959b, this.f2960c, this.f2961d, this.f2962e);
                } catch (Throwable unused) {
                    return new f(-3);
                }
        }
    }
}
