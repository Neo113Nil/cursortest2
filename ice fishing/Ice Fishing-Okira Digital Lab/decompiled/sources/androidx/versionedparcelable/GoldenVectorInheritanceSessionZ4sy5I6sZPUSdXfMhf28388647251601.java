package androidx.versionedparcelable;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class GoldenVectorInheritanceSessionZ4sy5I6sZPUSdXfMhf28388647251601 implements Application.ActivityLifecycleCallbacks {
    public final ArrayDeque RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = new ArrayDeque(10);

    public final void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(Intent intent) {
        ArrayDeque arrayDeque = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("google.message_id");
                if (string == null) {
                    string = extras.getString("message_id");
                }
                if (!TextUtils.isEmpty(string)) {
                    if (arrayDeque.contains(string)) {
                        return;
                    } else {
                        arrayDeque.add(string);
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException unused) {
        }
        if (bundle == null ? false : "1".equals(bundle.getString("google.c.a.e"))) {
            if (bundle != null && "1".equals(bundle.getString("google.c.a.tc"))) {
                com.google.firebase.ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015 AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = com.google.firebase.ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365();
                AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                if (AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(VertexLinkConnectorProxyK2OJzectpZ6p1WwMdq74549816806104.class) != null) {
                    GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333();
                    return;
                }
            }
            XenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503("_no", bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent == null) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 25) {
            new Handler(Looper.getMainLooper()).post(new GoldenVectorCoroutineTranspilerTbwuCpNUfxiQ181tFE78464764385187(8, this, intent));
        } else {
            ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(intent);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
