package ru.yandex.taxi.layers.source.factory;

import android.graphics.Bitmap;
import defpackage.bg60;
import defpackage.fm00;
import defpackage.g16;
import defpackage.jst;
import defpackage.ny61;
import defpackage.o9u0;
import defpackage.obv;
import defpackage.pav;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes9.dex */
public final class b {
    public final pav a;
    public final ru.yandex.taxi.widget.c b;

    public b(pav pavVar, ru.yandex.taxi.widget.c cVar) {
        this.a = pavVar;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, CharSequence charSequence, CharSequence charSequence2, String str2, ContinuationImpl continuationImpl) {
        MapNotificationFactory$buildMapNotification$1 mapNotificationFactory$buildMapNotification$1;
        int i;
        try {
            if (continuationImpl instanceof MapNotificationFactory$buildMapNotification$1) {
                mapNotificationFactory$buildMapNotification$1 = (MapNotificationFactory$buildMapNotification$1) continuationImpl;
                int i2 = mapNotificationFactory$buildMapNotification$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    mapNotificationFactory$buildMapNotification$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = mapNotificationFactory$buildMapNotification$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = mapNotificationFactory$buildMapNotification$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        if (str2 == null) {
                            return new fm00(charSequence, charSequence2, str);
                        }
                        g16 i3 = this.a.b().i(new obv(str2, null, 6, 0));
                        mapNotificationFactory$buildMapNotification$1.L$0 = str;
                        mapNotificationFactory$buildMapNotification$1.L$1 = charSequence;
                        mapNotificationFactory$buildMapNotification$1.L$2 = charSequence2;
                        mapNotificationFactory$buildMapNotification$1.L$3 = null;
                        mapNotificationFactory$buildMapNotification$1.label = 1;
                        obj = i3.a(mapNotificationFactory$buildMapNotification$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        charSequence2 = (CharSequence) mapNotificationFactory$buildMapNotification$1.L$2;
                        charSequence = (CharSequence) mapNotificationFactory$buildMapNotification$1.L$1;
                        str = (String) mapNotificationFactory$buildMapNotification$1.L$0;
                        kotlin.b.b(obj);
                    }
                    return new fm00(str, charSequence, charSequence2, (Bitmap) obj);
                }
            }
            if (i != 0) {
            }
            return new fm00(str, charSequence, charSequence2, (Bitmap) obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, "Failed to load image fot map notification");
            return new fm00(charSequence, charSequence2, str);
        }
        mapNotificationFactory$buildMapNotification$1 = new MapNotificationFactory$buildMapNotification$1(this, continuationImpl);
        Object obj2 = mapNotificationFactory$buildMapNotification$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapNotificationFactory$buildMapNotification$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(bg60 bg60Var, ContinuationImpl continuationImpl) {
        MapNotificationFactory$createMapNotification$1 mapNotificationFactory$createMapNotification$1;
        int i;
        bg60 bg60Var2;
        String str;
        if (continuationImpl instanceof MapNotificationFactory$createMapNotification$1) {
            mapNotificationFactory$createMapNotification$1 = (MapNotificationFactory$createMapNotification$1) continuationImpl;
            int i2 = mapNotificationFactory$createMapNotification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapNotificationFactory$createMapNotification$1.label = i2 - Integer.MIN_VALUE;
                MapNotificationFactory$createMapNotification$1 mapNotificationFactory$createMapNotification$12 = mapNotificationFactory$createMapNotification$1;
                Object obj = mapNotificationFactory$createMapNotification$12.result;
                Serializable serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapNotificationFactory$createMapNotification$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String a = bg60Var.getA();
                    if (a != null) {
                        FormattedText b = bg60Var.getB();
                        FormattedText c = bg60Var.getC();
                        if (b != null) {
                            mapNotificationFactory$createMapNotification$12.L$0 = bg60Var;
                            mapNotificationFactory$createMapNotification$12.L$1 = a;
                            mapNotificationFactory$createMapNotification$12.L$2 = null;
                            mapNotificationFactory$createMapNotification$12.L$3 = null;
                            mapNotificationFactory$createMapNotification$12.label = 1;
                            Serializable d = d(b, c, mapNotificationFactory$createMapNotification$12);
                            if (d != serializable) {
                                bg60Var2 = bg60Var;
                                str = a;
                                obj = d;
                            }
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                str = (String) mapNotificationFactory$createMapNotification$12.L$1;
                bg60Var2 = (bg60) mapNotificationFactory$createMapNotification$12.L$0;
                kotlin.b.b(obj);
                Pair pair = (Pair) obj;
                CharSequence charSequence = (CharSequence) pair.getFirst();
                CharSequence charSequence2 = (CharSequence) pair.getSecond();
                String d2 = bg60Var2.getD();
                mapNotificationFactory$createMapNotification$12.L$0 = null;
                mapNotificationFactory$createMapNotification$12.L$1 = null;
                mapNotificationFactory$createMapNotification$12.L$2 = null;
                mapNotificationFactory$createMapNotification$12.L$3 = null;
                mapNotificationFactory$createMapNotification$12.L$4 = null;
                mapNotificationFactory$createMapNotification$12.L$5 = null;
                mapNotificationFactory$createMapNotification$12.label = 2;
                Object a2 = a(str, charSequence, charSequence2, d2, mapNotificationFactory$createMapNotification$12);
                return a2 != serializable ? serializable : a2;
            }
        }
        mapNotificationFactory$createMapNotification$1 = new MapNotificationFactory$createMapNotification$1(this, continuationImpl);
        MapNotificationFactory$createMapNotification$1 mapNotificationFactory$createMapNotification$122 = mapNotificationFactory$createMapNotification$1;
        Object obj2 = mapNotificationFactory$createMapNotification$122.result;
        Serializable serializable2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapNotificationFactory$createMapNotification$122.label;
        if (i != 0) {
        }
        Pair pair2 = (Pair) obj2;
        CharSequence charSequence3 = (CharSequence) pair2.getFirst();
        CharSequence charSequence22 = (CharSequence) pair2.getSecond();
        String d22 = bg60Var2.getD();
        mapNotificationFactory$createMapNotification$122.L$0 = null;
        mapNotificationFactory$createMapNotification$122.L$1 = null;
        mapNotificationFactory$createMapNotification$122.L$2 = null;
        mapNotificationFactory$createMapNotification$122.L$3 = null;
        mapNotificationFactory$createMapNotification$122.L$4 = null;
        mapNotificationFactory$createMapNotification$122.L$5 = null;
        mapNotificationFactory$createMapNotification$122.label = 2;
        Object a22 = a(str, charSequence3, charSequence22, d22, mapNotificationFactory$createMapNotification$122);
        if (a22 != serializable2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x008c -> B:10:0x008f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(o9u0 o9u0Var, ContinuationImpl continuationImpl) {
        MapNotificationFactory$createMapNotifications$1 mapNotificationFactory$createMapNotifications$1;
        int i;
        List a;
        Iterator it;
        Collection collection;
        if (continuationImpl instanceof MapNotificationFactory$createMapNotifications$1) {
            mapNotificationFactory$createMapNotifications$1 = (MapNotificationFactory$createMapNotifications$1) continuationImpl;
            int i2 = mapNotificationFactory$createMapNotifications$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapNotificationFactory$createMapNotifications$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapNotificationFactory$createMapNotifications$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapNotificationFactory$createMapNotifications$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (o9u0Var == null || (a = o9u0Var.getA()) == null) {
                        return EmptyList.a;
                    }
                    ArrayList arrayList = new ArrayList();
                    it = a.iterator();
                    collection = arrayList;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) mapNotificationFactory$createMapNotifications$1.L$6;
                    collection = (Collection) mapNotificationFactory$createMapNotifications$1.L$4;
                    kotlin.b.b(obj);
                    fm00 fm00Var = (fm00) obj;
                    if (fm00Var != null) {
                        collection.add(fm00Var);
                    }
                    if (it.hasNext()) {
                        bg60 bg60Var = (bg60) it.next();
                        mapNotificationFactory$createMapNotifications$1.L$0 = null;
                        mapNotificationFactory$createMapNotifications$1.L$1 = null;
                        mapNotificationFactory$createMapNotifications$1.L$2 = null;
                        mapNotificationFactory$createMapNotifications$1.L$3 = null;
                        mapNotificationFactory$createMapNotifications$1.L$4 = collection;
                        mapNotificationFactory$createMapNotifications$1.L$5 = null;
                        mapNotificationFactory$createMapNotifications$1.L$6 = it;
                        mapNotificationFactory$createMapNotifications$1.L$7 = null;
                        mapNotificationFactory$createMapNotifications$1.L$8 = null;
                        mapNotificationFactory$createMapNotifications$1.L$9 = null;
                        mapNotificationFactory$createMapNotifications$1.label = 1;
                        obj = b(bg60Var, mapNotificationFactory$createMapNotifications$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                        fm00 fm00Var2 = (fm00) obj;
                        if (fm00Var2 != null) {
                        }
                        if (it.hasNext()) {
                            return (List) collection;
                        }
                    }
                }
            }
        }
        mapNotificationFactory$createMapNotifications$1 = new MapNotificationFactory$createMapNotifications$1(this, continuationImpl);
        Object obj3 = mapNotificationFactory$createMapNotifications$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapNotificationFactory$createMapNotifications$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        if (r12 == r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable d(FormattedText formattedText, FormattedText formattedText2, ContinuationImpl continuationImpl) {
        MapNotificationFactory$handleFormattedTexts$1 mapNotificationFactory$handleFormattedTexts$1;
        int i;
        FormattedText formattedText3;
        CharSequence charSequence;
        CharSequence charSequence2;
        Object obj;
        if (continuationImpl instanceof MapNotificationFactory$handleFormattedTexts$1) {
            mapNotificationFactory$handleFormattedTexts$1 = (MapNotificationFactory$handleFormattedTexts$1) continuationImpl;
            int i2 = mapNotificationFactory$handleFormattedTexts$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapNotificationFactory$handleFormattedTexts$1.label = i2 - Integer.MIN_VALUE;
                MapNotificationFactory$handleFormattedTexts$1 mapNotificationFactory$handleFormattedTexts$12 = mapNotificationFactory$handleFormattedTexts$1;
                Object obj2 = mapNotificationFactory$handleFormattedTexts$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapNotificationFactory$handleFormattedTexts$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    mapNotificationFactory$handleFormattedTexts$12.L$0 = null;
                    mapNotificationFactory$handleFormattedTexts$12.L$1 = formattedText2;
                    mapNotificationFactory$handleFormattedTexts$12.label = 1;
                    obj2 = ru.yandex.taxi.widget.c.e(this.b, formattedText, null, false, mapNotificationFactory$handleFormattedTexts$12, 30);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        charSequence2 = (CharSequence) mapNotificationFactory$handleFormattedTexts$12.L$2;
                        kotlin.b.b(obj2);
                        obj = (CharSequence) obj2;
                        if (obj == null) {
                            charSequence = charSequence2;
                            obj = "";
                            charSequence2 = charSequence;
                        }
                        return new Pair(charSequence2, obj);
                    }
                    formattedText2 = (FormattedText) mapNotificationFactory$handleFormattedTexts$12.L$1;
                    kotlin.b.b(obj2);
                }
                formattedText3 = formattedText2;
                charSequence = (CharSequence) obj2;
                if (formattedText3 != null) {
                    mapNotificationFactory$handleFormattedTexts$12.L$0 = null;
                    mapNotificationFactory$handleFormattedTexts$12.L$1 = null;
                    mapNotificationFactory$handleFormattedTexts$12.L$2 = charSequence;
                    mapNotificationFactory$handleFormattedTexts$12.L$3 = null;
                    mapNotificationFactory$handleFormattedTexts$12.label = 2;
                    obj2 = ru.yandex.taxi.widget.c.e(this.b, formattedText3, null, false, mapNotificationFactory$handleFormattedTexts$12, 30);
                    if (obj2 != coroutineSingletons) {
                        charSequence2 = charSequence;
                        obj = (CharSequence) obj2;
                        if (obj == null) {
                        }
                        return new Pair(charSequence2, obj);
                    }
                    return coroutineSingletons;
                }
                obj = "";
                charSequence2 = charSequence;
                return new Pair(charSequence2, obj);
            }
        }
        mapNotificationFactory$handleFormattedTexts$1 = new MapNotificationFactory$handleFormattedTexts$1(this, continuationImpl);
        MapNotificationFactory$handleFormattedTexts$1 mapNotificationFactory$handleFormattedTexts$122 = mapNotificationFactory$handleFormattedTexts$1;
        Object obj22 = mapNotificationFactory$handleFormattedTexts$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapNotificationFactory$handleFormattedTexts$122.label;
        if (i != 0) {
        }
        formattedText3 = formattedText2;
        charSequence = (CharSequence) obj22;
        if (formattedText3 != null) {
        }
        obj = "";
        charSequence2 = charSequence;
        return new Pair(charSequence2, obj);
    }
}
