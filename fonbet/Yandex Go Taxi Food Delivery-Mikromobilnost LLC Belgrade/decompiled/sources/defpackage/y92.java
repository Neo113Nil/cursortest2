package defpackage;

import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class y92 implements bsv {
    public final ArrayList a;
    public final int b;
    public final MotionEvent c;

    public y92(ArrayList arrayList, int i, MotionEvent motionEvent) {
        this.a = arrayList;
        this.b = i;
        this.c = motionEvent;
        if (arrayList.isEmpty()) {
            ny61.g("changes cannot be empty");
            throw null;
        }
    }

    public final List a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }
}
