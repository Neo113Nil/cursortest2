package defpackage;

import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final /* synthetic */ class en9 implements szm {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ en9(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return (tc9) this.b;
            case 1:
                WeakReference weakReference = ((rjo) this.b).j;
                if (weakReference != null) {
                    return (gc8) weakReference.get();
                }
                return null;
            case 2:
                return ((TextView) this.b).getLayout();
            default:
                return (o3a) ((t0a) this.b).invoke();
        }
    }
}
