package ru.yandex.taxi.preorder.source.routeoverlay;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.eja1;
import defpackage.j3h0;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.tje;
import defpackage.up11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/preorder/source/routeoverlay/TollRouteBubbleView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "initView", "()V", "", "getLeftOpticalBound", "()F", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TollRouteBubbleView extends AppCompatTextView {
    public /* synthetic */ TollRouteBubbleView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void initView() {
        setTextColor(getContext().getColor(mqg0.component_black));
        setPadding((int) tje.w(6, getContext()), (int) tje.w(2, getContext()), (int) tje.w(8, getContext()), 0);
        setMaxWidth((int) tje.w(PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC, getContext()));
        TextPaint paint = getPaint();
        int[] iArr = up11.a;
        paint.setTypeface(eja1.w(3, 0));
        setTextSize(0, getResources().getDimension(mrg0.component_text_size_caption));
        setBackgroundResource(j3h0.bg_toll_road_label);
    }

    public final float getLeftOpticalBound() {
        return tje.w(16, getContext());
    }

    public TollRouteBubbleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public TollRouteBubbleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView();
    }

    public TollRouteBubbleView(Context context) {
        this(context, null, 0, 6, null);
    }
}
