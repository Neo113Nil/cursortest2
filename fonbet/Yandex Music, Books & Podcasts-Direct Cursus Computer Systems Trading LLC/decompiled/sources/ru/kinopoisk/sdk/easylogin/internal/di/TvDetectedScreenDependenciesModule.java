package ru.kinopoisk.sdk.easylogin.internal.di;

import android.content.SharedPreferences;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.squareup.anvil.annotations.ContributesTo;
import defpackage.b6e;
import defpackage.c5b;
import defpackage.ern;
import defpackage.f9f;
import defpackage.nm6;
import defpackage.qy0;
import defpackage.s9;
import defpackage.szm;
import defpackage.wbt;
import defpackage.x3f;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.api.UserCodeVerifier;
import ru.kinopoisk.sdk.easylogin.internal.A;
import ru.kinopoisk.sdk.easylogin.internal.A6;
import ru.kinopoisk.sdk.easylogin.internal.B;
import ru.kinopoisk.sdk.easylogin.internal.B2;
import ru.kinopoisk.sdk.easylogin.internal.B6;
import ru.kinopoisk.sdk.easylogin.internal.C0967a6;
import ru.kinopoisk.sdk.easylogin.internal.C0981b6;
import ru.kinopoisk.sdk.easylogin.internal.C1055ga;
import ru.kinopoisk.sdk.easylogin.internal.C1109k8;
import ru.kinopoisk.sdk.easylogin.internal.C1152n9;
import ru.kinopoisk.sdk.easylogin.internal.C1234t8;
import ru.kinopoisk.sdk.easylogin.internal.C1248u8;
import ru.kinopoisk.sdk.easylogin.internal.C1261v8;
import ru.kinopoisk.sdk.easylogin.internal.C1272w6;
import ru.kinopoisk.sdk.easylogin.internal.C1276wa;
import ru.kinopoisk.sdk.easylogin.internal.C1288x9;
import ru.kinopoisk.sdk.easylogin.internal.F1;
import ru.kinopoisk.sdk.easylogin.internal.H3;
import ru.kinopoisk.sdk.easylogin.internal.I9;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1138m9;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1228t2;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1236ta;
import ru.kinopoisk.sdk.easylogin.internal.J9;
import ru.kinopoisk.sdk.easylogin.internal.O5;
import ru.kinopoisk.sdk.easylogin.internal.Oc;
import ru.kinopoisk.sdk.easylogin.internal.Pc;
import ru.kinopoisk.sdk.easylogin.internal.Q2;
import ru.kinopoisk.sdk.easylogin.internal.R3;
import ru.kinopoisk.sdk.easylogin.internal.Z5;
import ru.kinopoisk.sdk.easylogin.internal.r;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJµ\u0001\u0010#\u001a\u00020\"2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u000eH\u0007¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/di/TvDetectedScreenDependenciesModule;", "", "<init>", "()V", "Lru/kinopoisk/sdk/easylogin/internal/x9;", DeviceService.KEY_CONFIG, "Lru/kinopoisk/sdk/easylogin/internal/m9;", "provideTvAppInstallResolver", "(Lru/kinopoisk/sdk/easylogin/internal/x9;)Lru/kinopoisk/sdk/easylogin/internal/m9;", "Lf9f;", "Landroidx/fragment/app/o;", "fragmentClass", "Lru/kinopoisk/sdk/easylogin/internal/R3;", "parentFragmentViewModelComponent", "Lszm;", "Lru/kinopoisk/sdk/easylogin/internal/B2;", "argsProvider", "Lru/kinopoisk/sdk/easylogin/api/UserCodeVerifier;", "userCodeVerifierProvider", "tvAuthConfigProvider", "Lru/kinopoisk/sdk/easylogin/internal/b6;", "lgTvInteractorFactoryProvider", "Lru/kinopoisk/sdk/easylogin/internal/v8;", "samsungTvInteractorFactoryProvider", "Lru/kinopoisk/sdk/easylogin/internal/A;", "androidTvInteractorFactoryProvider", "Lru/kinopoisk/sdk/easylogin/internal/F1;", "configProviderProvider", "Lru/kinopoisk/sdk/easylogin/internal/t2;", "puidProvider", "Landroid/content/SharedPreferences;", "preferencesProvider", "Lru/kinopoisk/sdk/easylogin/internal/Q2;", "dispatchersProvider", "Lru/kinopoisk/sdk/easylogin/internal/I9;", "provideTvAuthScenarioManager", "(Lf9f;Lru/kinopoisk/sdk/easylogin/internal/R3;Lszm;Lszm;Lszm;Lszm;Lszm;Lszm;Lszm;Lszm;Lszm;Lszm;)Lru/kinopoisk/sdk/easylogin/internal/I9;", "products_android_sdk_easyloginmobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@ContributesTo(scope = R3.class)
/* loaded from: classes5.dex */
public final class TvDetectedScreenDependenciesModule {

    @NotNull
    public static final TvDetectedScreenDependenciesModule INSTANCE = new TvDetectedScreenDependenciesModule();

    private TvDetectedScreenDependenciesModule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideTvAppInstallResolver$lambda$0(C1288x9 c1288x9, H3 h3) {
        h3.getClass();
        if (h3 instanceof H3.a) {
            return true;
        }
        if (h3 instanceof H3.c) {
            return c1288x9.a().l;
        }
        if (h3 instanceof H3.b) {
            return c1288x9.a().m;
        }
        b6e.s();
        return false;
    }

    @NotNull
    public final InterfaceC1138m9 provideTvAppInstallResolver(@NotNull C1288x9 config) {
        config.getClass();
        return new wbt(config, 0);
    }

    @NotNull
    public final I9 provideTvAuthScenarioManager(@NotNull f9f fragmentClass, R3 parentFragmentViewModelComponent, @NotNull szm argsProvider, @NotNull final szm userCodeVerifierProvider, @NotNull szm tvAuthConfigProvider, @NotNull szm lgTvInteractorFactoryProvider, @NotNull szm samsungTvInteractorFactoryProvider, @NotNull szm androidTvInteractorFactoryProvider, @NotNull final szm configProviderProvider, @NotNull szm puidProvider, @NotNull szm preferencesProvider, @NotNull szm dispatchersProvider) {
        String str;
        s9 rVar;
        List list;
        Object obj;
        fragmentClass.getClass();
        argsProvider.getClass();
        userCodeVerifierProvider.getClass();
        tvAuthConfigProvider.getClass();
        lgTvInteractorFactoryProvider.getClass();
        samsungTvInteractorFactoryProvider.getClass();
        androidTvInteractorFactoryProvider.getClass();
        configProviderProvider.getClass();
        puidProvider.getClass();
        preferencesProvider.getClass();
        dispatchersProvider.getClass();
        if (!(fragmentClass.equals(ern.a(C1055ga.class)) ? true : fragmentClass.equals(ern.a(C1276wa.class)))) {
            parentFragmentViewModelComponent.getClass();
            return ((InterfaceC1236ta) parentFragmentViewModelComponent).tvAuthScenarioManager();
        }
        B b = new B() { // from class: ru.kinopoisk.sdk.easylogin.internal.di.TvDetectedScreenDependenciesModule$provideTvAuthScenarioManager$appIdProvider$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // ru.kinopoisk.sdk.easylogin.internal.B
            public String getLgAppId() {
                return ((Z5) ((F1) szm.this.get()).getValue(C0967a6.a).a).a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ru.kinopoisk.sdk.easylogin.internal.B
            public String getSamsungAppId() {
                return ((C1234t8) ((F1) szm.this.get()).getValue(C1248u8.a).a).a;
            }
        };
        Object obj2 = lgTvInteractorFactoryProvider.get();
        obj2.getClass();
        C0981b6 c0981b6 = (C0981b6) obj2;
        Object obj3 = samsungTvInteractorFactoryProvider.get();
        obj3.getClass();
        C1261v8 c1261v8 = (C1261v8) obj3;
        Object obj4 = androidTvInteractorFactoryProvider.get();
        obj4.getClass();
        A a = (A) obj4;
        Object obj5 = preferencesProvider.get();
        obj5.getClass();
        SharedPreferences sharedPreferences = (SharedPreferences) obj5;
        Object obj6 = dispatchersProvider.get();
        obj6.getClass();
        Q2 q2 = (Q2) obj6;
        B6 b6 = new B6(sharedPreferences);
        H3 h3 = ((B2) argsProvider.get()).a;
        h3.getClass();
        boolean z = h3 instanceof H3.a;
        if (z) {
            str = ((H3.a) h3).a;
        } else if (h3 instanceof H3.b) {
            str = ((H3.b) h3).a;
        } else {
            if (!(h3 instanceof H3.c)) {
                b6e.s();
                return null;
            }
            str = ((H3.c) h3).a;
        }
        s9 s9Var = null;
        if (str != null) {
            String string = sharedPreferences.getString("MockTvRulesStorage", null);
            if (string != null) {
                x3f x3fVar = b6.a;
                x3fVar.getClass();
                list = (List) x3fVar.b(new qy0(A6.INSTANCE.serializer(), 0), string);
            } else {
                list = null;
            }
            if (list == null) {
                list = c5b.a;
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.d(((A6) obj).a, str)) {
                    break;
                }
            }
            A6 a6 = (A6) obj;
            if (a6 != null) {
                s9Var = new C1272w6(a6, q2);
            }
        }
        if (s9Var == null) {
            if (h3 instanceof H3.b) {
                String str2 = ((H3.b) h3).a;
                String lgAppId = b.getLgAppId();
                str2.getClass();
                lgAppId.getClass();
                rVar = new O5(str2, lgAppId, c0981b6.a, c0981b6.c, c0981b6.b);
            } else if (h3 instanceof H3.c) {
                String str3 = ((H3.c) h3).a;
                String samsungAppId = b.getSamsungAppId();
                str3.getClass();
                samsungAppId.getClass();
                s9Var = new C1109k8(str3, samsungAppId, c1261v8.a, c1261v8.b);
            } else {
                if (!z) {
                    b6e.s();
                    return null;
                }
                H3.a aVar = (H3.a) h3;
                rVar = new r(aVar.a, aVar.b, a.a, a.b, a.c);
            }
            s9Var = rVar;
        }
        C1152n9 c1152n9 = new C1152n9(s9Var);
        Oc oc = new Oc() { // from class: ru.kinopoisk.sdk.easylogin.internal.di.TvDetectedScreenDependenciesModule$provideTvAuthScenarioManager$1
            @Override // ru.kinopoisk.sdk.easylogin.internal.Oc
            public final Object verify(Pc pc, String str4, String str5, Continuation<? super Unit> continuation) {
                Object verify = ((UserCodeVerifier) szm.this.get()).verify(pc.a, str4, str5, continuation);
                return verify == nm6.a ? verify : Unit.a;
            }
        };
        Object obj7 = tvAuthConfigProvider.get();
        obj7.getClass();
        Object obj8 = puidProvider.get();
        obj8.getClass();
        return new J9(c1152n9, oc, (C1288x9) obj7, (InterfaceC1228t2) obj8);
    }
}
