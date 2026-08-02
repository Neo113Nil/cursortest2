package ru.yandex.taxi.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import defpackage.c4i0;
import defpackage.iog0;
import defpackage.ndh0;
import defpackage.nwy0;
import defpackage.qje;
import defpackage.wuj0;
import defpackage.xng0;
import defpackage.yvk0;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoEditText;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000b2\b\b\u0001\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000b2\b\b\u0001\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u00188\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017¨\u0006\u001f"}, d2 = {"Lru/yandex/taxi/widget/RobotoEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "init", "(Landroid/util/AttributeSet;I)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "attrId", "setTextColorAttr", "(I)V", "setHintColorAttr", "textColorStyle", CA20Status.STATUS_USER_I, "", "textColorAttr", "Ljava/lang/String;", "textColorTag", "hintColorStyle", "hintColorAttr", "hintColorTag", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public class RobotoEditText extends AppCompatEditText implements nwy0 {
    private final String hintColorAttr;
    private final int hintColorStyle;
    private final int hintColorTag;
    private final String textColorAttr;
    private final int textColorStyle;
    private final int textColorTag;

    public RobotoEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.textColorStyle = c4i0.RobotoEditText_textColor;
        this.textColorAttr = "textColor";
        this.textColorTag = ndh0.roboto_edit_text_color_id;
        this.hintColorStyle = c4i0.RobotoEditText_textColorHint;
        this.hintColorAttr = "textColorHint";
        this.hintColorTag = ndh0.roboto_edit_hint_color_id;
        init(attributeSet, i);
    }

    private final void init(AttributeSet attrs, int defStyleAttr) {
        final int i = 0;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attrs, c4i0.RobotoEditText, defStyleAttr, 0);
        try {
            yvk0 yvk0Var = RobotoTextView.Companion;
            Context context = getContext();
            yvk0Var.getClass();
            yvk0.b(this, context, attrs, defStyleAttr);
            if (attrs == null) {
                setTextColorAttr(xng0.textMain);
                setHintColorAttr(xng0.textMinor);
            } else {
                final int i2 = 1;
                qje.S(attrs, obtainStyledAttributes, this.textColorAttr, this.textColorStyle, xng0.textMain, new Consumer(this) { // from class: vvk0
                    public final /* synthetic */ RobotoEditText b;

                    {
                        this.b = this;
                    }

                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i3 = i;
                        RobotoEditText robotoEditText = this.b;
                        Integer num = (Integer) obj;
                        switch (i3) {
                            case 0:
                                robotoEditText.setTextColorAttr(num.intValue());
                                break;
                            case 1:
                                RobotoEditText.init$lambda$0(robotoEditText, num);
                                break;
                            case 2:
                                robotoEditText.setHintColorAttr(num.intValue());
                                break;
                            default:
                                RobotoEditText.init$lambda$1(robotoEditText, num);
                                break;
                        }
                    }
                }, new Consumer(this) { // from class: vvk0
                    public final /* synthetic */ RobotoEditText b;

                    {
                        this.b = this;
                    }

                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i3 = i2;
                        RobotoEditText robotoEditText = this.b;
                        Integer num = (Integer) obj;
                        switch (i3) {
                            case 0:
                                robotoEditText.setTextColorAttr(num.intValue());
                                break;
                            case 1:
                                RobotoEditText.init$lambda$0(robotoEditText, num);
                                break;
                            case 2:
                                robotoEditText.setHintColorAttr(num.intValue());
                                break;
                            default:
                                RobotoEditText.init$lambda$1(robotoEditText, num);
                                break;
                        }
                    }
                });
                String str = this.hintColorAttr;
                int i3 = this.hintColorStyle;
                int i4 = xng0.textMinor;
                final int i5 = 2;
                Consumer consumer = new Consumer(this) { // from class: vvk0
                    public final /* synthetic */ RobotoEditText b;

                    {
                        this.b = this;
                    }

                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i32 = i5;
                        RobotoEditText robotoEditText = this.b;
                        Integer num = (Integer) obj;
                        switch (i32) {
                            case 0:
                                robotoEditText.setTextColorAttr(num.intValue());
                                break;
                            case 1:
                                RobotoEditText.init$lambda$0(robotoEditText, num);
                                break;
                            case 2:
                                robotoEditText.setHintColorAttr(num.intValue());
                                break;
                            default:
                                RobotoEditText.init$lambda$1(robotoEditText, num);
                                break;
                        }
                    }
                };
                final int i6 = 3;
                qje.S(attrs, obtainStyledAttributes, str, i3, i4, consumer, new Consumer(this) { // from class: vvk0
                    public final /* synthetic */ RobotoEditText b;

                    {
                        this.b = this;
                    }

                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i32 = i6;
                        RobotoEditText robotoEditText = this.b;
                        Integer num = (Integer) obj;
                        switch (i32) {
                            case 0:
                                robotoEditText.setTextColorAttr(num.intValue());
                                break;
                            case 1:
                                RobotoEditText.init$lambda$0(robotoEditText, num);
                                break;
                            case 2:
                                robotoEditText.setHintColorAttr(num.intValue());
                                break;
                            default:
                                RobotoEditText.init$lambda$1(robotoEditText, num);
                                break;
                        }
                    }
                });
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$0(RobotoEditText robotoEditText, Integer num) {
        robotoEditText.setTextColor(wuj0.a(robotoEditText.getResources(), num.intValue(), robotoEditText.getContext().getTheme()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$1(RobotoEditText robotoEditText, Integer num) {
        robotoEditText.setTextColor(wuj0.a(robotoEditText.getResources(), num.intValue(), robotoEditText.getContext().getTheme()));
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        Object tag = getTag(this.textColorTag);
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num != null) {
            setTextColor(qje.t(num.intValue(), getContext()));
        }
        Object tag2 = getTag(this.hintColorTag);
        Integer num2 = tag2 instanceof Integer ? (Integer) tag2 : null;
        if (num2 != null) {
            setHintTextColor(qje.t(num2.intValue(), getContext()));
        }
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final void setHintColorAttr(int attrId) {
        setTag(this.hintColorTag, Integer.valueOf(attrId));
        setHintTextColor(qje.t(attrId, getContext()));
    }

    public final void setTextColorAttr(int attrId) {
        setTag(this.textColorTag, Integer.valueOf(attrId));
        setTextColor(qje.t(attrId, getContext()));
    }

    public RobotoEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public RobotoEditText(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ RobotoEditText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? iog0.editTextStyle : i);
    }
}
