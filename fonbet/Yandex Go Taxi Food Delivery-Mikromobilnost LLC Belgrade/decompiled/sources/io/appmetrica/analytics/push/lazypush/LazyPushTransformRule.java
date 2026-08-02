package io.appmetrica.analytics.push.lazypush;

import java.util.List;

/* loaded from: classes4.dex */
public interface LazyPushTransformRule {
    String getNewValue(String str);

    List<String> getPatternList();
}
