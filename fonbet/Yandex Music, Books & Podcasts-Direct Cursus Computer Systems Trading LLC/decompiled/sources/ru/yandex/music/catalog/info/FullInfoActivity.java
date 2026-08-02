package ru.yandex.music.catalog.info;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import defpackage.alk;
import defpackage.asq;
import defpackage.b6e;
import defpackage.bdt;
import defpackage.ca8;
import defpackage.cg6;
import defpackage.cmd;
import defpackage.dm6;
import defpackage.dq7;
import defpackage.etn;
import defpackage.f1d;
import defpackage.frt;
import defpackage.fzb;
import defpackage.g06;
import defpackage.g68;
import defpackage.gi;
import defpackage.gnb;
import defpackage.h1j;
import defpackage.h1o;
import defpackage.h4b;
import defpackage.hag;
import defpackage.hoe;
import defpackage.htb;
import defpackage.ixc;
import defpackage.iz7;
import defpackage.j5h;
import defpackage.jxc;
import defpackage.jyr;
import defpackage.klk;
import defpackage.klx;
import defpackage.kxc;
import defpackage.l18;
import defpackage.lxc;
import defpackage.m0c;
import defpackage.n7b;
import defpackage.nm6;
import defpackage.oec;
import defpackage.ou0;
import defpackage.q5g;
import defpackage.qgg;
import defpackage.qxe;
import defpackage.rar;
import defpackage.rxc;
import defpackage.su4;
import defpackage.vh;
import defpackage.wkk;
import defpackage.x97;
import defpackage.xkk;
import defpackage.xq0;
import defpackage.ykk;
import defpackage.yu0;
import defpackage.z66;
import defpackage.zh;
import defpackage.zkk;
import defpackage.zt3;
import defpackage.zu1;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import ru.yandex.music.R;
import ru.yandex.music.cover.upload.UploadCoverService;
import ru.yandex.music.utils.Assertions;
import ru.yandex.music.utils.Preconditions;

/* loaded from: classes4.dex */
public final class FullInfoActivity extends gnb {
    public static final /* synthetic */ int g = 0;
    public final jyr b = l18.b.b(hag.I(h1o.class), true);
    public ixc c;
    public iz7 d;
    public rxc e;
    public zh f;

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(FullInfoActivity fullInfoActivity, Uri uri, cg6 cg6Var) {
        jxc jxcVar;
        int i;
        ykk ykkVar;
        alk alkVar;
        if (cg6Var instanceof jxc) {
            jxcVar = (jxc) cg6Var;
            int i2 = jxcVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jxcVar.m = i2 - Integer.MIN_VALUE;
                Object obj = jxcVar.k;
                nm6 nm6Var = nm6.a;
                i = jxcVar.m;
                ykkVar = ykk.a;
                boolean z = true;
                if (i != 0) {
                    qgg.h0(obj);
                    h1o h1oVar = (h1o) fullInfoActivity.b.getValue();
                    jxcVar.j = uri;
                    jxcVar.m = 1;
                    h1oVar.getClass();
                    if (etn.z(h1oVar.a, "android.permission.CAMERA") == 0) {
                        obj = ykkVar;
                    } else {
                        zt3 zt3Var = new zt3(1, qxe.b(jxcVar));
                        zt3Var.s();
                        wkk wkkVar = new wkk(new oec(zt3Var, 4));
                        klk klkVar = (klk) h1oVar.b.getValue();
                        klkVar.getClass();
                        x97.y(klkVar.a, null, null, new h1j(klkVar, wkkVar, (Continuation) null, 22), 3);
                        obj = zt3Var.q();
                    }
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uri = jxcVar.j;
                    qgg.h0(obj);
                }
                alkVar = (alk) obj;
                boolean z2 = false;
                if (!Intrinsics.d(alkVar, zkk.a) && !Intrinsics.d(alkVar, xkk.a)) {
                    if (Intrinsics.d(alkVar, ykkVar)) {
                        b6e.s();
                        return null;
                    }
                    Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                    if (intent.resolveActivity(fullInfoActivity.getPackageManager()) != null) {
                        intent.addFlags(3);
                        intent.putExtra("output", uri);
                        try {
                            fullInfoActivity.startActivityForResult(intent, 9);
                        } catch (ActivityNotFoundException unused) {
                        }
                        z2 = z;
                    }
                    z = false;
                    z2 = z;
                }
                return Boolean.valueOf(z2);
            }
        }
        jxcVar = new jxc(fullInfoActivity, cg6Var);
        Object obj2 = jxcVar.k;
        nm6 nm6Var2 = nm6.a;
        i = jxcVar.m;
        ykkVar = ykk.a;
        boolean z3 = true;
        if (i != 0) {
        }
        alkVar = (alk) obj2;
        boolean z22 = false;
        if (!Intrinsics.d(alkVar, zkk.a)) {
            if (Intrinsics.d(alkVar, ykkVar)) {
            }
        }
        return Boolean.valueOf(z22);
    }

    @Override // androidx.fragment.app.t, defpackage.hn5, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 9) {
            iz7 iz7Var = this.d;
            if (i2 == -1) {
                if (iz7Var != null) {
                    iz7Var.p(true);
                }
            } else if (iz7Var != null) {
                iz7Var.p(false);
            }
        }
    }

    @Override // defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ixc ixcVar;
        rxc rxcVar;
        ou0.a.getClass();
        setTheme(yu0.a[klx.Z(this).ordinal()] == 1 ? R.style.AppTheme_Transparent_EdgeToEdge : R.style.AppTheme_Transparent_Dark_EdgeToEdge);
        hag.k(this);
        super.onCreate(bundle);
        if (bundle == null || (ixcVar = (ixc) bundle.getParcelable("extra.info")) == null) {
            ixcVar = (ixc) getIntent().getParcelableExtra("extra.info");
        }
        if (ixcVar == null) {
            Assertions.fail("No info to show");
            finish();
            return;
        }
        this.c = ixcVar;
        if (asq.H(this)) {
            Window window = getWindow();
            window.getClass();
            hoe.b(window);
        } else {
            q5g.I(getWindow(), false);
        }
        String str = ixcVar.i;
        if (str == null || str.length() == 0) {
            View inflate = LayoutInflater.from(this).inflate(R.layout.full_info_activity, (ViewGroup) null, false);
            setContentView(inflate);
            inflate.getClass();
            rxcVar = new rxc(this, inflate);
        } else {
            View inflate2 = LayoutInflater.from(this).inflate(R.layout.full_info_activity_extended_info, (ViewGroup) null, false);
            setContentView(inflate2);
            inflate2.getClass();
            rxcVar = new m0c(this, inflate2);
        }
        this.e = rxcVar;
        iz7 iz7Var = new iz7();
        iz7Var.a = this;
        bdt I = hag.I(frt.class);
        l18 l18Var = l18.b;
        iz7Var.e = l18Var.b(I, true);
        iz7Var.f = l18Var.b(hag.I(z66.class), true);
        int i = UploadCoverService.f;
        iz7Var.g = new g06(this, new Intent(this, (Class<?>) UploadCoverService.class));
        iz7Var.h = new lxc(iz7Var);
        iz7Var.l = (File) (bundle != null ? bundle.getSerializable("take.picture.file.uri") : null);
        this.d = iz7Var;
        iz7Var.d = ixcVar;
        rxc rxcVar2 = (rxc) iz7Var.c;
        if (rxcVar2 != null) {
            rxcVar2.b(ixcVar);
        }
        setSupportActionBar(rxcVar.e());
        if (getIntent().getBooleanExtra("extra.has_shared_element_transition", false)) {
            supportPostponeEnterTransition();
        }
    }

    @Override // defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.d = null;
    }

    @Override // androidx.fragment.app.t, android.app.Activity
    public final void onPause() {
        super.onPause();
        iz7 iz7Var = this.d;
        if (iz7Var != null) {
            rxc rxcVar = (rxc) iz7Var.c;
            if (rxcVar != null) {
                rxcVar.h = null;
            }
            iz7Var.c = null;
        }
        if (iz7Var != null) {
            iz7Var.b = null;
        }
    }

    @Override // androidx.fragment.app.t, android.app.Activity
    public final void onResume() {
        super.onResume();
        iz7 iz7Var = this.d;
        if (iz7Var != null) {
            iz7Var.b = new n7b(this);
        }
        rxc rxcVar = this.e;
        if (rxcVar == null || iz7Var == null) {
            return;
        }
        iz7Var.c = rxcVar;
        rxcVar.h = new h4b(iz7Var);
        ixc ixcVar = (ixc) iz7Var.d;
        if (ixcVar == null) {
            Intrinsics.j("data");
            throw null;
        }
        rxcVar.b(ixcVar);
        g06 g06Var = (g06) iz7Var.g;
        kxc kxcVar = new kxc(iz7Var, 1);
        Object obj = g06Var.d;
        if (obj != null) {
            kxcVar.invoke(obj);
        }
    }

    @Override // defpackage.gnb, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("extra.info", this.c);
        iz7 iz7Var = this.d;
        if (iz7Var != null) {
            bundle.putSerializable("take.picture.file.uri", (File) iz7Var.l);
        }
    }

    @Override // defpackage.gnb, defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onStart() {
        super.onStart();
        iz7 iz7Var = this.d;
        int i = 1;
        if (iz7Var != null) {
            ixc ixcVar = (ixc) iz7Var.d;
            Continuation continuation = null;
            if (ixcVar == null) {
                Intrinsics.j("data");
                throw null;
            }
            String str = ixcVar.a;
            boolean d = Intrinsics.d(str, ((frt) ((jyr) iz7Var.e).getValue()).c().a);
            int i2 = 2;
            cmd cmdVar = cmd.a;
            if (d) {
                ixc ixcVar2 = (ixc) iz7Var.d;
                if (ixcVar2 == null) {
                    Intrinsics.j("data");
                    throw null;
                }
                String str2 = ixcVar2.b;
                str2.getClass();
                if (str2.length() != 0 && !c.v(str2, "FAKE_ID_", false)) {
                    g06 g06Var = (g06) iz7Var.g;
                    kxc kxcVar = new kxc(iz7Var, i2);
                    htb htbVar = new htb(14);
                    g06Var.getClass();
                    zu1 zu1Var = new zu1(g06Var, kxcVar, htbVar);
                    g06Var.c = zu1Var;
                    ((FullInfoActivity) g06Var.a).bindService((Intent) g06Var.b, zu1Var, 1);
                    iz7Var.j = x97.y(cmdVar, dm6.b(), null, new g68(iz7Var, continuation, 22), 2);
                }
            }
            if (str != null) {
                dq7 dq7Var = ca8.a;
                iz7Var.i = x97.y(cmdVar, j5h.a, null, new fzb(str, iz7Var, continuation, 13), 2);
            }
        }
        this.f = registerForActivityResult(new vh(i), new gi(5, this));
    }

    @Override // defpackage.gnb, defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onStop() {
        super.onStop();
        iz7 iz7Var = this.d;
        if (iz7Var != null) {
            g06 g06Var = (g06) iz7Var.g;
            if (((zu1) g06Var.c) != null) {
                kxc kxcVar = new kxc(iz7Var, 0);
                Object obj = g06Var.d;
                if (obj != null) {
                    kxcVar.invoke(obj);
                }
                g06Var.d = null;
                try {
                    ((FullInfoActivity) g06Var.a).unbindService((ServiceConnection) Preconditions.nonNull((zu1) g06Var.c, "Called disconnect() without prior connect()."));
                } catch (IllegalArgumentException e) {
                    su4.s(2, null, f1d.g("unbind service error ", e.getLocalizedMessage()), null);
                }
                g06Var.c = null;
            }
            rar rarVar = (rar) iz7Var.j;
            if (rarVar != null) {
                rarVar.g(null);
            }
            iz7Var.j = null;
            rar rarVar2 = (rar) iz7Var.i;
            if (rarVar2 != null) {
                rarVar2.g(null);
            }
            iz7Var.i = null;
            rar rarVar3 = (rar) iz7Var.k;
            if (rarVar3 != null) {
                rarVar3.g(null);
            }
            iz7Var.k = null;
        }
    }

    @Override // defpackage.hq0
    public final boolean onSupportNavigateUp() {
        supportFinishAfterTransition();
        return true;
    }
}
