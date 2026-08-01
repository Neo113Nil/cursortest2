package com.anythink.basead.ui.improveclick.ambience;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.anythink.basead.ui.animplayerview.redpacket.RedPacketView;

/* loaded from: classes.dex */
public class BubbleDropChildView extends RedPacketView {

    /* renamed from: e, reason: collision with root package name */
    a f11120e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f11121f;

    public interface a {
        void a();
    }

    public BubbleDropChildView(Context context) {
        super(context);
    }

    private boolean a(MotionEvent motionEvent) {
        float x9 = motionEvent.getX();
        float y7 = motionEvent.getY();
        for (com.anythink.basead.ui.animplayerview.redpacket.a aVar : this.f10525c) {
            float f3 = aVar.f10537a;
            if (f3 <= x9 && x9 <= f3 + aVar.b()) {
                float f9 = aVar.f10538b;
                if (f9 <= y7 && y7 <= f9 + aVar.a()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void initSetting(a aVar) {
        this.f10523a = 0.25d;
        this.f10524b = 0.33000001311302185d;
        this.f11121f = false;
        this.f11120e = aVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            float x9 = motionEvent.getX();
            float y7 = motionEvent.getY();
            for (com.anythink.basead.ui.animplayerview.redpacket.a aVar2 : this.f10525c) {
                float f3 = aVar2.f10537a;
                if (f3 <= x9 && x9 <= f3 + aVar2.b()) {
                    float f9 = aVar2.f10538b;
                    if (f9 <= y7 && y7 <= f9 + aVar2.a()) {
                        this.f11121f = true;
                        return true;
                    }
                }
            }
        } else if (action == 1) {
            if (this.f11121f && (aVar = this.f11120e) != null) {
                aVar.a();
            }
            this.f11121f = false;
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
