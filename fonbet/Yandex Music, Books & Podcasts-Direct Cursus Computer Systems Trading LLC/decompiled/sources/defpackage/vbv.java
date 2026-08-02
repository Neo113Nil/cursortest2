package defpackage;

import android.content.Context;
import android.os.Build;
import com.yandex.messenger.websdk.api.MessengerAnalyticsFactory;
import com.yandex.messenger.websdk.api.MessengerParams;
import com.yandex.messenger.websdk.api.NotificationClickIntentFactory;
import com.yandex.messenger.websdk.api.SupportInfoProvider;
import com.yandex.messenger.websdk.api.WebChromeClientConfig;
import com.yandex.messenger.websdk.api.WebMessengerNavigationInterceptor;
import kotlin.jvm.functions.Function0;
import okhttp3.OkHttpClient;

/* loaded from: classes3.dex */
public final class vbv {
    public final q0v A;
    public final jyr B;
    public final jyr C;
    public final jyr D;
    public final Context a;
    public final MessengerAnalyticsFactory b;
    public final SupportInfoProvider c;
    public final NotificationClickIntentFactory d;
    public final WebChromeClientConfig e;
    public final WebMessengerNavigationInterceptor f;
    public volatile MessengerParams g;
    public final jyr h;
    public final jyr j;
    public final jyr k;
    public final jyr m;
    public final jyr o;
    public final jyr q;
    public final jyr u;
    public final jyr v;
    public final jyr w;
    public final jyr x;
    public final jyr y;
    public final jyr z;
    public final jyr i = btf.b(new h8v(9, this));
    public final tot l = new tot(3, this);
    public final jyr n = btf.b(new h8v(10));
    public final jyr p = btf.b(new h8v(11));
    public final qdc r = new qdc(this);
    public final cr s = new cr(26);
    public final cr t = new cr(this);

    public vbv(Context context, MessengerParams messengerParams, MessengerAnalyticsFactory messengerAnalyticsFactory, SupportInfoProvider supportInfoProvider, cuk cukVar, WebChromeClientConfig webChromeClientConfig, WebMessengerNavigationInterceptor webMessengerNavigationInterceptor) {
        this.a = context;
        this.b = messengerAnalyticsFactory;
        this.c = supportInfoProvider;
        this.d = cukVar;
        this.e = webChromeClientConfig;
        this.f = webMessengerNavigationInterceptor;
        this.g = messengerParams;
        final int i = 0;
        this.h = btf.b(new Function0(this) { // from class: ubv
            public final /* synthetic */ vbv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new v4n(this.b);
                    case 1:
                        vbv vbvVar = this.b;
                        qdc qdcVar = vbvVar.r;
                        int i2 = Build.VERSION.SDK_INT;
                        Context context2 = vbvVar.a;
                        return i2 < 31 ? new m0j(context2, qdcVar) : new n0j(context2, qdcVar);
                    case 2:
                        return new l0o(this.b);
                    case 3:
                        vbv vbvVar2 = this.b;
                        MessengerParams messengerParams2 = vbvVar2.g;
                        joj jojVar = new joj();
                        if (messengerParams2.d) {
                            jbw v = ixf.v(vbvVar2.a);
                            jojVar.f(ixf.u(v), v);
                        }
                        jojVar.c.add(new aar(vbvVar2.r, messengerParams2.d));
                        return new OkHttpClient(jojVar);
                    case 4:
                        return new h02(this.b);
                    case 5:
                        return new hfj(this.b);
                    case 6:
                        return this.b.a.getSharedPreferences("MessengerWebSdk", 0);
                    case 7:
                        vbv vbvVar3 = this.b;
                        ofc ofcVar = new ofc(26);
                        return ofcVar;
                    case 8:
                        return new vae(this.b);
                    case 9:
                        vbv vbvVar4 = this.b;
                        lh4 lh4Var = new lh4();
                        return lh4Var;
                    case 10:
                        return new kh4(this.b);
                    case 11:
                        return new k0i(this.b);
                    case 12:
                        return new hu1(this.b);
                    case 13:
                        return new kue(this.b);
                    default:
                        return new pgv(this.b);
                }
            }
        });
        final int i2 = 3;
        this.j = btf.b(new Function0(this) { // from class: ubv
            public final /* synthetic */ vbv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new v4n(this.b);
                    case 1:
                        vbv vbvVar = this.b;
                        qdc qdcVar = vbvVar.r;
                        int i22 = Build.VERSION.SDK_INT;
                        Context context2 = vbvVar.a;
                        return i22 < 31 ? new m0j(context2, qdcVar) : new n0j(context2, qdcVar);
                    case 2:
                        return new l0o(this.b);
                    case 3:
                        vbv vbvVar2 = this.b;
                        MessengerParams messengerParams2 = vbvVar2.g;
                        joj jojVar = new joj();
                        if (messengerParams2.d) {
                            jbw v = ixf.v(vbvVar2.a);
                            jojVar.f(ixf.u(v), v);
                        }
                        jojVar.c.add(new aar(vbvVar2.r, messengerParams2.d));
                        return new OkHttpClient(jojVar);
                    case 4:
                        return new h02(this.b);
                    case 5:
                        return new hfj(this.b);
                    case 6:
                        return this.b.a.getSharedPreferences("MessengerWebSdk", 0);
                    case 7:
                        vbv vbvVar3 = this.b;
                        ofc ofcVar = new ofc(26);
                        return ofcVar;
                    case 8:
                        return new vae(this.b);
                    case 9:
                        vbv vbvVar4 = this.b;
                        lh4 lh4Var = new lh4();
                        return lh4Var;
                    case 10:
                        return new kh4(this.b);
                    case 11:
                        return new k0i(this.b);
                    case 12:
                        return new hu1(this.b);
                    case 13:
                        return new kue(this.b);
                    default:
                        return new pgv(this.b);
                }
            }
        });
        final int i3 = 4;
        this.k = btf.b(new Function0(this) { // from class: ubv
            public final /* synthetic */ vbv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return new v4n(this.b);
                    case 1:
                        vbv vbvVar = this.b;
                        qdc qdcVar = vbvVar.r;
                        int i22 = Build.VERSION.SDK_INT;
                        Context context2 = vbvVar.a;
                        return i22 < 31 ? new m0j(context2, qdcVar) : new n0j(context2, qdcVar);
                    case 2:
                        return new l0o(this.b);
                    case 3:
                        vbv vbvVar2 = this.b;
                        MessengerParams messengerParams2 = vbvVar2.g;
                        joj jojVar = new joj();
                        if (messengerParams2.d) {
                            jbw v = ixf.v(vbvVar2.a);
                            jojVar.f(ixf.u(v), v);
                        }
                        jojVar.c.add(new aar(vbvVar2.r, messengerParams2.d));
                        return new OkHttpClient(jojVar);
                    case 4:
                        return new h02(this.b);
                    case 5:
                        return new hfj(this.b);
                    case 6:
                        return this.b.a.getSharedPreferences("MessengerWebSdk", 0);
                    case 7:
                        vbv vbvVar3 = this.b;
                        ofc ofcVar = new ofc(26);
                        return ofcVar;
                    case 8:
                        return new vae(this.b);
                    case 9:
                        vbv vbvVar4 = this.b;
                        lh4 lh4Var = new lh4();
                        return lh4Var;
                    case 10:
                        return new kh4(this.b);
                    case 11:
                        return new k0i(this.b);
                    case 12:
                        return new hu1(this.b);
                    case 13:
                        return new kue(this.b);
                    default:
                        return new pgv(this.b);
                }
            }
        });
        final int i4 = 5;
        this.m = btf.b(new Function0(this) { // from class: ubv
            public final /* synthetic */ vbv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return new v4n(this.b);
                    case 1:
                        vbv vbvVar = this.b;
                        qdc qdcVar = vbvVar.r;
                        int i22 = Build.VERSION.SDK_INT;
                        Context context2 = vbvVar.a;
                        return i22 < 31 ? new m0j(context2, qdcVar) : new n0j(context2, qdcVar);
                    case 2:
                        return new l0o(this.b);
                    case 3:
                        vbv vbvVar2 = this.b;
                        MessengerParams messengerParams2 = vbvVar2.g;
                        joj jojVar = new joj();
                        if (messengerParams2.d) {
                            jbw v = ixf.v(vbvVar2.a);
                            jojVar.f(ixf.u(v), v);
                        }
                        jojVar.c.add(new aar(vbvVar2.r, messengerParams2.d));
                        return new OkHttpClient(jojVar);
                    case 4:
                        return new h02(this.b);
                    case 5:
                        return new hfj(this.b);
                    case 6:
                        return this.b.a.getSharedPreferences("MessengerWebSdk", 0);
                    case 7:
                        vbv vbvVar3 = this.b;
                        ofc ofcVar = new ofc(26);
                        return ofcVar;
                    case 8:
                        return new vae(this.b);
                    case 9:
                        vbv vbvVar4 = this.b;
                        lh4 lh4Var = new lh4();
                        return lh4Var;
                    case 10:
                        return new kh4(this.b);
                    case 11:
                        return new k0i(this.b);
                    case 12:
                        return new hu1(this.b);
                    case 13:
                        return new kue(this.b);
                    default:
                        return new pgv(this.b);
                }
            }
        });
        final int i5 = 6;
        this.o = btf.b(new Function0(this) { // from class: ubv
            public final /* synthetic */ vbv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return new v4n(this.b);
                    case 1:
                        vbv vbvVar = this.b;
                        qdc qdcVar = vbvVar.r;
                        int i22 = Build.VERSION.SDK_INT;
                        Context context2 = vbvVar.a;
                        return i22 < 31 ? new m0j(context2, qdcVar) : new n0j(context2, qdcVar);
                    case 2:
                        return new l0o(this.b);
                    case 3:
                        vbv vbvVar2 = this.b;
                        MessengerParams messengerParams2 = vbvVar2.g;
                        joj jojVar = new joj();
                        if (messengerParams2.d) {
                            jbw v = ixf.v(vbvVar2.a);
                            jojVar.f(ixf.u(v), v);
                        }
                        jojVar.c.add(new aar(vbvVar2.r, messengerParams2.d));
                        return new OkHttpClient(jojVar);
                    case 4:
                        return new h02(this.b);
                    case 5:
                        return new hfj(this.b);
                    case 6:
                        return this.b.a.getSharedPreferences("MessengerWebSdk", 0);
                    case 7:
                        vbv vbvVar3 = this.b;
                        ofc ofcVar = new ofc(26);
                        return ofcVar;
                    case 8:
                        return new vae(this.b);
                    case 9:
                        vbv vbvVar4 = this.b;
                        lh4 lh4Var = new lh4();
                        return lh4Var;
                    case 10:
                        return new kh4(this.b);
                    case 11:
                        return new k0i(this.b);
                    case 12:
                        return new hu1(this.b);
                    case 13:
                        return new kue(this.b);
                    default:
                        return new pgv(this.b);
                }
            }
        });
        final int i6 = 8;
        this.q = btf.b(new Function0(this) { // from class: ubv
            public final /* synthetic */ vbv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return new v4n(this.b);
                    case 1:
                        vbv vbvVar = this.b;
                        qdc qdcVar = vbvVar.r;
                        int i22 = Build.VERSION.SDK_INT;
                        Context context2 = vbvVar.a;
                        return i22 < 31 ? new m0j(context2, qdcVar) : new n0j(context2, qdcVar);
                    case 2:
                        return new l0o(this.b);
                    case 3:
                        vbv vbvVar2 = this.b;
                        MessengerParams messengerParams2 = vbvVar2.g;
                        joj jojVar = new joj();
                        if (messengerParams2.d) {
                            jbw v = ixf.v(vbvVar2.a);
                            jojVar.f(ixf.u(v), v);
                        }
                        jojVar.c.add(new aar(vbvVar2.r, messengerParams2.d));
                        return new OkHttpClient(jojVar);
                    case 4:
                        return new h02(this.b);
                    case 5:
                        return new hfj(this.b);
                    case 6:
                        return this.b.a.getSharedPreferences("MessengerWebSdk", 0);
                    case 7:
                        vbv vbvVar3 = this.b;
                        ofc ofcVar = new ofc(26);
                        return ofcVar;
                    case 8:
                        return new vae(this.b);
                    case 9:
                        vbv vbvVar4 = this.b;
                        lh4 lh4Var = new lh4();
                        return lh4Var;
                    case 10:
                        return new kh4(this.b);
                    case 11:
                        return new k0i(this.b);
                    case 12:
                        return new hu1(this.b);
                    case 13:
                        return new kue(this.b);
                    default:
                        return new pgv(this.b);
                }
            }
        });
        final int i7 = 7;
        btf.b(new Function0(this) { // from class: ubv
            public final /* synthetic */ vbv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return new v4n(this.b);
                    case 1:
                        vbv vbvVar = this.b;
                        qdc qdcVar = vbvVar.r;
                        int i22 = Build.VERSION.SDK_INT;
                        Context context2 = vbvVar.a;
                        return i22 < 31 ? new m0j(context2, qdcVar) : new n0j(context2, qdcVar);
                    case 2:
                        return new l0o(this.b);
                    case 3:
                        vbv vbvVar2 = this.b;
                        MessengerParams messengerParams2 = vbvVar2.g;
                        joj jojVar = new joj();
                        if (messengerParams2.d) {
                            jbw v = ixf.v(vbvVar2.a);
                            jojVar.f(ixf.u(v), v);
                        }
                        jojVar.c.add(new aar(vbvVar2.r, messengerParams2.d));
                        return new OkHttpClient(jojVar);
                    case 4:
                        return new h02(this.b);
                    case 5:
                        return new hfj(this.b);
                    case 6:
                        return this.b.a.getSharedPreferences("MessengerWebSdk", 0);
                    case 7:
                        vbv vbvVar3 = this.b;
                        ofc ofcVar = new ofc(26);
                        return ofcVar;
                    case 8:
                        return new vae(this.b);
                    case 9:
                        vbv vbvVar4 = this.b;
                        lh4 lh4Var = new lh4();
                        return lh4Var;
                    case 10:
                        return new kh4(this.b);
                    case 11:
                        return new k0i(this.b);
                    case 12:
                        return new hu1(this.b);
                    case 13:
                        return new kue(this.b);
                    default:
                        return new pgv(this.b);
                }
            }
        });
        this.u = btf.b(new h8v(12));
        final int i8 = 9;
        this.v = btf.b(new Function0(this) { // from class: ubv
            public final /* synthetic */ vbv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        return new v4n(this.b);
                    case 1:
                        vbv vbvVar = this.b;
                        qdc qdcVar = vbvVar.r;
                        int i22 = Build.VERSION.SDK_INT;
                        Context context2 = vbvVar.a;
                        return i22 < 31 ? new m0j(context2, qdcVar) : new n0j(context2, qdcVar);
                    case 2:
                        return new l0o(this.b);
                    case 3:
                        vbv vbvVar2 = this.b;
                        MessengerParams messengerParams2 = vbvVar2.g;
                        joj jojVar = new joj();
                        if (messengerParams2.d) {
                            jbw v = ixf.v(vbvVar2.a);
                            jojVar.f(ixf.u(v), v);
                        }
                        jojVar.c.add(new aar(vbvVar2.r, messengerParams2.d));
                        return new OkHttpClient(jojVar);
                    case 4:
                        return new h02(this.b);
                    case 5:
                        return new hfj(this.b);
                    case 6:
                        return this.b.a.getSharedPreferences("MessengerWebSdk", 0);
                    case 7:
                        vbv vbvVar3 = this.b;
                        ofc ofcVar = new ofc(26);
                        return ofcVar;
                    case 8:
                        return new vae(this.b);
                    case 9:
                        vbv vbvVar4 = this.b;
                        lh4 lh4Var = new lh4();
                        return lh4Var;
                    case 10:
                        return new kh4(this.b);
                    case 11:
                        return new k0i(this.b);
                    case 12:
                        return new hu1(this.b);
                    case 13:
                        return new kue(this.b);
                    default:
                        return new pgv(this.b);
                }
            }
        });
        final int i9 = 10;
        this.w = btf.b(new Function0(this) { // from class: ubv
            public final /* synthetic */ vbv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        return new v4n(this.b);
                    case 1:
                        vbv vbvVar = this.b;
                        qdc qdcVar = vbvVar.r;
                        int i22 = Build.VERSION.SDK_INT;
                        Context context2 = vbvVar.a;
                        return i22 < 31 ? new m0j(context2, qdcVar) : new n0j(context2, qdcVar);
                    case 2:
                        return new l0o(this.b);
                    case 3:
                        vbv vbvVar2 = this.b;
                        MessengerParams messengerParams2 = vbvVar2.g;
                        joj jojVar = new joj();
                        if (messengerParams2.d) {
                            jbw v = ixf.v(vbvVar2.a);
                            jojVar.f(ixf.u(v), v);
                        }
                        jojVar.c.add(new aar(vbvVar2.r, messengerParams2.d));
                        return new OkHttpClient(jojVar);
                    case 4:
                        return new h02(this.b);
                    case 5:
                        return new hfj(this.b);
                    case 6:
                        return this.b.a.getSharedPreferences("MessengerWebSdk", 0);
                    case 7:
                        vbv vbvVar3 = this.b;
                        ofc ofcVar = new ofc(26);
                        return ofcVar;
                    case 8:
                        return new vae(this.b);
                    case 9:
                        vbv vbvVar4 = this.b;
                        lh4 lh4Var = new lh4();
                        return lh4Var;
                    case 10:
                        return new kh4(this.b);
                    case 11:
                        return new k0i(this.b);
                    case 12:
                        return new hu1(this.b);
                    case 13:
                        return new kue(this.b);
                    default:
                        return new pgv(this.b);
                }
            }
        });
        final int i10 = 11;
        this.x = btf.b(new Function0(this) { // from class: ubv
            public final /* synthetic */ vbv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return new v4n(this.b);
                    case 1:
                        vbv vbvVar = this.b;
                        qdc qdcVar = vbvVar.r;
                        int i22 = Build.VERSION.SDK_INT;
                        Context context2 = vbvVar.a;
                        return i22 < 31 ? new m0j(context2, qdcVar) : new n0j(context2, qdcVar);
                    case 2:
                        return new l0o(this.b);
                    case 3:
                        vbv vbvVar2 = this.b;
                        MessengerParams messengerParams2 = vbvVar2.g;
                        joj jojVar = new joj();
                        if (messengerParams2.d) {
                            jbw v = ixf.v(vbvVar2.a);
                            jojVar.f(ixf.u(v), v);
                        }
                        jojVar.c.add(new aar(vbvVar2.r, messengerParams2.d));
                        return new OkHttpClient(jojVar);
                    case 4:
                        return new h02(this.b);
                    case 5:
                        return new hfj(this.b);
                    case 6:
                        return this.b.a.getSharedPreferences("MessengerWebSdk", 0);
                    case 7:
                        vbv vbvVar3 = this.b;
                        ofc ofcVar = new ofc(26);
                        return ofcVar;
                    case 8:
                        return new vae(this.b);
                    case 9:
                        vbv vbvVar4 = this.b;
                        lh4 lh4Var = new lh4();
                        return lh4Var;
                    case 10:
                        return new kh4(this.b);
                    case 11:
                        return new k0i(this.b);
                    case 12:
                        return new hu1(this.b);
                    case 13:
                        return new kue(this.b);
                    default:
                        return new pgv(this.b);
                }
            }
        });
        final int i11 = 12;
        this.y = btf.b(new Function0(this) { // from class: ubv
            public final /* synthetic */ vbv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return new v4n(this.b);
                    case 1:
                        vbv vbvVar = this.b;
                        qdc qdcVar = vbvVar.r;
                        int i22 = Build.VERSION.SDK_INT;
                        Context context2 = vbvVar.a;
                        return i22 < 31 ? new m0j(context2, qdcVar) : new n0j(context2, qdcVar);
                    case 2:
                        return new l0o(this.b);
                    case 3:
                        vbv vbvVar2 = this.b;
                        MessengerParams messengerParams2 = vbvVar2.g;
                        joj jojVar = new joj();
                        if (messengerParams2.d) {
                            jbw v = ixf.v(vbvVar2.a);
                            jojVar.f(ixf.u(v), v);
                        }
                        jojVar.c.add(new aar(vbvVar2.r, messengerParams2.d));
                        return new OkHttpClient(jojVar);
                    case 4:
                        return new h02(this.b);
                    case 5:
                        return new hfj(this.b);
                    case 6:
                        return this.b.a.getSharedPreferences("MessengerWebSdk", 0);
                    case 7:
                        vbv vbvVar3 = this.b;
                        ofc ofcVar = new ofc(26);
                        return ofcVar;
                    case 8:
                        return new vae(this.b);
                    case 9:
                        vbv vbvVar4 = this.b;
                        lh4 lh4Var = new lh4();
                        return lh4Var;
                    case 10:
                        return new kh4(this.b);
                    case 11:
                        return new k0i(this.b);
                    case 12:
                        return new hu1(this.b);
                    case 13:
                        return new kue(this.b);
                    default:
                        return new pgv(this.b);
                }
            }
        });
        final int i12 = 13;
        this.z = btf.b(new Function0(this) { // from class: ubv
            public final /* synthetic */ vbv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return new v4n(this.b);
                    case 1:
                        vbv vbvVar = this.b;
                        qdc qdcVar = vbvVar.r;
                        int i22 = Build.VERSION.SDK_INT;
                        Context context2 = vbvVar.a;
                        return i22 < 31 ? new m0j(context2, qdcVar) : new n0j(context2, qdcVar);
                    case 2:
                        return new l0o(this.b);
                    case 3:
                        vbv vbvVar2 = this.b;
                        MessengerParams messengerParams2 = vbvVar2.g;
                        joj jojVar = new joj();
                        if (messengerParams2.d) {
                            jbw v = ixf.v(vbvVar2.a);
                            jojVar.f(ixf.u(v), v);
                        }
                        jojVar.c.add(new aar(vbvVar2.r, messengerParams2.d));
                        return new OkHttpClient(jojVar);
                    case 4:
                        return new h02(this.b);
                    case 5:
                        return new hfj(this.b);
                    case 6:
                        return this.b.a.getSharedPreferences("MessengerWebSdk", 0);
                    case 7:
                        vbv vbvVar3 = this.b;
                        ofc ofcVar = new ofc(26);
                        return ofcVar;
                    case 8:
                        return new vae(this.b);
                    case 9:
                        vbv vbvVar4 = this.b;
                        lh4 lh4Var = new lh4();
                        return lh4Var;
                    case 10:
                        return new kh4(this.b);
                    case 11:
                        return new k0i(this.b);
                    case 12:
                        return new hu1(this.b);
                    case 13:
                        return new kue(this.b);
                    default:
                        return new pgv(this.b);
                }
            }
        });
        this.A = new q0v(4, this);
        final int i13 = 14;
        this.B = btf.b(new Function0(this) { // from class: ubv
            public final /* synthetic */ vbv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return new v4n(this.b);
                    case 1:
                        vbv vbvVar = this.b;
                        qdc qdcVar = vbvVar.r;
                        int i22 = Build.VERSION.SDK_INT;
                        Context context2 = vbvVar.a;
                        return i22 < 31 ? new m0j(context2, qdcVar) : new n0j(context2, qdcVar);
                    case 2:
                        return new l0o(this.b);
                    case 3:
                        vbv vbvVar2 = this.b;
                        MessengerParams messengerParams2 = vbvVar2.g;
                        joj jojVar = new joj();
                        if (messengerParams2.d) {
                            jbw v = ixf.v(vbvVar2.a);
                            jojVar.f(ixf.u(v), v);
                        }
                        jojVar.c.add(new aar(vbvVar2.r, messengerParams2.d));
                        return new OkHttpClient(jojVar);
                    case 4:
                        return new h02(this.b);
                    case 5:
                        return new hfj(this.b);
                    case 6:
                        return this.b.a.getSharedPreferences("MessengerWebSdk", 0);
                    case 7:
                        vbv vbvVar3 = this.b;
                        ofc ofcVar = new ofc(26);
                        return ofcVar;
                    case 8:
                        return new vae(this.b);
                    case 9:
                        vbv vbvVar4 = this.b;
                        lh4 lh4Var = new lh4();
                        return lh4Var;
                    case 10:
                        return new kh4(this.b);
                    case 11:
                        return new k0i(this.b);
                    case 12:
                        return new hu1(this.b);
                    case 13:
                        return new kue(this.b);
                    default:
                        return new pgv(this.b);
                }
            }
        });
        final int i14 = 1;
        this.C = btf.b(new Function0(this) { // from class: ubv
            public final /* synthetic */ vbv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return new v4n(this.b);
                    case 1:
                        vbv vbvVar = this.b;
                        qdc qdcVar = vbvVar.r;
                        int i22 = Build.VERSION.SDK_INT;
                        Context context2 = vbvVar.a;
                        return i22 < 31 ? new m0j(context2, qdcVar) : new n0j(context2, qdcVar);
                    case 2:
                        return new l0o(this.b);
                    case 3:
                        vbv vbvVar2 = this.b;
                        MessengerParams messengerParams2 = vbvVar2.g;
                        joj jojVar = new joj();
                        if (messengerParams2.d) {
                            jbw v = ixf.v(vbvVar2.a);
                            jojVar.f(ixf.u(v), v);
                        }
                        jojVar.c.add(new aar(vbvVar2.r, messengerParams2.d));
                        return new OkHttpClient(jojVar);
                    case 4:
                        return new h02(this.b);
                    case 5:
                        return new hfj(this.b);
                    case 6:
                        return this.b.a.getSharedPreferences("MessengerWebSdk", 0);
                    case 7:
                        vbv vbvVar3 = this.b;
                        ofc ofcVar = new ofc(26);
                        return ofcVar;
                    case 8:
                        return new vae(this.b);
                    case 9:
                        vbv vbvVar4 = this.b;
                        lh4 lh4Var = new lh4();
                        return lh4Var;
                    case 10:
                        return new kh4(this.b);
                    case 11:
                        return new k0i(this.b);
                    case 12:
                        return new hu1(this.b);
                    case 13:
                        return new kue(this.b);
                    default:
                        return new pgv(this.b);
                }
            }
        });
        final int i15 = 2;
        this.D = btf.b(new Function0(this) { // from class: ubv
            public final /* synthetic */ vbv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return new v4n(this.b);
                    case 1:
                        vbv vbvVar = this.b;
                        qdc qdcVar = vbvVar.r;
                        int i22 = Build.VERSION.SDK_INT;
                        Context context2 = vbvVar.a;
                        return i22 < 31 ? new m0j(context2, qdcVar) : new n0j(context2, qdcVar);
                    case 2:
                        return new l0o(this.b);
                    case 3:
                        vbv vbvVar2 = this.b;
                        MessengerParams messengerParams2 = vbvVar2.g;
                        joj jojVar = new joj();
                        if (messengerParams2.d) {
                            jbw v = ixf.v(vbvVar2.a);
                            jojVar.f(ixf.u(v), v);
                        }
                        jojVar.c.add(new aar(vbvVar2.r, messengerParams2.d));
                        return new OkHttpClient(jojVar);
                    case 4:
                        return new h02(this.b);
                    case 5:
                        return new hfj(this.b);
                    case 6:
                        return this.b.a.getSharedPreferences("MessengerWebSdk", 0);
                    case 7:
                        vbv vbvVar3 = this.b;
                        ofc ofcVar = new ofc(26);
                        return ofcVar;
                    case 8:
                        return new vae(this.b);
                    case 9:
                        vbv vbvVar4 = this.b;
                        lh4 lh4Var = new lh4();
                        return lh4Var;
                    case 10:
                        return new kh4(this.b);
                    case 11:
                        return new k0i(this.b);
                    case 12:
                        return new hu1(this.b);
                    case 13:
                        return new kue(this.b);
                    default:
                        return new pgv(this.b);
                }
            }
        });
    }
}
