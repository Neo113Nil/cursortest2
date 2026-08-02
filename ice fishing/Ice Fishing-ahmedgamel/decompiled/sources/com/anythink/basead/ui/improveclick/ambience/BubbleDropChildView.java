package com.anythink.basead.ui.improveclick.ambience;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.anythink.basead.ui.animplayerview.redpacket.RedPacketView;

/* loaded from: classes.dex */
public class BubbleDropChildView extends RedPacketView {

    /* renamed from: e, reason: collision with root package name */
    a f11906e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f11907f;

    public interface a {
        void a();
    }

    public BubbleDropChildView(Context context) {
        super(context);
    }

    private boolean a(MotionEvent motionEvent) {
        float x9 = motionEvent.getX();
        float y7 = motionEvent.getY();
        for (com.anythink.basead.ui.animplayerview.redpacket.a aVar : this.f11311c) {
            float f2 = aVar.f11323a;
            if (f2 <= x9 && x9 <= f2 + aVar.b()) {
                float f9 = aVar.f11324b;
                if (f9 <= y7 && y7 <= f9 + aVar.a()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void initSetting(a aVar) {
        this.f11309a = 0.25d;
        this.f11310b = 0.33000001311302185d;
        this.f11907f = false;
        this.f11906e = aVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            float x9 = motionEvent.getX();
            float y7 = motionEvent.getY();
            for (com.anythink.basead.ui.animplayerview.redpacket.a aVar2 : this.f11311c) {
                float f2 = aVar2.f11323a;
                if (f2 <= x9 && x9 <= f2 + aVar2.b()) {
                    float f9 = aVar2.f11324b;
                    if (f9 <= y7 && y7 <= f9 + aVar2.a()) {
                        this.f11907f = true;
                        return true;
                    }
                }
            }
        } else if (action == 1) {
            if (this.f11907f && (aVar = this.f11906e) != null) {
                aVar.a();
            }
            this.f11907f = false;
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
