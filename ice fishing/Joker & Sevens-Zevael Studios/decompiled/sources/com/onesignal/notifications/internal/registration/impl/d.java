package com.onesignal.notifications.internal.registration.impl;

import ac.o;
import com.amazon.device.messaging.ADM;
import hc.j;
import pc.s;
import yc.a0;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d implements wa.b, c {
    private final q8.f _applicationService;
    private com.onesignal.common.threading.d waiter;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends hc.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public a(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.registerForPush(this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends j implements oc.e {
        final /* synthetic */ s $registrationId;
        Object L$0;
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s sVar, d dVar, fc.d dVar2) {
            super(2, dVar2);
            this.$registrationId = sVar;
            this.this$0 = dVar;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return new b(this.$registrationId, this.this$0, dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            s sVar;
            String str;
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                sVar = this.$registrationId;
                com.onesignal.common.threading.d dVar = this.this$0.waiter;
                if (dVar == null) {
                    str = null;
                    sVar.f5683g = str;
                    return o.f277a;
                }
                this.L$0 = sVar;
                this.label = 1;
                obj = dVar.waitForWake(this);
                gc.a aVar = gc.a.f2559g;
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sVar = (s) this.L$0;
                v6.a.W(obj);
            }
            str = (String) obj;
            sVar.f5683g = str;
            return o.f277a;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((b) create(yVar, dVar)).invokeSuspend(o.f277a);
        }
    }

    public d(q8.f fVar) {
        pc.j.e(fVar, "_applicationService");
        this._applicationService = fVar;
    }

    @Override // com.onesignal.notifications.internal.registration.impl.c
    public Object fireCallback(String str, fc.d dVar) {
        com.onesignal.common.threading.d dVar2 = this.waiter;
        if (dVar2 != null) {
            dVar2.wake(str);
        }
        return o.f277a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // wa.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object registerForPush(fc.d dVar) {
        a aVar;
        int i10;
        s sVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i11 = aVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.label = i11 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                i10 = aVar.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    this.waiter = new com.onesignal.common.threading.d();
                    ADM adm = new ADM(this._applicationService.getAppContext());
                    s sVar2 = new s();
                    String registrationId = adm.getRegistrationId();
                    sVar2.f5683g = registrationId;
                    if (registrationId != null) {
                        com.onesignal.debug.internal.logging.b.debug$default("ADM Already registered with ID:" + ((String) sVar2.f5683g), null, 2, null);
                        return new wa.a((String) sVar2.f5683g, ob.f.SUBSCRIBED);
                    }
                    adm.startRegister();
                    b bVar = new b(sVar2, this, null);
                    aVar.L$0 = sVar2;
                    aVar.label = 1;
                    Object B = a0.B(30000L, bVar, aVar);
                    gc.a aVar2 = gc.a.f2559g;
                    if (B == aVar2) {
                        return aVar2;
                    }
                    sVar = sVar2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar = (s) aVar.L$0;
                    v6.a.W(obj);
                }
                if (sVar.f5683g != null) {
                    com.onesignal.debug.internal.logging.b.error$default("com.onesignal.ADMMessageHandler timed out, please check that your have the receiver, service, and your package name matches(NOTE: Case Sensitive) per the OneSignal instructions.", null, 2, null);
                    return new wa.a(null, ob.f.ERROR);
                }
                com.onesignal.debug.internal.logging.b.error$default("ADM registered with ID:" + ((String) sVar.f5683g), null, 2, null);
                return new wa.a((String) sVar.f5683g, ob.f.SUBSCRIBED);
            }
        }
        aVar = new a(dVar);
        Object obj2 = aVar.result;
        i10 = aVar.label;
        if (i10 != 0) {
        }
        if (sVar.f5683g != null) {
        }
    }
}
