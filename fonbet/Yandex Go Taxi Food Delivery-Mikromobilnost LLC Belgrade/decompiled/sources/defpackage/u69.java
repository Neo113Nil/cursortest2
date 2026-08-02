package defpackage;

import android.graphics.Point;
import android.view.View;

/* loaded from: classes11.dex */
public final class u69 extends wce0 {
    public final Point d;
    public final int[] e;

    public u69(View view, View view2, Point point) {
        super(view, view2);
        this.d = point;
        this.e = new int[2];
    }

    @Override // defpackage.wce0
    public final int c() {
        return 8388691;
    }

    @Override // defpackage.wce0
    public final float e() {
        return 0.0f;
    }

    @Override // defpackage.wce0
    public final Point f() {
        View view = this.a;
        int[] iArr = this.e;
        view.getLocationInWindow(iArr);
        int measuredHeight = iArr[1] - this.b.getMeasuredHeight();
        int i = iArr[0];
        Point point = this.d;
        return new Point((view.getMeasuredWidth() / 2) + i + point.x, (view.getMeasuredHeight() / 2) + measuredHeight + point.y);
    }
}
