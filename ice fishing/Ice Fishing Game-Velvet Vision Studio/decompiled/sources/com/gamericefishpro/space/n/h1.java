package com.gamericefishpro.space.n;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 implements View.OnTouchListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h1(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                i1 i1Var = (i1) this.e;
                e1 e1Var = i1Var.G;
                Handler handler = i1Var.K;
                w wVar = i1Var.O;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && wVar != null && wVar.isShowing() && x >= 0 && x < wVar.getWidth() && y >= 0 && y < wVar.getHeight()) {
                    handler.postDelayed(e1Var, 250L);
                    return false;
                }
                if (action != 1) {
                    return false;
                }
                handler.removeCallbacks(e1Var);
                return false;
            default:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) this.e).onTouchEvent(motionEvent);
                }
                return false;
        }
    }
}
