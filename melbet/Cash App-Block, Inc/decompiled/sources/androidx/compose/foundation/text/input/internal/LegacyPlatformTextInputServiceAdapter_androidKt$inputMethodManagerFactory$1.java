package androidx.compose.foundation.text.input.internal;

import android.view.View;
import androidx.camera.video.Recorder;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1 extends FunctionReferenceImpl implements Function1 {
    public static final LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1 INSTANCE = new LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1(1, Recorder.AnonymousClass1.class, "<init>", "<init>(Landroid/view/View;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Recorder.AnonymousClass1((View) obj);
    }
}
