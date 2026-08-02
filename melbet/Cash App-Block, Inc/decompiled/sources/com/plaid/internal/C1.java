package com.plaid.internal;

import android.content.Intent;
import com.plaid.internal.D6;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class C1 {
    public static final D6 a(Intent intent) {
        if (intent == null) {
            return null;
        }
        if (intent.getBooleanExtra("redirect_error", false)) {
            Serializable serializableExtra = intent.getSerializableExtra("redirect_error_exception");
            return new D6.d(serializableExtra != null ? (Exception) serializableExtra : new RuntimeException("Unknown oauth redirect exception"));
        }
        if (!intent.hasExtra("link_oauth_redirect") && !intent.hasExtra("link_out_of_process_complete_redirect") && !intent.hasExtra("link_out_of_process_closed_redirect_uri") && !intent.hasExtra("link_resume_redirect")) {
            return null;
        }
        if (intent.hasExtra("link_out_of_process_closed_redirect_uri")) {
            return new D6.c();
        }
        if (intent.hasExtra("link_resume_redirect")) {
            return new D6.e();
        }
        String stringExtra = intent.getStringExtra("link_oauth_received_redirect_uri");
        if (stringExtra != null) {
            return new D6.a(stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("link_out_of_process_complete_redirect_uri");
        return stringExtra2 != null ? new D6.b(stringExtra2) : new D6.d(new RuntimeException("Redirect uri cannot be null"));
    }
}
