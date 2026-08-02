package defpackage;

import androidx.compose.runtime.internal.a;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.c;
import ru.yandex.taxi.logistics.sdk.photocomments.PhotocommentsMode;

/* loaded from: classes10.dex */
public final /* synthetic */ class z07 implements wls {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ z07(sls slsVar, f530 f530Var, boolean z, ehr0 ehr0Var, hz6 hz6Var, tz6 tz6Var, j690 j690Var, a aVar, int i) {
        this.w = slsVar;
        this.x = f530Var;
        this.b = z;
        this.y = ehr0Var;
        this.z = hz6Var;
        this.A = tz6Var;
        this.B = j690Var;
        this.C = aVar;
        this.c = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.w;
        Object obj4 = this.C;
        Object obj5 = this.B;
        Object obj6 = this.A;
        Object obj7 = this.z;
        Object obj8 = this.y;
        Object obj9 = this.x;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                androidx.compose.material3.a.c((sls) obj3, (f530) obj9, this.b, (ehr0) obj8, (hz6) obj7, (tz6) obj6, (j690) obj5, (a) obj4, (fid) obj, O);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int O2 = vng.O(1);
                ((c) obj3).d((oz40) obj9, (oz40) obj8, (oz40) obj7, (oip0) obj6, (qkg) obj5, this.b, (ldc) obj4, this.c, (fid) obj, O2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int O3 = vng.O(i2 | 1);
                ru.yandex.taxi.logistics.sdk.photocomments.a.m((lkb0) obj9, (String) obj8, this.b, (PhotocommentsMode) obj7, (tkb0) obj6, (tls) obj5, (tls) obj4, (sls) obj3, (fid) obj, O3);
                break;
            default:
                ((Integer) obj2).getClass();
                int O4 = vng.O(1);
                z3b1.a((f530) obj9, this.b, (CharSequence) obj8, (CharSequence) obj7, (CharSequence) obj6, (CharSequence) obj5, (String) obj4, (sls) obj3, (fid) obj, O4, this.c);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ z07(f530 f530Var, boolean z, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, String str, sls slsVar, int i, int i2) {
        this.x = f530Var;
        this.b = z;
        this.y = charSequence;
        this.z = charSequence2;
        this.A = charSequence3;
        this.B = charSequence4;
        this.C = str;
        this.w = slsVar;
        this.c = i2;
    }

    public /* synthetic */ z07(lkb0 lkb0Var, String str, boolean z, PhotocommentsMode photocommentsMode, tkb0 tkb0Var, tls tlsVar, tls tlsVar2, sls slsVar, int i) {
        this.x = lkb0Var;
        this.y = str;
        this.b = z;
        this.z = photocommentsMode;
        this.A = tkb0Var;
        this.B = tlsVar;
        this.C = tlsVar2;
        this.w = slsVar;
        this.c = i;
    }

    public /* synthetic */ z07(c cVar, oz40 oz40Var, oz40 oz40Var2, oz40 oz40Var3, oip0 oip0Var, qkg qkgVar, boolean z, ldc ldcVar, int i, int i2) {
        this.w = cVar;
        this.x = oz40Var;
        this.y = oz40Var2;
        this.z = oz40Var3;
        this.A = oip0Var;
        this.B = qkgVar;
        this.b = z;
        this.C = ldcVar;
        this.c = i;
    }
}
