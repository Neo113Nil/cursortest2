package com.anythink.basead.mraid;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class d implements com.anythink.core.express.b.b {

    /* renamed from: a, reason: collision with root package name */
    g f10408a;

    /* renamed from: b, reason: collision with root package name */
    WeakReference<Activity> f10409b;

    /* renamed from: c, reason: collision with root package name */
    private e f10410c;

    private void a(Activity activity) {
        this.f10409b = new WeakReference<>(activity);
    }

    @Override // com.anythink.core.express.b.b
    public final void close() {
        e eVar = this.f10410c;
        if (eVar != null) {
            eVar.close();
        }
    }

    @Override // com.anythink.core.express.b.b
    public final void expand(String str, boolean z6) {
        Activity activity;
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("url", str);
            bundle.putBoolean("shouldUseCustomClose", z6);
            WeakReference<Activity> weakReference = this.f10409b;
            if (weakReference == null || (activity = weakReference.get()) == null) {
                return;
            }
            g gVar = this.f10408a;
            if (gVar == null || !gVar.isShowing()) {
                g gVar2 = new g(activity, bundle, this.f10410c);
                this.f10408a = gVar2;
                gVar2.show();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.core.express.b.b
    public final void open(String str) {
        e eVar = this.f10410c;
        if (eVar != null) {
            eVar.open(str);
        }
    }

    @Override // com.anythink.core.express.b.b
    public final void unload() {
        close();
    }

    @Override // com.anythink.core.express.b.b
    public final void useCustomClose(boolean z6) {
        try {
            e eVar = this.f10410c;
            if (eVar != null) {
                eVar.useCustomClose(z6);
            }
        } catch (Throwable unused) {
        }
    }

    public final void a(e eVar) {
        if (eVar != null) {
            this.f10410c = eVar;
        }
    }
}
