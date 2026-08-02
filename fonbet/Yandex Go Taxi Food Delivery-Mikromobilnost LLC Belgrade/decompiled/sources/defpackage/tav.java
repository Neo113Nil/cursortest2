package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.x0;
import core.flex.ui.OrientationAwareRecyclerView;
import flex.engine.section.c;
import flex.engine.section.model.ScrollPosition;
import java.util.ArrayList;
import java.util.Iterator;
import just.adapter.snapping.b;
import kotlin.jvm.internal.Ref$BooleanRef;

/* loaded from: classes12.dex */
public final /* synthetic */ class tav implements sls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ tav(c cVar, String str, ScrollPosition scrollPosition, int i, boolean z) {
        this.w = cVar;
        this.x = str;
        this.y = scrollPosition;
        this.b = i;
        this.c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0169 A[SYNTHETIC] */
    @Override // defpackage.sls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        gki0 gki0Var;
        Iterator it;
        int size;
        int i = this.a;
        boolean z = this.c;
        int i2 = this.b;
        Object obj = this.y;
        Object obj2 = this.x;
        Object obj3 = this.w;
        switch (i) {
            case 0:
                lbm lbmVar = (lbm) obj3;
                ImageView imageView = (ImageView) obj2;
                kbv kbvVar = (kbv) obj;
                if (z) {
                    ((nac) lbmVar).f(imageView.getMeasuredWidth(), imageView.getMeasuredHeight());
                }
                nac nacVar = (nac) lbmVar;
                nacVar.e(i2);
                return nacVar.b(kbvVar);
            default:
                c cVar = (c) obj3;
                String str = (String) obj2;
                final ScrollPosition scrollPosition = (ScrollPosition) obj;
                nfh nfhVar = cVar.M;
                if (nfhVar != null) {
                    OrientationAwareRecyclerView orientationAwareRecyclerView = (OrientationAwareRecyclerView) nfhVar.b;
                    j89 j89Var = cVar.I;
                    ArrayList arrayList = j89Var.g;
                    Object layoutManager = orientationAwareRecyclerView.getLayoutManager();
                    int i3 = 0;
                    if (layoutManager instanceof LinearLayoutManager) {
                        gki0Var = new fki0((LinearLayoutManager) layoutManager);
                    } else if (layoutManager instanceof gki0) {
                        gki0Var = (gki0) layoutManager;
                    } else {
                        h5z0.a.d(g8e.o("Layout manager can't scroll to focusId: ", str), new Object[0]);
                    }
                    final gki0 gki0Var2 = gki0Var;
                    Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                    Integer num = 0;
                    f89 f89Var = new f89(i3, j89Var, str, ref$BooleanRef);
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        int intValue = num.intValue();
                        g89 g89Var = (g89) next;
                        if (g89Var.b.b) {
                            size = g89Var.c.size();
                        } else {
                            pyp0 pyp0Var = g89Var.a.b;
                            size = pyp0Var instanceof cvl ? ((cvl) pyp0Var).c.size() : 1;
                        }
                        num = Integer.valueOf(intValue + size);
                        if (((Boolean) f89Var.invoke(next)).booleanValue()) {
                            int intValue2 = num.intValue();
                            if (ref$BooleanRef.element) {
                                j89Var.c(intValue2 + 1);
                            }
                            it = arrayList.iterator();
                            int i4 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    for (final u0x u0xVar : ((g89) it.next()).c) {
                                        if ((u0xVar instanceof uvr) && jl40.l(((uvr) u0xVar).a(), str)) {
                                            int i5 = i3;
                                            final OrientationAwareRecyclerView orientationAwareRecyclerView2 = orientationAwareRecyclerView;
                                            final hzk hzkVar = j89Var.f;
                                            hzkVar.getClass();
                                            orientationAwareRecyclerView2.stopScroll();
                                            final int i6 = -rzo.t(i2, orientationAwareRecyclerView2.getContext());
                                            if (z) {
                                                b bVar = (b) hzkVar.a;
                                                int measuredHeight = orientationAwareRecyclerView2.getMeasuredHeight();
                                                a2t0 a2t0Var = u0xVar instanceof a2t0 ? (a2t0) u0xVar : null;
                                                t1t0 e = a2t0Var != null ? a2t0Var.e() : null;
                                                bVar.b();
                                                if (e != null) {
                                                    bVar.c(e);
                                                }
                                                kki0.c(orientationAwareRecyclerView2, new h2r(28, new mqu(15, e, hzkVar), new kk11(hzkVar, orientationAwareRecyclerView2, u0xVar, i6, scrollPosition, measuredHeight)), i4);
                                            } else {
                                                final int measuredHeight2 = orientationAwareRecyclerView2.getMeasuredHeight();
                                                if (scrollPosition == ScrollPosition.TOP) {
                                                    Integer h = hzk.h(orientationAwareRecyclerView2, u0xVar, scrollPosition, i5);
                                                    if (h != null) {
                                                        i6 = h.intValue();
                                                    }
                                                    hzkVar.r(gki0Var2, u0xVar, i4, i6);
                                                } else {
                                                    gki0Var2.r(i4, measuredHeight2 - (measuredHeight2 - 10));
                                                    final int i7 = i4;
                                                    orientationAwareRecyclerView2.post(new Runnable() { // from class: a3x
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            View view;
                                                            OrientationAwareRecyclerView orientationAwareRecyclerView3 = OrientationAwareRecyclerView.this;
                                                            int i8 = i7;
                                                            x0 findViewHolderForAdapterPosition = orientationAwareRecyclerView3.findViewHolderForAdapterPosition(i8);
                                                            if (findViewHolderForAdapterPosition == null || (view = findViewHolderForAdapterPosition.a) == null) {
                                                                return;
                                                            }
                                                            hzk hzkVar2 = hzkVar;
                                                            hzkVar2.getClass();
                                                            u0x u0xVar2 = u0xVar;
                                                            hzkVar2.r(gki0Var2, u0xVar2, i8, hzk.e(orientationAwareRecyclerView3, u0xVar2, i6, scrollPosition, measuredHeight2, view));
                                                        }
                                                    });
                                                }
                                            }
                                        } else {
                                            i4++;
                                            orientationAwareRecyclerView = orientationAwareRecyclerView;
                                            i3 = i3;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    int intValue22 = num.intValue();
                    if (ref$BooleanRef.element) {
                    }
                    it = arrayList.iterator();
                    int i42 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                        }
                    }
                }
                return zy11.a;
        }
    }

    public /* synthetic */ tav(boolean z, lbm lbmVar, ImageView imageView, int i, kbv kbvVar) {
        this.c = z;
        this.w = lbmVar;
        this.x = imageView;
        this.b = i;
        this.y = kbvVar;
    }
}
