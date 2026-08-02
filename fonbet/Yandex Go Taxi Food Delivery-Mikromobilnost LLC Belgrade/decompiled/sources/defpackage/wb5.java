package defpackage;

import android.view.View;
import com.yandex.messaging.internal.view.timeline.e;

/* loaded from: classes15.dex */
public final class wb5 implements tv10 {
    public final /* synthetic */ View a;
    public final /* synthetic */ e b;

    public wb5(View view, e eVar) {
        this.a = view;
        this.b = eVar;
    }

    @Override // defpackage.tv10
    public final void onExitSelectionMode() {
        this.a.setSelected(false);
    }

    @Override // defpackage.tv10
    public final void onSelectionChanged() {
        this.a.setSelected(this.b.p0());
    }
}
