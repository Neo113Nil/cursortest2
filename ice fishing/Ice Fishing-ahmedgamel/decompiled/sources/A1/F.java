package A1;

import D1.C0299d;
import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class F implements y, I1.b {

    /* renamed from: n, reason: collision with root package name */
    public final Resources f30n;

    public /* synthetic */ F(Resources resources) {
        this.f30n = resources;
    }

    @Override // I1.b
    public w1.w e(w1.w wVar, u1.h hVar) {
        if (wVar == null) {
            return null;
        }
        return new C0299d(this.f30n, wVar);
    }

    @Override // A1.y
    public x j(E e9) {
        return new C0260b(this.f30n, e9.a(Uri.class, InputStream.class));
    }
}
