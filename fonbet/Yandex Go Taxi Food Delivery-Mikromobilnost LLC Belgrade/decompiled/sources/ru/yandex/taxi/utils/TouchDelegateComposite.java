package ru.yandex.taxi.utils;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import defpackage.xyz0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/utils/TouchDelegateComposite;", "Landroid/view/TouchDelegate;", "Landroid/view/View;", "someView", "<init>", "(Landroid/view/View;)V", "delegate", "Lzy11;", "addDelegate", "(Landroid/view/TouchDelegate;)V", "", "getDelegates", "()Ljava/util/List;", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "", "delegates", "Ljava/util/List;", "Companion", "xyz0", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TouchDelegateComposite extends TouchDelegate {
    public static final int $stable = 8;
    public static final xyz0 Companion = new xyz0();
    private static final Rect emptyRect = new Rect();
    private final List<TouchDelegate> delegates;

    public TouchDelegateComposite(View view) {
        super(emptyRect, view);
        this.delegates = new ArrayList();
    }

    public static final void enlargeTouchArea(ViewGroup viewGroup, int i, View... viewArr) {
        Companion.getClass();
        xyz0.b(viewGroup, i, viewArr);
    }

    public final void addDelegate(TouchDelegate delegate) {
        if (delegate != null) {
            this.delegates.add(delegate);
        }
    }

    public final List<TouchDelegate> getDelegates() {
        return this.delegates;
    }

    @Override // android.view.TouchDelegate
    public boolean onTouchEvent(MotionEvent event) {
        boolean z;
        float x = event.getX();
        float y = event.getY();
        while (true) {
            for (TouchDelegate touchDelegate : this.delegates) {
                event.setLocation(x, y);
                z = touchDelegate.onTouchEvent(event) || z;
            }
            return z;
        }
    }
}
