package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes4.dex */
public final class zug implements zo31 {
    public final /* synthetic */ int a;
    public final LinearLayout b;
    public final TextView c;
    public final TextView d;

    public /* synthetic */ zug(LinearLayout linearLayout, TextView textView, TextView textView2, int i) {
        this.a = i;
        this.b = linearLayout;
        this.c = textView;
        this.d = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        switch (this.a) {
        }
        return this.b;
    }
}
