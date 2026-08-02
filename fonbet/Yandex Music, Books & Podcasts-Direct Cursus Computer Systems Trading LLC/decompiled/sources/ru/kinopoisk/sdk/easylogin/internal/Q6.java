package ru.kinopoisk.sdk.easylogin.internal;

import android.net.nsd.NsdServiceInfo;
import defpackage.f1d;
import defpackage.hrg;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public interface Q6 {

    public static final class a implements Q6 {
        public final boolean a;

        @NotNull
        public final String b;
        public final int c;

        public a(boolean z, @NotNull String str, int i) {
            str.getClass();
            this.a = z;
            this.b = str;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Intrinsics.d(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + C1292y0.a(this.b, Boolean.hashCode(this.a) * 31, 31);
        }

        @NotNull
        public final String toString() {
            boolean z = this.a;
            String str = this.b;
            int i = this.c;
            StringBuilder sb = new StringBuilder("Failed(discovered=");
            sb.append(z);
            sb.append(", serviceType=");
            sb.append(str);
            sb.append(", errorCode=");
            return f1d.i(sb, i, ")");
        }
    }

    public static final class b implements Q6 {

        @NotNull
        public final NsdServiceInfo a;

        public b(@NotNull NsdServiceInfo nsdServiceInfo) {
            nsdServiceInfo.getClass();
            this.a = nsdServiceInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.d(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "FoundDevice(serviceInfo=" + this.a + ")";
        }
    }

    public static final class c implements Q6 {

        @NotNull
        public final NsdServiceInfo a;

        public c(@NotNull NsdServiceInfo nsdServiceInfo) {
            nsdServiceInfo.getClass();
            this.a = nsdServiceInfo;
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
            return "LostDevice(serviceInfo=" + this.a + ")";
        }
    }

    public static final class d implements Q6 {

        @NotNull
        public final String a;

        public d(@NotNull String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.d(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public final String toString() {
            return hrg.q("Started(serviceType=", this.a, ")");
        }
    }

    public static final class e implements Q6 {

        @NotNull
        public final String a;

        public e(@NotNull String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.d(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public final String toString() {
            return hrg.q("Stopped(serviceType=", this.a, ")");
        }
    }
}
