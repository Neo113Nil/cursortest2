package com.squareup.cash.passkeys.backend;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public interface PasskeyRepository$FetchPasskeysResult {

    public final class Error implements PasskeyRepository$FetchPasskeysResult {
        public static final Error INSTANCE = new Error();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return -652493329;
        }

        public final String toString() {
            return "Error";
        }
    }

    public final class Success implements PasskeyRepository$FetchPasskeysResult {
        public final ArrayList passkeys;

        public Success(ArrayList arrayList) {
            this.passkeys = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && this.passkeys.equals(((Success) obj).passkeys);
        }

        public final int hashCode() {
            return this.passkeys.hashCode();
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("Success(passkeys=", ")", this.passkeys);
        }
    }
}
