package com.onesignal.notifications.internal.registration.impl;

import E7.p;
import O7.AbstractC0399y;
import O7.InterfaceC0397w;
import com.amazon.device.messaging.ADM;
import kotlin.jvm.internal.r;
import q7.v;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5219c;
import y5.C5253a;
import y5.InterfaceC5254b;

/* loaded from: classes2.dex */
public final class d implements InterfaceC5254b, c {
    private final t4.f _applicationService;
    private com.onesignal.common.threading.f waiter;

    public static final class a extends AbstractC5219c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public a(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.registerForPush(this);
        }
    }

    public static final class b extends x7.h implements p {
        final /* synthetic */ r $registrationId;
        Object L$0;
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r rVar, d dVar, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$registrationId = rVar;
            this.this$0 = dVar;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return new b(this.$registrationId, this.this$0, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((b) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            r rVar;
            String str;
            r rVar2;
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.f.r(obj);
                rVar = this.$registrationId;
                com.onesignal.common.threading.f fVar = this.this$0.waiter;
                if (fVar == null) {
                    str = null;
                    rVar.f38861n = str;
                    return v.f40183a;
                }
                this.L$0 = rVar;
                this.label = 1;
                Object waitForWake = fVar.waitForWake(this);
                if (waitForWake == enumC5179a) {
                    return enumC5179a;
                }
                rVar2 = rVar;
                obj = waitForWake;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rVar2 = (r) this.L$0;
                com.bumptech.glide.f.r(obj);
            }
            r rVar3 = rVar2;
            str = (String) obj;
            rVar = rVar3;
            rVar.f38861n = str;
            return v.f40183a;
        }
    }

    public d(t4.f _applicationService) {
        kotlin.jvm.internal.h.e(_applicationService, "_applicationService");
        this._applicationService = _applicationService;
    }

    @Override // com.onesignal.notifications.internal.registration.impl.c
    public Object fireCallback(String str, InterfaceC5133d interfaceC5133d) {
        com.onesignal.common.threading.f fVar = this.waiter;
        if (fVar != null) {
            fVar.wake(str);
        }
        return v.f40183a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // y5.InterfaceC5254b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object registerForPush(InterfaceC5133d interfaceC5133d) {
        a aVar;
        int i;
        r rVar;
        if (interfaceC5133d instanceof a) {
            aVar = (a) interfaceC5133d;
            int i4 = aVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aVar.label = i4 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = aVar.label;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    this.waiter = new com.onesignal.common.threading.f();
                    ADM adm = new ADM(this._applicationService.getAppContext());
                    r rVar2 = new r();
                    String registrationId = adm.getRegistrationId();
                    rVar2.f38861n = registrationId;
                    if (registrationId != null) {
                        com.onesignal.debug.internal.logging.b.debug$default("ADM Already registered with ID:" + ((String) rVar2.f38861n), null, 2, null);
                        return new C5253a((String) rVar2.f38861n, V5.f.SUBSCRIBED);
                    }
                    adm.startRegister();
                    b bVar = new b(rVar2, this, null);
                    aVar.L$0 = rVar2;
                    aVar.label = 1;
                    if (AbstractC0399y.z(30000L, bVar, aVar) == enumC5179a) {
                        return enumC5179a;
                    }
                    rVar = rVar2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar = (r) aVar.L$0;
                    com.bumptech.glide.f.r(obj);
                }
                if (rVar.f38861n != null) {
                    com.onesignal.debug.internal.logging.b.info$default("com.onesignal.ADMMessageHandler timed out, please check that your have the receiver, service, and your package name matches(NOTE: Case Sensitive) per the OneSignal instructions.", null, 2, null);
                    return new C5253a(null, V5.f.ERROR);
                }
                com.onesignal.debug.internal.logging.b.debug$default("ADM registered with ID:" + ((String) rVar.f38861n), null, 2, null);
                return new C5253a((String) rVar.f38861n, V5.f.SUBSCRIBED);
            }
        }
        aVar = new a(interfaceC5133d);
        Object obj2 = aVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = aVar.label;
        if (i != 0) {
        }
        if (rVar.f38861n != null) {
        }
    }
}
