package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.drive.vertical.router.a;
import com.yandex.go.search.router.Origin;
import ru.yandex.taxi.masstransit.main.router.b;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes6.dex */
public final /* synthetic */ class u71 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ PointType b;
    public final /* synthetic */ Address c;
    public final /* synthetic */ pv0 w;

    public /* synthetic */ u71(PointType pointType, Address address, pv0 pv0Var, int i) {
        this.a = i;
        this.b = pointType;
        this.c = address;
        this.w = pv0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i;
        zzs B;
        zzs zzsVar;
        boolean z;
        Address address;
        int i2;
        zzs B2;
        zzs zzsVar2;
        boolean z2;
        Address address2;
        int i3 = this.a;
        hxx hxxVar = hxx.a;
        int i4 = 4;
        int i5 = 0;
        pv0 pv0Var = this.w;
        PointType pointType = this.b;
        Address address3 = this.c;
        zy11 zy11Var = zy11.a;
        switch (i3) {
            case 0:
                ((r71) obj).h(pointType, address3, pv0Var);
                break;
            case 1:
                ((isd) obj).h(pointType, address3, pv0Var);
                break;
            case 2:
                ((rhm) obj).a.r(new u71(pointType, address3, pv0Var, 3));
                break;
            case 3:
                qhm qhmVar = (qhm) obj;
                a aVar = qhmVar.a;
                mhm mhmVar = qhmVar.b;
                int[] iArr = nhm.a;
                PointType pointType2 = this.b;
                int i6 = iArr[pointType2.ordinal()];
                if (i6 == 1) {
                    i = kyh0.new_point_selection_screen_starting_point_title_statement;
                } else if (i6 != 2) {
                    w511.b();
                    break;
                } else {
                    i = kyh0.new_point_selection_screen_destination_point_title_statement;
                }
                int i7 = i;
                Origin origin = Origin.DRIVE;
                int i8 = iArr[pointType2.ordinal()];
                pv0 pv0Var2 = this.w;
                if (i8 == 1) {
                    if (address3 != null) {
                        B = address3.B();
                        zzsVar = B;
                    }
                    zzsVar = null;
                } else if (i8 != 2) {
                    w511.b();
                    break;
                } else {
                    if (pv0Var2 != null && (address = pv0Var2.a) != null) {
                        B = address.B();
                        zzsVar = B;
                    }
                    zzsVar = null;
                }
                int i9 = iArr[pointType2.ordinal()];
                if (i9 == 1) {
                    z = true;
                } else if (i9 != 2) {
                    w511.b();
                    break;
                } else {
                    z = false;
                }
                m41 m41Var = new m41(i7, null, pointType2, origin, pv0Var2, zzsVar, z, true, null, null, null, 524032);
                aVar.E((m950) aVar.D.get(), m41Var, new phm(m41Var, aVar, mhmVar, i5), hxxVar);
                break;
            case 4:
                com.yandex.go.taxi.summary.mobilityhub.router.a aVar2 = ((rw20) obj).a;
                int[] iArr2 = ow20.a;
                PointType pointType3 = this.b;
                int i10 = iArr2[pointType3.ordinal()];
                if (i10 == 1) {
                    i2 = kyh0.new_point_selection_screen_starting_point_title_statement;
                } else if (i10 != 2) {
                    w511.b();
                    break;
                } else {
                    i2 = kyh0.new_point_selection_screen_destination_point_title_statement;
                }
                int i11 = i2;
                Origin origin2 = Origin.MOBILITY_HUB;
                int i12 = iArr2[pointType3.ordinal()];
                pv0 pv0Var3 = this.w;
                if (i12 == 1) {
                    if (address3 != null) {
                        B2 = address3.B();
                        zzsVar2 = B2;
                    }
                    zzsVar2 = null;
                } else if (i12 != 2) {
                    w511.b();
                    break;
                } else {
                    if (pv0Var3 != null && (address2 = pv0Var3.a) != null) {
                        B2 = address2.B();
                        zzsVar2 = B2;
                    }
                    zzsVar2 = null;
                }
                int i13 = iArr2[pointType3.ordinal()];
                if (i13 == 1) {
                    z2 = true;
                } else if (i13 != 2) {
                    w511.b();
                    break;
                } else {
                    z2 = false;
                }
                m41 m41Var2 = new m41(i11, null, pointType3, origin2, pv0Var3, zzsVar2, z2, true, null, null, null, 524032);
                aVar2.E((m950) aVar2.J.get(), m41Var2, new kpv(m41Var2, aVar2), hxxVar);
                break;
            case 5:
                uo30 uo30Var = (uo30) obj;
                switch (uo30Var.a) {
                    case 0:
                        b.P((b) uo30Var.b, pointType, address3, pv0Var);
                        break;
                    default:
                        zsa zsaVar = (zsa) uo30Var.b;
                        zsaVar.r(new qu(9));
                        ((wg30) zsaVar.G).invoke(pointType, address3, pv0Var);
                        break;
                }
            case 6:
                ((oy30) obj).a.r(new cc2((Object) this.b, (Object) this.c, (Object) this.w, false, 3));
                break;
            case 7:
                ((vw20) obj).a.r(new u71(pointType, address3, pv0Var, i4));
                break;
            default:
                ((vw20) obj).a.r(new u71(pointType, address3, pv0Var, i4));
                break;
        }
        return zy11Var;
    }
}
