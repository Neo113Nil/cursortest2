package com.plaid.internal;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.JobKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/plaid/internal/LinkRedirectActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkRedirectActivity extends AppCompatActivity {
    public final ViewModelLazy a = new ViewModelLazy(Reflection.factory.getOrCreateKotlinClass(K2.class), new b(), new a(), new c());

    public static final class a extends Lambda implements Function0<ViewModelProvider$Factory> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LinkRedirectActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class b extends Lambda implements Function0<ViewModelStore> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LinkRedirectActivity.this.getViewModelStore();
        }
    }

    public static final class c extends Lambda implements Function0<CreationExtras> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LinkRedirectActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        K2 k2 = (K2) this.a.getValue();
        Intent intent = getIntent();
        intent.getClass();
        JobKt.launch$default(ViewModelKt.getViewModelScope(k2), null, null, new J2(this, K2.a(intent.getData()), null), 3);
        finish();
    }
}
