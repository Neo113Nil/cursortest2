package com.gamericefishpro.space.o1;

import android.content.Context;
import android.os.Build;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.i2.x1;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements v {
    public static boolean f = true;
    public final com.gamericefishpro.space.i2.t a;
    public final Object b = new Object();
    public com.gamericefishpro.space.s1.b c;
    public boolean d;
    public final d e;

    public e(com.gamericefishpro.space.i2.t tVar) {
        this.a = tVar;
        d dVar = new d(this);
        this.e = dVar;
        if (tVar.isAttachedToWindow()) {
            Context context = tVar.getContext();
            if (!this.d) {
                context.getApplicationContext().registerComponentCallbacks(dVar);
                this.d = true;
            }
        }
        tVar.addOnAttachStateChangeListener(new x1(5, this));
    }

    @Override // com.gamericefishpro.space.o1.v
    public final void a(com.gamericefishpro.space.r1.b bVar) {
        synchronized (this.b) {
            if (!bVar.s) {
                bVar.s = true;
                bVar.b();
            }
            Unit unit = Unit.a;
        }
    }

    @Override // com.gamericefishpro.space.o1.v
    public final com.gamericefishpro.space.r1.b b() {
        com.gamericefishpro.space.r1.d iVar;
        com.gamericefishpro.space.r1.b bVar;
        synchronized (this.b) {
            try {
                com.gamericefishpro.space.i2.t tVar = this.a;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    tVar.getUniqueDrawingId();
                }
                if (i >= 29) {
                    iVar = new com.gamericefishpro.space.r1.g();
                } else if (f) {
                    try {
                        iVar = new com.gamericefishpro.space.r1.e(this.a, new r(), new com.gamericefishpro.space.q1.b());
                    } catch (Throwable unused) {
                        f = false;
                        iVar = new com.gamericefishpro.space.r1.i(c(this.a));
                    }
                } else {
                    iVar = new com.gamericefishpro.space.r1.i(c(this.a));
                }
                bVar = new com.gamericefishpro.space.r1.b(iVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public final com.gamericefishpro.space.s1.a c(com.gamericefishpro.space.i2.t tVar) {
        com.gamericefishpro.space.s1.b bVar = this.c;
        if (bVar != null) {
            return bVar;
        }
        com.gamericefishpro.space.s1.b bVar2 = new com.gamericefishpro.space.s1.b(tVar.getContext());
        bVar2.setClipChildren(false);
        bVar2.setClipToPadding(false);
        bVar2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        tVar.addView(bVar2, -1);
        this.c = bVar2;
        return bVar2;
    }
}
