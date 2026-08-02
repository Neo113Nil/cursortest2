package com.squareup.cash.integration.api;

import android.os.Build;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.util.logging.NoOpRetrofitLogger;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.zacsweers.metro.internal.Factory;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.random.Random;
import kotlinx.coroutines.CompletableDeferredImpl;
import okio.Buffer;

/* loaded from: classes.dex */
public abstract class HeadersModule {
    public static String provideDeviceBuildInfo() {
        String str = Build.DISPLAY;
        String str2 = Build.BOOTLOADER;
        String radioVersion = Build.getRadioVersion();
        String[] strArr = Build.SUPPORTED_ABIS;
        strArr.getClass();
        String joinToString$default = ArraysKt___ArraysKt.joinToString$default(strArr, "/", null, null, null, 62);
        int i = Build.VERSION.SDK_INT;
        String joinToString$default2 = CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{str, str2, radioVersion, joinToString$default, i >= 31 ? Build.SKU : "unsupported", i >= 31 ? Build.ODM_SKU : "unsupported", i >= 31 ? Build.SOC_MODEL : "unsupported", i >= 31 ? Build.SOC_MANUFACTURER : "unsupported"}), "::", null, null, 0, null, null, 62);
        int i2 = 0;
        while (i2 < joinToString$default2.length()) {
            int codePointAt = joinToString$default2.codePointAt(i2);
            if (codePointAt <= 31 || codePointAt >= 127) {
                Buffer buffer = new Buffer();
                buffer.m4338writeUtf8(0, i2, joinToString$default2);
                while (i2 < joinToString$default2.length()) {
                    int codePointAt2 = joinToString$default2.codePointAt(i2);
                    buffer.writeUtf8CodePoint((codePointAt2 <= 31 || codePointAt2 >= 127) ? 63 : codePointAt2);
                    i2 += Character.charCount(codePointAt2);
                }
                return buffer.readUtf8();
            }
            i2 += Character.charCount(codePointAt);
        }
        return joinToString$default2;
    }

    public final class ProvideRandomMetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public static final ProvideRandomMetroFactory INSTANCE$1 = new ProvideRandomMetroFactory(1);
        public static final ProvideRandomMetroFactory INSTANCE$2 = new ProvideRandomMetroFactory(2);
        public static final ProvideRandomMetroFactory INSTANCE$3 = new ProvideRandomMetroFactory(3);
        public static final ProvideRandomMetroFactory INSTANCE = new ProvideRandomMetroFactory(0);
        public static final ProvideRandomMetroFactory INSTANCE$4 = new ProvideRandomMetroFactory(4);
        public static final ProvideRandomMetroFactory INSTANCE$5 = new ProvideRandomMetroFactory(5);
        public static final ProvideRandomMetroFactory INSTANCE$6 = new ProvideRandomMetroFactory(6);
        public static final ProvideRandomMetroFactory INSTANCE$7 = new ProvideRandomMetroFactory(7);

        public ProvideRandomMetroFactory(CommonApiModule commonApiModule) {
            this.$r8$classId = 8;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            switch (this.$r8$classId) {
                case 0:
                    return Random.Default;
                case 1:
                    return CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"cashappapi.com", "squareupcdn.com"});
                case 2:
                    return HeadersModule.provideDeviceBuildInfo();
                case 3:
                    String str = Build.FINGERPRINT;
                    String str2 = Build.MODEL;
                    String str3 = Build.MANUFACTURER;
                    String str4 = Build.BRAND;
                    String str5 = Build.HARDWARE;
                    String str6 = Build.BOARD;
                    String str7 = Build.HOST;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append("::");
                    sb.append(str2);
                    sb.append("::");
                    sb.append(str3);
                    Boxes$$ExternalSyntheticOutline1.m(sb, "::", str4, "::", str5);
                    String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, "::", str6, "::", str7);
                    int i = 0;
                    while (i < m.length()) {
                        int codePointAt = m.codePointAt(i);
                        if (codePointAt <= 31 || codePointAt >= 127) {
                            Buffer buffer = new Buffer();
                            buffer.m4338writeUtf8(0, i, m);
                            while (i < m.length()) {
                                int codePointAt2 = m.codePointAt(i);
                                buffer.writeUtf8CodePoint((codePointAt2 <= 31 || codePointAt2 >= 127) ? 63 : codePointAt2);
                                i += Character.charCount(codePointAt2);
                            }
                            return buffer.readUtf8();
                        }
                        i += Character.charCount(codePointAt);
                    }
                    return m;
                case 4:
                    return new RealRequestSigner();
                case 5:
                    return new Endpoints();
                case 6:
                    return new NoOpRetrofitLogger();
                case 7:
                    return "Production";
                default:
                    return new CompletableDeferredImpl();
            }
        }

        public /* synthetic */ ProvideRandomMetroFactory(int i) {
            this.$r8$classId = i;
        }
    }
}
