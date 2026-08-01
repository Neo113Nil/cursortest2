package L;

import a.AbstractC0078a;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.ArrayList;
import java.util.List;
import k0.K;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f407a;

    /* renamed from: b, reason: collision with root package name */
    public final int f408b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f409c;

    public /* synthetic */ a(int i, int i2, Object obj) {
        this.f407a = i2;
        this.f409c = obj;
        this.f408b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f407a) {
            case 0:
                F.b bVar = (F.b) ((B.b) this.f409c).f10b;
                if (bVar != null) {
                    bVar.g(this.f408b);
                    break;
                }
                break;
            case 1:
                ((N0.d) this.f409c).j(this.f408b);
                break;
            case 2:
                ArrayList arrayList = (ArrayList) this.f409c;
                int size = arrayList.size();
                int i = 0;
                if (this.f408b == 1) {
                    while (i < size) {
                        ((V.h) arrayList.get(i)).a();
                        i++;
                    }
                    break;
                } else {
                    while (i < size) {
                        ((V.h) arrayList.get(i)).getClass();
                        i++;
                    }
                    break;
                }
            default:
                RecyclerView recyclerView = ((MaterialCalendar) this.f409c).f2472d0;
                if (!recyclerView.f2181x) {
                    K k2 = recyclerView.f2162n;
                    if (k2 != null) {
                        k2.B0(recyclerView, this.f408b);
                        break;
                    } else {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        break;
                    }
                }
                break;
        }
    }

    public a(List list, int i, Throwable th) {
        this.f407a = 2;
        AbstractC0078a.g(list, "initCallbacks cannot be null");
        this.f409c = new ArrayList(list);
        this.f408b = i;
    }
}
