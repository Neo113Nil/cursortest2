package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ru.yandex.taxi.design.bubble.BubbleComponent;
import ru.yandex.taxi.design.span.RoundedBackgroundSpan;
import ru.yandex.taxi.utils.StyledTypefaceSpan;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes5.dex */
public final class tz1 {
    public final Context a;
    public final pdc b;
    public final zuj0 c;

    public tz1(pdc pdcVar, zuj0 zuj0Var, Context context) {
        this.a = context;
        this.b = pdcVar;
        this.c = zuj0Var;
    }

    public final Bitmap a(sz1 sz1Var) {
        Context context = this.a;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        String str = sz1Var.b;
        String str2 = sz1Var.f;
        String str3 = sz1Var.e;
        String str4 = sz1Var.c;
        SpannableString spannableString = new SpannableString(str);
        int i = mrg0.component_text_size_caption;
        avj0 avj0Var = (avj0) this.c;
        int c = avj0Var.c(i);
        ContextThemeWrapper contextThemeWrapper = avj0Var.a;
        int length = str.length();
        spannableString.setSpan(new AbsoluteSizeSpan(c), 0, length, 18);
        int[] iArr = up11.a;
        spannableString.setSpan(new StyledTypefaceSpan(eja1.w(3, 0), 0, 2, null), 0, length, 18);
        bdc bdcVar = new bdc(xng0.textInvert);
        ufu ufuVar = (ufu) this.b;
        spannableString.setSpan(new ForegroundColorSpan(s8o.m(ufuVar.h(bdcVar, str4), context)), 0, length, 18);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannableString);
        String str5 = sz1Var.d;
        if (str5 != null && str3 != null && str2 != null) {
            SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) "  ");
            SpannableString spannableString2 = new SpannableString(str5);
            kdc i2 = ufuVar.i(str3);
            kdc b = ufuVar.b(str2);
            if (i2 != null && b != null) {
                RoundedBackgroundSpan roundedBackgroundSpan = new RoundedBackgroundSpan(s8o.m(b, context), s8o.m(i2, context), tje.w(4, contextThemeWrapper), tje.w(2, contextThemeWrapper), avj0Var.b(mrg0.button_component_default_rounded_corners_radius), false, 0.0f, 0.0f, 224, null);
                spannableString2.setSpan(new AbsoluteSizeSpan(avj0Var.c(mrg0.component_text_size_caption_secondary)), 0, str5.length(), 18);
                spannableString2.setSpan(roundedBackgroundSpan, 0, str5.length(), 18);
                spannableString2.setSpan(new StyledTypefaceSpan(eja1.w(3, 0), 0, 2, null), 0, str5.length(), 18);
            }
            append.append((CharSequence) spannableString2);
        }
        int u = tje.u(12, contextThemeWrapper);
        int i3 = u * 2;
        int c2 = avj0Var.c(jrg0.altpins_source_point_bubble_max_width) - i3;
        RobotoTextView robotoTextView = new RobotoTextView(this.a, null, 0, 6, null);
        StaticLayout build = StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.length(), robotoTextView.getPaint(), c2).build();
        int lineCount = build.getLineCount();
        float f = 0.0f;
        for (int i4 = 0; i4 < lineCount; i4++) {
            f = Math.max(f, build.getLineWidth(i4) + 1.0f);
        }
        robotoTextView.setLayoutParams(new ViewGroup.LayoutParams(((int) f) + i3, -2));
        robotoTextView.setTextAlignment(4);
        Context context2 = robotoTextView.getContext();
        robotoTextView.setLineHeight((int) tje.b0(context2, 14.0f));
        robotoTextView.setLineSpacing(tje.w(4, context2), 1.0f);
        robotoTextView.setTextSize(tje.b0(context2, 12.0f));
        robotoTextView.setPadding(u, tje.u(5, context2), u, tje.u(7, context2));
        robotoTextView.setText(spannableStringBuilder);
        frameLayout.addView(robotoTextView);
        g7h g7hVar = new g7h(context);
        g7hVar.b(ufuVar.b(sz1Var.g));
        BubbleComponent bubbleComponent = new BubbleComponent(this.a, null, 0, 6, null);
        bubbleComponent.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        bubbleComponent.setDecorator(g7hVar);
        bubbleComponent.addView(frameLayout);
        Bitmap h = u8b1.h(c0h0.ic_order_map_alternative_source_pin, context);
        xw31.r(bubbleComponent);
        Bitmap t = xw31.t(bubbleComponent);
        Paint paint = new Paint(1);
        int max = Math.max(t.getWidth(), h.getWidth());
        int height = h.getHeight() + t.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(max, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(t, (max - t.getWidth()) / 2, 0.0f, paint);
        int width = (max - h.getWidth()) / 2;
        canvas.drawBitmap(h, new Rect(0, 0, h.getWidth(), h.getHeight()), new Rect(width, t.getHeight(), max - width, height), paint);
        return createBitmap;
    }
}
