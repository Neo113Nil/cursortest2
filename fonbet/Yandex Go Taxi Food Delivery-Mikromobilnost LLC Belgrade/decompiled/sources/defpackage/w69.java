package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.w;

/* loaded from: classes12.dex */
public final class w69 extends w {
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w69(Context context, int i) {
        super(context);
        this.p = i;
    }

    @Override // androidx.recyclerview.widget.w
    public int j(int i, int i2, int i3, int i4, int i5) {
        switch (this.p) {
            case 0:
                return ((i3 + i4) / 2) - ((i + i2) / 2);
            default:
                return super.j(i, i2, i3, i4, i5);
        }
    }

    @Override // androidx.recyclerview.widget.w
    public int o(int i) {
        switch (this.p) {
            case 1:
                return 100;
            default:
                return super.o(i);
        }
    }

    @Override // androidx.recyclerview.widget.w
    public int p() {
        switch (this.p) {
            case 2:
                return -1;
            default:
                return super.p();
        }
    }

    @Override // androidx.recyclerview.widget.w
    public int q() {
        switch (this.p) {
            case 2:
                return -1;
            default:
                return super.q();
        }
    }
}
