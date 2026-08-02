package ru.kinopoisk.sdk.easylogin.internal;

import android.content.SharedPreferences;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.g4f;
import defpackage.quj;
import defpackage.uif;
import defpackage.x3f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class B6 {

    @NotNull
    public final x3f a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/B6$a;", "", "", "KEY", "Ljava/lang/String;", "android_easylogin_tvauth_mobileimpl"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static final class b extends uif implements Function1<g4f, Unit> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            g4f g4fVar = (g4f) obj;
            g4fVar.getClass();
            g4fVar.a = true;
            return Unit.a;
        }
    }

    static {
        new a(null);
    }

    public B6(@NotNull SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        this.a = quj.r(x3f.d, b.a);
    }
}
