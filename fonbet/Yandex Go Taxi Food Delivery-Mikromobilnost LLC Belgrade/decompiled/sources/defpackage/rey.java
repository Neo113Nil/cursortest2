package defpackage;

import android.widget.ViewSwitcher;
import com.yandex.go.pin.api.v1.PinV1Component;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.masstransit.router.d;

/* loaded from: classes6.dex */
public final /* synthetic */ class rey implements g18 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ rey(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    @Override // defpackage.g18
    public final void cancel() {
        int i = this.a;
        Object obj = this.w;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((g18) ((Ref$ObjectRef) obj3).element).cancel();
                ((g18) ((Ref$ObjectRef) obj2).element).cancel();
                ((g18) ((Ref$ObjectRef) obj).element).cancel();
                break;
            case 1:
                ((d) obj3).y.a((String) obj2);
                ((pzt0) obj).a(null);
                break;
            case 2:
                PinV1Component pinV1Component = (PinV1Component) obj;
                ((rey) obj3).cancel();
                ((ViewSwitcher) obj2).setVisibility(8);
                pinV1Component.setPinCircleOverlayView(null);
                pinV1Component.setAnimationCallback(null);
                break;
            default:
                ((g18) obj3).cancel();
                ((k20) obj2).cancel();
                ((hbp0) obj).b();
                break;
        }
    }
}
