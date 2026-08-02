package A1;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory;

/* renamed from: A1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0265g implements y, InterfaceC0268j, f3.c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f57n;

    /* renamed from: u, reason: collision with root package name */
    public final Context f58u;

    public /* synthetic */ C0265g(Context context, int i) {
        this.f57n = i;
        this.f58u = context;
    }

    @Override // A1.InterfaceC0268j
    public Class a() {
        return Drawable.class;
    }

    @Override // A1.InterfaceC0268j
    public Object b(Resources resources, int i, Resources.Theme theme) {
        Context context = this.f58u;
        return A8.b.k(context, context, i, theme);
    }

    @Override // f3.c
    public Object c() {
        N3.B U8;
        U8 = N3.C.U(this.f58u, HsdpDeepLinkServiceFactory.createHsdpServiceIntent());
        return U8;
    }

    @Override // A1.InterfaceC0268j
    public /* bridge */ /* synthetic */ void d(Object obj) {
    }

    @Override // A1.y
    public x j(E e9) {
        switch (this.f57n) {
            case 0:
                return new C0260b(this.f58u, this);
            default:
                return new C0260b(this.f58u, e9.a(Integer.class, AssetFileDescriptor.class));
        }
    }
}
