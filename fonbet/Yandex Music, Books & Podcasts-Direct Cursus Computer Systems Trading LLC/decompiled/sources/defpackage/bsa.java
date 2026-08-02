package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class bsa implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public bsa(i2u i2uVar, float f, float f2) {
        this.a = 1;
        this.d = i2uVar;
        this.b = f;
        this.c = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                float floatValue = ((Number) obj).floatValue();
                float f = this.b;
                ((ro6) this.d).invoke(Integer.valueOf(eeh.b(su4.e(this.c, f, floatValue, f))));
                break;
            case 1:
                float floatValue2 = ((Number) obj).floatValue();
                ((i2u) this.d).f.setValue(Float.valueOf(yhn.c((floatValue2 - this.b) / this.c, -1.0f, 1.0f)));
                break;
            default:
                float floatValue3 = ((Number) obj).floatValue();
                float f2 = this.b;
                ((View) ((rjp) this.d).a).setAlpha(su4.e(this.c, f2, floatValue3, f2));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ bsa(float f, float f2, Object obj, int i) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = obj;
    }
}
