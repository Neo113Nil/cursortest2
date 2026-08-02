package ru.yandex.taxi.masstransit.ui.zoom;

import android.content.Context;
import android.view.MotionEvent;
import androidx.core.view.b;
import com.yandex.go.design.view.GoImageView;
import defpackage.at11;
import defpackage.czo0;
import defpackage.hbp0;
import defpackage.l8x;
import defpackage.sls;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/yandex/taxi/masstransit/ui/zoom/ZoomButtonView;", "Lcom/yandex/go/design/view/GoImageView;", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "Lzy11;", "onClick", "onHold", "<init>", "(Landroid/content/Context;Lsls;Lsls;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lsls;", "Lhbp0;", "scopeDelegate", "Lhbp0;", "Ll8x;", "holdJob", "Ll8x;", "isClick", "Z", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ZoomButtonView extends GoImageView {
    private l8x holdJob;
    private boolean isClick;
    private final sls onClick;
    private final sls onHold;
    private final hbp0 scopeDelegate;

    public ZoomButtonView(Context context, sls slsVar, sls slsVar2) {
        super(context, null, 0, 6, null);
        this.onClick = slsVar;
        this.onHold = slsVar2;
        this.scopeDelegate = new hbp0(new czo0(14), "", null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b.p(this, new at11(2));
        this.scopeDelegate.a();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.scopeDelegate.b();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();
        if (action == 0) {
            this.isClick = true;
            this.holdJob = hbp0.e(this.scopeDelegate, null, null, new ZoomButtonView$onTouchEvent$1(this, null), 3);
            return true;
        }
        if (action != 1 && action != 3) {
            return super.onTouchEvent(event);
        }
        l8x l8xVar = this.holdJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.holdJob = null;
        if (this.isClick) {
            this.isClick = false;
            this.onClick.invoke();
        }
        return true;
    }
}
