package com.onesignal.inAppMessages.internal.prompt.impl;

import W2.e;
import v7.InterfaceC5133d;
import y7.InterfaceC5255a;

/* loaded from: classes2.dex */
public abstract class b {
    private boolean prompted;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ InterfaceC5255a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a PERMISSION_GRANTED = new a("PERMISSION_GRANTED", 0);
        public static final a PERMISSION_DENIED = new a("PERMISSION_DENIED", 1);
        public static final a LOCATION_PERMISSIONS_MISSING_MANIFEST = new a("LOCATION_PERMISSIONS_MISSING_MANIFEST", 2);
        public static final a ERROR = new a("ERROR", 3);

        private static final /* synthetic */ a[] $values() {
            return new a[]{PERMISSION_GRANTED, PERMISSION_DENIED, LOCATION_PERMISSIONS_MISSING_MANIFEST, ERROR};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = e.d($values);
        }

        private a(String str, int i) {
        }

        public static InterfaceC5255a getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public abstract String getPromptKey();

    public abstract Object handlePrompt(InterfaceC5133d interfaceC5133d);

    public final boolean hasPrompted() {
        return this.prompted;
    }

    public final void setPrompted(boolean z8) {
        this.prompted = z8;
    }

    public String toString() {
        return "OSInAppMessagePrompt{key=" + getPromptKey() + " prompted=" + this.prompted + '}';
    }
}
