package defpackage;

import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.b;

/* loaded from: classes.dex */
public final class zq2 implements cy60 {
    public final /* synthetic */ AppCompatActivity a;

    public zq2(AppCompatActivity appCompatActivity) {
        this.a = appCompatActivity;
    }

    @Override // defpackage.cy60
    public final void a(ComponentActivity componentActivity) {
        AppCompatActivity appCompatActivity = this.a;
        b delegate = appCompatActivity.getDelegate();
        delegate.installViewFactory();
        delegate.onCreate(appCompatActivity.getSavedStateRegistry().a("androidx:appcompat"));
    }
}
