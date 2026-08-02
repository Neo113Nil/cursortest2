package defpackage;

import android.content.Context;
import android.os.Build;
import com.yandex.messenger.websdk.api.MessengerAnalyticsFactory;
import com.yandex.messenger.websdk.api.MessengerParams;
import com.yandex.messenger.websdk.api.NotificationClickIntentFactory;
import com.yandex.messenger.websdk.api.NotificationDecorator;
import com.yandex.messenger.websdk.api.WebChromeClientConfig;
import com.yandex.messenger.websdk.api.WebMessengerNavigationInterceptor;
import kotlin.a;

/* loaded from: classes8.dex */
public final class qh41 {
    public final i3y A;
    public final ph41 B;
    public final i3y C;
    public final i3y D;
    public final i3y E;
    public final Context a;
    public final MessengerAnalyticsFactory b;
    public final NotificationClickIntentFactory c;
    public final NotificationDecorator d;
    public final WebChromeClientConfig e;
    public final WebMessengerNavigationInterceptor f;
    public volatile MessengerParams g;
    public final i3y h;
    public final i3y k;
    public final t6f0 l;
    public final i3y m;
    public final i3y o;
    public final i3y q;
    public final ew2 r;
    public final dm3 s;
    public final bo41 t;
    public final yx1 u;
    public final i3y v;
    public final i3y w;
    public final i3y x;
    public final i3y y;
    public final i3y z;
    public final i3y i = a.a(new gs21(this, 22));
    public final i3y j = a.a(new gs21(this, 23));
    public final i3y n = a.a(new gs21(24));
    public final i3y p = a.a(new gs21(25));

    public qh41(Context context, MessengerParams messengerParams, MessengerAnalyticsFactory messengerAnalyticsFactory, NotificationClickIntentFactory notificationClickIntentFactory, NotificationDecorator notificationDecorator, WebChromeClientConfig webChromeClientConfig, WebMessengerNavigationInterceptor webMessengerNavigationInterceptor) {
        this.a = context;
        this.b = messengerAnalyticsFactory;
        this.c = notificationClickIntentFactory;
        this.d = notificationDecorator;
        this.e = webChromeClientConfig;
        this.f = webMessengerNavigationInterceptor;
        this.g = messengerParams;
        final int i = 0;
        this.h = a.a(new sls(this) { // from class: oh41
            public final /* synthetic */ qh41 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                qh41 qh41Var = this.b;
                switch (i2) {
                    case 0:
                        return new e5g0(qh41Var);
                    case 1:
                        return new r5j0(qh41Var);
                    case 2:
                        return new jm3(qh41Var);
                    case 3:
                        return new vh60(qh41Var);
                    case 4:
                        return qh41Var.a.getSharedPreferences(qh41Var.g.e.d(), 0);
                    case 5:
                        return new o6v(qh41Var);
                    case 6:
                        return new f1b(qh41Var);
                    case 7:
                        return new d1b(qh41Var);
                    case 8:
                        return new a820(qh41Var);
                    case 9:
                        return new gc3(qh41Var);
                    case 10:
                        return new krw(qh41Var);
                    case 11:
                        return new aw41(qh41Var);
                    default:
                        ew2 ew2Var = qh41Var.r;
                        int i3 = Build.VERSION.SDK_INT;
                        Context context2 = qh41Var.a;
                        return i3 < 31 ? new tw50(context2, ew2Var) : new vw50(context2, ew2Var);
                }
            }
        });
        final int i2 = 2;
        this.k = a.a(new sls(this) { // from class: oh41
            public final /* synthetic */ qh41 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                qh41 qh41Var = this.b;
                switch (i22) {
                    case 0:
                        return new e5g0(qh41Var);
                    case 1:
                        return new r5j0(qh41Var);
                    case 2:
                        return new jm3(qh41Var);
                    case 3:
                        return new vh60(qh41Var);
                    case 4:
                        return qh41Var.a.getSharedPreferences(qh41Var.g.e.d(), 0);
                    case 5:
                        return new o6v(qh41Var);
                    case 6:
                        return new f1b(qh41Var);
                    case 7:
                        return new d1b(qh41Var);
                    case 8:
                        return new a820(qh41Var);
                    case 9:
                        return new gc3(qh41Var);
                    case 10:
                        return new krw(qh41Var);
                    case 11:
                        return new aw41(qh41Var);
                    default:
                        ew2 ew2Var = qh41Var.r;
                        int i3 = Build.VERSION.SDK_INT;
                        Context context2 = qh41Var.a;
                        return i3 < 31 ? new tw50(context2, ew2Var) : new vw50(context2, ew2Var);
                }
            }
        });
        final int i3 = 12;
        this.l = new t6f0(i3, this);
        final int i4 = 3;
        this.m = a.a(new sls(this) { // from class: oh41
            public final /* synthetic */ qh41 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i4;
                qh41 qh41Var = this.b;
                switch (i22) {
                    case 0:
                        return new e5g0(qh41Var);
                    case 1:
                        return new r5j0(qh41Var);
                    case 2:
                        return new jm3(qh41Var);
                    case 3:
                        return new vh60(qh41Var);
                    case 4:
                        return qh41Var.a.getSharedPreferences(qh41Var.g.e.d(), 0);
                    case 5:
                        return new o6v(qh41Var);
                    case 6:
                        return new f1b(qh41Var);
                    case 7:
                        return new d1b(qh41Var);
                    case 8:
                        return new a820(qh41Var);
                    case 9:
                        return new gc3(qh41Var);
                    case 10:
                        return new krw(qh41Var);
                    case 11:
                        return new aw41(qh41Var);
                    default:
                        ew2 ew2Var = qh41Var.r;
                        int i32 = Build.VERSION.SDK_INT;
                        Context context2 = qh41Var.a;
                        return i32 < 31 ? new tw50(context2, ew2Var) : new vw50(context2, ew2Var);
                }
            }
        });
        final int i5 = 4;
        this.o = a.a(new sls(this) { // from class: oh41
            public final /* synthetic */ qh41 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i5;
                qh41 qh41Var = this.b;
                switch (i22) {
                    case 0:
                        return new e5g0(qh41Var);
                    case 1:
                        return new r5j0(qh41Var);
                    case 2:
                        return new jm3(qh41Var);
                    case 3:
                        return new vh60(qh41Var);
                    case 4:
                        return qh41Var.a.getSharedPreferences(qh41Var.g.e.d(), 0);
                    case 5:
                        return new o6v(qh41Var);
                    case 6:
                        return new f1b(qh41Var);
                    case 7:
                        return new d1b(qh41Var);
                    case 8:
                        return new a820(qh41Var);
                    case 9:
                        return new gc3(qh41Var);
                    case 10:
                        return new krw(qh41Var);
                    case 11:
                        return new aw41(qh41Var);
                    default:
                        ew2 ew2Var = qh41Var.r;
                        int i32 = Build.VERSION.SDK_INT;
                        Context context2 = qh41Var.a;
                        return i32 < 31 ? new tw50(context2, ew2Var) : new vw50(context2, ew2Var);
                }
            }
        });
        final int i6 = 5;
        this.q = a.a(new sls(this) { // from class: oh41
            public final /* synthetic */ qh41 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i6;
                qh41 qh41Var = this.b;
                switch (i22) {
                    case 0:
                        return new e5g0(qh41Var);
                    case 1:
                        return new r5j0(qh41Var);
                    case 2:
                        return new jm3(qh41Var);
                    case 3:
                        return new vh60(qh41Var);
                    case 4:
                        return qh41Var.a.getSharedPreferences(qh41Var.g.e.d(), 0);
                    case 5:
                        return new o6v(qh41Var);
                    case 6:
                        return new f1b(qh41Var);
                    case 7:
                        return new d1b(qh41Var);
                    case 8:
                        return new a820(qh41Var);
                    case 9:
                        return new gc3(qh41Var);
                    case 10:
                        return new krw(qh41Var);
                    case 11:
                        return new aw41(qh41Var);
                    default:
                        ew2 ew2Var = qh41Var.r;
                        int i32 = Build.VERSION.SDK_INT;
                        Context context2 = qh41Var.a;
                        return i32 < 31 ? new tw50(context2, ew2Var) : new vw50(context2, ew2Var);
                }
            }
        });
        ew2 ew2Var = new ew2(this);
        this.r = ew2Var;
        this.s = new dm3(ew2Var);
        this.t = new bo41();
        this.u = new yx1(this);
        this.v = a.a(new gs21(26));
        final int i7 = 6;
        this.w = a.a(new sls(this) { // from class: oh41
            public final /* synthetic */ qh41 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i7;
                qh41 qh41Var = this.b;
                switch (i22) {
                    case 0:
                        return new e5g0(qh41Var);
                    case 1:
                        return new r5j0(qh41Var);
                    case 2:
                        return new jm3(qh41Var);
                    case 3:
                        return new vh60(qh41Var);
                    case 4:
                        return qh41Var.a.getSharedPreferences(qh41Var.g.e.d(), 0);
                    case 5:
                        return new o6v(qh41Var);
                    case 6:
                        return new f1b(qh41Var);
                    case 7:
                        return new d1b(qh41Var);
                    case 8:
                        return new a820(qh41Var);
                    case 9:
                        return new gc3(qh41Var);
                    case 10:
                        return new krw(qh41Var);
                    case 11:
                        return new aw41(qh41Var);
                    default:
                        ew2 ew2Var2 = qh41Var.r;
                        int i32 = Build.VERSION.SDK_INT;
                        Context context2 = qh41Var.a;
                        return i32 < 31 ? new tw50(context2, ew2Var2) : new vw50(context2, ew2Var2);
                }
            }
        });
        final int i8 = 7;
        this.x = a.a(new sls(this) { // from class: oh41
            public final /* synthetic */ qh41 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i8;
                qh41 qh41Var = this.b;
                switch (i22) {
                    case 0:
                        return new e5g0(qh41Var);
                    case 1:
                        return new r5j0(qh41Var);
                    case 2:
                        return new jm3(qh41Var);
                    case 3:
                        return new vh60(qh41Var);
                    case 4:
                        return qh41Var.a.getSharedPreferences(qh41Var.g.e.d(), 0);
                    case 5:
                        return new o6v(qh41Var);
                    case 6:
                        return new f1b(qh41Var);
                    case 7:
                        return new d1b(qh41Var);
                    case 8:
                        return new a820(qh41Var);
                    case 9:
                        return new gc3(qh41Var);
                    case 10:
                        return new krw(qh41Var);
                    case 11:
                        return new aw41(qh41Var);
                    default:
                        ew2 ew2Var2 = qh41Var.r;
                        int i32 = Build.VERSION.SDK_INT;
                        Context context2 = qh41Var.a;
                        return i32 < 31 ? new tw50(context2, ew2Var2) : new vw50(context2, ew2Var2);
                }
            }
        });
        final int i9 = 8;
        this.y = a.a(new sls(this) { // from class: oh41
            public final /* synthetic */ qh41 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i9;
                qh41 qh41Var = this.b;
                switch (i22) {
                    case 0:
                        return new e5g0(qh41Var);
                    case 1:
                        return new r5j0(qh41Var);
                    case 2:
                        return new jm3(qh41Var);
                    case 3:
                        return new vh60(qh41Var);
                    case 4:
                        return qh41Var.a.getSharedPreferences(qh41Var.g.e.d(), 0);
                    case 5:
                        return new o6v(qh41Var);
                    case 6:
                        return new f1b(qh41Var);
                    case 7:
                        return new d1b(qh41Var);
                    case 8:
                        return new a820(qh41Var);
                    case 9:
                        return new gc3(qh41Var);
                    case 10:
                        return new krw(qh41Var);
                    case 11:
                        return new aw41(qh41Var);
                    default:
                        ew2 ew2Var2 = qh41Var.r;
                        int i32 = Build.VERSION.SDK_INT;
                        Context context2 = qh41Var.a;
                        return i32 < 31 ? new tw50(context2, ew2Var2) : new vw50(context2, ew2Var2);
                }
            }
        });
        final int i10 = 9;
        this.z = a.a(new sls(this) { // from class: oh41
            public final /* synthetic */ qh41 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i10;
                qh41 qh41Var = this.b;
                switch (i22) {
                    case 0:
                        return new e5g0(qh41Var);
                    case 1:
                        return new r5j0(qh41Var);
                    case 2:
                        return new jm3(qh41Var);
                    case 3:
                        return new vh60(qh41Var);
                    case 4:
                        return qh41Var.a.getSharedPreferences(qh41Var.g.e.d(), 0);
                    case 5:
                        return new o6v(qh41Var);
                    case 6:
                        return new f1b(qh41Var);
                    case 7:
                        return new d1b(qh41Var);
                    case 8:
                        return new a820(qh41Var);
                    case 9:
                        return new gc3(qh41Var);
                    case 10:
                        return new krw(qh41Var);
                    case 11:
                        return new aw41(qh41Var);
                    default:
                        ew2 ew2Var2 = qh41Var.r;
                        int i32 = Build.VERSION.SDK_INT;
                        Context context2 = qh41Var.a;
                        return i32 < 31 ? new tw50(context2, ew2Var2) : new vw50(context2, ew2Var2);
                }
            }
        });
        final int i11 = 10;
        this.A = a.a(new sls(this) { // from class: oh41
            public final /* synthetic */ qh41 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i11;
                qh41 qh41Var = this.b;
                switch (i22) {
                    case 0:
                        return new e5g0(qh41Var);
                    case 1:
                        return new r5j0(qh41Var);
                    case 2:
                        return new jm3(qh41Var);
                    case 3:
                        return new vh60(qh41Var);
                    case 4:
                        return qh41Var.a.getSharedPreferences(qh41Var.g.e.d(), 0);
                    case 5:
                        return new o6v(qh41Var);
                    case 6:
                        return new f1b(qh41Var);
                    case 7:
                        return new d1b(qh41Var);
                    case 8:
                        return new a820(qh41Var);
                    case 9:
                        return new gc3(qh41Var);
                    case 10:
                        return new krw(qh41Var);
                    case 11:
                        return new aw41(qh41Var);
                    default:
                        ew2 ew2Var2 = qh41Var.r;
                        int i32 = Build.VERSION.SDK_INT;
                        Context context2 = qh41Var.a;
                        return i32 < 31 ? new tw50(context2, ew2Var2) : new vw50(context2, ew2Var2);
                }
            }
        });
        this.B = new ph41(i, this);
        final int i12 = 11;
        this.C = a.a(new sls(this) { // from class: oh41
            public final /* synthetic */ qh41 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i12;
                qh41 qh41Var = this.b;
                switch (i22) {
                    case 0:
                        return new e5g0(qh41Var);
                    case 1:
                        return new r5j0(qh41Var);
                    case 2:
                        return new jm3(qh41Var);
                    case 3:
                        return new vh60(qh41Var);
                    case 4:
                        return qh41Var.a.getSharedPreferences(qh41Var.g.e.d(), 0);
                    case 5:
                        return new o6v(qh41Var);
                    case 6:
                        return new f1b(qh41Var);
                    case 7:
                        return new d1b(qh41Var);
                    case 8:
                        return new a820(qh41Var);
                    case 9:
                        return new gc3(qh41Var);
                    case 10:
                        return new krw(qh41Var);
                    case 11:
                        return new aw41(qh41Var);
                    default:
                        ew2 ew2Var2 = qh41Var.r;
                        int i32 = Build.VERSION.SDK_INT;
                        Context context2 = qh41Var.a;
                        return i32 < 31 ? new tw50(context2, ew2Var2) : new vw50(context2, ew2Var2);
                }
            }
        });
        this.D = a.a(new sls(this) { // from class: oh41
            public final /* synthetic */ qh41 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                qh41 qh41Var = this.b;
                switch (i22) {
                    case 0:
                        return new e5g0(qh41Var);
                    case 1:
                        return new r5j0(qh41Var);
                    case 2:
                        return new jm3(qh41Var);
                    case 3:
                        return new vh60(qh41Var);
                    case 4:
                        return qh41Var.a.getSharedPreferences(qh41Var.g.e.d(), 0);
                    case 5:
                        return new o6v(qh41Var);
                    case 6:
                        return new f1b(qh41Var);
                    case 7:
                        return new d1b(qh41Var);
                    case 8:
                        return new a820(qh41Var);
                    case 9:
                        return new gc3(qh41Var);
                    case 10:
                        return new krw(qh41Var);
                    case 11:
                        return new aw41(qh41Var);
                    default:
                        ew2 ew2Var2 = qh41Var.r;
                        int i32 = Build.VERSION.SDK_INT;
                        Context context2 = qh41Var.a;
                        return i32 < 31 ? new tw50(context2, ew2Var2) : new vw50(context2, ew2Var2);
                }
            }
        });
        final int i13 = 1;
        this.E = a.a(new sls(this) { // from class: oh41
            public final /* synthetic */ qh41 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i13;
                qh41 qh41Var = this.b;
                switch (i22) {
                    case 0:
                        return new e5g0(qh41Var);
                    case 1:
                        return new r5j0(qh41Var);
                    case 2:
                        return new jm3(qh41Var);
                    case 3:
                        return new vh60(qh41Var);
                    case 4:
                        return qh41Var.a.getSharedPreferences(qh41Var.g.e.d(), 0);
                    case 5:
                        return new o6v(qh41Var);
                    case 6:
                        return new f1b(qh41Var);
                    case 7:
                        return new d1b(qh41Var);
                    case 8:
                        return new a820(qh41Var);
                    case 9:
                        return new gc3(qh41Var);
                    case 10:
                        return new krw(qh41Var);
                    case 11:
                        return new aw41(qh41Var);
                    default:
                        ew2 ew2Var2 = qh41Var.r;
                        int i32 = Build.VERSION.SDK_INT;
                        Context context2 = qh41Var.a;
                        return i32 < 31 ? new tw50(context2, ew2Var2) : new vw50(context2, ew2Var2);
                }
            }
        });
    }
}
