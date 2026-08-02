package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import kotlin.a;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class uj5 extends lys implements t7u {
    public static final /* synthetic */ int a0 = 0;
    public static final /* synthetic */ int b0 = 0;
    public final /* synthetic */ int S;
    public eiy T;
    public eiy U;
    public epu V;
    public final Object W;
    public final Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj5(ListItemComponent listItemComponent, int i) {
        super(listItemComponent);
        this.S = i;
        aiy aiyVar = aiy.a;
        final int i2 = 0;
        switch (i) {
            case 1:
                super(listItemComponent);
                this.T = aiyVar;
                this.U = aiyVar;
                RobotoTextView robotoTextView = new RobotoTextView(((ListItemComponent) ((View) this.R)).getContext(), null, 0, 6, null);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                robotoTextView.setMinWidth(c.h(20, listItemComponent));
                robotoTextView.setTextSize(0, c.d(mrg0.component_text_size_caption, listItemComponent));
                robotoTextView.setTextTypeface(3);
                fh4.g(robotoTextView);
                robotoTextView.setLayoutParams(layoutParams);
                this.W = robotoTextView;
                FrameLayout frameLayout = new FrameLayout(((ListItemComponent) ((View) this.R)).getContext());
                lob1.b(frameLayout);
                frameLayout.addView(robotoTextView);
                this.Z = frameLayout;
                this.V = new dpu(frameLayout, null);
                ((ListItemComponent) ((View) this.R)).setLeadView(frameLayout);
                break;
            default:
                this.W = a.a(new sls(this) { // from class: tj5
                    public final /* synthetic */ uj5 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i3 = i2;
                        uj5 uj5Var = this.b;
                        switch (i3) {
                            case 0:
                                GoImageView goImageView = new GoImageView(((ListItemComponent) ((View) uj5Var.R)).getContext(), null, 0, 6, null);
                                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                                layoutParams2.gravity = 49;
                                int u = tje.u(4, goImageView.getContext());
                                goImageView.setPadding(u, u, u, u);
                                goImageView.setLayoutParams(layoutParams2);
                                return goImageView;
                            default:
                                GoFrameLayout goFrameLayout = new GoFrameLayout(((ListItemComponent) ((View) uj5Var.R)).getContext(), null, 0, 0, 14, null);
                                goFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(tje.u(56, goFrameLayout.getContext()), tje.u(56, goFrameLayout.getContext())));
                                goFrameLayout.setPadding(goFrameLayout.getPaddingLeft(), tje.u(6, goFrameLayout.getContext()), goFrameLayout.getPaddingRight(), goFrameLayout.getPaddingBottom());
                                goFrameLayout.addView((GoImageView) ((i3y) uj5Var.W).getValue());
                                return goFrameLayout;
                        }
                    }
                });
                final int i3 = 1;
                this.Z = a.a(new sls(this) { // from class: tj5
                    public final /* synthetic */ uj5 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i32 = i3;
                        uj5 uj5Var = this.b;
                        switch (i32) {
                            case 0:
                                GoImageView goImageView = new GoImageView(((ListItemComponent) ((View) uj5Var.R)).getContext(), null, 0, 6, null);
                                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                                layoutParams2.gravity = 49;
                                int u = tje.u(4, goImageView.getContext());
                                goImageView.setPadding(u, u, u, u);
                                goImageView.setLayoutParams(layoutParams2);
                                return goImageView;
                            default:
                                GoFrameLayout goFrameLayout = new GoFrameLayout(((ListItemComponent) ((View) uj5Var.R)).getContext(), null, 0, 0, 14, null);
                                goFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(tje.u(56, goFrameLayout.getContext()), tje.u(56, goFrameLayout.getContext())));
                                goFrameLayout.setPadding(goFrameLayout.getPaddingLeft(), tje.u(6, goFrameLayout.getContext()), goFrameLayout.getPaddingRight(), goFrameLayout.getPaddingBottom());
                                goFrameLayout.addView((GoImageView) ((i3y) uj5Var.W).getValue());
                                return goFrameLayout;
                        }
                    }
                });
                this.T = aiyVar;
                this.U = aiyVar;
                this.V = new dpu(((ListItemComponent) ((View) this.R)).getLeadImageView(), null);
                fh4.g(((ListItemComponent) ((View) this.R)).subtitle());
                ((ListItemComponent) ((View) this.R)).setClickable(false);
                break;
        }
    }

    @Override // defpackage.wys
    public boolean X() {
        switch (this.S) {
            case 1:
                return false;
            default:
                return super.X();
        }
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        int i = this.S;
        Object obj2 = this.W;
        Object obj3 = this.R;
        Object obj4 = this.Z;
        switch (i) {
            case 0:
                i3y i3yVar = (i3y) obj2;
                pj5 pj5Var = (pj5) obj;
                ListItemComponent listItemComponent = (ListItemComponent) ((View) obj3);
                this.T = lob1.g(pj5Var.d);
                this.U = lob1.g(pj5Var.h);
                i3y i3yVar2 = (i3y) obj4;
                ((GoFrameLayout) i3yVar2.getValue()).removeAllViews();
                obm obmVar = pj5Var.a;
                if (obmVar == null) {
                    this.V = new dpu((GoFrameLayout) i3yVar2.getValue(), null);
                } else {
                    ((GoFrameLayout) i3yVar2.getValue()).addView((GoImageView) i3yVar.getValue());
                    this.V = new cpu((GoImageView) i3yVar.getValue(), (GoFrameLayout) i3yVar2.getValue());
                    ((GoImageView) i3yVar.getValue()).setImageDrawable(obmVar.b);
                    listItemComponent.setLeadView((GoFrameLayout) i3yVar2.getValue());
                }
                listItemComponent.setTitle(pj5Var.b);
                listItemComponent.setSubtitle("");
                listItemComponent.setTrailCompanionText(pj5Var.c);
                listItemComponent.setContentDescription(pj5Var.e);
                break;
            default:
                xpw xpwVar = (xpw) obj;
                FrameLayout frameLayout = (FrameLayout) obj4;
                View view = (View) obj3;
                this.T = lob1.g(xpwVar.e);
                this.U = lob1.g(xpwVar.f);
                RobotoTextView robotoTextView = (RobotoTextView) obj2;
                CharSequence charSequence = xpwVar.a;
                robotoTextView.setText(charSequence);
                this.V = charSequence != null ? new cpu(robotoTextView, frameLayout) : new dpu(frameLayout, null);
                ListItemComponent listItemComponent2 = (ListItemComponent) view;
                listItemComponent2.setTitle(xpwVar.b);
                listItemComponent2.setTrailCompanionText(xpwVar.c);
                listItemComponent2.setContentDescription(xpwVar.d);
                break;
        }
    }

    @Override // defpackage.t7u
    public final eiy g() {
        switch (this.S) {
        }
        return this.T;
    }

    @Override // defpackage.t7u
    public final eiy k() {
        switch (this.S) {
        }
        return this.U;
    }

    @Override // defpackage.t7u
    public final epu x() {
        switch (this.S) {
        }
        return this.V;
    }
}
