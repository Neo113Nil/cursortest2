package defpackage;

import androidx.compose.ui.layout.o;
import ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.ui.smart_camera_entry_point.slime.c;

/* loaded from: classes12.dex */
public final /* synthetic */ class zps0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object w;

    public /* synthetic */ zps0(float f, float f2, int i, Object obj) {
        this.a = i;
        this.w = obj;
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        float f = this.c;
        float f2 = this.b;
        Object obj2 = this.w;
        switch (i) {
            case 0:
                rzx rzxVar = (rzx) obj;
                float floatValue = ((c) obj2).f.getFloatValue();
                break;
            case 1:
                ((o.a) obj).g((o) obj2, (int) f2, (int) f, 0.0f);
                break;
            default:
                qyw0 qyw0Var = (qyw0) obj2;
                float floatValue2 = 1.0f - ((Float) obj).floatValue();
                qyw0Var.R.setAlpha(f2 * floatValue2);
                qyw0Var.W.setAlpha(f * floatValue2);
                break;
        }
        return zy11Var;
    }
}
