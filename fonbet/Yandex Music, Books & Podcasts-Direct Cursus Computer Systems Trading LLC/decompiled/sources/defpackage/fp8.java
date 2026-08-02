package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class fp8 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ View s;
    public final /* synthetic */ z0a t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fp8(View view, z0a z0aVar, int i) {
        super(1);
        this.r = i;
        this.s = view;
        this.t = z0aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                String str = (String) obj;
                z0a z0aVar = this.t;
                int a = z0aVar.a(str);
                View view = this.s;
                view.setNextFocusForwardId(a);
                view.setAccessibilityTraversalBefore(z0aVar.a(str));
                break;
            case 1:
                this.s.setNextFocusLeftId(this.t.a((String) obj));
                break;
            case 2:
                this.s.setNextFocusRightId(this.t.a((String) obj));
                break;
            case 3:
                this.s.setNextFocusUpId(this.t.a((String) obj));
                break;
            default:
                this.s.setNextFocusDownId(this.t.a((String) obj));
                break;
        }
        return Unit.a;
    }
}
