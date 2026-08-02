package defpackage;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhnb;", "Lhr0;", "Llnb;", "Llxi;", "<init>", "()V", "shared-core-ui-evgen-analytics"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public abstract class hnb extends hr0 implements lnb, lxi {
    public cvo g;
    public boolean h;
    public final nnb i = new nnb(this);
    public final jyr j = btf.b(new ita(11, this));

    @Override // defpackage.lxi
    public final kxi d() {
        Intent intent;
        m6s R;
        fnb m = this.i.m();
        t l = l();
        return new kxi(m, (l == null || (intent = l.getIntent()) == null || (R = qgg.R(intent)) == null) ? null : R.a);
    }

    @Override // defpackage.lnb
    public final fnb g() {
        return this.i.m();
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public void onCreate(Bundle bundle) {
        this.i.w(this, bundle, null);
        super.onCreate(bundle);
        this.h = bundle != null ? bundle.getBoolean("changingConfigurations") : false;
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public void onDetach() {
        super.onDetach();
        a28.c(this);
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        this.i.x(bundle);
        t l = l();
        bundle.putBoolean("changingConfigurations", l != null ? l.isChangingConfigurations() : false);
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onStart() {
        super.onStart();
        this.i.y(null);
        if (!this.h) {
            ((tmb) this.j.getValue()).b().e();
        }
        this.h = false;
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onStop() {
        this.i.f = true;
        t l = l();
        if (l == null || !l.isChangingConfigurations()) {
            ((tmb) this.j.getValue()).b().b();
        }
        super.onStop();
    }

    @Override // androidx.fragment.app.i
    public void show(y yVar, String str) {
        yVar.getClass();
        yVar.getClass();
        a aVar = new a(yVar);
        aVar.d(0, this, str, 1);
        aVar.k(true, true);
    }

    @Override // androidx.fragment.app.o
    public final void startActivity(Intent intent) {
        intent.getClass();
        this.i.t(intent);
        super.startActivity(intent);
    }

    @Override // androidx.fragment.app.o
    public final void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        this.i.t(intent);
        super.startActivityForResult(intent, i);
    }

    @Override // androidx.fragment.app.o
    public final void startActivity(Intent intent, Bundle bundle) {
        intent.getClass();
        this.i.t(intent);
        super.startActivity(intent, bundle);
    }

    @Override // androidx.fragment.app.o
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        this.i.t(intent);
        super.startActivityForResult(intent, i, bundle);
    }
}
