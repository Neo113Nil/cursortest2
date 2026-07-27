package l;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import k.InterfaceC4616c;

/* loaded from: classes.dex */
public final class q extends FrameLayout implements InterfaceC4616c {

    /* renamed from: n, reason: collision with root package name */
    public final CollapsibleActionView f38861n;

    /* JADX WARN: Multi-variable type inference failed */
    public q(View view) {
        super(view.getContext());
        this.f38861n = (CollapsibleActionView) view;
        addView(view);
    }
}
