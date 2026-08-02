package ru.yandex.taxi.map_common.map.wrap;

import android.content.Context;
import android.util.Size;
import android.widget.FrameLayout;
import defpackage.mqg0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/map_common/map/wrap/MapObjectAccessibilityPlaceMarkView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/Size;", "size", "Lzy11;", "setSize", "(Landroid/util/Size;)V", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MapObjectAccessibilityPlaceMarkView extends FrameLayout {
    public MapObjectAccessibilityPlaceMarkView(Context context) {
        super(context);
        setBackgroundColor(context.getColor(mqg0.transparent));
    }

    public final void setSize(Size size) {
        setLayoutParams(new FrameLayout.LayoutParams(size.getWidth(), size.getHeight()));
    }
}
