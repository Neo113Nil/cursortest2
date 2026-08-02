package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.ui.graphics.AndroidGraphicsContext$1;
import androidx.compose.ui.graphics.layer.a;
import androidx.compose.ui.platform.AndroidComposeView;
import defpackage.t92;

/* loaded from: classes.dex */
public final class t92 implements l0u {
    public final AndroidComposeView a;
    public final Object b = new Object();
    public boolean c;
    public final AndroidGraphicsContext$1 d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.ComponentCallbacks, androidx.compose.ui.graphics.AndroidGraphicsContext$1] */
    public t92(AndroidComposeView androidComposeView) {
        this.a = androidComposeView;
        ?? r0 = new ComponentCallbacks2() { // from class: androidx.compose.ui.graphics.AndroidGraphicsContext$1
            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(Configuration newConfig) {
            }

            @Override // android.content.ComponentCallbacks
            public void onLowMemory() {
            }

            @Override // android.content.ComponentCallbacks2
            public void onTrimMemory(int level) {
                if (level >= 40) {
                    t92.this.getClass();
                }
            }
        };
        this.d = r0;
        if (androidComposeView.isAttachedToWindow()) {
            Context context = androidComposeView.getContext();
            if (!this.c) {
                context.getApplicationContext().registerComponentCallbacks(r0);
                this.c = true;
            }
        }
        androidComposeView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.graphics.AndroidGraphicsContext$2
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                t92 t92Var = t92.this;
                Context context2 = v.getContext();
                if (t92Var.c) {
                    return;
                }
                context2.getApplicationContext().registerComponentCallbacks(t92Var.d);
                t92Var.c = true;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
                t92 t92Var = t92.this;
                Context context2 = v.getContext();
                if (t92Var.c) {
                    context2.getApplicationContext().unregisterComponentCallbacks(t92Var.d);
                    t92Var.c = false;
                }
                t92.this.getClass();
            }
        });
    }

    @Override // defpackage.l0u
    public final a a() {
        a aVar;
        synchronized (this.b) {
            this.a.getUniqueDrawingId();
            aVar = new a(new o0u());
        }
        return aVar;
    }

    @Override // defpackage.l0u
    public final void b(a aVar) {
        synchronized (this.b) {
            if (!aVar.s) {
                aVar.s = true;
                aVar.b();
            }
        }
    }
}
