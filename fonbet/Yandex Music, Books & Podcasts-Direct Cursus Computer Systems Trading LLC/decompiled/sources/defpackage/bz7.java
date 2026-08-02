package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class bz7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nii b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ o3e d;
    public final /* synthetic */ yci e;
    public final /* synthetic */ pyc f;
    public final /* synthetic */ o0k g;
    public final /* synthetic */ int h;

    public /* synthetic */ bz7(nii niiVar, ArrayList arrayList, o3e o3eVar, yci yciVar, pyc pycVar, o0k o0kVar, int i, int i2) {
        this.a = i2;
        this.b = niiVar;
        this.c = arrayList;
        this.d = o3eVar;
        this.e = yciVar;
        this.f = pycVar;
        this.g = o0kVar;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                jf0.n(this.b, this.c, this.d, this.e, this.f, this.g, (hq5) obj, rvf.R(this.h | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                this.b.b(this.c, this.d, this.e, this.f, this.g, (hq5) obj, rvf.R(this.h | 1));
                break;
        }
        return Unit.a;
    }
}
