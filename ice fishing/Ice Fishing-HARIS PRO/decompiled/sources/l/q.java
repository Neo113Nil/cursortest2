package l;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import k.InterfaceC0178b;

/* loaded from: classes.dex */
public final class q extends FrameLayout implements InterfaceC0178b {

    /* renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f3762a;

    /* JADX WARN: Multi-variable type inference failed */
    public q(View view) {
        super(view.getContext());
        this.f3762a = (CollapsibleActionView) view;
        addView(view);
    }
}
