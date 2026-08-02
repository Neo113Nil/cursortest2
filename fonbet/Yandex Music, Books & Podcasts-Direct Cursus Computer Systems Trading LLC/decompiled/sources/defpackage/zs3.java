package defpackage;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zs3 implements Runnable {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public zs3(List list, int i, Throwable th) {
        this.a = 1;
        o5g.w(list, "initCallbacks cannot be null");
        this.c = new ArrayList(list);
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gao gaoVar = (gao) this.c;
                int i = this.b;
                hag hagVar = (hag) gaoVar.a;
                if (hagVar != null) {
                    hagVar.t(i);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                int i2 = 0;
                if (this.b == 1) {
                    while (i2 < size) {
                        ((p3b) arrayList.get(i2)).b();
                        i2++;
                    }
                    break;
                } else {
                    while (i2 < size) {
                        ((p3b) arrayList.get(i2)).a();
                        i2++;
                    }
                    break;
                }
            case 2:
                try {
                    int i3 = this.b;
                    this.b = i3 + 1;
                    m4h m4hVar = (m4h) this.c;
                    if (i3 < 3) {
                        m4hVar.f.send(((m4h) this.c).e);
                    } else {
                        m4hVar.j.shutdown();
                    }
                    break;
                } catch (IOException e) {
                    Log.e("MSFDSearchProvider", Log.getStackTraceString(e));
                    return;
                }
            case 3:
                ((adh) this.c).n.C0(this.b);
                break;
            case 4:
                ((RecyclerView) this.c).C0(this.b);
                break;
            case 5:
                ((axw) this.c).g(this.b);
                break;
            default:
                ((fox) this.c).G.b(this.b);
                break;
        }
    }

    public zs3(m4h m4hVar) {
        this.a = 2;
        this.c = m4hVar;
        this.b = 0;
    }

    public zs3(int i, ggu gguVar) {
        this.a = 4;
        this.b = i;
        this.c = gguVar;
    }

    public /* synthetic */ zs3(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
