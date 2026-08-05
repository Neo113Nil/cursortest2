package defpackage;

import android.view.View;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ji extends w30 {
    public final /* synthetic */ li sjUBp5pO;

    public ji(li liVar) {
        this.sjUBp5pO = liVar;
    }

    @Override // defpackage.w30
    public final View VhgXwMj9(int i) {
        li liVar = this.sjUBp5pO;
        View view = liVar.ytu5o6f4;
        if (view != null) {
            return view.findViewById(i);
        }
        m1.ygLcUYwZ(liVar, " does not have a view", "Fragment ");
        return null;
    }

    @Override // defpackage.w30
    public final boolean aZz0PFXp() {
        return this.sjUBp5pO.ytu5o6f4 != null;
    }
}
