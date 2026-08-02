package defpackage;

import androidx.room.util.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.b;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class v08 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WorkDatabase b;
    public final /* synthetic */ String c;
    public final /* synthetic */ b w;

    public /* synthetic */ v08(WorkDatabase workDatabase, String str, b bVar, int i) {
        this.a = i;
        this.b = workDatabase;
        this.c = str;
        this.w = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        b bVar = this.w;
        String str = this.c;
        WorkDatabase workDatabase = this.b;
        switch (i) {
            case 0:
                Iterator it = ((List) a.b(workDatabase.X0().a, true, false, new brd(str, 19))).iterator();
                while (it.hasNext()) {
                    eja1.i(bVar, (String) it.next());
                }
                break;
            default:
                Iterator it2 = ((List) a.b(workDatabase.X0().a, true, false, new brd(str, 22))).iterator();
                while (it2.hasNext()) {
                    eja1.i(bVar, (String) it2.next());
                }
                break;
        }
    }
}
