package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.common.media.queue.YnisonPassiveLaunchException;

/* loaded from: classes4.dex */
public final /* synthetic */ class jiv implements Function2 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        switch (this.a) {
            case 0:
                fk0 fk0Var = (fk0) obj2;
                ((goo) obj).getClass();
                fk0Var.getClass();
                return (Float) fk0Var.e();
            case 1:
                ((Integer) obj2).getClass();
                u7g.s(rvf.R(1), (hq5) obj);
                return Unit.a;
            case 2:
                ((Integer) obj2).getClass();
                y7g.n(rvf.R(1), (hq5) obj);
                return Unit.a;
            case 3:
                zsv zsvVar = (zsv) obj;
                zsv zsvVar2 = (zsv) obj2;
                zsvVar.getClass();
                zsvVar2.getClass();
                return Boolean.valueOf((zsvVar instanceof ysv) && (zsvVar2 instanceof xsv));
            case 4:
                ((Integer) obj2).getClass();
                hdg.H(rvf.R(1), (hq5) obj);
                return Unit.a;
            case 5:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 6:
                rxv rxvVar = (rxv) obj2;
                ((goo) obj).getClass();
                rxvVar.getClass();
                Pair pair = new Pair("initialCenterX", Integer.valueOf((int) (rxvVar.d() >> 32)));
                Pair pair2 = new Pair("initialCenterY", Integer.valueOf((int) (rxvVar.d() & 4294967295L)));
                Pair pair3 = new Pair("initialOffsetX", Float.valueOf(enj.e(rxvVar.g())));
                Pair pair4 = new Pair("initialOffsetY", Float.valueOf(enj.f(rxvVar.g())));
                Pair pair5 = new Pair("initialScale", Float.valueOf(rxvVar.h.e()));
                Pair pair6 = new Pair("initialAlpha", Float.valueOf(rxvVar.i.e()));
                int ordinal = rxvVar.h().ordinal();
                int i2 = 1;
                if (ordinal == 0) {
                    i = 0;
                } else {
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    i = 1;
                }
                Pair pair7 = new Pair("scrollMode", Integer.valueOf(i));
                int ordinal2 = rxvVar.e().ordinal();
                if (ordinal2 == 0) {
                    i2 = 0;
                } else if (ordinal2 != 1) {
                    i2 = 2;
                    if (ordinal2 != 2) {
                        b6e.s();
                        return null;
                    }
                }
                Pair pair8 = new Pair("dragScrollMode", Integer.valueOf(i2));
                Boolean bool = (Boolean) rxvVar.A.getValue();
                bool.booleanValue();
                Pair pair9 = new Pair("initialIsTitleVisible", bool);
                Boolean bool2 = (Boolean) rxvVar.w.getValue();
                bool2.booleanValue();
                Pair pair10 = new Pair("initialIsHudVisible", bool2);
                Boolean bool3 = (Boolean) rxvVar.B.getValue();
                bool3.booleanValue();
                Pair pair11 = new Pair("initialIsOneToOneHintActive", bool3);
                Boolean bool4 = (Boolean) rxvVar.y.getValue();
                bool4.booleanValue();
                Pair pair12 = new Pair("initialIsHeaderVisible", bool4);
                Boolean bool5 = (Boolean) rxvVar.z.getValue();
                bool5.booleanValue();
                Pair pair13 = new Pair("initialIsFooterVisible", bool5);
                Boolean bool6 = (Boolean) rxvVar.x.getValue();
                bool6.booleanValue();
                return uah.e(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, new Pair("initialIsCardInfoVisible", bool6));
            case 7:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                return (booleanValue && booleanValue2) ? swv.d : booleanValue2 ? swv.b : booleanValue ? swv.c : swv.a;
            case 8:
                xyv xyvVar = (xyv) obj;
                boolean booleanValue3 = ((Boolean) obj2).booleanValue();
                xyvVar.getClass();
                return Boolean.valueOf(booleanValue3 && (xyvVar instanceof vyv));
            case 9:
                ((Integer) obj2).getClass();
                qzv.c(rvf.R(1), (hq5) obj);
                return Unit.a;
            case 10:
                ((Integer) obj2).intValue();
                ((x1w) obj).getClass();
                return Unit.a;
            case 11:
                return weo.S(600, 0, lya.c, 2);
            case 12:
                mow mowVar = (mow) obj;
                String str = (String) obj2;
                mowVar.getClass();
                str.getClass();
                return new YnisonPassiveLaunchException(mowVar, str);
            case 13:
                mwk mwkVar = (mwk) obj;
                mwk mwkVar2 = (mwk) obj2;
                mwkVar.getClass();
                mwkVar2.getClass();
                return Boolean.valueOf(Intrinsics.d(y5g.a0(mwkVar), y5g.a0(mwkVar2)));
            default:
                jzs jzsVar = (jzs) obj;
                naq naqVar = (naq) obj2;
                jzsVar.getClass();
                naqVar.getClass();
                String str2 = jzsVar.a.a;
                mqs mqsVar = naqVar.e;
                uow uowVar = naqVar.d;
                return Boolean.valueOf(Intrinsics.d(str2, mqsVar.a) && Intrinsics.d(jzsVar.g, q7g.I(uowVar)) && Intrinsics.d(jzsVar.d, q7g.G(uowVar)));
        }
    }

    public /* synthetic */ jiv(int i, int i2) {
        this.a = i2;
    }

    public /* synthetic */ jiv(int i) {
        this.a = i;
    }
}
