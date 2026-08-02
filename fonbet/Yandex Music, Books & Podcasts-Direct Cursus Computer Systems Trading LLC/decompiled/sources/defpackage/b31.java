package defpackage;

import j$.time.ZonedDateTime;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class b31 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;
    public final /* synthetic */ nfl c;

    public /* synthetic */ b31(rjc rjcVar, nfl nflVar, int i) {
        this.a = i;
        this.b = rjcVar;
        this.c = nflVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0130  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        a31 a31Var;
        int i;
        a61 a61Var;
        int i2;
        qd5 qd5Var;
        int i3;
        int i4 = this.a;
        ifl iflVar = ifl.a;
        nfl nflVar = this.c;
        rjc rjcVar = this.b;
        Object obj2 = null;
        switch (i4) {
            case 0:
                if (continuation instanceof a31) {
                    a31Var = (a31) continuation;
                    int i5 = a31Var.k;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        a31Var.k = i5 - Integer.MIN_VALUE;
                        Object obj3 = a31Var.j;
                        nm6 nm6Var = nm6.a;
                        i = a31Var.k;
                        if (i != 0) {
                            qgg.h0(obj3);
                            jfl jflVar = (jfl) obj;
                            nflVar.getClass();
                            jflVar.getClass();
                            if (!(jflVar instanceof hfl)) {
                                if (!jflVar.equals(iflVar)) {
                                    b6e.s();
                                    break;
                                }
                            } else {
                                hfl hflVar = (hfl) jflVar;
                                wdl wdlVar = (wdl) bow.C(ern.a(tdl.class), hflVar.b);
                                if (wdlVar != null) {
                                    mqs mqsVar = hflVar.a;
                                    tdl tdlVar = (tdl) wdlVar;
                                    h06 h06Var = tdlVar.a;
                                    o8q o8qVar = nflVar.a;
                                    fu5 fu5Var = nflVar.b;
                                    String str = h06Var.d;
                                    uu5 uu5Var = fu5Var.b;
                                    ZonedDateTime zonedDateTime = h06Var.f;
                                    zonedDateTime.getClass();
                                    String I = ((sld) uu5Var.i).I(zonedDateTime);
                                    String I2 = ((sld) uu5Var.e).I(zonedDateTime);
                                    int ordinal = h06Var.m.d().ordinal();
                                    int i6 = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? R.string.concert_event_type_unspecified : R.string.concert_event_type_musical : R.string.concert_event_type_tribute : R.string.concert_event_type_festival : R.string.concert_event_type_concert;
                                    skr skrVar = o8qVar.a;
                                    skr skrVar2 = o8qVar.a;
                                    obj2 = new f31(!((Boolean) nflVar.c.invoke()).booleanValue() ? skrVar2.d(R.string.artist_concert_informer_title_format, Arrays.copyOf(new Object[]{I, I2, str}, 3)) : skrVar2.d(R.string.artist_concert_informer_event_full_date_title_format, Arrays.copyOf(new Object[]{skrVar.c(i6), I, I2, str}, 4)), pd.R(mqsVar.f().a), tdlVar);
                                }
                            }
                            a31Var.k = 1;
                            if (rjcVar.emit(obj2, a31Var) == nm6Var) {
                                break;
                            }
                        } else if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj3);
                        }
                        break;
                    }
                }
                a31Var = new a31(this, continuation);
                Object obj32 = a31Var.j;
                nm6 nm6Var2 = nm6.a;
                i = a31Var.k;
                if (i != 0) {
                }
            case 1:
                if (continuation instanceof a61) {
                    a61Var = (a61) continuation;
                    int i7 = a61Var.k;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        a61Var.k = i7 - Integer.MIN_VALUE;
                        Object obj4 = a61Var.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = a61Var.k;
                        if (i2 != 0) {
                            qgg.h0(obj4);
                            jfl jflVar2 = (jfl) obj;
                            nflVar.getClass();
                            jflVar2.getClass();
                            if (!(jflVar2 instanceof hfl)) {
                                if (!jflVar2.equals(iflVar)) {
                                    b6e.s();
                                    break;
                                }
                            } else {
                                hfl hflVar2 = (hfl) jflVar2;
                                wdl wdlVar2 = (wdl) bow.C(ern.a(udl.class), hflVar2.b);
                                if (wdlVar2 != null) {
                                    udl udlVar = (udl) wdlVar2;
                                    obj2 = new d61(udlVar.a.b, pd.R(hflVar2.a.f().a), udlVar);
                                }
                            }
                            a61Var.k = 1;
                            if (rjcVar.emit(obj2, a61Var) == nm6Var3) {
                                break;
                            }
                        } else if (i2 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj4);
                        }
                        break;
                    }
                }
                a61Var = new a61(this, continuation);
                Object obj42 = a61Var.j;
                nm6 nm6Var32 = nm6.a;
                i2 = a61Var.k;
                if (i2 != 0) {
                }
            default:
                if (continuation instanceof qd5) {
                    qd5Var = (qd5) continuation;
                    int i8 = qd5Var.k;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        qd5Var.k = i8 - Integer.MIN_VALUE;
                        Object obj5 = qd5Var.j;
                        nm6 nm6Var4 = nm6.a;
                        i3 = qd5Var.k;
                        if (i3 != 0) {
                            qgg.h0(obj5);
                            jfl jflVar3 = (jfl) obj;
                            nflVar.getClass();
                            jflVar3.getClass();
                            if (!(jflVar3 instanceof hfl)) {
                                if (!jflVar3.equals(iflVar)) {
                                    b6e.s();
                                    break;
                                }
                            } else {
                                hfl hflVar3 = (hfl) jflVar3;
                                wdl wdlVar3 = (wdl) bow.C(ern.a(sdl.class), hflVar3.b);
                                if (wdlVar3 != null) {
                                    mqs mqsVar2 = hflVar3.a;
                                    sdl sdlVar = (sdl) wdlVar3;
                                    ydl ydlVar = sdlVar.a;
                                    obj2 = new wd5(ydlVar.d, ydlVar.b, pd.R(mqsVar2.f().a), ydlVar.c, sdlVar);
                                }
                            }
                            qd5Var.k = 1;
                            if (rjcVar.emit(obj2, qd5Var) == nm6Var4) {
                                break;
                            }
                        } else if (i3 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj5);
                        }
                        break;
                    }
                }
                qd5Var = new qd5(this, continuation);
                Object obj52 = qd5Var.j;
                nm6 nm6Var42 = nm6.a;
                i3 = qd5Var.k;
                if (i3 != 0) {
                }
        }
        return null;
    }
}
