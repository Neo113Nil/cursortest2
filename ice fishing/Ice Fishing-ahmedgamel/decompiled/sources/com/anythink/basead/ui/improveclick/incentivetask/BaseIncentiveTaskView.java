package com.anythink.basead.ui.improveclick.incentivetask;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.y;
import com.anythink.core.common.t.c;

/* loaded from: classes.dex */
public abstract class BaseIncentiveTaskView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    c f11992a;

    /* renamed from: b, reason: collision with root package name */
    protected a f11993b;

    public interface a {
        void a();

        void a(int i);

        void a(long j6);

        void b();
    }

    public BaseIncentiveTaskView(Context context) {
        this(context, null);
    }

    public abstract void a();

    public final void b() {
        c cVar = this.f11992a;
        if (cVar != null) {
            cVar.c();
        }
    }

    public void initSetting(w wVar, y yVar, long j6, a aVar) {
        this.f11993b = aVar;
        c cVar = new c(yVar.bu(), new Runnable() { // from class: com.anythink.basead.ui.improveclick.incentivetask.BaseIncentiveTaskView.1
            @Override // java.lang.Runnable
            public final void run() {
                a aVar2 = BaseIncentiveTaskView.this.f11993b;
                if (aVar2 != null) {
                    aVar2.a();
                }
            }
        }, true);
        this.f11992a = cVar;
        cVar.a();
        setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.improveclick.incentivetask.BaseIncentiveTaskView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    public void onPause() {
        c cVar = this.f11992a;
        if (cVar != null) {
            cVar.b();
        }
    }

    public void onResume() {
        c cVar = this.f11992a;
        if (cVar != null) {
            cVar.a();
        }
    }

    public void release() {
        b();
    }

    public BaseIncentiveTaskView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseIncentiveTaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
