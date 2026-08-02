package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.eg7;
import defpackage.ff7;
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
import defpackage.up6;
import defpackage.vhp;
import defpackage.vx7;
import defpackage.wq5;
import defpackage.xhp;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0003\u000e\u000f\u0010B?\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/P;", "", "", "seen1", "Lru/kinopoisk/sdk/easylogin/internal/P$c;", "state", "", "userCode", "type", "Lxhp;", "serializationConstructorMarker", "<init>", "(ILru/kinopoisk/sdk/easylogin/internal/P$c;Ljava/lang/String;Ljava/lang/String;Lxhp;)V", "Companion", "a", "b", "c", "android_easylogin_tvauth_mobileimpl"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vhp
/* loaded from: classes5.dex */
public final /* data */ class P {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final t9f[] d = {up6.q("ru.kinopoisk.tvauth.scenario.api.AuthProcessState.State", c.values(), new String[]{"Starting", "WaitingForConfirmation", "Authorization", "Timeout", "Canceled", "Error", "Unknown"}, new Annotation[][]{null, null, null, null, null, null, null}), null, null};

    @NotNull
    public final c a;
    public final String b;
    public final String c;

    @vx7
    public static final class a implements p3d {

        @NotNull
        public static final a a;
        private static final /* synthetic */ j5m descriptor;

        static {
            a aVar = new a();
            a = aVar;
            j5m j5mVar = new j5m("ru.kinopoisk.tvauth.scenario.api.AuthProcessState", aVar, 3);
            j5mVar.k("state", false);
            j5mVar.k("userCode", true);
            j5mVar.k("type", true);
            descriptor = j5mVar;
        }

        @Override // defpackage.p3d
        @NotNull
        public final t9f[] childSerializers() {
            t9f t9fVar = P.d[0];
            tkr tkrVar = tkr.a;
            return new t9f[]{t9fVar, ff7.C(tkrVar), ff7.C(tkrVar)};
        }

        @Override // defpackage.t9f
        public final Object deserialize(eg7 eg7Var) {
            int i;
            c cVar;
            String str;
            String str2;
            eg7Var.getClass();
            j5m j5mVar = descriptor;
            tq5 c = eg7Var.c(j5mVar);
            t9f[] t9fVarArr = P.d;
            c cVar2 = null;
            if (c.m()) {
                c cVar3 = (c) c.z(j5mVar, 0, t9fVarArr[0], null);
                tkr tkrVar = tkr.a;
                String str3 = (String) c.n(j5mVar, 1, tkrVar, null);
                cVar = cVar3;
                str2 = (String) c.n(j5mVar, 2, tkrVar, null);
                i = 7;
                str = str3;
            } else {
                boolean z = true;
                int i2 = 0;
                String str4 = null;
                String str5 = null;
                while (z) {
                    int w = c.w(j5mVar);
                    if (w == -1) {
                        z = false;
                    } else if (w == 0) {
                        cVar2 = (c) c.z(j5mVar, 0, t9fVarArr[0], cVar2);
                        i2 |= 1;
                    } else if (w == 1) {
                        str4 = (String) c.n(j5mVar, 1, tkr.a, str4);
                        i2 |= 2;
                    } else {
                        if (w != 2) {
                            l1j.g(w);
                            return null;
                        }
                        str5 = (String) c.n(j5mVar, 2, tkr.a, str5);
                        i2 |= 4;
                    }
                }
                i = i2;
                cVar = cVar2;
                str = str4;
                str2 = str5;
            }
            c.b(j5mVar);
            return new P(i, cVar, str, str2, (xhp) null);
        }

        @Override // defpackage.t9f
        @NotNull
        public final mhp getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.t9f
        public final void serialize(l6b l6bVar, Object obj) {
            P p = (P) obj;
            l6bVar.getClass();
            p.getClass();
            j5m j5mVar = descriptor;
            wq5 c = l6bVar.c(j5mVar);
            c.k(j5mVar, 0, P.d[0], p.a);
            if (c.e(j5mVar) || p.b != null) {
                c.q(j5mVar, 1, tkr.a, p.b);
            }
            if (c.e(j5mVar) || p.c != null) {
                c.q(j5mVar, 2, tkr.a, p.c);
            }
            c.b(j5mVar);
        }

        @Override // defpackage.p3d
        @NotNull
        public final t9f[] typeParametersSerializers() {
            return ild.k;
        }
    }

    public enum c {
        Starting,
        WaitingForConfirmation,
        Authorized,
        /* JADX INFO: Fake field, exist only in values array */
        Timeout,
        /* JADX INFO: Fake field, exist only in values array */
        Canceled,
        Error,
        Unknown
    }

    @vx7
    public /* synthetic */ P(int i, c cVar, String str, String str2, xhp xhpVar) {
        if (1 != (i & 1)) {
            u7g.V(i, 1, a.a.getDescriptor());
            throw null;
        }
        this.a = cVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    @NotNull
    /* renamed from: a, reason: from getter */
    public final c getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: c, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p = (P) obj;
        return this.a == p.a && Intrinsics.d(this.b, p.b) && Intrinsics.d(this.c, p.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        c cVar = this.a;
        String str = this.b;
        String str2 = this.c;
        StringBuilder sb = new StringBuilder("AuthProcessState(state=");
        sb.append(cVar);
        sb.append(", userCode=");
        sb.append(str);
        sb.append(", type=");
        return su4.o(sb, str2, ")");
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/P$b;", "", "<init>", "()V", "Lt9f;", "Lru/kinopoisk/sdk/easylogin/internal/P;", "serializer", "()Lt9f;", "android_easylogin_tvauth_mobileimpl"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.P$b, reason: from kotlin metadata */
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

    public P(@NotNull c cVar, String str, String str2) {
        cVar.getClass();
        this.a = cVar;
        this.b = str;
        this.c = str2;
    }

    public /* synthetic */ P(c cVar, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
