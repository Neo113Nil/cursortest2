package com.onesignal.notifications.internal.registration.impl;

import I7.p;
import S7.AbstractC0410y;
import S7.InterfaceC0408w;
import com.amazon.device.messaging.ADM;
import kotlin.jvm.internal.r;
import u7.v;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class d implements C5.b, c {
    private final x4.f _applicationService;
    private com.onesignal.common.threading.f waiter;

    public static final class a extends B7.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public a(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.registerForPush(this);
        }
    }

    public static final class b extends B7.h implements p {
        final /* synthetic */ r $registrationId;
        Object L$0;
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r rVar, d dVar, InterfaceC5240d interfaceC5240d) {
            super(2, interfaceC5240d);
            this.$registrationId = rVar;
            this.this$0 = dVar;
        }

        @Override // B7.a
        public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
            return new b(this.$registrationId, this.this$0, interfaceC5240d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
            return ((b) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(v.f41073a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            r rVar;
            String str;
            r rVar2;
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i == 0) {
                Q3.b.s(obj);
                rVar = this.$registrationId;
                com.onesignal.common.threading.f fVar = this.this$0.waiter;
                if (fVar == null) {
                    str = null;
                    rVar.f38644n = str;
                    return v.f41073a;
                }
                this.L$0 = rVar;
                this.label = 1;
                Object waitForWake = fVar.waitForWake(this);
                if (waitForWake == aVar) {
                    return aVar;
                }
                rVar2 = rVar;
                obj = waitForWake;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rVar2 = (r) this.L$0;
                Q3.b.s(obj);
            }
            r rVar3 = rVar2;
            str = (String) obj;
            rVar = rVar3;
            rVar.f38644n = str;
            return v.f41073a;
        }
    }

    public d(x4.f _applicationService) {
        kotlin.jvm.internal.h.e(_applicationService, "_applicationService");
        this._applicationService = _applicationService;
    }

    @Override // com.onesignal.notifications.internal.registration.impl.c
    public Object fireCallback(String str, InterfaceC5240d interfaceC5240d) {
        com.onesignal.common.threading.f fVar = this.waiter;
        if (fVar != null) {
            fVar.wake(str);
        }
        return v.f41073a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // C5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object registerForPush(InterfaceC5240d interfaceC5240d) {
        a aVar;
        int i;
        r rVar;
        if (interfaceC5240d instanceof a) {
            aVar = (a) interfaceC5240d;
            int i4 = aVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aVar.label = i4 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                A7.a aVar2 = A7.a.f215n;
                i = aVar.label;
                if (i != 0) {
                    Q3.b.s(obj);
                    this.waiter = new com.onesignal.common.threading.f();
                    ADM adm = new ADM(this._applicationService.getAppContext());
                    r rVar2 = new r();
                    String registrationId = adm.getRegistrationId();
                    rVar2.f38644n = registrationId;
                    if (registrationId != null) {
                        com.onesignal.debug.internal.logging.b.debug$default("ADM Already registered with ID:" + ((String) rVar2.f38644n), null, 2, null);
                        return new C5.a((String) rVar2.f38644n, Z5.f.SUBSCRIBED);
                    }
                    adm.startRegister();
                    b bVar = new b(rVar2, this, null);
                    aVar.L$0 = rVar2;
                    aVar.label = 1;
                    if (AbstractC0410y.z(30000L, bVar, aVar) == aVar2) {
                        return aVar2;
                    }
                    rVar = rVar2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar = (r) aVar.L$0;
                    Q3.b.s(obj);
                }
                if (rVar.f38644n != null) {
                    com.onesignal.debug.internal.logging.b.info$default("com.onesignal.ADMMessageHandler timed out, please check that your have the receiver, service, and your package name matches(NOTE: Case Sensitive) per the OneSignal instructions.", null, 2, null);
                    return new C5.a(null, Z5.f.ERROR);
                }
                com.onesignal.debug.internal.logging.b.debug$default("ADM registered with ID:" + ((String) rVar.f38644n), null, 2, null);
                return new C5.a((String) rVar.f38644n, Z5.f.SUBSCRIBED);
            }
        }
        aVar = new a(interfaceC5240d);
        Object obj2 = aVar.result;
        A7.a aVar22 = A7.a.f215n;
        i = aVar.label;
        if (i != 0) {
        }
        if (rVar.f38644n != null) {
        }
    }
}
