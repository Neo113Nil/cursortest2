package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.eg7;
import defpackage.ff7;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.p3d;
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

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \u000e*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u000f\u0010\u0011B?\b\u0011\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/f1;", "T", "", "", "seen1", "Lru/kinopoisk/sdk/easylogin/internal/f1$c;", "status", "", "requestId", "payload", "Lxhp;", "serializationConstructorMarker", "<init>", "(ILru/kinopoisk/sdk/easylogin/internal/f1$c;Ljava/lang/String;Ljava/lang/Object;Lxhp;)V", "Companion", "a", "b", "c", "android_cast_connectivitymobile_core"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vhp
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.f1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C1032f1<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final t9f[] d = {up6.q("ru.kinopoisk.cast.interaction.CommandResponse.Status", c.values(), new String[]{"Success", "Failure", "Unsupported"}, new Annotation[][]{null, null, null}), null, null};

    @NotNull
    public static final j5m e;

    @NotNull
    public final c a;

    @NotNull
    public final String b;
    public final T c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0017\b\u0017\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"ru/kinopoisk/cast/interaction/CommandResponse.$serializer", "T", "Lp3d;", "Lru/kinopoisk/sdk/easylogin/internal/f1;", "Lt9f;", "typeSerial0", "<init>", "(Lt9f;)V", "android_cast_connectivitymobile_core"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    @vx7
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.f1$a */
    public static final class a<T> implements p3d {
        public final /* synthetic */ t9f a;
        private final /* synthetic */ j5m descriptor;

        @vx7
        public a(t9f t9fVar) {
            t9fVar.getClass();
            j5m j5mVar = new j5m("ru.kinopoisk.cast.interaction.CommandResponse", this, 3);
            j5mVar.k("status", false);
            j5mVar.k("requestId", false);
            j5mVar.k("payload", true);
            this.descriptor = j5mVar;
            this.a = t9fVar;
        }

        @Override // defpackage.p3d
        @NotNull
        public final t9f[] childSerializers() {
            return new t9f[]{C1032f1.d[0], tkr.a, ff7.C(this.a)};
        }

        @Override // defpackage.t9f
        public final Object deserialize(eg7 eg7Var) {
            int i;
            c cVar;
            String str;
            Object obj;
            eg7Var.getClass();
            j5m j5mVar = this.descriptor;
            tq5 c = eg7Var.c(j5mVar);
            t9f[] t9fVarArr = C1032f1.d;
            c cVar2 = null;
            if (c.m()) {
                cVar = (c) c.z(j5mVar, 0, t9fVarArr[0], null);
                str = c.g(j5mVar, 1);
                obj = c.n(j5mVar, 2, this.a, null);
                i = 7;
            } else {
                boolean z = true;
                int i2 = 0;
                String str2 = null;
                Object obj2 = null;
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
                        obj2 = c.n(j5mVar, 2, this.a, obj2);
                        i2 |= 4;
                    }
                }
                i = i2;
                cVar = cVar2;
                str = str2;
                obj = obj2;
            }
            c.b(j5mVar);
            return new C1032f1(i, cVar, str, obj, (xhp) null);
        }

        @Override // defpackage.t9f
        @NotNull
        public final mhp getDescriptor() {
            return this.descriptor;
        }

        @Override // defpackage.t9f
        public final void serialize(l6b l6bVar, Object obj) {
            C1032f1 c1032f1 = (C1032f1) obj;
            l6bVar.getClass();
            c1032f1.getClass();
            j5m j5mVar = this.descriptor;
            wq5 c = l6bVar.c(j5mVar);
            t9f t9fVar = this.a;
            c.k(j5mVar, 0, C1032f1.d[0], c1032f1.a);
            c.p(j5mVar, 1, c1032f1.b);
            if (c.e(j5mVar) || c1032f1.c != null) {
                c.q(j5mVar, 2, t9fVar, c1032f1.c);
            }
            c.b(j5mVar);
        }

        @Override // defpackage.p3d
        @NotNull
        public final t9f[] typeParametersSerializers() {
            return new t9f[]{this.a};
        }
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.f1$c */
    public enum c {
        Success,
        /* JADX INFO: Fake field, exist only in values array */
        Failure,
        /* JADX INFO: Fake field, exist only in values array */
        Unsupported
    }

    static {
        j5m j5mVar = new j5m("ru.kinopoisk.cast.interaction.CommandResponse", null, 3);
        j5mVar.k("status", false);
        j5mVar.k("requestId", false);
        j5mVar.k("payload", true);
        e = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @vx7
    public /* synthetic */ C1032f1(int i, c cVar, String str, Object obj, xhp xhpVar) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, e);
            throw null;
        }
        this.a = cVar;
        this.b = str;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = obj;
        }
    }

    @NotNull
    /* renamed from: a, reason: from getter */
    public final c getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1032f1)) {
            return false;
        }
        C1032f1 c1032f1 = (C1032f1) obj;
        return this.a == c1032f1.a && Intrinsics.d(this.b, c1032f1.b) && Intrinsics.d(this.c, c1032f1.c);
    }

    public final int hashCode() {
        int a2 = C1292y0.a(this.b, this.a.hashCode() * 31, 31);
        T t = this.c;
        return a2 + (t == null ? 0 : t.hashCode());
    }

    @NotNull
    public final String toString() {
        return "CommandResponse(status=" + this.a + ", requestId=" + this.b + ", payload=" + this.c + ")";
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0005\"\u0004\b\u0001\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/f1$b;", "", "<init>", "()V", "T0", "Lt9f;", "typeSerial0", "Lru/kinopoisk/sdk/easylogin/internal/f1;", "serializer", "(Lt9f;)Lt9f;", "android_cast_connectivitymobile_core"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.f1$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T0> t9f serializer(@NotNull t9f typeSerial0) {
            typeSerial0.getClass();
            return new a(typeSerial0);
        }

        public Companion() {
        }
    }

    public C1032f1(@NotNull c cVar, @NotNull String str, T t) {
        cVar.getClass();
        str.getClass();
        this.a = cVar;
        this.b = str;
        this.c = t;
    }

    public /* synthetic */ C1032f1(c cVar, String str, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, str, (i & 4) != 0 ? null : obj);
    }
}
