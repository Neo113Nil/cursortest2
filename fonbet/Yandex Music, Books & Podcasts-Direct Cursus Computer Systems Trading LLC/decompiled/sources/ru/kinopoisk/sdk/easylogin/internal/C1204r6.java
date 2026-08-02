package ru.kinopoisk.sdk.easylogin.internal;

import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1177p6;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.r6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1204r6 implements InterfaceC1177p6.a {

    @NotNull
    public final LinkedHashMap a = new LinkedHashMap();

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1177p6.a
    public final void a(@NotNull String str, @NotNull Object obj) {
        str.getClass();
        obj.getClass();
        boolean z = obj instanceof String;
        LinkedHashMap linkedHashMap = this.a;
        if (!z) {
            linkedHashMap.put(str, obj);
            return;
        }
        linkedHashMap.put(str, "\"" + obj + "\"");
    }
}
