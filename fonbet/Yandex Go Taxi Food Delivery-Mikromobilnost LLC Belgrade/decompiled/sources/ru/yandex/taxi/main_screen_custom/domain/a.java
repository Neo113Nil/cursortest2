package ru.yandex.taxi.main_screen_custom.domain;

import android.content.Context;
import android.graphics.Bitmap;
import com.yandex.go.dto.response.q1;
import com.yandex.go.shortcuts.dto.response.LocalAnimation;
import com.yandex.go.shortcuts.dto.response.LottieAnimation;
import com.yandex.go.shortcuts.dto.response.ObjectOverMap;
import com.yandex.go.shortcuts.dto.response.PositionOverMap;
import com.yandex.go.shortcuts.dto.response.RemoteAnimation;
import com.yandex.go.shortcuts.dto.response.StaticImage;
import defpackage.c4v;
import defpackage.chb1;
import defpackage.gqf0;
import defpackage.kbs;
import defpackage.llf0;
import defpackage.mnf0;
import defpackage.nsz;
import defpackage.nuz;
import defpackage.ny61;
import defpackage.pfv;
import defpackage.ssz;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes9.dex */
public final class a {
    public final Context a;
    public final ru.yandex.taxi.utils.d b;
    public final ru.yandex.taxi.widget.c c;

    public a(Context context, ru.yandex.taxi.utils.d dVar, ru.yandex.taxi.widget.c cVar) {
        this.a = context;
        this.b = dVar;
        this.c = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ObjectOverMap objectOverMap, String str, ContinuationImpl continuationImpl) {
        PromoConfigMapper$createPromoConfig$1 promoConfigMapper$createPromoConfig$1;
        Object obj;
        int i;
        com.yandex.go.shortcuts.dto.response.d c;
        PositionOverMap f;
        ObjectOverMap.ShowPolicy b;
        gqf0 gqf0Var;
        ObjectOverMap objectOverMap2;
        Object e;
        PositionOverMap positionOverMap;
        ObjectOverMap.ShowPolicy showPolicy;
        String str2;
        Object b2;
        ObjectOverMap objectOverMap3;
        llf0 llf0Var;
        String str3;
        ObjectOverMap.ShowPolicy showPolicy2;
        PositionOverMap positionOverMap2;
        gqf0 gqf0Var2;
        if (continuationImpl instanceof PromoConfigMapper$createPromoConfig$1) {
            promoConfigMapper$createPromoConfig$1 = (PromoConfigMapper$createPromoConfig$1) continuationImpl;
            int i2 = promoConfigMapper$createPromoConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promoConfigMapper$createPromoConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = promoConfigMapper$createPromoConfig$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promoConfigMapper$createPromoConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    q1 d = objectOverMap.getD();
                    if (d == null || (c = objectOverMap.getC()) == null || (f = objectOverMap.getF()) == null || (b = objectOverMap.getB()) == null) {
                        return null;
                    }
                    String a = objectOverMap.getA();
                    gqf0Var = new gqf0(objectOverMap.getA(), d, str);
                    objectOverMap2 = objectOverMap;
                    promoConfigMapper$createPromoConfig$1.L$0 = objectOverMap2;
                    promoConfigMapper$createPromoConfig$1.L$1 = null;
                    promoConfigMapper$createPromoConfig$1.L$2 = null;
                    promoConfigMapper$createPromoConfig$1.L$3 = null;
                    promoConfigMapper$createPromoConfig$1.L$4 = f;
                    promoConfigMapper$createPromoConfig$1.L$5 = b;
                    promoConfigMapper$createPromoConfig$1.L$6 = a;
                    promoConfigMapper$createPromoConfig$1.L$7 = gqf0Var;
                    promoConfigMapper$createPromoConfig$1.label = 1;
                    e = e(c, promoConfigMapper$createPromoConfig$1);
                    if (e != obj) {
                        positionOverMap = f;
                        showPolicy = b;
                        str2 = a;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ObjectOverMap.ShowPolicy showPolicy3 = (ObjectOverMap.ShowPolicy) promoConfigMapper$createPromoConfig$1.L$9;
                    llf0 llf0Var2 = (llf0) promoConfigMapper$createPromoConfig$1.L$8;
                    gqf0 gqf0Var3 = (gqf0) promoConfigMapper$createPromoConfig$1.L$7;
                    String str4 = (String) promoConfigMapper$createPromoConfig$1.L$6;
                    PositionOverMap positionOverMap3 = (PositionOverMap) promoConfigMapper$createPromoConfig$1.L$4;
                    objectOverMap3 = (ObjectOverMap) promoConfigMapper$createPromoConfig$1.L$0;
                    kotlin.b.b(obj2);
                    showPolicy2 = showPolicy3;
                    llf0Var = llf0Var2;
                    gqf0Var2 = gqf0Var3;
                    str3 = str4;
                    positionOverMap2 = positionOverMap3;
                    return new mnf0(str3, gqf0Var2, llf0Var, showPolicy2, (CharSequence) obj2, positionOverMap2, objectOverMap3.getG(), objectOverMap3.getH());
                }
                gqf0 gqf0Var4 = (gqf0) promoConfigMapper$createPromoConfig$1.L$7;
                str2 = (String) promoConfigMapper$createPromoConfig$1.L$6;
                showPolicy = (ObjectOverMap.ShowPolicy) promoConfigMapper$createPromoConfig$1.L$5;
                positionOverMap = (PositionOverMap) promoConfigMapper$createPromoConfig$1.L$4;
                ObjectOverMap objectOverMap4 = (ObjectOverMap) promoConfigMapper$createPromoConfig$1.L$0;
                kotlin.b.b(obj2);
                gqf0Var = gqf0Var4;
                e = obj2;
                objectOverMap2 = objectOverMap4;
                llf0 llf0Var3 = (llf0) e;
                FormattedText e2 = objectOverMap2.getE();
                promoConfigMapper$createPromoConfig$1.L$0 = objectOverMap2;
                promoConfigMapper$createPromoConfig$1.L$1 = null;
                promoConfigMapper$createPromoConfig$1.L$2 = null;
                promoConfigMapper$createPromoConfig$1.L$3 = null;
                promoConfigMapper$createPromoConfig$1.L$4 = positionOverMap;
                promoConfigMapper$createPromoConfig$1.L$5 = null;
                promoConfigMapper$createPromoConfig$1.L$6 = str2;
                promoConfigMapper$createPromoConfig$1.L$7 = gqf0Var;
                promoConfigMapper$createPromoConfig$1.L$8 = llf0Var3;
                promoConfigMapper$createPromoConfig$1.L$9 = showPolicy;
                promoConfigMapper$createPromoConfig$1.label = 2;
                b2 = b(e2, promoConfigMapper$createPromoConfig$1);
                if (b2 != obj) {
                    objectOverMap3 = objectOverMap2;
                    llf0Var = llf0Var3;
                    str3 = str2;
                    showPolicy2 = showPolicy;
                    positionOverMap2 = positionOverMap;
                    gqf0Var2 = gqf0Var;
                    obj2 = b2;
                    return new mnf0(str3, gqf0Var2, llf0Var, showPolicy2, (CharSequence) obj2, positionOverMap2, objectOverMap3.getG(), objectOverMap3.getH());
                }
                return obj;
            }
        }
        promoConfigMapper$createPromoConfig$1 = new PromoConfigMapper$createPromoConfig$1(this, continuationImpl);
        Object obj22 = promoConfigMapper$createPromoConfig$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promoConfigMapper$createPromoConfig$1.label;
        if (i != 0) {
        }
        llf0 llf0Var32 = (llf0) e;
        FormattedText e22 = objectOverMap2.getE();
        promoConfigMapper$createPromoConfig$1.L$0 = objectOverMap2;
        promoConfigMapper$createPromoConfig$1.L$1 = null;
        promoConfigMapper$createPromoConfig$1.L$2 = null;
        promoConfigMapper$createPromoConfig$1.L$3 = null;
        promoConfigMapper$createPromoConfig$1.L$4 = positionOverMap;
        promoConfigMapper$createPromoConfig$1.L$5 = null;
        promoConfigMapper$createPromoConfig$1.L$6 = str2;
        promoConfigMapper$createPromoConfig$1.L$7 = gqf0Var;
        promoConfigMapper$createPromoConfig$1.L$8 = llf0Var32;
        promoConfigMapper$createPromoConfig$1.L$9 = showPolicy;
        promoConfigMapper$createPromoConfig$1.label = 2;
        b2 = b(e22, promoConfigMapper$createPromoConfig$1);
        if (b2 != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(FormattedText formattedText, ContinuationImpl continuationImpl) {
        PromoConfigMapper$loadBubble$1 promoConfigMapper$loadBubble$1;
        int i;
        if (continuationImpl instanceof PromoConfigMapper$loadBubble$1) {
            promoConfigMapper$loadBubble$1 = (PromoConfigMapper$loadBubble$1) continuationImpl;
            int i2 = promoConfigMapper$loadBubble$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promoConfigMapper$loadBubble$1.label = i2 - Integer.MIN_VALUE;
                PromoConfigMapper$loadBubble$1 promoConfigMapper$loadBubble$12 = promoConfigMapper$loadBubble$1;
                Object obj = promoConfigMapper$loadBubble$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promoConfigMapper$loadBubble$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (formattedText == null) {
                        return "";
                    }
                    promoConfigMapper$loadBubble$12.L$0 = null;
                    promoConfigMapper$loadBubble$12.L$1 = null;
                    promoConfigMapper$loadBubble$12.label = 1;
                    obj = ru.yandex.taxi.widget.c.e(this.c, formattedText, null, false, promoConfigMapper$loadBubble$12, 30);
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
                CharSequence charSequence = (CharSequence) obj;
                return charSequence != null ? "" : charSequence;
            }
        }
        promoConfigMapper$loadBubble$1 = new PromoConfigMapper$loadBubble$1(this, continuationImpl);
        PromoConfigMapper$loadBubble$1 promoConfigMapper$loadBubble$122 = promoConfigMapper$loadBubble$1;
        Object obj2 = promoConfigMapper$loadBubble$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promoConfigMapper$loadBubble$122.label;
        if (i != 0) {
        }
        CharSequence charSequence2 = (CharSequence) obj2;
        if (charSequence2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(LocalAnimation localAnimation, int i, double d, int i2, ContinuationImpl continuationImpl) {
        PromoConfigMapper$loadLottieLocalAnimation$1 promoConfigMapper$loadLottieLocalAnimation$1;
        int i3;
        int i4;
        int i5;
        double d2;
        if (continuationImpl instanceof PromoConfigMapper$loadLottieLocalAnimation$1) {
            promoConfigMapper$loadLottieLocalAnimation$1 = (PromoConfigMapper$loadLottieLocalAnimation$1) continuationImpl;
            int i6 = promoConfigMapper$loadLottieLocalAnimation$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                promoConfigMapper$loadLottieLocalAnimation$1.label = i6 - Integer.MIN_VALUE;
                Object obj = promoConfigMapper$loadLottieLocalAnimation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = promoConfigMapper$loadLottieLocalAnimation$1.label;
                if (i3 != 0) {
                    kotlin.b.b(obj);
                    String a = localAnimation.getA();
                    promoConfigMapper$loadLottieLocalAnimation$1.L$0 = null;
                    promoConfigMapper$loadLottieLocalAnimation$1.I$0 = i;
                    promoConfigMapper$loadLottieLocalAnimation$1.D$0 = d;
                    promoConfigMapper$loadLottieLocalAnimation$1.I$1 = i2;
                    promoConfigMapper$loadLottieLocalAnimation$1.label = 1;
                    Object d3 = chb1.d(this.a, a, promoConfigMapper$loadLottieLocalAnimation$1);
                    if (d3 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    i4 = i;
                    i5 = i2;
                    d2 = d;
                    obj = d3;
                } else {
                    if (i3 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i7 = promoConfigMapper$loadLottieLocalAnimation$1.I$1;
                    double d4 = promoConfigMapper$loadLottieLocalAnimation$1.D$0;
                    int i8 = promoConfigMapper$loadLottieLocalAnimation$1.I$0;
                    kotlin.b.b(obj);
                    i5 = i7;
                    d2 = d4;
                    i4 = i8;
                }
                return new llf0("Animation", (nsz) obj, i4, d2, i5, null, 32);
            }
        }
        promoConfigMapper$loadLottieLocalAnimation$1 = new PromoConfigMapper$loadLottieLocalAnimation$1(this, continuationImpl);
        Object obj2 = promoConfigMapper$loadLottieLocalAnimation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = promoConfigMapper$loadLottieLocalAnimation$1.label;
        if (i3 != 0) {
        }
        return new llf0("Animation", (nsz) obj2, i4, d2, i5, null, 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(RemoteAnimation remoteAnimation, int i, double d, int i2, ContinuationImpl continuationImpl) {
        PromoConfigMapper$loadLottieRemoteAnimation$1 promoConfigMapper$loadLottieRemoteAnimation$1;
        int i3;
        int i4;
        int i5;
        double d2;
        if (continuationImpl instanceof PromoConfigMapper$loadLottieRemoteAnimation$1) {
            promoConfigMapper$loadLottieRemoteAnimation$1 = (PromoConfigMapper$loadLottieRemoteAnimation$1) continuationImpl;
            int i6 = promoConfigMapper$loadLottieRemoteAnimation$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                promoConfigMapper$loadLottieRemoteAnimation$1.label = i6 - Integer.MIN_VALUE;
                Object obj = promoConfigMapper$loadLottieRemoteAnimation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = promoConfigMapper$loadLottieRemoteAnimation$1.label;
                if (i3 != 0) {
                    kotlin.b.b(obj);
                    nuz h = ssz.h(this.a, remoteAnimation.getA());
                    promoConfigMapper$loadLottieRemoteAnimation$1.L$0 = null;
                    promoConfigMapper$loadLottieRemoteAnimation$1.I$0 = i;
                    promoConfigMapper$loadLottieRemoteAnimation$1.D$0 = d;
                    promoConfigMapper$loadLottieRemoteAnimation$1.I$1 = i2;
                    promoConfigMapper$loadLottieRemoteAnimation$1.label = 1;
                    obj = chb1.c(h, promoConfigMapper$loadLottieRemoteAnimation$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    i4 = i2;
                    i5 = i;
                    d2 = d;
                } else {
                    if (i3 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i7 = promoConfigMapper$loadLottieRemoteAnimation$1.I$1;
                    double d3 = promoConfigMapper$loadLottieRemoteAnimation$1.D$0;
                    int i8 = promoConfigMapper$loadLottieRemoteAnimation$1.I$0;
                    kotlin.b.b(obj);
                    i4 = i7;
                    d2 = d3;
                    i5 = i8;
                }
                return new llf0("Animation", (nsz) obj, i5, d2, i4, null, 32);
            }
        }
        promoConfigMapper$loadLottieRemoteAnimation$1 = new PromoConfigMapper$loadLottieRemoteAnimation$1(this, continuationImpl);
        Object obj2 = promoConfigMapper$loadLottieRemoteAnimation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = promoConfigMapper$loadLottieRemoteAnimation$1.label;
        if (i3 != 0) {
        }
        return new llf0("Animation", (nsz) obj2, i5, d2, i4, null, 32);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a2, code lost:
    
        if (r2 == r7) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(com.yandex.go.shortcuts.dto.response.d dVar, ContinuationImpl continuationImpl) {
        PromoConfigMapper$loadPromoAnimation$1 promoConfigMapper$loadPromoAnimation$1;
        int i;
        String str;
        Object a;
        int i2;
        int i3;
        double d;
        Object c;
        if (continuationImpl instanceof PromoConfigMapper$loadPromoAnimation$1) {
            promoConfigMapper$loadPromoAnimation$1 = (PromoConfigMapper$loadPromoAnimation$1) continuationImpl;
            int i4 = promoConfigMapper$loadPromoAnimation$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                promoConfigMapper$loadPromoAnimation$1.label = i4 - Integer.MIN_VALUE;
                PromoConfigMapper$loadPromoAnimation$1 promoConfigMapper$loadPromoAnimation$12 = promoConfigMapper$loadPromoAnimation$1;
                Object obj = promoConfigMapper$loadPromoAnimation$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promoConfigMapper$loadPromoAnimation$12.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return (llf0) obj;
                    }
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i5 = promoConfigMapper$loadPromoAnimation$12.I$1;
                    double d2 = promoConfigMapper$loadPromoAnimation$12.D$0;
                    int i6 = promoConfigMapper$loadPromoAnimation$12.I$0;
                    str = (String) promoConfigMapper$loadPromoAnimation$12.L$1;
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                    i3 = i5;
                    i2 = i6;
                    d = d2;
                    return new llf0(str, null, i2, d, i3, (Bitmap) (a instanceof Result.Failure ? null : a), 30);
                }
                kotlin.b.b(obj);
                if (dVar instanceof LottieAnimation) {
                    LottieAnimation lottieAnimation = (LottieAnimation) dVar;
                    promoConfigMapper$loadPromoAnimation$12.L$0 = null;
                    promoConfigMapper$loadPromoAnimation$12.label = 1;
                    com.yandex.go.shortcuts.dto.response.c d3 = lottieAnimation.getD();
                    if (d3 instanceof RemoteAnimation) {
                        c = d((RemoteAnimation) d3, lottieAnimation.getA(), lottieAnimation.getC(), lottieAnimation.getB(), promoConfigMapper$loadPromoAnimation$12);
                    } else {
                        if (!(d3 instanceof LocalAnimation)) {
                            kbs.g("Unknown promo lottie animation type !");
                            return null;
                        }
                        c = c((LocalAnimation) d3, lottieAnimation.getA(), lottieAnimation.getC(), lottieAnimation.getB(), promoConfigMapper$loadPromoAnimation$12);
                    }
                    obj = c;
                } else {
                    if (!(dVar instanceof StaticImage)) {
                        ny61.r("Unknown promo animation type !");
                        return null;
                    }
                    StaticImage staticImage = (StaticImage) dVar;
                    c4v c4vVar = new c4v(staticImage.getB(), staticImage.getA());
                    promoConfigMapper$loadPromoAnimation$12.L$0 = null;
                    str = "Image";
                    promoConfigMapper$loadPromoAnimation$12.L$1 = "Image";
                    promoConfigMapper$loadPromoAnimation$12.I$0 = 0;
                    promoConfigMapper$loadPromoAnimation$12.D$0 = 0.0d;
                    promoConfigMapper$loadPromoAnimation$12.I$1 = 0;
                    promoConfigMapper$loadPromoAnimation$12.label = 2;
                    a = this.b.a(c4vVar, pfv.a, promoConfigMapper$loadPromoAnimation$12);
                    if (a != obj2) {
                        i2 = 0;
                        i3 = 0;
                        d = 0.0d;
                        return new llf0(str, null, i2, d, i3, (Bitmap) (a instanceof Result.Failure ? null : a), 30);
                    }
                }
                return obj2;
            }
        }
        promoConfigMapper$loadPromoAnimation$1 = new PromoConfigMapper$loadPromoAnimation$1(this, continuationImpl);
        PromoConfigMapper$loadPromoAnimation$1 promoConfigMapper$loadPromoAnimation$122 = promoConfigMapper$loadPromoAnimation$1;
        Object obj3 = promoConfigMapper$loadPromoAnimation$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promoConfigMapper$loadPromoAnimation$122.label;
        if (i == 0) {
        }
    }
}
