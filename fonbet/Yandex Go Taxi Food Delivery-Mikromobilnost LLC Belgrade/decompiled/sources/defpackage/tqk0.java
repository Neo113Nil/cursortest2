package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.a;
import ru.yandex.taxi.design.AddressAutofitHelper$ExtraSuffixType;
import ru.yandex.taxi.utils.CustomImageSpan;

/* loaded from: classes5.dex */
public final class tqk0 {
    public final Context a;
    public final i3y b = a.a(new iik0(5, this));

    public tqk0(Context context) {
        this.a = context;
    }

    public final kq0 a(CharSequence charSequence, Drawable drawable, int i, int i2, int i3) {
        ViewGroup viewGroup = (ViewGroup) this.b.getValue();
        TextView textView = (TextView) viewGroup.findViewById(adh0.route_time_bubble_text);
        ImageView imageView = (ImageView) viewGroup.findViewById(adh0.route_time_bubble_icon);
        int i4 = zyg0.component_source_destination_route_time_shape;
        Context context = this.a;
        Drawable drawable2 = context.getDrawable(i4);
        if (drawable2 == null) {
            return new kq0(charSequence, AddressAutofitHelper$ExtraSuffixType.PLAIN_TEXT);
        }
        drawable2.setTint(i);
        viewGroup.setBackground(drawable2);
        textView.setTextColor(i2);
        textView.setText(charSequence);
        imageView.setVisibility(drawable != null ? 0 : 8);
        if (drawable != null) {
            drawable.setTint(i3);
            imageView.setImageDrawable(drawable);
        }
        viewGroup.measure((int) tje.x(context, 16.0f), (int) tje.x(context, 16.0f));
        int measuredWidth = viewGroup.getMeasuredWidth();
        int measuredHeight = viewGroup.getMeasuredHeight();
        Bitmap createBitmap = Bitmap.createBitmap(viewGroup.getMeasuredWidth(), viewGroup.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        viewGroup.layout(0, 0, viewGroup.getMeasuredWidth(), viewGroup.getMeasuredHeight());
        viewGroup.draw(canvas);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), createBitmap);
        bitmapDrawable.setBounds(0, 0, measuredWidth, measuredHeight);
        return new kq0(new SpannableStringBuilder().append("[badge]", new CustomImageSpan(bitmapDrawable, 2, true, false, null, 24, null), 33), AddressAutofitHelper$ExtraSuffixType.BUBBLE);
    }

    public final kq0 b(CharSequence charSequence, Drawable drawable) {
        if (drawable == null) {
            return new kq0(charSequence, AddressAutofitHelper$ExtraSuffixType.PLAIN_TEXT);
        }
        Context context = this.a;
        drawable.setBounds(0, 0, (int) tje.x(context, 9.0f), (int) tje.x(context, 9.0f));
        return new kq0(new SpannableStringBuilder().append(" ", new CustomImageSpan(drawable, 2, false, false, null, 28, null), 33).append((char) 160).append(charSequence), AddressAutofitHelper$ExtraSuffixType.ICON);
    }
}
