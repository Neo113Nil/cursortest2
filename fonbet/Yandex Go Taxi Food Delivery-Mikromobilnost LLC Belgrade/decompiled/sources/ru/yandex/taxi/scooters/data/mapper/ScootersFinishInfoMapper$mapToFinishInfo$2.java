package ru.yandex.taxi.scooters.data.mapper;

import android.graphics.Bitmap;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.bmu;
import defpackage.e1f0;
import defpackage.f9s;
import defpackage.fef;
import defpackage.gmn0;
import defpackage.gwk0;
import defpackage.hmn0;
import defpackage.ief;
import defpackage.imn0;
import defpackage.jl40;
import defpackage.kmu;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zuo0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackSettingsParams$Screen;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Limn0;", "<anonymous>", "(Ltse;)Limn0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.data.mapper.ScootersFinishInfoMapper$mapToFinishInfo$2", f = "ScootersFinishInfoMapper.kt", l = {59, CalendarDayView.DISABLED_DAY_ALPHA, 82, HProv.PP_HASHOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersFinishInfoMapper$mapToFinishInfo$2 extends SuspendLambda implements wls {
    final /* synthetic */ bmu $historyResponse;
    final /* synthetic */ FeedbackSettingsParams$Screen $screen;
    final /* synthetic */ zuo0 $sessionState;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$14;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersFinishInfoMapper$mapToFinishInfo$2(bmu bmuVar, d dVar, zuo0 zuo0Var, FeedbackSettingsParams$Screen feedbackSettingsParams$Screen, Continuation continuation) {
        super(2, continuation);
        this.$historyResponse = bmuVar;
        this.this$0 = dVar;
        this.$sessionState = zuo0Var;
        this.$screen = feedbackSettingsParams$Screen;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersFinishInfoMapper$mapToFinishInfo$2 scootersFinishInfoMapper$mapToFinishInfo$2 = new ScootersFinishInfoMapper$mapToFinishInfo$2(this.$historyResponse, this.this$0, this.$sessionState, this.$screen, continuation);
        scootersFinishInfoMapper$mapToFinishInfo$2.L$0 = obj;
        return scootersFinishInfoMapper$mapToFinishInfo$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersFinishInfoMapper$mapToFinishInfo$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d6  */
    /* JADX WARN: Type inference failed for: r3v16, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        fef h;
        Object obj2;
        kmu kmuVar;
        kmu.b bVar;
        Integer num;
        int intValue;
        CharSequence charSequence;
        Object e;
        fef fefVar;
        kmu kmuVar2;
        noh h2;
        String sessionId;
        kmu.a aVar;
        String str;
        Object s;
        qoh qohVar;
        String str2;
        CharSequence charSequence2;
        int i;
        kmu.b bVar2;
        int i2;
        String str3;
        String str4;
        String str5;
        Object k;
        String str6;
        String str7;
        noh nohVar;
        CharSequence charSequence3;
        kmu kmuVar3;
        String str8;
        Bitmap bitmap;
        String str9;
        int i3;
        Integer num2;
        kmu.b bVar3;
        hmn0 hmn0Var;
        Object k2;
        List list;
        String str10;
        String str11;
        String str12;
        String str13;
        CharSequence charSequence4;
        hmn0 hmn0Var2;
        kmu.d dVar;
        kmu.d dVar2;
        kmu.d dVar3;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.label;
        if (i4 == 0) {
            kotlin.b.b(obj);
            ief iefVar = this.$historyResponse.b;
            if (iefVar != null) {
                h = gwk0.h(iefVar);
                List list2 = this.$historyResponse.a;
                List list3 = list2;
                if (list3 != null && !list3.isEmpty()) {
                    zuo0 zuo0Var = this.$sessionState;
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        kmu.b bVar4 = ((kmu) obj2).a;
                        if (jl40.l(bVar4 != null ? bVar4.a : null, zuo0Var.getSessionId())) {
                            break;
                        }
                    }
                    kmuVar = (kmu) obj2;
                    if (kmuVar != null && (bVar = kmuVar.a) != null && (num = bVar.b) != null) {
                        intValue = num.intValue();
                        FormattedText formattedText = bVar.h;
                        if (formattedText != null) {
                            FormattedText c = f9s.c(this.this$0.c, h, formattedText);
                            ru.yandex.taxi.widget.c cVar = this.this$0.d;
                            this.L$0 = tseVar;
                            this.L$1 = h;
                            this.L$2 = null;
                            this.L$3 = kmuVar;
                            this.L$4 = null;
                            this.I$0 = intValue;
                            this.label = 1;
                            e = ru.yandex.taxi.widget.c.e(cVar, c, null, false, this, 30);
                            if (e != coroutineSingletons) {
                                fefVar = h;
                                kmuVar2 = kmuVar;
                            }
                            return coroutineSingletons;
                        }
                        charSequence = null;
                        h2 = tje.h(tseVar, null, null, new ScootersFinishInfoMapper$mapToFinishInfo$2$finishInfoItemsAsync$1(h, kmuVar, null, this.this$0), 3);
                        qoh h3 = tje.h(tseVar, null, null, new ScootersFinishInfoMapper$mapToFinishInfo$2$rideStatistics$1(h, kmuVar, null, this.this$0), 3);
                        qoh h4 = tje.h(tseVar, null, null, new ScootersFinishInfoMapper$mapToFinishInfo$2$vehicleImageAsync$1(this.$sessionState, this.this$0, null), 3);
                        sessionId = this.$sessionState.getSessionId();
                        aVar = kmuVar.b;
                        if (aVar != null || (str = aVar.a) == null) {
                            str = "";
                        }
                        this.L$0 = null;
                        this.L$1 = h;
                        this.L$2 = null;
                        this.L$3 = kmuVar;
                        this.L$4 = charSequence;
                        this.L$5 = h2;
                        this.L$6 = h3;
                        this.L$7 = null;
                        this.L$8 = sessionId;
                        this.L$9 = str;
                        this.I$0 = intValue;
                        this.label = 2;
                        s = h4.s(this);
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (s != coroutineSingletons) {
                            qohVar = h3;
                            str2 = str;
                            charSequence2 = charSequence;
                            i = intValue;
                            Bitmap bitmap2 = (Bitmap) s;
                            fef fefVar2 = h;
                            String b = this.this$0.e.b(fefVar2, "%s", new e1f0(new Integer(i).doubleValue()));
                            bVar2 = kmuVar.a;
                            if (bVar2 != null) {
                            }
                            i2 = i;
                            str3 = str2;
                            str4 = "";
                            str5 = str4;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = kmuVar;
                            this.L$4 = charSequence2;
                            this.L$5 = null;
                            this.L$6 = qohVar;
                            this.L$7 = null;
                            this.L$8 = sessionId;
                            String str14 = str3;
                            this.L$9 = str14;
                            this.L$10 = bitmap2;
                            this.L$11 = b;
                            this.L$12 = str5;
                            int i5 = i2;
                            this.I$0 = i5;
                            this.label = 3;
                            k = h2.k(this);
                            if (k != coroutineSingletons) {
                            }
                        }
                        return coroutineSingletons;
                    }
                }
            }
            return null;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                i = this.I$0;
                str2 = (String) this.L$9;
                String str15 = (String) this.L$8;
                ?? r3 = (noh) this.L$6;
                h2 = (noh) this.L$5;
                charSequence2 = (CharSequence) this.L$4;
                kmu kmuVar4 = (kmu) this.L$3;
                h = (fef) this.L$1;
                kotlin.b.b(obj);
                qohVar = r3;
                kmuVar = kmuVar4;
                sessionId = str15;
                s = obj;
                Bitmap bitmap22 = (Bitmap) s;
                fef fefVar22 = h;
                String b2 = this.this$0.e.b(fefVar22, "%s", new e1f0(new Integer(i).doubleValue()));
                bVar2 = kmuVar.a;
                if (bVar2 != null || (num2 = bVar2.d) == null) {
                    i2 = i;
                    str3 = str2;
                    str4 = "";
                    str5 = str4;
                } else {
                    str4 = "";
                    i2 = i;
                    str3 = str2;
                    str5 = this.this$0.e.b(fefVar22, "%s", new e1f0(new Integer(num2.intValue()).doubleValue()));
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = kmuVar;
                this.L$4 = charSequence2;
                this.L$5 = null;
                this.L$6 = qohVar;
                this.L$7 = null;
                this.L$8 = sessionId;
                String str142 = str3;
                this.L$9 = str142;
                this.L$10 = bitmap22;
                this.L$11 = b2;
                this.L$12 = str5;
                int i52 = i2;
                this.I$0 = i52;
                this.label = 3;
                k = h2.k(this);
                if (k != coroutineSingletons) {
                    qoh qohVar2 = qohVar;
                    str6 = sessionId;
                    str7 = b2;
                    nohVar = qohVar2;
                    charSequence3 = charSequence2;
                    kmuVar3 = kmuVar;
                    str8 = str142;
                    bitmap = bitmap22;
                    str9 = str5;
                    i3 = i52;
                    List list4 = (List) k;
                    bVar3 = kmuVar3.a;
                    if ((bVar3 == null ? bVar3.f : null) == null) {
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = charSequence3;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = str6;
                    this.L$9 = str8;
                    this.L$10 = bitmap;
                    this.L$11 = str7;
                    this.L$12 = str9;
                    this.L$13 = list4;
                    this.L$14 = hmn0Var;
                    this.I$0 = i3;
                    this.label = 4;
                    k2 = nohVar.k(this);
                    if (k2 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i4 != 3) {
                if (i4 != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hmn0 hmn0Var3 = (hmn0) this.L$14;
                List list5 = (List) this.L$13;
                String str16 = (String) this.L$12;
                String str17 = (String) this.L$11;
                Bitmap bitmap3 = (Bitmap) this.L$10;
                String str18 = (String) this.L$9;
                String str19 = (String) this.L$8;
                charSequence4 = (CharSequence) this.L$4;
                kotlin.b.b(obj);
                hmn0Var2 = hmn0Var3;
                list = list5;
                bitmap = bitmap3;
                k2 = obj;
                str10 = str17;
                str11 = str18;
                str12 = str16;
                str13 = str19;
                return new imn0(str13, str11, bitmap, str10, str12, this.$screen, charSequence4, list, hmn0Var2, (gmn0) k2);
            }
            i3 = this.I$0;
            String str20 = (String) this.L$12;
            String str21 = (String) this.L$11;
            Bitmap bitmap4 = (Bitmap) this.L$10;
            String str22 = (String) this.L$9;
            String str23 = (String) this.L$8;
            nohVar = (noh) this.L$6;
            charSequence3 = (CharSequence) this.L$4;
            kmuVar3 = (kmu) this.L$3;
            kotlin.b.b(obj);
            str9 = str20;
            bitmap = bitmap4;
            str7 = str21;
            str6 = str23;
            str4 = "";
            str8 = str22;
            k = obj;
            List list42 = (List) k;
            bVar3 = kmuVar3.a;
            if ((bVar3 == null ? bVar3.f : null) == null) {
                String str24 = (bVar3 == null || (dVar3 = bVar3.f) == null) ? null : dVar3.a;
                if (str24 == null) {
                    str24 = str4;
                }
                String str25 = (bVar3 == null || (dVar2 = bVar3.f) == null) ? null : dVar2.b;
                if (str25 == null) {
                    str25 = str4;
                }
                String str26 = (bVar3 == null || (dVar = bVar3.f) == null) ? null : dVar.c;
                if (str26 == null) {
                    str26 = str4;
                }
                hmn0Var = new hmn0(str24, str25, str26);
            } else {
                hmn0Var = null;
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = charSequence3;
            this.L$5 = null;
            this.L$6 = null;
            this.L$7 = null;
            this.L$8 = str6;
            this.L$9 = str8;
            this.L$10 = bitmap;
            this.L$11 = str7;
            this.L$12 = str9;
            this.L$13 = list42;
            this.L$14 = hmn0Var;
            this.I$0 = i3;
            this.label = 4;
            k2 = nohVar.k(this);
            if (k2 != coroutineSingletons) {
                list = list42;
                str10 = str7;
                str11 = str8;
                str12 = str9;
                str13 = str6;
                charSequence4 = charSequence3;
                hmn0Var2 = hmn0Var;
                return new imn0(str13, str11, bitmap, str10, str12, this.$screen, charSequence4, list, hmn0Var2, (gmn0) k2);
            }
            return coroutineSingletons;
        }
        int i6 = this.I$0;
        kmuVar2 = (kmu) this.L$3;
        fefVar = (fef) this.L$1;
        kotlin.b.b(obj);
        intValue = i6;
        e = obj;
        charSequence = (CharSequence) e;
        kmuVar = kmuVar2;
        h = fefVar;
        h2 = tje.h(tseVar, null, null, new ScootersFinishInfoMapper$mapToFinishInfo$2$finishInfoItemsAsync$1(h, kmuVar, null, this.this$0), 3);
        qoh h32 = tje.h(tseVar, null, null, new ScootersFinishInfoMapper$mapToFinishInfo$2$rideStatistics$1(h, kmuVar, null, this.this$0), 3);
        qoh h42 = tje.h(tseVar, null, null, new ScootersFinishInfoMapper$mapToFinishInfo$2$vehicleImageAsync$1(this.$sessionState, this.this$0, null), 3);
        sessionId = this.$sessionState.getSessionId();
        aVar = kmuVar.b;
        if (aVar != null) {
        }
        str = "";
        this.L$0 = null;
        this.L$1 = h;
        this.L$2 = null;
        this.L$3 = kmuVar;
        this.L$4 = charSequence;
        this.L$5 = h2;
        this.L$6 = h32;
        this.L$7 = null;
        this.L$8 = sessionId;
        this.L$9 = str;
        this.I$0 = intValue;
        this.label = 2;
        s = h42.s(this);
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (s != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
