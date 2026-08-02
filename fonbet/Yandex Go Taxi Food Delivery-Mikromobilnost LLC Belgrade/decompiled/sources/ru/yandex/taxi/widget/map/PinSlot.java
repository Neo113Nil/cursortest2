package ru.yandex.taxi.widget.map;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import defpackage.a0c0;
import defpackage.b0c0;
import defpackage.c0c0;
import defpackage.dv31;
import defpackage.dzg0;
import defpackage.e0c0;
import defpackage.eja1;
import defpackage.f0c0;
import defpackage.i1c0;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.mzh0;
import defpackage.tje;
import defpackage.unr0;
import defpackage.up11;
import defpackage.usg0;
import defpackage.w511;
import defpackage.xzb0;
import defpackage.yzb0;
import defpackage.zzb0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 B2\u00020\u0001:\u0001CB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010)R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010+R\u0014\u00101\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010+R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00106R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\n0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006D"}, d2 = {"Lru/yandex/taxi/widget/map/PinSlot;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lf0c0;", ClidProvider.STATE, "Li1c0;", "style", "Lzy11;", "refreshStateValues", "(Lf0c0;Li1c0;)V", "typeface", "", "textDpSize", "spacing", "Landroid/text/TextPaint;", "createTextPaint", "(IFF)Landroid/text/TextPaint;", "render", "(Lf0c0;)V", "updatePinStyle", "(Li1c0;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "", RemoteBioParameters.TIME, "setCustomAnimationTime", "(J)V", "pinSize", CA20Status.STATUS_USER_I, "bgRadius", "F", "iconSize", "Landroid/graphics/drawable/Drawable;", "loadingIcon", "Landroid/graphics/drawable/Drawable;", "verticalOffsetOfDescription", "verticalOffsetOfTitle", "", "descriptionText", "Ljava/lang/String;", "titlePaint", "Landroid/text/TextPaint;", "descriptionPaint", "Landroid/graphics/Paint;", "bgPaint", "Landroid/graphics/Paint;", "pinStyle", "Li1c0;", "Ldv31;", "stateHolder", "Ldv31;", "customAnimTime", "J", "Companion", "xzb0", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PinSlot extends View {
    public static final int $stable = 8;
    public static final xzb0 Companion = new xzb0();
    private final Paint bgPaint;
    private final float bgRadius;
    private long customAnimTime;
    private final TextPaint descriptionPaint;
    private final String descriptionText;
    private final int iconSize;
    private final Drawable loadingIcon;
    private final int pinSize;
    private i1c0 pinStyle;
    private final dv31 stateHolder;
    private final TextPaint titlePaint;
    private final float verticalOffsetOfDescription;
    private final float verticalOffsetOfTitle;

    public PinSlot(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.pinSize = tje.r(usg0.pin_slot_size, getContext());
        this.bgRadius = tje.r(usg0.pin_slot_bg_radius, getContext());
        int r = tje.r(usg0.pin_slot_icon_size, getContext());
        this.iconSize = r;
        Drawable y = tje.y(dzg0.ic_spinner_24, getContext());
        this.loadingIcon = y;
        this.verticalOffsetOfDescription = tje.x(getContext(), 12.0f);
        this.verticalOffsetOfTitle = tje.x(getContext(), -1.0f);
        this.descriptionText = getContext().getString(kyh0.date_format_min);
        this.titlePaint = createTextPaint(3, 16.0f, -0.005f);
        this.descriptionPaint = createTextPaint(0, 11.0f, 0.01f);
        this.bgPaint = unr0.f(true);
        Companion.getClass();
        this.pinStyle = xzb0.a(context);
        yzb0 yzb0Var = new yzb0(this, this);
        this.stateHolder = yzb0Var;
        this.customAnimTime = -1L;
        y.setBounds(0, 0, r, r);
        updatePinStyle(this.pinStyle);
        yzb0Var.e();
    }

    private final TextPaint createTextPaint(int typeface, float textDpSize, float spacing) {
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        int[] iArr = up11.a;
        textPaint.setTypeface(eja1.w(typeface, 0));
        textPaint.setTextSize(tje.x(getContext(), textDpSize));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setFontFeatureSettings(getContext().getString(mzh0.go_default_font_settings));
        textPaint.setLetterSpacing(spacing);
        return textPaint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshStateValues(f0c0 state, i1c0 style) {
        int i;
        if (state instanceof c0c0) {
            c0c0 c0c0Var = (c0c0) state;
            c0c0Var.a().setTint(style.a);
            Drawable a = c0c0Var.a();
            int i2 = this.iconSize;
            a.setBounds(0, 0, i2, i2);
            i = style.b;
        } else if (state instanceof b0c0) {
            b0c0 b0c0Var = (b0c0) state;
            Drawable b = b0c0Var.b();
            int i3 = this.iconSize;
            b.setBounds(0, 0, i3, i3);
            i = b0c0Var.a();
        } else {
            if (!(state instanceof a0c0) && !(state instanceof zzb0) && !jl40.l(state, e0c0.a)) {
                w511.b();
                return;
            }
            i = style.b;
        }
        this.bgPaint.setColor(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00c3  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        boolean z;
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        float f = this.bgRadius;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, f, f, this.bgPaint);
        canvas.save();
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        f0c0 f0c0Var = (f0c0) this.stateHolder.d;
        if (f0c0Var instanceof a0c0) {
            canvas.drawText(this.descriptionText, 0.0f, this.verticalOffsetOfDescription, this.descriptionPaint);
            canvas.drawText(((a0c0) f0c0Var).a(), 0.0f, this.verticalOffsetOfTitle, this.titlePaint);
        } else if (f0c0Var instanceof c0c0) {
            float f2 = this.pinStyle.d;
            canvas.scale(f2, f2);
            float f3 = (-this.iconSize) / 2.0f;
            canvas.translate(f3, f3);
            ((c0c0) f0c0Var).a().draw(canvas);
        } else if (f0c0Var instanceof b0c0) {
            float f4 = this.pinStyle.d;
            canvas.scale(f4, f4);
            float f5 = (-this.iconSize) / 2.0f;
            canvas.translate(f5, f5);
            ((b0c0) f0c0Var).b().draw(canvas);
        } else {
            if (jl40.l(f0c0Var, e0c0.a)) {
                long j = this.customAnimTime;
                if (j < 0) {
                    j = AnimationUtils.currentAnimationTimeMillis();
                }
                canvas.rotate(((j % 1000) / 1000.0f) * 360.0f);
                float f6 = (-this.iconSize) / 2.0f;
                canvas.translate(f6, f6);
                this.loadingIcon.draw(canvas);
                z = true;
                canvas.restore();
                if (z) {
                    return;
                }
                postInvalidateOnAnimation();
                return;
            }
            if (!(f0c0Var instanceof zzb0)) {
                w511.b();
                return;
            }
        }
        z = false;
        canvas.restore();
        if (z) {
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        boolean z = this.stateHolder.d instanceof zzb0;
        int i = this.pinSize;
        if (z) {
            setMeasuredDimension(0, View.resolveSize(i, heightMeasureSpec));
        } else {
            setMeasuredDimension(View.resolveSize(i, widthMeasureSpec), View.resolveSize(this.pinSize, heightMeasureSpec));
        }
    }

    public final void render(f0c0 state) {
        this.stateHolder.g(state, false, false);
    }

    public final void setCustomAnimationTime(long time) {
        this.customAnimTime = time;
    }

    public final void updatePinStyle(i1c0 style) {
        this.pinStyle = style;
        this.descriptionPaint.setColor(style.a);
        this.titlePaint.setColor(this.pinStyle.a);
        this.loadingIcon.setTint(this.pinStyle.a);
        refreshStateValues((f0c0) this.stateHolder.d, style);
        invalidate();
    }

    public PinSlot(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public PinSlot(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ PinSlot(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
