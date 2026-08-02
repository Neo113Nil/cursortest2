package defpackage;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

/* loaded from: classes.dex */
public final class yq2 implements f2m0 {
    public final /* synthetic */ AppCompatActivity a;

    public yq2(AppCompatActivity appCompatActivity) {
        this.a = appCompatActivity;
    }

    @Override // defpackage.f2m0
    public final Bundle a() {
        Bundle bundle = new Bundle();
        this.a.getDelegate().onSaveInstanceState(bundle);
        return bundle;
    }
}
