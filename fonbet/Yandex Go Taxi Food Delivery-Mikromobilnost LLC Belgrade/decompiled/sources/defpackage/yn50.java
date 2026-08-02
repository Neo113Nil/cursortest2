package defpackage;

import android.net.Uri;
import android.widget.ImageView;
import com.yandex.images.b;
import java.io.File;

/* loaded from: classes15.dex */
public final class yn50 implements Comparable, g9v {
    public final b a;
    public final xn50 b;
    public bl7 c;

    public yn50(String str, b bVar) {
        xn50 xn50Var = new xn50(str);
        this.a = bVar;
        this.c = null;
        this.b = xn50Var;
    }

    public final void a() {
        bl7 bl7Var = this.c;
        if (bl7Var != null) {
            b bVar = this.a;
            bVar.getClass();
            bl7Var.a();
            bVar.h(bl7Var.d());
            this.c = null;
        }
    }

    public final Uri b(ImageView imageView, k9v k9vVar) {
        a();
        if (imageView == null && k9vVar == null) {
            z83.j("Must specify callback or target image view");
            return null;
        }
        b bVar = this.a;
        w3i w3iVar = bVar.b;
        xn50 xn50Var = this.b;
        ad7 d = w3iVar.d(xn50Var, true);
        if (d != null) {
            eu11.a(new l9(this, imageView, k9vVar, d, 20));
            Uri uri = d.b;
            return uri != null ? uri : Uri.EMPTY;
        }
        if (k9vVar != null) {
            eu11.a(new sf30(15, k9vVar));
        }
        String a = xn50Var.a();
        if (a == null) {
            a = xn50Var.a;
        }
        String str = a;
        if (imageView != null) {
            bl7 bl7Var = new bl7(bVar, imageView, xn50Var, str, 1);
            bl7Var.h = k9vVar;
            this.c = bl7Var;
        } else {
            bl7 bl7Var2 = new bl7(bVar, k9vVar, xn50Var, str, 0);
            bl7Var2.h = k9vVar;
            this.c = bl7Var2;
        }
        bVar.j(this.c);
        return null;
    }

    public final Uri c(k9v k9vVar) {
        Uri b = b(null, k9vVar);
        if (b != null && !Uri.EMPTY.equals(b)) {
            return b;
        }
        w3i w3iVar = this.a.b;
        w3iVar.getClass();
        xn50 xn50Var = this.b;
        z83.d(xn50Var, null);
        File g = w3iVar.g(xn50Var);
        if (g == null) {
            return null;
        }
        return w3iVar.h(g);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i = this.b.c;
        int i2 = ((yn50) obj).b.c;
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public final String toString() {
        return "NetImageCreator: ".concat(this.b.toString());
    }
}
