package androidx.camera.core.featuregroup.impl;

import androidx.camera.core.impl.SessionConfig;
import com.android.volley.toolbox.HurlStack;

/* loaded from: classes3.dex */
public interface FeatureCombinationQuery {
    public static final HurlStack NO_OP_FEATURE_COMBINATION_QUERY = new HurlStack(4);

    boolean isSupported(SessionConfig sessionConfig);
}
