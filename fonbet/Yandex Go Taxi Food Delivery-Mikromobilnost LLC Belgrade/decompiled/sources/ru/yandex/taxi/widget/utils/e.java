package ru.yandex.taxi.widget.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableStringBuilder;
import com.yandex.go.image.domain.requests.f;
import defpackage.bdc;
import defpackage.evu0;
import defpackage.g16;
import defpackage.kdc;
import defpackage.n4v;
import defpackage.ny61;
import defpackage.obv;
import defpackage.pav;
import defpackage.pdc;
import defpackage.pfv;
import defpackage.pvn;
import defpackage.s8o;
import defpackage.tfv;
import defpackage.tpr;
import defpackage.u4b1;
import defpackage.ufu;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes10.dex */
public final class e {
    public final Context a;
    public final pav b;
    public final pdc c;
    public final ru.yandex.taxi.widget.c d;

    public e(Context context, pav pavVar, pdc pdcVar, ru.yandex.taxi.widget.c cVar) {
        this.a = context;
        this.b = pavVar;
        this.c = pdcVar;
        this.d = cVar;
    }

    public static Object f(e eVar, String str, tfv tfvVar, Continuation continuation, int i) {
        if ((i & 2) != 0) {
            tfvVar = pfv.a;
        }
        eVar.getClass();
        if (str == null || evu0.J(str)) {
            return null;
        }
        return eVar.e(new obv(str, null, 6, 0), tfvVar, continuation);
    }

    public static /* synthetic */ Object i(e eVar, String str, tfv tfvVar, ContinuationImpl continuationImpl, int i) {
        if ((i & 8) != 0) {
            tfvVar = pfv.a;
        }
        return eVar.h(str, tfvVar, continuationImpl);
    }

    public static /* synthetic */ Object k(e eVar, String str, tfv tfvVar, Continuation continuation, int i) {
        if ((i & 8) != 0) {
            tfvVar = pfv.a;
        }
        return eVar.j(str, 0, 0, tfvVar, continuation);
    }

    public static /* synthetic */ Object o(e eVar, String str, tfv tfvVar, Continuation continuation, int i) {
        if ((i & 8) != 0) {
            tfvVar = pfv.a;
        }
        return eVar.n(str, 0, 0, tfvVar, continuation);
    }

    public static Object s(e eVar, FormattedText formattedText, Continuation continuation) {
        return ru.yandex.taxi.widget.c.i(eVar.d, formattedText, kotlin.collections.b.f(), continuation, 28);
    }

    public final kdc a(String str) {
        return ((ufu) this.c).b(str);
    }

    public final int b(int i, String str) {
        return s8o.m(((ufu) this.c).a(new bdc(i), str), this.a);
    }

    public final Integer c(String str) {
        kdc b = ((ufu) this.c).b(str);
        if (b != null) {
            return Integer.valueOf(s8o.m(b, this.a));
        }
        return null;
    }

    public final kdc d(String str) {
        return ((ufu) this.c).e(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(obv obvVar, tfv tfvVar, Continuation continuation) {
        MediaInfoConverter$icon$1 mediaInfoConverter$icon$1;
        int i;
        Bitmap bitmap;
        if (continuation instanceof MediaInfoConverter$icon$1) {
            mediaInfoConverter$icon$1 = (MediaInfoConverter$icon$1) continuation;
            int i2 = mediaInfoConverter$icon$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mediaInfoConverter$icon$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mediaInfoConverter$icon$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mediaInfoConverter$icon$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (u4b1.c(obvVar)) {
                        g16 e = this.b.b().i(obvVar).e(tfvVar);
                        mediaInfoConverter$icon$1.L$0 = null;
                        mediaInfoConverter$icon$1.L$1 = null;
                        mediaInfoConverter$icon$1.L$2 = null;
                        mediaInfoConverter$icon$1.label = 1;
                        obj = ru.yandex.taxi.utils.a.b(e, mediaInfoConverter$icon$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    return new BitmapDrawable(this.a.getResources(), bitmap);
                }
                return null;
            }
        }
        mediaInfoConverter$icon$1 = new MediaInfoConverter$icon$1(this, continuation);
        Object obj2 = mediaInfoConverter$icon$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mediaInfoConverter$icon$1.label;
        if (i != 0) {
        }
        bitmap = (Bitmap) obj2;
        if (bitmap != null) {
        }
        return null;
    }

    public final tpr g(String str) {
        return evu0.J(str) ? pvn.a : new b(this.b.b().i(new obv(str, null, 6, 0)).f(), this);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, tfv tfvVar, ContinuationImpl continuationImpl) {
        MediaInfoConverter$iconByTagFromCache$1 mediaInfoConverter$iconByTagFromCache$1;
        int i;
        Bitmap bitmap;
        if (continuationImpl instanceof MediaInfoConverter$iconByTagFromCache$1) {
            mediaInfoConverter$iconByTagFromCache$1 = (MediaInfoConverter$iconByTagFromCache$1) continuationImpl;
            int i2 = mediaInfoConverter$iconByTagFromCache$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mediaInfoConverter$iconByTagFromCache$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mediaInfoConverter$iconByTagFromCache$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mediaInfoConverter$iconByTagFromCache$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (str != null && !evu0.J(str)) {
                        f g = this.b.g();
                        g.c(new obv(str, null, 6, 0));
                        g.e(0, 0);
                        g.f(tfvVar);
                        mediaInfoConverter$iconByTagFromCache$1.L$0 = null;
                        mediaInfoConverter$iconByTagFromCache$1.L$1 = null;
                        mediaInfoConverter$iconByTagFromCache$1.I$0 = 0;
                        mediaInfoConverter$iconByTagFromCache$1.I$1 = 0;
                        mediaInfoConverter$iconByTagFromCache$1.label = 1;
                        obj = g.b(mediaInfoConverter$iconByTagFromCache$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    return new BitmapDrawable(this.a.getResources(), bitmap);
                }
                return null;
            }
        }
        mediaInfoConverter$iconByTagFromCache$1 = new MediaInfoConverter$iconByTagFromCache$1(this, continuationImpl);
        Object obj2 = mediaInfoConverter$iconByTagFromCache$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mediaInfoConverter$iconByTagFromCache$1.label;
        if (i != 0) {
        }
        bitmap = (Bitmap) obj2;
        if (bitmap != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, int i, int i2, tfv tfvVar, Continuation continuation) {
        MediaInfoConverter$iconByUrl$1 mediaInfoConverter$iconByUrl$1;
        int i3;
        Bitmap bitmap;
        if (continuation instanceof MediaInfoConverter$iconByUrl$1) {
            mediaInfoConverter$iconByUrl$1 = (MediaInfoConverter$iconByUrl$1) continuation;
            int i4 = mediaInfoConverter$iconByUrl$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                mediaInfoConverter$iconByUrl$1.label = i4 - Integer.MIN_VALUE;
                Object obj = mediaInfoConverter$iconByUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = mediaInfoConverter$iconByUrl$1.label;
                if (i3 != 0) {
                    kotlin.b.b(obj);
                    if (str != null && !evu0.J(str)) {
                        g16 e = this.b.b().b(str).g(i, i2).e(tfvVar);
                        mediaInfoConverter$iconByUrl$1.L$0 = null;
                        mediaInfoConverter$iconByUrl$1.L$1 = null;
                        mediaInfoConverter$iconByUrl$1.I$0 = i;
                        mediaInfoConverter$iconByUrl$1.I$1 = i2;
                        mediaInfoConverter$iconByUrl$1.label = 1;
                        obj = ru.yandex.taxi.utils.a.b(e, mediaInfoConverter$iconByUrl$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return null;
                }
                if (i3 != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    return new BitmapDrawable(this.a.getResources(), bitmap);
                }
                return null;
            }
        }
        mediaInfoConverter$iconByUrl$1 = new MediaInfoConverter$iconByUrl$1(this, continuation);
        Object obj2 = mediaInfoConverter$iconByUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = mediaInfoConverter$iconByUrl$1.label;
        if (i3 != 0) {
        }
        bitmap = (Bitmap) obj2;
        if (bitmap != null) {
        }
        return null;
    }

    public final tpr l(String str, int i, int i2, tfv tfvVar) {
        return evu0.J(str) ? pvn.a : new d(this.b.b().b(str).g(i, i2).e(tfvVar).f(), this);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(String str, int i, int i2, tfv tfvVar, Continuation continuation) {
        MediaInfoConverter$iconByUrlFromCache$1 mediaInfoConverter$iconByUrlFromCache$1;
        int i3;
        Bitmap bitmap;
        if (continuation instanceof MediaInfoConverter$iconByUrlFromCache$1) {
            mediaInfoConverter$iconByUrlFromCache$1 = (MediaInfoConverter$iconByUrlFromCache$1) continuation;
            int i4 = mediaInfoConverter$iconByUrlFromCache$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                mediaInfoConverter$iconByUrlFromCache$1.label = i4 - Integer.MIN_VALUE;
                Object obj = mediaInfoConverter$iconByUrlFromCache$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = mediaInfoConverter$iconByUrlFromCache$1.label;
                if (i3 != 0) {
                    kotlin.b.b(obj);
                    if (str != null && !evu0.J(str)) {
                        f g = this.b.g();
                        g.d(str);
                        g.e(i, i2);
                        g.f(tfvVar);
                        mediaInfoConverter$iconByUrlFromCache$1.L$0 = null;
                        mediaInfoConverter$iconByUrlFromCache$1.L$1 = null;
                        mediaInfoConverter$iconByUrlFromCache$1.I$0 = i;
                        mediaInfoConverter$iconByUrlFromCache$1.I$1 = i2;
                        mediaInfoConverter$iconByUrlFromCache$1.label = 1;
                        obj = g.b(mediaInfoConverter$iconByUrlFromCache$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return null;
                }
                if (i3 != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    return new BitmapDrawable(this.a.getResources(), bitmap);
                }
                return null;
            }
        }
        mediaInfoConverter$iconByUrlFromCache$1 = new MediaInfoConverter$iconByUrlFromCache$1(this, continuation);
        Object obj2 = mediaInfoConverter$iconByUrlFromCache$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = mediaInfoConverter$iconByUrlFromCache$1.label;
        if (i3 != 0) {
        }
        bitmap = (Bitmap) obj2;
        if (bitmap != null) {
        }
        return null;
    }

    public final Integer p(String str) {
        kdc g = ((ufu) this.c).g(str);
        if (g != null) {
            return Integer.valueOf(s8o.m(g, this.a));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(String str, ContinuationImpl continuationImpl) {
        MediaInfoConverter$iconInfoByTag$1 mediaInfoConverter$iconInfoByTag$1;
        int i;
        BitmapDrawable bitmapDrawable;
        if (continuationImpl instanceof MediaInfoConverter$iconInfoByTag$1) {
            mediaInfoConverter$iconInfoByTag$1 = (MediaInfoConverter$iconInfoByTag$1) continuationImpl;
            int i2 = mediaInfoConverter$iconInfoByTag$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mediaInfoConverter$iconInfoByTag$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mediaInfoConverter$iconInfoByTag$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mediaInfoConverter$iconInfoByTag$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mediaInfoConverter$iconInfoByTag$1.L$0 = str;
                    mediaInfoConverter$iconInfoByTag$1.label = 1;
                    obj = f(this, str, null, mediaInfoConverter$iconInfoByTag$1, 6);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) mediaInfoConverter$iconInfoByTag$1.L$0;
                    kotlin.b.b(obj);
                }
                bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable == null) {
                    return new n4v(bitmapDrawable, str);
                }
                return null;
            }
        }
        mediaInfoConverter$iconInfoByTag$1 = new MediaInfoConverter$iconInfoByTag$1(this, continuationImpl);
        Object obj2 = mediaInfoConverter$iconInfoByTag$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mediaInfoConverter$iconInfoByTag$1.label;
        if (i != 0) {
        }
        bitmapDrawable = (BitmapDrawable) obj2;
        if (bitmapDrawable == null) {
        }
    }

    public final SpannableStringBuilder r(FormattedText formattedText) {
        return ru.yandex.taxi.widget.c.f(this.d, formattedText, false, null, 12);
    }

    public final Object t(FormattedText formattedText, Continuation continuation) {
        return ru.yandex.taxi.widget.c.e(this.d, formattedText, null, false, continuation, 30);
    }

    public final int u(int i, String str) {
        return s8o.m(((ufu) this.c).h(new bdc(i), str), this.a);
    }

    public final kdc v(String str) {
        return ((ufu) this.c).i(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(FormattedText formattedText, int i, ContinuationImpl continuationImpl) {
        MediaInfoConverter$textOrDefault$1 mediaInfoConverter$textOrDefault$1;
        int i2;
        if (continuationImpl instanceof MediaInfoConverter$textOrDefault$1) {
            mediaInfoConverter$textOrDefault$1 = (MediaInfoConverter$textOrDefault$1) continuationImpl;
            int i3 = mediaInfoConverter$textOrDefault$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mediaInfoConverter$textOrDefault$1.label = i3 - Integer.MIN_VALUE;
                Object obj = mediaInfoConverter$textOrDefault$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = mediaInfoConverter$textOrDefault$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    mediaInfoConverter$textOrDefault$1.L$0 = null;
                    mediaInfoConverter$textOrDefault$1.I$0 = i;
                    mediaInfoConverter$textOrDefault$1.label = 1;
                    obj = x(formattedText, mediaInfoConverter$textOrDefault$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = mediaInfoConverter$textOrDefault$1.I$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence = (CharSequence) obj;
                return charSequence != null ? this.a.getString(i) : charSequence;
            }
        }
        mediaInfoConverter$textOrDefault$1 = new MediaInfoConverter$textOrDefault$1(this, continuationImpl);
        Object obj3 = mediaInfoConverter$textOrDefault$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = mediaInfoConverter$textOrDefault$1.label;
        if (i2 != 0) {
        }
        CharSequence charSequence2 = (CharSequence) obj3;
        if (charSequence2 != null) {
        }
    }

    public final Object x(FormattedText formattedText, Continuation continuation) {
        if (formattedText == null) {
            return null;
        }
        return t(formattedText, continuation);
    }
}
