package ru.yandex.taxi.superapp.chat.view;

import android.net.Uri;
import defpackage.cvu0;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.h1p;
import defpackage.j5z;
import defpackage.ny61;
import defpackage.szv0;
import defpackage.uwq0;
import defpackage.xfo;
import defpackage.yu41;
import java.util.HashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.experiments.superapp.j;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes6.dex */
public final class e {
    public final yu41 a;
    public final ru.yandex.taxi.am.token.a b;
    public final j c;
    public final j5z d;

    public e(yu41 yu41Var, ru.yandex.taxi.am.token.a aVar, j jVar, j5z j5zVar) {
        this.a = yu41Var;
        this.b = aVar;
        this.c = jVar;
        this.d = j5zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, h1p h1pVar, String str, szv0 szv0Var, ContinuationImpl continuationImpl) {
        ChatWebConfigFactory$createConfig$1 chatWebConfigFactory$createConfig$1;
        int i;
        Object d;
        Object obj;
        String str2;
        eVar.getClass();
        if (continuationImpl instanceof ChatWebConfigFactory$createConfig$1) {
            chatWebConfigFactory$createConfig$1 = (ChatWebConfigFactory$createConfig$1) continuationImpl;
            int i2 = chatWebConfigFactory$createConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chatWebConfigFactory$createConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = chatWebConfigFactory$createConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chatWebConfigFactory$createConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    szv0Var.getClass();
                    uwq0 a = szv0Var.a(h1pVar.getValue());
                    if (a == null) {
                        xfo.g(g8e.o("service not found is experiment. service: ", h1pVar.getValue()));
                        return null;
                    }
                    String str3 = a.g;
                    if (str3 == null || str3.length() == 0) {
                        xfo.g(g8e.o("support url is null. service: ", h1pVar.getValue()));
                        return null;
                    }
                    String v = cvu0.v(str3, "{lang}", eVar.d.b(), false);
                    yu41 yu41Var = eVar.a;
                    yu41Var.getClass();
                    HashMap hashMap = new HashMap();
                    if (str != null && !evu0.J(str)) {
                        hashMap.put("order_id", str);
                    }
                    String Hg = ((h) yu41Var.a).Hg();
                    if (Hg != null && Hg.length() != 0) {
                        hashMap.put("id", Hg);
                    }
                    Uri.Builder buildUpon = Uri.parse(v).buildUpon();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                    }
                    String uri = buildUpon.build().toString();
                    ru.yandex.taxi.am.token.a aVar = eVar.b;
                    chatWebConfigFactory$createConfig$1.L$0 = null;
                    chatWebConfigFactory$createConfig$1.L$1 = null;
                    chatWebConfigFactory$createConfig$1.L$2 = null;
                    chatWebConfigFactory$createConfig$1.L$3 = null;
                    chatWebConfigFactory$createConfig$1.L$4 = null;
                    chatWebConfigFactory$createConfig$1.L$5 = null;
                    chatWebConfigFactory$createConfig$1.L$6 = uri;
                    chatWebConfigFactory$createConfig$1.label = 1;
                    d = aVar.d(false, chatWebConfigFactory$createConfig$1);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = d;
                    str2 = uri;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) chatWebConfigFactory$createConfig$1.L$6;
                    kotlin.b.b(obj2);
                    obj = ((Result) obj2).getValue();
                }
                Object obj3 = obj instanceof Result.Failure ? null : obj;
                CoreWebViewConfig.a aVar2 = new CoreWebViewConfig.a();
                aVar2.b = str2;
                aVar2.e = false;
                aVar2.c = (String) obj3;
                aVar2.g = true;
                UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar2.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
                uiWebViewConfig.setHasTitleFromWeb(true);
                uiWebViewConfig.setShouldShowCloseButton(true);
                uiWebViewConfig.setCloseButtonPosition(1);
                uiWebViewConfig.setTitleHorizontalAlignment(1);
                uiWebViewConfig.setShouldUseCached(false);
                return uiWebViewConfig;
            }
        }
        chatWebConfigFactory$createConfig$1 = new ChatWebConfigFactory$createConfig$1(eVar, continuationImpl);
        Object obj22 = chatWebConfigFactory$createConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chatWebConfigFactory$createConfig$1.label;
        if (i != 0) {
        }
        if (obj instanceof Result.Failure) {
        }
        CoreWebViewConfig.a aVar22 = new CoreWebViewConfig.a();
        aVar22.b = str2;
        aVar22.e = false;
        aVar22.c = (String) obj3;
        aVar22.g = true;
        UiWebViewConfig uiWebViewConfig2 = new UiWebViewConfig(aVar22.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
        uiWebViewConfig2.setHasTitleFromWeb(true);
        uiWebViewConfig2.setShouldShowCloseButton(true);
        uiWebViewConfig2.setCloseButtonPosition(1);
        uiWebViewConfig2.setTitleHorizontalAlignment(1);
        uiWebViewConfig2.setShouldUseCached(false);
        return uiWebViewConfig2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(h1p h1pVar, String str, ContinuationImpl continuationImpl) {
        ChatWebConfigFactory$create$1 chatWebConfigFactory$create$1;
        int i;
        if (continuationImpl instanceof ChatWebConfigFactory$create$1) {
            chatWebConfigFactory$create$1 = (ChatWebConfigFactory$create$1) continuationImpl;
            int i2 = chatWebConfigFactory$create$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chatWebConfigFactory$create$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chatWebConfigFactory$create$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chatWebConfigFactory$create$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(new b(this.c.b()), this, h1pVar, str);
                    chatWebConfigFactory$create$1.L$0 = null;
                    chatWebConfigFactory$create$1.L$1 = null;
                    chatWebConfigFactory$create$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(dVar, chatWebConfigFactory$create$1);
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
        chatWebConfigFactory$create$1 = new ChatWebConfigFactory$create$1(this, continuationImpl);
        Object obj2 = chatWebConfigFactory$create$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chatWebConfigFactory$create$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }
}
