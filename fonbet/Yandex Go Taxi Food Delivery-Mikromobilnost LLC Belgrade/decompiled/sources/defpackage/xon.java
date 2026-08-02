package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class xon {
    public final List a;
    public final RecyclerView b;
    public final AppBarLayout c;

    public xon(List list, RecyclerView recyclerView, AppBarLayout appBarLayout) {
        this.a = list;
        this.b = recyclerView;
        this.c = appBarLayout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xon)) {
            return false;
        }
        xon xonVar = (xon) obj;
        return jl40.l(this.a, xonVar.a) && jl40.l(this.b, xonVar.b) && jl40.l(this.c, xonVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        AppBarLayout appBarLayout = this.c;
        return hashCode + (appBarLayout == null ? 0 : appBarLayout.hashCode());
    }

    public final String toString() {
        return "ScrollContext(screenItems=" + this.a + ", recyclerView=" + this.b + ", appBarLayout=" + this.c + Extension.C_BRAKE;
    }

    public /* synthetic */ xon(RecyclerView recyclerView, List list) {
        this(list, recyclerView, null);
    }
}
