package com.plaid.internal;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.t4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractActivityC0291t4 extends AppCompatActivity {
    public a a = a.C0055a.a;
    public boolean b;

    /* renamed from: com.plaid.internal.t4$a */
    public static abstract class a {

        /* renamed from: com.plaid.internal.t4$a$a, reason: collision with other inner class name */
        public static final class C0055a extends a {
            public static final C0055a a = new C0055a();
        }

        /* renamed from: com.plaid.internal.t4$a$b */
        public static final class b extends a {
            public final Intent a;

            public b(Intent intent) {
                intent.getClass();
                this.a = intent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.areEqual(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "OnCreate(intent=" + this.a + ")";
            }
        }

        /* renamed from: com.plaid.internal.t4$a$c */
        public static final class c extends a {
            public final Intent a;

            public c(Intent intent) {
                this.a = intent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && Intrinsics.areEqual(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                Intent intent = this.a;
                if (intent == null) {
                    return 0;
                }
                return intent.hashCode();
            }

            public final String toString() {
                return "OnNewIntent(intent=" + this.a + ")";
            }
        }
    }

    public abstract void a(Intent intent);

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.b = bundle.getBoolean("outOfProcessActivityLaunched", false);
        }
        Intent intent = getIntent();
        intent.getClass();
        this.a = new a.b(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.a = new a.c(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        a aVar = this.a;
        if (this.b) {
            this.b = false;
            if (Intrinsics.areEqual(aVar, a.C0055a.a)) {
                Intent intent = new Intent();
                intent.putExtra("link_out_of_process_closed_redirect_uri", true);
                aVar = new a.c(intent);
            } else if (aVar instanceof a.b) {
                ((a.b) aVar).a.putExtra("link_out_of_process_closed_redirect_uri", true);
            }
        }
        this.a = a.C0055a.a;
        if (aVar instanceof a.C0055a) {
            return;
        }
        if (aVar instanceof a.b) {
            a(((a.b) aVar).a);
        } else if (aVar instanceof a.c) {
            a(((a.c) aVar).a);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("outOfProcessActivityLaunched", this.b);
    }
}
