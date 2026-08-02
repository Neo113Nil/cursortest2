package defpackage;

import android.view.View;
import android.view.animation.PathInterpolator;

/* loaded from: classes.dex */
public abstract class kym {
    public final jym a;
    public zne b;
    public zne c;
    public lym d;

    static {
        new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
        new PathInterpolator(0.6f, 0.0f, 1.0f, 1.0f);
        new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);
    }

    public kym() {
        jym jymVar = new jym();
        jymVar.a = -1;
        zne zneVar = zne.e;
        jymVar.b = zneVar;
        jymVar.c = false;
        jymVar.d = null;
        jymVar.e = 0.0f;
        jymVar.f = 0.0f;
        jymVar.g = 1.0f;
        this.a = jymVar;
        this.b = zneVar;
        this.c = zneVar;
        this.d = null;
    }

    public final void a(float f) {
        float f2 = f * 1.0f;
        jym jymVar = this.a;
        if (jymVar.g != f2) {
            jymVar.g = f2;
            jtc jtcVar = jymVar.h;
            if (jtcVar != null) {
                ((View) jtcVar.b).setAlpha(f2);
            }
        }
    }

    public final void b(float f) {
        jym jymVar = this.a;
        float f2 = (-(1.0f - (f * 1.0f))) * jymVar.a;
        if (jymVar.f != f2) {
            jymVar.f = f2;
            jtc jtcVar = jymVar.h;
            if (jtcVar != null) {
                ((View) jtcVar.b).setTranslationY(f2);
            }
        }
    }
}
