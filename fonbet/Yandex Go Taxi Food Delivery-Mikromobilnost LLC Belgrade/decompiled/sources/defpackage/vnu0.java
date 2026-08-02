package defpackage;

import com.ybsdk.core.stories.StoriesComponentView;
import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class vnu0 implements ynu0 {
    public final StoriesComponentView.a a;
    public final ColorModel b;
    public final boolean c;

    public vnu0(StoriesComponentView.a aVar, ColorModel colorModel, boolean z) {
        this.a = aVar;
        this.b = colorModel;
        this.c = z;
    }

    @Override // defpackage.ynu0
    public final boolean a() {
        return this.c;
    }

    public final ColorModel b() {
        return this.b;
    }

    public final StoriesComponentView.a c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vnu0)) {
            return false;
        }
        vnu0 vnu0Var = (vnu0) obj;
        return this.a.equals(vnu0Var.a) && this.b.equals(vnu0Var.b) && this.c == vnu0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + vfc.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(stories=");
        sb.append(this.a);
        sb.append(", backgroundColor=");
        sb.append(this.b);
        sb.append(", backButtonVisible=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
