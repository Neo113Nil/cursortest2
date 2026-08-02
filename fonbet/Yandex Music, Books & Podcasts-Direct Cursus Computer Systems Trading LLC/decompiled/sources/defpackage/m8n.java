package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.VelocityTracker;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class m8n implements ag5 {
    public final /* synthetic */ l8n a;
    public final /* synthetic */ p8n b;

    public m8n(l8n l8nVar, p8n p8nVar) {
        this.a = l8nVar;
        this.b = p8nVar;
    }

    @Override // defpackage.ag5
    public final void b(mqs mqsVar) {
        mqsVar.getClass();
        p8n p8nVar = this.b;
        boolean z = p8nVar.g;
        l8n l8nVar = this.a;
        if (!z) {
            int c = l8nVar.c();
            Integer valueOf = Integer.valueOf(c);
            if (c < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                xan xanVar = p8nVar.d;
                mwk mwkVar = (mwk) p8nVar.f.get(intValue);
                xanVar.getClass();
                mwkVar.getClass();
                xanVar.b.d(mwkVar, intValue);
                return;
            }
            return;
        }
        s0f s0fVar = p8nVar.o;
        n8n n8nVar = s0fVar.m;
        RecyclerView recyclerView = s0fVar.r;
        n8nVar.getClass();
        if ((n8n.e(200723, recyclerView.getLayoutDirection()) & 16711680) == 0) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
            return;
        }
        if (l8nVar.a.getParent() != s0fVar.r) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }
        VelocityTracker velocityTracker = s0fVar.t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        s0fVar.t = VelocityTracker.obtain();
        s0fVar.i = 0.0f;
        s0fVar.h = 0.0f;
        s0fVar.q(l8nVar, 2);
    }

    @Override // defpackage.ag5
    public final void c(mqs mqsVar) {
        mqsVar.getClass();
        int c = this.a.c();
        Integer valueOf = Integer.valueOf(c);
        if (c < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            p8n p8nVar = this.b;
            xan xanVar = p8nVar.d;
            mwk mwkVar = (mwk) p8nVar.f.get(intValue);
            xanVar.getClass();
            mwkVar.getClass();
            xanVar.b.d(mwkVar, intValue);
        }
    }

    @Override // defpackage.ag5
    public final void d(mqs mqsVar) {
        mqsVar.getClass();
        xan xanVar = this.b.d;
        int c = this.a.c();
        Integer valueOf = Integer.valueOf(c);
        if (c < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            xanVar.a(valueOf.intValue());
        }
    }

    @Override // defpackage.ag5
    public final void e(Context context, mqs mqsVar) {
        context.getClass();
        mqsVar.getClass();
        p8n p8nVar = this.b;
        if (p8nVar.g) {
            p8n.w(p8nVar, this.a.c());
        }
    }
}
