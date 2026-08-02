package com.squareup.cash.promotionsreferrals.views;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda7;
import java.io.InputStream;
import java.net.URL;
import kotlin.jvm.functions.Function0;
import okio.Buffer;
import okio.InputStreamSource;
import okio.Okio;

/* loaded from: classes9.dex */
public final /* synthetic */ class PromotionsTitleBarKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ PromotionsTitleBarKt$$ExternalSyntheticLambda0(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                return str != null ? new ComposableLambdaImpl(new InfoSectionKt$$ExternalSyntheticLambda7(str, 9), true, 1842735670) : PromotionsTitleBarKt.f635lambda$477590420;
            case 1:
                return str;
            default:
                try {
                    InputStream openStream = new URL(str).openStream();
                    try {
                        openStream.getClass();
                        InputStreamSource source = Okio.source(openStream);
                        Buffer buffer = new Buffer();
                        buffer.writeAll(source);
                        String readUtf8 = buffer.readUtf8();
                        openStream.close();
                        return readUtf8;
                    } finally {
                    }
                } catch (Exception unused) {
                    return null;
                }
        }
    }
}
