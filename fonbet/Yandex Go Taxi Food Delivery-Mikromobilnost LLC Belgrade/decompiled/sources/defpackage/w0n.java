package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.go.due_timetable.presentation.DueTimetableModalView;
import com.yandex.go.due_timetable.presentation.state.ButtonType;
import com.yandex.go.due_timetable.presentation.widget.day_selector.DaySelectorView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.due_timetable.DueTimetableView;

/* loaded from: classes12.dex */
public final class w0n implements d1n {
    public final /* synthetic */ DueTimetableModalView a;

    public w0n(DueTimetableModalView dueTimetableModalView) {
        this.a = dueTimetableModalView;
    }

    public final void h(int i) {
        xy40 xy40Var;
        xy40 xy40Var2;
        xy40 xy40Var3;
        xy40 xy40Var4;
        xy40 xy40Var5;
        xy40 xy40Var6;
        DueTimetableModalView dueTimetableModalView = this.a;
        xy40Var = dueTimetableModalView.promoViewsCache;
        if (xy40Var.b > i) {
            xy40Var5 = dueTimetableModalView.promoViewsCache;
            xy40Var6 = dueTimetableModalView.promoViewsCache;
            xy40Var5.n(i, xy40Var6.b);
            return;
        }
        xy40Var2 = dueTimetableModalView.promoViewsCache;
        if (xy40Var2.b < i) {
            xy40Var3 = dueTimetableModalView.promoViewsCache;
            int i2 = i - xy40Var3.b;
            for (int i3 = 0; i3 < i2; i3++) {
                ListItemComponent listItemComponent = new ListItemComponent(dueTimetableModalView.getContext(), null, 0, 6, null);
                listItemComponent.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                xy40Var4 = dueTimetableModalView.promoViewsCache;
                xy40Var4.g(listItemComponent);
            }
        }
    }

    @Override // defpackage.d1n
    public final void md(Drawable drawable) {
        b1n binding;
        b1n binding2;
        Rect rect = new Rect();
        drawable.getPadding(rect);
        DueTimetableModalView dueTimetableModalView = this.a;
        binding = dueTimetableModalView.getBinding();
        xw31.E(binding.f, Integer.valueOf(-rect.left), Integer.valueOf(-rect.top), Integer.valueOf(-rect.right), Integer.valueOf(-rect.bottom));
        binding2 = dueTimetableModalView.getBinding();
        binding2.f.setBackground(drawable);
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        b1n binding;
        b1n binding2;
        b1n binding3;
        b1n binding4;
        u0n u0nVar;
        b1n binding5;
        u0n u0nVar2;
        z0n z0nVar;
        u0n u0nVar3;
        v0n v0nVar;
        s0n s0nVar;
        a1n a1nVar;
        u0n u0nVar4;
        z0n z0nVar2;
        u0n u0nVar5;
        v0n v0nVar2;
        s0n s0nVar2;
        a1n a1nVar2;
        b1n binding6;
        b1n binding7;
        u0n u0nVar6;
        boolean z;
        x0n x0nVar;
        s0n s0nVar3;
        s0n s0nVar4;
        v0n v0nVar3;
        a1n a1nVar3;
        y0n y0nVar;
        b1n binding8;
        xy40 xy40Var;
        k7x0 k7x0Var;
        pav pavVar;
        int selectableItemBackgroundResourceId;
        y0n y0nVar2;
        a1n a1nVar4;
        v0n v0nVar4;
        s0n s0nVar5;
        x0n x0nVar2;
        b1n binding9;
        o0n o0nVar = (o0n) obj;
        bg1 bg1Var = o0nVar.a;
        DueTimetableModalView dueTimetableModalView = this.a;
        binding = dueTimetableModalView.getBinding();
        binding.h.setText(bg1Var.b);
        binding2 = dueTimetableModalView.getBinding();
        binding2.i.setVisibility(8);
        a47 a47Var = o0nVar.c;
        if (a47Var instanceof w37) {
            binding9 = dueTimetableModalView.getBinding();
            ButtonComponent buttonComponent = binding9.e.k;
            w37 w37Var = (w37) a47Var;
            ButtonType buttonType = w37Var.f;
            bdc bdcVar = w37Var.b;
            bdc bdcVar2 = w37Var.a;
            buttonComponent.setButtonBackground(bdcVar2);
            buttonComponent.setDisabledButtonBackground(bdcVar2);
            buttonComponent.setButtonTitleColor(bdcVar);
            buttonComponent.setDisabledButtonTitleColor(bdcVar);
            buttonComponent.setText(w37Var.e);
            buttonComponent.setEnabled(w37Var.d);
            buttonComponent.setAccent(w37Var.c);
            buttonComponent.setTag(buttonType);
            if (buttonType == ButtonType.BLOCKING_LOADING) {
                buttonComponent.startProgress();
            } else {
                dueTimetableModalView.stopProgress();
            }
        } else {
            if (!(a47Var instanceof x37)) {
                w511.b();
                return;
            }
            binding3 = dueTimetableModalView.getBinding();
            binding3.e.a.setVisibility(8);
            binding4 = dueTimetableModalView.getBinding();
            binding4.f.setVisibility(8);
        }
        jie jieVar = o0nVar.b;
        if (!(jieVar instanceof cie)) {
            if (jieVar instanceof eie) {
                u0nVar5 = dueTimetableModalView.contentViewController;
                u0nVar5.a.setVisibility(8);
                u0nVar5.b.setVisibility(8);
                u0nVar5.c.setVisibility(0);
                u0nVar5.d.setVisibility(8);
                v0nVar2 = dueTimetableModalView.departureViewController;
                v0nVar2.b.setVisibility(8);
                v0nVar2.c.setVisibility(8);
                v0nVar2.d.setVisibility(8);
                s0nVar2 = dueTimetableModalView.arrivalViewController;
                s0nVar2.a.setVisibility(8);
                s0nVar2.b.setVisibility(8);
                s0nVar2.c.setVisibility(8);
                a1nVar2 = dueTimetableModalView.unavailableViewController;
                a1nVar2.a.setVisibility(8);
                binding6 = dueTimetableModalView.getBinding();
                binding6.d.c.setText(((eie) jieVar).a);
                return;
            }
            if (!(jieVar instanceof hie)) {
                if (!(jieVar instanceof die)) {
                    w511.b();
                    return;
                }
                u0nVar = dueTimetableModalView.contentViewController;
                u0nVar.a.setVisibility(8);
                u0nVar.b.setVisibility(8);
                u0nVar.c.setVisibility(8);
                u0nVar.d.setVisibility(0);
                binding5 = dueTimetableModalView.getBinding();
                binding5.c.c.setText(((die) jieVar).a);
                return;
            }
            hie hieVar = (hie) jieVar;
            if (!(hieVar instanceof gie)) {
                if (!(hieVar instanceof fie)) {
                    w511.b();
                    return;
                }
                dueTimetableModalView.setDismissOnTouchOutside(false);
                dueTimetableModalView.setOnTouchOutsideListener(null);
                dueTimetableModalView.setCardMode(SlideableModalView.CardMode.FIXED_CARD);
                u0nVar2 = dueTimetableModalView.contentViewController;
                u0nVar2.a.setAlpha(0.5f);
                z0nVar = dueTimetableModalView.promoViewController;
                z0nVar.a.setAlpha(0.5f);
                return;
            }
            u0nVar3 = dueTimetableModalView.contentViewController;
            u0nVar3.a.setVisibility(8);
            u0nVar3.b.setVisibility(0);
            u0nVar3.c.setVisibility(8);
            u0nVar3.d.setVisibility(8);
            v0nVar = dueTimetableModalView.departureViewController;
            v0nVar.b.setVisibility(0);
            v0nVar.c.setVisibility(8);
            v0nVar.d.setVisibility(0);
            s0nVar = dueTimetableModalView.arrivalViewController;
            s0nVar.a.setVisibility(0);
            s0nVar.b.setVisibility(8);
            s0nVar.c.setVisibility(0);
            a1nVar = dueTimetableModalView.unavailableViewController;
            a1nVar.a.setVisibility(8);
            dueTimetableModalView.setDismissOnTouchOutside(true);
            dueTimetableModalView.setOnTouchOutsideListener(new uhm(6, dueTimetableModalView));
            dueTimetableModalView.setCardMode(SlideableModalView.CardMode.SLIDEABLE_CARD);
            u0nVar4 = dueTimetableModalView.contentViewController;
            u0nVar4.a.setAlpha(1.0f);
            z0nVar2 = dueTimetableModalView.promoViewController;
            z0nVar2.a.setAlpha(1.0f);
            return;
        }
        cie cieVar = (cie) jieVar;
        binding7 = dueTimetableModalView.getBinding();
        u0nVar6 = dueTimetableModalView.contentViewController;
        u0nVar6.a.setVisibility(0);
        u0nVar6.b.setVisibility(8);
        u0nVar6.c.setVisibility(8);
        u0nVar6.d.setVisibility(8);
        DaySelectorView daySelectorView = binding7.b.b;
        zgf zgfVar = cieVar.a;
        xw11 xw11Var = cieVar.f;
        qwi qwiVar = cieVar.d;
        n73 n73Var = cieVar.e;
        daySelectorView.setDaySelectorItems(((xy40) zgfVar.b).i());
        DueTimetableView dueTimetableView = binding7.b.e;
        we6 we6Var = cieVar.c;
        dueTimetableView.setTimetableItems(((xy40) we6Var.c).i());
        int i = we6Var.b;
        boolean z2 = dueTimetableView.getScrollState() == 0;
        boolean z3 = i != dueTimetableView.getSelectedPosition();
        z = dueTimetableModalView.newDaySlotSelected;
        if (z || (z3 && z2)) {
            dueTimetableView.setSelectedPosition(i);
            dueTimetableModalView.newDaySlotSelected = false;
        }
        o0f0 o0f0Var = cieVar.b;
        if (o0f0Var instanceof m0f0) {
            x0nVar2 = dueTimetableModalView.priceViewController;
            m0f0 m0f0Var = (m0f0) o0f0Var;
            String str = m0f0Var.a;
            String str2 = m0f0Var.b;
            TextView textView = x0nVar2.a;
            textView.setVisibility(0);
            TextView textView2 = x0nVar2.b;
            textView2.setVisibility(0);
            textView.setText(str);
            textView2.setText(str2);
        } else if (!(o0f0Var instanceof n0f0)) {
            w511.b();
            return;
        } else {
            x0nVar = dueTimetableModalView.priceViewController;
            x0nVar.a.setVisibility(8);
            x0nVar.b.setVisibility(8);
        }
        if (n73Var instanceof k73) {
            s0nVar5 = dueTimetableModalView.arrivalViewController;
            k73 k73Var = (k73) n73Var;
            String str3 = k73Var.a;
            String str4 = k73Var.b;
            s0nVar5.a.setVisibility(0);
            s0nVar5.b.setVisibility(0);
            s0nVar5.c.setVisibility(8);
            s0nVar5.d.setText(str3);
            s0nVar5.e.setText(str4);
        } else if (n73Var instanceof m73) {
            s0nVar4 = dueTimetableModalView.arrivalViewController;
            s0nVar4.a.setVisibility(0);
            s0nVar4.b.setVisibility(8);
            s0nVar4.c.setVisibility(0);
        } else {
            if (!(n73Var instanceof l73)) {
                w511.b();
                return;
            }
            s0nVar3 = dueTimetableModalView.arrivalViewController;
            s0nVar3.a.setVisibility(0);
            s0nVar3.b.setVisibility(8);
            s0nVar3.c.setVisibility(8);
        }
        if (qwiVar instanceof owi) {
            v0nVar4 = dueTimetableModalView.departureViewController;
            owi owiVar = (owi) qwiVar;
            String str5 = owiVar.a;
            CharSequence charSequence = owiVar.b;
            String str6 = owiVar.c;
            v0nVar4.b.setVisibility(0);
            v0nVar4.c.setVisibility(0);
            v0nVar4.d.setVisibility(8);
            v0nVar4.e.setText(str5);
            TextView textView3 = v0nVar4.f;
            if (str6 != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(charSequence);
                spannableStringBuilder.append((CharSequence) "\u2004•\u2004");
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(v0nVar4.a.getColor(mqg0.component_orange_toxic));
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) str6);
                spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
                charSequence = new SpannedString(spannableStringBuilder);
            }
            textView3.setText(charSequence);
        } else {
            if (!(qwiVar instanceof pwi)) {
                w511.b();
                return;
            }
            v0nVar3 = dueTimetableModalView.departureViewController;
            v0nVar3.b.setVisibility(0);
            v0nVar3.c.setVisibility(8);
            v0nVar3.d.setVisibility(8);
        }
        if (xw11Var instanceof vw11) {
            a1nVar4 = dueTimetableModalView.unavailableViewController;
            String str7 = ((vw11) xw11Var).a;
            a1nVar4.a.setVisibility(0);
            a1nVar4.b.setText(str7);
        } else if (!(xw11Var instanceof ww11)) {
            w511.b();
            return;
        } else {
            a1nVar3 = dueTimetableModalView.unavailableViewController;
            a1nVar3.a.setVisibility(8);
        }
        if ((n73Var instanceof l73) && (qwiVar instanceof pwi) && (xw11Var instanceof ww11)) {
            y0nVar2 = dueTimetableModalView.promoAndTimeDividerController;
            y0nVar2.a.setDividerDrawable(null);
            y0nVar2.b.setVisibility(8);
        } else {
            y0nVar = dueTimetableModalView.promoAndTimeDividerController;
            y0nVar.a.setDividerDrawable(vng.t(d2h0.due_timetable_additional_actions_divider, y0nVar.c.getContext()));
            y0nVar.b.setVisibility(0);
        }
        vqf0 vqf0Var = cieVar.g;
        binding8 = dueTimetableModalView.getBinding();
        LinearLayout linearLayout = binding8.e.n;
        if (!(vqf0Var instanceof sqf0)) {
            if (!(vqf0Var instanceof tqf0)) {
                w511.b();
                return;
            }
            h(0);
            linearLayout.setVisibility(8);
            linearLayout.removeAllViews();
            return;
        }
        xy40 xy40Var2 = ((sqf0) vqf0Var).a;
        h(xy40Var2.b);
        linearLayout.setVisibility(0);
        linearLayout.removeAllViews();
        Object[] objArr = xy40Var2.a;
        int i2 = xy40Var2.b;
        for (int i3 = 0; i3 < i2; i3++) {
            znf0 znf0Var = (znf0) objArr[i3];
            xy40Var = dueTimetableModalView.promoViewsCache;
            ListItemComponent listItemComponent = (ListItemComponent) xy40Var.b(i3);
            ImageView leadImageView = listItemComponent.getLeadImageView();
            String str8 = znf0Var.a;
            if (str8.length() == 0) {
                leadImageView.setImageDrawable(null);
                leadImageView.setTag(null);
            } else {
                Object tag = leadImageView.getTag();
                if (!jl40.l(tag instanceof String ? (String) tag : null, str8)) {
                    k7x0Var = dueTimetableModalView.tagUrlFormatter;
                    String a = ((m7x0) k7x0Var).a(str8);
                    pavVar = dueTimetableModalView.imageLoader;
                    ((nac) pavVar.a(leadImageView)).c(a);
                    leadImageView.setTag(str8);
                }
            }
            listItemComponent.setTitle(znf0Var.b);
            listItemComponent.setSubtitle(znf0Var.c);
            if (znf0Var.d != null) {
                listItemComponent.setTrailMode(2);
                listItemComponent.setDebounceClickListener(new xm2(dueTimetableModalView, i3, 6));
                selectableItemBackgroundResourceId = dueTimetableModalView.getSelectableItemBackgroundResourceId();
                listItemComponent.setBackgroundResource(selectableItemBackgroundResourceId);
            } else {
                listItemComponent.setTrailMode(0);
                listItemComponent.setOnClickListener(null);
                listItemComponent.setBackgroundColor((kdc) null);
            }
            linearLayout.addView(listItemComponent);
        }
    }
}
