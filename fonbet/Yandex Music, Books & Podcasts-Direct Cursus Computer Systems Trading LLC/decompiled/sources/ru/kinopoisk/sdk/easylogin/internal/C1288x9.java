package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.cqe;
import defpackage.eg7;
import defpackage.f1d;
import defpackage.ild;
import defpackage.j5m;
import defpackage.k5r;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.msa;
import defpackage.mvg;
import defpackage.nsa;
import defpackage.oc3;
import defpackage.ouj;
import defpackage.p3d;
import defpackage.qy0;
import defpackage.ssa;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tlm;
import defpackage.tq5;
import defpackage.u75;
import defpackage.u7g;
import defpackage.uah;
import defpackage.vhp;
import defpackage.vx7;
import defpackage.wq5;
import defpackage.wsd;
import defpackage.xhp;
import defpackage.yd5;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.x9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1288x9 {

    @NotNull
    public final F1 a;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002 !BÁ\u0001\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/x9$a;", "", "", "seen1", "", "declineDelayDayCount", "remindMeLaterDelayDayCount", "acceptDelayDayCount", "", "", "tvOsNames", "discoveryTimeoutSeconds", "", "clientIds", "", "samsungShowInDiscovery", "lgShowInDiscovery", "androidTvShowInDiscovery", "lgOpenWithParamsEnabled", "samsungOpenWithParamsEnabled", "samsungInstallTvApp", "lgInstallTvApp", "tvAppPollingDelayMs", "getStatePollingDelayMs", "codeVerificationAttempts", "getStateRetryAttempts", "androidTvAuthEnabled", "Lxhp;", "serializationConstructorMarker", "<init>", "(IJJJLjava/util/List;JLjava/util/Map;ZZZZZZZJJIJZLxhp;)V", "Companion", "a", "b", "android_easylogin_tvauth_mobilecore"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    @vhp
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.x9$a */
    public static final /* data */ class a {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final t9f[] s;

        @NotNull
        public static final Map<String, String> t;

        @NotNull
        public static final a u;
        public final long a;
        public final long b;
        public final long c;

        @NotNull
        public final List<String> d;
        public final long e;

        @NotNull
        public final Map<String, String> f;
        public final boolean g;
        public final boolean h;
        public final boolean i;
        public final boolean j;
        public final boolean k;
        public final boolean l;
        public final boolean m;
        public final long n;
        public final long o;
        public final int p;
        public final long q;
        public final boolean r;

        @vx7
        /* renamed from: ru.kinopoisk.sdk.easylogin.internal.x9$a$a, reason: collision with other inner class name */
        public static final class C0049a implements p3d {

            @NotNull
            public static final C0049a a;
            private static final /* synthetic */ j5m descriptor;

            static {
                C0049a c0049a = new C0049a();
                a = c0049a;
                j5m j5mVar = new j5m("ru.kinopoisk.tvauth.TvAuthConfig.ConfigModel", c0049a, 18);
                j5mVar.k("declineDelayDayCount", false);
                j5mVar.k("remindMeLaterDelayDayCount", false);
                j5mVar.k("acceptDelayDayCount", false);
                j5mVar.k("tvOsNames", false);
                j5mVar.k("discoveryTimeoutSeconds", false);
                j5mVar.k("clientIds", false);
                j5mVar.k("samsungShowInDiscovery", false);
                j5mVar.k("lgShowInDiscovery", false);
                j5mVar.k("androidTvShowInDiscovery", false);
                j5mVar.k("lgOpenWithParamsEnabled", false);
                j5mVar.k("samsungOpenWithParamsEnabled", false);
                j5mVar.k("samsungInstallTvApp", false);
                j5mVar.k("lgInstallTvApp", false);
                j5mVar.k("tvAppPollingDelayMs", false);
                j5mVar.k("getStatePollingDelayMs", false);
                j5mVar.k("codeVerificationAttempts", false);
                j5mVar.k("getStateRetryAttempts", false);
                j5mVar.k("androidTvAuthEnabled", false);
                descriptor = j5mVar;
            }

            @Override // defpackage.p3d
            @NotNull
            public final t9f[] childSerializers() {
                t9f[] t9fVarArr = a.s;
                t9f t9fVar = t9fVarArr[3];
                t9f t9fVar2 = t9fVarArr[5];
                mvg mvgVar = mvg.a;
                oc3 oc3Var = oc3.a;
                return new t9f[]{mvgVar, mvgVar, mvgVar, t9fVar, mvgVar, t9fVar2, oc3Var, oc3Var, oc3Var, oc3Var, oc3Var, oc3Var, oc3Var, mvgVar, mvgVar, cqe.a, mvgVar, oc3Var};
            }

            @Override // defpackage.t9f
            public final Object deserialize(eg7 eg7Var) {
                boolean z;
                Map map;
                List list;
                boolean z2;
                boolean z3;
                boolean z4;
                long j;
                boolean z5;
                boolean z6;
                boolean z7;
                boolean z8;
                long j2;
                int i;
                int i2;
                long j3;
                long j4;
                long j5;
                long j6;
                long j7;
                int i3;
                boolean z9;
                List list2;
                Map map2;
                int i4;
                int i5;
                eg7Var.getClass();
                j5m j5mVar = descriptor;
                tq5 c = eg7Var.c(j5mVar);
                t9f[] t9fVarArr = a.s;
                int i6 = 10;
                int i7 = 4;
                int i8 = 2;
                if (c.m()) {
                    long q = c.q(j5mVar, 0);
                    long q2 = c.q(j5mVar, 1);
                    long q3 = c.q(j5mVar, 2);
                    List list3 = (List) c.z(j5mVar, 3, t9fVarArr[3], null);
                    long q4 = c.q(j5mVar, 4);
                    Map map3 = (Map) c.z(j5mVar, 5, t9fVarArr[5], null);
                    boolean D = c.D(j5mVar, 6);
                    boolean D2 = c.D(j5mVar, 7);
                    boolean D3 = c.D(j5mVar, 8);
                    boolean D4 = c.D(j5mVar, 9);
                    boolean D5 = c.D(j5mVar, 10);
                    boolean D6 = c.D(j5mVar, 11);
                    boolean D7 = c.D(j5mVar, 12);
                    long q5 = c.q(j5mVar, 13);
                    long q6 = c.q(j5mVar, 14);
                    int k = c.k(j5mVar, 15);
                    long q7 = c.q(j5mVar, 16);
                    z = c.D(j5mVar, 17);
                    list = list3;
                    z2 = D;
                    z3 = D2;
                    z4 = D3;
                    j = q2;
                    z5 = D4;
                    z6 = D5;
                    z7 = D6;
                    z8 = D7;
                    j2 = q5;
                    i = k;
                    i2 = 262143;
                    map = map3;
                    j3 = q6;
                    j4 = q7;
                    j5 = q;
                    j6 = q3;
                    j7 = q4;
                } else {
                    boolean z10 = true;
                    boolean z11 = false;
                    boolean z12 = false;
                    boolean z13 = false;
                    boolean z14 = false;
                    boolean z15 = false;
                    int i9 = 0;
                    int i10 = 0;
                    Map map4 = null;
                    long j8 = 0;
                    long j9 = 0;
                    long j10 = 0;
                    long j11 = 0;
                    long j12 = 0;
                    long j13 = 0;
                    long j14 = 0;
                    boolean z16 = false;
                    boolean z17 = false;
                    boolean z18 = false;
                    List list4 = null;
                    while (z10) {
                        int w = c.w(j5mVar);
                        switch (w) {
                            case -1:
                                z10 = false;
                                i7 = 4;
                                i6 = 10;
                            case 0:
                                i3 = i8;
                                j12 = c.q(j5mVar, 0);
                                z9 = z16;
                                list2 = list4;
                                map2 = map4;
                                i4 = 1;
                                i10 |= i4;
                                map4 = map2;
                                list4 = list2;
                                i8 = i3;
                                z16 = z9;
                                i7 = 4;
                                i6 = 10;
                            case 1:
                                i3 = i8;
                                j8 = c.q(j5mVar, 1);
                                z9 = z16;
                                list2 = list4;
                                map2 = map4;
                                i4 = i3;
                                i10 |= i4;
                                map4 = map2;
                                list4 = list2;
                                i8 = i3;
                                z16 = z9;
                                i7 = 4;
                                i6 = 10;
                            case 2:
                                i3 = i8;
                                j13 = c.q(j5mVar, i3);
                                z9 = z16;
                                list2 = list4;
                                map2 = map4;
                                i4 = i7;
                                i10 |= i4;
                                map4 = map2;
                                list4 = list2;
                                i8 = i3;
                                z16 = z9;
                                i7 = 4;
                                i6 = 10;
                            case 3:
                                z9 = z16;
                                i3 = 2;
                                list2 = (List) c.z(j5mVar, 3, t9fVarArr[3], list4);
                                map2 = map4;
                                i4 = 8;
                                i10 |= i4;
                                map4 = map2;
                                list4 = list2;
                                i8 = i3;
                                z16 = z9;
                                i7 = 4;
                                i6 = 10;
                            case 4:
                                j14 = c.q(j5mVar, i7);
                                z9 = z16;
                                i3 = 2;
                                list2 = list4;
                                map2 = map4;
                                i4 = 16;
                                i10 |= i4;
                                map4 = map2;
                                list4 = list2;
                                i8 = i3;
                                z16 = z9;
                                i7 = 4;
                                i6 = 10;
                            case 5:
                                z9 = z16;
                                list2 = list4;
                                map2 = (Map) c.z(j5mVar, 5, t9fVarArr[5], map4);
                                i4 = 32;
                                i3 = 2;
                                i10 |= i4;
                                map4 = map2;
                                list4 = list2;
                                i8 = i3;
                                z16 = z9;
                                i7 = 4;
                                i6 = 10;
                            case 6:
                                z16 = c.D(j5mVar, 6);
                                i5 = 64;
                                z9 = z16;
                                i3 = 2;
                                list2 = list4;
                                map2 = map4;
                                i4 = i5;
                                i10 |= i4;
                                map4 = map2;
                                list4 = list2;
                                i8 = i3;
                                z16 = z9;
                                i7 = 4;
                                i6 = 10;
                            case 7:
                                z17 = c.D(j5mVar, 7);
                                i5 = 128;
                                z9 = z16;
                                i3 = 2;
                                list2 = list4;
                                map2 = map4;
                                i4 = i5;
                                i10 |= i4;
                                map4 = map2;
                                list4 = list2;
                                i8 = i3;
                                z16 = z9;
                                i7 = 4;
                                i6 = 10;
                            case 8:
                                z18 = c.D(j5mVar, 8);
                                i5 = 256;
                                z9 = z16;
                                i3 = 2;
                                list2 = list4;
                                map2 = map4;
                                i4 = i5;
                                i10 |= i4;
                                map4 = map2;
                                list4 = list2;
                                i8 = i3;
                                z16 = z9;
                                i7 = 4;
                                i6 = 10;
                            case 9:
                                z12 = c.D(j5mVar, 9);
                                i5 = RemoteCameraConfig.Mic.BUFFER_SIZE;
                                z9 = z16;
                                i3 = 2;
                                list2 = list4;
                                map2 = map4;
                                i4 = i5;
                                i10 |= i4;
                                map4 = map2;
                                list4 = list2;
                                i8 = i3;
                                z16 = z9;
                                i7 = 4;
                                i6 = 10;
                            case 10:
                                z13 = c.D(j5mVar, i6);
                                i5 = 1024;
                                z9 = z16;
                                i3 = 2;
                                list2 = list4;
                                map2 = map4;
                                i4 = i5;
                                i10 |= i4;
                                map4 = map2;
                                list4 = list2;
                                i8 = i3;
                                z16 = z9;
                                i7 = 4;
                                i6 = 10;
                            case 11:
                                z14 = c.D(j5mVar, 11);
                                i5 = 2048;
                                z9 = z16;
                                i3 = 2;
                                list2 = list4;
                                map2 = map4;
                                i4 = i5;
                                i10 |= i4;
                                map4 = map2;
                                list4 = list2;
                                i8 = i3;
                                z16 = z9;
                                i7 = 4;
                                i6 = 10;
                            case 12:
                                z15 = c.D(j5mVar, 12);
                                i5 = 4096;
                                z9 = z16;
                                i3 = 2;
                                list2 = list4;
                                map2 = map4;
                                i4 = i5;
                                i10 |= i4;
                                map4 = map2;
                                list4 = list2;
                                i8 = i3;
                                z16 = z9;
                                i7 = 4;
                                i6 = 10;
                            case 13:
                                j9 = c.q(j5mVar, 13);
                                i5 = RemoteCameraConfig.Notification.ID;
                                z9 = z16;
                                i3 = 2;
                                list2 = list4;
                                map2 = map4;
                                i4 = i5;
                                i10 |= i4;
                                map4 = map2;
                                list4 = list2;
                                i8 = i3;
                                z16 = z9;
                                i7 = 4;
                                i6 = 10;
                            case 14:
                                j10 = c.q(j5mVar, 14);
                                i5 = 16384;
                                z9 = z16;
                                i3 = 2;
                                list2 = list4;
                                map2 = map4;
                                i4 = i5;
                                i10 |= i4;
                                map4 = map2;
                                list4 = list2;
                                i8 = i3;
                                z16 = z9;
                                i7 = 4;
                                i6 = 10;
                            case 15:
                                i9 = c.k(j5mVar, 15);
                                i5 = SQLiteDatabase.OPEN_NOMUTEX;
                                z9 = z16;
                                i3 = 2;
                                list2 = list4;
                                map2 = map4;
                                i4 = i5;
                                i10 |= i4;
                                map4 = map2;
                                list4 = list2;
                                i8 = i3;
                                z16 = z9;
                                i7 = 4;
                                i6 = 10;
                            case 16:
                                j11 = c.q(j5mVar, 16);
                                z9 = z16;
                                i3 = 2;
                                list2 = list4;
                                map2 = map4;
                                i4 = 65536;
                                i10 |= i4;
                                map4 = map2;
                                list4 = list2;
                                i8 = i3;
                                z16 = z9;
                                i7 = 4;
                                i6 = 10;
                            case 17:
                                boolean D8 = c.D(j5mVar, 17);
                                i10 |= SQLiteDatabase.OPEN_SHAREDCACHE;
                                z11 = D8;
                            default:
                                l1j.g(w);
                                return null;
                        }
                    }
                    z = z11;
                    map = map4;
                    list = list4;
                    z2 = z16;
                    z3 = z17;
                    z4 = z18;
                    j = j8;
                    z5 = z12;
                    z6 = z13;
                    z7 = z14;
                    z8 = z15;
                    j2 = j9;
                    i = i9;
                    i2 = i10;
                    j3 = j10;
                    j4 = j11;
                    j5 = j12;
                    j6 = j13;
                    j7 = j14;
                }
                c.b(j5mVar);
                return new a(i2, j5, j, j6, list, j7, map, z2, z3, z4, z5, z6, z7, z8, j2, j3, i, j4, z, null);
            }

            @Override // defpackage.t9f
            @NotNull
            public final mhp getDescriptor() {
                return descriptor;
            }

            @Override // defpackage.t9f
            public final void serialize(l6b l6bVar, Object obj) {
                a aVar = (a) obj;
                l6bVar.getClass();
                aVar.getClass();
                j5m j5mVar = descriptor;
                wq5 c = l6bVar.c(j5mVar);
                t9f[] t9fVarArr = a.s;
                c.g(j5mVar, 0, aVar.a);
                c.g(j5mVar, 1, aVar.b);
                c.g(j5mVar, 2, aVar.c);
                c.k(j5mVar, 3, t9fVarArr[3], aVar.d);
                c.g(j5mVar, 4, aVar.e);
                c.k(j5mVar, 5, t9fVarArr[5], aVar.f);
                c.j(j5mVar, 6, aVar.g);
                c.j(j5mVar, 7, aVar.h);
                c.j(j5mVar, 8, aVar.i);
                c.j(j5mVar, 9, aVar.j);
                c.j(j5mVar, 10, aVar.k);
                c.j(j5mVar, 11, aVar.l);
                c.j(j5mVar, 12, aVar.m);
                c.g(j5mVar, 13, aVar.n);
                c.g(j5mVar, 14, aVar.o);
                c.A(15, aVar.p, j5mVar);
                c.g(j5mVar, 16, aVar.q);
                c.j(j5mVar, 17, aVar.r);
                c.b(j5mVar);
            }

            @Override // defpackage.p3d
            @NotNull
            public final t9f[] typeParametersSerializers() {
                return ild.k;
            }
        }

        static {
            tkr tkrVar = tkr.a;
            s = new t9f[]{null, null, null, new qy0(tkrVar, 0), null, new wsd(tkrVar, tkrVar, 1), null, null, null, null, null, null, null, null, null, null, null, null};
            msa msaVar = nsa.b;
            ssa ssaVar = ssa.MILLISECONDS;
            long M = yd5.M(250, ssaVar);
            long M2 = yd5.M(1000, ssaVar);
            Map<String, String> e = uah.e(new Pair("oauth", ""), new Pair("oauth_v2", "e8e34b1c086c4c30a308d2742bdda2f8"), new Pair("passport", "adb2a69277c14503a8add5bee4dafa47"), new Pair("androidtv", "c0ebe342af7d48fbbbfcf2d2eedb8f9e"));
            t = e;
            u = new a(30L, 3L, 3L, u75.h("webos", "tizen", "android-tv", "orsay", "yandex-tv", "tvOS", "android-tv-domru", "vidaa", "zeasn-tv", "android-tv-sberdevices", "tvip", "harmony-tv", "Apple TVOS", "Tizen STV", "android-tv-rombica", "android-tv-hiper", "yandex-tv-lib", "smart-tv", "playstation", "playstation4", "xbox", "playstation5", "mina", "android-tv-wildred", "android-tv-iconbit"), 15L, e, true, true, true, false, false, true, true, nsa.f(M), nsa.f(M2), 3, 3L, true);
        }

        @vx7
        public /* synthetic */ a(int i, long j, long j2, long j3, List list, long j4, Map map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j5, long j6, int i2, long j7, boolean z8, xhp xhpVar) {
            if (262143 != (i & 262143)) {
                u7g.V(i, 262143, C0049a.a.getDescriptor());
                throw null;
            }
            this.a = j;
            this.b = j2;
            this.c = j3;
            this.d = list;
            this.e = j4;
            this.f = map;
            this.g = z;
            this.h = z2;
            this.i = z3;
            this.j = z4;
            this.k = z5;
            this.l = z6;
            this.m = z7;
            this.n = j5;
            this.o = j6;
            this.p = i2;
            this.q = j7;
            this.r = z8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && Intrinsics.d(this.d, aVar.d) && this.e == aVar.e && Intrinsics.d(this.f, aVar.f) && this.g == aVar.g && this.h == aVar.h && this.i == aVar.i && this.j == aVar.j && this.k == aVar.k && this.l == aVar.l && this.m == aVar.m && this.n == aVar.n && this.o == aVar.o && this.p == aVar.p && this.q == aVar.q && this.r == aVar.r;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.r) + tlm.c(this.q, f1d.a(this.p, tlm.c(this.o, tlm.c(this.n, k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(f1d.b(this.f, tlm.c(this.e, k5r.d(tlm.c(this.c, tlm.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31, this.d), 31), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31), 31), 31), 31);
        }

        @NotNull
        public final String toString() {
            long j = this.a;
            long j2 = this.b;
            long j3 = this.c;
            List<String> list = this.d;
            long j4 = this.e;
            Map<String, String> map = this.f;
            boolean z = this.g;
            boolean z2 = this.h;
            boolean z3 = this.i;
            boolean z4 = this.j;
            boolean z5 = this.k;
            boolean z6 = this.l;
            boolean z7 = this.m;
            long j5 = this.n;
            long j6 = this.o;
            int i = this.p;
            long j7 = this.q;
            boolean z8 = this.r;
            StringBuilder l = tlm.l(j, "ConfigModel(declineDelayDayCount=", ", remindMeLaterDelayDayCount=");
            l.append(j2);
            ouj.C(l, ", acceptDelayDayCount=", j3, ", tvOsNames=");
            l.append(list);
            l.append(", discoveryTimeoutSeconds=");
            l.append(j4);
            l.append(", clientIds=");
            l.append(map);
            l.append(", samsungShowInDiscovery=");
            l.append(z);
            l.append(", lgShowInDiscovery=");
            l.append(z2);
            l.append(", androidTvShowInDiscovery=");
            l.append(z3);
            l.append(", lgOpenWithParamsEnabled=");
            l.append(z4);
            l.append(", samsungOpenWithParamsEnabled=");
            l.append(z5);
            l.append(", samsungInstallTvApp=");
            l.append(z6);
            l.append(", lgInstallTvApp=");
            l.append(z7);
            ouj.C(l, ", tvAppPollingDelayMs=", j5, ", getStatePollingDelayMs=");
            l.append(j6);
            l.append(", codeVerificationAttempts=");
            l.append(i);
            ouj.C(l, ", getStateRetryAttempts=", j7, ", androidTvAuthEnabled=");
            return ouj.r(l, z8, ")");
        }

        public a(long j, long j2, long j3, @NotNull List<String> list, long j4, @NotNull Map<String, String> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j5, long j6, int i, long j7, boolean z8) {
            list.getClass();
            map.getClass();
            this.a = j;
            this.b = j2;
            this.c = j3;
            this.d = list;
            this.e = j4;
            this.f = map;
            this.g = z;
            this.h = z2;
            this.i = z3;
            this.j = z4;
            this.k = z5;
            this.l = z6;
            this.m = z7;
            this.n = j5;
            this.o = j6;
            this.p = i;
            this.q = j7;
            this.r = z8;
        }

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u001a\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u001a\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/x9$a$b;", "", "<init>", "()V", "Lt9f;", "Lru/kinopoisk/sdk/easylogin/internal/x9$a;", "serializer", "()Lt9f;", "", "DEFAULT_ACCEPT_DELAY_DAY_COUNT", "J", "", "DEFAULT_CODE_VERIFICATION_ATTEMPTS", "I", "DEFAULT_DECLINE_DELAY_DAY_COUNT", "DEFAULT_DISCOVERY_TIMEOUT_SECONDS", "DEFAULT_GET_SATE_RETRY_ATTEMPTS", "Lnsa;", "DEFAULT_GET_STATE_DELAY", "DEFAULT_REMIND_ME_LATER_DELAY_DAY_COUNT", "DEFAULT_TRY_TO_OPEN_APP_DELAY", "", "", "DEFAULT_TV_OS_NAMES", "Ljava/util/List;", "android_easylogin_tvauth_mobilecore"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
        /* renamed from: ru.kinopoisk.sdk.easylogin.internal.x9$a$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final t9f serializer() {
                return C0049a.a;
            }

            public Companion() {
            }
        }
    }

    public C1288x9(@NotNull F1 f1) {
        f1.getClass();
        this.a = f1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a a() {
        return (a) this.a.getValue(C1301y9.a).a;
    }
}
