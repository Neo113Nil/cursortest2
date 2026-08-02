package defpackage;

import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.reflect.TypeToken;
import com.yandex.music.shared.splash.screen.cache.mapping.impl.SplashScreenCacheMapperImpl$mapToInternalSplashScreen$type$1;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class r6r extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ t6r l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r6r(t6r t6rVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = t6rVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new r6r(this.l, continuation, 0);
            default:
                return new r6r(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((r6r) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a2, code lost:
    
        if (r2 == null) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004c  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String b;
        Object obj2;
        yve yveVar;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                int i2 = 2;
                if (i == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    obj = t6r.a(this.l, this);
                    if (obj == nm6Var) {
                    }
                } else if (i == 1) {
                    qgg.h0(obj);
                } else if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                z0i z0iVar = new z0i(i2, 25, null);
                this.k = 2;
                if (lmm.a((wb7) obj, z0iVar, this) == nm6Var) {
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                t6r t6rVar = this.l;
                if (i3 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    obj = t6r.a(t6rVar, this);
                    if (obj == nm6Var2) {
                    }
                } else if (i3 == 1) {
                    qgg.h0(obj);
                } else if (i3 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    hmm hmmVar = (hmm) obj;
                    b = hmmVar == null ? ec7.b(hmmVar, "splash") : null;
                    xdr xdrVar = t6rVar.f;
                    if (b != null) {
                        u6r u6rVar = (u6r) t6rVar.e.getValue();
                        u6rVar.getClass();
                        JsonObject n0 = cxb.n0(b);
                        if (n0 != null) {
                            try {
                                yveVar = (yve) u6rVar.a.b(new JsonTreeReader(n0), TypeToken.get(new SplashScreenCacheMapperImpl$mapToInternalSplashScreen$type$1().getType()));
                            } catch (JsonIOException e) {
                                Assertions.throwOrSkip("SplashScreenCacheMapper", new FailedAssertionException("failed to parse splash", e));
                            } catch (JsonSyntaxException e2) {
                                Assertions.throwOrSkip("SplashScreenCacheMapper", new FailedAssertionException("failed to parse splash", e2));
                            }
                            if (yveVar == null) {
                                obj2 = new bwe(yveVar);
                                break;
                            } else {
                                obj2 = null;
                                break;
                            }
                        }
                        yveVar = null;
                        if (yveVar == null) {
                        }
                    }
                    obj2 = zve.a;
                    xdrVar.getClass();
                    xdrVar.m(null, obj2);
                    break;
                }
                pjc data = ((wb7) obj).getData();
                this.k = 2;
                obj = zsd.i0(data, this);
                if (obj == nm6Var2) {
                }
                hmm hmmVar2 = (hmm) obj;
                if (hmmVar2 == null) {
                }
                xdr xdrVar2 = t6rVar.f;
                if (b != null) {
                }
                obj2 = zve.a;
                xdrVar2.getClass();
                xdrVar2.m(null, obj2);
                break;
        }
        return Unit.a;
    }
}
