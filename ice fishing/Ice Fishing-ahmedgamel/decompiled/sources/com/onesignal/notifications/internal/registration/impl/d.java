package com.onesignal.notifications.internal.registration.impl;

import I7.p;
import S7.AbstractC0406y;
import S7.InterfaceC0404w;
import com.amazon.device.messaging.ADM;
import kotlin.jvm.internal.r;
import u7.v;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class d implements C5.b, c {
    private final x4.f _applicationService;
    private com.onesignal.common.threading.f waiter;

    public static final class a extends B7.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public a(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
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
        public b(r rVar, d dVar, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$registrationId = rVar;
            this.this$0 = dVar;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return new b(this.$registrationId, this.this$0, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((b) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(v.f41353a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            r rVar;
            String str;
            r rVar2;
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.d.k(obj);
                rVar = this.$registrationId;
                com.onesignal.common.threading.f fVar = this.this$0.waiter;
                if (fVar == null) {
                    str = null;
                    rVar.f38717n = str;
                    return v.f41353a;
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
                com.bumptech.glide.d.k(obj);
            }
            r rVar3 = rVar2;
            str = (String) obj;
            rVar = rVar3;
            rVar.f38717n = str;
            return v.f41353a;
        }
    }

    public d(x4.f _applicationService) {
        kotlin.jvm.internal.h.e(_applicationService, "_applicationService");
        this._applicationService = _applicationService;
    }

    @Override // com.onesignal.notifications.internal.registration.impl.c
    public Object fireCallback(String str, InterfaceC5267d interfaceC5267d) {
        com.onesignal.common.threading.f fVar = this.waiter;
        if (fVar != null) {
            fVar.wake(str);
        }
        return v.f41353a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // C5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object registerForPush(InterfaceC5267d interfaceC5267d) {
        a aVar;
        int i;
        r rVar;
        if (interfaceC5267d instanceof a) {
            aVar = (a) interfaceC5267d;
            int i6 = aVar.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.label = i6 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                A7.a aVar2 = A7.a.f58n;
                i = aVar.label;
                if (i != 0) {
                    com.bumptech.glide.d.k(obj);
                    this.waiter = new com.onesignal.common.threading.f();
                    ADM adm = new ADM(this._applicationService.getAppContext());
                    r rVar2 = new r();
                    String registrationId = adm.getRegistrationId();
                    rVar2.f38717n = registrationId;
                    if (registrationId != null) {
                        com.onesignal.debug.internal.logging.b.debug$default("ADM Already registered with ID:" + ((String) rVar2.f38717n), null, 2, null);
                        return new C5.a((String) rVar2.f38717n, Z5.f.SUBSCRIBED);
                    }
                    adm.startRegister();
                    b bVar = new b(rVar2, this, null);
                    aVar.L$0 = rVar2;
                    aVar.label = 1;
                    if (AbstractC0406y.z(30000L, bVar, aVar) == aVar2) {
                        return aVar2;
                    }
                    rVar = rVar2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar = (r) aVar.L$0;
                    com.bumptech.glide.d.k(obj);
                }
                if (rVar.f38717n != null) {
                    com.onesignal.debug.internal.logging.b.info$default("com.onesignal.ADMMessageHandler timed out, please check that your have the receiver, service, and your package name matches(NOTE: Case Sensitive) per the OneSignal instructions.", null, 2, null);
                    return new C5.a(null, Z5.f.ERROR);
                }
                com.onesignal.debug.internal.logging.b.debug$default("ADM registered with ID:" + ((String) rVar.f38717n), null, 2, null);
                return new C5.a((String) rVar.f38717n, Z5.f.SUBSCRIBED);
            }
        }
        aVar = new a(interfaceC5267d);
        Object obj2 = aVar.result;
        A7.a aVar22 = A7.a.f58n;
        i = aVar.label;
        if (i != 0) {
        }
        if (rVar.f38717n != null) {
        }
    }
}
