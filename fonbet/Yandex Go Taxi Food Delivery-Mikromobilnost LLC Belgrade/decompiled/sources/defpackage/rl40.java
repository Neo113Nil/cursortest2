package defpackage;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class rl40 implements gog, fog {
    public final ArrayList a;
    public final l6e0 b;
    public int c;
    public Priority w;
    public fog x;
    public List y;
    public boolean z;

    public rl40(ArrayList arrayList, l6e0 l6e0Var) {
        this.b = l6e0Var;
        if (arrayList.isEmpty()) {
            ny61.g("Must not be empty.");
            throw null;
        }
        this.a = arrayList;
        this.c = 0;
    }

    @Override // defpackage.gog
    public final Class a() {
        return ((gog) this.a.get(0)).a();
    }

    @Override // defpackage.gog
    public final void b(Priority priority, fog fogVar) {
        this.w = priority;
        this.x = fogVar;
        this.y = (List) this.b.a();
        ((gog) this.a.get(this.c)).b(priority, this);
        if (this.z) {
            cancel();
        }
    }

    @Override // defpackage.gog
    public final DataSource c() {
        return ((gog) this.a.get(0)).c();
    }

    @Override // defpackage.gog
    public final void cancel() {
        this.z = true;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((gog) it.next()).cancel();
        }
    }

    @Override // defpackage.gog
    public final void cleanup() {
        List list = this.y;
        if (list != null) {
            this.b.a0(list);
        }
        this.y = null;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((gog) it.next()).cleanup();
        }
    }

    @Override // defpackage.fog
    public final void d(Object obj) {
        if (obj != null) {
            this.x.d(obj);
        } else {
            f();
        }
    }

    @Override // defpackage.fog
    public final void e(Exception exc) {
        List list = this.y;
        z2a1.e(list, "Argument must not be null");
        list.add(exc);
        f();
    }

    public final void f() {
        if (this.z) {
            return;
        }
        if (this.c < this.a.size() - 1) {
            this.c++;
            b(this.w, this.x);
        } else {
            z2a1.d(this.y);
            this.x.e(new GlideException("Fetch failed", new ArrayList(this.y)));
        }
    }
}
