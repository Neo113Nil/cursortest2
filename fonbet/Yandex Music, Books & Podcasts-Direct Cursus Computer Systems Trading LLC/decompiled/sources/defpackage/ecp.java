package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public class ecp extends opn {
    public final /* synthetic */ int A;
    public final /* synthetic */ mcp B;
    public final ViewGroup u;
    public final ImageView v;
    public final ImageView w;
    public final TextView x;
    public final TextView y;
    public final ImageView z;

    public ecp(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.payments_method_container);
        findViewById.getClass();
        this.u = (ViewGroup) findViewById;
        View findViewById2 = view.findViewById(R.id.payment_method_icon);
        findViewById2.getClass();
        this.v = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.payment_method_right_icon);
        findViewById3.getClass();
        this.w = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.payments_method_title);
        findViewById4.getClass();
        this.x = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.payments_method_subtitle);
        findViewById5.getClass();
        this.y = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.payment_method_radio_button);
        findViewById6.getClass();
        this.z = (ImageView) findViewById6;
    }

    public void t(int i) {
        String string;
        int i2 = this.A;
        TextView textView = this.y;
        TextView textView2 = this.x;
        ImageView imageView = this.w;
        ImageView imageView2 = this.v;
        mcp mcpVar = this.B;
        View view = this.a;
        ImageView imageView3 = this.z;
        switch (i2) {
            case 0:
                boolean u = u(i);
                Context context = view.getContext();
                Object obj = mcpVar.i.get(i);
                obj.getClass();
                kcp kcpVar = (kcp) obj;
                rfk rfkVar = kcpVar.a;
                context.getClass();
                if (rfkVar instanceof ffk) {
                    c5c c5cVar = ((ffk) rfkVar).e;
                    if (c5cVar != null) {
                        d5c X = f8g.X(c5cVar.f);
                        if (c5cVar.g) {
                            int i3 = X == null ? -1 : lcp.a[X.ordinal()];
                            if (i3 == -1) {
                                string = context.getString(R.string.paymentsdk_prebuilt_family_pay_available_unlimited);
                                string.getClass();
                            } else if (i3 == 1) {
                                string = context.getString(R.string.paymentsdk_prebuilt_family_pay_available_unlimited_day);
                                string.getClass();
                            } else if (i3 == 2) {
                                string = context.getString(R.string.paymentsdk_prebuilt_family_pay_available_unlimited_week);
                                string.getClass();
                            } else if (i3 != 3) {
                                b6e.s();
                                break;
                            } else {
                                string = context.getString(R.string.paymentsdk_prebuilt_family_pay_available_unlimited_month);
                                string.getClass();
                            }
                        } else {
                            String I = irf.I(context, c5cVar.d(), c5cVar.e, mcpVar.h);
                            int i4 = X == null ? -1 : lcp.a[X.ordinal()];
                            if (i4 == -1) {
                                string = context.getString(R.string.paymentsdk_prebuilt_family_pay_available_format, I);
                                string.getClass();
                            } else if (i4 == 1) {
                                string = context.getString(R.string.paymentsdk_prebuilt_family_pay_available_day_format, I);
                                string.getClass();
                            } else if (i4 == 2) {
                                string = context.getString(R.string.paymentsdk_prebuilt_family_pay_available_week_format, I);
                                string.getClass();
                            } else if (i4 != 3) {
                                b6e.s();
                                break;
                            } else {
                                string = context.getString(R.string.paymentsdk_prebuilt_family_pay_available_month_format, I);
                                string.getClass();
                            }
                        }
                    }
                    string = null;
                } else {
                    if (rfkVar.equals(lfk.a) ? true : rfkVar.equals(kfk.a)) {
                        string = context.getString(R.string.paymentsdk_non_new_sbp_subtitle);
                    }
                    string = null;
                }
                mcp.u(mcpVar, kcpVar, imageView2, imageView, context);
                String str = kcpVar.e;
                if (str == null) {
                    str = mcp.v(mcpVar, rfkVar, context, mcpVar.m);
                }
                textView2.setText(str);
                textView.setText(string);
                textView.setVisibility(string != null ? 0 : 8);
                imageView3.setSelected(u);
                if (u) {
                    imageView3.setImportantForAccessibility(1);
                    imageView3.setContentDescription(imageView3.getContext().getString(R.string.paymentsdk_prebuilt_selected_content_description));
                } else {
                    imageView3.setImportantForAccessibility(2);
                    imageView3.setContentDescription("");
                }
                imageView3.setVisibility(mcpVar.i.size() > 1 ? 0 : 8);
                break;
            default:
                imageView3.setImageResource(2131232462);
                imageView3.setContentDescription(imageView3.getContext().getString(R.string.paymentsdk_prebuilt_delete_content_description));
                Context context2 = view.getContext();
                Object obj2 = mcpVar.i.get(i);
                obj2.getClass();
                kcp kcpVar2 = (kcp) obj2;
                rfk rfkVar2 = kcpVar2.a;
                context2.getClass();
                mcp.u(mcpVar, kcpVar2, imageView2, imageView, context2);
                String str2 = kcpVar2.e;
                if (str2 == null) {
                    str2 = mcp.v(mcpVar, rfkVar2, context2, mcpVar.m);
                }
                textView2.setText(str2);
                textView.setVisibility(8);
                imageView3.setVisibility(0);
                break;
        }
    }

    public boolean u(int i) {
        mcp mcpVar = this.B;
        return Intrinsics.d(mcpVar.i.get(i), mcpVar.k);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ecp(mcp mcpVar, View view, int i) {
        this(view);
        this.A = i;
        switch (i) {
            case 1:
                this.B = mcpVar;
                this(view);
                this.z.setOnClickListener(new fq2(7, this, mcpVar));
                break;
            default:
                this.B = mcpVar;
                this.u.setOnClickListener(new fq2(6, this, mcpVar));
                break;
        }
    }
}
