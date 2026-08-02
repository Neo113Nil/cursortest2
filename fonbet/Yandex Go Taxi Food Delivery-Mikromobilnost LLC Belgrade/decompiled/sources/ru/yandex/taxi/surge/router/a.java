package ru.yandex.taxi.surge.router;

import defpackage.fn21;
import defpackage.i130;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uhx;
import defpackage.uyj;
import defpackage.vf41;
import defpackage.w030;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes6.dex */
public final class a extends com.yandex.go.navigation.modals.coroutines.a {
    public final i130 F;
    public final vf41 G;
    public final ru.yandex.taxi.am.token.a H;
    public final tt2 I;
    public final fn21 J;
    public final boolean K;

    public a(i130 i130Var, vf41 vf41Var, ru.yandex.taxi.am.token.a aVar, tt2 tt2Var, fn21 fn21Var) {
        super(null);
        this.F = i130Var;
        this.G = vf41Var;
        this.H = aVar;
        this.I = tt2Var;
        this.J = fn21Var;
        this.K = true;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.F.a();
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return this.K;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.yandex.go.navigation.modals.coroutines.a
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(String str, Continuation continuation) {
        OpenSupportChatRouter$provideModalView$1 openSupportChatRouter$provideModalView$1;
        int i;
        String str2;
        String Hg;
        if (continuation instanceof OpenSupportChatRouter$provideModalView$1) {
            openSupportChatRouter$provideModalView$1 = (OpenSupportChatRouter$provideModalView$1) continuation;
            int i2 = openSupportChatRouter$provideModalView$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                openSupportChatRouter$provideModalView$1.label = i2 - Integer.MIN_VALUE;
                Object obj = openSupportChatRouter$provideModalView$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = openSupportChatRouter$provideModalView$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.I.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    OpenSupportChatRouter$provideModalView$oAuthToken$1 openSupportChatRouter$provideModalView$oAuthToken$1 = new OpenSupportChatRouter$provideModalView$oAuthToken$1(this, null);
                    openSupportChatRouter$provideModalView$1.L$0 = str;
                    openSupportChatRouter$provideModalView$1.label = 1;
                    obj = tje.k0(mdhVar, openSupportChatRouter$provideModalView$oAuthToken$1, openSupportChatRouter$provideModalView$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str2 = str;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) openSupportChatRouter$provideModalView$1.L$0;
                    kotlin.b.b(obj);
                }
                CoreWebViewConfig.Companion.getClass();
                CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
                aVar.b = str2;
                aVar.c = (String) obj;
                Hg = ((h) this.J).Hg();
                if (Hg == null) {
                    Hg = "";
                }
                aVar.b("X-YaTaxi-UserId", Hg);
                UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
                uiWebViewConfig.setHasTitleFromWeb(true);
                return vf41.a(this.G, uiWebViewConfig, new uhx(26, this), null, null, 252);
            }
        }
        openSupportChatRouter$provideModalView$1 = new OpenSupportChatRouter$provideModalView$1(this, (ContinuationImpl) continuation);
        Object obj2 = openSupportChatRouter$provideModalView$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = openSupportChatRouter$provideModalView$1.label;
        if (i != 0) {
        }
        CoreWebViewConfig.Companion.getClass();
        CoreWebViewConfig.a aVar2 = new CoreWebViewConfig.a();
        aVar2.b = str2;
        aVar2.c = (String) obj2;
        Hg = ((h) this.J).Hg();
        if (Hg == null) {
        }
        aVar2.b("X-YaTaxi-UserId", Hg);
        UiWebViewConfig uiWebViewConfig2 = new UiWebViewConfig(aVar2.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
        uiWebViewConfig2.setHasTitleFromWeb(true);
        return vf41.a(this.G, uiWebViewConfig2, new uhx(26, this), null, null, 252);
    }
}
