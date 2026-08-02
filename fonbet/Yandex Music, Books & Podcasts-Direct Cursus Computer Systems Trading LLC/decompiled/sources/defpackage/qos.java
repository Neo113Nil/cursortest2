package defpackage;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class qos extends ViewGroup.MarginLayoutParams {
    public int a;
    public int b;

    public qos(qos qosVar) {
        super((ViewGroup.MarginLayoutParams) qosVar);
        this.a = 0;
        this.a = qosVar.a;
    }

    public qos(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
