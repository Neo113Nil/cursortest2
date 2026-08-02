package defpackage;

import com.yandex.passport.internal.ui.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class nzo implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ nzo(az2 az2Var, w3g w3gVar, boolean z, boolean z2, Function0 function0, Function0 function02, Function0 function03, yci yciVar, int i) {
        this.g = az2Var;
        this.h = w3gVar;
        this.b = z;
        this.c = z2;
        this.d = function0;
        this.e = function02;
        this.f = function03;
        this.i = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int R = rvf.R(1);
                szf.m((az2) this.g, (w3g) this.h, this.b, this.c, this.d, this.e, this.f, (yci) this.i, (hq5) obj, R);
                break;
            default:
                ((Integer) obj2).getClass();
                int R2 = rvf.R(1);
                a.d((String) this.g, (String) this.h, (String) this.i, this.b, this.c, this.d, this.e, this.f, (hq5) obj, R2);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ nzo(String str, String str2, String str3, boolean z, boolean z2, Function0 function0, Function0 function02, Function0 function03, int i) {
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.b = z;
        this.c = z2;
        this.d = function0;
        this.e = function02;
        this.f = function03;
    }
}
