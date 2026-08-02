package defpackage;

import android.view.ViewTreeObserver;
import androidx.viewpager.widget.ViewPager;
import com.yandex.messaging.paging.PagedLoader$LoadState;
import com.yandex.messaging.paging.PagedLoader$LoadType;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class y790 implements z790 {
    public final /* synthetic */ bhv a;

    public y790(bhv bhvVar) {
        this.a = bhvVar;
    }

    @Override // defpackage.z790
    public final void a(ArrayList arrayList) {
        bhv bhvVar = this.a;
        bhvVar.d = arrayList;
        bhvVar.f();
        reu reuVar = bhvVar.e;
        if (reuVar != null) {
            jhv jhvVar = (jhv) reuVar.b;
            i3y i3yVar = jhvVar.E;
            if (arrayList.isEmpty()) {
                return;
            }
            ygv ygvVar = (ygv) i3yVar.getValue();
            s14 s14Var = jhvVar.D;
            if (!ygvVar.c) {
                ygv ygvVar2 = (ygv) i3yVar.getValue();
                final ViewPager viewPager = (ViewPager) s14Var.a;
                z83.c(null, ygvVar2.c);
                ygvVar2.c = true;
                final mqu mquVar = new mqu(4, ygvVar2, viewPager);
                viewPager.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.yandex.messaging.ui.imageviewer.ImageViewerActionsTransformer$onPreDraw$1
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public boolean onPreDraw() {
                        viewPager.getViewTreeObserver().removeOnPreDrawListener(this);
                        return ((Boolean) mquVar.invoke()).booleanValue();
                    }
                });
            }
            jhvVar.r((mhv) arrayList.get(((ViewPager) s14Var.a).getCurrentItem()));
        }
    }

    @Override // defpackage.z790
    public final void b(PagedLoader$LoadType pagedLoader$LoadType, PagedLoader$LoadState pagedLoader$LoadState) {
    }
}
