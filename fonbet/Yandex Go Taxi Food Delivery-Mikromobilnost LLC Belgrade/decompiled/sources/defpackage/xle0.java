package defpackage;

import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes10.dex */
public final class xle0 extends RecyclerView.a {
    public final RecyclerView.Adapter a;
    public final RecyclerView b;
    public final Preference c;
    public final String d;

    public xle0(RecyclerView.Adapter adapter, RecyclerView recyclerView, Preference preference, String str) {
        this.a = adapter;
        this.b = recyclerView;
        this.c = preference;
        this.d = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void a() {
        h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void b(int i, int i2) {
        h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void c(int i, int i2, Object obj) {
        h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void d(int i, int i2) {
        h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void e(int i, int i2) {
        h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void f(int i, int i2) {
        h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h() {
        int j;
        RecyclerView.Adapter adapter = this.a;
        adapter.unregisterAdapterDataObserver(this);
        Preference preference = this.c;
        if (preference != null) {
            j = ((ame0) ((yle0) adapter)).i(preference);
        } else {
            j = ((ame0) ((yle0) adapter)).j(this.d);
        }
        if (j != -1) {
            this.b.scrollToPosition(j);
        }
    }
}
