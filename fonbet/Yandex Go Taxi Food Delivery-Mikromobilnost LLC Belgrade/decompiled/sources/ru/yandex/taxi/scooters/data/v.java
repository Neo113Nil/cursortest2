package ru.yandex.taxi.scooters.data;

import android.content.Context;
import defpackage.cmt;
import defpackage.kpm0;
import defpackage.l60;
import defpackage.m5j0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.data.model.PhotoType;

/* loaded from: classes6.dex */
public final class v {
    public final Context a;
    public final tt2 b;
    public final ScootersPhotoApi c;
    public final ru.yandex.taxi.scooters.data.mapper.b d;
    public final a e;

    public v(Context context, tt2 tt2Var, ScootersPhotoApi scootersPhotoApi, ru.yandex.taxi.scooters.data.mapper.b bVar, a aVar) {
        this.a = context;
        this.b = tt2Var;
        this.c = scootersPhotoApi;
        this.d = bVar;
        this.e = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d6, code lost:
    
        if (ru.yandex.taxi.network.api.a.a(r0, null, r6) != r7) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, List list, PhotoType photoType, ContinuationImpl continuationImpl) {
        ScootersPhotoSenderRepository$actualize$1 scootersPhotoSenderRepository$actualize$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        PhotoType photoType2;
        ScootersPhotoApi scootersPhotoApi;
        List list2;
        String str2;
        ScootersPhotoApi scootersPhotoApi2;
        Map<String, String> map;
        if (continuationImpl instanceof ScootersPhotoSenderRepository$actualize$1) {
            scootersPhotoSenderRepository$actualize$1 = (ScootersPhotoSenderRepository$actualize$1) continuationImpl;
            int i2 = scootersPhotoSenderRepository$actualize$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPhotoSenderRepository$actualize$1.label = i2 - Integer.MIN_VALUE;
                ScootersPhotoSenderRepository$actualize$1 scootersPhotoSenderRepository$actualize$12 = scootersPhotoSenderRepository$actualize$1;
                obj = scootersPhotoSenderRepository$actualize$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPhotoSenderRepository$actualize$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersPhotoSenderRepository$actualize$12.L$0 = str;
                    scootersPhotoSenderRepository$actualize$12.L$1 = list;
                    photoType2 = photoType;
                    scootersPhotoSenderRepository$actualize$12.L$2 = photoType2;
                    ScootersPhotoApi scootersPhotoApi3 = this.c;
                    scootersPhotoSenderRepository$actualize$12.L$3 = scootersPhotoApi3;
                    scootersPhotoSenderRepository$actualize$12.label = 1;
                    Object a = this.e.a(false, scootersPhotoSenderRepository$actualize$12);
                    if (a != coroutineSingletons) {
                        obj = a;
                        scootersPhotoApi = scootersPhotoApi3;
                        list2 = list;
                        str2 = str;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    ScootersPhotoApi scootersPhotoApi4 = (ScootersPhotoApi) scootersPhotoSenderRepository$actualize$12.L$3;
                    PhotoType photoType3 = (PhotoType) scootersPhotoSenderRepository$actualize$12.L$2;
                    List list3 = (List) scootersPhotoSenderRepository$actualize$12.L$1;
                    String str3 = (String) scootersPhotoSenderRepository$actualize$12.L$0;
                    kotlin.b.b(obj);
                    photoType2 = photoType3;
                    list2 = list3;
                    scootersPhotoApi = scootersPhotoApi4;
                    str2 = str3;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    map = (Map) scootersPhotoSenderRepository$actualize$12.L$4;
                    scootersPhotoApi2 = (ScootersPhotoApi) scootersPhotoSenderRepository$actualize$12.L$3;
                    kotlin.b.b(obj);
                    cmt<zy11> b = scootersPhotoApi2.b(map, (l60) obj);
                    scootersPhotoSenderRepository$actualize$12.L$0 = null;
                    scootersPhotoSenderRepository$actualize$12.L$1 = null;
                    scootersPhotoSenderRepository$actualize$12.L$2 = null;
                    scootersPhotoSenderRepository$actualize$12.L$3 = null;
                    scootersPhotoSenderRepository$actualize$12.L$4 = null;
                    scootersPhotoSenderRepository$actualize$12.label = 3;
                }
                Map<String, String> map2 = (Map) obj;
                this.b.getClass();
                sjh sjhVar = uyj.a;
                mdh mdhVar = mdh.b;
                ScootersPhotoSenderRepository$actualize$2 scootersPhotoSenderRepository$actualize$2 = new ScootersPhotoSenderRepository$actualize$2(this, str2, list2, photoType2, null);
                scootersPhotoSenderRepository$actualize$12.L$0 = null;
                scootersPhotoSenderRepository$actualize$12.L$1 = null;
                scootersPhotoSenderRepository$actualize$12.L$2 = null;
                scootersPhotoSenderRepository$actualize$12.L$3 = scootersPhotoApi;
                scootersPhotoSenderRepository$actualize$12.L$4 = map2;
                scootersPhotoSenderRepository$actualize$12.label = 2;
                obj = tje.k0(mdhVar, scootersPhotoSenderRepository$actualize$2, scootersPhotoSenderRepository$actualize$12);
                if (obj != coroutineSingletons) {
                    scootersPhotoApi2 = scootersPhotoApi;
                    map = map2;
                    cmt<zy11> b2 = scootersPhotoApi2.b(map, (l60) obj);
                    scootersPhotoSenderRepository$actualize$12.L$0 = null;
                    scootersPhotoSenderRepository$actualize$12.L$1 = null;
                    scootersPhotoSenderRepository$actualize$12.L$2 = null;
                    scootersPhotoSenderRepository$actualize$12.L$3 = null;
                    scootersPhotoSenderRepository$actualize$12.L$4 = null;
                    scootersPhotoSenderRepository$actualize$12.label = 3;
                }
                return coroutineSingletons;
            }
        }
        scootersPhotoSenderRepository$actualize$1 = new ScootersPhotoSenderRepository$actualize$1(this, continuationImpl);
        ScootersPhotoSenderRepository$actualize$1 scootersPhotoSenderRepository$actualize$122 = scootersPhotoSenderRepository$actualize$1;
        obj = scootersPhotoSenderRepository$actualize$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPhotoSenderRepository$actualize$122.label;
        if (i != 0) {
        }
        Map<String, String> map22 = (Map) obj;
        this.b.getClass();
        sjh sjhVar2 = uyj.a;
        mdh mdhVar2 = mdh.b;
        ScootersPhotoSenderRepository$actualize$2 scootersPhotoSenderRepository$actualize$22 = new ScootersPhotoSenderRepository$actualize$2(this, str2, list2, photoType2, null);
        scootersPhotoSenderRepository$actualize$122.L$0 = null;
        scootersPhotoSenderRepository$actualize$122.L$1 = null;
        scootersPhotoSenderRepository$actualize$122.L$2 = null;
        scootersPhotoSenderRepository$actualize$122.L$3 = scootersPhotoApi;
        scootersPhotoSenderRepository$actualize$122.L$4 = map22;
        scootersPhotoSenderRepository$actualize$122.label = 2;
        obj = tje.k0(mdhVar2, scootersPhotoSenderRepository$actualize$22, scootersPhotoSenderRepository$actualize$122);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ef, code lost:
    
        if (ru.yandex.taxi.network.api.a.a(r0, null, r2) != r3) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, kpm0 kpm0Var, PhotoType photoType, ContinuationImpl continuationImpl) {
        ScootersPhotoSenderRepository$uploadPhoto$1 scootersPhotoSenderRepository$uploadPhoto$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str2;
        kpm0 kpm0Var2;
        ScootersPhotoApi scootersPhotoApi;
        Object obj;
        PhotoType photoType2;
        Object k0;
        String str3;
        Map<String, String> map;
        ScootersPhotoApi scootersPhotoApi2;
        String str4;
        if (continuationImpl instanceof ScootersPhotoSenderRepository$uploadPhoto$1) {
            scootersPhotoSenderRepository$uploadPhoto$1 = (ScootersPhotoSenderRepository$uploadPhoto$1) continuationImpl;
            int i2 = scootersPhotoSenderRepository$uploadPhoto$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPhotoSenderRepository$uploadPhoto$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersPhotoSenderRepository$uploadPhoto$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPhotoSenderRepository$uploadPhoto$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    str2 = str;
                    scootersPhotoSenderRepository$uploadPhoto$1.L$0 = str2;
                    kpm0Var2 = kpm0Var;
                    scootersPhotoSenderRepository$uploadPhoto$1.L$1 = kpm0Var2;
                    scootersPhotoSenderRepository$uploadPhoto$1.L$2 = photoType;
                    scootersPhotoApi = this.c;
                    scootersPhotoSenderRepository$uploadPhoto$1.L$3 = scootersPhotoApi;
                    scootersPhotoSenderRepository$uploadPhoto$1.label = 1;
                    Object a = this.e.a(false, scootersPhotoSenderRepository$uploadPhoto$1);
                    if (a != coroutineSingletons) {
                        obj = a;
                        photoType2 = photoType;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    ScootersPhotoApi scootersPhotoApi3 = (ScootersPhotoApi) scootersPhotoSenderRepository$uploadPhoto$1.L$3;
                    photoType2 = (PhotoType) scootersPhotoSenderRepository$uploadPhoto$1.L$2;
                    kpm0 kpm0Var3 = (kpm0) scootersPhotoSenderRepository$uploadPhoto$1.L$1;
                    String str5 = (String) scootersPhotoSenderRepository$uploadPhoto$1.L$0;
                    kotlin.b.b(obj2);
                    obj = obj2;
                    str2 = str5;
                    scootersPhotoApi = scootersPhotoApi3;
                    kpm0Var2 = kpm0Var3;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    String str6 = (String) scootersPhotoSenderRepository$uploadPhoto$1.L$5;
                    Map<String, String> map2 = (Map) scootersPhotoSenderRepository$uploadPhoto$1.L$4;
                    ScootersPhotoApi scootersPhotoApi4 = (ScootersPhotoApi) scootersPhotoSenderRepository$uploadPhoto$1.L$3;
                    photoType2 = (PhotoType) scootersPhotoSenderRepository$uploadPhoto$1.L$2;
                    String str7 = (String) scootersPhotoSenderRepository$uploadPhoto$1.L$0;
                    kotlin.b.b(obj2);
                    str4 = str6;
                    map = map2;
                    scootersPhotoApi2 = scootersPhotoApi4;
                    str3 = str7;
                    cmt<zy11> a2 = scootersPhotoApi2.a(map, str3, str4, photoType2.getPhotoTypeString(), (m5j0) obj2);
                    scootersPhotoSenderRepository$uploadPhoto$1.L$0 = null;
                    scootersPhotoSenderRepository$uploadPhoto$1.L$1 = null;
                    scootersPhotoSenderRepository$uploadPhoto$1.L$2 = null;
                    scootersPhotoSenderRepository$uploadPhoto$1.L$3 = null;
                    scootersPhotoSenderRepository$uploadPhoto$1.L$4 = null;
                    scootersPhotoSenderRepository$uploadPhoto$1.L$5 = null;
                    scootersPhotoSenderRepository$uploadPhoto$1.label = 3;
                }
                Map<String, String> map3 = (Map) obj;
                String str8 = kpm0Var2.b;
                this.b.getClass();
                sjh sjhVar = uyj.a;
                mdh mdhVar = mdh.b;
                ScootersPhotoSenderRepository$uploadPhoto$2 scootersPhotoSenderRepository$uploadPhoto$2 = new ScootersPhotoSenderRepository$uploadPhoto$2(this, kpm0Var2, null);
                scootersPhotoSenderRepository$uploadPhoto$1.L$0 = str2;
                scootersPhotoSenderRepository$uploadPhoto$1.L$1 = null;
                scootersPhotoSenderRepository$uploadPhoto$1.L$2 = photoType2;
                scootersPhotoSenderRepository$uploadPhoto$1.L$3 = scootersPhotoApi;
                scootersPhotoSenderRepository$uploadPhoto$1.L$4 = map3;
                scootersPhotoSenderRepository$uploadPhoto$1.L$5 = str8;
                scootersPhotoSenderRepository$uploadPhoto$1.label = 2;
                k0 = tje.k0(mdhVar, scootersPhotoSenderRepository$uploadPhoto$2, scootersPhotoSenderRepository$uploadPhoto$1);
                if (k0 != coroutineSingletons) {
                    str3 = str2;
                    map = map3;
                    scootersPhotoApi2 = scootersPhotoApi;
                    str4 = str8;
                    obj2 = k0;
                    cmt<zy11> a22 = scootersPhotoApi2.a(map, str3, str4, photoType2.getPhotoTypeString(), (m5j0) obj2);
                    scootersPhotoSenderRepository$uploadPhoto$1.L$0 = null;
                    scootersPhotoSenderRepository$uploadPhoto$1.L$1 = null;
                    scootersPhotoSenderRepository$uploadPhoto$1.L$2 = null;
                    scootersPhotoSenderRepository$uploadPhoto$1.L$3 = null;
                    scootersPhotoSenderRepository$uploadPhoto$1.L$4 = null;
                    scootersPhotoSenderRepository$uploadPhoto$1.L$5 = null;
                    scootersPhotoSenderRepository$uploadPhoto$1.label = 3;
                }
                return coroutineSingletons;
            }
        }
        scootersPhotoSenderRepository$uploadPhoto$1 = new ScootersPhotoSenderRepository$uploadPhoto$1(this, continuationImpl);
        Object obj22 = scootersPhotoSenderRepository$uploadPhoto$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPhotoSenderRepository$uploadPhoto$1.label;
        if (i != 0) {
        }
        Map<String, String> map32 = (Map) obj;
        String str82 = kpm0Var2.b;
        this.b.getClass();
        sjh sjhVar2 = uyj.a;
        mdh mdhVar2 = mdh.b;
        ScootersPhotoSenderRepository$uploadPhoto$2 scootersPhotoSenderRepository$uploadPhoto$22 = new ScootersPhotoSenderRepository$uploadPhoto$2(this, kpm0Var2, null);
        scootersPhotoSenderRepository$uploadPhoto$1.L$0 = str2;
        scootersPhotoSenderRepository$uploadPhoto$1.L$1 = null;
        scootersPhotoSenderRepository$uploadPhoto$1.L$2 = photoType2;
        scootersPhotoSenderRepository$uploadPhoto$1.L$3 = scootersPhotoApi;
        scootersPhotoSenderRepository$uploadPhoto$1.L$4 = map32;
        scootersPhotoSenderRepository$uploadPhoto$1.L$5 = str82;
        scootersPhotoSenderRepository$uploadPhoto$1.label = 2;
        k0 = tje.k0(mdhVar2, scootersPhotoSenderRepository$uploadPhoto$22, scootersPhotoSenderRepository$uploadPhoto$1);
        if (k0 != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
