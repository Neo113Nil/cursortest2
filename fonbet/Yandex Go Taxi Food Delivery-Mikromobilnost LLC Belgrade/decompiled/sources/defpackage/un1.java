package defpackage;

import com.yandex.go.chargers.subscription.presentation.landing.c;

/* loaded from: classes11.dex */
public final /* synthetic */ class un1 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ CharSequence b;

    public /* synthetic */ un1(int i, int i2, CharSequence charSequence) {
        this.a = i2;
        this.b = charSequence;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        CharSequence charSequence = this.b;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    zgb1.a(this.b, null, 3, false, null, null, false, new krn(0), btsVar, 12583296, 122);
                    break;
                }
            case 1:
                ((Integer) obj2).getClass();
                sq5.i(charSequence, (fid) obj, vng.O(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                rhb1.a(charSequence, (fid) obj, vng.O(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                fib1.b(charSequence, (fid) obj, vng.O(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                tib1.f(charSequence, (fid) obj, vng.O(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                vib1.d(charSequence, (fid) obj, vng.O(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                bjb1.c(charSequence, (fid) obj, vng.O(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                c.f(charSequence, (fid) obj, vng.O(1));
                break;
            case 8:
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    Object Q = btsVar2.Q();
                    if (Q == did.a) {
                        Q = new teb(20);
                        btsVar2.o0(Q);
                    }
                    zgb1.a(this.b, fnq0.a(c530.a, (tls) Q), 0, false, null, null, false, null, btsVar2, 0, 252);
                    break;
                }
            case 9:
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    btsVar3.Y();
                    break;
                } else {
                    zgb1.a(this.b, null, 0, false, null, null, false, null, btsVar3, 0, 254);
                    break;
                }
            case 10:
                fid fidVar4 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (!btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    btsVar4.Y();
                    break;
                } else {
                    zgb1.a(this.b, null, 0, false, null, null, false, null, btsVar4, 0, 254);
                    break;
                }
            case 11:
                ((Integer) obj2).getClass();
                l0b1.c(charSequence, (fid) obj, vng.O(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                rpb1.f(charSequence, (fid) obj, vng.O(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                rpb1.d(charSequence, (fid) obj, vng.O(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                ed40.M(charSequence, (fid) obj, vng.O(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                ed40.L(charSequence, (fid) obj, vng.O(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                ed40.p(charSequence, (fid) obj, vng.O(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                ed40.q(charSequence, (fid) obj, vng.O(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                spb1.f(charSequence, (fid) obj, vng.O(1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                vpb1.k(charSequence, (fid) obj, vng.O(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                vpb1.f(charSequence, (fid) obj, vng.O(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                vpb1.g(charSequence, (fid) obj, vng.O(1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                wpb1.e(charSequence, (fid) obj, vng.O(1));
                break;
            default:
                fid fidVar5 = (fid) obj;
                int intValue5 = ((Integer) obj2).intValue();
                bts btsVar5 = (bts) fidVar5;
                if (!btsVar5.V(intValue5 & 1, (intValue5 & 3) != 2)) {
                    btsVar5.Y();
                    break;
                } else if (charSequence == null) {
                    btsVar5.e0(-1418876041);
                    btsVar5.t(false);
                    break;
                } else {
                    btsVar5.e0(-1419001932);
                    s3b1.f(new cuj0(vzg0.ic_postcard_alert, null, null, null, 30), null, null, btsVar5, 0, 6);
                    btsVar5.t(false);
                    break;
                }
        }
        return zy11Var;
    }

    public /* synthetic */ un1(int i, CharSequence charSequence) {
        this.a = i;
        this.b = charSequence;
    }
}
