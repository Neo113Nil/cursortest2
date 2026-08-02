package com.yandex.passport.internal.flags.experiments;

import android.os.Bundle;

/* loaded from: classes4.dex */
public class d implements com.yandex.passport.internal.methods.f {
    public final /* synthetic */ int a;
    public final String b;

    public d(String str, int i) {
        this.a = i;
        str.getClass();
        switch (i) {
            case 3:
                this.b = str;
                break;
            default:
                this.b = str;
                break;
        }
    }

    public Boolean a(Bundle bundle) {
        bundle.getClass();
        return Boolean.valueOf(bundle.getBoolean(this.b));
    }

    @Override // com.yandex.passport.internal.methods.f
    public Object f(Bundle bundle) {
        switch (this.a) {
            case 1:
                return a(bundle);
            default:
                bundle.getClass();
                return bundle.getString(this.b, null);
        }
    }

    @Override // com.yandex.passport.internal.methods.f
    public void g(Bundle bundle, Object obj) {
        switch (this.a) {
            case 1:
                bundle.putBoolean(this.b, ((Boolean) obj).booleanValue());
                break;
            default:
                bundle.putString(this.b, (String) obj);
                break;
        }
    }

    @Override // com.yandex.passport.internal.methods.f
    public String getKey() {
        switch (this.a) {
        }
        return this.b;
    }

    public /* synthetic */ d(String str, int i, boolean z) {
        this.a = i;
        this.b = str;
    }
}
