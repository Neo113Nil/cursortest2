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
import defpackage.t9f;
import defpackage.tq5;
import defpackage.u7g;
import defpackage.udb;
import defpackage.vhp;
import defpackage.vx7;
import defpackage.wq5;
import defpackage.xhp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0003\u000e\u000f\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0011"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/T4;", "", "Lru/kinopoisk/sdk/easylogin/internal/T4$c;", "type", "Lnsa;", "delay", "<init>", "(Lru/kinopoisk/sdk/easylogin/internal/T4$c;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen1", "Lxhp;", "serializationConstructorMarker", "(ILru/kinopoisk/sdk/easylogin/internal/T4$c;Lnsa;Lxhp;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Companion", "a", "b", "c", "android_easylogin_tvauth_mobileimpl"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vhp
/* loaded from: classes5.dex */
public final /* data */ class T4 {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final t9f[] c;

    @NotNull
    public final c a;
    public final long b;

    @vx7
    public static final class a implements p3d {

        @NotNull
        public static final a a;
        private static final /* synthetic */ j5m descriptor;

        static {
            a aVar = new a();
            a = aVar;
            j5m j5mVar = new j5m("ru.kinopoisk.tvauth.mock.InstallAppRule", aVar, 2);
            j5mVar.k("type", false);
            j5mVar.k("delay", false);
            descriptor = j5mVar;
        }

        @Override // defpackage.p3d
        @NotNull
        public final t9f[] childSerializers() {
            return new t9f[]{T4.c[0], rsa.a};
        }

        @Override // defpackage.t9f
        public final Object deserialize(eg7 eg7Var) {
            int i;
            c cVar;
            nsa nsaVar;
            eg7Var.getClass();
            j5m j5mVar = descriptor;
            tq5 c = eg7Var.c(j5mVar);
            t9f[] t9fVarArr = T4.c;
            c cVar2 = null;
            if (c.m()) {
                cVar = (c) c.z(j5mVar, 0, t9fVarArr[0], null);
                nsaVar = (nsa) c.z(j5mVar, 1, rsa.a, null);
                i = 3;
            } else {
                boolean z = true;
                int i2 = 0;
                nsa nsaVar2 = null;
                while (z) {
                    int w = c.w(j5mVar);
                    if (w == -1) {
                        z = false;
                    } else if (w == 0) {
                        cVar2 = (c) c.z(j5mVar, 0, t9fVarArr[0], cVar2);
                        i2 |= 1;
                    } else {
                        if (w != 1) {
                            l1j.g(w);
                            return null;
                        }
                        nsaVar2 = (nsa) c.z(j5mVar, 1, rsa.a, nsaVar2);
                        i2 |= 2;
                    }
                }
                i = i2;
                cVar = cVar2;
                nsaVar = nsaVar2;
            }
            c.b(j5mVar);
            return new T4(i, cVar, nsaVar, null, null);
        }

        @Override // defpackage.t9f
        @NotNull
        public final mhp getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.t9f
        public final void serialize(l6b l6bVar, Object obj) {
            T4 t4 = (T4) obj;
            l6bVar.getClass();
            t4.getClass();
            j5m j5mVar = descriptor;
            wq5 c = l6bVar.c(j5mVar);
            c.k(j5mVar, 0, T4.c[0], t4.a);
            c.k(j5mVar, 1, rsa.a, new nsa(t4.b));
            c.b(j5mVar);
        }

        @Override // defpackage.p3d
        @NotNull
        public final t9f[] typeParametersSerializers() {
            return ild.k;
        }
    }

    public enum c {
        Success,
        /* JADX INFO: Fake field, exist only in values array */
        Failure
    }

    static {
        c[] values = c.values();
        values.getClass();
        c = new t9f[]{new udb("ru.kinopoisk.tvauth.mock.InstallAppRule.Type", values), null};
    }

    @vx7
    public T4(int i, c cVar, nsa nsaVar, xhp xhpVar, DefaultConstructorMarker defaultConstructorMarker) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, a.a.getDescriptor());
            throw null;
        }
        this.a = cVar;
        this.b = nsaVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T4)) {
            return false;
        }
        T4 t4 = (T4) obj;
        return this.a == t4.a && nsa.e(this.b, t4.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        long j = this.b;
        msa msaVar = nsa.b;
        return Long.hashCode(j) + hashCode;
    }

    @NotNull
    public final String toString() {
        return "InstallAppRule(type=" + this.a + ", delay=" + nsa.t(this.b) + ")";
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/T4$b;", "", "<init>", "()V", "Lt9f;", "Lru/kinopoisk/sdk/easylogin/internal/T4;", "serializer", "()Lt9f;", "android_easylogin_tvauth_mobileimpl"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.T4$b, reason: from kotlin metadata */
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

    public T4(c cVar, long j, DefaultConstructorMarker defaultConstructorMarker) {
        cVar.getClass();
        this.a = cVar;
        this.b = j;
    }
}
