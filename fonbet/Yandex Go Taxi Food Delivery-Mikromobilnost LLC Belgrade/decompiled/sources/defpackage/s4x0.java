package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.c;

/* loaded from: classes11.dex */
public final class s4x0 implements c {
    public final Typeface a;
    public final Typeface b;

    public s4x0(Typeface typeface, Typeface typeface2, ke31 ke31Var) {
        this.a = typeface;
        this.b = typeface2;
    }

    @Override // com.google.android.material.tabs.c
    public final void a(TabLayout.a aVar) {
        TextView b = tt31.b(aVar);
        if (b != null) {
            b.setTypeface(this.b);
        }
    }

    @Override // com.google.android.material.tabs.c
    public final void b(TabLayout.a aVar) {
        TextView b = tt31.b(aVar);
        if (b != null) {
            b.setTypeface(this.a);
        }
    }
}
