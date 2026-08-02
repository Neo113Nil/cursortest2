package ru.yandex.taxi.layers.source.factory.componentfactory;

import com.yandex.runtime.image.ImageProvider;
import defpackage.dxu0;
import defpackage.evu0;
import defpackage.mbb1;
import defpackage.ny61;
import defpackage.om6;
import defpackage.qn6;
import defpackage.rl6;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.common_models.net.map_object.BubbleShowState;
import ru.yandex.taxi.layers.domain.model.BubbleType;

/* loaded from: classes5.dex */
public final class n implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ r b;

    public n(vpr vprVar, r rVar) {
        this.a = vprVar;
        this.b = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9 A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:18:0x0051, B:20:0x005f, B:26:0x0074, B:29:0x0082, B:32:0x00a9, B:34:0x00af, B:86:0x006a), top: B:17:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0105 A[Catch: all -> 0x00ca, TryCatch #1 {all -> 0x00ca, blocks: (B:36:0x00d7, B:38:0x00db, B:41:0x00e1, B:44:0x00f4, B:46:0x00f9, B:48:0x0105, B:50:0x010d, B:53:0x011b, B:55:0x0138, B:58:0x0144, B:59:0x0155, B:66:0x0149, B:68:0x00e8, B:70:0x00f0, B:75:0x00bc, B:78:0x00c5, B:80:0x00cd), top: B:30:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0138 A[Catch: all -> 0x00ca, TryCatch #1 {all -> 0x00ca, blocks: (B:36:0x00d7, B:38:0x00db, B:41:0x00e1, B:44:0x00f4, B:46:0x00f9, B:48:0x0105, B:50:0x010d, B:53:0x011b, B:55:0x0138, B:58:0x0144, B:59:0x0155, B:66:0x0149, B:68:0x00e8, B:70:0x00f0, B:75:0x00bc, B:78:0x00c5, B:80:0x00cd), top: B:30:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0149 A[Catch: all -> 0x00ca, TryCatch #1 {all -> 0x00ca, blocks: (B:36:0x00d7, B:38:0x00db, B:41:0x00e1, B:44:0x00f4, B:46:0x00f9, B:48:0x0105, B:50:0x010d, B:53:0x011b, B:55:0x0138, B:58:0x0144, B:59:0x0155, B:66:0x0149, B:68:0x00e8, B:70:0x00f0, B:75:0x00bc, B:78:0x00c5, B:80:0x00cd), top: B:30:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00cd A[Catch: all -> 0x00ca, TryCatch #1 {all -> 0x00ca, blocks: (B:36:0x00d7, B:38:0x00db, B:41:0x00e1, B:44:0x00f4, B:46:0x00f9, B:48:0x0105, B:50:0x010d, B:53:0x011b, B:55:0x0138, B:58:0x0144, B:59:0x0155, B:66:0x0149, B:68:0x00e8, B:70:0x00f0, B:75:0x00bc, B:78:0x00c5, B:80:0x00cd), top: B:30:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        BubbleComponentFactory$createBubbles$$inlined$map$1$2$1 bubbleComponentFactory$createBubbles$$inlined$map$1$2$1;
        int i;
        Object obj2;
        String wireName;
        dxu0 dxu0Var;
        String hexString;
        ImageProvider imageProvider;
        dxu0 dxu0Var2;
        ImageProvider imageProvider2;
        ImageProvider imageProvider3;
        Triple triple;
        String str;
        BubbleType bubbleType;
        String b;
        String str2;
        List list;
        qn6 qn6Var;
        String str3;
        qn6 qn6Var2;
        if (continuation instanceof BubbleComponentFactory$createBubbles$$inlined$map$1$2$1) {
            bubbleComponentFactory$createBubbles$$inlined$map$1$2$1 = (BubbleComponentFactory$createBubbles$$inlined$map$1$2$1) continuation;
            int i2 = bubbleComponentFactory$createBubbles$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bubbleComponentFactory$createBubbles$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = bubbleComponentFactory$createBubbles$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bubbleComponentFactory$createBubbles$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    vpr vprVar = this.a;
                    om6 om6Var = (om6) obj;
                    r rVar = this.b;
                    List list2 = om6Var.a;
                    List list3 = om6Var.b;
                    qn6 qn6Var3 = om6Var.c;
                    rl6 rl6Var = om6Var.d;
                    Object obj4 = rVar.h;
                    synchronized (obj4) {
                        try {
                            wireName = rVar.g.getThemeType().getWireName();
                            dxu0Var = rl6Var.k;
                        } catch (Throwable th) {
                            th = th;
                            obj2 = obj4;
                        }
                        try {
                            if (dxu0Var != null) {
                                hexString = dxu0Var.a;
                                if (hexString == null) {
                                }
                                String str4 = hexString;
                                boolean z = qn6Var3 == null && qn6Var3.b.contains(BubbleShowState.UNSELECTED);
                                String str5 = ru.yandex.taxi.layers.source.factory.a.b(rl6Var.a) + str4 + z + wireName;
                                BubbleType e = mbb1.e(rl6Var);
                                obj2 = rVar.k.get(str5);
                                if (obj2 == null) {
                                    obj2 = obj4;
                                    imageProvider = (ImageProvider) rVar.k.get(str5);
                                } else if (list2.isEmpty()) {
                                    imageProvider = ImageProvider.fromBitmap(r.n);
                                    obj2 = obj4;
                                } else {
                                    obj2 = obj4;
                                    dxu0 dxu0Var3 = rl6Var.k;
                                    if (z) {
                                        str3 = str5;
                                        qn6Var2 = qn6Var3;
                                    } else {
                                        str3 = str5;
                                        qn6Var2 = null;
                                    }
                                    imageProvider = rVar.e(dxu0Var3, str3, list2, qn6Var2, str4, wireName, e);
                                }
                                dxu0Var2 = rl6Var.l;
                                if (dxu0Var2 != null || (str = dxu0Var2.a) == null) {
                                    imageProvider2 = imageProvider;
                                    imageProvider3 = null;
                                } else {
                                    Integer num = dxu0Var2 != null ? dxu0Var2.h : null;
                                    if (num != null && num.intValue() == 16) {
                                        bubbleType = BubbleType.MEDIUM_OR_LARGE_CORNER_RADIUS_16;
                                        BubbleType bubbleType2 = bubbleType;
                                        b = ru.yandex.taxi.layers.source.factory.a.b(rl6Var.b);
                                        if (evu0.J(b)) {
                                            b = ru.yandex.taxi.layers.source.factory.a.b(rl6Var.a);
                                        }
                                        boolean z2 = qn6Var3 == null && qn6Var3.b.contains(BubbleShowState.SELECTED);
                                        str2 = b + str + z2 + wireName;
                                        if (rVar.k.get(str2) != null) {
                                            ImageProvider imageProvider4 = imageProvider;
                                            dxu0 dxu0Var4 = rl6Var.l;
                                            if (z2) {
                                                list = list3;
                                                imageProvider2 = imageProvider4;
                                                qn6Var = qn6Var3;
                                            } else {
                                                list = list3;
                                                imageProvider2 = imageProvider4;
                                                qn6Var = null;
                                            }
                                            imageProvider3 = rVar.e(dxu0Var4, str2, list, qn6Var, str, wireName, bubbleType2);
                                        } else {
                                            imageProvider2 = imageProvider;
                                            imageProvider3 = (ImageProvider) rVar.k.get(str2);
                                        }
                                    }
                                    bubbleType = mbb1.f(rl6Var);
                                    BubbleType bubbleType22 = bubbleType;
                                    b = ru.yandex.taxi.layers.source.factory.a.b(rl6Var.b);
                                    if (evu0.J(b)) {
                                    }
                                    if (qn6Var3 == null) {
                                    }
                                    str2 = b + str + z2 + wireName;
                                    if (rVar.k.get(str2) != null) {
                                    }
                                }
                                triple = new Triple(imageProvider2, imageProvider3, rl6Var);
                                bubbleComponentFactory$createBubbles$$inlined$map$1$2$1.L$0 = null;
                                bubbleComponentFactory$createBubbles$$inlined$map$1$2$1.L$1 = null;
                                bubbleComponentFactory$createBubbles$$inlined$map$1$2$1.L$2 = null;
                                bubbleComponentFactory$createBubbles$$inlined$map$1$2$1.L$3 = null;
                                bubbleComponentFactory$createBubbles$$inlined$map$1$2$1.label = 1;
                                if (vprVar.emit(triple, bubbleComponentFactory$createBubbles$$inlined$map$1$2$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            if (obj2 == null) {
                            }
                            dxu0Var2 = rl6Var.l;
                            if (dxu0Var2 != null) {
                            }
                            imageProvider2 = imageProvider;
                            imageProvider3 = null;
                            triple = new Triple(imageProvider2, imageProvider3, rl6Var);
                            bubbleComponentFactory$createBubbles$$inlined$map$1$2$1.L$0 = null;
                            bubbleComponentFactory$createBubbles$$inlined$map$1$2$1.L$1 = null;
                            bubbleComponentFactory$createBubbles$$inlined$map$1$2$1.L$2 = null;
                            bubbleComponentFactory$createBubbles$$inlined$map$1$2$1.L$3 = null;
                            bubbleComponentFactory$createBubbles$$inlined$map$1$2$1.label = 1;
                            if (vprVar.emit(triple, bubbleComponentFactory$createBubbles$$inlined$map$1$2$1) == coroutineSingletons) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                        hexString = Integer.toHexString(-1);
                        String str42 = hexString;
                        if (qn6Var3 == null) {
                        }
                        String str52 = ru.yandex.taxi.layers.source.factory.a.b(rl6Var.a) + str42 + z + wireName;
                        BubbleType e2 = mbb1.e(rl6Var);
                        obj2 = rVar.k.get(str52);
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        bubbleComponentFactory$createBubbles$$inlined$map$1$2$1 = new BubbleComponentFactory$createBubbles$$inlined$map$1$2$1(this, continuation);
        Object obj32 = bubbleComponentFactory$createBubbles$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bubbleComponentFactory$createBubbles$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
