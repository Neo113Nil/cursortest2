package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.NinePatchDrawable;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class zhn {
    public final Context a;
    public final Canvas b = new Canvas();
    public final i3y c = a.b(LazyThreadSafetyMode.SYNCHRONIZED, new bxl(23, this));

    public zhn(Context context) {
        this.a = context;
    }

    public final Bitmap a(CharSequence charSequence, String str) {
        RobotoTextView robotoTextView = new RobotoTextView(this.a, null, 0, 6, null);
        robotoTextView.setBackground((NinePatchDrawable) this.c.getValue());
        robotoTextView.setText(charSequence);
        robotoTextView.setGravity(17);
        robotoTextView.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str)));
        xw31.r(robotoTextView);
        return xw31.t(robotoTextView);
    }
}
