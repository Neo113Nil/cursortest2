package app.cash.redwood.yoga.internal;

import androidx.camera.view.PreviewView;

/* loaded from: classes3.dex */
public final class YGConfig {
    public static final YGConfig Default;
    public final PreviewView.AnonymousClass1 logger_struct = new PreviewView.AnonymousClass1();

    static {
        Yoga yoga = Yoga.INSTANCE;
        YGConfig yGConfig = new YGConfig();
        yGConfig.logger_struct.this$0 = new Yoga$YGConfigNew$1();
        Default = yGConfig;
    }
}
