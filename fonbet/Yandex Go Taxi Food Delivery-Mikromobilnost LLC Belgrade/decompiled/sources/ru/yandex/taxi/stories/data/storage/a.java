package ru.yandex.taxi.stories.data.storage;

import android.content.Context;
import defpackage.ctf0;
import defpackage.esf0;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.ny61;
import defpackage.onu0;
import defpackage.wls;
import defpackage.wnt;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.communications.api.dto.Story;
import ru.yandex.taxi.communications.c;
import ru.yandex.taxi.promotions.storage.CommunicationsCacheMode;
import ru.yandex.taxi.promotions.storage.RamPromotionsStorage;

/* loaded from: classes10.dex */
public final class a implements ctf0 {
    public final c a;
    public final wnt b;
    public final Context c;
    public final kotlinx.coroutines.sync.a d = gtq0.a();
    public ctf0 e;

    public a(c cVar, wnt wntVar, Context context) {
        this.a = cVar;
        this.b = wntVar;
        this.c = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.ctf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        LazyStoriesStorage$removePromotion$1 lazyStoriesStorage$removePromotion$1;
        int i;
        if (continuationImpl instanceof LazyStoriesStorage$removePromotion$1) {
            lazyStoriesStorage$removePromotion$1 = (LazyStoriesStorage$removePromotion$1) continuationImpl;
            int i2 = lazyStoriesStorage$removePromotion$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lazyStoriesStorage$removePromotion$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lazyStoriesStorage$removePromotion$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lazyStoriesStorage$removePromotion$1.label;
                if (i != 0) {
                    b.b(obj);
                    lazyStoriesStorage$removePromotion$1.L$0 = str;
                    lazyStoriesStorage$removePromotion$1.label = 1;
                    obj = i(lazyStoriesStorage$removePromotion$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return obj;
                    }
                    str = (String) lazyStoriesStorage$removePromotion$1.L$0;
                    b.b(obj);
                }
                lazyStoriesStorage$removePromotion$1.L$0 = null;
                lazyStoriesStorage$removePromotion$1.label = 2;
                Object c = ((ctf0) obj).c(str, lazyStoriesStorage$removePromotion$1);
                return c != obj2 ? obj2 : c;
            }
        }
        lazyStoriesStorage$removePromotion$1 = new LazyStoriesStorage$removePromotion$1(this, continuationImpl);
        Object obj3 = lazyStoriesStorage$removePromotion$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lazyStoriesStorage$removePromotion$1.label;
        if (i != 0) {
        }
        lazyStoriesStorage$removePromotion$1.L$0 = null;
        lazyStoriesStorage$removePromotion$1.label = 2;
        Object c2 = ((ctf0) obj3).c(str, lazyStoriesStorage$removePromotion$1);
        if (c2 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.ctf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(List list, ContinuationImpl continuationImpl) {
        LazyStoriesStorage$setPromotions$1 lazyStoriesStorage$setPromotions$1;
        int i;
        if (continuationImpl instanceof LazyStoriesStorage$setPromotions$1) {
            lazyStoriesStorage$setPromotions$1 = (LazyStoriesStorage$setPromotions$1) continuationImpl;
            int i2 = lazyStoriesStorage$setPromotions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lazyStoriesStorage$setPromotions$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lazyStoriesStorage$setPromotions$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lazyStoriesStorage$setPromotions$1.label;
                if (i != 0) {
                    b.b(obj);
                    lazyStoriesStorage$setPromotions$1.L$0 = list;
                    lazyStoriesStorage$setPromotions$1.label = 1;
                    obj = i(lazyStoriesStorage$setPromotions$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return obj;
                    }
                    list = (List) lazyStoriesStorage$setPromotions$1.L$0;
                    b.b(obj);
                }
                lazyStoriesStorage$setPromotions$1.L$0 = null;
                lazyStoriesStorage$setPromotions$1.label = 2;
                Object d = ((ctf0) obj).d(list, lazyStoriesStorage$setPromotions$1);
                return d != obj2 ? obj2 : d;
            }
        }
        lazyStoriesStorage$setPromotions$1 = new LazyStoriesStorage$setPromotions$1(this, continuationImpl);
        Object obj3 = lazyStoriesStorage$setPromotions$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lazyStoriesStorage$setPromotions$1.label;
        if (i != 0) {
        }
        lazyStoriesStorage$setPromotions$1.L$0 = null;
        lazyStoriesStorage$setPromotions$1.label = 2;
        Object d2 = ((ctf0) obj3).d(list, lazyStoriesStorage$setPromotions$1);
        if (d2 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        if (r6 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.ctf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        LazyStoriesStorage$loadInMemCache$1 lazyStoriesStorage$loadInMemCache$1;
        int i;
        if (continuationImpl instanceof LazyStoriesStorage$loadInMemCache$1) {
            lazyStoriesStorage$loadInMemCache$1 = (LazyStoriesStorage$loadInMemCache$1) continuationImpl;
            int i2 = lazyStoriesStorage$loadInMemCache$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lazyStoriesStorage$loadInMemCache$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lazyStoriesStorage$loadInMemCache$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lazyStoriesStorage$loadInMemCache$1.label;
                if (i != 0) {
                    b.b(obj);
                    lazyStoriesStorage$loadInMemCache$1.label = 1;
                    obj = i(lazyStoriesStorage$loadInMemCache$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                lazyStoriesStorage$loadInMemCache$1.label = 2;
                Object e = ((ctf0) obj).e(lazyStoriesStorage$loadInMemCache$1);
                return e != obj2 ? obj2 : e;
            }
        }
        lazyStoriesStorage$loadInMemCache$1 = new LazyStoriesStorage$loadInMemCache$1(this, continuationImpl);
        Object obj3 = lazyStoriesStorage$loadInMemCache$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lazyStoriesStorage$loadInMemCache$1.label;
        if (i != 0) {
        }
        lazyStoriesStorage$loadInMemCache$1.label = 2;
        Object e2 = ((ctf0) obj3).e(lazyStoriesStorage$loadInMemCache$1);
        if (e2 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.ctf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(wls wlsVar, ContinuationImpl continuationImpl) {
        LazyStoriesStorage$setPromotionRemovedListener$1 lazyStoriesStorage$setPromotionRemovedListener$1;
        int i;
        if (continuationImpl instanceof LazyStoriesStorage$setPromotionRemovedListener$1) {
            lazyStoriesStorage$setPromotionRemovedListener$1 = (LazyStoriesStorage$setPromotionRemovedListener$1) continuationImpl;
            int i2 = lazyStoriesStorage$setPromotionRemovedListener$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lazyStoriesStorage$setPromotionRemovedListener$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lazyStoriesStorage$setPromotionRemovedListener$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lazyStoriesStorage$setPromotionRemovedListener$1.label;
                if (i != 0) {
                    b.b(obj);
                    lazyStoriesStorage$setPromotionRemovedListener$1.L$0 = wlsVar;
                    lazyStoriesStorage$setPromotionRemovedListener$1.label = 1;
                    obj = i(lazyStoriesStorage$setPromotionRemovedListener$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return obj;
                    }
                    wlsVar = (wls) lazyStoriesStorage$setPromotionRemovedListener$1.L$0;
                    b.b(obj);
                }
                lazyStoriesStorage$setPromotionRemovedListener$1.L$0 = null;
                lazyStoriesStorage$setPromotionRemovedListener$1.label = 2;
                Object f = ((ctf0) obj).f(wlsVar, lazyStoriesStorage$setPromotionRemovedListener$1);
                return f != obj2 ? obj2 : f;
            }
        }
        lazyStoriesStorage$setPromotionRemovedListener$1 = new LazyStoriesStorage$setPromotionRemovedListener$1(this, continuationImpl);
        Object obj3 = lazyStoriesStorage$setPromotionRemovedListener$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lazyStoriesStorage$setPromotionRemovedListener$1.label;
        if (i != 0) {
        }
        lazyStoriesStorage$setPromotionRemovedListener$1.L$0 = null;
        lazyStoriesStorage$setPromotionRemovedListener$1.label = 2;
        Object f2 = ((ctf0) obj3).f(wlsVar, lazyStoriesStorage$setPromotionRemovedListener$1);
        if (f2 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.ctf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, ContinuationImpl continuationImpl) {
        LazyStoriesStorage$getPromotion$1 lazyStoriesStorage$getPromotion$1;
        int i;
        if (continuationImpl instanceof LazyStoriesStorage$getPromotion$1) {
            lazyStoriesStorage$getPromotion$1 = (LazyStoriesStorage$getPromotion$1) continuationImpl;
            int i2 = lazyStoriesStorage$getPromotion$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lazyStoriesStorage$getPromotion$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lazyStoriesStorage$getPromotion$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lazyStoriesStorage$getPromotion$1.label;
                if (i != 0) {
                    b.b(obj);
                    lazyStoriesStorage$getPromotion$1.L$0 = str;
                    lazyStoriesStorage$getPromotion$1.label = 1;
                    obj = i(lazyStoriesStorage$getPromotion$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return obj;
                    }
                    str = (String) lazyStoriesStorage$getPromotion$1.L$0;
                    b.b(obj);
                }
                lazyStoriesStorage$getPromotion$1.L$0 = null;
                lazyStoriesStorage$getPromotion$1.label = 2;
                Object g = ((ctf0) obj).g(str, lazyStoriesStorage$getPromotion$1);
                return g != obj2 ? obj2 : g;
            }
        }
        lazyStoriesStorage$getPromotion$1 = new LazyStoriesStorage$getPromotion$1(this, continuationImpl);
        Object obj3 = lazyStoriesStorage$getPromotion$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lazyStoriesStorage$getPromotion$1.label;
        if (i != 0) {
        }
        lazyStoriesStorage$getPromotion$1.L$0 = null;
        lazyStoriesStorage$getPromotion$1.label = 2;
        Object g2 = ((ctf0) obj3).g(str, lazyStoriesStorage$getPromotion$1);
        if (g2 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        if (r6 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.ctf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ContinuationImpl continuationImpl) {
        LazyStoriesStorage$getAllPromotions$1 lazyStoriesStorage$getAllPromotions$1;
        int i;
        if (continuationImpl instanceof LazyStoriesStorage$getAllPromotions$1) {
            lazyStoriesStorage$getAllPromotions$1 = (LazyStoriesStorage$getAllPromotions$1) continuationImpl;
            int i2 = lazyStoriesStorage$getAllPromotions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lazyStoriesStorage$getAllPromotions$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lazyStoriesStorage$getAllPromotions$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lazyStoriesStorage$getAllPromotions$1.label;
                if (i != 0) {
                    b.b(obj);
                    lazyStoriesStorage$getAllPromotions$1.label = 1;
                    obj = i(lazyStoriesStorage$getAllPromotions$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                lazyStoriesStorage$getAllPromotions$1.label = 2;
                Object h = ((ctf0) obj).h(lazyStoriesStorage$getAllPromotions$1);
                return h != obj2 ? obj2 : h;
            }
        }
        lazyStoriesStorage$getAllPromotions$1 = new LazyStoriesStorage$getAllPromotions$1(this, continuationImpl);
        Object obj3 = lazyStoriesStorage$getAllPromotions$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lazyStoriesStorage$getAllPromotions$1.label;
        if (i != 0) {
        }
        lazyStoriesStorage$getAllPromotions$1.label = 2;
        Object h2 = ((ctf0) obj3).h(lazyStoriesStorage$getAllPromotions$1);
        if (h2 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0052, code lost:
    
        if (r9.a(r0) == r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:12:0x002f, B:13:0x006b, B:16:0x007d, B:18:0x0092, B:23:0x0084, B:24:0x0089, B:25:0x008a), top: B:11:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0059 A[Catch: all -> 0x0096, TRY_LEAVE, TryCatch #1 {all -> 0x0096, blocks: (B:33:0x0055, B:35:0x0059), top: B:32:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6, types: [g050] */
    /* JADX WARN: Type inference failed for: r0v9, types: [g050] */
    /* JADX WARN: Type inference failed for: r2v8, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(ContinuationImpl continuationImpl) {
        LazyStoriesStorage$getStorage$1 lazyStoriesStorage$getStorage$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        ?? r0;
        ctf0 ctf0Var;
        kotlinx.coroutines.sync.a aVar2;
        int i2;
        ctf0 esf0Var;
        try {
            if (continuationImpl instanceof LazyStoriesStorage$getStorage$1) {
                lazyStoriesStorage$getStorage$1 = (LazyStoriesStorage$getStorage$1) continuationImpl;
                int i3 = lazyStoriesStorage$getStorage$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    lazyStoriesStorage$getStorage$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = lazyStoriesStorage$getStorage$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = lazyStoriesStorage$getStorage$1.label;
                    if (i != 0) {
                        b.b(obj);
                        aVar = this.d;
                        lazyStoriesStorage$getStorage$1.L$0 = aVar;
                        lazyStoriesStorage$getStorage$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            this = (a) lazyStoriesStorage$getStorage$1.L$1;
                            r0 = (g050) lazyStoriesStorage$getStorage$1.L$0;
                            try {
                                b.b(obj);
                                aVar2 = r0;
                                wnt wntVar = this.b;
                                Context context = this.c;
                                i2 = onu0.a[((CommunicationsCacheMode) obj).ordinal()];
                                if (i2 != 1) {
                                    esf0Var = new esf0("stories", context, wntVar);
                                } else {
                                    if (i2 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    esf0Var = new RamPromotionsStorage();
                                }
                                ctf0Var = esf0Var;
                                this.e = ctf0Var;
                                aVar = aVar2;
                                aVar.d(null);
                                return ctf0Var;
                            } catch (Throwable th) {
                                th = th;
                                r0.d(null);
                                throw th;
                            }
                        }
                        ?? r2 = (g050) lazyStoriesStorage$getStorage$1.L$0;
                        b.b(obj);
                        aVar = r2;
                    }
                    ctf0Var = this.e;
                    if (ctf0Var == null) {
                        c cVar = this.a;
                        lazyStoriesStorage$getStorage$1.L$0 = aVar;
                        lazyStoriesStorage$getStorage$1.L$1 = this;
                        lazyStoriesStorage$getStorage$1.label = 2;
                        Enum a = cVar.a(lazyStoriesStorage$getStorage$1);
                        if (a != coroutineSingletons) {
                            aVar2 = aVar;
                            obj = a;
                            wnt wntVar2 = this.b;
                            Context context2 = this.c;
                            i2 = onu0.a[((CommunicationsCacheMode) obj).ordinal()];
                            if (i2 != 1) {
                            }
                            ctf0Var = esf0Var;
                            this.e = ctf0Var;
                            aVar = aVar2;
                        }
                        return coroutineSingletons;
                    }
                    aVar.d(null);
                    return ctf0Var;
                }
            }
            ctf0Var = this.e;
            if (ctf0Var == null) {
            }
            aVar.d(null);
            return ctf0Var;
        } catch (Throwable th2) {
            th = th2;
            r0 = aVar;
            r0.d(null);
            throw th;
        }
        lazyStoriesStorage$getStorage$1 = new LazyStoriesStorage$getStorage$1(this, continuationImpl);
        Object obj2 = lazyStoriesStorage$getStorage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lazyStoriesStorage$getStorage$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.ctf0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Story story, ContinuationImpl continuationImpl) {
        LazyStoriesStorage$savePromotion$1 lazyStoriesStorage$savePromotion$1;
        int i;
        if (continuationImpl instanceof LazyStoriesStorage$savePromotion$1) {
            lazyStoriesStorage$savePromotion$1 = (LazyStoriesStorage$savePromotion$1) continuationImpl;
            int i2 = lazyStoriesStorage$savePromotion$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lazyStoriesStorage$savePromotion$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lazyStoriesStorage$savePromotion$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lazyStoriesStorage$savePromotion$1.label;
                if (i != 0) {
                    b.b(obj);
                    lazyStoriesStorage$savePromotion$1.L$0 = story;
                    lazyStoriesStorage$savePromotion$1.label = 1;
                    obj = i(lazyStoriesStorage$savePromotion$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return obj;
                    }
                    story = (Story) lazyStoriesStorage$savePromotion$1.L$0;
                    b.b(obj);
                }
                lazyStoriesStorage$savePromotion$1.L$0 = null;
                lazyStoriesStorage$savePromotion$1.label = 2;
                Object a = ((ctf0) obj).a(story, lazyStoriesStorage$savePromotion$1);
                return a != obj2 ? obj2 : a;
            }
        }
        lazyStoriesStorage$savePromotion$1 = new LazyStoriesStorage$savePromotion$1(this, continuationImpl);
        Object obj3 = lazyStoriesStorage$savePromotion$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lazyStoriesStorage$savePromotion$1.label;
        if (i != 0) {
        }
        lazyStoriesStorage$savePromotion$1.L$0 = null;
        lazyStoriesStorage$savePromotion$1.label = 2;
        Object a2 = ((ctf0) obj3).a(story, lazyStoriesStorage$savePromotion$1);
        if (a2 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.ctf0
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Story story, ContinuationImpl continuationImpl) {
        LazyStoriesStorage$updatePromotion$1 lazyStoriesStorage$updatePromotion$1;
        int i;
        if (continuationImpl instanceof LazyStoriesStorage$updatePromotion$1) {
            lazyStoriesStorage$updatePromotion$1 = (LazyStoriesStorage$updatePromotion$1) continuationImpl;
            int i2 = lazyStoriesStorage$updatePromotion$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lazyStoriesStorage$updatePromotion$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lazyStoriesStorage$updatePromotion$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lazyStoriesStorage$updatePromotion$1.label;
                if (i != 0) {
                    b.b(obj);
                    lazyStoriesStorage$updatePromotion$1.L$0 = story;
                    lazyStoriesStorage$updatePromotion$1.label = 1;
                    obj = i(lazyStoriesStorage$updatePromotion$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return obj;
                    }
                    story = (Story) lazyStoriesStorage$updatePromotion$1.L$0;
                    b.b(obj);
                }
                lazyStoriesStorage$updatePromotion$1.L$0 = null;
                lazyStoriesStorage$updatePromotion$1.label = 2;
                Object b = ((ctf0) obj).b(story, lazyStoriesStorage$updatePromotion$1);
                return b != obj2 ? obj2 : b;
            }
        }
        lazyStoriesStorage$updatePromotion$1 = new LazyStoriesStorage$updatePromotion$1(this, continuationImpl);
        Object obj3 = lazyStoriesStorage$updatePromotion$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lazyStoriesStorage$updatePromotion$1.label;
        if (i != 0) {
        }
        lazyStoriesStorage$updatePromotion$1.L$0 = null;
        lazyStoriesStorage$updatePromotion$1.label = 2;
        Object b2 = ((ctf0) obj3).b(story, lazyStoriesStorage$updatePromotion$1);
        if (b2 != obj22) {
        }
    }
}
