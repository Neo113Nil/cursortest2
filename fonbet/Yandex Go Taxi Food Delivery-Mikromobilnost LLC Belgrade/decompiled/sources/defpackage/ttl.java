package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes9.dex */
public final class ttl implements lml {
    public final Context b;
    public final i3y c;
    public final i3y d;
    public final i3y e;
    public final i3y f;

    public ttl(Context context) {
        this.b = context;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final int i = 0;
        this.c = a.b(lazyThreadSafetyMode, new sls(this) { // from class: stl
            public final /* synthetic */ ttl b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                ttl ttlVar = this.b;
                switch (i2) {
                    case 0:
                        Typeface b = wuj0.b(l5h0.ys_display_regular, ttlVar.b);
                        if (b == null) {
                            break;
                        }
                        break;
                    case 1:
                        Typeface b2 = wuj0.b(l5h0.ys_display_medium, ttlVar.b);
                        if (b2 == null) {
                            break;
                        }
                        break;
                    case 2:
                        Typeface b3 = wuj0.b(l5h0.ys_display_light, ttlVar.b);
                        if (b3 == null) {
                            break;
                        }
                        break;
                    default:
                        Typeface b4 = wuj0.b(l5h0.ys_display_bold, ttlVar.b);
                        if (b4 == null) {
                            break;
                        }
                        break;
                }
                return Typeface.DEFAULT;
            }
        });
        final int i2 = 1;
        this.d = a.b(lazyThreadSafetyMode, new sls(this) { // from class: stl
            public final /* synthetic */ ttl b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                ttl ttlVar = this.b;
                switch (i22) {
                    case 0:
                        Typeface b = wuj0.b(l5h0.ys_display_regular, ttlVar.b);
                        if (b == null) {
                            break;
                        }
                        break;
                    case 1:
                        Typeface b2 = wuj0.b(l5h0.ys_display_medium, ttlVar.b);
                        if (b2 == null) {
                            break;
                        }
                        break;
                    case 2:
                        Typeface b3 = wuj0.b(l5h0.ys_display_light, ttlVar.b);
                        if (b3 == null) {
                            break;
                        }
                        break;
                    default:
                        Typeface b4 = wuj0.b(l5h0.ys_display_bold, ttlVar.b);
                        if (b4 == null) {
                            break;
                        }
                        break;
                }
                return Typeface.DEFAULT;
            }
        });
        final int i3 = 2;
        this.e = a.b(lazyThreadSafetyMode, new sls(this) { // from class: stl
            public final /* synthetic */ ttl b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                ttl ttlVar = this.b;
                switch (i22) {
                    case 0:
                        Typeface b = wuj0.b(l5h0.ys_display_regular, ttlVar.b);
                        if (b == null) {
                            break;
                        }
                        break;
                    case 1:
                        Typeface b2 = wuj0.b(l5h0.ys_display_medium, ttlVar.b);
                        if (b2 == null) {
                            break;
                        }
                        break;
                    case 2:
                        Typeface b3 = wuj0.b(l5h0.ys_display_light, ttlVar.b);
                        if (b3 == null) {
                            break;
                        }
                        break;
                    default:
                        Typeface b4 = wuj0.b(l5h0.ys_display_bold, ttlVar.b);
                        if (b4 == null) {
                            break;
                        }
                        break;
                }
                return Typeface.DEFAULT;
            }
        });
        final int i4 = 3;
        this.f = a.b(lazyThreadSafetyMode, new sls(this) { // from class: stl
            public final /* synthetic */ ttl b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i4;
                ttl ttlVar = this.b;
                switch (i22) {
                    case 0:
                        Typeface b = wuj0.b(l5h0.ys_display_regular, ttlVar.b);
                        if (b == null) {
                            break;
                        }
                        break;
                    case 1:
                        Typeface b2 = wuj0.b(l5h0.ys_display_medium, ttlVar.b);
                        if (b2 == null) {
                            break;
                        }
                        break;
                    case 2:
                        Typeface b3 = wuj0.b(l5h0.ys_display_light, ttlVar.b);
                        if (b3 == null) {
                            break;
                        }
                        break;
                    default:
                        Typeface b4 = wuj0.b(l5h0.ys_display_bold, ttlVar.b);
                        if (b4 == null) {
                            break;
                        }
                        break;
                }
                return Typeface.DEFAULT;
            }
        });
    }

    @Override // defpackage.lml
    public final Typeface a() {
        return (Typeface) this.c.getValue();
    }

    @Override // defpackage.lml
    public final Typeface b() {
        return (Typeface) this.d.getValue();
    }

    @Override // defpackage.lml
    public final Typeface c() {
        return (Typeface) this.f.getValue();
    }

    @Override // defpackage.lml
    public final Typeface getLight() {
        return (Typeface) this.e.getValue();
    }
}
