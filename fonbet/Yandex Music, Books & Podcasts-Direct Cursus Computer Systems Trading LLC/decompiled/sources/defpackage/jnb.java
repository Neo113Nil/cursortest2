package defpackage;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljnb;", "Landroidx/fragment/app/o;", "Llnb;", "Llxi;", "<init>", "()V", "shared-core-ui-evgen-analytics"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public abstract class jnb extends o implements lnb, lxi {
    public final nnb g = new nnb(this);
    public final jyr h = btf.b(new ita(12, this));
    public boolean i;

    @Override // defpackage.lxi
    public final kxi d() {
        Intent intent;
        m6s R;
        fnb m = this.g.m();
        t l = l();
        return new kxi(m, (l == null || (intent = l.getIntent()) == null || (R = qgg.R(intent)) == null) ? null : R.a);
    }

    @Override // defpackage.lnb
    public final fnb g() {
        return this.g.m();
    }

    @Override // androidx.fragment.app.o
    public void onCreate(Bundle bundle) {
        this.g.w(this, bundle, getT());
        super.onCreate(bundle);
        this.i = bundle != null ? bundle.getBoolean("changingConfigurations") : false;
    }

    @Override // androidx.fragment.app.o
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        this.g.x(bundle);
        t l = l();
        bundle.putBoolean("changingConfigurations", l != null ? l.isChangingConfigurations() : false);
    }

    @Override // androidx.fragment.app.o
    public void onStart() {
        tmb tmbVar;
        tnb b;
        super.onStart();
        this.g.y(getT());
        if (!this.i && (tmbVar = (tmb) this.h.getValue()) != null && (b = tmbVar.b()) != null) {
            b.e();
        }
        this.i = false;
    }

    @Override // androidx.fragment.app.o
    public void onStop() {
        tmb tmbVar;
        tnb b;
        this.g.f = true;
        t l = l();
        if ((l == null || !l.isChangingConfigurations()) && (tmbVar = (tmb) this.h.getValue()) != null && (b = tmbVar.b()) != null) {
            b.b();
        }
        super.onStop();
    }

    @Override // androidx.fragment.app.o
    public void startActivity(Intent intent) {
        intent.getClass();
        this.g.t(intent);
        super.startActivity(intent);
    }

    @Override // androidx.fragment.app.o
    public void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        this.g.t(intent);
        super.startActivityForResult(intent, i);
    }

    public final tmb x() {
        tmb tmbVar = (tmb) this.h.getValue();
        tmbVar.getClass();
        return tmbVar;
    }

    /* renamed from: y */
    public gfo getT() {
        return null;
    }

    /* renamed from: z */
    public cvo getP() {
        return null;
    }

    @Override // androidx.fragment.app.o
    public void startActivity(Intent intent, Bundle bundle) {
        intent.getClass();
        this.g.t(intent);
        super.startActivity(intent, bundle);
    }

    @Override // androidx.fragment.app.o
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        this.g.t(intent);
        super.startActivityForResult(intent, i, bundle);
    }
}
