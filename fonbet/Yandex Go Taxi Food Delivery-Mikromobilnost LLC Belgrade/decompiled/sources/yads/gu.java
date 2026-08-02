package yads;

import android.view.View;
import defpackage.tls;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class gu extends Lambda implements tls {
    public static final gu w = new gu();

    public gu() {
        super(1);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Object parent = ((View) obj).getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
