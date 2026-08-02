package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class vuc {
    public static final avc a = new avc();
    public static final bvc b;

    static {
        bvc bvcVar = null;
        try {
            bvcVar = (bvc) gvc.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = bvcVar;
    }

    public static final void a(ArrayList arrayList, int i) {
        arrayList.getClass();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }
}
