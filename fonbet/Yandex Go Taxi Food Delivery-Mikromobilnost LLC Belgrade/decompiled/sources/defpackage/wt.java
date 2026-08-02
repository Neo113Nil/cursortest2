package defpackage;

import android.view.View;
import ru.yandex.taxi.design.ListButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.ShimmeringBar;

/* loaded from: classes14.dex */
public final class wt extends wys {
    public static final /* synthetic */ int T = 0;
    public static final /* synthetic */ int U = 0;
    public static final /* synthetic */ int V = 0;
    public final /* synthetic */ int R;
    public final View S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wt(View view, int i) {
        super(view);
        this.R = i;
        this.S = view;
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        switch (this.R) {
            case 1:
                super.applyTheme(themeType);
                ListItemComponent listItemComponent = (ListItemComponent) this.S;
                listItemComponent.setLeadImage(r4h0.ic_user_add_outline);
                listItemComponent.setTrailImage(dzg0.ic_chevron);
                break;
            default:
                super.applyTheme(themeType);
                break;
        }
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        int i = this.R;
        View view = this.S;
        switch (i) {
            case 0:
                ListItemComponent listItemComponent = (ListItemComponent) view;
                z4r0 z4r0Var = ((vt) obj).a;
                View trailViewAs = listItemComponent.getTrailViewAs(ListButtonComponent.class);
                if (trailViewAs == null) {
                    ListButtonComponent listButtonComponent = new ListButtonComponent(listItemComponent.getContext(), null, 0, 6, null);
                    listItemComponent.setTrailView(listButtonComponent);
                    trailViewAs = listButtonComponent;
                }
                ((ListButtonComponent) trailViewAs).addButtons(z4r0Var.c);
                listItemComponent.setLeadImage(z4r0Var.e.intValue());
                listItemComponent.setTitle(z4r0Var.a);
                listItemComponent.setTitleTypeface(3);
                listItemComponent.setSubtitle(z4r0Var.b);
                listItemComponent.setDebounceClickListener(new jg(6, z4r0Var));
                break;
            case 1:
                bz4 bz4Var = (bz4) obj;
                ListItemComponent listItemComponent2 = (ListItemComponent) view;
                listItemComponent2.setTitle(bz4Var.a);
                listItemComponent2.setSubtitle(bz4Var.b);
                listItemComponent2.setLeadImage(r4h0.ic_user_add_outline);
                listItemComponent2.setTrailImage(dzg0.ic_chevron);
                break;
            default:
                ((ShimmeringBar) view).setShimmering(true);
                break;
        }
    }
}
