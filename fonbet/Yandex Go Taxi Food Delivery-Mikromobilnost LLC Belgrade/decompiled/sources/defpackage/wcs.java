package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class wcs implements vcs {
    public final String a;
    public final int b;
    public final int c;
    public final /* synthetic */ FragmentManager d;

    public wcs(FragmentManager fragmentManager, String str, int i, int i2) {
        this.d = fragmentManager;
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.vcs
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        Fragment fragment = this.d.A;
        if (fragment != null && this.b < 0 && this.a == null && fragment.getChildFragmentManager().a0(-1, 0)) {
            return false;
        }
        return this.d.b0(arrayList, arrayList2, this.a, this.b, this.c);
    }
}
