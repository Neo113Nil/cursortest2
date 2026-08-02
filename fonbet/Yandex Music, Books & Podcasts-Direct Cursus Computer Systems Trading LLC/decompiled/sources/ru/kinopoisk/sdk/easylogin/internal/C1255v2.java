package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.cjp;
import defpackage.qcv;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.uif;
import defpackage.z7o;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/v2;", "Lqcv;", "b", "c", "libs_android_pairing_impl"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.v2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1255v2 extends qcv {

    @NotNull
    public final c a;

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.v2$a */
    public static final class a implements c {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/v2$b;", "", "", "TAG", "Ljava/lang/String;", "libs_android_pairing_impl"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.v2$b */
    public static final class b {
        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.v2$c */
    public interface c {
        default void a(@NotNull String str) {
            str.getClass();
        }
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.v2$d */
    public static final class d extends uif implements Function1<c, Unit> {
        public d(int i, String str, boolean z) {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            c cVar = (c) obj;
            cVar.getClass();
            cVar.getClass();
            return Unit.a;
        }
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.v2$e */
    public static final class e extends uif implements Function1<c, Unit> {
        public e(Exception exc) {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            c cVar = (c) obj;
            cVar.getClass();
            cVar.getClass();
            return Unit.a;
        }
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.v2$f */
    public static final class f extends uif implements Function1<c, Unit> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            c cVar = (c) obj;
            cVar.getClass();
            cVar.a(this.a);
            return Unit.a;
        }
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.v2$g */
    public static final class g extends uif implements Function1<c, Unit> {
        public static final g a = new g();

        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            c cVar = (c) obj;
            cVar.getClass();
            cVar.getClass();
            return Unit.a;
        }
    }

    static {
        new b(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1255v2(@NotNull String str, @NotNull c cVar) {
        super(new URI(str));
        str.getClass();
        cVar.getClass();
        this.a = cVar;
        setReuseAddr(true);
    }

    public static void a(c cVar, String str, Function1 function1) {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            function1.invoke(cVar);
            t7oVar = Unit.a;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a2 = z7o.a(t7oVar);
        if (a2 != null) {
            Timber.INSTANCE.tag("CustomWebSocketClient").w(a2, "%s failed", str);
        }
    }

    @Override // defpackage.qcv
    public final void onClose(int i, String str, boolean z) {
        Timber.INSTANCE.tag("CustomWebSocketClient").v("onClose: %s, %s, %s", Integer.valueOf(i), str, Boolean.valueOf(z));
        a(this.a, "onClose", new d(i, str, z));
    }

    @Override // defpackage.qcv
    public final void onError(Exception exc) {
        Timber.INSTANCE.tag("CustomWebSocketClient").v("onError %s", exc);
        a(this.a, "onError", new e(exc));
    }

    @Override // defpackage.qcv
    public final void onMessage(ByteBuffer byteBuffer) {
        Object t7oVar;
        if (byteBuffer == null) {
            Timber.INSTANCE.tag("CustomWebSocketClient").i("Got bytes message but it was empty", new Object[0]);
            return;
        }
        Timber.INSTANCE.tag("CustomWebSocketClient").v("onMessage %s", byteBuffer);
        try {
            r7o r7oVar = z7o.b;
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            Charset defaultCharset = Charset.defaultCharset();
            defaultCharset.getClass();
            t7oVar = new String(bArr, defaultCharset);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a2 = z7o.a(t7oVar);
        if (a2 != null) {
            Timber.INSTANCE.tag("CustomWebSocketClient").w(a2, "Failed to convert bytes to string", new Object[0]);
        }
        if (t7oVar instanceof t7o) {
            return;
        }
        onMessage((String) t7oVar);
    }

    @Override // defpackage.qcv
    public final void onOpen(cjp cjpVar) {
        Timber.INSTANCE.tag("CustomWebSocketClient").v("onOpen", new Object[0]);
        a(this.a, "onOpen", g.a);
    }

    public /* synthetic */ C1255v2(String str, c cVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new a() : cVar);
    }

    @Override // defpackage.qcv
    public final void onMessage(String str) {
        if (str == null) {
            Timber.INSTANCE.tag("CustomWebSocketClient").i("Got string message but it was empty", new Object[0]);
        } else {
            Timber.INSTANCE.tag("CustomWebSocketClient").v("onMessage %s", str);
            a(this.a, "onMessage", new f(str));
        }
    }
}
