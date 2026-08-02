package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.hrg;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.t7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC1233t7 {

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.t7$a */
    public static final class a implements InterfaceC1233t7 {

        @NotNull
        public static final a a = new a();
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.t7$b */
    public static final class b implements InterfaceC1233t7 {

        @NotNull
        public static final b a = new b();
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.t7$c */
    public static final class c implements InterfaceC1233t7 {

        @NotNull
        public final String a;

        public c(@NotNull String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.d(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public final String toString() {
            return hrg.q("Unknown(name=", this.a, ")");
        }
    }
}
