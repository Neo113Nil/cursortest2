package ru.yandex.taxi.order.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import defpackage.a2i0;
import defpackage.dwh0;
import defpackage.evu0;
import defpackage.jtq0;
import defpackage.kyh0;
import defpackage.mrg0;
import defpackage.mzh0;
import defpackage.nf7;
import defpackage.q48;
import defpackage.qeb1;
import defpackage.t58;
import defpackage.t7s;
import defpackage.tp11;
import defpackage.wug0;
import defpackage.x78;
import defpackage.xw31;
import java.util.Calendar;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Metadata;
import ru.yandex.taxi.carplates.experiments.CarPlateAppearanceExperiment;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/order/view/CarDescriptionTextView;", "Lru/yandex/taxi/widget/RobotoTextView;", "Landroid/content/Context;", "context", "Lt58;", "carNumberFormatter", "Lnf7;", "calendarManager", "<init>", "(Landroid/content/Context;Lt58;Lnf7;)V", "Lq48;", "carData", "", "scheduledOrder", "Lzy11;", "setData", "(Lq48;Z)V", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Lx78;", "formatter", "Lx78;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CarDescriptionTextView extends RobotoTextView {
    public static final int $stable = 8;
    private final x78 formatter;

    public CarDescriptionTextView(Context context, t58 t58Var, nf7 nf7Var) {
        super(context, null, a2i0.TextViewCarNumber);
        this.formatter = new x78(context, t58Var, nf7Var);
        t58Var.b = getResources().getDimensionPixelOffset(wug0.car_number_start_space);
        setFontFeatureSettings(getContext().getString(mzh0.go_default_font_settings));
        setTextSize(14.0f);
    }

    @Override // ru.yandex.taxi.widget.RobotoTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Context context = getContext();
        Rect rect = xw31.a;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((context.getResources().getDisplayMetrics().widthPixels - (getResources().getDimensionPixelSize(mrg0.order_screens_multi_order_card_side_offset) * 2)) - (getResources().getDimensionPixelSize(wug0.order_screens_card_title_offset) * 2), Integer.MIN_VALUE), heightMeasureSpec);
    }

    public final void setData(q48 carData, boolean scheduledOrder) {
        SpannableStringBuilder spannableStringBuilder;
        Calendar calendar;
        Context context;
        String str;
        x78 x78Var = this.formatter;
        t58 t58Var = x78Var.a;
        Context context2 = x78Var.c;
        String str2 = carData.a;
        List list = carData.g;
        String str3 = carData.b;
        String str4 = carData.d;
        if ((str2 == null || evu0.J(str2)) && (str4 == null || evu0.J(str4))) {
            spannableStringBuilder = new SpannableStringBuilder();
        } else {
            spannableStringBuilder = new SpannableStringBuilder();
            if (scheduledOrder || (calendar = carData.e) == null) {
                context = context2;
                str = str4;
            } else {
                Resources resources = context2.getResources();
                int i = kyh0.taxischeduled_time_left_explanation;
                nf7 nf7Var = x78Var.b;
                Pattern pattern = t7s.a;
                StringBuilder sb = new StringBuilder();
                Resources resources2 = context2.getResources();
                jtq0 jtq0Var = nf7Var.a;
                context = context2;
                jtq0 jtq0Var2 = nf7Var.a;
                str = str4;
                if (calendar.getTimeInMillis() - jtq0Var.a(calendar.getTimeZone()).getTimeInMillis() < 3600000) {
                    int e = nf7Var.b(calendar) ? 0 : nf7Var.e(calendar);
                    sb.append(t7s.i(resources2, dwh0.date_format_minutes_left, kyh0.date_format_minutes_left_fallback, e, Integer.valueOf(e)));
                } else if (calendar.getTimeInMillis() - jtq0Var2.a(calendar.getTimeZone()).getTimeInMillis() < 86400000) {
                    int a = nf7Var.a(calendar);
                    sb.append(t7s.i(resources2, dwh0.date_format_hours_left, kyh0.date_format_hours_left_fallback, a, Integer.valueOf(a)));
                    int e2 = nf7Var.e(calendar) % 60;
                    if (e2 > 0) {
                        sb.append(" ");
                        sb.append(t7s.i(resources2, dwh0.date_format_minutes_left, kyh0.date_format_minutes_left_fallback, e2, Integer.valueOf(e2)));
                    }
                } else {
                    int timeInMillis = (int) ((calendar.getTimeInMillis() - jtq0Var2.a(calendar.getTimeZone()).getTimeInMillis()) / 86400000);
                    sb.append(t7s.i(resources2, dwh0.date_format_days_left, kyh0.date_format_days_left_fallback, timeInMillis, Integer.valueOf(timeInMillis)));
                    int a2 = nf7Var.a(calendar) % 24;
                    if (a2 > 0) {
                        sb.append(" ");
                        sb.append(t7s.i(resources2, dwh0.date_format_hours_left, kyh0.date_format_hours_left_fallback, a2, Integer.valueOf(a2)));
                    }
                }
                spannableStringBuilder.append((CharSequence) resources.getString(i, sb.toString()));
                spannableStringBuilder.append((CharSequence) " ");
            }
            if (xw31.n(context)) {
                spannableStringBuilder.append((CharSequence) str2);
                if (str != null && !evu0.J(str)) {
                    spannableStringBuilder.append((CharSequence) "\u200a");
                    t58Var.a(carData.c(), spannableStringBuilder, list.contains(CarPlateAppearanceExperiment.CarPlateUsage.SINGLE_ORDER_CARD));
                }
                if (str3 != null && !evu0.J(str3)) {
                    spannableStringBuilder.append((CharSequence) " ");
                    spannableStringBuilder.append((CharSequence) str3);
                }
            } else {
                if (str3 != null && !evu0.J(str3)) {
                    spannableStringBuilder.append((CharSequence) str3);
                    spannableStringBuilder.append((CharSequence) " ");
                }
                spannableStringBuilder.append((CharSequence) str2);
                if (str != null && !evu0.J(str)) {
                    spannableStringBuilder.append((CharSequence) "\u200a");
                    t58Var.a(carData.c(), spannableStringBuilder, list.contains(CarPlateAppearanceExperiment.CarPlateUsage.SINGLE_ORDER_CARD));
                }
            }
        }
        setText(spannableStringBuilder);
        setMovementMethod(qeb1.d(spannableStringBuilder) ? LinkMovementMethod.getInstance() : null);
        tp11.b(0, this);
    }
}
