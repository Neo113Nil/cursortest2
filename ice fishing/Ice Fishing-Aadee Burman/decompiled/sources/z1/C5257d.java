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
    public final Context f42260a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC5223r f42261b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC5223r f42262c;

    /* renamed from: d, reason: collision with root package name */
    public final Class f42263d;

    public C5257d(Context context, InterfaceC5223r interfaceC5223r, InterfaceC5223r interfaceC5223r2, Class cls) {
        this.f42260a = context.getApplicationContext();
        this.f42261b = interfaceC5223r;
        this.f42262c = interfaceC5223r2;
        this.f42263d = cls;
    }

    @Override // y1.InterfaceC5223r
    public final boolean a(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && AbstractC5032a.a((Uri) obj);
    }

    @Override // y1.InterfaceC5223r
    public final C5222q b(Object obj, int i, int i6, h hVar) {
        Uri uri = (Uri) obj;
        return new C5222q(new M1.d(uri), new C5256c(this.f42260a, this.f42261b, this.f42262c, uri, i, i6, hVar, this.f42263d));
    }
}
