package z1;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import s1.h;
import t1.AbstractC5064a;
import y1.C5243r;
import y1.InterfaceC5244s;

/* renamed from: z1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5270d implements InterfaceC5244s {

    /* renamed from: a, reason: collision with root package name */
    public final Context f42145a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC5244s f42146b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC5244s f42147c;

    /* renamed from: d, reason: collision with root package name */
    public final Class f42148d;

    public C5270d(Context context, InterfaceC5244s interfaceC5244s, InterfaceC5244s interfaceC5244s2, Class cls) {
        this.f42145a = context.getApplicationContext();
        this.f42146b = interfaceC5244s;
        this.f42147c = interfaceC5244s2;
        this.f42148d = cls;
    }

    @Override // y1.InterfaceC5244s
    public final boolean a(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && AbstractC5064a.a((Uri) obj);
    }

    @Override // y1.InterfaceC5244s
    public final C5243r b(Object obj, int i, int i4, h hVar) {
        Uri uri = (Uri) obj;
        return new C5243r(new M1.d(uri), new C5269c(this.f42145a, this.f42146b, this.f42147c, uri, i, i4, hVar, this.f42148d));
    }
}
