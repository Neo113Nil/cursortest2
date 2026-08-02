package A1;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;

/* renamed from: A1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0264f implements y, InterfaceC0268j {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f55n;

    /* renamed from: u, reason: collision with root package name */
    public final Context f56u;

    public /* synthetic */ C0264f(Context context, int i) {
        this.f55n = i;
        this.f56u = context;
    }

    @Override // A1.InterfaceC0268j
    public Class a() {
        return AssetFileDescriptor.class;
    }

    @Override // A1.InterfaceC0268j
    public Object b(Resources resources, int i, Resources.Theme theme) {
        return resources.openRawResourceFd(i);
    }

    @Override // A1.InterfaceC0268j
    public void d(Object obj) {
        ((AssetFileDescriptor) obj).close();
    }

    @Override // A1.y
    public final x j(E e9) {
        switch (this.f55n) {
            case 0:
                return new C0260b(this.f56u, this);
            default:
                return new t(this.f56u, 2);
        }
    }
}
