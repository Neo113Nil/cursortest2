package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.TypedValue;
import com.bumptech.glide.a;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class wbp implements a39 {
    public final boolean a;
    public final Context b;

    public wbp(Context context, boolean z) {
        this.a = z;
        this.b = context.getApplicationContext();
    }

    @Override // defpackage.a39
    public final ffg a(String str, n7w n7wVar) {
        str.getClass();
        return b(str, n7wVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x02f0, code lost:
    
        if ((r0 == 0 ? 0 : 1) != 0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02f2, code lost:
    
        r0 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0310, code lost:
    
        if ((r0 == 0 ? 0 : 1) != 0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0077, code lost:
    
        if (r5 != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x00f5, code lost:
    
        r5 = ru.yandex.music.R.drawable.ic_unknown_black_theme;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x00f1, code lost:
    
        r5 = ru.yandex.music.R.drawable.ic_unknown_light_theme;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x00ef, code lost:
    
        if (r5 != false) goto L56;
     */
    @Override // defpackage.a39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ffg b(String str, n7w n7wVar) {
        int i;
        Integer valueOf;
        Integer valueOf2 = Integer.valueOf(R.drawable.paymentsdk_divkit_ic_unchecked);
        str.getClass();
        Uri parse = Uri.parse(str);
        boolean d = Intrinsics.d(parse.getScheme(), "local-image");
        Context context = this.b;
        if (!d) {
            b1o c = a.c(context);
            c.getClass();
            k0o G = new k0o(c.a, c, Bitmap.class, c.b).b(b1o.k).H(parse).G(new vbp(n7wVar, new ubp(parse, 1)));
            final oej oejVar = new oej();
            G.E(oejVar, G);
            return new ffg(this) { // from class: tbp
                public final /* synthetic */ wbp b;

                {
                    this.b = this;
                }

                @Override // defpackage.ffg
                public final void cancel() {
                    switch (r3) {
                        case 0:
                            a.c(this.b.b).j(oejVar);
                            break;
                        default:
                            a.c(this.b.b).j(oejVar);
                            break;
                    }
                }
            };
        }
        String host = parse.getHost();
        if (host == null) {
            host = "";
        }
        Resources.Theme theme = context.getTheme();
        theme.getClass();
        boolean E = bfg.E(theme, R.attr.paymentsdk_is_light_theme, true);
        okr[] okrVarArr = okr.a;
        if (host.equals("plus_card")) {
            i = E ? 2131232382 : 2131232383;
        } else if (host.equals("add_new_card_light") || host.equals("add_new_card_dark")) {
            i = 2131232348;
        } else {
            if (!(host.equals("sbp") ? true : host.equals("new_sbp_token"))) {
                em2 em2Var = em2.SBERBANK;
                if (host.equals("tinkoff")) {
                    i = 2131232379;
                } else if (host.equals("alpha_bank")) {
                    i = R.drawable.paymentsdk_divkit_alfabank;
                } else if (host.equals("sberbank")) {
                    i = 2131232377;
                } else if (host.equals("vtb")) {
                    i = 2131232381;
                } else if (host.equals("gazprom")) {
                    i = 2131232359;
                } else if (host.equals("open_bank")) {
                    i = R.drawable.paymentsdk_divkit_otkritye;
                } else if (host.equals("ros_bank")) {
                    i = R.drawable.paymentsdk_divkit_rosbank;
                } else if (host.equals("unicredit")) {
                    i = 2131232380;
                } else if (host.equals("raiffeisen_bank")) {
                    i = 2131232375;
                }
            } else if (!this.a) {
                i = 2131232378;
            }
        }
        final int i2 = 0;
        if (host.equals("selected")) {
            valueOf2 = Integer.valueOf(R.drawable.paymentsdk_divkit_ic_selected);
        } else if (host.equals("unselected")) {
            Resources.Theme theme2 = context.getTheme();
            theme2.getClass();
            valueOf2 = Integer.valueOf(bfg.E(theme2, R.attr.paymentsdk_is_light_theme, true) ? R.drawable.ic_unselected_light_theme : R.drawable.ic_unselected_black_theme);
        } else if (host.equals("link_light") || host.equals("link_dark")) {
            valueOf2 = Integer.valueOf(R.drawable.paymentsdk_ic_link);
        } else if (host.equals("right_arrow_light_theme")) {
            valueOf2 = Integer.valueOf(R.drawable.paymentsdk_divkit_arrow_short_forward_black);
        } else if (host.equals("right_arrow_dark_theme")) {
            valueOf2 = Integer.valueOf(R.drawable.paymentsdk_divkit_arrow_short_forward_white);
        } else if (host.equals("arrow_short_forward")) {
            valueOf2 = Integer.valueOf(R.drawable.paymentsdk_divkit_arrow_short_forward);
        } else if (host.equals("close_dark")) {
            valueOf2 = Integer.valueOf(R.drawable.paymentsdk_divkit_ic_close_white);
        } else if (host.equals("close_light")) {
            valueOf2 = Integer.valueOf(R.drawable.paymentsdk_divkit_ic_close_black);
        } else if (host.equals("navbar_back_dark")) {
            valueOf2 = Integer.valueOf(R.drawable.paymentsdk_divkit_ic_back_dark);
        } else if (host.equals("navbar_back_light")) {
            valueOf2 = Integer.valueOf(R.drawable.paymentsdk_divkit_ic_back_light);
        } else if (host.equals("plus_badge")) {
            valueOf2 = 2131232499;
        } else if (host.equals("discount_badge_side")) {
            valueOf2 = Integer.valueOf(R.drawable.paymentsdk_discount_badge_side);
        } else if (host.equals("ypay_light") || host.equals("ypay_dark") || host.equals("brand_light") || host.equals("brand_dark")) {
            Resources.Theme theme3 = context.getTheme();
            theme3.getClass();
            TypedValue D = bfg.D(R.attr.paymentsdk_brandIcon, theme3);
            if (D != null) {
                int i3 = D.resourceId;
                valueOf = Integer.valueOf(i3);
            }
            valueOf2 = null;
        } else if (host.equals("warning_dark") || host.equals("warning_light")) {
            Resources.Theme theme4 = context.getTheme();
            theme4.getClass();
            TypedValue D2 = bfg.D(R.attr.paymentsdk_warning_icon, theme4);
            if (D2 != null) {
                int i4 = D2.resourceId;
                valueOf = Integer.valueOf(i4);
            }
            valueOf2 = null;
        } else if (host.equals("checked_dark") || host.equals("checked_light")) {
            valueOf2 = Integer.valueOf(R.drawable.paymentsdk_divkit_ic_checked);
        } else if (!host.equals("unchecked_dark") && !host.equals("unchecked_light") && !host.equals("unchecked_dark") && !host.equals("unchecked_light")) {
            valueOf2 = (host.equals("nfc_light") || host.equals("nfc_dark")) ? Integer.valueOf(R.drawable.paymentsdk_ic_nfc_full) : (host.equals("success_light") || host.equals("success_dark")) ? Integer.valueOf(R.drawable.paymentsdk_divkit_ic_success) : host.equals("family_symbol") ? Integer.valueOf(R.drawable.paymentsdk_divkit_ic_family) : host.equals("error_triangle") ? 2131232356 : host.equals("error_cassa") ? Integer.valueOf(R.drawable.paymentsdk_divkit_error_cassa) : host.equals("pad_lock_filled_light") ? Integer.valueOf(R.drawable.paymentsdk_divkit_lock_light) : host.equals("pad_lock_filled_dark") ? Integer.valueOf(R.drawable.paymentsdk_divkit_lock_dark) : Integer.valueOf(i);
        }
        if (valueOf2 == null) {
            return new ih9();
        }
        b1o c2 = a.c(context);
        c2.getClass();
        k0o b = new k0o(c2.a, c2, Bitmap.class, c2.b).b(b1o.k);
        Resources resources = context.getResources();
        int intValue = valueOf2.intValue();
        Resources.Theme theme5 = context.getTheme();
        ThreadLocal threadLocal = e3o.a;
        Drawable drawable = resources.getDrawable(intValue, theme5);
        k0o k0oVar = (k0o) b.I(drawable != null ? vq2.N(drawable, 0, 0, 7) : null).b((g1o) new g1o().e(x68.b)).s(new vhj(String.valueOf(System.currentTimeMillis())));
        if (host.equals("selected") || host.equals("unselected")) {
            k0oVar = (k0o) k0oVar.l(R.drawable.ic_unselected_light_theme);
        }
        k0o G2 = k0oVar.G(new vbp(n7wVar, new ubp(parse, 0)));
        final oej oejVar2 = new oej();
        G2.E(oejVar2, G2);
        return new ffg(this) { // from class: tbp
            public final /* synthetic */ wbp b;

            {
                this.b = this;
            }

            @Override // defpackage.ffg
            public final void cancel() {
                switch (i2) {
                    case 0:
                        a.c(this.b.b).j(oejVar2);
                        break;
                    default:
                        a.c(this.b.b).j(oejVar2);
                        break;
                }
            }
        };
    }
}
