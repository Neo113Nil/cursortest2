package defpackage;

import android.graphics.drawable.Drawable;
import com.yandex.messaging.internal.view.timeline.DialogItemProgressDrawable;
import com.yandex.messaging.internal.view.timeline.DialogItemStaticDrawable;
import kotlin.a;

/* loaded from: classes15.dex */
public final class y9z0 {
    public final i3y a;
    public final i3y b;

    public y9z0(final z9z0 z9z0Var, final int i, final int i2, final int i3) {
        final int i4 = 0;
        this.a = a.a(new sls() { // from class: x9z0
            @Override // defpackage.sls
            public final Object invoke() {
                int i5 = i4;
                z9z0 z9z0Var2 = z9z0Var;
                switch (i5) {
                    case 0:
                        return new DialogItemStaticDrawable(z9z0Var2.c, i, i2, i3);
                    default:
                        return new DialogItemProgressDrawable(z9z0Var2.b, z9z0Var2.a, i, i2, i3);
                }
            }
        });
        final int i5 = 1;
        this.b = a.a(new sls() { // from class: x9z0
            @Override // defpackage.sls
            public final Object invoke() {
                int i52 = i5;
                z9z0 z9z0Var2 = z9z0Var;
                switch (i52) {
                    case 0:
                        return new DialogItemStaticDrawable(z9z0Var2.c, i, i2, i3);
                    default:
                        return new DialogItemProgressDrawable(z9z0Var2.b, z9z0Var2.a, i, i2, i3);
                }
            }
        });
    }

    public final Drawable a(boolean z) {
        return z ? (Drawable) this.b.getValue() : (Drawable) this.a.getValue();
    }
}
