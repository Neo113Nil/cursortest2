package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.btf;
import defpackage.e5b;
import defpackage.r7o;
import defpackage.t7g;
import defpackage.t7o;
import defpackage.uif;
import defpackage.z7o;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Charsets;
import timber.log.Timber;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.r2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1200r2 {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/r2$a;", "", "", "COMMAND_CAT_DIR", "Ljava/lang/String;", "CPU_INFO_DIR", "TAG", "libs_android_deviceinfo_impl"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.r2$a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.r2$b */
    public static final class b extends uif implements Function0<Map<String, ? extends String>> {
        public b() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            t7o t7oVar;
            C1200r2 c1200r2 = C1200r2.this;
            try {
                r7o r7oVar = z7o.b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                InputStream inputStream = new ProcessBuilder("/system/bin/cat", "/proc/cpuinfo").start().getInputStream();
                try {
                    inputStream.getClass();
                    t7g.p(new InputStreamReader(inputStream, Charsets.UTF_8), new C1214s2(c1200r2, linkedHashMap));
                    inputStream.close();
                    t7oVar = linkedHashMap;
                } finally {
                }
            } catch (Throwable th) {
                r7o r7oVar2 = z7o.b;
                t7oVar = new t7o(th);
            }
            Throwable a = z7o.a(t7oVar);
            if (a != null) {
                Timber.INSTANCE.tag("CpuDataProvider").e(a);
            }
            e5b e5bVar = e5b.a;
            e5bVar.getClass();
            boolean z = t7oVar instanceof t7o;
            Object obj = t7oVar;
            if (z) {
                obj = e5bVar;
            }
            return (Map) obj;
        }
    }

    static {
        new a(null);
    }

    public C1200r2() {
        btf.b(new b());
    }
}
