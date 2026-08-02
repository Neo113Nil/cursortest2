package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l8f extends up6 {
    public static final l8f q = new l8f(0);
    public final /* synthetic */ int p;

    public /* synthetic */ l8f(int i) {
        this.p = i;
    }

    @Override // defpackage.up6
    public final boolean o(Object obj, Object obj2) {
        switch (this.p) {
            case 0:
                return Intrinsics.d(Boolean.valueOf(((xe) obj).a.k), Boolean.valueOf(((xe) obj2).a.k));
            case 1:
                return obj.equals(obj2);
            case 2:
                return ((nfn) obj).b == ((nfn) obj2).b;
            case 3:
                return ((ufn) obj).b == ((ufn) obj2).b;
            default:
                return Intrinsics.d(((txt) obj).d, ((txt) obj2).d);
        }
    }

    @Override // defpackage.up6
    public final boolean p(Object obj, Object obj2) {
        switch (this.p) {
            case 0:
                return ((xe) obj).b == ((xe) obj2).b;
            case 1:
                return obj.equals(obj2);
            case 2:
                return Intrinsics.d(((nfn) obj).a, ((nfn) obj2).a);
            case 3:
                return Intrinsics.d(((ufn) obj).a, ((ufn) obj2).a);
            default:
                return Intrinsics.d(((txt) obj).a, ((txt) obj2).a);
        }
    }

    @Override // defpackage.up6
    public Object v(Object obj, Object obj2) {
        switch (this.p) {
            case 2:
                return Unit.a;
            case 3:
                return Unit.a;
            default:
                return super.v(obj, obj2);
        }
    }
}
