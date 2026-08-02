package ru.yandex.taxi.widget;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a\u0002\b\b¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bÊ\u0001\u0010\b\r\u0012\f\b\u000e\u0012\b\b\fJ\u0004\b\b(\u000f¨\u0006\f"}, d2 = {"Lru/yandex/taxi/widget/ContentModalView;", "Lru/yandex/taxi/widget/SlideableModalView;", "content", "Landroid/view/View;", "initialState", "", "<init>", "(Landroid/view/View;I)V", "Lkotlin/jvm/JvmOverloads;", "cardContentViewLayoutRes", "getCardContentViewLayoutRes", "()I", "modals", "Landroid/annotation/SuppressLint;", "value", "WrongConstant"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public class ContentModalView extends SlideableModalView {
    public /* synthetic */ ContentModalView(View view, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, (i2 & 2) != 0 ? -1 : i);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        throw new UnsupportedOperationException();
    }

    public ContentModalView(View view) {
        this(view, 0, 2, null);
    }

    public ContentModalView(View view, int i) {
        super(view, Integer.valueOf(i));
    }
}
