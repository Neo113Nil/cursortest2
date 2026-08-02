package ru.yandex.taxi.zalogin;

import android.content.Intent;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.r;
import defpackage.ffx;
import defpackage.fhz;
import defpackage.g6u;
import defpackage.g92;
import defpackage.kj;
import defpackage.no90;
import defpackage.ny61;
import defpackage.o400;
import defpackage.oyr;
import defpackage.r40;
import defpackage.rol0;
import defpackage.rx2;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.y50;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.am.InternalLinkAccountRouter$NoLinkableAccountsException;
import ru.yandex.taxi.am.y;
import ru.yandex.taxi.analytics.Events$Zalogin$LinkageContext;

/* loaded from: classes10.dex */
public final class j {
    public final ru.yandex.taxi.am.internal.d a;
    public final no90 b;
    public final y c;
    public final fhz d;
    public final tt2 e;
    public volatile kj f;
    public final n0 g = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public j(ru.yandex.taxi.am.internal.d dVar, no90 no90Var, y yVar, fhz fhzVar, tt2 tt2Var) {
        this.a = dVar;
        this.b = no90Var;
        this.c = yVar;
        this.d = fhzVar;
        this.e = tt2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(j jVar, ContinuationImpl continuationImpl) {
        LinkAccountsController$findLinkageAccount$1 linkAccountsController$findLinkageAccount$1;
        int i;
        kj kjVar;
        jVar.getClass();
        if (continuationImpl instanceof LinkAccountsController$findLinkageAccount$1) {
            linkAccountsController$findLinkageAccount$1 = (LinkAccountsController$findLinkageAccount$1) continuationImpl;
            int i2 = linkAccountsController$findLinkageAccount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkAccountsController$findLinkageAccount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = linkAccountsController$findLinkageAccount$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = linkAccountsController$findLinkageAccount$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.am.internal.d dVar = jVar.a;
                    linkAccountsController$findLinkageAccount$1.label = 1;
                    obj = dVar.e(linkAccountsController$findLinkageAccount$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        kjVar = (kj) obj;
                        jVar.f = kjVar;
                        return kjVar;
                    }
                    kotlin.b.b(obj);
                }
                kjVar = (kj) obj;
                if (kjVar == null) {
                    linkAccountsController$findLinkageAccount$1.label = 2;
                    obj = jVar.d(linkAccountsController$findLinkageAccount$1);
                }
                jVar.f = kjVar;
                return kjVar;
            }
        }
        linkAccountsController$findLinkageAccount$1 = new LinkAccountsController$findLinkageAccount$1(jVar, continuationImpl);
        Object obj3 = linkAccountsController$findLinkageAccount$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = linkAccountsController$findLinkageAccount$1.label;
        if (i != 0) {
        }
        kjVar = (kj) obj3;
        if (kjVar == null) {
        }
        jVar.f = kjVar;
        return kjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(j jVar, r40 r40Var, Events$Zalogin$LinkageContext events$Zalogin$LinkageContext, ContinuationImpl continuationImpl) {
        LinkAccountsController$handleActivityResult$1 linkAccountsController$handleActivityResult$1;
        int i;
        fhz fhzVar = jVar.d;
        try {
            if (continuationImpl instanceof LinkAccountsController$handleActivityResult$1) {
                linkAccountsController$handleActivityResult$1 = (LinkAccountsController$handleActivityResult$1) continuationImpl;
                int i2 = linkAccountsController$handleActivityResult$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    linkAccountsController$handleActivityResult$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = linkAccountsController$handleActivityResult$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = linkAccountsController$handleActivityResult$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        Intent intent = r40Var.c;
                        int i3 = r40Var.a;
                        if (i3 != -1) {
                            fhzVar.j("Login activity cancelled", events$Zalogin$LinkageContext);
                            return new Result.Failure(new Exception(oyr.i(i3, "Login activity finished with result ")));
                        }
                        if (intent == null) {
                            fhzVar.j("Missing portal intent", events$Zalogin$LinkageContext);
                            return new Result.Failure(new Exception(oyr.i(i3, "Login activity finished with result ")));
                        }
                        linkAccountsController$handleActivityResult$1.L$0 = null;
                        linkAccountsController$handleActivityResult$1.L$1 = null;
                        linkAccountsController$handleActivityResult$1.L$2 = null;
                        linkAccountsController$handleActivityResult$1.I$0 = i3;
                        linkAccountsController$handleActivityResult$1.label = 1;
                        obj = jVar.f(intent, linkAccountsController$handleActivityResult$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return (kj) obj;
                }
            }
            if (i != 0) {
            }
            return (kj) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new Result.Failure(e2);
        }
        linkAccountsController$handleActivityResult$1 = new LinkAccountsController$handleActivityResult$1(jVar, continuationImpl);
        Object obj3 = linkAccountsController$handleActivityResult$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = linkAccountsController$handleActivityResult$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Events$Zalogin$LinkageContext events$Zalogin$LinkageContext, ContinuationImpl continuationImpl) {
        LinkAccountsController$linkAccounts$1 linkAccountsController$linkAccounts$1;
        int i;
        Object d;
        Throwable a;
        if (continuationImpl instanceof LinkAccountsController$linkAccounts$1) {
            linkAccountsController$linkAccounts$1 = (LinkAccountsController$linkAccounts$1) continuationImpl;
            int i2 = linkAccountsController$linkAccounts$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkAccountsController$linkAccounts$1.label = i2 - Integer.MIN_VALUE;
                Object obj = linkAccountsController$linkAccounts$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = linkAccountsController$linkAccounts$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    kj kjVar = this.f;
                    if (kjVar == null) {
                        ny61.r("Can't link account without link candidate");
                        return null;
                    }
                    y yVar = this.c;
                    linkAccountsController$linkAccounts$1.L$0 = null;
                    linkAccountsController$linkAccounts$1.L$1 = null;
                    linkAccountsController$linkAccounts$1.label = 1;
                    d = yVar.d(kjVar, events$Zalogin$LinkageContext, linkAccountsController$linkAccounts$1);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    d = ((Result) obj).getValue();
                }
                if (!(d instanceof Result.Failure) && ((Boolean) d).booleanValue()) {
                    this.f = null;
                }
                a = Result.a(d);
                if (a != null && (a instanceof InternalLinkAccountRouter$NoLinkableAccountsException)) {
                    this.f = null;
                }
                kotlin.b.b(d);
                Boolean bool = (Boolean) d;
                bool.getClass();
                return bool;
            }
        }
        linkAccountsController$linkAccounts$1 = new LinkAccountsController$linkAccounts$1(this, continuationImpl);
        Object obj2 = linkAccountsController$linkAccounts$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = linkAccountsController$linkAccounts$1.label;
        if (i != 0) {
        }
        if (!(d instanceof Result.Failure)) {
            this.f = null;
        }
        a = Result.a(d);
        if (a != null) {
            this.f = null;
        }
        kotlin.b.b(d);
        Boolean bool2 = (Boolean) d;
        bool2.getClass();
        return bool2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        LinkAccountsController$linkageAccountFromList$1 linkAccountsController$linkageAccountFromList$1;
        int i;
        if (continuationImpl instanceof LinkAccountsController$linkageAccountFromList$1) {
            linkAccountsController$linkageAccountFromList$1 = (LinkAccountsController$linkageAccountFromList$1) continuationImpl;
            int i2 = linkAccountsController$linkageAccountFromList$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkAccountsController$linkageAccountFromList$1.label = i2 - Integer.MIN_VALUE;
                Object obj = linkAccountsController$linkageAccountFromList$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = linkAccountsController$linkageAccountFromList$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    linkAccountsController$linkageAccountFromList$1.label = 1;
                    obj = this.a.g(linkAccountsController$linkageAccountFromList$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return kotlin.collections.a.R((List) obj);
            }
        }
        linkAccountsController$linkageAccountFromList$1 = new LinkAccountsController$linkageAccountFromList$1(this, continuationImpl);
        Object obj2 = linkAccountsController$linkageAccountFromList$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = linkAccountsController$linkageAccountFromList$1.label;
        if (i != 0) {
        }
        return kotlin.collections.a.R((List) obj2);
    }

    public final tpr e() {
        kj kjVar = this.f;
        return kjVar != null ? new g92(2, kjVar) : new rol0(new LinkAccountsController$loadLinkCandidate$1(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Intent intent, ContinuationImpl continuationImpl) {
        LinkAccountsController$loadNewLinkCandidate$1 linkAccountsController$loadNewLinkCandidate$1;
        int i;
        if (continuationImpl instanceof LinkAccountsController$loadNewLinkCandidate$1) {
            linkAccountsController$loadNewLinkCandidate$1 = (LinkAccountsController$loadNewLinkCandidate$1) continuationImpl;
            int i2 = linkAccountsController$loadNewLinkCandidate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkAccountsController$loadNewLinkCandidate$1.label = i2 - Integer.MIN_VALUE;
                Object obj = linkAccountsController$loadNewLinkCandidate$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = linkAccountsController$loadNewLinkCandidate$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PassportUidImpl a = r.c(intent).a();
                    ru.yandex.taxi.am.internal.d dVar = this.a;
                    linkAccountsController$loadNewLinkCandidate$1.L$0 = null;
                    linkAccountsController$loadNewLinkCandidate$1.L$1 = null;
                    linkAccountsController$loadNewLinkCandidate$1.label = 1;
                    obj = dVar.a(a, linkAccountsController$loadNewLinkCandidate$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                kj kjVar = (kj) obj;
                this.f = kjVar;
                this.g.g(Boolean.FALSE);
                return kjVar;
            }
        }
        linkAccountsController$loadNewLinkCandidate$1 = new LinkAccountsController$loadNewLinkCandidate$1(this, continuationImpl);
        Object obj2 = linkAccountsController$loadNewLinkCandidate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = linkAccountsController$loadNewLinkCandidate$1.label;
        if (i != 0) {
        }
        kj kjVar2 = (kj) obj2;
        this.f = kjVar2;
        this.g.g(Boolean.FALSE);
        return kjVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(y50 y50Var, ru.yandex.taxi.activity.g gVar, Events$Zalogin$LinkageContext events$Zalogin$LinkageContext, kj kjVar, ContinuationImpl continuationImpl) {
        LinkAccountsController$openLinkAccountLoginActivity$1 linkAccountsController$openLinkAccountLoginActivity$1;
        int i;
        if (continuationImpl instanceof LinkAccountsController$openLinkAccountLoginActivity$1) {
            linkAccountsController$openLinkAccountLoginActivity$1 = (LinkAccountsController$openLinkAccountLoginActivity$1) continuationImpl;
            int i2 = linkAccountsController$openLinkAccountLoginActivity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkAccountsController$openLinkAccountLoginActivity$1.label = i2 - Integer.MIN_VALUE;
                LinkAccountsController$openLinkAccountLoginActivity$1 linkAccountsController$openLinkAccountLoginActivity$12 = linkAccountsController$openLinkAccountLoginActivity$1;
                Object obj = linkAccountsController$openLinkAccountLoginActivity$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = linkAccountsController$openLinkAccountLoginActivity$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fhz fhzVar = this.d;
                    rx2 rx2Var = fhzVar.e;
                    Long f = fhzVar.f();
                    String name = events$Zalogin$LinkageContext.name();
                    rx2Var.getClass();
                    HashMap hashMap = new HashMap();
                    if (f != null) {
                        hashMap.put("uid", f);
                    }
                    if (name != null) {
                        hashMap.put("context", name);
                    }
                    rx2Var.a.a("Zalogin.LoginPortalShown", hashMap, 1, new HashMap());
                    i iVar = new i(kotlinx.coroutines.flow.e.T(gVar.a(HProv.PP_CACHE_SIZE), 1), this, events$Zalogin$LinkageContext);
                    this.e.getClass();
                    sjh sjhVar = uyj.a;
                    g6u g6uVar = o400.a;
                    LinkAccountsController$openLinkAccountLoginActivity$2 linkAccountsController$openLinkAccountLoginActivity$2 = new LinkAccountsController$openLinkAccountLoginActivity$2(this, events$Zalogin$LinkageContext, y50Var, kjVar, iVar, null);
                    linkAccountsController$openLinkAccountLoginActivity$12.L$0 = null;
                    linkAccountsController$openLinkAccountLoginActivity$12.L$1 = null;
                    linkAccountsController$openLinkAccountLoginActivity$12.L$2 = null;
                    linkAccountsController$openLinkAccountLoginActivity$12.L$3 = null;
                    linkAccountsController$openLinkAccountLoginActivity$12.L$4 = null;
                    linkAccountsController$openLinkAccountLoginActivity$12.label = 1;
                    obj = tje.k0(g6uVar, linkAccountsController$openLinkAccountLoginActivity$2, linkAccountsController$openLinkAccountLoginActivity$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        linkAccountsController$openLinkAccountLoginActivity$1 = new LinkAccountsController$openLinkAccountLoginActivity$1(this, continuationImpl);
        LinkAccountsController$openLinkAccountLoginActivity$1 linkAccountsController$openLinkAccountLoginActivity$122 = linkAccountsController$openLinkAccountLoginActivity$1;
        Object obj2 = linkAccountsController$openLinkAccountLoginActivity$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = linkAccountsController$openLinkAccountLoginActivity$122.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }
}
