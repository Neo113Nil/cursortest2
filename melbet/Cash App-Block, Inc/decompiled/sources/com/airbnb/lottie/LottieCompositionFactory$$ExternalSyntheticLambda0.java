package com.airbnb.lottie;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.InputStream;
import java.util.concurrent.Callable;
import okio.Source;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class LottieCompositionFactory$$ExternalSyntheticLambda0 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ LottieCompositionFactory$$ExternalSyntheticLambda0(String str, String str2) {
        this.$r8$classId = 1;
        this.f$1 = str;
        this.f$0 = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        LottieResult fromJsonSourceSync;
        LottieResult fromJsonStringSync;
        LottieResult fromJsonReaderSync;
        LottieResult fromJsonInputStreamSync;
        LottieResult fromJsonSync;
        switch (this.$r8$classId) {
            case 0:
                fromJsonSourceSync = LottieCompositionFactory.fromJsonSourceSync((Source) this.f$0, this.f$1);
                return fromJsonSourceSync;
            case 1:
                fromJsonStringSync = LottieCompositionFactory.fromJsonStringSync(this.f$1, (String) this.f$0);
                return fromJsonStringSync;
            case 2:
                fromJsonReaderSync = LottieCompositionFactory.fromJsonReaderSync((JsonReader) this.f$0, this.f$1);
                return fromJsonReaderSync;
            case 3:
                fromJsonInputStreamSync = LottieCompositionFactory.fromJsonInputStreamSync((InputStream) this.f$0, this.f$1);
                return fromJsonInputStreamSync;
            default:
                fromJsonSync = LottieCompositionFactory.fromJsonSync((JSONObject) this.f$0, this.f$1);
                return fromJsonSync;
        }
    }

    public /* synthetic */ LottieCompositionFactory$$ExternalSyntheticLambda0(String str, int i, Object obj) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = str;
    }
}
