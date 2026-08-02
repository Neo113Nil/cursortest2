package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.c;
import com.ybsdk.feature.qr.internal.screens.container.QrContainerFragment;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes14.dex */
public final class s6g0 extends yds {
    public final FragmentManager C;
    public final c D;
    public final LinkedHashMap E;

    public s6g0(FragmentManager fragmentManager, QrContainerFragment qrContainerFragment) {
        super(fragmentManager, qrContainerFragment.getLifecycle());
        this.C = fragmentManager;
        this.D = new c(this, new r6g0());
        this.E = new LinkedHashMap();
    }

    public final List getCurrentList() {
        return this.D.f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.D.f.size();
    }

    public final Fragment n(int i) {
        WeakReference weakReference = (WeakReference) this.E.get(Integer.valueOf(i));
        if (weakReference != null) {
            return (Fragment) weakReference.get();
        }
        return null;
    }

    public final void submitList(List list) {
        this.D.b(list, null);
    }
}
