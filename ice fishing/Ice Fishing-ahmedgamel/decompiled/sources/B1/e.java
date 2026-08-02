package B1;

import A1.w;
import A1.x;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import u1.h;
import v1.AbstractC5096a;

/* loaded from: classes.dex */
public final class e implements x {

    /* renamed from: a, reason: collision with root package name */
    public final Context f269a;

    /* renamed from: b, reason: collision with root package name */
    public final x f270b;

    /* renamed from: c, reason: collision with root package name */
    public final x f271c;

    /* renamed from: d, reason: collision with root package name */
    public final Class f272d;

    public e(Context context, x xVar, x xVar2, Class cls) {
        this.f269a = context.getApplicationContext();
        this.f270b = xVar;
        this.f271c = xVar2;
        this.f272d = cls;
    }

    @Override // A1.x
    public final boolean a(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && AbstractC5096a.a((Uri) obj);
    }

    @Override // A1.x
    public final w b(Object obj, int i, int i4, h hVar) {
        Uri uri = (Uri) obj;
        return new w(new O1.d(uri), new d(this.f269a, this.f270b, this.f271c, uri, i, i4, hVar, this.f272d));
    }
}
