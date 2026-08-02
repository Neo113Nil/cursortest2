package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.eg7;
import defpackage.hrg;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.u7g;
import defpackage.vhp;
import defpackage.vx7;
import defpackage.wq5;
import defpackage.xhp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \n2\u00020\u0001:\u0002\u000b\fB%\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/Z5;", "", "", "seen1", "", "appId", "Lxhp;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lxhp;)V", "Companion", "a", "b", "android_cast_connectivitymobile_lg"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vhp
/* loaded from: classes5.dex */
public final /* data */ class Z5 {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Z5 b = new Z5();

    @NotNull
    public final String a;

    @vx7
    public static final class a implements p3d {

        @NotNull
        public static final a a;
        private static final /* synthetic */ j5m descriptor;

        static {
            a aVar = new a();
            a = aVar;
            j5m j5mVar = new j5m("ru.kinopoisk.cast.lg.interaction.LgTvInteractorConfig", aVar, 1);
            j5mVar.k("appId", false);
            descriptor = j5mVar;
        }

        @Override // defpackage.p3d
        @NotNull
        public final t9f[] childSerializers() {
            return new t9f[]{tkr.a};
        }

        @Override // defpackage.t9f
        public final Object deserialize(eg7 eg7Var) {
            String str;
            eg7Var.getClass();
            j5m j5mVar = descriptor;
            tq5 c = eg7Var.c(j5mVar);
            int i = 1;
            xhp xhpVar = null;
            if (c.m()) {
                str = c.g(j5mVar, 0);
            } else {
                boolean z = true;
                int i2 = 0;
                str = null;
                while (z) {
                    int w = c.w(j5mVar);
                    if (w == -1) {
                        z = false;
                    } else {
                        if (w != 0) {
                            l1j.g(w);
                            return null;
                        }
                        str = c.g(j5mVar, 0);
                        i2 = 1;
                    }
                }
                i = i2;
            }
            c.b(j5mVar);
            return new Z5(i, str, xhpVar);
        }

        @Override // defpackage.t9f
        @NotNull
        public final mhp getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.t9f
        public final void serialize(l6b l6bVar, Object obj) {
            Z5 z5 = (Z5) obj;
            l6bVar.getClass();
            z5.getClass();
            j5m j5mVar = descriptor;
            wq5 c = l6bVar.c(j5mVar);
            c.p(j5mVar, 0, z5.a);
            c.b(j5mVar);
        }

        @Override // defpackage.p3d
        @NotNull
        public final t9f[] typeParametersSerializers() {
            return ild.k;
        }
    }

    @vx7
    public /* synthetic */ Z5(int i, String str, xhp xhpVar) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            u7g.V(i, 1, a.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Z5) && Intrinsics.d(this.a, ((Z5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return hrg.q("LgTvInteractorConfig(appId=", this.a, ")");
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/Z5$b;", "", "<init>", "()V", "Lt9f;", "Lru/kinopoisk/sdk/easylogin/internal/Z5;", "serializer", "()Lt9f;", "android_cast_connectivitymobile_lg"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.Z5$b, reason: from kotlin metadata */
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

    public Z5() {
        this.a = "com.685631.3411";
    }
}
