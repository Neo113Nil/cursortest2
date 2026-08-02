package ru.yandex.taxi.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.af70;
import defpackage.agh0;
import defpackage.b64;
import defpackage.ejj0;
import defpackage.f1h0;
import defpackage.ijj0;
import defpackage.in60;
import defpackage.jl40;
import defpackage.jmw0;
import defpackage.kcz0;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.qv21;
import defpackage.scc;
import defpackage.sls;
import defpackage.tf70;
import defpackage.usg0;
import defpackage.vng;
import defpackage.xng0;
import defpackage.xyz0;
import defpackage.zrh0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.requirements.interactor.x;
import ru.yandex.taxi.requirements.ui.selector.usual.UsualOptionSelectorView;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.utils.TouchDelegateComposite;
import ru.yandex.taxi.widget.NumberSpinner;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0017B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\b\b\u0001\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0016\u0010&\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\u0011\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010-\u001a\u0004\u0018\u00010*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0016\u0010/\u001a\u0004\u0018\u00010*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010,¨\u00060"}, d2 = {"Lru/yandex/taxi/widget/NumberSpinner;", "Landroid/widget/LinearLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "updateState", "()V", "value", "setValue", "(I)V", "maxValue", "setMaxValue", "Landroid/view/ViewGroup;", "parentView", "enlargeTouchArea", "(Landroid/view/ViewGroup;)V", "Lin60;", "listener", "setOnValueChangedListener", "(Lin60;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lru/yandex/taxi/widget/RobotoTextView;", "valueView", "Lru/yandex/taxi/widget/RobotoTextView;", "Landroidx/appcompat/widget/AppCompatImageView;", "decreaseView", "Landroidx/appcompat/widget/AppCompatImageView;", "increaseView", "currentValue", CA20Status.STATUS_USER_I, "valueChangedListener", "Lin60;", "Landroid/graphics/drawable/Drawable;", "getMinusDrawable", "()Landroid/graphics/drawable/Drawable;", "minusDrawable", "getPlusDrawable", "plusDrawable", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NumberSpinner extends LinearLayout implements nwy0 {
    public static final int $stable = 8;
    private int currentValue;
    private final AppCompatImageView decreaseView;
    private final AppCompatImageView increaseView;
    private int maxValue;
    private in60 valueChangedListener;
    private final RobotoTextView valueView;

    public NumberSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        final int i2 = 1;
        LayoutInflater.from(context).inflate(zrh0.number_spinner_view, (ViewGroup) this, true);
        RobotoTextView robotoTextView = (RobotoTextView) findViewById(agh0.number_spinner_value);
        this.valueView = robotoTextView;
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(agh0.number_spinner_decrease);
        this.decreaseView = appCompatImageView;
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) findViewById(agh0.number_spinner_increase);
        this.increaseView = appCompatImageView2;
        final int i3 = 0;
        ru.yandex.taxi.design.utils.c.z(new sls(this) { // from class: hn60
            public final /* synthetic */ NumberSpinner b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 _init_$lambda$0;
                zy11 _init_$lambda$1;
                int i4 = i3;
                NumberSpinner numberSpinner = this.b;
                switch (i4) {
                    case 0:
                        _init_$lambda$0 = NumberSpinner._init_$lambda$0(numberSpinner);
                        return _init_$lambda$0;
                    default:
                        _init_$lambda$1 = NumberSpinner._init_$lambda$1(numberSpinner);
                        return _init_$lambda$1;
                }
            }
        }, appCompatImageView2);
        ru.yandex.taxi.design.utils.c.z(new sls(this) { // from class: hn60
            public final /* synthetic */ NumberSpinner b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 _init_$lambda$0;
                zy11 _init_$lambda$1;
                int i4 = i2;
                NumberSpinner numberSpinner = this.b;
                switch (i4) {
                    case 0:
                        _init_$lambda$0 = NumberSpinner._init_$lambda$0(numberSpinner);
                        return _init_$lambda$0;
                    default:
                        _init_$lambda$1 = NumberSpinner._init_$lambda$1(numberSpinner);
                        return _init_$lambda$1;
                }
            }
        }, appCompatImageView);
        appCompatImageView.setImageDrawable(getMinusDrawable());
        appCompatImageView2.setImageDrawable(getPlusDrawable());
        robotoTextView.setTextColorAttr(xng0.textMain);
        updateState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$0(NumberSpinner numberSpinner) {
        int i = numberSpinner.currentValue;
        if (i < numberSpinner.maxValue) {
            numberSpinner.setValue(i + 1);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$1(NumberSpinner numberSpinner) {
        int i = numberSpinner.currentValue;
        if (i > 0) {
            numberSpinner.setValue(i - 1);
        }
        return zy11.a;
    }

    private final Drawable getMinusDrawable() {
        return vng.t(f1h0.ic_minus_24_bg_main, getContext());
    }

    private final Drawable getPlusDrawable() {
        return vng.t(f1h0.ic_plus_24_bg_main, getContext());
    }

    private final void updateState() {
        this.decreaseView.setEnabled(this.currentValue > 0);
        this.decreaseView.setClickable(this.currentValue > 0);
        this.increaseView.setEnabled(this.currentValue < this.maxValue);
        this.increaseView.setClickable(this.currentValue < this.maxValue);
        this.valueView.setText(String.valueOf(this.currentValue));
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        this.decreaseView.setImageDrawable(getMinusDrawable());
        this.increaseView.setImageDrawable(getPlusDrawable());
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final void enlargeTouchArea(ViewGroup parentView) {
        xyz0 xyz0Var = TouchDelegateComposite.Companion;
        int i = usg0.number_spinner_button_additional_click_area;
        View[] viewArr = {this.decreaseView, this.increaseView};
        xyz0Var.getClass();
        xyz0.b(parentView, i, viewArr);
    }

    public final void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
        if (this.currentValue > maxValue) {
            setValue(maxValue);
        } else {
            updateState();
        }
    }

    public final void setOnValueChangedListener(in60 listener) {
        this.valueChangedListener = listener;
    }

    public final void setValue(int value) {
        qv21 qv21Var;
        tf70 tf70Var;
        String str;
        if (value < 0 || value > this.maxValue) {
            ny61.g(b64.d(value, this.maxValue, "Value ", " is out of range [0;", "]"));
            return;
        }
        int i = this.currentValue;
        if (i != value) {
            this.currentValue = value;
            updateState();
            in60 in60Var = this.valueChangedListener;
            if (in60Var != null) {
                kcz0 kcz0Var = (kcz0) in60Var;
                UsualOptionSelectorView usualOptionSelectorView = (UsualOptionSelectorView) kcz0Var.a;
                qv21Var = usualOptionSelectorView.presenter;
                int indexOfChild = usualOptionSelectorView.indexOfChild((ListItemComponent) kcz0Var.b);
                x xVar = qv21Var.z;
                int i2 = 0;
                qv21Var.Kg(indexOfChild, i > 0);
                jmw0 jmw0Var = (jmw0) qv21Var.D.getValue();
                if (jmw0Var == null || (tf70Var = (tf70) kotlin.collections.a.S(indexOfChild, qv21Var.E)) == null || (str = tf70Var.a) == null || jmw0Var.p(str) == null) {
                    return;
                }
                List c = xVar.c(jmw0Var);
                ArrayList arrayList = new ArrayList();
                Iterator it = c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ejj0 ejj0Var = (ejj0) it.next();
                    String str2 = jl40.l(ejj0Var.a, str) ? null : ejj0Var.a;
                    if (str2 != null) {
                        arrayList.add(str2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                int size = c.size() - arrayList2.size();
                for (int i3 = 0; i3 < value; i3++) {
                    arrayList2.add(str);
                }
                qv21Var.y.getClass();
                ArrayList c2 = ijj0.c(arrayList2, jmw0Var, false);
                xVar.a(jmw0Var, c2);
                if (!c2.isEmpty()) {
                    Iterator it2 = c2.iterator();
                    while (it2.hasNext()) {
                        if (jl40.l(((ejj0) it2.next()).a, str) && (i2 = i2 + 1) < 0) {
                            scc.l();
                            throw null;
                        }
                    }
                }
                af70 af70Var = qv21Var.F;
                if (af70Var == null) {
                    return;
                }
                af70Var.d(size, i2, str);
            }
        }
    }

    public NumberSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public NumberSpinner(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ NumberSpinner(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
