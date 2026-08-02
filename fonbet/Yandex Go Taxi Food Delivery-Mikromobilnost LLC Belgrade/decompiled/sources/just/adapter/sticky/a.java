package just.adapter.sticky;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import core.flex.ui.OrientationAwareRecyclerView;
import defpackage.cz2;
import defpackage.e6q0;
import defpackage.gki0;
import defpackage.gyt0;
import defpackage.h6q0;
import defpackage.jl40;
import defpackage.neu0;
import defpackage.oeu0;
import defpackage.peu0;
import defpackage.seu0;
import defpackage.teu0;
import defpackage.ueu0;
import defpackage.uyp0;
import defpackage.vdu0;
import defpackage.veu0;
import defpackage.w511;
import defpackage.xeu0;
import defpackage.ydu0;
import defpackage.ymp0;
import flex.engine.section.ui.StickyHostLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;
import just.adapter.scroll.ScrollDirection;
import kotlin.Pair;

/* loaded from: classes9.dex */
public final class a {
    public final StickyHostLayout a;
    public OrientationAwareRecyclerView b;
    public RecyclerView.Adapter d;
    public uyp0 i;
    public final ArrayList c = new ArrayList(0);
    public final oeu0 e = new oeu0(this);
    public veu0 f = teu0.a;
    public final peu0 g = new peu0(this);
    public final StickyViewController$RecyclerViewOnLayoutListener h = new View.OnLayoutChangeListener() { // from class: just.adapter.sticky.StickyViewController$RecyclerViewOnLayoutListener
        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            a.this.c(ScrollDirection.IGNORE, 0);
        }
    };
    public final ymp0 j = new ymp0(8, this);
    public int k = -1;
    public int l = -1;

    /* JADX WARN: Type inference failed for: r2v5, types: [just.adapter.sticky.StickyViewController$RecyclerViewOnLayoutListener] */
    public a(StickyHostLayout stickyHostLayout, e6q0 e6q0Var, h6q0 h6q0Var) {
        this.a = stickyHostLayout;
        stickyHostLayout.setInstanceStateDelegate(new neu0(this));
    }

    public final void a() {
        OrientationAwareRecyclerView orientationAwareRecyclerView = this.b;
        ymp0 ymp0Var = this.j;
        if (orientationAwareRecyclerView != null) {
            orientationAwareRecyclerView.removeCallbacks(ymp0Var);
        }
        OrientationAwareRecyclerView orientationAwareRecyclerView2 = this.b;
        if (orientationAwareRecyclerView2 != null) {
            orientationAwareRecyclerView2.post(ymp0Var);
        }
    }

    public final void b() {
        OrientationAwareRecyclerView orientationAwareRecyclerView = this.b;
        RecyclerView.Adapter adapter = orientationAwareRecyclerView != null ? orientationAwareRecyclerView.getAdapter() : null;
        if (jl40.l(this.d, adapter)) {
            return;
        }
        RecyclerView.Adapter adapter2 = this.d;
        oeu0 oeu0Var = this.e;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(oeu0Var);
        }
        this.d = adapter;
        if (adapter != null) {
            adapter.registerAdapterDataObserver(oeu0Var);
        }
        this.f = seu0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x01bd, code lost:
    
        if (r9 <= ((java.lang.Number) r10.f()).intValue()) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x015a, code lost:
    
        if (r15.getY() <= r6.b(r14)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x012f, code lost:
    
        if (r15.getBottom() >= (r8.getHeight() - r6.b(r14))) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0131, code lost:
    
        r11 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(ScrollDirection scrollDirection, int i) {
        int i2;
        boolean z;
        RecyclerView.Adapter adapter;
        int i3;
        View view;
        int a;
        if (this.a.isInLayout()) {
            a();
            return;
        }
        OrientationAwareRecyclerView orientationAwareRecyclerView = this.b;
        Object layoutManager = orientationAwareRecyclerView != null ? orientationAwareRecyclerView.getLayoutManager() : null;
        gki0 gki0Var = layoutManager instanceof gki0 ? (gki0) layoutManager : null;
        if (gki0Var == null) {
            return;
        }
        b();
        veu0 veu0Var = this.f;
        teu0 teu0Var = teu0.a;
        boolean l = jl40.l(veu0Var, teu0Var);
        ArrayList arrayList = this.c;
        if (!l) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                OrientationAwareRecyclerView orientationAwareRecyclerView2 = this.b;
                RecyclerView.Adapter adapter2 = orientationAwareRecyclerView2 != null ? orientationAwareRecyclerView2.getAdapter() : null;
                ydu0 ydu0Var = bVar.c;
                ArrayList arrayList2 = ydu0Var.b;
                arrayList2.clear();
                if (adapter2 != null) {
                    int itemCount = adapter2.getItemCount();
                    for (int i4 = 0; i4 < itemCount; i4++) {
                        if (((Boolean) ydu0Var.a.invoke(Integer.valueOf(i4))).booleanValue()) {
                            arrayList2.add(Integer.valueOf(i4));
                        }
                    }
                }
                vdu0 vdu0Var = bVar.j;
                HashSet hashSet = vdu0Var.b;
                hashSet.clear();
                if (adapter2 != null) {
                    int itemCount2 = adapter2.getItemCount();
                    for (int i5 = 0; i5 < itemCount2; i5++) {
                        if (((Boolean) vdu0Var.a.invoke(Integer.valueOf(i5))).booleanValue()) {
                            hashSet.add(Integer.valueOf(i5));
                        }
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            b bVar2 = (b) it2.next();
            veu0 veu0Var2 = this.f;
            OrientationAwareRecyclerView orientationAwareRecyclerView3 = bVar2.b;
            ydu0 ydu0Var2 = bVar2.c;
            ArrayList arrayList3 = ydu0Var2.b;
            int i6 = 1;
            if (arrayList3.size() <= 0) {
                bVar2.d(true);
            }
            int intValue = ((Number) bVar2.f.invoke(gki0Var)).intValue();
            if (intValue == -1) {
                intValue = ((Number) bVar2.g.invoke()).intValue();
            }
            int intValue2 = ((Number) bVar2.h.invoke(Integer.valueOf(intValue))).intValue();
            int i7 = xeu0.a[bVar2.e.ordinal()];
            if (i7 == 1) {
                i2 = intValue2 == -1 ? 0 : intValue2 + 1;
                int a2 = ydu0Var2.a(i2);
                if (a2 != -1) {
                    x0 findViewHolderForAdapterPosition = orientationAwareRecyclerView3.findViewHolderForAdapterPosition(a2);
                    View view2 = findViewHolderForAdapterPosition != null ? findViewHolderForAdapterPosition.a : null;
                    if (view2 != null) {
                    }
                }
                if (intValue2 != -1) {
                }
            } else {
                if (i7 != 2) {
                    w511.b();
                    return;
                }
                i2 = intValue2 == -1 ? arrayList3.size() - 1 : intValue2 - 1;
                if (i2 >= 0 && (a = ydu0Var2.a(i2)) != -1) {
                    x0 findViewHolderForAdapterPosition2 = orientationAwareRecyclerView3.findViewHolderForAdapterPosition(a);
                    View view3 = findViewHolderForAdapterPosition2 != null ? findViewHolderForAdapterPosition2.a : null;
                    if (view3 != null) {
                    }
                }
                if (intValue2 != -1) {
                    bVar2.d(true);
                } else {
                    int a3 = ydu0Var2.a(intValue2);
                    if (!(veu0Var2 instanceof seu0)) {
                        if (!(veu0Var2 instanceof teu0)) {
                            if (!(veu0Var2 instanceof ueu0)) {
                                w511.b();
                                return;
                            }
                            TreeMap treeMap = ((ueu0) veu0Var2).a.a;
                            Integer num = (Integer) treeMap.floorKey(Integer.valueOf(a3));
                            if (num != null) {
                                int intValue3 = num.intValue();
                                Integer valueOf = Integer.valueOf(intValue3);
                                Integer num2 = (Integer) treeMap.get(Integer.valueOf(intValue3));
                                if (num2 != null) {
                                    Pair pair = new Pair(valueOf, num2);
                                    if (((Number) pair.c()).intValue() <= a3) {
                                    }
                                }
                            }
                        }
                        z = false;
                        if (z && a3 == bVar2.p) {
                            View view4 = bVar2.l;
                            if (view4 != null) {
                                bVar2.c(view4, a3, gki0Var);
                            }
                        } else {
                            StickyHostLayout stickyHostLayout = bVar2.a;
                            adapter = orientationAwareRecyclerView3.getAdapter();
                            if (adapter != null) {
                                bVar2.d((z && -1 != (i3 = bVar2.p) && a3 == i3) ? false : true);
                                bVar2.p = a3;
                                bVar2.n = intValue2;
                                x0 createViewHolder = adapter.createViewHolder(stickyHostLayout, adapter.getItemViewType(a3));
                                adapter.bindViewHolder(createViewHolder, a3);
                                bVar2.o = new gyt0(i6, adapter, createViewHolder);
                                View view5 = createViewHolder.a;
                                bVar2.l = view5;
                                if (view5.getId() == -1) {
                                    view5.setId(View.generateViewId());
                                }
                                view5.setOnTouchListener(new cz2(12));
                                bVar2.c(view5, a3, gki0Var);
                                view5.addOnLayoutChangeListener(bVar2.r);
                                stickyHostLayout.addView(view5);
                                x0 findViewHolderForAdapterPosition3 = orientationAwareRecyclerView3.findViewHolderForAdapterPosition(a3);
                                if (findViewHolderForAdapterPosition3 != null) {
                                    findViewHolderForAdapterPosition3.a.setVisibility(4);
                                }
                            }
                        }
                        float a4 = bVar2.a(scrollDirection, i);
                        view = bVar2.l;
                        if (view != null) {
                            view.setTranslationY(a4);
                        }
                        bVar2.e(a4);
                    }
                    z = true;
                    if (z) {
                    }
                    StickyHostLayout stickyHostLayout2 = bVar2.a;
                    adapter = orientationAwareRecyclerView3.getAdapter();
                    if (adapter != null) {
                    }
                    float a42 = bVar2.a(scrollDirection, i);
                    view = bVar2.l;
                    if (view != null) {
                    }
                    bVar2.e(a42);
                }
            }
        }
        this.f = teu0Var;
    }
}
