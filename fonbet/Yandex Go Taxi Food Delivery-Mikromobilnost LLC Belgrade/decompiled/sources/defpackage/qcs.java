package defpackage;

import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public final class qcs implements hds {
    public final /* synthetic */ Fragment a;

    public qcs(Fragment fragment) {
        this.a = fragment;
    }

    @Override // defpackage.hds
    public final void a(Fragment fragment) {
        this.a.onAttachFragment(fragment);
    }
}
