package com.yandex.passport.internal.ui.sloth.plusdevices;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import com.yandex.passport.api.y1;
import com.yandex.passport.internal.push.w0;
import com.yandex.passport.internal.report.we;
import com.yandex.passport.internal.ui.sloth.ebs.n1;
import defpackage.b6e;
import defpackage.btf;
import defpackage.er0;
import defpackage.gi;
import defpackage.hq0;
import defpackage.jyr;
import defpackage.vwb;
import defpackage.wyf;
import defpackage.x0q;
import defpackage.x97;
import defpackage.xq0;
import defpackage.y0q;
import defpackage.zh;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class ManagingPlusDevicesHelperActivity extends hq0 {
    public static final /* synthetic */ int g = 0;
    public com.yandex.passport.internal.ui.bouncer.roundabout.z a;
    public final zh b = registerForActivityResult(new n1(4), new gi(18, this));
    public final x0q c = y0q.b(0, 0, null, 7);
    public final jyr d = btf.b(new w0(17));
    public final jyr e = btf.b(new com.yandex.passport.internal.ui.sloth.authsdk.h0(6, this));
    public boolean f;

    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    @Override // androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        int i;
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            com.yandex.passport.internal.ui.a.q(this, new IllegalArgumentException("ManagingPlusDevicesProperties is missing in intent"));
            return;
        }
        Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) vwb.O(extras, com.yandex.passport.internal.properties.o.class, "key_managing_plus_devices_properties") : extras.getParcelable("key_managing_plus_devices_properties");
        if (parcelable == null) {
            xq0.q("can't get required parcelable key_managing_plus_devices_properties");
            return;
        }
        com.yandex.passport.internal.properties.o oVar = (com.yandex.passport.internal.properties.o) parcelable;
        y1 y1Var = oVar.a;
        y1Var.getClass();
        int ordinal = y1Var.ordinal();
        if (ordinal != 0) {
            i = 2;
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        b6e.s();
                        return;
                    }
                    i = -1;
                }
            }
            Continuation continuation = null;
            if (i != ((er0) getDelegate()).z0) {
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Setting theme to " + y1Var + " with nightMode=" + i + ", was " + ((er0) getDelegate()).z0, 8);
                }
                getDelegate().n(i);
            }
            super.onCreate(bundle);
            if (!isFinishing() || isChangingConfigurations() || this.f) {
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Should recreate activity: isFinishing=" + isFinishing() + " isChangingConfigurations=" + isChangingConfigurations() + " isGoingToRecreate=" + this.f, 8);
                }
                x97.y(wyf.F(getLifecycle()), null, null, new com.yandex.passport.internal.ui.sloth.q(this, continuation, 4), 3);
            }
            com.yandex.passport.internal.ui.bouncer.roundabout.z zVar = new com.yandex.passport.internal.ui.bouncer.roundabout.z(this);
            this.a = zVar;
            setContentView(zVar.e());
            x97.y(wyf.F(getLifecycle()), null, null, new we(this.c, continuation, this, oVar, 13), 3);
            jyr jyrVar = this.e;
            x97.y(wyf.F(getLifecycle()), null, null, new com.yandex.passport.internal.ui.sloth.q(((j) jyrVar.getValue()).n, continuation, this, 5), 3);
            if (bundle != null) {
                if (oVar.e) {
                    ((j) jyrVar.getValue()).G(new g(oVar));
                    return;
                } else {
                    ((j) jyrVar.getValue()).G(new h(true, oVar));
                    return;
                }
            }
            return;
        }
        i = 1;
        Continuation continuation2 = null;
        if (i != ((er0) getDelegate()).z0) {
        }
        super.onCreate(bundle);
        if (!isFinishing()) {
        }
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
        }
        x97.y(wyf.F(getLifecycle()), null, null, new com.yandex.passport.internal.ui.sloth.q(this, continuation2, 4), 3);
        com.yandex.passport.internal.ui.bouncer.roundabout.z zVar2 = new com.yandex.passport.internal.ui.bouncer.roundabout.z(this);
        this.a = zVar2;
        setContentView(zVar2.e());
        x97.y(wyf.F(getLifecycle()), null, null, new we(this.c, continuation2, this, oVar, 13), 3);
        jyr jyrVar2 = this.e;
        x97.y(wyf.F(getLifecycle()), null, null, new com.yandex.passport.internal.ui.sloth.q(((j) jyrVar2.getValue()).n, continuation2, this, 5), 3);
        if (bundle != null) {
        }
    }

    @Override // defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ((Handler) this.d.getValue()).removeCallbacksAndMessages(null);
    }

    @Override // android.app.Activity
    public final void recreate() {
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "isGoingToRecreate = true", 8);
        }
        this.f = true;
        super.recreate();
    }
}
