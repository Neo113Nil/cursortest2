package com.anythink.basead.ui.improveclick.ambience;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.anythink.basead.ui.animplayerview.redpacket.RedPacketView;

/* loaded from: classes.dex */
public class BubbleDropChildView extends RedPacketView {

    /* renamed from: e, reason: collision with root package name */
    a f11277e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f11278f;

    public interface a {
        void a();
    }

    public BubbleDropChildView(Context context) {
        super(context);
    }

    private boolean a(MotionEvent motionEvent) {
        float x3 = motionEvent.getX();
        float y6 = motionEvent.getY();
        for (com.anythink.basead.ui.animplayerview.redpacket.a aVar : this.f10682c) {
            float f6 = aVar.f10694a;
            if (f6 <= x3 && x3 <= f6 + aVar.b()) {
                float f9 = aVar.f10695b;
                if (f9 <= y6 && y6 <= f9 + aVar.a()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void initSetting(a aVar) {
        this.f10680a = 0.25d;
        this.f10681b = 0.33000001311302185d;
        this.f11278f = false;
        this.f11277e = aVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            float x3 = motionEvent.getX();
            float y6 = motionEvent.getY();
            for (com.anythink.basead.ui.animplayerview.redpacket.a aVar2 : this.f10682c) {
                float f6 = aVar2.f10694a;
                if (f6 <= x3 && x3 <= f6 + aVar2.b()) {
                    float f9 = aVar2.f10695b;
                    if (f9 <= y6 && y6 <= f9 + aVar2.a()) {
                        this.f11278f = true;
                        return true;
                    }
                }
            }
        } else if (action == 1) {
            if (this.f11278f && (aVar = this.f11277e) != null) {
                aVar.a();
            }
            this.f11278f = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public BubbleDropChildView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BubbleDropChildView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
