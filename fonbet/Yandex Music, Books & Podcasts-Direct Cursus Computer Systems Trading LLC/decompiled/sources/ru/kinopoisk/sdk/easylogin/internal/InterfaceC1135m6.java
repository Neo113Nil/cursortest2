package ru.kinopoisk.sdk.easylogin.internal;

import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.C1309z4;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.m6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC1135m6 {
    default void a(@NotNull EnumC1051g6 enumC1051g6, @NotNull Function1<? super InterfaceC1177p6, String> function1) {
        enumC1051g6.getClass();
        function1.getClass();
        a(EnumC1079i6.Verbose, enumC1051g6, function1);
    }

    void a(@NotNull EnumC1079i6 enumC1079i6, @NotNull EnumC1051g6 enumC1051g6, @NotNull Function1<? super InterfaceC1177p6, String> function1);

    default void b(@NotNull EnumC1051g6 enumC1051g6, @NotNull Function1<? super InterfaceC1177p6, String> function1) {
        enumC1051g6.getClass();
        function1.getClass();
        a(EnumC1079i6.Notice, enumC1051g6, function1);
    }

    default void a(@NotNull EnumC1051g6 enumC1051g6, @NotNull C1309z4.h hVar) {
        enumC1051g6.getClass();
        hVar.getClass();
        a(EnumC1079i6.Important, enumC1051g6, hVar);
    }
}
