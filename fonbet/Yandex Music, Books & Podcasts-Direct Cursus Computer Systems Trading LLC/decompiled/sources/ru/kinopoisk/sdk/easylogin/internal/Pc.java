package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.eg7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.mvg;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tq5;
import defpackage.u7g;
import defpackage.vhp;
import defpackage.vx7;
import defpackage.wq5;
import defpackage.xhp;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u000b2\u00060\u0001j\u0002`\u0002:\u0002\f\rB#\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/Pc;", "Ljava/io/Serializable;", "Lru/kinopoisk/shared/common/core/JvmSerializable;", "", "seen0", "", "raw", "Lxhp;", "serializationConstructorMarker", "<init>", "(IJLxhp;)V", "Companion", "a", "b", "libs_shared_common_models"}, k = 1, mv = {2, 0, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vhp
/* loaded from: classes5.dex */
public final /* data */ class Pc implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public final long a;

    @vx7
    public /* synthetic */ class a implements p3d {

        @NotNull
        public static final a a;

        @NotNull
        private static final mhp descriptor;

        static {
            a aVar = new a();
            a = aVar;
            j5m j5mVar = new j5m("ru.kinopoisk.shared.common.models.user.UserPassportId", aVar, 1);
            j5mVar.k("raw", false);
            descriptor = j5mVar;
        }

        @Override // defpackage.p3d
        @NotNull
        public final t9f[] childSerializers() {
            return new t9f[]{mvg.a};
        }

        @Override // defpackage.t9f
        public final Object deserialize(eg7 eg7Var) {
            long j;
            eg7Var.getClass();
            mhp mhpVar = descriptor;
            tq5 c = eg7Var.c(mhpVar);
            int i = 1;
            if (c.m()) {
                j = c.q(mhpVar, 0);
            } else {
                long j2 = 0;
                boolean z = true;
                int i2 = 0;
                while (z) {
                    int w = c.w(mhpVar);
                    if (w == -1) {
                        z = false;
                    } else {
                        if (w != 0) {
                            l1j.g(w);
                            return null;
                        }
                        j2 = c.q(mhpVar, 0);
                        i2 = 1;
                    }
                }
                j = j2;
                i = i2;
            }
            c.b(mhpVar);
            return new Pc(i, j, null);
        }

        @Override // defpackage.t9f
        @NotNull
        public final mhp getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.t9f
        public final void serialize(l6b l6bVar, Object obj) {
            Pc pc = (Pc) obj;
            l6bVar.getClass();
            pc.getClass();
            mhp mhpVar = descriptor;
            wq5 c = l6bVar.c(mhpVar);
            c.g(mhpVar, 0, pc.a);
            c.b(mhpVar);
        }

        @Override // defpackage.p3d
        @NotNull
        public final t9f[] typeParametersSerializers() {
            return ild.k;
        }
    }

    public /* synthetic */ Pc(int i, long j, xhp xhpVar) {
        if (1 == (i & 1)) {
            this.a = j;
        } else {
            u7g.V(i, 1, a.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Pc) && this.a == ((Pc) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    @NotNull
    public final String toString() {
        return String.valueOf(this.a);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/Pc$b;", "", "<init>", "()V", "Lt9f;", "Lru/kinopoisk/sdk/easylogin/internal/Pc;", "serializer", "()Lt9f;", "libs_shared_common_models"}, k = 1, mv = {2, 0, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.Pc$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final t9f serializer() {
            return a.a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Pc(long j) {
        this.a = j;
    }
}
