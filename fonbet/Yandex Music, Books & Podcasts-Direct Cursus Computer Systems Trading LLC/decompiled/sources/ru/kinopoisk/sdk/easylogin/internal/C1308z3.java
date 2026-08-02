package ru.kinopoisk.sdk.easylogin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.eg7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.p3d;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.u7g;
import defpackage.vhp;
import defpackage.vx7;
import defpackage.w3f;
import defpackage.w4f;
import defpackage.wq5;
import defpackage.x3f;
import defpackage.xhp;
import defpackage.z4f;
import defpackage.z7o;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import timber.log.Timber;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.z3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1308z3 {
    public final SharedPreferences a;
    public final SharedPreferences b;

    @NotNull
    public final w3f c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/z3$a;", "", "", "CONFIG_PREFERENCES_NAME", "Ljava/lang/String;", "ENCODED_EXPS_PREFERENCES_NAME", "EXPS_CACHE_SLUG", "META_PREFERENCES_NAME", "TAG", "android_config_remoteconfig_impl"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.z3$a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
    }

    public C1308z3(@NotNull Context context) {
        context.getClass();
        this.a = context.getSharedPreferences("kp_exps_meta_cache", 0);
        this.b = context.getSharedPreferences("kp_exps_config_cache", 0);
        context.getSharedPreferences("kp_exps_encoded", 0);
        this.c = x3f.d;
    }

    public final b a(String str) {
        Object t7oVar;
        w3f w3fVar = this.c;
        try {
            r7o r7oVar = z7o.b;
            w3fVar.getClass();
            t7oVar = (b) w3fVar.b(b.INSTANCE.serializer(), str);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a2 = z7o.a(t7oVar);
        if (a2 != null) {
            Timber.INSTANCE.tag("ExpsCacheStorage").e(a2, "Failed to decode to ExpValue %s", str);
        }
        if (t7oVar instanceof t7o) {
            t7oVar = null;
        }
        return (b) t7oVar;
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0083\b\u0018\u0000 \f2\u00020\u0001:\u0002\r\u000eB/\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/z3$b;", "", "", "seen1", "", "expName", "Lw4f;", Constants.KEY_VALUE, "Lxhp;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lw4f;Lxhp;)V", "Companion", "a", "b", "android_config_remoteconfig_impl"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    @vhp
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.z3$b */
    public static final /* data */ class b {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public final String a;

        @NotNull
        public final w4f b;

        @vx7
        /* renamed from: ru.kinopoisk.sdk.easylogin.internal.z3$b$a */
        public static final class a implements p3d {

            @NotNull
            public static final a a;
            private static final /* synthetic */ j5m descriptor;

            static {
                a aVar = new a();
                a = aVar;
                j5m j5mVar = new j5m("ru.kinopoisk.remoteconfig.datasource.ExpsCacheStorage.ExpValue", aVar, 2);
                j5mVar.k("expName", false);
                j5mVar.k(Constants.KEY_VALUE, false);
                descriptor = j5mVar;
            }

            @Override // defpackage.p3d
            @NotNull
            public final t9f[] childSerializers() {
                return new t9f[]{tkr.a, z4f.a};
            }

            @Override // defpackage.t9f
            public final Object deserialize(eg7 eg7Var) {
                String str;
                w4f w4fVar;
                int i;
                eg7Var.getClass();
                j5m j5mVar = descriptor;
                tq5 c = eg7Var.c(j5mVar);
                xhp xhpVar = null;
                if (c.m()) {
                    str = c.g(j5mVar, 0);
                    w4fVar = (w4f) c.z(j5mVar, 1, z4f.a, null);
                    i = 3;
                } else {
                    boolean z = true;
                    int i2 = 0;
                    str = null;
                    w4f w4fVar2 = null;
                    while (z) {
                        int w = c.w(j5mVar);
                        if (w == -1) {
                            z = false;
                        } else if (w == 0) {
                            str = c.g(j5mVar, 0);
                            i2 |= 1;
                        } else {
                            if (w != 1) {
                                l1j.g(w);
                                return null;
                            }
                            w4fVar2 = (w4f) c.z(j5mVar, 1, z4f.a, w4fVar2);
                            i2 |= 2;
                        }
                    }
                    w4fVar = w4fVar2;
                    i = i2;
                }
                c.b(j5mVar);
                return new b(i, str, w4fVar, xhpVar);
            }

            @Override // defpackage.t9f
            @NotNull
            public final mhp getDescriptor() {
                return descriptor;
            }

            @Override // defpackage.t9f
            public final void serialize(l6b l6bVar, Object obj) {
                b bVar = (b) obj;
                l6bVar.getClass();
                bVar.getClass();
                j5m j5mVar = descriptor;
                wq5 c = l6bVar.c(j5mVar);
                c.p(j5mVar, 0, bVar.a);
                c.k(j5mVar, 1, z4f.a, bVar.b);
                c.b(j5mVar);
            }

            @Override // defpackage.p3d
            @NotNull
            public final t9f[] typeParametersSerializers() {
                return ild.k;
            }
        }

        @vx7
        public /* synthetic */ b(int i, String str, w4f w4fVar, xhp xhpVar) {
            if (3 != (i & 3)) {
                u7g.V(i, 3, a.a.getDescriptor());
                throw null;
            }
            this.a = str;
            this.b = w4fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.a, bVar.a) && Intrinsics.d(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "ExpValue(expName=" + this.a + ", value=" + this.b + ")";
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/z3$b$b;", "", "<init>", "()V", "Lt9f;", "Lru/kinopoisk/sdk/easylogin/internal/z3$b;", "serializer", "()Lt9f;", "android_config_remoteconfig_impl"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
        /* renamed from: ru.kinopoisk.sdk.easylogin.internal.z3$b$b, reason: collision with other inner class name and from kotlin metadata */
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
}
