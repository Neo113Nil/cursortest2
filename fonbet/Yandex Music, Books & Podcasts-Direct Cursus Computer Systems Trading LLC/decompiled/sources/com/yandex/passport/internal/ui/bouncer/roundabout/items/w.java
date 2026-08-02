package com.yandex.passport.internal.ui.bouncer.roundabout.items;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.text.BidiFormatter;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.chip.Chip;
import com.yandex.passport.R;
import com.yandex.passport.internal.badges.MaxLinesChipGroup;
import defpackage.b6e;
import defpackage.cce;
import defpackage.e7t;
import defpackage.g4i;
import defpackage.hs4;
import defpackage.jj4;
import defpackage.ldg;
import defpackage.pce;
import defpackage.xee;
import defpackage.xwh;
import defpackage.xz0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public abstract class w {
    public static final void a(l lVar, f0 f0Var) {
        lVar.getClass();
        f0Var.getClass();
        Context context = lVar.e().getContext();
        String c = f0Var.c();
        if (c != null) {
            ImageView imageView = lVar.e;
            cce C = hs4.C(imageView.getContext());
            pce pceVar = new pce(imageView.getContext());
            pceVar.c = c;
            pceVar.f(imageView);
            context.getClass();
            String str = (context.getResources().getConfiguration().uiMode & 48) + c;
            pceVar.g = str;
            pceVar.f = new xwh(str);
            pceVar.b();
            pceVar.c(R.drawable.passport_icon_user_unknown);
            pceVar.j = xee.L(xz0.X(new e7t[]{new com.yandex.passport.internal.ui.bouncer.roundabout.avatar.b(com.yandex.passport.internal.ui.bouncer.roundabout.b0.a, f0Var.f()), new com.yandex.passport.internal.ui.bouncer.roundabout.avatar.a(context, f0Var.e())}));
            C.d(pceVar.a());
        }
    }

    public static final void b(l lVar, f0 f0Var) {
        lVar.getClass();
        f0Var.getClass();
        int ordinal = f0Var.a().ordinal();
        if (ordinal == 0) {
            lVar.e().setBackground(lVar.e().getContext().getDrawable(R.drawable.passport_roundabout_account));
            return;
        }
        if (ordinal == 1) {
            lVar.e().setBackground(lVar.e().getContext().getDrawable(R.drawable.passport_roundabout_master_upper));
            return;
        }
        if (ordinal == 2) {
            lVar.e().setBackground(lVar.e().getContext().getDrawable(R.drawable.passport_roundabout_master_middle));
        } else if (ordinal == 3) {
            lVar.e().setBackground(lVar.e().getContext().getDrawable(R.drawable.passport_roundabout_master_lower));
        } else {
            b6e.s();
        }
    }

    public static final void c(l lVar, f0 f0Var) {
        String str;
        lVar.getClass();
        f0Var.getClass();
        ConstraintLayout e = lVar.e();
        MaxLinesChipGroup maxLinesChipGroup = lVar.h;
        Context context = e.getContext();
        List g = f0Var.g();
        if (g.isEmpty()) {
            g = null;
        }
        if (g == null || (str = context.getString(R.string.passport_recyclerview_item_description_badges, CollectionsKt.X(g, ", ", null, null, new com.yandex.passport.internal.storage.d(6), 30))) == null) {
            str = "";
        }
        lVar.e().setContentDescription(context.getString(R.string.passport_recyclerview_item_description_account, lVar.f.getText(), lVar.g.getText(), str));
        maxLinesChipGroup.setVisibility(!f0Var.g().isEmpty() ? 0 : 8);
        if (maxLinesChipGroup.getVisibility() == 0) {
            maxLinesChipGroup.removeAllViews();
            for (com.yandex.passport.internal.badges.a aVar : f0Var.g()) {
                String b = com.yandex.passport.internal.badges.a.b(aVar);
                Chip chip = new Chip(lVar.d);
                DisplayMetrics displayMetrics = g4i.a;
                chip.setMaxWidth((int) (200 * displayMetrics.density));
                float f = 24;
                chip.setMinHeight((int) (displayMetrics.density * f));
                chip.setChipMinHeight(f * displayMetrics.density);
                chip.setChipIconSize(14 * displayMetrics.density);
                float f2 = 6;
                chip.setChipStartPadding(displayMetrics.density * f2);
                chip.setChipEndPadding(f2 * displayMetrics.density);
                float f3 = 2;
                chip.setIconStartPadding(displayMetrics.density * f3);
                chip.setIconEndPadding(f3 * displayMetrics.density);
                chip.setTextStartPadding(3 * displayMetrics.density);
                chip.setTextSize(14.0f);
                ldg.K(chip, R.color.passport_roundabout_text_primary);
                ldg.J(chip, ru.yandex.music.R.font.ys_text_regular);
                chip.setEllipsize(TextUtils.TruncateAt.END);
                chip.setText(b);
                chip.setEnsureMinTouchTargetSize(false);
                chip.c(0);
                chip.setClickable(false);
                chip.setShapeAppearanceModel(chip.getShapeAppearanceModel().i(8 * displayMetrics.density));
                chip.setRippleColor(ColorStateList.valueOf(0));
                chip.setStateListAnimator(null);
                chip.setChipBackgroundColor(ColorStateList.valueOf(chip.getContext().getColor(R.color.passport_roundabout_background)));
                chip.setPadding(chip.getPaddingLeft(), 0, chip.getPaddingRight(), 0);
                maxLinesChipGroup.addView(chip);
                boolean z = (context.getResources().getConfiguration().uiMode & 48) == 32;
                Locale locale = Locale.getDefault();
                locale.getClass();
                LinkedHashMap linkedHashMap = z ? aVar.d : aVar.c;
                String language = locale.getLanguage();
                language.getClass();
                String a = com.yandex.passport.internal.badges.a.a(language, linkedHashMap);
                Context context2 = chip.getContext();
                context2.getClass();
                cce C = hs4.C(context2);
                Context context3 = chip.getContext();
                context3.getClass();
                pce pceVar = new pce(context3);
                pceVar.c = a;
                pceVar.d = new com.yandex.passport.internal.utils.a(chip);
                pceVar.d();
                pceVar.c(R.drawable.passport_roundabout_account_badge_icon_placeholder);
                pceVar.v = Integer.valueOf(R.drawable.passport_roundabout_account_badge_icon_placeholder);
                pceVar.w = null;
                pceVar.h = Bitmap.Config.ARGB_8888;
                C.d(pceVar.a());
                chip.setImportantForAccessibility(2);
            }
        }
    }

    public static final void d(l lVar, f0 f0Var) {
        String n;
        Integer valueOf;
        String string;
        lVar.getClass();
        f0Var.getClass();
        Context context = lVar.e().getContext();
        BidiFormatter bidiFormatter = BidiFormatter.getInstance();
        TextView textView = lVar.g;
        u e = f0Var.e();
        if (e instanceof r) {
            n = com.yandex.passport.internal.ui.a.n(bidiFormatter.unicodeWrap(f0Var.b()), f0Var.d());
        } else if ((e instanceof q) || (e instanceof p) || (e instanceof o)) {
            n = com.yandex.passport.internal.ui.a.n(bidiFormatter.unicodeWrap(f0Var.b()), f0Var.h());
        } else {
            String str = null;
            if (e instanceof s) {
                String unicodeWrap = bidiFormatter.unicodeWrap(f0Var.b());
                switch (((s) e).a.ordinal()) {
                    case 0:
                        valueOf = Integer.valueOf(R.string.passport_am_social_vk);
                        break;
                    case 1:
                        valueOf = Integer.valueOf(R.string.passport_am_social_fb);
                        break;
                    case 2:
                        valueOf = Integer.valueOf(R.string.passport_am_social_twitter);
                        break;
                    case 3:
                        valueOf = Integer.valueOf(R.string.passport_am_social_ok);
                        break;
                    case 4:
                        valueOf = Integer.valueOf(R.string.passport_am_social_mailru);
                        break;
                    case 5:
                        valueOf = Integer.valueOf(R.string.passport_am_social_google);
                        break;
                    case 6:
                        valueOf = Integer.valueOf(R.string.passport_am_social_esia);
                        break;
                    case 7:
                        valueOf = null;
                        break;
                    default:
                        b6e.s();
                        return;
                }
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    if (intValue == -1) {
                        string = "";
                    } else {
                        string = com.yandex.plus.pay.ui.core.b.u().getResources().getString(intValue);
                        string.getClass();
                    }
                    str = string;
                }
                n = com.yandex.passport.internal.ui.a.n(unicodeWrap, str);
            } else {
                n = e instanceof m ? com.yandex.passport.internal.ui.a.n(context.getString(R.string.passport_child_label), f0Var.d()) : e instanceof t ? com.yandex.passport.internal.ui.a.n(null, f0Var.h()) : com.yandex.passport.internal.ui.a.n(bidiFormatter.unicodeWrap(f0Var.b()), null);
            }
        }
        textView.setText(n);
        CharSequence text = textView.getText();
        textView.setVisibility((text == null || StringsKt.U(text)) ? 8 : 0);
    }

    public static final void e(l lVar, f0 f0Var) {
        lVar.getClass();
        f0Var.getClass();
        int ordinal = f0Var.a().ordinal();
        if (ordinal == 2 || ordinal == 3) {
            ConstraintLayout e = lVar.e();
            ViewGroup.LayoutParams layoutParams = e.getLayoutParams();
            if (layoutParams == null) {
                jj4.j("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = (int) (2 * g4i.a.density);
            e.setLayoutParams(marginLayoutParams);
            return;
        }
        ConstraintLayout e2 = lVar.e();
        ViewGroup.LayoutParams layoutParams2 = e2.getLayoutParams();
        if (layoutParams2 == null) {
            jj4.j("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.topMargin = (int) (6 * g4i.a.density);
        e2.setLayoutParams(marginLayoutParams2);
    }
}
