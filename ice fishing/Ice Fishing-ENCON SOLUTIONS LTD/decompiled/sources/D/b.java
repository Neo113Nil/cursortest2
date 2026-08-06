package D;

import android.database.DataSetObserver;
import h.AbstractC0202I;
import h.d0;

/* loaded from: classes.dex */
public final class b extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f200b;

    public /* synthetic */ b(int i2, Object obj) {
        this.f199a = i2;
        this.f200b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f199a) {
            case 0:
                d0 d0Var = (d0) this.f200b;
                d0Var.f201a = true;
                d0Var.notifyDataSetChanged();
                break;
            default:
                AbstractC0202I abstractC0202I = (AbstractC0202I) this.f200b;
                if (abstractC0202I.f3178v.isShowing()) {
                    abstractC0202I.c();
                    break;
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f199a) {
            case 0:
                d0 d0Var = (d0) this.f200b;
                d0Var.f201a = false;
                d0Var.notifyDataSetInvalidated();
                break;
            default:
                ((AbstractC0202I) this.f200b).dismiss();
                break;
        }
    }
}
