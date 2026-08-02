package defpackage;

import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.collections.a;

/* loaded from: classes13.dex */
public final class yyg implements DefaultLifecycleObserver {
    public final int a;
    public final /* synthetic */ j0g b;

    public yyg(j0g j0gVar, int i) {
        this.b = j0gVar;
        this.a = i;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(pey peyVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(pey peyVar) {
        Window window;
        j0g j0gVar = this.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) j0gVar.a;
        FragmentActivity fragmentActivity = (FragmentActivity) j0gVar.b;
        ViewGroup viewGroup = (ViewGroup) ((fragmentActivity == null || (window = fragmentActivity.getWindow()) == null) ? null : window.getDecorView());
        int i = this.a;
        if (viewGroup == null || i != viewGroup.getId()) {
            j0gVar.x(i);
            linkedHashMap.remove(Integer.valueOf(i));
        } else {
            Iterator it = a.J0(linkedHashMap.keySet()).iterator();
            while (it.hasNext()) {
                j0gVar.x(((Number) it.next()).intValue());
            }
            linkedHashMap.clear();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(pey peyVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(pey peyVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(pey peyVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(pey peyVar) {
    }
}
