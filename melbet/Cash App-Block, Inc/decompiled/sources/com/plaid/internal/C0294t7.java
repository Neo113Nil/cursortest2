package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.AbstractC0193i4;
import com.plaid.internal.C0095a6;
import com.plaid.internal.F6;
import com.plaid.internal.InterfaceC0267q6;
import com.plaid.internal.Y6;
import com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* renamed from: com.plaid.internal.t7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0294t7 {
    public final InterfaceC0312v7 a;
    public final InterfaceC0178g7 b;

    public C0294t7(InterfaceC0312v7 interfaceC0312v7, InterfaceC0178g7 interfaceC0178g7) {
        interfaceC0312v7.getClass();
        interfaceC0178g7.getClass();
        this.a = interfaceC0312v7;
        this.b = interfaceC0178g7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e6, code lost:
    
        if (r10 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e8, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006c, code lost:
    
        if (r10 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C0303u7 c0303u7, ContinuationImpl continuationImpl) {
        C0276r7 c0276r7;
        int i;
        InterfaceC0267q6 interfaceC0267q6;
        if (continuationImpl instanceof C0276r7) {
            c0276r7 = (C0276r7) continuationImpl;
            int i2 = c0276r7.e;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                c0276r7.e = i2 - PKIFailureInfo.systemUnavail;
                Object obj = c0276r7.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c0276r7.e;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    C0095a6.a.a(C0095a6.a, "Twilio redirect uri: " + c0303u7.a());
                    F6.a.a("TwilioSNA - start processUrl");
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                    C0285s7 c0285s7 = new C0285s7(this, c0303u7, null);
                    c0276r7.a = this;
                    c0276r7.b = c0303u7;
                    c0276r7.e = 1;
                    obj = JobKt.withContext(defaultIoScheduler, c0285s7, c0276r7);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        AbstractC0193i4 abstractC0193i4 = (AbstractC0193i4) obj;
                        if (abstractC0193i4 instanceof AbstractC0193i4.c) {
                            C0095a6.a.a(C0095a6.a, "/twilio/finish response Success: " + ((AbstractC0193i4.c) abstractC0193i4).b());
                        } else if (abstractC0193i4 instanceof AbstractC0193i4.b) {
                            AbstractC0193i4.b bVar = (AbstractC0193i4.b) abstractC0193i4;
                            F6.a.a(MapsKt__MapsJVMKt.mapOf(new Pair("Exception", bVar.b().toString())), "TwilioSNA - /twilio/finish failure NetworkError");
                            Y6.a.a("/twilio/finish response NetworkError: " + bVar.b());
                        } else if (abstractC0193i4 instanceof AbstractC0193i4.a) {
                            AbstractC0193i4.a aVar = (AbstractC0193i4.a) abstractC0193i4;
                            F6.a.a(MapsKt__MapsJVMKt.mapOf(new Pair("Exception", String.valueOf(aVar.b()))), "TwilioSNA - /twilio/finish failure HttpError");
                            Y6.a.a("/twilio/finish response HttpError: " + aVar.b());
                        } else if (abstractC0193i4 instanceof AbstractC0193i4.d) {
                            AbstractC0193i4.d dVar = (AbstractC0193i4.d) abstractC0193i4;
                            F6.a.a(MapsKt__MapsJVMKt.mapOf(new Pair("Exception", String.valueOf(dVar.b()))), "TwilioSNA - /twilio/finish failure UnknownError");
                            Y6.a.a("/twilio/finish response UnknownError: " + dVar.b());
                        }
                        return Unit.INSTANCE;
                    }
                    c0303u7 = c0276r7.b;
                    this = c0276r7.a;
                    SafeTrace.throwOnFailure(obj);
                }
                interfaceC0267q6 = (InterfaceC0267q6) obj;
                if (!(interfaceC0267q6 instanceof InterfaceC0267q6.a)) {
                    F6.a.a();
                    Y6.a.a("Error processing Twilio redirect uri: " + ((InterfaceC0267q6.a) interfaceC0267q6).a());
                    return Unit.INSTANCE;
                }
                if (interfaceC0267q6 instanceof InterfaceC0267q6.b) {
                    C0095a6.a aVar2 = C0095a6.a;
                    C0095a6.a.a(aVar2, "processUrl success: " + ((InterfaceC0267q6.b) interfaceC0267q6).a());
                    F6.a.a("TwilioSNA - processUrl success, sending twilioFinishRequest");
                    SilentNetworkAuth$LinkSNATwilioFinishRequest build = SilentNetworkAuth$LinkSNATwilioFinishRequest.newBuilder().a(c0303u7.b()).build();
                    C0095a6.a.a(aVar2, "sending twilioFinishRequest: " + build);
                    InterfaceC0178g7 interfaceC0178g7 = this.b;
                    build.getClass();
                    c0276r7.a = null;
                    c0276r7.b = null;
                    c0276r7.e = 2;
                    obj = interfaceC0178g7.a(build, c0276r7);
                }
                return Unit.INSTANCE;
            }
        }
        c0276r7 = new C0276r7(this, continuationImpl);
        Object obj2 = c0276r7.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = c0276r7.e;
        if (i != 0) {
        }
        interfaceC0267q6 = (InterfaceC0267q6) obj2;
        if (!(interfaceC0267q6 instanceof InterfaceC0267q6.a)) {
        }
    }
}
