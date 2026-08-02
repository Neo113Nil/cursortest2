package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zsn {
    public final dtn a;
    public boolean b;
    public boolean c;
    public int[] d;
    public int e = 0;
    public final ach f = new ach();

    public zsn(dtn dtnVar) {
        this.a = dtnVar;
    }

    public final void a(List list) {
        this.c = true;
        if (list == null) {
            this.d = null;
            return;
        }
        this.d = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            this.d[i] = ((Integer) it.next()).intValue();
            i++;
        }
        Arrays.sort(this.d);
    }
}
