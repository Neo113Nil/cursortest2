package defpackage;

import android.database.DataSetObserver;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes3.dex */
public final class nr2 extends DataSetObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nr2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                k5c k5cVar = qr2.G;
                ((qr2) obj).i();
                break;
            case 1:
                rqr rqrVar = (rqr) obj;
                rqrVar.a = true;
                rqrVar.notifyDataSetChanged();
                break;
            case 2:
                y9g y9gVar = (y9g) obj;
                if (y9gVar.z.isShowing()) {
                    y9gVar.f();
                    break;
                }
                break;
            case 3:
                ((TabLayout) obj).h();
                break;
            default:
                ((lgu) obj).f();
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                k5c k5cVar = qr2.G;
                ((qr2) obj).i();
                break;
            case 1:
                rqr rqrVar = (rqr) obj;
                rqrVar.a = false;
                rqrVar.notifyDataSetInvalidated();
                break;
            case 2:
                ((y9g) obj).dismiss();
                break;
            case 3:
                ((TabLayout) obj).h();
                break;
            default:
                ((lgu) obj).f();
                break;
        }
    }
}
