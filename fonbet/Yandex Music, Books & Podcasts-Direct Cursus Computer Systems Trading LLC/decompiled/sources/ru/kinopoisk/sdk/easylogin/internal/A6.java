package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.eg7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.p3d;
import defpackage.su4;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.u7g;
import defpackage.udb;
import defpackage.vhp;
import defpackage.vx7;
import defpackage.wq5;
import defpackage.xhp;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.C1094j7;
import ru.kinopoisk.sdk.easylogin.internal.N1;
import ru.kinopoisk.sdk.easylogin.internal.T4;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0003\u0015\u0016\u0017Ba\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/A6;", "", "", "seen1", "", ConnectableDevice.KEY_ID, "Lru/kinopoisk/sdk/easylogin/internal/A6$c;", "tvType", "name", CommonUrlParts.MODEL, "Lru/kinopoisk/sdk/easylogin/internal/j7;", "openRule", "Lru/kinopoisk/sdk/easylogin/internal/T4;", "installRule", "Lru/kinopoisk/sdk/easylogin/internal/N1;", "confirmCodeRule", "Lxhp;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lru/kinopoisk/sdk/easylogin/internal/A6$c;Ljava/lang/String;Ljava/lang/String;Lru/kinopoisk/sdk/easylogin/internal/j7;Lru/kinopoisk/sdk/easylogin/internal/T4;Lru/kinopoisk/sdk/easylogin/internal/N1;Lxhp;)V", "Companion", "a", "b", "c", "android_easylogin_tvauth_mobileimpl"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vhp
/* loaded from: classes5.dex */
public final /* data */ class A6 {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final t9f[] h;

    @NotNull
    public final String a;

    @NotNull
    public final c b;

    @NotNull
    public final String c;

    @NotNull
    public final String d;

    @NotNull
    public final C1094j7 e;

    @NotNull
    public final T4 f;

    @NotNull
    public final N1 g;

    @vx7
    public static final class a implements p3d {

        @NotNull
        public static final a a;
        private static final /* synthetic */ j5m descriptor;

        static {
            a aVar = new a();
            a = aVar;
            j5m j5mVar = new j5m("ru.kinopoisk.tvauth.mock.MockTvRule", aVar, 7);
            j5mVar.k(ConnectableDevice.KEY_ID, false);
            j5mVar.k("tvType", false);
            j5mVar.k("name", false);
            j5mVar.k(CommonUrlParts.MODEL, false);
            j5mVar.k("openRule", false);
            j5mVar.k("installRule", false);
            j5mVar.k("confirmCodeRule", false);
            descriptor = j5mVar;
        }

        @Override // defpackage.p3d
        @NotNull
        public final t9f[] childSerializers() {
            t9f t9fVar = A6.h[1];
            tkr tkrVar = tkr.a;
            return new t9f[]{tkrVar, t9fVar, tkrVar, tkrVar, C1094j7.a.a, T4.a.a, N1.a.a};
        }

        @Override // defpackage.t9f
        public final Object deserialize(eg7 eg7Var) {
            int i;
            N1 n1;
            T4 t4;
            String str;
            c cVar;
            String str2;
            String str3;
            C1094j7 c1094j7;
            eg7Var.getClass();
            j5m j5mVar = descriptor;
            tq5 c = eg7Var.c(j5mVar);
            t9f[] t9fVarArr = A6.h;
            int i2 = 6;
            int i3 = 5;
            int i4 = 2;
            String str4 = null;
            if (c.m()) {
                String g = c.g(j5mVar, 0);
                c cVar2 = (c) c.z(j5mVar, 1, t9fVarArr[1], null);
                String g2 = c.g(j5mVar, 2);
                String g3 = c.g(j5mVar, 3);
                C1094j7 c1094j72 = (C1094j7) c.z(j5mVar, 4, C1094j7.a.a, null);
                T4 t42 = (T4) c.z(j5mVar, 5, T4.a.a, null);
                cVar = cVar2;
                str = g;
                n1 = (N1) c.z(j5mVar, 6, N1.a.a, null);
                t4 = t42;
                str3 = g3;
                c1094j7 = c1094j72;
                str2 = g2;
                i = 127;
            } else {
                boolean z = true;
                int i5 = 0;
                N1 n12 = null;
                T4 t43 = null;
                c cVar3 = null;
                String str5 = null;
                String str6 = null;
                C1094j7 c1094j73 = null;
                while (z) {
                    int w = c.w(j5mVar);
                    switch (w) {
                        case -1:
                            z = false;
                            i2 = 6;
                        case 0:
                            str4 = c.g(j5mVar, 0);
                            i5 |= 1;
                            i2 = 6;
                            i3 = 5;
                        case 1:
                            cVar3 = (c) c.z(j5mVar, 1, t9fVarArr[1], cVar3);
                            i5 |= 2;
                            i2 = 6;
                            i3 = 5;
                        case 2:
                            str5 = c.g(j5mVar, i4);
                            i5 |= 4;
                        case 3:
                            str6 = c.g(j5mVar, 3);
                            i5 |= 8;
                            i4 = 2;
                        case 4:
                            c1094j73 = (C1094j7) c.z(j5mVar, 4, C1094j7.a.a, c1094j73);
                            i5 |= 16;
                            i4 = 2;
                        case 5:
                            t43 = (T4) c.z(j5mVar, i3, T4.a.a, t43);
                            i5 |= 32;
                            i4 = 2;
                        case 6:
                            n12 = (N1) c.z(j5mVar, i2, N1.a.a, n12);
                            i5 |= 64;
                            i4 = 2;
                        default:
                            l1j.g(w);
                            return null;
                    }
                }
                i = i5;
                n1 = n12;
                t4 = t43;
                str = str4;
                cVar = cVar3;
                str2 = str5;
                str3 = str6;
                c1094j7 = c1094j73;
            }
            c.b(j5mVar);
            return new A6(i, str, cVar, str2, str3, c1094j7, t4, n1, null);
        }

        @Override // defpackage.t9f
        @NotNull
        public final mhp getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.t9f
        public final void serialize(l6b l6bVar, Object obj) {
            A6 a6 = (A6) obj;
            l6bVar.getClass();
            a6.getClass();
            j5m j5mVar = descriptor;
            wq5 c = l6bVar.c(j5mVar);
            t9f[] t9fVarArr = A6.h;
            c.p(j5mVar, 0, a6.a);
            c.k(j5mVar, 1, t9fVarArr[1], a6.b);
            c.p(j5mVar, 2, a6.c);
            c.p(j5mVar, 3, a6.d);
            c.k(j5mVar, 4, C1094j7.a.a, a6.e);
            c.k(j5mVar, 5, T4.a.a, a6.f);
            c.k(j5mVar, 6, N1.a.a, a6.g);
            c.b(j5mVar);
        }

        @Override // defpackage.p3d
        @NotNull
        public final t9f[] typeParametersSerializers() {
            return ild.k;
        }
    }

    public enum c {
        /* JADX INFO: Fake field, exist only in values array */
        ANDROID_TV,
        /* JADX INFO: Fake field, exist only in values array */
        SAMSUNG,
        /* JADX INFO: Fake field, exist only in values array */
        LG
    }

    static {
        c[] values = c.values();
        values.getClass();
        h = new t9f[]{null, new udb("ru.kinopoisk.tvauth.mock.MockTvRule.TvType", values), null, null, null, null, null};
    }

    @vx7
    public /* synthetic */ A6(int i, String str, c cVar, String str2, String str3, C1094j7 c1094j7, T4 t4, N1 n1, xhp xhpVar) {
        if (127 != (i & 127)) {
            u7g.V(i, 127, a.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = cVar;
        this.c = str2;
        this.d = str3;
        this.e = c1094j7;
        this.f = t4;
        this.g = n1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A6)) {
            return false;
        }
        A6 a6 = (A6) obj;
        return Intrinsics.d(this.a, a6.a) && this.b == a6.b && Intrinsics.d(this.c, a6.c) && Intrinsics.d(this.d, a6.d) && Intrinsics.d(this.e, a6.e) && Intrinsics.d(this.f, a6.f) && Intrinsics.d(this.g, a6.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + C1292y0.a(this.d, C1292y0.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.a;
        c cVar = this.b;
        String str2 = this.c;
        String str3 = this.d;
        C1094j7 c1094j7 = this.e;
        T4 t4 = this.f;
        N1 n1 = this.g;
        StringBuilder sb = new StringBuilder("MockTvRule(id=");
        sb.append(str);
        sb.append(", tvType=");
        sb.append(cVar);
        sb.append(", name=");
        su4.v(sb, str2, ", model=", str3, ", openRule=");
        sb.append(c1094j7);
        sb.append(", installRule=");
        sb.append(t4);
        sb.append(", confirmCodeRule=");
        sb.append(n1);
        sb.append(")");
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/A6$b;", "", "<init>", "()V", "Lt9f;", "Lru/kinopoisk/sdk/easylogin/internal/A6;", "serializer", "()Lt9f;", "android_easylogin_tvauth_mobileimpl"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.A6$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final t9f serializer() {
            return a.a;
        }

        public Companion() {
        }
    }
}
