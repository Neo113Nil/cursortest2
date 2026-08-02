package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.w;

/* loaded from: classes6.dex */
public final class tkv0 extends w {
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkv0(int i, Context context) {
        super(context);
        this.p = i;
    }

    @Override // androidx.recyclerview.widget.w
    public final int l(int i, View view) {
        return super.l(i, view) - this.p;
    }

    @Override // androidx.recyclerview.widget.w
    public final int p() {
        return -1;
    }

    @Override // androidx.recyclerview.widget.w
    public final int q() {
        return -1;
    }
}
