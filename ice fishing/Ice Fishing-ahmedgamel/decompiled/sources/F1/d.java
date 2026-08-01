package F1;

import B1.C0262d;
import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;
import s1.l;
import u1.x;

/* loaded from: classes.dex */
public final class d implements l {

    /* renamed from: b, reason: collision with root package name */
    public final l f921b;

    public d(l lVar) {
        N1.g.c(lVar, "Argument must not be null");
        this.f921b = lVar;
    }

    @Override // s1.InterfaceC4970e
    public final void a(MessageDigest messageDigest) {
        this.f921b.a(messageDigest);
    }

    @Override // s1.l
    public final x b(Context context, x xVar, int i, int i6) {
        c cVar = (c) xVar.get();
        x c0262d = new C0262d(((h) cVar.f914n.f664b).f941l, com.bumptech.glide.c.a(context).f23372n);
        l lVar = this.f921b;
        x b9 = lVar.b(context, c0262d, i, i6);
        if (!c0262d.equals(b9)) {
            c0262d.a();
        }
        ((h) cVar.f914n.f664b).c(lVar, (Bitmap) b9.get());
        return xVar;
    }

    @Override // s1.InterfaceC4970e
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f921b.equals(((d) obj).f921b);
        }
        return false;
    }

    @Override // s1.InterfaceC4970e
    public final int hashCode() {
        return this.f921b.hashCode();
    }
}
