package defpackage;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.yandex.plus.core.debug.panel.internal.presentation.view.g;
import com.yandex.plus.core.debug.panel.internal.presentation.view.i;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zch extends dpn {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public zch(adh adhVar, vdi vdiVar) {
        this.c = adhVar;
        this.b = vdiVar;
    }

    @Override // defpackage.dpn
    public void a(RecyclerView recyclerView, int i) {
        switch (this.a) {
            case 1:
                if (i == 0) {
                    ((i) this.b).invoke();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.dpn
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int i3 = this.a;
        Object obj = this.c;
        switch (i3) {
            case 0:
                cs3 cs3Var = ((vdi) this.b).d;
                adh adhVar = (adh) obj;
                RecyclerView recyclerView2 = adhVar.n;
                int r1 = i < 0 ? ((LinearLayoutManager) recyclerView2.getLayoutManager()).r1() : ((LinearLayoutManager) recyclerView2.getLayoutManager()).t1();
                Calendar a = fut.a(cs3Var.a.a);
                a.add(2, r1);
                sdi sdiVar = new sdi(a);
                adhVar.j = sdiVar;
                MaterialButton materialButton = adhVar.s;
                Calendar a2 = fut.a(cs3Var.a.a);
                a2.add(2, r1);
                a2.set(5, 1);
                Calendar a3 = fut.a(a2);
                a3.get(2);
                a3.get(1);
                a3.getMaximum(7);
                a3.getActualMaximum(5);
                a3.getTimeInMillis();
                long timeInMillis = a3.getTimeInMillis();
                Locale locale = Locale.getDefault();
                AtomicReference atomicReference = fut.a;
                DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
                instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
                instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
                materialButton.setText(instanceForSkeleton.format(new Date(timeInMillis)));
                adhVar.z(cs3Var.a.e(sdiVar));
                break;
            default:
                ((g) obj).invoke(Integer.valueOf(i2));
                break;
        }
    }

    public zch(i iVar, g gVar) {
        this.b = iVar;
        this.c = gVar;
    }
}
