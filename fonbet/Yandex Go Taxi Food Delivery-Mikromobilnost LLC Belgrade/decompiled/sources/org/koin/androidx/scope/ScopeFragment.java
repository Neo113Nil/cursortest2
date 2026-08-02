package org.koin.androidx.scope;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import defpackage.afy;
import defpackage.dbp0;
import defpackage.jl40;
import defpackage.kgx;
import defpackage.qoi0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lorg/koin/androidx/scope/ScopeFragment;", "Landroidx/fragment/app/Fragment;", "", "", "contentLayoutId", "", "initialiseScope", "<init>", "(IZ)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Z", "Ldbp0;", "scope$delegate", "Lafy;", "getScope", "()Ldbp0;", "scope", "koin-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ScopeFragment extends Fragment {
    static final /* synthetic */ kgx[] $$delegatedProperties;
    private final boolean initialiseScope;

    /* renamed from: scope$delegate, reason: from kotlin metadata */
    private final afy scope;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl("scope", 0, "getScope()Lorg/koin/core/scope/Scope;", ScopeFragment.class);
        qoi0.a.getClass();
        $$delegatedProperties = new kgx[]{propertyReference1Impl};
    }

    public /* synthetic */ ScopeFragment(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? true : z);
    }

    public dbp0 getScope() {
        kgx kgxVar = $$delegatedProperties[0];
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (this.initialiseScope) {
            getScope().getClass();
            jl40.M(getScope(), "Open Fragment Scope: ");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ScopeFragment() {
        this(0, 0 == true ? 1 : 0, 3, null);
    }

    public ScopeFragment(int i, boolean z) {
        super(i);
        this.initialiseScope = z;
        throw new IllegalStateException("KoinApplication has not been started");
    }
}
