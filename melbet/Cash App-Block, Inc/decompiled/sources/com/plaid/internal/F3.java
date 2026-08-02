package com.plaid.internal;

import android.content.res.Resources;
import com.plaid.internal.N2;
import com.plaid.link.R;
import com.plaid.link.result.LinkErrorCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.collections.EmptyList;

/* loaded from: classes5.dex */
public final class F3 {
    public final Resources a;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[H3.values().length];
            try {
                iArr[H3.NETWORK_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[H3.SESSION_EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[H3.INITIALIZATION_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[H3.HTTP_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[H3.UNKNOWN_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    public F3(Resources resources) {
        resources.getClass();
        this.a = resources;
    }

    public final String a(H3 h3) {
        int i = a.a[h3.ordinal()];
        if (i == 1) {
            String string2 = this.a.getString(R.string.plaid_error_no_network_connection_content);
            string2.getClass();
            return string2;
        }
        if (i == 2) {
            String string3 = this.a.getString(R.string.plaid_error_session_expired_content);
            string3.getClass();
            return string3;
        }
        if (i == 3) {
            String string4 = this.a.getString(R.string.plaid_error_initialization_content);
            string4.getClass();
            return string4;
        }
        if (i == 4) {
            String string5 = this.a.getString(R.string.plaid_error_internal_server_error_try_again_later);
            string5.getClass();
            return string5;
        }
        if (i != 5) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        String string6 = this.a.getString(R.string.plaid_error_fallback_content);
        string6.getClass();
        return string6;
    }

    public final N2.i a() {
        r8.CREATOR.getClass();
        r8 r8Var = new r8("unknown", "error_pane_id", "local_error_pane");
        H3 h3 = H3.INITIALIZATION_ERROR;
        return new N2.i("unknown", r8Var, "", a(h3), LinkErrorCode.ApiError.INTERNAL_SERVER_ERROR.INSTANCE.getJson(), EmptyList.INSTANCE, "", h3);
    }
}
