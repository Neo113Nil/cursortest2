package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class umq implements sgm {
    public final b0h a;
    public int b;
    public Bitmap.Config c;

    public umq(b0h b0hVar) {
        this.a = b0hVar;
    }

    @Override // defpackage.sgm
    public final void a() {
        this.a.x(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof umq) {
            umq umqVar = (umq) obj;
            if (this.b == umqVar.b && xut.b(this.c, umqVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b * 31;
        Bitmap.Config config = this.c;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return vmq.c(this.b, this.c);
    }
}
