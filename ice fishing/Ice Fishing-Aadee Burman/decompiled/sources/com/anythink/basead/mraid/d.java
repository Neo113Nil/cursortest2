package com.anythink.basead.mraid;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class d implements com.anythink.core.express.b.b {

    /* renamed from: a, reason: collision with root package name */
    g f9622a;

    /* renamed from: b, reason: collision with root package name */
    WeakReference<Activity> f9623b;

    /* renamed from: c, reason: collision with root package name */
    private e f9624c;

    private void a(Activity activity) {
        this.f9623b = new WeakReference<>(activity);
    }

    @Override // com.anythink.core.express.b.b
    public final void close() {
        e eVar = this.f9624c;
        if (eVar != null) {
            eVar.close();
        }
    }

    @Override // com.anythink.core.express.b.b
    public final void expand(String str, boolean z3) {
        Activity activity;
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("url", str);
            bundle.putBoolean("shouldUseCustomClose", z3);
            WeakReference<Activity> weakReference = this.f9623b;
            if (weakReference == null || (activity = weakReference.get()) == null) {
                return;
            }
            g gVar = this.f9622a;
            if (gVar == null || !gVar.isShowing()) {
                g gVar2 = new g(activity, bundle, this.f9624c);
                this.f9622a = gVar2;
                gVar2.show();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.core.express.b.b
    public final void open(String str) {
        e eVar = this.f9624c;
        if (eVar != null) {
            eVar.open(str);
        }
    }

    @Override // com.anythink.core.express.b.b
    public final void unload() {
        close();
    }

    @Override // com.anythink.core.express.b.b
    public final void useCustomClose(boolean z3) {
        try {
            e eVar = this.f9624c;
            if (eVar != null) {
                eVar.useCustomClose(z3);
            }
        } catch (Throwable unused) {
        }
    }

    public final void a(e eVar) {
        if (eVar != null) {
            this.f9624c = eVar;
        }
    }
}
