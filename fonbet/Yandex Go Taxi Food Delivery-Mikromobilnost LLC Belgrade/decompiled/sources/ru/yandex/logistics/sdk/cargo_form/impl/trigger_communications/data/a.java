package ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.data;

import com.squareup.moshi.Moshi;
import defpackage.a4z;
import defpackage.b4;
import defpackage.c4z;
import defpackage.dnm0;
import defpackage.etc;
import defpackage.jbe;
import defpackage.ny61;
import defpackage.oe11;
import defpackage.onm0;
import defpackage.pe11;
import defpackage.pnm0;
import defpackage.tcc;
import defpackage.te11;
import defpackage.v5z0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.z3z;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.domain.model.ContactPolicyType;
import ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_trigger_communications.CommunicationWindowDto;
import ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_trigger_communications.DeliveryTriggerCommunicationsDto;
import ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_trigger_communications.LocalNotificationDto;
import ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_trigger_communications.TimeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.TypedConfigsDto;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ te11 b;

    public a(vpr vprVar, te11 te11Var) {
        this.a = vprVar;
        this.b = te11Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x023c A[RETURN] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v6, types: [mza1] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.ArrayList] */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TriggerCommunicationsConfigRepository$configFlow$$inlined$map$1$2$1 triggerCommunicationsConfigRepository$configFlow$$inlined$map$1$2$1;
        int i;
        z3z z3zVar;
        oe11 oe11Var;
        Object obj2;
        z3z z3zVar2;
        b4 b4Var;
        EmptyList emptyList;
        ?? r14;
        ?? r142;
        z3z z3zVar3;
        ContactPolicyType contactPolicyType;
        String str;
        String str2;
        String str3;
        if (continuation instanceof TriggerCommunicationsConfigRepository$configFlow$$inlined$map$1$2$1) {
            triggerCommunicationsConfigRepository$configFlow$$inlined$map$1$2$1 = (TriggerCommunicationsConfigRepository$configFlow$$inlined$map$1$2$1) continuation;
            int i2 = triggerCommunicationsConfigRepository$configFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                triggerCommunicationsConfigRepository$configFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = triggerCommunicationsConfigRepository$configFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = triggerCommunicationsConfigRepository$configFlow$$inlined$map$1$2$1.label;
                z3z z3zVar4 = null;
                if (i != 0) {
                    b.b(obj3);
                    TypedConfigsDto.ItemsDto itemsDto = (TypedConfigsDto.ItemsDto) obj;
                    if (itemsDto != null) {
                        te11 te11Var = this.b;
                        Moshi moshi = te11Var.c;
                        try {
                            obj2 = moshi.adapter(DeliveryTriggerCommunicationsDto.class).fromJson(moshi.adapter(Object.class).toJson(itemsDto.getValue()));
                        } catch (Exception unused) {
                            obj2 = null;
                        }
                        DeliveryTriggerCommunicationsDto deliveryTriggerCommunicationsDto = (DeliveryTriggerCommunicationsDto) obj2;
                        if (deliveryTriggerCommunicationsDto != null) {
                            te11Var.b.getClass();
                            Boolean enabled = deliveryTriggerCommunicationsDto.getEnabled();
                            boolean booleanValue = enabled != null ? enabled.booleanValue() : false;
                            DeliveryTriggerCommunicationsDto.AbandonedCartDto abandonedCart = deliveryTriggerCommunicationsDto.getAbandonedCart();
                            if (abandonedCart != null) {
                                List<LocalNotificationDto> localNotifications = abandonedCart.getLocalNotifications();
                                if (localNotifications != null) {
                                    ?? arrayList = new ArrayList();
                                    for (LocalNotificationDto localNotificationDto : localNotifications) {
                                        List<String> modes = localNotificationDto.getTriggers().getModes();
                                        List<LocalNotificationDto.TriggersDto.EntryPointsDto> entryPoints = localNotificationDto.getTriggers().getEntryPoints();
                                        if (entryPoints != null) {
                                            List<LocalNotificationDto.TriggersDto.EntryPointsDto> list = entryPoints;
                                            r14 = new ArrayList(tcc.n(list, 10));
                                            Iterator it = list.iterator();
                                            while (it.hasNext()) {
                                                int i3 = pe11.a[((LocalNotificationDto.TriggersDto.EntryPointsDto) it.next()).ordinal()];
                                                if (i3 == 1) {
                                                    str3 = "pult";
                                                } else {
                                                    if (i3 != 2) {
                                                        w511.b();
                                                        return z3zVar4;
                                                    }
                                                    str3 = "summary";
                                                }
                                                r14.add(str3);
                                            }
                                        } else {
                                            r14 = z3zVar4;
                                        }
                                        c4z c4zVar = new c4z(modes, r14, localNotificationDto.getTriggers().getRequirePointA(), localNotificationDto.getTriggers().getRequirePointB(), localNotificationDto.getTriggers().isPvzPoints());
                                        String deeplink = localNotificationDto.getDeeplink();
                                        LocalNotificationDto.ScheduleDto.StrategyDto strategy = localNotificationDto.getSchedule().getStrategy();
                                        if (strategy instanceof LocalNotificationDto.ScheduleDto.StrategyDto.Strategy_DelayDto) {
                                            r142 = new onm0(((LocalNotificationDto.ScheduleDto.StrategyDto.Strategy_DelayDto) strategy).b.getDelayMinutes());
                                        } else if (strategy instanceof LocalNotificationDto.ScheduleDto.StrategyDto.Strategy_FixedTimeDto) {
                                            TimeDto time = ((LocalNotificationDto.ScheduleDto.StrategyDto.Strategy_FixedTimeDto) strategy).b.getTime();
                                            r142 = new pnm0(new v5z0(time.getHours(), time.getMinutes()));
                                        } else {
                                            if (!(strategy instanceof LocalNotificationDto.ScheduleDto.StrategyDto.Unknown_StrategyDto)) {
                                                z3z z3zVar5 = z3zVar4;
                                                w511.b();
                                                return z3zVar5;
                                            }
                                            r142 = z3zVar4;
                                        }
                                        if (r142 == 0) {
                                            z3zVar3 = z3zVar4;
                                        } else {
                                            CommunicationWindowDto communicationWindow = localNotificationDto.getSchedule().getCommunicationWindow();
                                            TimeDto startTime = communicationWindow.getStartTime();
                                            z3zVar3 = z3zVar4;
                                            v5z0 v5z0Var = new v5z0(startTime.getHours(), startTime.getMinutes());
                                            TimeDto endTime = communicationWindow.getEndTime();
                                            dnm0 dnm0Var = new dnm0(r142, new etc(v5z0Var, new v5z0(endTime.getHours(), endTime.getMinutes())));
                                            int i4 = pe11.b[localNotificationDto.getContactPolicy().getType().ordinal()];
                                            if (i4 == 1) {
                                                contactPolicyType = ContactPolicyType.MINUTES;
                                            } else if (i4 == 2) {
                                                contactPolicyType = ContactPolicyType.HOURS;
                                            } else {
                                                if (i4 != 3) {
                                                    w511.b();
                                                    return z3zVar3;
                                                }
                                                contactPolicyType = ContactPolicyType.DAYS;
                                            }
                                            jbe jbeVar = new jbe(contactPolicyType, localNotificationDto.getContactPolicy().getValue());
                                            String title = localNotificationDto.getBody().getTitle();
                                            Map<String, String> l10n = deliveryTriggerCommunicationsDto.getL10n();
                                            String str4 = "";
                                            if (l10n == null || (str = l10n.get(title)) == null) {
                                                str = "";
                                            }
                                            String subtitle = localNotificationDto.getBody().getSubtitle();
                                            Map<String, String> l10n2 = deliveryTriggerCommunicationsDto.getL10n();
                                            if (l10n2 != null && (str2 = l10n2.get(subtitle)) != null) {
                                                str4 = str2;
                                            }
                                            z3zVar4 = new z3z(c4zVar, deeplink, dnm0Var, jbeVar, new a4z(str, str4), localNotificationDto.getMetricaContext());
                                        }
                                        if (z3zVar4 != null) {
                                            arrayList.add(z3zVar4);
                                        }
                                        z3zVar4 = z3zVar3;
                                    }
                                    z3zVar2 = z3zVar4;
                                    emptyList = arrayList;
                                } else {
                                    z3zVar2 = null;
                                    emptyList = EmptyList.a;
                                }
                                b4Var = new b4(emptyList);
                            } else {
                                z3zVar2 = null;
                                b4Var = null;
                            }
                            oe11Var = new oe11(booleanValue, b4Var);
                            z3zVar = z3zVar2;
                            triggerCommunicationsConfigRepository$configFlow$$inlined$map$1$2$1.L$0 = z3zVar;
                            triggerCommunicationsConfigRepository$configFlow$$inlined$map$1$2$1.L$1 = z3zVar;
                            triggerCommunicationsConfigRepository$configFlow$$inlined$map$1$2$1.L$2 = z3zVar;
                            triggerCommunicationsConfigRepository$configFlow$$inlined$map$1$2$1.L$3 = z3zVar;
                            triggerCommunicationsConfigRepository$configFlow$$inlined$map$1$2$1.I$0 = 0;
                            triggerCommunicationsConfigRepository$configFlow$$inlined$map$1$2$1.label = 1;
                            if (this.a.emit(oe11Var, triggerCommunicationsConfigRepository$configFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    z3zVar = null;
                    oe11Var = null;
                    triggerCommunicationsConfigRepository$configFlow$$inlined$map$1$2$1.L$0 = z3zVar;
                    triggerCommunicationsConfigRepository$configFlow$$inlined$map$1$2$1.L$1 = z3zVar;
                    triggerCommunicationsConfigRepository$configFlow$$inlined$map$1$2$1.L$2 = z3zVar;
                    triggerCommunicationsConfigRepository$configFlow$$inlined$map$1$2$1.L$3 = z3zVar;
                    triggerCommunicationsConfigRepository$configFlow$$inlined$map$1$2$1.I$0 = 0;
                    triggerCommunicationsConfigRepository$configFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(oe11Var, triggerCommunicationsConfigRepository$configFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj3);
                }
                return zy11.a;
            }
        }
        triggerCommunicationsConfigRepository$configFlow$$inlined$map$1$2$1 = new TriggerCommunicationsConfigRepository$configFlow$$inlined$map$1$2$1(this, continuation);
        Object obj32 = triggerCommunicationsConfigRepository$configFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = triggerCommunicationsConfigRepository$configFlow$$inlined$map$1$2$1.label;
        z3z z3zVar42 = null;
        if (i != 0) {
        }
        return zy11.a;
    }
}
