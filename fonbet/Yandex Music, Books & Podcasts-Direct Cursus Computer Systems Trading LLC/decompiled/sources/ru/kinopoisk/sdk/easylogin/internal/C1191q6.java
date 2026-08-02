package ru.kinopoisk.sdk.easylogin.internal;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1177p6;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.q6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1191q6 implements InterfaceC1177p6 {

    @NotNull
    public final C1204r6 a = new C1204r6();

    public C1191q6(boolean z) {
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1177p6
    @NotNull
    public final String a(@NotNull String str, @NotNull Function1<? super InterfaceC1177p6.a, Unit> function1) {
        str.getClass();
        function1.getClass();
        function1.invoke(this.a);
        return str;
    }

    @NotNull
    public final LinkedHashMap a() {
        return this.a.a;
    }
}
