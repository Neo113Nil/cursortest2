package ru.yandex.taxi.logistics.sdk.delivery.events.data;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.an2;
import defpackage.ath;
import defpackage.bth;
import defpackage.cth;
import defpackage.dth;
import defpackage.eth;
import defpackage.fth;
import defpackage.fw7;
import defpackage.go2;
import defpackage.gth;
import defpackage.ho2;
import defpackage.hth;
import defpackage.io2;
import defpackage.ith;
import defpackage.jgz;
import defpackage.jth;
import defpackage.kej;
import defpackage.kth;
import defpackage.lth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r7i;
import defpackage.rsh;
import defpackage.ssh;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.tse;
import defpackage.tsh;
import defpackage.u7i;
import defpackage.ush;
import defpackage.vpr;
import defpackage.vsh;
import defpackage.w511;
import defpackage.wls;
import defpackage.wsh;
import defpackage.xsh;
import defpackage.ysh;
import defpackage.zsh;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.CancelMessageDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.MultiorderDialogDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.AiPostcardFailedDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.AiPostcardGeneratedDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.AiPostcardRequestedDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.AiPostcardSubmittedDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.DefaultDeliveryEventDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.DefaultDeliveryFailureEventDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.EventDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.OrderCancelEventDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.OrderCancelFailedDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.OrderEditDialogEventDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.OrderEditSucceededDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.OrderPayNowEventDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.OrderPayNowFailedDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.RoverActionEventDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.RoverActionFailedDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveriesevents.DeliveriesEventsRequestDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveriesevents.Responses$DeliveriesEventsResponseDto;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Llth;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.delivery.events.data.DeliveryEventsSourceImpl$flow$2$1", f = "DeliveryEventsSourceImpl.kt", l = {43, 45, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE, 62}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryEventsSourceImpl$flow$2$1 extends SuspendLambda implements wls {
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ u7i this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/Object;"}, k = 3, mv = {2, 3, 0})
    @mvg(c = "ru.yandex.taxi.logistics.sdk.delivery.events.data.DeliveryEventsSourceImpl$flow$2$1$4", f = "DeliveryEventsSourceImpl.kt", l = {65}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.logistics.sdk.delivery.events.data.DeliveryEventsSourceImpl$flow$2$1$4, reason: invalid class name */
    final class AnonymousClass4 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ u7i this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(u7i u7iVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = u7iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass4) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    kotlin.b.b(obj);
                    return obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            tpr tprVar = (tpr) this.this$0.g.getValue();
            this.label = 1;
            Object y = e.y(tprVar, this);
            return y == coroutineSingletons ? coroutineSingletons : y;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryEventsSourceImpl$flow$2$1(u7i u7iVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = u7iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeliveryEventsSourceImpl$flow$2$1 deliveryEventsSourceImpl$flow$2$1 = new DeliveryEventsSourceImpl$flow$2$1(this.this$0, continuation);
        deliveryEventsSourceImpl$flow$2$1.L$0 = obj;
        return deliveryEventsSourceImpl$flow$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveryEventsSourceImpl$flow$2$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006a, code lost:
    
        if (ru.yandex.taxi.logistics.sdk.ui.a.a(r3, r22) != r2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0099, code lost:
    
        if (r3 == r2) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x03da, code lost:
    
        if (kotlinx.coroutines.a.w(r3, r6, r22) == r2) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03dc, code lost:
    
        return r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03bb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x03da -> B:8:0x03dd). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        io2 io2Var;
        char c;
        io2 io2Var2;
        Iterator it;
        int i;
        Object obj2;
        lth lthVar;
        lth rshVar;
        lth tshVar;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        int i3 = 2;
        int i4 = 1;
        if (i2 == 0) {
            kotlin.b.b(obj);
            AppVisibilitySubscriptionImpl appVisibilitySubscriptionImpl = this.this$0.c;
            this.L$0 = vprVar;
            this.L$1 = null;
            this.L$2 = null;
            this.label = i4;
        } else if (i2 == 1) {
            kotlin.b.b(obj);
            an2<Responses$DeliveriesEventsResponseDto> a = ((DeliveryEventsApi) this.this$0.a.get()).a(new DeliveriesEventsRequestDto((String) this.this$0.h.get()));
            this.L$0 = vprVar;
            this.L$1 = null;
            this.label = i3;
            ru.yandex.taxi.logistics.sdk.network.b bVar = (ru.yandex.taxi.logistics.sdk.network.b) a;
            obj2 = bVar.e(bVar.a, this);
        } else if (i2 == 2) {
            kotlin.b.b(obj);
            obj2 = obj;
            io2Var = (io2) obj2;
            if (io2Var instanceof ho2) {
                AtomicReference atomicReference = this.this$0.h;
                Responses$DeliveriesEventsResponseDto responses$DeliveriesEventsResponseDto = (Responses$DeliveriesEventsResponseDto) ((ho2) io2Var).a;
                atomicReference.set(responses$DeliveriesEventsResponseDto.getRevision());
                List<EventDto> events = responses$DeliveriesEventsResponseDto.getEvents();
                u7i u7iVar = this.this$0;
                for (EventDto eventDto : events) {
                    u7iVar.getClass();
                    String str = "Event: " + eventDto.getA() + Extension.FIX_SPACE + eventDto + " ";
                    jgz.a.h("u7i");
                    jgz.a(str, new Object[0]);
                }
                u7i u7iVar2 = this.this$0;
                ArrayList arrayList = new ArrayList(tcc.n(events, 10));
                for (EventDto eventDto2 : events) {
                    r7i r7iVar = u7iVar2.b;
                    kej kejVar = r7iVar.b;
                    if (eventDto2 instanceof EventDto.Event_OrderCreateRequestedDto) {
                        EventDto.Event_OrderCreateRequestedDto event_OrderCreateRequestedDto = (EventDto.Event_OrderCreateRequestedDto) eventDto2;
                        DefaultDeliveryEventDto defaultDeliveryEventDto = event_OrderCreateRequestedDto.b;
                        lthVar = new zsh(event_OrderCreateRequestedDto.a, defaultDeliveryEventDto.getDeliveryId(), defaultDeliveryEventDto.getCommitRevision());
                    } else if (eventDto2 instanceof EventDto.Event_OrderCreateSucceededDto) {
                        EventDto.Event_OrderCreateSucceededDto event_OrderCreateSucceededDto = (EventDto.Event_OrderCreateSucceededDto) eventDto2;
                        DefaultDeliveryEventDto defaultDeliveryEventDto2 = event_OrderCreateSucceededDto.b;
                        lthVar = new ath(defaultDeliveryEventDto2.getCommitRevision(), event_OrderCreateSucceededDto.a, defaultDeliveryEventDto2.getDeliveryId(), defaultDeliveryEventDto2.getWebTrackingUrl());
                    } else if (eventDto2 instanceof EventDto.Event_OrderCreateFailedDto) {
                        EventDto.Event_OrderCreateFailedDto event_OrderCreateFailedDto = (EventDto.Event_OrderCreateFailedDto) eventDto2;
                        DefaultDeliveryFailureEventDto defaultDeliveryFailureEventDto = event_OrderCreateFailedDto.b;
                        lthVar = new ysh(event_OrderCreateFailedDto.a, defaultDeliveryFailureEventDto.getDeliveryId(), defaultDeliveryFailureEventDto.getFailureDescription(), defaultDeliveryFailureEventDto.getCommitRevision());
                    } else if (eventDto2 instanceof EventDto.Event_OrderCancelRequestedDto) {
                        EventDto.Event_OrderCancelRequestedDto event_OrderCancelRequestedDto = (EventDto.Event_OrderCancelRequestedDto) eventDto2;
                        lthVar = new wsh(event_OrderCancelRequestedDto.a, event_OrderCancelRequestedDto.b.getDeliveryId());
                    } else if (eventDto2 instanceof EventDto.Event_OrderCancelSucceededDto) {
                        EventDto.Event_OrderCancelSucceededDto event_OrderCancelSucceededDto = (EventDto.Event_OrderCancelSucceededDto) eventDto2;
                        OrderCancelEventDto orderCancelEventDto = event_OrderCancelSucceededDto.b;
                        lthVar = new xsh(event_OrderCancelSucceededDto.a, orderCancelEventDto.getRequestId(), orderCancelEventDto.getDeliveryId());
                    } else if (eventDto2 instanceof EventDto.Event_OrderCancelFailedDto) {
                        EventDto.Event_OrderCancelFailedDto event_OrderCancelFailedDto = (EventDto.Event_OrderCancelFailedDto) eventDto2;
                        OrderCancelFailedDto orderCancelFailedDto = event_OrderCancelFailedDto.b;
                        String str2 = event_OrderCancelFailedDto.a;
                        String requestId = orderCancelFailedDto.getRequestId();
                        String deliveryId = orderCancelFailedDto.getDeliveryId();
                        fw7 fw7Var = r7iVar.a;
                        CancelMessageDto message = orderCancelFailedDto.getMessage();
                        fw7Var.getClass();
                        lthVar = new vsh(str2, requestId, deliveryId, fw7.a(message));
                    } else {
                        if (eventDto2 instanceof EventDto.Event_OrderEditSubmittedDto) {
                            EventDto.Event_OrderEditSubmittedDto event_OrderEditSubmittedDto = (EventDto.Event_OrderEditSubmittedDto) eventDto2;
                            OrderEditDialogEventDto orderEditDialogEventDto = event_OrderEditSubmittedDto.b;
                            String str3 = event_OrderEditSubmittedDto.a;
                            String requestId2 = orderEditDialogEventDto.getRequestId();
                            String deliveryId2 = orderEditDialogEventDto.getDeliveryId();
                            MultiorderDialogDto dialog = orderEditDialogEventDto.getDialog();
                            tshVar = new cth(str3, requestId2, deliveryId2, dialog != null ? kejVar.a(dialog) : null);
                        } else if (eventDto2 instanceof EventDto.Event_OrderEditFailedDto) {
                            EventDto.Event_OrderEditFailedDto event_OrderEditFailedDto = (EventDto.Event_OrderEditFailedDto) eventDto2;
                            OrderEditDialogEventDto orderEditDialogEventDto2 = event_OrderEditFailedDto.b;
                            String str4 = event_OrderEditFailedDto.a;
                            String requestId3 = orderEditDialogEventDto2.getRequestId();
                            String deliveryId3 = orderEditDialogEventDto2.getDeliveryId();
                            MultiorderDialogDto dialog2 = orderEditDialogEventDto2.getDialog();
                            tshVar = new bth(str4, requestId3, deliveryId3, dialog2 != null ? kejVar.a(dialog2) : null);
                        } else if (eventDto2 instanceof EventDto.Event_OrderEditSucceededDto) {
                            EventDto.Event_OrderEditSucceededDto event_OrderEditSucceededDto = (EventDto.Event_OrderEditSucceededDto) eventDto2;
                            OrderEditSucceededDto orderEditSucceededDto = event_OrderEditSucceededDto.b;
                            lthVar = new dth(event_OrderEditSucceededDto.a, orderEditSucceededDto.getRequestId(), orderEditSucceededDto.getDeliveryId());
                        } else if (eventDto2 instanceof EventDto.Event_OrderPayNowRequestedDto) {
                            EventDto.Event_OrderPayNowRequestedDto event_OrderPayNowRequestedDto = (EventDto.Event_OrderPayNowRequestedDto) eventDto2;
                            OrderPayNowEventDto orderPayNowEventDto = event_OrderPayNowRequestedDto.b;
                            lthVar = new fth(event_OrderPayNowRequestedDto.a, orderPayNowEventDto.getDeliveryId(), orderPayNowEventDto.getRequestId());
                        } else if (eventDto2 instanceof EventDto.Event_OrderPayNowSucceededDto) {
                            EventDto.Event_OrderPayNowSucceededDto event_OrderPayNowSucceededDto = (EventDto.Event_OrderPayNowSucceededDto) eventDto2;
                            OrderPayNowEventDto orderPayNowEventDto2 = event_OrderPayNowSucceededDto.b;
                            lthVar = new gth(event_OrderPayNowSucceededDto.a, orderPayNowEventDto2.getRequestId(), orderPayNowEventDto2.getDeliveryId());
                        } else if (eventDto2 instanceof EventDto.Event_OrderPayNowFailedDto) {
                            EventDto.Event_OrderPayNowFailedDto event_OrderPayNowFailedDto = (EventDto.Event_OrderPayNowFailedDto) eventDto2;
                            OrderPayNowFailedDto orderPayNowFailedDto = event_OrderPayNowFailedDto.b;
                            String str5 = event_OrderPayNowFailedDto.a;
                            String requestId4 = orderPayNowFailedDto.getRequestId();
                            String deliveryId4 = orderPayNowFailedDto.getDeliveryId();
                            MultiorderDialogDto dialog3 = orderPayNowFailedDto.getDialog();
                            tshVar = new eth(str5, requestId4, deliveryId4, dialog3 != null ? kejVar.a(dialog3) : null);
                        } else {
                            if (eventDto2 instanceof EventDto.Event_RoverActionFailedDto) {
                                EventDto.Event_RoverActionFailedDto event_RoverActionFailedDto = (EventDto.Event_RoverActionFailedDto) eventDto2;
                                RoverActionFailedDto roverActionFailedDto = event_RoverActionFailedDto.b;
                                String str6 = event_RoverActionFailedDto.a;
                                String requestId5 = roverActionFailedDto.getRequestId();
                                String deliveryId5 = roverActionFailedDto.getDeliveryId();
                                String action = roverActionFailedDto.getAction();
                                MultiorderDialogDto dialog4 = roverActionFailedDto.getDialog();
                                rshVar = new hth(str6, deliveryId5, requestId5, action, dialog4 != null ? kejVar.a(dialog4) : null);
                            } else if (eventDto2 instanceof EventDto.Event_RoverActionRequestedDto) {
                                EventDto.Event_RoverActionRequestedDto event_RoverActionRequestedDto = (EventDto.Event_RoverActionRequestedDto) eventDto2;
                                RoverActionEventDto roverActionEventDto = event_RoverActionRequestedDto.b;
                                tshVar = new ith(event_RoverActionRequestedDto.a, roverActionEventDto.getDeliveryId(), roverActionEventDto.getRequestId(), roverActionEventDto.getAction());
                            } else if (eventDto2 instanceof EventDto.Event_RoverActionSucceededDto) {
                                EventDto.Event_RoverActionSucceededDto event_RoverActionSucceededDto = (EventDto.Event_RoverActionSucceededDto) eventDto2;
                                RoverActionEventDto roverActionEventDto2 = event_RoverActionSucceededDto.b;
                                tshVar = new jth(event_RoverActionSucceededDto.a, roverActionEventDto2.getDeliveryId(), roverActionEventDto2.getRequestId(), roverActionEventDto2.getAction());
                            } else if (eventDto2 instanceof EventDto.Event_AiPostcardGeneratedDto) {
                                EventDto.Event_AiPostcardGeneratedDto event_AiPostcardGeneratedDto = (EventDto.Event_AiPostcardGeneratedDto) eventDto2;
                                AiPostcardGeneratedDto aiPostcardGeneratedDto = event_AiPostcardGeneratedDto.b;
                                rshVar = new ssh(event_AiPostcardGeneratedDto.a, aiPostcardGeneratedDto.getDeliveryId(), aiPostcardGeneratedDto.getRequestId(), aiPostcardGeneratedDto.getGenerationId(), aiPostcardGeneratedDto.getResultUrl());
                            } else if (eventDto2 instanceof EventDto.Event_AiPostcardSubmittedDto) {
                                EventDto.Event_AiPostcardSubmittedDto event_AiPostcardSubmittedDto = (EventDto.Event_AiPostcardSubmittedDto) eventDto2;
                                AiPostcardSubmittedDto aiPostcardSubmittedDto = event_AiPostcardSubmittedDto.b;
                                lthVar = new ush(event_AiPostcardSubmittedDto.a, aiPostcardSubmittedDto.getDeliveryId(), aiPostcardSubmittedDto.getRequestId());
                            } else if (eventDto2 instanceof EventDto.Event_AiPostcardRequestedDto) {
                                EventDto.Event_AiPostcardRequestedDto event_AiPostcardRequestedDto = (EventDto.Event_AiPostcardRequestedDto) eventDto2;
                                AiPostcardRequestedDto aiPostcardRequestedDto = event_AiPostcardRequestedDto.b;
                                tshVar = new tsh(event_AiPostcardRequestedDto.a, aiPostcardRequestedDto.getDeliveryId(), aiPostcardRequestedDto.getRequestId(), aiPostcardRequestedDto.getGenerationId());
                            } else if (eventDto2 instanceof EventDto.Event_AiPostcardFailedDto) {
                                EventDto.Event_AiPostcardFailedDto event_AiPostcardFailedDto = (EventDto.Event_AiPostcardFailedDto) eventDto2;
                                AiPostcardFailedDto aiPostcardFailedDto = event_AiPostcardFailedDto.b;
                                rshVar = new rsh(event_AiPostcardFailedDto.a, aiPostcardFailedDto.getDeliveryId(), aiPostcardFailedDto.getRequestId(), aiPostcardFailedDto.getGenerationId(), aiPostcardFailedDto.getFailureReason());
                            } else {
                                boolean z = eventDto2 instanceof EventDto.Unknown_EventDto;
                                lthVar = kth.a;
                                if (!z && !(eventDto2 instanceof EventDto.Event_RoverActionSubmittedDto)) {
                                    w511.b();
                                    return null;
                                }
                            }
                            lthVar = rshVar;
                        }
                        lthVar = tshVar;
                    }
                    arrayList.add(lthVar);
                }
                Iterator it2 = arrayList.iterator();
                io2Var2 = io2Var;
                it = it2;
                i = 0;
                while (it.hasNext()) {
                }
                io2Var = io2Var2;
                Long l = io2Var.a().a;
                if (l != null) {
                }
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, null);
                this.L$0 = vprVar;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                c = 4;
                this.label = 4;
            } else {
                if (!(io2Var instanceof go2)) {
                    w511.b();
                    return null;
                }
                Long l2 = io2Var.a().a;
                if (l2 != null) {
                }
                AnonymousClass4 anonymousClass42 = new AnonymousClass4(this.this$0, null);
                this.L$0 = vprVar;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                c = 4;
                this.label = 4;
            }
        } else if (i2 == 3) {
            i = this.I$0;
            it = (Iterator) this.L$4;
            io2Var2 = (io2) this.L$2;
            kotlin.b.b(obj);
            while (it.hasNext()) {
                lth lthVar2 = (lth) it.next();
                this.L$0 = vprVar;
                this.L$1 = null;
                this.L$2 = io2Var2;
                this.L$3 = null;
                this.L$4 = it;
                this.L$5 = null;
                this.L$6 = null;
                this.I$0 = i;
                this.I$1 = 0;
                this.label = 3;
                if (vprVar.emit(lthVar2, this) == coroutineSingletons) {
                    break;
                }
            }
            io2Var = io2Var2;
            Long l22 = io2Var.a().a;
            long longValue = l22 != null ? l22.longValue() : 60000L;
            AnonymousClass4 anonymousClass422 = new AnonymousClass4(this.this$0, null);
            this.L$0 = vprVar;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            c = 4;
            this.label = 4;
        } else {
            if (i2 != 4) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            c = 4;
            i3 = 2;
            i4 = 1;
            AppVisibilitySubscriptionImpl appVisibilitySubscriptionImpl2 = this.this$0.c;
            this.L$0 = vprVar;
            this.L$1 = null;
            this.L$2 = null;
            this.label = i4;
        }
    }
}
