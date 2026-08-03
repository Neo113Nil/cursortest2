package m;

import android.database.DataSetObserver;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l0 extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4378a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4379b;

    public /* synthetic */ l0(int i10, Object obj) {
        this.f4378a = i10;
        this.f4379b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f4378a) {
            case 0:
                o0 o0Var = (o0) this.f4379b;
                if (o0Var.B.isShowing()) {
                    o0Var.b();
                    break;
                }
                break;
            default:
                i1 i1Var = (i1) this.f4379b;
                i1Var.f4862g = true;
                i1Var.notifyDataSetChanged();
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f4378a) {
            case 0:
                ((o0) this.f4379b).dismiss();
                break;
            default:
                i1 i1Var = (i1) this.f4379b;
                i1Var.f4862g = false;
                i1Var.notifyDataSetInvalidated();
                break;
        }
    }
}
