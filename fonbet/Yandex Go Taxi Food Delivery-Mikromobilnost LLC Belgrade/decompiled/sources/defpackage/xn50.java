package defpackage;

import android.net.Uri;
import com.yandex.alicekit.core.views.EmptyDrawable;
import com.yandex.images.utils.ScaleMode;
import java.util.ArrayList;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes15.dex */
public final class xn50 {
    public final String a;
    public final Uri b;
    public int d;
    public EmptyDrawable e;
    public ScaleMode k;
    public ow01 m;
    public int c = 0;
    public boolean f = false;
    public boolean g = false;
    public int h = 0;
    public int i = -1;
    public int j = -1;
    public boolean l = false;

    public xn50(String str) {
        this.a = str;
        this.b = Uri.parse(str);
    }

    public final String a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.a);
        int i = this.i;
        if (i != -1 || this.j != -1) {
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(this.j));
        }
        ScaleMode scaleMode = this.k;
        if (scaleMode != null) {
            arrayList.add(scaleMode);
        }
        if (this.g) {
            arrayList.add(Boolean.TRUE);
        }
        ow01 ow01Var = this.m;
        if (ow01Var != null) {
            arrayList.add(ow01Var.z());
        }
        return n8u.a(arrayList.toArray(new Object[0]));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xn50.class != obj.getClass()) {
            return false;
        }
        xn50 xn50Var = (xn50) obj;
        if (this.i == xn50Var.i && this.j == xn50Var.j && this.k == xn50Var.k) {
            return this.a.equals(xn50Var.a);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.i) * 31) + this.j;
        ScaleMode scaleMode = this.k;
        if (scaleMode == null) {
            return hashCode;
        }
        return scaleMode.ordinal() + (hashCode * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetImage{");
        sb.append(this.a);
        sb.append("@");
        sb.append(this.i);
        sb.append(RemoteBioParameters.X);
        return oyr.m(this.j, "}", sb);
    }
}
