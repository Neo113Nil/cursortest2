package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aj2;
import defpackage.exi;
import defpackage.jsc;
import defpackage.vyn;
import defpackage.yi2;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.b1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0976b1 {
    @NotNull
    public static final Z0 a(@NotNull Z0 z0, @NotNull Y7 y7) {
        z0.getClass();
        y7.getClass();
        if (z0 instanceof aj2) {
            return new aj2((InterfaceC1274w8) y7.invoke(a(z0)));
        }
        if (z0 instanceof jsc) {
            InterfaceC1274w8 interfaceC1274w8 = (InterfaceC1274w8) y7.invoke(a(z0));
            return interfaceC1274w8 != null ? new jsc(interfaceC1274w8) : (jsc) z0;
        }
        if (z0 instanceof vyn) {
            InterfaceC1274w8 interfaceC1274w82 = (InterfaceC1274w8) y7.invoke(a(z0));
            return interfaceC1274w82 != null ? new vyn(interfaceC1274w82) : (vyn) z0;
        }
        if (z0 instanceof yi2) {
            InterfaceC1274w8 interfaceC1274w83 = (InterfaceC1274w8) y7.invoke(a(z0));
            return interfaceC1274w83 != null ? new yi2(interfaceC1274w83) : (yi2) z0;
        }
        if (!(z0 instanceof exi)) {
            return z0;
        }
        a(null, y7);
        throw null;
    }

    public static final InterfaceC1274w8 a(@NotNull Z0 z0) {
        z0.getClass();
        if (z0 instanceof aj2) {
            return ((aj2) z0).a;
        }
        if (z0 instanceof jsc) {
            return ((jsc) z0).a;
        }
        if (z0 instanceof vyn) {
            return ((vyn) z0).a;
        }
        if (z0 instanceof yi2) {
            return ((yi2) z0).a;
        }
        if (z0 instanceof exi) {
            return a(null);
        }
        return null;
    }
}
