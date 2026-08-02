package defpackage;

import android.graphics.RenderEffect;

/* loaded from: classes.dex */
public abstract class qwn {
    public RenderEffect a;

    public final RenderEffect a() {
        RenderEffect renderEffect = this.a;
        if (renderEffect != null) {
            return renderEffect;
        }
        RenderEffect b = b();
        this.a = b;
        return b;
    }

    public abstract RenderEffect b();
}
