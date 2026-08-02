package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.messaging.internal.view.stickers.StickersView;
import defpackage.e9h0;
import defpackage.qdu0;

/* loaded from: classes15.dex */
public final class qdu0 implements vji0 {
    public View a;
    public boolean b;
    public final y2t c;
    public final /* synthetic */ StickersView w;

    public qdu0(final StickersView stickersView) {
        this.w = stickersView;
        y2t y2tVar = new y2t(stickersView.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.yandex.messaging.internal.view.stickers.StickersView$TouchEventHandler$longPressDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent e) {
                View findChildViewUnder = StickersView.this.findChildViewUnder(e.getX(), e.getY());
                if (findChildViewUnder == null) {
                    return;
                }
                Object tag = findChildViewUnder.getTag(e9h0.tag_sticker_id);
                String str = tag instanceof String ? (String) tag : null;
                if (str == null) {
                    return;
                }
                Object tag2 = findChildViewUnder.getTag(e9h0.tag_sticker_text);
                String str2 = tag2 instanceof String ? (String) tag2 : null;
                if (str2 == null) {
                    str2 = "";
                }
                qdu0 qdu0Var = this;
                qdu0Var.a = findChildViewUnder;
                qdu0Var.b = true;
                StickersView.this.startPreview(str, str2);
            }
        }, null);
        y2tVar.a.setIsLongpressEnabled(true);
        this.c = y2tVar;
    }

    public final void a(MotionEvent motionEvent) {
        z83.h(null, this.b);
        int action = motionEvent.getAction();
        StickersView stickersView = this.w;
        if (action != 1) {
            if (action == 2) {
                View findChildViewUnder = stickersView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
                if (findChildViewUnder == null || findChildViewUnder.equals(this.a)) {
                    return;
                }
                Object tag = findChildViewUnder.getTag(e9h0.tag_sticker_id);
                String str = tag instanceof String ? (String) tag : null;
                if (str == null) {
                    return;
                }
                Object tag2 = findChildViewUnder.getTag(e9h0.tag_sticker_text);
                String str2 = tag2 instanceof String ? (String) tag2 : null;
                if (str2 == null) {
                    str2 = "";
                }
                this.a = findChildViewUnder;
                stickersView.previewViewChanged(str, str2);
                return;
            }
            if (action != 3 && action != 4) {
                return;
            }
        }
        stickersView.finishPreview();
        this.b = false;
        this.a = null;
    }

    @Override // defpackage.vji0
    public final boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        this.c.a.onTouchEvent(motionEvent);
        if (this.b) {
            a(motionEvent);
            if (!this.b) {
                return true;
            }
        }
        return this.b;
    }

    @Override // defpackage.vji0
    public final void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    @Override // defpackage.vji0
    public final void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.b) {
            a(motionEvent);
        } else {
            recyclerView.onTouchEvent(motionEvent);
        }
    }
}
