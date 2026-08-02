package defpackage;

import com.yandex.div.core.c;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.core.view2.i;

/* loaded from: classes11.dex */
public final class udl implements ct31 {
    public final aw5 a;
    public final c b;
    public final i c;
    public final DivTabsLayout w;
    public mdl x;
    public int y = -1;

    public udl(aw5 aw5Var, c cVar, i iVar, DivTabsLayout divTabsLayout, mdl mdlVar) {
        this.a = aw5Var;
        this.b = cVar;
        this.c = iVar;
        this.w = divTabsLayout;
        this.x = mdlVar;
    }

    public final void a(int i) {
        int i2 = this.y;
        if (i == i2) {
            return;
        }
        i iVar = this.c;
        DivTabsLayout divTabsLayout = this.w;
        aw5 aw5Var = this.a;
        if (i2 != -1) {
            iVar.d(aw5Var, divTabsLayout, ((kdl) this.x.q.get(i2)).a);
            aw5Var.a.unbindViewFromDiv$div_release(divTabsLayout);
        }
        kdl kdlVar = (kdl) this.x.q.get(i);
        iVar.h(aw5Var, divTabsLayout, kdlVar.a);
        aw5Var.a.bindViewToDiv$div_release(divTabsLayout, kdlVar.a);
        this.y = i;
    }

    public final void b(mdl mdlVar) {
        this.x = mdlVar;
    }

    @Override // defpackage.ct31
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // defpackage.ct31
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // defpackage.ct31
    public final void onPageSelected(int i) {
        Div2View div2View = this.a.a;
        a(i);
    }
}
