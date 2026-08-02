package com.appsflyer.internal;

import android.content.Intent;
import android.os.Parcelable;
import com.appsflyer.AFLogger;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.ern;
import defpackage.f9f;
import defpackage.hrg;
import defpackage.r7o;
import defpackage.uif;
import defpackage.xz0;
import defpackage.z7o;
import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFj1pSDK {

    @NotNull
    final Intent getCurrencyIso4217Code;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getMediationNetwork", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: com.appsflyer.internal.AFj1pSDK$1, reason: invalid class name */
    public static final class AnonymousClass1 extends uif implements Function0<String> {
        private /* synthetic */ String $getMonetizationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(0);
            this.$getMonetizationNetwork = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return AFj1pSDK.this.getCurrencyIso4217Code.getStringExtra(this.$getMonetizationNetwork);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/Intent;", "I_", "()Landroid/content/Intent;"}, k = 3, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: com.appsflyer.internal.AFj1pSDK$2, reason: invalid class name */
    public static final class AnonymousClass2 extends uif implements Function0<Intent> {
        private /* synthetic */ String $AFAdRevenueData;
        private /* synthetic */ long $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, long j) {
            super(0);
            this.$AFAdRevenueData = str;
            this.$getRevenue = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: I_, reason: merged with bridge method [inline-methods] */
        public final Intent invoke() {
            return AFj1pSDK.this.getCurrencyIso4217Code.putExtra(this.$AFAdRevenueData, this.$getRevenue);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getMonetizationNetwork", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: com.appsflyer.internal.AFj1pSDK$3, reason: invalid class name */
    public static final class AnonymousClass3 extends uif implements Function0<Boolean> {
        private /* synthetic */ String $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str) {
            super(0);
            this.$getRevenue = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(AFj1pSDK.this.getCurrencyIso4217Code.hasExtra(this.$getRevenue));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Parcelable;", "T", "H_", "()Landroid/os/Parcelable;"}, k = 3, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: com.appsflyer.internal.AFj1pSDK$4, reason: invalid class name */
    public static final class AnonymousClass4<T> extends uif implements Function0<T> {
        private /* synthetic */ String $AFAdRevenueData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str) {
            super(0);
            this.$AFAdRevenueData = str;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: H_, reason: merged with bridge method [inline-methods] */
        public final Parcelable invoke() {
            return AFj1pSDK.this.getCurrencyIso4217Code.getParcelableExtra(this.$AFAdRevenueData);
        }
    }

    public AFj1pSDK(@NotNull Intent intent) {
        intent.getClass();
        this.getCurrencyIso4217Code = intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005d A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0013, B:7:0x0055, B:13:0x005d, B:24:0x004d, B:29:0x000b, B:15:0x002f, B:18:0x003f, B:20:0x0046, B:21:0x004c, B:4:0x0003), top: B:3:0x0003, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005b  */
    /* JADX WARN: Type inference failed for: r10v2, types: [t7o] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [t7o] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final <T> T getRevenue(Function0<? extends T> function0, String str, T t, boolean z) {
        T t2;
        Throwable a;
        ?? r7;
        Throwable a2;
        synchronized (this.getCurrencyIso4217Code) {
            try {
                r7o r7oVar = z7o.b;
                t2 = function0.invoke();
            } finally {
                f9f[] f9fVarArr = {ern.a(ConcurrentModificationException.class), ern.a(ArrayIndexOutOfBoundsException.class)};
                a = z7o.a(t2);
                T t3 = t2;
                if (a != null) {
                }
                a2 = z7o.a(t3);
                if (a2 != null) {
                }
                return t;
            }
            f9f[] f9fVarArr2 = {ern.a(ConcurrentModificationException.class), ern.a(ArrayIndexOutOfBoundsException.class)};
            a = z7o.a(t2);
            T t32 = t2;
            if (a != null) {
                try {
                    if (!xz0.u(f9fVarArr2, ern.a(a.getClass()))) {
                        throw a;
                    }
                    if (z) {
                        r7 = getRevenue(function0, str, t, false);
                    } else {
                        AFLogger.afErrorLog(str, a, false, false);
                        r7 = t;
                    }
                    t32 = r7;
                } catch (Throwable th) {
                }
            }
            a2 = z7o.a(t32);
            if (a2 != null) {
                t = t32;
            } else {
                AFLogger.afErrorLog(str, a2, false, false);
            }
        }
        return t;
    }

    public final boolean AFAdRevenueData(@NotNull String str) {
        str.getClass();
        Boolean bool = (Boolean) getRevenue(new AnonymousClass3(str), hrg.q("Error while trying to check presence of ", str, " extra from intent"), Boolean.TRUE, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final <T extends Parcelable> T F_(@NotNull String str) {
        str.getClass();
        return (T) getRevenue(new AnonymousClass4(str), hrg.q("Error while trying to read ", str, " extra from intent"), null, true);
    }

    public final Intent G_(@NotNull String str, long j) {
        str.getClass();
        return (Intent) getRevenue(new AnonymousClass2(str, j), hrg.q("Error while trying to write ", str, " extra to intent"), null, true);
    }

    public final String getRevenue(@NotNull String str) {
        str.getClass();
        return (String) getRevenue(new AnonymousClass1(str), hrg.q("Error while trying to read ", str, " extra from intent"), null, true);
    }
}
