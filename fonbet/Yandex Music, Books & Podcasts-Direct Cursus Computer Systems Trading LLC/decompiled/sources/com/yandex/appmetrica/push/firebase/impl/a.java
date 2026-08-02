package com.yandex.appmetrica.push.firebase.impl;

import android.content.Context;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.yandex.metrica.push.common.CoreConstants;
import com.yandex.metrica.push.common.core.PushServiceController;
import com.yandex.metrica.push.common.utils.PublicLogger;
import com.yandex.metrica.push.common.utils.TrackersHub;
import defpackage.aec;
import defpackage.arf;
import defpackage.btf;
import defpackage.nec;
import defpackage.onx;
import defpackage.pmd;
import defpackage.qmd;
import defpackage.uif;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class a implements PushServiceController {

    @NotNull
    private final arf a;

    @NotNull
    private final arf b;
    private FirebaseMessaging c;

    @NotNull
    private final Context d;

    public static final class b extends uif implements Function0<String> {
        final /* synthetic */ i a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar) {
            super(0);
            this.a = iVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String e = this.a.e();
            e.getClass();
            return e;
        }
    }

    public static final class c<TResult> implements OnCompleteListener<String> {
        final /* synthetic */ CountDownLatch a;

        public c(CountDownLatch countDownLatch) {
            this.a = countDownLatch;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task<String> task) {
            this.a.countDown();
        }
    }

    public static final class d extends uif implements Function0<h> {
        final /* synthetic */ i a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(i iVar) {
            super(0);
            this.a = iVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h invoke() {
            h a = this.a.a();
            a.getClass();
            return a;
        }
    }

    public a(@NotNull Context context, @NotNull i iVar) {
        context.getClass();
        iVar.getClass();
        this.d = context;
        this.a = btf.b(new d(iVar));
        this.b = btf.b(new b(iVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final C0011a a(FirebaseMessaging firebaseMessaging) {
        TimeUnit timeUnit;
        int i = 1;
        Throwable th = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        try {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            onx d2 = firebaseMessaging.d();
            d2.getClass();
            d2.addOnCompleteListener(new c(countDownLatch));
            timeUnit = com.yandex.appmetrica.push.firebase.impl.b.a;
            if (!countDownLatch.await(10L, timeUnit)) {
                throw new TimeoutException("token retrieval timeout");
            }
            if (d2.l()) {
                return new C0011a((String) d2.h(), th, 2, objArr5 == true ? 1 : 0);
            }
            return new C0011a(objArr4 == true ? 1 : 0, d2.g(), i, objArr3 == true ? 1 : 0);
        } catch (Throwable th2) {
            return new C0011a(objArr2 == true ? 1 : 0, th2, i, objArr == true ? 1 : 0);
        }
    }

    private final boolean d() {
        try {
            return pmd.e.b(this.d, qmd.a) == 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    @NotNull
    public final String b() {
        return (String) this.b.getValue();
    }

    @NotNull
    public final h c() {
        return (h) this.a.getValue();
    }

    @Override // com.yandex.metrica.push.common.core.PushServiceController
    @NotNull
    public String getTitle() {
        return CoreConstants.Transport.FIREBASE;
    }

    @Override // com.yandex.metrica.push.common.core.PushServiceController
    public String getToken() {
        FirebaseMessaging firebaseMessaging = this.c;
        if (firebaseMessaging == null) {
            TrackersHub.getInstance().reportEvent("Attempt to get push token failed since firebaseMessaging is null");
            return null;
        }
        C0011a a = a(firebaseMessaging);
        if (a.c()) {
            return a.b();
        }
        PublicLogger.e(a.a(), "Failed to get token, will retry once", new Object[0]);
        C0011a a2 = a(firebaseMessaging);
        if (a2.c()) {
            return a2.b();
        }
        PublicLogger.e(a2.a(), "Failed to get token after retry", new Object[0]);
        TrackersHub.getInstance().reportError("Attempt to get push token failed", a2.a());
        return null;
    }

    @Override // com.yandex.metrica.push.common.core.PushServiceController
    public boolean register() {
        if (!d()) {
            PublicLogger.w("Google play services not available", new Object[0]);
            TrackersHub.getInstance().reportEvent("Google play services not available");
            return false;
        }
        nec c2 = c().c();
        c2.getClass();
        this.c = (FirebaseMessaging) a(c2).b(FirebaseMessaging.class);
        return true;
    }

    /* renamed from: com.yandex.appmetrica.push.firebase.impl.a$a, reason: collision with other inner class name */
    public static final class C0011a {

        @NotNull
        private final arf a;
        private final String b;
        private final Throwable c;

        /* renamed from: com.yandex.appmetrica.push.firebase.impl.a$a$a, reason: collision with other inner class name */
        public static final class C0012a extends uif implements Function0<Boolean> {
            public C0012a() {
                super(0);
            }

            public final boolean a() {
                return C0011a.this.a() == null && C0011a.this.b() != null;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                return Boolean.valueOf(a());
            }
        }

        public C0011a(String str, Throwable th) {
            this.b = str;
            this.c = th;
            this.a = btf.b(new C0012a());
        }

        public final Throwable a() {
            return this.c;
        }

        public final String b() {
            return this.b;
        }

        public final boolean c() {
            return ((Boolean) this.a.getValue()).booleanValue();
        }

        public /* synthetic */ C0011a(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context) {
        this(context, new f(context));
        context.getClass();
    }

    @NotNull
    public aec a(@NotNull nec necVar) {
        necVar.getClass();
        try {
            aec.h(necVar, this.d, "[DEFAULT]");
        } catch (Throwable unused) {
        }
        return aec.d();
    }

    @NotNull
    public final Context a() {
        return this.d;
    }
}
