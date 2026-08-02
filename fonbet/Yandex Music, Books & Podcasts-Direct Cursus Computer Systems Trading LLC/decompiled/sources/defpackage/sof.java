package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.ViewParent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class sof implements rof {
    public final Context a;
    public final ezc b;
    public ViewManager c;

    /* JADX WARN: Multi-variable type inference failed */
    public sof(Context context, Function2 function2) {
        context.getClass();
        this.a = context;
        this.b = (ezc) function2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ezc, kotlin.jvm.functions.Function2] */
    public final ViewGroup.LayoutParams a(int i, int i2) {
        return (ViewGroup.LayoutParams) this.b.invoke(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public final View b(View view, Function1 function1) {
        view.getClass();
        j(view);
        function1.invoke(view);
        return view;
    }

    @Override // defpackage.hdu
    public final Context getCtx() {
        return this.a;
    }

    @Override // defpackage.rof
    public final void j(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            if (parent.equals(this.c) || parent.equals(this.c)) {
                return;
            }
            if (!(parent instanceof ViewGroup)) {
                b6e.l(parent, "View is attached to unknown parent ");
                return;
            }
            ((ViewGroup) parent).removeView(view);
        }
        ViewManager viewManager = this.c;
        if (viewManager instanceof ViewGroup) {
            ((ViewGroup) viewManager).addView(view);
            return;
        }
        if (viewManager instanceof Activity) {
            viewManager.addView(view, null);
        } else {
            if (viewManager == null) {
                xq0.q("viewManager is not attached");
                return;
            }
            throw new IllegalStateException(viewManager + " is the wrong parent");
        }
    }
}
