package defpackage;

import android.view.View;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public final /* synthetic */ class q2w implements g18 {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ q2w(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // defpackage.g18
    public final void cancel() {
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                WeakHashMap weakHashMap = b.a;
                ViewCompat$Api21Impl.o(view, null);
                break;
            default:
                WeakHashMap weakHashMap2 = b.a;
                ViewCompat$Api21Impl.o(view, null);
                break;
        }
    }
}
