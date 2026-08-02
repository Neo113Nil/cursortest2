package ru.yandex.taxi.design;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u001a\u0002\b\n¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/design/ListHeaderComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/jvm/JvmOverloads;", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public class ListHeaderComponent extends ListItemComponent {
    public /* synthetic */ ListHeaderComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? xng0.listHeaderComponentStyle : i);
    }

    public ListHeaderComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ListHeaderComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        androidx.core.view.b.q(this, true);
    }

    public ListHeaderComponent(Context context) {
        this(context, null, 0, 6, null);
    }
}
