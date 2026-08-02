package defpackage;

import java.net.URI;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.rt.ebs.cryptosdk.core.common.entities.models.ISdkDispatchers;
import ru.rt.ebs.cryptosdk.core.instructions.controllers.IInstructionsController;
import ru.rt.ebs.cryptosdk.core.metadata.controllers.IMetadataController;
import ru.rt.ebs.cryptosdk.core.verification.adapter.controllers.IAdapterController;
import ru.rt.ebs.cryptosdk.core.verification.ebs.controllers.IEbsController;
import ru.rt.ebs.cryptosdk.core.verification.ebs.controllers.a;
import ru.rt.ebs.cryptosdk.core.verification.ebs.controllers.c;
import ru.rt.ebs.cryptosdk.core.verification.ebs.controllers.d;
import ru.rt.ebs.cryptosdk.core.verification.ebs.controllers.e;
import ru.rt.ebs.cryptosdk.core.verification.ebs.controllers.f;
import ru.rt.ebs.cryptosdk.core.verification.ebs.controllers.g;
import ru.rt.ebs.cryptosdk.core.verification.ebs.controllers.h;
import ru.rt.ebs.cryptosdk.core.verification.ebs.controllers.i;
import ru.rt.ebs.cryptosdk.core.verification.ebs.controllers.j;
import ru.rt.ebs.cryptosdk.core.verification.ebs.controllers.k;
import ru.rt.ebs.cryptosdk.core.verification.ebs.controllers.l;
import ru.rt.ebs.cryptosdk.core.verification.ebs.controllers.m;
import ru.rt.ebs.cryptosdk.core.verification.ebs.controllers.n;
import ru.rt.ebs.cryptosdk.core.verification.ebs.entities.exceptions.EbsVerificationEbsException;
import ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models.Negotiate;
import ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models.NegotiateHandler;
import ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models.PhotoHandler;
import ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationSessionController;

/* loaded from: classes4.dex */
public final class yin implements IEbsController {
    public final qjn a;
    public final IMetadataController b;
    public final IInstructionsController c;
    public final IAdapterController d;
    public final IVerificationSessionController e;
    public final ISdkDispatchers f;

    public yin(qjn qjnVar, IMetadataController iMetadataController, IInstructionsController iInstructionsController, IAdapterController iAdapterController, IVerificationSessionController iVerificationSessionController, ISdkDispatchers iSdkDispatchers) {
        this.a = qjnVar;
        this.b = iMetadataController;
        this.c = iInstructionsController;
        this.d = iAdapterController;
        this.e = iVerificationSessionController;
        this.f = iSdkDispatchers;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // ru.rt.ebs.cryptosdk.core.verification.ebs.controllers.IEbsController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object clearBioSamples(Continuation continuation) {
        a aVar;
        int i;
        try {
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i2 = aVar.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.c = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.a;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = aVar.c;
                    if (i != 0) {
                        b.b(obj);
                        jse io2 = this.f.io();
                        ru.rt.ebs.cryptosdk.core.verification.ebs.controllers.b bVar = new ru.rt.ebs.cryptosdk.core.verification.ebs.controllers.b(this, null);
                        aVar.c = 1;
                        if (tje.k0(io2, bVar, aVar) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                    }
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            return zy11.a;
        } catch (Exception e) {
            throw new EbsVerificationEbsException(e);
        }
        aVar = new a(this, continuation);
        Object obj2 = aVar.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // ru.rt.ebs.cryptosdk.core.verification.ebs.controllers.IEbsController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object clearVerification(Continuation continuation) {
        c cVar;
        int i;
        try {
            if (continuation instanceof c) {
                cVar = (c) continuation;
                int i2 = cVar.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cVar.c = i2 - Integer.MIN_VALUE;
                    Object obj = cVar.a;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = cVar.c;
                    if (i != 0) {
                        b.b(obj);
                        jse io2 = this.f.io();
                        d dVar = new d(this, null);
                        cVar.c = 1;
                        if (tje.k0(io2, dVar, cVar) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                    }
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            return zy11.a;
        } catch (Exception e) {
            throw new EbsVerificationEbsException(e);
        }
        cVar = new c(this, continuation);
        Object obj2 = cVar.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cVar.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // ru.rt.ebs.cryptosdk.core.verification.ebs.controllers.IEbsController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchNegotiateHandler(Continuation continuation) {
        e eVar;
        int i;
        try {
            if (continuation instanceof e) {
                eVar = (e) continuation;
                int i2 = eVar.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    eVar.c = i2 - Integer.MIN_VALUE;
                    Object obj = eVar.a;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = eVar.c;
                    if (i != 0) {
                        b.b(obj);
                        jse io2 = this.f.io();
                        f fVar = new f(this, null);
                        eVar.c = 1;
                        obj = tje.k0(io2, fVar, eVar);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                    }
                    return (NegotiateHandler) obj;
                }
            }
            if (i != 0) {
            }
            return (NegotiateHandler) obj;
        } catch (Exception e) {
            throw new EbsVerificationEbsException(e);
        }
        eVar = new e(this, continuation);
        Object obj2 = eVar.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eVar.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // ru.rt.ebs.cryptosdk.core.verification.ebs.controllers.IEbsController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchPhotoHandler(Continuation continuation) {
        g gVar;
        int i;
        try {
            if (continuation instanceof g) {
                gVar = (g) continuation;
                int i2 = gVar.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    gVar.c = i2 - Integer.MIN_VALUE;
                    Object obj = gVar.a;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = gVar.c;
                    if (i != 0) {
                        b.b(obj);
                        jse io2 = this.f.io();
                        h hVar = new h(this, null);
                        gVar.c = 1;
                        obj = tje.k0(io2, hVar, gVar);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                    }
                    return (PhotoHandler) obj;
                }
            }
            if (i != 0) {
            }
            return (PhotoHandler) obj;
        } catch (Exception e) {
            throw new EbsVerificationEbsException(e);
        }
        gVar = new g(this, continuation);
        Object obj2 = gVar.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gVar.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // ru.rt.ebs.cryptosdk.core.verification.ebs.controllers.IEbsController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initNegotiate(String str, Continuation continuation) {
        i iVar;
        int i;
        try {
            if (continuation instanceof i) {
                iVar = (i) continuation;
                int i2 = iVar.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    iVar.c = i2 - Integer.MIN_VALUE;
                    Object obj = iVar.a;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = iVar.c;
                    if (i != 0) {
                        b.b(obj);
                        jse io2 = this.f.io();
                        j jVar = new j(this, str, null);
                        iVar.c = 1;
                        if (tje.k0(io2, jVar, iVar) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                    }
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            return zy11.a;
        } catch (Exception e) {
            throw new EbsVerificationEbsException(e);
        }
        iVar = new i(this, continuation);
        Object obj2 = iVar.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = iVar.c;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verification.ebs.controllers.IEbsController
    public final Object initVerification(Continuation continuation) {
        Object clearVerification = clearVerification(continuation);
        return clearVerification == CoroutineSingletons.COROUTINE_SUSPENDED ? clearVerification : zy11.a;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verification.ebs.controllers.IEbsController
    public final void initVerificationHost(URI uri, int i, boolean z) {
        if (!z || i <= 0) {
            i = uri.getPort();
        }
        ((qwu) this.a.a.b).a = hhb1.d("https://" + uri.getHost() + (i > 0 ? oyr.i(i, ":") : "") + "/");
    }

    @Override // ru.rt.ebs.cryptosdk.core.verification.ebs.controllers.IEbsController
    public final void setResultNegotiate(Negotiate negotiate) {
        try {
            this.a.d.putString("ebs.result_negotiate", negotiate.getNegotiate().toString()).save();
        } catch (Exception e) {
            throw new EbsVerificationEbsException(e);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(5:5|6|7|(1:(1:(1:(2:12|13)(3:15|16|17))(4:18|19|20|21))(2:22|23))(3:27|28|(2:30|26))|24))|37|6|7|(0)(0)|24) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r8.clearBioSamples(r0) != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0040, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0041, code lost:
    
        r8 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
    
        if (defpackage.vob1.b(r8) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r0.a = r8;
        r0.d = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0082, code lost:
    
        if (clearBioSamples(r0) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // ru.rt.ebs.cryptosdk.core.verification.ebs.controllers.IEbsController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object uploadNegotiate(String str, Continuation continuation) {
        k kVar;
        int i;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i2 = kVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.d = i2 - Integer.MIN_VALUE;
                Object obj = kVar.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kVar.d;
                if (i != 0) {
                    b.b(obj);
                    jse io2 = this.f.io();
                    l lVar = new l(this, str, null);
                    kVar.a = this;
                    kVar.d = 1;
                    if (tje.k0(io2, lVar, kVar) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                            return zy11.a;
                        }
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Exception exc = (Exception) kVar.a;
                        b.b(obj);
                        throw new EbsVerificationEbsException(exc);
                    }
                    this = (yin) kVar.a;
                    b.b(obj);
                }
                kVar.a = this;
                kVar.d = 2;
            }
        }
        kVar = new k(this, continuation);
        Object obj2 = kVar.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kVar.d;
        if (i != 0) {
        }
        kVar.a = this;
        kVar.d = 2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(5:5|6|7|(1:(1:(1:(2:12|13)(3:15|16|17))(4:18|19|20|21))(2:22|23))(3:27|28|(2:30|26))|24))|37|6|7|(0)(0)|24) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r8.clearBioSamples(r0) != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0040, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0041, code lost:
    
        r8 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
    
        if (defpackage.vob1.b(r8) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r0.a = r8;
        r0.d = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0082, code lost:
    
        if (clearBioSamples(r0) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // ru.rt.ebs.cryptosdk.core.verification.ebs.controllers.IEbsController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object uploadPhoto(String str, Continuation continuation) {
        m mVar;
        int i;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i2 = mVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.d = i2 - Integer.MIN_VALUE;
                Object obj = mVar.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mVar.d;
                if (i != 0) {
                    b.b(obj);
                    jse io2 = this.f.io();
                    n nVar = new n(this, str, null);
                    mVar.a = this;
                    mVar.d = 1;
                    if (tje.k0(io2, nVar, mVar) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                            return zy11.a;
                        }
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Exception exc = (Exception) mVar.a;
                        b.b(obj);
                        throw new EbsVerificationEbsException(exc);
                    }
                    this = (yin) mVar.a;
                    b.b(obj);
                }
                mVar.a = this;
                mVar.d = 2;
            }
        }
        mVar = new m(this, continuation);
        Object obj2 = mVar.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mVar.d;
        if (i != 0) {
        }
        mVar.a = this;
        mVar.d = 2;
    }
}
