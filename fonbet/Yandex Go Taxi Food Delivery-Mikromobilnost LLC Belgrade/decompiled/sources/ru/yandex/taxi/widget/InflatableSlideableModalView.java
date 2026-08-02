package ru.yandex.taxi.widget;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.pwf0;
import defpackage.zxf0;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001:\u0001\u0015B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0012\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/widget/InflatableSlideableModalView;", "Lru/yandex/taxi/widget/SlideableModalView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "onBackPressed", "()V", "onTouchOutside", "onArrowClick", "onSlideOut", "Lru/yandex/taxi/widget/InflatableSlideableModalView$a;", "onCloseByUserListener", "setOnCloseByUserListener", "(Lru/yandex/taxi/widget/InflatableSlideableModalView$a;)V", "Lru/yandex/taxi/widget/InflatableSlideableModalView$a;", "a", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class InflatableSlideableModalView extends SlideableModalView {
    public static final int $stable = 8;
    private a onCloseByUserListener;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lru/yandex/taxi/widget/InflatableSlideableModalView$a;", "Lzxf0;", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface a extends zxf0 {
        void k6();

        boolean onBackPressed();

        void y8();
    }

    public InflatableSlideableModalView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.onCloseByUserListener = (a) ((zxf0) pwf0.c(a.class));
        setDismissOnTouchOutside(false);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onArrowClick() {
        this.onCloseByUserListener.y8();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        if (this.onCloseByUserListener.onBackPressed()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
        this.onCloseByUserListener.k6();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
        super.onTouchOutside();
        this.onCloseByUserListener.y8();
    }

    public final void setOnCloseByUserListener(a onCloseByUserListener) {
        Object obj;
        if (onCloseByUserListener == null) {
            obj = (zxf0) pwf0.c(a.class);
        } else {
            ConcurrentHashMap concurrentHashMap = pwf0.a;
            obj = onCloseByUserListener;
        }
        this.onCloseByUserListener = (a) obj;
    }

    public InflatableSlideableModalView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public InflatableSlideableModalView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ InflatableSlideableModalView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
