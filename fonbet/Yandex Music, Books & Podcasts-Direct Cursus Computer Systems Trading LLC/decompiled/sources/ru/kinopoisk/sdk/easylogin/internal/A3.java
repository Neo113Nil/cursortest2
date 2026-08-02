package ru.kinopoisk.sdk.easylogin.internal;

import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.C1308z3;

/* loaded from: classes5.dex */
public final class A3 implements InterfaceC1281x2 {

    @NotNull
    public final C1308z3 a;

    public A3(@NotNull C1308z3 c1308z3) {
        c1308z3.getClass();
        this.a = c1308z3;
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1281x2
    public final K7 a(@NotNull String str) {
        C1308z3.b a;
        str.getClass();
        C1308z3 c1308z3 = this.a;
        c1308z3.getClass();
        str.getClass();
        String string = c1308z3.b.getString(str, null);
        if (string != null && (a = c1308z3.a(string)) != null) {
            String str2 = a.a;
            if (c1308z3.a.contains(str2)) {
                int i = c1308z3.a.getInt(str2, 0);
                str.getClass();
                return new K7(a.b, new H8(str, i));
            }
        }
        return null;
    }
}
