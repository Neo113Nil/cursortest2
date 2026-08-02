package defpackage;

import android.content.Context;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class wf6 implements xf6 {
    public final gc5 a;

    public wf6(gc5 gc5Var) {
        this.a = gc5Var;
    }

    @Override // defpackage.xf6
    public final boolean b() {
        return false;
    }

    @Override // defpackage.xf6
    public final gc5 c(Context context, boolean z) {
        return this.a;
    }

    @Override // defpackage.xf6
    public final boolean d(String str) {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wf6) && this.a.equals(((wf6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RawItem(item=" + this.a + Extension.C_BRAKE;
    }
}
