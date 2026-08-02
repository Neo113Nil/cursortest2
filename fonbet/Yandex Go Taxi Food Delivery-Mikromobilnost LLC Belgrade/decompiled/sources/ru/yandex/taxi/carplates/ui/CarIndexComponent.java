package ru.yandex.taxi.carplates.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.a78;
import defpackage.avc0;
import defpackage.bvc0;
import defpackage.t58;
import defpackage.tp11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.carplates.experiments.CarPlateAppearanceExperiment;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u000eJ!\u0010\u0015\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001f¨\u0006 "}, d2 = {"Lru/yandex/taxi/carplates/ui/CarIndexComponent;", "Lru/yandex/taxi/widget/RobotoTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lbvc0;", Constants.KEY_DATA, "Lzy11;", "updateCarNumber", "(Lbvc0;)V", "textColor", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "applyColors", "(Lbvc0;Ljava/lang/Integer;Ljava/lang/Integer;)Lbvc0;", "platesData", "setData", "setColors", "(II)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lt58;", "carNumberFormatter", "Lt58;", "Lbvc0;", "Ljava/lang/Integer;", "carplates"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CarIndexComponent extends RobotoTextView {
    private Integer backgroundColor;
    private final t58 carNumberFormatter;
    private bvc0 platesData;
    private Integer textColor;

    public /* synthetic */ CarIndexComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final bvc0 applyColors(bvc0 data, Integer textColor, Integer backgroundColor) {
        a78 a78Var = data.c;
        if (a78Var == null) {
            return data;
        }
        a78 a78Var2 = new a78(backgroundColor != null ? backgroundColor.intValue() : a78Var.a, textColor != null ? textColor.intValue() : a78Var.b, a78Var.c);
        avc0 avc0Var = new avc0();
        avc0Var.a = data.a;
        avc0Var.b = data.b;
        avc0Var.d = data.d;
        avc0Var.e = data.e;
        avc0Var.c = a78Var2;
        return new bvc0(avc0Var);
    }

    private final void updateCarNumber(bvc0 data) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        t58 t58Var = this.carNumberFormatter;
        CarPlateAppearanceExperiment.CarPlateUsage carPlateUsage = CarPlateAppearanceExperiment.CarPlateUsage.ORDER_LIST_ITEM;
        List list = data.d;
        t58Var.a(data, spannableStringBuilder, list != null ? list.contains(carPlateUsage) : false);
        setText(spannableStringBuilder);
        this.carNumberFormatter.c = getTextSize();
        tp11.b(0, this);
    }

    @Override // ru.yandex.taxi.widget.RobotoTextView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        bvc0 bvc0Var = this.platesData;
        if (bvc0Var != null) {
            updateCarNumber(applyColors(bvc0Var, this.textColor, this.backgroundColor));
        }
    }

    public final void setColors(int textColor, int backgroundColor) {
        bvc0 applyColors;
        this.textColor = Integer.valueOf(textColor);
        this.backgroundColor = Integer.valueOf(backgroundColor);
        bvc0 bvc0Var = this.platesData;
        if (bvc0Var == null || (applyColors = applyColors(bvc0Var, Integer.valueOf(textColor), Integer.valueOf(backgroundColor))) == null) {
            return;
        }
        updateCarNumber(applyColors);
    }

    public final void setData(bvc0 platesData) {
        this.platesData = platesData;
        updateCarNumber(applyColors(platesData, this.textColor, this.backgroundColor));
    }

    public CarIndexComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CarIndexComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.carNumberFormatter = new t58(context);
    }

    public CarIndexComponent(Context context) {
        this(context, null, 0, 6, null);
    }
}
