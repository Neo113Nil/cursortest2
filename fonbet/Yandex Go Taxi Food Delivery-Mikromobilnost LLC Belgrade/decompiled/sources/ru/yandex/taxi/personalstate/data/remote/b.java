package ru.yandex.taxi.personalstate.data.remote;

import androidx.media3.exoplayer.offline.DownloadService;
import com.yandex.go.zone.model.Zone;
import defpackage.as21;
import defpackage.ck;
import defpackage.cmt;
import defpackage.fwq;
import defpackage.g4z;
import defpackage.i3y;
import defpackage.i6b0;
import defpackage.iq90;
import defpackage.j7b0;
import defpackage.jst;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.on2;
import defpackage.pex0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tls;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.w511;
import defpackage.ww90;
import defpackage.y6b0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.personalstate.api.interactor.SavePersonalStateNotifier$SavePersonalStateReason;
import ru.yandex.taxi.personalstate.domain.interactor.PersonalStateFallback;

/* loaded from: classes9.dex */
public final class b {
    public final tt2 a;
    public final y6b0 b;
    public final as21 c;
    public final a d;
    public final i3y e;

    public b(on2 on2Var, tt2 tt2Var, y6b0 y6b0Var, as21 as21Var, a aVar) {
        this.a = tt2Var;
        this.b = y6b0Var;
        this.c = as21Var;
        this.d = aVar;
        this.e = kotlin.a.a(new ck(on2Var, 20));
    }

    public static String c(SavePersonalStateNotifier$SavePersonalStateReason savePersonalStateNotifier$SavePersonalStateReason) {
        switch (i6b0.a[savePersonalStateNotifier$SavePersonalStateReason.ordinal()]) {
            case 1:
                return "multiclass_classes";
            case 2:
                return "selected_tariff";
            case 3:
                return "comment";
            case 4:
                return DownloadService.KEY_REQUIREMENTS;
            case 5:
                return "order_composite";
            case 6:
                return "payment_method";
            case 7:
                return "summary_button_expand_card";
            default:
                w511.b();
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
    
        if (r9 != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, List list, ContinuationImpl continuationImpl) {
        PersonalStateApiRepository$load$1 personalStateApiRepository$load$1;
        int i;
        try {
            if (continuationImpl instanceof PersonalStateApiRepository$load$1) {
                personalStateApiRepository$load$1 = (PersonalStateApiRepository$load$1) continuationImpl;
                int i2 = personalStateApiRepository$load$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    personalStateApiRepository$load$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = personalStateApiRepository$load$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = personalStateApiRepository$load$1.label;
                    int i3 = 1;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        this.a.getClass();
                        sjh sjhVar = uyj.a;
                        mdh mdhVar = mdh.b;
                        PersonalStateApiRepository$load$2$param$1 personalStateApiRepository$load$2$param$1 = new PersonalStateApiRepository$load$2$param$1(this, str, list, null);
                        personalStateApiRepository$load$1.L$0 = null;
                        personalStateApiRepository$load$1.L$1 = null;
                        personalStateApiRepository$load$1.label = 1;
                        obj = tje.k0(mdhVar, personalStateApiRepository$load$2$param$1, personalStateApiRepository$load$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            j7b0 j7b0Var = (j7b0) obj;
                            if (j7b0Var.a) {
                                throw new PersonalStateFallback();
                            }
                            this.c.f(j7b0Var.c, "PERSONAL_STATE_LAST_REVISION_ID;");
                            this.d.d(new g4z(j7b0Var, i3));
                            return j7b0Var;
                        }
                        kotlin.b.b(obj);
                    }
                    cmt<j7b0> b = ((PersonalStateApi) this.e.getValue()).b((fwq) obj);
                    personalStateApiRepository$load$1.L$0 = null;
                    personalStateApiRepository$load$1.L$1 = null;
                    personalStateApiRepository$load$1.L$2 = null;
                    personalStateApiRepository$load$1.label = 2;
                    obj = ru.yandex.taxi.network.api.a.a(b, null, personalStateApiRepository$load$1);
                }
            }
            if (i != 0) {
            }
            cmt<j7b0> b2 = ((PersonalStateApi) this.e.getValue()).b((fwq) obj);
            personalStateApiRepository$load$1.L$0 = null;
            personalStateApiRepository$load$1.L$1 = null;
            personalStateApiRepository$load$1.L$2 = null;
            personalStateApiRepository$load$1.label = 2;
            obj = ru.yandex.taxi.network.api.a.a(b2, null, personalStateApiRepository$load$1);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, "PersonalState.Remote.Loading.Failed");
            throw th;
        }
        personalStateApiRepository$load$1 = new PersonalStateApiRepository$load$1(this, continuationImpl);
        Object obj2 = personalStateApiRepository$load$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = personalStateApiRepository$load$1.label;
        int i32 = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x012f A[Catch: all -> 0x0142, CancellationException -> 0x014b, TryCatch #2 {CancellationException -> 0x014b, all -> 0x0142, blocks: (B:13:0x005d, B:14:0x0129, B:16:0x012f, B:19:0x013c, B:20:0x0141, B:24:0x0096, B:26:0x00f6, B:31:0x00a0), top: B:8:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x013c A[Catch: all -> 0x0142, CancellationException -> 0x014b, TryCatch #2 {CancellationException -> 0x014b, all -> 0x0142, blocks: (B:13:0x005d, B:14:0x0129, B:16:0x012f, B:19:0x013c, B:20:0x0141, B:24:0x0096, B:26:0x00f6, B:31:0x00a0), top: B:8:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, Zone zone, pex0 pex0Var, String str2, String str3, Map map, LinkedHashMap linkedHashMap, Set set, boolean z, SavePersonalStateNotifier$SavePersonalStateReason savePersonalStateNotifier$SavePersonalStateReason, String str4, ContinuationImpl continuationImpl) {
        PersonalStateApiRepository$save$1 personalStateApiRepository$save$1;
        Object obj;
        int i;
        tls tlsVar;
        boolean z2;
        CoroutineSingletons coroutineSingletons;
        String str5;
        String str6;
        j7b0 j7b0Var;
        try {
            if (continuationImpl instanceof PersonalStateApiRepository$save$1) {
                personalStateApiRepository$save$1 = (PersonalStateApiRepository$save$1) continuationImpl;
                int i2 = personalStateApiRepository$save$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    personalStateApiRepository$save$1.label = i2 - Integer.MIN_VALUE;
                    PersonalStateApiRepository$save$1 personalStateApiRepository$save$12 = personalStateApiRepository$save$1;
                    obj = personalStateApiRepository$save$12.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = personalStateApiRepository$save$12.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        String c = c(savePersonalStateNotifier$SavePersonalStateReason);
                        this.a.getClass();
                        sjh sjhVar = uyj.a;
                        mdh mdhVar = mdh.b;
                        tlsVar = null;
                        PersonalStateApiRepository$save$2$param$1 personalStateApiRepository$save$2$param$1 = new PersonalStateApiRepository$save$2$param$1(this, str, zone, pex0Var, str2, str3, map, linkedHashMap, set, z, str4, c, null);
                        personalStateApiRepository$save$12.L$0 = null;
                        personalStateApiRepository$save$12.L$1 = null;
                        personalStateApiRepository$save$12.L$2 = null;
                        personalStateApiRepository$save$12.L$3 = null;
                        personalStateApiRepository$save$12.L$4 = null;
                        personalStateApiRepository$save$12.L$5 = null;
                        personalStateApiRepository$save$12.L$6 = null;
                        personalStateApiRepository$save$12.L$7 = null;
                        personalStateApiRepository$save$12.L$8 = null;
                        personalStateApiRepository$save$12.L$9 = null;
                        personalStateApiRepository$save$12.L$10 = c;
                        z2 = z;
                        personalStateApiRepository$save$12.Z$0 = z2;
                        personalStateApiRepository$save$12.label = 1;
                        obj = tje.k0(mdhVar, personalStateApiRepository$save$2$param$1, personalStateApiRepository$save$12);
                        coroutineSingletons = coroutineSingletons2;
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        str5 = c;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            str6 = (String) personalStateApiRepository$save$12.L$10;
                            kotlin.b.b(obj);
                            j7b0Var = (j7b0) obj;
                            if (!j7b0Var.a) {
                                throw new PersonalStateFallback();
                            }
                            this.d.e(new ww90(11, j7b0Var, str6));
                            return j7b0Var;
                        }
                        boolean z3 = personalStateApiRepository$save$12.Z$0;
                        str5 = (String) personalStateApiRepository$save$12.L$10;
                        kotlin.b.b(obj);
                        z2 = z3;
                        coroutineSingletons = coroutineSingletons2;
                        tlsVar = null;
                    }
                    cmt<j7b0> a = ((PersonalStateApi) this.e.getValue()).a((iq90) obj);
                    personalStateApiRepository$save$12.L$0 = tlsVar;
                    personalStateApiRepository$save$12.L$1 = tlsVar;
                    personalStateApiRepository$save$12.L$2 = tlsVar;
                    personalStateApiRepository$save$12.L$3 = tlsVar;
                    personalStateApiRepository$save$12.L$4 = tlsVar;
                    personalStateApiRepository$save$12.L$5 = tlsVar;
                    personalStateApiRepository$save$12.L$6 = tlsVar;
                    personalStateApiRepository$save$12.L$7 = tlsVar;
                    personalStateApiRepository$save$12.L$8 = tlsVar;
                    personalStateApiRepository$save$12.L$9 = tlsVar;
                    personalStateApiRepository$save$12.L$10 = str5;
                    personalStateApiRepository$save$12.L$11 = tlsVar;
                    personalStateApiRepository$save$12.Z$0 = z2;
                    personalStateApiRepository$save$12.label = 2;
                    obj = ru.yandex.taxi.network.api.a.a(a, tlsVar, personalStateApiRepository$save$12);
                    if (obj != coroutineSingletons) {
                        str6 = str5;
                        j7b0Var = (j7b0) obj;
                        if (!j7b0Var.a) {
                        }
                    }
                    return coroutineSingletons;
                }
            }
            if (i != 0) {
            }
            cmt<j7b0> a2 = ((PersonalStateApi) this.e.getValue()).a((iq90) obj);
            personalStateApiRepository$save$12.L$0 = tlsVar;
            personalStateApiRepository$save$12.L$1 = tlsVar;
            personalStateApiRepository$save$12.L$2 = tlsVar;
            personalStateApiRepository$save$12.L$3 = tlsVar;
            personalStateApiRepository$save$12.L$4 = tlsVar;
            personalStateApiRepository$save$12.L$5 = tlsVar;
            personalStateApiRepository$save$12.L$6 = tlsVar;
            personalStateApiRepository$save$12.L$7 = tlsVar;
            personalStateApiRepository$save$12.L$8 = tlsVar;
            personalStateApiRepository$save$12.L$9 = tlsVar;
            personalStateApiRepository$save$12.L$10 = str5;
            personalStateApiRepository$save$12.L$11 = tlsVar;
            personalStateApiRepository$save$12.Z$0 = z2;
            personalStateApiRepository$save$12.label = 2;
            obj = ru.yandex.taxi.network.api.a.a(a2, tlsVar, personalStateApiRepository$save$12);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, "PersonalState.Remote.Saving.Failed");
            throw th;
        }
        personalStateApiRepository$save$1 = new PersonalStateApiRepository$save$1(this, continuationImpl);
        PersonalStateApiRepository$save$1 personalStateApiRepository$save$122 = personalStateApiRepository$save$1;
        obj = personalStateApiRepository$save$122.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = personalStateApiRepository$save$122.label;
    }
}
