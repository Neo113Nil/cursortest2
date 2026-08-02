package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.x0;
import androidx.recyclerview.widget.y;
import com.yandex.mobile.ads.R$layout;
import com.yandex.plus.core.data.common.PlusThemedImage;
import com.yandex.plus.glide.b;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.product.ProductView;
import com.yandex.plus.ui.core.theme.PlusTheme;
import yads.oi3;
import yads.qi3;
import yads.ri3;
import yads.si3;
import yads.ti3;
import yads.ui3;
import yads.x91;

/* loaded from: classes7.dex */
public final class z6c extends y {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6c(x91 x91Var, ne81 ne81Var) {
        super(new wu71());
        vl81 vl81Var = new vl81(x91Var, ne81Var);
        pd71 pd71Var = new pd71();
        this.c = vl81Var;
        this.b = pd71Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        switch (this.a) {
            case 2:
                zz61 zz61Var = (zz61) getItem(i);
                ((pd71) this.b).getClass();
                if (zz61Var instanceof ho81) {
                    return R$layout.debug_panel_item_action_button;
                }
                if (zz61Var instanceof ap61) {
                    return R$layout.debug_panel_item_switch;
                }
                if (zz61Var instanceof sr81) {
                    return R$layout.debug_panel_item_divider;
                }
                if (zz61Var instanceof su81) {
                    return R$layout.deubg_panel_item_header;
                }
                if (zz61Var instanceof gx81) {
                    return R$layout.deubg_panel_item_key_value;
                }
                if (zz61Var instanceof fh61) {
                    return R$layout.debug_panel_item_mediation_adapter;
                }
                if (zz61Var instanceof th81) {
                    return R$layout.debug_panel_item_ad_units;
                }
                if (zz61Var instanceof se81) {
                    return R$layout.debug_panel_item_ad_unit;
                }
                w511.b();
                return 0;
            default:
                return super.getItemViewType(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        switch (this.a) {
            case 0:
                x6c x6cVar = (x6c) x0Var;
                w6c w6cVar = (w6c) getItem(i);
                wv5 wv5Var = x6cVar.N;
                kgx[] kgxVarArr = x6c.S;
                ((TextView) wv5Var.a(kgxVarArr[0])).setText(w6cVar.a);
                z6c z6cVar = x6cVar.R;
                PlusTheme plusTheme = (PlusTheme) z6cVar.c;
                Context context = x6cVar.a.getContext();
                PlusThemedImage plusThemedImage = w6cVar.b;
                ((b) ((b5d0) z6cVar.b)).b((String) (tpd0.a(context, plusTheme) ? plusThemedImage.getDark() : plusThemedImage.getLight())).b((ImageView) x6cVar.O.a(kgxVarArr[1]));
                ((TextView) x6cVar.P.a(kgxVarArr[2])).setText(w6cVar.c);
                v3a1.c((TextView) x6cVar.Q.a(kgxVarArr[3]), w6cVar.d);
                break;
            case 1:
                o7f0 o7f0Var = (o7f0) getItem(i);
                m9f0 m9f0Var = ((p9f0) x0Var).N;
                m9f0Var.c(o7f0Var);
                m9f0Var.a.setVisibility(0);
                break;
            default:
                ((p971) x0Var).W((zz61) getItem(i));
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        x0 uf71Var;
        switch (this.a) {
            case 0:
                return new x6c(this, LayoutInflater.from(viewGroup.getContext()).inflate(imh0.pay_sdk_item_closing_offer, viewGroup, false));
            case 1:
                ProductView productView = new ProductView(viewGroup.getContext(), null, 0, 6, null);
                productView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return new p9f0(this, productView);
            default:
                View f = oo31.f(viewGroup, i, viewGroup, false);
                vl81 vl81Var = (vl81) this.c;
                vl81Var.getClass();
                if (i == R$layout.debug_panel_item_action_button) {
                    return new q271(f, oi3.w);
                }
                if (i == R$layout.debug_panel_item_switch) {
                    uf71Var = new q271(f, new qi3(vl81Var));
                } else {
                    if (i == R$layout.deubg_panel_item_header) {
                        return new ue71(f);
                    }
                    if (i == R$layout.deubg_panel_item_key_value) {
                        return new gp71(f);
                    }
                    if (i == R$layout.debug_panel_item_mediation_adapter) {
                        uf71Var = new aq81(f, vl81Var.b, new ri3(vl81Var), new si3(vl81Var));
                    } else if (i == R$layout.debug_panel_item_ad_units) {
                        uf71Var = new q271(f, new ti3(vl81Var));
                    } else {
                        if (i != R$layout.debug_panel_item_ad_unit) {
                            return new t191(f);
                        }
                        uf71Var = new uf71(f, new ui3(vl81Var));
                    }
                }
                return uf71Var;
        }
    }

    public z6c(n4u0 n4u0Var, b5d0 b5d0Var) {
        super(o9f0.a);
        this.c = n4u0Var;
        this.b = b5d0Var;
    }

    public z6c(PlusTheme plusTheme, b5d0 b5d0Var) {
        super(y6c.a);
        this.c = plusTheme;
        this.b = b5d0Var;
    }
}
