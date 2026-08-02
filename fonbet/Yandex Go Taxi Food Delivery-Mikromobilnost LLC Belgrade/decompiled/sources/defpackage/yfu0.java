package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.b;
import com.yandex.go.design.view.GoFrameLayout;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes6.dex */
public final class yfu0 extends lys implements t7u {
    public static final /* synthetic */ int Z = 0;
    public static final /* synthetic */ int a0 = 0;
    public static final /* synthetic */ int b0 = 0;
    public final /* synthetic */ int S;
    public eiy T;
    public eiy U;
    public Object V;
    public dpu W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yfu0(ListItemComponent listItemComponent, int i) {
        super(listItemComponent);
        this.S = i;
        int i2 = 4;
        aiy aiyVar = aiy.a;
        switch (i) {
            case 1:
                super(listItemComponent);
                this.T = aiyVar;
                this.U = aiyVar;
                GoFrameLayout goFrameLayout = new GoFrameLayout(((ListItemComponent) ((View) this.R)).getContext(), null, 0, 0, 14, null);
                goFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(tje.u(56, goFrameLayout.getContext()), tje.r(mrg0.list_item_component_size_XS, goFrameLayout.getContext())));
                this.W = new dpu(goFrameLayout, null);
                ((ListItemComponent) ((View) this.R)).setLeadView(goFrameLayout);
                ((ListItemComponent) ((View) this.R)).setUseAutoAccessibilityDelegate(false);
                b.p((View) this.R, new ifq0(i2, this));
                break;
            case 2:
                super(listItemComponent);
                this.U = aiyVar;
                this.T = aiyVar;
                GoFrameLayout goFrameLayout2 = new GoFrameLayout(listItemComponent.getContext(), null, 0, 0, 14, null);
                goFrameLayout2.setLayoutParams(new ViewGroup.LayoutParams(tje.u(56, goFrameLayout2.getContext()), tje.r(mrg0.list_item_component_size_XS, goFrameLayout2.getContext())));
                this.V = goFrameLayout2;
                this.W = new dpu(goFrameLayout2, null);
                ((ListItemComponent) ((View) this.R)).setLeadView(goFrameLayout2);
                ((ListItemComponent) ((View) this.R)).setMinHeight(tje.r(asg0.mt_stop_selector_item_height, listItemComponent.getContext()));
                break;
            default:
                this.T = aiyVar;
                this.U = aiyVar;
                GoFrameLayout goFrameLayout3 = new GoFrameLayout(((ListItemComponent) ((View) this.R)).getContext(), null, 0, 0, 14, null);
                goFrameLayout3.setLayoutParams(new ViewGroup.LayoutParams(tje.u(56, goFrameLayout3.getContext()), tje.r(mrg0.list_item_component_size_XS, goFrameLayout3.getContext())));
                this.W = new dpu(goFrameLayout3, null);
                ((ListItemComponent) ((View) this.R)).setLeadView(goFrameLayout3);
                ((ListItemComponent) ((View) this.R)).setUseAutoAccessibilityDelegate(false);
                ListItemComponent listItemComponent2 = (ListItemComponent) ((View) this.R);
                int h = c.h(4, listItemComponent);
                listItemComponent2.setPadding(0, h, 0, h);
                b.p((View) this.R, new ifq0(3, this));
                break;
        }
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        int i = this.S;
        Object obj2 = this.R;
        switch (i) {
            case 0:
                wfu0 wfu0Var = (wfu0) obj;
                ListItemComponent listItemComponent = (ListItemComponent) ((View) obj2);
                this.T = wfu0Var.d;
                this.U = wfu0Var.e;
                String str = wfu0Var.c;
                this.V = str;
                listItemComponent.setTitle(wfu0Var.b);
                listItemComponent.setClickable(str != null);
                listItemComponent.setContentDescription(wfu0Var.f);
                break;
            case 1:
                liu0 liu0Var = (liu0) obj;
                ListItemComponent listItemComponent2 = (ListItemComponent) ((View) obj2);
                this.T = lob1.g(liu0Var.h);
                this.U = lob1.g(liu0Var.h);
                String str2 = liu0Var.f;
                this.V = str2;
                listItemComponent2.setTitle(liu0Var.a);
                listItemComponent2.setClickable(str2 != null);
                listItemComponent2.setContentDescription(liu0Var.e);
                break;
            default:
                zgu0 zgu0Var = (zgu0) obj;
                this.U = aiy.a;
                this.T = zgu0Var.d;
                ListItemComponent listItemComponent3 = (ListItemComponent) ((View) obj2);
                listItemComponent3.setTitle(zgu0Var.b);
                listItemComponent3.setSubtitle(zgu0Var.c);
                boolean z = zgu0Var.f;
                if (z) {
                    listItemComponent3.setTrailMode(2);
                }
                listItemComponent3.setClickable(z);
                this.W = new dpu((GoFrameLayout) this.V, zgu0Var.e);
                break;
        }
    }

    @Override // defpackage.t7u
    public final eiy g() {
        switch (this.S) {
            case 0:
                return this.T;
            case 1:
                return this.T;
            default:
                return (aiy) this.U;
        }
    }

    @Override // defpackage.t7u
    public final eiy k() {
        switch (this.S) {
            case 0:
                return this.U;
            case 1:
                return this.U;
            default:
                return this.T;
        }
    }

    @Override // defpackage.t7u
    public final epu x() {
        switch (this.S) {
        }
        return this.W;
    }
}
