package defpackage;

import com.yandex.go.design.compose.badge.BadgeSize;
import com.yandex.go.design.compose.plus.text.PlusNewType;
import com.yx360.design.compose.atoms.DsCheckbox$State;
import com.yx360.design.compose.atoms.DsCheckbox$Variant;
import com.yx360.design.compose.atoms.c;
import ru.yandex.taxi.logistics.sdk.photocomments.PhotocommentsMode;
import ru.yandex.taxi.logistics.sdk.photocomments.a;

/* loaded from: classes11.dex */
public final /* synthetic */ class rpm implements wls {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ rpm(f530 f530Var, cqs0 cqs0Var, tls tlsVar, tls tlsVar2, boolean z, y7m y7mVar, int i, int i2) {
        this.c = f530Var;
        this.z = cqs0Var;
        this.A = tlsVar;
        this.B = tlsVar2;
        this.b = z;
        this.w = y7mVar;
        this.x = i;
        this.y = i2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.x;
        Object obj3 = this.w;
        Object obj4 = this.c;
        Object obj5 = this.B;
        Object obj6 = this.A;
        Object obj7 = this.z;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                c.a((DsCheckbox$State) obj7, this.b, (tls) obj6, (f530) obj4, (DsCheckbox$Variant) obj5, (String) obj3, (fid) obj, O, this.y);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int O2 = vng.O(i2 | 1);
                csm.c(this.b, (f530) obj4, (String) obj3, (String) obj7, (zrm) obj6, (wls) obj5, (fid) obj, O2, this.y);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int O3 = vng.O(i2 | 1);
                a.e((String) obj3, this.b, (String) obj7, (PhotocommentsMode) obj6, (tkb0) obj4, (sls) obj5, (fid) obj, O3, this.y);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int O4 = vng.O(i2 | 1);
                o6d0.a((String) obj3, (f530) obj4, (BadgeSize) obj7, (mm4) obj6, (PlusNewType) obj5, this.b, (fid) obj, O4, this.y);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int O5 = vng.O(i2 | 1);
                o4b1.d((CharSequence) obj7, (f530) obj4, this.b, (wp2) obj6, (wp2) obj5, (sls) obj3, (fid) obj, O5, this.y);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int O6 = vng.O(i2 | 1);
                xdb1.a((f530) obj4, (cqs0) obj7, (tls) obj6, (tls) obj5, this.b, (y7m) obj3, (fid) obj, O6, this.y);
                break;
            default:
                ((Integer) obj2).getClass();
                int O7 = vng.O(i2 | 1);
                avz0.b((u9e0) obj7, (androidx.compose.runtime.internal.a) obj6, (svz0) obj5, (f530) obj4, this.b, (wls) obj3, (fid) obj, O7, this.y);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ rpm(u9e0 u9e0Var, androidx.compose.runtime.internal.a aVar, svz0 svz0Var, f530 f530Var, boolean z, wls wlsVar, int i, int i2) {
        this.z = u9e0Var;
        this.A = aVar;
        this.B = svz0Var;
        this.c = f530Var;
        this.b = z;
        this.w = wlsVar;
        this.x = i;
        this.y = i2;
    }

    public /* synthetic */ rpm(DsCheckbox$State dsCheckbox$State, boolean z, tls tlsVar, f530 f530Var, DsCheckbox$Variant dsCheckbox$Variant, String str, int i, int i2) {
        this.z = dsCheckbox$State;
        this.b = z;
        this.A = tlsVar;
        this.c = f530Var;
        this.B = dsCheckbox$Variant;
        this.w = str;
        this.x = i;
        this.y = i2;
    }

    public /* synthetic */ rpm(CharSequence charSequence, f530 f530Var, boolean z, wp2 wp2Var, wp2 wp2Var2, sls slsVar, int i, int i2) {
        this.z = charSequence;
        this.c = f530Var;
        this.b = z;
        this.A = wp2Var;
        this.B = wp2Var2;
        this.w = slsVar;
        this.x = i;
        this.y = i2;
    }

    public /* synthetic */ rpm(String str, f530 f530Var, BadgeSize badgeSize, mm4 mm4Var, PlusNewType plusNewType, boolean z, int i, int i2) {
        this.w = str;
        this.c = f530Var;
        this.z = badgeSize;
        this.A = mm4Var;
        this.B = plusNewType;
        this.b = z;
        this.x = i;
        this.y = i2;
    }

    public /* synthetic */ rpm(String str, boolean z, String str2, PhotocommentsMode photocommentsMode, tkb0 tkb0Var, sls slsVar, int i, int i2) {
        this.w = str;
        this.b = z;
        this.z = str2;
        this.A = photocommentsMode;
        this.c = tkb0Var;
        this.B = slsVar;
        this.x = i;
        this.y = i2;
    }

    public /* synthetic */ rpm(boolean z, f530 f530Var, String str, String str2, zrm zrmVar, wls wlsVar, int i, int i2) {
        this.b = z;
        this.c = f530Var;
        this.w = str;
        this.z = str2;
        this.A = zrmVar;
        this.B = wlsVar;
        this.x = i;
        this.y = i2;
    }
}
