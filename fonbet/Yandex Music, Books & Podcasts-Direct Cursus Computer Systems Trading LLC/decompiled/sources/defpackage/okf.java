package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class okf extends mkf {
    public final Drawable d;
    public final TextView e;
    public final ImageView f;
    public final View g;
    public boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public okf(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(getContext()).inflate(R.layout.rup_dialog_settings_context_view, (ViewGroup) this, true).getClass();
        setLayoutParams(new FrameLayout.LayoutParams(-2, context.getResources().getDimensionPixelSize(R.dimen.rup_settings_context_height)));
        LayerDrawable layerDrawable = (LayerDrawable) avf.I(context, R.drawable.rup_background_oval_accent_border_28);
        setBackground(layerDrawable);
        Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.rup_item_oval_border_accent);
        findDrawableByLayerId.getClass();
        this.d = findDrawableByLayerId;
        View findViewById = findViewById(R.id.rup_settings_context_name_text_view);
        findViewById.getClass();
        this.e = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.rup_settings_special_context_image);
        findViewById2.getClass();
        this.f = (ImageView) findViewById2;
        View findViewById3 = findViewById(R.id.rup_settings_notification_dot);
        findViewById3.getClass();
        this.g = findViewById3;
        findDrawableByLayerId.setAlpha(0);
    }

    @Override // defpackage.mkf
    public final String a() {
        if (!this.h) {
            return getName();
        }
        return getContext().getString(R.string.accessibility_new_wave_settings_notification_dot) + ", " + getName();
    }

    @Override // defpackage.mkf
    public int getBorderAlpha() {
        return this.d.getAlpha();
    }

    @Override // defpackage.mkf
    @NotNull
    public String getName() {
        return this.e.getText().toString();
    }

    @Override // defpackage.mkf
    public void setBorderAlpha(int i) {
        this.d.setAlpha(i);
    }

    @Override // defpackage.mkf
    public void setName(@NotNull String str) {
        str.getClass();
        this.e.setText(str);
    }

    public final void setNotificationDot(boolean z) {
        this.h = z;
        TextView textView = this.e;
        int paddingStart = textView.getPaddingStart();
        Context context = getContext();
        context.getClass();
        textView.setPadding(paddingStart, 0, (int) avf.D(context, z ? 40.0f : 24.0f), 0);
        wxf.K(this.g, z);
    }

    public final void setSpecialImage(String str) {
        Context context = getContext();
        context.getClass();
        int D = (int) avf.D(context, 24.0f);
        Context context2 = getContext();
        context2.getClass();
        this.e.setPadding((int) avf.D(context2, str != null ? 56.0f : 24.0f), 0, D, 0);
        ImageView imageView = this.f;
        l18 l18Var = l18.b;
        bdt I = hag.I(cce.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        cce cceVar = (cce) qdcVar.C(I);
        Context context3 = imageView.getContext();
        context3.getClass();
        pce pceVar = new pce(context3);
        pceVar.c = str;
        pceVar.f(imageView);
        cceVar.d(pceVar.a());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public okf(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public okf(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ okf(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
