package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class ukf extends mkf {
    public final Drawable d;
    public final TextView e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ukf(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(getContext()).inflate(R.layout.rup_dialog_settings_lang_view, (ViewGroup) this, true).getClass();
        LayerDrawable layerDrawable = (LayerDrawable) avf.I(context, R.drawable.rup_background_oval_accent_border_24);
        setBackground(layerDrawable);
        Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.rup_item_oval_border_accent);
        findDrawableByLayerId.getClass();
        this.d = findDrawableByLayerId;
        View findViewById = findViewById(R.id.rup_settings_lang_name_text_view);
        findViewById.getClass();
        this.e = (TextView) findViewById;
        findDrawableByLayerId.setAlpha(0);
    }

    @Override // defpackage.mkf
    public final String a() {
        return getName();
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ukf(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ukf(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ ukf(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
