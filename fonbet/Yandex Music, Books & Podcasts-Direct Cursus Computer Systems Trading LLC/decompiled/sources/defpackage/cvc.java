package defpackage;

import android.graphics.Rect;

/* loaded from: classes.dex */
public final class cvc extends p6g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;

    public /* synthetic */ cvc(int i, Rect rect) {
        this.a = i;
        this.b = rect;
    }

    @Override // defpackage.p6g
    public final Rect E() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                Rect rect = this.b;
                if (rect.isEmpty()) {
                    return null;
                }
                return rect;
        }
    }
}
