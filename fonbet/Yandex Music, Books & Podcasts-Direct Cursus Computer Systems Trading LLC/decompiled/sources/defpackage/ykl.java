package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class ykl implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ ykl(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Window window;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(!this.b.canScrollVertically(-1));
            default:
                Context context = this.b.getContext();
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if (activity != null && (window = activity.getWindow()) != null) {
                    window.setStatusBarColor(c3x.U(d85.m));
                }
                return Unit.a;
        }
    }
}
