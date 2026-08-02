package defpackage;

import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.t;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class fh7 implements yn7 {
    public final int a;
    public final /* synthetic */ gh7 b;

    public fh7(gh7 gh7Var, int i) {
        this.b = gh7Var;
        this.a = i;
    }

    @Override // defpackage.yn7
    public final void onCreate(dzf dzfVar) {
        dzfVar.getClass();
    }

    @Override // defpackage.yn7
    public final void onDestroy(dzf dzfVar) {
        Window window;
        gh7 gh7Var = this.b;
        LinkedHashMap linkedHashMap = gh7Var.a;
        t tVar = gh7Var.b;
        ViewGroup viewGroup = (ViewGroup) ((tVar == null || (window = tVar.getWindow()) == null) ? null : window.getDecorView());
        int i = this.a;
        if (viewGroup == null || i != viewGroup.getId()) {
            gh7Var.c(i);
            linkedHashMap.remove(Integer.valueOf(i));
        } else {
            Iterator it = CollectionsKt.w0(linkedHashMap.keySet()).iterator();
            while (it.hasNext()) {
                gh7Var.c(((Number) it.next()).intValue());
            }
            linkedHashMap.clear();
        }
    }

    @Override // defpackage.yn7
    public final void onResume(dzf dzfVar) {
        dzfVar.getClass();
    }

    @Override // defpackage.yn7
    public final void onStart(dzf dzfVar) {
        dzfVar.getClass();
    }

    @Override // defpackage.yn7
    public final void onPause(dzf dzfVar) {
    }

    @Override // defpackage.yn7
    public final void onStop(dzf dzfVar) {
    }
}
