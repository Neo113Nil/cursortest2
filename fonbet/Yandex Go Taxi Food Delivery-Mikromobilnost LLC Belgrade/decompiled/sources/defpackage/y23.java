package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public interface y23 extends b33 {
    @Override // defpackage.b33
    default w23 a(View view) {
        return new w23() { // from class: x23
            @Override // defpackage.w23
            public final void a(u1w u1wVar) {
                y23.this.b(u1wVar);
            }
        };
    }

    void b(u1w u1wVar);
}
