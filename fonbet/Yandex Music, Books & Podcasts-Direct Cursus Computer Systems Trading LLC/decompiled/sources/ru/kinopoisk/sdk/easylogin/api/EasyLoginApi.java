package ru.kinopoisk.sdk.easylogin.api;

import android.content.Context;
import android.content.Intent;
import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.j66;
import defpackage.qdb;
import defpackage.uh;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.EasyLoginActivity;
import ru.kinopoisk.sdk.easylogin.internal.Y8;
import ru.kinopoisk.sdk.easylogin.internal.di.DaggerEasyLoginSdkComponent;
import ru.kinopoisk.sdk.easylogin.internal.di.EasyLoginSdkComponent;
import ru.kinopoisk.sdk.easylogin.internal.di.Injector;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0003\u000f\u0010\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u0012"}, d2 = {"Lru/kinopoisk/sdk/easylogin/api/EasyLoginApi;", "", "Lru/kinopoisk/sdk/easylogin/api/EasyLoginDependencies;", "dependencies", "<init>", "(Lru/kinopoisk/sdk/easylogin/api/EasyLoginDependencies;)V", "", "initializeLanguageProvider", "()V", "Luh;", "Lru/kinopoisk/sdk/easylogin/api/EasyLoginRequest;", "Lru/kinopoisk/sdk/easylogin/api/EasyLoginResult;", "startEasyLoginActivity", "()Luh;", "Lru/kinopoisk/sdk/easylogin/api/EasyLoginDependencies;", "Companion", "EasyLoginActivityContract", "Language", "products_android_sdk_easyloginmobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class EasyLoginApi {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final EasyLoginDependencies dependencies;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/kinopoisk/sdk/easylogin/api/EasyLoginApi$EasyLoginActivityContract;", "Luh;", "Lru/kinopoisk/sdk/easylogin/api/EasyLoginRequest;", "Lru/kinopoisk/sdk/easylogin/api/EasyLoginResult;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Lru/kinopoisk/sdk/easylogin/api/EasyLoginRequest;)Landroid/content/Intent;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Lru/kinopoisk/sdk/easylogin/api/EasyLoginResult;", "products_android_sdk_easyloginmobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class EasyLoginActivityContract extends uh {
        @Override // defpackage.uh
        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull EasyLoginRequest input) {
            context.getClass();
            input.getClass();
            return EasyLoginActivity.INSTANCE.newIntent(context, input.getMode());
        }

        @Override // defpackage.uh
        @NotNull
        public EasyLoginResult parseResult(int resultCode, Intent intent) {
            return EasyLoginResult.INSTANCE.from$products_android_sdk_easyloginmobile(resultCode, intent);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/kinopoisk/sdk/easylogin/api/EasyLoginApi$Language;", "", ConnectableDevice.KEY_ID, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "RU", "EN", "AR", "products_android_sdk_easyloginmobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class Language {
        private static final /* synthetic */ qdb $ENTRIES;
        private static final /* synthetic */ Language[] $VALUES;

        @NotNull
        private final String id;
        public static final Language RU = new Language("RU", 0, "ru");
        public static final Language EN = new Language("EN", 1, "en");
        public static final Language AR = new Language("AR", 2, "ar-SA-u-nu-latn");

        private static final /* synthetic */ Language[] $values() {
            return new Language[]{RU, EN, AR};
        }

        static {
            Language[] $values = $values();
            $VALUES = $values;
            $ENTRIES = j66.Q($values);
        }

        private Language(String str, int i, String str2) {
            this.id = str2;
        }

        @NotNull
        public static qdb getEntries() {
            return $ENTRIES;
        }

        public static Language valueOf(String str) {
            return (Language) Enum.valueOf(Language.class, str);
        }

        public static Language[] values() {
            return (Language[]) $VALUES.clone();
        }

        @NotNull
        public final String getId() {
            return this.id;
        }
    }

    public EasyLoginApi(@NotNull EasyLoginDependencies easyLoginDependencies) {
        easyLoginDependencies.getClass();
        this.dependencies = easyLoginDependencies;
        initializeLanguageProvider();
        Injector injector = Injector.a;
        if (Injector.b != null) {
            return;
        }
        EasyLoginSdkComponent build = DaggerEasyLoginSdkComponent.builder().easyLoginDependencies(easyLoginDependencies).build();
        build.getClass();
        build.getClass();
        if (Injector.b == null) {
            synchronized (injector) {
                if (Injector.b == null) {
                    Injector.b = build;
                }
            }
        }
    }

    private final void initializeLanguageProvider() {
        Y8.a aVar = Y8.e;
        EasyLoginApi$initializeLanguageProvider$1 easyLoginApi$initializeLanguageProvider$1 = new EasyLoginApi$initializeLanguageProvider$1(this);
        aVar.getClass();
        if (Y8.f == null) {
            synchronized (aVar) {
                if (Y8.f == null) {
                    Y8.f = (Y8) easyLoginApi$initializeLanguageProvider$1.invoke();
                }
            }
        }
    }

    @NotNull
    public final uh startEasyLoginActivity() {
        return new EasyLoginActivityContract();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lru/kinopoisk/sdk/easylogin/api/EasyLoginApi$Companion;", "", "()V", "create", "Lru/kinopoisk/sdk/easylogin/api/EasyLoginApi;", "dependencies", "Lru/kinopoisk/sdk/easylogin/api/EasyLoginDependencies;", "products_android_sdk_easyloginmobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EasyLoginApi create(@NotNull EasyLoginDependencies dependencies) {
            dependencies.getClass();
            return new EasyLoginApi(dependencies);
        }

        private Companion() {
        }
    }
}
