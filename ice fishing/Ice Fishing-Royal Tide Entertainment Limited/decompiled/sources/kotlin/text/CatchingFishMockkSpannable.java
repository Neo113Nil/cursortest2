package kotlin.text;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class CatchingFishMockkSpannable implements View.OnTouchListener {
    public final int CatchingFishDaggerWebsocket;
    public final Dialog CatchingFishReduxKtor;
    public final int CatchingFishViewModelScope;
    public final int CatchingFishWorkManager;

    public CatchingFishMockkSpannable(Dialog dialog, Rect rect) {
        this.CatchingFishReduxKtor = dialog;
        this.CatchingFishDaggerWebsocket = rect.left;
        this.CatchingFishWorkManager = rect.top;
        this.CatchingFishViewModelScope = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.CatchingFishDaggerWebsocket;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.CatchingFishWorkManager, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.CatchingFishViewModelScope;
            obtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.CatchingFishReduxKtor.onTouchEvent(obtain);
    }
}
