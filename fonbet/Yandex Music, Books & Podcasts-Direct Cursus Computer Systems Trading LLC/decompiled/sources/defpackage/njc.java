package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class njc extends ActionMode.Callback2 {
    public final eps a;

    public njc(eps epsVar) {
        this.a = epsVar;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        eps epsVar = this.a;
        epsVar.getClass();
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        sxh sxhVar = sxh.Copy;
        if (itemId == 0) {
            Function0 function0 = (Function0) epsVar.c;
            if (function0 != null) {
                function0.invoke();
            }
        } else if (itemId == 1) {
            Function0 function02 = (Function0) epsVar.d;
            if (function02 != null) {
                function02.invoke();
            }
        } else if (itemId == 2) {
            Function0 function03 = (Function0) epsVar.e;
            if (function03 != null) {
                function03.invoke();
            }
        } else if (itemId == 3) {
            Function0 function04 = (Function0) epsVar.f;
            if (function04 != null) {
                function04.invoke();
            }
        } else {
            if (itemId != 4) {
                return false;
            }
            Function0 function05 = (Function0) epsVar.g;
            if (function05 != null) {
                function05.invoke();
            }
        }
        if (actionMode != null) {
            actionMode.finish();
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        eps epsVar = this.a;
        epsVar.getClass();
        if (menu == null) {
            xq0.x("onCreateActionMode requires a non-null menu");
            return false;
        }
        if (actionMode == null) {
            xq0.x("onCreateActionMode requires a non-null mode");
            return false;
        }
        if (((Function0) epsVar.c) != null) {
            eps.a(menu, sxh.Copy);
        }
        if (((Function0) epsVar.d) != null) {
            eps.a(menu, sxh.Paste);
        }
        if (((Function0) epsVar.e) != null) {
            eps.a(menu, sxh.Cut);
        }
        if (((Function0) epsVar.f) != null) {
            eps.a(menu, sxh.SelectAll);
        }
        if (((Function0) epsVar.g) == null || Build.VERSION.SDK_INT < 26) {
            return true;
        }
        eps.a(menu, sxh.Autofill);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        ((k5) this.a.a).invoke();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        ynn ynnVar = (ynn) this.a.b;
        if (rect != null) {
            rect.set((int) ynnVar.a, (int) ynnVar.b, (int) ynnVar.c, (int) ynnVar.d);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        eps epsVar = this.a;
        epsVar.getClass();
        if (actionMode == null || menu == null) {
            return false;
        }
        eps.b(menu, sxh.Copy, (Function0) epsVar.c);
        eps.b(menu, sxh.Paste, (Function0) epsVar.d);
        eps.b(menu, sxh.Cut, (Function0) epsVar.e);
        eps.b(menu, sxh.SelectAll, (Function0) epsVar.f);
        eps.b(menu, sxh.Autofill, (Function0) epsVar.g);
        return true;
    }
}
