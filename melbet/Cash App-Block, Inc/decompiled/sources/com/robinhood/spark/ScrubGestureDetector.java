package com.robinhood.spark;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.stats.zza;
import com.google.mlkit.vision.common.zzb;
import com.robinhood.spark.SparkView;

/* loaded from: classes4.dex */
public final class ScrubGestureDetector implements View.OnTouchListener {
    public float downX;
    public float downY;
    public boolean enabled;
    public final Handler handler;
    public final zza longPressRunnable = new zza(this, 16);
    public final SparkView scrubListener;
    public final float touchSlop;

    public ScrubGestureDetector(SparkView sparkView, Handler handler, float f) {
        this.scrubListener = sparkView;
        this.handler = handler;
        this.touchSlop = f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r2 != 3) goto L13;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.enabled) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int actionMasked = motionEvent.getActionMasked();
            zza zzaVar = this.longPressRunnable;
            Handler handler = this.handler;
            if (actionMasked == 0) {
                this.downX = x;
                this.downY = y;
                handler.postDelayed(zzaVar, 250L);
                return true;
            }
            SparkView sparkView = this.scrubListener;
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (motionEvent.getEventTime() - motionEvent.getDownTime() >= 250.0f) {
                        handler.removeCallbacks(zzaVar);
                        sparkView.onScrubbed(x, y);
                        return true;
                    }
                    float f = x - this.downX;
                    float f2 = y - this.downY;
                    float f3 = this.touchSlop;
                    if (f < f3 && f2 < f3) {
                        return true;
                    }
                    handler.removeCallbacks(zzaVar);
                    return false;
                }
            }
            handler.removeCallbacks(zzaVar);
            SparkView.OnScrubListener onScrubListener = sparkView.scrubListener;
            if (onScrubListener != null) {
                ((zzb) onScrubListener).onScrubbed(null, null, null);
            }
            sparkView.lastScrubbedX = -1.0f;
            sparkView.setScrubLine(null);
            return true;
        }
        return false;
    }
}
