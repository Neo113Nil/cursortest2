package ru.kinopoisk.sdk.easylogin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.a4g;
import defpackage.arf;
import defpackage.btf;
import defpackage.dzf;
import defpackage.fb6;
import defpackage.gld;
import defpackage.mm6;
import defpackage.x97;
import defpackage.xq0;
import defpackage.yn7;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.api.EasyLoginMode;
import ru.kinopoisk.sdk.easylogin.api.EasyLoginThemeProvider;
import ru.kinopoisk.sdk.easylogin.internal.di.Injector;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 +2\u00020\u0001:\u0002+,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020%8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/EasyLoginActivity;", "Lru/kinopoisk/sdk/easylogin/internal/c;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Lru/kinopoisk/sdk/easylogin/internal/Q2;", "dispatchersProvider", "Lru/kinopoisk/sdk/easylogin/internal/Q2;", "getDispatchersProvider", "()Lru/kinopoisk/sdk/easylogin/internal/Q2;", "setDispatchersProvider", "(Lru/kinopoisk/sdk/easylogin/internal/Q2;)V", "Lru/kinopoisk/sdk/easylogin/internal/EasyLoginSdkDirections;", "directions", "Lru/kinopoisk/sdk/easylogin/internal/EasyLoginSdkDirections;", "getDirections", "()Lru/kinopoisk/sdk/easylogin/internal/EasyLoginSdkDirections;", "setDirections", "(Lru/kinopoisk/sdk/easylogin/internal/EasyLoginSdkDirections;)V", "Lru/kinopoisk/sdk/easylogin/api/EasyLoginThemeProvider;", "themeProvider", "Lru/kinopoisk/sdk/easylogin/api/EasyLoginThemeProvider;", "getThemeProvider", "()Lru/kinopoisk/sdk/easylogin/api/EasyLoginThemeProvider;", "setThemeProvider", "(Lru/kinopoisk/sdk/easylogin/api/EasyLoginThemeProvider;)V", "Lru/kinopoisk/sdk/easylogin/internal/y8;", "screenResultDispatcher", "Lru/kinopoisk/sdk/easylogin/internal/y8;", "getScreenResultDispatcher", "()Lru/kinopoisk/sdk/easylogin/internal/y8;", "setScreenResultDispatcher", "(Lru/kinopoisk/sdk/easylogin/internal/y8;)V", "Lru/kinopoisk/sdk/easylogin/internal/K6;", "navigator$delegate", "Larf;", "getNavigator", "()Lru/kinopoisk/sdk/easylogin/internal/K6;", "navigator", "Companion", "EasyLoginActivityNavigator", "products_android_sdk_easyloginmobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class EasyLoginActivity extends AbstractActivityC0988c {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String EXTRA_MODE = "extra_mode";
    public EasyLoginSdkDirections directions;
    public Q2 dispatchersProvider;

    /* renamed from: navigator$delegate, reason: from kotlin metadata */
    @NotNull
    private final arf navigator = btf.b(new EasyLoginActivity$navigator$2(this));
    public C1300y8 screenResultDispatcher;
    public EasyLoginThemeProvider themeProvider;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/EasyLoginActivity$EasyLoginActivityNavigator;", "Lfb6;", "Landroidx/fragment/app/t;", "activity", "Landroidx/fragment/app/y;", "fragmentManager", "", "containerId", "Lru/kinopoisk/sdk/easylogin/internal/Q2;", "dispatchersProvider", "<init>", "(Landroidx/fragment/app/t;Landroidx/fragment/app/y;ILru/kinopoisk/sdk/easylogin/internal/Q2;)V", "", "finishWhenNoFragmentsLeft", "(Landroidx/fragment/app/y;Landroidx/fragment/app/t;)V", "Lmm6;", "scope", "Lmm6;", "products_android_sdk_easyloginmobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class EasyLoginActivityNavigator extends fb6 {

        @NotNull
        private final mm6 scope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EasyLoginActivityNavigator(@NotNull final androidx.fragment.app.t tVar, @NotNull final androidx.fragment.app.y yVar, int i, @NotNull Q2 q2) {
            super(tVar, yVar, i);
            tVar.getClass();
            yVar.getClass();
            q2.getClass();
            this.scope = gld.e(kotlin.coroutines.e.c(a4g.n(), q2.b().plus(new C1187q2("EasyLoginActivityNavigator"))));
            tVar.getLifecycle().a(new yn7() { // from class: ru.kinopoisk.sdk.easylogin.internal.EasyLoginActivity.EasyLoginActivityNavigator.1
                @Override // defpackage.yn7
                public void onCreate(@NotNull dzf dzfVar) {
                    dzfVar.getClass();
                }

                @Override // defpackage.yn7
                public void onDestroy(@NotNull dzf dzfVar) {
                    dzfVar.getClass();
                }

                @Override // defpackage.yn7
                public void onPause(@NotNull dzf dzfVar) {
                    dzfVar.getClass();
                }

                @Override // defpackage.yn7
                public void onResume(@NotNull dzf dzfVar) {
                    dzfVar.getClass();
                }

                @Override // defpackage.yn7
                public void onStart(dzf owner) {
                    owner.getClass();
                    C1173p2.a(EasyLoginActivityNavigator.this.scope);
                    EasyLoginActivityNavigator.this.finishWhenNoFragmentsLeft(yVar, tVar);
                }

                @Override // defpackage.yn7
                public void onStop(dzf owner) {
                    owner.getClass();
                    C1173p2.a(EasyLoginActivityNavigator.this.scope);
                }
            });
            finishWhenNoFragmentsLeft(yVar, tVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void finishWhenNoFragmentsLeft(androidx.fragment.app.y fragmentManager, androidx.fragment.app.t activity) {
            x97.y(this.scope, null, null, new EasyLoginActivity$EasyLoginActivityNavigator$finishWhenNoFragmentsLeft$1(fragmentManager, activity, null), 3);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EasyLoginMode.values().length];
            try {
                iArr[EasyLoginMode.StartWithConfirmation.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EasyLoginMode.ContinueWithConfirmation.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EasyLoginMode.FastConnection.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public final EasyLoginSdkDirections getDirections() {
        EasyLoginSdkDirections easyLoginSdkDirections = this.directions;
        if (easyLoginSdkDirections != null) {
            return easyLoginSdkDirections;
        }
        Intrinsics.j("directions");
        throw null;
    }

    @NotNull
    public final Q2 getDispatchersProvider() {
        Q2 q2 = this.dispatchersProvider;
        if (q2 != null) {
            return q2;
        }
        Intrinsics.j("dispatchersProvider");
        throw null;
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.AbstractActivityC0988c, ru.kinopoisk.sdk.easylogin.internal.L6
    @NotNull
    public K6 getNavigator() {
        return (K6) this.navigator.getValue();
    }

    @NotNull
    public final C1300y8 getScreenResultDispatcher() {
        C1300y8 c1300y8 = this.screenResultDispatcher;
        if (c1300y8 != null) {
            return c1300y8;
        }
        Intrinsics.j("screenResultDispatcher");
        throw null;
    }

    @NotNull
    public final EasyLoginThemeProvider getThemeProvider() {
        EasyLoginThemeProvider easyLoginThemeProvider = this.themeProvider;
        if (easyLoginThemeProvider != null) {
            return easyLoginThemeProvider;
        }
        Intrinsics.j("themeProvider");
        throw null;
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.AbstractActivityC0988c, ru.kinopoisk.sdk.easylogin.internal.T, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        EasyLoginMode easyLoginMode;
        EasyLoginActivityComponentKt.inject(Injector.a, this);
        Integer theme = getThemeProvider().getTheme();
        if (theme != null) {
            setTheme(theme.intValue());
        }
        super.onCreate(savedInstanceState);
        Log.d("onEasyLoginSDK", "on EasyLoginActivity onCreate");
        getLayoutInflater().getContext();
        getScreenResultDispatcher().a(this, new EasyLoginActivity$onCreate$1(this));
        if (savedInstanceState == null) {
            if (Build.VERSION.SDK_INT >= 33) {
                easyLoginMode = (EasyLoginMode) getIntent().getSerializableExtra(EXTRA_MODE, EasyLoginMode.class);
            } else {
                Serializable serializableExtra = getIntent().getSerializableExtra(EXTRA_MODE);
                serializableExtra.getClass();
                easyLoginMode = (EasyLoginMode) serializableExtra;
            }
            if (easyLoginMode == null) {
                xq0.q("Required value was null.");
                return;
            }
            Log.d("onEasyLoginSDK", "on EasyLoginActivity onCreate " + easyLoginMode);
            int i = WhenMappings.$EnumSwitchMapping$0[easyLoginMode.ordinal()];
            if (i == 1) {
                getDirections().toTvAuth(false);
            } else if (i == 2) {
                getDirections().toTvAuth(true);
            } else {
                if (i != 3) {
                    return;
                }
                getDirections().toTvDiscovery(true);
            }
        }
    }

    public final void setDirections(@NotNull EasyLoginSdkDirections easyLoginSdkDirections) {
        easyLoginSdkDirections.getClass();
        this.directions = easyLoginSdkDirections;
    }

    public final void setDispatchersProvider(@NotNull Q2 q2) {
        q2.getClass();
        this.dispatchersProvider = q2;
    }

    public final void setScreenResultDispatcher(@NotNull C1300y8 c1300y8) {
        c1300y8.getClass();
        this.screenResultDispatcher = c1300y8;
    }

    public final void setThemeProvider(@NotNull EasyLoginThemeProvider easyLoginThemeProvider) {
        easyLoginThemeProvider.getClass();
        this.themeProvider = easyLoginThemeProvider;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/EasyLoginActivity$Companion;", "", "()V", "EXTRA_MODE", "", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "mode", "Lru/kinopoisk/sdk/easylogin/api/EasyLoginMode;", "products_android_sdk_easyloginmobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Intent newIntent(@NotNull Context context, @NotNull EasyLoginMode mode) {
            context.getClass();
            mode.getClass();
            Intent intent = new Intent(context, (Class<?>) EasyLoginActivity.class);
            intent.putExtra(EasyLoginActivity.EXTRA_MODE, mode);
            Log.d("onEasyLoginSDK", "on EasyLoginActivity newIntent " + mode);
            return intent;
        }

        private Companion() {
        }
    }
}
