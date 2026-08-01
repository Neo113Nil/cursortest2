package z1;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import s1.h;
import t1.AbstractC5032a;
import y1.C5222q;
import y1.InterfaceC5223r;

/* renamed from: z1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5257d implements InterfaceC5223r {

    /* renamed from: a, reason: collision with root package name */
    public final Context f42263a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC5223r f42264b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC5223r f42265c;

    /* renamed from: d, reason: collision with root package name */
    public final Class f42266d;

    public C5257d(Context context, InterfaceC5223r interfaceC5223r, InterfaceC5223r interfaceC5223r2, Class cls) {
        this.f42263a = context.getApplicationContext();
        this.f42264b = interfaceC5223r;
        this.f42265c = interfaceC5223r2;
        this.f42266d = cls;
    }

    @Override // y1.InterfaceC5223r
    public final boolean a(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && AbstractC5032a.a((Uri) obj);
    }

    @Override // y1.InterfaceC5223r
    public final C5222q b(Object obj, int i, int i6, h hVar) {
        Uri uri = (Uri) obj;
        return new C5222q(new M1.d(uri), new C5256c(this.f42263a, this.f42264b, this.f42265c, uri, i, i6, hVar, this.f42266d));
    }
}
