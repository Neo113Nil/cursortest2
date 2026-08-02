package defpackage;

import android.view.Display;
import com.yandex.runtime.device.internal.DeviceInfo;
import java.util.function.ToIntFunction;

/* loaded from: classes8.dex */
public final /* synthetic */ class waj implements ToIntFunction {
    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        int lambda$maxFramesPerSecond$0;
        lambda$maxFramesPerSecond$0 = DeviceInfo.lambda$maxFramesPerSecond$0((Display.Mode) obj);
        return lambda$maxFramesPerSecond$0;
    }
}
