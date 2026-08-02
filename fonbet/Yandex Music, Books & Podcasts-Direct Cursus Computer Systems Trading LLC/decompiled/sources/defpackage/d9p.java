package defpackage;

import android.content.pm.PackageManager;
import java.util.List;

/* loaded from: classes6.dex */
public final class d9p extends f9p {
    public final /* synthetic */ PackageManager a;
    public final /* synthetic */ List b;

    public d9p(PackageManager packageManager, List list) {
        this.a = packageManager;
        this.b = list;
    }

    @Override // defpackage.f9p
    public final sgr a(int i) {
        return og3.e(this.a, i, this.b);
    }
}
