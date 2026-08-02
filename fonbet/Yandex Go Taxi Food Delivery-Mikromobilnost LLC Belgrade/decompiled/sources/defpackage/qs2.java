package defpackage;

import com.yandex.go.flex.main_screen.data.DocumentSourceVariableFactory$Companion$DocumentSource;
import com.yandex.go.flex.main_screen.data.widgets.shimmer.ShimmerWidgetSection;
import com.yandex.go.flex.main_screen.shared_data.SectionStatus;
import com.yandex.go.flex.main_screen.shared_data.SuperAppGrid;
import com.yandex.go.lifecycle.processor.e;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.EmptySet;
import kotlin.collections.b;
import ru.yandex.taxi.perf.Milestone;

/* loaded from: classes.dex */
public final class qs2 implements i3m {
    public final t2m a;
    public final ms2 b;
    public final h3y c;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public jpb e;

    public qs2(t2m t2mVar, ms2 ms2Var, h3y h3yVar) {
        this.a = t2mVar;
        this.b = ms2Var;
        this.c = h3yVar;
    }

    @Override // defpackage.i3m
    public final void dispose() {
    }

    @Override // defpackage.i3m
    public final void onDocumentLoadingFailed(l1o l1oVar, u1m u1mVar, Throwable th, List list) {
        if (this.d.compareAndSet(false, true)) {
            ((e) this.c.get()).c();
        }
    }

    @Override // defpackage.i3m
    public final void onRenderingFinished(l1o l1oVar, u1m u1mVar, xzl xzlVar, long j, List list) {
        List list2;
        Map map;
        ywl ywlVar = xzlVar.a;
        see seeVar = ywlVar.a;
        dzp0 dzp0Var = seeVar instanceof dzp0 ? (dzp0) seeVar : null;
        if (dzp0Var == null || (list2 = dzp0Var.b) == null) {
            return;
        }
        List list3 = list2;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                if (((pyp0) it.next()) instanceof ShimmerWidgetSection) {
                    return;
                }
            }
        }
        int i = ps2.a[((DocumentSourceVariableFactory$Companion$DocumentSource) this.a.b.a.getValue()).ordinal()];
        int i2 = 1;
        ms2 ms2Var = this.b;
        if (i != 1) {
            if (i != 2) {
                w511.b();
                return;
            }
            long a = ms2Var.a(Milestone.LargestContentfulPaintCached);
            if (a > 0) {
                this.e = new jpb(a, (SuperAppGrid) ywlVar.c.b(qoi0.a(SuperAppGrid.class)), 5);
            }
            ms2Var.a(Milestone.FullContentfulPaintCached);
            return;
        }
        if (this.d.compareAndSet(false, true)) {
            ((e) this.c.get()).c();
        }
        ((os2) ms2Var).b(Milestone.MainScreenData, new qu(4));
        ms2Var.a(Milestone.ShortcutsLoaded);
        jpb jpbVar = this.e;
        this.e = null;
        SuperAppGrid superAppGrid = jpbVar != null ? (SuperAppGrid) jpbVar.c : null;
        SuperAppGrid superAppGrid2 = (SuperAppGrid) ywlVar.c.b(qoi0.a(SuperAppGrid.class));
        SuperAppGrid.Companion.getClass();
        String str = (superAppGrid2 == null || superAppGrid == null || !jl40.l(superAppGrid2.a, superAppGrid.a)) ? "plain" : "cache";
        if (superAppGrid == null && superAppGrid2 == null) {
            map = b.f();
        } else {
            Set keySet = superAppGrid != null ? superAppGrid.b.keySet() : null;
            Set set = EmptySet.a;
            if (keySet == null) {
                keySet = set;
            }
            Set keySet2 = superAppGrid2 != null ? superAppGrid2.b.keySet() : null;
            if (keySet2 != null) {
                set = keySet2;
            }
            LinkedHashSet h = v4r0.h(keySet, set);
            int d = gw00.d(tcc.n(h, 10));
            if (d < 16) {
                d = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(d);
            for (Object obj : h) {
                String str2 = (String) obj;
                String str3 = superAppGrid != null ? (String) superAppGrid.b.get(str2) : null;
                String str4 = superAppGrid2 != null ? (String) superAppGrid2.b.get(str2) : null;
                linkedHashMap.put(obj, jl40.l(str3, str4) ? SectionStatus.UNMODIFIED : str3 == null ? SectionStatus.ADDED : str4 == null ? SectionStatus.REMOVED : SectionStatus.MODIFIED);
            }
            map = linkedHashMap;
        }
        ((os2) ms2Var).b(Milestone.LargestContentfulPaint, new ga1(i2, jpbVar, str, map));
        ms2Var.a(Milestone.FullContentfulPaint);
    }
}
