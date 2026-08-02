package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.bumptech.glide.a;
import com.google.android.material.textfield.TextInputEditText;
import java.util.List;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class mcp extends qon {
    public final edu d;
    public final jsg e;
    public final boolean f;
    public final dcp g;
    public final g0c h;
    public List i;
    public boolean j;
    public kcp k;
    public boolean l;
    public boolean m;

    /* JADX WARN: Multi-variable type inference failed */
    public mcp(jcp jcpVar, jsg jsgVar, boolean z, dcp dcpVar, g0c g0cVar) {
        dcpVar.getClass();
        g0cVar.getClass();
        this.d = (edu) jcpVar;
        this.e = jsgVar;
        this.f = z;
        this.g = dcpVar;
        this.h = g0cVar;
        this.i = c5b.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void u(mcp mcpVar, kcp kcpVar, ImageView imageView, ImageView imageView2, Context context) {
        Integer valueOf;
        int i;
        b1o f;
        int i2;
        rfk rfkVar = kcpVar.a;
        boolean z = mcpVar.f;
        boolean z2 = mcpVar.m;
        Integer valueOf2 = Integer.valueOf(R.drawable.paymentsdk_ic_card_google_pay);
        hfk hfkVar = hfk.a;
        nfk nfkVar = nfk.a;
        ofk ofkVar = ofk.a;
        kfk kfkVar = kfk.a;
        lfk lfkVar = lfk.a;
        jfk jfkVar = jfk.a;
        ifk ifkVar = ifk.a;
        gfk gfkVar = gfk.a;
        Fragment fragment = null;
        o oVar = null;
        if (z) {
            if (rfkVar instanceof ffk) {
                valueOf = dag.r(((ffk) rfkVar).b, z, z2);
            } else if (rfkVar instanceof mfk) {
                valueOf = Integer.valueOf(z2 ? 2131232476 : 2131232467);
            } else if (rfkVar instanceof pfk) {
                if (z2) {
                    i2 = 2131232476;
                } else {
                    u7w u7wVar = ((pfk) rfkVar).c;
                    i2 = u7wVar == u7w.c ? 2131232471 : u7wVar == u7w.a ? R.drawable.paymentsdk_ic_pro_card : 2131232486;
                }
                valueOf = Integer.valueOf(i2);
            } else {
                if (!rfkVar.equals(gfkVar)) {
                    if (!rfkVar.equals(ifkVar)) {
                        if (rfkVar.equals(jfkVar)) {
                            valueOf = Integer.valueOf(R.drawable.paymentsdk_ic_card_new_light);
                        } else if (rfkVar.equals(lfkVar) ? true : rfkVar.equals(kfkVar)) {
                            valueOf = Integer.valueOf(z2 ? 2131232476 : 2131232467);
                        } else {
                            if (!rfkVar.equals(ofkVar) && !rfkVar.equals(nfkVar) && !rfkVar.equals(hfkVar)) {
                                b6e.s();
                                return;
                            }
                            valueOf = null;
                        }
                    }
                    valueOf = valueOf2;
                }
                valueOf = 2131232417;
            }
        } else if (rfkVar instanceof ffk) {
            valueOf = dag.r(((ffk) rfkVar).b, z, z2);
        } else if (rfkVar instanceof mfk) {
            valueOf = Integer.valueOf(z2 ? 2131232476 : 2131232467);
        } else if (rfkVar instanceof pfk) {
            if (z2) {
                i = 2131232476;
            } else {
                u7w u7wVar2 = ((pfk) rfkVar).c;
                i = u7wVar2 == u7w.c ? 2131232471 : u7wVar2 == u7w.a ? R.drawable.paymentsdk_ic_pro_card : 2131232486;
            }
            valueOf = Integer.valueOf(i);
        } else {
            if (!rfkVar.equals(gfkVar)) {
                if (!rfkVar.equals(ifkVar)) {
                    if (rfkVar.equals(jfkVar)) {
                        valueOf = Integer.valueOf(R.drawable.paymentsdk_ic_card_new_dark);
                    } else if (rfkVar.equals(lfkVar) ? true : rfkVar.equals(kfkVar)) {
                        valueOf = Integer.valueOf(z2 ? 2131232476 : 2131232467);
                    } else {
                        if (!rfkVar.equals(ofkVar) && !rfkVar.equals(nfkVar) && !rfkVar.equals(hfkVar)) {
                            b6e.s();
                            return;
                        }
                        valueOf = null;
                    }
                }
                valueOf = valueOf2;
            }
            valueOf = 2131232417;
        }
        Drawable drawable = valueOf != null ? context.getDrawable(valueOf.intValue()) : null;
        int ordinal = mcpVar.g.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                imageView2.setVisibility(8);
            } else if (ordinal == 2) {
                imageView.setVisibility(8);
                imageView2.setVisibility(8);
            }
        } else if (rfkVar instanceof ffk) {
            dm2 dm2Var = ((ffk) rfkVar).d;
            dm2Var.getClass();
            int i3 = 2131232404;
            if (z) {
                switch (dm2Var.ordinal()) {
                    case 0:
                        break;
                    case 1:
                        i3 = 2131232466;
                        break;
                    case 2:
                        i3 = 2131232472;
                        break;
                    case 3:
                        i3 = 2131232483;
                        break;
                    case 4:
                        i3 = 2131232437;
                        break;
                    case 5:
                    case 9:
                    case 10:
                    default:
                        i3 = 2131232476;
                        break;
                    case 6:
                        i3 = 2131232453;
                        break;
                    case 7:
                        i3 = 2131232457;
                        break;
                    case 8:
                        i3 = 2131232465;
                        break;
                    case 11:
                        i3 = 2131232473;
                        break;
                    case 12:
                        i3 = 2131232461;
                        break;
                }
                imageView.setImageDrawable(context.getDrawable(i3));
                imageView2.setImageDrawable(drawable);
                imageView.setVisibility(0);
                imageView2.setVisibility(0);
            } else {
                switch (dm2Var.ordinal()) {
                    case 4:
                        i3 = 2131232436;
                        break;
                    case 7:
                        i3 = 2131232456;
                        break;
                }
                imageView.setImageDrawable(context.getDrawable(i3));
                imageView2.setImageDrawable(drawable);
                imageView.setVisibility(0);
                imageView2.setVisibility(0);
            }
        } else if (rfkVar instanceof mfk) {
            imageView.setVisibility(0);
            imageView2.setVisibility(0);
        } else {
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
            imageView2.setVisibility(8);
        }
        if (rfkVar instanceof mfk) {
            Context context2 = imageView.getContext();
            w1g.s(context2, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
            d1o d1oVar = a.a(context2).e;
            rvc rvcVar = d1oVar.i;
            if (xut.i()) {
                f = d1oVar.f(imageView.getContext().getApplicationContext());
            } else {
                w1g.s(imageView.getContext(), "Unable to obtain a request manager for a view without a Context");
                Activity a = d1o.a(imageView.getContext());
                if (a == null) {
                    f = d1oVar.f(imageView.getContext().getApplicationContext());
                } else if (a instanceof t) {
                    t tVar = (t) a;
                    xy0 xy0Var = d1oVar.f;
                    xy0Var.clear();
                    d1o.c(tVar.getSupportFragmentManager().c.f(), xy0Var);
                    View findViewById = tVar.findViewById(android.R.id.content);
                    for (View view = imageView; !view.equals(findViewById) && (oVar = (o) xy0Var.get(view)) == null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                    }
                    xy0Var.clear();
                    if (oVar != null) {
                        w1g.s(oVar.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
                        if (xut.i()) {
                            f = d1oVar.f(oVar.getContext().getApplicationContext());
                        } else {
                            if (oVar.l() != null) {
                                oVar.l();
                                rvcVar.getClass();
                            }
                            y childFragmentManager = oVar.getChildFragmentManager();
                            Context context3 = oVar.getContext();
                            f = d1oVar.j.j(context3, a.a(context3.getApplicationContext()), oVar.getLifecycle(), childFragmentManager, oVar.isVisible());
                        }
                    } else {
                        f = d1oVar.g(tVar);
                    }
                } else {
                    xy0 xy0Var2 = d1oVar.g;
                    xy0Var2.clear();
                    d1oVar.b(a.getFragmentManager(), xy0Var2);
                    View findViewById2 = a.findViewById(android.R.id.content);
                    for (View view2 = imageView; !view2.equals(findViewById2) && (fragment = (Fragment) xy0Var2.get(view2)) == null && (view2.getParent() instanceof View); view2 = (View) view2.getParent()) {
                    }
                    Fragment fragment2 = fragment;
                    xy0Var2.clear();
                    if (fragment2 == null) {
                        f = d1oVar.e(a);
                    } else if (fragment2.getActivity() == null) {
                        xq0.x("You cannot start a load on a fragment before it is attached");
                        return;
                    } else if (xut.i()) {
                        f = d1oVar.f(fragment2.getActivity().getApplicationContext());
                    } else {
                        if (fragment2.getActivity() != null) {
                            fragment2.getActivity();
                            rvcVar.getClass();
                        }
                        f = d1oVar.d(fragment2.getActivity(), fragment2.getChildFragmentManager(), fragment2, fragment2.isVisible());
                    }
                }
            }
            Uri uri = kcpVar.d;
            f.getClass();
            ((k0o) new k0o(f.a, f, Drawable.class, f.b).H(uri).l(2131232476)).F(imageView);
            imageView2.setImageResource(mcpVar.m ? 2131232476 : 2131232467);
        }
    }

    public static final String v(mcp mcpVar, rfk rfkVar, Context context, boolean z) {
        String string;
        String str = "";
        if (rfkVar instanceof ffk) {
            ffk ffkVar = (ffk) rfkVar;
            ix3 ix3Var = ffkVar.b;
            ix3 ix3Var2 = ix3Var == ix3.h ? null : ix3Var;
            ix3 ix3Var3 = z ? null : ix3Var;
            if (ix3Var3 != null) {
                ix3Var2 = ix3Var3;
            }
            if (ffkVar.e != null && (string = context.getString(R.string.paymentsdk_prebuilt_family_pay_title)) != null) {
                str = string;
            } else if (ix3Var2 != null) {
                str = wxf.O(ix3Var2);
            }
            str.getClass();
            String string2 = context.getString(R.string.paymentsdk_prebuilt_card_list_item_number_format, str, mlr.L(4, ffkVar.c));
            string2.getClass();
            return string2;
        }
        if (rfkVar instanceof mfk) {
            if (qdq.y()) {
                String str2 = ((mfk) rfkVar).d;
                if (str2 != null) {
                    return str2;
                }
            } else {
                String str3 = ((mfk) rfkVar).c;
                if (str3 != null) {
                    return str3;
                }
            }
            return "";
        }
        boolean z2 = rfkVar instanceof pfk;
        int i = R.string.paymentsdk_non_new_sbp_title;
        if (z2) {
            if (!z) {
                u7w u7wVar = ((pfk) rfkVar).c;
                i = u7wVar == u7w.a ? R.string.paymentsdk_prebuilt_yabank_pro_title : u7wVar == u7w.c ? R.string.paymentsdk_prebuilt_yabank_split_title : R.string.paymentsdk_prebuilt_yabank_title;
            }
            String string3 = context.getString(i);
            string3.getClass();
            return string3;
        }
        if (rfkVar.equals(gfk.a)) {
            String string4 = context.getString(R.string.paymentsdk_prebuilt_cash_title);
            string4.getClass();
            return string4;
        }
        if (rfkVar.equals(ifk.a)) {
            String string5 = context.getString(R.string.paymentsdk_prebuilt_gpay_title);
            string5.getClass();
            return string5;
        }
        if (rfkVar.equals(jfk.a)) {
            String string6 = context.getString(R.string.paymentsdk_prebuilt_another_card);
            string6.getClass();
            return string6;
        }
        if (rfkVar.equals(lfk.a) ? true : rfkVar.equals(kfk.a)) {
            if (!z) {
                i = R.string.paymentsdk_prebuilt_sbp_title;
            }
            String string7 = context.getString(i);
            string7.getClass();
            return string7;
        }
        if (rfkVar.equals(ofk.a)) {
            return "Tinkoff credit";
        }
        if (rfkVar.equals(nfk.a)) {
            return "split";
        }
        if (rfkVar.equals(hfk.a)) {
            return "challenge polling";
        }
        b6e.s();
        return null;
    }

    public static /* synthetic */ void x(mcp mcpVar, List list, Integer num, int i) {
        if ((i & 2) != 0) {
            num = null;
        }
        mcpVar.w(list, num, false);
    }

    @Override // defpackage.qon
    public final int c() {
        return this.i.size();
    }

    @Override // defpackage.qon
    public final long d(int i) {
        Object obj = this.i.get(i);
        obj.getClass();
        return ((kcp) obj).a instanceof ffk ? ((ffk) r3).a.a.hashCode() : r3.hashCode();
    }

    @Override // defpackage.qon
    public final int f(int i) {
        kcp kcpVar = (kcp) this.i.get(i);
        if (kcpVar == null) {
            xq0.q("Unknown data type");
            return 0;
        }
        if (kcpVar.c) {
            return 4;
        }
        rfk rfkVar = kcpVar.a;
        if (rfkVar instanceof ffk) {
            return kcpVar.b ? 1 : 3;
        }
        if ((rfkVar instanceof mfk) || (rfkVar instanceof pfk) || rfkVar.equals(gfk.a) || rfkVar.equals(ifk.a)) {
            return 3;
        }
        if (rfkVar.equals(jfk.a)) {
            return 2;
        }
        if (rfkVar.equals(lfk.a) || rfkVar.equals(kfk.a) || rfkVar.equals(ofk.a) || rfkVar.equals(nfk.a) || rfkVar.equals(hfk.a)) {
            return 3;
        }
        b6e.s();
        return 0;
    }

    @Override // defpackage.qon
    public final void j(opn opnVar, int i) {
        ((ecp) opnVar).t(i);
    }

    @Override // defpackage.qon
    public final opn m(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        int i2 = 4;
        int i3 = 2;
        if (i != 1) {
            if (i == 2) {
                View inflate = from.inflate(R.layout.paymentsdk_item_payment_method, viewGroup, false);
                inflate.getClass();
                return new icp(this, inflate, 0);
            }
            if (i == 3) {
                View inflate2 = from.inflate(R.layout.paymentsdk_item_payment_method, viewGroup, false);
                inflate2.getClass();
                return new ecp(this, inflate2, 0);
            }
            if (i != 4) {
                xq0.q(k5r.i(i, "Unknown view type: "));
                return null;
            }
            View inflate3 = from.inflate(R.layout.paymentsdk_item_payment_method, viewGroup, false);
            inflate3.getClass();
            return new ecp(this, inflate3, 1);
        }
        View inflate4 = from.inflate(R.layout.paymentsdk_item_payment_method_new_cvv_card, viewGroup, false);
        Context context = viewGroup.getContext();
        context.getClass();
        jsg jsgVar = this.e;
        jsgVar.getClass();
        my6 my6Var = new my6(new ContextThemeWrapper(context, jsgVar.b), null, 0, 6, null);
        my6Var.setOnCvnInputFocusChangeListener(new hxo(i3, this));
        TextInputEditText textInputEditText = (TextInputEditText) my6Var.findViewById(R.id.paymentsdk_prebuilt_cvn_field);
        if (textInputEditText != null) {
            textInputEditText.addTextChangedListener(new ex3(i2, textInputEditText, this));
        }
        ((FrameLayout) inflate4.findViewById(R.id.cvn_view)).addView(my6Var);
        return new hcp(this, inflate4, my6Var);
    }

    public final void w(List list, Integer num, boolean z) {
        kcp kcpVar;
        list.getClass();
        this.i = list;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue >= list.size() || intValue < 0) {
                e7o.o("Selected index is out of methods array");
                return;
            }
            kcpVar = (kcp) list.get(intValue);
        } else {
            kcpVar = null;
        }
        this.k = kcpVar;
        if (z) {
            this.j = true;
        }
        g();
    }
}
