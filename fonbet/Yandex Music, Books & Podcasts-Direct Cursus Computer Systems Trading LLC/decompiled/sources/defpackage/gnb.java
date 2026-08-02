package defpackage;

import android.content.Intent;
import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class gnb extends hq0 implements lnb, lxi {
    public final mnb a = new mnb(this);

    @Override // defpackage.lxi
    public final kxi d() {
        m6s R;
        fnb g = g();
        Intent intent = getIntent();
        return new kxi(g, (intent == null || (R = qgg.R(intent)) == null) ? null : R.a);
    }

    @Override // defpackage.lnb
    public fnb g() {
        return this.a.m();
    }

    public gfo j() {
        return null;
    }

    @Override // androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        intent.getClass();
        gfo j = j();
        mnb mnbVar = this.a;
        mnbVar.getClass();
        mnbVar.c = this;
        mnbVar.b = knb.a.B(this, intent, bundle, j);
        super.onCreate(bundle);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, lnb] */
    @Override // defpackage.hn5, androidx.core.app.i, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        mnb mnbVar = this.a;
        mnbVar.getClass();
        bundle.putParcelable("global.key.evgen.meta", mnbVar.a.g());
    }

    @Override // defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public void onStart() {
        super.onStart();
        gfo j = j();
        mnb mnbVar = this.a;
        fnb m = mnbVar.m();
        if ((m instanceof uqi) && j != null && mnbVar.d) {
            uqi uqiVar = (uqi) m;
            uqiVar.a = j;
            uqiVar.b = avf.G(j.a);
            mnbVar.d = false;
        }
    }

    @Override // defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public void onStop() {
        this.a.d = true;
        super.onStop();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivities(Intent[] intentArr, Bundle bundle) {
        intentArr.getClass();
        for (Intent intent : (Intent[]) Arrays.copyOf(intentArr, intentArr.length)) {
            this.a.t(intent);
        }
        super.startActivities(intentArr, bundle);
    }

    @Override // defpackage.hn5, android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        this.a.t(new Intent[]{intent}[0]);
        super.startActivityForResult(intent, i, bundle);
    }
}
