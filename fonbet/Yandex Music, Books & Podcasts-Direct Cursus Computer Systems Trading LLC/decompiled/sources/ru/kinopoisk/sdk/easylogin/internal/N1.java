package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.eg7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.msa;
import defpackage.nsa;
import defpackage.p3d;
import defpackage.rsa;
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
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u000f2\u00020\u0001:\u0003\u0010\u0011\u0012B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000e¨\u0006\u0013"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/N1;", "", "Lru/kinopoisk/sdk/easylogin/internal/N1$c;", "type", "", "code", "Lnsa;", "delay", "<init>", "(Lru/kinopoisk/sdk/easylogin/internal/N1$c;Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen1", "Lxhp;", "serializationConstructorMarker", "(ILru/kinopoisk/sdk/easylogin/internal/N1$c;Ljava/lang/String;Lnsa;Lxhp;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Companion", "a", "b", "c", "android_easylogin_tvauth_mobileimpl"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vhp
/* loaded from: classes5.dex */
public final /* data */ class N1 {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final t9f[] d;

    @NotNull
    public final c a;

    @NotNull
    public final String b;
    public final long c;

    @vx7
    public static final class a implements p3d {

        @NotNull
        public static final a a;
        private static final /* synthetic */ j5m descriptor;

        static {
            a aVar = new a();
            a = aVar;
            j5m j5mVar = new j5m("ru.kinopoisk.tvauth.mock.ConfirmCodeRule", aVar, 3);
            j5mVar.k("type", false);
            j5mVar.k("code", false);
            j5mVar.k("delay", false);
            descriptor = j5mVar;
        }

        @Override // defpackage.p3d
        @NotNull
        public final t9f[] childSerializers() {
            return new t9f[]{N1.d[0], tkr.a, rsa.a};
        }

        @Override // defpackage.t9f
        public final Object deserialize(eg7 eg7Var) {
            int i;
            c cVar;
            String str;
            nsa nsaVar;
            eg7Var.getClass();
            j5m j5mVar = descriptor;
            tq5 c = eg7Var.c(j5mVar);
            t9f[] t9fVarArr = N1.d;
            c cVar2 = null;
            if (c.m()) {
                cVar = (c) c.z(j5mVar, 0, t9fVarArr[0], null);
                str = c.g(j5mVar, 1);
                nsaVar = (nsa) c.z(j5mVar, 2, rsa.a, null);
                i = 7;
            } else {
                boolean z = true;
                int i2 = 0;
                String str2 = null;
                nsa nsaVar2 = null;
                while (z) {
                    int w = c.w(j5mVar);
                    if (w == -1) {
                        z = false;
                    } else if (w == 0) {
                        cVar2 = (c) c.z(j5mVar, 0, t9fVarArr[0], cVar2);
                        i2 |= 1;
                    } else if (w == 1) {
                        str2 = c.g(j5mVar, 1);
                        i2 |= 2;
                    } else {
                        if (w != 2) {
                            l1j.g(w);
                            return null;
                        }
                        nsaVar2 = (nsa) c.z(j5mVar, 2, rsa.a, nsaVar2);
                        i2 |= 4;
                    }
                }
                i = i2;
                cVar = cVar2;
                str = str2;
                nsaVar = nsaVar2;
            }
            c.b(j5mVar);
            return new N1(i, cVar, str, nsaVar, null, null);
        }

        @Override // defpackage.t9f
        @NotNull
        public final mhp getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.t9f
        public final void serialize(l6b l6bVar, Object obj) {
            N1 n1 = (N1) obj;
            l6bVar.getClass();
            n1.getClass();
            j5m j5mVar = descriptor;
            wq5 c = l6bVar.c(j5mVar);
            c.k(j5mVar, 0, N1.d[0], n1.a);
            c.p(j5mVar, 1, n1.b);
            c.k(j5mVar, 2, rsa.a, new nsa(n1.c));
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
        ExpectCode,
        /* JADX INFO: Fake field, exist only in values array */
        Failure
    }

    static {
        c[] values = c.values();
        values.getClass();
        d = new t9f[]{new udb("ru.kinopoisk.tvauth.mock.ConfirmCodeRule.Type", values), null, null};
    }

    @vx7
    public N1(int i, c cVar, String str, nsa nsaVar, xhp xhpVar, DefaultConstructorMarker defaultConstructorMarker) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, a.a.getDescriptor());
            throw null;
        }
        this.a = cVar;
        this.b = str;
        this.c = nsaVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N1)) {
            return false;
        }
        N1 n1 = (N1) obj;
        return this.a == n1.a && Intrinsics.d(this.b, n1.b) && nsa.e(this.c, n1.c);
    }

    public final int hashCode() {
        int a2 = C1292y0.a(this.b, this.a.hashCode() * 31, 31);
        long j = this.c;
        msa msaVar = nsa.b;
        return Long.hashCode(j) + a2;
    }

    @NotNull
    public final String toString() {
        c cVar = this.a;
        String str = this.b;
        String t = nsa.t(this.c);
        StringBuilder sb = new StringBuilder("ConfirmCodeRule(type=");
        sb.append(cVar);
        sb.append(", code=");
        sb.append(str);
        sb.append(", delay=");
        return su4.o(sb, t, ")");
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/N1$b;", "", "<init>", "()V", "Lt9f;", "Lru/kinopoisk/sdk/easylogin/internal/N1;", "serializer", "()Lt9f;", "android_easylogin_tvauth_mobileimpl"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.N1$b, reason: from kotlin metadata */
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

    public N1(c cVar, String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
        cVar.getClass();
        str.getClass();
        this.a = cVar;
        this.b = str;
        this.c = j;
    }
}
