package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class yyr {
    public final wyr a;
    public final ArrayList b = new ArrayList();
    public zne c;
    public zne d;
    public int e;

    public yyr(ViewGroup viewGroup) {
        zne zneVar = zne.e;
        this.c = zneVar;
        this.d = zneVar;
        Drawable background = viewGroup.getBackground();
        this.e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        wyr wyrVar = new wyr(this, viewGroup.getContext(), viewGroup);
        this.a = wyrVar;
        wyrVar.setWillNotDraw(true);
        h5n h5nVar = new h5n(15, this);
        WeakHashMap weakHashMap = wdu.a;
        ndu.n(wyrVar, h5nVar);
        wdu.t(wyrVar, new xyr(this));
        viewGroup.addView(wyrVar, 0);
    }
}
