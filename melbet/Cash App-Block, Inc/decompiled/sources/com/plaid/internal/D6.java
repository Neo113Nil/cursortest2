package com.plaid.internal;

/* loaded from: classes5.dex */
public abstract class D6 {

    public static final class a extends D6 {
        public final String a;

        public a(String str) {
            str.getClass();
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public final String toString() {
            return "OAuth";
        }
    }

    public static final class b extends D6 {
        public final String a;

        public b(String str) {
            str.getClass();
            this.a = str;
        }

        public final String toString() {
            return "OutOfProcess";
        }
    }

    public static final class c extends D6 {
        public final String toString() {
            return "OutOfProcessClosed";
        }
    }

    public static final class d extends D6 {
        public final Exception a;

        public d(Exception exc) {
            exc.getClass();
            this.a = exc;
        }

        public final Exception a() {
            return this.a;
        }

        public final String toString() {
            return "RedirectError";
        }
    }

    public static final class e extends D6 {
        public final String toString() {
            return "ResumeInProcess";
        }
    }
}
